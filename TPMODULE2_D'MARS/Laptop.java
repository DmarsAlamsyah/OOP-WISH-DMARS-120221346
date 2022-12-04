public class Laptop extends Perangkat  {
    protected boolean webcam;

    public Laptop(String Drive, int ram, float processor, boolean webcam) {
        super(Drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    
    public void informasi() {
        if(webcam == true){
            System.out.println("This Laptop has the drive "+ Drive + " with the ram " + ram + " and with the processor " + processor + " Ghz. Other than that, it also has webcam");
        }
        else{
            System.out.println("This Laptop has the drive " + Drive + " with the ram " + ram + " and with the processor " + processor + " Ghz. Other than that, it doesn't have a webcam");
        }

    }

    public void bukaGame(String nama_game){
        System.out.println("Laptop successfully opened " + nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop successfully send an Email to " + email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop successfully send an Email to " + email1 + " and to " + email2);
    }


}
