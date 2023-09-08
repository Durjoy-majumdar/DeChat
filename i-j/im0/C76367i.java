package im0;

import android.graphics.Paint;
import android.text.Spannable;
import android.text.TextUtils;
import au0.C67107a;

/* renamed from: im0.i */
public class C76367i extends Spannable.Factory {

    /* renamed from: a */
    public final /* synthetic */ int f223649a;

    /* renamed from: im0.i$a */
    public class C76368a extends C67107a {
        public C76368a(C76367i iVar, float f, int i) {
            super(f, i);
        }

        public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            if (fontMetricsInt != null && this.f192699d >= fontMetricsInt.bottom - fontMetricsInt.top) {
                super.chooseHeight(charSequence, i, i2, i3, i4, fontMetricsInt);
            }
        }
    }

    public C76367i(C76362f fVar, int i) {
        this.f223649a = i;
    }

    public Spannable newSpannable(CharSequence charSequence) {
        Spannable newSpannable = super.newSpannable(charSequence);
        if (!TextUtils.isEmpty(newSpannable)) {
            newSpannable.setSpan(new C76368a(this, (float) this.f223649a, 17), 0, newSpannable.length(), 18);
        }
        return newSpannable;
    }
}
