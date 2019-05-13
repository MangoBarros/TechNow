package intro.multiecras.technow;


import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ComparadorItem extends Fragment {
    String nome_prod = null;


    public ComparadorItem() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        if (getArguments() != null)  nome_prod = getArguments().getString("prod_name");
        return inflater.inflate(R.layout.fragment_comparador_item, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }







    /*public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ListView pesquisa1 = getView().findViewById(R.id.listaPesquisa1);
        pesquisa1.setAdapter(new searchAdapter(getContext()));

    }
*/
}
