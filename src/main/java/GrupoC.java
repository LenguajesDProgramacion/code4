public class GrupoC extends Cliente {

    private double montoPagar;

    public GrupoC(String nombre, int claveCliente, double montoPagar){
        super(nombre, claveCliente);
        this.montoPagar = montoPagar;
    }

    public double totalPagar(){

        return (montoPagar >= 10000 ? montoPagar*0.98 : montoPagar); //condicion ternaria
    }
}
