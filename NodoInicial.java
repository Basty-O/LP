import java.util.List;

public class NodoInicial extends Nodo {
    private String introduccion;
    //Introduccion del juego
    public void gran_introduccion(){
        introduccion="\nLas instrucciones son simples :\nPrimera instruccion diviertete\nSegunda instruccion disfruta\nEl juego es sencillo, consiste en una gran aventura en la cual tendras que elegir que camino tomar, pero CUIDADO, no sabes lo que cada camino puede contener, al final del sendero te enfrentaras contra el desafiante boss final\nEstas listo?\nBuena suerte y disfruta";
        System.out.println(introduccion);
    }
    @Override
    public void agregarNodo() {    
    }
    @Override
    public void getSiguientes_nodos(List<Integer> siguientes_nodos) {       
    }
}
