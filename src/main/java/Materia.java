public class Materia {

    String nombreMateria;
    String key;
    int nota;

    public Materia(String nombreMateria, String key, int nota) {
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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

