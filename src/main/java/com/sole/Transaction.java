package com.sole;

/**
 * Representa una transacción financiera.
 *
 * @param commerce El nombre del comercio donde se realizó la transacción.
 * @param ammount El monto de la transacción.
 * @param category La categoría de la transacción.
 *
 * Ejemplo de uso:
 * <pre>
 *     Transaccion transaccion = new Transaccion("Netflix", 15.99, "Entretenimiento");
 *     System.out.println(transaccion.comercio()); // Imprime: Netflix
 *     System.out.println(transaccion.monto()); // Imprime: 15.99
 *     System.out.println(transaccion.categoria()); // Imprime: Entretenimiento
 * </pre>
 */
public record Transaction(String commerce, double amount, String category) {}   