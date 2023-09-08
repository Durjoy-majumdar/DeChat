package p1107f1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import gy3.C8480h;
import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;
import p1050v2.C111318d;
import p1050v2.C111331h;

/* renamed from: f1.a */
public final class C107443a {

    /* renamed from: a */
    public final XmlPullParser f321459a;

    /* renamed from: b */
    public int f321460b;

    public C107443a(XmlPullParser xmlPullParser, int i, int i2, C8480h hVar) {
        i = (i2 & 2) != 0 ? 0 : i;
        C87412m.m108594g(xmlPullParser, "xmlParser");
        this.f321459a = xmlPullParser;
        this.f321460b = i;
    }

    /* renamed from: a */
    public final C111318d mo157824a(TypedArray typedArray, Resources.Theme theme, String str, int i, int i2) {
        C87412m.m108594g(typedArray, "typedArray");
        C87412m.m108594g(str, "attrName");
        C111318d b = C111331h.m151815b(typedArray, this.f321459a, theme, str, i, i2);
        mo157830f(typedArray.getChangingConfigurations());
        return b;
    }

    /* renamed from: b */
    public final float mo157825b(TypedArray typedArray, String str, int i, float f) {
        C87412m.m108594g(typedArray, "typedArray");
        C87412m.m108594g(str, "attrName");
        float c = C111331h.m151816c(typedArray, this.f321459a, str, i, f);
        mo157830f(typedArray.getChangingConfigurations());
        return c;
    }

    /* renamed from: c */
    public final int mo157826c(TypedArray typedArray, String str, int i, int i2) {
        C87412m.m108594g(typedArray, "typedArray");
        C87412m.m108594g(str, "attrName");
        int d = C111331h.m151817d(typedArray, this.f321459a, str, i, i2);
        mo157830f(typedArray.getChangingConfigurations());
        return d;
    }

    /* renamed from: d */
    public final String mo157827d(TypedArray typedArray, int i) {
        C87412m.m108594g(typedArray, "typedArray");
        String string = typedArray.getString(i);
        mo157830f(typedArray.getChangingConfigurations());
        return string;
    }

    /* renamed from: e */
    public final TypedArray mo157828e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        C87412m.m108594g(resources, "res");
        C87412m.m108594g(attributeSet, "set");
        C87412m.m108594g(iArr, "attrs");
        TypedArray h = C111331h.m151821h(resources, theme, attributeSet, iArr);
        C87412m.m108593f(h, "obtainAttributes(\n      …          attrs\n        )");
        mo157830f(h.getChangingConfigurations());
        return h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107443a)) {
            return false;
        }
        C107443a aVar = (C107443a) obj;
        return C87412m.m108589b(this.f321459a, aVar.f321459a) && this.f321460b == aVar.f321460b;
    }

    /* renamed from: f */
    public final void mo157830f(int i) {
        this.f321460b = i | this.f321460b;
    }

    public int hashCode() {
        return (this.f321459a.hashCode() * 31) + this.f321460b;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f321459a + ", config=" + this.f321460b + ')';
    }
}
