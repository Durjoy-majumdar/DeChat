package p1139o8;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p1057w2.C90885a;

/* renamed from: o8.a */
public class C109965a extends Drawable {

    /* renamed from: a */
    public final Paint f329063a;

    /* renamed from: b */
    public final Rect f329064b = new Rect();

    /* renamed from: c */
    public final RectF f329065c = new RectF();

    /* renamed from: d */
    public final C109967b f329066d = new C109967b((C109966a) null);

    /* renamed from: e */
    public float f329067e;

    /* renamed from: f */
    public int f329068f;

    /* renamed from: g */
    public int f329069g;

    /* renamed from: h */
    public int f329070h;

    /* renamed from: i */
    public int f329071i;

    /* renamed from: j */
    public ColorStateList f329072j;

    /* renamed from: k */
    public int f329073k;

    /* renamed from: l */
    public boolean f329074l = true;

    /* renamed from: m */
    public float f329075m;

    /* renamed from: o8.a$b */
    public class C109967b extends Drawable.ConstantState {
        public C109967b(C109966a aVar) {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return C109965a.this;
        }
    }

    public C109965a() {
        Paint paint = new Paint(1);
        this.f329063a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public void draw(Canvas canvas) {
        if (this.f329074l) {
            Paint paint = this.f329063a;
            Rect rect = this.f329064b;
            copyBounds(rect);
            float height = this.f329067e / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C90885a.m114003h(this.f329068f, this.f329073k), C90885a.m114003h(this.f329069g, this.f329073k), C90885a.m114003h(C90885a.m114007l(this.f329069g, 0), this.f329073k), C90885a.m114003h(C90885a.m114007l(this.f329071i, 0), this.f329073k), C90885a.m114003h(this.f329071i, this.f329073k), C90885a.m114003h(this.f329070h, this.f329073k)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f329074l = false;
        }
        float strokeWidth = this.f329063a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f329065c;
        copyBounds(this.f329064b);
        rectF.set(this.f329064b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f329075m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f329063a);
        canvas.restore();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f329066d;
    }

    public int getOpacity() {
        return this.f329067e > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f329067e);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f329072j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        this.f329074l = true;
    }

    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f329072j;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f329073k)) == this.f329073k)) {
            this.f329074l = true;
            this.f329073k = colorForState;
        }
        if (this.f329074l) {
            invalidateSelf();
        }
        return this.f329074l;
    }

    public void setAlpha(int i) {
        this.f329063a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f329063a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
