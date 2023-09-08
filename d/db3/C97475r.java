package db3;

import android.text.style.ParagraphStyle;

/* renamed from: db3.r */
public class C97475r implements ParagraphStyle {

    /* renamed from: d */
    public final C97474q f286103d;

    /* renamed from: e */
    public final ParagraphStyle f286104e;

    public C97475r(C97474q qVar, ParagraphStyle paragraphStyle) {
        this.f286103d = qVar;
        this.f286104e = paragraphStyle;
    }

    public String toString() {
        return this.f286103d.name() + " - " + this.f286104e.getClass().getSimpleName();
    }
}
