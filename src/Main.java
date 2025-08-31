import java.time.LocalTime;
import java.util.Map;

public class Main {
     public static void main(String[] args) {
          // Criar veículos
          Veiculo carro1 = new Carro(4, 2020, "Preto", "CIV-1234", "CIV-1234");
          Veiculo carro2 = new Carro(4, 2021, "Branco", "COR-9999", "COR-9999");
          Veiculo moto1 = new Moto(2019, "Vermelha", "Hornet", "MOT-1111", 600);

          // Criar clientes
          Clientes cliente1 = new Clientes("Gabriel", "111.111.111-11", "99999-1111");
          Clientes cliente2 = new Clientes("Maria", "222.222.222-22", "98888-2222");

          // Adicionar veículos aos clientes
          cliente1.adicionarVeiculo(carro1);
          cliente1.adicionarVeiculo(moto1);

          cliente2.adicionarVeiculo(carro2);

          // Criar estacionamento
          Estacionamento estacionamento = new Estacionamento("Rua Principal, 100", 5.0);

          // Adicionar clientes
          estacionamento.adicionarCliente(cliente1);
          estacionamento.adicionarCliente(cliente2);

          System.out.println("\n=== Lista de Clientes ===");
          estacionamento.listarClientes();

          // Estacionar veículos individualmente
          System.out.println("\n=== Estacionando Veículos Individualmente ===");
          estacionamento.estacionarVeiculo(carro1);
          estacionamento.estacionarVeiculo(moto1);

          // Estacionar todos os veículos de um cliente
          System.out.println("\n=== Estacionando TODOS os veículos do cliente Maria ===");
          estacionamento.estacionarVariosVeiculosDoCliente(cliente2);

          // Mostrar veículos estacionados e horário de entrada
          System.out.println("\n=== Veículos Estacionados com Horário de Entrada ===");
          for (Map.Entry<Veiculo, LocalTime> entry : estacionamento.getVeiculosEstacionados().entrySet()) {
               Veiculo veiculo = entry.getKey();
               LocalTime horaEntrada = entry.getValue();
               System.out.println(veiculo.getModelo() + " (" + veiculo.getPlaca() + ") entrou às " + horaEntrada);
          }

          // Retirar veículo
          System.out.println("\n=== Retirando Veículo ===");
          estacionamento.retirarVeiculo(carro1);

          // Mostrar novamente veículos estacionados
          System.out.println("\n=== Veículos Estacionados Agora ===");
          for (Map.Entry<Veiculo, LocalTime> entry : estacionamento.getVeiculosEstacionados().entrySet()) {
               Veiculo veiculo = entry.getKey();
               LocalTime horaEntrada = entry.getValue();
               System.out.println(veiculo.getModelo() + " (" + veiculo.getPlaca() + ") entrou às " + horaEntrada);
          }
     }
}
