package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.z */
public final class C89534z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257646d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257647e;

    /* renamed from: f */
    public final /* synthetic */ int f257648f;

    public C89534z(long j, MemInfo[] memInfoArr, int i) {
        this.f257646d = j;
        this.f257647e = memInfoArr;
        this.f257648f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppStagedBackground 3min sum pss > " + this.f257646d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257647e, 15, this.f257648f, C89496f.f257576d);
        C115669n.INSTANCE.mo175912v(1832, 10);
    }
}
