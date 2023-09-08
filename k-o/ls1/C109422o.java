package ls1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import p1057w2.C90885a;

/* renamed from: ls1.o */
public class C109422o {

    /* renamed from: a */
    public static final int[] f327542a = {16842919};

    /* renamed from: b */
    public static final int[] f327543b = {16842913, 16842919};

    /* renamed from: c */
    public static final int[] f327544c = {16842913};

    /* renamed from: a */
    public static int m148597a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return C90885a.m114007l(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }
}
