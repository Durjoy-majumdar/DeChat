package y82;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: y82.a */
public class C79060a extends Drawable {

    /* renamed from: a */
    public float f232160a;

    /* renamed from: b */
    public final Paint f232161b;

    /* renamed from: c */
    public final RectF f232162c = new RectF();

    /* renamed from: d */
    public final Rect f232163d = new Rect();

    public C79060a(int i, float f) {
        this.f232160a = f;
        Paint paint = new Paint(5);
        this.f232161b = paint;
        paint.setColor(i);
    }

    public void draw(Canvas canvas) {
        RectF rectF = this.f232162c;
        float f = this.f232160a;
        canvas.drawRoundRect(rectF, f, f, this.f232161b);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f232163d, this.f232160a);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect == null) {
            rect = getBounds();
        }
        this.f232162c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f232163d.set(rect);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
