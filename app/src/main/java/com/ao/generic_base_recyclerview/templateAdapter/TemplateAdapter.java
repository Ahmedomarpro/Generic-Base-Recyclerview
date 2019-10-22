package com.ao.generic_base_recyclerview.templateAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.ao.generic_base_recyclerview.R;

import java.util.List;

public class TemplateAdapter extends RecyclerView.Adapter<TemplateAdapter.ViewHolder> {

	private static final String TAG = TemplateAdapter.class.getSimpleName();

	//private Context context;
	protected List<String> list;
	public OnItemClickListenerView onItemClickListener;


	public TemplateAdapter(List<String> list) {
		this.list = list;
	}


	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itmeview, parent, false);
		ViewHolder viewHolder = new ViewHolder(view);
		return viewHolder;
	}


	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {

		String item = list.get(position);
		/*holder.textView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(v.getContext(), ""+position, Toast.LENGTH_SHORT).show();
			}
		});*/
		if (onItemClickListener != null) {
			holder.textView.setOnClickListener(v -> {

				onItemClickListener.onItemClick(position);
			});
		}


	}


	@Override
	public int getItemCount() {
		//return iterator
		return list == null ? 0 : list.size();

	}

	public void setOnItemClickListener(OnItemClickListenerView onItemClickListener) {
		this.onItemClickListener = onItemClickListener;
	}

	public interface OnItemClickListenerView {
		void onItemClick(int position);
	}


	public static class ViewHolder extends RecyclerView.ViewHolder {
		//ViewHolder
		TextView textView;

		public ViewHolder(View itemView) {
			super(itemView);

			//	textView = itemView.findViewById(R.id.textView_Vew);

		}
	}
}