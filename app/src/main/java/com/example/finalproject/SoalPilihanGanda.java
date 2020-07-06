package com.example.finalproject;

public class SoalPilihanGanda {
    public String pertanyaan[] = {
            "Siapa nama Presiden Indonesia yang ke-3 ?",
            "Pulau terbesar di Indonesia adalah pulau ?",
            "Siapa yang menjajah Indonesia selama 350 tahun ?",
            "Siapa yang menjahit Bendera Merah Putih ?",
            "Hari Kemerdekaan Indonesia jatuh pada tanggal ?",
            "Sumpah Pemuda di Peringati setiap tanggal ?",
            "Ibu Kota Indonesia adalah ?",
            "Penjajahan pada masa Jepang disebut dengan ?",
            "Presiden Soekarno lahir pada tanggal ?",
            "Siapakah tokoh yang dijuluki Bapak Pendidikan?",


    };

    private String pilihanJawaban[][] = {
            {"Ir. Soekarno", "BJ. Habibie", "Susilo Bambang Yudhoyono"},
            {"Kalimantan", "Jawa", "Sumatra"},
            {"Jepang", "Belanda", "Amerika"},
            {"Megawati", "R.A Kartini", "Fatmawati"},
            {"17 Agustus 1980", "17 Juli 1945", "17 Agustus 1945"},
            {"28 Desember", "28 Oktober", "17 Oktober"},
            {"Bandung", "Jawa Tengah", "Jakarta"},
            {"Romusha", "Rodi", "Padri"},
            {"6 Juni 1901", "6 Juli 1902", "6 Juni 1904"},
            {"Soekarna", "Ki Hajar Dewantara", "BJ. Habibie"},
    };

    private String jawabanBenar[] = {
            "BJ. Habibie",
            "Kalimantan",
            "Belanda",
            "Fatmawati",
            "17 Agustus 1945",
            "28 Oktober",
            "Jakarta",
            "Romusha",
            "6 Juni 1901",
            "Ki Hajar Dewantara",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }


    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }


    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }


    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }


    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
