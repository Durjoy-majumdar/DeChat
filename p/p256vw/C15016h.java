package p256vw;

import android.widget.Button;
import gy3.C87412m;

/* renamed from: vw.h */
public final class C15016h {

    /* renamed from: a */
    public final String f41139a;

    /* renamed from: b */
    public final int f41140b;

    /* renamed from: c */
    public final int f41141c;

    /* renamed from: d */
    public final C15014e f41142d;

    /* renamed from: e */
    public String f41143e;

    /* renamed from: f */
    public int f41144f;

    /* renamed from: g */
    public int f41145g;

    /* renamed from: h */
    public String f41146h;

    /* renamed from: i */
    public int f41147i;

    /* renamed from: j */
    public Button f41148j;

    /* renamed from: k */
    public C53002g f41149k;

    /* renamed from: l */
    public C15013c f41150l;

    public C15016h() {
        this("", 0, 32, (C15014e) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15016h)) {
            return false;
        }
        C15016h hVar = (C15016h) obj;
        return C87412m.m108589b(this.f41139a, hVar.f41139a) && this.f41140b == hVar.f41140b && this.f41141c == hVar.f41141c && C87412m.m108589b(this.f41142d, hVar.f41142d);
    }

    public int hashCode() {
        String str = this.f41139a;
        int i = 0;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.f41140b) * 31) + this.f41141c) * 31;
        C15014e eVar = this.f41142d;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SelectTextData(originalContent=" + this.f41139a + ", currentLength=" + this.f41140b + ", maxLength=" + this.f41141c + ", callback=" + this.f41142d + ')';
    }

    public C15016h(String str, int i, int i2, C15014e eVar) {
        this.f41139a = str;
        this.f41140b = i;
        this.f41141c = i2;
        this.f41142d = eVar;
        this.f41143e = "";
        this.f41144f = -1;
        this.f41145g = -1;
    }
}
