package br.pedroochial;

public class App {

    public static void main(String[] args) {

       Clientes cliente = new Clientes(" pikachu ", "123");
       System.out.println(cliente.toString());
        System.out.println();


       Produto prod = new Produto (67 , "bola " ,  2.50 );
       System.out.println();
       Produto prod2 = new Produto(17 , "avestruz " ,670 );
       System.out.println();
       Produto prod3 = new Produto(24 , "trator ", 33);
       System.out.println();
       Venda venda = new Venda();

        venda.inserir( 4, prod);
        System.out.println();
        venda.inserir( 67, prod2);
        System.out.println();
        venda.inserir (5,prod3);
        System.out.println();
        System.out.println("=== Venda ===");
        System.out.println(venda.valorTotal());
        System.out.println();
        System.out.println(venda.toString());


        // clientes

        Estudante estudante = new Estudante (" charmander ", " 026 ", " ipanema ", " 2610 " , "001");
        System.out.println();
        ClientePF clientePF = new ClientePF (" Zeraora " , " 543 ", "027" );
        System.out.println();
        ClientePJ clientePJ = new ClientePJ(" Empresa X " , "028 " , " 44.444.444/0001-44 ");

        System.out.println("=== Estudante ===");
        System.out.println(estudante.toString());

        System.out.println("=== ClientePF ===");
        System.out.println(clientePF.toString());

        System.out.println("=== ClientePJ ===");
        System.out.println(clientePJ.toString());

        // Produtos

        ProdutoEE produtoEE = new ProdutoEE( 50, " TV " , 1500.0 ,  120 );


        ProdutosAA produtoAA = new ProdutosAA(80, " Corote ", 5.0 , 400);

        System.out.println("=== ProdutoEE ===");
        System.out.println(produtoEE);

        System.out.println("=== ProdutosAA ===");
        System.out.println(produtoAA);

         // Cadastros

        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.inserir(cliente);
        cadastroCliente.inserir(estudante);
        cadastroCliente.inserir(clientePF);
        cadastroCliente.inserir(clientePJ);

        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.inserir(prod);
        cadastroProduto.inserir(produtoEE);
        cadastroProduto.inserir(produtoAA);

        System.out.println("=== Cadastro de Clientes ===");
        System.out.println(cadastroCliente);
        System.out.println("Quantidade: " + cadastroCliente.quantidade() + " Clientes " );

        System.out.println("=== Cadastro de Produtos ===");
        System.out.println(cadastroProduto);
        System.out.println("Quantidade: " + cadastroProduto.quantidade() + " Podutos " );

       }

    }

