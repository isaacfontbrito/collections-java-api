package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itensList;

    public CarrinhoDeCompras(){
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itensList.add(item);
    }
    
    public void removerItem(String nome) {
        List<Item> itensParaRemover =  new ArrayList<>();
        if (!itensList.isEmpty()) {
            for ( Item i : itensList){
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itensList.removeAll(itensParaRemover); 
        }else {
            System.out.println("A lista está vazia!");
        }
    }
                    
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!itensList.isEmpty()) {
            for (Item item : itensList) {
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal += valorItem; //valorTotel = valorTotal + valorIterm;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if (!itensList.isEmpty()) {
            System.out.println(this.itensList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public String toString(){
        return "CarrinhoDeCompras{" +  
            "itens=" + itensList + 
            '}';
    }

    public static void main(String[] args) {
        //criando uma instancia do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lapis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lapis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Boracha", 2d, 2);

        // Exibindo itens no carrinho 
        carrinhoDeCompras.exibirItens();

        // removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lapis");

        // Exibindo os itens atualixzados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());


    }
}
