# 🧬 Tugas Praktikum 08 — Polimorfisme

> **Nama :** M. Krisna Y.P  
> **Kelas :** Malam Karyawan TI C  
> **Mata Kuliah :** Pemrograman Berorientasi Objek (PBO)  
> **Topik :** Polymorphism — Dynamic Binding, Static Binding, Upcasting & Downcasting

---

## 📖 Deskripsi

Repository ini berisi implementasi konsep **Polimorfisme** dalam bahasa pemrograman Java. Polimorfisme adalah salah satu pilar utama OOP yang memungkinkan sebuah objek memiliki banyak bentuk — method yang sama dapat berperilaku berbeda tergantung pada tipe objek yang memanggilnya saat runtime.

Praktikum ini mencakup empat konsep inti:

| Konsep | Deskripsi |
|--------|-----------|
| **Dynamic Binding** | Method yang dieksekusi ditentukan saat *runtime* berdasarkan tipe objek sesungguhnya |
| **Static Binding** | Method yang dieksekusi ditentukan saat *compile-time* (static method) |
| **Upcasting** | Konversi objek subclass ke referensi superclass secara implisit |
| **Downcasting** | Konversi referensi superclass kembali ke subclass secara eksplisit |

---

## 📁 Struktur Proyek

```
TUGAS-PRAKTIKUM-08-POLIMORFISM/
│
├── 🐾 Dynamic Binding — Hewan
│   ├── Hewan.java
│   ├── Kucing.java
│   ├── Anjing.java
│   ├── Burung.java
│   ├── Ikan.java
│   └── ContohDynamicBinding.java
│
├── 🏍️ Static Binding — Kendaraan
│   ├── Kendaraan.java
│   ├── Motor.java
│   └── ContohStaticBinding.java
│
├── 🛒 Upcasting & Downcasting — Produk
│   ├── Produk.java
│   ├── Elektronik.java
│   ├── MainUpCasting.java
│   ├── MainDownCasting.java
│   └── MainKasting.java
│
├── 🍔 Studi Kasus — Sistem Kasir
│   ├── MenuItem.java
│   ├── Makanan.java
│   ├── Minuman.java
│   ├── Paket.java
│   └── MainKasir.java
│
├── 💳 Studi Kasus — Sistem Pembayaran
│   ├── Pembayaran.java
│   ├── GoPay.java
│   ├── TransferBank.java
│   ├── QRIS.java
│   └── MainPembayaran.java
│
└── 🎵 Constructor Overloading — Music
    ├── Music.java
    └── MainMusic.java
```

---

## 🔍 Penjelasan Setiap Modul

### 1. 🐾 Dynamic Binding — Hewan

Mendemonstrasikan bagaimana Java menentukan method mana yang dipanggil saat *runtime*.

```
Hewan (superclass)
├── Kucing  → suara() : "Meong"
├── Anjing  → suara() : "Guk guk"
├── Burung  → suara() : "Cuit cuit"
└── Ikan    → suara() : "Blub - Blub!"
```

Meskipun semua objek disimpan dalam variabel bertipe `Hewan`, method `suara()` yang dipanggil adalah milik **tipe aktual** objek tersebut — inilah inti dari *dynamic binding*.

**File utama:** `ContohDynamicBinding.java`

---

### 2. 🏍️ Static Binding — Kendaraan

Mendemonstrasikan perbedaan antara *static method* (terikat saat compile-time) dan *instance method* (terikat saat runtime).

```java
Kendaraan k = new Motor();

Kendaraan.infoJenis(); // → "Kendaraan Umum"  (static: compile-time)
Motor.infoJenis();     // → "Motor"            (static: compile-time)
k.klakson();           // → "Tin tin"          (dynamic: runtime, Motor override)
```

**Poin kunci:** Static method **tidak** dioverride secara polimorfis — pemanggilan `k.infoJenis()` akan selalu memanggil milik `Kendaraan`, bukan `Motor`.

**File utama:** `ContohStaticBinding.java`

---

### 3. 🛒 Upcasting & Downcasting — Produk

**Upcasting** (implisit, aman):
```java
Produk p = new Elektronik("Laptop", 12000000, 2);
p.tampilDetail(); // ✅ bisa — method ada di Produk
// p.cekGaransi(); // ❌ error — method hanya ada di Elektronik
```

**Downcasting** (eksplisit, perlu `instanceof`):
```java
if (p instanceof Elektronik) {
    Elektronik e = (Elektronik) p;
    e.cekGaransi(); // ✅ sekarang bisa diakses
}
```

```
Produk (superclass)
└── Elektronik (subclass)
    ├── garansiTahun : int
    ├── tampilDetail() — override + super.tampilDetail()
    └── cekGaransi()  — method eksklusif subclass
```

