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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home_menu:
                    item.setChecked(true);
                    home_click(item);


                    return true;
                case R.id.shopping_cart_menu:
                    item.setChecked(true);
                    carrinho_click(item);

                    return true;
                case R.id.pesquisa_menu:
                    item.setChecked(true);
                    definicoes_click(item);
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
        CreateAccount create = new CreateAccount();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, create, create.getTag()).commit();

    }

    public void carrinho_click(MenuItem item) {
        Toast.makeText(this, "Carrinho de Compras", Toast.LENGTH_SHORT).show();
        ShopCart cart = new ShopCart();
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
        Search search = new Search();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, search, search.getTag()).commit();


    }



    public void createdClick(View view) {
        if (CreateAccount.nome.getError() == null && CreateAccount.nomeprop.getError()==null && CreateAccount.nomeapel.getError()==null && CreateAccount.nomeprop.getError()== null && CreateAccount.mail.getError()==null && CreateAccount.passwd.getError()==null){
            CreateAccount.info[0]= CreateAccount.nome.getText().toString();
            CreateAccount.info[1]= CreateAccount.passwd.getText().toString();
            CreateAccount.info[2]= CreateAccount.mail.getText().toString();
            CreateAccount.info[3]= CreateAccount.nomeprop.getText().toString();
            CreateAccount.info[4]= CreateAccount.nomeapel.getText().toString();
        }
        for(int i = 0; i< CreateAccount.info.length; i++){
            System.out.println(CreateAccount.info[i]);

        }
        for(int i=0;i<login.nomes.length;i++){
            if(login.nomes[i]==null){
                login.nomes[i]= CreateAccount.info[0];
                break;
            }

        }
        for(int i=0;i<login.passwords.length;i++){
            if(login.passwords[i]==null){
                login.passwords[i]= CreateAccount.info[1];
                break;
            }


        }
        Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
        Home home = new Home();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, home, home.getTag()).commit();
        for(int i=0;i<login.passwords.length;i++){
            System.out.println(login.passwords[i]);
        }
        for(int i=0;i<login.nomes.length;i++){
            System.out.println(login.nomes[i]);
        }

    }


    public void login_click_normal(View view) {
        Toast.makeText(this, "Iniciar Sessão", Toast.LENGTH_SHORT).show();
        login login = new login();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, login, login.getTag()).commit();
    }

    @Override
    public void onClick(View v) {

    }

    public void home_click(View view) {


        if (login.nome.getError() == null && login.nome.getText().length() > 0 && login.passwd.getError() == null){

            Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
            Home home = new Home();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.render_fragment, home, home.getTag()).commit();

        } else {
            Toast.makeText(this,"O nome ou a password estão incorretos",Toast.LENGTH_SHORT).show();
        }


    }

    public void comparador_click(MenuItem item) {
        Toast.makeText(this, "Comparador", Toast.LENGTH_SHORT).show();
        Comparador comparador = new Comparador();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, comparador, comparador.getTag()).commit();

    }
    public void comparador_click2(View view, int i) {


        ComparadorItem comparador = new ComparadorItem();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, comparador, comparador.getTag()).commit();

    }

    public void limpacomparador(View view) {
        Dados.produtosComparar.clear();
        Toast.makeText(this, "Comparador", Toast.LENGTH_SHORT).show();
        Comparador comparador = new Comparador();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, comparador, comparador.getTag()).commit();
    }

    public void searchclick(View view) {

        // nao esquecer de fazer o if por causa da imagem
        Toast.makeText(this, "Referências", Toast.LENGTH_SHORT).show();
        Search search = new Search();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, search, search.getTag()).commit();

    }






  /* class MyGestureDetector extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            try {
                if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
                    return false;
                // right to left swipe
                if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {

                    Toast.makeText(MainActivity.this, "Left Swipe", Toast.LENGTH_SHORT).show();
                    prevFoto();

                }  else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {

                    Toast.makeText(MainActivity.this, "Right Swipe", Toast.LENGTH_SHORT).show();
                    nextFoto();

                }
            } catch (Exception e) {
                // nothing
            }
            return false;
        }
    }
    private void prevFoto() {

        slider.showPrevious();
        slider.setInAnimation(this ,R.anim.slide_in_right);
        slider.setOutAnimation(this ,R.anim.slide_out_left);



    }
    private void nextFoto() {

        slider.showNext();
        slider.setInAnimation(this , android.R.anim.slide_in_left);
        slider.setOutAnimation(this , android.R.anim.slide_out_right);
    }
        /*public void onCreateSlider(){
        slider = findViewById(R.id.slider);

        for (int img: imgs){
            slideImage(img);
        }

        // ==================================================================
        // Gesture detection
        gestureDetector = new GestureDetector(this, new MyGestureDetector());
        gestureListener = new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                return gestureDetector.onTouchEvent(event);
            }
        };
        // ==================================================================
        slider.setOnClickListener(MainActivity.this);
        slider.setOnTouchListener(gestureListener);

    }
*/


    /*public void slideImage(int image){
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(image);
        slider.addView(imageView);
        slider.setFlipInterval(5000); // 5 SEG
        slider.setAutoStart(true);

        slider.setInAnimation(this , android.R.anim.slide_in_left);
        slider.setOutAnimation(this , android.R.anim.slide_out_right);
    }
     /* ViewFlipper slider;
    // ==================================================================
    // Implementação do swipe
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private GestureDetector gestureDetector;
    View.OnTouchListener gestureListener;
    // ==================================================================
    int imgs [] ={R.drawable.img_mac_carousel,R.drawable.img_nokia_carousel,R.drawable.img_gopro_carousel};

*/

}
