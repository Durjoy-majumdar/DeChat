package w21;

import android.text.style.ParagraphStyle;

/* renamed from: w21.p */
public class C102319p implements ParagraphStyle {

    /* renamed from: d */
    public final C102318o f301349d;

    /* renamed from: e */
    public final ParagraphStyle f301350e;

    public C102319p(C102318o oVar, ParagraphStyle paragraphStyle) {
        this.f301349d = oVar;
        this.f301350e = paragraphStyle;
    }

    public String toString() {
        return this.f301349d.name() + " - " + this.f301350e.getClass().getSimpleName();
    }
}
