package com.tencent.p014mm.plugin.appbrand.report;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import tm0.C90538k;

/* renamed from: com.tencent.mm.plugin.appbrand.report.i0 */
public final class C84116i0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.report.i0$a */
    public /* synthetic */ class C84117a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f245581a;

        static {
            int[] iArr = new int[C90538k.C90543e.values().length];
            iArr[0] = 1;
            f245581a = iArr;
        }
    }

    /* renamed from: a */
    public static final int m103658a(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 32 && i != 0; i3++) {
            int i4 = i & 1;
            if (i4 > 0) {
                i2 += i4 * ((int) Math.pow(10.0d, (double) i3));
            }
            i /= 2;
        }
        return i2;
    }

    /* renamed from: b */
    public static final String m103659b(Context context) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        C90538k.C90543e x = C90538k.m113361x(context);
        String str = C84117a.f245581a[x.ordinal()] == 1 ? "offline" : x.f260172d;
        C87412m.m108593f(str, "getNetworkType(context?:…e\n            }\n        }");
        return str;
    }

    /* renamed from: c */
    public static /* synthetic */ String m103660c(Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return m103659b(context);
    }
}
