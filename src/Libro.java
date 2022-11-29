import java.util.ArrayList;
import java.util.List;

public class Libro {
    Texto[] textoList = new Texto[100];;
    int ultimoId;
    int id;

    public Libro() {
        id = 0;
        this.ultimoId = id++;

    }

    public void addTexto(Texto texto) {
           this.textoList[ultimoId] = texto;
           ultimoId++;

    }

    @Override
    public String toString() {
        return textoList.toString();
    }
}
