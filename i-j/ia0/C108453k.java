package ia0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.tavkit.component.TAVExporter;
import e80.C107261i;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ia0.k */
public final class C108453k {

    /* renamed from: a */
    public DimensionLevel f324763a;

    /* renamed from: b */
    public C107261i f324764b;

    /* renamed from: c */
    public int f324765c;

    /* renamed from: d */
    public int f324766d;

    /* renamed from: e */
    public int f324767e;

    public C108453k() {
        this((DimensionLevel) null, (C107261i) null, 0, 0, 0, 31, (C8480h) null);
    }

    public C108453k(DimensionLevel dimensionLevel, C107261i iVar, int i, int i2, int i3, int i4, C8480h hVar) {
        dimensionLevel = (i4 & 1) != 0 ? DimensionLevel.DIMENSION_LEVEL_720 : dimensionLevel;
        iVar = (i4 & 2) != 0 ? new C107261i(TAVExporter.VIDEO_EXPORT_WIDTH, 1280) : iVar;
        i = (i4 & 4) != 0 ? 233333 : i;
        i2 = (i4 & 8) != 0 ? 41000 : i2;
        i3 = (i4 & 16) != 0 ? 30 : i3;
        C87412m.m108594g(dimensionLevel, FirebaseAnalytics.C113379b.LEVEL);
        C87412m.m108594g(iVar, "outputSize");
        this.f324763a = dimensionLevel;
        this.f324764b = iVar;
        this.f324765c = i;
        this.f324766d = i2;
        this.f324767e = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108453k)) {
            return false;
        }
        C108453k kVar = (C108453k) obj;
        return this.f324763a == kVar.f324763a && C87412m.m108589b(this.f324764b, kVar.f324764b) && this.f324765c == kVar.f324765c && this.f324766d == kVar.f324766d && this.f324767e == kVar.f324767e;
    }

    public int hashCode() {
        return (((((((this.f324763a.hashCode() * 31) + this.f324764b.hashCode()) * 31) + this.f324765c) * 31) + this.f324766d) * 31) + this.f324767e;
    }

    public String toString() {
        return "TemplateOutputInfo(level=" + this.f324763a + ", outputSize=" + this.f324764b + ", videoBitsPerFrame=" + this.f324765c + ", averageAudioBitRate=" + this.f324766d + ", maxKeyframeInterval=" + this.f324767e + ')';
    }
}
