package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/** Bilingual rows using platform views so the legacy course needs no new dependencies. */
final class WordAdapter extends ArrayAdapter<String> {
    private final String[] translations;

    WordAdapter(Context context, int englishResource, int miwokResource) {
        super(context, android.R.layout.simple_list_item_2, android.R.id.text1,
                context.getResources().getStringArray(englishResource));
        translations = context.getResources().getStringArray(miwokResource);
        if (translations.length != getCount()) {
            throw new IllegalArgumentException("Vocabulary arrays must have matching lengths");
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
        }
        ((TextView) row.findViewById(android.R.id.text1)).setText(getItem(position));
        ((TextView) row.findViewById(android.R.id.text2)).setText(translations[position]);
        return row;
    }
}
