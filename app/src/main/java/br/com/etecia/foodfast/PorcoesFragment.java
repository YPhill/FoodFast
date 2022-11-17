package br.com.etecia.foodfast;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PorcoesFragment extends Fragment {
    EditText edtPorcoes;
    Button btnEscolhas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_porcoes, container, false);

        edtPorcoes = view.findViewById(R.id.edtPorcoes);
        btnEscolhas = view.findViewById(R.id.btnEscolha);

        edtPorcoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnEscolhas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = edtPorcoes.getText().toString();
                Toast.makeText(getContext(), "Você escolheu ",
                        Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}