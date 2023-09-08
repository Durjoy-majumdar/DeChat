package ve1;

import java.util.Map;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;

/* renamed from: ve1.h4 */
public final class C14539h4 implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C49712hj1 f40292a;

    public C14539h4(C49712hj1 hj12) {
        this.f40292a = hj12;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        C13604l[] lVarArr = new C13604l[4];
        C49712hj1 hj12 = this.f40292a;
        Integer num = null;
        lVarArr[0] = new C13604l("behaviour_session_id", hj12 != null ? hj12.f134670d : null);
        lVarArr[1] = new C13604l("finder_context_id", hj12 != null ? hj12.f134671e : null);
        lVarArr[2] = new C13604l("finder_tab_context_id", hj12 != null ? hj12.f134672f : null);
        if (hj12 != null) {
            num = Integer.valueOf(hj12.f134675i);
        }
        lVarArr[3] = new C13604l("comment_scene", num);
        return C90364q0.m113147f(lVarArr);
    }
}
