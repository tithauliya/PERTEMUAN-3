
### Penerapan Abstract Class, Interface, Overload, dan Override  

Dosen Pengampu : Bayu Adhi Nugroho, Ph.D.  

---

## Identitas  

-**Nama** : Titha Auliya Khotim
- **NIM** : 09010624017
- **Kelas** : H7B.3
- **Program Studi** : Sistem Informasi  
- **Fakultas** : Sains dan Teknologi  
- **Universitas** : UIN Sunan Ampel Surabaya  
- **Tahun** : 2025  

---

## Pendahuluan  
Pemrograman Berorientasi Objek (PBO) adalah paradigma yang memodelkan program berdasarkan objek yang memiliki atribut (data) dan method (perilaku). Dengan pendekatan ini, program menjadi lebih terstruktur, mudah dipahami, dan mendekati gambaran dunia nyata.  

Pada pertemuan sebelumnya telah dipelajari:  
- **Inheritance** → pewarisan atribut dan method dari kelas induk ke kelas turunan.  
- **Constructor** → method khusus yang dipanggil saat objek dibuat untuk inisialisasi atribut.  

Kedua konsep ini menjadi dasar penting sebelum mempelajari materi berikutnya.  

Konsep utama dalam praktikum ini adalah:  
- **Abstract Class** → kelas dasar yang tidak dapat diinstansiasi langsung, hanya diwariskan.  
- **Interface** → kontrak perilaku, dapat mendukung multiple inheritance.  
- **Overload** → satu nama method dengan parameter berbeda dalam satu kelas.  
- **Override** → penulisan ulang method induk pada subclass dengan implementasi berbeda.  

---

## Implementasi  

### Studi Kasus 1: Profesi (Abstract Class & Interface)  
1. **Manusia** → kelas induk dengan atribut umum (`nama`, `jenisKelamin`) dan method `identitas()`.  
2. **Pekerjaan** → abstract class turunan dari Manusia, memiliki method abstrak `jenisPekerjaan()`.  
3. **Dokter** → abstract class turunan Pekerjaan, menambahkan `spesialisasi()` dan override `jenisPekerjaan()`.  
4. **Interface tambahan**:  
   - `Pemeriksaan` → `memeriksaPasien()`  
   - `ResepObat` → `menulisResep()`  
   - `Operasi` → `melakukanOperasi()`  
5. **Kelas Konkret (Spesialis Dokter)**:  
   - `DokterUmum` → implementasi Pemeriksaan & ResepObat.  
   - `DokterHewan` → implementasi Pemeriksaan, ResepObat & Operasi.  
   - `DokterGigi` → implementasi Pemeriksaan & Operasi.  
6. **Main** → membuat objek dokter, memanggil `identitas()`, `jenisPekerjaan()`, `spesialisasi()`, dan method dari interface.  

---

### Studi Kasus 2: Toko Kue (Overload & Override)  
1. **Overload pada TokoKue**  
   - Method `beliKue()` dibuat dalam beberapa bentuk:  
     - `beliKue(String namaKue)`  
     - `beliKue(String n
