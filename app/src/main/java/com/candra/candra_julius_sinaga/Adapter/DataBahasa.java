package com.candra.candra_julius_sinaga.Adapter;

import com.candra.candra_julius_sinaga.R;

import java.util.ArrayList;

public class DataBahasa {
    // Membuat Array nama untuk kontent
    private static String [] nama = {
            "Bahasa C++",
            "Java",
            "Phyton",
            "Kotlin",
            "JavaScript",
            "PHP",
            "Visual Basic",
            "Bahasa C#",
            "Matlab",
            "SQL",
            "Pascal",
            "Swift"
    };

    // mmebuat detail pada kontent
    private static String [] detail = {
            "C++ adalah bahasa pemrograman komputer yang dibuat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bell Labs (Dennis Ritchie) pada awal tahun 1970-an, bahasa itu diturunkan dari bahasa sebelumnya, yaitu B. Pada awalnya, bahasa tersebut dirancang sebagai bahasa pemrograman yang dijalankan pada sistem Unix.",
            "Java adalah  bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems saat ini merupakan bagian dari Oracle dan dirilis tahun 1995. Bahasa ini banyak mengadopsi sintaksis yang terdapat pada C dan C++ namun dengan sintaksis model objek yang lebih sederhana serta dukungan rutin-rutin aras bawah yang minimal.",
            "Phyton adalah bahasa pemrograman interpretatif multiguna dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode. Python diklaim sebagai bahasa yang menggabungkan kapabilitas, kemampuan, dengan sintaksis kode yang sangat jelas, dan dilengkapi dengan fungsionalitas pustaka standar yang besar serta komprehensif. Python juga didukung oleh komunitas yang besar. ",
            "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia",
            "JavaScript adalah  bahasa pemrograman tingkat tinggi dan dinamis.JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT",
            "PHP: Hypertext Preprocessor adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML PHP banyak dipakai untuk memprogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS. ",
            "Microsoft Visual Basic (sering disingkat sebagai VB saja) merupakan sebuah bahasa pemrograman yang menawarkan Integrated Development Environment (IDE) visual untuk membuat program perangkat lunak berbasis sistem operasi Microsoft Windows dengan menggunakan model pemrograman (COM).\n" +
             "\n" +
            "Visual Basic merupakan turunan bahasa pemrograman BASIC dan menawarkan pengembangan perangkat lunak komputer berbasis grafik dengan cepat.",
            "C# (dibaca: C sharp) merupakan sebuah bahasa pemrograman yang berorientasi objek yang dikembangkan oleh Microsoft sebagai bagian dari inisiatif kerangka .NET Framework. Bahasa pemrograman ini dibuat berbasiskan bahasa C++ yang telah dipengaruhi oleh aspek-aspek ataupun fitur bahasa yang terdapat pada bahasa-bahasa pemrograman lainnya seperti Java, Delphi, Visual Basic, dan lain-lain) dengan beberapa penyederhanaan. ",
            "MATLAB (Matrix Laboratory) adalah sebuah lingkungan komputasi numerikal dan bahasa pemrograman komputer generasi keempat. Dikembangkan oleh The MathWorks, MATLAB memungkinkan manipulasi matriks, pem-plot-an fungsi dan data, implementasi algoritme, pembuatan antarmuka pengguna, dan peng-antarmuka-an dengan program dalam bahasa lainnya. Meskipun hanya bernuansa numerik, sebuah kotak kakas (toolbox) yang menggunakan mesin simbolik MuPAD",
            "SQL adalah sebuah bahasa yang digunakan untuk mengakses data dalam basis data relasional. Bahasa ini secara de facto merupakan bahasa standar yang digunakan dalam manajemen basis data relasional. Saat ini hampir semua server basis data yang ada mendukung bahasa ini untuk melakukan manajemen datanya.",
            "Pascal adalah bahasa pemrograman yang pertama kali di buat oleh Profesor Niklaus Wirth, seorang anggota International Federation of Information Processing (IFIP) pada tahun 1971. Dengan mengambil nama dari matematikawan Prancis, Blaise Pascal, yang pertama kali menciptakan mesin penghitung, Profesor Niklaus Wirth membuat bahasa Pascal ini sebagai alat bantu untuk mengajarkan konsep pemrograman komputer kepada mahasiswanya.",
            "Swift adalah  bahasa pemrograman objek fungsional untuk pengembangan iOS dan OS X yang dibuat oleh Apple.Didesain untuk berdampingan dengan Objective-C dan menghindari program dari kode yang salah  +" +
             "Swift diperkenalkan oleh Apple pada acara tahunan WWDC 2014.[3] Ini dibangun dengan compiler LLVM yang termasuk dalam Xcode 6 beta."
    };

