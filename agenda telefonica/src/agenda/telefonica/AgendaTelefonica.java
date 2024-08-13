package agenda.telefonica;

import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {
        datos array[] = new datos[15];
        Scanner numeros = new Scanner(System.in);
        Scanner palabras = new Scanner(System.in);

        int op = 0;
        while (op != 5) {
            System.out.println("1. guardar");
            System.out.println("2. buscar individual");
            System.out.println("3. ver todos");
            System.out.println("4. modificar");
            System.out.println("5. salir");
            System.out.println("ingrese la opcion");
            op = numeros.nextInt();
            System.out.println("--------------------------------------");
            if (op == 1) {
                System.out.println("ingrese el numero de telefono");
                int num = numeros.nextInt();
                System.out.println("ingrese el nombre del contacto");
                String nombre = palabras.nextLine();
                System.out.println("ingrese el correo electronico del contacto");
                String correo = palabras.nextLine();
                System.out.println(nuevo(num, nombre, correo, array));
                System.out.println("\n");
            } else if (op == 2) {
                System.out.println("ingrese el numero del contacto que desee buscar");
                int numero = numeros.nextInt();
                System.out.println(bus(numero, array));
                System.out.println("\n");
            } else if (op == 3) {
                System.out.println(todos(array));
                System.out.println("\n");
            } else if (op == 4) {
                System.out.println("ingrese el numero del contacto que desee modificar");
                int numero = numeros.nextInt();
                if (veri(numero, array)) {
                    System.out.println("ingrese el nuevo nombre");
                    String nombre = palabras.nextLine();
                    System.out.println("ingresar el nuevo correo electronico");
                    String correo = palabras.nextLine();
                    System.out.println(modificar(numero, nombre, correo, array));
                    System.out.println("\n");
                }
            } else if (op == 5) {
                System.out.println("gracias por usar el programa");
                break;
            }
        }
    }

    public static String nuevo(int numero, String nombre, String correo, datos array[]) {
        boolean con = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = new datos(numero, nombre, correo);
                con = false;
                break;
            } else if (array[i].getTelefono() == numero) {
                return "el contacto ya existe intentelo de nuevo";

            }
        }
        if (!con) {
            return "guardado";
        } else {
            return "ya no hay espacio";

        }
    }

    public static String bus(int numero, datos array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getTelefono() == numero) {
                return "el nombre es: " + array[i].getNombre() + " || " + "el correo es: " + array[i].getCorreo();
            }
        }
        return "el contacto es inexistente";
    }

    public static String todos(datos array[]) {
        String ver = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                ver = ver + array[i].getTelefono() + "," + array[i].getNombre() + "," + array[i].getCorreo() + "\n";
            }
        }
        return ver;
    }

    public static boolean veri(int numero, datos array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getTelefono() == numero) {
                return true;
            }
        }
        return false;
    }

    public static String modificar(int numero, String nombre, String correo, datos array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getTelefono() == numero) {
                array[i].setNombre(nombre);
                array[i].setCorreo(correo);
                return "LISTO";
            }
        }
        return "";
    }
}
