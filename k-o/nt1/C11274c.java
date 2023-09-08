package nt1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: nt1.c */
public final class C11274c {

    /* renamed from: a */
    public static final C11274c f33202a = new C11274c();

    /* renamed from: a */
    public static void m11126a(C11274c cVar, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        cVar.getClass();
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "value");
        Log.m105924i("FinderCustomizeReporter", "[report25102] type:" + i + ", tag:" + str + ", value:" + str);
        C115669n.INSTANCE.mo160131h(25102, "0", Integer.valueOf(i), str, str2);
    }
}
