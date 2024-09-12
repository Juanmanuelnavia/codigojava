public class Main {
    public static void main(String[] args) {
        int num1 = 840; 
        int num2 = 210; 

        if (esMultiplo(num1, num2)) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else if (esMultiplo(num2, num1)) {
            System.out.println(num2 + " es múltiplo de " + num1);
        } else {
            System.out.println("Ninguno es múltiplo del otro");
        }
    }

    public static boolean esMultiplo(int mayor, int menor) {
        return mayor % menor == 0;
    }
}