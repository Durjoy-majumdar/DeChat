package ah2;

import bi2.C92262a;
import fh2.C97880c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import java.util.List;

/* renamed from: ah2.a */
public final class C92000a {

    /* renamed from: a */
    public C97880c f263370a;

    /* renamed from: b */
    public List<C92262a> f263371b;

    /* renamed from: c */
    public float[] f263372c;

    /* renamed from: d */
    public float[] f263373d;

    /* renamed from: e */
    public String f263374e;

    /* renamed from: f */
    public String f263375f;

    /* renamed from: g */
    public int f263376g;

    /* renamed from: h */
    public boolean f263377h;

    /* renamed from: i */
    public boolean f263378i;

    /* renamed from: j */
    public int f263379j;

    /* renamed from: k */
    public String f263380k;

    public C92000a(C97880c cVar, List list, float[] fArr, float[] fArr2, String str, String str2, int i, boolean z, boolean z2, int i2, String str3, int i3, C8480h hVar) {
        fArr2 = (i3 & 8) != 0 ? null : fArr2;
        i = (i3 & 64) != 0 ? 1 : i;
        z = (i3 & 128) != 0 ? false : z;
        z2 = (i3 & 256) != 0 ? false : z2;
        i2 = (i3 & 512) != 0 ? 0 : i2;
        str3 = (i3 & 1024) != 0 ? "" : str3;
        C87412m.m108594g(cVar, "captureInfo");
        C87412m.m108594g(list, "editorItems");
        C87412m.m108594g(fArr, "drawingRect");
        C87412m.m108594g(str, "mixVideoPath");
        C87412m.m108594g(str2, "mixThumbPath");
        C87412m.m108594g(str3, "blurBgPath");
        this.f263370a = cVar;
        this.f263371b = list;
        this.f263372c = fArr;
        this.f263373d = fArr2;
        this.f263374e = str;
        this.f263375f = str2;
        this.f263376g = i;
        this.f263377h = z;
        this.f263378i = z2;
        this.f263379j = i2;
        this.f263380k = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92000a)) {
            return false;
        }
        C92000a aVar = (C92000a) obj;
        return C87412m.m108589b(this.f263370a, aVar.f263370a) && C87412m.m108589b(this.f263371b, aVar.f263371b) && C87412m.m108589b(this.f263372c, aVar.f263372c) && C87412m.m108589b(this.f263373d, aVar.f263373d) && C87412m.m108589b(this.f263374e, aVar.f263374e) && C87412m.m108589b(this.f263375f, aVar.f263375f) && this.f263376g == aVar.f263376g && this.f263377h == aVar.f263377h && this.f263378i == aVar.f263378i && this.f263379j == aVar.f263379j && C87412m.m108589b(this.f263380k, aVar.f263380k);
    }

    public int hashCode() {
        int hashCode = ((((this.f263370a.hashCode() * 31) + this.f263371b.hashCode()) * 31) + Arrays.hashCode(this.f263372c)) * 31;
        float[] fArr = this.f263373d;
        int hashCode2 = (((((((hashCode + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 31) + this.f263374e.hashCode()) * 31) + this.f263375f.hashCode()) * 31) + this.f263376g) * 31;
        boolean z = this.f263377h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f263378i;
        if (!z3) {
            z2 = z3;
        }
        return ((((i + (z2 ? 1 : 0)) * 31) + this.f263379j) * 31) + this.f263380k.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoMixData(captureInfo=");
        sb.append(this.f263370a);
        sb.append(", editorItems=");
        sb.append(this.f263371b);
        sb.append(", drawingRect=");
        String arrays = Arrays.toString(this.f263372c);
        C87412m.m108593f(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", mixVideoPath='");
        sb.append(this.f263374e);
        sb.append("', mixThumbPath='");
        sb.append(this.f263375f);
        sb.append("', retryTime=");
        sb.append(this.f263376g);
        sb.append(", useSoftEncode=");
        sb.append(this.f263377h);
        sb.append(", enableHevc=");
        sb.append(this.f263378i);
        sb.append(", thumbShortSide=");
        sb.append(this.f263379j);
        sb.append(", blurBgPath='");
        sb.append(this.f263380k);
        sb.append("')");
        return sb.toString();
    }
}
