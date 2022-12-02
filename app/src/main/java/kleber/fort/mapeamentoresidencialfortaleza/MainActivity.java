package kleber.fort.mapeamentoresidencialfortaleza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import kleber.fort.mapeamentoresidencialfortaleza.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();

        ArrayAdapter<CharSequence> adptResidenciais = ArrayAdapter.createFromResource(this,
                R.array.Residenciais, android.R.layout.simple_spinner_item);

        adptResidenciais.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spnResidenciais.setAdapter(adptResidenciais);




        ArrayAdapter<CharSequence> adptQuadraJE = ArrayAdapter.createFromResource(this,
                R.array.Quadras_Jose_Euclides, android.R.layout.simple_spinner_item);
        adptQuadraJE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spnQuadras.setAdapter(adptQuadraJE);


        ArrayAdapter<CharSequence> adptBlocosAteTreze = ArrayAdapter.createFromResource(this,
                R.array.lista_bloco_ate13, android.R.layout.simple_spinner_item);
        adptBlocosAteTreze.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spnBlocos.setAdapter(adptBlocosAteTreze);



/*
        ArrayAdapter<CharSequence> adptQuadraLG = ArrayAdapter.createFromResource(this,
                R.array.Quadras_Luis_Gonzaga, android.R.layout.simple_spinner_item);

        adptQuadraLG.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spnQuadras.setAdapter(adptQuadraLG);
*/



    }
}