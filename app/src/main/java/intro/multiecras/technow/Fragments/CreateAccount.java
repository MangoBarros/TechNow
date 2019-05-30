package intro.multiecras.technow.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import intro.multiecras.technow.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreateAccount extends Fragment {
    public static String[] info = new String[]{
            "",
            "",
            "",
            "",
            ""

    };

    public static EditText passwd;
    public static EditText  nome;
    public static EditText nomeprop;
    public static EditText  nomeapel;
    public static EditText mail;



    public CreateAccount() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_account, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        passwd = getActivity().findViewById(R.id.input_passwd);
        nome = getActivity().findViewById(R.id.input_nome);
        nomeapel = getActivity().findViewById(R.id.apelido);
        nomeprop = getActivity().findViewById(R.id.nome_proprio);
        mail = getActivity().findViewById(R.id.input_email);


        passwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length()<5){
                    passwd.setError("A palavra passe tem de ter pelo Menos 5 digitos");
                }

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

                for(int i = 0; i< login.nomes.length; i++){
                    if(s.toString().equals(login.nomes[i])){
                        nome.setError("Este nome ja foi escolhido");
                        break;
                    }

                }


            }
        });

        nomeapel.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length()==0){
                    nomeapel.setError("Este Campo é obrigatorio");
                }

            }
        });


        nomeprop.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length()==0){
                    nomeprop.setError("Este Campo é obrigatorio");
                }

            }
        });

        mail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.toString().matches("(.+)\\@(.+)\\.(.+)")) {

                } else {
                    mail.setError("O Mail não é valido");

                }

            }

        });



    }
}
