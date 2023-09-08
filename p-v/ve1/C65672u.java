package ve1;

import android.content.Context;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C55033u;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C58375j;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: ve1.u */
public final class C65672u extends C87413o implements C32227p<Long, Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f188956d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f188957e;

    /* renamed from: f */
    public final /* synthetic */ C55033u f188958f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65672u(C8477a0 a0Var, C60905o oVar, C55033u uVar) {
        super(2);
        this.f188956d = a0Var;
        this.f188957e = oVar;
        this.f188958f = uVar;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj).longValue();
        long longValue = ((Number) obj2).longValue();
        C8477a0 a0Var = this.f188956d;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            Context context = this.f188957e.f173499A;
            C87412m.m108593f(context, "holder.context");
            C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C58375j.class);
            C87412m.m108593f(a, "UICProvider.of(context).…tAdReportUIC::class.java)");
            C58375j jVar = (C58375j) a;
            C55033u uVar = this.f188958f;
            long j = uVar.f154492d.field_feedId;
            if (uVar.f154492d.mo89544z2()) {
                long n2 = uVar.f154492d.mo89531n2();
                jVar.mo83143f3(j, n2).f167209d = longValue;
                Log.m105924i("Finder.CommentAdReportMgr", "updateVideoDuration commentId=" + n2 + " duration=" + longValue);
            }
        }
        return C13598b0.f38549a;
    }
}
