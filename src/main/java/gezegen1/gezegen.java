package gezegen1;

public class gezegen {
    public static void main(String[] args){
        for (enumgezegen gezegen : enumgezegen.values()) {

        System.out.println("gezegen : " + gezegen);
        System.out.println("SıraNo : " + gezegen.getSirano());
        System.out.println("Uzaklik : " + gezegen.getUzaklik());
        System.out.println("Yaricap : " + gezegen.getYaricap());
        System.out.println("DonmeSuresi : " + gezegen.getDonmeSuresi());



    }
}
}
