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
 * Use the {@link Lunch#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Lunch extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Lunch() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Lunch.
     */
    // TODO: Rename and change types and number of parameters
    public static Lunch newInstance(String param1, String param2) {
        Lunch fragment = new Lunch();
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
        return inflater.inflate(R.layout.fragment_lunch, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button lasagna = view.findViewById(R.id.lasagne);
        lasagna.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String lasagna = "Lasagna With Chips";
                Bundle bundle = new Bundle();
                String Choice = "Lunch";
                bundle.putString("Choice",Choice);
                bundle.putString("Lunch",lasagna);
                Navigation.findNavController(v).navigate(R.id.action_lunch_to_drinks,bundle);

            }
        });

        Button chicken = view.findViewById(R.id.chickenRoll);
        chicken.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String lasagna = "Chicken Roll With Chips";
                Bundle bundle = new Bundle();
                String Choice = "Lunch";
                bundle.putString("Choice",Choice);
                bundle.putString("Lunch",lasagna);

                Navigation.findNavController(v).navigate(R.id.action_lunch_to_drinks,bundle);

            }
        });
        Button burger = view.findViewById(R.id.Burger);
        burger.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String lasagna = "Beef Burger With Chips";
                Bundle bundle = new Bundle();
                String Choice = "Lunch";
                bundle.putString("Choice",Choice);
                bundle.putString("Lunch",lasagna);

                Navigation.findNavController(v).navigate(R.id.action_lunch_to_drinks,bundle);

            }
        });
    }
}