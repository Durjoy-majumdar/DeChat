package o50;

import c30.C104289g;
import c30.C26827e;
import gy3.C87412m;

/* renamed from: o50.a */
public final class C61939a {

    /* renamed from: a */
    public static final C61939a f176063a = new C61939a();

    /* renamed from: o50.a$a */
    public static final class C61940a {

        /* renamed from: a */
        public final String f176064a;

        /* renamed from: b */
        public final float f176065b;

        /* renamed from: c */
        public final String f176066c;

        /* renamed from: d */
        public final String f176067d;

        /* renamed from: e */
        public final float f176068e;

        /* renamed from: f */
        public final float f176069f;

        /* renamed from: g */
        public final float f176070g;

        /* renamed from: h */
        public final float f176071h;

        /* renamed from: i */
        public final String f176072i;

        /* renamed from: j */
        public final String f176073j;

        public C61940a(String str, float f, String str2, String str3, float f2, float f3, float f4, float f5, String str4, String str5) {
            C87412m.m108594g(str, "sdkUserId");
            C87412m.m108594g(str2, "gestureId");
            C87412m.m108594g(str3, "randomId");
            C87412m.m108594g(str4, "giftComboId");
            C87412m.m108594g(str5, "giftSoundId");
            this.f176064a = str;
            this.f176065b = f;
            this.f176066c = str2;
            this.f176067d = str3;
            this.f176068e = f2;
            this.f176069f = f3;
            this.f176070g = f4;
            this.f176071h = f5;
            this.f176072i = str4;
            this.f176073j = str5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61940a)) {
                return false;
            }
            C61940a aVar = (C61940a) obj;
            return C87412m.m108589b(this.f176064a, aVar.f176064a) && C87412m.m108589b(Float.valueOf(this.f176065b), Float.valueOf(aVar.f176065b)) && C87412m.m108589b(this.f176066c, aVar.f176066c) && C87412m.m108589b(this.f176067d, aVar.f176067d) && C87412m.m108589b(Float.valueOf(this.f176068e), Float.valueOf(aVar.f176068e)) && C87412m.m108589b(Float.valueOf(this.f176069f), Float.valueOf(aVar.f176069f)) && C87412m.m108589b(Float.valueOf(this.f176070g), Float.valueOf(aVar.f176070g)) && C87412m.m108589b(Float.valueOf(this.f176071h), Float.valueOf(aVar.f176071h)) && C87412m.m108589b(this.f176072i, aVar.f176072i) && C87412m.m108589b(this.f176073j, aVar.f176073j);
        }

        public int hashCode() {
            return (((((((((((((((((this.f176064a.hashCode() * 31) + Float.floatToIntBits(this.f176065b)) * 31) + this.f176066c.hashCode()) * 31) + this.f176067d.hashCode()) * 31) + Float.floatToIntBits(this.f176068e)) * 31) + Float.floatToIntBits(this.f176069f)) * 31) + Float.floatToIntBits(this.f176070g)) * 31) + Float.floatToIntBits(this.f176071h)) * 31) + this.f176072i.hashCode()) * 31) + this.f176073j.hashCode();
        }

        public String toString() {
            return "GestureSei(sdkUserId=" + this.f176064a + ", aspect=" + this.f176065b + ", gestureId=" + this.f176066c + ", randomId=" + this.f176067d + ", transX=" + this.f176068e + ", transY=" + this.f176069f + ", rotation=" + this.f176070g + ", scale=" + this.f176071h + ", giftComboId=" + this.f176072i + ", giftSoundId=" + this.f176073j + ')';
        }
    }

    /* renamed from: a */
    public final C61940a mo86852a(String str) {
        String str2 = str;
        C87412m.m108594g(str2, "sei");
        C104289g gVar = new C104289g(str2);
        C26827e l = gVar.optJSONArray("ga");
        boolean z = false;
        String str3 = null;
        C104289g p = l != null ? l.optJSONObject(0) : null;
        String optString = gVar.optString("gs");
        if (p == null) {
            C87412m.m108593f(optString, "giftSoundId");
            if (optString.length() == 0) {
                z = true;
            }
            if (z) {
                return null;
            }
        }
        String optString2 = gVar.optString("u");
        float optDouble = (float) gVar.optDouble("a");
        String optString3 = p != null ? p.optString("id") : null;
        String str4 = optString3 == null ? "" : optString3;
        String optString4 = p != null ? p.optString("i") : null;
        String str5 = optString4 == null ? "" : optString4;
        float optDouble2 = p != null ? (float) p.optDouble("x") : 0.0f;
        float optDouble3 = p != null ? (float) p.optDouble("y") : 0.0f;
        float optDouble4 = p != null ? (float) p.optDouble("r") : 0.0f;
        float optDouble5 = p != null ? (float) p.optDouble("s") : 0.0f;
        if (p != null) {
            str3 = p.optString("g");
        }
        String str6 = str3 == null ? "" : str3;
        C87412m.m108593f(optString2, "sdkUserId");
        C87412m.m108593f(optString, "giftSoundId");
        return new C61940a(optString2, optDouble, str4, str5, optDouble2, optDouble3, optDouble4, optDouble5, str6, optString);
    }
}
