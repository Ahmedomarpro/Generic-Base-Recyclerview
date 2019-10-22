package com.ao.generic_base_recyclerview.one_base_Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.ao.generic_base_recyclerview.R;

import java.util.List;

public class RunBaseAdapter extends BaseAdapter<String,RecyclerViewBaseViewHolder> {

	List<String>listOfItime;
	RecyclerViewItemClickListener itemClickListener;

	public RunBaseAdapter(List<String> listOfItime) {
		this.listOfItime = listOfItime;
		setItems(listOfItime);
	}

	public void setItemClickListener(RecyclerViewItemClickListener itemClickListener) {
		this.itemClickListener = itemClickListener;
	}

	public void setListOfItime(List<String> listOfItime) {
		this.listOfItime = listOfItime;
	}


	@Override
	public RecyclerViewBaseViewHolder onCreateRecyclerViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.itmeview, parent, false);

		return new RecyclerViewBaseViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerViewBaseViewHolder holder, int position) {
		String id_Position = listOfItime.get(position);
		holder.textView.setText(id_Position);
 		holder.textView.setOnClickListener(v -> {
			if (itemClickListener != null){

					itemClickListener.OnclickListener(position,id_Position);
			}
		});

	}

	@Override
	public int getItemCount() {
		if (listOfItime == null) return 0;
		return listOfItime.size();
	}

}
