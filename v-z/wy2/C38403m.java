package wy2;

import az2.C39674e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31514t2;
import eb0.C31519v2;
import eb0.C75596v4;
import eb0.C75597w2;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import qy2.C12935w;
import rx3.C36568h;
import xy2.C53477h;
import yy2.C39246d;
import z04.C112551y;

/* renamed from: wy2.m */
public final class C38403m implements C75596v4 {

    /* renamed from: wy2.m$a */
    public static final class C38404a implements C75597w2 {
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
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = str;
                if (C72996z1.m85799F5(str)) {
                    T n = ((C12935w) C86312j.m106911c(C12935w.class)).mo12485n(str);
                    C87412m.m108593f(n, "getService(ITextStatusSe…TalkerFromLocal(username)");
                    f0Var.f27484d = n;
                    str3 = str;
                } else {
                    str3 = "";
                }
                Log.m105924i("MicroMsg.TextStatus.TextStatusGetContactInterceptor", "[getContact] sessionId=" + str3 + " talker=" + ((String) f0Var.f27484d));
                if (C72996z1.m85799F5(str3)) {
                    ((C53477h) C86312j.m106911c(C53477h.class)).wx0(str3);
                    C61926c.m72668M(new C38401k(str, f0Var, aVar));
                    return;
                }
                C75597w2 a = C31519v2.m39436a();
                if (a instanceof C31514t2) {
                    ((C31514t2) a).mo58210d().mo55988e(str, "", new C38402l(f0Var, aVar));
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

    /* renamed from: wy2.m$b */
    public static final class C38405b extends C87413o implements C32224a<C39246d> {

        /* renamed from: d */
        public static final C38405b f101311d = new C38405b();

        public C38405b() {
            super(0);
        }

        public Object invoke() {
            return C39674e.f106452d.mo62251j0();
        }
    }

    public C38403m() {
        C36568h.m40985a(C38405b.f101311d);
    }

    /* renamed from: S2 */
    public boolean mo55983S2(String str, int i) {
        return !(str == null || C112551y.m153811k(str)) && C72996z1.m85799F5(str);
    }

    /* renamed from: g2 */
    public C75597w2 mo55984g2() {
        return new C38404a();
    }
}
