package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.q */
public final class C89525q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257623d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257624e;

    /* renamed from: f */
    public final /* synthetic */ int f257625f;

    public C89525q(long j, MemInfo[] memInfoArr, int i) {
        this.f257623d = j;
        this.f257624e = memInfoArr;
        this.f257625f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 3min sum pss > " + this.f257623d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257624e, 20, this.f257625f, C89496f.f257575c);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
