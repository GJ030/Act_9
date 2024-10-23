import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Persona a = new Persona();
        Scanner t = new Scanner(System.in);
        int edad,peso;
        String nombre,genero;
        double altura;

        System.out.print("Ingrese su edad años:");
        edad= t.nextInt();
        a.setEdad(edad);
        System.out.print("Ingrese su peso en kilos sin gramos:");
        peso= t.nextInt();
        a.setPeso(peso);
        System.out.print("Ingrese su Altura en metros:");
        altura= t.nextDouble();
        a.setAltura(altura);
        t.nextLine();
        System.out.print("Ingrese su nombre por favor:");
        nombre= t.nextLine();
        a.setNombre(nombre);
        System.out.print("Ingrese su genero M/F:");
        genero=t.nextLine();
        a.setGenero(genero);

        System.out.println(a.getNombre()+ " usted tine:"+ a.getEdad()+ " años");
        System.out.println("Es del genero "+ a.getGenero());
        System.out.println("Y su resultado de IMC es el de: " + a.IMC());

    }
}