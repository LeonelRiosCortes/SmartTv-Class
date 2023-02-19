import java.util.ArrayList;

public class PruebaSmartTv {
    public static void main(String[] args) throws Exception {
       ArrayList<SmartTv> TiendaElec = new ArrayList<>();
       SmartTv Tele1 = new SmartTv(new Marca("Sony","Japon"), 24);
       SmartTv Tele2 = new SmartTv(new Marca("TCL","China"), 32);
       SmartTv Tele3 = new SmartTv(new Marca("Hisense","China"), 50);

       TiendaElec.add(Tele1);
       TiendaElec.add(Tele2);
       TiendaElec.add(Tele3);

       System.out.println(TiendaElec);
    }
}
