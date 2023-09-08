package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.y */
public final class C89533y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257643d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257644e;

    /* renamed from: f */
    public final /* synthetic */ int f257645f;

    public C89533y(long j, MemInfo[] memInfoArr, int i) {
        this.f257643d = j;
        this.f257644e = memInfoArr;
        this.f257645f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppStagedBackground 3min sum pss > " + this.f257643d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257644e, 3, this.f257645f, C89496f.f257575c);
        C115669n.INSTANCE.mo175912v(1832, 10);
    }
}
