package cn1;

import android.content.Context;
import bn1.C0331b;
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

/* renamed from: cn1.g0 */
public final class C0836g0 implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C60905o f1973a;

    /* renamed from: b */
    public final /* synthetic */ C0331b f1974b;

    public C0836g0(C60905o oVar, C0331b bVar) {
        this.f1973a = oVar;
        this.f1974b = bVar;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        Class cls = C10383h.class;
        C13604l[] lVarArr = new C13604l[5];
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = this.f1973a.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        C13604l lVar = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
        boolean z = false;
        lVarArr[0] = lVar;
        lVarArr[1] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
        lVarArr[2] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
        C64273c21 liveInfo = this.f1974b.mo3513o().getLiveInfo();
        if (liveInfo != null && liveInfo.f182394f == 1) {
            z = true;
        }
        lVarArr[3] = new C13604l("live_enter_status", Long.valueOf(z ? 1 : 2));
        lVarArr[4] = new C13604l("share_username", "");
        return C90364q0.m113147f(lVarArr);
    }
}
