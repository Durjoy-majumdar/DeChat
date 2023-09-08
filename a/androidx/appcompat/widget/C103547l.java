package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.widget.C103725b;
import androidx.core.widget.C103733h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p1050v2.C111325g;
import p433g.C107593a;

/* renamed from: androidx.appcompat.widget.l */
public class C103547l {

    /* renamed from: a */
    public final TextView f305787a;

    /* renamed from: b */
    public C103524d0 f305788b;

    /* renamed from: c */
    public C103524d0 f305789c;

    /* renamed from: d */
    public C103524d0 f305790d;

    /* renamed from: e */
    public C103524d0 f305791e;

    /* renamed from: f */
    public C103524d0 f305792f;

    /* renamed from: g */
    public C103524d0 f305793g;

    /* renamed from: h */
    public final C103550m f305794h;

    /* renamed from: i */
    public int f305795i = 0;

    /* renamed from: j */
    public Typeface f305796j;

    /* renamed from: k */
    public boolean f305797k;

    /* renamed from: androidx.appcompat.widget.l$a */
    public class C103548a extends C111325g.C111328d {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f305798a;

        public C103548a(WeakReference weakReference) {
            this.f305798a = weakReference;
        }

        /* renamed from: c */
        public void mo144403c(int i) {
        }

        /* renamed from: d */
        public void mo144404d(Typeface typeface) {
            C103547l lVar = C103547l.this;
            WeakReference weakReference = this.f305798a;
            if (lVar.f305797k) {
                lVar.f305796j = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    textView.setTypeface(typeface, lVar.f305795i);
                }
            }
        }
    }

    public C103547l(TextView textView) {
        this.f305787a = textView;
        this.f305794h = new C103550m(textView);
    }

    /* renamed from: c */
    public static C103524d0 m137618c(Context context, C103527f fVar, int i) {
        ColorStateList k = fVar.mo144330k(context, i);
        if (k == null) {
            return null;
        }
        C103524d0 d0Var = new C103524d0();
        d0Var.f305713d = true;
        d0Var.f305710a = k;
        return d0Var;
    }

    /* renamed from: a */
    public final void mo144395a(Drawable drawable, C103524d0 d0Var) {
        if (drawable != null && d0Var != null) {
            C103527f.m137548m(drawable, d0Var, this.f305787a.getDrawableState());
        }
    }

    /* renamed from: b */
    public void mo144396b() {
        if (!(this.f305788b == null && this.f305789c == null && this.f305790d == null && this.f305791e == null)) {
            Drawable[] compoundDrawables = this.f305787a.getCompoundDrawables();
            mo144395a(compoundDrawables[0], this.f305788b);
            mo144395a(compoundDrawables[1], this.f305789c);
            mo144395a(compoundDrawables[2], this.f305790d);
            mo144395a(compoundDrawables[3], this.f305791e);
        }
        if (this.f305792f != null || this.f305793g != null) {
            Drawable[] compoundDrawablesRelative = this.f305787a.getCompoundDrawablesRelative();
            mo144395a(compoundDrawablesRelative[0], this.f305792f);
            mo144395a(compoundDrawablesRelative[2], this.f305793g);
        }
    }

    /* renamed from: d */
    public void mo144397d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z;
        boolean z2;
        float f;
        int i2;
        float f2;
        int i3;
        int i4;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        int i5 = i;
        Context context = this.f305787a.getContext();
        C103527f g = C103527f.m137545g();
        C103533f0 l = C103533f0.m137562l(context, attributeSet2, C107593a.f321912l, i5, 0);
        int i6 = l.mo144340i(0, -1);
        if (l.mo144342k(3)) {
            this.f305788b = m137618c(context, g, l.mo144340i(3, 0));
        }
        if (l.mo144342k(1)) {
            this.f305789c = m137618c(context, g, l.mo144340i(1, 0));
        }
        if (l.mo144342k(4)) {
            this.f305790d = m137618c(context, g, l.mo144340i(4, 0));
        }
        if (l.mo144342k(2)) {
            this.f305791e = m137618c(context, g, l.mo144340i(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (l.mo144342k(5)) {
            this.f305792f = m137618c(context, g, l.mo144340i(5, 0));
        }
        if (l.mo144342k(6)) {
            this.f305793g = m137618c(context, g, l.mo144340i(6, 0));
        }
        l.mo144343m();
        boolean z3 = this.f305787a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (i6 != -1) {
            C103533f0 f0Var = new C103533f0(context, context.obtainStyledAttributes(i6, C107593a.f321896B));
            if (z3 || !f0Var.mo144342k(12)) {
                z2 = false;
                z = false;
            } else {
                z2 = f0Var.mo144332a(12, false);
                z = true;
            }
            mo144402i(context, f0Var);
            if (i7 < 23) {
                colorStateList3 = f0Var.mo144342k(3) ? f0Var.mo144333b(3) : null;
                colorStateList2 = f0Var.mo144342k(4) ? f0Var.mo144333b(4) : null;
                if (f0Var.mo144342k(5)) {
                    colorStateList = f0Var.mo144333b(5);
                    f0Var.mo144343m();
                }
            } else {
                colorStateList3 = null;
                colorStateList2 = null;
            }
            colorStateList = null;
            f0Var.mo144343m();
        } else {
            z2 = false;
            z = false;
            colorStateList3 = null;
            colorStateList2 = null;
            colorStateList = null;
        }
        C103533f0 f0Var2 = new C103533f0(context, context.obtainStyledAttributes(attributeSet2, C107593a.f321896B, i5, 0));
        if (!z3 && f0Var2.mo144342k(12)) {
            z2 = f0Var2.mo144332a(12, false);
            z = true;
        }
        if (i7 < 23) {
            if (f0Var2.mo144342k(3)) {
                colorStateList3 = f0Var2.mo144333b(3);
            }
            if (f0Var2.mo144342k(4)) {
                colorStateList2 = f0Var2.mo144333b(4);
            }
            if (f0Var2.mo144342k(5)) {
                colorStateList = f0Var2.mo144333b(5);
            }
        }
        ColorStateList colorStateList4 = colorStateList3;
        ColorStateList colorStateList5 = colorStateList2;
        ColorStateList colorStateList6 = colorStateList;
        if (i7 >= 28 && f0Var2.mo144342k(0) && f0Var2.mo144335d(0, -1) == 0) {
            this.f305787a.setTextSize(0, 0.0f);
        }
        mo144402i(context, f0Var2);
        f0Var2.mo144343m();
        if (colorStateList4 != null) {
            this.f305787a.setTextColor(colorStateList4);
        }
        if (colorStateList5 != null) {
            this.f305787a.setHintTextColor(colorStateList5);
        }
        if (colorStateList6 != null) {
            this.f305787a.setLinkTextColor(colorStateList6);
        }
        if (!z3 && z) {
            this.f305787a.setAllCaps(z2);
        }
        Typeface typeface = this.f305796j;
        if (typeface != null) {
            this.f305787a.setTypeface(typeface, this.f305795i);
        }
        C103550m mVar = this.f305794h;
        TypedArray obtainStyledAttributes = mVar.f305818j.obtainStyledAttributes(attributeSet2, C107593a.f321913m, i5, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            mVar.f305809a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(2)) {
            f = obtainStyledAttributes.getDimension(2, -1.0f);
            i2 = 1;
        } else {
            i2 = 1;
            f = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(i2)) {
            f2 = obtainStyledAttributes.getDimension(i2, -1.0f);
            i3 = 3;
        } else {
            i3 = 3;
            f2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(i3) && (resourceId = obtainStyledAttributes.getResourceId(i3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr[i8] = obtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                mVar.f305814f = mVar.mo144406b(iArr);
                mVar.mo144411g();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!mVar.mo144412h()) {
            mVar.f305809a = 0;
        } else if (mVar.f305809a == 1) {
            if (!mVar.f305815g) {
                DisplayMetrics displayMetrics = mVar.f305818j.getResources().getDisplayMetrics();
                if (f == -1.0f) {
                    i4 = 2;
                    f = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                mVar.mo144413i(f, f2, dimension);
            }
            mVar.mo144410f();
        }
        if (C103725b.f306419d0) {
            C103550m mVar2 = this.f305794h;
            if (mVar2.f305809a != 0) {
                int[] iArr2 = mVar2.f305814f;
                if (iArr2.length > 0) {
                    if (((float) this.f305787a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f305787a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f305794h.f305812d), Math.round(this.f305794h.f305813e), Math.round(this.f305794h.f305811c), 0);
                    } else {
                        this.f305787a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                    }
                }
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, C107593a.f321913m);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(6, -1);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(8, -1);
        int dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(9, -1);
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize != -1) {
            C103733h.m138107d(this.f305787a, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            C103733h.m138108e(this.f305787a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            TextView textView = this.f305787a;
            if (dimensionPixelSize3 >= 0) {
                int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
                if (dimensionPixelSize3 != fontMetricsInt) {
                    textView.setLineSpacing((float) (dimensionPixelSize3 - fontMetricsInt), 1.0f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public void mo144398e(Context context, int i) {
        ColorStateList b;
        C103533f0 f0Var = new C103533f0(context, context.obtainStyledAttributes(i, C107593a.f321896B));
        if (f0Var.mo144342k(12)) {
            this.f305787a.setAllCaps(f0Var.mo144332a(12, false));
        }
        if (Build.VERSION.SDK_INT < 23 && f0Var.mo144342k(3) && (b = f0Var.mo144333b(3)) != null) {
            this.f305787a.setTextColor(b);
        }
        if (f0Var.mo144342k(0) && f0Var.mo144335d(0, -1) == 0) {
            this.f305787a.setTextSize(0, 0.0f);
        }
        mo144402i(context, f0Var);
        f0Var.mo144343m();
        Typeface typeface = this.f305796j;
        if (typeface != null) {
            this.f305787a.setTypeface(typeface, this.f305795i);
        }
    }

    /* renamed from: f */
    public void mo144399f(int i, int i2, int i3, int i4) {
        C103550m mVar = this.f305794h;
        if (mVar.mo144412h()) {
            DisplayMetrics displayMetrics = mVar.f305818j.getResources().getDisplayMetrics();
            mVar.mo144413i(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (mVar.mo144410f()) {
                mVar.mo144405a();
            }
        }
    }

    /* renamed from: g */
    public void mo144400g(int[] iArr, int i) {
        C103550m mVar = this.f305794h;
        if (mVar.mo144412h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = mVar.f305818j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                mVar.f305814f = mVar.mo144406b(iArr2);
                if (!mVar.mo144411g()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                mVar.f305815g = false;
            }
            if (mVar.mo144410f()) {
                mVar.mo144405a();
            }
        }
    }

    /* renamed from: h */
    public void mo144401h(int i) {
        C103550m mVar = this.f305794h;
        if (!mVar.mo144412h()) {
            return;
        }
        if (i == 0) {
            mVar.f305809a = 0;
            mVar.f305812d = -1.0f;
            mVar.f305813e = -1.0f;
            mVar.f305811c = -1.0f;
            mVar.f305814f = new int[0];
            mVar.f305810b = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = mVar.f305818j.getResources().getDisplayMetrics();
            mVar.mo144413i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (mVar.mo144410f()) {
                mVar.mo144405a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* renamed from: i */
    public final void mo144402i(Context context, C103533f0 f0Var) {
        String string;
        this.f305795i = f0Var.mo144339h(2, this.f305795i);
        int i = 10;
        boolean z = true;
        if (f0Var.mo144342k(10) || f0Var.mo144342k(11)) {
            this.f305796j = null;
            if (f0Var.mo144342k(11)) {
                i = 11;
            }
            if (!context.isRestricted()) {
                try {
                    Typeface g = f0Var.mo144338g(i, this.f305795i, new C103548a(new WeakReference(this.f305787a)));
                    this.f305796j = g;
                    if (g != null) {
                        z = false;
                    }
                    this.f305797k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f305796j == null && (string = f0Var.f305736b.getString(i)) != null) {
                this.f305796j = Typeface.create(string, this.f305795i);
            }
        } else if (f0Var.mo144342k(1)) {
            this.f305797k = false;
            int h = f0Var.mo144339h(1, 1);
            if (h == 1) {
                this.f305796j = Typeface.SANS_SERIF;
            } else if (h == 2) {
                this.f305796j = Typeface.SERIF;
            } else if (h == 3) {
                this.f305796j = Typeface.MONOSPACE;
            }
        }
    }
}
