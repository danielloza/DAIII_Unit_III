package mx.com.dloza.descendent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ChurchActivity extends AppCompatActivity {

    ListView list;
    String [][] data ={
            {getString(R.string.title_church_1).toString(),getString(R.string.location_church_1).toString() +
                    getString(R.string.location_2_church_1).toString(),getString(R.string.info_1_church_1).toString() +
                    getString(R.string.info_2_church_1).toString() +
                    getString(R.string.info_3_church_1).toString() +
                    getString(R.string.info_4_church_1).toString() +
                    getString(R.string.info_5_church_1).toString() +
                    getString(R.string.info_6_church_1).toString()},

            {getString(R.string.title_church_2).toString(),getString(R.string.location_church_2).toString(),
                    getString(R.string.info_1_church_2).toString() +
                    getString(R.string.info_2_church_2).toString() +
                    getString(R.string.info_3_church_2).toString() +
                    getString(R.string.info_4_church_2).toString()},

            {getString(R.string.title_church_3).toString(),getString(R.string.location_church_3).toString(),
                    getString(R.string.info_1_church_3).toString() +
                            getString(R.string.info_2_church_3).toString() +
                            getString(R.string.info_3_church_3).toString() +
                            getString(R.string.info_4_church_3).toString() +
                            getString(R.string.info_5_church_3).toString()},

            {getString(R.string.title_church_4).toString(),getString(R.string.location_church_4).toString(),getString(R.string.info_church_4).toString()},

            {getString(R.string.title_church_5).toString(),getString(R.string.location_church_5).toString(),getString(R.string.info_church_5).toString()},
    };

    int[] dataImg = {R.drawable.image_1,R.drawable.image_2,R.drawable.image_3,R.drawable.image_4,R.drawable.image_5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_church);

        list = findViewById(R.id.lv_list);

        list.setAdapter(new AdapterListElement(this, data, dataImg));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detailViewer = new Intent(view.getContext(),ChurchDetail.class);
                detailViewer.putExtra("TIT",data[i][0]);
                detailViewer.putExtra("DET",data[i][2]);
               // detailViewer.putExtra("IMG", dataImg[(Integer)view.getTag()]);
                startActivity(detailViewer);
            }
        });
    }
}
