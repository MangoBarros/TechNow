package intro.multiecras.technow;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import static intro.multiecras.technow.R.drawable.carrinho;


/**
 * A simple {@link Fragment} subclass.
 */
public class login extends Fragment {

    public static String[] nomes = new String[20];
    public static String[] passwords = new String[20];

    public static EditText passwd;
    public static EditText  nome;


    public login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        nomes[0]="joao";
        passwords[0]="123321";


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

         passwd = getActivity().findViewById(R.id.input_passwd);
         nome = getActivity().findViewById(R.id.input_nome);
         passwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String n = "";


                for (int i = 0; i < passwords.length; i++) {
                    if (s.toString().equals(passwords[i]) && nomes[i].equals(nome.getText().toString())) {
                        n = s.toString();
                        break;
                    } else n = "";

                }
                if (!s.toString().equals(n)) {
                    passwd.setError("Palavra passe incorreta");
                } else passwd.setError(null);

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        nome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String n = "";


                for (int i = 0; i < nomes.length; i++) {

                    if (s.toString().equals(nomes[i])) {
                        n = s.toString();
                        break;
                    } else n = "";

                }

                if (!s.toString().equals(n)) {
                    nome.setError("Nome não existe");
                } else nome.setError(null);

            }

        });






    }
}
