package p333e8;

import android.os.SystemClock;
import p396x6.C22994b;
import p396x6.C23016o;

/* renamed from: e8.s */
public final class C20547s implements C20535i {

    /* renamed from: d */
    public boolean f57828d;

    /* renamed from: e */
    public long f57829e;

    /* renamed from: f */
    public long f57830f;

    /* renamed from: g */
    public C23016o f57831g = C23016o.f66185d;

    /* renamed from: a */
    public void mo32129a(long j) {
        this.f57829e = j;
        if (this.f57828d) {
            this.f57830f = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: c */
    public C23016o mo32081c(C23016o oVar) {
        if (this.f57828d) {
            mo32129a(mo32083r());
        }
        this.f57831g = oVar;
        return oVar;
    }

    /* renamed from: d */
    public C23016o mo32082d() {
        return this.f57831g;
    }

    /* renamed from: r */
    public long mo32083r() {
        long j = this.f57829e;
        if (!this.f57828d) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f57830f;
        C23016o oVar = this.f57831g;
        return j + (oVar.f66186a == 1.0f ? C22994b.m27203a(elapsedRealtime) : elapsedRealtime * ((long) oVar.f66188c));
    }
}
