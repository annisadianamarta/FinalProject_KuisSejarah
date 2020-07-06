package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HasilSkor extends AppCompatActivity {
    TextView mtvHasilAkhir;
    Button mbtnMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_skor);

        mtvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        mbtnMenu = (Button) findViewById(R.id.btnMenu);

        setSkor();

        mbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HasilSkor.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

        public void setSkor(){
            //hasil lemparan (putExtra) dari activity sebelumnya ditampung dalam variabel lokal
            String activity = getIntent().getStringExtra("activity");
            String skorPilGan = getIntent().getStringExtra("skorAkhir");
            String skorEssay = getIntent().getStringExtra("skorAkhir2");

            if(activity.equals("PilihanGanda")){ //jika var activity bernilai PilihanGanda
                //dipastikan activity sebelumnya datang dari kelas KuisPilihanGanda
                //maka skornya diatur dari skorPilGan
                mtvHasilAkhir.setText("SKOR : "+skorPilGan);
            }else{
                //dipastikan activity sebelumnya datang dari kelas KuisEssay
                //maka skornya diatur dari skorEssay
                mtvHasilAkhir.setText("SKOR : "+skorEssay);
            }
    }

    public void onBackPressed() {
        Toast.makeText(this, "Tidak bisa kembali, silahkan tekan menu", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }


}
