package p1162x2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: x2.c */
public abstract class C112021c extends Drawable {

    /* renamed from: a */
    public final Bitmap f335330a;

    /* renamed from: b */
    public int f335331b = 160;

    /* renamed from: c */
    public int f335332c = 119;

    /* renamed from: d */
    public final Paint f335333d = new Paint(3);

    /* renamed from: e */
    public final BitmapShader f335334e;

    /* renamed from: f */
    public final Matrix f335335f = new Matrix();

    /* renamed from: g */
    public float f335336g;

    /* renamed from: h */
    public final Rect f335337h = new Rect();

    /* renamed from: i */
    public final RectF f335338i = new RectF();

    /* renamed from: j */
    public boolean f335339j = true;

    /* renamed from: k */
    public boolean f335340k;

    /* renamed from: l */
    public int f335341l;

    /* renamed from: m */
    public int f335342m;

    public C112021c(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f335331b = resources.getDisplayMetrics().densityDpi;
        }
        this.f335330a = bitmap;
        if (bitmap != null) {
            this.f335341l = bitmap.getScaledWidth(this.f335331b);
            this.f335342m = bitmap.getScaledHeight(this.f335331b);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f335334e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f335342m = -1;
        this.f335341l = -1;
        this.f335334e = null;
    }

    /* renamed from: a */
    public void mo163677a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo163679b(boolean z) {
        this.f335340k = z;
        this.f335339j = true;
        if (z) {
            this.f335336g = (float) (Math.min(this.f335342m, this.f335341l) / 2);
            this.f335333d.setShader(this.f335334e);
            invalidateSelf();
            return;
        }
        mo163680c(0.0f);
    }

    /* renamed from: c */
    public void mo163680c(float f) {
        if (this.f335336g != f) {
            boolean z = false;
            this.f335340k = false;
            if (f > 0.05f) {
                z = true;
            }
            if (z) {
                this.f335333d.setShader(this.f335334e);
            } else {
                this.f335333d.setShader((Shader) null);
            }
            this.f335336g = f;
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo163681d() {
        if (this.f335339j) {
            if (this.f335340k) {
                int min = Math.min(this.f335341l, this.f335342m);
                mo163677a(this.f335332c, min, min, getBounds(), this.f335337h);
                int min2 = Math.min(this.f335337h.width(), this.f335337h.height());
                this.f335337h.inset(Math.max(0, (this.f335337h.width() - min2) / 2), Math.max(0, (this.f335337h.height() - min2) / 2));
                this.f335336g = ((float) min2) * 0.5f;
            } else {
                mo163677a(this.f335332c, this.f335341l, this.f335342m, getBounds(), this.f335337h);
            }
            this.f335338i.set(this.f335337h);
            if (this.f335334e != null) {
                Matrix matrix = this.f335335f;
                RectF rectF = this.f335338i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f335335f.preScale(this.f335338i.width() / ((float) this.f335330a.getWidth()), this.f335338i.height() / ((float) this.f335330a.getHeight()));
                this.f335334e.setLocalMatrix(this.f335335f);
                this.f335333d.setShader(this.f335334e);
            }
            this.f335339j = false;
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f335330a;
        if (bitmap != null) {
            mo163681d();
            if (this.f335333d.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f335337h, this.f335333d);
                return;
            }
            RectF rectF = this.f335338i;
            float f = this.f335336g;
            canvas.drawRoundRect(rectF, f, f, this.f335333d);
        }
    }

    public int getAlpha() {
        return this.f335333d.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f335333d.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f335342m;
    }

    public int getIntrinsicWidth() {
        return this.f335341l;
    }

    public int getOpacity() {
        Bitmap bitmap;
        if (this.f335332c == 119 && !this.f335340k && (bitmap = this.f335330a) != null && !bitmap.hasAlpha() && this.f335333d.getAlpha() >= 255) {
            return (this.f335336g > 0.05f ? 1 : (this.f335336g == 0.05f ? 0 : -1)) > 0 ? -3 : -1;
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f335340k) {
            this.f335336g = (float) (Math.min(this.f335342m, this.f335341l) / 2);
        }
        this.f335339j = true;
    }

    public void setAlpha(int i) {
        if (i != this.f335333d.getAlpha()) {
            this.f335333d.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f335333d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f335333d.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f335333d.setFilterBitmap(z);
        invalidateSelf();
    }
}
