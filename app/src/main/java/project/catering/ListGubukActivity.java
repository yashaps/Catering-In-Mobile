package project.catering;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by hp on 4/15/2018.
 */

public class ListGubukActivity extends AppCompatActivity {

    private LinearLayout menuDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listgubuk);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        menuDescription = (LinearLayout) findViewById(R.id.menu_description);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("List Makanan");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        menuDescription.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ListGubukActivity.this,MenuDescriptionActivity.class);
                ListGubukActivity.this.startActivity(intent);
            }
        });
    }
}
