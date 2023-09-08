package mn0;

import android.os.Handler;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import p300c8.C16871d;
import p300c8.C79950j;
import p300c8.C79967x;
import p333e8.C20528a;
import p333e8.C20529c;
import p333e8.C20548t;

/* renamed from: mn0.b */
public final class C21518b implements C16871d, C79967x<Object> {

    /* renamed from: a */
    public final Handler f60921a = null;

    /* renamed from: b */
    public final C16871d.C16872a f60922b = null;

    /* renamed from: c */
    public final C20529c f60923c;

    /* renamed from: d */
    public final C21519c f60924d;

    /* renamed from: e */
    public int f60925e;

    /* renamed from: f */
    public long f60926f;

    /* renamed from: g */
    public long f60927g;

    /* renamed from: h */
    public long f60928h;

    /* renamed from: i */
    public long f60929i;

    /* renamed from: j */
    public long f60930j;

    public C21518b() {
        C20529c cVar = C20529c.f57773a;
        this.f60923c = cVar;
        this.f60924d = new C21519c(2000);
        this.f60930j = -1;
    }

    /* renamed from: a */
    public synchronized void mo17931a(Object obj, int i) {
        C87412m.m108594g(obj, FirebaseAnalytics.C113379b.SOURCE);
        this.f60927g += (long) i;
    }

    /* renamed from: b */
    public synchronized long mo17927b() {
        return this.f60930j;
    }

    /* renamed from: c */
    public synchronized void mo17932c(Object obj, C79950j jVar) {
        C87412m.m108594g(obj, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(jVar, "dataSpec");
        if (this.f60925e == 0) {
            ((C20548t) this.f60923c).getClass();
            this.f60926f = SystemClock.elapsedRealtime();
        }
        this.f60925e++;
    }

    /* renamed from: d */
    public synchronized void mo17933d(Object obj) {
        long j;
        C87412m.m108594g(obj, FirebaseAnalytics.C113379b.SOURCE);
        C20528a.m22240d(this.f60925e > 0);
        ((C20548t) this.f60923c).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.f60926f);
        long j2 = (long) i;
        this.f60928h += j2;
        long j3 = this.f60929i;
        long j4 = this.f60927g;
        this.f60929i = j3 + j4;
        if (i > 0) {
            this.f60924d.mo33731a((int) Math.sqrt((double) j4), (float) ((8000 * j4) / j2));
            if (this.f60928h >= 2000 || this.f60929i >= 524288) {
                float b = this.f60924d.mo33732b();
                if (!Float.isNaN(b)) {
                    if (b >= 0.0f) {
                        j = (long) b;
                        this.f60930j = j;
                    }
                }
                j = -1;
                this.f60930j = j;
            }
        }
        long j5 = this.f60927g;
        long j6 = this.f60930j;
        Handler handler = this.f60921a;
        if (!(handler == null || this.f60922b == null)) {
            handler.post(new C21517a(this, i, j5, j6));
        }
        int i2 = this.f60925e - 1;
        this.f60925e = i2;
        if (i2 > 0) {
            this.f60926f = elapsedRealtime;
        }
        this.f60927g = 0;
    }
}
