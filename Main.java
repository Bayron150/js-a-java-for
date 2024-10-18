import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadPersonas = 2;


        procesarPersonas(scanner, cantidadPersonas);
        scanner.close();
    }

    private static void procesarPersonas(Scanner scanner, int cantidadPersonas) {
        int contadorPersonas = 0;
        int acumuladorEdad = 0;
        int acumuladorEstatura = 0;

        for (int numeropersona = 1; numeropersona <= cantidadPersonas; numeropersona++) {
            Persona persona = obtenerDatosPersona(scanner, numeropersona);
            if (cumpleCondiciones(persona)) {
                contadorPersonas++;
                acumuladorEdad += persona.edad;
                acumuladorEstatura += persona.estatura;
            }
        }

        mostrarResultados(contadorPersonas, acumuladorEdad, acumuladorEstatura, cantidadPersonas);
    }

    private static Persona obtenerDatosPersona(Scanner scanner, int numeropersona) {
        System.out.print("Ingrese la edad de la persona " + numeropersona + ": ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el estado civil de la persona " + numeropersona + " (1. Soltero  2. Casado): ");
        int estadoCivil = scanner.nextInt();

        System.out.print("Ingrese la estatura de la persona " + numeropersona + " en cms: ");
        int estatura = scanner.nextInt();

        System.out.print("Ingrese el sexo de la persona " + numeropersona + " (1. Hombre   2. Mujer): ");
        int sexo = scanner.nextInt();

        return new Persona(edad, estadoCivil, estatura, sexo);
    }

    private static boolean cumpleCondiciones(Persona persona) {
        return (persona.edad >= 18) && (persona.estadoCivil == 1) && (persona.estatura > 170) && (persona.sexo == 1);
    }

    private static void mostrarResultados(int contadorPersonas, int acumuladorEdad, int acumuladorEstatura, int cantidadPersonas) {
        if (contadorPersonas > 0) {
            double promedioEdad = (double) acumuladorEdad / contadorPersonas;
            double promedioEstatura = (double) acumuladorEstatura / contadorPersonas;
            double porcentajePersonas = (double) contadorPersonas / cantidadPersonas * 100;

            System.out.println("El promedio de edad de las personas que cumplen es " + promedioEdad + " años");
            System.out.println("El promedio de estatura de las personas que cumplen es " + promedioEstatura + " centímetros");
            System.out.println("El porcentaje de las personas que cumplen con la condición es del " + porcentajePersonas + " %");
        } else {
            System.out.println("Ninguna persona cumple con las condiciones.");
        }
    }
}
class Persona {
    int edad;
    int estadoCivil;
    int estatura;
    int sexo;

    /**
     * @param edad
     * @param estadoCivil
     * @param estatura
     * @param sexo
     */
    Persona(int edad, int estadoCivil, int estatura, int sexo) {
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.estatura = estatura;
        this.sexo = sexo;
     }
}