public class Handphone extends Perangkat {
    private boolean fingerprint;
    public Handphone(String Drive, int ram, float processor, boolean fingerprint) {
        super(Drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    @Override
    public void informasi() {
        if(fingerprint == true){
            System.out.println("This phone has the drive " + Drive + " with the ram " + ram + " and with the processor " + processor + " Ghz. Other than that, this laptop has a fingerprint");
        }
        else {
          System.out.println("This phone has the drive " + Drive + " with the ram " + ram + " and with the processor " + processor + " Ghz. Other than that, this laptop has a fingerprint");
        }
    }
    public void telfon(int no_hp) {
        System.out.println("This phone successfully connects the call to " + no_hp);
    }
    public void kirimSMS(int no_hp) {
        System.out.println("This phone successfully send a message to " + no_hp);
    }
    public void kirimSMS(int no_hp1,int no_hp2){
        System.out.println("This phone successfully send a message to " + no_hp1 + " and to " + no_hp2);
    }
}