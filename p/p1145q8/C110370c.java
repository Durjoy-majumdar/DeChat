package p1145q8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import p1050v2.C111325g;
import p1114g8.C107764a;

/* renamed from: q8.c */
public class C110370c {

    /* renamed from: a */
    public final float f330127a;

    /* renamed from: b */
    public final ColorStateList f330128b;

    /* renamed from: c */
    public final int f330129c;

    /* renamed from: d */
    public final int f330130d;

    /* renamed from: e */
    public final String f330131e;

    /* renamed from: f */
    public final ColorStateList f330132f;

    /* renamed from: g */
    public final float f330133g;

    /* renamed from: h */
    public final float f330134h;

    /* renamed from: i */
    public final float f330135i;

    /* renamed from: j */
    public final int f330136j;

    /* renamed from: k */
    public boolean f330137k = false;

    /* renamed from: l */
    public Typeface f330138l;

    public C110370c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C107764a.f322522v);
        this.f330127a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f330128b = C110368a.m150198a(context, obtainStyledAttributes, 3);
        C110368a.m150198a(context, obtainStyledAttributes, 4);
        C110368a.m150198a(context, obtainStyledAttributes, 5);
        this.f330129c = obtainStyledAttributes.getInt(2, 0);
        this.f330130d = obtainStyledAttributes.getInt(1, 1);
        int i2 = !obtainStyledAttributes.hasValue(11) ? 10 : 11;
        this.f330136j = obtainStyledAttributes.getResourceId(i2, 0);
        this.f330131e = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(12, false);
        this.f330132f = C110368a.m150198a(context, obtainStyledAttributes, 6);
        this.f330133g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f330134h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f330135i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo161877a() {
        if (this.f330138l == null) {
            this.f330138l = Typeface.create(this.f330131e, this.f330129c);
        }
        if (this.f330138l == null) {
            int i = this.f330130d;
            if (i == 1) {
                this.f330138l = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f330138l = Typeface.SERIF;
            } else if (i != 3) {
                this.f330138l = Typeface.DEFAULT;
            } else {
                this.f330138l = Typeface.MONOSPACE;
            }
            Typeface typeface = this.f330138l;
            if (typeface != null) {
                this.f330138l = Typeface.create(typeface, this.f330129c);
            }
        }
    }

    /* renamed from: b */
    public void mo161878b(Context context, TextPaint textPaint, C111325g.C111328d dVar) {
        mo161879c(context, textPaint, dVar);
        ColorStateList colorStateList = this.f330128b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f330135i;
        float f2 = this.f330133g;
        float f3 = this.f330134h;
        ColorStateList colorStateList2 = this.f330132f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: c */
    public void mo161879c(Context context, TextPaint textPaint, C111325g.C111328d dVar) {
        if (this.f330137k) {
            mo161880d(textPaint, this.f330138l);
        } else {
            mo161877a();
            if (context.isRestricted()) {
                this.f330137k = true;
                mo161880d(textPaint, this.f330138l);
            } else {
                try {
                    C111325g.m151808b(context, this.f330136j, new C110369b(this, textPaint, dVar), (Handler) null);
                } catch (Resources.NotFoundException | Exception | UnsupportedOperationException unused) {
                }
            }
        }
        if (!this.f330137k) {
            mo161880d(textPaint, this.f330138l);
        }
    }

    /* renamed from: d */
    public void mo161880d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f330129c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f330127a);
    }
}
