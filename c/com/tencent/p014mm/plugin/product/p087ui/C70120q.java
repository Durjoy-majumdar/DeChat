package com.tencent.p014mm.plugin.product.p087ui;

import af2.C39560p;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import java.util.List;
import p755xs.C102720b;

/* renamed from: com.tencent.mm.plugin.product.ui.q */
public class C70120q extends BaseAdapter {

    /* renamed from: d */
    public Context f202411d;

    /* renamed from: e */
    public List<C39560p.C39561a> f202412e;

    public C70120q(Context context) {
        this.f202411d = context;
    }

    public int getCount() {
        List<C39560p.C39561a> list = this.f202412e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public Object getItem(int i) {
        return this.f202412e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C70121r rVar;
        Class cls = C102720b.class;
        C39560p.C39561a aVar = this.f202412e.get(i);
        if (view == null || view.getTag() == null) {
            rVar = new C70121r();
            view = View.inflate(this.f202411d, C0966R.C0971layout.bob, (ViewGroup) null);
            rVar.f202414e = (TextView) view.findViewById(C0966R.C0970id.gn5);
            rVar.f202413d = (ImageView) view.findViewById(C0966R.C0970id.gn4);
            view.setTag(rVar);
        } else {
            rVar = (C70121r) view.getTag();
        }
        rVar.f202415f = aVar;
        rVar.f202414e.setText(aVar.f106204a);
        rVar.f202413d.setImageBitmap(((C102720b) C86312j.m106911c(cls)).mo142104N6(new C70106c(aVar.f106205b)));
        ((C102720b) C86312j.m106911c(cls)).Lu0(rVar);
        return view;
    }
}
