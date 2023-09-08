package lm1;

import java.util.Map;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;

/* renamed from: lm1.l */
public final class C10567l implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C10554j f31878a;

    public C10567l(C10554j jVar) {
        this.f31878a = jVar;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        C13604l[] lVarArr = new C13604l[3];
        C49712hj1 hj12 = this.f31878a.f31847h;
        String str2 = null;
        lVarArr[0] = new C13604l("behaviour_session_id", hj12 != null ? hj12.f134670d : null);
        lVarArr[1] = new C13604l("finder_context_id", hj12 != null ? hj12.f134671e : null);
        if (hj12 != null) {
            str2 = hj12.f134672f;
        }
        lVarArr[2] = new C13604l("finder_tab_context_id", str2);
        return C90364q0.m113147f(lVarArr);
    }
}
