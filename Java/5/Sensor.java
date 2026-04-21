import java.util.Random;

public class Sensor {
    private String id;
    private Random random = new Random();

    public Sensor(String id) {
        this.id = id;
    }

    /**
     * Simula la lectura de un sensor.
     * 20% de probabilidad de fallo (valores 0-19 en rango 0-99).
     * @return valor de temperatura simulado
     * @throws ErrorLecturaException si el sensor falla
     */
    public double leerDato() throws ErrorLecturaException {
        int tirada = random.nextInt(100); // 0 a 99

        try {
            if (tirada < 20) {
                // Simula fallo de hardware
                throw new ErrorLecturaException(tirada);
            }
            // Lectura exitosa: temperatura entre 15°C y 40°C
            double temperatura = 15.0 + (random.nextDouble() * 25.0);
            System.out.printf("📡 [Sensor %s] Lectura exitosa: %.2f°C%n", id, temperatura);
            return temperatura;

        } finally {
            // Siempre se ejecuta, haya error o no
            System.out.println("🔌 Cerrando conexión con sensor " + id + "...");
        }
    }

    public String getId() { return id; }
}
