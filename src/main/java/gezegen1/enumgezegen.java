package gezegen1;

public enum enumgezegen {
    MERKUR(1, 57.9, 2439.7, 58.6),
    VENUS(2, 108.2, 6051.8, -243),
    DUNYA(3, 149.6, 6371, 24),
    MARS(4, 227.9, 3389.5, 24.7),
    JUPITER(5, 778.3, 71492, 9.9),
    SATURN(6, 1427, 60268, 10.7),
    URANUS(7, 2871, 25559, -17.2),
    NEPTUN(8, 4497, 24764, 16.1);

    private int Sirano;
    private double uzaklik;
    private double yaricap;
    private double donmeSuresi;

    enumgezegen (int Sirano, double uzaklik, double yaricap, double donmeSuresi){
        this.Sirano = Sirano;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;

    }

 ;;   public int getSirano(){
         return Sirano;
     }
    public  double getUzaklik(){
        return uzaklik;
    }
    public  double getYaricap(){
        return yaricap;
    }
    public  double getDonmeSuresi(){
        return donmeSuresi;
    }
}
