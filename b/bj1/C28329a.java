package bj1;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import er1.C58739j4;
import gy3.C87412m;
import ok1.C62042e;

/* renamed from: bj1.a */
public final class C28329a {

    /* renamed from: a */
    public static final C28329a f77951a = new C28329a();

    /* renamed from: b */
    public static boolean f77952b;

    /* renamed from: a */
    public final boolean mo55921a(String str) {
        C87412m.m108594g(str, "lottery");
        if (C58739j4.f168176a.mo83692U() && f77952b) {
            MultiProcessMMKV p0 = C62042e.f176370a.mo87106p0();
            p0.putBoolean("milestone_" + str, false);
            f77952b = false;
        }
        MultiProcessMMKV p05 = C62042e.f176370a.mo87106p0();
        return p05.getBoolean("milestone_" + str, false);
    }
}
