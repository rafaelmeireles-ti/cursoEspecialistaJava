import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cardapio {

   // ArrayList<ItemCardapio> itens = new ArrayList<>();
    List<ItemCardapio> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
        itens.add(item);

    }

    void removerItem(int indice) {
        itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

}