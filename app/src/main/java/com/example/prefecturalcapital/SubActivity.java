package com.example.prefecturalcapital;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    String[] strings1 = {
            "北海道",
            "青森県",
            "岩手県",
            "宮城県",
            "秋田県",
            "山形県",
            "福島県",
            "茨城県",
            "栃木県",
            "群馬県",
            "埼玉県",
            "千葉県",
            "東京都",
            "神奈川県",
            "新潟県",
            "富山県",
            "石川県",
            "福井県",
            "山梨県",
            "長野県",
            "岐阜県",
            "静岡県",
            "愛知県",
            "三重県",
            "滋賀県",
            "京都府",
            "大阪府",
            "兵庫県",
            "奈良県",
            "和歌山県",
            "鳥取県",
            "島根県",
            "岡山県",
            "広島県",
            "山口県",
            "徳島県",
            "香川県",
            "愛媛県",
            "高知県",
            "福岡県",
            "佐賀県",
            "長崎県",
            "熊本県",
            "大分県",
            "宮崎県",
            "鹿児島県",
            "沖縄県",
    };
    String[] strings2 = {
            "札幌市",
            "青森市",
            "盛岡市",
            "仙台市",
            "秋田市",
            "山形市",
            "福島市",
            "水戸市",
            "宇都宮市",
            "前橋市",
            "さいたま市",
            "千葉市",
            "新宿区",
            "横浜市",
            "新潟市",
            "富山市",
            "金沢市",
            "福井市",
            "甲府市",
            "長野市",
            "岐阜市",
            "静岡市",
            "名古屋市",
            "津市",
            "大津市",
            "京都市",
            "大阪市",
            "神戸市",
            "奈良市",
            "和歌山市",
            "鳥取市",
            "松江市",
            "岡山市",
            "広島市",
            "山口市",
            "徳島市",
            "高松市",
            "松江市",
            "高知市",
            "福岡市",
            "佐賀市",
            "長崎市",
            "熊本市",
            "大分市",
            "宮崎市",
            "鹿児島市",
            "那覇市",
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity);

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                strings1);

        ((ListView) findViewById(R.id.listView)).setAdapter(adapter);

        ((ListView) findViewById(R.id.listView)).setOnItemClickListener(

                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView parent, View view, int position, long id) {
                        Toast.makeText(SubActivity.this ,strings2[position],Toast.LENGTH_SHORT).show();
                    }
                }

        );

    }
}

