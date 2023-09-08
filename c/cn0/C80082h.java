package cn0;

import android.os.Handler;
import android.os.SystemClock;
import cn0.C80075b;
import fn0.C86996a;

/* renamed from: cn0.h */
public class C80082h implements C80075b {

    /* renamed from: a */
    public final C80077c f234527a = new C80106q();

    /* renamed from: b */
    public final C80102p f234528b = new C80102p(2000);

    /* renamed from: c */
    public long f234529c;

    /* renamed from: d */
    public long f234530d;

    /* renamed from: e */
    public int f234531e;

    public C80082h(Handler handler, C80075b.C80076a aVar) {
    }

    /* renamed from: a */
    public synchronized void mo110329a(int i) {
        this.f234529c += (long) i;
    }

    /* renamed from: b */
    public synchronized void mo110330b() {
        C86996a.m107998a(this.f234531e > 0);
        ((C80106q) this.f234527a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.f234530d);
        if (i > 0) {
            long j = this.f234529c;
            this.f234528b.mo110346a((int) Math.sqrt((double) j), (float) ((8000 * j) / ((long) i)));
            Float.isNaN(this.f234528b.mo110347b(0.5f));
        }
        int i2 = this.f234531e - 1;
        this.f234531e = i2;
        if (i2 > 0) {
            this.f234530d = elapsedRealtime;
        }
        this.f234529c = 0;
    }

    /* renamed from: c */
    public synchronized void mo110331c() {
        if (this.f234531e == 0) {
            ((C80106q) this.f234527a).getClass();
            this.f234530d = SystemClock.elapsedRealtime();
        }
        this.f234531e++;
    }
}
