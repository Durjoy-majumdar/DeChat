package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.p */
public final class C89523p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257619d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257620e;

    /* renamed from: f */
    public final /* synthetic */ int f257621f;

    public C89523p(long j, MemInfo[] memInfoArr, int i) {
        this.f257619d = j;
        this.f257620e = memInfoArr;
        this.f257621f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 3min sum pss > " + this.f257619d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257620e, 21, this.f257621f, C89496f.f257575c);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
