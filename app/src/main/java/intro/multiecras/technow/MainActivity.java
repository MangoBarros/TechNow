package intro.multiecras.technow;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home_menu:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.shopping_cart:
                    mTextMessage.setText(getString(R.string.carrinho));
                    return true;
                case R.id.pesquisa_menu:
                    mTextMessage.setText(getString(R.string.pesquisa_menu));
                    return true;
            }
            return false;
        }
    };

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }




    public void login_click(MenuItem item) {
        Toast.makeText(this, "Iniciar Sessão", Toast.LENGTH_SHORT).show();
        login login = new login();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, login, login.getTag()).commit();
    }

    public void create_click(View view) {
        Toast.makeText(this, "Iniciar Sessão", Toast.LENGTH_SHORT).show();
        createAccount create = new createAccount();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, create, create.getTag()).commit();

    }

    public void carrinho_click(MenuItem item) {
        Toast.makeText(this, "Carrinho de Compras", Toast.LENGTH_SHORT).show();
        shop_cart cart = new shop_cart();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, cart, cart.getTag()).commit();
    }

    public void home_click(MenuItem item) {
        Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
        Home home = new Home();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, home, home.getTag()).commit();


    }
    public void definicoes_click(MenuItem item) {

        Toast.makeText(this, "Referências", Toast.LENGTH_SHORT).show();
        search search = new search();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, search, search.getTag()).commit();


    }

}

