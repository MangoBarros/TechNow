package intro.multiecras.technow;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.UUID;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdaptadorPesquisa1 extends BaseAdapter {
    private final Context ctx;

    private int [] botoes = new int []{
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho

    };

    private  String [] items = new String[]{
           "Computador",
            "Computador",
            "Computador",
            "Computador",
            "Computador",
            "Computador"

    };

    private int [] imgs  = new int[]{
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,
            R.drawable.carrinho,

    };



    public AdaptadorPesquisa1(Context ctx) {
        this.ctx =ctx;
    }


    @Override
    public int getCount() {
        return this.items.length;
    }

    @Override
    public Object getItem(int position) {
        return this.items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(this.ctx).inflate(R.layout.row_pesquisa1,null);

        ImageView img = v.findViewById(R.id.imgItem);
        img.setImageResource(this.imgs[position]);

        TextView text = v.findViewById(R.id.textItem);
        text.setText(this.items[position]);

        ImageButton bt = v.findViewById(R.id.addCarrinobutton);
        bt.setImageResource(this.botoes[position]);
        bt.setOnClickListener((View)->{

        });
    return v;
    }
}
