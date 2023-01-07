public class Item {
    private Integer precio;
    private Integer recuperar_hp;
    private Integer aumentar_hp_total;
    private Integer aumentar_danio;
    private Integer aumentar_defensa;
    
    public Item(){   //Cree los items con atributos randoms dentro de un rango que haga posible el juego, y un precio fijo 
        precio=50;
        recuperar_hp= (int)Math.floor(Math.random()*(20)+1);
        aumentar_hp_total=(int)Math.floor(Math.random()*(10)+1);;
        aumentar_danio=(int)Math.floor(Math.random()*(10)+1);
        aumentar_defensa=(int)Math.floor(Math.random()*(10)+1);
    }
    public void aplicar(Jugador jugador, String mejora){   //Funcion aplicar cuando se encuentra en la tiendra, recibe como parametro al jugador,y la mejora que se aplicará
        if(mejora==null){                                     
            System.out.println("Siga con su travesia");    //Aumenta los atributos segun la mejora
        }
        else{
        jugador.setDinero(jugador.getDinero()-precio);
        if (mejora=="pocion curativa"){
        jugador.setHp_actual(jugador.getHp_actual()+recuperar_hp);
        if (jugador.getHp_actual()>jugador.hp_total){
            jugador.hp_actual=jugador.hp_total;
        }
        }
        if(mejora=="pocion que aumenta salud maxima"){
        jugador.setHp_total(jugador.getHp_total()+aumentar_hp_total);
        }
        if(mejora=="mejora de arma"){
        jugador.setDanio(jugador.getDanio()+aumentar_danio);
        }
        if(mejora=="mejora de armadura"){
        jugador.setDefensa(jugador.getDefensa()+aumentar_defensa);
        }
        jugador.setItems_aplicados(mejora);
        }
    }
    public void aplicar_evento(Jugador jugador, String mejora){ //Misma funcion de arriba pero sin el cobro, ya que estas son mejoras obtenidas en los nodoEventos 
        if(mejora==null){
            System.out.println("Siga con su travesia");
        }
        else{
        if (mejora=="pocion curativa"){
        jugador.setHp_actual(jugador.getHp_actual()+recuperar_hp);
        if (jugador.getHp_actual()>jugador.hp_total){
            jugador.hp_actual=jugador.hp_total;
        }
        }
        if(mejora=="pocion que aumenta salud maxima"){
        jugador.setHp_total(jugador.getHp_total()+aumentar_hp_total);
        }
        if(mejora=="mejora de arma"){
        jugador.setDanio(jugador.getDanio()+aumentar_danio);
        }
        if(mejora=="mejora de armadura"){
        jugador.setDefensa(jugador.getDefensa()+aumentar_defensa);
        }
        jugador.setItems_aplicados(mejora);
        }
    }
    //Getter y Setters que ocupé para aplicar las mejoras
    public Integer getRecuperar_hp() {
        return recuperar_hp;
    }
    public void setRecuperar_hp(Integer recuperar_hp) {
        this.recuperar_hp = recuperar_hp;
    }
    public Integer getAumentar_hp_total() {
        return aumentar_hp_total;
    }
    public void setAumentar_hp_total(Integer aumentar_hp_total) {
        this.aumentar_hp_total = aumentar_hp_total;
    }
    public Integer getAumentar_danio() {
        return aumentar_danio;
    }
    public void setAumentar_danio(Integer aumentar_danio) {
        this.aumentar_danio = aumentar_danio;
    }
    public Integer getAumentar_defensa() {
        return aumentar_defensa;
    }
    public void setAumentar_defensa(Integer aumentar_defensa) {
        this.aumentar_defensa = aumentar_defensa;
    }
}
