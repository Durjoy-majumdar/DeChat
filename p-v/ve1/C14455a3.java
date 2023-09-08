package ve1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.autogen.events.FinderTabSelectedEvent;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: ve1.a3 */
public final class C14455a3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40086d;

    public C14455a3(C60905o oVar) {
        this.f40086d = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedNoMreFooterConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = this.f40086d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        if (f != null) {
            C49712hj1 q3 = f.mo12861q3();
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            ((C58417y0) c).Sx0(2, 1, 0, q3);
        }
        FinderTabSelectedEvent finderTabSelectedEvent = new FinderTabSelectedEvent();
        finderTabSelectedEvent.f9251d.f9252a = 4;
        finderTabSelectedEvent.publish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedNoMreFooterConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