**File utama:** `MainUpCasting.java`, `MainDownCasting.java`, `MainKasting.java`

---

### 4. 🍔 Studi Kasus — Sistem Kasir Restoran

Implementasi sistem kasir menggunakan polymorphism untuk menghitung harga berbeda tiap jenis menu.

```
MenuItem (superclass)
├── Makanan  — harga × faktor ukuran (S=1.0 / M=1.3 / L=1.6)
├── Minuman  — harga + Rp 2.000 jika pilihan ice
└── Paket    — diskon 15% jika jumlah item ≥ 3
```

Fitur sistem:
- Cetak struk per item dengan detail spesifik tipe
- Akumulasi subtotal seluruh pesanan
- Perhitungan **PPN 11%** via static method `hitungPajak()`
- Downcasting untuk menampilkan info tambahan per tipe menu

**File utama:** `MainKasir.java`

---

### 5. 💳 Studi Kasus — Sistem Pembayaran Digital

Polimorfisme diterapkan pada berbagai metode pembayaran digital.

```
Pembayaran (superclass)
├── GoPay        → "[GoPay] Membayar Rp X via dompet digital"
├── TransferBank → "[BCA] Transfer Rp X via rekening Bank"
└── QRIS         → "[QRIS] Scan barcode - membayar Rp X"
```

Seluruh objek bertipe `Pembayaran[]` diproses dalam satu loop — method `prosesBayar()` dan `getMetode()` memanggil implementasi yang sesuai di masing-masing subclass secara otomatis.

**File utama:** `MainPembayaran.java`

---

### 6. 🎵 Constructor Overloading — Music

Mendemonstrasikan *constructor overloading* dengan tiga variasi inisialisasi:

```java
new Music()                        // judul & artis = "Unknown", durasi = 0
new Music("Hello", "Adele")        // durasi = 0 (default)
new Music("Bohemian Rhapsody", "Queen", 354) // semua field diisi
```

**File utama:** `MainMusic.java`

---

## ▶️ Cara Menjalankan

Pastikan **Java JDK** sudah terinstal. Compile dan jalankan dari direktori root proyek:

```bash
# Dynamic Binding
javac Hewan.java Kucing.java Anjing.java Burung.java Ikan.java ContohDynamicBinding.java
java ContohDynamicBinding

# Static Binding
javac Kendaraan.java Motor.java ContohStaticBinding.java
java ContohStaticBinding

# Upcasting
javac Produk.java Elektronik.java MainUpCasting.java
java MainUpCasting

# Downcasting
javac Produk.java Elektronik.java MainDownCasting.java
java MainDownCasting

# Kasting (array casting)
javac Produk.java Elektronik.java MainKasting.java
java MainKasting

# Kasir
javac MenuItem.java Makanan.java Minuman.java Paket.java MainKasir.java
java MainKasir

# Pembayaran
javac Pembayaran.java GoPay.java TransferBank.java QRIS.java MainPembayaran.java
java MainPembayaran

# Music
javac Music.java MainMusic.java
java MainMusic
```

---

## 🧠 Konsep OOP yang Diterapkan

| Konsep | Penjelasan | Contoh dalam Kode |
|--------|------------|-------------------|
| **Inheritance** | Subclass mewarisi properti dan method superclass | `Elektronik extends Produk` |
| **Method Overriding** | Subclass mendefinisikan ulang method superclass | `@Override suara()`, `@Override prosesBayar()` |
| **Dynamic Binding** | JVM memilih method saat runtime | `Hewan h = new Kucing(); h.suara()` |
| **Static Binding** | Compiler menentukan method saat compile-time | `Kendaraan.infoJenis()` |
| **Upcasting** | Subclass → Superclass (implisit) | `Produk p = new Elektronik(...)` |
| **Downcasting** | Superclass → Subclass (eksplisit) | `(Elektronik) p` |
| **instanceof** | Cek tipe objek sebelum downcast | `if (item instanceof Elektronik)` |
| **Constructor Overloading** | Banyak konstruktor dengan parameter berbeda | Class `Music` (3 konstruktor) |

---

## 📝 Catatan

- Gunakan `instanceof` **sebelum** melakukan downcast untuk menghindari `ClassCastException`
- Static method tidak berperilaku polimorfis — selalu terikat pada tipe referensi, bukan tipe objek
- Method `super.tampilDetail()` digunakan di `Elektronik` untuk memanfaatkan kembali logika superclass sebelum menambahkan informasi tambahan

---

*Tugas Praktikum 08 — Polimorfisme | Pemrograman Berorientasi Objek*
