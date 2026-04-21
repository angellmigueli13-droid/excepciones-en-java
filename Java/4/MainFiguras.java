public class MainFiguras {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE FIGURAS GEOMÉTRICAS ===\n");

        // Intentamos crear un arreglo de figuras; algunas fallarán
        Figura[] figuras = new Figura[4];

        // Figura 0: círculo válido
        try {
            figuras[0] = new Circulo(5.0);
        } catch (DimensionInvalidaException e) {
            System.out.println("❌ " + e.getMessage());
        }

        // Figura 1: círculo con radio negativo (fallará)
        try {
            figuras[1] = new Circulo(-3.0);
        } catch (DimensionInvalidaException e) {
            System.out.println("❌ DimensionInvalidaException: " + e.getMessage());
        }

        // Figura 2: triángulo válido
        try {
            figuras[2] = new Triangulo(6.0, 4.0);
        } catch (DimensionInvalidaException e) {
            System.out.println("❌ " + e.getMessage());
        }

        // Figura 3: triángulo con altura cero (fallará)
        try {
            figuras[3] = new Triangulo(5.0, 0.0);
        } catch (DimensionInvalidaException e) {
            System.out.println("❌ DimensionInvalidaException: " + e.getMessage());
        }

        // Calcular áreas saltando figuras que fallaron (son null)
        System.out.println("\n--- Áreas calculadas ---");
        for (Figura f : figuras) {
            if (f != null) {
                System.out.println("✅ " + f);
            }
        }
    }
}
