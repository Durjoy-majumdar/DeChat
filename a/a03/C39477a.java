package a03;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import go3.C76003c;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: a03.a */
public final class C39477a extends C76003c {

    /* renamed from: e */
    public static final int f106018e = C76577a.m92151b(MMApplicationContext.getContext(), 4);

    public C39477a(Drawable drawable, int i) {
        super(drawable, i);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C87412m.m108594g(paint, "paint");
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + f106018e;
    }
}
