package b93;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import rx3.C13598b0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: b93.b */
public final class C0258b {

    /* renamed from: a */
    public static final C0258b f802a = new C0258b();

    /* renamed from: b */
    public static final Set<String> f803b;

    static {
        HashSet hashSet = new HashSet();
        f803b = hashSet;
        hashSet.add("https://open.weixin.qq.com");
    }

    /* renamed from: a */
    public final void mo296a(String str) {
        if (!(str == null || str.length() == 0)) {
            Set<String> set = f803b;
            synchronized (set) {
                ((HashSet) set).add(str);
            }
            Log.m105924i("AdH5URLManager", "addDisableUrl, url=" + str);
        }
    }

    /* renamed from: b */
    public final boolean mo297b(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        if (!(!(str == null || str.length() == 0) && (C112551y.m153819s(str, "http", false) || C112551y.m153819s(str, C113600ck.f339986i, false)))) {
            return true;
        }
        Set<String> set = f803b;
        synchronized (set) {
            if (((HashSet) set).contains(str)) {
                return true;
            }
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                if (C112551y.m153820t((String) it.next(), str, false, 2, (Object) null)) {
                    return true;
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo298c() {
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_intercept_high_risk_h5, 0);
            Log.m105924i("MicroMsg.WebViewHighRiskAdH5Interceptor", "isInterceptEnabled, expt=" + Qe);
            return Qe > 0;
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.WebViewHighRiskAdH5Interceptor", "isInterceptEnabled, exp=" + th);
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo299d(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return C112550d0.m153803w(str, "adH5Redirect=1", false, 2, (Object) null);
    }
}
