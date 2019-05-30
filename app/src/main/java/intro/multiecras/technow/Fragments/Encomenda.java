package intro.multiecras.technow.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Map;

import intro.multiecras.technow.Adapters.Encomenda_Adapter;
import intro.multiecras.technow.Dados;
import intro.multiecras.technow.Objetos.Product;
import intro.multiecras.technow.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Encomenda extends Fragment {
    double preco_total;


    public Encomenda() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        for(Map.Entry<Product, Integer> cartLine: Dados.cart.entrySet()) {
            preco_total += (cartLine.getKey().preco * cartLine.getValue());
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_encomenda, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView preco_totaltv = getView().findViewById(R.id.preco_total);
        preco_totaltv.setText(preco_total+" €");

        ListView list_encomenda = getView().findViewById(R.id.list_encomenda);
        list_encomenda.setAdapter(new Encomenda_Adapter(getContext()));
    }
}
