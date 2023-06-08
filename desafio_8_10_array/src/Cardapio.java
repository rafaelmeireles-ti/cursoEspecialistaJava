import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0] ;

    void adicionarItem(ItemCardapio item) {
        itens = Arrays.copyOf(itens , itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        ItemCardapio[] itensNovo = new ItemCardapio[itens.length - 1];

        System.arraycopy(itens , 0 , itensNovo , 0 , indice);

        System.arraycopy(itens , indice + 1 , itensNovo , indice , itensNovo.length - indice);

        itens = Arrays.copyOf(itensNovo , itensNovo.length);

    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {

        for (ItemCardapio item : itens){
            if ( item.preco >= precoMinimo && item.preco <= precoMaximo   ) {
                System.out.println("item.descricao = " + item.descricao);
                System.out.println("item.preco = " + item.preco);
            }

        }
    }

}