package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C103777h0;
import androidx.recyclerview.widget.C16644a;
import androidx.recyclerview.widget.C16653g0;
import androidx.recyclerview.widget.C16661o;
import com.huawei.easygo.sdk.constant.EasyGoCode;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p1108f3.C107453d;
import p329d3.C106985e;
import p400y3.C23223a;
import p834a3.C103302h;
import p849e3.C107166a;
import p849e3.C107168a0;
import p849e3.C107198j;
import p849e3.C107200l;
import p849e3.C107206t;
import p849e3.C107207u;
import p849e3.C107222v;

public class RecyclerView extends ViewGroup implements C107206t, C107198j {

    /* renamed from: r1 */
    public static final int[] f44713r1 = {16843830};

    /* renamed from: s1 */
    public static final int[] f44714s1 = {16842987};

    /* renamed from: t1 */
    public static final boolean f44715t1 = (Build.VERSION.SDK_INT >= 23);

    /* renamed from: u1 */
    public static final boolean f44716u1 = true;

    /* renamed from: v1 */
    public static final boolean f44717v1 = true;

    /* renamed from: w1 */
    public static final Class<?>[] f44718w1;

    /* renamed from: x1 */
    public static final Interpolator f44719x1 = new C16637c();

    /* renamed from: A */
    public int f44720A;

    /* renamed from: B */
    public boolean f44721B;

    /* renamed from: C */
    public boolean f44722C;

    /* renamed from: D */
    public boolean f44723D;

    /* renamed from: E */
    public int f44724E;

    /* renamed from: F */
    public boolean f44725F;

    /* renamed from: G */
    public final AccessibilityManager f44726G;

    /* renamed from: H */
    public List<C16621m> f44727H;

    /* renamed from: I */
    public boolean f44728I;

    /* renamed from: J */
    public boolean f44729J;

    /* renamed from: K */
    public int f44730K;

    /* renamed from: L */
    public int f44731L;

    /* renamed from: M */
    public C16632i f44732M;

    /* renamed from: N */
    public EdgeEffect f44733N;

    /* renamed from: P */
    public EdgeEffect f44734P;

    /* renamed from: Q */
    public EdgeEffect f44735Q;

    /* renamed from: Q0 */
    public int f44736Q0;

    /* renamed from: R */
    public EdgeEffect f44737R;

    /* renamed from: R0 */
    public C16633n f44738R0;

    /* renamed from: S */
    public C16616j f44739S;

    /* renamed from: S0 */
    public final int f44740S0;

    /* renamed from: T */
    public int f44741T;

    /* renamed from: T0 */
    public final int f44742T0;

    /* renamed from: U */
    public int f44743U;

    /* renamed from: U0 */
    public float f44744U0;

    /* renamed from: V */
    public VelocityTracker f44745V;

    /* renamed from: V0 */
    public float f44746V0;

    /* renamed from: W */
    public int f44747W;

    /* renamed from: W0 */
    public boolean f44748W0;

    /* renamed from: X0 */
    public final C16630y f44749X0;

    /* renamed from: Y0 */
    public C16661o f44750Y0;

    /* renamed from: Z0 */
    public C16661o.C16663b f44751Z0;

    /* renamed from: a1 */
    public final C16628w f44752a1;

    /* renamed from: b1 */
    public C0130p f44753b1;

    /* renamed from: c1 */
    public List<C0130p> f44754c1;

    /* renamed from: d */
    public final C16627t f44755d;

    /* renamed from: d1 */
    public boolean f44756d1;

    /* renamed from: e */
    public final C16625r f44757e;

    /* renamed from: e1 */
    public boolean f44758e1;

    /* renamed from: f */
    public SavedState f44759f;

    /* renamed from: f1 */
    public C16616j.C16617b f44760f1;

    /* renamed from: g */
    public C16644a f44761g;

    /* renamed from: g1 */
    public boolean f44762g1;

    /* renamed from: h */
    public C16650e f44763h;

    /* renamed from: h1 */
    public C103775c0 f44764h1;

    /* renamed from: i */
    public final C103777h0 f44765i;

    /* renamed from: i1 */
    public final int[] f44766i1;

    /* renamed from: j */
    public boolean f44767j;

    /* renamed from: j1 */
    public C107200l f44768j1;

    /* renamed from: k1 */
    public final int[] f44769k1;

    /* renamed from: l1 */
    public final int[] f44770l1;

    /* renamed from: m1 */
    public final int[] f44771m1;

    /* renamed from: n */
    public final Runnable f44772n;

    /* renamed from: n1 */
    public final int[] f44773n1;

    /* renamed from: o */
    public final Rect f44774o;

    /* renamed from: o1 */
    public final List<C16631z> f44775o1;

    /* renamed from: p */
    public final Rect f44776p;

    /* renamed from: p0 */
    public int f44777p0;

    /* renamed from: p1 */
    public Runnable f44778p1;

    /* renamed from: q */
    public final RectF f44779q;

    /* renamed from: q1 */
    public final C103777h0.C103779b f44780q1;

    /* renamed from: r */
    public C16613e f44781r;

    /* renamed from: s */
    public LayoutManager f44782s;

    /* renamed from: t */
    public C16626s f44783t;

    /* renamed from: u */
    public final ArrayList<C0129l> f44784u;

    /* renamed from: v */
    public final ArrayList<C16622o> f44785v;

    /* renamed from: w */
    public C16622o f44786w;

    /* renamed from: x */
    public boolean f44787x;

    /* renamed from: x0 */
    public int f44788x0;

    /* renamed from: y */
    public boolean f44789y;

    /* renamed from: y0 */
    public int f44790y0;

