public class Materia {

    String nombreMateria;
    String key;
    double nota;

    public Materia(String nombreMateria, String key, double nota) {
        this.nombreMateria = nombreMateria;
        this.key = key;
        this.nota = nota;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

