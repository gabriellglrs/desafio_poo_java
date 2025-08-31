import java.util.Objects;

public class Carro extends Veiculo {
     private Integer portas;

     public Carro() {
     }

     public Carro(int portas, int ano, String cor, String modelo, String placa) {
          super(ano, cor, modelo, placa);
          this.portas = portas;
     }

     @Override
     public String ligar() {
          return "Carro ligado";
     }

     @Override
     public String desligar() {
          return "Carro desligado";
     }

     public String abrirPorta() {
          return "A porta do carro foi aberta";
     }

     public String fecharPorta() {
          return "A porta do carro foi fechada";
     }

     public int getPortas() {
          return portas;
     }

     public void setPortas(int portas) {
          this.portas = portas;
     }

     @Override
     public boolean equals(Object o) {
          if (o == null || getClass() != o.getClass()) return false;
          if (!super.equals(o)) return false;
          Carro carro = (Carro) o;
          return Objects.equals(portas, carro.portas);
     }

     @Override
     public int hashCode() {
          return Objects.hash(super.hashCode(), portas);
     }

     @Override
     public String toString() {
          return "Carro{" +
                  "portas=" + portas +
                  '}';
     }
}
