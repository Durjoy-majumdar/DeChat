package p1148r8;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;
import p1057w2.C90885a;

/* renamed from: r8.a */
public class C110504a {

    /* renamed from: a */
    public static final int[] f330434a = {16842919};

    /* renamed from: b */
    public static final int[] f330435b = {16842913, 16842919};

    /* renamed from: c */
    public static final int[] f330436c = {16842913};

    /* renamed from: a */
    public static ColorStateList m150442a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{f330436c, StateSet.NOTHING}, new int[]{m150443b(colorStateList, f330435b), m150443b(colorStateList, f330434a)});
    }

    /* renamed from: b */
    public static int m150443b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return C90885a.m114007l(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }
}
