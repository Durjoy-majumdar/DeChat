package l73;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import te3.t05;

/* renamed from: l73.a */
public class C46836a {
    /* renamed from: a */
    public static final void m52128a(int i) {
        C115669n.INSTANCE.idkeyStat(249, (long) i, 1, false);
    }

    /* renamed from: b */
    public static final void m52129b(int i, int i2) {
        t05 t05 = C43457b.xx0().f347577c.f126742a;
        if (t05 != null) {
            Log.m105927v("MicroMsg.Wear.ReportKVUtil", "report kv operation=%d scene=%d", Integer.valueOf(i), Integer.valueOf(i2));
            C115669n.INSTANCE.mo160131h(11632, Integer.valueOf(i), t05.f141887e, t05.f141888f, Integer.valueOf(i2));
        }
    }

    /* renamed from: c */
    public static final void m52130c(boolean z) {
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(249);
        iDKey.SetKey(12);
        iDKey.SetValue(1);
        arrayList.add(iDKey);
        if (z) {
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(249);
            iDKey2.SetKey(13);
            iDKey2.SetValue(1);
            arrayList.add(iDKey2);
        }
        C115669n.INSTANCE.mo160124a(arrayList, false);
    }
}
