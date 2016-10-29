package com.exam.sky.buterknife;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;
import butterknife.OnItemLongClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends Fragment {

    @BindView(R.id.listview)
    ListView listView;
    @BindView(R.id.btn)
    TextView textView;

    public ContentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_content, container, false);
        //解析注解，this代表的是当前对象
        ButterKnife.bind(this,view);
        textView.setText("==============rfergfrtgrh");
        List<String> list =new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            list.add("======"+i+"=======");
        }
        MyAdapter myAdapter =new MyAdapter(list,getActivity());
        listView.setAdapter(myAdapter);
        return view;
    }

    @OnItemClick(R.id.listview)
    public void itemClick(AdapterView<?> adapterView,View view, int pos,long id){
        Log.e("=====","===itemClick==="+pos);
    }
    @OnItemLongClick(R.id.listview)
    public boolean itemLongClick(AdapterView<?> adapterView,View view, int pos,long id){
        Log.e("=====","===itemLongClick==="+pos);
        return  true;

    }
}
