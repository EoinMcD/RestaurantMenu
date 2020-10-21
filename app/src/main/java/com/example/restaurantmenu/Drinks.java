package com.example.restaurantmenu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Drinks#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Drinks extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Drinks() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Drinks.
     */
    // TODO: Rename and change types and number of parameters
    public static Drinks newInstance(String param1, String param2) {
        Drinks fragment = new Drinks();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drinks, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button Guinness = view.findViewById(R.id.guinness);
        Guinness.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Lunch,Starter,Dinner;

                String guinness = "Guinness";
                Bundle bundle = new Bundle();
                String Choice = getArguments().getString("Choice");
                if(Choice == "Lunch"){
                    Lunch =getArguments().getString("Lunch");
                    bundle.putString("Choice",Choice);
                    bundle.putString("Lunch",Lunch);

                }
                else{
                    Starter = getArguments().getString("Starter");
                    Dinner = getArguments().getString("Dinner");
                    bundle.putString("Dinner",Dinner);
                    bundle.putString("Starter",Starter);

                }


                bundle.putString("Drink",guinness);

                Navigation.findNavController(v).navigate(R.id.action_drinks_to_summary,bundle);

            }
        });

        Button Whiskey = view.findViewById(R.id.whiskey);
        Whiskey.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Lunch,Starter,Dinner;
                String whiskey = "Whiskey";
                Bundle bundle = new Bundle();
                String Choice = getArguments().getString("Choice");
                if(Choice == "Lunch"){
                    Lunch =getArguments().getString("Lunch");
                    bundle.putString("Choice",Choice);
                    bundle.putString("Lunch",Lunch);

                }
                else{
                    Starter = getArguments().getString("Starter");
                    Dinner = getArguments().getString("Dinner");
                    bundle.putString("Dinner",Dinner);
                    //bundle.putString("Choice",Choice);
                    bundle.putString("Starter",Starter);

                }


                bundle.putString("Drink",whiskey);
                Navigation.findNavController(v).navigate(R.id.action_drinks_to_summary,bundle);

            }
        });
        Button Lucozade = view.findViewById(R.id.lucozade);
        Lucozade.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Lunch,Starter,Dinner;
                String lucozade = "Lucozade";
                Bundle bundle = new Bundle();
                String Choice = getArguments().getString("Choice");
                if(Choice == "Lunch"){

                    Lunch =getArguments().getString("Lunch");
                    bundle.putString("Choice",Choice);
                    bundle.putString("Lunch",Lunch);
                }
                else{
                    Starter = getArguments().getString("Starter");
                    Dinner = getArguments().getString("Dinner");
                    bundle.putString("Dinner",Dinner);
                    bundle.putString("Starter",Starter);

                }
                bundle.putString("Drink",lucozade);


                Navigation.findNavController(v).navigate(R.id.action_drinks_to_summary,bundle);

            }
        });
    }
}