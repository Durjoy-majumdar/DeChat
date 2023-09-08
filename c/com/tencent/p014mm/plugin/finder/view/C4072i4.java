package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.i4 */
public final class C4072i4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostOriginView f18200d;

    public C4072i4(FinderPostOriginView finderPostOriginView) {
        this.f18200d = finderPostOriginView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$initOriginType$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderPostOriginView finderPostOriginView = this.f18200d;
        int i = FinderPostOriginView.f17904B;
        C7045j jVar = new C7045j(finderPostOriginView.getContext(), finderPostOriginView.f17923x);
        int i2 = finderPostOriginView.f17922w;
        if (i2 < 0) {
            i2 = 0;
        }
        jVar.mo8106i(i2);
        jVar.f24869t = new C4122n4(jVar, finderPostOriginView);
        jVar.mo8109l();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$initOriginType$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
