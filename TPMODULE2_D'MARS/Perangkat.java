public class Perangkat {
    protected String Drive;
    protected int ram;
    protected float processor;
    public Perangkat(String drive, int ram, float processor) {
        this.Drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void informasi() {
        System.out.println("This device doesn't have the drive " + Drive + " with ram " + ram + " GB and processor with " + processor + " Ghz");
    }
}
