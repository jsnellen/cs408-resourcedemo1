package edu.jsu.mcis.cs408.resourcedemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import edu.jsu.mcis.cs408.resourcedemo1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private boolean coinHeads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        coinHeads = true;

    }

    public void onClick(View v) {
        updateCoinState();
    }

    public void updateCoinState() {

        coinHeads = !coinHeads;

        if (coinHeads)
            binding.button.setImageResource(R.drawable.heads);
        else
            binding.button.setImageResource(R.drawable.tails);

    }

}