package cn1;

import an1.C0101n;
import android.content.Context;
import gy3.C87412m;
import java.util.Map;
import jq3.C60905o;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49098d51;

/* renamed from: cn1.q0 */
public final class C0866q0 implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C0101n f2057a;

    /* renamed from: b */
    public final /* synthetic */ C60905o f2058b;

    public C0866q0(C0101n nVar, C60905o oVar) {
        this.f2057a = nVar;
        this.f2058b = oVar;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        C49098d51 d512 = this.f2057a.f541d.f132196d;
        int i = d512 != null ? d512.f132119e == 0 ? 0 : 1 : -1;
        C13604l[] lVarArr = new C13604l[4];
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = this.f2058b.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        String str2 = null;
        lVarArr[0] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
        Context context2 = this.f2058b.f173499A;
        C87412m.m108593f(context2, "holder.context");
        C13442s8 f2 = aVar.mo12873f(context2);
        lVarArr[1] = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
        Context context3 = this.f2058b.f173499A;
        C87412m.m108593f(context3, "holder.context");
        C13442s8 f3 = aVar.mo12873f(context3);
        if (f3 != null) {
            str2 = f3.f38100p;
        }
        lVarArr[2] = new C13604l("finder_tab_context_id", str2);
        lVarArr[3] = new C13604l("live_square_notice_action_type", Integer.valueOf(i));
        return C90364q0.m113147f(lVarArr);
    }
}
