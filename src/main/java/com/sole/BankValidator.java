package com.sole;
public class BankValidator {

    public static void validateAccountInformation(String cbu, double saldoInicial){
        if (cbu == null || cbu.isBlank()) {
            throw new InvalidAccount("El CBU no puede estar vacío");
        }
        if (cbu.length() != 22) {
            throw new InvalidAccount("El CBU debe tener exactamente 22 dígitos");
        }
        if (saldoInicial < 0.0) {
            throw new InvalidAccount("No se puede abrir una cuenta con saldo negativo");
        }
    }

}
