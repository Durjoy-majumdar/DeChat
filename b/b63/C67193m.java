package b63;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;

/* renamed from: b63.m */
public final class C67193m {

    /* renamed from: a */
    public final String f192915a;

    /* renamed from: b */
    public final String f192916b;

    /* renamed from: c */
    public final String f192917c;

    /* renamed from: d */
    public final String f192918d;

    public C67193m(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "wording");
        C87412m.m108594g(str3, "cancelBtn");
        C87412m.m108594g(str4, "confirmBtn");
        this.f192915a = str;
        this.f192916b = str2;
        this.f192917c = str3;
        this.f192918d = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67193m)) {
            return false;
        }
        C67193m mVar = (C67193m) obj;
        return C87412m.m108589b(this.f192915a, mVar.f192915a) && C87412m.m108589b(this.f192916b, mVar.f192916b) && C87412m.m108589b(this.f192917c, mVar.f192917c) && C87412m.m108589b(this.f192918d, mVar.f192918d);
    }

    public int hashCode() {
        return (((((this.f192915a.hashCode() * 31) + this.f192916b.hashCode()) * 31) + this.f192917c.hashCode()) * 31) + this.f192918d.hashCode();
    }

    public String toString() {
        return "HalfPageDialog(title=" + this.f192915a + ", wording=" + this.f192916b + ", cancelBtn=" + this.f192917c + ", confirmBtn=" + this.f192918d + ')';
    }
}
