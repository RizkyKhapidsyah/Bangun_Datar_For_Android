package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.TextView;

public class Form_Trapesium_Sembarang_MC_HT extends Activity {
	TextView TV_Judul_T_Sembarang_MC_HT;
	TextView TV_SubJudul_T_Sembarang_MC_HT;
	ImageView IV_Gambar_T_Sembarang_MC_HT;
	TextView TV_Input_T_Sembarang_Luas_MC_HT;
	TextView TV_Input_T_Sembarang_SA_MC_HT;
	TextView TV_Input_T_Sembarang_SB_MC_HT;
	TextView TV_Output_T_Sembarang_T_MC_HT;
	TextView TV_SatuanNilai_T_Sembarang_Luas_MC_HT;
	TextView TV_SatuanNilai_T_Sembarang_SA_MC_HT;
	TextView TV_SatuanNilai_T_Sembarang_SB_MC_HT;
	TextView TV_SatuanNilai_T_Sembarang_T_MC_HT;
	EditText ET_Input_T_Sembarang_Luas_MC_HT;
	EditText ET_Input_T_Sembarang_SA_MC_HT;
	EditText ET_Input_T_Sembarang_SB_MC_HT;
	EditText ET_Output_T_Sembarang_T_MC_HT;
	Button Button_Hitung_T_Sembarang_MC_HT;
	Button Button_Reset_T_Sembarang_MC_HT;
	Button Button_Kembali_T_Sembarang_MC_HT;
	Button Button_Detail_T_Sembarang_MC_HT;
	Button Button_Rumus_TSMb_MC_HT;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_trapesium_sembarang_mc_ht);

        String CustomHuruf_T_Sembarang_MC_HT = "AGENCYR.TTF";
        Typeface TipeHuruf_T_Sembarang_MC_HT = Typeface.createFromAsset(getAssets(), CustomHuruf_T_Sembarang_MC_HT);

    	 TV_Judul_T_Sembarang_MC_HT = (TextView)findViewById(R.id.TV_Judul_T_Sembarang_MC_HT);
    	 TV_SubJudul_T_Sembarang_MC_HT = (TextView)findViewById(R.id.TV_SubJudul_T_Sembarang_MC_HT);
    	 IV_Gambar_T_Sembarang_MC_HT = (ImageView)findViewById(R.id.IV_Gambar_T_Sembarang_MC_HT);
    	 TV_Input_T_Sembarang_Luas_MC_HT = (TextView)findViewById(R.id.TV_Input_T_Sembarang_Luas_MC_HT);
    	 TV_Input_T_Sembarang_SA_MC_HT = (TextView)findViewById(R.id.TV_Input_T_Sembarang_SA_MC_HT);
    	 TV_Input_T_Sembarang_SB_MC_HT = (TextView)findViewById(R.id.TV_Input_T_Sembarang_SB_MC_HT);
    	 TV_Output_T_Sembarang_T_MC_HT = (TextView)findViewById(R.id.TV_Output_T_Sembarang_T_MC_HT);
    	 TV_SatuanNilai_T_Sembarang_Luas_MC_HT = (TextView)findViewById(R.id.TV_SatuanNilai_T_Sembarang_Luas_MC_HT);
    	 TV_SatuanNilai_T_Sembarang_SA_MC_HT = (TextView)findViewById(R.id.TV_SatuanNilai_T_Sembarang_SA_MC_HT);
    	 TV_SatuanNilai_T_Sembarang_SB_MC_HT = (TextView)findViewById(R.id.TV_SatuanNilai_T_Sembarang_SB_MC_HT);
    	 TV_SatuanNilai_T_Sembarang_T_MC_HT = (TextView)findViewById(R.id.TV_SatuanNilai_T_Sembarang_T_MC_HT);
    	 ET_Input_T_Sembarang_Luas_MC_HT = (EditText)findViewById(R.id.ET_Input_T_Sembarang_Luas_MC_HT);
    	 ET_Input_T_Sembarang_SA_MC_HT = (EditText)findViewById(R.id.ET_Input_T_Sembarang_SA_MC_HT);
    	 ET_Input_T_Sembarang_SB_MC_HT = (EditText)findViewById(R.id.ET_Input_T_Sembarang_SB_MC_HT);
    	 ET_Output_T_Sembarang_T_MC_HT = (EditText)findViewById(R.id.ET_Output_T_Sembarang_T_MC_HT);
    	 Button_Hitung_T_Sembarang_MC_HT = (Button)findViewById(R.id.Button_Hitung_T_Sembarang_MC_HT);
    	 Button_Reset_T_Sembarang_MC_HT = (Button)findViewById(R.id.Button_Reset_T_Sembarang_MC_HT);
    	 Button_Kembali_T_Sembarang_MC_HT = (Button)findViewById(R.id.Button_Kembali_T_Sembarang_MC_HT);
    	 Button_Detail_T_Sembarang_MC_HT = (Button)findViewById(R.id.Button_Detail_T_Sembarang_MC_HT);
    	 Button_Rumus_TSMb_MC_HT = (Button)findViewById(R.id.Button_Rumus_TSMb_MC_HT);

       	 TV_Judul_T_Sembarang_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 TV_SubJudul_T_Sembarang_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 TV_Input_T_Sembarang_Luas_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 TV_Input_T_Sembarang_SA_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 TV_Input_T_Sembarang_SB_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 TV_Output_T_Sembarang_T_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 TV_SatuanNilai_T_Sembarang_Luas_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 TV_SatuanNilai_T_Sembarang_SA_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 TV_SatuanNilai_T_Sembarang_SB_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 TV_SatuanNilai_T_Sembarang_T_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 ET_Input_T_Sembarang_Luas_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 ET_Input_T_Sembarang_SA_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 ET_Input_T_Sembarang_SB_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 ET_Output_T_Sembarang_T_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 Button_Hitung_T_Sembarang_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 Button_Reset_T_Sembarang_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 Button_Kembali_T_Sembarang_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 Button_Detail_T_Sembarang_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
    	 Button_Rumus_TSMb_MC_HT.setTypeface(TipeHuruf_T_Sembarang_MC_HT);
       	 
		 //menambahkan event klik untuk perintah di tombol hitung
    	 Button_Hitung_T_Sembarang_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_T_Sembarang_Luas_MC_HT.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Luas Trapesium. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_T_Sembarang_Luas_MC_HT.requestFocus();
					}		
					else if(ET_Input_T_Sembarang_SA_MC_HT.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Atas [sa]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_T_Sembarang_SA_MC_HT.requestFocus();
					}
					else if(ET_Input_T_Sembarang_SB_MC_HT.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Bawah [sb]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_T_Sembarang_SB_MC_HT.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_T_Sembarang_SA_MC_HT.getText().toString()) >= Double.parseDouble(ET_Input_T_Sembarang_SB_MC_HT.getText().toString())){
						Toast.makeText(getApplication(), "Maaf, nilai Sisi Atas [sa] tidak pernah lebih besar atau tidak pernah sama dengan nilai Sisi Bawah [sb] untuk Trapesium. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_T_Sembarang_SA_MC_HT.requestFocus();
					}
					else{	
						double I_LUAS_T_Sembarang_MC_HT = Double.parseDouble(ET_Input_T_Sembarang_Luas_MC_HT.getText().toString());
						double I_SA_T_Sembarang_MC_HT = Double.parseDouble(ET_Input_T_Sembarang_SA_MC_HT.getText().toString());
						double I_SB_T_Sembarang_MC_HT = Double.parseDouble(ET_Input_T_Sembarang_SB_MC_HT.getText().toString());
						double O_SA_T_Sembarang_MC_HT = 2 * I_LUAS_T_Sembarang_MC_HT / (I_SA_T_Sembarang_MC_HT + I_SB_T_Sembarang_MC_HT);
						
						ET_Output_T_Sembarang_T_MC_HT.setText(String.valueOf(O_SA_T_Sembarang_MC_HT));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	 Button_Reset_T_Sembarang_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_Sembarang_Luas_MC_HT.setText("");
				ET_Input_T_Sembarang_SA_MC_HT.setText("");
				ET_Input_T_Sembarang_SB_MC_HT.setText("");
				ET_Output_T_Sembarang_T_MC_HT.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_T_Sembarang_Luas_MC_HT.requestFocus();
			}
		});
    	 
    	 Button_Rumus_TSMb_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_Sembarang_Luas_MC_HT.setText(" Luas");
				ET_Input_T_Sembarang_SA_MC_HT.setText(" Sisi Atas [sa]");
				ET_Input_T_Sembarang_SB_MC_HT.setText(" Sisi Bawah [sb]");
				ET_Output_T_Sembarang_T_MC_HT.setText(" (2 x Luas)/((Jumlah Rusuk Sejajar))   (atau)   (2 x L)/((sa + sb))    (atau)   √(skr^2 - sbkr^2) (Phytagoras)");
				ET_Input_T_Sembarang_Luas_MC_HT.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
    	 Button_Kembali_T_Sembarang_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	 Button_Detail_T_Sembarang_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_Sembarang_MC_HT.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	 IV_Gambar_T_Sembarang_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_Sembarang_MC_HT.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
