package p972h5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import d24.C20419r;
import gy3.C87412m;
import p632o5.C109950b;
import p632o5.C35103l;
import p643p5.C110168e;

/* renamed from: h5.i */
public final class C108143i {

    /* renamed from: a */
    public final Context f323810a;

    /* renamed from: b */
    public final Bitmap.Config f323811b;

    /* renamed from: c */
    public final ColorSpace f323812c;

    /* renamed from: d */
    public final C110168e f323813d;

    /* renamed from: e */
    public final boolean f323814e;

    /* renamed from: f */
    public final boolean f323815f;

    /* renamed from: g */
    public final boolean f323816g;

    /* renamed from: h */
    public final C20419r f323817h;

    /* renamed from: i */
    public final C35103l f323818i;

    /* renamed from: j */
    public final C109950b f323819j;

    /* renamed from: k */
    public final C109950b f323820k;

    /* renamed from: l */
    public final C109950b f323821l;

    public C108143i(Context context, Bitmap.Config config, ColorSpace colorSpace, C110168e eVar, boolean z, boolean z2, boolean z3, C20419r rVar, C35103l lVar, C109950b bVar, C109950b bVar2, C109950b bVar3) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(config, "config");
        C87412m.m108594g(eVar, "scale");
        C87412m.m108594g(rVar, "headers");
        C87412m.m108594g(lVar, "parameters");
        C87412m.m108594g(bVar, "memoryCachePolicy");
        C87412m.m108594g(bVar2, "diskCachePolicy");
        C87412m.m108594g(bVar3, "networkCachePolicy");
        this.f323810a = context;
        this.f323811b = config;
        this.f323812c = colorSpace;
        this.f323813d = eVar;
        this.f323814e = z;
        this.f323815f = z2;
        this.f323816g = z3;
        this.f323817h = rVar;
        this.f323818i = lVar;
        this.f323819j = bVar;
        this.f323820k = bVar2;
        this.f323821l = bVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C108143i) {
            C108143i iVar = (C108143i) obj;
            return C87412m.m108589b(this.f323810a, iVar.f323810a) && this.f323811b == iVar.f323811b && (Build.VERSION.SDK_INT < 26 || C87412m.m108589b(this.f323812c, iVar.f323812c)) && this.f323813d == iVar.f323813d && this.f323814e == iVar.f323814e && this.f323815f == iVar.f323815f && this.f323816g == iVar.f323816g && C87412m.m108589b(this.f323817h, iVar.f323817h) && C87412m.m108589b(this.f323818i, iVar.f323818i) && this.f323819j == iVar.f323819j && this.f323820k == iVar.f323820k && this.f323821l == iVar.f323821l;
        }
    }

    public int hashCode() {
        int hashCode = ((this.f323810a.hashCode() * 31) + this.f323811b.hashCode()) * 31;
        ColorSpace colorSpace = this.f323812c;
        int i = 1231;
        int hashCode2 = (((((((hashCode + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31) + this.f323813d.hashCode()) * 31) + (this.f323814e ? 1231 : 1237)) * 31) + (this.f323815f ? 1231 : 1237)) * 31;
        if (!this.f323816g) {
            i = 1237;
        }
        return ((((((((((hashCode2 + i) * 31) + this.f323817h.hashCode()) * 31) + this.f323818i.hashCode()) * 31) + this.f323819j.hashCode()) * 31) + this.f323820k.hashCode()) * 31) + this.f323821l.hashCode();
    }

    public String toString() {
        return "Options(context=" + this.f323810a + ", config=" + this.f323811b + ", colorSpace=" + this.f323812c + ", scale=" + this.f323813d + ", allowInexactSize=" + this.f323814e + ", allowRgb565=" + this.f323815f + ", premultipliedAlpha=" + this.f323816g + ", headers=" + this.f323817h + ", parameters=" + this.f323818i + ", memoryCachePolicy=" + this.f323819j + ", diskCachePolicy=" + this.f323820k + ", networkCachePolicy=" + this.f323821l + ')';
    }
}
