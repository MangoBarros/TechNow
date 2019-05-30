package intro.multiecras.technow.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import intro.multiecras.technow.Adapters.Carrinho_Adapter;
import intro.multiecras.technow.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopCart extends Fragment {


    public ShopCart() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop_cart, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ListView list_carrinho = getView().findViewById(R.id.list_carrinho);
        list_carrinho.setAdapter(new Carrinho_Adapter(getContext()));
    }
}
