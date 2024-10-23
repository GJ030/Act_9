public class Persona {

    private int Edad, Peso;
    private String Nombre, Genero;
    private Double Altura;

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String IMC() {
        double imc = Peso / (Altura * Altura);
        if (imc < 18.5) {
            return "BAJO PESO";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "PESO NORMAL";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "SOBREPESO";
        } else if (imc >= 30.0 && imc <= 34.9) {
            return "OBESIDAD TIPO 1";
        } else if (imc >= 35.0 && imc <= 39.9) {
            return "OBESIDAD TIPO 2";
        } else {
            return "OBESIDAD TIPO 3";
        }
    }
}


