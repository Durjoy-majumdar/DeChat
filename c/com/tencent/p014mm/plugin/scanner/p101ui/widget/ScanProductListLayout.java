package com.tencent.p014mm.plugin.scanner.p101ui.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13598b0;
import ul2.C111194b0;
import ul2.C111196c0;
import ul2.C111198d0;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B\u001d\b\u0016\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101B%\b\u0016\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00102\u001a\u00020\u0003¢\u0006\u0004\b0\u00103J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010%\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u0014\u0010)\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u00065"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductListLayout;", "Landroid/widget/RelativeLayout;", "", "", "height", "Lrx3/b0;", "setRecyclerViewOriginalStatus", "topMargin", "setRecyclerViewMarginTop", "Landroid/view/ViewGroup$MarginLayoutParams;", "getRecyclerViewMarginLayoutParams", "", "getBottomFadingEdgeStrength", "getTopFadingEdgeStrength", "", "disallowIntercept", "setDisallowInterceptTouchEvent", "Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductListLayout$a;", "d", "Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductListLayout$a;", "getProductListCallBack", "()Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductListLayout$a;", "setProductListCallBack", "(Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductListLayout$a;)V", "productListCallBack", "y", "Z", "getAdjustPaddingTop", "()Z", "setAdjustPaddingTop", "(Z)V", "adjustPaddingTop", "z", "getAdjustPaddingBottom", "setAdjustPaddingBottom", "adjustPaddingBottom", "B", "isAnimating", "setAnimating", "getRecyclerViewItemCount", "()I", "recyclerViewItemCount", "getCloseStateTopMargin", "closeStateTopMargin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout */
public final class ScanProductListLayout extends RelativeLayout implements C111847h {

    /* renamed from: C */
    public static final /* synthetic */ int f316051C = 0;

    /* renamed from: A */
    public int f316052A;

    /* renamed from: B */
    public boolean f316053B;

    /* renamed from: d */
    public C106122a f316054d;

    /* renamed from: e */
    public ViewConfiguration f316055e;

    /* renamed from: f */
    public RecyclerView f316056f;

    /* renamed from: g */
    public float f316057g;

    /* renamed from: h */
    public float f316058h;

    /* renamed from: i */
    public int f316059i;

    /* renamed from: j */
    public boolean f316060j;

    /* renamed from: n */
    public boolean f316061n;

    /* renamed from: o */
    public boolean f316062o;

    /* renamed from: p */
    public boolean f316063p;

    /* renamed from: q */
    public boolean f316064q;

    /* renamed from: r */
    public boolean f316065r;

    /* renamed from: s */
    public int f316066s;

    /* renamed from: t */
    public int f316067t;

    /* renamed from: u */
    public int f316068u;

    /* renamed from: v */
    public float f316069v;

    /* renamed from: w */
    public float f316070w;

    /* renamed from: x */
    public VelocityTracker f316071x;

    /* renamed from: y */
    public boolean f316072y;

    /* renamed from: z */
    public boolean f316073z;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout$a */
    public interface C106122a {
        /* renamed from: a */
        void mo151808a(int i);
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout$b */
    public static final class C106123b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ ScanProductListLayout f316074d;

        /* renamed from: e */
        public final /* synthetic */ int f316075e;

        /* renamed from: f */
        public final /* synthetic */ int f316076f;

        /* renamed from: g */
        public final /* synthetic */ int f316077g;

        /* renamed from: h */
        public final /* synthetic */ boolean f316078h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<Integer, C13598b0> f316079i;

        public C106123b(ScanProductListLayout scanProductListLayout, int i, int i2, int i3, boolean z, C32226l<? super Integer, C13598b0> lVar) {
            this.f316074d = scanProductListLayout;
            this.f316075e = i;
            this.f316076f = i2;
            this.f316077g = i3;
            this.f316078h = z;
            this.f316079i = lVar;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animation");
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            this.f316074d.setAnimating(false);
            int i = this.f316075e;
            int i2 = i - this.f316076f;
            int i3 = this.f316077g;
            if (this.f316078h) {
                i3 -= i2;
            }
            this.f316074d.mo151791g(i, i3);
            this.f316079i.invoke(1);
            Log.m105920e("MicroMsg.ScanProductListLayout", "onAnimationEnd");
        }

