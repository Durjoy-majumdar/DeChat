package ae2;

import android.content.Intent;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;

/* renamed from: ae2.b */
public class C39550b {

    /* renamed from: a */
    public static final C39549a f106177a = new C39551a();

    /* renamed from: ae2.b$a */
    public class C39551a implements C39549a {
        /* renamed from: Bj */
        public void mo62164Bj(Intent intent) {
            Log.m105918d("MicroMsg.PayTestHelper", "sDummyNetPayTestHeader savePayTestEnvIDs");
        }

        /* renamed from: pk */
        public void mo62165pk(C114799u uVar, boolean z) {
            Log.m105918d("MicroMsg.PayTestHelper", "sDummyNetPayTestHeader setPayTestEnvID2RR, isKinda: " + z);
        }
    }

    /* renamed from: a */
    public static C39549a m42181a() {
        Class cls = C39549a.class;
        if (!C86312j.m106916h(cls)) {
            return f106177a;
        }
        C115669n.INSTANCE.idkeyStat(1490, 0, 1, false);
        return (C39549a) C86312j.m106911c(cls);
    }
}
