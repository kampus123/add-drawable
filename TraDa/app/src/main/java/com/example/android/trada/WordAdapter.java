package com.example.android.trada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 12/04/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> pWords) {
        super(context,0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Kiểm tra xem View có được tái sử dụng không, nếu không thì inflate view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word local_word = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.en_text_view);
        miwokTextView.setText(local_word.getEnTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.vi_text_view);
        defaultTextView.setText(local_word.getViTranslation());

        return listItemView;
    }

}
