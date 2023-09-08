package cn1;

import an1.C0092e;
import android.content.Context;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import jq3.C60905o;
import p185kq.C10383h;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C64273c21;

/* renamed from: cn1.n */
public final class C0856n implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C0092e f2028a;

    /* renamed from: b */
    public final /* synthetic */ C60905o f2029b;

    public C0856n(C0092e eVar, C60905o oVar) {
        this.f2028a = eVar;
        this.f2029b = oVar;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        Class cls = C10383h.class;
        C13604l[] lVarArr = new C13604l[5];
        C64273c21 liveInfo = this.f2028a.mo3513o().getLiveInfo();
        lVarArr[0] = new C13604l("live_enter_status", Long.valueOf(liveInfo != null && liveInfo.f182394f == 1 ? 1 : 2));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = this.f2029b.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        lVarArr[1] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
        lVarArr[2] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
        lVarArr[3] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
        lVarArr[4] = new C13604l("share_username", "");
        return C90364q0.m113147f(lVarArr);
    }
}
