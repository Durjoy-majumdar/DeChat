package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import com.tencent.p014mm.plugin.luckymoney.model.C69197c1;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.o1 */
public abstract class C69656o1 extends BaseAdapter {

    /* renamed from: d */
    public List<C69197c1> f201040d = new LinkedList();

    /* renamed from: e */
    public Context f201041e;

    /* renamed from: f */
    public LayoutInflater f201042f;

    public C69656o1(Context context) {
        this.f201041e = context;
        this.f201042f = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public C69197c1 getItem(int i) {
        return this.f201040d.get(i);
    }

    public int getCount() {
        return this.f201040d.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
