package p925z1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import gy3.C87412m;

/* renamed from: z1.j */
public final class C112557j extends CharacterStyle {

    /* renamed from: a */
    public final boolean f336995a;

    /* renamed from: b */
    public final boolean f336996b;

    public C112557j(boolean z, boolean z2) {
        this.f336995a = z;
        this.f336996b = z2;
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f336995a);
        textPaint.setStrikeThruText(this.f336996b);
    }
}
