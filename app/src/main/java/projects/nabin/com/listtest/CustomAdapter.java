package projects.nabin.com.listtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Ashish Alton on 6/19/2018.
 */

public class CustomAdapter extends ArrayAdapter<ExampleModel> {
   private Context context;
   List<ExampleModel> list;
    public CustomAdapter(Context context,List<ExampleModel> list){
        super(context,R.layout.first,list);
        //super(context, R.layout.list_items, heroList);
        this.context=context;
        this.list=list;

    }

    public Context getContext() {
        return context;
    }

    public List<ExampleModel> getList() {
        return list;
    }

    @Override
    public View getView(int position, @Nullable final View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View listviewItem=layoutInflater.inflate(R.layout.first,null,true);
        TextView textView=listviewItem.findViewById(R.id.name);
        TextView textView1=listviewItem.findViewById(R.id.population);
        final ExampleModel exampleModel=list.get(position);
        textView.setText(exampleModel.getName());
        textView1.setText(exampleModel.getPopn());

        listviewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,exampleModel.getPopn(),Toast.LENGTH_SHORT).show();
            }
        });

        return listviewItem;


    }
}
