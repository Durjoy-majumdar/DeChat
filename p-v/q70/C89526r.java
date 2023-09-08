package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.r */
public final class C89526r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257626d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257627e;

    /* renamed from: f */
    public final /* synthetic */ int f257628f;

    public C89526r(long j, MemInfo[] memInfoArr, int i) {
        this.f257626d = j;
        this.f257627e = memInfoArr;
        this.f257628f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 3min sum pss > " + this.f257626d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257627e, 8, this.f257628f, C89496f.f257575c);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