        public void onAnimationRepeat(Animator animator) {
            C87412m.m108594g(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animation");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout$c */
    public static final class C106124c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f316080d;

        /* renamed from: e */
        public final /* synthetic */ int f316081e;

        /* renamed from: f */
        public final /* synthetic */ boolean f316082f;

        /* renamed from: g */
        public final /* synthetic */ ScanProductListLayout f316083g;

        public C106124c(int i, int i2, boolean z, ScanProductListLayout scanProductListLayout) {
            this.f316080d = i;
            this.f316081e = i2;
            this.f316082f = z;
            this.f316083g = scanProductListLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            int i = intValue - this.f316080d;
            int i2 = this.f316081e;
            if (this.f316082f) {
                i2 -= i;
            }
            Log.m105924i("MicroMsg.ScanProductListLayout", "smoothScrollTo  onAnimationUpdate  value:" + intValue + ", currentPaddingBottom:" + i2);
            ScanProductListLayout scanProductListLayout = this.f316083g;
            int i3 = ScanProductListLayout.f316051C;
            scanProductListLayout.mo151791g(intValue, i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout$d */
    public static final class C106125d extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ScanProductListLayout f316084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106125d(ScanProductListLayout scanProductListLayout) {
            super(1);
            this.f316084d = scanProductListLayout;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue == 0) {
                C106122a productListCallBack = this.f316084d.getProductListCallBack();
                if (productListCallBack != null) {
                    productListCallBack.mo151808a(6);
                }
            } else if (intValue == 1) {
                ScanProductListLayout scanProductListLayout = this.f316084d;
                int a = scanProductListLayout.getCloseStateTopMargin();
                this.f316084d.getClass();
                scanProductListLayout.setRecyclerViewMarginTop(a - 0);
                C106122a productListCallBack2 = this.f316084d.getProductListCallBack();
                if (productListCallBack2 != null) {
                    productListCallBack2.mo151808a(0);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public ScanProductListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo151790f();
    }

    /* access modifiers changed from: private */
    public final int getCloseStateTopMargin() {
        return getHeight() - this.f316067t;
    }

    private final int getRecyclerViewItemCount() {
        RecyclerView recyclerView = this.f316056f;
        if (recyclerView == null) {
            return 0;
        }
        C87412m.m108591d(recyclerView);
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getItemCount();
    }

    private final ViewGroup.MarginLayoutParams getRecyclerViewMarginLayoutParams() {
        RecyclerView recyclerView = this.f316056f;
        if (recyclerView == null) {
            return null;
        }
        C87412m.m108591d(recyclerView);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    /* access modifiers changed from: private */
    public final void setRecyclerViewMarginTop(int i) {
        ViewGroup.MarginLayoutParams recyclerViewMarginLayoutParams;
        Log.m105918d("MicroMsg.ScanProductListLayout", "setRecyclerViewMarginTop  topMargin:" + i + "   height:" + getHeight() + "  listCloseHeight:" + this.f316068u + ",  extraHeaderHeight:" + 0);
        if (this.f316056f != null && (recyclerViewMarginLayoutParams = getRecyclerViewMarginLayoutParams()) != null) {
            recyclerViewMarginLayoutParams.topMargin = i;
            RecyclerView recyclerView = this.f316056f;
            C87412m.m108591d(recyclerView);
            recyclerView.setLayoutParams(recyclerViewMarginLayoutParams);
        }
    }

    private final void setRecyclerViewOriginalStatus(int i) {
        this.f316065r = false;
        mo151791g((i - this.f316067t) - 0, 0);
    }

    /* renamed from: c */
    public final boolean mo151787c() {
        RecyclerView recyclerView = this.f316056f;
        if (recyclerView == null) {
            return false;
        }
        C87412m.m108591d(recyclerView);
        boolean canScrollVertically = recyclerView.canScrollVertically(1);
        Log.m105924i("MicroMsg.ScanProductListLayout", "canChildScrollDown:" + canScrollVertically);
        return canScrollVertically;
    }

    /* renamed from: d */
    public final boolean mo151788d() {
        RecyclerView recyclerView = this.f316056f;
        if (recyclerView == null) {
            return false;
        }
        C87412m.m108591d(recyclerView);
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        Log.m105924i("MicroMsg.ScanProductListLayout", "canChildScrollUp:" + canScrollVertically);
        return canScrollVertically;
    }

    /* renamed from: e */
    public final void mo151789e(int i, boolean z, boolean z2) {
        if (this.f316053B) {
            Log.m105920e("MicroMsg.ScanProductListLayout", "doRecyclerViewScrollBy isAnimating, return");
            return;
        }
        this.f316063p = true;
        ViewGroup.MarginLayoutParams recyclerViewMarginLayoutParams = getRecyclerViewMarginLayoutParams();
        if (recyclerViewMarginLayoutParams != null) {
            int i2 = recyclerViewMarginLayoutParams.topMargin;
            int i3 = recyclerViewMarginLayoutParams.bottomMargin;
            if (z) {
                i2 += i;
            }
            if (z2) {
                i3 += -i;
            }
            Log.m105920e("MicroMsg.ScanProductListLayout", "doRecyclerViewScrollBy deltaY:" + i + ", currentPaddingTop:" + i2 + ", currentPaddingBottom:" + i3 + ", adjustPaddingTop:" + z + ", adjustPaddingBottom:" + z2);
            mo151791g(i2, i3);
        }
    }

    /* renamed from: f */
    public final void mo151790f() {
        this.f316055e = ViewConfiguration.get(getContext());
        this.f316067t = C76577a.m92151b(getContext(), 112);
        this.f316068u = C76577a.m92151b(getContext(), 56);
        this.f316066s = C74942w4.m89784a(getContext(), 20);
    }

    /* renamed from: g */
    public final void mo151791g(int i, int i2) {
        ViewGroup.MarginLayoutParams recyclerViewMarginLayoutParams;
        Log.m105918d("MicroMsg.ScanProductListLayout", "setRecyclerViewMarginTopAndBottom  topMargin:" + i + ", bottomMargin:" + i2 + "  height:" + getHeight() + "  listCloseHeight:" + this.f316068u + ",  extraHeaderHeight:" + 0);
        if (this.f316056f != null && (recyclerViewMarginLayoutParams = getRecyclerViewMarginLayoutParams()) != null) {
            recyclerViewMarginLayoutParams.topMargin = i;
            recyclerViewMarginLayoutParams.bottomMargin = i2;
            RecyclerView recyclerView = this.f316056f;
            C87412m.m108591d(recyclerView);
            recyclerView.setLayoutParams(recyclerViewMarginLayoutParams);
        }
    }

    public final boolean getAdjustPaddingBottom() {
        return this.f316073z;
    }

    public final boolean getAdjustPaddingTop() {
        return this.f316072y;
    }

    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public final C106122a getProductListCallBack() {
        return this.f316054d;
    }

    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    /* renamed from: h */
    public final void mo151797h(int i, int i2, boolean z, C32226l<? super Integer, C13598b0> lVar) {
        if (this.f316056f != null) {
            if (this.f316053B) {
                Log.m105920e("MicroMsg.ScanProductListLayout", "smoothScrollTo  startY:" + i + ", endY:" + i2 + "   isAnimating");
                return;
            }
            Log.m105924i("MicroMsg.ScanProductListLayout", "smoothScrollTo  startY:" + i + ", endY:" + i2 + ",  adjustPaddingBottom:" + z);
            lVar.invoke(0);
            if (i == i2) {
                Log.m105928w("MicroMsg.ScanProductListLayout", "smoothScrollTo  startPaddingTop == endPaddingTop");
                lVar.invoke(1);
                return;
            }
            this.f316053B = true;
            ViewGroup.MarginLayoutParams recyclerViewMarginLayoutParams = getRecyclerViewMarginLayoutParams();
            if (recyclerViewMarginLayoutParams != null) {
                int i3 = recyclerViewMarginLayoutParams.bottomMargin;
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
                ofInt.setDuration(250);
                ofInt.addListener(new C106123b(this, i2, i, i3, z, lVar));
                ofInt.addUpdateListener(new C106124c(i, i3, z, this));
                ofInt.start();
            }
        }
    }

    /* renamed from: i */
    public final void mo151798i() {
        Log.m105928w("MicroMsg.ScanProductListLayout", "smoothScrollToCloseStatus");
        ViewGroup.MarginLayoutParams recyclerViewMarginLayoutParams = getRecyclerViewMarginLayoutParams();
        if (recyclerViewMarginLayoutParams != null) {
            mo151797h(recyclerViewMarginLayoutParams.topMargin, getCloseStateTopMargin(), false, new C106125d(this));
        }
    }

    /* renamed from: j */
    public final void mo151799j() {
        int recyclerViewItemCount = getRecyclerViewItemCount();
        int height = getHeight();
        if (recyclerViewItemCount < 4) {
            this.f316052A = height - this.f316067t;
        } else {
            int i = this.f316068u;
            int i2 = (height - (recyclerViewItemCount * i)) + i;
            this.f316052A = i2;
            if (i2 < 0) {
                this.f316052A = 0;
            }
        }
        Log.m105924i("MicroMsg.ScanProductListLayout", "updateRecyclerViewExpandStatusPaddingTop:" + this.f316052A);
    }

    public void onFinishInflate() {
        int childCount = getChildCount();
        if (childCount <= 1) {
            if (childCount == 1) {
                View childAt = getChildAt(0);
                if (childAt instanceof RecyclerView) {
                    C87412m.m108593f(childAt, "child");
                    RecyclerView recyclerView = (RecyclerView) childAt;
                    this.f316056f = recyclerView;
                    recyclerView.setOverScrollMode(2);
                } else {
                    throw new IllegalStateException("ScanProductListLayout only can host a RecyclerView element".toString());
                }
            }
            super.onFinishInflate();
            return;
        }
        throw new IllegalStateException("ScanProductListLayout only can host a RecyclerView element".toString());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        if (motionEvent == null) {
            return false;
        }
        if (this.f316071x == null) {
            this.f316071x = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f316071x;
        C87412m.m108591d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        VelocityTracker velocityTracker2 = this.f316071x;
        C87412m.m108591d(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        VelocityTracker velocityTracker3 = this.f316071x;
        C87412m.m108591d(velocityTracker3);
        int xVelocity = (int) velocityTracker3.getXVelocity();
        VelocityTracker velocityTracker4 = this.f316071x;
        C87412m.m108591d(velocityTracker4);
        int yVelocity = (int) velocityTracker4.getYVelocity();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            Log.m105926v("MicroMsg.ScanProductListLayout", "onInterceptTouchEvent down");
            this.f316069v = motionEvent.getRawX();
            this.f316070w = motionEvent.getRawY();
            this.f316057g = motionEvent.getRawY();
            this.f316058h = 0.0f;
            this.f316059i = 0;
            this.f316060j = false;
            this.f316072y = false;
            this.f316073z = false;
            this.f316061n = false;
            this.f316062o = false;
            this.f316063p = false;
            mo151799j();
        } else if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX() - this.f316069v;
                float rawY = motionEvent.getRawY() - this.f316070w;
                Log.m105927v("MicroMsg.ScanProductListLayout", "onInterceptTouchEvent action_move tx: %f, ty: %f, velocityX: %d, velocityY: %d", Float.valueOf(rawX), Float.valueOf(rawY), Integer.valueOf(xVelocity), Integer.valueOf(yVelocity));
                if (Math.abs(rawY) >= 5.0f && Math.abs(rawX) <= 250.0f && Math.abs(yVelocity) > Math.abs(xVelocity) && Math.abs(yVelocity) > 0 && Math.abs(rawY) > Math.abs(rawX)) {
                    Log.m105925i("MicroMsg.ScanProductListLayout", "onInterceptTouchEvent scroll vertical, scrollDown: %s, scrollUp: %s, ty: %s", Boolean.valueOf(mo151787c()), Boolean.valueOf(mo151788d()), Float.valueOf(rawY));
                    r1 = ((rawY <= 0.0f || mo151788d()) && (rawY >= 0.0f || mo151787c())) ? !this.f316065r : true;
                    Log.m105927v("MicroMsg.ScanProductListLayout", "alvinluo onInterceptTouchEvent action: %s, isIntercept: %b", Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(r1));
                    return r1;
                }
            } else if (action == 5) {
                Log.m105926v("MicroMsg.ScanProductListLayout", "onInterceptTouchEvent pointer down");
            }
        }
        boolean z = false;
        Log.m105927v("MicroMsg.ScanProductListLayout", "alvinluo onInterceptTouchEvent action: %s, isIntercept: %b", Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z));
        return z;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.m105924i("MicroMsg.ScanProductListLayout", "onSizeChanged:" + i2);
        setRecyclerViewOriginalStatus(i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C106122a aVar;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f316064q) {
            boolean z = false;
            if (getRecyclerViewItemCount() > 3) {
                int action = motionEvent.getAction() & 255;
                Log.m105918d("MicroMsg.ScanProductListLayout", "onTouchEvent action:" + action);
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            Log.m105924i("MicroMsg.ScanProductListLayout", "ACTION_MOVE  isOverScrollTop:" + this.f316061n + ", isOverScrollBottom:" + this.f316062o + ", hasRecyclerViewScrollBy: " + this.f316063p);
                            if (this.f316061n || this.f316062o || !this.f316065r) {
                                float rawY = motionEvent.getRawY();
                                float f = this.f316058h;
                                if (f == 0.0f) {
                                    this.f316058h = rawY;
                                    Log.m105928w("MicroMsg.ScanProductListLayout", "ACTION_MOVE  oldY == 0");
                                    return true;
                                }
                                int i = this.f316059i;
                                int i2 = ((int) ((rawY - f) / ((float) 2))) + i;
                                this.f316059i = i2;
                                int i3 = i2 - i;
                                Log.m105924i("MicroMsg.ScanProductListLayout", "ACTION_MOVE------totalMoveDeltaY:" + this.f316059i + ", delta:" + i3 + ", currentY: " + rawY + ", lastY: " + this.f316058h);
                                this.f316058h = rawY;
                                if (this.f316061n && this.f316059i < 0) {
                                    this.f316059i = 0;
                                    Log.m105924i("MicroMsg.ScanProductListLayout", "ACTION_MOVE  isOverScrollTop------totalMoveDeltaY = 0");
                                }
                                if (this.f316062o && this.f316059i > 0) {
                                    this.f316059i = 0;
                                    Log.m105924i("MicroMsg.ScanProductListLayout", "ACTION_MOVE  isOverScrollBottom------totalMoveDeltaY = 0");
                                }
                                if (!this.f316065r) {
                                    this.f316072y = true;
                                    this.f316073z = false;
                                    if (!this.f316063p) {
                                        setRecyclerViewMarginTop(getCloseStateTopMargin());
                                        C106122a aVar2 = this.f316054d;
                                        if (aVar2 != null) {
                                            aVar2.mo151808a(2);
                                        }
                                    }
                                    mo151789e(i3, this.f316072y, this.f316073z);
                                    return true;
                                }
                                this.f316072y = true;
                                this.f316073z = this.f316062o;
                                if (!this.f316063p && (aVar = this.f316054d) != null) {
                                    aVar.mo151808a(5);
                                }
                                mo151789e(i3, this.f316072y, this.f316073z);
                                boolean z2 = this.f316061n;
                                if ((!z2 || this.f316059i != 0 || this.f316062o) && (!this.f316062o || this.f316059i != 0 || z2)) {
                                    return true;
                                }
                                Log.m105928w("MicroMsg.ScanProductListLayout", "ACTION_MOVE  由越界效果恢复到列表滚动");
                                this.f316058h = 0.0f;
                                this.f316061n = false;
                                this.f316062o = false;
                                boolean z3 = mo151787c() || mo151788d();
                                Log.m105924i("MicroMsg.ScanProductListLayout", "isChildCanScrollVertical :" + z3);
                                if (!z3) {
                                    return true;
                                }
                                this.f316058h = 0.0f;
                                this.f316059i = 0;
                                Log.m105924i("MicroMsg.ScanProductListLayout", "resetVertical------totalMoveDeltaY = 0");
                                motionEvent.setAction(0);
                                super.onTouchEvent(motionEvent);
                                motionEvent.setAction(2);
                                return super.onTouchEvent(motionEvent);
                            }
                            float rawY2 = motionEvent.getRawY();
                            if (!this.f316060j) {
                                float abs = Math.abs(rawY2 - this.f316057g);
                                ViewConfiguration viewConfiguration = this.f316055e;
                                C87412m.m108591d(viewConfiguration);
                                this.f316060j = abs >= ((float) viewConfiguration.getScaledTouchSlop());
                            }
                            float f2 = this.f316058h;
                            if (f2 == 0.0f) {
                                this.f316058h = rawY2;
                                Log.m105928w("MicroMsg.ScanProductListLayout", "ACTION_MOVE  oldY = currentY = " + this.f316058h);
                                return true;
                            }
                            boolean z4 = this.f316061n || (this.f316060j && f2 - rawY2 < 0.0f && !mo151788d());
                            Log.m105928w("MicroMsg.ScanProductListLayout", "ACTION_MOVE  tempOverScrollTop = " + z4);
                            if (this.f316061n || !z4) {
                                this.f316061n = z4;
                                if (this.f316062o || (this.f316060j && this.f316058h - rawY2 > 0.0f && !mo151787c())) {
                                    z = true;
                                }
                                Log.m105928w("MicroMsg.ScanProductListLayout", "ACTION_MOVE  tempOverScrollBottom = " + z);
                                if (this.f316062o || !z) {
                                    this.f316062o = z;
                                    this.f316058h = rawY2;
                                } else {
                                    Log.m105928w("MicroMsg.ScanProductListLayout", "ACTION_MOVE  !isOverScrollBottom setAction ACTION_CANCEL");
                                    this.f316058h = rawY2;
                                    this.f316062o = z;
                                    motionEvent.setAction(3);
                                    super.onTouchEvent(motionEvent);
                                    return true;
                                }
                            } else {
                                Log.m105928w("MicroMsg.ScanProductListLayout", "ACTION_MOVE  !isOverScrollTop setAction ACTION_CANCEL");
                                this.f316058h = rawY2;
                                this.f316061n = z4;
                                motionEvent.setAction(3);
                                super.onTouchEvent(motionEvent);
                                return true;
                            }
                        } else if (action != 3) {
                            if (action == 5) {
                                this.f316058h = 0.0f;
                            } else if (action == 6) {
                                this.f316058h = 0.0f;
                            }
                        }
                    }
                    Log.m105924i("MicroMsg.ScanProductListLayout", "ACTION_UP  isListExpandStatus:" + this.f316065r + ", totalMoveDeltaY:" + this.f316059i + ", hasRecyclerViewScrollBy:" + this.f316063p);
                    if (this.f316063p) {
                        if (this.f316065r) {
                            if (this.f316059i > this.f316066s) {
                                mo151798i();
                                this.f316065r = false;
                            } else {
                                boolean z5 = this.f316073z;
                                Log.m105928w("MicroMsg.ScanProductListLayout", "smoothBackToExpandPosition  adjustPaddingBottom:" + z5);
                                ViewGroup.MarginLayoutParams recyclerViewMarginLayoutParams = getRecyclerViewMarginLayoutParams();
                                if (recyclerViewMarginLayoutParams != null) {
                                    mo151797h(recyclerViewMarginLayoutParams.topMargin, this.f316052A, z5, new C111196c0(this));
                                }
                            }
                        } else if ((-this.f316059i) < this.f316066s) {
                            Log.m105928w("MicroMsg.ScanProductListLayout", "smoothBackToClosePosition");
                            ViewGroup.MarginLayoutParams recyclerViewMarginLayoutParams2 = getRecyclerViewMarginLayoutParams();
                            if (recyclerViewMarginLayoutParams2 != null) {
                                mo151797h(recyclerViewMarginLayoutParams2.topMargin, getCloseStateTopMargin(), false, new C111194b0(this));
                            }
                        } else {
                            Log.m105928w("MicroMsg.ScanProductListLayout", "smoothScrollToExpandStatus");
                            ViewGroup.MarginLayoutParams recyclerViewMarginLayoutParams3 = getRecyclerViewMarginLayoutParams();
                            if (recyclerViewMarginLayoutParams3 != null) {
                                mo151797h(recyclerViewMarginLayoutParams3.topMargin, this.f316052A, false, new C111198d0(this));
                            }
                            this.f316065r = true;
                        }
                        return true;
                    }
                } else {
                    this.f316057g = motionEvent.getRawY();
                    this.f316058h = 0.0f;
                    this.f316059i = 0;
                    this.f316060j = false;
                    this.f316072y = false;
                    this.f316073z = false;
                    this.f316061n = false;
                    this.f316062o = false;
                    this.f316063p = false;
                    mo151799j();
                }
                return super.onTouchEvent(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAdjustPaddingBottom(boolean z) {
        this.f316073z = z;
    }

    public final void setAdjustPaddingTop(boolean z) {
        this.f316072y = z;
    }

    public final void setAnimating(boolean z) {
        this.f316053B = z;
    }

    public final void setDisallowInterceptTouchEvent(boolean z) {
        this.f316064q = z;
    }

    public final void setProductListCallBack(C106122a aVar) {
        this.f316054d = aVar;
    }

    public ScanProductListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo151790f();
    }
}
