package p370p7;

import com.google.android.exoplayer2.Format;
import p300c8.C79950j;
import p370p7.C21920c;

/* renamed from: p7.b */
public class C21919b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79950j f61970d;

    /* renamed from: e */
    public final /* synthetic */ int f61971e;

    /* renamed from: f */
    public final /* synthetic */ int f61972f;

    /* renamed from: g */
    public final /* synthetic */ Format f61973g;

    /* renamed from: h */
    public final /* synthetic */ int f61974h;

    /* renamed from: i */
    public final /* synthetic */ Object f61975i;

    /* renamed from: j */
    public final /* synthetic */ long f61976j;

    /* renamed from: n */
    public final /* synthetic */ long f61977n;

    /* renamed from: o */
    public final /* synthetic */ long f61978o;

    /* renamed from: p */
    public final /* synthetic */ C21920c.C21921a f61979p;

    public C21919b(C21920c.C21921a aVar, C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
        this.f61979p = aVar;
        this.f61970d = jVar;
        this.f61971e = i;
        this.f61972f = i2;
        this.f61973g = format;
        this.f61974h = i3;
        this.f61975i = obj;
        this.f61976j = j;
        this.f61977n = j2;
        this.f61978o = j3;
    }

    public void run() {
        C21920c.C21921a aVar = this.f61979p;
        aVar.f61981b.mo33451o(this.f61970d, this.f61971e, this.f61972f, this.f61973g, this.f61974h, this.f61975i, C21920c.C21921a.m25190a(aVar, this.f61976j), C21920c.C21921a.m25190a(this.f61979p, this.f61977n), this.f61978o);
    }
}
