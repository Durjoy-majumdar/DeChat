package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.t */
public final class C89528t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257632d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257633e;

    /* renamed from: f */
    public final /* synthetic */ int f257634f;

    public C89528t(long j, MemInfo[] memInfoArr, int i) {
        this.f257632d = j;
        this.f257633e = memInfoArr;
        this.f257634f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f257632d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257633e, 22, this.f257634f, C89496f.f257576d);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
