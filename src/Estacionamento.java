import Exceptions.SemVagasException;
import Exceptions.VeiculoNaoEncontradoException;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Estacionamento {
     private final Integer NUMERO_DE_VAGAS = 10;
     private String endereco;
     private Double valorHora;
     private LocalTime horaEntrada;
     private LocalTime horaSaida;
     private final List<Clientes> clientes = new ArrayList<>();
     private final Map<Veiculo, LocalTime> veiculosEstacionados = new HashMap<>();


     public Estacionamento() {
     }

     public Estacionamento(String endereco, Double valorHora) {
          this.endereco = endereco;
          this.valorHora = valorHora;
     }

     public void adicionarCliente(Clientes cliente) {
          if (cliente == null ) {
               System.out.println("Cliente Null não pode ser adicionado");
               return;
          }
          if (this.clientes.contains(cliente)) {
               System.out.println("Cliente já cadastrado");
               return;
          }
          this.clientes.add(cliente);
     }

     public void removerCliente(Clientes cliente) {
          if (this.clientes.contains(cliente)) {
               this.clientes.remove(cliente);
               System.out.println("Cliente removido com sucesso");
          } else {
               System.out.println("Cliente não encontrado");
          }
     }

     public void listarClientes() {
          this.clientes.forEach(System.out::println);
     }

     public void numeroDeVagasDisponiveis() {
          int vagasDisponiveis = NUMERO_DE_VAGAS - this.veiculosEstacionados.size();
          System.out.println("Número de vagas disponíveis: " + vagasDisponiveis);
     }

     public void estacionarVariosVeiculosDoCliente(Clientes cliente) {
          numeroDeVagasDisponiveis();

          // validações básicas
          if (cliente == null || cliente.getVeiculos().isEmpty()) {
               System.out.println("Cliente inválido ou sem veículos para estacionar");
               return;
          }

          // checar se cabem todos os veículos
          if (this.veiculosEstacionados.size() + cliente.getVeiculos().size() > NUMERO_DE_VAGAS) {
               throw new SemVagasException();
          }

          // adicionar cada veículo do cliente com a hora de entrada
          for (Veiculo veiculo : cliente.getVeiculos()) {
               if (!this.veiculosEstacionados.containsKey(veiculo)) {
                    this.veiculosEstacionados.put(veiculo, LocalTime.now());
                    System.out.println("Veículo " + veiculo.getPlaca() + " estacionado.");
               } else {
                    System.out.println("Veículo " + veiculo.getPlaca() + " já estava estacionado.");
               }
          }

          System.out.println("Todos os veículos do cliente " + cliente.getNome() + " foram processados.");
     }

     public void estacionarVeiculo(Veiculo veiculo) {
          numeroDeVagasDisponiveis();
          if (this.veiculosEstacionados.size() < NUMERO_DE_VAGAS) {
               this.veiculosEstacionados.put(veiculo, LocalTime.now());
               System.out.println("Veículo estacionado com sucesso!");
          } else {
               throw new SemVagasException();
          }
     }

     public void retirarVeiculo(Veiculo veiculo) {
          if (this.veiculosEstacionados.containsKey(veiculo)) {
               LocalTime horaEntrada = this.veiculosEstacionados.get(veiculo);
               LocalTime horaSaida = LocalTime.now();

               // calcula o tempo de permanência
               Duration duracao = Duration.between(horaEntrada, horaSaida);

               this.veiculosEstacionados.remove(veiculo);
               System.out.println("Veículo retirado com sucesso!");
               System.out.println("Tempo de permanência: " + duracao.toMinutes() + " minutos");
               numeroDeVagasDisponiveis();
          } else {
               throw new VeiculoNaoEncontradoException();
          }
     }

     // getters


     public Integer getNUMERO_DE_VAGAS() {
          return NUMERO_DE_VAGAS;
     }

     public String getEndereco() {
          return endereco;
     }

     public Double getValorHora() {
          return valorHora;
     }

     public LocalTime getHoraEntrada() {
          return horaEntrada;
     }

     public LocalTime getHoraSaida() {
          return horaSaida;
     }

     public List<Clientes> getClientes() {
          return clientes;
     }

     public Map<Veiculo, LocalTime> getVeiculosEstacionados() {
          return veiculosEstacionados;
     }

     @Override
     public boolean equals(Object o) {
          if (o == null || getClass() != o.getClass()) return false;
          Estacionamento that = (Estacionamento) o;
          return Objects.equals(NUMERO_DE_VAGAS, that.NUMERO_DE_VAGAS) && Objects.equals(endereco, that.endereco) && Objects.equals(valorHora, that.valorHora) && Objects.equals(horaEntrada, that.horaEntrada) && Objects.equals(horaSaida, that.horaSaida) && Objects.equals(clientes, that.clientes) && Objects.equals(veiculosEstacionados, that.veiculosEstacionados);
     }

     @Override
     public int hashCode() {
          return Objects.hash(NUMERO_DE_VAGAS, endereco, valorHora, horaEntrada, horaSaida, clientes, veiculosEstacionados);
     }

     @Override
     public String toString() {
          return "Estacionamento{" +
                  "NUMERO_DE_VAGAS=" + NUMERO_DE_VAGAS +
                  ", endereco='" + endereco + '\'' +
                  ", valorHora=" + valorHora +
                  ", horaEntrada=" + horaEntrada +
                  ", horaSaida=" + horaSaida +
                  ", clientes=" + clientes +
                  ", veiculosEstacionados=" + veiculosEstacionados +
                  '}';
     }
}
