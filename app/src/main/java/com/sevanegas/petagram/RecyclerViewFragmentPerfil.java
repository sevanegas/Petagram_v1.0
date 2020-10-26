package com.sevanegas.petagram;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewFragmentPerfil extends Fragment {

    ArrayList<Datos_Mascota_Grind> mas;
    private RecyclerView ListaMas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_recyclerview_perfil, container, false);

        ListaMas = (RecyclerView) v.findViewById(R.id.rvMascotasFrag);
        ListaMas.setLayoutManager(new GridLayoutManager(v.getContext(),3 ));

        inicializarListaMascotas();
        inicializaAdaptador();
        return v;
    }

    public void inicializaAdaptador (){
        MascotaAdaptadorGrind adaptador = new MascotaAdaptadorGrind(mas);
        ListaMas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas () {

        mas = new ArrayList<Datos_Mascota_Grind>();
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"50",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"20",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"12",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"100",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"250",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"3",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"78",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"96",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"500",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"10",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"56",R.drawable.hueso_a));
        mas.add(new Datos_Mascota_Grind(R.drawable.perro_10,"37",R.drawable.hueso_a));




    }



    }

