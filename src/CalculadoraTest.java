public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Pruebas con assert
        assert calc.suma(2, 3) == 5 : "Error en suma";
        assert calc.resta(5, 2) == 3 : "Error en resta";

        System.out.println("Todos los tests pasaron correctamente.");
    }
}
