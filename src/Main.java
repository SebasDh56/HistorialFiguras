import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> listFigura=new ArrayList<>();
        Triangulo tr=new Triangulo("Trinagulo");
        Cuadrado cr=new Cuadrado();
        listFigura.add(tr);
        listFigura.add(cr);

    }
}