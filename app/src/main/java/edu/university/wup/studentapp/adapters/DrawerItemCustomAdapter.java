package edu.university.wup.studentapp.adapters;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import edu.university.wup.studentapp.DataModel;
import edu.university.wup.studentapp.R;

/**
 * Created by noc on 12/13/2016.
 */
public class DrawerItemCustomAdapter extends ArrayAdapter<DataModel> {

    private Context mContext;
    private int layoutResourceID;
    private DataModel[] objects;
    DataModel data = null;

    public DrawerItemCustomAdapter(Context context, int resource, DataModel[] objects) {
        super(context, resource, objects);
        mContext = context;
        layoutResourceID = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        DataModel folder = objects[position];

        LayoutInflater inflater = ((AppCompatActivity) mContext).getLayoutInflater();
        listItem = inflater.inflate(layoutResourceID, parent, false);

        ViewHolder holder = new ViewHolder();

//        if(holder==null) {
        holder.imageViewIcon = (ImageView) listItem.findViewById(R.id.imageView_icon);
        holder.text = (TextView) listItem.findViewById(R.id.textView_item_name);

//        }else{
//            convertView.getTag();
//        }
        holder.text.setText(folder.getText());
        holder.imageViewIcon.setImageResource(folder.getIcon());
        listItem.setTag(holder);

        return listItem;
    }

    static class ViewHolder {
        TextView text;
        ImageView imageViewIcon;
    }
}
