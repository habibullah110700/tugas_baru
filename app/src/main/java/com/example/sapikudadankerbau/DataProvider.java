package com.example.sapikudadankerbau;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.sapikudadankerbau.model.Sapi;
import com.example.sapikudadankerbau.model.Hewan;
import com.example.sapikudadankerbau.model.Kuda;
import com.example.sapikudadankerbau.model.Kerbau;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Sapi> initDataSapi(Context ctx) {
        List<Sapi> sapis = new ArrayList<>();
        sapis.add(new Sapi("holstein", "Eropa",
                "Sapi holstein atau frisia merupakan salah satu trah sapi perah yang sekarang dikenal sebagai sapi yang terbanyak memproduksi susu di peternakan susu.", R.drawable.sapi1));
        sapis.add(new Sapi("galloway", "Skotlandia",
                "Galloway adalah salah satu breed sapi potong terpanjang di dunia, dinamai sesuai dengan wilayah Galloway di Skotlandia, tempat asalnya, pada abad ke-17.", R.drawable.sapi_galloway));
        sapis.add(new Sapi("hereford", "iklim subtropis",
                "Sapi Hereford merupakan salah satu jenis sapi potong yang berasal dari daerah dengan iklim subtropis", R.drawable.sapi_hereford));
        sapis.add(new Sapi("cachena", "Portugal",
                "Cachena adalah jenis ternak tujuan ganda dari Portugal dan Galicia, Spanyol. Di Portugal, ada juga jenis ternak yang serupa tetapi lebih besar yang dikenal dengan nama Barrosão atau Barrosã", R.drawable.sapi_cachena));
        sapis.add(new Sapi("Anggus", "Skotlandia",
                "Aberdeen Angus, terkadang hanya Angus, adalah jenis sapi potong kecil Skotlandia. Ini berasal dari ternak asli dari kabupaten Aberdeen, Banff, Kincardine dan Forfar di timur laut Skotlandia", R.drawable.sapi_angus));

        return sapis;
    }


    private static List<Kuda> initDataKuda(Context ctx) {
        List<Kuda> kudas = new ArrayList<>();
        kudas.add(new Kuda("kuda arab", "arab",
                "salah satu jenis ras kuda yang berasal dari daerah Arab, dipelihara orang untuk berbagai keperluan. Karena posturnya yang tinggi, performa yang istimewa yaitu ketahanan tubuh prima, kecerdasannya, lincah maka kuda arab dipakai juga untuk berperang.",R.drawable.kuda_arab));
        kudas.add(new Kuda("kuda appoloosa", "amerika",
                "Appaloosa adalah jenis kuda Amerika yang terkenal karena pola bulunya yang berwarna-warni, Ada berbagai macam tipe tubuh dalam breed, yang berasal dari pengaruh beberapa breed kuda sepanjang sejarahnya.",R.drawable.kuda_appoloos));
        kudas.add(new Kuda("kuda Dutch warmblood","nederland",
                "Dutch Warmblood adalah jenis kuda berdarah panas yang terdaftar di Koninklijk Warmbloed Paardenstamboek Nederland, yang mengatur pemuliaan kuda-kuda kompetisi dan kuda lompat, serta kuda pacuan kuda dan kuda pacuan kuda", R.drawable.kuda_dutch));
        kudas.add(new Kuda("kuda Mustang", "amerika serikat barat",
                "Mustang adalah kuda yang berkeliaran bebas di Amerika Serikat Barat, diturunkan dari kuda yang dibawa ke Amerika oleh Spanyol. Mustang sering disebut sebagai kuda liar", R.drawable.kuda_mustang2));
        return kudas;
    }
    private static List<Kerbau> initDataKerbau(Context ctx) {
        List<Kerbau> kerbaus = new ArrayList<>();
        kerbaus.add(new Kerbau("murrah", "India",
                "Kerbau Murrah adalah jenis kerbau yang dipelihara terutama untuk produksi susu. Itu berasal dari Haryana dan Punjab di India", R.drawable.kerbau_murrah));
        kerbaus.add(new Kerbau("Rawa", "Filipina",
                "Carabao adalah kerbau domestik jenis rawa asli Filipina. Carabao diperkenalkan ke Guam dari Spanyol Filipina pada abad ke-17.", R.drawable.kerbau_rawa));
        kerbaus.add(new Kerbau("mediterania", "Italia",
                "Kerbau Mediterania Italia adalah jenis kerbau Italia. Kerbau ini termasuk jenis kerbau sungai dan mirip dengan jenis kerbau di Hungaria, Rumania dan negara-negara Balkan.", R.drawable.kerbau_mediterina));
        kerbaus.add(new Kerbau("nagfuri", "India",
                "Nagpuri adalah jenis kerbau yang berasal dari Maharashtra, India. Itu berdiri lebih baik di antara keturunan kerbau yang menggabungkan kualitas susu dan kekeringan dalam proporsi yang lebih baik dalam kondisi iklim yang merugikan.", R.drawable.kerbau_nagfuri));
        kerbaus.add(new Kerbau("surti", "Gujarat",
                "Surti adalah jenis kerbau yang ditemukan di distrik Kaira dan Vadodara di Gujarat antara sungai Mahi dan Sabarmati. Rata-rata produksi susunya adalah 1600-1800 liter.", R.drawable.kerbau_surti));
        return kerbaus;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataSapi(ctx));
        hewans.addAll(initDataKuda(ctx));
        hewans.addAll(initDataKerbau(ctx));
    }
    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}