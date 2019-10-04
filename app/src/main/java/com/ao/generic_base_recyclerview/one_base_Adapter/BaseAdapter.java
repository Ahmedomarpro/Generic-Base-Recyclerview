package com.ao.generic_base_recyclerview.one_base_Adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public abstract class BaseAdapter  <T,VH extends RecyclerViewBaseViewHolder > extends RecyclerView.Adapter<VH> {

	protected List<T> items;

	public void setItems(List<T> items) {
		this.items = items;
	}

	public void setItemsT(List<T> items) {
		this.items = (List<T>) Arrays.asList(items);
	}


	@NonNull
	@Override
	public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		VH vh = onCreateRecyclerViewHolder(parent,viewType);

		return vh;
	}


/*
	@Override
	public int getItemCount() {
		if (items == null) return 0;
		return items.size();
	}*/

	public abstract VH onCreateRecyclerViewHolder(ViewGroup parent, int viewType);

}
