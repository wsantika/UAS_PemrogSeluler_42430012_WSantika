<div align="center">

# 🏍️ HARLEY-DAVIDSON MOTOR CATALOG

### *Ride Hard. Live Free.*

![Kotlin](https://img.shields.io/badge/Kotlin-Android-orange?style=for-the-badge&logo=kotlin)
![Android Studio](https://img.shields.io/badge/Android%20Studio-Mobile%20App-3DDC84?style=for-the-badge&logo=androidstudio)
![XML](https://img.shields.io/badge/XML-Layout-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-UAS%20Project-success?style=for-the-badge)

</div>

---

## Identitas

| Keterangan | Data                              |
|---|-----------------------------------|
| Nama | **Kadek Wahyu Santika Putra**     |
| NIM | **42430012**                      |
| Mata Kuliah | **Pemrograman Seluler**           |
| Topik | **Katalog Motor Harley-Davidson** |
| Platform | **Android**                       |
| Bahasa | **Kotlin + XML**                  |

---

## Abstract

Aplikasi **Harley-Davidson Motor Catalog** merupakan aplikasi katalog dan pencarian data motor berbasis Android. Aplikasi ini dikembangkan menggunakan **Kotlin**, **XML Layout**, dan penyimpanan data sederhana berbasis **ArrayList** tanpa database eksternal. Sistem menyediakan fitur daftar motor, detail motor, form input, pencarian data menggunakan **Linear Search**, pengurutan data menggunakan **Bubble Sort**, validasi input, penanganan error menggunakan **try-catch**, serta pencatatan aktivitas aplikasi melalui **Logcat** dengan tag NIM.

**Keywords:** Android, Kotlin, ArrayList, Linear Search, Bubble Sort, Intent, RecyclerView, Logcat.

---

## I. Introduction

Proyek ini dibuat sebagai implementasi UAS mata kuliah **Pemrograman Seluler** dengan pendekatan Project-Based Learning. Tema yang dipilih adalah **Katalog Motor Harley-Davidson** karena memiliki karakter visual yang kuat dan cocok dikembangkan menjadi aplikasi katalog dengan desain dark, orange, rebel, dan khas anak motor.

Tujuan utama aplikasi ini adalah menampilkan data motor Harley-Davidson, menyediakan fitur pencarian, sorting, detail data, validasi form, serta dokumentasi aktivitas aplikasi melalui Logcat.

---

## II. System Design

Aplikasi terdiri dari tiga halaman utama:

| Halaman | Fungsi |
|---|---|
| **MainActivity** | Menampilkan daftar motor, search, sort A-Z, sort Z-A, dan tombol tambah |
| **DetailActivity** | Menampilkan detail motor beserta gambar, tipe, tahun, harga, CC, dan deskripsi |
| **FormActivity** | Menyediakan form input dan validasi data motor |

Struktur package utama:

```text
com.example.harleycatalog
├── adapter
│   └── MotorAdapter.kt
├── model
│   └── Motor.kt
├── ui
│   ├── main
│   │   └── MainActivity.kt
│   ├── detail
│   │   └── DetailActivity.kt
│   └── form
│       └── FormActivity.kt
└── utils
    └── MotorUtils.kt
```

---

## III. Implementation

### A. Data Model

Data motor disimpan dalam model `Motor` dengan atribut utama seperti nama, tipe, tahun, harga, kapasitas mesin, deskripsi, dan gambar.

```kotlin
data class Motor(
    val name: String,
    val type: String,
    val year: Int,
    val price: Int,
    val engineCC: Int,
    val description: String,
    val imageResId: Int
)
```

### B. ArrayList Dataset

Data katalog disimpan menggunakan `ArrayList` pada `MotorUtils.kt`. Data ini digunakan sebagai sumber utama untuk RecyclerView, search, sorting, dan detail motor.

### C. Linear Search

Fitur pencarian dilakukan secara manual menggunakan Linear Search dengan cara memeriksa setiap data motor satu per satu berdasarkan keyword nama motor.

```kotlin
for (motor in motorList) {
    if (motor.name.lowercase().contains(keyword)) {
        filteredList.add(motor)
    }
}
```

### D. Bubble Sort

Pengurutan data A-Z dan Z-A dibuat menggunakan algoritma Bubble Sort berdasarkan nama motor.

```kotlin
if (list[j].name.lowercase() > list[j + 1].name.lowercase()) {
    val temp = list[j]
    list[j] = list[j + 1]
    list[j + 1] = temp
}
```

### E. Intent Navigation

Navigasi antar halaman menggunakan Intent:

- MainActivity → DetailActivity
- MainActivity → FormActivity

Data motor dikirim ke DetailActivity menggunakan `putExtra()`.

### F. Validation, Try-Catch, and Logcat

FormActivity menggunakan validasi `if-else` untuk mengecek input kosong. Konversi angka seperti tahun, harga, dan CC ditangani dengan `try-catch` agar aplikasi tidak crash. Aktivitas aplikasi dicatat menggunakan Logcat dengan tag:

```text
42430012
```

---

## IV. Module Compliance

| Modul | Implementasi |
|---|---|
| Modul 2 & 3 | UI rapi, dark theme, portrait dan landscape |
| Modul 4 & 5 | Intent antar halaman dan validasi input |
| Modul 6 | ArrayList dan Linear Search |
| Modul 7 | Bubble Sort A-Z dan Z-A |
| Modul 9 | Try-catch dan Logcat dengan tag NIM |

---

## V. User Interface Documentation

Simpan seluruh screenshot ke folder berikut:

```text
docs/
```

Gunakan nama file berikut agar gambar otomatis tampil di README.

### A. Main Screen

| Portrait                                 | Landscape |
|------------------------------------------|---|
| <img width="260" alt="home-portrait" src="https://github.com/user-attachments/assets/fee3b4b4-623e-4141-bfd1-d82be7037d2b" /> | <img width="450" alt="home-landscape" src="https://github.com/user-attachments/assets/3fd9e75f-cd89-477b-a2d0-672c945f6d8e" />
 |

### B. Search and Sorting

| Search Result                              | Sort A-Z                        | Sort Z-A |
|--------------------------------------------|---------------------------------|---|
| <img width="260" alt="search-result" src="https://github.com/user-attachments/assets/a8be38b8-348a-463f-af67-764f901fd9b9" /> | <img width="260" alt="sort-az" src="https://github.com/user-attachments/assets/3ce89334-ca05-461d-ac24-87140de5952c" /> | <img width="260" alt="sort-za" src="https://github.com/user-attachments/assets/6931f91b-1e18-4476-a76a-e86b71ac99d8" /> |

### C. Detail and Form

| Detail Page | Form Page |
|---|---|
| <img width="260" alt="detail-page" src="https://github.com/user-attachments/assets/b49f43d3-5aab-46e9-b1cf-ae1c093a53f5" /> | <img width="260" alt="form-page" src="https://github.com/user-attachments/assets/e22d7971-5448-4145-b081-9a47328a65c3" /> |

### D. Logcat Evidence

| Android Studio Logcat |
|---|
| <img width="900" alt="logcat" src="https://github.com/user-attachments/assets/a5af4576-5bf0-44c8-97cd-5057f1518416" /> |

---

## VI. Testing Result

| No | Test Case | Expected Result | Status |
|---|---|---|---|
| 1 | Membuka aplikasi | MainActivity tampil | ✅ Passed |
| 2 | Menampilkan RecyclerView | Data motor muncul | ✅ Passed |
| 3 | Search motor | Data terfilter sesuai keyword | ✅ Passed |
| 4 | Sort A-Z | Data terurut dari A ke Z | ✅ Passed |
| 5 | Sort Z-A | Data terurut dari Z ke A | ✅ Passed |
| 6 | Klik item motor | DetailActivity terbuka | ✅ Passed |
| 7 | Klik tombol Tambah | FormActivity terbuka | ✅ Passed |
| 8 | Input kosong | Error validasi muncul | ✅ Passed |
| 9 | Input angka tidak valid | Ditangani try-catch | ✅ Passed |
| 10 | Logcat | Aktivitas tercatat dengan tag NIM | ✅ Passed |
| 11 | Landscape mode | Layout menyesuaikan layar | ✅ Passed |

---

## VII. Project Workflow

Pengembangan dilakukan secara bertahap menggunakan **GitHub Issues**, **Milestone**, dan **Branch**.

| Tahap | Fokus |
|---|---|
| Milestone 1 | UI portrait dan landscape |
| Milestone 2 | Intent dan validasi input |
| Milestone 3 | ArrayList, Linear Search, dan Bubble Sort |
| Milestone 4 | Try-catch, Logcat, redesign UI, dan dokumentasi |

Branch tambahan untuk polishing UI:

```text
design/harley-davidson-theme
```

---

## VIII. How to Run

1. Clone repository ini.
2. Buka project menggunakan Android Studio.
3. Jalankan Gradle Sync.
4. Pilih emulator atau perangkat Android.
5. Klik Run.
6. Untuk melihat Logcat, gunakan filter:

```text
42430012
```

---

## IX. Conclusion

Aplikasi **Harley-Davidson Motor Catalog** berhasil dibuat sesuai ketentuan UAS Pemrograman Seluler. Aplikasi ini mengimplementasikan UI responsif, Intent, ArrayList, Linear Search, Bubble Sort, validasi input, try-catch, Logcat, serta desain bertema Harley-Davidson yang lebih menarik dan konsisten.

---

<div align="center">

### 🦅 Built for the road. Designed for the rebel.

**UAS Pemrograman Seluler — 2026**

</div>
