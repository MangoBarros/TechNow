package intro.multiecras.technow;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Morada_Adapter extends BaseAdapter {
        private Context ctx;

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

        return v;
    }
}
