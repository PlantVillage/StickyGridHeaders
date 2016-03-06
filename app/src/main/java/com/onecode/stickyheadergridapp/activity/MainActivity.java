package com.onecode.stickyheadergridapp.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.onecode.stickyheadergrid.tonicartos.StickyGridHeadersGridView;
import com.onecode.stickyheadergridapp.R;
import com.onecode.stickyheadergridapp.adapter.ExampleAdapter;
import com.onecode.stickyheadergridapp.model.ExampleModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private static final int NUM_COLUMNS = 3;

    //    GridView
    private StickyGridHeadersGridView mGridView;

    //    Adapter
    protected ExampleAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUi();
        init();
        populate();
    }

    private void setUi() {
        mGridView = (StickyGridHeadersGridView) findViewById(R.id.asset_grid);
    }

    private void init() {
        mAdapter = new ExampleAdapter(this);
        mGridView.setAdapter(mAdapter);
//        mGridView.setSelection(0);
        mGridView.setNumColumns(NUM_COLUMNS);
        mGridView.setOnItemClickListener(this);
    }

    private void populate() {
        ExampleModel exampleModelA1 = new ExampleModel("Group A", 1);
        ExampleModel exampleModelA2 = new ExampleModel("Group A", 2);
        ExampleModel exampleModelA3 = new ExampleModel("Group A", 3);
        ExampleModel exampleModelA4 = new ExampleModel("Group A", 4);
        ExampleModel exampleModelA5 = new ExampleModel("Group A", 5);
        ExampleModel exampleModelA6 = new ExampleModel("Group A", 6);
        ExampleModel exampleModelA7 = new ExampleModel("Group A", 7);
        ExampleModel exampleModelA8 = new ExampleModel("Group A", 8);

        ExampleModel exampleModelB1 = new ExampleModel("Group B", 1);
        ExampleModel exampleModelB2 = new ExampleModel("Group B", 2);
        ExampleModel exampleModelB3 = new ExampleModel("Group B", 3);
        ExampleModel exampleModelB4 = new ExampleModel("Group B", 4);
        ExampleModel exampleModelB5 = new ExampleModel("Group B", 5);
        ExampleModel exampleModelB6 = new ExampleModel("Group B", 6);
        ExampleModel exampleModelB7 = new ExampleModel("Group B", 7);
        ExampleModel exampleModelB8 = new ExampleModel("Group B", 8);

        ExampleModel exampleModelC1 = new ExampleModel("Group C", 1);
        ExampleModel exampleModelC2 = new ExampleModel("Group C", 2);
        ExampleModel exampleModelC3 = new ExampleModel("Group C", 3);
        ExampleModel exampleModelC4 = new ExampleModel("Group C", 4);
        ExampleModel exampleModelC5 = new ExampleModel("Group C", 5);
        ExampleModel exampleModelC6 = new ExampleModel("Group C", 6);
        ExampleModel exampleModelC7 = new ExampleModel("Group C", 7);
        ExampleModel exampleModelC8 = new ExampleModel("Group C", 8);

        ExampleModel exampleModelD1 = new ExampleModel("Group D", 1);
        ExampleModel exampleModelD2 = new ExampleModel("Group D", 2);
        ExampleModel exampleModelD3 = new ExampleModel("Group D", 3);
        ExampleModel exampleModelD4 = new ExampleModel("Group D", 4);
        ExampleModel exampleModelD5 = new ExampleModel("Group D", 5);
        ExampleModel exampleModelD6 = new ExampleModel("Group D", 6);
        ExampleModel exampleModelD7 = new ExampleModel("Group D", 7);
        ExampleModel exampleModelD8 = new ExampleModel("Group D", 8);

        List<ExampleModel> list = new ArrayList<>();

        list.add(exampleModelA1);
        list.add(exampleModelA2);
        list.add(exampleModelA3);
        list.add(exampleModelA4);
        list.add(exampleModelA5);
        list.add(exampleModelA6);
        list.add(exampleModelA7);
        list.add(exampleModelA8);

        list.add(exampleModelB1);
        list.add(exampleModelB2);
        list.add(exampleModelB3);
        list.add(exampleModelB4);
        list.add(exampleModelB5);
        list.add(exampleModelB6);
        list.add(exampleModelB7);
        list.add(exampleModelB8);

        list.add(exampleModelC1);
        list.add(exampleModelC2);
        list.add(exampleModelC3);
        list.add(exampleModelC4);
        list.add(exampleModelC5);
        list.add(exampleModelC6);
        list.add(exampleModelC7);
        list.add(exampleModelC8);

        list.add(exampleModelD1);
        list.add(exampleModelD2);
        list.add(exampleModelD3);
        list.add(exampleModelD4);
        list.add(exampleModelD5);
        list.add(exampleModelD6);
        list.add(exampleModelD7);
        list.add(exampleModelD8);

        mAdapter.appendBottomAll(list);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ExampleModel exampleModel = mAdapter.getItem(position);
        Toast.makeText(this,
                "Title: " + exampleModel.getTitle() + "; Number: " + exampleModel.getNumber(),
                Toast.LENGTH_SHORT).show();
    }
}
