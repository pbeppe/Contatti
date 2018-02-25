package com.example.pbeppe.contatti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pbeppe on 25/02/2018.
 */


public class AmiciAdapter extends BaseAdapter{
    Context context;
    String amici[];
    int photo[];
    LayoutInflater inflater;



    public AmiciAdapter(Context appContext, String[] nomiamici,int[]fotoamici){
    this.context=appContext;
    this.amici=nomiamici;
    photo=fotoamici;
    inflater= (LayoutInflater.from(appContext));

    }


    private static class ViewHolder{
        TextView amico;
        ImageView img;
    }



    @Override
    public int getCount() {
        return amici.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView==null)
        {
            convertView=inflater.inflate(R.layout.layadapter,null);
            viewHolder=new ViewHolder();
            viewHolder.amico=(TextView)convertView.findViewById(R.id.txt_contatti);
            viewHolder.img=(ImageView)convertView.findViewById(R.id.foto_contatti);
        }
        else
        {
            viewHolder=(ViewHolder)convertView.getTag();
        }


       viewHolder.amico.setText(amici[position]);
       viewHolder.img.setImageResource(photo[position]);
        return convertView;
    }
}
