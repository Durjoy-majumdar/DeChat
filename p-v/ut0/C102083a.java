package ut0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: ut0.a */
public class C102083a extends Drawable {

    /* renamed from: a */
    public Paint f300610a;

    /* renamed from: b */
    public Drawable f300611b;

    /* renamed from: c */
    public RectF f300612c;

    /* renamed from: d */
    public float f300613d;

    /* renamed from: e */
    public int f300614e = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3736cp);

    public C102083a(Drawable drawable) {
        this.f300611b = drawable;
        Paint paint = new Paint(1);
        this.f300610a = paint;
        paint.setColor(MMApplicationContext.getResources().getColor(C0966R.color.f356943a14));
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f300611b;
        Rect bounds = drawable.getBounds();
        int i = bounds.right - bounds.left;
        int save = canvas.save();
        canvas.rotate(this.f300613d, (((float) i) * 0.5f) + ((float) bounds.left), (((float) (bounds.bottom - bounds.top)) * 0.5f) + ((float) bounds.top));
        canvas.drawOval(this.f300612c, this.f300610a);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public int getIntrinsicHeight() {
        return this.f300614e;
    }

    public int getIntrinsicWidth() {
        return this.f300614e;
    }

    public int getOpacity() {
        Drawable drawable = this.f300611b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f300611b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.f300610a.setAlpha(i);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f300611b;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
        this.f300612c = new RectF((float) i, (float) i2, (float) i3, (float) i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f300610a.setColorFilter(colorFilter);
    }
}
