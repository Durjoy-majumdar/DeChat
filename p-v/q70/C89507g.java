package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.g */
public final class C89507g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257590d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257591e;

    /* renamed from: f */
    public final /* synthetic */ int f257592f;

    public C89507g(long j, MemInfo[] memInfoArr, int i) {
        this.f257590d = j;
        this.f257591e = memInfoArr;
        this.f257592f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f257590d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257591e, 18, this.f257592f, C89496f.f257574b);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
