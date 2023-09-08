package hp1;

import di3.C86312j;
import h81.C59774i;
import java.util.Map;
import p185kq.C10383h;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: hp1.q0 */
public final class C8682q0 implements C118148a {

    /* renamed from: a */
    public static final C8682q0 f27874a = new C8682q0();

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        Class cls = C10383h.class;
        C13604l[] lVarArr = new C13604l[5];
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        lVarArr[0] = new C13604l("behaviour_session_id", Wb);
        lVarArr[1] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
        lVarArr[2] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
        lVarArr[3] = new C13604l("live_enter_status", 1L);
        lVarArr[4] = new C13604l("share_username", "");
        return C90364q0.m113147f(lVarArr);
    }
}
