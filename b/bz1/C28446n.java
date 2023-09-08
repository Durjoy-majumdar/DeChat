package bz1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31514t2;
import eb0.C31519v2;
import eb0.C75596v4;
import eb0.C75597w2;
import gy3.C8479f0;
import gy3.C87412m;
import xy1.C15913g;
import xy1.C53475k;

/* renamed from: bz1.n */
public final class C28446n implements C75596v4 {

    /* renamed from: bz1.n$a */
    public static final class C28447a implements C75597w2 {
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
            if (str != null) {
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = str;
                if (C72996z1.m85832c5(str)) {
                    T n = ((C53475k) C86312j.m106911c(C53475k.class)).mo59162n(str);
                    C87412m.m108593f(n, "getService(IGameLifeSess…TalkerFromLocal(username)");
                    f0Var.f27484d = n;
                }
                Log.m105924i("GameLife.GetContactInterceptor", "[getContact] username=" + str + " talker=" + ((String) f0Var.f27484d));
                if (C72996z1.m85831b5((String) f0Var.f27484d)) {
                    ((C15913g) C86312j.m106911c(C15913g.class)).xt0((String) f0Var.f27484d, new C28443l(str, f0Var, aVar));
                    return;
                }
                C75597w2 a = C31519v2.m39436a();
                if (a instanceof C31514t2) {
                    ((C31514t2) a).mo58210d().mo55988e(str, "", new C28445m(f0Var, aVar));
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

    /* renamed from: S2 */
    public boolean mo55983S2(String str, int i) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return C72996z1.m85831b5(str) || C72996z1.m85832c5(str);
    }

    /* renamed from: g2 */
    public C75597w2 mo55984g2() {
        return new C28447a();
    }
}
