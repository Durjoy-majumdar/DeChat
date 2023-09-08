package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.h */
public final class C89511h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257599d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257600e;

    /* renamed from: f */
    public final /* synthetic */ int f257601f;

    public C89511h(long j, MemInfo[] memInfoArr, int i) {
        this.f257599d = j;
        this.f257600e = memInfoArr;
        this.f257601f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f257599d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257600e, 17, this.f257601f, C89496f.f257574b);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
