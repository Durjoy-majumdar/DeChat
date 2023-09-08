package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.a */
public final class C89486a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257557d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257558e;

    /* renamed from: f */
    public final /* synthetic */ int f257559f;

    public C89486a(long j, MemInfo[] memInfoArr, int i) {
        this.f257557d = j;
        this.f257558e = memInfoArr;
        this.f257559f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum pss > " + this.f257557d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257558e, 24, this.f257559f, C89496f.f257576d);
        C115669n.INSTANCE.mo175912v(1832, 11);
    }
}
