package er1;

import android.content.Context;
import android.view.View;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60172g4;
import java.util.Map;
import l31.C61212e;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;
import tf0.C64916p1;

/* renamed from: er1.m2 */
public final class C7830m2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f26370d;

    /* renamed from: er1.m2$a */
    public static final class C7831a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C49712hj1 f26371a;

        public C7831a(C49712hj1 hj12) {
            this.f26371a = hj12;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[4];
            C49712hj1 hj12 = this.f26371a;
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

    public C7830m2(View view) {
        this.f26370d = view;
    }

    public final void run() {
        C7335d c = C86312j.m106911c(C61212e.class);
        View view = this.f26370d;
        C61212e eVar = (C61212e) c;
        eVar.o30(view, "from_finderuin_sns");
        eVar.mo86175pO(view, 32, 25496);
        Context context = view.getContext();
        C87412m.m108593f(context, "view.context");
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context);
        eVar.E60(view, new C7831a(gr02 != null ? gr02.mo12861q3() : null));
    }
}
