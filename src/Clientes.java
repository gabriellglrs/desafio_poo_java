import Exceptions.SemVagasException;
import Exceptions.VeiculoNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Clientes {
     private String nome;
     private String cpf;
     private String telefone;
     private List<Veiculo> veiculos;

     public Clientes() {
          this.veiculos = new ArrayList<Veiculo>();
     }

     public Clientes(String nome, String cpf, String telefone) {
          this.nome = nome;
          this.cpf = cpf;
          this.telefone = telefone;
          this.veiculos = new ArrayList<Veiculo>();
     }

     public void adicionarVeiculo(Veiculo veiculo) {
          if (this.veiculos.contains(veiculo)) {
               System.out.println("Veículo já cadastrado para este cliente");
          } else {
               this.veiculos.add(veiculo);
               System.out.println("Veículo adicionado com sucesso");
          }
     }

     public void removerVeiculo(Veiculo veiculo) {
          if (this.veiculos.contains(veiculo)) {
               this.veiculos.remove(veiculo);
               System.out.println("Veículo removido com sucesso");
          } else {
               throw new VeiculoNaoEncontradoException();
          }
     }

     public void removerVeiculoIndex(int index) {
          if (index >= 0 && index < this.veiculos.size()) {
               this.veiculos.remove(index);
               System.out.println("Veículo " + index + " removido com sucesso");
          } else {
               System.out.println("Índice " + index + " inválido");
          }
     }

     public void listarVeiculos() {
          this.veiculos.forEach(System.out::println);
     }

     // getters and setters
     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getCpf() {
          return cpf;
     }

     public void setCpf(String cpf) {
          this.cpf = cpf;
     }

     public String getTelefone() {
          return telefone;
     }

     public List<Veiculo> getVeiculos() {
          return veiculos;
     }

     public void setTelefone(String telefone) {
          this.telefone = telefone;
     }

     @Override
     public boolean equals(Object o) {
          if (o == null || getClass() != o.getClass()) return false;
          Clientes clientes = (Clientes) o;
          return Objects.equals(nome, clientes.nome) && Objects.equals(cpf, clientes.cpf) && Objects.equals(telefone, clientes.telefone) && Objects.equals(veiculos, clientes.veiculos);
     }

     @Override
     public int hashCode() {
          return Objects.hash(nome, cpf, telefone, veiculos);
     }

     @Override
     public String toString() {
          return "Clientes{" +
                  "nome='" + nome + '\'' +
                  ", cpf='" + cpf + '\'' +
                  ", telefone='" + telefone + '\'' +
                  ", veiculos=" + veiculos +
                  '}';
     }
}
