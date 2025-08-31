package Exceptions;

public class VeiculoNaoEncontradoException extends RuntimeException {
     public VeiculoNaoEncontradoException() {
          super("Veículo não encontrado no estacionamento.");
     }

     public VeiculoNaoEncontradoException(String message) {
          super(message);
     }
}
