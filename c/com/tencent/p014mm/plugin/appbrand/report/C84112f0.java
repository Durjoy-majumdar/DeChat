package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.luggage.sdk.config.C0926a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f40.C86718e;
import gy3.C87412m;
import p1031sb.C90157d;
import p823sg.C77710q;
import qe3.C89625d;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.report.f0 */
public final class C84112f0 implements C90157d, C0926a {

    /* renamed from: b */
    public static final C84112f0 f245579b = new C84112f0();

    /* renamed from: a */
    public String mo879a() {
        return mo116785b(Util.nowMilliSecond());
    }

    /* renamed from: b */
    public String mo116785b(long j) {
        String str;
        String[] strArr = new String[5];
        StringBuilder sb = new StringBuilder();
        sb.append("hash=");
        if (MMApplicationContext.isMainProcess()) {
            str = C86709a0.m107523b().mo121111i();
            C87412m.m108593f(str, "{\n            MMKernel.a…unt().uinString\n        }");
        } else {
            str = C77710q.m93738a(C86718e.C86720e.m107579d());
            C87412m.m108593f(str, "{\n            UIN.getStr…OtherProcess())\n        }");
        }
        sb.append(str);
        strArr[0] = sb.toString();
        strArr[1] = "ts=" + j;
        strArr[2] = "host=";
        strArr[3] = "version=" + C89625d.f257841g;
        strArr[4] = "device=2";
        String h = C90599h.m113515h(strArr, "&");
        C87412m.m108593f(h, "join(arrayOf(\n          …2-android\n        ), \"&\")");
        return h;
    }
}
