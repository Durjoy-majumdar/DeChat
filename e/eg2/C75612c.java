package eg2;

import com.tencent.p014mm.plugin.radar.model.RadarAddContact;

/* renamed from: eg2.c */
public final class C75612c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RadarAddContact f222120d;

    /* renamed from: e */
    public final /* synthetic */ boolean f222121e;

    /* renamed from: f */
    public final /* synthetic */ boolean f222122f;

    /* renamed from: g */
    public final /* synthetic */ String f222123g;

    /* renamed from: h */
    public final /* synthetic */ String f222124h;

    /* renamed from: i */
    public final /* synthetic */ long f222125i;

    public C75612c(RadarAddContact radarAddContact, boolean z, boolean z2, String str, String str2, long j) {
        this.f222120d = radarAddContact;
        this.f222121e = z;
        this.f222122f = z2;
        this.f222123g = str;
        this.f222124h = str2;
        this.f222125i = j;
    }

    public final void run() {
        this.f222120d.f203277d.mo96919g(this.f222121e, this.f222122f, this.f222123g, this.f222124h, this.f222125i);
    }
}
