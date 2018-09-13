package com.example.uc15101831.grindview.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uc15101831.grindview.R;

import java.util.List;

/**
 * Created by UC15101831 on 12/09/2018.
 */

public class AdapterGrindView extends BaseAdapter {
    Activity activity;
    String[] list_acoes;

    public AdapterGrindView(String[] list_acoes, Activity activity) {
        this.list_acoes = list_acoes;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return list_acoes.length;
    }

    @Override
    public Object getItem(int position) {
        return list_acoes[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public void setList_acoes(String[] list_acoes) {
        this.list_acoes = list_acoes;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

//        TextView texto = new TextView(this.activity);
//        texto.setText(list_acoes[i]);

        view = View.inflate(activity, R.layout.layout_img_grindview, null);

        ImageView img = new ImageView(this.activity);
        img.setImageDrawable(R.drawable.maps);

        return view;
    }

}
