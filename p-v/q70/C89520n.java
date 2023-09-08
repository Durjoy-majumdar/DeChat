package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.n */
public final class C89520n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257614d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257615e;

    /* renamed from: f */
    public final /* synthetic */ int f257616f;

    public C89520n(long j, MemInfo[] memInfoArr, int i) {
        this.f257614d = j;
        this.f257615e = memInfoArr;
        this.f257616f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f257614d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257615e, 25, this.f257616f, C89496f.f257576d);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
