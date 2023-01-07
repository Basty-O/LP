import java.util.List;

public class NodoEvento extends Nodo {
    private String descripcion;
    private String alternativa_1; 
    private String alternativa_2;
    private Item resultado_1;
    private Item resultado_2;
    @Override
    public void agregarNodo() {
    }
    @Override
    public void getSiguientes_nodos(List<Integer> siguientes_nodos) {
    }
    //Cree 5 casos que saldran al azar, en cada uno se puede o no obtener una mejora, el parametro que recibe será un numero random entre el 1 y el 5 para que salga un evento al azar
    public int descripcion_historia(int numero){
        switch (numero){
            case 1:
            descripcion="En este nodo habita un mago llamado Cruzalgo, el cual te tiene una propuesta muy interesante y muy simple a la vez, el lanzará una moneda magica al aire, si cae cruz ganará él pero si cae cara ganaras tu.";
            alternativa_1="Arriegarte";
            alternativa_2="No arriesgarte";
            System.out.println(descripcion+"\nTienes 2 alternativas: \n1-"+alternativa_1+"\n2-"+alternativa_2);
            break;
            case 2:
            descripcion="Te encontraste con un ser extraño";
            alternativa_1="Atacarlo";
            alternativa_2="Ignorarlo";
            System.out.println(descripcion+"\nTienes 2 alternativas: \n1-"+alternativa_1+"\n2-"+alternativa_2);
            break;
            case 3:
            descripcion="Misteriosamente hay una espada abandonada en el camino";
            alternativa_1="Tomarla";
            alternativa_2="Ignorarla y seguir adelante";
            System.out.println(descripcion+"\nTienes 2 alternativas: \n1-"+alternativa_1+"\n2-"+alternativa_2);
            break;
            case 4:
            descripcion="Existen 2 caminos, el primero es muy peligroso pero mucho mas rapido, el segundo es mucho mas seguro pero mucho mas lento";
            alternativa_1="Ir por el camino mas rapido";
            alternativa_2="Ir por el camino mas lento";
            System.out.println(descripcion+"\nTienes 2 alternativas: \n1-"+alternativa_1+"\n2-"+alternativa_2);
            break;
            case 5:
            descripcion="Te encuentras a una persona misteriosa, quien te pide ayuda";
            alternativa_1="Ayudar al ser misterioso";
            alternativa_2="Ignorarlo y seguir con tu travesia";
            System.out.println(descripcion+"\nTienes 2 alternativas: \n1-"+alternativa_1+"\n2-"+alternativa_2);
            break;
        }
        return numero;
    }
    //Setters y getters de resultado 1 y 2
    public int alternativa_elegida(int opcion){
        return opcion;
    }
    public Item getResultado_1() {
        return resultado_1;
    }
    public void setResultado_1(Item resultado_1) {
        this.resultado_1 = resultado_1;
    }
    public Item getResultado_2() {
        return resultado_2;
    }
    public void setResultado_2(Item resultado_2) {
        this.resultado_2 = resultado_2;
    }
}
