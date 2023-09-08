package ve1;

import android.content.Context;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C55033u;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C58375j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: ve1.t */
public final class C65668t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f188951d;

    /* renamed from: e */
    public final /* synthetic */ C55033u f188952e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65668t(C60905o oVar, C55033u uVar) {
        super(0);
        this.f188951d = oVar;
        this.f188952e = uVar;
    }

    public Object invoke() {
        Context context = this.f188951d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C58375j.class);
        C87412m.m108593f(a, "UICProvider.of(context).…tAdReportUIC::class.java)");
        C58375j jVar = (C58375j) a;
        C55033u uVar = this.f188952e;
        long j = uVar.f154492d.field_feedId;
        if (uVar.f154492d.mo89544z2()) {
            long n2 = uVar.f154492d.mo89531n2();
            C58375j.C58376a f3 = jVar.mo83143f3(j, n2);
            f3.f167208c++;
            Log.m105924i("Finder.CommentAdReportMgr", "onReplay commentId=" + n2 + " playCount=" + f3.f167208c);
        }
        return C13598b0.f38549a;
    }
}
