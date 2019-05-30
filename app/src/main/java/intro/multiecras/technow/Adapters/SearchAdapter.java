package intro.multiecras.technow.Adapters;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import intro.multiecras.technow.Fragments.Comparador;
import intro.multiecras.technow.Dados;
import intro.multiecras.technow.MainActivity;
import intro.multiecras.technow.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchAdapter extends BaseAdapter {
    private final Context ctx;




    /*private int [] botoes = new int []{
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho


    };
    private int [] botoescompara = new int []{
            R.drawable.compara,
            R.drawable.compara,
            R.drawable.compara,
            R.drawable.compara,
            R.drawable.compara,
            R.drawable.compara,
            R.drawable.compara,
            R.drawable.compara,
            R.drawable.compara



    };*/

    public SearchAdapter(Context ctx) {
        this.ctx =ctx;
    }


    @Override
    public int getCount() {
        return Dados.produtos.size();
    }

    @Override
    public Object getItem(int position) {
        return Dados.produtos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(this.ctx).inflate(R.layout.row_search,null);


        ImageView img = v.findViewById(R.id.imgItem);

        img.setImageResource(Dados.produtos.get(position).idimg);

        TextView text = v.findViewById(R.id.textItem);
        text.setText(Dados.produtos.get(position).nome);

        ImageButton bt = v.findViewById(R.id.addCarrinobutton);
        bt.setImageResource(R.drawable.carrinho);
        bt.setOnClickListener((View)->{
                if(Dados.cart.containsKey(Dados.produtos.get(position))){
                    Dados.cart.put(Dados.produtos.get(position),Dados.cart.get(Dados.produtos.get(position)) + 1);
                    Toast.makeText(ctx, "Adicionou com sucesso", Toast.LENGTH_SHORT).show();
                } else {
                    Dados.cart.put(Dados.produtos.get(position), 1);
                    Toast.makeText(ctx, "Adicionou com sucesso", Toast.LENGTH_SHORT).show();
                }

        });


        TextView precos = v.findViewById(R.id.textpreco);
        precos.setText(Dados.produtos.get(position).preco+" €");

        ImageButton btcomp= v.findViewById(R.id.addComparadorbutton);
        btcomp.setImageResource(R.drawable.compara);
        btcomp.setOnClickListener((View) ->{


            if(Dados.produtosComparar.size() == 2) Dados.produtosComparar.clear();

            Dados.produtosComparar.add(Dados.produtos.get(position));
            Comparador comparador = new Comparador();
            FragmentManager manager =((MainActivity)ctx).getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.render_fragment, comparador, comparador.getTag()).commit();


        });


    return v;

    }




}
