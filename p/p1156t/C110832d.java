package p1156t;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: t.d */
public class C110832d extends Drawable {

    /* renamed from: a */
    public float f331569a;

    /* renamed from: b */
    public final Paint f331570b;

    /* renamed from: c */
    public final RectF f331571c;

    /* renamed from: d */
    public final Rect f331572d;

    /* renamed from: e */
    public float f331573e;

    /* renamed from: f */
    public boolean f331574f = false;

    /* renamed from: g */
    public boolean f331575g = true;

    /* renamed from: h */
    public ColorStateList f331576h;

    /* renamed from: i */
    public PorterDuffColorFilter f331577i;

    /* renamed from: j */
    public ColorStateList f331578j;

    /* renamed from: k */
    public PorterDuff.Mode f331579k = PorterDuff.Mode.SRC_IN;

    public C110832d(ColorStateList colorStateList, float f) {
        this.f331569a = f;
        this.f331570b = new Paint(5);
        mo162412b(colorStateList);
        this.f331571c = new RectF();
        this.f331572d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter mo162411a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void mo162412b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f331576h = colorStateList;
        this.f331570b.setColor(colorStateList.getColorForState(getState(), this.f331576h.getDefaultColor()));
    }

    /* renamed from: c */
    public final void mo162413c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f331571c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f331572d.set(rect);
        if (this.f331574f) {
            float a = C110833e.m151026a(this.f331573e, this.f331569a, this.f331575g);
            float f = this.f331573e;
            float f2 = this.f331569a;
            if (this.f331575g) {
                f = (float) (((double) f) + ((1.0d - C110833e.f331580a) * ((double) f2)));
            }
            this.f331572d.inset((int) Math.ceil((double) f), (int) Math.ceil((double) a));
            this.f331571c.set(this.f331572d);
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f331570b;
        if (this.f331577i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f331577i);
            z = true;
        }
        RectF rectF = this.f331571c;
        float f = this.f331569a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f331572d, this.f331569a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f331576h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f331578j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f331576h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1156t.C110832d.isStateful():boolean");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo162413c(rect);
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f331576h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f331570b.getColor();
        if (z) {
            this.f331570b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f331578j;
        if (colorStateList2 == null || (mode = this.f331579k) == null) {
            return z;
        }
        this.f331577i = mo162411a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f331570b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f331570b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f331578j = colorStateList;
        this.f331577i = mo162411a(colorStateList, this.f331579k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f331579k = mode;
        this.f331577i = mo162411a(this.f331578j, mode);
        invalidateSelf();
    }
}
