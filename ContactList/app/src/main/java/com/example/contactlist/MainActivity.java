package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.main_list_v);
        MyAdapter adapter= new MyAdapter();
        list.setAdapter(adapter);

    }

    class MyAdapter extends BaseAdapter{

        List<String> data = new LinkedList<String>();

        MyAdapter(){
            for (int i=0 ; i<10; i++){
                data.add("element #"+ i);
            }
        }
        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

         View v = getLayoutInflater().inflate(R.layout.list_row,null);

         String str = data.get(i);
         TextView text= v.findViewById(R.id.listrow_text_v);
         text.setText(str);
            return v;
        }
    }
}