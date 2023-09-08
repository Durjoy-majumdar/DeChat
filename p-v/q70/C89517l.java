package q70;

import com.tencent.matrix.util.MemInfo;
import p723vf.C118672d;

/* renamed from: q70.l */
public final class C89517l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257609d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257610e;

    /* renamed from: f */
    public final /* synthetic */ int f257611f;

    public C89517l(long j, MemInfo[] memInfoArr, int i) {
        this.f257609d = j;
        this.f257610e = memInfoArr;
        this.f257611f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum debug-pss > " + this.f257609d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257610e, 26, this.f257611f, C89496f.f257574b);
    }
}
