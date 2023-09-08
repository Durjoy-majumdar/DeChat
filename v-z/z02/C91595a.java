package z02;

import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import z02.C91596b;

/* renamed from: z02.a */
public class C91595a implements Runnable {
    public void run() {
        if (C91596b.f262439a.isExpired("rpt_oat_status")) {
            TinkerStatusReport.Pairs.Builder builder = new TinkerStatusReport.Pairs.Builder();
            for (C91596b.C91600d a : C91596b.f262443e) {
                a.mo125474a(builder);
            }
            TinkerStatusReport.reportKVPairValues(C80589e.f235762c, 258, builder.build());
        }
    }
}
