package li3;

import gy3.C87412m;
import rr3.C110647w;

/* renamed from: li3.g */
public final class C109389g {

    /* renamed from: a */
    public C109388f f327464a;

    /* renamed from: b */
    public C109388f f327465b;

    /* renamed from: c */
    public C110647w f327466c;

    /* renamed from: d */
    public long f327467d;

    /* renamed from: e */
    public String f327468e;

    public C109389g(C109388f fVar, C109388f fVar2, C110647w wVar, long j, String str) {
        C87412m.m108595h(fVar, "beforeTrack");
        C87412m.m108595h(fVar2, "afterTrack");
        C87412m.m108595h(wVar, "transitionEffect");
        C87412m.m108595h(str, "path");
        this.f327464a = fVar;
        this.f327465b = fVar2;
        this.f327466c = wVar;
        this.f327467d = j;
        this.f327468e = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109389g) {
                C109389g gVar = (C109389g) obj;
                if (C87412m.m108589b(this.f327464a, gVar.f327464a) && C87412m.m108589b(this.f327465b, gVar.f327465b) && C87412m.m108589b(this.f327466c, gVar.f327466c)) {
                    if (!(this.f327467d == gVar.f327467d) || !C87412m.m108589b(this.f327468e, gVar.f327468e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C109388f fVar = this.f327464a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        C109388f fVar2 = this.f327465b;
        int hashCode2 = (hashCode + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        C110647w wVar = this.f327466c;
        int hashCode3 = wVar != null ? wVar.hashCode() : 0;
        long j = this.f327467d;
        int i2 = (((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f327468e;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "TrackTransitionInfo(beforeTrack=" + this.f327464a + ", afterTrack=" + this.f327465b + ", transitionEffect=" + this.f327466c + ", durationMs=" + this.f327467d + ", path=" + this.f327468e + ")";
    }
}
