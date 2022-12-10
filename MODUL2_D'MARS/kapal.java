import javax.xml.crypto.dsig.TransformService;

public class kapal extends TransportasiAir{
    protected String Mesin;
public kapal(int jumlahKursi, int biaya, String mesin){
    super(jumlahKursi, biaya);
    this.Mesin = Mesin;
}
public void informasi(){
    System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah " + jumlahKursi + "ditetapkan dengan biaya sebesar Rp. " + biaya);
}
public void berlayar(){
    System.out.println("Transportasi Air jenis Kapal dengan sedang berlayar menggunakan mesin " + Mesin + "dengan kecepetan yang tidak stabil");
}
public void berlayar(int kecepatan){
    System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin " + Mesin + "dengan kecepatan stabil di kisaran 20 knot");
}
public void berlabuh(){
    System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
}
}