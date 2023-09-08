package com.tencent.p014mm.plugin.product.p087ui;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import bf2.C39765h;
import bf2.C39768m;
import com.tencent.p014mm.C0966R;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.product.ui.o */
public class C42598o extends BaseAdapter {

    /* renamed from: d */
    public Context f115271d;

    /* renamed from: e */
    public C39768m f115272e;

    /* renamed from: f */
    public String f115273f;

    public C42598o(Context context) {
        this.f115271d = context;
    }

    public int getCount() {
        LinkedList<C39765h> linkedList = this.f115272e.f106725f;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    public Object getItem(int i) {
        return this.f115272e.f106725f.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C39765h hVar = this.f115272e.f106725f.get(i);
        if (view == null || view.getTag() == null) {
            view = View.inflate(this.f115271d, C0966R.C0971layout.bo9, (ViewGroup) null);
        }
        CheckBox checkBox = (CheckBox) view;
        checkBox.setText(hVar.f106716e);
        checkBox.setEnabled(hVar.f106717f);
        checkBox.setChecked(hVar.f106715d.equals(this.f115273f));
        if (!hVar.f106717f) {
            view.setBackgroundResource(C0966R.C0969drawable.c_m);
        } else if (hVar.f106715d.equals(this.f115273f)) {
            view.setBackgroundResource(C0966R.C0969drawable.c_o);
        } else {
            view.setBackgroundResource(C0966R.C0969drawable.c_n);
        }
        view.setTag(new Pair(this.f115272e.f106723d, hVar.f106715d));
        return view;
    }

    public boolean isEnabled(int i) {
        return this.f115272e.f106725f.get(i).f106717f;
    }
}
