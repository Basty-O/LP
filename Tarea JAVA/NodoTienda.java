import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NodoTienda extends Nodo {
    private List<String> inventario =new ArrayList<>();
    private String item_comprado;

    //Setter y getter de item_comprado
    public String getItem_comprado() {
        return item_comprado;
    }
    public void setItem_comprado(String item_comprado) {
        this.item_comprado = item_comprado;
    }
    // Se crean entre 5 y 8 items randoms, con atributos randoms
    public NodoTienda(){
        int i=(int)Math.floor(Math.random()*(4)+5);
        for(int a=0;a<i;a++){
            int b=(int)Math.floor(Math.random()*(4)+1);
            switch(b){
                case 1: inventario.add("pocion curativa");
                break;
                case 2: inventario.add("pocion que aumenta salud maxima");
                break;
                case 3: inventario.add("mejora de arma");
                break;
                case 4: inventario.add("mejora de armadura");
                break;
            }
        }
    }
    //Recibe como parametro un jugador, y es el menu de la tienda, donde muestra los items disponible y el dinero actual 
    public String interactuar(Jugador jugador){
        System.out.println("Los Items disponibles son: ");
        int i=1;
        for(String n:inventario){
            System.out.println(i+"- "+n);
            i+=1;
        }
        System.out.println("Ingrese el numero 10 para salir de la tienda");
        System.out.println("Su dinero actuales: "+jugador.dinero);
        if(jugador.dinero>=50){
        System.out.println("Ingrese numero del item que desea comprar: ");

        Scanner salida=new Scanner(System.in);  //Me salia un error si cerraba el scanner , pero al dejarlo así el error no sale
        int posicion_item;
        posicion_item=salida.nextInt();

        if (posicion_item==10){
            item_comprado=null;
            return item_comprado;

        }
        else{
        item_comprado=inventario.get(posicion_item-1);
        System.out.println("El item comprado es: "+item_comprado);
        posicion_item=0;
        }
        }
        else
            System.out.println("No tiene dinero para comprar");

        return item_comprado;
        
    }
    @Override
    public void agregarNodo() {
    }
    @Override
    public void getSiguientes_nodos(List<Integer> siguientes_nodos) {        
    }
}
