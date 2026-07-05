package com.sole;
/**
 * Representa una cuenta bancaria simple.
 *
 * @param number El número de la cuenta.
 * @param name El nombre asociado a la cuenta.
 *
 * Ejemplo de uso:
 * <pre>
 *     Cuenta cuenta = new Cuenta("1234567890", "Mi Cuenta");
 *     System.out.println(cuenta.numero()); // Imprime: 1234567890
 *     System.out.println(cuenta.nombre()); // Imprime: Mi Cuenta
 * </pre>
 */

public record Account(String number, String name) {}