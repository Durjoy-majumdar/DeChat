package eg2;

import com.tencent.p014mm.plugin.radar.model.RadarAddContact;

/* renamed from: eg2.e */
public final class C75614e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RadarAddContact f222128d;

    /* renamed from: e */
    public final /* synthetic */ boolean f222129e;

    /* renamed from: f */
    public final /* synthetic */ String f222130f;

    /* renamed from: g */
    public final /* synthetic */ String f222131g;

    /* renamed from: h */
    public final /* synthetic */ long f222132h;

    public C75614e(RadarAddContact radarAddContact, boolean z, String str, String str2, long j) {
        this.f222128d = radarAddContact;
        this.f222129e = z;
        this.f222130f = str;
        this.f222131g = str2;
        this.f222132h = j;
    }

    public final void run() {
        this.f222128d.f203277d.mo96916b(this.f222129e, this.f222130f, this.f222131g, this.f222132h);
    }
}
