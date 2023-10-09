public class Hangar {

    public static void main(String[] args) {

        Car voiture = new Car("Golf", 30_000);
        System.out.println("1 : Voiture : " + voiture.doStuff());
        System.out.println("2. Voiture kilomètrage : " + String.valueOf(voiture.getKilometers()));
        voiture.setBrand("Renault");
        voiture.setKilometers(42_000);
        System.out.println("3 : Voiture nouvelle marque: " + voiture.doStuff());
        System.out.println("4. Voiture nouveau kilomètrage : " + String.valueOf(voiture.getKilometers()));
        

        Boat bateau = new Boat("Le Normandie", 10_000);
        System.out.println("5 : Bateau : " + bateau.doStuff());
        System.out.println("6. Kilomètrage bateau : " + String.valueOf(bateau.getKilometers()));
        bateau.setBrand("Le paquebot de luxe");
        bateau.setKilometers(84_000);
        System.out.println("7 : Bateau nouveau nom : " + bateau.doStuff());
        System.out.println("8. Bateau nouveau kilomètrage : " + String.valueOf(bateau.getKilometers()));
        
    }
}