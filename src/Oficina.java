import java.util.ArrayList;
import java.util.Scanner;

public class Oficina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Clientes> listClientes = new ArrayList<Clientes>();
        ArrayList<Moto> listMotos = new ArrayList<Moto>();
        ArrayList<Manutencao> listManu = new ArrayList<Manutencao>();
        Integer opc = 0;
        // Criação do menu de interação do sistema.
        while (opc != 3) {
            System.out.println("______________________________________:");
            System.out.println("|     Bem vindo ao nosso sistema     |");
            System.out.println("--------------------------------------");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("_______________________________________ ");
            System.out.println("| Menu de opções:                     |");
            System.out.println("| 1- Cadastrar cliente e moto         |");
            System.out.println("| 2- manutenções                      |");
            System.out.println("| 3- Sair do sistema                  |");
            System.out.println("---------------------------------------");
            System.out.println("Insira a opção que deseja: ");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("_______________________________________ ");
                    System.out.println("| Menu de opções:                     |");
                    System.out.println("| 1- Cadastrar cliente                |");
                    System.out.println("| 2- Editar cliente                   |");
                    System.out.println("| 3- Excluir cliente                  |");
                    System.out.println("| 4- Cadastrar moto                   |");
                    System.out.println("| 5- Editar moto                      |");
                    System.out.println("| 6- Excluir moto                     |");
                    System.out.println("| 7- Imprimir clientes                |");
                    System.out.println("| 8- Imprimir moto                    |");
                    System.out.println("| 9- Voltar ao menu                   |");
                    System.out.println("---------------------------------------");
                    System.out.println("Insira a opção que deseja: ");
                    Integer opc1 = scan.nextInt();
                    switch (opc1) {
                        case 1:
                            Clientes cliente = new Clientes();
                            System.out.println("Adicionar cliente: ");
                            System.out.println("Nome: ");
                            cliente.setNome(scan.nextLine());
                            cliente.setNome(scan.nextLine());

                            System.out.println("Telefone: ");
                            cliente.setTelefone(scan.nextLine());

                            System.out.println("CPF: ");
                            cliente.setCpf(scan.nextLine());

                            System.out.println("Endereço: ");
                            cliente.setEndereco(scan.nextLine());

                            System.out.println("Nascimento: ");
                            cliente.setNascimento(scan.nextLine());

                            listClientes.add(cliente);

                            continue;

                        case 2:
                            int i = 0;
                            Clientes c = new Clientes();
                            for (Clientes item : listClientes) {
                                System.out.println("Posição: " + i);
                                System.out.println("nome: " + item.getNome());
                                System.out.println("telefone: " + item.getTelefone());
                                System.out.println("CPF: " + item.getCpf());
                                System.out.println("Endereço: " + item.getEndereco());
                                System.out.println("Nascimento: " + item.getNascimento());
                                System.out.println(" ");
                                i++;
                            }
                            System.out.println("Informe a posição a ser editada: ");
                            i = scan.nextInt();
                            if (i > listClientes.size()) {
                                System.out.println("Código inválido");
                                continue;
                            }
                            c = listClientes.get(i);
                            System.out.println("_________________________________");
                            System.out.println("| Menu de opções:               |");
                            System.out.println("| 1- Alterar Nome               |:");
                            System.out.println("| 2- Alterar Telefone           |");
                            System.out.println("| 3- Alterar CPF                |");
                            System.out.println("| 4- Alterar Endereço           |");
                            System.out.println("| 5- Alterar Nascimento         |");
                            System.out.println("| 6- Voltar ao menu             |");
                            System.out.println("---------------------------------");
                            System.out.println("| Escolha uma das opções acima: |");
                            Integer opc2 = scan.nextInt();
                            switch (opc2) {
                                case 1:
                                    System.out.println("Insira o novo nome: ");
                                    c.setNome(scan.nextLine());
                                    c.setNome(scan.nextLine());

                                    continue;

                                case 2:
                                    System.out.println("Insira o novo telefone: ");
                                    c.setTelefone(scan.nextLine());
                                    c.setTelefone(scan.nextLine());

                                    continue;

                                case 3:
                                    System.out.println("Insira o novo CPF: ");
                                    c.setCpf(scan.nextLine());
                                    c.setCpf(scan.nextLine());

                                    continue;

                                case 4:
                                    System.out.println("Insira o novo endereço: ");
                                    c.setEndereco(scan.nextLine());
                                    c.setEndereco(scan.nextLine());

                                    continue;

                                case 5:
                                    System.out.println("Insira o novo nascimento: ");
                                    c.setNascimento(scan.nextLine());
                                    c.setNascimento(scan.nextLine());

                                    continue;

                                case 6:

                                    continue;

                                default:
                                    System.out.println("Opção Inválida");
                            }
                            continue;

                        case 3:
                            i = 0;
                            for (Clientes item1 : listClientes) {
                                System.out.println("Posição: " + i);
                                System.out.println("nome: " + item1.getNome());
                                System.out.println("telefone: " + item1.getTelefone());
                                System.out.println("CPF: " + item1.getCpf());
                                System.out.println("Endereço: " + item1.getEndereco());
                                System.out.println("Nascimento: " + item1.getNascimento());
                                System.out.println(" ");
                                i++;
                            }
                            System.out.println("Informe a posição a ser excluída: ");
                            i = scan.nextInt();
                            if (i > listClientes.size()) {
                                System.out.println("Código Inválido");
                                continue;
                            }
                            listClientes.remove(i);

                            continue;

                        case 4:
                            Moto moto = new Moto();
                            System.out.println("Adicionar motos: ");
                            System.out.println("Modelo: ");
                            moto.setModelo(scan.nextLine());
                            moto.setModelo(scan.nextLine());

                            System.out.println("Ano: ");
                            moto.setAno(scan.nextLine());

                            System.out.println("Placa: ");
                            moto.setPlaca(scan.nextLine());

                            listMotos.add(moto);

                            continue;

                        case 5:
                            i = 0;
                            Moto m = new Moto();
                            for (Moto item : listMotos) {
                                for (Clientes item7 : listClientes) {
                                    System.out.println("Posição: " + i);
                                    System.out.println("Dono: " + item7.getNome());
                                }
                                System.out.println("Modelo: " + item.getModelo());
                                System.out.println("Ano: " + item.getAno());
                                System.out.println("Placa: " + item.getPlaca());
                                System.out.println(" ");
                                i++;
                            }
                            System.out.println("Informe a posição a ser editada: ");
                            i = scan.nextInt();
                            if (i > listMotos.size()) {
                                System.out.println("Código inválido");
                                continue;
                            }
                            m = listMotos.get(i);
                            System.out.println("_________________________________");
                            System.out.println("| Menu de opções:               |");
                            System.out.println("| 1- Alterar Modelo             |:");
                            System.out.println("| 2- Alterar Ano                |");
                            System.out.println("| 3- Alterar Placa              |");
                            System.out.println("| 4- Voltar ao menu             |");
                            System.out.println("---------------------------------");
                            System.out.println("| Escolha uma das opções acima: |");
                            Integer opc3 = scan.nextInt();
                            switch (opc3) {
                                case 1:
                                    System.out.println("Insira o novo modelo: ");
                                    m.setModelo(scan.nextLine());
                                    m.setModelo(scan.nextLine());

                                    continue;

                                case 2:
                                    System.out.println("Insira o novo ano ");
                                    m.setAno(scan.nextLine());
                                    m.setAno(scan.nextLine());

                                    continue;

                                case 3:
                                    System.out.println("Insira a nova placa: ");
                                    m.setPlaca(scan.nextLine());
                                    m.setPlaca(scan.nextLine());

                                    continue;


                                case 4:

                                    continue;

                                default:
                                    System.out.println("Opção Inválida");
                            }
                            continue;

                        case 6:
                            i = 0;
                            for (Moto item1 : listMotos) {
                                System.out.println("Posição: " + i);
                                System.out.println("Dono: " + item1.getNome());
                                System.out.println("Modelo: " + item1.getModelo());
                                System.out.println("Ano: " + item1.getAno());
                                System.out.println("Placa: " + item1.getPlaca());
                                System.out.println(" ");
                                i++;
                            }
                            System.out.println("Informe a posição a ser excluída: ");
                            i = scan.nextInt();
                            if (i > listMotos.size()) {
                                System.out.println("Código Inválido");
                                continue;
                            }
                            listMotos.remove(i);

                            continue;

                        case 7:
                            i = 0;
                            for (Clientes item : listClientes) {
                                System.out.println("Posição: " + i);
                                System.out.println("nome: " + item.getNome());
                                System.out.println("telefone: " + item.getTelefone());
                                System.out.println("CPF: " + item.getCpf());
                                System.out.println("Endereço: " + item.getEndereco());
                                System.out.println("Nascimento: " + item.getNascimento());
                                System.out.println(" ");
                                i++;
                            }
                            continue;

                        case 8:
                            i = 0;
                            for (Moto item : listMotos) {
                                for (Clientes item9 : listClientes) {
                                    System.out.println("Posição: " + i);
                                    System.out.println("Nome: " + item9.getNome());
                                }
                                    System.out.println("Modelo: " + item.getModelo());
                                    System.out.println("Ano: " + item.getAno());
                                    System.out.println("Placa: " + item.getPlaca());
                                    System.out.println(" ");
                                    i++;
                            }
                            continue;

                        case 9:

                            continue;

                        default:
                            System.out.println("Opção Inválida");
                    }
                    continue;

                case 2:
                    System.out.println("_______________________________________ ");
                    System.out.println("| Menu de opções:                     |");
                    System.out.println("| 1- Cadastrar manutenção             |");
                    System.out.println("| 2- editar manutenção                |");
                    System.out.println("| 3- excluir manutenção               |");
                    System.out.println("| 4- imprimir manutenções             |");
                    System.out.println("| 5- Sair do sistema                  |");
                    System.out.println("---------------------------------------");
                    System.out.println("Insira a opção que deseja: ");
                    Integer opc4 = scan.nextInt();
                    switch (opc4) {
                        case 1:
                            Manutencao manu = new Manutencao();
                            System.out.println("Registrar manutenção: ");
                            System.out.println("Id: ");
                            manu.setId(scan.nextLine());
                            manu.setId(scan.nextLine());

                            System.out.println("Data: ");
                            manu.setData(scan.nextLine());

                            System.out.println("Preço: ");
                            manu.setPreco(scan.nextDouble());

                            listManu.add(manu);

                            continue;

                        case 2:
                            int i = 0;
                            Manutencao n = new Manutencao();
                            for (Manutencao item : listManu) {
                                for (Clientes item6 : listClientes) {
                                    System.out.println("Posição: " + i);
                                    System.out.println("Cliente: " + item6.getNome());
                                }
                                System.out.println("Id: " + item.getId());
                                System.out.println("Data: " + item.getData());
                                System.out.println("Preco: " + item.getPreco());
                                System.out.println(" ");
                                i++;
                            }
                            System.out.println("Informe a posição a ser editada: ");
                            i = scan.nextInt();
                            if (i > listManu.size()) {
                                System.out.println("Código inválido");
                                continue;
                            }
                            n = listManu.get(i);
                            System.out.println("_________________________________");
                            System.out.println("| Menu de opções:               |");
                            System.out.println("| 1- Alterar Id                 |:");
                            System.out.println("| 2- Alterar Data               |");
                            System.out.println("| 3- Alterar Preço              |");
                            System.out.println("| 4- Voltar ao menu             |");
                            System.out.println("---------------------------------");
                            System.out.println("| Escolha uma das opções acima: |");
                            Integer opc5 = scan.nextInt();
                            switch (opc5) {
                                case 1:
                                    System.out.println("Insira o novo Id: ");
                                    n.setId(scan.nextLine());
                                    n.setId(scan.nextLine());

                                    continue;

                                case 2:
                                    System.out.println("Insira a nova data ");
                                    n.setData(scan.nextLine());
                                    n.setData(scan.nextLine());

                                    continue;

                                case 3:
                                    System.out.println("Insira o novo preço: ");
                                    n.setPreco(scan.nextDouble());
                                    n.setPreco(scan.nextDouble());

                                    continue;


                                case 4:

                                    continue;

                                default:
                                    System.out.println("Opção Inválida");
                            }
                            continue;

                        case 3:
                            i = 0;
                            for (Manutencao item1 : listManu) {
                                System.out.println("Posição: " + i);
                                System.out.println("Cliente: " + item1.getNome());
                                System.out.println("Id: " + item1.getId());
                                System.out.println("Data: " + item1.getData());
                                System.out.println("Preço: " + item1.getPreco());
                                System.out.println(" ");
                                i++;
                            }
                            System.out.println("Informe a posição a ser excluída: ");
                            i = scan.nextInt();
                            if (i > listManu.size()) {
                                System.out.println("Código Inválido");
                                continue;
                            }
                            listMotos.remove(i);

                            continue;

                        case 4:
                            i = 0;
                            for (Manutencao item : listManu) {
                                for (Clientes item8 : listClientes) {
                                    System.out.println("Posição: " + i);
                                    System.out.println("Cliente: " + item8.getNome());
                                }
                                    System.out.println("Id: " + item.getId());
                                    System.out.println("Data: " + item.getData());
                                    System.out.println("Preco: " + item.getPreco());
                                    System.out.println(" ");
                                    i++;
                            }
                            continue;

                        case 5:
                            continue;

                        default:
                            System.out.println("Opção Inválida");
                    }
                    continue;

                        case 3:

                            break;

                        default:
                            System.out.println("Opção Inválida");
                            continue;
                    }
            }
        }
    }