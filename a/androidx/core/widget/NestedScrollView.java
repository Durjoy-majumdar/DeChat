package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.widget.C103726d;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p1108f3.C107453d;
import p834a3.C103297a;
import p849e3.C107166a;
import p849e3.C107168a0;
import p849e3.C107198j;
import p849e3.C107200l;
import p849e3.C107202n;
import p849e3.C107203p;
import p849e3.C107206t;
import p849e3.C107207u;

public class NestedScrollView extends FrameLayout implements C107202n, C107198j, C107206t {

    /* renamed from: G */
    public static final C103721a f306363G = new C103721a();

    /* renamed from: H */
    public static final int[] f306364H = {16843130};

    /* renamed from: A */
    public int f306365A;

    /* renamed from: B */
    public SavedState f306366B;

    /* renamed from: C */
    public final C107203p f306367C;

    /* renamed from: D */
    public final C107200l f306368D;

    /* renamed from: E */
    public float f306369E;

    /* renamed from: F */
    public C67086b f306370F;

    /* renamed from: d */
    public long f306371d;

    /* renamed from: e */
    public final Rect f306372e;

    /* renamed from: f */
    public OverScroller f306373f;

    /* renamed from: g */
    public EdgeEffect f306374g;

    /* renamed from: h */
    public EdgeEffect f306375h;

    /* renamed from: i */
    public int f306376i;

    /* renamed from: j */
    public boolean f306377j;

    /* renamed from: n */
    public boolean f306378n;

    /* renamed from: o */
    public View f306379o;

    /* renamed from: p */
    public boolean f306380p;

    /* renamed from: q */
    public VelocityTracker f306381q;

    /* renamed from: r */
    public boolean f306382r;

    /* renamed from: s */
    public boolean f306383s;

    /* renamed from: t */
    public int f306384t;

    /* renamed from: u */
    public int f306385u;

    /* renamed from: v */
    public int f306386v;

    /* renamed from: w */
    public int f306387w;

    /* renamed from: x */
    public final int[] f306388x;

    /* renamed from: y */
    public final int[] f306389y;

