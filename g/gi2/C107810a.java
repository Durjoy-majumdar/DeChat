package gi2;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: gi2.a */
public final class C107810a extends Drawable {

    /* renamed from: a */
    public float f322625a = 2.0f;

    /* renamed from: b */
    public final Paint f322626b;

    /* renamed from: c */
    public final float f322627c;

    /* renamed from: d */
    public final float f322628d;

    public C107810a(Resources resources) {
        C87412m.m108594g(resources, "resources");
        Paint paint = new Paint();
        this.f322626b = paint;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(resources.getDimension(C0966R.dimen.a2v));
        paint.setStyle(Paint.Style.FILL);
        this.f322627c = resources.getDimension(C0966R.dimen.a2v);
        this.f322628d = resources.getDimension(C0966R.dimen.a2t);
        resources.getDimension(C0966R.dimen.a2u);
    }

    public void draw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        float f = ((float) getBounds().left) - (this.f322628d / this.f322625a);
        float f2 = ((float) getBounds().top) - (this.f322628d / this.f322625a);
        float f3 = ((float) getBounds().right) + (this.f322628d / this.f322625a);
        float f4 = this.f322628d;
        float f5 = this.f322625a;
        float f6 = ((float) getBounds().bottom) + (f4 / f5);
        this.f322626b.setStrokeWidth(this.f322627c / f5);
        this.f322626b.setAntiAlias(true);
        canvas.drawLines(new float[]{f, f2, f3, f2, f3, f2, f3, f6, f3, f6, f, f6, f, f6, f, f2}, this.f322626b);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
