package p300c8;

import android.os.Handler;
import android.os.SystemClock;
import p300c8.C16871d;
import p333e8.C20528a;
import p333e8.C20529c;
import p333e8.C20543r;
import p333e8.C20548t;

/* renamed from: c8.m */
public final class C16875m implements C16871d, C79967x<Object> {

    /* renamed from: a */
    public final Handler f45607a;

    /* renamed from: b */
    public final C16871d.C16872a f45608b;

    /* renamed from: c */
    public final C20543r f45609c = new C20543r(2000);

    /* renamed from: d */
    public final C20529c f45610d;

    /* renamed from: e */
    public int f45611e;

    /* renamed from: f */
    public long f45612f;

    /* renamed from: g */
    public long f45613g;

    /* renamed from: h */
    public long f45614h;

    /* renamed from: i */
    public long f45615i;

    /* renamed from: j */
    public long f45616j;

    public C16875m(Handler handler, C16871d.C16872a aVar) {
        C20529c cVar = C20529c.f57773a;
        this.f45607a = handler;
        this.f45608b = aVar;
        this.f45610d = cVar;
        this.f45616j = -1;
    }

    /* renamed from: a */
    public synchronized void mo17931a(Object obj, int i) {
        this.f45613g += (long) i;
    }

    /* renamed from: b */
    public synchronized long mo17927b() {
        return this.f45616j;
    }

    /* renamed from: c */
    public synchronized void mo17932c(Object obj, C79950j jVar) {
        if (this.f45611e == 0) {
            ((C20548t) this.f45610d).getClass();
            this.f45612f = SystemClock.elapsedRealtime();
        }
        this.f45611e++;
    }

    /* renamed from: d */
    public synchronized void mo17933d(Object obj) {
        C20528a.m22240d(this.f45611e > 0);
        ((C20548t) this.f45610d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.f45612f);
        long j = (long) i;
        this.f45614h += j;
        long j2 = this.f45615i;
        long j3 = this.f45613g;
        this.f45615i = j2 + j3;
        if (i > 0) {
            this.f45609c.mo32125a((int) Math.sqrt((double) j3), (float) ((8000 * j3) / j));
            if (this.f45614h >= 2000 || this.f45615i >= 524288) {
                float b = this.f45609c.mo32126b(0.5f);
                this.f45616j = Float.isNaN(b) ? -1 : (long) b;
            }
        }
        long j4 = this.f45613g;
        long j5 = this.f45616j;
        Handler handler = this.f45607a;
        if (!(handler == null || this.f45608b == null)) {
            handler.post(new C16874l(this, i, j4, j5));
        }
        int i2 = this.f45611e - 1;
        this.f45611e = i2;
        if (i2 > 0) {
            this.f45612f = elapsedRealtime;
        }
        this.f45613g = 0;
    }
}
