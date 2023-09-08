package p436a1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import gy3.C87412m;
import p450b1.C103979c;
import p450b1.C103981e;

/* renamed from: a1.m */
public final class C103247m {
    /* renamed from: a */
    public static final C103979c m136701a(Bitmap bitmap) {
        C103979c b;
        C87412m.m108594g(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (b = m136702b(colorSpace)) != null) {
            return b;
        }
        C103981e eVar = C103981e.f307538a;
        return C103981e.f307541d;
    }

    /* renamed from: b */
    public static final C103979c m136702b(ColorSpace colorSpace) {
        C87412m.m108594g(colorSpace, "<this>");
        if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB))) {
            C103981e eVar = C103981e.f307538a;
            return C103981e.f307541d;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.ACES))) {
            C103981e eVar2 = C103981e.f307538a;
            return C103981e.f307553p;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG))) {
            C103981e eVar3 = C103981e.f307538a;
            return C103981e.f307554q;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            C103981e eVar4 = C103981e.f307538a;
            return C103981e.f307551n;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020))) {
            C103981e eVar5 = C103981e.f307538a;
            return C103981e.f307546i;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.BT709))) {
            C103981e eVar6 = C103981e.f307538a;
            return C103981e.f307545h;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            C103981e eVar7 = C103981e.f307538a;
            return C103981e.f307556s;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            C103981e eVar8 = C103981e.f307538a;
            return C103981e.f307555r;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            C103981e eVar9 = C103981e.f307538a;
            return C103981e.f307547j;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            C103981e eVar10 = C103981e.f307538a;
            return C103981e.f307548k;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            C103981e eVar11 = C103981e.f307538a;
            return C103981e.f307543f;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            C103981e eVar12 = C103981e.f307538a;
            return C103981e.f307544g;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            C103981e eVar13 = C103981e.f307538a;
            return C103981e.f307542e;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            C103981e eVar14 = C103981e.f307538a;
            return C103981e.f307549l;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            C103981e eVar15 = C103981e.f307538a;
            return C103981e.f307552o;
        } else if (C87412m.m108589b(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C))) {
            C103981e eVar16 = C103981e.f307538a;
            return C103981e.f307550m;
        } else {
            C103981e eVar17 = C103981e.f307538a;
            return C103981e.f307541d;
        }
    }

    /* renamed from: c */
    public static final Bitmap m136703c(int i, int i2, int i3, boolean z, C103979c cVar) {
        C87412m.m108594g(cVar, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, C103230e.m136643c(i3), z, m136704d(cVar));
        C87412m.m108593f(createBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return createBitmap;
    }

    /* renamed from: d */
    public static final ColorSpace m136704d(C103979c cVar) {
        C87412m.m108594g(cVar, "<this>");
        C103981e eVar = C103981e.f307538a;
        ColorSpace colorSpace = ColorSpace.get(C87412m.m108589b(cVar, C103981e.f307541d) ? ColorSpace.Named.SRGB : C87412m.m108589b(cVar, C103981e.f307553p) ? ColorSpace.Named.ACES : C87412m.m108589b(cVar, C103981e.f307554q) ? ColorSpace.Named.ACESCG : C87412m.m108589b(cVar, C103981e.f307551n) ? ColorSpace.Named.ADOBE_RGB : C87412m.m108589b(cVar, C103981e.f307546i) ? ColorSpace.Named.BT2020 : C87412m.m108589b(cVar, C103981e.f307545h) ? ColorSpace.Named.BT709 : C87412m.m108589b(cVar, C103981e.f307556s) ? ColorSpace.Named.CIE_LAB : C87412m.m108589b(cVar, C103981e.f307555r) ? ColorSpace.Named.CIE_XYZ : C87412m.m108589b(cVar, C103981e.f307547j) ? ColorSpace.Named.DCI_P3 : C87412m.m108589b(cVar, C103981e.f307548k) ? ColorSpace.Named.DISPLAY_P3 : C87412m.m108589b(cVar, C103981e.f307543f) ? ColorSpace.Named.EXTENDED_SRGB : C87412m.m108589b(cVar, C103981e.f307544g) ? ColorSpace.Named.LINEAR_EXTENDED_SRGB : C87412m.m108589b(cVar, C103981e.f307542e) ? ColorSpace.Named.LINEAR_SRGB : C87412m.m108589b(cVar, C103981e.f307549l) ? ColorSpace.Named.NTSC_1953 : C87412m.m108589b(cVar, C103981e.f307552o) ? ColorSpace.Named.PRO_PHOTO_RGB : C87412m.m108589b(cVar, C103981e.f307550m) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB);
        C87412m.m108593f(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
