
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaQuest {
    public static void main(String[] args){
    //------------------------------------------------------------------------------------------
    //Introduccion del juego donde se pide el nombre del personaje, se inicializa el mapa y empieza el ciclo de las acciones que el usuario puede hacer en todo momento
        Scanner entrada= new Scanner(System.in);
        System.out.println("Bienvenido a este grandioso juego llamado JavaQuest");
        System.out.println("Ingrese nombre de su personaje: ");
        String nombre_personajeString= entrada.nextLine();
        Jugador principal = new Jugador(nombre_personajeString);
        NodoInicial intro=new NodoInicial();
        intro.gran_introduccion();
        Main mapa=new Main();
        Mapa map =new Mapa();
        Item Item_1=new Item(); 
        mapa.main(map.Profundidad());
        int flag=0;
        int opcion_elegida;
        while(flag==0){
            System.out.println("Tienes 3 alternativas:\n1- Ver mapa \n2- Ver tus estadisticas \n3- Ver tus items\n4- Avanzar");
            opcion_elegida=entrada.nextInt();
            switch(opcion_elegida){
                case 1:map.verMapa(mapa.getNodo_mapas());
                break;
                case 2:principal.verEstado();
                break;
                case 3:principal.verItems();
                break;
    //------------------------------------------------------------------------------------------------
    //Al momento de elegir avanzar pueden haber 3 tipos de nodos, y casa tipo de nodo hace su accion especifica
                case 4:map.caminos_posibles(mapa.getNodo_mapas(),map.getActual());   
                    map.motrar_avance_posible(map.nodos_posibles);
                    System.out.println("Ingrese opcion del camino al cual quiere ir: ");
                    int aux= entrada.nextInt();
                    map.avanzar(map.nodos_posibles,aux);
                    map.caminos_posibles(mapa.getNodo_mapas(),map.getActual());
                    map.motrar_avance_posible(map.nodos_posibles);
    //------------------------------------------------------------------------------------------------------
    //Momento que se llega al nodo final, por lo tanto la pelea será contra el boss final
                    if(map.getActual()==mapa.getNodo_mapas().get(mapa.getNodo_mapas().size()-1)){
                        System.out.println("Listo para la pelea contra el boss final?");
                        int jefe=0;
                        Personaje enemigo=new Personaje(jefe);
                        principal.combate_Final(enemigo);
                    }
    //----------------------------------------------------------------------------------------------------
    //Caso que no sea el combate final, por ende pueden ser los otros tipos de nodos.(pelea normal, tienda o evento)
                    else{
                        List<Integer>nodos_posibles= new ArrayList<Integer>();
                //A continuacion cree una lista con la cantidad de porcentaje que cada evento podia salir, 
                //para elegir un numero random lo que provocará elegir un tipo de nodo al azar pero respetando su porcentaje de salir
                        nodos_posibles.add(1);
                        nodos_posibles.add(2);
                        nodos_posibles.add(2);
                        nodos_posibles.add(2);
                        nodos_posibles.add(3);
                        nodos_posibles.add(3);
                        nodos_posibles.add(3);
                        nodos_posibles.add(3);
                        nodos_posibles.add(3);
                        nodos_posibles.add(3);
                        int elegir =(int)Math.floor(Math.random()*(10));
                        System.out.println(nodos_posibles.get(elegir));
            //-------------------------------------------------------------------------------------
            //Caso que salga nodo de tienda
                        if (nodos_posibles.get(elegir)==1){
                            System.out.print("Este es un nodo Tienda");
                            NodoTienda NodoTienda_1=new NodoTienda();
                            do{
                            NodoTienda_1.interactuar(principal);
                            Item_1.aplicar(principal,NodoTienda_1.getItem_comprado());
                            principal.verEstado();
                            }while(principal.getDinero()>=50 && NodoTienda_1.getItem_comprado()!=null); 
                        }
            //-----------------------------------------------------------------------------------------
            //Caso que salga nodo de evento, en el cual hay 5 posibles eventos
                        if(nodos_posibles.get(elegir)==2){
                            System.out.println("Este es un nodo Evento");
                            NodoEvento evento=new NodoEvento();
                            int evento_random=(int)Math.floor(Math.random()*(5)+1);
                            evento.descripcion_historia(evento_random);
                            int alternativa;
                            switch (evento.alternativa_elegida(evento_random)){
                            case 1:
                                System.out.println("Ingrese la alternativa elegida: ");
                                alternativa=entrada.nextInt();
                                if (alternativa==1){
                                    System.out.println("Si ganas el mago te premiará con un aumento en tu hp total");
                                    int cara_o_sello=(int)Math.floor(Math.random()*(2)+1);
                                    if (cara_o_sello==2){
                                        System.out.println("Felicidades te arriesgaste y ganaste");
                                        Item_1.aplicar_evento(principal,"pocion que aumenta salud maxima");
                                    }
                                    else{
                                        System.out.println("Que pena, la suerte no estuvo de tu lado");
                                    }
                                }
                                else{
                                System.out.println("Solo aquellos que arriegan ir demasiado lejos pueden encontrar lo lejos que pueden llegar");
                                }
                                alternativa=0;
                            break;
                            case 2:
                                System.out.println("Ingrese la alternativa elegida: ");
                                alternativa=entrada.nextInt();
                                if (alternativa==1){
                                    System.out.println("Acabaste con este ser, nunca sabras si era bueno o malo");
                                }
                                else{
                                    System.out.println("El ser te agradece, y te otorga una armadura que aumentara tu defensa");
                                    Item_1.aplicar_evento(principal, "mejora de armadura");
                                }
                                alternativa=0;
                            break;
                            case 3:
                                System.out.println("Ingrese la alternativa elegida: ");
                                alternativa=entrada.nextInt();
                                if (alternativa==1){
                                    System.out.println("La espada se encontraba en mucho mejor estado que tu actual espada lo que provocó un aumento en tu daño");
                                    Item_1.aplicar_evento(principal, "mejora de arma");
                                }
                                else{
                                    System.out.println("Quien sabe si la espada era una trampa");
                                }
                                alternativa=0;
                            break;
                            case 4:
                                System.out.println("Ingrese la alternativa elegida: ");
                                alternativa=entrada.nextInt();
                                if(alternativa==1){
                                    System.out.println("El camino peligroso permitio mejorar tus capacidades fisica, lo que aumenta tu capacidad para pelear");
                                    Item_1.aplicar_evento(principal, "mejora de arma");
                                }
                                alternativa=0;
                            break;
                            case 5:
                                System.out.println("Ingrese la alternativa elegida: ");
                                alternativa=entrada.nextInt();
                                if(alternativa==1){
                                    System.out.println("Esta persona te agradece tu ayuda y te obsequia una pocion que aumentara tu vida total");
                                    Item_1.aplicar_evento(principal, "pocion que aumenta salud maxima");
                                }
                                else{
                                    System.out.println("Nunca sabremos si tenia buenas intenciones o era una trampa");
                                }
                                   alternativa=0;
                            }

                        }
    //--------------------------------------------------------------------------------
                //Caso en que salga nodo combate y contra un enemigo comun 
                        if (nodos_posibles.get(elegir)==3){
                            System.out.println("Este es un nodo combate");
                            Personaje enemigo=new Personaje();
                            principal.combate(enemigo);
                        }
                    }
            }
        }
        entrada.close();
    }
}
