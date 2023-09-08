package dp1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ue1.C52528f;
import ue1.C52542k;

/* renamed from: dp1.j2 */
public final class C45436j2 extends C45434h2<String, C52528f> {

    /* renamed from: h */
    public C52542k f122976h;

    /* renamed from: dp1.j2$a */
    public static final class C45437a implements C45439x1<String> {
        /* renamed from: a */
        public boolean mo70931a(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "id");
            return Util.isEqual(str, "finder_system_message");
        }
    }

    public C45436j2() {
        C45430b<ID> bVar = new C45430b<>();
        bVar.f122953c = new C45437a();
        this.f122974g = bVar;
    }

    /* renamed from: a */
    public final boolean mo70930a() {
        RecyclerView recyclerView = this.f122971d;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int C = linearLayoutManager.mo16957C();
                if (C <= 0) {
                    C = 0;
                }
                this.f122972e = C;
                int E = linearLayoutManager.mo16959E();
                if (E <= 0) {
                    E = 0;
                }
                this.f122973f = E;
                int i = this.f122972e;
                if (i <= E) {
                    while (true) {
                        C52542k kVar = this.f122976h;
                        C52528f R5 = kVar != null ? (i < 0 || i >= kVar.mo73487Q5()) ? kVar.f146725f.get(i - kVar.mo73487Q5()) : kVar.mo73488R5(i) : null;
                        if (R5 == null || !C87412m.m108589b(R5.field_sessionId, "finder_system_message")) {
                            if (i == E) {
                                break;
                            }
                            i++;
                        } else {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
