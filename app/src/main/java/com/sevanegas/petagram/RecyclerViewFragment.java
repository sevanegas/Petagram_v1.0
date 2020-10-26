package com.sevanegas.petagram;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    ArrayList<Datos_Mascotas> mascotas;
    private RecyclerView ListaMascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        ListaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializaAdaptador();
        return v;
    }

    public void inicializaAdaptador (){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        ListaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas () {

        mascotas = new ArrayList<Datos_Mascotas>();
        mascotas.add(new Datos_Mascotas("Max",R.drawable.perro_1));
        mascotas.add(new Datos_Mascotas("Kira",R.drawable.perro_2));
        mascotas.add(new Datos_Mascotas("Dominic",R.drawable.perro_3));
        mascotas.add(new Datos_Mascotas("Dante",R.drawable.perro_4));
        mascotas.add(new Datos_Mascotas("Lucas",R.drawable.perro_5));
        mascotas.add(new Datos_Mascotas("Oliver",R.drawable.perro_6));
        mascotas.add(new Datos_Mascotas("Mia",R.drawable.perro_7));
        mascotas.add(new Datos_Mascotas("Luna",R.drawable.perro_8));
        mascotas.add(new Datos_Mascotas("Maya",R.drawable.perro_9));
        mascotas.add(new Datos_Mascotas("Tarcan",R.drawable.perro_10));

    }
}
