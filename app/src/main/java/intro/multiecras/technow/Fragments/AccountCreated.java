package intro.multiecras.technow.Fragments;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import intro.multiecras.technow.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccountCreated extends DialogFragment {


    public AccountCreated() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account_created, container, false);
    }

}
