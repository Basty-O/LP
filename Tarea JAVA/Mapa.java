import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private Integer profundidad;
    private NodoInicial nodo_inical; 
    private Nodo nodo_actual;
    protected List<Integer> nodos_posibles =new ArrayList<Integer>();
    private Integer Inicio;
    protected int Actual;
    protected int aux;
    
    //Getter y Setters de Actual
    public Integer getActual() {
        return Actual;
    }

    public void setActual(Integer actual) {
        Actual = actual;
    }
    //Constructor
    public Mapa(){
        Inicio=0;
        Actual=0;
    }
    //Consideré una profundidad random en un rango de numeros
    public Integer Profundidad(){
        profundidad =(int)Math.floor(Math.random()*(5)+4);
        return profundidad;
    }
    //Funcion que retorna una lista con los nodos posibles, esta funcion recibe como parámetros la lista que obtenemos a partir del Main que nos otorgaron y que modifiqué(contiene los nodos),
    //y tambien recibe como parámetro una posicion actual
    public List<Integer> caminos_posibles(List<Integer> todos_los_caminos,Integer Actual){
        nodos_posibles.clear();
        for(int i=0;i<todos_los_caminos.size();i+=2){
            if (todos_los_caminos.get(i)==Actual){
                nodos_posibles.add(todos_los_caminos.get(i+1));
            }
        }
        return nodos_posibles;
    }
    //Funcion que recibe como parámetro la lista con todos los nodos posibles,  muestra el mapa por pantalla de una manera facil de entender
    public void verMapa(List<Integer> todos_los_caminos){
        for(int i=0;i<todos_los_caminos.size();i+=2){
            System.out.println("("+todos_los_caminos.get(i)+")"+"--->"+"("+todos_los_caminos.get(i+1)+")");
        }
    }
    public NodoInicial getNodo_inical() {
        return nodo_inical;
    }
    public Nodo getNodo_actual() {
        return nodo_actual;
    }
    //Recibe como parámetro una lista con los nodos posibles, y muestra por pantalla los nodos a los cuales puede desde la posicion actual
    void motrar_avance_posible(List<Integer> nodosPosibles){
        for(int i=1; i< nodosPosibles.size()+1;i++){
            System.out.println("Opcion "+i+" ir a nodo: "+nodosPosibles.get(i-1));
        }
    }
    //Recibe como parametro la lista con los nodos posibles y una variable de tipo int, actualiza la posicion actual segun la eleccion del usuario hacia que nodo ir
    void avanzar(List<Integer> nodosPosibles,int x){
        Actual=nodosPosibles.get(x-1);
    }
    public Integer getInicio() {
        return Inicio;
    }
}
