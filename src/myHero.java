public class myHero extends  Hero{
    private String nombre;
    private String superpoder;
    private int edad;
    private String color;
    private boolean esVillano;
    private double fuerza;

    public myHero(int energia, int vida, String nombre, String superpoder, int edad, String color, boolean esVillano, double fuerza) {
        super(energia, vida);
        this.nombre = nombre;
        this.superpoder = superpoder;
        this.edad = edad;
        this.color = color;
        this.esVillano = esVillano;
        this.fuerza = fuerza;
    }

    public void usarSuperpoder() {
        System.out.println(this.nombre + " está usando sus gemas : " + this.superpoder);
        moverse();
    }

    public  String getenvejeser() {
        return getenvejeser();
    }

    public void bajarEnergia(){
        setEnergia(getEnergia() - 1);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsVillano() {
        return esVillano;
    }

    public void setEsVillano(boolean esVillano) {
        this.esVillano = esVillano;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }
}
