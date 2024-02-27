public class DVDMusik extends DVD {
    //attributes yang dimiliki class DVDMusik
    private String penyanyi;
    private String produser;
    private String[] topHits;       //berbentuk array karena bisa diisi beberapa elemen

    //constructor untuk class DVDMusik
    public DVDMusik(String title, String publish, String cat, int stock, String singer, String producer, String[] tophits) {
        super(title, publish, cat, stock);
        this.penyanyi=singer;
        this.produser=producer;
        this.topHits=tophits;
    }

    //override dari method abstract printKategori dari superclass DVD untuk melakukan print berdasarkan attribute kategori
    @Override
    void printKategori(){
        if(getKategori().equals("P")){
            System.out.println("\nKategori = Pop");
        }else if(getKategori().equals("C")){
            System.out.println("\nKategori = Classic");
        }else if(getKategori().equals("R")){
            System.out.println("\nKategori = Rock");
        }else if(getKategori().equals("J")){
            System.out.println("\nKategori = Jazz");
        }else if(getKategori().equals("O")){
            System.out.println("\nKategori = Others");
        }
    }

    //override dari method abstract printArray dari superclass DVD untuk melakukan print kepada attribute topHits
    @Override
    void printArray(){
        for(int i=0;i<topHits.length;i++){
            System.out.print(topHits[i]);
            if(i+1 < topHits.length && topHits[i+1] != null){
                System.out.print(", ");
            }else{
                break;
            }
        }
    }

    //override dari method abstract dispinfo dari superclass DVD untuk melakukan print seluruh attributes class
    @Override
    void dispinfo() {
        System.out.println("Judul = "+getJudul()+"\nPenyanyi = "+penyanyi+"\nProduser = "+produser+"\nPublisher = "+getPublisher());
        System.out.print("Top hits = ");
        printArray();                             //pemanggilan method printArray untuk melakukan print array topHits
        printKategori();                          //pemanggilan method printKategori untuk melakukan print sesuai kategori
        System.out.println("Stok = "+getStok());
    }
}