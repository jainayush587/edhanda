package com.example.edhanda.ChefFoodPanel;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.edhanda.R;

public class ChefProfileFragment extends Fragment {

    Button post;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_chef_profile, container, false);
        requireActivity().setTitle("Post Dish");

        post = v.findViewById(R.id.post_dish);
        post.setOnClickListener(v1 -> startActivity(new Intent(getContext(), Chef_PostDish.class)));

        return v;
    }
}