package com.project.ashish.friendshipapp;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        listView=(ListView)findViewById(R.id.listView);

       // String[] foods={"banana","mango","orange","grapes","apple","pineapple","banana","mango","orange","grapes","apple","pineapple","patato","tamato","papaya",};

       // ListAdapter listAdapter=new customAdapter(this, foods);
        listView.setAdapter(new customAdapter(this));

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String food=String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(ScrollingActivity.this,food,Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}


class SingleRow
{
    String foods;
    SingleRow(String foods){
        this.foods=foods;
    }
}//used to set all view in single object

class MyViewHolder{
    TextView food;
    MyViewHolder(View v){
        food=(TextView)v.findViewById(R.id.ctextview);
    }
}// USED TO OPTIMIZE

class customAdapter extends BaseAdapter{

    ArrayList<SingleRow> list;
    Context context;
    customAdapter(Context c)
    {
        context=c;
        list=new ArrayList<SingleRow>();

        Resources res = c.getResources();
        String[] foods=res.getStringArray(R.array.foods);

        for(int i=0;i<foods.length;i++){
            list.add(new SingleRow(foods[i]));
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

/*SECOND WAY WITHOUT OPTIMIZATION
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row=view;
        if(row==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.custom_row, viewGroup, false);
        }
        TextView foods=(TextView)row.findViewById(R.id.ctextview);

        SingleRow temp=list.get(i);

        foods.setText(temp.foods);

        return row;
    }*/
//THIRD WAYS WITH OPTIMIZATION
    @Override
    public View getView(int i, View convertView, ViewGroup parent){
        View row=convertView;
        MyViewHolder holder=null;
        if (row==null){     //1st time
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.custom_row,parent,false);
            holder=new MyViewHolder(row);
            row.setTag(holder);
        }
        else{       //Recycling
            holder=(MyViewHolder)row.getTag(i);
            SingleRow temp=list.get(i);
            holder.food.setText(temp.foods);
        }
        return row;
    }
}





/* BASIC WAYS
class CustomAdapter extends ArrayAdapter<String>{

    public CustomAdapter(@NonNull Context context, String[] foods) {
        super(context, R.layout.custom_row ,foods);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater= LayoutInflater.from(getContext());
        View v =layoutInflater.inflate(R.layout.custom_row, parent, false);

        String food = getItem(position);
        TextView textView=(TextView)v.findViewById(R.id.ctextview);
        textView.setText(food);
        return v;
    }
}
*/