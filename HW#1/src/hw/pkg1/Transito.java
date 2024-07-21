
package hw.pkg1;


public class Transito {
    private Multa[] multas;
    private int contadorMultas;
    private double graveMonto;
    private double medioMonto;
    private double leveMonto;

    Transito(double grave, double medio, double leve) {
        multas = new Multa[100];
        contadorMultas = 0;
        this.graveMonto = grave;
        this.medioMonto = medio;
        this.leveMonto = leve;
    }

    Multa buscarMulta(int codigo) {
        for (int index = 0; index < contadorMultas; index++) {
            if (multas[index].getCodigo() == codigo) {
                return multas[index];
            }
        }
        return null;
    }

    String agregarMulta(int codigo, String nombre, String tipo) {
        if (contadorMultas >= multas.length) {
            return "No hay espacio para más multas.";
        }
        if (buscarMulta(codigo) != null) {
            return "Ya existe una multa con el código " + codigo;
        }
        multas[contadorMultas++] = new Multa(codigo, nombre, tipo, graveMonto, medioMonto, leveMonto);
        return "Multa agregada correctamente.";
    }

    String pagarMulta(int codigo) {
        Multa multa = buscarMulta(codigo);
        if (multa != null) {
            return multa.pagar();
        } else {
            return String.format("No existe una multa con el código %d", codigo);
        }
    }

    String[] obtenerMultas() {
        String[] resultados = new String[contadorMultas];
        for (int index = 0; index < contadorMultas; index++) {
            resultados[index] = multas[index].toString();
        }
        return resultados;
    }

    String generarResumen() {
        int pagadas = 0;
        int pendientes = 0;
        double montoPagadas = 0.0;
        double montoPendientes = 0.0;

        for (int index = 0; index < contadorMultas; index++) {
            if (multas[index].isPagada()) {
                pagadas++;
                montoPagadas += multas[index].getMonto();
            } else {
                pendientes++;
                montoPendientes += multas[index].getMonto();
            }
        }

        return String.format(
                "Cantidad de Multas generadas: %d\nCantidad de Multas Pagadas: %d con un monto de Lps %.2f\nCantidad de Multas pendientes de pagar: %d con un monto de Lps %.2f",
                contadorMultas, pagadas, montoPagadas, pendientes, montoPendientes
        );
    }
}
