package p370p7;

import com.google.android.exoplayer2.Format;
import p370p7.C21920c;

/* renamed from: p7.d */
public class C21925d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f62020d;

    /* renamed from: e */
    public final /* synthetic */ Format f62021e;

    /* renamed from: f */
    public final /* synthetic */ int f62022f;

    /* renamed from: g */
    public final /* synthetic */ Object f62023g;

    /* renamed from: h */
    public final /* synthetic */ long f62024h;

    /* renamed from: i */
    public final /* synthetic */ C21920c.C21921a f62025i;

    public C21925d(C21920c.C21921a aVar, int i, Format format, int i2, Object obj, long j) {
        this.f62025i = aVar;
        this.f62020d = i;
        this.f62021e = format;
        this.f62022f = i2;
        this.f62023g = obj;
        this.f62024h = j;
    }

    public void run() {
        C21920c.C21921a aVar = this.f62025i;
        aVar.f61981b.mo33447k(this.f62020d, this.f62021e, this.f62022f, this.f62023g, C21920c.C21921a.m25190a(aVar, this.f62024h));
    }
}
