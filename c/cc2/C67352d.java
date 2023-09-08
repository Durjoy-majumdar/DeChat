package cc2;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import di3.C86312j;
import eb0.C75604z3;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C75700k0;
import p154fy.C87121j;

/* renamed from: cc2.d */
public enum C67352d {
    ;

    /* renamed from: cc2.d$a */
    public class C67353a implements z3$$g {
        /* renamed from: b */
        public boolean mo24603b() {
            return false;
        }

        /* renamed from: c */
        public void mo24604c() {
        }
    }

    /* renamed from: a */
    public static void m79716a(int i) {
        String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(143873, ""));
        if (nullAsNil.equals("")) {
            return;
        }
        if (Util.secondsToNow(Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119684e(143874, 0L))) < 7200) {
            m79718c(nullAsNil, i);
        } else {
            m79717b(nullAsNil);
        }
    }

    /* renamed from: b */
    public static void m79717b(String str) {
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        if (Ni.mo69709k3(str)) {
            Ni.mo69688c(str);
        }
        C75604z3.m90836h(str, new C67353a());
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(str, 15);
        C86709a0.m107535s().mo121142i().mo119676J(143873, "");
        C86709a0.m107535s().mo121142i().mo119676J(143874, 0L);
        C86709a0.m107535s().mo121142i().mo119676J(143875, 0);
    }

    /* renamed from: c */
    public static void m79718c(String str, int i) {
        C86709a0.m107524d().mo123460f(new C67354f(2, str, (int) Util.secondsToNow(Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119684e(143874, 0L))), i));
    }
}
