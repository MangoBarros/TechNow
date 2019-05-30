package intro.multiecras.technow.Adapters;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import intro.multiecras.technow.Dados;
import intro.multiecras.technow.Fragments.Encomenda_Pagamento;
import intro.multiecras.technow.MainActivity;
import intro.multiecras.technow.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Morada_Adapter extends BaseAdapter {
        private Context ctx;
        private int numero;

    public Morada_Adapter(Context ctx) {
        this.ctx = ctx;

    }


    @Override
    public int getCount() {
        return Dados.moradas.size();
    }

    @Override
    public Object getItem(int position) {
        return Dados.moradas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(this.ctx).inflate(R.layout.row_morada,null);


        TextView tx = v.findViewById(R.id.moradas);
        tx.setText(Dados.moradas.get(position).cidade+"\n"+Dados.moradas.get(position).rua+"\n"+"nº Porta: "+Dados.moradas.get(position).nPorta);
        String t =(Dados.moradas.get(position).cidade+"\n"+Dados.moradas.get(position).rua+"\n"+"nº Porta: "+Dados.moradas.get(position).nPorta);

        ImageButton ib = v.findViewById(R.id.selecion_morada);
        ib.setOnClickListener((View) ->{

            Dados.encomendas.get(Dados.encomendas.size()-1).morada=t;

            Encomenda_Pagamento pagamento = new Encomenda_Pagamento();
            FragmentManager manager =((MainActivity)ctx).getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.render_fragment, pagamento, pagamento.getTag()).commit();

        });
        return v;
    }
}
