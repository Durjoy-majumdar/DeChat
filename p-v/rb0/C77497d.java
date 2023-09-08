package rb0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import rb0.C77495c;

/* renamed from: rb0.d */
public final class C77497d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f225968d;

    /* renamed from: e */
    public final /* synthetic */ long f225969e;

    public C77497d(C72963f4 f4Var, long j) {
        this.f225968d = f4Var;
        this.f225969e = j;
    }

    public final void run() {
        C77495c cVar = C77495c.f225960a;
        C72963f4 f4Var = this.f225968d;
        long j = this.f225969e;
        if (C47984k.m53340n(f4Var.mo108768t())) {
            C77495c.C77496a aVar = new C77495c.C77496a();
            cVar.mo107659a(f4Var, aVar);
            cVar.mo107660b(f4Var, aVar);
            if (aVar.f225962a > 0) {
                Log.m105919d("MicroMsg.BizChattingItemReportHelper", "alvinluo doReportBizServiceMsgClick msg raw type: %d, enterTime: %d, kfWorker: %s, kfType: %d, talker: %s, reportMsgType: %d, sendType: %d, msgSvrId: %s, extraInfo: %s", Integer.valueOf(f4Var.getType()), Long.valueOf(j), aVar.f225967f, Integer.valueOf(aVar.f225966e), f4Var.mo108768t(), Integer.valueOf(aVar.f225962a), Integer.valueOf(aVar.f225963b), Long.valueOf(f4Var.mo108774y2()), aVar.f225965d);
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[9];
                String t = f4Var.mo108768t();
                if (t == null) {
                    t = "";
                }
                objArr[0] = t;
                objArr[1] = Integer.valueOf(aVar.f225962a);
                objArr[2] = aVar.f225964c;
                objArr[3] = 2;
                objArr[4] = 0;
                objArr[5] = Long.valueOf(f4Var.getCreateTime());
                objArr[6] = Long.valueOf(j);
                objArr[7] = Integer.valueOf(aVar.f225963b);
                objArr[8] = Long.valueOf(f4Var.mo108774y2());
                nVar.mo160131h(19202, objArr);
            }
        }
    }
}
