import java.util.ArrayList;
import java.util.List;

public class Libro {
    String texto;


    public Libro(String texto) {
        this.texto = texto;
    }


    @Override
    public String toString() {
        return texto;
    }
}
