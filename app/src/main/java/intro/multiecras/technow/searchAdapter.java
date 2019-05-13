package intro.multiecras.technow;


import android.app.Activity;
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


/**
 * A simple {@link Fragment} subclass.
 */
public class searchAdapter extends BaseAdapter {
    private final Context ctx;
    Dados dados = new Dados();




    private int [] botoes = new int []{
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



    };









    searchAdapter(Context ctx) {
        this.ctx =ctx;
    }


    @Override
    public int getCount() {
        return this.botoescompara.length;
    }

    @Override
    public Object getItem(int position) {
        return this.botoescompara[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(this.ctx).inflate(R.layout.row_search,null);

        ImageView img = v.findViewById(R.id.imgItem);
        img.setImageResource(dados.produtos.get(position).idimg);

        TextView text = v.findViewById(R.id.textItem);
        text.setText(dados.produtos.get(position).nome);

        ImageButton bt = v.findViewById(R.id.addCarrinobutton);
        bt.setImageResource(this.botoes[position]);


        TextView precos = v.findViewById(R.id.textpreco);
        precos.setText(dados.produtos.get(position).preco);

        ImageButton btcomp= v.findViewById(R.id.addComparadorbutton);
        btcomp.setImageResource(this.botoescompara[position]);
        btcomp.setOnClickListener((View) ->{



            ComparadorItem comparador = new ComparadorItem();
            comparador.nome_prod=dados.produtos.get(position).nome;
            FragmentManager manager =((MainActivity)ctx).getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.render_fragment, comparador, comparador.getTag()).commit();


        });


    return v;

    }




}
