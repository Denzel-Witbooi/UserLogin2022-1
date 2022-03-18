package com.example.userlogin2022;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;


public class DetailsListAdapter extends ArrayAdapter<Details>
{
    private Context mContext;
    private int mResource;

    public DetailsListAdapter(Context context, int resource, ArrayList<Details> objects)
    {
        super(context,resource,objects);
        mContext=context;
        mResource=resource;
    }

    private static  class ViewHolder
            // are the objects on the view - so the textboxs on the view
    {
        TextView name;
        TextView password;
        TextView message;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
       //get the detail information
        String Name = getItem(position).getStrName();
        String Password = getItem(position).getStrPassword();
        String Message = getItem(position).getStrWelcomeMessage();

        // create the detail object with the information
        Details dets = new Details(Name,Password,Message);

        //ViewHolder object
        ViewHolder holder;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);
        holder=new ViewHolder();
        //new gui
        holder.name= (TextView)  convertView.findViewById(R.id.txtNameVW);
        holder.password= (TextView) convertView.findViewById(R.id.txtPasswordVW);
        holder.message= (TextView) convertView.findViewById(R.id.txtWelcomeMessageVW);

        convertView.setTag(holder);
        //new gui
        holder.name.setText(dets.getStrName());
        holder.password.setText(dets.getStrPassword());
        holder.message.setText(dets.getStrWelcomeMessage());
        return convertView;
    }

}
