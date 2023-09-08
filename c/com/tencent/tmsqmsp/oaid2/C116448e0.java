package com.tencent.tmsqmsp.oaid2;

import android.content.Context;

/* renamed from: com.tencent.tmsqmsp.oaid2.e0 */
public class C116448e0 {
    /* renamed from: a */
    public static boolean m164146a() {
        if (C116447d0.f349363a) {
            return C116447d0.f349364b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: b */
    public static String m164147b(Context context) {
        if (C116447d0.f349363a) {
            return C116457h0.f349375f.mo179894a(C116447d0.m164144a(context), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: c */
    public static void m164148c(Context context) {
        C116447d0.f349364b = C116457h0.f349375f.mo179895a(C116447d0.m164144a(context));
        C116447d0.f349363a = true;
    }

    /* renamed from: a */
    public static String m164145a(Context context) {
        if (C116447d0.f349363a) {
            return C116457h0.f349375f.mo179894a(C116447d0.m164144a(context), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