    /* renamed from: z */
    public boolean f44791z;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public interface C0128h {
        /* renamed from: a */
        int mo120a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0129l {
        @Deprecated
        /* renamed from: f */
        public void mo121f(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, C16628w wVar) {
            mo121f(rect, ((LayoutParams) view.getLayoutParams()).mo17280b(), recyclerView);
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, C16628w wVar) {
        }

        /* renamed from: i */
        public void mo123i(Canvas canvas, RecyclerView recyclerView, C16628w wVar) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0131u implements C16622o {
        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }
    }

    public static abstract class LayoutManager {
        public boolean mAutoMeasure = false;
        public C16650e mChildHelper;
        private int mHeight;
        private int mHeightMode;
        public C16653g0 mHorizontalBoundCheck;
        private final C16653g0.C16655b mHorizontalBoundCheckCallback;
        public boolean mIsAttachedToWindow = false;
        private boolean mItemPrefetchEnabled = true;
        private boolean mMeasurementCacheEnabled = true;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        public RecyclerView mRecyclerView;
        public boolean mRequestedSimpleAnimations = false;
        public C16634v mSmoothScroller;
        public C16653g0 mVerticalBoundCheck;
        private final C16653g0.C16655b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$d */
        public static class C16606d {

            /* renamed from: a */
            public int f44792a;

            /* renamed from: b */
            public int f44793b;

            /* renamed from: c */
            public boolean f44794c;

            /* renamed from: d */
            public boolean f44795d;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$a */
        public class C16607a implements C16653g0.C16655b {
            public C16607a() {
            }

            /* renamed from: a */
            public int mo17274a() {
                return LayoutManager.this.getWidth() - LayoutManager.this.getPaddingRight();
            }

            /* renamed from: b */
            public int mo17275b(View view) {
                return LayoutManager.this.getDecoratedLeft(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo17276c() {
                return LayoutManager.this.getPaddingLeft();
            }

            /* renamed from: d */
            public int mo17277d(View view) {
                return LayoutManager.this.getDecoratedRight(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }

            public View getChildAt(int i) {
                return LayoutManager.this.getChildAt(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$b */
        public class C16608b implements C16653g0.C16655b {
            public C16608b() {
            }

            /* renamed from: a */
            public int mo17274a() {
                return LayoutManager.this.getHeight() - LayoutManager.this.getPaddingBottom();
            }

            /* renamed from: b */
            public int mo17275b(View view) {
                return LayoutManager.this.getDecoratedTop(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo17276c() {
                return LayoutManager.this.getPaddingTop();
            }

            /* renamed from: d */
            public int mo17277d(View view) {
                return LayoutManager.this.getDecoratedBottom(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            public View getChildAt(int i) {
                return LayoutManager.this.getChildAt(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$c */
        public interface C16609c {
        }

        public LayoutManager() {
            C16607a aVar = new C16607a();
            this.mHorizontalBoundCheckCallback = aVar;
            C16608b bVar = new C16608b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new C16653g0(aVar);
            this.mVerticalBoundCheck = new C16653g0(bVar);
        }

        private void addViewInt(View view, int i, boolean z) {
            C16631z Q0 = RecyclerView.m15803Q0(view);
            if (z || Q0.mo17370q()) {
                C103777h0 h0Var = this.mRecyclerView.f44765i;
                C103777h0.C103778a orDefault = h0Var.f306554a.getOrDefault(Q0, null);
                if (orDefault == null) {
                    orDefault = C103777h0.C103778a.m138192a();
                    h0Var.f306554a.put(Q0, orDefault);
                }
                orDefault.f306557a |= 1;
            } else {
                this.mRecyclerView.f44765i.mo145151d(Q0);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (Q0.mo17378x() || Q0.mo17371r()) {
                if (Q0.mo17371r()) {
                    Q0.f44867t.mo17349m(Q0);
                } else {
                    Q0.f44863p &= -33;
                }
                this.mChildHelper.mo17487b(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int j = this.mChildHelper.mo17495j(view);
                if (i == -1) {
                    i = this.mChildHelper.mo17490e();
                }
                if (j == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.mo17017B0());
                } else if (j != i) {
                    this.mRecyclerView.f44782s.moveView(j, i);
                }
            } else {
                this.mChildHelper.mo17486a(view, i, false);
                layoutParams.f44800f = true;
                C16634v vVar = this.mSmoothScroller;
                if (vVar != null && vVar.f44876e && vVar.f44873b.mo17030O0(view) == vVar.f44872a) {
                    vVar.f44877f = view;
                }
            }
            if (layoutParams.f44801g) {
                Q0.f44854d.invalidate();
                layoutParams.f44801g = false;
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        private void detachViewInternal(int i, View view) {
            this.mChildHelper.mo17488c(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r3 = 0
                goto L_0x0021
            L_0x000f:
                if (r3 < 0) goto L_0x0014
            L_0x0011:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0021
            L_0x0014:
                r4 = -1
                if (r3 != r4) goto L_0x001b
                r2 = 1073741824(0x40000000, float:2.0)
            L_0x0019:
                r3 = r1
                goto L_0x0021
            L_0x001b:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0019
            L_0x0021:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width2 - width;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static C16606d getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
            C16606d dVar = new C16606d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C23223a.f66664a, i, i2);
            dVar.f44792a = obtainStyledAttributes.getInt(0, 1);
            dVar.f44793b = obtainStyledAttributes.getInt(9, 1);
            dVar.f44794c = obtainStyledAttributes.getBoolean(8, false);
            dVar.f44795d = obtainStyledAttributes.getBoolean(10, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.f44774o;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        private void scrapOrRecycleView(C16625r rVar, int i, View view) {
            C16631z Q0 = RecyclerView.m15803Q0(view);
            if (!Q0.mo17377w()) {
                if (!Q0.mo17369p() || Q0.mo17370q() || this.mRecyclerView.f44781r.hasStableIds()) {
                    detachViewAt(i);
                    rVar.mo17346j(view);
                    this.mRecyclerView.f44765i.mo145151d(Q0);
                    return;
                }
                removeViewAt(i);
                rVar.mo17345i(Q0);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && !recyclerView.mo17036W0()) {
                if (str == null) {
                    throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + recyclerView.mo17017B0());
                }
                throw new IllegalStateException(str + recyclerView.mo17017B0());
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.mo17094k0(str);
            }
        }

        public void attachView(View view, int i, LayoutParams layoutParams) {
            C16631z Q0 = RecyclerView.m15803Q0(view);
            if (Q0.mo17370q()) {
                C103777h0 h0Var = this.mRecyclerView.f44765i;
                C103777h0.C103778a orDefault = h0Var.f306554a.getOrDefault(Q0, null);
                if (orDefault == null) {
                    orDefault = C103777h0.C103778a.m138192a();
                    h0Var.f306554a.put(Q0, orDefault);
                }
                orDefault.f306557a |= 1;
            } else {
                this.mRecyclerView.f44765i.mo145151d(Q0);
            }
            this.mChildHelper.mo17487b(view, i, layoutParams, Q0.mo17370q());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo17032S0(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, C16628w wVar, C16609c cVar) {
        }

        public void collectInitialPrefetchPositions(int i, C16609c cVar) {
        }

        public int computeHorizontalScrollExtent(C16628w wVar) {
            return 0;
        }

        public int computeHorizontalScrollOffset(C16628w wVar) {
            return 0;
        }

        public int computeHorizontalScrollRange(C16628w wVar) {
            return 0;
        }

        public int computeVerticalScrollExtent(C16628w wVar) {
            return 0;
        }

        public int computeVerticalScrollOffset(C16628w wVar) {
            return 0;
        }

        public int computeVerticalScrollRange(C16628w wVar) {
            return 0;
        }

        public void detachAndScrapAttachedViews(C16625r rVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(rVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, C16625r rVar) {
            scrapOrRecycleView(rVar, this.mChildHelper.mo17495j(view), view);
        }

        public void detachAndScrapViewAt(int i, C16625r rVar) {
            scrapOrRecycleView(rVar, i, getChildAt(i));
        }

        public void detachView(View view) {
            int j = this.mChildHelper.mo17495j(view);
            if (j >= 0) {
                detachViewInternal(j, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, C16625r rVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, rVar);
        }

        public void endAnimation(View view) {
            C16616j jVar = this.mRecyclerView.f44739S;
            if (jVar != null) {
                jVar.mo17321j(RecyclerView.m15803Q0(view));
            }
        }

        public View findContainingItemView(View view) {
            View E0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (E0 = recyclerView.mo17020E0(view)) == null || this.mChildHelper.mo17496k(E0)) {
                return null;
            }
            return E0;
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C16631z Q0 = RecyclerView.m15803Q0(childAt);
                if (Q0 != null && Q0.mo17364k() == i && !Q0.mo17377w() && (this.mRecyclerView.f44752a1.f44838g || !Q0.mo17370q())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).f44799e.bottom;
        }

        public View getChildAt(int i) {
            C16650e eVar = this.mChildHelper;
            if (eVar != null) {
                return eVar.mo17489d(i);
            }
            return null;
        }

        public int getChildCount() {
            C16650e eVar = this.mChildHelper;
            if (eVar != null) {
                return eVar.mo17490e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.f44767j;
        }

        public int getColumnCountForAccessibility(C16625r rVar, C16628w wVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.f44781r == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.f44781r.getItemCount();
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.m15804R0(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f44799e;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f44799e;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.mo17496k(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.m15803Q0(view).f44859i;
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            return C107207u.C107209c.m145195d(recyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).f44799e.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            return C107207u.C107208b.m145176d(recyclerView);
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            return C107207u.C107208b.m145177e(recyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            return C107207u.C107209c.m145196e(recyclerView);
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            return C107207u.C107209c.m145197f(recyclerView);
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((LayoutParams) view.getLayoutParams()).mo17280b();
        }

        public int getRightDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).f44799e.right;
        }

        public int getRowCountForAccessibility(C16625r rVar, C16628w wVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.f44781r == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.f44781r.getItemCount();
        }

        public int getSelectionModeForAccessibility(C16625r rVar, C16628w wVar) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).f44799e.top;
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f44799e;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.mRecyclerView == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.mRecyclerView.f44779q;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.mo17017B0());
            }
            C16631z Q0 = RecyclerView.m15803Q0(view);
            Q0.mo17362i(128);
            this.mRecyclerView.f44765i.mo145152e(Q0);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(C16625r rVar, C16628w wVar) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            C16634v vVar = this.mSmoothScroller;
            return vVar != null && vVar.f44876e;
        }

        public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.mo17510b(view, 24579) && this.mVerticalBoundCheck.mo17510b(view, 24579);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f44799e;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f44799e;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        public void measureChild(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect S0 = this.mRecyclerView.mo17032S0(view);
            int i3 = i + S0.left + S0.right;
            int i4 = i2 + S0.top + S0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i3, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i4, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect S0 = this.mRecyclerView.mo17032S0(view);
            int i3 = i + S0.left + S0.right;
            int i4 = i2 + S0.top + S0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + i3, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }

        public void offsetChildrenHorizontal(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int e = recyclerView.f44763h.mo17490e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.f44763h.mo17489d(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void offsetChildrenVertical(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int e = recyclerView.f44763h.mo17490e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.f44763h.mo17489d(i2).offsetTopAndBottom(i);
                }
            }
        }

        public void onAdapterChanged(C16613e eVar, C16613e eVar2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, C16625r rVar) {
            onDetachedFromWindow(recyclerView);
        }

        public View onFocusSearchFailed(View view, int i, C16625r rVar, C16628w wVar) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.f44757e, recyclerView.f44752a1, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(C107453d dVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.f44757e, recyclerView.f44752a1, dVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, C107453d dVar) {
            C16631z Q0 = RecyclerView.m15803Q0(view);
            if (Q0 != null && !Q0.mo17370q() && !this.mChildHelper.mo17496k(Q0.f44854d)) {
                RecyclerView recyclerView = this.mRecyclerView;
                onInitializeAccessibilityNodeInfoForItem(recyclerView.f44757e, recyclerView.f44752a1, view, dVar);
            }
        }

        public View onInterceptFocusSearch(View view, int i) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onLayoutChildren(C16625r rVar, C16628w wVar) {
        }

        public void onLayoutCompleted(C16628w wVar) {
        }

        public void onMeasure(C16625r rVar, C16628w wVar, int i, int i2) {
            this.mRecyclerView.mo17110p0(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.mo17036W0();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public void onSmoothScrollerStopped(C16634v vVar) {
            if (this.mSmoothScroller == vVar) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.f44757e, recyclerView.f44752a1, i, bundle);
        }

        public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.f44757e, recyclerView.f44752a1, view, i, bundle);
        }

        public boolean performAccessibilityActionForItem(C16625r rVar, C16628w wVar, View view, int i, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145185m(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.mo17497l(childCount);
            }
        }

        public void removeAndRecycleAllViews(C16625r rVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.m15803Q0(getChildAt(childCount)).mo17377w()) {
                    removeAndRecycleViewAt(childCount, rVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(C16625r rVar) {
            int size = rVar.f44822a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = rVar.f44822a.get(i).f44854d;
                C16631z Q0 = RecyclerView.m15803Q0(view);
                if (!Q0.mo17377w()) {
                    Q0.mo17376v(false);
                    if (Q0.mo17372s()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    C16616j jVar = this.mRecyclerView.f44739S;
                    if (jVar != null) {
                        jVar.mo17321j(Q0);
                    }
                    Q0.mo17376v(true);
                    C16631z Q02 = RecyclerView.m15803Q0(view);
                    Q02.f44867t = null;
                    Q02.f44868u = false;
                    Q02.f44863p &= -33;
                    rVar.mo17345i(Q02);
                }
            }
            rVar.f44822a.clear();
            ArrayList<C16631z> arrayList = rVar.f44823b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, C16625r rVar) {
            removeView(view);
            rVar.mo17344h(view);
        }

        public void removeAndRecycleViewAt(int i, C16625r rVar) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            rVar.mo17344h(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            C16650e eVar = this.mChildHelper;
            int indexOfChild = ((C16647a0) eVar.f44954a).f44952a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (eVar.f44955b.mo17505f(indexOfChild)) {
                    eVar.mo17498m(view);
                }
                ((C16647a0) eVar.f44954a).mo17481b(indexOfChild);
            }
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.mo17497l(i);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, C16625r rVar, C16628w wVar) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, C16625r rVar, C16628w wVar) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.f44757e.mo17350n();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.f44715t1) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 == 0 && !RecyclerView.f44715t1) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.mo17110p0(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.f44774o;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i15 = rect.top;
                if (i15 < i6) {
                    i6 = i15;
                }
                int i16 = rect.bottom;
                if (i16 > i4) {
                    i4 = i16;
                }
            }
            this.mRecyclerView.f44774o.set(i5, i6, i3, i4);
            setMeasuredDimension(this.mRecyclerView.f44774o, i, i2);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.f44763h;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getHeight(), i2, layoutParams.height);
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getMeasuredWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getMeasuredHeight(), i2, layoutParams.height);
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, C16628w wVar, int i) {
        }

        public void startSmoothScroll(C16634v vVar) {
            C16634v vVar2 = this.mSmoothScroller;
            if (!(vVar2 == null || vVar == vVar2 || !vVar2.f44876e)) {
                vVar2.mo17386g();
            }
            this.mSmoothScroller = vVar;
            RecyclerView recyclerView = this.mRecyclerView;
            vVar.f44873b = recyclerView;
            vVar.f44874c = this;
            int i = vVar.f44872a;
            if (i != -1) {
                recyclerView.f44752a1.f44832a = i;
                vVar.f44876e = true;
                vVar.f44875d = true;
                vVar.f44877f = recyclerView.f44782s.findViewByPosition(i);
                vVar.mo17383d();
                vVar.f44873b.f44749X0.mo17358b();
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public void stopIgnoringView(View view) {
            C16631z Q0 = RecyclerView.m15803Q0(view);
            Q0.f44863p &= -129;
            Q0.mo17375u();
            Q0.mo17362i(4);
        }

        public void stopSmoothScroller() {
            C16634v vVar = this.mSmoothScroller;
            if (vVar != null) {
                vVar.mo17386g();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        public void onInitializeAccessibilityEvent(C16625r rVar, C16628w wVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C16613e eVar = this.mRecyclerView.f44781r;
                if (eVar != null) {
                    accessibilityEvent.setItemCount(eVar.getItemCount());
                }
            }
        }

        public void onInitializeAccessibilityNodeInfo(C16625r rVar, C16628w wVar, C107453d dVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                dVar.mo157839a(8192);
                dVar.mo157863v(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                dVar.mo157839a(4096);
                dVar.mo157863v(true);
            }
            AccessibilityNodeInfo.CollectionInfo obtain = AccessibilityNodeInfo.CollectionInfo.obtain(getRowCountForAccessibility(rVar, wVar), getColumnCountForAccessibility(rVar, wVar), isLayoutHierarchical(rVar, wVar), getSelectionModeForAccessibility(rVar, wVar));
            AccessibilityNodeInfo accessibilityNodeInfo = dVar.f321473a;
            AccessibilityNodeInfo.CollectionInfo collectionInfo = obtain;
            accessibilityNodeInfo.setCollectionInfo(obtain);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, C16628w wVar, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.C16625r r2, androidx.recyclerview.widget.RecyclerView.C16628w r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.getHeight()
                int r5 = r1.getPaddingTop()
                int r2 = r2 - r5
                int r5 = r1.getPaddingBottom()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.mRecyclerView
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.getWidth()
                int r5 = r1.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r1.getPaddingRight()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.getHeight()
                int r4 = r1.getPaddingTop()
                int r2 = r2 - r4
                int r4 = r1.getPaddingBottom()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r4 = r1.mRecyclerView
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.getWidth()
                int r5 = r1.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r1.getPaddingRight()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                androidx.recyclerview.widget.RecyclerView r3 = r1.mRecyclerView
                r3.smoothScrollBy(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.performAccessibilityAction(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, int, android.os.Bundle):boolean");
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(recyclerView, view, rect, z);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void onInitializeAccessibilityNodeInfoForItem(C16625r rVar, C16628w wVar, View view, C107453d dVar) {
            dVar.mo157853m(C107453d.C107455b.m145563a(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void attachView(View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        public void attachView(View view) {
            attachView(view, -1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C16610a implements Runnable {
        public C16610a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f44791z && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f44787x) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f44722C) {
                    recyclerView2.f44721B = true;
                } else {
                    recyclerView2.mo17101o0();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class C16611b implements Runnable {
        public C16611b() {
        }

        public void run() {
            C16616j jVar = RecyclerView.this.f44739S;
            if (jVar != null) {
                jVar.mo17329r();
            }
            RecyclerView.this.f44762g1 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C16612d implements C103777h0.C103779b {
        public C16612d() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static class C16614f extends Observable<C16615g> {
        /* renamed from: a */
        public boolean mo17306a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo17307b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C16615g) this.mObservers.get(size)).mo2556b();
            }
        }

        /* renamed from: c */
        public void mo17308c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C16615g) this.mObservers.get(size)).mo17312f(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void mo17309d(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C16615g) this.mObservers.get(size)).mo2558d(i, i2, obj);
            }
        }

        /* renamed from: e */
        public void mo17310e(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C16615g) this.mObservers.get(size)).mo2559e(i, i2);
            }
        }

        /* renamed from: f */
        public void mo17311f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C16615g) this.mObservers.get(size)).mo2560g(i, i2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C16615g {
        /* renamed from: b */
        public void mo2556b() {
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            mo2557c(i, i2);
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class C16616j {

        /* renamed from: a */
        public C16617b f44805a = null;

        /* renamed from: b */
        public ArrayList<C16618a> f44806b = new ArrayList<>();

        /* renamed from: c */
        public long f44807c = 120;

        /* renamed from: d */
        public long f44808d = 120;

        /* renamed from: e */
        public long f44809e = 250;

        /* renamed from: f */
        public long f44810f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$b */
        public interface C16617b {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$a */
        public interface C16618a {
            /* renamed from: a */
            void mo17330a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$c */
        public static class C16619c {

            /* renamed from: a */
            public int f44811a;

            /* renamed from: b */
            public int f44812b;

            /* renamed from: c */
            public int f44813c;

            /* renamed from: d */
            public int f44814d;

            /* renamed from: a */
            public C16619c mo17331a(C16631z zVar, int i) {
                View view = zVar.f44854d;
                this.f44811a = view.getLeft();
                this.f44812b = view.getTop();
                view.getRight();
                this.f44813c = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        public static int m15901e(C16631z zVar) {
            int i = zVar.f44863p & 14;
            if (zVar.mo17369p()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = zVar.f44857g;
            int j = zVar.mo17363j();
            return (i2 == -1 || j == -1 || i2 == j) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo17313a(C16631z zVar, C16619c cVar, C16619c cVar2);

        /* renamed from: b */
        public abstract boolean mo17314b(C16631z zVar, C16631z zVar2, C16619c cVar, C16619c cVar2);

        /* renamed from: c */
        public abstract boolean mo17315c(C16631z zVar, C16619c cVar, C16619c cVar2);

        /* renamed from: d */
        public abstract boolean mo17316d(C16631z zVar, C16619c cVar, C16619c cVar2);

        /* renamed from: f */
        public abstract boolean mo17317f(C16631z zVar);

        /* renamed from: g */
        public boolean mo17318g(C16631z zVar, List<Object> list) {
            return mo17317f(zVar);
        }

        /* renamed from: h */
        public final void mo17319h(C16631z zVar) {
            mo17327p(zVar);
            C16617b bVar = this.f44805a;
            if (bVar != null) {
                C16620k kVar = (C16620k) bVar;
                boolean z = true;
                zVar.mo17376v(true);
                if (zVar.f44861n != null && zVar.f44862o == null) {
                    zVar.f44861n = null;
                }
                zVar.f44862o = null;
                if (!((zVar.f44863p & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = zVar.f44854d;
                    recyclerView.mo17151u1();
                    C16650e eVar = recyclerView.f44763h;
                    int indexOfChild = ((C16647a0) eVar.f44954a).f44952a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        eVar.mo17498m(view);
                    } else if (eVar.f44955b.mo17503d(indexOfChild)) {
                        eVar.f44955b.mo17505f(indexOfChild);
                        eVar.mo17498m(view);
                        ((C16647a0) eVar.f44954a).mo17481b(indexOfChild);
                    } else {
                        z = false;
                    }
                    if (z) {
                        C16631z Q0 = RecyclerView.m15803Q0(view);
                        recyclerView.f44757e.mo17349m(Q0);
                        recyclerView.f44757e.mo17345i(Q0);
                    }
                    recyclerView.mo17153v1(!z);
                    if (!z && zVar.mo17372s()) {
                        RecyclerView.this.removeDetachedView(zVar.f44854d, false);
                    }
                }
            }
        }

        /* renamed from: i */
        public final void mo17320i() {
            int size = this.f44806b.size();
            for (int i = 0; i < size; i++) {
                this.f44806b.get(i).mo17330a();
            }
            this.f44806b.clear();
        }

        /* renamed from: j */
        public abstract void mo17321j(C16631z zVar);

        /* renamed from: k */
        public abstract void mo17322k();

        /* renamed from: l */
        public long mo17323l() {
            return this.f44807c;
        }

        /* renamed from: m */
        public long mo17324m() {
            return this.f44808d;
        }

        /* renamed from: n */
        public abstract boolean mo17325n();

        /* renamed from: o */
        public final boolean mo17326o(C16618a aVar) {
            boolean n = mo17325n();
            if (aVar != null) {
                if (!n) {
                    aVar.mo17330a();
                } else {
                    this.f44806b.add(aVar);
                }
            }
            return n;
        }

        /* renamed from: p */
        public void mo17327p(C16631z zVar) {
        }

        /* renamed from: q */
        public C16619c mo17328q(C16628w wVar, C16631z zVar, int i, List<Object> list) {
            C16619c cVar = new C16619c();
            cVar.mo17331a(zVar, 0);
            return cVar;
        }

        /* renamed from: r */
        public abstract void mo17329r();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public class C16620k implements C16616j.C16617b {
        public C16620k() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public interface C16621m {
        /* renamed from: E0 */
        void mo17332E0(View view);

        /* renamed from: z2 */
        void mo17333z2(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public interface C16622o {
        /* renamed from: c */
        void mo126c(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: d */
        void mo127d(boolean z);

        /* renamed from: e */
        boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static class C16623q {

        /* renamed from: a */
        public SparseArray<C16624a> f44816a = new SparseArray<>();

        /* renamed from: b */
        public int f44817b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$q$a */
        public static class C16624a {

            /* renamed from: a */
            public final ArrayList<C16631z> f44818a = new ArrayList<>();

            /* renamed from: b */
            public int f44819b = 5;

            /* renamed from: c */
            public long f44820c = 0;

            /* renamed from: d */
            public long f44821d = 0;
        }

        /* renamed from: a */
        public void mo17334a() {
            for (int i = 0; i < this.f44816a.size(); i++) {
                this.f44816a.valueAt(i).f44818a.clear();
            }
        }

        /* renamed from: b */
        public C16631z mo10383b(int i) {
            C16624a aVar = this.f44816a.get(i);
            if (aVar == null || aVar.f44818a.isEmpty()) {
                return null;
            }
            ArrayList<C16631z> arrayList = aVar.f44818a;
            return arrayList.remove(arrayList.size() - 1);
        }

        /* renamed from: c */
        public final C16624a mo17335c(int i) {
            C16624a aVar = this.f44816a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C16624a aVar2 = new C16624a();
            this.f44816a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: d */
        public void mo10384d(C16631z zVar) {
            int i = zVar.f44859i;
            ArrayList<C16631z> arrayList = mo17335c(i).f44818a;
            if (this.f44816a.get(i).f44819b > arrayList.size()) {
                zVar.mo17375u();
                arrayList.add(zVar);
            }
        }

        /* renamed from: e */
        public void mo17336e(int i, int i2) {
            C16624a c = mo17335c(i);
            c.f44819b = i2;
            ArrayList<C16631z> arrayList = c.f44818a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public final class C16625r {

        /* renamed from: a */
        public final ArrayList<C16631z> f44822a;

        /* renamed from: b */
        public ArrayList<C16631z> f44823b = null;

        /* renamed from: c */
        public final ArrayList<C16631z> f44824c = new ArrayList<>();

        /* renamed from: d */
        public final List<C16631z> f44825d;

        /* renamed from: e */
        public int f44826e;

        /* renamed from: f */
        public int f44827f;

        /* renamed from: g */
        public C16623q f44828g;

        /* renamed from: h */
        public C16629x f44829h;

        public C16625r() {
            ArrayList<C16631z> arrayList = new ArrayList<>();
            this.f44822a = arrayList;
            this.f44825d = Collections.unmodifiableList(arrayList);
            this.f44826e = 2;
            this.f44827f = 2;
        }

        /* renamed from: a */
        public void mo17337a(C16631z zVar, boolean z) {
            RecyclerView.m15809l0(zVar);
            if (zVar.mo17367n(16384)) {
                zVar.f44863p = (zVar.f44863p & -16385) | 0;
                C107207u.m145168i(zVar.f44854d, (C107166a) null);
            }
            if (z) {
                C16626s sVar = RecyclerView.this.f44783t;
                if (sVar != null) {
                    sVar.mo17351a(zVar);
                }
                C16613e eVar = RecyclerView.this.f44781r;
                if (eVar != null) {
                    eVar.onViewRecycled(zVar);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f44752a1 != null) {
                    recyclerView.f44765i.mo145152e(zVar);
                }
            }
            zVar.f44871x = null;
            mo17340d().mo10384d(zVar);
        }

        /* renamed from: b */
        public void mo17338b() {
            this.f44822a.clear();
            mo17342f();
        }

        /* renamed from: c */
        public int mo17339c(int i) {
            if (i < 0 || i >= RecyclerView.this.f44752a1.mo17354b()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State " + "item count is " + RecyclerView.this.f44752a1.mo17354b() + RecyclerView.this.mo17017B0());
            }
            RecyclerView recyclerView = RecyclerView.this;
            return !recyclerView.f44752a1.f44838g ? i : recyclerView.f44761g.mo17469f(i, 0);
        }

        /* renamed from: d */
        public C16623q mo17340d() {
            if (this.f44828g == null) {
                this.f44828g = new C16623q();
            }
            return this.f44828g;
        }

        /* renamed from: e */
        public View mo17341e(int i) {
            return mo17348l(i, false, MAlarmHandler.NEXT_FIRE_INTERVAL).f44854d;
        }

        /* renamed from: f */
        public void mo17342f() {
            for (int size = this.f44824c.size() - 1; size >= 0; size--) {
                mo17343g(size);
            }
            this.f44824c.clear();
            if (RecyclerView.f44717v1) {
                C16661o.C16663b bVar = RecyclerView.this.f44751Z0;
                int[] iArr = bVar.f45009c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f45010d = 0;
            }
        }

        /* renamed from: g */
        public void mo17343g(int i) {
            mo17337a(this.f44824c.get(i), true);
            this.f44824c.remove(i);
        }

        /* renamed from: h */
        public void mo17344h(View view) {
            C16631z Q0 = RecyclerView.m15803Q0(view);
            if (Q0.mo17372s()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (Q0.mo17371r()) {
                Q0.f44867t.mo17349m(Q0);
            } else if (Q0.mo17378x()) {
                Q0.f44863p &= -33;
            }
            mo17345i(Q0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x00e3 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17345i(androidx.recyclerview.widget.RecyclerView.C16631z r10) {
            /*
                r9 = this;
                boolean r0 = r10.mo17371r()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0128
                android.view.View r0 = r10.f44854d
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x0128
            L_0x0012:
                boolean r0 = r10.mo17372s()
                if (r0 != 0) goto L_0x0108
                boolean r0 = r10.mo17377w()
                if (r0 != 0) goto L_0x00eb
                int r0 = r10.f44863p
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                android.view.View r0 = r10.f44854d
                java.util.WeakHashMap<android.view.View, e3.a0> r3 = p849e3.C107207u.f320808a
                boolean r0 = p849e3.C107207u.C107208b.m145181i(r0)
                if (r0 == 0) goto L_0x0030
                r0 = 1
                goto L_0x0031
            L_0x0030:
                r0 = 0
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r3 = r3.f44781r
                if (r3 == 0) goto L_0x0041
                if (r0 == 0) goto L_0x0041
                boolean r3 = r3.onFailedToRecycleView(r10)
                if (r3 == 0) goto L_0x0041
                r3 = 1
                goto L_0x0042
            L_0x0041:
                r3 = 0
            L_0x0042:
                if (r3 != 0) goto L_0x005d
                int r3 = r10.f44863p
                r3 = r3 & 16
                if (r3 != 0) goto L_0x0056
                android.view.View r3 = r10.f44854d
                java.util.WeakHashMap<android.view.View, e3.a0> r4 = p849e3.C107207u.f320808a
                boolean r3 = p849e3.C107207u.C107208b.m145181i(r3)
                if (r3 != 0) goto L_0x0056
                r3 = 1
                goto L_0x0057
            L_0x0056:
                r3 = 0
            L_0x0057:
                if (r3 == 0) goto L_0x005a
                goto L_0x005d
            L_0x005a:
                r3 = 0
                goto L_0x00d9
            L_0x005d:
                int r3 = r9.f44827f
                if (r3 <= 0) goto L_0x00d2
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r10.mo17367n(r3)
                if (r3 != 0) goto L_0x00d2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r9.f44824c
                int r3 = r3.size()
                int r4 = r9.f44827f
                if (r3 < r4) goto L_0x007a
                if (r3 <= 0) goto L_0x007a
                r9.mo17343g(r2)
                int r3 = r3 + -1
            L_0x007a:
                boolean r4 = androidx.recyclerview.widget.RecyclerView.f44717v1
                if (r4 == 0) goto L_0x00cb
                if (r3 <= 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.o$b r4 = r4.f44751Z0
                int r5 = r10.f44856f
                int[] r6 = r4.f45009c
                if (r6 == 0) goto L_0x009c
                int r6 = r4.f45010d
                int r6 = r6 * 2
                r7 = 0
            L_0x008f:
                if (r7 >= r6) goto L_0x009c
                int[] r8 = r4.f45009c
                r8 = r8[r7]
                if (r8 != r5) goto L_0x0099
                r4 = 1
                goto L_0x009d
            L_0x0099:
                int r7 = r7 + 2
                goto L_0x008f
            L_0x009c:
                r4 = 0
            L_0x009d:
                if (r4 != 0) goto L_0x00cb
            L_0x009f:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x00ca
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r4 = r9.f44824c
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$z r4 = (androidx.recyclerview.widget.RecyclerView.C16631z) r4
                int r4 = r4.f44856f
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.o$b r5 = r5.f44751Z0
                int[] r6 = r5.f45009c
                if (r6 == 0) goto L_0x00c7
                int r6 = r5.f45010d
                int r6 = r6 * 2
                r7 = 0
            L_0x00ba:
                if (r7 >= r6) goto L_0x00c7
                int[] r8 = r5.f45009c
                r8 = r8[r7]
                if (r8 != r4) goto L_0x00c4
                r4 = 1
                goto L_0x00c8
            L_0x00c4:
                int r7 = r7 + 2
                goto L_0x00ba
            L_0x00c7:
                r4 = 0
            L_0x00c8:
                if (r4 != 0) goto L_0x009f
            L_0x00ca:
                int r3 = r3 + r1
            L_0x00cb:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r4 = r9.f44824c
                r4.add(r3, r10)
                r3 = 1
                goto L_0x00d3
            L_0x00d2:
                r3 = 0
            L_0x00d3:
                if (r3 != 0) goto L_0x00d9
                r9.mo17337a(r10, r1)
                goto L_0x00da
            L_0x00d9:
                r1 = 0
            L_0x00da:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.h0 r2 = r2.f44765i
                r2.mo145152e(r10)
                if (r3 != 0) goto L_0x00ea
                if (r1 != 0) goto L_0x00ea
                if (r0 == 0) goto L_0x00ea
                r0 = 0
                r10.f44871x = r0
            L_0x00ea:
                return
            L_0x00eb:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = r1.mo17017B0()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r10.<init>(r0)
                throw r10
            L_0x0108:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r10)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r10 = r10.mo17017B0()
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10)
                throw r0
            L_0x0128:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Scrapped or attached views may not be recycled. isScrap:"
                r3.append(r4)
                boolean r4 = r10.mo17371r()
                r3.append(r4)
                java.lang.String r4 = " isAttached:"
                r3.append(r4)
                android.view.View r10 = r10.f44854d
                android.view.ViewParent r10 = r10.getParent()
                if (r10 == 0) goto L_0x0149
                goto L_0x014a
            L_0x0149:
                r1 = 0
            L_0x014a:
                r3.append(r1)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r10 = r10.mo17017B0()
                r3.append(r10)
                java.lang.String r10 = r3.toString()
                r0.<init>(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C16625r.mo17345i(androidx.recyclerview.widget.RecyclerView$z):void");
        }

        /* renamed from: j */
        public void mo17346j(View view) {
            C16631z Q0 = RecyclerView.m15803Q0(view);
            if (!Q0.mo17367n(12)) {
                if ((Q0.f44863p & 2) != 0) {
                    C16616j jVar = RecyclerView.this.f44739S;
                    if (!(jVar == null || jVar.mo17318g(Q0, Q0.mo17366m()))) {
                        if (this.f44823b == null) {
                            this.f44823b = new ArrayList<>();
                        }
                        Q0.f44867t = this;
                        Q0.f44868u = true;
                        this.f44823b.add(Q0);
                        return;
                    }
                }
            }
            if (!Q0.mo17369p() || Q0.mo17370q() || RecyclerView.this.f44781r.hasStableIds()) {
                Q0.f44867t = this;
                Q0.f44868u = false;
                this.f44822a.add(Q0);
                return;
            }
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo17017B0());
        }

        /* renamed from: k */
        public final boolean mo17347k(C16631z zVar, int i, int i2, long j) {
            RecyclerView recyclerView = RecyclerView.this;
            zVar.f44871x = recyclerView;
            int i3 = zVar.f44859i;
            long nanoTime = recyclerView.getNanoTime();
            boolean z = false;
            if (j != MAlarmHandler.NEXT_FIRE_INTERVAL) {
                long j2 = this.f44828g.mo17335c(i3).f44821d;
                if (!(j2 == 0 || j2 + nanoTime < j)) {
                    return false;
                }
            }
            RecyclerView.this.f44781r.bindViewHolder(zVar, i);
            long nanoTime2 = RecyclerView.this.getNanoTime() - nanoTime;
            C16623q.C16624a c = this.f44828g.mo17335c(zVar.f44859i);
            long j3 = c.f44821d;
            if (j3 != 0) {
                nanoTime2 = (nanoTime2 / 4) + ((j3 / 4) * 3);
            }
            c.f44821d = nanoTime2;
            AccessibilityManager accessibilityManager = RecyclerView.this.f44726G;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                View view = zVar.f44854d;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107208b.m145175c(view) == 0) {
                    C107207u.C107208b.m145191s(view, 1);
                }
                if (C107207u.m145162c(view) != null) {
                    z = true;
                }
                if (!z) {
                    zVar.mo17362i(16384);
                    C107207u.m145168i(view, RecyclerView.this.f44764h1.f306552f);
                }
            }
            if (RecyclerView.this.f44752a1.f44838g) {
                zVar.f44860j = i2;
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0323, code lost:
            r5 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x049c, code lost:
            if (r11.mo17369p() == false) goto L_0x049f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x0266  */
        /* JADX WARNING: Removed duplicated region for block: B:209:0x045e  */
        /* JADX WARNING: Removed duplicated region for block: B:214:0x0485  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x0488  */
        /* JADX WARNING: Removed duplicated region for block: B:228:0x04bc  */
        /* JADX WARNING: Removed duplicated region for block: B:229:0x04ca  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C16631z mo17348l(int r19, boolean r20, long r21) {
            /*
                r18 = this;
                r6 = r18
                r3 = r19
                if (r3 < 0) goto L_0x04ed
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f44752a1
                int r0 = r0.mo17354b()
                if (r3 >= r0) goto L_0x04ed
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f44752a1
                boolean r0 = r0.f44838g
                r1 = 32
                r7 = 1
                r8 = 0
                if (r0 == 0) goto L_0x008f
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r6.f44823b
                if (r0 == 0) goto L_0x008a
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0027
                goto L_0x008a
            L_0x0027:
                r4 = 0
            L_0x0028:
                if (r4 >= r0) goto L_0x0045
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r5 = r6.f44823b
                java.lang.Object r5 = r5.get(r4)
                androidx.recyclerview.widget.RecyclerView$z r5 = (androidx.recyclerview.widget.RecyclerView.C16631z) r5
                boolean r9 = r5.mo17378x()
                if (r9 != 0) goto L_0x0042
                int r9 = r5.mo17364k()
                if (r9 != r3) goto L_0x0042
                r5.mo17362i(r1)
                goto L_0x008b
            L_0x0042:
                int r4 = r4 + 1
                goto L_0x0028
            L_0x0045:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r4 = r4.f44781r
                boolean r4 = r4.hasStableIds()
                if (r4 == 0) goto L_0x008a
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r4 = r4.f44761g
                int r4 = r4.mo17469f(r3, r8)
                if (r4 <= 0) goto L_0x008a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r5 = r5.f44781r
                int r5 = r5.getItemCount()
                if (r4 >= r5) goto L_0x008a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r5 = r5.f44781r
                long r4 = r5.getItemId(r4)
                r9 = 0
            L_0x006c:
                if (r9 >= r0) goto L_0x008a
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r10 = r6.f44823b
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$z r10 = (androidx.recyclerview.widget.RecyclerView.C16631z) r10
                boolean r11 = r10.mo17378x()
                if (r11 != 0) goto L_0x0087
                long r11 = r10.f44858h
                int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r13 != 0) goto L_0x0087
                r10.mo17362i(r1)
                r5 = r10
                goto L_0x008b
            L_0x0087:
                int r9 = r9 + 1
                goto L_0x006c
            L_0x008a:
                r5 = 0
            L_0x008b:
                if (r5 == 0) goto L_0x0090
                r0 = 1
                goto L_0x0091
            L_0x008f:
                r5 = 0
            L_0x0090:
                r0 = 0
            L_0x0091:
                r4 = -1
                if (r5 != 0) goto L_0x0263
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r5 = r6.f44822a
                int r5 = r5.size()
                r9 = 0
            L_0x009b:
                if (r9 >= r5) goto L_0x00cd
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r10 = r6.f44822a
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$z r10 = (androidx.recyclerview.widget.RecyclerView.C16631z) r10
                boolean r11 = r10.mo17378x()
                if (r11 != 0) goto L_0x00ca
                int r11 = r10.mo17364k()
                if (r11 != r3) goto L_0x00ca
                boolean r11 = r10.mo17369p()
                if (r11 != 0) goto L_0x00ca
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r11 = r11.f44752a1
                boolean r11 = r11.f44838g
                if (r11 != 0) goto L_0x00c5
                boolean r11 = r10.mo17370q()
                if (r11 != 0) goto L_0x00ca
            L_0x00c5:
                r10.mo17362i(r1)
                goto L_0x01bf
            L_0x00ca:
                int r9 = r9 + 1
                goto L_0x009b
            L_0x00cd:
                if (r20 != 0) goto L_0x019b
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e r5 = r5.f44763h
                java.util.List<android.view.View> r9 = r5.f44956c
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                int r9 = r9.size()
                r10 = 0
            L_0x00dc:
                if (r10 >= r9) goto L_0x0109
                java.util.List<android.view.View> r11 = r5.f44956c
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                java.lang.Object r11 = r11.get(r10)
                android.view.View r11 = (android.view.View) r11
                androidx.recyclerview.widget.e$b r12 = r5.f44954a
                androidx.recyclerview.widget.a0 r12 = (androidx.recyclerview.widget.C16647a0) r12
                r12.getClass()
                androidx.recyclerview.widget.RecyclerView$z r12 = androidx.recyclerview.widget.RecyclerView.m15803Q0(r11)
                int r13 = r12.mo17364k()
                if (r13 != r3) goto L_0x0106
                boolean r13 = r12.mo17369p()
                if (r13 != 0) goto L_0x0106
                boolean r12 = r12.mo17370q()
                if (r12 != 0) goto L_0x0106
                goto L_0x010a
            L_0x0106:
                int r10 = r10 + 1
                goto L_0x00dc
            L_0x0109:
                r11 = 0
            L_0x010a:
                if (r11 == 0) goto L_0x019b
                androidx.recyclerview.widget.RecyclerView$z r5 = androidx.recyclerview.widget.RecyclerView.m15803Q0(r11)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e r9 = r9.f44763h
                androidx.recyclerview.widget.e$b r10 = r9.f44954a
                androidx.recyclerview.widget.a0 r10 = (androidx.recyclerview.widget.C16647a0) r10
                androidx.recyclerview.widget.RecyclerView r10 = r10.f44952a
                int r10 = r10.indexOfChild(r11)
                if (r10 < 0) goto L_0x0183
                androidx.recyclerview.widget.e$a r12 = r9.f44955b
                boolean r12 = r12.mo17503d(r10)
                if (r12 == 0) goto L_0x016b
                androidx.recyclerview.widget.e$a r12 = r9.f44955b
                r12.mo17500a(r10)
                r9.mo17498m(r11)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e r9 = r9.f44763h
                int r9 = r9.mo17495j(r11)
                if (r9 == r4) goto L_0x014b
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e r10 = r10.f44763h
                r10.mo17488c(r9)
                r6.mo17346j(r11)
                r9 = 8224(0x2020, float:1.1524E-41)
                r5.mo17362i(r9)
                goto L_0x01c5
            L_0x014b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "layout index should not be -1 after unhiding a view:"
                r1.append(r2)
                r1.append(r5)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo17017B0()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x016b:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "trying to unhide a view that was not hidden"
                r1.append(r2)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0183:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "view is not a child, cannot hide "
                r1.append(r2)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x019b:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r5 = r6.f44824c
                int r5 = r5.size()
                r9 = 0
            L_0x01a2:
                if (r9 >= r5) goto L_0x01c4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r10 = r6.f44824c
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$z r10 = (androidx.recyclerview.widget.RecyclerView.C16631z) r10
                boolean r11 = r10.mo17369p()
                if (r11 != 0) goto L_0x01c1
                int r11 = r10.mo17364k()
                if (r11 != r3) goto L_0x01c1
                if (r20 != 0) goto L_0x01bf
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r5 = r6.f44824c
                r5.remove(r9)
            L_0x01bf:
                r5 = r10
                goto L_0x01c5
            L_0x01c1:
                int r9 = r9 + 1
                goto L_0x01a2
            L_0x01c4:
                r5 = 0
            L_0x01c5:
                if (r5 == 0) goto L_0x0263
                boolean r9 = r5.mo17370q()
                if (r9 == 0) goto L_0x01d4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r9 = r9.f44752a1
                boolean r9 = r9.f44838g
                goto L_0x0215
            L_0x01d4:
                int r9 = r5.f44856f
                if (r9 < 0) goto L_0x0243
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r10 = r10.f44781r
                int r10 = r10.getItemCount()
                if (r9 >= r10) goto L_0x0243
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r10 = r9.f44752a1
                boolean r10 = r10.f44838g
                if (r10 != 0) goto L_0x01f7
                androidx.recyclerview.widget.RecyclerView$e r9 = r9.f44781r
                int r10 = r5.f44856f
                int r9 = r9.getItemViewType(r10)
                int r10 = r5.f44859i
                if (r9 == r10) goto L_0x01f7
                goto L_0x0212
            L_0x01f7:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r9 = r9.f44781r
                boolean r9 = r9.hasStableIds()
                if (r9 == 0) goto L_0x0214
                long r9 = r5.f44858h
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r11 = r11.f44781r
                int r12 = r5.f44856f
                long r11 = r11.getItemId(r12)
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 != 0) goto L_0x0212
                goto L_0x0214
            L_0x0212:
                r9 = 0
                goto L_0x0215
            L_0x0214:
                r9 = 1
            L_0x0215:
                if (r9 != 0) goto L_0x0241
                if (r20 != 0) goto L_0x023f
                r9 = 4
                r5.mo17362i(r9)
                boolean r9 = r5.mo17371r()
                if (r9 == 0) goto L_0x0230
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r10 = r5.f44854d
                r9.removeDetachedView(r10, r8)
                androidx.recyclerview.widget.RecyclerView$r r9 = r5.f44867t
                r9.mo17349m(r5)
                goto L_0x023c
            L_0x0230:
                boolean r9 = r5.mo17378x()
                if (r9 == 0) goto L_0x023c
                int r9 = r5.f44863p
                r9 = r9 & -33
                r5.f44863p = r9
            L_0x023c:
                r6.mo17345i(r5)
            L_0x023f:
                r5 = 0
                goto L_0x0263
            L_0x0241:
                r0 = 1
                goto L_0x0263
            L_0x0243:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid view holder adapter position"
                r1.append(r2)
                r1.append(r5)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo17017B0()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0263:
                r9 = 2
                if (r5 != 0) goto L_0x043b
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r10 = r10.f44761g
                int r10 = r10.mo17469f(r3, r8)
                if (r10 < 0) goto L_0x03fd
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r11 = r11.f44781r
                int r11 = r11.getItemCount()
                if (r10 >= r11) goto L_0x03fd
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r11 = r11.f44781r
                int r11 = r11.getItemViewType(r10)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r12 = r12.f44781r
                boolean r12 = r12.hasStableIds()
                if (r12 == 0) goto L_0x0329
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r5 = r5.f44781r
                long r12 = r5.getItemId(r10)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r5 = r6.f44822a
                int r5 = r5.size()
                int r5 = r5 + r4
            L_0x029b:
                if (r5 < 0) goto L_0x02f6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r14 = r6.f44822a
                java.lang.Object r14 = r14.get(r5)
                androidx.recyclerview.widget.RecyclerView$z r14 = (androidx.recyclerview.widget.RecyclerView.C16631z) r14
                long r2 = r14.f44858h
                int r16 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r16 != 0) goto L_0x02f1
                boolean r2 = r14.mo17378x()
                if (r2 != 0) goto L_0x02f1
                int r2 = r14.f44859i
                if (r11 != r2) goto L_0x02cf
                r14.mo17362i(r1)
                boolean r1 = r14.mo17370q()
                if (r1 == 0) goto L_0x02cd
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r1 = r1.f44752a1
                boolean r1 = r1.f44838g
                if (r1 != 0) goto L_0x02cd
                int r1 = r14.f44863p
                r1 = r1 & -15
                r1 = r1 | r9
                r14.f44863p = r1
            L_0x02cd:
                r5 = r14
                goto L_0x0324
            L_0x02cf:
                if (r20 != 0) goto L_0x02f1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r2 = r6.f44822a
                r2.remove(r5)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r3 = r14.f44854d
                r2.removeDetachedView(r3, r8)
                android.view.View r2 = r14.f44854d
                androidx.recyclerview.widget.RecyclerView$z r2 = androidx.recyclerview.widget.RecyclerView.m15803Q0(r2)
                r3 = 0
                r2.f44867t = r3
                r2.f44868u = r8
                int r3 = r2.f44863p
                r3 = r3 & -33
                r2.f44863p = r3
                r6.mo17345i(r2)
            L_0x02f1:
                int r5 = r5 + -1
                r3 = r19
                goto L_0x029b
            L_0x02f6:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r1 = r6.f44824c
                int r1 = r1.size()
                int r1 = r1 + r4
            L_0x02fd:
                if (r1 < 0) goto L_0x0323
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r2 = r6.f44824c
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$z r2 = (androidx.recyclerview.widget.RecyclerView.C16631z) r2
                long r3 = r2.f44858h
                int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
                if (r5 != 0) goto L_0x0320
                int r3 = r2.f44859i
                if (r11 != r3) goto L_0x031a
                if (r20 != 0) goto L_0x0318
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r6.f44824c
                r3.remove(r1)
            L_0x0318:
                r5 = r2
                goto L_0x0324
            L_0x031a:
                if (r20 != 0) goto L_0x0320
                r6.mo17343g(r1)
                goto L_0x0323
            L_0x0320:
                int r1 = r1 + -1
                goto L_0x02fd
            L_0x0323:
                r5 = 0
            L_0x0324:
                if (r5 == 0) goto L_0x0329
                r5.f44856f = r10
                r0 = 1
            L_0x0329:
                if (r5 != 0) goto L_0x0380
                androidx.recyclerview.widget.RecyclerView$x r1 = r6.f44829h
                if (r1 == 0) goto L_0x0380
                r3 = r19
                android.view.View r1 = r1.mo17356a(r6, r3, r11)
                if (r1 == 0) goto L_0x0382
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r5 = r2.mo17031P0(r1)
                if (r5 == 0) goto L_0x0363
                boolean r1 = r5.mo17377w()
                if (r1 != 0) goto L_0x0346
                goto L_0x0382
            L_0x0346:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo17017B0()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0363:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo17017B0()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0380:
                r3 = r19
            L_0x0382:
                if (r5 != 0) goto L_0x0394
                androidx.recyclerview.widget.RecyclerView$q r1 = r18.mo17340d()
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.mo10383b(r11)
                if (r1 == 0) goto L_0x0393
                r1.mo17375u()
                int[] r2 = androidx.recyclerview.widget.RecyclerView.f44713r1
            L_0x0393:
                r5 = r1
            L_0x0394:
                if (r5 != 0) goto L_0x043b
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                long r1 = r1.getNanoTime()
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                int r10 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
                if (r10 == 0) goto L_0x03c0
                androidx.recyclerview.widget.RecyclerView$q r4 = r6.f44828g
                androidx.recyclerview.widget.RecyclerView$q$a r4 = r4.mo17335c(r11)
                long r4 = r4.f44820c
                int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
                if (r10 == 0) goto L_0x03bb
                long r4 = r4 + r1
                int r10 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
                if (r10 >= 0) goto L_0x03b9
                goto L_0x03bb
            L_0x03b9:
                r4 = 0
                goto L_0x03bc
            L_0x03bb:
                r4 = 1
            L_0x03bc:
                if (r4 != 0) goto L_0x03c0
                r4 = 0
                return r4
            L_0x03c0:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r5 = r4.f44781r
                androidx.recyclerview.widget.RecyclerView$z r4 = r5.createViewHolder(r4, r11)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f44717v1
                if (r5 == 0) goto L_0x03db
                android.view.View r5 = r4.f44854d
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m15802H0(r5)
                if (r5 == 0) goto L_0x03db
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r4.f44855e = r10
            L_0x03db:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r14 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r5 = r6.f44828g
                long r14 = r14 - r1
                androidx.recyclerview.widget.RecyclerView$q$a r1 = r5.mo17335c(r11)
                long r10 = r1.f44820c
                int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r2 != 0) goto L_0x03ef
                goto L_0x03f8
            L_0x03ef:
                r12 = 4
                long r10 = r10 / r12
                r16 = 3
                long r10 = r10 * r16
                long r14 = r14 / r12
                long r14 = r14 + r10
            L_0x03f8:
                r1.f44820c = r14
                r10 = r0
                r11 = r4
                goto L_0x043d
            L_0x03fd:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r10)
                java.lang.String r2 = ")."
                r1.append(r2)
                java.lang.String r2 = "state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f44752a1
                int r2 = r2.mo17354b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo17017B0()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x043b:
                r10 = r0
                r11 = r5
            L_0x043d:
                if (r10 == 0) goto L_0x0477
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f44752a1
                boolean r0 = r0.f44838g
                if (r0 != 0) goto L_0x0477
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r0 = r11.mo17367n(r0)
                if (r0 == 0) goto L_0x0477
                int r0 = r11.f44863p
                r0 = r0 & -8193(0xffffffffffffdfff, float:NaN)
                r0 = r0 | r8
                r11.f44863p = r0
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f44752a1
                boolean r0 = r0.f44841j
                if (r0 == 0) goto L_0x0477
                int r0 = androidx.recyclerview.widget.RecyclerView.C16616j.m15901e(r11)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r2 = r1.f44739S
                androidx.recyclerview.widget.RecyclerView$w r1 = r1.f44752a1
                java.util.List r4 = r11.mo17366m()
                androidx.recyclerview.widget.RecyclerView$j$c r0 = r2.mo17328q(r1, r11, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo17086h1(r11, r0)
            L_0x0477:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f44752a1
                boolean r0 = r0.f44838g
                if (r0 == 0) goto L_0x0488
                boolean r0 = r11.mo17368o()
                if (r0 == 0) goto L_0x0488
                r11.f44860j = r3
                goto L_0x049f
            L_0x0488:
                boolean r0 = r11.mo17368o()
                if (r0 == 0) goto L_0x04a1
                int r0 = r11.f44863p
                r0 = r0 & r9
                if (r0 == 0) goto L_0x0495
                r0 = 1
                goto L_0x0496
            L_0x0495:
                r0 = 0
            L_0x0496:
                if (r0 != 0) goto L_0x04a1
                boolean r0 = r11.mo17369p()
                if (r0 == 0) goto L_0x049f
                goto L_0x04a1
            L_0x049f:
                r0 = 0
                goto L_0x04b4
            L_0x04a1:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f44761g
                int r2 = r0.mo17469f(r3, r8)
                r0 = r18
                r1 = r11
                r3 = r19
                r4 = r21
                boolean r0 = r0.mo17347k(r1, r2, r3, r4)
            L_0x04b4:
                android.view.View r1 = r11.f44854d
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x04ca
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r11.f44854d
                r2.setLayoutParams(r1)
                goto L_0x04e2
            L_0x04ca:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x04e0
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r11.f44854d
                r2.setLayoutParams(r1)
                goto L_0x04e2
            L_0x04e0:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L_0x04e2:
                r1.f44798d = r11
                if (r10 == 0) goto L_0x04e9
                if (r0 == 0) goto L_0x04e9
                goto L_0x04ea
            L_0x04e9:
                r7 = 0
            L_0x04ea:
                r1.f44801g = r7
                return r11
            L_0x04ed:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f44752a1
                int r2 = r2.mo17354b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo17017B0()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C16625r.mo17348l(int, boolean, long):androidx.recyclerview.widget.RecyclerView$z");
        }

        /* renamed from: m */
        public void mo17349m(C16631z zVar) {
            if (zVar.f44868u) {
                this.f44823b.remove(zVar);
            } else {
                this.f44822a.remove(zVar);
            }
            zVar.f44867t = null;
            zVar.f44868u = false;
            zVar.f44863p &= -33;
        }

        /* renamed from: n */
        public void mo17350n() {
            LayoutManager layoutManager = RecyclerView.this.f44782s;
            this.f44827f = this.f44826e + (layoutManager != null ? layoutManager.mPrefetchMaxCountObserved : 0);
            for (int size = this.f44824c.size() - 1; size >= 0 && this.f44824c.size() > this.f44827f; size--) {
                mo17343g(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C16626s {
        /* renamed from: a */
        void mo17351a(C16631z zVar);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public class C16627t extends C16615g {
        public C16627t() {
        }

        /* renamed from: b */
        public void mo2556b() {
            RecyclerView.this.mo17094k0((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f44752a1.f44837f = true;
            recyclerView.mo17065g1(true);
            if (!RecyclerView.this.f44761g.mo17470g()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            RecyclerView.this.mo17094k0((String) null);
            C16644a aVar = RecyclerView.this.f44761g;
            boolean z = false;
            if (i2 < 1) {
                aVar.getClass();
            } else {
                aVar.f44943b.add(aVar.mo17471h(4, i, i2, obj));
                aVar.f44947f |= 4;
                if (aVar.f44943b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                mo17352h();
            }
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            RecyclerView.this.mo17094k0((String) null);
            C16644a aVar = RecyclerView.this.f44761g;
            boolean z = false;
            if (i2 < 1) {
                aVar.getClass();
            } else {
                aVar.f44943b.add(aVar.mo17471h(1, i, i2, (Object) null));
                aVar.f44947f |= 1;
                if (aVar.f44943b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                mo17352h();
            }
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            RecyclerView.this.mo17094k0((String) null);
            C16644a aVar = RecyclerView.this.f44761g;
            aVar.getClass();
            boolean z = false;
            if (i != i2) {
                if (i3 == 1) {
                    aVar.f44943b.add(aVar.mo17471h(8, i, i2, (Object) null));
                    aVar.f44947f |= 8;
                    if (aVar.f44943b.size() == 1) {
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
            }
            if (z) {
                mo17352h();
            }
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            RecyclerView.this.mo17094k0((String) null);
            C16644a aVar = RecyclerView.this.f44761g;
            boolean z = false;
            if (i2 < 1) {
                aVar.getClass();
            } else {
                aVar.f44943b.add(aVar.mo17471h(2, i, i2, (Object) null));
                aVar.f44947f |= 2;
                if (aVar.f44943b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                mo17352h();
            }
        }

        /* renamed from: h */
        public void mo17352h() {
            if (RecyclerView.f44716u1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f44789y && recyclerView.f44787x) {
                    Runnable runnable = recyclerView.f44772n;
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145185m(recyclerView, runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f44725F = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static class C16628w {

        /* renamed from: a */
        public int f44832a = -1;

        /* renamed from: b */
        public int f44833b = 0;

        /* renamed from: c */
        public int f44834c = 0;

        /* renamed from: d */
        public int f44835d = 1;

        /* renamed from: e */
        public int f44836e = 0;

        /* renamed from: f */
        public boolean f44837f = false;

        /* renamed from: g */
        public boolean f44838g = false;

        /* renamed from: h */
        public boolean f44839h = false;

        /* renamed from: i */
        public boolean f44840i = false;

        /* renamed from: j */
        public boolean f44841j = false;

        /* renamed from: k */
        public boolean f44842k = false;

        /* renamed from: l */
        public int f44843l;

        /* renamed from: m */
        public long f44844m;

        /* renamed from: n */
        public int f44845n;

        /* renamed from: a */
        public void mo17353a(int i) {
            if ((this.f44835d & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f44835d));
            }
        }

        /* renamed from: b */
        public int mo17354b() {
            return this.f44838g ? this.f44833b - this.f44834c : this.f44836e;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f44832a + ", mData=" + null + ", mItemCount=" + this.f44836e + ", mIsMeasuring=" + this.f44840i + ", mPreviousLayoutItemCount=" + this.f44833b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f44834c + ", mStructureChanged=" + this.f44837f + ", mInPreLayout=" + this.f44838g + ", mRunSimpleAnimations=" + this.f44841j + ", mRunPredictiveAnimations=" + this.f44842k + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static abstract class C16629x {
        /* renamed from: a */
        public abstract View mo17356a(C16625r rVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public class C16630y implements Runnable {

        /* renamed from: d */
        public int f44846d;

        /* renamed from: e */
        public int f44847e;

        /* renamed from: f */
        public OverScroller f44848f;

        /* renamed from: g */
        public Interpolator f44849g;

        /* renamed from: h */
        public boolean f44850h = false;

        /* renamed from: i */
        public boolean f44851i = false;

        public C16630y() {
            Interpolator interpolator = RecyclerView.f44719x1;
            this.f44849g = interpolator;
            this.f44848f = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public final int mo17357a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float sin = f2 + (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: b */
        public void mo17358b() {
            if (this.f44850h) {
                this.f44851i = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145185m(recyclerView, this);
        }

        /* renamed from: c */
        public void mo17359c(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f44849g != interpolator) {
                this.f44849g = interpolator;
                this.f44848f = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f44847e = 0;
            this.f44846d = 0;
            this.f44848f.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.f44848f.computeScrollOffset();
            }
            mo17358b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e8, code lost:
            if (r9 > 0) goto L_0x00ec;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r23 = this;
                r0 = r23
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r1.f44782s
                if (r2 != 0) goto L_0x0011
                r1.removeCallbacks(r0)
                android.widget.OverScroller r1 = r0.f44848f
                r1.abortAnimation()
                return
            L_0x0011:
                r2 = 0
                r0.f44851i = r2
                r3 = 1
                r0.f44850h = r3
                r1.mo17101o0()
                android.widget.OverScroller r1 = r0.f44848f
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.f44782s
                androidx.recyclerview.widget.RecyclerView$v r4 = r4.mSmoothScroller
                boolean r5 = r1.computeScrollOffset()
                if (r5 == 0) goto L_0x01c8
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                int[] r5 = r5.f44770l1
                int r12 = r1.getCurrX()
                int r13 = r1.getCurrY()
                int r6 = r0.f44846d
                int r14 = r12 - r6
                int r6 = r0.f44847e
                int r15 = r13 - r6
                r0.f44846d = r12
                r0.f44847e = r13
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r10 = 0
                r11 = 1
                r7 = r14
                r8 = r15
                r9 = r5
                boolean r6 = r6.mo17150u0(r7, r8, r9, r10, r11)
                if (r6 == 0) goto L_0x0053
                r6 = r5[r2]
                int r14 = r14 - r6
                r5 = r5[r3]
                int r15 = r15 - r5
            L_0x0053:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r6 = r5.f44781r
                if (r6 == 0) goto L_0x0097
                int[] r6 = r5.f44773n1
                r5.mo17113q1(r14, r15, r6)
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                int[] r6 = r5.f44773n1
                r7 = r6[r2]
                r6 = r6[r3]
                int r8 = r14 - r7
                int r9 = r15 - r6
                if (r4 == 0) goto L_0x009b
                boolean r10 = r4.f44875d
                if (r10 != 0) goto L_0x009b
                boolean r10 = r4.f44876e
                if (r10 == 0) goto L_0x009b
                androidx.recyclerview.widget.RecyclerView$w r5 = r5.f44752a1
                int r5 = r5.mo17354b()
                if (r5 != 0) goto L_0x0080
                r4.mo17386g()
                goto L_0x009b
            L_0x0080:
                int r10 = r4.f44872a
                if (r10 < r5) goto L_0x008f
                int r5 = r5 - r3
                r4.f44872a = r5
                int r5 = r14 - r8
                int r10 = r15 - r9
                r4.mo17381b(r5, r10)
                goto L_0x009b
            L_0x008f:
                int r5 = r14 - r8
                int r10 = r15 - r9
                r4.mo17381b(r5, r10)
                goto L_0x009b
            L_0x0097:
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
            L_0x009b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$l> r5 = r5.f44784u
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L_0x00aa
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                r5.invalidate()
            L_0x00aa:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                int r5 = r5.getOverScrollMode()
                r10 = 2
                if (r5 == r10) goto L_0x00b8
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                r5.mo17099n0(r14, r15)
            L_0x00b8:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                r21 = 0
                r22 = 1
                r16 = r5
                r17 = r7
                r18 = r6
                r19 = r8
                r20 = r9
                boolean r5 = r16.mo17152v0(r17, r18, r19, r20, r21, r22)
                if (r5 != 0) goto L_0x0146
                if (r8 != 0) goto L_0x00d2
                if (r9 == 0) goto L_0x0146
            L_0x00d2:
                float r5 = r1.getCurrVelocity()
                int r5 = (int) r5
                if (r8 == r12) goto L_0x00e1
                if (r8 >= 0) goto L_0x00dd
                int r11 = -r5
                goto L_0x00e2
            L_0x00dd:
                if (r8 <= 0) goto L_0x00e1
                r11 = r5
                goto L_0x00e2
            L_0x00e1:
                r11 = 0
            L_0x00e2:
                if (r9 == r13) goto L_0x00eb
                if (r9 >= 0) goto L_0x00e8
                int r5 = -r5
                goto L_0x00ec
            L_0x00e8:
                if (r9 <= 0) goto L_0x00eb
                goto L_0x00ec
            L_0x00eb:
                r5 = 0
            L_0x00ec:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                int r2 = r2.getOverScrollMode()
                if (r2 == r10) goto L_0x012f
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                if (r11 >= 0) goto L_0x0102
                r2.mo17157y0()
                android.widget.EdgeEffect r10 = r2.f44733N
                int r3 = -r11
                r10.onAbsorb(r3)
                goto L_0x010c
            L_0x0102:
                if (r11 <= 0) goto L_0x010c
                r2.mo17158z0()
                android.widget.EdgeEffect r3 = r2.f44735Q
                r3.onAbsorb(r11)
            L_0x010c:
                if (r5 >= 0) goto L_0x0118
                r2.mo17016A0()
                android.widget.EdgeEffect r3 = r2.f44734P
                int r10 = -r5
                r3.onAbsorb(r10)
                goto L_0x0126
            L_0x0118:
                if (r5 <= 0) goto L_0x0123
                r2.mo17156x0()
                android.widget.EdgeEffect r3 = r2.f44737R
                r3.onAbsorb(r5)
                goto L_0x0126
            L_0x0123:
                r2.getClass()
            L_0x0126:
                if (r11 != 0) goto L_0x012a
                if (r5 == 0) goto L_0x012f
            L_0x012a:
                java.util.WeakHashMap<android.view.View, e3.a0> r3 = p849e3.C107207u.f320808a
                p849e3.C107207u.C107208b.m145183k(r2)
            L_0x012f:
                if (r11 != 0) goto L_0x0139
                if (r8 == r12) goto L_0x0139
                int r2 = r1.getFinalX()
                if (r2 != 0) goto L_0x0146
            L_0x0139:
                if (r5 != 0) goto L_0x0143
                if (r9 == r13) goto L_0x0143
                int r2 = r1.getFinalY()
                if (r2 != 0) goto L_0x0146
            L_0x0143:
                r1.abortAnimation()
            L_0x0146:
                if (r7 != 0) goto L_0x014a
                if (r6 == 0) goto L_0x014f
            L_0x014a:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                r2.mo17154w0(r7, r6)
            L_0x014f:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.awakenScrollBars()
                if (r2 != 0) goto L_0x015c
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                r2.invalidate()
            L_0x015c:
                if (r15 == 0) goto L_0x016c
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.f44782s
                boolean r2 = r2.canScrollVertically()
                if (r2 == 0) goto L_0x016c
                if (r6 != r15) goto L_0x016c
                r2 = 1
                goto L_0x016d
            L_0x016c:
                r2 = 0
            L_0x016d:
                if (r14 == 0) goto L_0x017d
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.f44782s
                boolean r3 = r3.canScrollHorizontally()
                if (r3 == 0) goto L_0x017d
                if (r7 != r14) goto L_0x017d
                r3 = 1
                goto L_0x017e
            L_0x017d:
                r3 = 0
            L_0x017e:
                if (r14 != 0) goto L_0x0182
                if (r15 == 0) goto L_0x0189
            L_0x0182:
                if (r3 != 0) goto L_0x0189
                if (r2 == 0) goto L_0x0187
                goto L_0x0189
            L_0x0187:
                r2 = 0
                goto L_0x018a
            L_0x0189:
                r2 = 1
            L_0x018a:
                boolean r1 = r1.isFinished()
                if (r1 != 0) goto L_0x01a9
                if (r2 != 0) goto L_0x019c
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r2 = 1
                boolean r1 = r1.mo17034U0(r2)
                if (r1 != 0) goto L_0x019c
                goto L_0x01a9
            L_0x019c:
                r23.mo17358b()
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.o r2 = r1.f44750Y0
                if (r2 == 0) goto L_0x01c8
                r2.mo17520a(r1, r14, r15)
                goto L_0x01c8
            L_0x01a9:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r2 = 0
                r1.setScrollState(r2)
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f44717v1
                if (r1 == 0) goto L_0x01c2
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.o$b r1 = r1.f44751Z0
                int[] r2 = r1.f45009c
                if (r2 == 0) goto L_0x01bf
                r3 = -1
                java.util.Arrays.fill(r2, r3)
            L_0x01bf:
                r2 = 0
                r1.f45010d = r2
            L_0x01c2:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r2 = 1
                r1.mo17026L(r2)
            L_0x01c8:
                if (r4 == 0) goto L_0x01dc
                boolean r1 = r4.f44875d
                if (r1 == 0) goto L_0x01d3
                r1 = 0
                r4.mo17381b(r1, r1)
                goto L_0x01d4
            L_0x01d3:
                r1 = 0
            L_0x01d4:
                boolean r2 = r0.f44851i
                if (r2 != 0) goto L_0x01dd
                r4.mo17386g()
                goto L_0x01dd
            L_0x01dc:
                r1 = 0
            L_0x01dd:
                r0.f44850h = r1
                boolean r1 = r0.f44851i
                if (r1 == 0) goto L_0x01e6
                r23.mo17358b()
            L_0x01e6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C16630y.run():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C16631z {

        /* renamed from: y */
        public static final List<Object> f44853y = Collections.emptyList();

        /* renamed from: d */
        public final View f44854d;

        /* renamed from: e */
        public WeakReference<RecyclerView> f44855e;

        /* renamed from: f */
        public int f44856f = -1;

        /* renamed from: g */
        public int f44857g = -1;

        /* renamed from: h */
        public long f44858h = -1;

        /* renamed from: i */
        public int f44859i = -1;

        /* renamed from: j */
        public int f44860j = -1;

        /* renamed from: n */
        public C16631z f44861n = null;

        /* renamed from: o */
        public C16631z f44862o = null;

        /* renamed from: p */
        public int f44863p;

        /* renamed from: q */
        public List<Object> f44864q = null;

        /* renamed from: r */
        public List<Object> f44865r = null;

        /* renamed from: s */
        public int f44866s = 0;

        /* renamed from: t */
        public C16625r f44867t = null;

        /* renamed from: u */
        public boolean f44868u = false;

        /* renamed from: v */
        public int f44869v = 0;

        /* renamed from: w */
        public int f44870w = -1;

        /* renamed from: x */
        public RecyclerView f44871x;

        public C16631z(View view) {
            if (view != null) {
                this.f44854d = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: h */
        public void mo17361h(Object obj) {
            if (obj == null) {
                mo17362i(1024);
            } else if ((1024 & this.f44863p) == 0) {
                if (this.f44864q == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f44864q = arrayList;
                    this.f44865r = Collections.unmodifiableList(arrayList);
                }
                ((ArrayList) this.f44864q).add(obj);
            }
        }

        /* renamed from: i */
        public void mo17362i(int i) {
            this.f44863p = i | this.f44863p;
        }

        /* renamed from: j */
        public final int mo17363j() {
            RecyclerView recyclerView = this.f44871x;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo17027L0(this);
        }

        /* renamed from: k */
        public final int mo17364k() {
            int i = this.f44860j;
            return i == -1 ? this.f44856f : i;
        }

        @Deprecated
        /* renamed from: l */
        public final int mo17365l() {
            int i = this.f44860j;
            return i == -1 ? this.f44856f : i;
        }

        /* renamed from: m */
        public List<Object> mo17366m() {
            if ((this.f44863p & 1024) != 0) {
                return f44853y;
            }
            List<Object> list = this.f44864q;
            return (list == null || ((ArrayList) list).size() == 0) ? f44853y : this.f44865r;
        }

        /* renamed from: n */
        public boolean mo17367n(int i) {
            return (i & this.f44863p) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo17368o() {
            return (this.f44863p & 1) != 0;
        }

        /* renamed from: p */
        public boolean mo17369p() {
            return (this.f44863p & 4) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo17370q() {
            return (this.f44863p & 8) != 0;
        }

        /* renamed from: r */
        public boolean mo17371r() {
            return this.f44867t != null;
        }

        /* renamed from: s */
        public boolean mo17372s() {
            return (this.f44863p & 256) != 0;
        }

        /* renamed from: t */
        public void mo17373t(int i, boolean z) {
            if (this.f44857g == -1) {
                this.f44857g = this.f44856f;
            }
            if (this.f44860j == -1) {
                this.f44860j = this.f44856f;
            }
            if (z) {
                this.f44860j += i;
            }
            this.f44856f += i;
            if (this.f44854d.getLayoutParams() != null) {
                ((LayoutParams) this.f44854d.getLayoutParams()).f44800f = true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "ViewHolder{"
                r1.append(r2)
                int r2 = r5.hashCode()
                java.lang.String r2 = java.lang.Integer.toHexString(r2)
                r1.append(r2)
                java.lang.String r2 = " position="
                r1.append(r2)
                int r2 = r5.f44856f
                r1.append(r2)
                java.lang.String r2 = " id="
                r1.append(r2)
                long r2 = r5.f44858h
                r1.append(r2)
                java.lang.String r2 = ", oldPos="
                r1.append(r2)
                int r2 = r5.f44857g
                r1.append(r2)
                java.lang.String r2 = ", pLpos:"
                r1.append(r2)
                int r2 = r5.f44860j
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                boolean r1 = r5.mo17371r()
                if (r1 == 0) goto L_0x005d
                java.lang.String r1 = " scrap "
                r0.append(r1)
                boolean r1 = r5.f44868u
                if (r1 == 0) goto L_0x0058
                java.lang.String r1 = "[changeScrap]"
                goto L_0x005a
            L_0x0058:
                java.lang.String r1 = "[attachedScrap]"
            L_0x005a:
                r0.append(r1)
            L_0x005d:
                boolean r1 = r5.mo17369p()
                if (r1 == 0) goto L_0x0068
                java.lang.String r1 = " invalid"
                r0.append(r1)
            L_0x0068:
                boolean r1 = r5.mo17368o()
                if (r1 != 0) goto L_0x0073
                java.lang.String r1 = " unbound"
                r0.append(r1)
            L_0x0073:
                int r1 = r5.f44863p
                r1 = r1 & 2
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x007d
                r1 = 1
                goto L_0x007e
            L_0x007d:
                r1 = 0
            L_0x007e:
                if (r1 == 0) goto L_0x0085
                java.lang.String r1 = " update"
                r0.append(r1)
            L_0x0085:
                boolean r1 = r5.mo17370q()
                if (r1 == 0) goto L_0x0090
                java.lang.String r1 = " removed"
                r0.append(r1)
            L_0x0090:
                boolean r1 = r5.mo17377w()
                if (r1 == 0) goto L_0x009b
                java.lang.String r1 = " ignored"
                r0.append(r1)
            L_0x009b:
                boolean r1 = r5.mo17372s()
                if (r1 == 0) goto L_0x00a6
                java.lang.String r1 = " tmpDetached"
                r0.append(r1)
            L_0x00a6:
                int r1 = r5.f44863p
                r1 = r1 & 16
                if (r1 != 0) goto L_0x00b8
                android.view.View r1 = r5.f44854d
                java.util.WeakHashMap<android.view.View, e3.a0> r4 = p849e3.C107207u.f320808a
                boolean r1 = p849e3.C107207u.C107208b.m145181i(r1)
                if (r1 != 0) goto L_0x00b8
                r1 = 1
                goto L_0x00b9
            L_0x00b8:
                r1 = 0
            L_0x00b9:
                if (r1 != 0) goto L_0x00d6
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = " not recyclable("
                r1.append(r4)
                int r4 = r5.f44866s
                r1.append(r4)
                java.lang.String r4 = ")"
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00d6:
                int r1 = r5.f44863p
                r1 = r1 & 512(0x200, float:7.175E-43)
                if (r1 != 0) goto L_0x00e4
                boolean r1 = r5.mo17369p()
                if (r1 == 0) goto L_0x00e3
                goto L_0x00e4
            L_0x00e3:
                r2 = 0
            L_0x00e4:
                if (r2 == 0) goto L_0x00eb
                java.lang.String r1 = " undefined adapter position"
                r0.append(r1)
            L_0x00eb:
                android.view.View r1 = r5.f44854d
                android.view.ViewParent r1 = r1.getParent()
                if (r1 != 0) goto L_0x00f8
                java.lang.String r1 = " no parent"
                r0.append(r1)
            L_0x00f8:
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C16631z.toString():java.lang.String");
        }

        /* renamed from: u */
        public void mo17375u() {
            this.f44863p = 0;
            this.f44856f = -1;
            this.f44857g = -1;
            this.f44858h = -1;
            this.f44860j = -1;
            this.f44866s = 0;
            this.f44861n = null;
            this.f44862o = null;
            List<Object> list = this.f44864q;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            this.f44863p &= -1025;
            this.f44869v = 0;
            this.f44870w = -1;
            RecyclerView.m15809l0(this);
        }

        /* renamed from: v */
        public final void mo17376v(boolean z) {
            int i = this.f44866s;
            int i2 = z ? i - 1 : i + 1;
            this.f44866s = i2;
            if (i2 < 0) {
                this.f44866s = 0;
                toString();
            } else if (!z && i2 == 1) {
                this.f44863p |= 16;
            } else if (z && i2 == 0) {
                this.f44863p &= -17;
            }
        }

        /* renamed from: w */
        public boolean mo17377w() {
            return (this.f44863p & 128) != 0;
        }

        /* renamed from: x */
        public boolean mo17378x() {
            return (this.f44863p & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static class C16632i {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C16633n {
        /* renamed from: a */
        public abstract boolean mo17379a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static abstract class C16634v {

        /* renamed from: a */
        public int f44872a = -1;

        /* renamed from: b */
        public RecyclerView f44873b;

        /* renamed from: c */
        public LayoutManager f44874c;

        /* renamed from: d */
        public boolean f44875d;

        /* renamed from: e */
        public boolean f44876e;

        /* renamed from: f */
        public View f44877f;

        /* renamed from: g */
        public final C16635a f44878g = new C16635a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        public static class C16635a {

            /* renamed from: a */
            public int f44879a;

            /* renamed from: b */
            public int f44880b;

            /* renamed from: c */
            public int f44881c;

            /* renamed from: d */
            public int f44882d = -1;

            /* renamed from: e */
            public Interpolator f44883e;

            /* renamed from: f */
            public boolean f44884f = false;

            public C16635a(int i, int i2) {
                this.f44879a = i;
                this.f44880b = i2;
                this.f44881c = Integer.MIN_VALUE;
                this.f44883e = null;
            }

            /* renamed from: a */
            public void mo17387a(RecyclerView recyclerView) {
                int i = this.f44882d;
                if (i >= 0) {
                    this.f44882d = -1;
                    recyclerView.mo17037X0(i);
                    this.f44884f = false;
                } else if (this.f44884f) {
                    Interpolator interpolator = this.f44883e;
                    if (interpolator == null || this.f44881c >= 1) {
                        int i2 = this.f44881c;
                        if (i2 >= 1) {
                            if (interpolator != null) {
                                recyclerView.f44749X0.mo17359c(this.f44879a, this.f44880b, i2, interpolator);
                            } else if (i2 == Integer.MIN_VALUE) {
                                C16630y yVar = recyclerView.f44749X0;
                                int i3 = this.f44879a;
                                int i4 = this.f44880b;
                                yVar.mo17359c(i3, i4, yVar.mo17357a(i3, i4, 0, 0), RecyclerView.f44719x1);
                            } else {
                                C16630y yVar2 = recyclerView.f44749X0;
                                int i5 = this.f44879a;
                                int i6 = this.f44880b;
                                yVar2.getClass();
                                yVar2.mo17359c(i5, i6, i2, RecyclerView.f44719x1);
                            }
                            this.f44884f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
            }

            /* renamed from: b */
            public void mo17388b(int i, int i2, int i3, Interpolator interpolator) {
                this.f44879a = i;
                this.f44880b = i2;
                this.f44881c = i3;
                this.f44883e = interpolator;
                this.f44884f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$b */
        public interface C16636b {
            /* renamed from: f */
            PointF mo16988f(int i);
        }

        /* renamed from: a */
        public PointF mo17380a(int i) {
            LayoutManager layoutManager = this.f44874c;
            if (layoutManager instanceof C16636b) {
                return ((C16636b) layoutManager).mo16988f(i);
            }
            return null;
        }

        /* renamed from: b */
        public void mo17381b(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f44873b;
            if (!this.f44876e || this.f44872a == -1 || recyclerView == null) {
                mo17386g();
            }
            if (this.f44875d && this.f44877f == null && this.f44874c != null && (a = mo17380a(this.f44872a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.mo17113q1((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            boolean z = false;
            this.f44875d = false;
            View view = this.f44877f;
            if (view != null) {
                if (this.f44873b.mo17030O0(view) == this.f44872a) {
                    mo17385f(this.f44877f, recyclerView.f44752a1, this.f44878g);
                    this.f44878g.mo17387a(recyclerView);
                    mo17386g();
                } else {
                    this.f44877f = null;
                }
            }
            if (this.f44876e) {
                mo17382c(i, i2, recyclerView.f44752a1, this.f44878g);
                C16635a aVar = this.f44878g;
                if (aVar.f44882d >= 0) {
                    z = true;
                }
                aVar.mo17387a(recyclerView);
                if (!z) {
                    return;
                }
                if (this.f44876e) {
                    this.f44875d = true;
                    recyclerView.f44749X0.mo17358b();
                    return;
                }
                mo17386g();
            }
        }

        /* renamed from: c */
        public abstract void mo17382c(int i, int i2, C16628w wVar, C16635a aVar);

        /* renamed from: d */
        public abstract void mo17383d();

        /* renamed from: e */
        public abstract void mo17384e();

        /* renamed from: f */
        public abstract void mo17385f(View view, C16628w wVar, C16635a aVar);

        /* renamed from: g */
        public final void mo17386g() {
            if (this.f44876e) {
                this.f44876e = false;
                mo17384e();
                this.f44873b.f44752a1.f44832a = -1;
                this.f44877f = null;
                this.f44872a = -1;
                this.f44875d = false;
                this.f44874c.onSmoothScrollerStopped(this);
                this.f44874c = null;
                this.f44873b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public static class C16637c implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            f44713r1 = r1
            int[] r1 = new int[r0]
            r3 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r2] = r3
            f44714s1 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            f44715t1 = r1
            f44716u1 = r0
            f44717v1 = r0
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f44718w1 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f44719x1 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: H0 */
    public static RecyclerView m15802H0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView H0 = m15802H0(viewGroup.getChildAt(i));
            if (H0 != null) {
                return H0;
            }
        }
        return null;
    }

    /* renamed from: Q0 */
    public static C16631z m15803Q0(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f44798d;
    }

    /* renamed from: R0 */
    public static void m15804R0(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f44799e;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    private C107200l getScrollingChildHelper() {
        if (this.f44768j1 == null) {
            this.f44768j1 = new C107200l(this);
        }
        return this.f44768j1;
    }

    /* renamed from: l0 */
    public static void m15809l0(C16631z zVar) {
        WeakReference<RecyclerView> weakReference = zVar.f44855e;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != zVar.f44854d) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            zVar.f44855e = null;
        }
    }

    /* renamed from: A0 */
    public void mo17016A0() {
        if (this.f44734P == null) {
            this.f44732M.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f44734P = edgeEffect;
            if (this.f44767j) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: B0 */
    public String mo17017B0() {
        return " " + super.toString() + ", adapter:" + this.f44781r + ", layout:" + this.f44782s + ", context:" + getContext();
    }

    /* renamed from: C0 */
    public final void mo17018C0(C16628w wVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f44749X0.f44848f;
            overScroller.getFinalX();
            overScroller.getCurrX();
            wVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        wVar.getClass();
    }

    /* renamed from: D0 */
    public View mo17019D0(float f, float f2) {
        for (int e = this.f44763h.mo17490e() - 1; e >= 0; e--) {
            View d = this.f44763h.mo17489d(e);
            float translationX = d.getTranslationX();
            float translationY = d.getTranslationY();
            if (f >= ((float) d.getLeft()) + translationX && f <= ((float) d.getRight()) + translationX && f2 >= ((float) d.getTop()) + translationY && f2 <= ((float) d.getBottom()) + translationY) {
                return d;
            }
        }
        return null;
    }

    /* renamed from: E0 */
    public View mo17020E0(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* renamed from: F0 */
    public C16631z mo17021F0(View view) {
        View E0 = mo17020E0(view);
        if (E0 == null) {
            return null;
        }
        return mo17031P0(E0);
    }

    /* renamed from: G0 */
    public final void mo17022G0(int[] iArr) {
        int e = this.f44763h.mo17490e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            C16631z Q0 = m15803Q0(this.f44763h.mo17489d(i3));
            if (!Q0.mo17377w()) {
                int k = Q0.mo17364k();
                if (k < i) {
                    i = k;
                }
                if (k > i2) {
                    i2 = k;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: I0 */
    public C16631z mo17023I0(int i) {
        C16631z zVar = null;
        if (this.f44728I) {
            return null;
        }
        int h = this.f44763h.mo17493h();
        for (int i2 = 0; i2 < h; i2++) {
            C16631z Q0 = m15803Q0(this.f44763h.mo17492g(i2));
            if (Q0 != null && !Q0.mo17370q() && mo17027L0(Q0) == i) {
                if (!this.f44763h.mo17496k(Q0.f44854d)) {
                    return Q0;
                }
                zVar = Q0;
            }
        }
        return zVar;
    }

    /* renamed from: J0 */
    public C16631z mo17024J0(int i, boolean z) {
        int h = this.f44763h.mo17493h();
        C16631z zVar = null;
        for (int i2 = 0; i2 < h; i2++) {
            C16631z Q0 = m15803Q0(this.f44763h.mo17492g(i2));
            if (Q0 != null && !Q0.mo17370q()) {
                if (z) {
                    if (Q0.f44856f != i) {
                        continue;
                    }
                } else if (Q0.mo17364k() != i) {
                    continue;
                }
                if (!this.f44763h.mo17496k(Q0.f44854d)) {
                    return Q0;
                }
                zVar = Q0;
            }
        }
        return zVar;
    }

    /* renamed from: K0 */
    public boolean mo17025K0(int i, int i2) {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager == null || this.f44722C) {
            return false;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.f44782s.canScrollVertically();
        int i3 = (!canScrollHorizontally || Math.abs(i) < this.f44740S0) ? 0 : i;
        int i4 = (!canScrollVertically || Math.abs(i2) < this.f44740S0) ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = canScrollHorizontally || canScrollVertically;
            dispatchNestedFling(f, f2, z);
            C16633n nVar = this.f44738R0;
            if (nVar != null && nVar.mo17379a(i3, i4)) {
                return true;
            }
            if (z) {
                if (canScrollVertically) {
                    canScrollHorizontally |= true;
                }
                getScrollingChildHelper().mo157673j(canScrollHorizontally ? 1 : 0, 1);
                int i5 = this.f44742T0;
                int max = Math.max(-i5, Math.min(i3, i5));
                int i6 = this.f44742T0;
                int max2 = Math.max(-i6, Math.min(i4, i6));
                C16630y yVar = this.f44749X0;
                RecyclerView.this.setScrollState(2);
                yVar.f44847e = 0;
                yVar.f44846d = 0;
                yVar.f44848f.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                yVar.mo17358b();
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public void mo17026L(int i) {
        getScrollingChildHelper().mo157674k(i);
    }

    /* renamed from: L0 */
    public int mo17027L0(C16631z zVar) {
        if (zVar.mo17367n(EasyGoCode.InvokedErrCode.SECURITY_EXCEPTION) || !zVar.mo17368o()) {
            return -1;
        }
        C16644a aVar = this.f44761g;
        int i = zVar.f44856f;
        int size = aVar.f44943b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16644a.C16646b bVar = aVar.f44943b.get(i2);
            int i3 = bVar.f44948a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f44949b;
                    if (i4 <= i) {
                        int i5 = bVar.f44951d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f44949b;
                    if (i6 == i) {
                        i = bVar.f44951d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f44951d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f44949b <= i) {
                i += bVar.f44951d;
            }
        }
        return i;
    }

    /* renamed from: M0 */
    public long mo17028M0(C16631z zVar) {
        return this.f44781r.hasStableIds() ? zVar.f44858h : (long) zVar.f44856f;
    }

    /* renamed from: N0 */
    public int mo17029N0(View view) {
        C16631z Q0 = m15803Q0(view);
        if (Q0 != null) {
            return Q0.mo17363j();
        }
        return -1;
    }

    /* renamed from: O0 */
    public int mo17030O0(View view) {
        C16631z Q0 = m15803Q0(view);
        if (Q0 != null) {
            return Q0.mo17364k();
        }
        return -1;
    }

    /* renamed from: P0 */
    public C16631z mo17031P0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m15803Q0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: S0 */
    public Rect mo17032S0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f44800f) {
            return layoutParams.f44799e;
        }
        if (this.f44752a1.f44838g && (layoutParams.mo17281c() || layoutParams.f44798d.mo17369p())) {
            return layoutParams.f44799e;
        }
        Rect rect = layoutParams.f44799e;
        rect.set(0, 0, 0, 0);
        int size = this.f44784u.size();
        for (int i = 0; i < size; i++) {
            this.f44774o.set(0, 0, 0, 0);
            this.f44784u.get(i).mo21g(this.f44774o, view, this, this.f44752a1);
            int i2 = rect.left;
            Rect rect2 = this.f44774o;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f44800f = false;
        return rect;
    }

    /* renamed from: T0 */
    public C0129l mo17033T0(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.f44784u.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: U0 */
    public boolean mo17034U0(int i) {
        return getScrollingChildHelper().mo157671h(i);
    }

    /* renamed from: V0 */
    public void mo17035V0() {
        if (this.f44784u.size() != 0) {
            LayoutManager layoutManager = this.f44782s;
            if (layoutManager != null) {
                layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
            }
            mo17038Y0();
            requestLayout();
        }
    }

    /* renamed from: W0 */
    public boolean mo17036W0() {
        return this.f44730K > 0;
    }

    /* renamed from: X0 */
    public void mo17037X0(int i) {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            LayoutManager layoutManager2 = layoutManager;
            C117292a.m165358d(layoutManager2, aVar.mo10232b(), "androidx/recyclerview/widget/RecyclerView", "jumpToPositionForSmoothScroller", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(layoutManager2, "androidx/recyclerview/widget/RecyclerView", "jumpToPositionForSmoothScroller", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            awakenScrollBars();
        }
    }

    /* renamed from: Y0 */
    public void mo17038Y0() {
        int h = this.f44763h.mo17493h();
        for (int i = 0; i < h; i++) {
            ((LayoutParams) this.f44763h.mo17492g(i).getLayoutParams()).f44800f = true;
        }
        C16625r rVar = this.f44757e;
        int size = rVar.f44824c.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) rVar.f44824c.get(i2).f44854d.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f44800f = true;
            }
        }
    }

    /* renamed from: Z0 */
    public void mo17039Z0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int h = this.f44763h.mo17493h();
        for (int i4 = 0; i4 < h; i4++) {
            C16631z Q0 = m15803Q0(this.f44763h.mo17492g(i4));
            if (Q0 != null && !Q0.mo17377w()) {
                int i5 = Q0.f44856f;
                if (i5 >= i3) {
                    Q0.mo17373t(-i2, z);
                    this.f44752a1.f44837f = true;
                } else if (i5 >= i) {
                    Q0.mo17362i(8);
                    Q0.mo17373t(-i2, z);
                    Q0.f44856f = i - 1;
                    this.f44752a1.f44837f = true;
                }
            }
        }
        C16625r rVar = this.f44757e;
        int size = rVar.f44824c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C16631z zVar = rVar.f44824c.get(size);
                if (zVar != null) {
                    int i6 = zVar.f44856f;
                    if (i6 >= i3) {
                        zVar.mo17373t(-i2, z);
                    } else if (i6 >= i) {
                        zVar.mo17362i(8);
                        rVar.mo17343g(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* renamed from: a1 */
    public void mo17040a1() {
        this.f44730K++;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b1 */
    public void mo17042b1(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.f44730K - 1;
        this.f44730K = i2;
        if (i2 < 1) {
            this.f44730K = 0;
            if (z) {
                int i3 = this.f44724E;
                this.f44724E = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f44726G;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z2 = false;
                    }
                    if (z2) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = ((ArrayList) this.f44775o1).size() - 1; size >= 0; size--) {
                    C16631z zVar = (C16631z) ((ArrayList) this.f44775o1).get(size);
                    if (zVar.f44854d.getParent() == this && !zVar.mo17377w() && (i = zVar.f44870w) != -1) {
                        View view = zVar.f44854d;
                        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                        C107207u.C107208b.m145191s(view, i);
                        zVar.f44870w = -1;
                    }
                }
                ((ArrayList) this.f44775o1).clear();
            }
        }
    }

    /* renamed from: c */
    public void mo17043c(C0130p pVar) {
        if (this.f44754c1 == null) {
            this.f44754c1 = new ArrayList();
        }
        this.f44754c1.add(pVar);
    }

    /* renamed from: c1 */
    public final void mo17044c1(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f44743U) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f44743U = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f44788x0 = x;
            this.f44747W = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f44790y0 = y;
            this.f44777p0 = y;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.f44782s.checkLayoutParams((LayoutParams) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.f44782s.computeHorizontalScrollExtent(this.f44752a1);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.f44782s.computeHorizontalScrollOffset(this.f44752a1);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.f44782s.computeHorizontalScrollRange(this.f44752a1);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.f44782s.computeVerticalScrollExtent(this.f44752a1);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.f44782s.computeVerticalScrollOffset(this.f44752a1);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.f44782s.computeVerticalScrollRange(this.f44752a1);
        }
        return 0;
    }

    /* renamed from: d1 */
    public void mo17052d1(int i, int i2) {
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo157664a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo157665b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo157666c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo157668e(i, i2, i3, i4, iArr);
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f44784u.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f44784u.get(i).mo123i(canvas, this, this.f44752a1);
        }
        EdgeEffect edgeEffect = this.f44733N;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f44767j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f44733N;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f44734P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f44767j) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f44734P;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f44735Q;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f44767j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f44735Q;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f44737R;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f44767j) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f44737R;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f44739S == null || this.f44784u.size() <= 0 || !this.f44739S.mo17325n()) {
            z3 = z;
        }
        if (z3) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e1 */
    public void mo17061e1() {
        if (!this.f44762g1 && this.f44787x) {
            Runnable runnable = this.f44778p1;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145185m(this, runnable);
            this.f44762g1 = true;
        }
    }

    /* renamed from: f1 */
    public final void mo17062f1() {
        boolean z;
        boolean z2 = false;
        if (this.f44728I) {
            C16644a aVar = this.f44761g;
            aVar.mo17475l(aVar.f44943b);
            aVar.mo17475l(aVar.f44944c);
            aVar.f44947f = 0;
            if (this.f44729J) {
                this.f44782s.onItemsChanged(this);
            }
        }
        if (this.f44739S != null && this.f44782s.supportsPredictiveItemAnimations()) {
            this.f44761g.mo17473j();
        } else {
            this.f44761g.mo17466c();
        }
        boolean z3 = this.f44756d1 || this.f44758e1;
        this.f44752a1.f44841j = this.f44791z && this.f44739S != null && ((z = this.f44728I) || z3 || this.f44782s.mRequestedSimpleAnimations) && (!z || this.f44781r.hasStableIds());
        C16628w wVar = this.f44752a1;
        if (wVar.f44841j && z3 && !this.f44728I) {
            if (this.f44739S != null && this.f44782s.supportsPredictiveItemAnimations()) {
                z2 = true;
            }
        }
        wVar.f44842k = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x016f, code lost:
        if (r11 > 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0193, code lost:
        if (r4 > 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0196, code lost:
        if (r11 < 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0199, code lost:
        if (r4 < 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01a2, code lost:
        if ((r4 * r6) < 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ab, code lost:
        if ((r4 * r6) > 0) goto L_0x0173;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r0.f44782s
            android.view.View r3 = r3.onInterceptFocusSearch(r1, r2)
            if (r3 == 0) goto L_0x000f
            return r3
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$e r3 = r0.f44781r
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0025
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r0.f44782s
            if (r3 == 0) goto L_0x0025
            boolean r3 = r16.mo17036W0()
            if (r3 != 0) goto L_0x0025
            boolean r3 = r0.f44722C
            if (r3 != 0) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            r9 = 33
            r10 = 17
            r11 = 0
            r12 = 2
            if (r3 == 0) goto L_0x0099
            if (r2 == r12) goto L_0x0036
            if (r2 != r5) goto L_0x0099
        L_0x0036:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r0.f44782s
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L_0x004d
            if (r2 != r12) goto L_0x0043
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x0045
        L_0x0043:
            r3 = 33
        L_0x0045:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 != 0) goto L_0x0079
            androidx.recyclerview.widget.RecyclerView$LayoutManager r13 = r0.f44782s
            boolean r13 = r13.canScrollHorizontally()
            if (r13 == 0) goto L_0x0079
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r0.f44782s
            int r3 = r3.getLayoutDirection()
            if (r3 != r5) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            if (r2 != r12) goto L_0x0067
            r13 = 1
            goto L_0x0068
        L_0x0067:
            r13 = 0
        L_0x0068:
            r3 = r3 ^ r13
            if (r3 == 0) goto L_0x006e
            r3 = 66
            goto L_0x0070
        L_0x006e:
            r3 = 17
        L_0x0070:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x0078
            r3 = 1
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            if (r3 == 0) goto L_0x0094
            r16.mo17101o0()
            android.view.View r3 = r16.mo17020E0(r17)
            if (r3 != 0) goto L_0x0085
            return r11
        L_0x0085:
            r16.mo17151u1()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r0.f44782s
            androidx.recyclerview.widget.RecyclerView$r r13 = r0.f44757e
            androidx.recyclerview.widget.RecyclerView$w r14 = r0.f44752a1
            r3.onFocusSearchFailed(r1, r2, r13, r14)
            r0.mo17153v1(r4)
        L_0x0094:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto L_0x00bd
        L_0x0099:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto L_0x00bc
            if (r3 == 0) goto L_0x00bc
            r16.mo17101o0()
            android.view.View r3 = r16.mo17020E0(r17)
            if (r3 != 0) goto L_0x00ab
            return r11
        L_0x00ab:
            r16.mo17151u1()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r0.f44782s
            androidx.recyclerview.widget.RecyclerView$r r6 = r0.f44757e
            androidx.recyclerview.widget.RecyclerView$w r13 = r0.f44752a1
            android.view.View r3 = r3.onFocusSearchFailed(r1, r2, r6, r13)
            r0.mo17153v1(r4)
            goto L_0x00bd
        L_0x00bc:
            r3 = r6
        L_0x00bd:
            if (r3 == 0) goto L_0x00d4
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto L_0x00d4
            android.view.View r4 = r16.getFocusedChild()
            if (r4 != 0) goto L_0x00d0
            android.view.View r1 = super.focusSearch(r17, r18)
            return r1
        L_0x00d0:
            r0.mo17100n1(r3, r11)
            return r1
        L_0x00d4:
            if (r3 == 0) goto L_0x0173
            if (r3 != r0) goto L_0x00da
            goto L_0x0173
        L_0x00da:
            android.view.View r6 = r0.mo17020E0(r3)
            if (r6 != 0) goto L_0x00e2
            goto L_0x01ae
        L_0x00e2:
            if (r1 != 0) goto L_0x00e6
            goto L_0x0171
        L_0x00e6:
            android.view.View r6 = r16.mo17020E0(r17)
            if (r6 != 0) goto L_0x00ee
            goto L_0x0171
        L_0x00ee:
            android.graphics.Rect r6 = r0.f44774o
            int r11 = r17.getWidth()
            int r13 = r17.getHeight()
            r6.set(r4, r4, r11, r13)
            android.graphics.Rect r6 = r0.f44776p
            int r11 = r3.getWidth()
            int r13 = r3.getHeight()
            r6.set(r4, r4, r11, r13)
            android.graphics.Rect r6 = r0.f44774o
            r0.offsetDescendantRectToMyCoords(r1, r6)
            android.graphics.Rect r6 = r0.f44776p
            r0.offsetDescendantRectToMyCoords(r3, r6)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r0.f44782s
            int r6 = r6.getLayoutDirection()
            if (r6 != r5) goto L_0x011c
            r6 = -1
            goto L_0x011d
        L_0x011c:
            r6 = 1
        L_0x011d:
            android.graphics.Rect r13 = r0.f44774o
            int r14 = r13.left
            android.graphics.Rect r15 = r0.f44776p
            int r4 = r15.left
            if (r14 < r4) goto L_0x012b
            int r11 = r13.right
            if (r11 > r4) goto L_0x0133
        L_0x012b:
            int r11 = r13.right
            int r7 = r15.right
            if (r11 >= r7) goto L_0x0133
            r4 = 1
            goto L_0x0140
        L_0x0133:
            int r7 = r13.right
            int r11 = r15.right
            if (r7 > r11) goto L_0x013b
            if (r14 < r11) goto L_0x013f
        L_0x013b:
            if (r14 <= r4) goto L_0x013f
            r4 = -1
            goto L_0x0140
        L_0x013f:
            r4 = 0
        L_0x0140:
            int r7 = r13.top
            int r11 = r15.top
            if (r7 < r11) goto L_0x014a
            int r14 = r13.bottom
            if (r14 > r11) goto L_0x0152
        L_0x014a:
            int r14 = r13.bottom
            int r8 = r15.bottom
            if (r14 >= r8) goto L_0x0152
            r11 = 1
            goto L_0x015f
        L_0x0152:
            int r8 = r13.bottom
            int r13 = r15.bottom
            if (r8 > r13) goto L_0x015a
            if (r7 < r13) goto L_0x015e
        L_0x015a:
            if (r7 <= r11) goto L_0x015e
            r11 = -1
            goto L_0x015f
        L_0x015e:
            r11 = 0
        L_0x015f:
            if (r2 == r5) goto L_0x01a5
            if (r2 == r12) goto L_0x019c
            if (r2 == r10) goto L_0x0199
            if (r2 == r9) goto L_0x0196
            r6 = 66
            if (r2 == r6) goto L_0x0193
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L_0x0175
            if (r11 <= 0) goto L_0x0173
        L_0x0171:
            r4 = 1
            goto L_0x01ae
        L_0x0173:
            r4 = 0
            goto L_0x01ae
        L_0x0175:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid direction: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r16.mo17017B0()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0193:
            if (r4 <= 0) goto L_0x0173
            goto L_0x0171
        L_0x0196:
            if (r11 >= 0) goto L_0x0173
            goto L_0x0171
        L_0x0199:
            if (r4 >= 0) goto L_0x0173
            goto L_0x0171
        L_0x019c:
            if (r11 > 0) goto L_0x0171
            if (r11 != 0) goto L_0x0173
            int r4 = r4 * r6
            if (r4 < 0) goto L_0x0173
            goto L_0x0171
        L_0x01a5:
            if (r11 < 0) goto L_0x0171
            if (r11 != 0) goto L_0x0173
            int r4 = r4 * r6
            if (r4 > 0) goto L_0x0173
            goto L_0x0171
        L_0x01ae:
            if (r4 == 0) goto L_0x01b1
            goto L_0x01b5
        L_0x01b1:
            android.view.View r3 = super.focusSearch(r17, r18)
        L_0x01b5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g0 */
    public final void mo17064g0(C16631z zVar) {
        View view = zVar.f44854d;
        boolean z = view.getParent() == this;
        this.f44757e.mo17349m(mo17031P0(view));
        if (zVar.mo17372s()) {
            this.f44763h.mo17487b(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f44763h.mo17486a(view, -1, true);
        } else {
            C16650e eVar = this.f44763h;
            int indexOfChild = ((C16647a0) eVar.f44954a).f44952a.indexOfChild(view);
            if (indexOfChild >= 0) {
                eVar.f44955b.mo17507h(indexOfChild);
                eVar.mo17494i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: g1 */
    public void mo17065g1(boolean z) {
        this.f44729J = z | this.f44729J;
        this.f44728I = true;
        int h = this.f44763h.mo17493h();
        for (int i = 0; i < h; i++) {
            C16631z Q0 = m15803Q0(this.f44763h.mo17492g(i));
            if (Q0 != null && !Q0.mo17377w()) {
                Q0.mo17362i(6);
            }
        }
        mo17038Y0();
        C16625r rVar = this.f44757e;
        int size = rVar.f44824c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16631z zVar = rVar.f44824c.get(i2);
            if (zVar != null) {
                zVar.mo17362i(6);
                zVar.mo17361h((Object) null);
            }
        }
        C16613e eVar = RecyclerView.this.f44781r;
        if (eVar == null || !eVar.hasStableIds()) {
            rVar.mo17342f();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo17017B0());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo17017B0());
    }

    public C16613e getAdapter() {
        return this.f44781r;
    }

    public int getBaseline() {
        LayoutManager layoutManager = this.f44782s;
        return layoutManager != null ? layoutManager.getBaseline() : super.getBaseline();
    }

    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f44767j;
    }

    public C103775c0 getCompatAccessibilityDelegate() {
        return this.f44764h1;
    }

    public C16632i getEdgeEffectFactory() {
        return this.f44732M;
    }

    public C16616j getItemAnimator() {
        return this.f44739S;
    }

    public int getItemDecorationCount() {
        return this.f44784u.size();
    }

    public LayoutManager getLayoutManager() {
        return this.f44782s;
    }

    public int getMaxFlingVelocity() {
        return this.f44742T0;
    }

    public int getMinFlingVelocity() {
        return this.f44740S0;
    }

    public long getNanoTime() {
        if (f44717v1) {
            return System.nanoTime();
        }
        return 0;
    }

    public C16633n getOnFlingListener() {
        return this.f44738R0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f44748W0;
    }

    public C16623q getRecycledViewPool() {
        return this.f44757e.mo17340d();
    }

    public int getScrollState() {
        return this.f44741T;
    }

    /* renamed from: h0 */
    public void mo17085h0(C0129l lVar) {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f44784u.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f44784u.add(lVar);
        mo17038Y0();
        requestLayout();
    }

    /* renamed from: h1 */
    public void mo17086h1(C16631z zVar, C16616j.C16619c cVar) {
        boolean z = false;
        int i = (zVar.f44863p & -8193) | 0;
        zVar.f44863p = i;
        if (this.f44752a1.f44839h) {
            if ((i & 2) != 0) {
                z = true;
            }
            if (z && !zVar.mo17370q() && !zVar.mo17377w()) {
                this.f44765i.f306555b.mo162756e(mo17028M0(zVar), zVar);
            }
        }
        this.f44765i.mo145149b(zVar, cVar);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo157671h(0);
    }

    /* renamed from: i0 */
    public void mo17088i0(C16621m mVar) {
        if (this.f44727H == null) {
            this.f44727H = new ArrayList();
        }
        this.f44727H.add(mVar);
    }

    /* renamed from: i1 */
    public void mo17089i1() {
        C16616j jVar = this.f44739S;
        if (jVar != null) {
            jVar.mo17322k();
        }
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.f44757e);
            this.f44782s.removeAndRecycleScrapInt(this.f44757e);
        }
        this.f44757e.mo17338b();
    }

    public boolean isAttachedToWindow() {
        return this.f44787x;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f320803d;
    }

    /* renamed from: j0 */
    public void mo17092j0(C16622o oVar) {
        this.f44785v.add(oVar);
    }

    /* renamed from: j1 */
    public void mo17093j1(C0129l lVar) {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.f44784u.remove(lVar);
        if (this.f44784u.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo17038Y0();
        requestLayout();
    }

    /* renamed from: k0 */
    public void mo17094k0(String str) {
        if (mo17036W0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo17017B0());
            }
            throw new IllegalStateException(str);
        } else if (this.f44731L > 0) {
            new IllegalStateException("" + mo17017B0());
        }
    }

    /* renamed from: k1 */
    public void mo17095k1(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        mo17093j1(mo17033T0(i));
    }

    /* renamed from: l1 */
    public void mo17096l1(C16622o oVar) {
        this.f44785v.remove(oVar);
        if (this.f44786w == oVar) {
            this.f44786w = null;
        }
    }

    /* renamed from: m0 */
    public void mo17097m0() {
        int h = this.f44763h.mo17493h();
        for (int i = 0; i < h; i++) {
            C16631z Q0 = m15803Q0(this.f44763h.mo17492g(i));
            if (!Q0.mo17377w()) {
                Q0.f44857g = -1;
                Q0.f44860j = -1;
            }
        }
        C16625r rVar = this.f44757e;
        int size = rVar.f44824c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16631z zVar = rVar.f44824c.get(i2);
            zVar.f44857g = -1;
            zVar.f44860j = -1;
        }
        int size2 = rVar.f44822a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C16631z zVar2 = rVar.f44822a.get(i3);
            zVar2.f44857g = -1;
            zVar2.f44860j = -1;
        }
        ArrayList<C16631z> arrayList = rVar.f44823b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C16631z zVar3 = rVar.f44823b.get(i4);
                zVar3.f44857g = -1;
                zVar3.f44860j = -1;
            }
        }
    }

    /* renamed from: m1 */
    public void mo17098m1(C0130p pVar) {
        List<C0130p> list = this.f44754c1;
        if (list != null) {
            ((ArrayList) list).remove(pVar);
        }
    }

    /* renamed from: n0 */
    public void mo17099n0(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f44733N;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f44733N.onRelease();
            z = this.f44733N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f44735Q;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f44735Q.onRelease();
            z |= this.f44735Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f44734P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f44734P.onRelease();
            z |= this.f44734P.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f44737R;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f44737R.onRelease();
            z |= this.f44737R.isFinished();
        }
        if (z) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    /* renamed from: n1 */
    public final void mo17100n1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f44774o.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f44800f) {
                Rect rect = layoutParams2.f44799e;
                Rect rect2 = this.f44774o;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f44774o);
            offsetRectIntoDescendantCoords(view, this.f44774o);
        }
        this.f44782s.requestChildRectangleOnScreen(this, view, this.f44774o, !this.f44791z, view2 == null);
    }

    /* renamed from: o0 */
    public void mo17101o0() {
        if (!this.f44791z || this.f44728I) {
            int i = C103302h.f304582a;
            Trace.beginSection("RV FullInvalidate");
            mo17114r0();
            Trace.endSection();
        } else if (this.f44761g.mo17470g()) {
            C16644a aVar = this.f44761g;
            int i2 = aVar.f44947f;
            boolean z = false;
            if ((4 & i2) != 0) {
                if (!((11 & i2) != 0)) {
                    int i3 = C103302h.f304582a;
                    Trace.beginSection("RV PartialInvalidate");
                    mo17151u1();
                    mo17040a1();
                    this.f44761g.mo17473j();
                    if (!this.f44721B) {
                        int e = this.f44763h.mo17490e();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= e) {
                                break;
                            }
                            C16631z Q0 = m15803Q0(this.f44763h.mo17489d(i4));
                            if (Q0 != null && !Q0.mo17377w()) {
                                if ((Q0.f44863p & 2) != 0) {
                                    z = true;
                                    break;
                                }
                            }
                            i4++;
                        }
                        if (z) {
                            mo17114r0();
                        } else {
                            this.f44761g.mo17465b();
                        }
                    }
                    mo17153v1(true);
                    mo17042b1(true);
                    Trace.endSection();
                    return;
                }
            }
            if (aVar.mo17470g()) {
                int i5 = C103302h.f304582a;
                Trace.beginSection("RV FullInvalidate");
                mo17114r0();
                Trace.endSection();
            }
        }
    }

    /* renamed from: o1 */
    public final void mo17102o1() {
        VelocityTracker velocityTracker = this.f44745V;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        mo17026L(0);
        EdgeEffect edgeEffect = this.f44733N;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f44733N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f44734P;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f44734P.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f44735Q;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f44735Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f44737R;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f44737R.isFinished();
        }
        if (z) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44730K = 0;
        boolean z = true;
        this.f44787x = true;
        if (!this.f44791z || isLayoutRequested()) {
            z = false;
        }
        this.f44791z = z;
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            layoutManager.dispatchAttachedToWindow(this);
        }
        this.f44762g1 = false;
        if (f44717v1) {
            ThreadLocal<C16661o> threadLocal = C16661o.f45001h;
            C16661o oVar = threadLocal.get();
            this.f44750Y0 = oVar;
            if (oVar == null) {
                this.f44750Y0 = new C16661o();
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                Display b = C107207u.C107209c.m145193b(this);
                float f = 60.0f;
                if (!isInEditMode() && b != null) {
                    float refreshRate = b.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C16661o oVar2 = this.f44750Y0;
                oVar2.f45005f = (long) (1.0E9f / f);
                threadLocal.set(oVar2);
            }
            this.f44750Y0.f45003d.add(this);
        }
    }

    public void onDetachedFromWindow() {
        C16661o oVar;
        super.onDetachedFromWindow();
        C16616j jVar = this.f44739S;
        if (jVar != null) {
            jVar.mo17322k();
        }
        mo17155w1();
        this.f44787x = false;
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.f44757e);
        }
        ((ArrayList) this.f44775o1).clear();
        removeCallbacks(this.f44778p1);
        this.f44765i.getClass();
        do {
        } while (((C106985e) C103777h0.C103778a.f306556d).mo157419a() != null);
        if (f44717v1 && (oVar = this.f44750Y0) != null) {
            oVar.f45003d.remove(this);
            this.f44750Y0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f44784u.size();
        for (int i = 0; i < size; i++) {
            this.f44784u.get(i).mo122h(canvas, this, this.f44752a1);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f44782s != null && !this.f44722C && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f44782s.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f44782s.canScrollHorizontally()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo17111p1((int) (f * this.f44744U0), (int) (f2 * this.f44746V0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f44782s.canScrollVertically()) {
                        f2 = -axisValue;
                    } else if (this.f44782s.canScrollHorizontally()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo17111p1((int) (f * this.f44744U0), (int) (f2 * this.f44746V0), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo17111p1((int) (f * this.f44744U0), (int) (f2 * this.f44746V0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.f44722C) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f44786w = null;
        }
        int size = this.f44785v.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            C16622o oVar = this.f44785v.get(i);
            if (oVar.mo6022e(this, motionEvent) && action != 3) {
                this.f44786w = oVar;
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            mo17102o1();
            setScrollState(0);
            return true;
        }
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager == null) {
            return false;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.f44782s.canScrollVertically();
        if (this.f44745V == null) {
            this.f44745V = VelocityTracker.obtain();
        }
        this.f44745V.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f44723D) {
                this.f44723D = false;
            }
            this.f44743U = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f44788x0 = x;
            this.f44747W = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f44790y0 = y;
            this.f44777p0 = y;
            if (this.f44741T == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f44771m1;
            iArr[1] = 0;
            iArr[0] = 0;
            if (canScrollVertically) {
                canScrollHorizontally |= true;
            }
            getScrollingChildHelper().mo157673j(canScrollHorizontally ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f44745V.clear();
            mo17026L(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f44743U);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f44741T != 1) {
                int i2 = x2 - this.f44747W;
                int i3 = y2 - this.f44777p0;
                if (!canScrollHorizontally || Math.abs(i2) <= this.f44736Q0) {
                    z2 = false;
                } else {
                    this.f44788x0 = x2;
                    z2 = true;
                }
                if (canScrollVertically && Math.abs(i3) > this.f44736Q0) {
                    this.f44790y0 = y2;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            mo17102o1();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f44743U = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f44788x0 = x3;
            this.f44747W = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f44790y0 = y3;
            this.f44777p0 = y3;
        } else if (actionMasked == 6) {
            mo17044c1(motionEvent);
        }
        return this.f44741T == 1;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C103302h.f304582a;
        Trace.beginSection("RV OnLayout");
        mo17114r0();
        Trace.endSection();
        this.f44791z = true;
    }

    public void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager == null) {
            mo17110p0(i, i2);
            return;
        }
        boolean z = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f44782s.onMeasure(this.f44757e, this.f44752a1, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f44781r != null) {
                if (this.f44752a1.f44835d == 1) {
                    mo17121s0();
                }
                this.f44782s.setMeasureSpecs(i, i2);
                this.f44752a1.f44840i = true;
                mo17148t0();
                this.f44782s.setMeasuredDimensionFromChildren(i, i2);
                if (this.f44782s.shouldMeasureTwice()) {
                    this.f44782s.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f44752a1.f44840i = true;
                    mo17148t0();
                    this.f44782s.setMeasuredDimensionFromChildren(i, i2);
                }
            }
        } else if (this.f44789y) {
            this.f44782s.onMeasure(this.f44757e, this.f44752a1, i, i2);
        } else {
            if (this.f44725F) {
                mo17151u1();
                mo17040a1();
                mo17062f1();
                mo17042b1(true);
                C16628w wVar = this.f44752a1;
                if (wVar.f44842k) {
                    wVar.f44838g = true;
                } else {
                    this.f44761g.mo17466c();
                    this.f44752a1.f44838g = false;
                }
                this.f44725F = false;
                mo17153v1(false);
            } else if (this.f44752a1.f44842k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C16613e eVar = this.f44781r;
            if (eVar != null) {
                this.f44752a1.f44836e = eVar.getItemCount();
            } else {
                this.f44752a1.f44836e = 0;
            }
            mo17151u1();
            this.f44782s.onMeasure(this.f44757e, this.f44752a1, i, i2);
            mo17153v1(false);
            this.f44752a1.f44838g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo17036W0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f44759f = savedState;
        super.onRestoreInstanceState(savedState.f306434d);
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null && (parcelable2 = this.f44759f.f44885f) != null) {
            layoutManager.onRestoreInstanceState(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f44759f;
        if (savedState2 != null) {
            savedState.f44885f = savedState2.f44885f;
        } else {
            LayoutManager layoutManager = this.f44782s;
            if (layoutManager != null) {
                savedState.f44885f = layoutManager.onSaveInstanceState();
            } else {
                savedState.f44885f = null;
            }
        }
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.f44737R = null;
            this.f44734P = null;
            this.f44735Q = null;
            this.f44733N = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            boolean r0 = r14.f44722C
            r1 = 0
            if (r0 != 0) goto L_0x01e2
            boolean r0 = r14.f44723D
            if (r0 == 0) goto L_0x000b
            goto L_0x01e2
        L_0x000b:
            int r0 = r15.getAction()
            androidx.recyclerview.widget.RecyclerView$o r2 = r14.f44786w
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L_0x0025
            r5 = 0
            if (r0 != 0) goto L_0x001b
            r14.f44786w = r5
            goto L_0x0025
        L_0x001b:
            r2.mo126c(r14, r15)
            if (r0 == r3) goto L_0x0022
            if (r0 != r4) goto L_0x0040
        L_0x0022:
            r14.f44786w = r5
            goto L_0x0040
        L_0x0025:
            if (r0 == 0) goto L_0x0045
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$o> r0 = r14.f44785v
            int r0 = r0.size()
            r2 = 0
        L_0x002e:
            if (r2 >= r0) goto L_0x0045
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$o> r5 = r14.f44785v
            java.lang.Object r5 = r5.get(r2)
            androidx.recyclerview.widget.RecyclerView$o r5 = (androidx.recyclerview.widget.RecyclerView.C16622o) r5
            boolean r6 = r5.mo6022e(r14, r15)
            if (r6 == 0) goto L_0x0042
            r14.f44786w = r5
        L_0x0040:
            r0 = 1
            goto L_0x0046
        L_0x0042:
            int r2 = r2 + 1
            goto L_0x002e
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x004f
            r14.mo17102o1()
            r14.setScrollState(r1)
            return r4
        L_0x004f:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r14.f44782s
            if (r0 != 0) goto L_0x0054
            return r1
        L_0x0054:
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r14.f44782s
            boolean r2 = r2.canScrollVertically()
            android.view.VelocityTracker r5 = r14.f44745V
            if (r5 != 0) goto L_0x0068
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r14.f44745V = r5
        L_0x0068:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r15)
            int r6 = r15.getActionMasked()
            int r7 = r15.getActionIndex()
            if (r6 != 0) goto L_0x007c
            int[] r8 = r14.f44771m1
            r8[r4] = r1
            r8[r1] = r1
        L_0x007c:
            int[] r8 = r14.f44771m1
            r9 = r8[r1]
            float r9 = (float) r9
            r8 = r8[r4]
            float r8 = (float) r8
            r5.offsetLocation(r9, r8)
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r6 == 0) goto L_0x01b2
            if (r6 == r4) goto L_0x0170
            r9 = 2
            if (r6 == r9) goto L_0x00c3
            if (r6 == r3) goto L_0x00bb
            r0 = 5
            if (r6 == r0) goto L_0x009f
            r0 = 6
            if (r6 == r0) goto L_0x009a
            goto L_0x01d7
        L_0x009a:
            r14.mo17044c1(r15)
            goto L_0x01d7
        L_0x009f:
            int r0 = r15.getPointerId(r7)
            r14.f44743U = r0
            float r0 = r15.getX(r7)
            float r0 = r0 + r8
            int r0 = (int) r0
            r14.f44788x0 = r0
            r14.f44747W = r0
            float r15 = r15.getY(r7)
            float r15 = r15 + r8
            int r15 = (int) r15
            r14.f44790y0 = r15
            r14.f44777p0 = r15
            goto L_0x01d7
        L_0x00bb:
            r14.mo17102o1()
            r14.setScrollState(r1)
            goto L_0x01d7
        L_0x00c3:
            int r3 = r14.f44743U
            int r3 = r15.findPointerIndex(r3)
            if (r3 >= 0) goto L_0x00cc
            return r1
        L_0x00cc:
            float r6 = r15.getX(r3)
            float r6 = r6 + r8
            int r6 = (int) r6
            float r15 = r15.getY(r3)
            float r15 = r15 + r8
            int r15 = (int) r15
            int r3 = r14.f44788x0
            int r3 = r3 - r6
            int r7 = r14.f44790y0
            int r13 = r7 - r15
            int[] r10 = r14.f44770l1
            int[] r11 = r14.f44769k1
            r12 = 0
            r7 = r14
            r8 = r3
            r9 = r13
            boolean r7 = r7.mo17150u0(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x0112
            int[] r7 = r14.f44770l1
            r8 = r7[r1]
            int r3 = r3 - r8
            r7 = r7[r4]
            int r13 = r13 - r7
            int[] r7 = r14.f44769k1
            r8 = r7[r1]
            float r8 = (float) r8
            r7 = r7[r4]
            float r7 = (float) r7
            r5.offsetLocation(r8, r7)
            int[] r7 = r14.f44771m1
            r8 = r7[r1]
            int[] r9 = r14.f44769k1
            r10 = r9[r1]
            int r8 = r8 + r10
            r7[r1] = r8
            r8 = r7[r4]
            r9 = r9[r4]
            int r8 = r8 + r9
            r7[r4] = r8
        L_0x0112:
            int r7 = r14.f44741T
            if (r7 == r4) goto L_0x013d
            if (r0 == 0) goto L_0x0127
            int r7 = java.lang.Math.abs(r3)
            int r8 = r14.f44736Q0
            if (r7 <= r8) goto L_0x0127
            if (r3 <= 0) goto L_0x0124
            int r3 = r3 - r8
            goto L_0x0125
        L_0x0124:
            int r3 = r3 + r8
        L_0x0125:
            r7 = 1
            goto L_0x0128
        L_0x0127:
            r7 = 0
        L_0x0128:
            if (r2 == 0) goto L_0x0138
            int r8 = java.lang.Math.abs(r13)
            int r9 = r14.f44736Q0
            if (r8 <= r9) goto L_0x0138
            if (r13 <= 0) goto L_0x0136
            int r13 = r13 - r9
            goto L_0x0137
        L_0x0136:
            int r13 = r13 + r9
        L_0x0137:
            r7 = 1
        L_0x0138:
            if (r7 == 0) goto L_0x013d
            r14.setScrollState(r4)
        L_0x013d:
            int r7 = r14.f44741T
            if (r7 != r4) goto L_0x01d7
            int[] r7 = r14.f44769k1
            r8 = r7[r1]
            int r6 = r6 - r8
            r14.f44788x0 = r6
            r6 = r7[r4]
            int r15 = r15 - r6
            r14.f44790y0 = r15
            if (r0 == 0) goto L_0x0151
            r15 = r3
            goto L_0x0152
        L_0x0151:
            r15 = 0
        L_0x0152:
            if (r2 == 0) goto L_0x0156
            r0 = r13
            goto L_0x0157
        L_0x0156:
            r0 = 0
        L_0x0157:
            boolean r15 = r14.mo17111p1(r15, r0, r5)
            if (r15 == 0) goto L_0x0164
            android.view.ViewParent r15 = r14.getParent()
            r15.requestDisallowInterceptTouchEvent(r4)
        L_0x0164:
            androidx.recyclerview.widget.o r15 = r14.f44750Y0
            if (r15 == 0) goto L_0x01d7
            if (r3 != 0) goto L_0x016c
            if (r13 == 0) goto L_0x01d7
        L_0x016c:
            r15.mo17520a(r14, r3, r13)
            goto L_0x01d7
        L_0x0170:
            android.view.VelocityTracker r15 = r14.f44745V
            r15.addMovement(r5)
            android.view.VelocityTracker r15 = r14.f44745V
            r3 = 1000(0x3e8, float:1.401E-42)
            int r6 = r14.f44742T0
            float r6 = (float) r6
            r15.computeCurrentVelocity(r3, r6)
            r15 = 0
            if (r0 == 0) goto L_0x018c
            android.view.VelocityTracker r0 = r14.f44745V
            int r3 = r14.f44743U
            float r0 = r0.getXVelocity(r3)
            float r0 = -r0
            goto L_0x018d
        L_0x018c:
            r0 = 0
        L_0x018d:
            if (r2 == 0) goto L_0x0199
            android.view.VelocityTracker r2 = r14.f44745V
            int r3 = r14.f44743U
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019a
        L_0x0199:
            r2 = 0
        L_0x019a:
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x01a2
            int r15 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x01aa
        L_0x01a2:
            int r15 = (int) r0
            int r0 = (int) r2
            boolean r15 = r14.mo17025K0(r15, r0)
            if (r15 != 0) goto L_0x01ad
        L_0x01aa:
            r14.setScrollState(r1)
        L_0x01ad:
            r14.mo17102o1()
            r1 = 1
            goto L_0x01d7
        L_0x01b2:
            int r3 = r15.getPointerId(r1)
            r14.f44743U = r3
            float r3 = r15.getX()
            float r3 = r3 + r8
            int r3 = (int) r3
            r14.f44788x0 = r3
            r14.f44747W = r3
            float r15 = r15.getY()
            float r15 = r15 + r8
            int r15 = (int) r15
            r14.f44790y0 = r15
            r14.f44777p0 = r15
            if (r2 == 0) goto L_0x01d0
            r0 = r0 | 2
        L_0x01d0:
            e3.l r15 = r14.getScrollingChildHelper()
            r15.mo157673j(r0, r1)
        L_0x01d7:
            if (r1 != 0) goto L_0x01de
            android.view.VelocityTracker r15 = r14.f44745V
            r15.addMovement(r5)
        L_0x01de:
            r5.recycle()
            return r4
        L_0x01e2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p0 */
    public void mo17110p0(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        setMeasuredDimension(LayoutManager.chooseSize(i, paddingLeft, C107207u.C107208b.m145177e(this)), LayoutManager.chooseSize(i2, getPaddingTop() + getPaddingBottom(), C107207u.C107208b.m145176d(this)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00eb  */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17111p1(int r19, int r20, android.view.MotionEvent r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r18.mo17101o0()
            androidx.recyclerview.widget.RecyclerView$e r0 = r7.f44781r
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0025
            int[] r0 = r7.f44773n1
            r7.mo17113q1(r8, r9, r0)
            int[] r0 = r7.f44773n1
            r1 = r0[r12]
            r0 = r0[r11]
            int r2 = r8 - r1
            int r3 = r9 - r0
            r13 = r0
            r14 = r1
            r15 = r2
            r6 = r3
            goto L_0x0029
        L_0x0025:
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0029:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$l> r0 = r7.f44784u
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0034
            r18.invalidate()
        L_0x0034:
            int[] r5 = r7.f44769k1
            r16 = 0
            r0 = r18
            r1 = r14
            r2 = r13
            r3 = r15
            r4 = r6
            r17 = r6
            r6 = r16
            boolean r0 = r0.mo17152v0(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0073
            int r0 = r7.f44788x0
            int[] r1 = r7.f44769k1
            r2 = r1[r12]
            int r0 = r0 - r2
            r7.f44788x0 = r0
            int r0 = r7.f44790y0
            r1 = r1[r11]
            int r0 = r0 - r1
            r7.f44790y0 = r0
            if (r10 == 0) goto L_0x005f
            float r0 = (float) r2
            float r1 = (float) r1
            r10.offsetLocation(r0, r1)
        L_0x005f:
            int[] r0 = r7.f44771m1
            r1 = r0[r12]
            int[] r2 = r7.f44769k1
            r3 = r2[r12]
            int r1 = r1 + r3
            r0[r12] = r1
            r1 = r0[r11]
            r2 = r2[r11]
            int r1 = r1 + r2
            r0[r11] = r1
            goto L_0x0118
        L_0x0073:
            int r0 = r18.getOverScrollMode()
            r1 = 2
            if (r0 == r1) goto L_0x0118
            if (r10 == 0) goto L_0x0115
            r0 = 8194(0x2002, float:1.1482E-41)
            int r1 = r21.getSource()
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0087
            r0 = 1
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 != 0) goto L_0x0115
            float r0 = r21.getX()
            float r1 = (float) r15
            float r2 = r21.getY()
            r3 = r17
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b5
            r18.mo17157y0()
            android.widget.EdgeEffect r6 = r7.f44733N
            float r10 = -r1
            int r15 = r18.getWidth()
            float r15 = (float) r15
            float r10 = r10 / r15
            int r15 = r18.getHeight()
            float r15 = (float) r15
            float r2 = r2 / r15
            float r2 = r4 - r2
            r6.onPull(r10, r2)
            goto L_0x00ce
        L_0x00b5:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d0
            r18.mo17158z0()
            android.widget.EdgeEffect r6 = r7.f44735Q
            int r10 = r18.getWidth()
            float r10 = (float) r10
            float r10 = r1 / r10
            int r15 = r18.getHeight()
            float r15 = (float) r15
            float r2 = r2 / r15
            r6.onPull(r10, r2)
        L_0x00ce:
            r2 = 1
            goto L_0x00d1
        L_0x00d0:
            r2 = 0
        L_0x00d1:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00eb
            r18.mo17016A0()
            android.widget.EdgeEffect r2 = r7.f44734P
            float r4 = -r3
            int r6 = r18.getHeight()
            float r6 = (float) r6
            float r4 = r4 / r6
            int r6 = r18.getWidth()
            float r6 = (float) r6
            float r0 = r0 / r6
            r2.onPull(r4, r0)
            goto L_0x0105
        L_0x00eb:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0106
            r18.mo17156x0()
            android.widget.EdgeEffect r2 = r7.f44737R
            int r6 = r18.getHeight()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r10 = r18.getWidth()
            float r10 = (float) r10
            float r0 = r0 / r10
            float r4 = r4 - r0
            r2.onPull(r6, r4)
        L_0x0105:
            r2 = 1
        L_0x0106:
            if (r2 != 0) goto L_0x0110
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0110
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0115
        L_0x0110:
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107208b.m145183k(r18)
        L_0x0115:
            r18.mo17099n0(r19, r20)
        L_0x0118:
            if (r14 != 0) goto L_0x011c
            if (r13 == 0) goto L_0x011f
        L_0x011c:
            r7.mo17154w0(r14, r13)
        L_0x011f:
            boolean r0 = r18.awakenScrollBars()
            if (r0 != 0) goto L_0x0128
            r18.invalidate()
        L_0x0128:
            if (r14 != 0) goto L_0x012e
            if (r13 == 0) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            r11 = 0
        L_0x012e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo17111p1(int, int, android.view.MotionEvent):boolean");
    }

    /* renamed from: q0 */
    public void mo17112q0(View view) {
        C16631z Q0 = m15803Q0(view);
        C16613e eVar = this.f44781r;
        if (!(eVar == null || Q0 == null)) {
            eVar.onViewDetachedFromWindow(Q0);
        }
        List<C16621m> list = this.f44727H;
        if (list != null) {
            for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
                ((C16621m) ((ArrayList) this.f44727H).get(size)).mo17332E0(view);
            }
        }
    }

    /* renamed from: q1 */
    public void mo17113q1(int i, int i2, int[] iArr) {
        C16631z zVar;
        mo17151u1();
        mo17040a1();
        int i3 = C103302h.f304582a;
        Trace.beginSection("RV Scroll");
        mo17018C0(this.f44752a1);
        int scrollHorizontallyBy = i != 0 ? this.f44782s.scrollHorizontallyBy(i, this.f44757e, this.f44752a1) : 0;
        int scrollVerticallyBy = i2 != 0 ? this.f44782s.scrollVerticallyBy(i2, this.f44757e, this.f44752a1) : 0;
        Trace.endSection();
        int e = this.f44763h.mo17490e();
        for (int i4 = 0; i4 < e; i4++) {
            View d = this.f44763h.mo17489d(i4);
            C16631z P0 = mo17031P0(d);
            if (!(P0 == null || (zVar = P0.f44862o) == null)) {
                View view = zVar.f44854d;
                int left = d.getLeft();
                int top = d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        mo17042b1(true);
        mo17153v1(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x035f, code lost:
        if (r0.f44763h.mo17496k(getFocusedChild()) == false) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f5, code lost:
        r5 = r1;
     */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17114r0() {
        /*
            r17 = this;
            r0 = r17
            androidx.recyclerview.widget.RecyclerView$e r1 = r0.f44781r
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.f44782s
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f44752a1
            r2 = 0
            r1.f44840i = r2
            int r1 = r1.f44835d
            r3 = 1
            if (r1 != r3) goto L_0x0022
            r17.mo17121s0()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.f44782s
            r1.setExactMeasureSpecsFrom(r0)
            r17.mo17148t0()
            goto L_0x0060
        L_0x0022:
            androidx.recyclerview.widget.a r1 = r0.f44761g
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r4 = r1.f44944c
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0036
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r1.f44943b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0036
            r1 = 1
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            if (r1 != 0) goto L_0x0058
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.f44782s
            int r1 = r1.getWidth()
            int r4 = r17.getWidth()
            if (r1 != r4) goto L_0x0058
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.f44782s
            int r1 = r1.getHeight()
            int r4 = r17.getHeight()
            if (r1 == r4) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.f44782s
            r1.setExactMeasureSpecsFrom(r0)
            goto L_0x0060
        L_0x0058:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.f44782s
            r1.setExactMeasureSpecsFrom(r0)
            r17.mo17148t0()
        L_0x0060:
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f44752a1
            r4 = 4
            r1.mo17353a(r4)
            r17.mo17151u1()
            r17.mo17040a1()
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f44752a1
            r1.f44835d = r3
            boolean r1 = r1.f44841j
            r5 = 0
            r6 = -1
            if (r1 == 0) goto L_0x02c3
            androidx.recyclerview.widget.e r1 = r0.f44763h
            int r1 = r1.mo17490e()
            int r1 = r1 - r3
        L_0x007d:
            if (r1 < 0) goto L_0x01ae
            androidx.recyclerview.widget.e r7 = r0.f44763h
            android.view.View r7 = r7.mo17489d(r1)
            androidx.recyclerview.widget.RecyclerView$z r7 = m15803Q0(r7)
            boolean r8 = r7.mo17377w()
            if (r8 == 0) goto L_0x0091
            goto L_0x01aa
        L_0x0091:
            long r8 = r0.mo17028M0(r7)
            androidx.recyclerview.widget.RecyclerView$j r10 = r0.f44739S
            r10.getClass()
            androidx.recyclerview.widget.RecyclerView$j$c r10 = new androidx.recyclerview.widget.RecyclerView$j$c
            r10.<init>()
            r10.mo17331a(r7, r2)
            androidx.recyclerview.widget.h0 r11 = r0.f44765i
            u.f<androidx.recyclerview.widget.RecyclerView$z> r11 = r11.f306555b
            java.lang.Object r11 = r11.mo162755d(r8, r5)
            androidx.recyclerview.widget.RecyclerView$z r11 = (androidx.recyclerview.widget.RecyclerView.C16631z) r11
            if (r11 == 0) goto L_0x01a5
            boolean r12 = r11.mo17377w()
            if (r12 != 0) goto L_0x01a5
            androidx.recyclerview.widget.h0 r12 = r0.f44765i
            u.b<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.h0$a> r12 = r12.f306554a
            java.lang.Object r12 = r12.getOrDefault(r11, r5)
            androidx.recyclerview.widget.h0$a r12 = (androidx.recyclerview.widget.C103777h0.C103778a) r12
            if (r12 == 0) goto L_0x00c7
            int r12 = r12.f306557a
            r12 = r12 & r3
            if (r12 == 0) goto L_0x00c7
            r12 = 1
            goto L_0x00c8
        L_0x00c7:
            r12 = 0
        L_0x00c8:
            androidx.recyclerview.widget.h0 r13 = r0.f44765i
            u.b<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.h0$a> r13 = r13.f306554a
            java.lang.Object r13 = r13.getOrDefault(r7, r5)
            androidx.recyclerview.widget.h0$a r13 = (androidx.recyclerview.widget.C103777h0.C103778a) r13
            if (r13 == 0) goto L_0x00db
            int r13 = r13.f306557a
            r13 = r13 & r3
            if (r13 == 0) goto L_0x00db
            r13 = 1
            goto L_0x00dc
        L_0x00db:
            r13 = 0
        L_0x00dc:
            if (r12 == 0) goto L_0x00e7
            if (r11 != r7) goto L_0x00e7
            androidx.recyclerview.widget.h0 r8 = r0.f44765i
            r8.mo145148a(r7, r10)
            goto L_0x01aa
        L_0x00e7:
            androidx.recyclerview.widget.h0 r14 = r0.f44765i
            androidx.recyclerview.widget.RecyclerView$j$c r14 = r14.mo145150c(r11, r4)
            androidx.recyclerview.widget.h0 r15 = r0.f44765i
            r15.mo145148a(r7, r10)
            androidx.recyclerview.widget.h0 r10 = r0.f44765i
            r15 = 8
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r10.mo145150c(r7, r15)
            if (r14 != 0) goto L_0x017b
            androidx.recyclerview.widget.e r10 = r0.f44763h
            int r10 = r10.mo17490e()
            r12 = 0
        L_0x0103:
            if (r12 >= r10) goto L_0x0171
            androidx.recyclerview.widget.e r13 = r0.f44763h
            android.view.View r13 = r13.mo17489d(r12)
            androidx.recyclerview.widget.RecyclerView$z r13 = m15803Q0(r13)
            if (r13 != r7) goto L_0x0112
            goto L_0x016e
        L_0x0112:
            long r14 = r0.mo17028M0(r13)
            int r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r16 != 0) goto L_0x016e
            androidx.recyclerview.widget.RecyclerView$e r1 = r0.f44781r
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x014a
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L_0x014a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.append(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r17.mo17017B0()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x014a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.append(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r17.mo17017B0()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x016e:
            int r12 = r12 + 1
            goto L_0x0103
        L_0x0171:
            java.util.Objects.toString(r11)
            java.util.Objects.toString(r7)
            r17.mo17017B0()
            goto L_0x01aa
        L_0x017b:
            r11.mo17376v(r2)
            if (r12 == 0) goto L_0x0183
            r0.mo17064g0(r11)
        L_0x0183:
            if (r11 == r7) goto L_0x0199
            if (r13 == 0) goto L_0x018a
            r0.mo17064g0(r7)
        L_0x018a:
            r11.f44861n = r7
            r0.mo17064g0(r11)
            androidx.recyclerview.widget.RecyclerView$r r8 = r0.f44757e
            r8.mo17349m(r11)
            r7.mo17376v(r2)
            r7.f44862o = r11
        L_0x0199:
            androidx.recyclerview.widget.RecyclerView$j r8 = r0.f44739S
            boolean r7 = r8.mo17314b(r11, r7, r14, r10)
            if (r7 == 0) goto L_0x01aa
            r17.mo17061e1()
            goto L_0x01aa
        L_0x01a5:
            androidx.recyclerview.widget.h0 r8 = r0.f44765i
            r8.mo145148a(r7, r10)
        L_0x01aa:
            int r1 = r1 + -1
            goto L_0x007d
        L_0x01ae:
            androidx.recyclerview.widget.h0 r1 = r0.f44765i
            androidx.recyclerview.widget.h0$b r4 = r0.f44780q1
            u.b<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.h0$a> r7 = r1.f306554a
            int r7 = r7.f332583f
            int r7 = r7 + r6
        L_0x01b7:
            if (r7 < 0) goto L_0x02c3
            u.b<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.h0$a> r8 = r1.f306554a
            java.lang.Object r8 = r8.mo162789j(r7)
            androidx.recyclerview.widget.RecyclerView$z r8 = (androidx.recyclerview.widget.RecyclerView.C16631z) r8
            u.b<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.h0$a> r9 = r1.f306554a
            java.lang.Object r9 = r9.mo162790k(r7)
            androidx.recyclerview.widget.h0$a r9 = (androidx.recyclerview.widget.C103777h0.C103778a) r9
            int r10 = r9.f306557a
            r11 = r10 & 3
            r12 = 3
            if (r11 != r12) goto L_0x01e0
            r10 = r4
            androidx.recyclerview.widget.RecyclerView$d r10 = (androidx.recyclerview.widget.RecyclerView.C16612d) r10
            androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$LayoutManager r11 = r10.f44782s
            android.view.View r8 = r8.f44854d
            androidx.recyclerview.widget.RecyclerView$r r10 = r10.f44757e
            r11.removeAndRecycleView(r8, r10)
            goto L_0x02b2
        L_0x01e0:
            r11 = r10 & 1
            if (r11 == 0) goto L_0x0219
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r9.f306558b
            if (r10 != 0) goto L_0x01f8
            r10 = r4
            androidx.recyclerview.widget.RecyclerView$d r10 = (androidx.recyclerview.widget.RecyclerView.C16612d) r10
            androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$LayoutManager r11 = r10.f44782s
            android.view.View r8 = r8.f44854d
            androidx.recyclerview.widget.RecyclerView$r r10 = r10.f44757e
            r11.removeAndRecycleView(r8, r10)
            goto L_0x02b2
        L_0x01f8:
            androidx.recyclerview.widget.RecyclerView$j$c r11 = r9.f306559c
            r12 = r4
            androidx.recyclerview.widget.RecyclerView$d r12 = (androidx.recyclerview.widget.RecyclerView.C16612d) r12
            androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$r r13 = r13.f44757e
            r13.mo17349m(r8)
            androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
            r12.mo17064g0(r8)
            r8.mo17376v(r2)
            androidx.recyclerview.widget.RecyclerView$j r13 = r12.f44739S
            boolean r8 = r13.mo17315c(r8, r10, r11)
            if (r8 == 0) goto L_0x02b2
            r12.mo17061e1()
            goto L_0x02b2
        L_0x0219:
            r11 = r10 & 14
            r12 = 14
            if (r11 != r12) goto L_0x023b
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r9.f306558b
            androidx.recyclerview.widget.RecyclerView$j$c r11 = r9.f306559c
            r12 = r4
            androidx.recyclerview.widget.RecyclerView$d r12 = (androidx.recyclerview.widget.RecyclerView.C16612d) r12
            androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
            r12.getClass()
            r8.mo17376v(r2)
            androidx.recyclerview.widget.RecyclerView$j r13 = r12.f44739S
            boolean r8 = r13.mo17313a(r8, r10, r11)
            if (r8 == 0) goto L_0x02b2
            r12.mo17061e1()
            goto L_0x02b2
        L_0x023b:
            r11 = r10 & 12
            r12 = 12
            if (r11 != r12) goto L_0x0270
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r9.f306558b
            androidx.recyclerview.widget.RecyclerView$j$c r11 = r9.f306559c
            r12 = r4
            androidx.recyclerview.widget.RecyclerView$d r12 = (androidx.recyclerview.widget.RecyclerView.C16612d) r12
            r12.getClass()
            r8.mo17376v(r2)
            androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
            boolean r14 = r13.f44728I
            if (r14 == 0) goto L_0x0262
            androidx.recyclerview.widget.RecyclerView$j r13 = r13.f44739S
            boolean r8 = r13.mo17314b(r8, r8, r10, r11)
            if (r8 == 0) goto L_0x02b2
            androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
            r8.mo17061e1()
            goto L_0x02b2
        L_0x0262:
            androidx.recyclerview.widget.RecyclerView$j r13 = r13.f44739S
            boolean r8 = r13.mo17316d(r8, r10, r11)
            if (r8 == 0) goto L_0x02b2
            androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
            r8.mo17061e1()
            goto L_0x02b2
        L_0x0270:
            r11 = r10 & 4
            if (r11 == 0) goto L_0x0294
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r9.f306558b
            r11 = r4
            androidx.recyclerview.widget.RecyclerView$d r11 = (androidx.recyclerview.widget.RecyclerView.C16612d) r11
            androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$r r12 = r12.f44757e
            r12.mo17349m(r8)
            androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
            r11.mo17064g0(r8)
            r8.mo17376v(r2)
            androidx.recyclerview.widget.RecyclerView$j r12 = r11.f44739S
            boolean r8 = r12.mo17315c(r8, r10, r5)
            if (r8 == 0) goto L_0x02b2
            r11.mo17061e1()
            goto L_0x02b2
        L_0x0294:
            r10 = r10 & 8
            if (r10 == 0) goto L_0x02b2
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r9.f306558b
            androidx.recyclerview.widget.RecyclerView$j$c r11 = r9.f306559c
            r12 = r4
            androidx.recyclerview.widget.RecyclerView$d r12 = (androidx.recyclerview.widget.RecyclerView.C16612d) r12
            androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
            r12.getClass()
            r8.mo17376v(r2)
            androidx.recyclerview.widget.RecyclerView$j r13 = r12.f44739S
            boolean r8 = r13.mo17313a(r8, r10, r11)
            if (r8 == 0) goto L_0x02b2
            r12.mo17061e1()
        L_0x02b2:
            r9.f306557a = r2
            r9.f306558b = r5
            r9.f306559c = r5
            d3.d<androidx.recyclerview.widget.h0$a> r8 = androidx.recyclerview.widget.C103777h0.C103778a.f306556d
            d3.e r8 = (p329d3.C106985e) r8
            r8.mo157420b(r9)
            int r7 = r7 + -1
            goto L_0x01b7
        L_0x02c3:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.f44782s
            androidx.recyclerview.widget.RecyclerView$r r4 = r0.f44757e
            r1.removeAndRecycleScrapInt(r4)
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f44752a1
            int r4 = r1.f44836e
            r1.f44833b = r4
            r0.f44728I = r2
            r0.f44729J = r2
            r1.f44841j = r2
            r1.f44842k = r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.f44782s
            r1.mRequestedSimpleAnimations = r2
            androidx.recyclerview.widget.RecyclerView$r r1 = r0.f44757e
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r1 = r1.f44823b
            if (r1 == 0) goto L_0x02e5
            r1.clear()
        L_0x02e5:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.f44782s
            boolean r4 = r1.mPrefetchMaxObservedInInitialPrefetch
            if (r4 == 0) goto L_0x02f4
            r1.mPrefetchMaxCountObserved = r2
            r1.mPrefetchMaxObservedInInitialPrefetch = r2
            androidx.recyclerview.widget.RecyclerView$r r1 = r0.f44757e
            r1.mo17350n()
        L_0x02f4:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.f44782s
            androidx.recyclerview.widget.RecyclerView$w r4 = r0.f44752a1
            r1.onLayoutCompleted(r4)
            r0.mo17042b1(r3)
            r0.mo17153v1(r2)
            androidx.recyclerview.widget.h0 r1 = r0.f44765i
            u.b<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.h0$a> r4 = r1.f306554a
            r4.clear()
            u.f<androidx.recyclerview.widget.RecyclerView$z> r1 = r1.f306555b
            r1.clear()
            int[] r1 = r0.f44766i1
            r4 = r1[r2]
            r7 = r1[r3]
            r0.mo17022G0(r1)
            int[] r1 = r0.f44766i1
            r8 = r1[r2]
            if (r8 != r4) goto L_0x0322
            r1 = r1[r3]
            if (r1 == r7) goto L_0x0321
            goto L_0x0322
        L_0x0321:
            r3 = 0
        L_0x0322:
            if (r3 == 0) goto L_0x0327
            r0.mo17154w0(r2, r2)
        L_0x0327:
            boolean r1 = r0.f44748W0
            r3 = -1
            if (r1 == 0) goto L_0x0431
            androidx.recyclerview.widget.RecyclerView$e r1 = r0.f44781r
            if (r1 == 0) goto L_0x0431
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0431
            int r1 = r17.getDescendantFocusability()
            r7 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r7) goto L_0x0431
            int r1 = r17.getDescendantFocusability()
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r7) goto L_0x034f
            boolean r1 = r17.isFocused()
            if (r1 == 0) goto L_0x034f
            goto L_0x0431
        L_0x034f:
            boolean r1 = r17.isFocused()
            if (r1 != 0) goto L_0x0363
            android.view.View r1 = r17.getFocusedChild()
            androidx.recyclerview.widget.e r7 = r0.f44763h
            boolean r1 = r7.mo17496k(r1)
            if (r1 != 0) goto L_0x0363
            goto L_0x0431
        L_0x0363:
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f44752a1
            long r7 = r1.f44844m
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x03b5
            androidx.recyclerview.widget.RecyclerView$e r1 = r0.f44781r
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L_0x03b5
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f44752a1
            long r7 = r1.f44844m
            androidx.recyclerview.widget.RecyclerView$e r1 = r0.f44781r
            if (r1 == 0) goto L_0x03b2
            boolean r1 = r1.hasStableIds()
            if (r1 != 0) goto L_0x0382
            goto L_0x03b2
        L_0x0382:
            androidx.recyclerview.widget.e r1 = r0.f44763h
            int r1 = r1.mo17493h()
            r10 = r5
            r9 = 0
        L_0x038a:
            if (r9 >= r1) goto L_0x03b3
            androidx.recyclerview.widget.e r11 = r0.f44763h
            android.view.View r11 = r11.mo17492g(r9)
            androidx.recyclerview.widget.RecyclerView$z r11 = m15803Q0(r11)
            if (r11 == 0) goto L_0x03af
            boolean r12 = r11.mo17370q()
            if (r12 != 0) goto L_0x03af
            long r12 = r11.f44858h
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x03af
            androidx.recyclerview.widget.e r10 = r0.f44763h
            android.view.View r12 = r11.f44854d
            boolean r10 = r10.mo17496k(r12)
            if (r10 == 0) goto L_0x03b6
            r10 = r11
        L_0x03af:
            int r9 = r9 + 1
            goto L_0x038a
        L_0x03b2:
            r10 = r5
        L_0x03b3:
            r11 = r10
            goto L_0x03b6
        L_0x03b5:
            r11 = r5
        L_0x03b6:
            if (r11 == 0) goto L_0x03ce
            androidx.recyclerview.widget.e r1 = r0.f44763h
            android.view.View r7 = r11.f44854d
            boolean r1 = r1.mo17496k(r7)
            if (r1 != 0) goto L_0x03ce
            android.view.View r1 = r11.f44854d
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x03cb
            goto L_0x03ce
        L_0x03cb:
            android.view.View r5 = r11.f44854d
            goto L_0x0416
        L_0x03ce:
            androidx.recyclerview.widget.e r1 = r0.f44763h
            int r1 = r1.mo17490e()
            if (r1 <= 0) goto L_0x0416
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f44752a1
            int r7 = r1.f44843l
            if (r7 == r6) goto L_0x03dd
            r2 = r7
        L_0x03dd:
            int r1 = r1.mo17354b()
            r7 = r2
        L_0x03e2:
            if (r7 >= r1) goto L_0x03fa
            androidx.recyclerview.widget.RecyclerView$z r8 = r0.mo17023I0(r7)
            if (r8 != 0) goto L_0x03eb
            goto L_0x03fa
        L_0x03eb:
            android.view.View r9 = r8.f44854d
            boolean r9 = r9.hasFocusable()
            if (r9 == 0) goto L_0x03f7
            android.view.View r1 = r8.f44854d
        L_0x03f5:
            r5 = r1
            goto L_0x0416
        L_0x03f7:
            int r7 = r7 + 1
            goto L_0x03e2
        L_0x03fa:
            int r1 = java.lang.Math.min(r1, r2)
            int r1 = r1 + r6
        L_0x03ff:
            if (r1 < 0) goto L_0x0416
            androidx.recyclerview.widget.RecyclerView$z r2 = r0.mo17023I0(r1)
            if (r2 != 0) goto L_0x0408
            goto L_0x0416
        L_0x0408:
            android.view.View r7 = r2.f44854d
            boolean r7 = r7.hasFocusable()
            if (r7 == 0) goto L_0x0413
            android.view.View r1 = r2.f44854d
            goto L_0x03f5
        L_0x0413:
            int r1 = r1 + -1
            goto L_0x03ff
        L_0x0416:
            if (r5 == 0) goto L_0x0431
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f44752a1
            int r1 = r1.f44845n
            long r7 = (long) r1
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042e
            android.view.View r1 = r5.findViewById(r1)
            if (r1 == 0) goto L_0x042e
            boolean r2 = r1.isFocusable()
            if (r2 == 0) goto L_0x042e
            r5 = r1
        L_0x042e:
            r5.requestFocus()
        L_0x0431:
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f44752a1
            r1.f44844m = r3
            r1.f44843l = r6
            r1.f44845n = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo17114r0():void");
    }

    /* renamed from: r1 */
    public void mo17115r1(int i) {
        if (!this.f44722C) {
            mo17155w1();
            LayoutManager layoutManager = this.f44782s;
            if (layoutManager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                LayoutManager layoutManager2 = layoutManager;
                C117292a.m165358d(layoutManager2, aVar.mo10232b(), "androidx/recyclerview/widget/RecyclerView", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(layoutManager2, "androidx/recyclerview/widget/RecyclerView", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                awakenScrollBars();
            }
        }
    }

    public void removeDetachedView(View view, boolean z) {
        C16631z Q0 = m15803Q0(view);
        if (Q0 != null) {
            if (Q0.mo17372s()) {
                Q0.f44863p &= -257;
            } else if (!Q0.mo17377w()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + Q0 + mo17017B0());
            }
        }
        view.clearAnimation();
        mo17112q0(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f44782s.onRequestChildFocus(this, this.f44752a1, view, view2) && view2 != null) {
            mo17100n1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f44782s.requestChildRectangleOnScreen(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f44785v.size();
        for (int i = 0; i < size; i++) {
            this.f44785v.get(i).mo127d(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f44720A != 0 || this.f44722C) {
            this.f44721B = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s0 */
    public final void mo17121s0() {
        this.f44752a1.mo17353a(1);
        mo17018C0(this.f44752a1);
        this.f44752a1.f44840i = false;
        mo17151u1();
        C103777h0 h0Var = this.f44765i;
        h0Var.f306554a.clear();
        h0Var.f306555b.clear();
        mo17040a1();
        mo17062f1();
        View focusedChild = (!this.f44748W0 || !hasFocus() || this.f44781r == null) ? null : getFocusedChild();
        C16631z F0 = focusedChild == null ? null : mo17021F0(focusedChild);
        long j = -1;
        if (F0 == null) {
            C16628w wVar = this.f44752a1;
            wVar.f44844m = -1;
            wVar.f44843l = -1;
            wVar.f44845n = -1;
        } else {
            C16628w wVar2 = this.f44752a1;
            if (this.f44781r.hasStableIds()) {
                j = F0.f44858h;
            }
            wVar2.f44844m = j;
            this.f44752a1.f44843l = this.f44728I ? -1 : F0.mo17370q() ? F0.f44857g : F0.mo17363j();
            C16628w wVar3 = this.f44752a1;
            View view = F0.f44854d;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            wVar3.f44845n = id;
        }
        C16628w wVar4 = this.f44752a1;
        wVar4.f44839h = wVar4.f44841j && this.f44758e1;
        this.f44758e1 = false;
        this.f44756d1 = false;
        wVar4.f44838g = wVar4.f44842k;
        wVar4.f44836e = this.f44781r.getItemCount();
        mo17022G0(this.f44766i1);
        if (this.f44752a1.f44841j) {
            int e = this.f44763h.mo17490e();
            for (int i = 0; i < e; i++) {
                C16631z Q0 = m15803Q0(this.f44763h.mo17489d(i));
                if (!Q0.mo17377w() && (!Q0.mo17369p() || this.f44781r.hasStableIds())) {
                    this.f44765i.mo145149b(Q0, this.f44739S.mo17328q(this.f44752a1, Q0, C16616j.m15901e(Q0), Q0.mo17366m()));
                    if (this.f44752a1.f44839h) {
                        if (((Q0.f44863p & 2) != 0) && !Q0.mo17370q() && !Q0.mo17377w() && !Q0.mo17369p()) {
                            this.f44765i.f306555b.mo162756e(mo17028M0(Q0), Q0);
                        }
                    }
                }
            }
        }
        if (this.f44752a1.f44842k) {
            int h = this.f44763h.mo17493h();
            for (int i2 = 0; i2 < h; i2++) {
                C16631z Q02 = m15803Q0(this.f44763h.mo17492g(i2));
                if (!Q02.mo17377w() && Q02.f44857g == -1) {
                    Q02.f44857g = Q02.f44856f;
                }
            }
            C16628w wVar5 = this.f44752a1;
            boolean z = wVar5.f44837f;
            wVar5.f44837f = false;
            this.f44782s.onLayoutChildren(this.f44757e, wVar5);
            this.f44752a1.f44837f = z;
            for (int i3 = 0; i3 < this.f44763h.mo17490e(); i3++) {
                C16631z Q03 = m15803Q0(this.f44763h.mo17489d(i3));
                if (!Q03.mo17377w()) {
                    C103777h0.C103778a orDefault = this.f44765i.f306554a.getOrDefault(Q03, null);
                    if (!((orDefault == null || (orDefault.f306557a & 4) == 0) ? false : true)) {
                        int e2 = C16616j.m15901e(Q03);
                        boolean n = Q03.mo17367n(8192);
                        if (!n) {
                            e2 |= 4096;
                        }
                        C16616j.C16619c q = this.f44739S.mo17328q(this.f44752a1, Q03, e2, Q03.mo17366m());
                        if (n) {
                            mo17086h1(Q03, q);
                        } else {
                            C103777h0 h0Var2 = this.f44765i;
                            C103777h0.C103778a orDefault2 = h0Var2.f306554a.getOrDefault(Q03, null);
                            if (orDefault2 == null) {
                                orDefault2 = C103777h0.C103778a.m138192a();
                                h0Var2.f306554a.put(Q03, orDefault2);
                            }
                            orDefault2.f306557a |= 2;
                            orDefault2.f306558b = q;
                        }
                    }
                }
            }
            mo17097m0();
        } else {
            mo17097m0();
        }
        mo17042b1(true);
        mo17153v1(false);
        this.f44752a1.f44835d = 2;
    }

    /* renamed from: s1 */
    public void mo17122s1(int i, int i2, Interpolator interpolator) {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null && !this.f44722C) {
            if (!layoutManager.canScrollHorizontally()) {
                i = 0;
            }
            if (!this.f44782s.canScrollVertically()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                C16630y yVar = this.f44749X0;
                int a = yVar.mo17357a(i, i2, 0, 0);
                if (interpolator == null) {
                    interpolator = f44719x1;
                }
                yVar.mo17359c(i, i2, a, interpolator);
            }
        }
    }

    public void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null && !this.f44722C) {
            boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
            boolean canScrollVertically = this.f44782s.canScrollVertically();
            if (canScrollHorizontally || canScrollVertically) {
                if (!canScrollHorizontally) {
                    i = 0;
                }
                if (!canScrollVertically) {
                    i2 = 0;
                }
                mo17111p1(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (mo17036W0()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i = contentChangeTypes;
            }
            this.f44724E |= i;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C103775c0 c0Var) {
        this.f44764h1 = c0Var;
        C107207u.m145168i(this, c0Var);
    }

    public void setAdapter(C16613e eVar) {
        setLayoutFrozen(false);
        C16613e eVar2 = this.f44781r;
        if (eVar2 != null) {
            eVar2.unregisterAdapterDataObserver(this.f44755d);
            this.f44781r.onDetachedFromRecyclerView(this);
        }
        mo17089i1();
        C16644a aVar = this.f44761g;
        aVar.mo17475l(aVar.f44943b);
        aVar.mo17475l(aVar.f44944c);
        aVar.f44947f = 0;
        C16613e eVar3 = this.f44781r;
        this.f44781r = eVar;
        if (eVar != null) {
            eVar.registerAdapterDataObserver(this.f44755d);
            eVar.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(eVar3, this.f44781r);
        }
        C16625r rVar = this.f44757e;
        C16613e eVar4 = this.f44781r;
        rVar.mo17338b();
        C16623q d = rVar.mo17340d();
        if (eVar3 != null) {
            d.f44817b--;
        }
        if (d.f44817b == 0) {
            d.mo17334a();
        }
        if (eVar4 != null) {
            d.f44817b++;
        }
        this.f44752a1.f44837f = true;
        mo17065g1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0128h hVar) {
        if (hVar != null) {
            setChildrenDrawingOrderEnabled(hVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f44767j) {
            this.f44737R = null;
            this.f44734P = null;
            this.f44735Q = null;
            this.f44733N = null;
        }
        this.f44767j = z;
        super.setClipToPadding(z);
        if (this.f44791z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C16632i iVar) {
        iVar.getClass();
        this.f44732M = iVar;
        this.f44737R = null;
        this.f44734P = null;
        this.f44735Q = null;
        this.f44733N = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f44789y = z;
    }

    public void setItemAnimator(C16616j jVar) {
        C16616j jVar2 = this.f44739S;
        if (jVar2 != null) {
            jVar2.mo17322k();
            this.f44739S.f44805a = null;
        }
        this.f44739S = jVar;
        if (jVar != null) {
            jVar.f44805a = this.f44760f1;
        }
    }

    public void setItemViewCacheSize(int i) {
        C16625r rVar = this.f44757e;
        rVar.f44826e = i;
        rVar.mo17350n();
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f44722C) {
            mo17094k0("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f44722C = false;
                if (!(!this.f44721B || this.f44782s == null || this.f44781r == null)) {
                    requestLayout();
                }
                this.f44721B = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f44722C = true;
            this.f44723D = true;
            mo17155w1();
        }
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        int i;
        if (layoutManager != this.f44782s) {
            mo17155w1();
            if (this.f44782s != null) {
                C16616j jVar = this.f44739S;
                if (jVar != null) {
                    jVar.mo17322k();
                }
                this.f44782s.removeAndRecycleAllViews(this.f44757e);
                this.f44782s.removeAndRecycleScrapInt(this.f44757e);
                this.f44757e.mo17338b();
                if (this.f44787x) {
                    this.f44782s.dispatchDetachedFromWindow(this, this.f44757e);
                }
                this.f44782s.setRecyclerView((RecyclerView) null);
                this.f44782s = null;
            } else {
                this.f44757e.mo17338b();
            }
            C16650e eVar = this.f44763h;
            eVar.f44955b.mo17506g();
            int size = ((ArrayList) eVar.f44956c).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C16647a0 a0Var = (C16647a0) eVar.f44954a;
                a0Var.getClass();
                C16631z Q0 = m15803Q0((View) ((ArrayList) eVar.f44956c).get(size));
                if (Q0 != null) {
                    RecyclerView recyclerView = a0Var.f44952a;
                    int i2 = Q0.f44869v;
                    if (recyclerView.mo17036W0()) {
                        Q0.f44870w = i2;
                        ((ArrayList) recyclerView.f44775o1).add(Q0);
                    } else {
                        View view = Q0.f44854d;
                        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                        C107207u.C107208b.m145191s(view, i2);
                    }
                    Q0.f44869v = 0;
                }
                ((ArrayList) eVar.f44956c).remove(size);
            }
            C16647a0 a0Var2 = (C16647a0) eVar.f44954a;
            int a = a0Var2.mo17480a();
            for (i = 0; i < a; i++) {
                View childAt = a0Var2.f44952a.getChildAt(i);
                a0Var2.f44952a.mo17112q0(childAt);
                childAt.clearAnimation();
            }
            a0Var2.f44952a.removeAllViews();
            this.f44782s = layoutManager;
            if (layoutManager != null) {
                if (layoutManager.mRecyclerView == null) {
                    layoutManager.setRecyclerView(this);
                    if (this.f44787x) {
                        this.f44782s.dispatchAttachedToWindow(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.mRecyclerView.mo17017B0());
                }
            }
            this.f44757e.mo17350n();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo157672i(z);
    }

    public void setOnFlingListener(C16633n nVar) {
        this.f44738R0 = nVar;
    }

    @Deprecated
    public void setOnScrollListener(C0130p pVar) {
        this.f44753b1 = pVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f44748W0 = z;
    }

    public void setRecycledViewPool(C16623q qVar) {
        C16625r rVar = this.f44757e;
        C16623q qVar2 = rVar.f44828g;
        if (qVar2 != null) {
            qVar2.f44817b--;
        }
        rVar.f44828g = qVar;
        if (qVar != null && RecyclerView.this.getAdapter() != null) {
            rVar.f44828g.f44817b++;
        }
    }

    public void setRecyclerListener(C16626s sVar) {
        this.f44783t = sVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f44741T) {
            this.f44741T = i;
            if (i != 2) {
                C16630y yVar = this.f44749X0;
                RecyclerView.this.removeCallbacks(yVar);
                yVar.f44848f.abortAnimation();
                LayoutManager layoutManager = this.f44782s;
                if (layoutManager != null) {
                    layoutManager.stopSmoothScroller();
                }
            }
            LayoutManager layoutManager2 = this.f44782s;
            if (layoutManager2 != null) {
                layoutManager2.onScrollStateChanged(i);
            }
            C0130p pVar = this.f44753b1;
            if (pVar != null) {
                pVar.onScrollStateChanged(this, i);
            }
            List<C0130p> list = this.f44754c1;
            if (list != null) {
                int size = ((ArrayList) list).size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C0130p) ((ArrayList) this.f44754c1).get(size)).onScrollStateChanged(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0 || i != 1) {
            this.f44736Q0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f44736Q0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(C16629x xVar) {
        this.f44757e.f44829h = xVar;
    }

    public void smoothScrollBy(int i, int i2) {
        mo17122s1(i, i2, (Interpolator) null);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo157673j(i, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo157674k(0);
    }

    /* renamed from: t0 */
    public final void mo17148t0() {
        mo17151u1();
        mo17040a1();
        this.f44752a1.mo17353a(6);
        this.f44761g.mo17466c();
        this.f44752a1.f44836e = this.f44781r.getItemCount();
        C16628w wVar = this.f44752a1;
        wVar.f44834c = 0;
        wVar.f44838g = false;
        this.f44782s.onLayoutChildren(this.f44757e, wVar);
        C16628w wVar2 = this.f44752a1;
        wVar2.f44837f = false;
        this.f44759f = null;
        wVar2.f44841j = wVar2.f44841j && this.f44739S != null;
        wVar2.f44835d = 4;
        mo17042b1(true);
        mo17153v1(false);
    }

    /* renamed from: t1 */
    public void mo17149t1(int i) {
        LayoutManager layoutManager;
        if (!this.f44722C && (layoutManager = this.f44782s) != null) {
            layoutManager.smoothScrollToPosition(this, this.f44752a1, i);
        }
    }

    /* renamed from: u0 */
    public boolean mo17150u0(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo157667d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: u1 */
    public void mo17151u1() {
        int i = this.f44720A + 1;
        this.f44720A = i;
        if (i == 1 && !this.f44722C) {
            this.f44721B = false;
        }
    }

    /* renamed from: v0 */
    public boolean mo17152v0(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo157669f(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    /* renamed from: v1 */
    public void mo17153v1(boolean z) {
        if (this.f44720A < 1) {
            this.f44720A = 1;
        }
        if (!z && !this.f44722C) {
            this.f44721B = false;
        }
        if (this.f44720A == 1) {
            if (z && this.f44721B && !this.f44722C && this.f44782s != null && this.f44781r != null) {
                mo17114r0();
            }
            if (!this.f44722C) {
                this.f44721B = false;
            }
        }
        this.f44720A--;
    }

    /* renamed from: w0 */
    public void mo17154w0(int i, int i2) {
        this.f44731L++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        mo17052d1(i, i2);
        C0130p pVar = this.f44753b1;
        if (pVar != null) {
            pVar.onScrolled(this, i, i2);
        }
        List<C0130p> list = this.f44754c1;
        if (list != null) {
            for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
                ((C0130p) ((ArrayList) this.f44754c1).get(size)).onScrolled(this, i, i2);
            }
        }
        this.f44731L--;
    }

    /* renamed from: w1 */
    public void mo17155w1() {
        setScrollState(0);
        C16630y yVar = this.f44749X0;
        RecyclerView.this.removeCallbacks(yVar);
        yVar.f44848f.abortAnimation();
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    /* renamed from: x0 */
    public void mo17156x0() {
        if (this.f44737R == null) {
            this.f44732M.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f44737R = edgeEffect;
            if (this.f44767j) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: y0 */
    public void mo17157y0() {
        if (this.f44733N == null) {
            this.f44732M.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f44733N = edgeEffect;
            if (this.f44767j) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: z0 */
    public void mo17158z0() {
        if (this.f44735Q == null) {
            this.f44732M.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f44735Q = edgeEffect;
            if (this.f44767j) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static abstract class C16613e<VH extends C16631z> {
        private boolean mHasStableIds = false;
        private final C16614f mObservable = new C16614f();

        public final void bindViewHolder(VH vh, int i) {
            vh.f44856f = i;
            if (hasStableIds()) {
                vh.f44858h = getItemId(i);
            }
            vh.f44863p = (vh.f44863p & -520) | 1;
            int i2 = C103302h.f304582a;
            Trace.beginSection("RV OnBindView");
            onBindViewHolder(vh, i, vh.mo17366m());
            List<Object> list = vh.f44864q;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            vh.f44863p &= -1025;
            ViewGroup.LayoutParams layoutParams = vh.f44854d.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).f44800f = true;
            }
            Trace.endSection();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                int i2 = C103302h.f304582a;
                Trace.beginSection("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.f44854d.getParent() == null) {
                    onCreateViewHolder.f44859i = i;
                    Trace.endSection();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                int i3 = C103302h.f304582a;
                Trace.endSection();
                throw th;
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo17306a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo17307b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo17309d(i, 1, (Object) null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo17310e(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo17308c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo17309d(i, i2, (Object) null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo17310e(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo17311f(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo17311f(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(C16615g gVar) {
            this.mObservable.registerObserver(gVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void unregisterAdapterDataObserver(C16615g gVar) {
            this.mObservable.unregisterObserver(gVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo17309d(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo17309d(i, i2, obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        char c;
        TypedArray typedArray;
        char c2;
        int i2;
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        Object[] objArr;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i;
        this.f44755d = new C16627t();
        this.f44757e = new C16625r();
        this.f44765i = new C103777h0();
        this.f44772n = new C16610a();
        this.f44774o = new Rect();
        this.f44776p = new Rect();
        this.f44779q = new RectF();
        this.f44784u = new ArrayList<>();
        this.f44785v = new ArrayList<>();
        this.f44720A = 0;
        this.f44728I = false;
        this.f44729J = false;
        this.f44730K = 0;
        this.f44731L = 0;
        this.f44732M = new C16632i();
        this.f44739S = new C54234f();
        this.f44741T = 0;
        this.f44743U = -1;
        this.f44744U0 = Float.MIN_VALUE;
        this.f44746V0 = Float.MIN_VALUE;
        boolean z = true;
        this.f44748W0 = true;
        this.f44749X0 = new C16630y();
        this.f44751Z0 = f44717v1 ? new C16661o.C16663b() : null;
        this.f44752a1 = new C16628w();
        this.f44756d1 = false;
        this.f44758e1 = false;
        this.f44760f1 = new C16620k();
        this.f44762g1 = false;
        this.f44766i1 = new int[2];
        this.f44769k1 = new int[2];
        this.f44770l1 = new int[2];
        this.f44771m1 = new int[2];
        this.f44773n1 = new int[2];
        this.f44775o1 = new ArrayList();
        this.f44778p1 = new C16611b();
        this.f44780q1 = new C16612d();
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, f44714s1, i3, 0);
            this.f44767j = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f44767j = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f44736Q0 = viewConfiguration.getScaledTouchSlop();
        this.f44744U0 = C107222v.m145283b(viewConfiguration, context2);
        this.f44746V0 = C107222v.m145285d(viewConfiguration, context2);
        this.f44740S0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f44742T0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f44739S.f44805a = this.f44760f1;
        this.f44761g = new C16644a(new C16648b0(this));
        this.f44763h = new C16650e(new C16647a0(this));
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int i4 = Build.VERSION.SDK_INT;
        if ((i4 >= 26 ? C107207u.C107217j.m145253b(this) : 0) == 0 && i4 >= 26) {
            C107207u.C107217j.m145263l(this, 8);
        }
        if (C107207u.C107208b.m145175c(this) == 0) {
            C107207u.C107208b.m145191s(this, 1);
        }
        this.f44726G = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C103775c0(this));
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, C23223a.f66664a, i3, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo17017B0());
                }
                Resources resources = getContext().getResources();
                c2 = 3;
                Drawable drawable3 = drawable2;
                i2 = 4;
                typedArray = obtainStyledAttributes2;
                c = 2;
                new C16656n(this, stateListDrawable, drawable, stateListDrawable2, drawable3, resources.getDimensionPixelSize(C0966R.dimen.a5l), resources.getDimensionPixelSize(C0966R.dimen.a5n), resources.getDimensionPixelOffset(C0966R.dimen.a5m));
            } else {
                typedArray = obtainStyledAttributes2;
                i2 = 4;
                c2 = 3;
                c = 2;
            }
            typedArray.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class<? extends U> asSubclass = classLoader.loadClass(trim).asSubclass(LayoutManager.class);
                        try {
                            constructor = asSubclass.getConstructor(f44718w1);
                            objArr = new Object[i2];
                            objArr[0] = context2;
                            objArr[1] = attributeSet2;
                            objArr[c] = Integer.valueOf(i);
                            objArr[c2] = 0;
                        } catch (NoSuchMethodException e) {
                            noSuchMethodException = e;
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(noSuchMethodException);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                    } catch (ClassNotFoundException e3) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e3);
                    } catch (InvocationTargetException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e4);
                    } catch (InstantiationException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                    } catch (IllegalAccessException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e6);
                    } catch (ClassCastException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e7);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet2, f44713r1, i3, 0);
            z = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: d */
        public C16631z f44798d;

        /* renamed from: e */
        public final Rect f44799e = new Rect();

        /* renamed from: f */
        public boolean f44800f = true;

        /* renamed from: g */
        public boolean f44801g = false;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo17279a() {
            return this.f44798d.mo17363j();
        }

        /* renamed from: b */
        public int mo17280b() {
            return this.f44798d.mo17364k();
        }

        /* renamed from: c */
        public boolean mo17281c() {
            return (this.f44798d.f44863p & 2) != 0;
        }

        /* renamed from: d */
        public boolean mo17282d() {
            return this.f44798d.mo17370q();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C16638a();

        /* renamed from: f */
        public Parcelable f44885f;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        public static class C16638a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f44885f = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            parcel.writeParcelable(this.f44885f, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.f44782s;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo17017B0());
    }
}
