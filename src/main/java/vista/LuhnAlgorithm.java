/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Lenovo 2024
 */
public class LuhnAlgorithm {

    // Método para verificar si una tarjeta es válida usando el algoritmo de Luhn
    public static boolean isValidCard(String cardNumber) {
        // Eliminar cualquier espacio en blanco o guiones del número de tarjeta
        cardNumber = cardNumber.replaceAll("\\s+", "").replaceAll("-", "");
        
        // Verificar si el número contiene solo dígitos
        if (!cardNumber.matches("\\d+")) {
            return false;
        }

        // Inicializar variables para el cálculo del algoritmo de Luhn
        int sum = 0;
        boolean alternate = false;

        // Recorrer los dígitos de derecha a izquierda
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }

        // La tarjeta es válida si la suma es múltiplo de 10
        return (sum % 10 == 0);
    }

    public static void main(String[] args) {
        // Ejemplos de uso del algoritmo de Luhn
        String[] cardNumbers = {
            "4381 0850 1026 9738", // Ejemplo de tarjeta inválida
            "5246 0730 8026 3163", // Ejemplo de tarjeta válida (Visa)
            "4931 7604 8032 4255",
            "4381 0864 3672 7853"// Ejemplo de tarjeta válida (MasterCard)
        };

        for (String cardNumber : cardNumbers) {
            if (isValidCard(cardNumber)) {
                System.out.println("La tarjeta " + cardNumber + " es válida.");
            } else {
                System.out.println("La tarjeta " + cardNumber + " no es válida.");
            }
        }
    }
}

