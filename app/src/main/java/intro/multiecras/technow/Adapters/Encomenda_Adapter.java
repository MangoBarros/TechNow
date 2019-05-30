package intro.multiecras.technow.Adapters;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

import intro.multiecras.technow.Dados;
import intro.multiecras.technow.Objetos.Product;
import intro.multiecras.technow.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Encomenda_Adapter extends BaseAdapter {
    private Context ctx;
    private final HashMap<Product, Integer> cart;


    public Encomenda_Adapter(Context ctx) {
        this.ctx =ctx;
        this.cart = Dados.cart;
    }




    @Override
    public int getCount() {
        return this.cart.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(this.ctx).inflate(R.layout.row_confirm,null);


        Product p = (Product) this.cart.keySet().toArray()[position];
        int times = (int)this.cart.values().toArray()[position];

        ImageView img = v.findViewById(R.id.imgItem5);

        img.setImageResource(p.idimg);

        TextView text = v.findViewById(R.id.textItem2);
        text.setText(p.nome);


        TextView precos = v.findViewById(R.id.textpreco5);
        precos.setText(""+p.preco+" €");

        TextView quantidade = v.findViewById(R.id.quantidade);
        quantidade.setText("Quantidade: " + times);

        ImageButton btdelete = v.findViewById(R.id.removeCarrinhobutton);
        btdelete.setImageResource(R.drawable.delete);
        btdelete.setOnClickListener((View) ->{

            Dados.cart.remove(p);
            notifyDataSetChanged();
            Toast.makeText(ctx, "Removeu com sucesso", Toast.LENGTH_SHORT).show();


        });

        return v;

    }
}


