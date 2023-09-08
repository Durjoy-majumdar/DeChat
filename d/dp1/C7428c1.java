package dp1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import hp1.C8668i;
import java.util.HashMap;
import kj2.C117407d;
import z04.C112551y;

/* renamed from: dp1.c1 */
public final class C7428c1 {

    /* renamed from: a */
    public static final C7428c1 f25609a = new C7428c1();

    /* renamed from: a */
    public final void mo8561a(String str, String str2, int i, HashMap<String, C8668i> hashMap, int i2) {
        C87412m.m108594g(str, "requestId");
        C87412m.m108594g(hashMap, "exposeItemMap");
        String nullAs = Util.nullAs(str2, "");
        C87412m.m108593f(nullAs, "nullAs(query, \"\")");
        boolean z = false;
        String n = C112551y.m153814n(nullAs, ",", " ", false);
        StringBuffer stringBuffer = new StringBuffer();
        long j = 0;
        for (C8668i next : hashMap.values()) {
            if (!next.f27861e) {
                next.f27861e = true;
                stringBuffer.append(next.f27857a);
                stringBuffer.append("#");
                stringBuffer.append(next.f27859c);
                stringBuffer.append("#");
                stringBuffer.append(next.f27858b);
                stringBuffer.append("#");
                stringBuffer.append(next.f27860d);
                stringBuffer.append(";");
                long j2 = next.f27860d;
                if (j2 < j) {
                    j = j2;
                }
            }
        }
        if (stringBuffer.length() == 0) {
            z = true;
        }
        if (!z) {
            String str3 = str + ',' + n + ',' + i + ',' + stringBuffer + ',' + i2 + ',' + (System.currentTimeMillis() - j) + ',' + (hashMap.isEmpty() ^ true ? 1 : 0);
            Log.m105924i("Finder.FinderSearchReportLogic", "report18691 " + str3);
            C117407d.INSTANCE.kvStat(18691, str3);
        }
    }
}
