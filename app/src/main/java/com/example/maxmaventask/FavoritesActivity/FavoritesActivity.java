package com.example.maxmaventask.FavoritesActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.maxmaventask.R;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Context context = FavoritesActivity.this;
        RecyclerView recyclerView=findViewById(R.id.rv_fev);
    }
}