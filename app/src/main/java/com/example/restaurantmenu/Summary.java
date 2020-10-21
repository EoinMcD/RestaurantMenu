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
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Summary#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Summary extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Summary() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Summary.
     */
    // TODO: Rename and change types and number of parameters
    public static Summary newInstance(String param1, String param2) {
        Summary fragment = new Summary();
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
        return inflater.inflate(R.layout.fragment_summary, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String Lunch,Starter,Dinner;

        Button Return = view.findViewById(R.id.returnButton);
        Return.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Navigation.findNavController(v).navigate(R.id.action_summary_to_home2);
                                      }
                                  });

        String Choice = getArguments().getString("Choice");
        if(Choice == "Lunch"){
            //System.out.println("Choice is Lunfsdfdsch");
            Lunch =getArguments().getString("Lunch");

            Starter = getArguments().getString("Starter");
            TextView food = view.findViewById(R.id.foodText);
            food.setText(Lunch);
            TextView starter = view.findViewById(R.id.starterText);
            starter.setText(Starter);

        }
        else{
            //System.out.println("Choice is " +Choice);
            Starter = getArguments().getString("Starter");
            Dinner = getArguments().getString("Dinner");
            TextView starter = view.findViewById(R.id.starterText);
            starter.setText(Starter);
            TextView food = view.findViewById(R.id.foodText);
            food.setText(Dinner);


        }
        String Drink = getArguments().getString("Drink");
        TextView drink = view.findViewById(R.id.drinkText);
        drink.setText(Drink);


    }
}