    // membuat objek gambar pada kontent
    private static int [] photo = {
            R.drawable.gambar,
            R.drawable.java,
            R.drawable.phyton,
            R.drawable.kotlin,
            R.drawable.javascript,
            R.drawable.phot,
            R.drawable.visual,
            R.drawable.dua,
            R.drawable.matlab,
            R.drawable.mysql,
            R.drawable.pascal,
            R.drawable.siwft

    };

    // membuat objek sejarah pada kontent
    private static String [] sejarah = {
            "Bahasa C dikembangken di Bell lab pada tahun 1972 ditulis pertama kali oleh Brian W. Kernighan dan Denies M. Ricthie merupakan bahasa turunan atau pengembangan dari bahasa B yang ditulis oleh Ken Thompson pada tahun 1970, yang juga merupakan bahasa yang diturunkan oleh bahasa sebelumnya, yaitu BCL \n  Bahasa C pada awalnya dirancang sebagai bahasa pemrograman yang dioperasikan pada sistem operasi UNIX. Bahasa C merupakan bahasa pemrograman yang tergolong di antara bahasa tinggat rendah dan tingkat tinggi yang biasa disebut dengan Bahasa Tingkat Menengah. Bahasa C mempunyai banyak kemampuan yang sering digunakan diantaranya kemampuan untuk membuat perangkat lunak, misalnya dBASE, Word Star dan lain-lain.",
            "Java dikembangkan pada tahun 1990 oleh insinyur Sun, James Gosling sebagai bahasa pemrograman yang  berperan sebagai otak untuk peralatan pintar (TV interaktif, oven serba bisa). Gosling tidak puas dengan hasil yang ia peroleh ketika menulis program dengan C++, bahasa pemrograman lain, sehingga ia mengasingkan diri di kantornya dan menulis bahasa pemrograman baru agar lebih sesuai dengan kebutuhannya.\n " +
            "Gosling menamakan bahasa pemograman barunya Oak, nama sebuah pohon yang bisa ia lihat dari jendela kantornya; ia kemudian menamainya Green, dan kemudian mengganti namanya menjadi Java, berasal dari kopi Jawa (Java Coffee) , yang katanya banyak dikonsumsi dalam jumlah besar oleh pencipta bahasa ini. Bahasa pemograman ini kemudian menjadi bagian dari strategi Sun untuk menghasilkan uang jutaan dolar ketika TV interaktif menjadi industri bernilai jutaan dolar. Hal itu memang masih belum terjadi hari ini, tetapi sesuatu yang benar-benar berbeda kemudian terjadi pada bahasa pemograman baru Gosling itu.",
            "Python diciptakan oleh Guido van Rossum pertama kali di  Centrum Wiskunde & Informatica (CWI) di Belanda pada awal tahun 1990-an. Bahasa python terinspirasi dari bahasa pemrograman ABC. Sampai sekarang, Guido masih menjadi penulis utama untuk python, meskipun bersifat open source sehingga ribuan orang juga berkontribusi dalam mengembangkannya.\n " +
            "Di tahun 1995, Guido melanjutkan pembuatan python di Corporation for National Research Initiative (CNRI) di Virginia Amerika, di mana dia merilis beberapa versi dari python.",
            "Kotlin merupakan bahasa pemrograman pragmatis untuk JVM dan Android yang mengkombinasikan Object Oriented (OO) dan fitur fungsional dan fokus pada interoperabilitas, keamanan, kejelasan dan dukungan integrasi dengan berbagai tools major. Sebagai bahasa pemrograman dengan tujuan umum, Kotlin bisa berjalan dimanapun layaknya Java. Kotlin bisa digunakan untuk mengembangkan berbagai aplikasi server-side, aplikasi mobile (Android), aplikasi desktop. Apa saja dukungan tools major untuk Kotlin? Ini dia.\n" +
            "\n" +
            "    Intellij IDEA, Android Studio dan Eclipse\n" +
            "    Maven, Gradle dan Ant\n" +
            "    Spring Boot (Dukungan terbaru pada rilis ini)\n" +
            "    Github, Slack dan Minecaft\n" +
            "\n" +
            "Salah satu kunci fokus Kotlin sebagai bahasa pemrograman pragmatis adalah interoperabilitas dengan menggabungkan proyek Java + Kotlin. Oleh karena itu, Kotlin membuat adopsinya menjadi lebih mudah untuk koding. Selain itu, Kotlin memiliki library standar yang luas sehingga bisa digunakan untuk pengerjaan tugas sehari-hari dan tetap menjaga ukuran bytecode tetap rendah, hanya 6 byte. Dukungan lainnya adalah berbagai library Java yang bisa digunakan di Kotlin dan sebaliknya.",
            "JavaScript pertama kali dikembangkan oleh Brendan Eich dari Netscape di bawah nama Mocha, yang nantinya namanya diganti menjadi LiveScript, dan akhirnya menjadi JavaScript. \n Navigator sebelumnya telah mendukung Java untuk lebih bisa dimanfaatkan para pemrogram yang non-Java \n Maka dikembangkanlah bahasa pemrograman bernama LiveScript untuk mengakomodasi hal tersebut.[8] Bahasa pemrograman inilah yang akhirnya berkembang dan diberi nama JavaScript, walaupun tidak ada hubungan bahasa antara Java dengan JavaScript",
            "Pada awalnya PHP merupakan kependekan dari Personal Home Page (Situs personal). PHP pertama kali dibuat oleh Rasmus Lerdorf pada tahun 1995. Pada waktu itu PHP masih bernama Form Interpreted (FI), yang wujudnya berupa sekumpulan skrip yang digunakan untuk mengolah data formulir dari web. \n Selanjutnya Rasmus merilis kode sumber tersebut untuk umum dan menamakannya PHP/FI. Dengan perilisan kode sumber ini menjadi sumber terbuka, maka banyak pemrogram yang tertarik untuk ikut mengembangkan PHP. \n " +
            "Pada November 1997, dirilis PHP/FI 2.0. Pada rilis ini, interpreter PHP sudah diimplementasikan dalam program C. Dalam rilis ini disertakan juga modul-modul ekstensi yang meningkatkan kemampuan PHP/FI secara signifikan. ",
            "Bill Gates, pendiri Microsoft, memulai bisnis perangkat lunak dengan mengembangkan interpreter bahasa Basic untuk Altair 8800, untuk kemudian ia ubah agar dapat berjalan di atas IBM PC dengan sistem operasi DOS. Perkembangan berikutnya ialah diluncurkannya BASICA (basic-advanced) untuk DOS. Setelah BASICA, Microsoft meluncurkan Microsoft QuickBasic dan Microsoft Basic (dikenal juga sebagai Basic Compiler). \n Visual Basic adalah pengembangan dari bahasa komputer BASIC (Beginner’s All-purpose Symbolic Instruction Code). Bahasa BASIC diciptakan oleh Professor John Kemeny dan Thomas Eugene Kurtz dari Perguruan Tinggi Dartmouth pada pertengahan tahun 1960-an.[2] Bahasa program tersebut tersusun mirip dengan bahasa Inggris yang biasa digunakan oleh para programer untuk menulis program-program komputer sederhana yang berfungsi sebagai pembelajaran bagi konsep dasar pemrograman komputer. ",
            "Pada akhir dekade 1990-an, Microsoft membuat program Microsoft Visual J++ sebagai sebuah langkah percobaan untuk menggunakan Java di dalam sistem operasi Windows untuk meningkatkan antarmuka dari Microsoft Component Object Model (COM). Akan tetapi, akibat masalah dengan pemegang hak cipta bahasa pemrograman Java, Sun Microsystems, Microsoft pun menghentikan pengembangan J++, dan beralih untuk membuat pengganti J++, kompilernya dan mesin virtualnya sendiri dengan menggunakan sebuah bahasa pemrograman yang bersifat general-purpose. Untuk menangani proyek ini, Microsoft merekrut Anders Helsberg, yang merupakan mantan karyawan Borland yang membuat bahasa Turbo Pascal, dan Borland Delphi, yang juga mendesain Windows Foundation Classes (WFC) yang digunakan di dalam J++. Sebagai hasil dari usaha tersebut, C# pun pertama kali diperkenalkan pada bulan Juli 2000 sebagai sebuah bahasa pemrograman modern berorientasi objek yang menjadi sebuah bahasa pemrograman utama di dalam pengembangan di dalam platform Microsoft .NET Framework. ",
            "MATLAB (yang berarti \"matrix laboratory\") diciptakan pada akhir tahun 1970-an oleh Cleve Moler, yang kemudian menjadi Ketua Departemen Ilmu Komputer di Universitas New Mexico.\n  Ia merancangnya untuk memberikan akses bagi mahasiswa dalam memakai LINPACK dan EISPACK tanpa harus mempelajari Fortran. Karyanya itu segera menyebar ke universitas-universitas lain dan memperoleh sambutan hangat di kalangan komunitas matematika terapan. Jack Little, seorang insinyur, dipertemukan dengan karyanya tersebut selama kunjungan Moler ke Universitas Stanford pada tahun 1983. Menyadari potensi komersialnya, ia bergabung dengan Moler dan Steve Bangert. Mereka menulis ulang MATLAB dalam bahasa pemrograman C, kemudian mendirikan The MathWorks pada tahun 1984 untuk melanjutkan pengembangannya. Pustaka yang ditulis ulang tadi kini dikenal dengan nama JACKPAC.",
            "Sejarah SQL dimulai dari artikel seorang peneliti dari IBM bernama Jhonny Oracle yang membahas tentang ide pembuatan basis data relasional pada bulan Juni 1970. Artikel ini juga membahas kemungkinan pembuatan bahasa standar untuk mengakses data dalam basis data tersebut. Bahasa tersebut kemudian diberi nama SEQUEL (Structured English Query Language). \n Setelah terbitnya artikel tersebut, IBM mengadakan proyek pembuatan basis data relasional berbasis bahasa SEQUEL. Akan tetapi, karena permasalahan hukum mengenai penamaan SEQUEL, IBM pun mengubahnya menjadi SQL. Implementasi basis data relasional dikenal dengan System/R. ",
            "Pascal adalah bahasa pemrograman yang pertama kali di buat oleh Profesor Niklaus Wirth, seorang anggota International Federation of Information Processing (IFIP) pada tahun 1971. Dengan mengambil nama dari matematikawan Prancis, Blaise Pascal, yang pertama kali menciptakan mesin penghitung, Profesor Niklaus Wirth membuat bahasa Pascal ini sebagai alat bantu untuk mengajarkan konsep pemrograman komputer kepada mahasiswanya. Selain itu, Profesor Niklaus Wirth membuat Pascal juga untuk melengkapi kekurangan-kekurangan bahasa pemrograman yang ada pada saat itu.",
            "Swift adalah bahasa pemrograman objek fungsional untuk pengembangan iOS dan OS X yang dibuat oleh Apple. Didesain untuk berdampingan dengan Objective-C dan menghindari program dari kode yang salah. Swift diperkenalkan oleh Apple pada acara tahunan WWDC 2014.  Ini dibangun dengan compiler LLVM yang termasuk dalam Xcode 6 beta. Sebuah buku berisi 500 halaman petunjuk, The Swift Programming Language, dirilis bersamaan dengan WWDC, dan tersedia secara gratis di iBooks."

    };

