package ia0;

import gy3.C87412m;
import te3.C64237ap1;

/* renamed from: ia0.l */
public final class C60263l {

    /* renamed from: a */
    public final int f171805a;

    /* renamed from: b */
    public String f171806b;

    /* renamed from: c */
    public C64237ap1 f171807c;

    public C60263l(int i, String str, C64237ap1 ap12) {
        this.f171805a = i;
        this.f171806b = str;
        this.f171807c = ap12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60263l)) {
            return false;
        }
        C60263l lVar = (C60263l) obj;
        return this.f171805a == lVar.f171805a && C87412m.m108589b(this.f171806b, lVar.f171806b) && C87412m.m108589b(this.f171807c, lVar.f171807c);
    }

    public int hashCode() {
        int i = this.f171805a * 31;
        String str = this.f171806b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        C64237ap1 ap12 = this.f171807c;
        if (ap12 != null) {
            i2 = ap12.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "TemplateResult(result=" + this.f171805a + ", path=" + this.f171806b + ", templateInfo=" + this.f171807c + ')';
    }
}
