package com.ao.generic_base_recyclerview.one_base_Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.generic_base_recyclerview.R;

class RecyclerViewBaseViewHolder <T> extends RecyclerView.ViewHolder {


	TextView textView;
	public RecyclerViewBaseViewHolder(@NonNull View itemView) {
		super(itemView);
		textView = itemView.findViewById(R.id.textView_Vew);


	}
}
