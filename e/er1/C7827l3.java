package er1;

import bd1.C54446b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import ht1.C60216z4;
import ht1.C8806u4;
import java.util.HashMap;
import je1.C9359p0;
import ky2.C10432i;
import sx3.C26236u;
import up1.C37521f;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: er1.l3 */
public final class C7827l3 implements C8806u4 {

    /* renamed from: a */
    public static final C7827l3 f26365a = new C7827l3();

    /* renamed from: er1.l3$a */
    public static final class C7828a implements C60216z4.C8821a<Integer> {

        /* renamed from: a */
        public final /* synthetic */ C60216z4.C8821a<Boolean> f26366a;

        public C7828a(C60216z4.C8821a<Boolean> aVar) {
            this.f26366a = aVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            C60216z4.C8821a<Boolean> aVar = this.f26366a;
            if (aVar != null) {
                boolean z = true;
                if (num == null || num.intValue() != 1) {
                    z = false;
                }
                aVar.mo6382a(Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: a */
    public boolean mo8922a() {
        int q = C58784w3.m68441q(C58784w3.f168295a, (String) null, 1, (Object) null);
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        int intValue = C37521f.f99148D1.mo60266n().intValue();
        if (intValue == 1) {
            e = true;
        } else if (intValue == 2) {
            q = 1;
        } else if (intValue == 3) {
            q = 4;
        }
        Log.m105924i("Finder.FinderSwitchApi", "showFinderEntryAtWxMe teenMode:" + e + ", state:" + q);
        if (e || q == 1 || q == 4 || q == 5) {
            return false;
        }
        fVar.getClass();
        int intValue2 = C37521f.f99193I1.mo60266n().intValue();
        fVar.getClass();
        boolean z = C37521f.f99157E1.mo60266n().intValue() == 1;
        fVar.getClass();
        boolean z2 = C37521f.f99166F1.mo60266n().intValue() == 1;
        fVar.getClass();
        boolean z3 = C37521f.f99175G1.mo60266n().intValue() == 1;
        boolean h = mo8929h();
        boolean z4 = C66785b.f191882e.mo90662O5().length() > 0;
        boolean z5 = (C75592q0.m90781k() & 34359738368L) != 0;
        Log.m105924i("Finder.FinderSwitchApi", "[showFinderEntryAtWxMe] enable:" + intValue2 + ", switchA:" + z + ", switchB:" + z2 + ", switchC:" + z3 + ", showFinderAtWxProfile:" + h + " hasCreatedIdentity:" + z4 + " isCloseInFindMorePage:" + z5);
        if (intValue2 != 0) {
            return intValue2 == 1 && z4 && !z5;
        }
        if (z) {
            return true;
        }
        return z2 && z3 && h;
    }

    /* renamed from: b */
    public boolean mo8923b(C60216z4.C8821a<Boolean> aVar, C60216z4.C8821a<Integer> aVar2) {
        HashMap<Integer, Integer> hashMap = C7825k3.f26362a;
        C7828a aVar3 = new C7828a(aVar);
        Integer num = C7825k3.f26362a.get(1);
        if (num == null) {
            num = 0;
        }
        if (C31543z5.m39455e() - num.intValue() > C7825k3.f26363b) {
            new C9359p0(C26236u.m33719b(1)).mo9225i().mo123420E(new C7820j3(aVar2, 1, aVar3));
        }
        return C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SHOW_FINDER_RECENT_LIKE_INT_SYNC, 0) == 1;
    }

    /* renamed from: c */
    public int mo8924c() {
        C37521f.f99374d.getClass();
        return C37521f.f99493q4.mo60266n().intValue();
    }

    /* renamed from: d */
    public boolean mo8925d() {
        C37521f.f99374d.getClass();
        return C37521f.f99175G1.mo60266n().intValue() == 1;
    }

    /* renamed from: e */
    public boolean mo8926e(long j) {
        return (j & mo8927f()) != 0;
    }

    /* renamed from: f */
    public long mo8927f() {
        return C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0);
    }

    /* renamed from: g */
    public void mo8928g(long j) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, Long.valueOf(j));
    }

    /* renamed from: h */
    public boolean mo8929h() {
        return C58784w3.f168295a.mo83904U0();
    }

    /* renamed from: i */
    public boolean mo8930i() {
        boolean z0 = C58784w3.f168295a.mo83983z0();
        C37521f.f99374d.getClass();
        boolean z = C37521f.f99175G1.mo60266n().intValue() == 1;
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        boolean n2 = c != null ? c.mo75252n2() : false;
        Log.m105924i("Finder.FinderSwitchApi", "showFinderEntrySetting hasFinderAccount" + z0 + ", switch:" + z + ", accountLimited: " + n2);
        return z0 && z && !n2;
    }
}
