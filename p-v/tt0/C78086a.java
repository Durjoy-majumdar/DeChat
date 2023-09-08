package tt0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: tt0.a */
public class C78086a extends Drawable {

    /* renamed from: a */
    public Paint f228872a;

    /* renamed from: b */
    public Paint f228873b;

    /* renamed from: c */
    public Path f228874c;

    /* renamed from: d */
    public Path f228875d;

    /* renamed from: e */
    public final RectF f228876e = new RectF();

    /* renamed from: f */
    public float f228877f = 0.0f;

    /* renamed from: g */
    public int f228878g = 0;

    /* renamed from: h */
    public int f228879h;

    /* renamed from: i */
    public int f228880i;

    public C78086a() {
        int b = C76577a.m92151b(MMApplicationContext.getContext(), 3);
        this.f228879h = b;
        this.f228880i = b;
        Paint paint = new Paint(1);
        this.f228872a = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f228873b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f228874c = new Path();
        this.f228875d = new Path();
    }

    public void draw(Canvas canvas) {
        float width = this.f228876e.width();
        float height = this.f228876e.height();
        RectF rectF = this.f228876e;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float min = Math.min(this.f228877f, Math.min(width, height) * 0.5f);
        int i = this.f228880i;
        canvas.drawRoundRect(new RectF(((float) i) + f, ((float) i) + f2, f3 - ((float) i), f4 - ((float) i)), min, min, this.f228873b);
        canvas.drawPath(this.f228875d, this.f228873b);
        int i2 = this.f228880i;
        int i3 = this.f228878g;
        canvas.drawRoundRect(new RectF(f + ((float) i2) + ((float) i3), f2 + ((float) i2) + ((float) i3), (f3 - ((float) i2)) - ((float) i3), (f4 - ((float) i2)) - ((float) i3)), min, min, this.f228872a);
        canvas.drawPath(this.f228874c, this.f228872a);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f228872a.setAlpha(i);
        this.f228873b.setAlpha(i);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (float) i4;
        this.f228876e.set((float) i, (float) i2, (float) i3, f);
        float f2 = ((float) (i + i3)) / 2.0f;
        this.f228875d.moveTo(f2, f);
        Path path = this.f228875d;
        int i5 = this.f228880i;
        path.lineTo(f2 - ((float) i5), (float) (i4 - i5));
        Path path2 = this.f228875d;
        int i6 = this.f228880i;
        path2.lineTo(((float) i6) + f2, (float) (i4 - i6));
        this.f228875d.close();
        this.f228874c.moveTo(f2, (float) (i4 - this.f228878g));
        Path path3 = this.f228874c;
        int i7 = this.f228880i;
        path3.lineTo(f2 - ((float) i7), (float) ((i4 - i7) - this.f228878g));
        Path path4 = this.f228874c;
        int i8 = this.f228880i;
        path4.lineTo(f2 + ((float) i8), (float) ((i4 - i8) - this.f228878g));
        this.f228874c.close();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f228872a.setColorFilter(colorFilter);
        this.f228873b.setColorFilter(colorFilter);
    }
}
