package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p1057w2.C90885a;
import p1115h.C107922a;

/* renamed from: androidx.appcompat.widget.a0 */
public class C103518a0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f305695a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f305696b = {-16842910};

    /* renamed from: c */
    public static final int[] f305697c = {16842908};

    /* renamed from: d */
    public static final int[] f305698d = {16842919};

    /* renamed from: e */
    public static final int[] f305699e = {16842912};

    /* renamed from: f */
    public static final int[] f305700f = new int[0];

    /* renamed from: g */
    public static final int[] f305701g = new int[1];

    /* renamed from: a */
    public static int m137529a(Context context, int i) {
        ColorStateList c = m137531c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f305696b, c.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f305695a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int b = m137530b(context, i);
        return C90885a.m114007l(b, Math.round(((float) Color.alpha(b)) * f));
    }

    /* renamed from: b */
    public static int m137530b(Context context, int i) {
        int[] iArr = f305701g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public static ColorStateList m137531c(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f305701g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C107922a.m146227a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
