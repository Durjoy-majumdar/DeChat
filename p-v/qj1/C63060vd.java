package qj1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import rx3.C13598b0;
import sk1.C63956k;
import sk1.C63962r;

/* renamed from: qj1.vd */
public final class C63060vd implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62996td f178959d;

    /* renamed from: e */
    public final /* synthetic */ C63962r f178960e;

    public C63060vd(C62996td tdVar, C63962r rVar) {
        this.f178959d = tdVar;
        this.f178960e = rVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super C63956k, C13598b0> lVar = this.f178959d.f178748g;
        if (lVar != null) {
            lVar.invoke(this.f178960e);
        }
        Context context = this.f178959d.f178745d;
        C76912y0.m92769h(context, context.getString(C0966R.string.m4_), C0966R.raw.icons_filled_info);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
