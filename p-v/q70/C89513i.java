package q70;

import com.tencent.matrix.util.MemInfo;
import p723vf.C118672d;

/* renamed from: q70.i */
public final class C89513i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f257603d;

    /* renamed from: e */
    public final /* synthetic */ MemInfo[] f257604e;

    /* renamed from: f */
    public final /* synthetic */ int f257605f;

    public C89513i(long j, MemInfo[] memInfoArr, int i) {
        this.f257603d = j;
        this.f257604e = memInfoArr;
        this.f257605f = i;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.AppBackgroundMemory", "AppDeepBackground 1min sum ams-pss with isolated xweb pss > " + this.f257603d, new Object[0]);
        C89496f.m111882a(C89496f.f257573a, this.f257604e, 27, this.f257605f, C89496f.f257574b);
    }
}
