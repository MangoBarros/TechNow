package intro.multiecras.technow;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Confirmar_Encomenda extends Fragment {


    public Confirmar_Encomenda() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        return inflater.inflate(R.layout.fragment_confirmar__encomenda, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView tx1 = getActivity().findViewById(R.id.produtosfinais);
        TextView tx2 = getActivity().findViewById(R.id.precosfinais);
        TextView tx3 = getActivity().findViewById(R.id.moradasfinais);
        TextView tx4 = getActivity().findViewById(R.id.datasfinais);
        TextView tx5 = getActivity().findViewById(R.id.metodopagarfinais);
        System.out.println(Dados.encomendas.get(Dados.encomendas.size()-1).produtos);
        tx1.setText(Dados.encomendas.get(Dados.encomendas.size()-1).produtos);
        tx2.setText(""+Dados.encomendas.get(Dados.encomendas.size()-1).preco);
        tx3.setText(Dados.encomendas.get(Dados.encomendas.size()-1).morada);
        tx4.setText(MainActivity.dateMessage);
        tx5.setText(Dados.encomendas.get(Dados.encomendas.size()-1).pagamento);


    }
}
