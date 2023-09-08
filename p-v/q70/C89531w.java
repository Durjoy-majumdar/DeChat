package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.w */
public final class C89531w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257639d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257640e;

    /* renamed from: f */
    public final /* synthetic */ int f257641f;

    public C89531w(long j, MemInfo[] memInfoArr, int i) {
        this.f257639d = j;
        this.f257640e = memInfoArr;
        this.f257641f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppStagedBackground 1min sum pss > " + this.f257639d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257640e, 11, this.f257641f, C89496f.f257574b);
        C115669n.INSTANCE.mo175912v(1832, 10);
    }
}
