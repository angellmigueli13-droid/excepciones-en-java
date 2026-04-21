public class MainSensor {
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR DE LECTURA DE SENSORES IoT ===\n");

        Sensor sensor = new Sensor("TEMP-001");
        int lecturas = 8;
        int exitos = 0;
        int fallos = 0;

        for (int i = 1; i <= lecturas; i++) {
            System.out.println("--- Intento #" + i + " ---");
            try {
                double dato = sensor.leerDato();
                exitos++;
            } catch (ErrorLecturaException e) {
                System.out.println("❌ ErrorLecturaException: " + e.getMessage());
                fallos++;
            }
            System.out.println();
        }

        System.out.println("=== RESUMEN ===");
        System.out.println("Total lecturas : " + lecturas);
        System.out.println("Exitosas       : " + exitos);
        System.out.println("Fallidas       : " + fallos);
    }
}
