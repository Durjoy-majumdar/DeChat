package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.game.C42398y;

/* renamed from: com.tencent.mm.plugin.game.widget.CircleImageView */
public class CircleImageView extends ImageView {

    /* renamed from: x */
    public static final ImageView.ScaleType f198344x = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: y */
    public static final Bitmap.Config f198345y = Bitmap.Config.ARGB_8888;

    /* renamed from: d */
    public final RectF f198346d;

    /* renamed from: e */
    public final RectF f198347e;

    /* renamed from: f */
    public final Matrix f198348f;

    /* renamed from: g */
    public final Paint f198349g;

    /* renamed from: h */
    public final Paint f198350h;

    /* renamed from: i */
    public int f198351i;

    /* renamed from: j */
    public int f198352j;

    /* renamed from: n */
    public Bitmap f198353n;

    /* renamed from: o */
    public BitmapShader f198354o;

    /* renamed from: p */
    public int f198355p;

    /* renamed from: q */
    public int f198356q;

    /* renamed from: r */
    public float f198357r;

    /* renamed from: s */
    public float f198358s;

    /* renamed from: t */
    public ColorFilter f198359t;

    /* renamed from: u */
    public boolean f198360u;

    /* renamed from: v */
    public boolean f198361v;

    /* renamed from: w */
    public boolean f198362w;

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final Bitmap mo95011a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f198345y) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f198345y);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo95012b() {
        float f;
        float f2;
        if (!this.f198360u) {
            this.f198361v = true;
        } else if (this.f198353n != null) {
            Bitmap bitmap = this.f198353n;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f198354o = new BitmapShader(bitmap, tileMode, tileMode);
            this.f198349g.setAntiAlias(true);
            this.f198349g.setShader(this.f198354o);
            this.f198350h.setStyle(Paint.Style.STROKE);
            this.f198350h.setAntiAlias(true);
            this.f198350h.setColor(this.f198351i);
            this.f198350h.setStrokeWidth((float) this.f198352j);
            this.f198356q = this.f198353n.getHeight();
            this.f198355p = this.f198353n.getWidth();
            float f3 = 0.0f;
            this.f198347e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f198358s = Math.min((this.f198347e.height() - ((float) this.f198352j)) / 2.0f, (this.f198347e.width() - ((float) this.f198352j)) / 2.0f);
            this.f198346d.set(this.f198347e);
            if (!this.f198362w) {
                RectF rectF = this.f198346d;
                int i = this.f198352j;
                rectF.inset((float) i, (float) i);
            }
            this.f198357r = Math.min(this.f198346d.height() / 2.0f, this.f198346d.width() / 2.0f);
            this.f198348f.set((Matrix) null);
            if (((float) this.f198355p) * this.f198346d.height() > this.f198346d.width() * ((float) this.f198356q)) {
                f2 = this.f198346d.height() / ((float) this.f198356q);
                f3 = (this.f198346d.width() - (((float) this.f198355p) * f2)) * 0.5f;
                f = 0.0f;
            } else {
                f2 = this.f198346d.width() / ((float) this.f198355p);
                f = (this.f198346d.height() - (((float) this.f198356q) * f2)) * 0.5f;
            }
            this.f198348f.setScale(f2, f2);
            Matrix matrix = this.f198348f;
            RectF rectF2 = this.f198346d;
            matrix.postTranslate(((float) ((int) (f3 + 0.5f))) + rectF2.left, ((float) ((int) (f + 0.5f))) + rectF2.top);
            this.f198354o.setLocalMatrix(this.f198348f);
            invalidate();
        }
    }

    public int getBorderColor() {
        return this.f198351i;
    }

    public int getBorderWidth() {
        return this.f198352j;
    }

    public ImageView.ScaleType getScaleType() {
        return f198344x;
    }

    public void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f198357r, this.f198349g);
            if (this.f198352j != 0) {
                canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f198358s, this.f198350h);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo95012b();
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i != this.f198351i) {
            this.f198351i = i;
            this.f198350h.setColor(i);
            invalidate();
        }
    }

    public void setBorderColorResource(int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.f198362w) {
            this.f198362w = z;
            mo95012b();
        }
    }

    public void setBorderWidth(int i) {
        if (i != this.f198352j) {
            this.f198352j = i;
            mo95012b();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f198359t) {
            this.f198359t = colorFilter;
            this.f198349g.setColorFilter(colorFilter);
            invalidate();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f198353n = bitmap;
        mo95012b();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f198353n = mo95011a(drawable);
        mo95012b();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        this.f198353n = mo95011a(getDrawable());
        mo95012b();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f198353n = mo95011a(getDrawable());
        mo95012b();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f198344x) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f198346d = new RectF();
        this.f198347e = new RectF();
        this.f198348f = new Matrix();
        this.f198349g = new Paint();
        this.f198350h = new Paint();
        this.f198351i = -16777216;
        this.f198352j = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42398y.f114689a, i, 0);
        this.f198352j = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f198351i = obtainStyledAttributes.getColor(0, -16777216);
        this.f198362w = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        super.setScaleType(f198344x);
        this.f198360u = true;
        if (this.f198361v) {
            mo95012b();
            this.f198361v = false;
        }
    }
}
