package p925z1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import gy3.C87412m;

/* renamed from: z1.h */
public final class C112555h extends CharacterStyle {

    /* renamed from: a */
    public final int f336990a;

    /* renamed from: b */
    public final float f336991b;

    /* renamed from: c */
    public final float f336992c;

    /* renamed from: d */
    public final float f336993d;

    public C112555h(int i, float f, float f2, float f3) {
        this.f336990a = i;
        this.f336991b = f;
        this.f336992c = f2;
        this.f336993d = f3;
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "tp");
        textPaint.setShadowLayer(this.f336993d, this.f336991b, this.f336992c, this.f336990a);
    }
}
