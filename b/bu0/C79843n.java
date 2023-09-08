package bu0;

import android.webkit.URLUtil;
import bu0.C79840l;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import gy3.C87412m;
import java.util.HashMap;
import z04.C112551y;

/* renamed from: bu0.n */
public final class C79843n {

    /* renamed from: a */
    public final HashMap<Integer, C79840l> f233994a = new HashMap<>();

    /* renamed from: bu0.n$a */
    public static final class C79844a implements C79840l.C79841a {

        /* renamed from: a */
        public final /* synthetic */ C79843n f233995a;

        public C79844a(C79843n nVar) {
            this.f233995a = nVar;
        }

        /* renamed from: a */
        public final void mo110028a(int i) {
            if (i >= 0) {
                this.f233995a.f233994a.put(Integer.valueOf(i), (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final C79840l mo110029a(String str, C79839k kVar, C81925i2 i2Var, int i) {
        C79840l lVar;
        C87412m.m108594g(str, "iconPath");
        C87412m.m108594g(kVar, "errorHandler");
        C87412m.m108594g(i2Var, "service");
        boolean z = false;
        if (true == (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str))) {
            lVar = new C79845o(str, kVar, i2Var);
        } else if (true == C112551y.m153819s(str, "wxfile://", false)) {
            lVar = new C79849q(str, kVar, i2Var);
        } else {
            if (C112551y.m153808h(str, ".png", false, 2, (Object) null) || C112551y.m153808h(str, ".jpg", false, 2, (Object) null) || C112551y.m153808h(str, ".bmp", false, 2, (Object) null) || C112551y.m153808h(str, ".gif", false, 2, (Object) null)) {
                z = true;
            }
            lVar = true == z ? new C79847p(str, kVar, i2Var) : new C79837j(str, kVar);
        }
        lVar.f233992e = i;
        lVar.f233991d = new C79844a(this);
        C79840l lVar2 = this.f233994a.get(Integer.valueOf(i));
        if (lVar2 != null) {
            lVar2.f233993f = null;
        }
        this.f233994a.put(Integer.valueOf(i), lVar);
        return lVar;
    }
}
