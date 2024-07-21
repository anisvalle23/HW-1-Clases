
package hw.pkg1;


public class Multa {
    private int codigo;
    private String nombreInfractor;
    private String tipo;
    private double monto;
    private boolean pagada;

    private double TIPO_GRAVE;
    private double TIPO_MEDIO;
    private double TIPO_LEVE;

    Multa(int codigo, String nombreInfractor, String tipo, double grave, double medio, double leve) {
        this.codigo = codigo;
        this.nombreInfractor = nombreInfractor;
        this.TIPO_GRAVE = grave;
        this.TIPO_MEDIO = medio;
        this.TIPO_LEVE = leve;
        this.tipo = tipo.toUpperCase();
        this.monto = calcularMonto(tipo.toUpperCase());
        this.pagada = false;
    }

    private double calcularMonto(String tipo) {
        switch (tipo) {
            case "GRAVE":
                return TIPO_GRAVE;
            case "MEDIO":
                return TIPO_MEDIO;
            case "LEVE":
            default:
                return TIPO_LEVE;
        }
    }

    int getCodigo() {
        return codigo;
    }

    double getMonto() {
        return monto;
    }

    boolean isPagada() {
        return pagada;
    }

    String imprimir() {
        String estado = pagada ? String.format("Pagada por un monto de Lps %.1f", monto) : "Multa pendiente";
        return String.format("Código: %d, Nombre: %s, Tipo: %s, Monto: Lps %.1f, Estado: %s", codigo, nombreInfractor, tipo, monto, estado);
    }

    String pagar() {
        this.pagada = true;
        return String.format("Multa con Código %d fue pagada por un monto de Lps %.1f", codigo, monto);
    }

    public String toString() {
        String estado = pagada ? String.format("Pagada por un monto de Lps %.1f", monto) : "Multa pendiente";
        return String.format("Código: %d, Nombre: %s, Tipo: %s, Monto: Lps %.1f, Estado: %s", codigo, nombreInfractor, tipo, monto, estado);
    }
}


