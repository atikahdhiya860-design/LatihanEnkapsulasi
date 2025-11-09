Tugas Enkapsulasi - Pemrograman Berorientasi Objek (PBO)
Identitas

Nama: Atikah Dhiya
NIM: L0324007

Deskripsi
Tugas ini berisi latihan penerapan konsep enkapsulasi dalam pemrograman berorientasi objek (OOP) menggunakan bahasa Java.
Tujuan utamanya adalah memahami bagaimana menyembunyikan data (data hiding) agar tidak bisa diakses atau diubah secara langsung dari luar class, serta bagaimana cara mengatur akses data dengan method yang terkontrol.

Konsep Utama
Enkapsulasi adalah cara untuk melindungi data dalam sebuah objek dengan menjadikannya private, lalu memberikan akses terbatas melalui getter dan setter, atau lewat method khusus.
Dengan cara ini, data di dalam objek bisa dijaga agar tetap konsisten dan tidak bisa dimodifikasi sembarangan.

Struktur Program
Program ini terdiri dari beberapa class yang saling berhubungan:
1. Student.java
Berisi atribut name dan score yang bersifat private.
Akses nilai dilakukan melalui constructor, getter, dan setter dengan validasi agar nilai tetap berada pada rentang 0–100.
2. StudentV2.java
Versi pengembangan dari class Student.
Setter dihapus dan diganti dengan method addScore(int delta) dan reduceScore(int delta) agar perubahan nilai lebih terkontrol dan tetap dalam batas 0–100.
. Team.java
Class ini menyimpan daftar anggota (StudentV2) dalam bentuk list.
Akses ke list dilakukan dengan cara memberikan salinan, bukan referensi langsung, supaya data internal tidak bisa diubah dari luar.
4. ImmutableStudent.java
Contoh penerapan enkapsulasi tingkat lanjut.
Semua atribut bersifat final dan tidak bisa diubah setelah objek dibuat.
Jika perlu perubahan nilai, dibuat objek baru melalui method withAddedScore(int delta).
5. MainStudent.java, MainTeam.java, dan MainImmutable.java
Ketiganya digunakan untuk melakukan pengujian masing-masing class di atas dan memastikan fungsinya berjalan sesuai dengan konsep enkapsulasi.

Tujuan dan Manfaat
Melatih pemahaman tentang pengendalian akses data dalam class.
Membiasakan diri menggunakan getter/setter dan method khusus untuk menjaga validitas data.
Menunjukkan perbedaan antara objek mutable dan immutable.
Mempraktikkan konsep desain yang aman dan mudah dirawat di program berbasis objek.

Cara Menjalankan
Buka project di NetBeans.
Jalankan file MainStudent.java, MainTeam.java, atau MainImmutable.java untuk melihat hasil dari masing-masing bagian.
Hasil output akan menampilkan data mahasiswa, perubahan nilai, serta hasil pengujian terhadap enkapsulasi.
Link Repository

https://github.com/atikahdhiya860-design/LatihanEnkapsulasi
