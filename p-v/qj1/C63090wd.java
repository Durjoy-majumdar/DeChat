package qj1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import sk1.C63956k;
import sk1.C63962r;

/* renamed from: qj1.wd */
public final class C63090wd implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62996td f179042d;

    /* renamed from: e */
    public final /* synthetic */ C63962r f179043e;

    public C63090wd(C62996td tdVar, C63962r rVar) {
        this.f179042d = tdVar;
        this.f179043e = rVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super C63956k, C13598b0> lVar = this.f179042d.f178748g;
        if (lVar != null) {
            lVar.invoke(this.f179043e);
        }
        this.f179042d.mo87934a(this.f179043e);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
