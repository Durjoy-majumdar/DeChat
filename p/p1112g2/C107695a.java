package p1112g2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import gy3.C87412m;
import p1166z0.C112545k;
import p436a1.C103261r0;

/* renamed from: g2.a */
public final class C107695a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: d */
    public final C103261r0 f322202d;

    /* renamed from: e */
    public C112545k f322203e;

    public C107695a(C103261r0 r0Var) {
        C87412m.m108594g(r0Var, "shaderBrush");
        this.f322202d = r0Var;
    }

    public void updateDrawState(TextPaint textPaint) {
        C112545k kVar;
        if (textPaint != null && (kVar = this.f322203e) != null) {
            textPaint.setShader(this.f322202d.mo142983b(kVar.f336976a));
        }
    }
}
