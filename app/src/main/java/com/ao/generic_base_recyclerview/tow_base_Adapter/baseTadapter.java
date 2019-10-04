package com.ao.generic_base_recyclerview.tow_base_Adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public abstract class baseTadapter <T,VH extends RecyclerView.ViewHolder>extends RecyclerView.Adapter<VH> {
	public List<?> item_Base;

	public void setItem_Base(List<?> item_Base) {
		this.item_Base = item_Base;
	}
	public void setItem_Base(T[] item_Base) {
		this.item_Base = Arrays.asList(item_Base);
	}

	@NonNull
	@Override
	public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return create_View_Holder(parent, viewType);	}

	@Override
	public void onBindViewHolder(@NonNull VH holder, int position) {
		bin_Data_View(holder, position);
	}

	@Override
	public int getItemCount() {
		if (item_Base == null)return 0;
		return item_Base.size();
	}

	public abstract void bin_Data_View(VH holder, int position);

	public abstract VH create_View_Holder(ViewGroup parent, int viewType);

	public void setOnItemClickListener(OnItemClickListener<T> onItemClickListener) {
		this.onItemClickListener = onItemClickListener;
	}

	public OnItemClickListener <T> onItemClickListener;

	public interface OnItemClickListener<T> {
		void onItemClick(int pos, T item);
	}
}
