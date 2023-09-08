package rb0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import rb0.C77495c;

/* renamed from: rb0.e */
public final class C77498e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72996z1 f225970d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f225971e;

    /* renamed from: f */
    public final /* synthetic */ int f225972f;

    /* renamed from: g */
    public final /* synthetic */ int f225973g;

    /* renamed from: h */
    public final /* synthetic */ long f225974h;

    public C77498e(C72996z1 z1Var, C72963f4 f4Var, int i, int i2, long j) {
        this.f225970d = z1Var;
        this.f225971e = f4Var;
        this.f225972f = i;
        this.f225973g = i2;
        this.f225974h = j;
    }

    public final void run() {
        C77495c cVar = C77495c.f225960a;
        C72996z1 z1Var = this.f225970d;
        C72963f4 f4Var = this.f225971e;
        int i = this.f225972f;
        int i2 = this.f225973g;
        long j = this.f225974h;
        int i3 = (i2 - i) - 1;
        C77495c.C77496a aVar = new C77495c.C77496a();
        cVar.mo107660b(f4Var, aVar);
        cVar.mo107659a(f4Var, aVar);
        if (aVar.f225962a > 0) {
            Log.m105919d("MicroMsg.BizChattingItemReportHelper", "doReportServiceMsgExpose username: %s, msg raw Type: %d, url: %s, revertPos: %s, createTime: %s, enterTime: %s, reportMsgType: %d, sendType: %s, msgSvrId: %s, extraInfo: %s", z1Var.getUsername(), Integer.valueOf(f4Var.getType()), aVar.f225964c, Integer.valueOf(i3), Long.valueOf(f4Var.getCreateTime()), Long.valueOf(j), Integer.valueOf(aVar.f225962a), Integer.valueOf(aVar.f225963b), Long.valueOf(f4Var.mo108774y2()), aVar.f225965d);
            C115669n.INSTANCE.mo160131h(19202, z1Var.getUsername(), Integer.valueOf(aVar.f225962a), aVar.f225964c, 1, Integer.valueOf(i3), Long.valueOf(f4Var.getCreateTime()), Long.valueOf(j), Integer.valueOf(aVar.f225963b), Long.valueOf(f4Var.mo108774y2()));
        }
    }
}
