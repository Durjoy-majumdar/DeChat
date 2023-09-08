package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.e */
public final class C89495e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257570d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257571e;

    /* renamed from: f */
    public final /* synthetic */ int f257572f;

    public C89495e(long j, MemInfo[] memInfoArr, int i) {
        this.f257570d = j;
        this.f257571e = memInfoArr;
        this.f257572f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f257570d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257571e, 19, this.f257572f, C89496f.f257574b);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
