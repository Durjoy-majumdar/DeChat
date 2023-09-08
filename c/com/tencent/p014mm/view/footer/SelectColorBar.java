package com.tencent.p014mm.view.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import qc3.C110384a;

/* renamed from: com.tencent.mm.view.footer.SelectColorBar */
public class SelectColorBar extends View {

    /* renamed from: d */
    public float f319958d = getResources().getDimension(C0966R.dimen.a5o);

    /* renamed from: e */
    public float f319959e = getResources().getDimension(C0966R.dimen.a26);

    /* renamed from: f */
    public float f319960f = 5.0f;

    /* renamed from: g */
    public float f319961g = 6.0f;

    /* renamed from: h */
    public Rect[] f319962h;

    /* renamed from: i */
    public int[] f319963i = {-1, -16777216, -707825, -17592, -16535286, -15172610, -7054596, -449092, -7054596, -449092};

    /* renamed from: j */
    public Paint f319964j;

    /* renamed from: n */
    public C106865a f319965n;

    /* renamed from: o */
    public int f319966o = 0;

    /* renamed from: p */
    public int f319967p = -1;

    /* renamed from: q */
    public boolean f319968q = true;

    /* renamed from: com.tencent.mm.view.footer.SelectColorBar$a */
    public interface C106865a {
        /* renamed from: b */
        void mo154869b(int i);
    }

    public SelectColorBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C110384a.f330213a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f319963i = obtainStyledAttributes.getResources().getIntArray(resourceId);
        }
        this.f319966o = obtainStyledAttributes.getInt(1, 0);
        this.f319959e = obtainStyledAttributes.getDimension(3, getResources().getDimension(C0966R.dimen.a26));
        this.f319958d = obtainStyledAttributes.getDimension(2, getResources().getDimension(C0966R.dimen.a5o));
        this.f319960f = obtainStyledAttributes.getDimension(5, 5.0f);
        this.f319961g = obtainStyledAttributes.getDimension(4, 6.0f);
        obtainStyledAttributes.recycle();
        new Paint(1).setColor(-16711936);
        this.f319962h = new Rect[this.f319963i.length];
        Paint paint = new Paint(1);
        this.f319964j = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f319964j.setStrokeCap(Paint.Cap.ROUND);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C106865a aVar;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        int i = 0;
        if (action == 0) {
            while (true) {
                Rect[] rectArr = this.f319962h;
                if (i >= rectArr.length) {
                    break;
                } else if (rectArr[i].contains(x, y)) {
                    this.f319967p = i;
                    break;
                } else {
                    i++;
                }
            }
        } else if (action == 1 || action == 3) {
            while (true) {
                Rect[] rectArr2 = this.f319962h;
                if (rectArr2 != null && i < rectArr2.length) {
                    if (rectArr2[i].contains(x, y) && i == this.f319967p && (aVar = this.f319965n) != null) {
                        aVar.mo154869b(this.f319963i[i]);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            requestLayout();
            postInvalidate();
        }
        return true;
    }

    public int getCurColor() {
        int i = this.f319967p;
        return i == -1 ? this.f319963i[2] : this.f319963i[i];
    }

    public int getDetailHeight() {
        return (int) getResources().getDimension(C0966R.dimen.f4293z0);
    }

    public int getPaddingLeftAndRight() {
        return (int) (this.f319958d * 2.0f);
    }

    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        canvas.drawColor(0);
        int[] iArr = this.f319963i;
        float measuredWidth = (((float) (getMeasuredWidth() - getPaddingLeftAndRight())) - ((this.f319959e * 2.0f) * ((float) iArr.length))) / ((float) (iArr.length - 1));
        float paddingLeftAndRight = ((float) (getPaddingLeftAndRight() / 2)) + this.f319959e + this.f319960f;
        float detailHeight = (((float) getDetailHeight()) * 1.0f) / 2.0f;
        int i = 0;
        while (i < this.f319963i.length) {
            float f2 = 0.0f;
            if (this.f319967p == i) {
                f = this.f319961g;
                this.f319968q = false;
            } else {
                f = (!this.f319968q || i != 2) ? 0.0f : this.f319961g;
            }
            this.f319964j.setColor(-1);
            canvas.drawCircle(paddingLeftAndRight, detailHeight, this.f319959e + this.f319960f + f, this.f319964j);
            this.f319964j.setColor(this.f319963i[i]);
            if (this.f319966o != 1) {
                f2 = f;
            }
            canvas.drawCircle(paddingLeftAndRight, detailHeight, this.f319959e + f2, this.f319964j);
            paddingLeftAndRight += (this.f319959e * 2.0f) + measuredWidth;
            i++;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f319966o == 1) {
            float f = this.f319958d;
            int[] iArr = this.f319963i;
            i3 = (int) ((f * ((float) (iArr.length - 1))) + (this.f319959e * 2.0f * ((float) iArr.length)) + ((float) getPaddingLeftAndRight()));
        } else {
            i3 = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec((int) getResources().getDimension(C0966R.dimen.f4293z0), 1073741824));
        if (this.f319962h == null) {
            this.f319962h = new Rect[this.f319963i.length];
        }
        float f2 = this.f319959e * 2.0f;
        int[] iArr2 = this.f319963i;
        float measuredWidth = (((float) (getMeasuredWidth() - getPaddingLeftAndRight())) - (((float) iArr2.length) * f2)) / ((float) (iArr2.length - 1));
        int i4 = (int) f2;
        int paddingLeftAndRight = (int) (((float) (getPaddingLeftAndRight() / 2)) + this.f319959e + this.f319960f);
        int detailHeight = getDetailHeight() / 2;
        for (int i5 = 0; i5 < this.f319963i.length; i5++) {
            this.f319962h[i5] = new Rect(paddingLeftAndRight - i4, detailHeight - i4, paddingLeftAndRight + i4, detailHeight + i4);
            paddingLeftAndRight = (int) (((float) paddingLeftAndRight) + (this.f319959e * 2.0f) + measuredWidth);
        }
    }

    public void setItemPadding(float f) {
        this.f319958d = f;
    }

    public void setSelectColor(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f319963i;
            if (i2 >= iArr.length) {
                break;
            } else if (iArr[i2] == i) {
                this.f319967p = i2;
                break;
            } else {
                i2++;
            }
        }
        this.f319968q = false;
        postInvalidate();
    }

    public void setSelectColorListener(C106865a aVar) {
        this.f319965n = aVar;
    }
}
