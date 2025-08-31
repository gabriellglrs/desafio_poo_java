<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=4C89F8&height=120&section=header"/>

<img width="1584" height="396" alt="LinkedIn cover - 29" src="https://github.com/user-attachments/assets/d1c05723-0bec-4ce7-8dee-1ef8c95ebf3e" />

<br>

# 🚗 Sistema de Estacionamento - Desafio Técnico

[![Status](https://img.shields.io/badge/Status-✅%20Aprovado-brightgreen)](https://github.com)
[![Java](https://img.shields.io/badge/Java-17+-orange)](https://www.oracle.com/java/)
[![Vaga](https://img.shields.io/badge/Vaga%20Júnior-100%25%20Aprovada-blue)](https://github.com)

## 📋 Sobre o Projeto

Este projeto foi desenvolvido como parte de um **desafio técnico para vaga de desenvolvedor júnior**, no qual obtive **100% de aprovação**. O sistema simula o gerenciamento de um estacionamento, demonstrando conhecimentos sólidos em **Programação Orientada a Objetos (POO)**, **tratamento de exceções** e **estruturas de dados** em Java.

<img width="929" height="1000" alt="image" src="https://github.com/user-attachments/assets/5afabe7c-8cef-4a07-9aab-46bbceb4bedd" />


## 🎯 Objetivos do Desafio

- Implementar um sistema completo de gerenciamento de estacionamento
- Demonstrar domínio dos **4 pilares da POO**: Encapsulamento, Herança, Polimorfismo e Abstração
- Aplicar **tratamento de exceções customizadas**
- Utilizar **Collections** e **estruturas de dados** adequadas
- Implementar **boas práticas** de desenvolvimento Java

## 🏗️ Arquitetura do Sistema

### Estrutura de Classes

```
Sistema de Estacionamento
├── Veiculo (Classe Abstrata)
│   ├── Carro
│   └── Moto
├── Clientes
├── Estacionamento
└── Exceptions/
    ├── SemVagasException
    └── VeiculoNaoEncontradoException
```

### Diagrama de Classes Conceitual

```
┌─────────────────┐
│     Veiculo     │ (Abstract)
│─────────────────│
│ - placa: String │
│ - modelo: String│
│ - cor: String   │
│ - ano: int      │
│─────────────────│
│ + ligar()       │ (Abstract)
│ + desligar()    │ (Abstract)
└─────────────────┘
         ▲
         │
    ┌────┴────┐
    │         │
┌───▼───┐ ┌──▼──┐
│ Carro │ │Moto │
└───────┘ └─────┘
```

## 🚀 Funcionalidades Implementadas

### ✅ Gerenciamento de Veículos
- **Herança**: Classes `Carro` e `Moto` estendem `Veiculo`
- **Polimorfismo**: Métodos `ligar()` e `desligar()` com implementações específicas
- **Encapsulamento**: Atributos privados com getters/setters

### ✅ Gerenciamento de Clientes
- Cadastro e remoção de clientes
- Associação de múltiplos veículos por cliente
- Validação de duplicatas

### ✅ Sistema de Estacionamento
- **Controle de vagas**: Limite de 10 vagas
- **Estacionamento individual**: Um veículo por vez
- **Estacionamento em lote**: Todos os veículos de um cliente
- **Controle de tempo**: Registro de entrada e cálculo de permanência
- **Verificação de disponibilidade**: Contagem dinâmica de vagas

### ✅ Tratamento de Exceções
- `SemVagasException`: Quando não há vagas disponíveis
- `VeiculoNaoEncontradoException`: Quando veículo não está estacionado

## 💻 Tecnologias e Conceitos Aplicados

| Conceito | Implementação |
|----------|---------------|
| **Abstração** | Classe abstrata `Veiculo` |
| **Herança** | `Carro` e `Moto` estendem `Veiculo` |
| **Polimorfismo** | Métodos abstratos implementados diferentemente |
| **Encapsulamento** | Atributos privados, métodos públicos |
| **Collections** | `ArrayList<>`, `HashMap<>` |
| **Exceções Customizadas** | Classes próprias de exceção |
| **Java Time API** | `LocalTime`, `Duration` |
| **Equals & HashCode** | Implementação correta em todas as classes |

## 🔧 Como Executar

1. **Clone o repositório**
```bash
git clone <url-do-repositorio>
cd sistema-estacionamento
```

2. **Compile o projeto**
```bash
javac -d bin src/*.java src/Exceptions/*.java
```

3. **Execute o sistema**
```bash
java -cp bin Main
```

## 📊 Exemplo de Saída

```
=== Lista de Clientes ===
Clientes{nome='Gabriel', cpf='111.111.111-11', telefone='99999-1111', veiculos=[...]}
Clientes{nome='Maria', cpf='222.222.222-22', telefone='98888-2222', veiculos=[...]}

=== Estacionando Veículos Individualmente ===
Número de vagas disponíveis: 10
Veículo estacionado com sucesso!
Número de vagas disponíveis: 9
Veículo estacionado com sucesso!

=== Retirando Veículo ===
Veículo retirado com sucesso!
Tempo de permanência: 2 minutos
Número de vagas disponíveis: 9
```

## 🎯 Diferenciais Técnicos Demonstrados

### 1. **Design Patterns**
- **Template Method**: Na classe abstrata `Veiculo`
- **Factory-like**: Construtores bem estruturados

### 2. **Boas Práticas**
- ✅ Uso correto de `final` para constantes
- ✅ Implementação completa de `equals()` e `hashCode()`
- ✅ Métodos `toString()` informativos
- ✅ Validações de entrada
- ✅ Tratamento de casos edge

### 3. **Estruturas de Dados Inteligentes**
- `HashMap<Veiculo, LocalTime>`: Para rastrear veículos estacionados e horário de entrada
- `ArrayList<>`: Para listas dinâmicas de clientes e veículos

### 4. **Gestão de Tempo**
- Uso da **Java Time API** moderna
- Cálculo preciso de duração de permanência

## 🧪 Casos de Teste Contemplados

- ✅ Estacionamento com vagas disponíveis
- ✅ Estacionamento sem vagas (exceção)
- ✅ Remoção de veículo existente
- ✅ Remoção de veículo inexistente (exceção)
- ✅ Cadastro de cliente duplicado
- ✅ Adição de veículo duplicado ao cliente
- ✅ Estacionamento em lote de múltiplos veículos

## 📈 Resultados do Desafio

### 🏆 **APROVAÇÃO: 100%**

**Pontos Fortes Destacados:**
- Implementação completa dos requisitos
- Código limpo e bem estruturado
- Uso adequado de POO e suas práticas
- Tratamento robusto de exceções
- Documentação clara através do código

## 🛠️ Possíveis Melhorias Futuras

- [ ] Interface gráfica (Swing/JavaFX)
- [ ] Persistência de dados (banco de dados)
- [ ] Cálculo automático de valores de cobrança
- [ ] Relatórios de uso do estacionamento
- [ ] API REST para integração externa
- [ ] Testes unitários com JUnit

## 👨‍💻 Sobre o Desenvolvedor

Este projeto demonstra minha capacidade de:
- **Analisar requisitos** e transformá-los em código funcional
- **Aplicar conceitos de POO** de forma prática e eficiente
- **Estruturar projetos** Java seguindo boas práticas
- **Resolver problemas** complexos com soluções elegantes
- **Documentar código** de forma clara e profissional

## 📞 Contato

Desenvolvido como parte do processo seletivo para **vaga de desenvolvedor Java júnior**.

**Status do desafio**: ✅ **APROVADO COM 100% DE SUCESSO**

---

*"Código limpo não é escrito seguindo um conjunto de regras. Você não se torna um artesão de software aprendendo uma lista do que fazer e o que não fazer. Profissionalismo e artesanato vêm de valores que dirigem disciplinas."* - Robert C. Martin

---

 <br>

 <br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/ed7208b8-6bdc-4c82-98aa-8c8cb9c1428f" height="150"/>
</div>

<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=4C89F8&height=120&section=footer"/>
