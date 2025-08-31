import java.util.Objects;

public abstract class Veiculo {
     private String placa;
     private String modelo;
     private String cor;
     private int ano;

     public Veiculo() {
     }

     public Veiculo(int ano, String cor, String modelo, String placa) {
          this.ano = ano;
          this.cor = cor;
          this.modelo = modelo;
          this.placa = placa;
     }

     public abstract String ligar();


     public abstract String desligar();

     @Override
     public boolean equals(Object o) {
          if (o == null || getClass() != o.getClass()) return false;
          Veiculo veiculo = (Veiculo) o;
          return ano == veiculo.ano && Objects.equals(placa, veiculo.placa) && Objects.equals(modelo, veiculo.modelo) && Objects.equals(cor, veiculo.cor);
     }

     @Override
     public int hashCode() {
          return Objects.hash(placa, modelo, cor, ano);
     }

     public String getPlaca() {
          return placa;
     }

     public void setPlaca(String placa) {
          this.placa = placa;
     }

     public String getModelo() {
          return modelo;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }

     public String getCor() {
          return cor;
     }

     public void setCor(String cor) {
          this.cor = cor;
     }

     public int getAno() {
          return ano;
     }

     public void setAno(int ano) {
          this.ano = ano;
     }
}
