package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import yn2.C79141n0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView */
public class CircularImageView extends ImageView {

    /* renamed from: d */
    public boolean f206045d;

    /* renamed from: e */
    public boolean f206046e;

    /* renamed from: f */
    public boolean f206047f;

    /* renamed from: g */
    public int f206048g;

    /* renamed from: h */
    public int f206049h;

    /* renamed from: i */
    public int f206050i;

    /* renamed from: j */
    public boolean f206051j;

    /* renamed from: n */
    public float f206052n;

    /* renamed from: o */
    public float f206053o;

    /* renamed from: p */
    public float f206054p;

    /* renamed from: q */
    public int f206055q;

    /* renamed from: r */
    public BitmapShader f206056r;

    /* renamed from: s */
    public Bitmap f206057s;

    /* renamed from: t */
    public Paint f206058t;

    /* renamed from: u */
    public Paint f206059u;

    /* renamed from: v */
    public Paint f206060v;

    /* renamed from: w */
    public ColorFilter f206061w;

    static {
        Class<CircularImageView> cls = CircularImageView.class;
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public Bitmap mo97881a(Drawable drawable) {
        SnsMethodCalculate.markStartTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        if (drawable == null) {
            SnsMethodCalculate.markEndTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return null;
        } else if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            SnsMethodCalculate.markEndTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return bitmap;
        } else {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                SnsMethodCalculate.markEndTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
                return null;
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                SnsMethodCalculate.markEndTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
                return createBitmap;
            } catch (OutOfMemoryError unused) {
                SnsMethodCalculate.markEndTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
                return null;
            }
        }
    }

    /* renamed from: b */
    public void mo97882b() {
        SnsMethodCalculate.markStartTimeMs("updateBitmapShader", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        if (this.f206057s == null) {
            SnsMethodCalculate.markEndTimeMs("updateBitmapShader", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return;
        }
        Bitmap bitmap = this.f206057s;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f206056r = new BitmapShader(bitmap, tileMode, tileMode);
        if (!(this.f206049h == this.f206057s.getWidth() && this.f206049h == this.f206057s.getHeight())) {
            Matrix matrix = new Matrix();
            float width = ((float) this.f206049h) / ((float) this.f206057s.getWidth());
            matrix.setScale(width, width);
            this.f206056r.setLocalMatrix(matrix);
        }
        SnsMethodCalculate.markEndTimeMs("updateBitmapShader", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        if (!isClickable()) {
            this.f206047f = false;
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return onTouchEvent;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f206047f = true;
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            this.f206047f = false;
        }
        invalidate();
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        return dispatchTouchEvent;
    }

    public boolean isSelected() {
        SnsMethodCalculate.markStartTimeMs("isSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        boolean z = this.f206047f;
        SnsMethodCalculate.markEndTimeMs("isSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        return z;
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        Bitmap bitmap = this.f206057s;
        if (bitmap == null) {
            SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        } else if (bitmap.getHeight() == 0 || this.f206057s.getWidth() == 0) {
            SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        } else {
            int i4 = this.f206049h;
            int width = getWidth() < getHeight() ? getWidth() : getHeight();
            this.f206049h = width;
            if (i4 != width) {
                mo97882b();
            }
            this.f206058t.setShader(this.f206056r);
            int i5 = this.f206049h;
            int i6 = i5 / 2;
            if (this.f206046e && this.f206047f) {
                i2 = this.f206050i;
                int i7 = i2 * 2;
                i3 = (i5 - i7) / 2;
                this.f206058t.setColorFilter(this.f206061w);
                float f = (float) (i3 + i2);
                canvas.drawCircle(f, f, ((float) (((this.f206049h - i7) / 2) + i2)) - 4.0f, this.f206060v);
            } else if (this.f206045d) {
                i2 = this.f206048g;
                i3 = (i5 - (i2 * 2)) / 2;
                this.f206058t.setColorFilter((ColorFilter) null);
                int i8 = i2 / 2;
                float f2 = (float) (i8 + 0);
                int i9 = this.f206049h;
                canvas.drawArc(new RectF(f2, f2, (float) (i9 - i8), (float) (i9 - i8)), 360.0f, 360.0f, false, this.f206059u);
            } else {
                this.f206058t.setColorFilter((ColorFilter) null);
                i = 0;
                float f3 = (float) (i6 + i);
                canvas.drawCircle(f3, f3, (float) ((this.f206049h - (i * 2)) / 2), this.f206058t);
                SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            }
            int i15 = i2;
            i6 = i3;
            i = i15;
            float f35 = (float) (i6 + i);
            canvas.drawCircle(f35, f35, (float) ((this.f206049h - (i * 2)) / 2), this.f206058t);
            SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        }
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        SnsMethodCalculate.markStartTimeMs("measureWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (!(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            size = this.f206049h;
        }
        SnsMethodCalculate.markEndTimeMs("measureWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        SnsMethodCalculate.markStartTimeMs("measureHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode2 == 1073741824 || mode2 == Integer.MIN_VALUE)) {
            size2 = this.f206049h;
        }
        SnsMethodCalculate.markEndTimeMs("measureHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        setMeasuredDimension(size, size2 + 2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setBorderColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        Paint paint = this.f206059u;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setBorderWidth(int i) {
        SnsMethodCalculate.markStartTimeMs("setBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f206048g = i;
        Paint paint = this.f206059u;
        if (paint != null) {
            paint.setStrokeWidth((float) i);
        }
        requestLayout();
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setIconModeEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIconModeEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        SnsMethodCalculate.markEndTimeMs("setIconModeEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setImageBitmap(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageBitmap(bitmap);
        this.f206057s = bitmap;
        if (this.f206049h > 0) {
            mo97882b();
        }
        SnsMethodCalculate.markEndTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setImageDrawable(Drawable drawable) {
        SnsMethodCalculate.markStartTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageDrawable(drawable);
        this.f206057s = mo97881a(getDrawable());
        if (this.f206049h > 0) {
            mo97882b();
        }
        SnsMethodCalculate.markEndTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setImageResource(int i) {
        SnsMethodCalculate.markStartTimeMs("setImageResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageResource(i);
        this.f206057s = mo97881a(getDrawable());
        if (this.f206049h > 0) {
            mo97882b();
        }
        SnsMethodCalculate.markEndTimeMs("setImageResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setImageURI(Uri uri) {
        SnsMethodCalculate.markStartTimeMs("setImageURI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageURI(uri);
        this.f206057s = mo97881a(getDrawable());
        if (this.f206049h > 0) {
            mo97882b();
        }
        SnsMethodCalculate.markEndTimeMs("setImageURI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setSelectorColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setSelectorColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f206061w = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setSelectorColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setSelectorStrokeColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setSelectorStrokeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        Paint paint = this.f206060v;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setSelectorStrokeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setSelectorStrokeWidth(int i) {
        SnsMethodCalculate.markStartTimeMs("setSelectorStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f206050i = i;
        requestLayout();
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setSelectorStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setShadowEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setShadowEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f206051j = z;
        SnsMethodCalculate.markStartTimeMs("updateShadow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        float f = this.f206051j ? this.f206052n : 0.0f;
        this.f206059u.setShadowLayer(f, this.f206053o, this.f206054p, this.f206055q);
        this.f206060v.setShadowLayer(f, this.f206053o, this.f206054p, this.f206055q);
        SnsMethodCalculate.markEndTimeMs("updateShadow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        SnsMethodCalculate.markEndTimeMs("setShadowEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        Paint paint = new Paint();
        this.f206058t = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f206059u = paint2;
        paint2.setAntiAlias(true);
        this.f206059u.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.f206060v = paint3;
        paint3.setAntiAlias(true);
        setLayerType(1, (Paint) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79141n0.f232400a, i, 0);
        this.f206045d = obtainStyledAttributes.getBoolean(0, false);
        this.f206046e = obtainStyledAttributes.getBoolean(3, false);
        this.f206051j = obtainStyledAttributes.getBoolean(7, false);
        if (this.f206045d) {
            setBorderWidth(obtainStyledAttributes.getDimensionPixelOffset(2, (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f)));
            setBorderColor(obtainStyledAttributes.getColor(1, -1));
        }
        if (this.f206046e) {
            setSelectorColor(obtainStyledAttributes.getColor(4, 0));
            setSelectorStrokeWidth(obtainStyledAttributes.getDimensionPixelOffset(6, (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f)));
            setSelectorStrokeColor(obtainStyledAttributes.getColor(5, -16776961));
        }
        if (this.f206051j) {
            this.f206052n = obtainStyledAttributes.getFloat(11, 4.0f);
            this.f206053o = obtainStyledAttributes.getFloat(9, 0.0f);
            this.f206054p = obtainStyledAttributes.getFloat(10, 2.0f);
            this.f206055q = obtainStyledAttributes.getColor(8, -16777216);
            setShadowEnabled(true);
        }
        obtainStyledAttributes.recycle();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }
}
