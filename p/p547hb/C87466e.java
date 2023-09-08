package p547hb;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.m0$$v;
import com.tencent.p014mm.plugin.appbrand.page.m0$$y;
import java.util.concurrent.Callable;

/* renamed from: hb.e */
public class C87466e implements m0$$v {
    /* renamed from: a */
    public boolean mo116035a(String str, C83817h4 h4Var, C83849m0 m0Var, m0$$y m0__y) {
        int ordinal = h4Var.ordinal();
        if (ordinal == 0) {
            m0__y.proceed();
            return true;
        } else if (ordinal != 6) {
            return true;
        } else {
            C83820i0 currentPage = m0Var.getCurrentPage();
            C83817h4 h4Var2 = C83817h4.AUTO_RE_LAUNCH;
            m0Var.mo110177H((C83820i0) null, currentPage, h4Var2, str, false);
            m0Var.getCurrentPage().mo114316B(0, str, h4Var);
            m0Var.mo110176G((C83820i0) null, m0Var.getCurrentPage(), h4Var2);
            return true;
        }
    }

    /* renamed from: b */
    public C83820i0 mo116036b(String str, C83817h4 h4Var, C83849m0 m0Var, Callable<C83820i0> callable) {
        return new C87465d(m0Var.getContext(), m0Var);
    }

    /* renamed from: c */
    public boolean mo116037c(String str) {
        return true;
    }

    /* renamed from: e */
    public boolean mo116038e(C83780d1 d1Var, String str) {
        return d1Var != null;
    }
}
