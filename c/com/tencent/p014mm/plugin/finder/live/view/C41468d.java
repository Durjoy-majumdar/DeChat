package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import cl1.C55002v;
import il1.C46261j6;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.live.view.d */
public final class C41468d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C56032b f111676d;

    /* renamed from: e */
    public final /* synthetic */ C46261j6 f111677e;

    public C41468d(C56032b bVar, C46261j6 j6Var) {
        this.f111676d = bVar;
        this.f111677e = j6Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout$showStatistics$1$callback$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C55002v) this.f111676d.business(C55002v.class)).getClass();
        C55002v.f154429h = false;
        C46261j6 j6Var = this.f111677e;
        j6Var.f124704a.setVisibility(8);
        j6Var.f124705b.setVisibility(8);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout$showStatistics$1$callback$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
