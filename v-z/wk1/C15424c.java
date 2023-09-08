package wk1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import gy3.C87412m;
import p156gj.C8325f0;

/* renamed from: wk1.c */
public final class C15424c extends C15422a {

    /* renamed from: d */
    public Drawable f41826d;

    /* renamed from: e */
    public C8325f0 f41827e = new C8325f0(0, 0);

    /* renamed from: f */
    public int f41828f;

    /* renamed from: g */
    public int f41829g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15424c(Drawable drawable) {
        super(drawable);
        C87412m.m108594g(drawable, "drawable");
        C15440n.f41895a.mo14261j();
    }

    /* renamed from: a */
    public int mo14226a() {
        return getDrawable().getMinimumWidth();
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        int color = paint.getColor();
        float textSize = paint.getTextSize();
        int i6 = i5 - i3;
        float f2 = f + ((float) this.f41829g);
        Drawable drawable = this.f41826d;
        if (drawable != null) {
            if (this.f41828f != 0) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f41828f, PorterDuff.Mode.SRC_ATOP));
            }
            int i7 = i3 + ((i6 - this.f41827e.f27284b) / 2);
            C8325f0 f0Var = this.f41827e;
            drawable.setBounds(new Rect((int) f2, i7, (int) (f2 + ((float) f0Var.f27283a)), f0Var.f27284b + i7));
            drawable.draw(canvas);
        }
        paint.setColor(color);
        paint.setTextSize(textSize);
    }
}
