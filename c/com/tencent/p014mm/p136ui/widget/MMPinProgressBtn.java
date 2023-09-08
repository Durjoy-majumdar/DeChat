package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.widget.MMPinProgressBtn */
public class MMPinProgressBtn extends CompoundButton {

    /* renamed from: d */
    public int f319180d;

    /* renamed from: e */
    public int f319181e;

    /* renamed from: f */
    public int f319182f;

    /* renamed from: g */
    public Paint f319183g;

    /* renamed from: h */
    public Paint f319184h;

    /* renamed from: i */
    public RectF f319185i = new RectF();

    /* renamed from: j */
    public int f319186j;

    /* renamed from: n */
    public Runnable f319187n = new C106765a();

    /* renamed from: com.tencent.mm.ui.widget.MMPinProgressBtn$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C106764a();

        /* renamed from: d */
        public int f319188d;

        /* renamed from: e */
        public int f319189e;

        /* renamed from: com.tencent.mm.ui.widget.MMPinProgressBtn$SavedState$a */
        public class C106764a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C106765a) null);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f319188d);
            parcel.writeInt(this.f319189e);
        }

        public SavedState(Parcel parcel, C106765a aVar) {
            super(parcel);
            this.f319188d = parcel.readInt();
            this.f319189e = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.MMPinProgressBtn$a */
    public class C106765a implements Runnable {
        public C106765a() {
        }

        public void run() {
            if (MMPinProgressBtn.this.getVisibility() != 0) {
                Log.m105924i("MicroMsg.MMPinProgressBtn", "cur progress bar not visiable, stop auto pregress");
                return;
            }
            MMPinProgressBtn mMPinProgressBtn = MMPinProgressBtn.this;
            int i = mMPinProgressBtn.f319181e + 1;
            mMPinProgressBtn.f319181e = i;
            if (i >= mMPinProgressBtn.f319180d) {
                mMPinProgressBtn.f319181e = i - 1;
                Log.m105924i("MicroMsg.MMPinProgressBtn", "match auto progress max, return");
                return;
            }
            mMPinProgressBtn.invalidate();
            MMPinProgressBtn mMPinProgressBtn2 = MMPinProgressBtn.this;
            mMPinProgressBtn2.postDelayed(mMPinProgressBtn2.f319187n, 200);
        }
    }

    public MMPinProgressBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo153892b(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo153891a() {
        removeCallbacks(this.f319187n);
        post(this.f319187n);
    }

    /* renamed from: b */
    public final void mo153892b(Context context, AttributeSet attributeSet, int i) {
        this.f319180d = 100;
        this.f319181e = 0;
        Resources resources = getResources();
        int color = resources.getColor(C0966R.color.a8l);
        int color2 = resources.getColor(C0966R.color.a8m);
        if (attributeSet != null) {
            TypedArray typedArray = null;
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, C77853a.f226869o, i, 0);
                this.f319180d = typedArray.getInteger(2, this.f319180d);
                this.f319181e = typedArray.getInteger(4, this.f319181e);
                color = typedArray.getColor(0, color);
                color2 = typedArray.getColor(5, color2);
                this.f319182f = typedArray.getInteger(6, 0);
                this.f319186j = typedArray.getDimensionPixelSize(1, resources.getDimensionPixelSize(C0966R.dimen.ajk));
                typedArray.recycle();
            } catch (Throwable th) {
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        }
        Paint paint = new Paint();
        this.f319183g = paint;
        paint.setColor(color);
        this.f319183g.setStyle(Paint.Style.STROKE);
        this.f319183g.setStrokeWidth(4.0f);
        this.f319183g.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f319184h = paint2;
        paint2.setColor(color2);
        this.f319184h.setAntiAlias(true);
        setClickable(false);
    }

    public int getMax() {
        return this.f319180d;
    }

    public int getProgress() {
        return this.f319181e;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f319185i;
        int i = this.f319186j;
        rectF.set(2.0f, 2.0f, ((float) i) - 2.0f, ((float) i) - 2.0f);
        this.f319185i.offset((float) ((getWidth() - this.f319186j) / 2), (float) ((getHeight() - this.f319186j) / 2));
        canvas.drawArc(this.f319185i, 0.0f, 360.0f, true, this.f319183g);
        int i2 = this.f319182f;
        if (i2 == 0) {
            RectF rectF2 = this.f319185i;
            int i3 = this.f319186j;
            rectF2.set(8.0f, 8.0f, ((float) i3) - 8.0f, ((float) i3) - 8.0f);
            this.f319185i.offset((float) ((getWidth() - this.f319186j) / 2), (float) ((getHeight() - this.f319186j) / 2));
            canvas.drawArc(this.f319185i, -90.0f, ((((float) this.f319181e) * 1.0f) / ((float) this.f319180d)) * 360.0f, true, this.f319184h);
        } else if (i2 == 1) {
            RectF rectF3 = this.f319185i;
            int i4 = this.f319186j;
            rectF3.set(2.0f, 2.0f, ((float) i4) - 2.0f, ((float) i4) - 2.0f);
            this.f319185i.offset((float) ((getWidth() - this.f319186j) / 2), (float) ((getHeight() - this.f319186j) / 2));
            canvas.drawArc(this.f319185i, 270.0f, (((((float) this.f319181e) * 1.0f) / ((float) this.f319180d)) * 360.0f) - 360.0f, true, this.f319184h);
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(this.f319186j, i), View.resolveSize(this.f319186j, i2));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f319180d = savedState.f319189e;
        this.f319181e = savedState.f319188d;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (!isSaveEnabled()) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.f319189e = this.f319180d;
        savedState.f319188d = this.f319181e;
        return savedState;
    }

    public void setMax(int i) {
        this.f319180d = Math.max(0, i);
        invalidate();
    }

    public void setProgress(int i) {
        this.f319181e = Math.max(0, i);
        this.f319181e = Math.min(i, this.f319180d);
        invalidate();
    }

    public MMPinProgressBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo153892b(context, attributeSet, i);
    }
}
