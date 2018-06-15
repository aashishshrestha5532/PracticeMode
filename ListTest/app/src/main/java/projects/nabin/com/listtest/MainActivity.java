package projects.nabin.com.listtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<HashMap<String,String>> modelList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.listView);


        modelList=new ArrayList<>();


        ExampleModel model;
        for(int i=0;i<5;i++) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("name", "pokhara");
            hashMap.put("popn", "23232");
            modelList.add(hashMap);
        }
        //this is a test one
//        model=new ExampleModel("Pokhara","3578688");
//        model=new ExampleModel("BUTWAL","78088");
//        model=new ExampleModel("DhARAn","78088");
//        model=new ExampleModel("DhARAn","78088");
//        model=new ExampleModel("DhARAn","78088");
//        model=new ExampleModel("DhARAn","78088");
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("name", "pokhara");
//        hashMap.put("popn", "23232");
//        modelList.add(hashMap);
//
//        hashMap.put("name", "aasis");
//        hashMap.put("popn", "23782");
//        modelList.add(hashMap);
//
//        hashMap.put("name", "prans");
//        hashMap.put("popn", "68232");
//        modelList.add(hashMap);


        ListAdapter adapter=new SimpleAdapter(getApplicationContext(), modelList,R.layout.first,new String[]{"name","popn"},new int[]{R.id.name,R.id.population});

             listView.setAdapter(adapter);








    }

}
