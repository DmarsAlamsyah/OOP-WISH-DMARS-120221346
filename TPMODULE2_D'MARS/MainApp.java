public class MainApp {
    public static void main(String[] args){
        System.out.print("");
        
        Perangkat perangkat = new Perangkat("Adata", 4, 1.30f);
        perangkat.informasi();

        System.out.println("");
    
        Laptop laptop = new Laptop("Western Digital", 8, 2.40f, true);
        laptop.informasi();
        laptop.bukaGame("Genshin Impact");
        laptop.kirimEmail("maddiemadmad@gmail.com");
        laptop.kirimEmail("cassiehoward@gmail.com", "JulesVaughn@gmail.com");

        System.out.println("");

        Handphone handphone = new Handphone("Sandisk", 8, 2.20f, true);
        handphone.informasi();
        handphone.telfon(620183734);
        handphone.kirimSMS(627746827);
        handphone.kirimSMS(62987097, 6279230);


    }
    
}
