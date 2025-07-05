public class Principal {
    public static void main(String[] args) {
        ConsultaConversorDeMonedas consultaConversorDeMonedas = new ConsultaConversorDeMonedas();
        ConversorDeMonedas conversorDeMonedas = consultaConversorDeMonedas.buscaConversorDeMonedas("USD","MXN", 1.0F);
        System.out.println(conversorDeMonedas);
    }
}
