package com.ao.generic_base_recyclerview.ui;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.generic_base_recyclerview.R;
import com.ao.generic_base_recyclerview.one_base_Adapter.RecyclerViewItemClickListener;
import com.ao.generic_base_recyclerview.one_base_Adapter.RunBaseAdapter;
import com.ao.generic_base_recyclerview.tow_base_Adapter.RunTadapter;
import com.ao.generic_base_recyclerview.tow_base_Adapter.baseTadapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	private RecyclerView recycler;
	private RecyclerView.LayoutManager manager;


	RunBaseAdapter adapter;
	//	***Run Code****
	//RunTadapter runTadapter;

	List<String> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		uploding();

		Run_One_Adapter();

		Run_Tow_Adapter();
	}
	/*
	//Run Tow Onclick method Class -->
	public class Onclick implements baseTadapter.OnItemClickListener{

		@Override
		public void onItemClick(int pos, Object item) {
			Toast.makeText(MainActivity.this, "   WELCOME    " + pos, Toast.LENGTH_SHORT).show();

		}
	}

*/

	private void Run_One_Adapter() {
		recycler = findViewById(R.id.recycler);

		manager = new LinearLayoutManager(this);
		recycler.setLayoutManager(manager);


		//	Run Code
		adapter = new RunBaseAdapter(list);
		recycler.setAdapter(adapter);

		adapter.setItemClickListener((position, item) -> {
			Toast.makeText(this, "   WELCOME    " +position, Toast.LENGTH_SHORT).show();
		});
	}

	private void Run_Tow_Adapter() {
	/*		//	Run Code method

		runTadapter = new RunTadapter(list);
		recycler.setAdapter(runTadapter);

			runTadapter.setOnItemClickListener((pos, item) -> {
			Toast.makeText(this, "   WELCOME    " +pos, Toast.LENGTH_SHORT).show();

		});*/
	}

	private void uploding() {
		list = new ArrayList<>();
		for (int i = 0; i < 30; ++i) {

			list.add("Recycler_View_Generic");
		}
	}



}
