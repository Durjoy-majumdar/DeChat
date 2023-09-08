package com.tencent.p014mm.p136ui.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kg3.C76577a;
import p849e3.C107222v;

/* renamed from: com.tencent.mm.ui.indicator.TitlePageIndicator */
public class TitlePageIndicator extends View implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public ViewPager.OnPageChangeListener f319028d;

    /* renamed from: e */
    public int f319029e = -1;

    /* renamed from: f */
    public float f319030f;

    /* renamed from: g */
    public int f319031g;

    /* renamed from: h */
    public int f319032h;

    /* renamed from: i */
    public final Paint f319033i = new Paint();

    /* renamed from: j */
    public int f319034j;
    private CustomViewPager mViewPager;

    /* renamed from: n */
    public int f319035n;

    /* renamed from: o */
    public int f319036o;

    /* renamed from: p */
    public int f319037p;

    /* renamed from: q */
    public float f319038q;

    /* renamed from: r */
    public float f319039r;

    /* renamed from: s */
    public float f319040s;

    /* renamed from: t */
    public int f319041t;

    /* renamed from: u */
    public float f319042u;

    /* renamed from: v */
    public int f319043v;

    /* renamed from: w */
    public boolean f319044w;

    /* renamed from: x */
    public C106713a f319045x;

    /* renamed from: y */
    public C106713a f319046y;

    /* renamed from: com.tencent.mm.ui.indicator.TitlePageIndicator$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C106711a();

        /* renamed from: d */
        public int f319047d;

        /* renamed from: com.tencent.mm.ui.indicator.TitlePageIndicator$SavedState$a */
        public class C106711a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C106712a) null);
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
            parcel.writeInt(this.f319047d);
        }

        public SavedState(Parcel parcel, C106712a aVar) {
            super(parcel);
            this.f319047d = parcel.readInt();
        }
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        this.f319042u = -1.0f;
        this.f319043v = -1;
        mo153687b();
    }

    private int getCount() {
        return this.mViewPager.getAdapter().getCount() + 1;
    }

    /* renamed from: a */
    public final Rect mo153686a(int i, Paint paint) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        CharSequence pageTitle = this.mViewPager.getAdapter().getPageTitle(i);
        if (pageTitle == null) {
            pageTitle = "";
        }
        paint.getTextBounds(pageTitle.toString(), 0, pageTitle.length(), rect2);
        rect.left = 0;
        rect.top = (getHeight() - rect2.height()) / 2;
        rect.right = rect.left + rect2.width();
        rect.bottom = rect.top + rect2.height();
        return rect;
    }

    /* renamed from: b */
    public final void mo153687b() {
        if (!isInEditMode()) {
            this.f319039r = (float) C76577a.m92151b(getContext(), 16);
            this.f319038q = (float) C76577a.m92151b(getContext(), 16);
            this.f319040s = (float) C76577a.m92151b(getContext(), 16);
            this.f319034j = C76577a.m92153d(getContext(), C0966R.color.f2930d);
            this.f319035n = C76577a.m92153d(getContext(), C0966R.color.al6);
            this.f319036o = C76577a.m92151b(getContext(), 17);
            this.f319037p = C76577a.m92151b(getContext(), 22);
            this.f319045x = new C106713a(this.f319034j, this.f319035n, 100);
            this.f319046y = new C106713a(this.f319035n, this.f319034j, 100);
            this.f319033i.setAntiAlias(true);
            this.f319033i.setTextAlign(Paint.Align.LEFT);
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            Method method = C107222v.f320820a;
            this.f319041t = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public float getClipPadding() {
        return this.f319040s;
    }

    public int getSelectedColor() {
        return this.f319035n;
    }

    public int getTextColor() {
        return this.f319034j;
    }

    public float getTextSize() {
        return this.f319033i.getTextSize();
    }

    public float getTitlePadding() {
        return this.f319038q;
    }

    public float getTopPadding() {
        return this.f319039r;
    }

    public Typeface getTypeface() {
        return this.f319033i.getTypeface();
    }

    public void onDraw(Canvas canvas) {
        int count;
        int i;
        Rect rect;
        CustomViewPager customViewPager;
        super.onDraw(canvas);
        if (this.mViewPager != null && (count = getCount()) != 0) {
            if (this.f319029e == -1 && (customViewPager = this.mViewPager) != null) {
                this.f319029e = customViewPager.getCurrentItem();
            }
            int left = getLeft();
            int width = getWidth() + left;
            int i2 = this.f319029e;
            float f = this.f319030f;
            if (((double) f) > 0.5d) {
                i2++;
                f = 1.0f - f;
            }
            Paint paint = this.f319033i;
            ArrayList arrayList = new ArrayList();
            int width2 = getWidth();
            getHeight();
            int i3 = width2 / 2;
            int i4 = 0;
            for (int count2 = getCount(); i4 < count2; count2 = count2) {
                if (i2 == i4) {
                    int i5 = this.f319037p;
                    paint.setTextSize(((float) i5) - (((float) (i5 - this.f319036o)) * f));
                    rect = mo153686a(i4, paint);
                } else {
                    int i6 = this.f319037p;
                    int i7 = this.f319036o;
                    paint.setTextSize(((float) i7) + (((float) (i6 - i7)) * f));
                    rect = mo153686a(i4, paint);
                }
                int i8 = rect.right - rect.left;
                float f2 = (float) i8;
                int clipPadding = (((int) (((float) i3) - (f2 / 2.0f))) - (((int) (((float) this.f319031g) - (this.f319030f * (f2 + getClipPadding())))) / 2)) + (((int) (((float) (i4 - this.f319029e)) * (((float) (width2 - i8)) - getClipPadding()))) / 2);
                rect.left = clipPadding;
                rect.right = clipPadding + i8;
                arrayList.add(rect);
                i4++;
                paint = paint;
            }
            int size = arrayList.size();
            if (this.f319029e >= size) {
                setCurrentItem(size - 1);
                return;
            }
            int i9 = 0;
            while (i9 < count) {
                Rect rect2 = (Rect) arrayList.get(i9);
                int i15 = rect2.left;
                if ((i15 > left && i15 < width) || ((i = rect2.right) > left && i < width)) {
                    boolean z = i9 == i2;
                    CharSequence pageTitle = this.mViewPager.getAdapter().getPageTitle(i9);
                    if (pageTitle == null) {
                        pageTitle = "";
                    }
                    CharSequence charSequence = pageTitle;
                    if (z) {
                        int i16 = this.f319037p;
                        this.f319033i.setTextSize(((float) i16) - (((float) (i16 - this.f319036o)) * f));
                        this.f319033i.setColor(this.f319046y.mo153712a((int) (100.0f * f)));
                    } else {
                        int i17 = this.f319037p;
                        int i18 = this.f319036o;
                        this.f319033i.setTextSize(((float) i18) + (((float) (i17 - i18)) * f));
                        this.f319033i.setColor(this.f319045x.mo153712a((int) (100.0f * f)));
                    }
                    canvas.drawText(charSequence, 0, charSequence.length(), (float) rect2.left, (float) rect2.bottom, this.f319033i);
                }
                i9++;
            }
        }
    }

    public void onPageScrollStateChanged(int i) {
        this.f319032h = i;
        ViewPager.OnPageChangeListener onPageChangeListener = this.f319028d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        Log.m105925i("MicroMsg.TitlePageIndicator", "onPageScrolled %s, %s, %s", Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
        this.f319029e = i;
        this.f319030f = f;
        this.f319031g = i2;
        invalidate();
        ViewPager.OnPageChangeListener onPageChangeListener = this.f319028d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        if (this.f319032h == 0) {
            this.f319029e = i;
            invalidate();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f319028d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f319029e = savedState.f319047d;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f319047d = this.f319029e;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        int i2 = 0;
        if (this.mViewPager == null || getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x = motionEvent.getX(motionEvent.findPointerIndex(this.f319043v));
                    float f = x - this.f319042u;
                    if (!this.f319044w && Math.abs(f) > ((float) this.f319041t)) {
                        this.f319044w = true;
                    }
                    if (this.f319044w) {
                        this.f319042u = x;
                        if (this.mViewPager.isFakeDragging() || this.mViewPager.beginFakeDrag()) {
                            this.mViewPager.fakeDragBy(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f319042u = motionEvent.getX(actionIndex);
                        this.f319043v = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex2) == this.f319043v) {
                            if (actionIndex2 == 0) {
                                i2 = 1;
                            }
                            this.f319043v = motionEvent.getPointerId(i2);
                        }
                        this.f319042u = motionEvent.getX(motionEvent.findPointerIndex(this.f319043v));
                    }
                }
            }
            if (!this.f319044w) {
                int count = getCount();
                float width = (float) getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                float f4 = f2 - f3;
                float f5 = f2 + f3;
                float x2 = motionEvent.getX();
                if (x2 < f4) {
                    int i3 = this.f319029e;
                    if (i3 > 0) {
                        if (action != 3) {
                            this.mViewPager.setCurrentItem(i3 - 1);
                        }
                        return true;
                    }
                } else if (x2 > f5 && (i = this.f319029e) < count - 1) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(i + 1);
                    }
                    return true;
                }
            }
            this.f319044w = false;
            this.f319043v = -1;
            if (this.mViewPager.isFakeDragging()) {
                this.mViewPager.endFakeDrag();
            }
        } else {
            this.f319043v = motionEvent.getPointerId(0);
            this.f319042u = motionEvent.getX();
        }
        return true;
    }

    public void setCurrentItem(int i) {
        CustomViewPager customViewPager = this.mViewPager;
        if (customViewPager != null) {
            customViewPager.setCurrentItem(i);
            this.f319029e = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f319028d = onPageChangeListener;
    }

    public void setSelectedBold(boolean z) {
        invalidate();
    }

    public void setSelectedColor(int i) {
        this.f319035n = i;
        invalidate();
    }

    public void setTextColor(int i) {
        this.f319033i.setColor(i);
        this.f319034j = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f319033i.setTextSize(f);
        invalidate();
    }

    public void setTitlePadding(float f) {
        this.f319038q = f;
        invalidate();
    }

    public void setTopPadding(float f) {
        this.f319039r = f;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.f319033i.setTypeface(typeface);
        invalidate();
    }

    public void setViewPager(CustomViewPager customViewPager) {
        CustomViewPager customViewPager2 = this.mViewPager;
        if (customViewPager2 != customViewPager) {
            if (customViewPager2 != null) {
                customViewPager2.setOnPageChangeListener((ViewPager.OnPageChangeListener) null);
            }
            if (customViewPager.getAdapter() != null) {
                this.mViewPager = customViewPager;
                customViewPager.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        this.f319042u = -1.0f;
        this.f319043v = -1;
        mo153687b();
    }
}
