package t04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d04.C24442a;
import gy3.C87412m;
import java.util.List;
import t04.C26255f;
import wy3.C26463h1;
import wy3.C26516w;

/* renamed from: t04.n */
public final class C26272n implements C26255f {

    /* renamed from: a */
    public static final C26272n f73205a = new C26272n();

    /* renamed from: a */
    public String mo53156a(C26516w wVar) {
        return C26255f.C26256a.m33748a(this, wVar);
    }

    /* renamed from: b */
    public boolean mo53157b(C26516w wVar) {
        boolean z;
        C87412m.m108594g(wVar, "functionDescriptor");
        List<C26463h1> h = wVar.mo52639h();
        C87412m.m108593f(h, "functionDescriptor.valueParameters");
        if (!h.isEmpty()) {
            for (C26463h1 h1Var : h) {
                C87412m.m108593f(h1Var, LocaleUtil.ITALIAN);
                if (C24442a.m30534a(h1Var) || h1Var.mo53440S() != null) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
