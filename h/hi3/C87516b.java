package hi3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import ii3.C87739b;
import ii3.C87740c;
import java.lang.ref.WeakReference;

/* renamed from: hi3.b */
public abstract class C87516b extends Drawable {

    /* renamed from: a */
    public int f253533a = 0;

    /* renamed from: b */
    public final Rect f253534b = new Rect();

    /* renamed from: c */
    public boolean f253535c = false;

    /* renamed from: d */
    public Paint f253536d = new Paint();

    /* renamed from: e */
    public ColorFilter f253537e;

    /* renamed from: f */
    public WeakReference<View> f253538f;

    /* renamed from: g */
    public int f253539g;

    /* renamed from: h */
    public int f253540h;

    public C87516b(int i, int i2, float f, int i3) {
        this.f253539g = i;
        this.f253540h = i2;
        setLevel(10000);
        this.f253533a = i3;
    }

    /* renamed from: a */
    public void mo121969a(Canvas canvas) {
        if (C87739b.f254035d) {
            canvas.save();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-12303292);
            paint.setAlpha(127);
            float height = (float) (this.f253534b.height() / 3);
            paint.setTextSize(height);
            paint.setStrokeWidth(1.0f);
            canvas.translate(((float) this.f253534b.width()) - paint.measureText("SVG"), (float) ((this.f253534b.height() * 2) / 3));
            canvas.drawText("SVG", 0.0f, height, paint);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public synchronized View mo121970b() {
        WeakReference<View> weakReference = this.f253538f;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int getIntrinsicHeight() {
        return this.f253540h;
    }

    public int getIntrinsicWidth() {
        return this.f253539g;
    }

    public int getOpacity() {
        View b = mo121970b();
        if (b != null && b.getAlpha() < 1.0f) {
            return -3;
        }
        Paint paint = this.f253536d;
        return (paint == null || paint.getAlpha() >= 255) ? 0 : -3;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f253535c = true;
    }

    public boolean onLevelChange(int i) {
        View b = C87515a.m108832b(this);
        synchronized (this) {
            this.f253538f = new WeakReference<>(b);
        }
        if (b != null) {
            ColorFilter colorFilter = this.f253537e;
            if (colorFilter != null) {
                setColorFilter(colorFilter);
            }
            C87515a.m108836g(b, this.f253536d);
        }
        return super.onLevelChange(i);
    }

    public void setAlpha(int i) {
        this.f253536d.setAlpha(i);
        View b = mo121970b();
        if (b != null) {
            try {
                b.setLayerPaint(this.f253536d);
            } catch (NoSuchMethodError e) {
                C87740c.m109161d("MicroMsg.SVGDrawable", e, "samsung", new Object[0]);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f253536d.setColorFilter(colorFilter);
        View b = mo121970b();
        if (b != null) {
            try {
                b.setLayerPaint(this.f253536d);
            } catch (NoSuchMethodError e) {
                C87740c.m109161d("MicroMsg.SVGDrawable", e, "samsung", new Object[0]);
            }
        } else if (b == null) {
            this.f253537e = colorFilter;
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        View b = C87515a.m108832b(this);
        synchronized (this) {
            this.f253538f = new WeakReference<>(b);
        }
        if (b != null) {
            ColorFilter colorFilter = this.f253537e;
            if (colorFilter != null) {
                setColorFilter(colorFilter);
            }
            C87515a.m108836g(b, this.f253536d);
        }
        return super.setVisible(z, z2);
    }
}
