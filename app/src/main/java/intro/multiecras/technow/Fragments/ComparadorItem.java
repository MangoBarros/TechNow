package intro.multiecras.technow.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import intro.multiecras.technow.Dados;
import intro.multiecras.technow.Objetos.Product;
import intro.multiecras.technow.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ComparadorItem extends Fragment {

    String nome_prod=null;

    int pos = 0;

    public void setPos(int pos) {
        this.pos = pos;
    }

    public ComparadorItem() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        if (getArguments() != null)  nome_prod = getArguments().getString("prod_name");
        System.out.println(nome_prod);
        return inflater.inflate(pos == 1 ? R.layout.fragment_comparador_item : R.layout.fragment_comparador_item2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (nome_prod == null) return;

        Product p = null;

        for(Product pp: Dados.produtos) {
            if (pp.nome.equals(nome_prod)) {
                p = pp;
                break;
            }
        }

        System.out.println(p);

        if (pos == 1) {
            ImageView img = getActivity().findViewById(R.id.imgItemC);
            img.setImageResource(p.idimg);

            TextView textsp = getActivity().findViewById(R.id.specs);
            textsp.setText(p.spec);

            TextView textpr = getActivity().findViewById(R.id.precos);
            textpr.setText(p.preco+ "€");
            TextView textnome = getActivity().findViewById(R.id.nomeitemC);
            textnome.setText(p.nome);
        } else if (pos == 2) {
            ImageView img = getActivity().findViewById(R.id.imgItemC2);
            img.setImageResource(p.idimg);

            TextView textsp = getActivity().findViewById(R.id.specs2);
            textsp.setText(p.spec);

            TextView textpr = getActivity().findViewById(R.id.precos2);
            textpr.setText(p.preco+" €");

            TextView textnome = getActivity().findViewById(R.id.nomeitemC2);
            textnome.setText(p.nome);
        }



    }







    /*public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ListView pesquisa1 = getView().findViewById(R.id.listaPesquisa1);
        pesquisa1.setAdapter(new SearchAdapter(getContext()));

    }
*/
}
