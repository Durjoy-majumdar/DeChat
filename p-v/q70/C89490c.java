package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.c */
public final class C89490c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257563d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257564e;

    /* renamed from: f */
    public final /* synthetic */ int f257565f;

    public C89490c(long j, MemInfo[] memInfoArr, int i) {
        this.f257563d = j;
        this.f257564e = memInfoArr;
        this.f257565f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f257563d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257564e, 12, this.f257565f, C89496f.f257574b);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
