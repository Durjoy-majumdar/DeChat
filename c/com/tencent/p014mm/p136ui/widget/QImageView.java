package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RemoteViews;
import com.tencent.p014mm.sdk.platformtools.Log;

@RemoteViews.RemoteView
/* renamed from: com.tencent.mm.ui.widget.QImageView */
public class QImageView extends View {

    /* renamed from: C */
    public static final Matrix.ScaleToFit[] f285489C = {Matrix.ScaleToFit.FILL, Matrix.ScaleToFit.START, Matrix.ScaleToFit.CENTER, Matrix.ScaleToFit.END};

    /* renamed from: A */
    public PaintFlagsDrawFilter f285490A;

    /* renamed from: B */
    public PaintFlagsDrawFilter f285491B;

    /* renamed from: d */
    public Uri f285492d;

    /* renamed from: e */
    public int f285493e;

    /* renamed from: f */
    public Matrix f285494f;

    /* renamed from: g */
    public C97274a f285495g;

    /* renamed from: h */
    public boolean f285496h;

    /* renamed from: i */
    public boolean f285497i;

    /* renamed from: j */
    public int f285498j;

    /* renamed from: n */
    public int f285499n;

    /* renamed from: o */
    public ColorFilter f285500o;

    /* renamed from: p */
    public int f285501p;

    /* renamed from: q */
    public int f285502q;

    /* renamed from: r */
    public boolean f285503r;

    /* renamed from: s */
    public Drawable f285504s;

    /* renamed from: t */
    public int f285505t;

    /* renamed from: u */
    public int f285506u;

    /* renamed from: v */
    public int f285507v;

    /* renamed from: w */
    public Matrix f285508w;

    /* renamed from: x */
    public final RectF f285509x;

    /* renamed from: y */
    public final RectF f285510y;

    /* renamed from: z */
    public Context f285511z;

    /* renamed from: com.tencent.mm.ui.widget.QImageView$a */
    public enum C97274a {
        MATRIX(0),
        FIT_XY(1),
        FIT_CENTER(3),
        CENTER(5),
        CENTER_CROP(6),
        CENTER_INSIDE(7);
        

        /* renamed from: d */
        public final int f285519d;

        /* access modifiers changed from: public */
        C97274a(int i) {
            this.f285519d = i;
        }
    }

