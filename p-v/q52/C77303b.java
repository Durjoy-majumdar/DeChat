package q52;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import gy3.C87412m;
import java.util.Objects;

/* renamed from: q52.b */
public final class C77303b extends Drawable {

    /* renamed from: a */
    public Paint f225425a;

    /* renamed from: b */
    public Rect f225426b = new Rect();

    public C77303b() {
        Paint paint = new Paint(1);
        paint.setColor(-12748166);
        paint.setStyle(Paint.Style.FILL);
        this.f225425a = paint;
    }

    public void draw(Canvas canvas) {
        int i;
        float f;
        C87412m.m108594g(canvas, "canvas");
        if (this.f225426b.width() <= 0 || this.f225426b.height() <= 0) {
            f = (float) getBounds().width();
            i = getBounds().height();
        } else {
            f = (float) this.f225426b.width();
            i = this.f225426b.height();
        }
        float f2 = (float) i;
        Objects.toString(this.f225426b);
        float f3 = f2 / 2.0f;
        canvas.drawCircle(f3, f3, f3, this.f225425a);
        float f4 = f - f3;
        canvas.drawCircle(f4, f3, f3, this.f225425a);
        float f5 = (float) 1;
        float f6 = f3 - f5;
        float f7 = f4 + f5;
        canvas.drawRect(f6, 0.0f, f7, f2, this.f225425a);
    }

    public int getOpacity() {
        return -1;
    }

    public void onBoundsChange(Rect rect) {
        C87412m.m108594g(rect, "bounds");
        super.onBoundsChange(rect);
        Rect rect2 = this.f225426b;
        rect2.left = rect.left;
        rect2.right = rect.right;
        rect2.top = rect.top;
        rect2.bottom = rect.bottom;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
