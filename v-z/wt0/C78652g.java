package wt0;

import android.graphics.Paint;
import android.text.Spannable;
import au0.C67107a;

/* renamed from: wt0.g */
public final class C78652g extends Spannable.Factory {

    /* renamed from: a */
    public final int f230353a;

    /* renamed from: wt0.g$a */
    public static final class C78653a extends C67107a {
        public C78653a(float f) {
            super(f, 17);
        }

        public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            if (fontMetricsInt != null && fontMetricsInt.bottom - fontMetricsInt.top <= this.f192699d) {
                super.chooseHeight(charSequence, i, i2, i3, i4, fontMetricsInt);
            }
        }
    }

    public C78652g(int i) {
        this.f230353a = i;
    }

    public Spannable newSpannable(CharSequence charSequence) {
        Spannable newSpannable = super.newSpannable(charSequence);
        if (newSpannable == null) {
            return null;
        }
        newSpannable.setSpan(new C78653a((float) this.f230353a), 0, newSpannable.length(), 18);
        return newSpannable;
    }
}
