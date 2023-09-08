package rs1;

import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import java.util.Map;
import o40.C61926c;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;

/* renamed from: rs1.h8 */
public final class C13263h8 implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C56711j f37640a;

    public C13263h8(C56711j jVar) {
        this.f37640a = jVar;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f37640a.getContext());
        Integer num = null;
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        C13604l[] lVarArr = new C13604l[3];
        lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(this.f37640a.f162607y));
        if (q3 != null) {
            num = Integer.valueOf(q3.f134675i);
        }
        lVarArr[1] = new C13604l("comment_scene", num);
        lVarArr[2] = new C13604l("projection_source", Integer.valueOf(this.f37640a.f162580D));
        return C90364q0.m113147f(lVarArr);
    }
}
