package intro.multiecras.technow;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static String dateMessage;
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

        login login = new login();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, login, login.getTag()).commit();
    }

    public void create_click(View view) {

        CreateAccount create = new CreateAccount();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, create, create.getTag()).commit();

    }

    public void carrinho_click(MenuItem item) {

        ShopCart cart = new ShopCart();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, cart, cart.getTag()).commit();
    }

    public void home_click(MenuItem item) {

        Home home = new Home();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, home, home.getTag()).commit();


    }

    public void definicoes_click(MenuItem item) {


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


            Home home = new Home();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.render_fragment, home, home.getTag()).commit();

        } else {
            Toast.makeText(this,"O nome ou a password estão incorretos",Toast.LENGTH_SHORT).show();
        }


    }

    public void comparador_click(MenuItem item) {

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

        Comparador comparador = new Comparador();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, comparador, comparador.getTag()).commit();
    }

    public void searchclick(View view) {

        // nao esquecer de fazer o if por causa da imagem

        Search search = new Search();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, search, search.getTag()).commit();

    }

    public void limpacarrinho(View view) {

        if (Dados.cart.size()==0){
            Toast.makeText(this, "O carrinho de compras já esta vazio", Toast.LENGTH_SHORT).show();

        } else {
            Dados.cart.clear();
            ShopCart cart = new ShopCart();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.render_fragment,cart,cart.getTag()).commit();

        }





    }

    public void encomendar(View view) {

        if(Dados.cart.size()==0){
            Toast.makeText(this, "Não pode encomendar porque o carrinho esta vazio", Toast.LENGTH_SHORT).show();

        }else{
            Encomenda encomenda = new Encomenda();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.render_fragment,encomenda,encomenda.getTag()).commit();


        }

    }



    public void encomenda_confirm(View view) {
        Double preco_total=0.0;
        String produtos="";
        for( int i=0; i<Dados.cart.size();i++){
            Product p =(Product)Dados.cart.keySet().toArray()[i];
            if (produtos.equals("")){
                produtos=p.nome;
            }else {
                produtos=(produtos+"\n"+p.nome);

            }


        }
        for(Map.Entry<Product, Integer> cartLine: Dados.cart.entrySet()) {
            preco_total += (cartLine.getKey().preco * cartLine.getValue());
        }

        EncomendaObj encomenda = new EncomendaObj(produtos,"",preco_total,"multibanco","");
        Dados.encomendas.add(encomenda);
        Encomenda_Morada morada = new Encomenda_Morada();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment,morada,morada.getTag()).commit();
        

    }

    public void limpa_encomenda(View view) {
        Dados.cart.clear();

        Encomenda encomenda = new Encomenda();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment,encomenda,encomenda.getTag()).commit();



    }

    public void pagamento_click(View view) {
        int numero=0;
        for(int i=0;i<Dados.moradas.size();i++){
            if (Dados.moradas.get(i).check)
                numero++;

        }

        if(numero==1){
            System.out.println(numero);

        } else {
            System.out.println(numero);
        }



    }

    public void multibanco_click(View view) {
        fragment_mulltibanco multibanco = new fragment_mulltibanco();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment,multibanco,multibanco.getTag()).commit();


    }

    public void multibanco_add_numero(View view) {
        int n = 0;
        n++;
        TextView tx = findViewById(R.id.insira_2);
        EditText Ex = findViewById(R.id.input_1);
        EditText Ex2 = findViewById(R.id.input_2);
        View v = findViewById(R.id.view_multibanco);


        if (tx.getVisibility()==View.INVISIBLE && Ex.getText().toString().matches("\\d\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d")){
            tx.setVisibility(View.VISIBLE);
            Ex2.setVisibility(View.VISIBLE);
            v.setVisibility(View.GONE);

        } else {
                if(tx.getVisibility()==View.INVISIBLE)
                    Toast.makeText(this, "Não inseriu um numero válido", Toast.LENGTH_SHORT).show();
                if(tx.getVisibility()==View.VISIBLE && Ex2.getText().toString().matches("\\d\\d\\d\\d\\d")&& Ex2.getText().toString().equals("12345")){
                    Dados.encomendas.get(Dados.encomendas.size()-1).pagamento=(""+Ex.getText().toString());
                    Encomenda_Datas datas = new Encomenda_Datas();
                    FragmentManager manager = getSupportFragmentManager();
                        manager.beginTransaction()
                                .replace(R.id.render_fragment,datas,datas.getTag()).commit();
                        return;


                }if(tx.getVisibility()==View.VISIBLE){
                Toast.makeText(this, "Não inseriu um numero válido", Toast.LENGTH_SHORT).show();

            }
        }


    }

    public void confirmar_final_click(View view) {
        Confirmar_Encomenda confirmar = new Confirmar_Encomenda();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment,confirmar,confirmar.getTag()).commit();






    }
    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
         this.dateMessage = (day_string +
                "/" + month_string + "/" + year_string);
    }

    public void encomenda_done(View view) {
        Dados.encomendas.get(Dados.encomendas.size()-1).confirmado=true;
        Home home = new Home();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment, home, home.getTag()).commit();

        Toast.makeText(this, "A encomenda foi concluida", Toast.LENGTH_SHORT).show();
    }

    public void morada_click(View view) {
        Encomenda_Morada morada = new Encomenda_Morada();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.render_fragment,morada,morada.getTag()).commit();
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
