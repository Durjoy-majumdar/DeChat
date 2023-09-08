package q03;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1915z5;
import com.tencent.p014mm.plugin.report.service.C115669n;
import java.util.ArrayList;

/* renamed from: q03.a */
public class C12026a {
    /* renamed from: a */
    public static void m11717a(boolean z) {
        try {
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey();
            iDKey.SetID(C1915z5.CTRL_INDEX);
            iDKey.SetValue(1);
            iDKey.SetKey(0);
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(C1915z5.CTRL_INDEX);
            iDKey2.SetValue(1);
            if (z) {
                iDKey2.SetKey(1);
            } else {
                iDKey2.SetKey(1);
            }
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            C115669n.INSTANCE.mo160124a(arrayList, false);
        } catch (Throwable unused) {
        }
    }
}