    /* renamed from: z */
    public int f306390z;

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C67086b {
        /* renamed from: a */
        void mo91164a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C103720a();

        /* renamed from: d */
        public int f306391d;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        public class C103720a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f306391d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f306391d);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f306391d = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C103721a extends C107166a {
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.mo157852l(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                dVar.mo157863v(true);
                if (nestedScrollView.getScrollY() > 0) {
                    dVar.mo157840b(C107453d.C107454a.f321484k);
                    dVar.mo157840b(C107453d.C107454a.f321485l);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    dVar.mo157840b(C107453d.C107454a.f321483j);
                    dVar.mo157840b(C107453d.C107454a.f321487n);
                }
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo145003q(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo145003q(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2899x9);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f306369E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f306369E = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f306369E;
    }

    /* renamed from: h */
    public static boolean m138057h(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m138057h((View) parent, view2);
    }

    /* renamed from: L */
    public void mo17026L(int i) {
        this.f306368D.mo157674k(i);
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: a */
    public boolean mo144949a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !mo144978k(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            mo144954c(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f306372e);
            offsetDescendantRectToMyCoords(findNextFocus, this.f306372e);
            mo144954c(mo133149b(this.f306372e));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!mo144978k(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public int mo133149b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: c */
    public final void mo144954c(int i) {
        if (i == 0) {
            return;
        }
        if (this.f306383s) {
            mo145003q(0, i, 250, false);
        } else {
            scrollBy(0, i);
        }
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f306373f.isFinished()) {
            this.f306373f.computeScrollOffset();
            int currY = this.f306373f.getCurrY();
            int i = currY - this.f306365A;
            this.f306365A = currY;
            int[] iArr = this.f306389y;
            boolean z = false;
            iArr[1] = 0;
            this.f306368D.mo157667d(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f306389y[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo144983o(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f306389y;
                iArr2[1] = 0;
                this.f306368D.mo157669f(0, scrollY2, 0, i3, this.f306388x, 1, iArr2);
                i2 = i3 - this.f306389y[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i2 < 0) {
                        if (this.f306374g.isFinished()) {
                            this.f306374g.onAbsorb((int) this.f306373f.getCurrVelocity());
                        }
                    } else if (this.f306375h.isFinished()) {
                        this.f306375h.onAbsorb((int) this.f306373f.getCurrVelocity());
                    }
                }
                this.f306373f.abortAnimation();
                mo17026L(1);
            }
            if (!this.f306373f.isFinished()) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145183k(this);
                return;
            }
            mo17026L(1);
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo144962d(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f306372e
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fc
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00ed
            r4 = 20
            if (r0 == r4) goto L_0x00dd
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fc
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r5 = 130(0x82, float:1.82E-43)
        L_0x0085:
            if (r5 != r3) goto L_0x0089
            r7 = 1
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00c1
            android.graphics.Rect r7 = r6.f306372e
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d2
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r7 = r7 + r1
            android.graphics.Rect r1 = r6.f306372e
            int r3 = r1.top
            int r3 = r3 + r0
            if (r3 <= r7) goto L_0x00d2
            int r7 = r7 - r0
            r1.top = r7
            goto L_0x00d2
        L_0x00c1:
            android.graphics.Rect r7 = r6.f306372e
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f306372e
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d2
            r7.top = r2
        L_0x00d2:
            android.graphics.Rect r7 = r6.f306372e
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.mo145002p(r5, r1, r0)
            goto L_0x00fc
        L_0x00dd:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e8
            boolean r2 = r6.mo144949a(r3)
            goto L_0x00fc
        L_0x00e8:
            boolean r2 = r6.mo144970f(r3)
            goto L_0x00fc
        L_0x00ed:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f8
            boolean r2 = r6.mo144949a(r5)
            goto L_0x00fc
        L_0x00f8:
            boolean r2 = r6.mo144970f(r5)
        L_0x00fc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo144962d(android.view.KeyEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo144962d(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f306368D.mo157664a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f306368D.mo157665b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f306368D.mo157667d(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f306368D.mo157668e(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f306374g.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f306374g.setSize(width, height);
            if (this.f306374g.draw(canvas)) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145183k(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f306375h.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f306375h.setSize(width2, height2);
            if (this.f306375h.draw(canvas)) {
                WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                C107207u.C107208b.m145183k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: e */
    public void mo144969e(int i) {
        if (getChildCount() > 0) {
            this.f306373f.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            mo145004r(2, 1);
            this.f306365A = getScrollY();
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    /* renamed from: f */
    public boolean mo144970f(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f306372e;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f306372e.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f306372e;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f306372e;
        return mo145002p(i, rect3.top, rect3.bottom);
    }

    /* renamed from: g */
    public void mo77725g(View view, View view2, int i, int i2) {
        this.f306367C.mo157675a(view, view2, i, i2);
        mo145004r(2, i2);
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        C107203p pVar = this.f306367C;
        return pVar.f320806b | pVar.f320805a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return this.f306368D.mo157671h(0);
    }

    /* renamed from: i */
    public void mo77718i(View view, int i) {
        this.f306367C.mo157676b(view, i);
        mo17026L(i);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f306368D.f320803d;
    }

    /* renamed from: j */
    public void mo77727j(View view, int i, int i2, int i3, int i4, int i5) {
        mo144979l(i4, i5, (int[]) null);
    }

    /* renamed from: k */
    public final boolean mo144978k(View view, int i, int i2) {
        view.getDrawingRect(this.f306372e);
        offsetDescendantRectToMyCoords(view, this.f306372e);
        return this.f306372e.bottom + i >= getScrollY() && this.f306372e.top - i <= getScrollY() + i2;
    }

    /* renamed from: l */
    public final void mo144979l(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f306368D.mo157669f(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: m */
    public final void mo144980m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f306387w) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f306376i = (int) motionEvent.getY(i);
            this.f306387w = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f306381q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo77719n(View view, int i, int i2, int[] iArr, int i3) {
        this.f306368D.mo157667d(i, i2, iArr, (int[]) null, i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo144983o(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 1
            r5 = 0
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r4) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r4) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x004f
            r3 = r2
            goto L_0x0052
        L_0x004f:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
        L_0x0052:
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x0059
            r6 = r1
            goto L_0x005c
        L_0x0059:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
        L_0x005c:
            r1 = 1
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x0080
            e3.l r7 = r0.f306368D
            boolean r7 = r7.mo157671h(r4)
            if (r7 != 0) goto L_0x0080
            android.widget.OverScroller r7 = r0.f306373f
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x0080:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0089
            if (r1 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo144983o(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f306378n = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f306380p) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r12.f306380p
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0099
            r5 = -1
            if (r0 == r1) goto L_0x006b
            if (r0 == r2) goto L_0x0025
            r1 = 3
            if (r0 == r1) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0020
            goto L_0x0121
        L_0x0020:
            r12.mo144980m(r13)
            goto L_0x0121
        L_0x0025:
            int r0 = r12.f306387w
            if (r0 != r5) goto L_0x002b
            goto L_0x0121
        L_0x002b:
            int r0 = r13.findPointerIndex(r0)
            if (r0 != r5) goto L_0x0033
            goto L_0x0121
        L_0x0033:
            float r0 = r13.getY(r0)
            int r0 = (int) r0
            int r3 = r12.f306376i
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.f306384t
            if (r3 <= r5) goto L_0x0121
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L_0x0121
            r12.f306380p = r1
            r12.f306376i = r0
            android.view.VelocityTracker r0 = r12.f306381q
            if (r0 != 0) goto L_0x0059
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f306381q = r0
        L_0x0059:
            android.view.VelocityTracker r0 = r12.f306381q
            r0.addMovement(r13)
            r12.f306390z = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x0121
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0121
        L_0x006b:
            r12.f306380p = r4
            r12.f306387w = r5
            android.view.VelocityTracker r13 = r12.f306381q
            if (r13 == 0) goto L_0x0078
            r13.recycle()
            r12.f306381q = r3
        L_0x0078:
            android.widget.OverScroller r5 = r12.f306373f
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x0094
            java.util.WeakHashMap<android.view.View, e3.a0> r13 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107208b.m145183k(r12)
        L_0x0094:
            r12.mo17026L(r4)
            goto L_0x0121
        L_0x0099:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x00cd
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r4)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L_0x00cd
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L_0x00cd
            int r6 = r7.getLeft()
            if (r5 < r6) goto L_0x00cd
            int r6 = r7.getRight()
            if (r5 >= r6) goto L_0x00cd
            r5 = 1
            goto L_0x00ce
        L_0x00cd:
            r5 = 0
        L_0x00ce:
            if (r5 != 0) goto L_0x00ec
            boolean r13 = r12.mo145009s(r13)
            if (r13 != 0) goto L_0x00e0
            android.widget.OverScroller r13 = r12.f306373f
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r1 = 0
        L_0x00e0:
            r12.f306380p = r1
            android.view.VelocityTracker r13 = r12.f306381q
            if (r13 == 0) goto L_0x0121
            r13.recycle()
            r12.f306381q = r3
            goto L_0x0121
        L_0x00ec:
            r12.f306376i = r0
            int r0 = r13.getPointerId(r4)
            r12.f306387w = r0
            android.view.VelocityTracker r0 = r12.f306381q
            if (r0 != 0) goto L_0x00ff
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f306381q = r0
            goto L_0x0102
        L_0x00ff:
            r0.clear()
        L_0x0102:
            android.view.VelocityTracker r0 = r12.f306381q
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.f306373f
            r0.computeScrollOffset()
            boolean r13 = r12.mo145009s(r13)
            if (r13 != 0) goto L_0x011c
            android.widget.OverScroller r13 = r12.f306373f
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            r12.f306380p = r1
            r12.mo145004r(r2, r4)
        L_0x0121:
            boolean r13 = r12.f306380p
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.f306377j = false;
        View view = this.f306379o;
        if (view != null && m138057h(view, this)) {
            View view2 = this.f306379o;
            view2.getDrawingRect(this.f306372e);
            offsetDescendantRectToMyCoords(view2, this.f306372e);
            int b = mo133149b(this.f306372e);
            if (b != 0) {
                scrollBy(0, b);
            }
        }
        this.f306379o = null;
        if (!this.f306378n) {
            if (this.f306366B != null) {
                scrollTo(getScrollX(), this.f306366B.f306391d);
                this.f306366B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f306378n = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f306382r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo144969e((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo77719n(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo144979l(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo77725g(view, view2, i, 0);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !(true ^ mo144978k(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f306366B = savedState;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f306391d = getScrollY();
        return savedState;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C67086b bVar = this.f306370F;
        if (bVar != null) {
            bVar.mo91164a(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && mo144978k(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f306372e);
            offsetDescendantRectToMyCoords(findFocus, this.f306372e);
            mo144954c(mo133149b(this.f306372e));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo77716Z(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo77718i(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            android.view.VelocityTracker r0 = r10.f306381q
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r10.f306381q = r0
        L_0x000e:
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0017
            r10.f306390z = r12
        L_0x0017:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f306390z
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x02c8
            r3 = -1
            r4 = 0
            if (r0 == r14) goto L_0x0241
            if (r0 == r1) goto L_0x00a1
            r1 = 3
            if (r0 == r1) goto L_0x005c
            r1 = 5
            if (r0 == r1) goto L_0x0049
            r1 = 6
            if (r0 == r1) goto L_0x0037
            goto L_0x02fc
        L_0x0037:
            r23.mo144980m(r24)
            int r0 = r10.f306387w
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f306376i = r0
            goto L_0x02fc
        L_0x0049:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f306376i = r1
            int r0 = r11.getPointerId(r0)
            r10.f306387w = r0
            goto L_0x02fc
        L_0x005c:
            boolean r0 = r10.f306380p
            if (r0 == 0) goto L_0x0085
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x0085
            android.widget.OverScroller r15 = r10.f306373f
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x0085
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107208b.m145183k(r23)
        L_0x0085:
            r10.f306387w = r3
            r10.f306380p = r12
            android.view.VelocityTracker r0 = r10.f306381q
            if (r0 == 0) goto L_0x0092
            r0.recycle()
            r10.f306381q = r4
        L_0x0092:
            r10.mo17026L(r12)
            android.widget.EdgeEffect r0 = r10.f306374g
            r0.onRelease()
            android.widget.EdgeEffect r0 = r10.f306375h
            r0.onRelease()
            goto L_0x02fc
        L_0x00a1:
            int r0 = r10.f306387w
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00ab
            goto L_0x02fc
        L_0x00ab:
            float r0 = r11.getY(r15)
            int r0 = (int) r0
            int r1 = r10.f306376i
            int r1 = r1 - r0
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r4 = (float) r1
            int r5 = r23.getHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            android.widget.EdgeEffect r5 = r10.f306374g
            float r5 = androidx.core.widget.C103726d.m138085a(r5)
            r16 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00e9
            android.widget.EdgeEffect r5 = r10.f306374g
            float r4 = -r4
            float r3 = androidx.core.widget.C103726d.m138086d(r5, r4, r3)
            float r3 = -r3
            android.widget.EdgeEffect r4 = r10.f306374g
            float r4 = androidx.core.widget.C103726d.m138085a(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00e7
            android.widget.EdgeEffect r2 = r10.f306374g
            r2.onRelease()
        L_0x00e7:
            r2 = r3
            goto L_0x010b
        L_0x00e9:
            android.widget.EdgeEffect r5 = r10.f306375h
            float r5 = androidx.core.widget.C103726d.m138085a(r5)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x010b
            android.widget.EdgeEffect r5 = r10.f306375h
            float r3 = r16 - r3
            float r3 = androidx.core.widget.C103726d.m138086d(r5, r4, r3)
            android.widget.EdgeEffect r4 = r10.f306375h
            float r4 = androidx.core.widget.C103726d.m138085a(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00e7
            android.widget.EdgeEffect r2 = r10.f306375h
            r2.onRelease()
            goto L_0x00e7
        L_0x010b:
            int r3 = r23.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            if (r2 == 0) goto L_0x011b
            r23.invalidate()
        L_0x011b:
            int r1 = r1 - r2
            boolean r2 = r10.f306380p
            if (r2 != 0) goto L_0x013c
            int r2 = java.lang.Math.abs(r1)
            int r3 = r10.f306384t
            if (r2 <= r3) goto L_0x013c
            android.view.ViewParent r2 = r23.getParent()
            if (r2 == 0) goto L_0x0131
            r2.requestDisallowInterceptTouchEvent(r14)
        L_0x0131:
            r10.f306380p = r14
            if (r1 <= 0) goto L_0x0139
            int r2 = r10.f306384t
            int r1 = r1 - r2
            goto L_0x013c
        L_0x0139:
            int r2 = r10.f306384t
            int r1 = r1 + r2
        L_0x013c:
            boolean r2 = r10.f306380p
            if (r2 == 0) goto L_0x02fc
            r3 = 0
            int[] r5 = r10.f306389y
            int[] r6 = r10.f306388x
            r7 = 0
            e3.l r2 = r10.f306368D
            r4 = r1
            boolean r2 = r2.mo157667d(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x015d
            int[] r2 = r10.f306389y
            r2 = r2[r14]
            int r1 = r1 - r2
            int r2 = r10.f306390z
            int[] r3 = r10.f306388x
            r3 = r3[r14]
            int r2 = r2 + r3
            r10.f306390z = r2
        L_0x015d:
            r17 = r1
            int[] r1 = r10.f306388x
            r1 = r1[r14]
            int r0 = r0 - r1
            r10.f306376i = r0
            int r18 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x017c
            if (r0 != r14) goto L_0x0179
            if (r9 <= 0) goto L_0x0179
            goto L_0x017c
        L_0x0179:
            r19 = 0
            goto L_0x017e
        L_0x017c:
            r19 = 1
        L_0x017e:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r20 = 1
            r0 = r23
            r2 = r17
            r6 = r9
            r22 = r9
            r9 = r20
            boolean r0 = r0.mo144983o(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x01a2
            e3.l r0 = r10.f306368D
            boolean r0 = r0.mo157671h(r12)
            if (r0 != 0) goto L_0x01a2
            r0 = 1
            goto L_0x01a3
        L_0x01a2:
            r0 = 0
        L_0x01a3:
            int r1 = r23.getScrollY()
            int r4 = r1 - r18
            int r6 = r17 - r4
            int[] r9 = r10.f306389y
            r9[r14] = r12
            r3 = 0
            r5 = 0
            int[] r7 = r10.f306388x
            r8 = 0
            e3.l r2 = r10.f306368D
            r2.mo157669f(r3, r4, r5, r6, r7, r8, r9)
            int r1 = r10.f306376i
            int[] r2 = r10.f306388x
            r2 = r2[r14]
            int r1 = r1 - r2
            r10.f306376i = r1
            int r1 = r10.f306390z
            int r1 = r1 + r2
            r10.f306390z = r1
            if (r19 == 0) goto L_0x0237
            int[] r1 = r10.f306389y
            r1 = r1[r14]
            int r1 = r17 - r1
            int r2 = r18 + r1
            if (r2 >= 0) goto L_0x01f8
            android.widget.EdgeEffect r2 = r10.f306374g
            int r1 = -r1
            float r1 = (float) r1
            int r3 = r23.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            androidx.core.widget.C103726d.m138086d(r2, r1, r3)
            android.widget.EdgeEffect r1 = r10.f306375h
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x0221
            android.widget.EdgeEffect r1 = r10.f306375h
            r1.onRelease()
            goto L_0x0221
        L_0x01f8:
            r3 = r22
            if (r2 <= r3) goto L_0x0221
            android.widget.EdgeEffect r2 = r10.f306375h
            float r1 = (float) r1
            int r3 = r23.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r3 = r16 - r3
            androidx.core.widget.C103726d.m138086d(r2, r1, r3)
            android.widget.EdgeEffect r1 = r10.f306374g
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x0221
            android.widget.EdgeEffect r1 = r10.f306374g
            r1.onRelease()
        L_0x0221:
            android.widget.EdgeEffect r1 = r10.f306374g
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x0231
            android.widget.EdgeEffect r1 = r10.f306375h
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x0237
        L_0x0231:
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107208b.m145183k(r23)
            goto L_0x0238
        L_0x0237:
            r12 = r0
        L_0x0238:
            if (r12 == 0) goto L_0x02fc
            android.view.VelocityTracker r0 = r10.f306381q
            r0.clear()
            goto L_0x02fc
        L_0x0241:
            android.view.VelocityTracker r0 = r10.f306381q
            r1 = 1000(0x3e8, float:1.401E-42)
            int r5 = r10.f306386v
            float r5 = (float) r5
            r0.computeCurrentVelocity(r1, r5)
            int r1 = r10.f306387w
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r5 = r10.f306385u
            if (r1 < r5) goto L_0x028e
            android.widget.EdgeEffect r1 = r10.f306374g
            float r1 = androidx.core.widget.C103726d.m138085a(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x026a
            android.widget.EdgeEffect r1 = r10.f306374g
            r1.onAbsorb(r0)
            goto L_0x027a
        L_0x026a:
            android.widget.EdgeEffect r1 = r10.f306375h
            float r1 = androidx.core.widget.C103726d.m138085a(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x027c
            android.widget.EdgeEffect r1 = r10.f306375h
            int r5 = -r0
            r1.onAbsorb(r5)
        L_0x027a:
            r1 = 1
            goto L_0x027d
        L_0x027c:
            r1 = 0
        L_0x027d:
            if (r1 != 0) goto L_0x02ad
            int r0 = -r0
            float r1 = (float) r0
            boolean r5 = r10.dispatchNestedPreFling(r2, r1)
            if (r5 != 0) goto L_0x02ad
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo144969e(r0)
            goto L_0x02ad
        L_0x028e:
            android.widget.OverScroller r15 = r10.f306373f
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x02ad
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107208b.m145183k(r23)
        L_0x02ad:
            r10.f306387w = r3
            r10.f306380p = r12
            android.view.VelocityTracker r0 = r10.f306381q
            if (r0 == 0) goto L_0x02ba
            r0.recycle()
            r10.f306381q = r4
        L_0x02ba:
            r10.mo17026L(r12)
            android.widget.EdgeEffect r0 = r10.f306374g
            r0.onRelease()
            android.widget.EdgeEffect r0 = r10.f306375h
            r0.onRelease()
            goto L_0x02fc
        L_0x02c8:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x02cf
            return r12
        L_0x02cf:
            boolean r0 = r10.f306380p
            if (r0 == 0) goto L_0x02dc
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x02dc
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x02dc:
            android.widget.OverScroller r0 = r10.f306373f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x02ec
            android.widget.OverScroller r0 = r10.f306373f
            r0.abortAnimation()
            r10.mo17026L(r14)
        L_0x02ec:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f306376i = r0
            int r0 = r11.getPointerId(r12)
            r10.f306387w = r0
            r10.mo145004r(r1, r12)
        L_0x02fc:
            android.view.VelocityTracker r0 = r10.f306381q
            if (r0 == 0) goto L_0x0303
            r0.addMovement(r13)
        L_0x0303:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final boolean mo145002p(int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z2 = i4 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z4 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            mo144954c(z2 ? i5 - scrollY : i6 - i7);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z;
    }

    /* renamed from: q */
    public final void mo145003q(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f306371d > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f306373f;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                if (z) {
                    mo145004r(2, 1);
                } else {
                    mo17026L(1);
                }
                this.f306365A = getScrollY();
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145183k(this);
            } else {
                if (!this.f306373f.isFinished()) {
                    this.f306373f.abortAnimation();
                    mo17026L(1);
                }
                scrollBy(i, i2);
            }
            this.f306371d = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: r */
    public boolean mo145004r(int i, int i2) {
        return this.f306368D.mo157673j(i, i2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f306377j) {
            view2.getDrawingRect(this.f306372e);
            offsetDescendantRectToMyCoords(view2, this.f306372e);
            int b = mo133149b(this.f306372e);
            if (b != 0) {
                scrollBy(0, b);
            }
        } else {
            this.f306379o = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b = mo133149b(rect);
        boolean z2 = b != 0;
        if (z2) {
            if (z) {
                scrollBy(0, b);
            } else {
                mo145003q(0, b, 250, false);
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f306381q) != null) {
            velocityTracker.recycle();
            this.f306381q = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f306377j = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean mo145009s(MotionEvent motionEvent) {
        boolean z;
        if (C103726d.m138085a(this.f306374g) != 0.0f) {
            C103726d.m138086d(this.f306374g, 0.0f, motionEvent.getY() / ((float) getHeight()));
            z = true;
        } else {
            z = false;
        }
        if (C103726d.m138085a(this.f306375h) == 0.0f) {
            return z;
        }
        C103726d.m138086d(this.f306375h, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
        return true;
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f306382r) {
            this.f306382r = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f306368D.mo157672i(z);
    }

    public void setOnScrollChangeListener(C67086b bVar) {
        this.f306370F = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f306383s = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo145004r(i, 0);
    }

    public void stopNestedScroll() {
        mo17026L(0);
    }

    /* renamed from: v */
    public void mo145018v(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo144979l(i4, i5, iArr);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f306372e = new Rect();
        this.f306377j = true;
        this.f306378n = false;
        this.f306379o = null;
        this.f306380p = false;
        this.f306383s = true;
        this.f306387w = -1;
        this.f306388x = new int[2];
        this.f306389y = new int[2];
        if (C103297a.m136810a()) {
            edgeEffect = C103726d.C103727a.m138090a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f306374g = edgeEffect;
        if (C103297a.m136810a()) {
            edgeEffect2 = C103726d.C103727a.m138090a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f306375h = edgeEffect2;
        this.f306373f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f306384t = viewConfiguration.getScaledTouchSlop();
        this.f306385u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f306386v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f306364H, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f306367C = new C107203p(this);
        this.f306368D = new C107200l(this);
        setNestedScrollingEnabled(true);
        C107207u.m145168i(this, f306363G);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
