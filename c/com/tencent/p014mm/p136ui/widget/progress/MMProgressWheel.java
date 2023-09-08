package com.tencent.p014mm.p136ui.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.widget.progress.MMProgressWheel */
public class MMProgressWheel extends View {

    /* renamed from: A */
    public boolean f319624A;

    /* renamed from: d */
    public int f319625d = 28;

    /* renamed from: e */
    public int f319626e = 4;

    /* renamed from: f */
    public int f319627f = 4;

    /* renamed from: g */
    public boolean f319628g;

    /* renamed from: h */
    public double f319629h;

    /* renamed from: i */
    public double f319630i;

    /* renamed from: j */
    public float f319631j;

    /* renamed from: n */
    public boolean f319632n;

    /* renamed from: o */
    public long f319633o;

    /* renamed from: p */
    public int f319634p;

    /* renamed from: q */
    public int f319635q;

    /* renamed from: r */
    public Paint f319636r;

    /* renamed from: s */
    public Paint f319637s;

    /* renamed from: t */
    public RectF f319638t;

    /* renamed from: u */
    public float f319639u;

    /* renamed from: v */
    public long f319640v;

    /* renamed from: w */
    public boolean f319641w;

    /* renamed from: x */
    public float f319642x;

    /* renamed from: y */
    public float f319643y;

    /* renamed from: z */
    public boolean f319644z;

    /* renamed from: com.tencent.mm.ui.widget.progress.MMProgressWheel$b */
    public interface C75010b {
        /* renamed from: a */
        void mo104578a(float f);
    }

    /* renamed from: com.tencent.mm.ui.widget.progress.MMProgressWheel$WheelSavedState */
    public static class WheelSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<WheelSavedState> CREATOR = new C106819a();

        /* renamed from: d */
        public float f319645d;

        /* renamed from: e */
        public float f319646e;

        /* renamed from: f */
        public boolean f319647f;

        /* renamed from: g */
        public float f319648g;

        /* renamed from: h */
        public int f319649h;

        /* renamed from: i */
        public int f319650i;

        /* renamed from: j */
        public int f319651j;

        /* renamed from: n */
        public int f319652n;

        /* renamed from: o */
        public int f319653o;

        /* renamed from: p */
        public boolean f319654p;

        /* renamed from: q */
        public boolean f319655q;

