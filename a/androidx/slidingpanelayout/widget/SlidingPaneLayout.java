package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import j20.C117292a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p1108f3.C107453d;
import p385u2.C111105a;
import p849e3.C107166a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p905j3.C108547c;

public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: d */
    public int f306562d;

    /* renamed from: e */
    public int f306563e;

    /* renamed from: f */
    public Drawable f306564f;

    /* renamed from: g */
    public Drawable f306565g;

    /* renamed from: h */
    public final int f306566h;

    /* renamed from: i */
    public boolean f306567i;

    /* renamed from: j */
    public View f306568j;

    /* renamed from: n */
    public float f306569n;

    /* renamed from: o */
    public float f306570o;

    /* renamed from: p */
    public int f306571p;

    /* renamed from: q */
    public boolean f306572q;

    /* renamed from: r */
    public int f306573r;

    /* renamed from: s */
    public float f306574s;

    /* renamed from: t */
    public float f306575t;

    /* renamed from: u */
    public final C108547c f306576u;

    /* renamed from: v */
    public boolean f306577v;

    /* renamed from: w */
    public boolean f306578w;

    /* renamed from: x */
    public final Rect f306579x;

    /* renamed from: y */
    public final ArrayList<C103783b> f306580y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C103781a();

        /* renamed from: f */
        public boolean f306586f;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        public static class C103781a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            parcel.writeInt(this.f306586f ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f306586f = parcel.readInt() != 0;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    public class C103782a extends C107166a {

        /* renamed from: e */
        public final Rect f306587e = new Rect();

        public C103782a() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(dVar.f321473a);
            C107453d dVar2 = new C107453d(obtain);
            super.onInitializeAccessibilityNodeInfo(view, dVar2);
            Rect rect = this.f306587e;
            dVar2.mo157842d(rect);
            dVar.mo157849i(rect);
            obtain.getBoundsInScreen(rect);
            dVar.mo157850j(rect);
            dVar.f321473a.setVisibleToUser(obtain.isVisibleToUser());
            dVar.f321473a.setPackageName(obtain.getPackageName());
            dVar.mo157852l(obtain.getClassName());
            dVar.mo157854n(obtain.getContentDescription());
            dVar.mo157855o(obtain.isEnabled());
            dVar.f321473a.setClickable(obtain.isClickable());
            dVar.mo157856p(obtain.isFocusable());
            dVar.f321473a.setFocused(obtain.isFocused());
            dVar.mo157846g(obtain.isAccessibilityFocused());
            dVar.f321473a.setSelected(obtain.isSelected());
            dVar.f321473a.setLongClickable(obtain.isLongClickable());
            dVar.mo157839a(obtain.getActions());
            dVar.f321473a.setMovementGranularities(obtain.getMovementGranularities());
            obtain.recycle();
            dVar.mo157852l(SlidingPaneLayout.class.getName());
            dVar.f321475c = -1;
            dVar.f321473a.setSource(view);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            ViewParent f = C107207u.C107208b.m145178f(view);
            if (f instanceof View) {
                dVar.f321474b = -1;
                dVar.f321473a.setParent((View) f);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!SlidingPaneLayout.this.mo145154b(childAt) && childAt.getVisibility() == 0) {
                    C107207u.C107208b.m145191s(childAt, 1);
                    dVar.f321473a.addChild(childAt);
                }
            }
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!SlidingPaneLayout.this.mo145154b(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    public class C103783b implements Runnable {

        /* renamed from: d */
        public final View f306589d;

        public C103783b(View view) {
            this.f306589d = view;
        }

        public void run() {
            if (this.f306589d.getParent() == SlidingPaneLayout.this) {
                this.f306589d.setLayerType(0, (Paint) null);
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                View view = this.f306589d;
                slidingPaneLayout.getClass();
                Paint paint = ((LayoutParams) view.getLayoutParams()).f306585d;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107209c.m145200i(view, paint);
            }
            SlidingPaneLayout.this.f306580y.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    public class C103784c extends C108547c.C108549c {
        public C103784c() {
        }

        /* renamed from: a */
        public int mo96788a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f306568j.getLayoutParams();
            if (SlidingPaneLayout.this.mo145155c()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.f306568j.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f306571p);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f306571p + paddingLeft);
        }

        /* renamed from: b */
        public int mo96789b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: c */
        public int mo145103c(View view) {
            return SlidingPaneLayout.this.f306571p;
        }

        /* renamed from: e */
        public void mo145104e(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f306576u.mo159415c(slidingPaneLayout.f306568j, i2);
        }

        /* renamed from: g */
        public void mo145106g(View view, int i) {
            SlidingPaneLayout.this.mo145161e();
        }

        /* renamed from: h */
        public void mo143325h(int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f306576u.f324911a != 0) {
                return;
            }
            if (slidingPaneLayout.f306569n == 0.0f) {
                slidingPaneLayout.mo145163g(slidingPaneLayout.f306568j);
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                View view = slidingPaneLayout2.f306568j;
                slidingPaneLayout2.getClass();
                slidingPaneLayout2.sendAccessibilityEvent(32);
                SlidingPaneLayout.this.f306577v = false;
                return;
            }
            View view2 = slidingPaneLayout.f306568j;
            slidingPaneLayout.getClass();
            slidingPaneLayout.sendAccessibilityEvent(32);
            SlidingPaneLayout.this.f306577v = true;
        }

        /* renamed from: i */
        public void mo96791i(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f306568j == null) {
                slidingPaneLayout.f306569n = 0.0f;
            } else {
                boolean c = slidingPaneLayout.mo145155c();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f306568j.getLayoutParams();
                int width = slidingPaneLayout.f306568j.getWidth();
                if (c) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                float paddingRight = ((float) (i - ((c ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (c ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) slidingPaneLayout.f306571p);
                slidingPaneLayout.f306569n = paddingRight;
                if (slidingPaneLayout.f306573r != 0) {
                    slidingPaneLayout.mo145158d(paddingRight);
                }
                if (layoutParams.f306584c) {
                    slidingPaneLayout.mo145153a(slidingPaneLayout.f306568j, slidingPaneLayout.f306569n, slidingPaneLayout.f306562d);
                }
                View view2 = slidingPaneLayout.f306568j;
                slidingPaneLayout.getClass();
            }
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: j */
        public void mo96792j(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.mo145155c()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f306569n > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f306571p;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f306568j.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.f306569n > 0.5f)) {
                    i += SlidingPaneLayout.this.f306571p;
                }
            }
            SlidingPaneLayout.this.f306576u.mo159430s(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: k */
        public boolean mo96793k(View view, int i) {
            if (SlidingPaneLayout.this.f306572q) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f306583b;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public interface C103785d {
        /* renamed from: i */
        void mo145194i(View view, float f);

        /* renamed from: j */
        void mo145195j(View view);

        /* renamed from: k */
        void mo145196k(View view);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo145153a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (layoutParams.f306585d == null) {
                layoutParams.f306585d = new Paint();
            }
            layoutParams.f306585d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f306585d);
            }
            Paint paint = ((LayoutParams) view.getLayoutParams()).f306585d;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107209c.m145200i(view, paint);
        } else if (view.getLayerType() != 0) {
            Paint paint2 = layoutParams.f306585d;
            if (paint2 != null) {
                paint2.setColorFilter((ColorFilter) null);
            }
            C103783b bVar = new C103783b(view);
            this.f306580y.add(bVar);
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            C107207u.C107208b.m145185m(this, bVar);
        }
    }

    /* renamed from: b */
    public boolean mo145154b(View view) {
        if (view == null) {
            return false;
        }
        return this.f306567i && ((LayoutParams) view.getLayoutParams()).f306584c && this.f306569n > 0.0f;
    }

    /* renamed from: c */
    public boolean mo145155c() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return C107207u.C107209c.m145195d(this) == 1;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f306576u.mo159420h(true)) {
            return;
        }
        if (!this.f306567i) {
            this.f306576u.mo159413a();
            return;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145183k(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo145158d(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo145155c()
            android.view.View r1 = r9.f306568j
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f306584c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f306568j
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.f306570o
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f306573r
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f306570o = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.f306570o
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.f306563e
            r9.mo145153a(r4, r5, r6)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.mo145158d(float):void");
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        Drawable drawable = mo145155c() ? this.f306565g : this.f306564f;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo145155c()) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f306567i && !layoutParams.f306583b && this.f306568j != null) {
            canvas.getClipBounds(this.f306579x);
            if (mo145155c()) {
                Rect rect = this.f306579x;
                rect.left = Math.max(rect.left, this.f306568j.getRight());
            } else {
                Rect rect2 = this.f306579x;
                rect2.right = Math.min(rect2.right, this.f306568j.getLeft());
            }
            canvas.clipRect(this.f306579x);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    public void mo145161e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(childAt, aVar.mo10232b(), "androidx/slidingpanelayout/widget/SlidingPaneLayout", "setAllChildrenVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(childAt, "androidx/slidingpanelayout/widget/SlidingPaneLayout", "setAllChildrenVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: f */
    public boolean mo145162f(float f, int i) {
        int i2;
        if (!this.f306567i) {
            return false;
        }
        boolean c = mo145155c();
        LayoutParams layoutParams = (LayoutParams) this.f306568j.getLayoutParams();
        if (c) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f306571p))) + ((float) this.f306568j.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f306571p)));
        }
        C108547c cVar = this.f306576u;
        View view = this.f306568j;
        if (!cVar.mo159432u(view, i2, view.getTop())) {
            return false;
        }
        mo145161e();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145183k(this);
        return true;
    }

    /* renamed from: g */
    public void mo145163g(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z;
        View view2 = view;
        boolean c = mo145155c();
        int width = c ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = c ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 < childCount && (childAt = getChildAt(i5)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z = c;
                } else {
                    z = c;
                    int i6 = (Math.max(c ? paddingLeft : width, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(c ? width : paddingLeft, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i6));
                    View view3 = childAt;
                    C117292a.m165358d(childAt, aVar.mo10232b(), "androidx/slidingpanelayout/widget/SlidingPaneLayout", "updateObscuredViewsVisibility", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "androidx/slidingpanelayout/widget/SlidingPaneLayout", "updateObscuredViewsVisibility", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                i5++;
                view2 = view;
                c = z;
            } else {
                return;
            }
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f306563e;
    }

    public int getParallaxDistance() {
        return this.f306573r;
    }

    public int getSliderFadeColor() {
        return this.f306562d;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f306578w = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f306578w = true;
        int size = this.f306580y.size();
        for (int i = 0; i < size; i++) {
            this.f306580y.get(i).run();
        }
        this.f306580y.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f306567i && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f306577v = !this.f306576u.mo159423l(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f306567i || (this.f306572q && actionMasked != 0)) {
            this.f306576u.mo159414b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f306576u.mo159414b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f306572q = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f306574s = x;
                this.f306575t = y;
                if (this.f306576u.mo159423l(this.f306568j, (int) x, (int) y) && mo145154b(this.f306568j)) {
                    z = true;
                    return this.f306576u.mo159431t(motionEvent) || z;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f306574s);
                float abs2 = Math.abs(y2 - this.f306575t);
                C108547c cVar = this.f306576u;
                if (abs > ((float) cVar.f324912b) && abs2 > abs) {
                    cVar.mo159414b();
                    this.f306572q = true;
                    return false;
                }
            }
            z = false;
            if (this.f306576u.mo159431t(motionEvent)) {
                return true;
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean c = mo145155c();
        if (c) {
            this.f306576u.f324926p = 2;
        } else {
            this.f306576u.f324926p = 1;
        }
        int i9 = i3 - i;
        int paddingRight = c ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = c ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f306578w) {
            this.f306569n = (!this.f306567i || !this.f306577v) ? 0.0f : 1.0f;
        }
        int i15 = paddingRight;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f306583b) {
                    int i17 = i9 - paddingLeft;
                    int min = (Math.min(paddingRight, i17 - this.f306566h) - i15) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f306571p = min;
                    int i18 = c ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f306584c = ((i15 + i18) + min) + (measuredWidth / 2) > i17;
                    int i19 = (int) (((float) min) * this.f306569n);
                    i15 += i18 + i19;
                    this.f306569n = ((float) i19) / ((float) min);
                    i5 = 0;
                } else if (!this.f306567i || (i8 = this.f306573r) == 0) {
                    i15 = paddingRight;
                    i5 = 0;
                } else {
                    i5 = (int) ((1.0f - this.f306569n) * ((float) i8));
                    i15 = paddingRight;
                }
                if (c) {
                    i6 = (i9 - i15) + i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i7 = i15 - i5;
                    i6 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.f306578w) {
            if (this.f306567i) {
                if (this.f306573r != 0) {
                    mo145158d(this.f306569n);
                }
                if (((LayoutParams) this.f306568j.getLayoutParams()).f306584c) {
                    mo145153a(this.f306568j, this.f306569n, this.f306562d);
                }
            } else {
                for (int i25 = 0; i25 < childCount; i25++) {
                    mo145153a(getChildAt(i25), 0.0f, this.f306562d);
                }
            }
            mo145163g(this.f306568j);
        }
        this.f306578w = false;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        int i15;
        int i16;
        int i17;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f306568j = null;
        int i18 = paddingLeft;
        int i19 = 0;
        boolean z2 = false;
        float f2 = 0.0f;
        while (true) {
            i5 = 8;
            if (i19 >= childCount) {
                break;
            }
            View childAt = getChildAt(i19);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f306584c = z;
            } else {
                float f3 = layoutParams.f306582a;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (layoutParams.width == 0) {
                    }
                }
                int i25 = layoutParams.leftMargin + layoutParams.rightMargin;
                int i26 = layoutParams.width;
                if (i26 == -2) {
                    i15 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i25, Integer.MIN_VALUE);
                    f = f2;
                    i16 = Integer.MIN_VALUE;
                } else {
                    f = f2;
                    i16 = Integer.MIN_VALUE;
                    i15 = i26 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingLeft - i25, 1073741824) : View.MeasureSpec.makeMeasureSpec(i26, 1073741824);
                }
                int i27 = layoutParams.height;
                if (i27 == -2) {
                    i17 = View.MeasureSpec.makeMeasureSpec(i3, i16);
                } else {
                    i17 = i27 == -1 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : View.MeasureSpec.makeMeasureSpec(i27, 1073741824);
                }
                childAt.measure(i15, i17);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i16 && measuredHeight > i4) {
                    i4 = Math.min(measuredHeight, i3);
                }
                i18 -= measuredWidth;
                boolean z3 = i18 < 0;
                layoutParams.f306583b = z3;
                z2 |= z3;
                if (z3) {
                    this.f306568j = childAt;
                }
                f2 = f;
            }
            i19++;
            z = false;
        }
        if (z2 || f2 > 0.0f) {
            int i28 = paddingLeft - this.f306566h;
            int i29 = 0;
            while (i29 < childCount) {
                View childAt2 = getChildAt(i29);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        boolean z4 = layoutParams2.width == 0 && layoutParams2.f306582a > 0.0f;
                        int measuredWidth2 = z4 ? 0 : childAt2.getMeasuredWidth();
                        if (!z2 || childAt2 == this.f306568j) {
                            if (layoutParams2.f306582a > 0.0f) {
                                if (layoutParams2.width == 0) {
                                    int i35 = layoutParams2.height;
                                    i7 = i35 == -2 ? View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE) : i35 == -1 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : View.MeasureSpec.makeMeasureSpec(i35, 1073741824);
                                } else {
                                    i7 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z2) {
                                    int i36 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i6 = i28;
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i36, 1073741824);
                                    if (measuredWidth2 != i36) {
                                        childAt2.measure(makeMeasureSpec, i7);
                                    }
                                    i29++;
                                    i28 = i6;
                                    i5 = 8;
                                } else {
                                    i6 = i28;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2 + ((int) ((layoutParams2.f306582a * ((float) Math.max(0, i18))) / f2)), 1073741824), i7);
                                    i29++;
                                    i28 = i6;
                                    i5 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (measuredWidth2 > i28 || layoutParams2.f306582a > 0.0f)) {
                            if (z4) {
                                int i37 = layoutParams2.height;
                                if (i37 == -2) {
                                    i9 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    i8 = 1073741824;
                                } else if (i37 == -1) {
                                    i8 = 1073741824;
                                    i9 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i8 = 1073741824;
                                    i9 = View.MeasureSpec.makeMeasureSpec(i37, 1073741824);
                                }
                            } else {
                                i8 = 1073741824;
                                i9 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i28, i8), i9);
                        }
                    }
                }
                i6 = i28;
                i29++;
                i28 = i6;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, i4 + getPaddingTop() + getPaddingBottom());
        this.f306567i = z2;
        C108547c cVar = this.f306576u;
        if (cVar.f324911a != 0 && !z2) {
            cVar.mo159413a();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f306434d);
        if (savedState.f306586f) {
            if (this.f306578w || mo145162f(1.0f, 0)) {
                this.f306577v = true;
            }
        } else if (this.f306578w || mo145162f(0.0f, 0)) {
            this.f306577v = false;
        }
        this.f306577v = savedState.f306586f;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        boolean z = this.f306567i;
        savedState.f306586f = z ? !z || this.f306569n == 1.0f : this.f306577v;
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f306578w = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f306567i) {
            return super.onTouchEvent(motionEvent);
        }
        this.f306576u.mo159424m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f306574s = x;
            this.f306575t = y;
        } else if (actionMasked == 1 && mo145154b(this.f306568j)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f306574s;
            float f2 = y2 - this.f306575t;
            C108547c cVar = this.f306576u;
            int i = cVar.f324912b;
            if ((f * f) + (f2 * f2) < ((float) (i * i)) && cVar.mo159423l(this.f306568j, (int) x2, (int) y2) && (this.f306578w || mo145162f(0.0f, 0))) {
                this.f306577v = false;
            }
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f306567i) {
            this.f306577v = view == this.f306568j;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f306563e = i;
    }

    public void setPanelSlideListener(C103785d dVar) {
    }

    public void setParallaxDistance(int i) {
        this.f306573r = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f306564f = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f306565g = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        Context context = getContext();
        Object obj = C111105a.f332697a;
        setShadowDrawableLeft(C111105a.C111110c.m151511b(context, i));
    }

    public void setShadowResourceRight(int i) {
        Context context = getContext();
        Object obj = C111105a.f332697a;
        setShadowDrawableRight(C111105a.C111110c.m151511b(context, i));
    }

    public void setSliderFadeColor(int i) {
        this.f306562d = i;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        public static final int[] f306581e = {16843137};

        /* renamed from: a */
        public float f306582a = 0.0f;

        /* renamed from: b */
        public boolean f306583b;

        /* renamed from: c */
        public boolean f306584c;

        /* renamed from: d */
        public Paint f306585d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f306581e);
            this.f306582a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f306562d = -858993460;
        this.f306578w = true;
        this.f306579x = new Rect();
        this.f306580y = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f306566h = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C107207u.m145168i(this, new C103782a());
        C107207u.C107208b.m145191s(this, 1);
        C108547c i2 = C108547c.m147111i(this, 0.5f, new C103784c());
        this.f306576u = i2;
        i2.f324924n = f * 400.0f;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
