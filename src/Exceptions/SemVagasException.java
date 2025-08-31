package Exceptions;

public class SemVagasException extends RuntimeException {
     public SemVagasException() {
          super("Não há vagas disponíveis no estacionamento.");
     }
}
