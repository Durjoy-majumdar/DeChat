package vq1;

import gy3.C87412m;
import je1.C60811w;
import te3.C49712hj1;
import te3.C64414h71;
import vq1.C65866w;
import vq1.C65869y;

/* renamed from: vq1.p */
public final class C65859p extends C14961i {

    /* renamed from: c */
    public final String f189384c;

    /* renamed from: d */
    public final int f189385d;

    /* renamed from: e */
    public final long f189386e;

    /* renamed from: f */
    public final C49712hj1 f189387f;

    /* renamed from: g */
    public final boolean f189388g;

    /* renamed from: h */
    public final int f189389h;

    /* renamed from: i */
    public String f189390i;

    /* renamed from: j */
    public final C64414h71 f189391j;

    /* renamed from: k */
    public final Integer f189392k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65859p(String str, int i, long j, C49712hj1 hj12, boolean z, int i2, String str2, C64414h71 h712, Integer num) {
        super((C65866w.C14969b) null);
        C87412m.m108594g(str, "finderUser");
        C87412m.m108594g(str2, "participantFinderUsername");
        this.f189384c = str;
        this.f189385d = i;
        this.f189386e = j;
        this.f189387f = hj12;
        this.f189388g = z;
        this.f189389h = i2;
        this.f189390i = str2;
        this.f189391j = h712;
        this.f189392k = num;
    }

    /* renamed from: a */
    public void mo14007a(C65869y.C65870a aVar) {
        C87412m.m108594g(aVar, "callback");
        super.mo14007a(aVar);
        new C60811w(this, false).mo9225i().mo123420E(new C65858o(this, aVar));
    }

    /* renamed from: c */
    public String mo14008c() {
        return "id_" + this.f189384c + '_' + this.f189385d;
    }

    public String toString() {
        return "action_" + this.f189384c + '_' + this.f189385d + '_' + this.f41018b + '_' + this.f189390i;
    }
}
