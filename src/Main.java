import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> allNumber = new ArrayList<>();
        for (int i = 1; i <= 10000; i++){
            allNumber.add(i);
        }

        // 4 ayrı 2500 elamanlık ArrayList Oluşturma
        List<Integer> part1 = allNumber.subList(0,2500);
        List<Integer> part2 = allNumber.subList(2500,5000);
        List<Integer> part3 = allNumber.subList(5000,7500);
        List<Integer> part4 = allNumber.subList(7500,10000);

        // Tek ve Çift sayıları tutacak boş arraylist

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        // 4 ayrı Thread Oluşturma ve Başlatma
        Thread thread1 = new Thread(new NumberProcessor(part1,evenNumbers,oddNumbers));
        Thread thread2 = new Thread(new NumberProcessor(part2,evenNumbers,oddNumbers));
        Thread thread3 = new Thread(new NumberProcessor(part3,evenNumbers,oddNumbers));
        Thread thread4 = new Thread(new NumberProcessor(part4,evenNumbers,oddNumbers));

        // Thread' leri başlatma
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // tüm threadlerin tammalanmasını bekleme

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        // Sonuçları yazdırma
        System.out.println("Çift sayılar: " + evenNumbers.size());
        System.out.println("Tek sayılar: " + oddNumbers.size());
        System.out.println("Tek sayılar: " + oddNumbers);
        System.out.println("Çift sayılar: " + evenNumbers);



    }
}
