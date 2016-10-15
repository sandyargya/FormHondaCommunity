package id.sch.smktelkom_mlg.tugas01.xiirpl2035.hondacommunityid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etEmail, etNama, etAlamat, etProvinsi, etSim, etTlp, etTTL, etTipe, etRangka, etKotaC, etNamaC;
    Spinner spAgama;
    CheckBox cbMo, cbTo, cbSb, cbVo, cbLa;
    RadioGroup rg;
    Button bOk;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = (EditText) findViewById(R.id.email);
        etNama = (EditText) findViewById(R.id.nama);
        etAlamat = (EditText) findViewById(R.id.alamat);
        etProvinsi = (EditText) findViewById(R.id.kotakabupaten);
        etSim = (EditText) findViewById(R.id.SIM);
        etTlp = (EditText) findViewById(R.id.telepon);
        etTTL = (EditText) findViewById(R.id.lahir);
        etTipe = (EditText) findViewById(R.id.tipemotor);
        etRangka = (EditText) findViewById(R.id.rangka);
        etKotaC = (EditText) findViewById(R.id.kotaklub);
        etNamaC = (EditText) findViewById(R.id.klub);

        spAgama = (Spinner) findViewById(R.id.spinner);

        cbTo = (CheckBox) findViewById(R.id.checkBoxTour);
        cbMo = (CheckBox) findViewById(R.id.checkBoxModif);
        cbSb = (CheckBox) findViewById(R.id.checkBoxSepak);
        cbVo = (CheckBox) findViewById(R.id.checkBoxVoll);
        cbLa = (CheckBox) findViewById(R.id.checkBoxLain);

        rg = (RadioGroup) findViewById(R.id.radioGroupJK);
        bOk = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });

    }

    private void doClick() {
        if (isValid()) ;
        {
        }
    }


    private boolean isValid() {
        boolean valid = true;

        String email = etEmail.getText().toString();
        if (email.isEmpty()) {
            etEmail.setError("Isi Email!");
        }
        String nama = etNama.getText().toString();
        if (email.isEmpty()) {
            etNama.setError("Isi Nama!");
        }

        String alamat = etAlamat.getText().toString();
        if (alamat.isEmpty()) {
            etAlamat.setError("Isi Alamat!");
        }

        String prov = etProvinsi.getText().toString();
        if (prov.isEmpty()) {
            etProvinsi.setError("Isi Alamat!");
        }

        String sim = etSim.getText().toString();
        if (sim.isEmpty()) {
            etSim.setError("Isi Alamat!");
        }

        String agama = "";
        if (agama == null) {
            agama = "Pilih agama!";
        } else agama = spAgama.getSelectedItem().toString();

        String nom = etTlp.getText().toString();
        if (nom.isEmpty()) {
            etTlp.setError("Isi Nomor Tlpn!");
        }

        String hobby = "";
        int startlen = hobby.length();
        if (cbTo.isChecked()) hobby += cbTo.getText() + ", ";
        if (cbMo.isChecked()) hobby += cbMo.getText() + ", ";
        if (cbSb.isChecked()) hobby += cbSb.getText() + ", ";
        if (cbVo.isChecked()) hobby += cbVo.getText() + ", ";
        if (cbLa.isChecked()) hobby += cbLa.getText() + ", ";
        if (hobby.length() == startlen) hobby += "Pilih Hobby!";

        String lahir = etTTL.getText().toString();
        if (lahir.isEmpty()) {
            etTTL.setError("Isi TTL!");
        }

        String jk = null;


        if (rg.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            jk = rb.getText().toString();
            if (jk == null) {
                jk = "Pilih Jenis Kelamin";
            }
        }
        String tipe = etTipe.getText().toString();
        if (tipe.isEmpty()) {
            etTipe.setError("Isi Tipe Motor!");
        }

        String rangka = etRangka.getText().toString();
        if (rangka.isEmpty()) {
            etRangka.setError("Isi No Rangka Motor!");
        }

        String kotac = etKotaC.getText().toString();
        if (kotac.isEmpty()) {
            etKotaC.setError("Isi No Rangka Motor!");
        }

        String namac = etNamaC.getText().toString();
        if (namac.isEmpty()) {
            etNamaC.setError("Isi No Rangka Motor!");
        }

        tvHasil.setText(
                "Email          : " + email +
                        "\n\nNama            : " + nama +
                        "\n\nAlamat           : " + alamat +
                        "\n\nProvinsi            :" + prov +
                        "\n\nSIM            : " + sim +
                        "\n\nAgama            : " + agama +
                        "\n\nNomor            : " + nom +
                        "\n\nHobby            : " + hobby +
                        "\n\nTTL              : " + lahir +
                        "\n\nJenis Kelamin      : " + jk +
                        "\n\nTipe            : " + tipe +
                        "\n\nNo Rangka            : " + rangka +
                        "\n\nKota Club            : " + kotac +
                        "\n\nNama Club            : " + namac

        );


        return true;
    }


}
