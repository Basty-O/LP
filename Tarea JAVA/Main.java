import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class Main {
    private static List<Integer> nodo_mapas= new ArrayList<Integer>();
    public  void main(int x) {
        SortedSet<Edge> edges = GraphGenerator.Generar(x);
        for (Edge e : edges) {
            //System.out.printf("(%d) -> (%d)\n", e.x, e.y);
            nodo_mapas.add(e.x);
            nodo_mapas.add(e.y);
        //Modifiqué muy poco el codigo dado, mas bien le agregue un detalle, cree una lista de tipo Integer 
        //con el fin de tener la informacion de los nodos y los caminos posibles
        }
    }
    //Getters y Setters de nodos_mapas
    public  List<Integer> getNodo_mapas() { 
        return nodo_mapas;                  
    }
    public static void setNodo_mapas(List<Integer> nodo_mapas) {
        Main.nodo_mapas = nodo_mapas;
    }
    public void mostrar_nodos(){                    
        for(int z=0;z<nodo_mapas.size();z++){
            System.out.println(nodo_mapas.get(z));
        }
    }
    

}