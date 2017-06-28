package com.zpj.input_event_rfid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.zpj.hardlibrary.HardControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.zpj.hardlibrary.*;

public class Input_event_Activity extends AppCompatActivity {

    public ListView List = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_event_layout);

        List = (ListView) findViewById(R.id.MyListView);
        HardControl hardControl = new HardControl();

        //构造数据源
        List<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();
        for(int i=0;i<10;i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("MyTitle", "www.zpj.com");
            map.put("myText", "This is text");
            mylist.add(map);
        }

            //配置适配器
            SimpleAdapter adapter = new SimpleAdapter(this,
                    mylist,//数据源
                    R.layout.my_1_layout,//显示布局
                    new String[] {"MyTitle", "myText"}, //数据源的属性字段
                    new int[] {R.id.MyTitle,R.id.myText}); //布局里的控件id
            //添加并且显示
        List.setAdapter(adapter);
    }


}
