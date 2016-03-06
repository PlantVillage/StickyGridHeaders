package com.onecode.stickyheadergrid.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.onecode.stickyheadergrid.tonicartos.StickyGridHeadersSimpleAdapter;
import com.onecode.stickyheadergrid.viewholder.BaseViewHolder;

public abstract class StickyGridAdapter<T, VH extends BaseViewHolder, HVH extends BaseViewHolder> extends UtilAdapter<T, VH> implements StickyGridHeadersSimpleAdapter {

    public StickyGridAdapter(Context context) {
        super(context);
    }

    @Override
    public View getHeaderView(int position, View view, ViewGroup viewGroup) {
        HVH vh;
        if (view == null) {
            view = View.inflate(mContext, headerLayout(), null);
            vh = headerViewHolder(view);
            view.setTag(vh);
        } else {
            vh = (HVH) view.getTag();
        }
        populateHeader(getItem(position), vh);
        return view;
    }

    protected abstract int headerLayout();

    protected abstract HVH headerViewHolder(View root);

    protected abstract void populateHeader(T data, HVH headerViewHolder);
}