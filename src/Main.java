// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Thanos
        myHero thanos = new myHero(100,100,"Thanos", "Control del tiempo", 200, "Morado", true, 1.00);

        // Acceder a los atributos y métodos de Thanos
        System.out.println("Nombre: " + thanos.getNombre());
        System.out.println("Edad: " + thanos.getEdad());
        System.out.println("Color: " + thanos.getColor());
        System.out.println("¿Es villano? " + thanos.isEsVillano());
        System.out.println("Fuerza: " + thanos.getFuerza());
        System.out.println("Vida restante: " + thanos.getEnergia());
        // Usar su superpoder
        thanos.usarSuperpoder();

        // Envejecer y aumentar la fuerza
        thanos.setFuerza(5.000);

    }
}