    // membuat objek penemu pada kontent
    private static String [] penemu = {
            "Bjarne Stroustrup",
            "James Gosling",
            "Guido van Rossum",
            "Tim Jerbrains",
            "Brendan Eich",
            "Rasmus Lerdorf",
            "Bill Gates",
            "Bill Gates dan Brondan Delphi",
            "The MatWorks",
            "Jhonny Oracle",
            "Niklaus Wirth",
            "Apple,"



    };

    // membuat tanggal pada kontent
    private static String [] tanggal = {
            "tahun 1960",
            "tahun 1995",
            "tahun 1990",
            "tahun 2016",
            "tahun 1961",
            "tahun 1968",
            "tahun 1955",
            "tahun 1955",
            "tahun 2004",
            "tahun 2008",
            "tahun 1971",
            "tahun 2014"


    };

    // membuat tokoh photo penemu pada kontent
    private static int [] photoPenem = {
            R.drawable.penemu1,
            R.drawable.penemu2,
            R.drawable.penemu3,
            R.drawable.penemu4,
            R.drawable.penemu5,
            R.drawable.penemu6,
            R.drawable.penemu7,
            R.drawable.penemu8,
            R.drawable.penemu9,
            R.drawable.penemu10,
            R.drawable.penemu11,
            R.drawable.penemu12

    };

    // mengambil semua objek pada kontent
  public static ArrayList<Hero> getLisData(){
        ArrayList<Hero> list  = new ArrayList<>();
        for (int position = 0; position < nama.length; position++) {
            Hero hero = new Hero();
            hero.setNama(nama[position]);
            hero.setDetail(detail[position]);
            hero.setPhoto(photo[position]);
            hero.setSejarah(sejarah[position]);
            hero.setPenemu(penemu[position]);
            hero.setTangal(tanggal[position]);
            hero.setPhotoPenemu(photoPenem[position]);
            list.add(hero);
        }
        return list;

    }

}
