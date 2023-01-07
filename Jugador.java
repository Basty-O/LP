import java.util.ArrayList;
import java.util.List;

public class Jugador extends Personaje{
    private List<String> items_aplicados = new ArrayList<>();

    //Getters y setters de items_aplicados
    public List<String> getItems_aplicados() {      
        return items_aplicados;
    }
    public void setItems_aplicados(String item) {
        items_aplicados.add(item);
    }
    public Jugador (String nombre){   //contructor  
        super(nombre);
    }
    public void verEstado(){    //Permite ver los estados(MostrarInfo esta en la clase Personaje)
        MostrarInfo();
    }
    public void verItems(){     //Es la opcion que puede usar el usario para ver los items aplicados, los muestra por pantalla
        for (String n: items_aplicados){
            System.out.println(n);
        }
    }
}   
