package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.a4 */
public final class C4014a4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostOriginView f18067d;

    public C4014a4(FinderPostOriginView finderPostOriginView) {
        this.f18067d = finderPostOriginView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$initAnnounceView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C41592j jVar = this.f18067d.f17920u;
        if (jVar != null) {
            jVar.mo64704b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$initAnnounceView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
