package com.android.imran.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Imran on 11/25/2015.
 */
public class ImranAdapter extends ArrayAdapter<String> {

    int[] imgs;
    String[] memtitle;
    String[] description;

    public int[] getImgs() {
        return imgs;
    }

    public void setImgs(int[] imgs) {
        this.imgs = imgs;
    }

    public String[] getMemtitle() {
        return memtitle;
    }

    public void setMemtitle(String[] memtitle) {
        this.memtitle = memtitle;
    }

    public String[] getDescription() {
        return description;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    ImranAdapter(Context context, String[] title, int images[], String memTitle[], String description[]) {
        super(context, R.layout.single_row, R.id.textView, title);
        this.imgs = images;
        this.memtitle = memTitle;
        this.description = description;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(getContext().LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.single_row, parent, false);
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);
        TextView largeTextTitle = (TextView) row.findViewById(R.id.textView);
        TextView smalltextDescription = (TextView) row.findViewById(R.id.smalltext);

        imageView.setImageResource(imgs[position]);
        largeTextTitle.setText(memtitle[position]);
        smalltextDescription.setText(description[position]);


        return super.getView(position, convertView, parent);
    }
}
