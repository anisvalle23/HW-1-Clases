
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

    public Multa(int codigo, String nombreInfractor, String tipo, double TIPO_GRAVE, double TIPO_MEDIO, double TIPO_LEVE) {
        this.codigo = codigo;
        this.nombreInfractor = nombreInfractor;
        this.TIPO_GRAVE = TIPO_GRAVE;
        this.TIPO_MEDIO = TIPO_MEDIO;
        this.TIPO_LEVE = TIPO_LEVE;
        setTipo(tipo);
        this.pagada = false;
    }

    private void setTipo(String tipo) {
        switch (tipo.toUpperCase()) {
            case "GRAVE":
                this.tipo = "GRAVE";
                this.monto = TIPO_GRAVE;
                break;
            case "MEDIO":
                this.tipo = "MEDIO";
                this.monto = TIPO_MEDIO;
                break;
            case "LEVE":
            default:
                this.tipo = "LEVE";
                this.monto = TIPO_LEVE;
                break;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public double getMonto() {
        return monto;
    }

    public boolean isPagada() {
        return pagada;
    }

    public String pagar() {
        this.pagada = true;
        return String.format("Multa con Código %d fue pagada por un monto de Lps %.1f", codigo, monto);
    }

    public String toString() {
        return String.format("Código: %d, Nombre: %s, Tipo: %s, Monto: Lps %.1f, Estado: %s",
                codigo, nombreInfractor, tipo, monto, pagada ? "Pagada" : "Pendiente");
    }
}







