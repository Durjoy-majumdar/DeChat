package ve1;

import android.content.Context;
import com.tencent.p014mm.autogen.events.FinderTabSelectedEvent;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: ve1.x0 */
public final class C14688x0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40628d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14688x0(C60905o oVar) {
        super(0);
        this.f40628d = oVar;
    }

    public Object invoke() {
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = this.f40628d.f173499A;
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
        return C13598b0.f38549a;
    }
}
