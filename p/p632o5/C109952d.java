package p632o5;

import a14.C53896h0;
import android.graphics.Bitmap;
import androidx.lifecycle.C39623j;
import gy3.C87412m;
import p1152s5.C110740c;
import p643p5.C110166b;
import p643p5.C110168e;
import p643p5.C110169f;

/* renamed from: o5.d */
public final class C109952d {

    /* renamed from: a */
    public final C39623j f328967a;

    /* renamed from: b */
    public final C110169f f328968b;

    /* renamed from: c */
    public final C110168e f328969c;

    /* renamed from: d */
    public final C53896h0 f328970d;

    /* renamed from: e */
    public final C110740c f328971e;

    /* renamed from: f */
    public final C110166b f328972f;

    /* renamed from: g */
    public final Bitmap.Config f328973g;

    /* renamed from: h */
    public final Boolean f328974h;

    /* renamed from: i */
    public final Boolean f328975i;

    /* renamed from: j */
    public final C109950b f328976j;

    /* renamed from: k */
    public final C109950b f328977k;

    /* renamed from: l */
    public final C109950b f328978l;

    public C109952d(C39623j jVar, C110169f fVar, C110168e eVar, C53896h0 h0Var, C110740c cVar, C110166b bVar, Bitmap.Config config, Boolean bool, Boolean bool2, C109950b bVar2, C109950b bVar3, C109950b bVar4) {
        this.f328967a = jVar;
        this.f328968b = fVar;
        this.f328969c = eVar;
        this.f328970d = h0Var;
        this.f328971e = cVar;
        this.f328972f = bVar;
        this.f328973g = config;
        this.f328974h = bool;
        this.f328975i = bool2;
        this.f328976j = bVar2;
        this.f328977k = bVar3;
        this.f328978l = bVar4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C109952d) {
            C109952d dVar = (C109952d) obj;
            return C87412m.m108589b(this.f328967a, dVar.f328967a) && C87412m.m108589b(this.f328968b, dVar.f328968b) && this.f328969c == dVar.f328969c && C87412m.m108589b(this.f328970d, dVar.f328970d) && C87412m.m108589b(this.f328971e, dVar.f328971e) && this.f328972f == dVar.f328972f && this.f328973g == dVar.f328973g && C87412m.m108589b(this.f328974h, dVar.f328974h) && C87412m.m108589b(this.f328975i, dVar.f328975i) && this.f328976j == dVar.f328976j && this.f328977k == dVar.f328977k && this.f328978l == dVar.f328978l;
        }
    }

    public int hashCode() {
        C39623j jVar = this.f328967a;
        int i = 0;
        int hashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        C110169f fVar = this.f328968b;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        C110168e eVar = this.f328969c;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        C53896h0 h0Var = this.f328970d;
        int hashCode4 = (hashCode3 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        C110740c cVar = this.f328971e;
        int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C110166b bVar = this.f328972f;
        int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Bitmap.Config config = this.f328973g;
        int hashCode7 = (hashCode6 + (config == null ? 0 : config.hashCode())) * 31;
        Boolean bool = this.f328974h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f328975i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C109950b bVar2 = this.f328976j;
        int hashCode10 = (hashCode9 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        C109950b bVar3 = this.f328977k;
        int hashCode11 = (hashCode10 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        C109950b bVar4 = this.f328978l;
        if (bVar4 != null) {
            i = bVar4.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        return "DefinedRequestOptions(lifecycle=" + this.f328967a + ", sizeResolver=" + this.f328968b + ", scale=" + this.f328969c + ", dispatcher=" + this.f328970d + ", transition=" + this.f328971e + ", precision=" + this.f328972f + ", bitmapConfig=" + this.f328973g + ", allowHardware=" + this.f328974h + ", allowRgb565=" + this.f328975i + ", memoryCachePolicy=" + this.f328976j + ", diskCachePolicy=" + this.f328977k + ", networkCachePolicy=" + this.f328978l + ')';
    }
}