    public QImageView(Context context) {
        super(context);
        this.f285493e = 0;
        this.f285496h = false;
        this.f285497i = false;
        this.f285498j = Integer.MAX_VALUE;
        this.f285499n = Integer.MAX_VALUE;
        this.f285501p = 255;
        this.f285502q = 256;
        this.f285503r = false;
        this.f285504s = null;
        this.f285505t = 0;
        this.f285508w = null;
        this.f285509x = new RectF();
        this.f285510y = new RectF();
        this.f285511z = context;
        mo136290h();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f285504s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: f */
    public final void mo136284f() {
        Drawable drawable = this.f285504s;
        if (drawable != null && this.f285503r) {
            Drawable mutate = drawable.mutate();
            this.f285504s = mutate;
            mutate.setColorFilter(this.f285500o);
            this.f285504s.setAlpha((this.f285501p * this.f285502q) >> 8);
        }
    }

    /* renamed from: g */
    public final void mo136285g() {
        float f;
        float f2;
        if (this.f285504s != null && this.f285496h) {
            int i = this.f285506u;
            int i2 = this.f285507v;
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            boolean z = (i < 0 || width == i) && (i2 < 0 || height == i2);
            if (i <= 0 || i2 <= 0 || C97274a.FIT_XY == this.f285495g) {
                this.f285504s.setBounds(0, 0, width, height);
                this.f285508w = null;
                return;
            }
            this.f285504s.setBounds(0, 0, i, i2);
            C97274a aVar = C97274a.MATRIX;
            C97274a aVar2 = this.f285495g;
            if (aVar == aVar2) {
                if (this.f285494f.isIdentity()) {
                    this.f285508w = null;
                } else {
                    this.f285508w = this.f285494f;
                }
            } else if (z) {
                this.f285508w = null;
            } else if (C97274a.CENTER == aVar2) {
                Matrix matrix = this.f285494f;
                this.f285508w = matrix;
                matrix.setTranslate((float) ((int) ((((float) (width - i)) * 0.5f) + 0.5f)), (float) ((int) ((((float) (height - i2)) * 0.5f) + 0.5f)));
            } else {
                float f3 = 0.0f;
                if (C97274a.CENTER_CROP == aVar2) {
                    Matrix matrix2 = this.f285494f;
                    this.f285508w = matrix2;
                    if (i * height > width * i2) {
                        f = ((float) height) / ((float) i2);
                        f3 = (((float) width) - (((float) i) * f)) * 0.5f;
                        f2 = 0.0f;
                    } else {
                        float f4 = ((float) width) / ((float) i);
                        f2 = (((float) height) - (((float) i2) * f4)) * 0.5f;
                        f = f4;
                    }
                    matrix2.setScale(f, f);
                    this.f285508w.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f2 + 0.5f)));
                } else if (C97274a.CENTER_INSIDE == aVar2) {
                    this.f285508w = this.f285494f;
                    float min = (i > width || i2 > height) ? Math.min(((float) width) / ((float) i), ((float) height) / ((float) i2)) : 1.0f;
                    this.f285508w.setScale(min, min);
                    this.f285508w.postTranslate((float) ((int) (((((float) width) - (((float) i) * min)) * 0.5f) + 0.5f)), (float) ((int) (((((float) height) - (((float) i2) * min)) * 0.5f) + 0.5f)));
                } else {
                    this.f285509x.set(0.0f, 0.0f, (float) i, (float) i2);
                    this.f285510y.set(0.0f, 0.0f, (float) width, (float) height);
                    Matrix matrix3 = this.f285494f;
                    this.f285508w = matrix3;
                    matrix3.setRectToRect(this.f285509x, this.f285510y, f285489C[this.f285495g.f285519d - 1]);
                }
            }
        }
    }

    public int getBaseline() {
        return -1;
    }

    public Drawable getDrawable() {
        return this.f285504s;
    }

    public Matrix getImageMatrix() {
        return this.f285494f;
    }

    public C97274a getScaleType() {
        return this.f285495g;
    }

    /* renamed from: h */
    public final void mo136290h() {
        this.f285494f = new Matrix();
        this.f285495g = C97274a.FIT_CENTER;
        this.f285490A = new PaintFlagsDrawFilter(0, 3);
        this.f285491B = new PaintFlagsDrawFilter(0, 0);
    }

    /* renamed from: i */
    public final void mo136291i() {
        Drawable drawable = this.f285504s;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth < 0) {
                intrinsicWidth = this.f285506u;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight < 0) {
                intrinsicHeight = this.f285507v;
            }
            if (intrinsicWidth != this.f285506u || intrinsicHeight != this.f285507v) {
                this.f285506u = intrinsicWidth;
                this.f285507v = intrinsicHeight;
                requestLayout();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.f285504s) {
            postInvalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public final int mo136293j(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? i : size : Math.min(i, i2) : Math.min(Math.min(i, size), i2);
    }

    /* renamed from: k */
    public final void mo136294k() {
        Resources resources;
        if (this.f285504s == null && (resources = getResources()) != null) {
            int i = this.f285493e;
            Drawable drawable = null;
            if (i != 0) {
                try {
                    drawable = resources.getDrawable(i);
                } catch (Exception e) {
                    Log.m105929w("ImageView", "Unable to find resource: " + this.f285493e, e);
                    this.f285492d = null;
                }
            } else if (this.f285492d == null) {
                return;
            }
            mo136295l(drawable);
        }
    }

    /* renamed from: l */
    public final void mo136295l(Drawable drawable) {
        Drawable drawable2 = this.f285504s;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f285504s);
        }
        this.f285504s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            drawable.setLevel(this.f285505t);
            this.f285506u = drawable.getIntrinsicWidth();
            this.f285507v = drawable.getIntrinsicHeight();
            mo136284f();
            mo136285g();
        }
    }

    public int[] onCreateDrawableState(int i) {
        return super.onCreateDrawableState(i);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        canvas.setDrawFilter(this.f285490A);
        super.onDraw(canvas);
        if (this.f285504s != null && this.f285506u != 0 && this.f285507v != 0) {
            if (this.f285508w == null && getPaddingTop() == 0 && getPaddingLeft() == 0) {
                this.f285504s.draw(canvas);
            } else {
                int saveCount = canvas.getSaveCount();
                canvas.save();
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                Matrix matrix = this.f285508w;
                if (matrix != null) {
                    canvas.concat(matrix);
                }
                this.f285504s.draw(canvas);
                canvas.restoreToCount(saveCount);
            }
            if (Build.VERSION.SDK_INT > 28) {
                canvas.setDrawFilter(this.f285491B);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f285496h = true;
        mo136285g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r18.mo136294k()
            android.graphics.drawable.Drawable r3 = r0.f285504s
            r4 = 0
            if (r3 != 0) goto L_0x0019
            r3 = -1
            r0.f285506u = r3
            r0.f285507v = r3
            r3 = 0
            r7 = 0
        L_0x0015:
            r8 = 0
            r9 = 0
            r10 = 0
            goto L_0x003e
        L_0x0019:
            int r3 = r0.f285506u
            int r7 = r0.f285507v
            if (r3 > 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            if (r7 > 0) goto L_0x0023
            r7 = 1
        L_0x0023:
            boolean r8 = r0.f285497i
            if (r8 == 0) goto L_0x0015
            int r8 = android.view.View.MeasureSpec.getMode(r19)
            int r9 = android.view.View.MeasureSpec.getMode(r20)
            r10 = 1073741824(0x40000000, float:2.0)
            if (r8 == r10) goto L_0x0035
            r8 = 1
            goto L_0x0036
        L_0x0035:
            r8 = 0
        L_0x0036:
            if (r9 == r10) goto L_0x003a
            r9 = 1
            goto L_0x003b
        L_0x003a:
            r9 = 0
        L_0x003b:
            float r10 = (float) r3
            float r11 = (float) r7
            float r10 = r10 / r11
        L_0x003e:
            int r11 = r18.getPaddingLeft()
            int r12 = r18.getPaddingRight()
            int r13 = r18.getPaddingTop()
            int r14 = r18.getPaddingBottom()
            if (r8 != 0) goto L_0x0070
            if (r9 == 0) goto L_0x0053
            goto L_0x0070
        L_0x0053:
            int r11 = r11 + r12
            int r3 = r3 + r11
            int r13 = r13 + r14
            int r7 = r7 + r13
            int r4 = r18.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r3, r4)
            int r4 = r18.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r7, r4)
            int r1 = android.view.View.resolveSize(r3, r1)
            int r2 = android.view.View.resolveSize(r4, r2)
            goto L_0x00b8
        L_0x0070:
            int r3 = r3 + r11
            int r3 = r3 + r12
            int r15 = r0.f285498j
            int r1 = r0.mo136293j(r3, r15, r1)
            int r7 = r7 + r13
            int r7 = r7 + r14
            int r3 = r0.f285499n
            int r2 = r0.mo136293j(r7, r3, r2)
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00b8
            int r3 = r1 - r11
            int r3 = r3 - r12
            float r3 = (float) r3
            int r4 = r2 - r13
            int r4 = r4 - r14
            float r4 = (float) r4
            float r3 = r3 / r4
            float r3 = r3 - r10
            float r3 = java.lang.Math.abs(r3)
            double r5 = (double) r3
            r16 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b8
            if (r8 == 0) goto L_0x00a8
            float r4 = r4 * r10
            int r3 = (int) r4
            int r3 = r3 + r11
            int r3 = r3 + r12
            if (r3 > r1) goto L_0x00a8
            r1 = r3
            r5 = 1
            goto L_0x00a9
        L_0x00a8:
            r5 = 0
        L_0x00a9:
            if (r5 != 0) goto L_0x00b8
            if (r9 == 0) goto L_0x00b8
            int r3 = r1 - r11
            int r3 = r3 - r12
            float r3 = (float) r3
            float r3 = r3 / r10
            int r3 = (int) r3
            int r3 = r3 + r13
            int r3 = r3 + r14
            if (r3 > r2) goto L_0x00b8
            r2 = r3
        L_0x00b8:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.QImageView.onMeasure(int, int):void");
    }

    public boolean onSetAlpha(int i) {
        if (getBackground() != null) {
            return false;
        }
        int i2 = i + (i >> 7);
        if (this.f285502q != i2) {
            this.f285502q = i2;
            this.f285503r = true;
            mo136284f();
        }
        return true;
    }

    public void setAdjustViewBounds(boolean z) {
        this.f285497i = z;
        if (z) {
            setScaleType(C97274a.FIT_CENTER);
        }
    }

    public void setAlpha(int i) {
        int i2 = i & 255;
        if (this.f285501p != i2) {
            this.f285501p = i2;
            this.f285503r = true;
            mo136284f();
            invalidate();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public final void setColorFilter(int i) {
        setColorFilter((ColorFilter) new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new BitmapDrawable(this.f285511z.getResources(), bitmap));
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f285504s != drawable) {
            this.f285493e = 0;
            this.f285492d = null;
            mo136295l(drawable);
            postInvalidate();
        }
    }

    public void setImageLevel(int i) {
        this.f285505t = i;
        Drawable drawable = this.f285504s;
        if (drawable != null) {
            drawable.setLevel(i);
            mo136291i();
        }
    }

    public void setImageMatrix(Matrix matrix) {
        if (matrix != null && matrix.isIdentity()) {
            matrix = null;
        }
        if ((matrix == null && !this.f285494f.isIdentity()) || (matrix != null && !this.f285494f.equals(matrix))) {
            this.f285494f.set(matrix);
            mo136285g();
            invalidate();
        }
    }

    public void setImageResource(int i) {
        if (this.f285492d != null || this.f285493e != i) {
            mo136295l((Drawable) null);
            this.f285493e = i;
            this.f285492d = null;
            mo136294k();
            invalidate();
        }
    }

    public void setImageURI(Uri uri) {
        if (this.f285493e == 0) {
            Uri uri2 = this.f285492d;
            if (uri2 == uri) {
                return;
            }
            if (!(uri == null || uri2 == null || !uri.equals(uri2))) {
                return;
            }
        }
        mo136295l((Drawable) null);
        this.f285493e = 0;
        this.f285492d = uri;
        mo136294k();
        invalidate();
    }

    public void setLayerType(int i, Paint paint) {
        if (!(getDrawable() instanceof PictureDrawable) || i == 1) {
            super.setLayerType(i, paint);
        }
    }

    public void setMaxHeight(int i) {
        this.f285499n = i;
    }

    public void setMaxWidth(int i) {
        this.f285498j = i;
    }

    public void setScaleType(C97274a aVar) {
        aVar.getClass();
        if (this.f285495g != aVar) {
            this.f285495g = aVar;
            setWillNotCacheDrawing(aVar == C97274a.CENTER);
            requestLayout();
            invalidate();
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        mo136291i();
    }

    public boolean verifyDrawable(Drawable drawable) {
        return this.f285504s == drawable || super.verifyDrawable(drawable);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f285500o != colorFilter) {
            this.f285500o = colorFilter;
            this.f285503r = true;
            mo136284f();
            invalidate();
        }
    }

    public QImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f285511z = context;
        mo136290h();
    }

    public QImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f285493e = 0;
        this.f285496h = false;
        this.f285497i = false;
        this.f285498j = Integer.MAX_VALUE;
        this.f285499n = Integer.MAX_VALUE;
        this.f285501p = 255;
        this.f285502q = 256;
        this.f285503r = false;
        this.f285504s = null;
        this.f285505t = 0;
        this.f285508w = null;
        this.f285509x = new RectF();
        this.f285510y = new RectF();
        this.f285511z = context;
        mo136290h();
        setAdjustViewBounds(false);
        setMaxWidth(Integer.MAX_VALUE);
        setMaxHeight(Integer.MAX_VALUE);
    }
}
