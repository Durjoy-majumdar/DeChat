package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.view.View;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.i */
public final class C56710i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C56711j f162575d;

    /* renamed from: e */
    public final /* synthetic */ C56711j.C56716c f162576e;

    public C56710i(C56711j jVar, C56711j.C56716c cVar) {
        this.f162575d = jVar;
        this.f162576e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$DeviceAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f162575d.mo80101n3(this.f162576e.f162616a);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$DeviceAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
