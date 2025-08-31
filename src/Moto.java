import java.util.Objects;

public class Moto extends Veiculo {
     private Integer cilindradas;

     public Moto() {
     }

     public Moto(Integer cilindradas) {
          this.cilindradas = cilindradas;
     }

     public Moto(int ano, String cor, String modelo, String placa, Integer cilindradas) {
          super(ano, cor, modelo, placa);
          this.cilindradas = cilindradas;
     }

     @Override
     public String ligar() {
          return "Moto ligada";
     }

     @Override
     public String desligar() {
          return "Moto desligada";
     }

     public Integer getCilindradas() {
          return cilindradas;
     }

     public void setCilindradas(Integer cilindradas) {
          this.cilindradas = cilindradas;
     }

     @Override
     public boolean equals(Object o) {
          if (o == null || getClass() != o.getClass()) return false;
          if (!super.equals(o)) return false;
          Moto moto = (Moto) o;
          return Objects.equals(cilindradas, moto.cilindradas);
     }

     @Override
     public int hashCode() {
          return Objects.hash(super.hashCode(), cilindradas);
     }

     @Override
     public String toString() {
          return "Moto{" +
                  "cilindradas=" + cilindradas +
                  '}';
     }
}
