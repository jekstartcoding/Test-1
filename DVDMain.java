import java.util.ArrayList;
import java.util.Scanner;

public class DVDMain {
    public static void main(String[] args) {
        //Scanner untuk input
        Scanner scanner =  new Scanner(System.in);

        //penggunaan arraylist agar dapat menampung banyak entry data DVD
        ArrayList <DVDFilm> daftarFilm = new ArrayList<>();
        ArrayList <DVDMusik> daftarMusik = new ArrayList<>();

        //variable lokal penampung attributes superclass DVD
        String title, publish;
        String category="";
        int stock;

        //variable lokal penampung attributes subclass DVDFilm
        String[] actor = new String[5];
        String director;

        //variable lokal penampung attributes subclass DVDMusik
        String singer, producer;
        String[] tophits = new String[5];

        //variable lokal untuk kebutuhan main
        int i;
        String Choice = "";
        boolean status = true;
        boolean status1, status2;
        int choice, choice1;
        
        //while agar program terus berjalan
        while(status==true){
            i=0;
            status1=true;
            status2=true;
            for(int j=0;j<100;j++){System.out.print("=");}
            System.out.println("\nSelamat datang di program entry dan view DVD, silahkan untuk input sesuai menu berikut ini!\n");
            System.out.println("(1) Entry Data DVD");
            System.out.println("(2) View Data DVD");
            System.out.println("(3) Keluar");
            System.out.print("Pilihanmu = ");
            choice=scanner.nextInt();
            //pilihan untuk melakukan Entry DVD
            if(choice==1){
                while(status1==true){
                    System.out.println("\nIni adalah menu untuk melakukan Entry Data DVD. Silahkan pilih pilihan entry sesuai angka.");
                    System.out.println("(1) Entry DVD Film");
                    System.out.println("(2) Entry DVD Musik");
                    System.out.print("Pilihanmu = ");

                    choice1=scanner.nextInt();
                    //pilihan 1 untuk melakukan entry DVD Film
                    if(choice1==1){
                        scanner.nextLine();
                        System.out.println("\nBerikut ini anda diminta untuk melakukan Entry Data untuk DVD Film");

                        System.out.print("Judul Film = ");
                        title=scanner.nextLine();

                        //while agar bisa melakukan input nama aktor lebih dari 1

                        while(status2==true&&i!=5){
                            System.out.print("\nNama-Nama Actor = ");
                            actor[i]=scanner.nextLine();
                            if(i<4){
                                System.out.println("Apakah anda akan memasukkan nama actor lain? (maksimal 5 orang, baru terisi "+(i+1)+")");
                                System.out.print("Ketik angka 1 untuk ya, dan karakter lain untuk tidak = ");
                                Choice=scanner.next();
                                scanner.nextLine();
                            }
                            if(Choice.equals("1")){
                                i++;                //menambah indeks untuk pengisian array apabila memilih untuk mengisi lagi
                            }else{
                                status2=false;
                            }
                        }
                        System.out.print("\nSutradara = ");
                        director=scanner.nextLine();
                        System.out.print("\nPublisher = ");
                        publish=scanner.nextLine();
                        status2=true;
                        //while untuk input kategori agar tidak keluar dari petunjuk yang diberikan
                        while (status2==true) {
                            System.out.println("\n(Petunjuk pengisian kategori \nSU = Semua Umur, D = Dewasa, R = Remaja, A = Anak-Anak)");
                            System.out.print("Kategori = ");
                            category=scanner.next();
                            if (category.equals("SU")||category.equals("D")||category.equals("R")||category.equals("A")) {
                                status2=false;
                            }else{
                                System.out.println("Tolong masukkan sesuai petunjuk kategori!");
                            }
                        }
                        System.out.print("\nStock DVD = ");
                        stock=scanner.nextInt();

                        //instansiasi dengan menggunakan constructor dari class DVDFilm
                        DVDFilm film = new DVDFilm(title, publish, category, stock, actor, director);
                        //memasukkan film ke arraylist
                        daftarFilm.add(film);

                        status1=false;
                        //pilihan 2 untuk melakukan entry DVD Musik
                    }else if(choice1==2){
                        scanner.nextLine();
                        System.out.println("\nBerikut ini anda diminta untuk melakukan Entry Data untuk DVD Musik");

                        System.out.print("Judul Album Musik = ");
                        title=scanner.nextLine();
                        System.out.print("\nNama penyanyi = ");
                        singer=scanner.nextLine();
                        System.out.print("\nProduser = ");
                        producer=scanner.nextLine();
                        System.out.print("\nPublisher = ");
                        publish=scanner.nextLine();
                        
                        status2=true;
                        i=0;
                        //while agar bisa melakukan input topHits lebih dari 1
                        while(status2==true&&i!=5){
                            System.out.print("\nNama Top Hits = ");
                            tophits[i]=scanner.nextLine();
                            if(i<4){
                                System.out.println("Apakah anda akan memasukkan Top Hits lain? (maksimal 5 lagu, baru terisi "+(i+1)+")");
                                System.out.print("Ketik angka 1 untuk ya, dan karakter lain untuk tidak = ");
                                Choice=scanner.next();
                                scanner.nextLine();
                            }
                            if(Choice.equals("1")){
                                i++;                    //iterasi index untuk array apabila memilih untuk mengisi lagi
                            }else{
                                status2=false;
                            }
                        }

                        status2=true;
                        //while untuk memastikan pengisian kategori tidak keluar dari petunjuk kategori
                        while (status2==true) {
                            System.out.println("\n(Petunjuk pengisian kategori \nC = Classic, J = Jazz, P = Pop, R = Rock, O = Other)");
                            System.out.print("Kategori = ");
                            category=scanner.next();
                            if (category.equals("C")||category.equals("J")||category.equals("P")||category.equals("R")||category.equals("O")) {
                                status2=false;
                            }else{
                                System.out.println("Tolong masukkan sesuai petunjuk kategori!");
                            }
                        }

                        System.out.print("\nStock DVD = ");
                        stock=scanner.nextInt();

                        //instansiasi class DVDMusik dengan constructor yang ada pada class DVDMusik
                        DVDMusik musik = new DVDMusik(title, publish, category, stock, singer, producer, tophits);
                        //memasukkan objek musik ke arraylist daftarMusik
                        daftarMusik.add(musik);

                        status1=false;
                    }else{
                        System.out.println("Pilihanmu tidak valid!");
                    }
                }
                //pilihan 2 untuk menampilkan list DVD
            }else if(choice==2){
                scanner.nextLine();
                status1=true;
                System.out.println("\nSilahkan pilih DVD jenis apa yang akan diprint?");
                System.out.println("(1) View List DVD Film");
                System.out.println("(2) View List DVD Musik");
                while(status1==true){
                    System.out.print("Pilihanmu = ");
                    choice1=scanner.nextInt();
                    //menampilkan list DVD Film
                    if(choice1==1){
                        //kondisi apabila list DVD Film masih kosong
                        if(daftarFilm.isEmpty()==true){
                            System.out.println("Belum ada data list DVD Film, silahkan melakukan entry terlebih dahulu!");
                        }else{
                            //menggunakan for loop untuk melakukan print terhadap semua DVD Film1
                            
                            int idxFilm = 1;
                            for(DVDFilm film : daftarFilm){
                                System.out.println("\nData DVD FIlm #"+idxFilm);
                                film.dispinfo();
                                System.out.println("\n");
                                idxFilm++;
                            }
                        }
                    status1=false;
                    }else if(choice1==2){
                        //kondisi apabila list DVD Musik masih kosong
                        if(daftarMusik.isEmpty()==true){
                            System.out.println("Belum ada data list DVD Musik, silahkan melakukan entry terlebih dahulu!");
                        }else{
                            System.out.println("\n");
                            //menggunakan for loop untuk melakukan print terhadap semua DVD Musik
                            int idxMusik = 1;
                            for(DVDMusik musik : daftarMusik){
                                System.out.println("\nData DVD Musik #"+idxMusik);
                                musik.dispinfo();
                                System.out.println("\n");
                                idxMusik++;
                            }
                        }
                        status1=false;
                    }else{
                        System.out.println("Pilihanmu tidak valid!");
                    }
                }
            }else if(choice==3){
                status=false;
            }else{
                System.out.println("Pilihan tidak valid!");
            }
        }
        System.out.println("\nTerima kasih sudah menggunakan program ini!");
        for(int j=0;j<100;j++){System.out.print("=");}
    }
}