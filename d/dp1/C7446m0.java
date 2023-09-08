package dp1;

import android.view.View;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import l31.C61212e;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;

/* renamed from: dp1.m0 */
public final class C7446m0 {

    /* renamed from: a */
    public static final C7446m0 f25635a = new C7446m0();

    /* renamed from: b */
    public static void m7572b(C7446m0 m0Var, View view, String str, int i, int i2, Map map, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 40;
        }
        if ((i3 & 8) != 0) {
            i2 = 25496;
        }
        if ((i3 & 16) != 0) {
            map = null;
        }
        m0Var.getClass();
        Class cls = C61212e.class;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(str, "viewId");
        ((C61212e) C86312j.m106911c(cls)).o30(view, str);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(view, i, i2);
        ((C61212e) C86312j.m106911c(cls)).mo86149PM(view, map);
        ((C61212e) C86312j.m106911c(cls)).E60(view, new C7445l0(view));
    }

    /* renamed from: a */
    public final Map<String, Object> mo8592a(C49712hj1 hj12) {
        if (hj12 == null) {
            return null;
        }
        return C90364q0.m113147f(new C13604l("comment_scene", Integer.valueOf(hj12.f134675i)), new C13604l("behaviour_session_id", hj12.f134670d), new C13604l("finder_context_id", hj12.f134671e), new C13604l("finder_tab_context_id", hj12.f134672f), new C13604l("extra_info", hj12.f134681r), new C13604l("enter_source_info", hj12.f134682s));
    }
}
