package mx.com.dloza.descendent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void galleryActivity (View view){
        Intent intent= new Intent(MenuActivity.this, GalleryActivity.class);
        startActivity(intent);
        //finish();
    }

    public void churchActivity (View view){
        Intent intent= new Intent(MenuActivity.this,ChurchActivity.class);
        startActivity(intent);
    }

}
