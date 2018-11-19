public class GrupoB extends Cliente {

    private double montoPagar;

    public GrupoB(String nombre, int claveCliente, double montoPagar){
        super(nombre, claveCliente);
        this.montoPagar = montoPagar;
    }

    public double totalPagar(){

        return (montoPagar >= 10000 ? montoPagar*0.95 : montoPagar); //condicion ternaria
    }
}
