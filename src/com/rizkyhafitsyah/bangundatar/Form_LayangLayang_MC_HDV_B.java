package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_LayangLayang_MC_HDV_B extends Activity {
	ImageView IV_Gambar_LL_MC_HDV_B;
	EditText ET_Input_LL_DH_MC_HDV_B;
	EditText ET_Input_LL_SMB_MC_HDV_B;
	EditText ET_Output_LL_DVB_MC_HDV_B;	
	Button Button_Hitung_LL_MC_HDV_B;
	Button Button_Reset_LL_MC_HDV_B;
	Button Button_Kembali_LL_MC_HDV_B;
	Button Button_Detail_LL_MC_HDV_B;
	Button Button_Rumus_LL_MC_HDV_B;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_layanglayang_mc_hdv_b);
		
		IV_Gambar_LL_MC_HDV_B = (ImageView)findViewById(R.id.IV_Gambar_LL_MC_HDV_B);
		ET_Input_LL_DH_MC_HDV_B = (EditText)findViewById(R.id.ET_Input_LL_DH_MC_HDV_B);
		ET_Input_LL_SMB_MC_HDV_B = (EditText)findViewById(R.id.ET_Input_LL_SMB_MC_HDV_B);
		ET_Output_LL_DVB_MC_HDV_B = (EditText)findViewById(R.id.ET_Output_LL_DVB_MC_HDV_B);
		Button_Hitung_LL_MC_HDV_B = (Button)findViewById(R.id.Button_Hitung_LL_MC_HDV_B);
		Button_Reset_LL_MC_HDV_B = (Button)findViewById(R.id.Button_Reset_LL_MC_HDV_B);
		Button_Kembali_LL_MC_HDV_B = (Button)findViewById(R.id.Button_Kembali_LL_MC_HDV_B);
		Button_Detail_LL_MC_HDV_B = (Button)findViewById(R.id.Button_Detail_LL_MC_HDV_B);
		Button_Rumus_LL_MC_HDV_B = (Button)findViewById(R.id.Button_Rumus_LL_MC_HDV_B);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_LL_MC_HDV_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_LL_DH_MC_HDV_B.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Diagonal Horizontal [dh]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DH_MC_HDV_B.requestFocus();
					}
					else if(ET_Input_LL_SMB_MC_HDV_B.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Sisi Miring bagian Bawah layang layang [smb]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_SMB_MC_HDV_B.requestFocus();
					}
					else{	
						double I_DH_LL_MC_HDV_B = Double.parseDouble(ET_Input_LL_DH_MC_HDV_B.getText().toString());
						double I_SMB_LL_MC_HDV_B = Double.parseDouble(ET_Input_LL_SMB_MC_HDV_B.getText().toString());
						double Setengah_DH_LL_MC_HDV_B = I_DH_LL_MC_HDV_B / 2;
						double O_DVB_LL_MC_HDV_B = Math.sqrt(Math.pow(I_SMB_LL_MC_HDV_B, 2) - Math.pow(Setengah_DH_LL_MC_HDV_B, 2));
						ET_Output_LL_DVB_MC_HDV_B.setText(String.valueOf(O_DVB_LL_MC_HDV_B));
						}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_LL_MC_HDV_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_DH_MC_HDV_B.setText("");
				ET_Input_LL_SMB_MC_HDV_B.setText("");
				ET_Output_LL_DVB_MC_HDV_B.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_LL_DH_MC_HDV_B.requestFocus();
			}
		});

		Button_Rumus_LL_MC_HDV_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_DH_MC_HDV_B.setText(" Diagonal Horizontal [dh]");
				ET_Input_LL_SMB_MC_HDV_B.setText(" Sisi Miring Bawah [smb]");
				ET_Output_LL_DVB_MC_HDV_B.setText(" √(smb^2 - (1/2  x dh)^2)");
				ET_Input_LL_DH_MC_HDV_B.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_LL_MC_HDV_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_LL_MC_HDV_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_HDV_B.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_LL_MC_HDV_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_HDV_B.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
