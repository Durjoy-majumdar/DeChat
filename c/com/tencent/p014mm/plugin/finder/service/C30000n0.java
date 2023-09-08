package com.tencent.p014mm.plugin.finder.service;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75596v4;
import eb0.C75597w2;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60179k4;
import ht1.C60208v1;
import rx3.C36568h;
import up1.C52599l0;

/* renamed from: com.tencent.mm.plugin.finder.service.n0 */
public final class C30000n0 implements C75596v4 {

    /* renamed from: com.tencent.mm.plugin.finder.service.n0$b */
    public static final class C30001b extends C87413o implements C32224a<C52599l0> {

        /* renamed from: d */
        public static final C30001b f81211d = new C30001b();

        public C30001b() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76736Au();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.n0$a */
    public static final class C30002a implements C75597w2 {
        /* renamed from: a */
        public void mo55985a() {
        }

        /* renamed from: b */
        public void mo55986b(String str) {
        }

        /* renamed from: c */
        public void mo55987c(String str, String str2) {
        }

        /* renamed from: e */
        public void mo55988e(String str, String str2, C75597w2.C31525a aVar) {
            String str3;
            if (str != null) {
                Class cls = C60208v1.class;
                Class cls2 = C60179k4.class;
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = str;
                if (C72996z1.m85825X4(str)) {
                    T n = ((C60179k4) C86312j.m106911c(cls2)).mo78770n(str);
                    C87412m.m108593f(n, "getService(IFinderSessio…TalkerFromLocal(username)");
                    f0Var.f27484d = n;
                    str3 = str;
                } else {
                    str3 = "";
                }
                Log.m105924i("Finder.GetContactInterceptor", "[getContact] sessionId=" + str3 + " talker=" + ((String) f0Var.f27484d));
                if (C72996z1.m85817T4((String) f0Var.f27484d)) {
                    ((C60208v1) C86312j.m106911c(cls)).mo78708Wd((String) f0Var.f27484d, new C56287k0(str, f0Var, aVar));
                } else if (C72996z1.m85823W4((String) f0Var.f27484d)) {
                    String ds02 = ((C60179k4) C86312j.m106911c(cls2)).ds0(str, 3);
                    C87412m.m108593f(ds02, "getService(IFinderSessio…E_ALIAS_ROLE_TYPE_FINDER)");
                    ((C60208v1) C86312j.m106911c(cls)).He0((String) f0Var.f27484d, ds02, new C56289l0(str, f0Var, aVar));
                } else if (C72996z1.m85821V4((String) f0Var.f27484d)) {
                    String ds03 = ((C60179k4) C86312j.m106911c(cls2)).ds0(str, 2);
                    C87412m.m108593f(ds03, "getService(IFinderSessio…VE_ALIAS_ROLE_TYPE_ALIAS)");
                    ((C60208v1) C86312j.m106911c(cls)).mo78715m8((String) f0Var.f27484d, ds03, new C56291m0(str, f0Var, aVar));
                }
            }
        }

        /* renamed from: f */
        public void mo55989f(String str) {
        }

        /* renamed from: g */
        public void mo55990g(String str, int i, String str2) {
        }
    }

    public C30000n0() {
        C36568h.m40985a(C30001b.f81211d);
    }

    /* renamed from: S2 */
    public boolean mo55983S2(String str, int i) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return i == 2 || C72996z1.m85817T4(str) || C72996z1.m85825X4(str) || C72996z1.m85823W4(str);
    }

    /* renamed from: g2 */
    public C75597w2 mo55984g2() {
        return new C30002a();
    }
}
