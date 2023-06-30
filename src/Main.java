public class ExemploException {
    public static void main(String[] args) {
        try {
            // Chamando um método que pode lançar uma exceção
            dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!");
        }
    }

    public static void dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            // Lançando uma exceção se o divisor for zero
            throw new ArithmeticException();
        }

        int resultado = dividendo / divisor;
        System.out.println("Resultado da divisão: " + resultado);
    }
}