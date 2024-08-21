# Java Multithreading ile Sayı Ayrıştırma ve Kategorizasyonu

Bu proje, 1'den 10,000'e kadar olan sayıları içeren bir listeyi (ArrayList) 4 eşit parçaya böler ve bu parçaları paralel olarak (multithreading) işleyen dört ayrı iş parçacığı (Thread) oluşturur. Her bir iş parçacığı, kendine ait sayı listesi içinde tek ve çift sayıları bulur ve bu sayıları iki ayrı ortak listeye ekler.

## Proje Yapısı

- **Main.java**: Projenin ana sınıfıdır. Sayıları oluşturur, parçalar ve iş parçacıklarını başlatır.
- **NumberProcessor.java**: Her bir iş parçacığının çalıştırdığı `Runnable` sınıfıdır. Sayıları tek ve çift olarak sınıflandırır.

## Özellikler

- **Multithreading**: Proje, aynı anda dört iş parçacığı çalıştırarak paralel işlem yapmayı sağlar.
- **Senkronizasyon**: İş parçacıkları arasında veri tutarlılığı sağlamak için `synchronized` blokları kullanılmıştır.
- **Veri Ayrıştırma**: Sayılar tek ve çift olarak iki ayrı listeye ayrılır.
