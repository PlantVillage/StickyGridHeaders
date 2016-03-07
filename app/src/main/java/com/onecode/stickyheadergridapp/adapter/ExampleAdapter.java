package com.onecode.stickyheadergridapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.onecode.stickyheadergrid.adapter.StickyGridAdapter;
import com.onecode.stickyheadergrid.viewholder.BaseViewHolder;
import com.onecode.stickyheadergridapp.R;
import com.onecode.stickyheadergridapp.model.ExampleModel;

import java.util.HashMap;
import java.util.Map;


public class ExampleAdapter extends StickyGridAdapter<ExampleModel, ExampleAdapter.ViewHolder, ExampleAdapter.HeaderViewHolder> {

    private static final long GROUP_A = 1;
    private static final long GROUP_B = 2;
    private static final long GROUP_C = 3;
    private static final long GROUP_D = 4;

    private static final String STRING_GROUP_A = "Group A";
    private static final String STRING_GROUP_B = "Group B";
    private static final String STRING_GROUP_C = "Group C";
    private static final String STRING_GROUP_D = "Group D";

    public ExampleAdapter(Context context) {
        super(context);
    }

    @Override
    protected int headerLayout() {
        return R.layout.adapter_example_header;
    }

    @Override
    protected HeaderViewHolder headerViewHolder(View root) {
        return new HeaderViewHolder(root);
    }

    @Override
    protected void populateHeader(ExampleModel data, HeaderViewHolder headerViewHolder) {
        headerViewHolder.title.setText(data.getTitle());
        switch (data.getTitle()) {
            case STRING_GROUP_A:
                headerViewHolder.root.setBackgroundColor(Color.YELLOW);
                break;
            case STRING_GROUP_B:
                headerViewHolder.root.setBackgroundColor(Color.BLUE);
                break;
            case STRING_GROUP_C:
                headerViewHolder.root.setBackgroundColor(Color.MAGENTA);
                break;
            case STRING_GROUP_D:
                headerViewHolder.root.setBackgroundColor(Color.CYAN);
                break;
            default:
                headerViewHolder.root.setBackgroundColor(Color.BLACK);
        }
    }

    @Override
    public long getHeaderId(int position) {
        ExampleModel exampleModel = getItem(position);
        switch (exampleModel.getTitle()) {
            case STRING_GROUP_A:
                return GROUP_A;
            case STRING_GROUP_B:
                return GROUP_B;
            case STRING_GROUP_C:
                return GROUP_C;
            case STRING_GROUP_D:
                return GROUP_D;
            default:
                return -1;
        }
    }

    @Override
    protected int layout() {
        return R.layout.adapter_example;
    }

    @Override
    protected ViewHolder viewHolder(View root) {
        return new ViewHolder(root);
    }

    @Override
    protected void populate(ExampleModel data, ViewHolder viewHolder) {
        int number = data.getNumber();
        viewHolder.number.setText(number + "");
        if (number % 2 == 0) {
            viewHolder.number.setBackgroundColor(Color.GREEN);
        } else {
            viewHolder.number.setBackgroundColor(Color.RED);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder extends BaseViewHolder {

        TextView number;

        public ViewHolder(View root) {
            super(root);
            number = (TextView) root.findViewById(R.id.adapter_example_number);
        }
    }

    public static class HeaderViewHolder extends BaseViewHolder {

        TextView title;
        View root;
        Button button1;
        Button button2;

        public HeaderViewHolder(View root) {
            super(root);
            this.root = root;
            title = (TextView) root.findViewById(R.id.adapter_example_header_title);
            button1 = (Button) root.findViewById(R.id.button1);
            button2 = (Button) root.findViewById(R.id.button2);

            setListeners();
        }

        private void setListeners() {
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.w("ExampleAdapter", "button1");
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.w("ExampleAdapter", "button2");
                }
            });
        }
    }
}
