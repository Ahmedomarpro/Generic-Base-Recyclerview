package com.ao.generic_base_recyclerview.tow_base_Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.generic_base_recyclerview.R;

import java.util.List;

public class RunTadapter extends baseTadapter<String , RunTadapter.ViewHolder> {
	List<String> listOfItime;

	public RunTadapter(List<String> listOfItime) {
		this.listOfItime = listOfItime;
		setItem_Base(listOfItime);

	}

	@Override
	public void bin_Data_View(RunTadapter.ViewHolder holder, int position) {
		String id_Position = listOfItime.get(position);
		holder.textView.setText(id_Position);

		if (onItemClickListener != null) {
			holder.textView.setOnClickListener(v -> {


				onItemClickListener.onItemClick(position,id_Position);

			});
		}
	}

	@Override
	public RunTadapter.ViewHolder create_View_Holder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.itmeview, parent, false);

		return new ViewHolder(view);
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		TextView textView;
		public ViewHolder(@NonNull View itemView) {
			super(itemView);
			textView = itemView.findViewById(R.id.textView_Vew);

		}
	}
}
