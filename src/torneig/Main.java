package torneig;

import java.util.Scanner;

public class Main {
	/**
	 * @Author -- Diego Mejías Peña & Derek Murillo Fernandez
	 * @Version -- 1.0
	 */
    static Scanner scanner = new Scanner(System.in);
    
    static Jugador jugador1 = null;
    static Jugador jugador2 = null;
    static Torneig torneo = null;

    public static void main(String[] args) {
        int opcion = 0;

        do {
            mostrarMenu();
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    crearJugadores();
                    break;
                case 2:
                    crearTorneo();
                    break;
                case 3:
                    jugarPartit();
                    break;
                case 4:
                    mostrarInformacion();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no reconocida.");
            }
            System.out.println("\n------------------------------------------------\n");
            
        } while (opcion != 5);
        
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("=== GESTIÓN DE TORNEO ===");
        System.out.println("1. Crear Jugadores");
        System.out.println("2. Crear Torneo");
        System.out.println("3. Jugar Partido y Registrar Resultado");
        System.out.println("4. Ver Información Completa");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static void crearJugadores() {
        System.out.println("\n--- CREANDO JUGADOR 1 ---");
        jugador1 = crearJugador();
        
        System.out.println("\n--- CREANDO JUGADOR 2 ---");
        jugador2 = crearJugador();
        
        System.out.println("¡Jugadores creados correctamente!");
    }

    private static void crearTorneo() {
        System.out.println("\n--- CREANDO TORNEO ---");
        System.out.println("Introduce la fecha del torneo:");
        Data fechaTorneo = pedirFecha();
        
        torneo = new Torneig(fechaTorneo);
        System.out.println("Torneo creado para la fecha: " + torneo.getData());
    }

    private static void jugarPartit() {
        if (jugador1 == null || jugador2 == null) {
            System.out.println("Error: Debes crear los jugadores primero (Opción 1).");
            return;
        }
        if (torneo == null) {
            System.out.println("Error: Debes crear el torneo primero (Opción 2).");
            return;
        }

        System.out.println("\n--- JUGANDO PARTIDO ---");
        System.out.println("Introduce la puntuación para " + jugador1.getNom_complet() + ": ");
        int puntos1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduce la puntuación para " + jugador2.getNom_complet() + ": ");
        int puntos2 = Integer.parseInt(scanner.nextLine());

        Marcador marcador = new Marcador(puntos1, puntos2);

        Jugador ganadorPartit = null;
        if (puntos1 > puntos2) {
            ganadorPartit = jugador1;
        } else if (puntos2 > puntos1) {
            ganadorPartit = jugador2;
        } else {
            System.out.println("Ha sido un empate (la lógica de torneo requiere un ganador, se asigna J1 por defecto).");
            ganadorPartit = jugador1;
        }

        Partit partido = new Partit(jugador1, jugador2, ganadorPartit, marcador);

        torneo.setPartitsJugats(partido); 
        torneo.setGuanyador(ganadorPartit);

        System.out.println("Partido registrado. Ganador: " + ganadorPartit.getNom_complet());
    }

    private static void mostrarInformacion() {
        if (torneo == null) {
            System.out.println("Aún no hay datos del torneo.");
            return;
        }

        System.out.println("\n=== RESUMEN DEL TORNEO ===");
        System.out.println(torneo.toString()); 

        if (torneo.getPartitsJugats() != null) {
            Partit p = torneo.getPartitsJugats();
            System.out.println("Partido disputado:");
            System.out.println("   - Jugador 1: " + p.getParticipant1().getNom_complet() + 
                               " (Licencia: " + p.getParticipant1().getNumeroLlicencia() + ")");
            System.out.println("   - Jugador 2: " + p.getParticipant2().getNom_complet() + 
                               " (Licencia: " + p.getParticipant2().getNumeroLlicencia() + ")");
            
            System.out.println("   - Marcador: " + p.getPuntuacions().getJugador1() + " - " + p.getPuntuacions().getJugador2());
            
            System.out.println("   - Ganador del Partido: " + p.getGuanyador().getNom_complet());
        }

        if (torneo.getGuanyador() != null) {
            System.out.println("\nCAMPEÓN DEL TORNEO: " + torneo.getGuanyador().getNom_complet());
            System.out.println("NIF del Campeón: " + torneo.getGuanyador().getNif().toString());
        } else {
            System.out.println("\nEl torneo aún no tiene un ganador registrado.");
        }
    }

    // --- MÉTODOS AUXILIARES ---

    private static Jugador crearJugador() {
        System.out.print("Nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.println("Fecha de nacimiento:");
        Data fechaNac = pedirFecha();

        System.out.println("Datos del NIF:");
        System.out.print("  Número DNI (sin letra): ");
        int dni = Integer.parseInt(scanner.nextLine());
        System.out.print("  Letra: ");
        char letra = scanner.nextLine().charAt(0);
        Nif nif = new Nif(dni, letra);

        System.out.print("Número de Licencia: ");
        int licencia = Integer.parseInt(scanner.nextLine());

        return new Jugador(nombre, fechaNac, nif, licencia);
    }

    private static Data pedirFecha() {
        System.out.print("  Día: ");
        int dia = Integer.parseInt(scanner.nextLine());
        System.out.print("  Mes: ");
        int mes = Integer.parseInt(scanner.nextLine());
        System.out.print("  Año: ");
        int any = Integer.parseInt(scanner.nextLine());
        
        return new Data(dia, mes, any);
    }
}