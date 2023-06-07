

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaDeVendas sistema = new SistemaDeVendas();
        sistema.executar();

    }

    public static class SistemaDeVendas {
        public List<Venda> listarVendas;
        public List<Cliente> listarClientes;
        public List<Vendedor> listaVendedores;


        public void exibirMenu() {
            System.out.println("===== MENU =====");
            System.out.println("1. Cadastrar Vendas");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Cadastrar Vendedor");
            System.out.println("4. Listar Vendas");
            System.out.println("5. Listar Vendedores");
            System.out.println("6. Listar Clientes");
            System.out.println("7. Listar Vendas por CPF do Cliente");
            System.out.println("8. Listar Vendedores");
            System.out.println("9. Sair");
            System.out.println("================");
            System.out.print("Escolha uma opção: ");
        }


        public void executar() {

            Scanner scanner = new Scanner(System.in);
            int opcao;
            boolean sair = false;

            Vendedor vendedor = new Vendedor("Joao", "8888", "emai@");
            Cliente cliente = new Cliente("fulano", "999", "fulano@");

            while (!sair) {
                exibirMenu();
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        cadastraVendas(vendedor, cliente, 88, "kk", 88.9, 9, 99.0);
                        break;
                    case 2:
                        cadastrarCliente("Joao", "999", "email");
                        break;
                    case 3:
                        //cadastrarVendedor();
                        break;
                    case 4:
                        listarVendas();
                        break;
                    case 5:
                        listarVendedores();
                        break;
                    case 6:
                        listarClientes();
                        break;
                    case 7:
                        //listarVendasPorClienteCPF();
                        break;
                    case 8:
                        listarVendedores();
                        break;
                    case 9:
                        sair = true;
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        }
        public void cadastrarVendedor(String nome, String cpf, String email) {
            List<Vendedor> listaVendedores = new ArrayList<Vendedor>();
            Vendedor vendedor = new Vendedor(nome, cpf, email);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do vendedor: ");
            String nome1 = scanner.nextLine();

            System.out.print("Digite o CPF do vendedor: ");
            String cpf1 = scanner.next();

            System.out.print("Digite o e-mail do vendedor: ");
            String email1 = scanner.next();

            String nomeVendedor = vendedor.setNome(nome1);
            String cpfVendedor = vendedor.setCpf(cpf1);
            String emailVendedor = vendedor.setEmail(email1);

            // Verificar se o CPF já está cadastrado
            for (Vendedor v : listaVendedores) {
                if (v.getCpf().equals(cpf)) {
                    System.out.println("CPF já cadastrado. Não é possível cadastrar o vendedor.");
                    return;
                }
            }

            for (Vendedor v : listaVendedores) {
                if (v.getEmail().equals(email)) {
                    System.out.println("E-mail já cadastrado. Não é possível cadastrar o vendedor.");
                    return;
                }
            }

            listaVendedores.add(vendedor);
            System.out.println("Vendedor cadastrado com sucesso!");
        }


        public static void cadastrarCliente(String nome, String cpf, String email) {
            List<Cliente> listasClientes = new ArrayList<>();
            Cliente cliente = new Cliente(nome, cpf, email);

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o nome do cliente: ");
            String nome1 = scanner.nextLine();

            System.out.print("Digite o CPF do cliente: ");
            String cpf1 = scanner.next();

            System.out.print("Digite o e-mail do cliente: ");
            String email1 = scanner.next();

            String nomecliente = cliente.setNome(nome1);
            String cpfcliente = cliente.setCpf(cpf1);
            String emailcliente = cliente.setEmail(email1);

            for (Cliente c : listasClientes) {
                if (c.getCpf().equals(cpf1)) {
                    System.out.println("CPF já cadastrado. Não é possível cadastrar o cliente.");
                    return;
                }
            }

            for (Cliente c : listasClientes) {
                if (c.getEmail().equals(email1)) {
                    System.out.println("E-mail já cadastrado. Não é possível cadastrar o cliente.");
                    return;
                }
            }
            listasClientes.add(cliente);
            System.out.println("Cliente cadastrado com sucesso!");
        }
        public static void cadastraVendas(Vendedor vendedor, Cliente cliente, int codigo, String nomeProduto, double preco, int quantidade, double valorTotal) {
            Scanner scanner = new Scanner(System.in);

            Venda venda = new Venda();
            System.out.print("Digite o código da venda: ");
            codigo = scanner.nextInt();
            int codigoDaVenda = venda.setCodigo(codigo);

            System.out.print("Digite o nome do produto: ");
            nomeProduto = scanner.next();
            String nome = venda.setNomeProduto(nomeProduto);

            System.out.print("Digite o preço do produto: ");
            preco = scanner.nextDouble();
            double preco1 = venda.setPreco(preco);

            System.out.print("Digite a quantidade: ");
            quantidade = scanner.nextInt();
            int quantidade1 = venda.setQuantidade(quantidade);

            System.out.print("Digite o CPF do cliente: ");
            String cpf = scanner.next();
            String cpfCliente = venda.setCpf(cpf);

            System.out.print("Digite o e-mail do vendedor: ");
            String email = scanner.next();
            String emailVendedor = vendedor.setEmail(email);

            List<Cliente> listasClientes = new ArrayList<>();

            for (Cliente c : listasClientes) {
                if (c.getCpf().equals(cpfCliente)) {
                    cliente = c;
                    break;
                }
            }
            if (cliente == null) {
                System.out.println("Cliente não cadastrado. Não é possível realizar a venda.");
                return;
            }

            List<Vendedor> listaVendedores = new ArrayList<>();
            for (Vendedor v : listaVendedores) {
                if (v.getEmail().equals(emailVendedor)) {
                    vendedor = v;
                    break;
                }
            }

            if (vendedor == null) {
                System.out.println("Vendedor não cadastrado. Não é possível realizar a venda.");
                return;
            }

            Venda venda1 = new Venda(cliente, vendedor, codigo, nomeProduto, preco, quantidade);
            List<Venda> todasAsVendas = new ArrayList<>();
            todasAsVendas.add(venda);
            System.out.println("Venda cadastrada com sucesso!");

        }
        public static List<Venda> listarVendas() {
            List<Venda> listaVendas = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual o seu nome?");
            String nome = scanner.next();

            System.out.println("Digite seu cpf ");
            int cpf = scanner.nextInt();
            return listaVendas;
        }

        public static void listarVendedores() {
            List<Vendedor> listaVendedores = new ArrayList<>();
            System.out.println("===== LISTA DE VENDEDORES =====");
            if (listaVendedores.isEmpty()) {
                System.out.println("Nenhum vendedor cadastrado.");
            } else {
                for (Vendedor vendedor : listaVendedores) {
                    System.out.println("Nome: " + vendedor.getNome());
                    System.out.println("CPF: " + vendedor.getCpf());
                    System.out.println("E-mail: " + vendedor.getEmail());
                    System.out.println("============================");
                }
            }
        }
        public static void listarClientes() {
            List<Cliente> listasClientes = new ArrayList<>();
            System.out.println("===== LISTA DE CLIENTES =====");
            if (listasClientes.isEmpty()) {
                System.out.println("Nenhum cliente cadastrado.");
            } else {
                for (Cliente cliente : listasClientes) {
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("E-mail: " + cliente.getEmail());
                    System.out.println("============================");
                }
            }
        }
        public static List<Venda> listarVendasPorClienteCPF(List<Venda> vendas, String cpf) {
            List<Venda> vendasDoCliente = new ArrayList<>();

            for (Venda venda : vendas) {
                if (venda.getCliente().getCpf().equals(cpf)) {
                    vendasDoCliente.add(venda);
                }

            }
            return vendasDoCliente;
        }
    }
}
