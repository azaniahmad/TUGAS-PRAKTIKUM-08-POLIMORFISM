# Tugas Praktikum 08 - Polimorfisme

**Nama:** M. Krisna Y.P  
**Kelas:** Malam Karyawan TI C  
**Mata Kuliah:** Pemrograman Berorientasi Objek  

---

## Tentang Tugas Ini

Tugas ini berisi contoh-contoh penggunaan **Polimorfisme** di Java. Polimorfisme itu intinya satu method bisa punya perilaku yang berbeda-beda tergantung objek yang memanggilnya.

---

## Isi Program

### 1. Dynamic Binding (ContohDynamicBinding.java)
Contoh method `suara()` dipanggil dari berbagai hewan tapi hasilnya beda-beda.

- `Kucing` → Meong
- `Anjing` → Guk guk
- `Burung` → Cuit cuit
- `Ikan` → Blub - Blub!

Semua disimpan di variabel `Hewan`, tapi pas dipanggil yang jalan adalah method milik objek aslinya. Itu yang disebut dynamic binding.

---

### 2. Static Binding (ContohStaticBinding.java)
Beda sama dynamic binding, static method sudah ditentukan saat compile. Jadi meskipun variabelnya `Kendaraan` tapi isinya `Motor`, yang dipanggil tetap `infoJenis()` milik `Kendaraan`.

---

### 3. Upcasting & Downcasting (MainUpCasting, MainDownCasting, MainKasting)
- **Upcasting** = objek `Elektronik` disimpan ke variabel `Produk`. Otomatis, nggak perlu casting manual.
- **Downcasting** = balik lagi dari `Produk` ke `Elektronik` supaya bisa akses method `cekGaransi()`. Harus pakai `instanceof` dulu biar aman.

---

### 4. Sistem Kasir (MainKasir.java)
Simulasi kasir restoran. Ada 3 jenis menu yang dihitung harganya secara beda:

- `Makanan` → harga × faktor ukuran (S/M/L)
- `Minuman` → harga + 2000 kalau pesen ice
- `Paket` → diskon 15% kalau item >= 3

Di akhir dihitung total + PPN 11%.

---

### 5. Sistem Pembayaran (MainPembayaran.java)
Contoh polimorfisme untuk metode bayar yang berbeda.

- `GoPay` → bayar via dompet digital
- `TransferBank` → bayar via rekening bank
- `QRIS` → scan barcode

Semua diproses dalam satu loop padahal beda-beda jenisnya.

---

### 6. Music (MainMusic.java)
Contoh constructor overloading. Satu class punya 3 constructor dengan parameter berbeda.

---

## Cara Compile & Run

```bash
# Contoh dynamic binding
javac Hewan.java Kucing.java Anjing.java Burung.java Ikan.java ContohDynamicBinding.java
java ContohDynamicBinding

# Contoh static binding
javac Kendaraan.java Motor.java ContohStaticBinding.java
java ContohStaticBinding

# Kasir
javac MenuItem.java Makanan.java Minuman.java Paket.java MainKasir.java
java MainKasir

# Pembayaran
javac Pembayaran.java GoPay.java TransferBank.java QRIS.java MainPembayaran.java
java MainPembayaran
```

---

## Catatan

- Selalu pakai `instanceof` sebelum downcast biar nggak error `ClassCastException`
- Static method nggak kena polymorphism, jadi hasilnya selalu dari tipe referensinya bukan objek aslinya