        /* renamed from: com.tencent.mm.ui.widget.progress.MMProgressWheel$WheelSavedState$a */
        public class C106819a implements Parcelable.Creator<WheelSavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new WheelSavedState(parcel, (C106820a) null);
            }

            public Object[] newArray(int i) {
                return new WheelSavedState[i];
            }
        }

        public WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f319645d);
            parcel.writeFloat(this.f319646e);
            parcel.writeByte(this.f319647f ? (byte) 1 : 0);
            parcel.writeFloat(this.f319648g);
            parcel.writeInt(this.f319649h);
            parcel.writeInt(this.f319650i);
            parcel.writeInt(this.f319651j);
            parcel.writeInt(this.f319652n);
            parcel.writeInt(this.f319653o);
            parcel.writeByte(this.f319654p ? (byte) 1 : 0);
            parcel.writeByte(this.f319655q ? (byte) 1 : 0);
        }

        public WheelSavedState(Parcel parcel, C106820a aVar) {
            super(parcel);
            this.f319645d = parcel.readFloat();
            this.f319646e = parcel.readFloat();
            boolean z = false;
            this.f319647f = parcel.readByte() != 0;
            this.f319648g = parcel.readFloat();
            this.f319649h = parcel.readInt();
            this.f319650i = parcel.readInt();
            this.f319651j = parcel.readInt();
            this.f319652n = parcel.readInt();
            this.f319653o = parcel.readInt();
            this.f319654p = parcel.readByte() != 0;
            this.f319655q = parcel.readByte() != 0 ? true : z;
        }
    }

    static {
        Class<MMProgressWheel> cls = MMProgressWheel.class;
    }

    public MMProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f319628g = false;
        this.f319629h = 0.0d;
        this.f319630i = 460.0d;
        this.f319631j = 0.0f;
        this.f319632n = true;
        this.f319633o = 0;
        this.f319634p = -1442840576;
        this.f319635q = 16777215;
        this.f319636r = new Paint();
        this.f319637s = new Paint();
        this.f319638t = new RectF();
        this.f319639u = 230.0f;
        this.f319640v = 0;
        this.f319642x = 0.0f;
        this.f319643y = 0.0f;
        this.f319644z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232408g);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f319626e = (int) TypedValue.applyDimension(1, (float) this.f319626e, displayMetrics);
        this.f319627f = (int) TypedValue.applyDimension(1, (float) this.f319627f, displayMetrics);
        int applyDimension = (int) TypedValue.applyDimension(1, (float) this.f319625d, displayMetrics);
        this.f319625d = applyDimension;
        this.f319625d = (int) obtainStyledAttributes.getDimension(3, (float) applyDimension);
        this.f319628g = obtainStyledAttributes.getBoolean(4, false);
        this.f319626e = (int) obtainStyledAttributes.getDimension(2, (float) this.f319626e);
        this.f319627f = (int) obtainStyledAttributes.getDimension(8, (float) this.f319627f);
        this.f319639u = obtainStyledAttributes.getFloat(9, this.f319639u / 360.0f) * 360.0f;
        this.f319630i = (double) obtainStyledAttributes.getInt(1, (int) this.f319630i);
        this.f319634p = obtainStyledAttributes.getColor(0, this.f319634p);
        this.f319635q = obtainStyledAttributes.getColor(7, this.f319635q);
        this.f319641w = obtainStyledAttributes.getBoolean(5, false);
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.f319640v = SystemClock.uptimeMillis();
            this.f319644z = true;
            invalidate();
        }
        obtainStyledAttributes.recycle();
        this.f319624A = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f ? true : z;
    }

    /* renamed from: a */
    public final void mo154567a() {
    }

    /* renamed from: b */
    public final void mo154568b() {
        this.f319636r.setColor(this.f319634p);
        this.f319636r.setAntiAlias(true);
        this.f319636r.setStyle(Paint.Style.STROKE);
        this.f319636r.setStrokeWidth((float) this.f319626e);
        this.f319637s.setColor(this.f319635q);
        this.f319637s.setAntiAlias(true);
        this.f319637s.setStyle(Paint.Style.STROKE);
        this.f319637s.setStrokeWidth((float) this.f319627f);
    }

    public int getBarColor() {
        return this.f319634p;
    }

    public int getBarWidth() {
        return this.f319626e;
    }

    public int getCircleRadius() {
        return this.f319625d;
    }

    public float getProgress() {
        if (this.f319644z) {
            return -1.0f;
        }
        return this.f319642x / 360.0f;
    }

    public int getRimColor() {
        return this.f319635q;
    }

    public int getRimWidth() {
        return this.f319627f;
    }

    public float getSpinSpeed() {
        return this.f319639u / 360.0f;
    }

    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        canvas.drawArc(this.f319638t, 360.0f, 360.0f, false, this.f319637s);
        if (this.f319624A) {
            float f3 = 0.0f;
            boolean z = true;
            if (this.f319644z) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f319640v;
                float f4 = (((float) uptimeMillis) * this.f319639u) / 1000.0f;
                long j = this.f319633o;
                if (j >= 200) {
                    double d = this.f319629h + ((double) uptimeMillis);
                    this.f319629h = d;
                    double d2 = this.f319630i;
                    if (d > d2) {
                        this.f319629h = d - d2;
                        this.f319633o = 0;
                        this.f319632n = !this.f319632n;
                    }
                    float cos = (((float) Math.cos(((this.f319629h / d2) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    if (this.f319632n) {
                        this.f319631j = cos * 254.0f;
                    } else {
                        float f5 = (1.0f - cos) * 254.0f;
                        this.f319642x += this.f319631j - f5;
                        this.f319631j = f5;
                    }
                } else {
                    this.f319633o = j + uptimeMillis;
                }
                float f6 = this.f319642x + f4;
                this.f319642x = f6;
                if (f6 > 360.0f) {
                    this.f319642x = f6 - 360.0f;
                }
                this.f319640v = SystemClock.uptimeMillis();
                float f7 = this.f319642x - 90.0f;
                float f8 = this.f319631j + 16.0f;
                if (isInEditMode()) {
                    f2 = 0.0f;
                    f = 135.0f;
                } else {
                    f2 = f7;
                    f = f8;
                }
                canvas.drawArc(this.f319638t, f2, f, false, this.f319636r);
            } else {
                float f9 = this.f319642x;
                if (f9 != this.f319643y) {
                    this.f319642x = Math.min(this.f319642x + ((((float) (SystemClock.uptimeMillis() - this.f319640v)) / 1000.0f) * this.f319639u), this.f319643y);
                    this.f319640v = SystemClock.uptimeMillis();
                } else {
                    z = false;
                }
                if (f9 != this.f319642x) {
                    mo154567a();
                }
                float f15 = this.f319642x;
                if (!this.f319641w) {
                    f3 = ((float) (1.0d - Math.pow((double) (1.0f - (f15 / 360.0f)), (double) 4.0f))) * 360.0f;
                    f15 = ((float) (1.0d - Math.pow((double) (1.0f - (this.f319642x / 360.0f)), (double) 2.0f))) * 360.0f;
                }
                canvas.drawArc(this.f319638t, f3 - 90.0f, isInEditMode() ? 360.0f : f15, false, this.f319636r);
            }
            if (z) {
                invalidate();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = this.f319625d + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.f319625d + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingLeft = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WheelSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        WheelSavedState wheelSavedState = (WheelSavedState) parcelable;
        super.onRestoreInstanceState(wheelSavedState.getSuperState());
        this.f319642x = wheelSavedState.f319645d;
        this.f319643y = wheelSavedState.f319646e;
        this.f319644z = wheelSavedState.f319647f;
        this.f319639u = wheelSavedState.f319648g;
        this.f319626e = wheelSavedState.f319649h;
        this.f319634p = wheelSavedState.f319650i;
        this.f319627f = wheelSavedState.f319651j;
        this.f319635q = wheelSavedState.f319652n;
        this.f319625d = wheelSavedState.f319653o;
        this.f319641w = wheelSavedState.f319654p;
        this.f319628g = wheelSavedState.f319655q;
        this.f319640v = SystemClock.uptimeMillis();
    }

    public Parcelable onSaveInstanceState() {
        WheelSavedState wheelSavedState = new WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.f319645d = this.f319642x;
        wheelSavedState.f319646e = this.f319643y;
        wheelSavedState.f319647f = this.f319644z;
        wheelSavedState.f319648g = this.f319639u;
        wheelSavedState.f319649h = this.f319626e;
        wheelSavedState.f319650i = this.f319634p;
        wheelSavedState.f319651j = this.f319627f;
        wheelSavedState.f319652n = this.f319635q;
        wheelSavedState.f319653o = this.f319625d;
        wheelSavedState.f319654p = this.f319641w;
        wheelSavedState.f319655q = this.f319628g;
        return wheelSavedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (!this.f319628g) {
            int i5 = (i - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i5, (i2 - paddingBottom) - paddingTop), (this.f319625d * 2) - (this.f319626e * 2));
            int i6 = ((i5 - min) / 2) + paddingLeft;
            int i7 = ((((i2 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i8 = this.f319626e;
            this.f319638t = new RectF((float) (i6 + i8), (float) (i7 + i8), (float) ((i6 + min) - i8), (float) ((i7 + min) - i8));
        } else {
            int i9 = this.f319626e;
            this.f319638t = new RectF((float) (paddingLeft + i9), (float) (paddingTop + i9), (float) ((i - paddingRight) - i9), (float) ((i2 - paddingBottom) - i9));
        }
        mo154568b();
        invalidate();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f319640v = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i) {
        this.f319634p = i;
        mo154568b();
        if (!this.f319644z) {
            invalidate();
        }
    }

    public void setBarWidth(int i) {
        this.f319626e = i;
        if (!this.f319644z) {
            invalidate();
        }
    }

    public void setCallback(C75010b bVar) {
        if (!this.f319644z) {
            mo154567a();
        }
    }

    public void setCircleRadius(int i) {
        this.f319625d = i;
        if (!this.f319644z) {
            invalidate();
        }
    }

    public void setInstantProgress(float f) {
        if (this.f319644z) {
            this.f319642x = 0.0f;
            this.f319644z = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (Math.abs(f - this.f319643y) > 0.0f) {
            float min = Math.min(f * 360.0f, 360.0f);
            this.f319643y = min;
            this.f319642x = min;
            this.f319640v = SystemClock.uptimeMillis();
            invalidate();
        }
    }

    public void setLinearProgress(boolean z) {
        this.f319641w = z;
        if (!this.f319644z) {
            invalidate();
        }
    }

    public void setProgress(float f) {
        if (this.f319644z) {
            this.f319642x = 0.0f;
            this.f319644z = false;
            mo154567a();
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (Math.abs(f - this.f319643y) > 0.0f) {
            if (this.f319642x == this.f319643y) {
                this.f319640v = SystemClock.uptimeMillis();
            }
            this.f319643y = Math.min(f * 360.0f, 360.0f);
            invalidate();
        }
    }

    public void setRimColor(int i) {
        this.f319635q = i;
        mo154568b();
        if (!this.f319644z) {
            invalidate();
        }
    }

    public void setRimWidth(int i) {
        this.f319627f = i;
        if (!this.f319644z) {
            invalidate();
        }
    }

    public void setSpinSpeed(float f) {
        this.f319639u = f * 360.0f;
    }
}
