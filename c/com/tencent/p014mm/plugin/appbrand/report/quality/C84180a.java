package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import gy3.C8480h;
import gy3.C87412m;
import java.util.BitSet;
import x24.C91135a;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.a */
public final class C84180a {

    /* renamed from: a */
    public static final C84181a f245866a = new C84181a((C8480h) null);

    /* renamed from: b */
    public static final BitSet f245867b;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.a$a */
    public static final class C84181a {
        public C84181a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo116874a() {
            String str;
            C91135a aVar = new C91135a();
            byte[] byteArray = C84180a.f245867b.toByteArray();
            C87412m.m108593f(byteArray, "flags.toByteArray()");
            int length = byteArray.length;
            boolean z = false;
            int i = 0;
            while (true) {
                str = "0";
                boolean z2 = true;
                if (i >= length) {
                    break;
                }
                String valueOf = String.valueOf(byteArray[i]);
                if (valueOf.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    str = valueOf;
                }
                aVar.mo125201a(str);
                i++;
            }
            if (aVar.f261354e == 0) {
                z = true;
            }
            return z ? str : aVar.toString();
        }
    }

    static {
        BitSet bitSet = new BitSet();
        f245867b = bitSet;
        bitSet.set(0, C84566n2.m104161j());
        bitSet.set(1, true);
    }
}
