package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.kinda.gen.KListViewCallback;
import com.tencent.kinda.gen.KView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class MMListViewAdapter extends BaseAdapter {
    private static final String TAG = "MicroMsg.MMListViewAdapter";
    private Context mContext;
    private KListViewCallback mListViewCallback;

    public MMListViewAdapter(Context context, KListViewCallback kListViewCallback) {
        this.mContext = context;
        this.mListViewCallback = kListViewCallback;
    }

    public int getCount() {
        return this.mListViewCallback.getCount();
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        return this.mListViewCallback.getViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Log.m105925i(TAG, "getView %s %s", Integer.valueOf(i), view);
        MMKViewLayout mMKViewLayout = null;
        MMKViewLayout mMKViewLayout2 = view != null ? (MMKViewLayout) view.getTag() : null;
        KListViewCallback kListViewCallback = this.mListViewCallback;
        if (mMKViewLayout2 != null) {
            mMKViewLayout = mMKViewLayout2;
        }
        KView fillData = kListViewCallback.fillData(i, mMKViewLayout);
        MMKView mMKView = (MMKView) fillData;
        mMKView.getView().setTag(fillData);
        return mMKView.getView();
    }

    public int getViewTypeCount() {
        return this.mListViewCallback.getViewTypeCount();
    }
}
