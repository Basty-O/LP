public class Personaje {
    protected String nombre;
    protected Integer dinero;
    protected Integer hp_actual;
    protected Integer hp_total;
    protected Integer danio;
    protected Integer defensa;
    //Use sobrecarga para crear el personaje, un enemigo y el jefe final
    //Constructor donde se le pide el nombre del personaje al usuario 
    public Personaje(String nombre){
        this.nombre=nombre;
        dinero=500;
        hp_actual=20;
        hp_total=20;
        danio=5;
        defensa=1;
    }
    //Constructor de un enemigo al momento de caer en un nodo de combate, el cual tendrá atributos randoms dentro de un rango
    public Personaje(){
        hp_actual=(int)Math.floor(Math.random()*(7)+4);
        danio=(int)Math.floor(Math.random()*(5)+1);
        defensa=(int)Math.floor(Math.random()*(2));
    }
    //Constructor del jefe final con atributos randoms pero dentro de un rango mas alto
    public Personaje(int a){
        hp_actual=(int)Math.floor(Math.random()*(16)+15);
        danio=(int)Math.floor(Math.random()*(11)+10);
        defensa=(int)Math.floor(Math.random()*(11)+5);
    }
    //Setter y Getters de los atributos
    public Integer getDinero() {
        return dinero;
    }
    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }
    public Integer getHp_actual() {
        return hp_actual;
    }
    public void setHp_actual(Integer hp_actual) {
        this.hp_actual = hp_actual;
    }
    public Integer getHp_total() {
        return hp_total;
    }
    public void setHp_total(Integer hp_total) {
        this.hp_total = hp_total;
    }
    public Integer getDanio() {
        return danio;
    }
    public void setDanio(Integer danio) {
        this.danio = danio;
    }
    public Integer getDefensa() {
        return defensa;
    }
    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }
    //Muestra la informacion del personaje
    public void MostrarInfo(){
        System.out.println("El nombre del personaje es: "+nombre);
        System.out.println("Vida actual: "+hp_actual);
        System.out.println("Vida total: "+hp_total);
        System.out.println("Dinero: "+dinero);
        System.out.println("danio:  "+danio);
        System.out.println("Defensa: "+defensa);
    }
    //funcion de combate pero contra un enemigo comun
    public void combate(Personaje enemigo){
        while (hp_actual>=0 && enemigo.hp_actual>=0){
            enemigo.hp_actual=enemigo.hp_actual-(danio-enemigo.defensa);
            if (hp_actual<=0){
                break;
            }
            if (enemigo.hp_actual<=0){
                break;
            }
            hp_actual=hp_actual-(enemigo.danio-defensa);
            if (hp_actual<=0){
                break;
            }
            if (enemigo.hp_actual<=0){
                break;
            }
        }
        if (hp_actual<=0){
            System.out.println("Perdiste suerte en la proxima");
            System.exit(0);
        }
        if(enemigo.hp_actual<=0){
            System.out.println("Lograste eleminar a tu enemigo, Felicitaciones!");
        }
    }
    //funcion de combate pero contra el jefe final
    public void combate_Final(Personaje enemigo){
        while (hp_actual>=0 && enemigo.hp_actual>=0){
            enemigo.hp_actual=enemigo.hp_actual-(danio-enemigo.defensa);
            if (hp_actual<=0){
                break;
            }
            if (enemigo.hp_actual<=0){
                break;
            }
            hp_actual=hp_actual-(enemigo.danio-defensa);
            if (hp_actual<=0){
                break;
            }
            if (enemigo.hp_actual<=0){
                break;
            }
        }
        if (hp_actual<=0){
            System.out.println("No pudiste con el boss final,suerte para la proxima");
            System.exit(0);
        }
        if(enemigo.hp_actual<=0){
            System.out.println("Lograste eleminar al boss final, Felicitaciones!!!!!");
            System.exit(0);
        }
    }
}

