public class GrupoA extends Cliente {

    private double montoPagar;

    public GrupoA(String nombre, int claveCliente, double montoPagar){
        super(nombre, claveCliente);
        this.montoPagar = montoPagar;
    }

    public double totalPagar(){

        return (montoPagar >= 10000 ? montoPagar*0.9 : montoPagar); //condicion ternaria
    }
}
