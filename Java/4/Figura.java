// ── Clase abstracta ──────────────────────────────────────────────
public abstract class Figura {
    public abstract double calcularArea();

    @Override
    public String toString() {
        return String.format("%s → Área: %.2f", getClass().getSimpleName(), calcularArea());
    }
}

// ── Subclase Circulo ─────────────────────────────────────────────
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) throws DimensionInvalidaException {
        if (radio <= 0) {
            throw new DimensionInvalidaException("Círculo", "radio = " + radio);
        }
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// ── Subclase Triangulo ───────────────────────────────────────────
class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) throws DimensionInvalidaException {
        if (base <= 0) {
            throw new DimensionInvalidaException("Triángulo", "base = " + base);
        }
        if (altura <= 0) {
            throw new DimensionInvalidaException("Triángulo", "altura = " + altura);
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
}
