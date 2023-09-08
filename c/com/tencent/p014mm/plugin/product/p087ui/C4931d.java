package com.tencent.p014mm.plugin.product.p087ui;

import android.view.View;
import android.widget.AdapterView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.product.ui.d */
public class C4931d implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AdapterView.OnItemClickListener f20100d;

    /* renamed from: e */
    public final /* synthetic */ C70107e f20101e;

    public C4931d(AdapterView.OnItemClickListener onItemClickListener, C70107e eVar) {
        this.f20100d = onItemClickListener;
        this.f20101e = eVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        AdapterView<?> adapterView2 = adapterView;
        arrayList.add(adapterView);
        View view2 = view;
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallListDialog$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        AdapterView.OnItemClickListener onItemClickListener = this.f20100d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i, j);
        }
        C70107e eVar = this.f20101e;
        eVar.f202380g = i;
        eVar.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallListDialog$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
