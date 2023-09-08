package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.u */
public final class C89529u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257635d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257636e;

    /* renamed from: f */
    public final /* synthetic */ int f257637f;

    public C89529u(long j, MemInfo[] memInfoArr, int i) {
        this.f257635d = j;
        this.f257636e = memInfoArr;
        this.f257637f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f257635d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257636e, 16, this.f257637f, C89496f.f257576d);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
