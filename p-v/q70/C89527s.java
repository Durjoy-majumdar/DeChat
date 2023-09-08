package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.s */
public final class C89527s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257629d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257630e;

    /* renamed from: f */
    public final /* synthetic */ int f257631f;

    public C89527s(long j, MemInfo[] memInfoArr, int i) {
        this.f257629d = j;
        this.f257630e = memInfoArr;
        this.f257631f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f257629d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257630e, 23, this.f257631f, C89496f.f257576d);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
