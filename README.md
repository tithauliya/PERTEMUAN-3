
## PENERAPAN ABSTRACT CLASS, INTERFACE, OVERLOADING, DAN OVERRIDING  

---

## PENDAHULUAN  

Pemrograman Berorientasi Objek (PBO) merupakan paradigma pemrograman yang berfokus pada objek sebagai representasi dunia nyata. Objek memiliki **atribut** (data) dan **method** (perilaku) yang membuat sistem lebih modular, mudah dikembangkan, serta mendukung prinsip *reusability* dan *maintainability*.  

Sebelumnya saya sudah mempelajari konsep **Inheritance (pewarisan)**, yaitu mekanisme sebuah kelas turunan (subclass) yang dapat mewarisi atribut dan method dari kelas induk (superclass). Konsep ini menjadi dasar untuk memahami materi berikutnya, karena abstract class, interface, overloading, dan overriding semuanya berhubungan erat dengan pewarisan.  

Konsep utama yang saya kerjakan pada praktikum ini adalah:  

1. **Abstract Class** → kelas dasar yang tidak dapat diinstansiasi secara langsung, hanya bisa diwariskan.  
2. **Interface** → kontrak perilaku yang wajib diimplementasikan oleh kelas lain, serta mendukung *multiple inheritance*.  
3. **Overloading** → metode dengan nama sama tetapi parameter berbeda (jumlah/tipe).  
4. **Overriding** → metode induk ditulis ulang oleh turunan dengan implementasi berbeda (mendukung *polymorphism*).  

---

## IMPLEMENTASI  

### 1. PROFESI (ABSTRACT CLASS & INTERFACE)  
- Hierarki dimulai dari `Manusia` (concrete class).  
- Diturunkan ke `Pekerjaan` (abstract class).  
- Dari `Pekerjaan` diturunkan ke `Dokter` (abstract class).  
- `Dokter` memiliki turunan spesifik: `DokterUmum`, `DokterHewan`, dan `DokterGigi` (concrete class).  
- Saya menambahkan interface `Pemeriksaan`, `ResepObat`, dan `Operasi` untuk memberi perilaku sesuai bidangnya.  

Dengan struktur ini saya bisa menunjukkan bagaimana **abstract class** menjadi kerangka umum, sedangkan **interface** menambahkan perilaku khusus.  

---

### 2. TOKO KUE (OVERLOADING & OVERRIDING)  
- **Overloading**: method `jualKue()` saya buat dengan parameter berbeda (nama kue saja, nama + jumlah, nama + jumlah + harga).  
- **Overriding**: method `infoKue()` di kelas `Kue` saya tulis ulang di `KueCoklat` dan `KueKeju`.  

Bagian ini memperlihatkan bagaimana satu nama method bisa fleksibel (overloading), sekaligus bisa berperilaku berbeda tergantung objek (overriding).  

---

## KESIMPULAN  

Dari praktikum ini saya menyimpulkan bahwa:  

- **Inheritance** adalah dasar dari pewarisan atribut dan method.  
- **Abstract Class** memberi kerangka umum yang wajib diikuti turunan.  
- **Interface** menambahkan kontrak perilaku dan mendukung multiple inheritance.  
- **Overloading** membuat method lebih fleksibel.  
- **Overriding** membuat method yang sama bisa berperilaku berbeda sesuai objeknya.  

Dengan memadukan semuanya, saya bisa membangun program yang lebih terstruktur, fleksibel, dan mudah dikembangkan.  

---

## 📝 IDENTITAS  

- **Nama** : Titha Auliya Khotim
- **NIM** : 09010624017
- **Kelas** : H7B.3
- **Dosen Pengampu** : Bayu Adhi Nugroho, Ph.D

---
