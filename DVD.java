//Superclass yang memiliki 2 subclass, yaitu DVDMusik dan DVDFilm
abstract class DVD{
    //memilki 4 attribute sebagai berikut
    private String judul;
    private String publisher;
    private String kategori;
    private int stok;

    //memiliki constructor dengan 4 buah arguments seperti dibawah ini
    public DVD(String title, String publish, String cat, int stock){
        this.judul=title;
        this.publisher=publish;
        this.kategori=cat;
        this.stok=stock;
    }

    //getter attribute judul
    public String getJudul() {
        return judul;
    }

    //getter attribute publisher
    public String getPublisher() {
        return publisher;
    }

    //getter attribute kategori
    public String getKategori() {
        return kategori;
    }

    //getter attribute stok
    public int getStok() {
        return stok;
    }

    //sebuah method abstract yang nantinya digunakan untuk melakukan print seluruh attribute
    abstract void dispinfo();

    //sebuah method abstract yang nantinya akan print sesuai dari input kategori
    abstract void printKategori();

    //sebuah method abstract untuk melakukan print terhadap attribute bertype array
    abstract void printArray();
}