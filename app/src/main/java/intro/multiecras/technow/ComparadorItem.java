package intro.multiecras.technow;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ComparadorItem extends Fragment {


    public ComparadorItem() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        String nome_prod = getArguments().getString("prod_name");
        return inflater.inflate(R.layout.fragment_comparador_item, container, false);
    }

}
