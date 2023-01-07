import java.util.ArrayList;
import java.util.List;

public abstract class Nodo {
    private List<Integer> siguientes_nodos=new ArrayList<Integer>();    
    public abstract void agregarNodo();
    
    public void getSiguientes_nodos(List<Integer> siguientes_nodo){
        siguientes_nodos=siguientes_nodo;
    }
    //Muestra por pantalla los siguientes nodos
    public void mostrar_siguientes_nodos(){
        System.out.println(siguientes_nodos);
    }
}
