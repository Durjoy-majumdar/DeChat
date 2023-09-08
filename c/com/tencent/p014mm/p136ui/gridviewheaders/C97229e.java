package com.tencent.p014mm.p136ui.gridviewheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

/* renamed from: com.tencent.mm.ui.gridviewheaders.e */
public class C97229e extends BaseAdapter implements C97221b {

    /* renamed from: d */
    public ListAdapter f285301d;

    /* renamed from: com.tencent.mm.ui.gridviewheaders.e$a */
    public class C97230a extends DataSetObserver {
        public C97230a() {
        }

        public void onChanged() {
            C97229e.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C97229e.this.notifyDataSetInvalidated();
        }
    }

    public C97229e(ListAdapter listAdapter) {
        C97230a aVar = new C97230a();
        this.f285301d = listAdapter;
        listAdapter.registerDataSetObserver(aVar);
    }

    /* renamed from: c */
    public View mo136159c(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: e */
    public int mo136160e(int i) {
        return 0;
    }

    public int getCount() {
        return this.f285301d.getCount();
    }

    public Object getItem(int i) {
        return this.f285301d.getItem(i);
    }

    public long getItemId(int i) {
        return this.f285301d.getItemId(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f285301d.getView(i, view, viewGroup);
    }

    /* renamed from: m */
    public int mo136161m() {
        return 0;
    }
}
