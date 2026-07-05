package com.sole;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // // Aquí puedes llamar a obtenerPares si lo necesitas
        // var miCuenta = new Cuenta("1234567890", "Mi Cuenta");
        // System.out.println(miCuenta);

        // List<Transaccion> transacciones = List.of(
        //     new Transaccion("Netflix", 15.99, "Entretenimiento"),
        //     new Transaccion("Starbucks", 5.50, "Comida"),
        //     new Transaccion("Amazon", 120.00, "Compras"),
        //     new Transaccion("Spotify", 9.99, "Entretenimiento")
        // );

        // // Usar Streams para filtrar solo las de "Entretenimiento" y mostrar el nombre del comercio en la consola.
        // transacciones.stream()
        //     .filter(t -> "Entretenimiento".equals(t.categoria()))
        //     .map(Transaccion::comercio)
        //     .forEach(System.out::println);
    

    
        // //Ejeercicio Interfaces
        // //El usuario prefiere SMS
        // Notificador notificador = new SMSNotificador();

        // notificador.notificar("Tu gasto de Netflix fue aprobado");

        // notificador = new EmailNotificador();
        // notificador.notificar("Bienvendio al Banco");

        //Ejercicio Set: "avisar por todos los canales posibles"
        //Creo un Set para evitar las duplicaciones por error
        Set<Notifier> availableChannels = Set.of(new SMSNotifier(), new EmailNotifier());

        String alertMessage = "Se detectó un inicio de sesión sospechoso en su cuenta";

        availableChannels.forEach(c -> c.notify(alertMessage));

        //Ejercicio Map: "elegir un canal segun el mensaje a enviar"

        Map<MessageType, Notifier> canales = Map.of(MessageType.URGENTE, new SMSNotifier(), MessageType.MARKETING, new EmailNotifier());

        Notifier notificador = canales.get(MessageType.URGENTE);
        notificador.notify(alertMessage);
    }

    public static List<Integer> obtenerPares(List<Integer> numeros) {
        return numeros.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
  
    }

}