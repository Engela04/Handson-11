
*Nama:* [Engela k Taebenu]
*NIM:* [2482010]
*Kelas:* [Sistem Informasi]
*Mata Kuliah:* Pemrograman Berorientasi Objek

## Catatan Pembelajaran
[1.Memahami bahwa class utama (high-level module) tidak boleh bergantung 
   pada class konkret, tetapi harus bergantung pada abstraction seperti 
   interface agar kode tetap fleksibel dan tidak mudah rusak saat ada perubahan.

2.Belajar memanfaatkan interface sebagai jembatan antara logika utama 
  dan implementasi teknis, sehingga penggantian teknologi (misalnya Stripe ke PayPal
  Email ke SMS) dapat dilakukan tanpa mengubah kode utama.

3.Menerapkan Dependency Injection melalui constructor supaya semua dependency dikirim 
  dari luar, membuat sistem lebih mudah di-test, lebih mudah dikembangkan
  dan mencegah tight coupling antar-class.