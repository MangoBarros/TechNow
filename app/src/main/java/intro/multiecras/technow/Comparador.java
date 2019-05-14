package intro.multiecras.technow;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Comparador extends Fragment {


    public Comparador() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comparador, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout l1 = getActivity().findViewById(R.id.comp_1);
        LinearLayout l2 = getActivity().findViewById(R.id.comp_2);

        if (Dados.produtosComparar.size() <= 0) {
            ComparadorItem ci1 = new ComparadorItem();
            ci1.setPos(1);
            ComparadorItem ci2 = new ComparadorItem();
            ci2.setPos(2);

            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.comp_1, ci1, ci1.getTag()).commit();
            manager.beginTransaction()
                    .replace(R.id.comp_2, ci2, ci2.getTag()).commit();
        } else if (Dados.produtosComparar.size() == 1) {
            Bundle b1 = new Bundle();
            Bundle b2 = new Bundle();

            b1.putString("prod_name", Dados.produtosComparar.get(0).nome);
            b2.putString("prod_name", null);

            ComparadorItem ci1 = new ComparadorItem();
            ci1.setPos(1);
            ComparadorItem ci2 = new ComparadorItem();
            ci2.setPos(2);
            ci1.setArguments(b1);
            ci2.setArguments(b2);

            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.comp_1, ci1, ci1.getTag()).commit();
            manager.beginTransaction()
                    .replace(R.id.comp_2, ci2, ci2.getTag()).commit();
        } else if (Dados.produtosComparar.size() == 2) {
            Bundle b1 = new Bundle();
            Bundle b2 = new Bundle();

            b1.putString("prod_name", Dados.produtosComparar.get(0).nome);
            b2.putString("prod_name", Dados.produtosComparar.get(1).nome);

            ComparadorItem ci1 = new ComparadorItem();
            ci1.setPos(1);
            ComparadorItem ci2 = new ComparadorItem();
            ci2.setPos(2);
            ci1.setArguments(b1);
            ci2.setArguments(b2);

            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.comp_1, ci1, ci1.getTag()).commit();
            manager.beginTransaction()
                    .replace(R.id.comp_2, ci2, ci2.getTag()).commit();
        }


    }
}
