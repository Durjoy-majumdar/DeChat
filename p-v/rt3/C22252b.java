package rt3;

import android.util.SparseArray;
import lt3.C21460a;
import ot3.C117896h;
import ot3.C21881e;
import pt3.C22005b;
import tt3.C22550a;
import tt3.C22551c;
import tt3.C64998b;
import ut3.C22662b;
import xt3.C53448e;
import yt3.C112484b;
import yt3.C23319f;
import yt3.C23325h;
import yt3.C23339m;
import yt3.C23357s;
import yt3.C23360u;

/* renamed from: rt3.b */
public class C22252b {
    /* renamed from: a */
    public static void m25804a() {
        SparseArray<String> a = C22662b.m26538b().mo35774a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C21460a.m24284r(a.valueAt(i), false);
        }
        C21460a.m24283q();
    }

    /* renamed from: b */
    public static void m25805b() {
        if (C22662b.m26538b().mo35776d() && !C21460a.m24282p()) {
            C22005b bVar = C21460a.f60758c;
            if (bVar == null) {
                C21881e.m25083b("Soter.SoterCore", "soter: triggerConnecting IMPL is null, not support soter", new Object[0]);
            } else {
                bVar.mo35115s();
            }
        }
    }

    /* renamed from: c */
    public static boolean m25806c() {
        return C22662b.m26538b().mo35776d() && C22662b.m26538b().mo35777e();
    }

    /* renamed from: d */
    public static void m25807d(C64998b<C22551c> bVar, boolean z, C53448e eVar) {
        C21881e.m25084c("Soter.SoterWrapperApi", "soter: starting prepare ask key. ", new Object[0]);
        C23357s sVar = new C23357s(eVar, z);
        sVar.f67031a = bVar;
        if (!C23319f.m27817c().mo36810a(sVar, new C22551c())) {
            C21881e.m25082a("Soter.SoterWrapperApi", "soter: add prepareAppSecureKey task failed.", new Object[0]);
        }
    }

    /* renamed from: e */
    public static void m25808e(C64998b<C22551c> bVar, boolean z, boolean z2, int i, C53448e eVar, C53448e eVar2) {
        C21881e.m25084c("Soter.SoterWrapperApi", "soter: starting prepare auth key: %d", Integer.valueOf(i));
        C23360u uVar = new C23360u(i, eVar, eVar2, z, z2);
        uVar.f67031a = bVar;
        if (!C23319f.m27817c().mo36810a(uVar, new C22551c())) {
            C21881e.m25082a("Soter.SoterWrapperApi", "soter: add prepareAuthKey task failed.", new Object[0]);
        }
    }

    /* renamed from: f */
    public static boolean m25809f(int i) {
        boolean d = C22662b.m26538b().mo35776d();
        String str = C22662b.m26538b().mo35774a().get(i);
        if (d && !C117896h.m166297b(str)) {
            return C21460a.m24284r(str, false).f61886a == 0;
        }
        if (!d) {
            C21881e.m25087f("Soter.SoterWrapperApi", "soter: not initialized yet", new Object[0]);
            return false;
        }
        C21881e.m25087f("Soter.SoterWrapperApi", "soter: scene not registered in init. please make sure", new Object[0]);
        return false;
    }

    /* renamed from: g */
    public static void m25810g(C64998b<C22550a> bVar, C112484b bVar2) {
        C21881e.m25084c("Soter.SoterWrapperApi", "soter: request authorize provide challenge. scene: %d", Integer.valueOf(bVar2.f336849a));
        int i = bVar2.f336852d;
        if (i == 1 || i == 2) {
            C23339m mVar = new C23339m(bVar2);
            mVar.f67031a = bVar;
            if (!C23319f.m27817c().mo36810a(mVar, new C22550a())) {
                C21881e.m25082a("Soter.SoterWrapperApi", "soter: add 2.0 requestAuthorizeAndSign task failed.", new Object[0]);
                return;
            }
            return;
        }
        C23325h hVar = new C23325h(bVar2);
        hVar.f67031a = bVar;
        if (!C23319f.m27817c().mo36810a(hVar, new C22550a())) {
            C21881e.m25082a("Soter.SoterWrapperApi", "soter: add 1.0 requestAuthorizeAndSign task failed.", new Object[0]);
        }
    }
}
