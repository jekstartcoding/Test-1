//subclass dari superclass DVD
public class DVDFilm extends DVD {
    //memiliki 2 attribute
    private String pemeran[];       //dibuat array karena nantinya diharapkan bisa menampung lebih dari 1 elemen
    private String sutradara;

    //constructor dengan memanggil super, kemudian ditambah dengan construct attribute milik class
    public DVDFilm(String title, String publish, String Cat, int stock, String[] actor, String director) {
        super(title, publish, Cat, stock);
        this.pemeran=actor;
        this.sutradara=director;
    }

    //override dari method abstract printKategori dari superclass DVD untuk melakukan print berdasarkan attribute kategori
    @Override
    void printKategori(){
        if(getKategori().equals("SU")){
            System.out.println("Kategori = Semua Umur");
        }else if(getKategori().equals("D")){
            System.out.println("Kategori = Dewasa");
        }else if(getKategori().equals("R")){
            System.out.println("Kategori = Remaja");
        }else if(getKategori().equals("A")){
            System.out.println("Kategori = Anak-Anak");
        }
    }

    //override dari method abstract printArray dari superclass DVD untuk melakukan print kepada attribute pemeran
    @Override
    void printArray(){
        for(int i = 0;i<pemeran.length;i++){
            System.out.print(pemeran[i]);
            if(i+1 < pemeran.length && pemeran[i+1] != null){
                System.out.print(", ");
            }else{
                break;
            }
        }
    }

    //override dari method abstract dispinfo dari superclass DVD untuk melakukan print seluruh attributes class
    @Override
    void dispinfo() {
        System.out.println("Judul = "+getJudul());
        System.out.print("Pemeran = ");
        printArray();              //pemanggilan method printArray untuk print pemeran
        System.out.println("\nSutradara = "+sutradara
        +"\nPublisher = "+getPublisher());
        printKategori();        //pemanggilan method printKategori untuk print berdasarkan kategori
        System.out.println("Stock = "+getStok());
    }
}
