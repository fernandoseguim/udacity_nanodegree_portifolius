package it.seguim.apps.portifolius;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnPopularMovies = (Button)findViewById(R.id.btn_popular_movies);
        final Button btnStockHawk = (Button)findViewById(R.id.btn_stock_hawk);
        final Button btnBuildItBigger = (Button)findViewById(R.id.btn_built_it_bigger);
        final Button btnMakeYouAppMaterial = (Button)findViewById(R.id.btn_make_your_app_material);
        final Button btnGoUbiquitious = (Button)findViewById(R.id.btn_go_ubiquitious);
        final Button btnCapstone = (Button)findViewById(R.id.btn_capstone);

        btnPopularMovies.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage((String)btnPopularMovies.getText());
                    }
                }
        );

        btnStockHawk.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage((String)btnStockHawk.getText());
                    }
                }
        );

        btnBuildItBigger.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage((String)btnBuildItBigger.getText());
                    }
                }
        );

        btnMakeYouAppMaterial.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage((String)btnMakeYouAppMaterial.getText());
                    }
                }
        );

        btnGoUbiquitious.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage((String)btnGoUbiquitious.getText());
                    }
                }
        );

        btnCapstone.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage((String)btnCapstone.getText());
                    }
                }
        );

    }

    private void showMessage(String appName){

        String msg = getString(R.string.msg_toast_app) + " " + appName;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

}
