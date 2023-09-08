package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import de1.C7290r;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import sn0.C90259e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010H\u001a\u00020G\u0012\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LB#\b\u0016\u0012\u0006\u0010H\u001a\u00020G\u0012\b\u0010J\u001a\u0004\u0018\u00010I\u0012\u0006\u0010M\u001a\u00020\n¢\u0006\u0004\bK\u0010NJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR.\u0010&\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010-\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010/\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u0014\u00103\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u0014\u00107\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b6\u00102R\u0014\u00109\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b8\u00102R\u0014\u0010<\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010@\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b?\u00102R\u0014\u0010B\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\bA\u00102R\u0014\u0010D\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\bC\u00102R\"\u0010E\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bE\u0010(\u001a\u0004\bE\u0010*\"\u0004\bF\u0010,¨\u0006O"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderDrawerLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/GestureDetector$OnGestureListener;", "", "translationY", "Lrx3/b0;", "setContentTranslationY", "Landroid/view/View;", "view", "setContentView", "", "dir", "settle", "Lkotlin/Function0;", "d", "Lfy3/a;", "getOpenCallback", "()Lfy3/a;", "setOpenCallback", "(Lfy3/a;)V", "openCallback", "e", "getCloseCallback", "setCloseCallback", "closeCallback", "Lkotlin/Function1;", "f", "Lfy3/l;", "getTranslationCallback", "()Lfy3/l;", "setTranslationCallback", "(Lfy3/l;)V", "translationCallback", "Landroid/view/MotionEvent;", "", "g", "getCanSwipeCallback", "setCanSwipeCallback", "canSwipeCallback", "v", "Z", "getContentIntercept", "()Z", "setContentIntercept", "(Z)V", "contentIntercept", "w", "isNeedResettle", "setNeedResettle", "getBorderLeft", "()F", "borderLeft", "getBorderRight", "borderRight", "getBorderTop", "borderTop", "getBorderBottom", "borderBottom", "getEdgeLow", "()I", "edgeLow", "getEdgeHigh", "edgeHigh", "getBorderLow", "borderLow", "getBorderHigh", "borderHigh", "getTrans", "trans", "isOpen", "setOpen", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderDrawerLayout */
public final class FinderDrawerLayout extends FrameLayout implements GestureDetector.OnGestureListener {

    /* renamed from: d */
    public C32224a<C13598b0> f17642d;

    /* renamed from: e */
    public C32224a<C13598b0> f17643e;

    /* renamed from: f */
    public C32226l<? super Float, C13598b0> f17644f;

    /* renamed from: g */
    public C32226l<? super MotionEvent, Boolean> f17645g = C4161r1.f18394d;

    /* renamed from: h */
    public View f17646h;

    /* renamed from: i */
    public float f17647i;

    /* renamed from: j */
    public float f17648j;

    /* renamed from: n */
    public float f17649n;

    /* renamed from: o */
    public boolean f17650o;

    /* renamed from: p */
    public boolean f17651p;

    /* renamed from: q */
    public int f17652q = 1;

    /* renamed from: r */
    public boolean f17653r = true;

    /* renamed from: s */
    public final GestureDetector f17654s = new GestureDetector(getContext(), this);

    /* renamed from: t */
    public final Set<View> f17655t = new LinkedHashSet();

    /* renamed from: u */
    public CopyOnWriteArrayList<RecyclerViewDrawerSquares.C45117c> f17656u = new CopyOnWriteArrayList<>();

    /* renamed from: v */
    public boolean f17657v;

    /* renamed from: w */
    public boolean f17658w;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderDrawerLayout$a */
    public static final class C3937a extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ FinderDrawerLayout f17659d;

        /* renamed from: e */
        public final /* synthetic */ int f17660e;

        public C3937a(FinderDrawerLayout finderDrawerLayout, int i) {
            this.f17659d = finderDrawerLayout;
            this.f17660e = i;
        }

        public void onAnimationCancel(Animator animator) {
            this.f17659d.f17650o = false;
        }

        public void onAnimationEnd(Animator animator) {
            FinderDrawerLayout finderDrawerLayout = this.f17659d;
            finderDrawerLayout.f17650o = false;
            finderDrawerLayout.getClass();
            int i = this.f17660e;
            FinderDrawerLayout finderDrawerLayout2 = this.f17659d;
            if (i == (-finderDrawerLayout2.f17652q)) {
                finderDrawerLayout2.setOpen(true);
                C32224a<C13598b0> openCallback = this.f17659d.getOpenCallback();
                if (openCallback != null) {
                    openCallback.invoke();
                }
                for (RecyclerViewDrawerSquares.C45117c g : this.f17659d.f17656u) {
                    g.mo3766g(true, false, 0);
                }
                return;
            }
            finderDrawerLayout2.setOpen(false);
            C32224a<C13598b0> closeCallback = this.f17659d.getCloseCallback();
            if (closeCallback != null) {
                closeCallback.invoke();
            }
            for (RecyclerViewDrawerSquares.C45117c g2 : this.f17659d.f17656u) {
                g2.mo3766g(false, false, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderDrawerLayout$b */
    public static final class C3938b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderDrawerLayout f17661d;

        public C3938b(FinderDrawerLayout finderDrawerLayout) {
            this.f17661d = finderDrawerLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f17661d.f17646h;
            if (view != null) {
                float translationY = 1.0f * view.getTranslationY();
                FinderDrawerLayout finderDrawerLayout = this.f17661d;
                float f = translationY / finderDrawerLayout.f17649n;
                for (RecyclerViewDrawerSquares.C45117c e : finderDrawerLayout.f17656u) {
                    e.mo9497e(f);
                }
                C32226l<Float, C13598b0> translationCallback = this.f17661d.getTranslationCallback();
                if (translationCallback != null) {
                    translationCallback.invoke(Float.valueOf(f));
                    return;
                }
                return;
            }
            C87412m.m108603p("contentView");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final float getBorderBottom() {
        return this.f17652q == 2 ? this.f17649n : this.f17649n + this.f17647i;
    }

    private final float getBorderHigh() {
        return this.f17653r ? getBorderRight() : getBorderBottom();
    }

    private final float getBorderLeft() {
        return this.f17652q == 1 ? this.f17648j - this.f17647i : this.f17648j;
    }

    private final float getBorderLow() {
        return this.f17653r ? getBorderLeft() : getBorderTop();
    }

    private final float getBorderRight() {
        return this.f17652q == 1 ? this.f17648j : this.f17648j + this.f17647i;
    }

    private final float getBorderTop() {
        return this.f17652q == 2 ? this.f17649n - this.f17647i : this.f17649n;
    }

    private final int getEdgeHigh() {
        return this.f17653r ? 1 : 2;
    }

    private final int getEdgeLow() {
        return this.f17653r ? -1 : -2;
    }

    private final float getTrans() {
        if (this.f17653r) {
            View view = this.f17646h;
            if (view != null) {
                return view.getTranslationX();
            }
            C87412m.m108603p("contentView");
            throw null;
        }
        View view2 = this.f17646h;
        if (view2 != null) {
            return view2.getTranslationY();
        }
        C87412m.m108603p("contentView");
        throw null;
    }

    private final void setContentTranslationY(float f) {
        View view = this.f17646h;
        if (view != null) {
            view.setTranslationY(f);
            View view2 = this.f17646h;
            if (view2 != null) {
                float translationY = (1.0f * view2.getTranslationY()) / this.f17649n;
                for (RecyclerViewDrawerSquares.C45117c e : this.f17656u) {
                    e.mo9497e(translationY);
                }
                C32226l<? super Float, C13598b0> lVar = this.f17644f;
                if (lVar != null) {
                    lVar.invoke(Float.valueOf(translationY));
                }
                Log.m105924i("Finder.DrawerLayout", "setContentTranslationY percent:" + translationY + " originY:" + this.f17649n + " translationY:" + f);
                return;
            }
            C87412m.m108603p("contentView");
            throw null;
        }
        C87412m.m108603p("contentView");
        throw null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        if ((this.f17658w && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            settle(0);
            this.f17658w = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final C32226l<MotionEvent, Boolean> getCanSwipeCallback() {
        return this.f17645g;
    }

    public final C32224a<C13598b0> getCloseCallback() {
        return this.f17643e;
    }

    public final boolean getContentIntercept() {
        return this.f17657v;
    }

    public final C32224a<C13598b0> getOpenCallback() {
        return this.f17642d;
    }

    public final C32226l<Float, C13598b0> getTranslationCallback() {
        return this.f17644f;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (RecyclerViewDrawerSquares.C45117c f : this.f17656u) {
            f.mo9498f();
        }
        this.f17656u.clear();
    }

    public boolean onDown(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        Log.m105924i("Finder.DrawerLayout", "onFling vx = " + f + ", vy = " + f2);
        if (this.f17653r && Math.abs(f) > 400.0f) {
            settle(f > 0.0f ? 1 : -1);
        } else if (!this.f17653r && Math.abs(f2) > 400.0f) {
            settle(f2 > 0.0f ? 2 : -2);
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        if (motionEvent.getAction() == 0 && this.f17650o) {
            Log.m105924i("Finder.DrawerLayout", "onInterceptTouchEvent isSettling = false");
            this.f17658w = this.f17650o;
            this.f17650o = false;
            View view = this.f17646h;
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                if (animate != null) {
                    animate.cancel();
                }
                for (View animate2 : this.f17655t) {
                    animate2.animate().cancel();
                }
            } else {
                C87412m.m108603p("contentView");
                throw null;
            }
        }
        if (this.f17645g.invoke(motionEvent).booleanValue()) {
            GestureDetector gestureDetector = this.f17654s;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderDrawerLayout", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/finder/view/FinderDrawerLayout", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            if (onTouchEvent) {
                Log.m105924i("Finder.DrawerLayout", "onInterceptTouchEvent canInterceptCallback return true");
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderDrawerLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderDrawerLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        View view = this.f17646h;
        if (view != null && !this.f17651p) {
            if (this.f17653r) {
                if (view != null) {
                    i3 = view.getMeasuredWidth();
                } else {
                    C87412m.m108603p("contentView");
                    throw null;
                }
            } else if (view != null) {
                i3 = view.getMeasuredHeight();
            } else {
                C87412m.m108603p("contentView");
                throw null;
            }
            float f = (float) i3;
            this.f17647i = f;
            if (!(f == 0.0f)) {
                View view2 = this.f17646h;
                if (view2 != null) {
                    view2.setTranslationX(0.0f);
                    View view3 = this.f17646h;
                    if (view3 != null) {
                        view3.setTranslationY(0.0f);
                        int i4 = this.f17652q;
                        if (i4 == -2) {
                            View view4 = this.f17646h;
                            if (view4 != null) {
                                view4.setTranslationY(view4.getTranslationY() - this.f17647i);
                            } else {
                                C87412m.m108603p("contentView");
                                throw null;
                            }
                        } else if (i4 == -1) {
                            View view5 = this.f17646h;
                            if (view5 != null) {
                                view5.setTranslationX(view5.getTranslationX() - this.f17647i);
                            } else {
                                C87412m.m108603p("contentView");
                                throw null;
                            }
                        } else if (i4 == 1) {
                            View view6 = this.f17646h;
                            if (view6 != null) {
                                view6.setTranslationX(view6.getTranslationX() + this.f17647i);
                            } else {
                                C87412m.m108603p("contentView");
                                throw null;
                            }
                        } else if (i4 == 2) {
                            View view7 = this.f17646h;
                            if (view7 != null) {
                                view7.setTranslationY(view7.getTranslationY() + this.f17647i);
                            } else {
                                C87412m.m108603p("contentView");
                                throw null;
                            }
                        }
                        View view8 = this.f17646h;
                        if (view8 != null) {
                            this.f17648j = view8.getTranslationX();
                            View view9 = this.f17646h;
                            if (view9 != null) {
                                this.f17649n = view9.getTranslationY();
                                this.f17651p = true;
                                return;
                            }
                            C87412m.m108603p("contentView");
                            throw null;
                        }
                        C87412m.m108603p("contentView");
                        throw null;
                    }
                    C87412m.m108603p("contentView");
                    throw null;
                }
                C87412m.m108603p("contentView");
                throw null;
            }
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        Log.m105924i("Finder.DrawerLayout", "onScroll dx = " + f + " dy = " + f2);
        float f3 = this.f17653r ? f : f2;
        boolean z = Math.abs(f) > Math.abs(f2);
        if (this.f17653r == z) {
            float trans = getTrans() - Math.min(getBorderHigh(), Math.max(getBorderLow(), getTrans() - f3));
            Log.m105924i("Finder.DrawerLayout", "onScroll isHorizontal = " + z + " exactlyMoved = " + trans);
            if (Float.compare(Math.abs(trans), 0.01f) > 0) {
                if (this.f17653r) {
                    View view = this.f17646h;
                    if (view != null) {
                        view.setTranslationX(view.getTranslationX() - trans);
                        for (View view2 : this.f17655t) {
                            view2.setTranslationX(view2.getTranslationX() - trans);
                        }
                    } else {
                        C87412m.m108603p("contentView");
                        throw null;
                    }
                } else {
                    View view3 = this.f17646h;
                    if (view3 != null) {
                        setContentTranslationY(view3.getTranslationY() - trans);
                        for (View view4 : this.f17655t) {
                            view4.setTranslationY(view4.getTranslationY() - trans);
                        }
                    } else {
                        C87412m.m108603p("contentView");
                        throw null;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderDrawerLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/view/FinderDrawerLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        GestureDetector gestureDetector = this.f17654s;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderDrawerLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/finder/view/FinderDrawerLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            settle(0);
        }
        return onTouchEvent;
    }

    public final void setCanSwipeCallback(C32226l<? super MotionEvent, Boolean> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.f17645g = lVar;
    }

    public final void setCloseCallback(C32224a<C13598b0> aVar) {
        this.f17643e = aVar;
    }

    public final void setContentIntercept(boolean z) {
        this.f17657v = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setContentView(android.view.View r3) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r3, r0)
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 != 0) goto L_0x0025
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "Finder.DrawerLayout"
            java.lang.String r1 = "setContentView contentView should be child of this"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x0025
        L_0x001d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "contentView should be child of this"
            r3.<init>(r0)
            throw r3
        L_0x0025:
            android.view.View r0 = r2.f17646h
            r1 = 0
            if (r0 == 0) goto L_0x003c
            if (r0 == 0) goto L_0x0035
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            if (r0 != 0) goto L_0x0033
            goto L_0x003c
        L_0x0033:
            r0 = 0
            goto L_0x003d
        L_0x0035:
            java.lang.String r3 = "contentView"
            gy3.C87412m.m108603p(r3)
            r3 = 0
            throw r3
        L_0x003c:
            r0 = 1
        L_0x003d:
            r2.f17646h = r3
            if (r0 == 0) goto L_0x0043
            r2.f17651p = r1
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderDrawerLayout.setContentView(android.view.View):void");
    }

    public final void setNeedResettle(boolean z) {
        this.f17658w = z;
    }

    public final void setOpen(boolean z) {
    }

    public final void setOpenCallback(C32224a<C13598b0> aVar) {
        this.f17642d = aVar;
    }

    public final void setTranslationCallback(C32226l<? super Float, C13598b0> lVar) {
        this.f17644f = lVar;
    }

    public final void settle(int i) {
        Log.m105924i("Finder.DrawerLayout", "settle isSettling = " + this.f17650o);
        if (this.f17651p && !this.f17650o) {
            this.f17650o = true;
            float trans = ((float) 1) - ((getTrans() - getBorderLow()) / (getBorderHigh() - getBorderLow()));
            if (i == 0) {
                i = Float.compare(trans, 0.7f) > 0 ? getEdgeLow() : getEdgeHigh();
            }
            float borderLow = i == getEdgeLow() ? getBorderLow() : getBorderHigh();
            float trans2 = borderLow - getTrans();
            Interpolator loadInterpolator = AnimationUtils.loadInterpolator(getContext(), C0966R.C0968anim.f2435cy);
            Log.m105924i("Finder.DrawerLayout", "settle percent = " + trans);
            View view = this.f17646h;
            if (view != null) {
                (this.f17653r ? view.animate().translationX(borderLow) : view.animate().translationY(borderLow)).setDuration(200).setInterpolator(loadInterpolator).setListener(new C3937a(this, i)).setUpdateListener(new C3938b(this)).start();
                for (View view2 : this.f17655t) {
                    (this.f17653r ? view2.animate().translationXBy(trans2) : view2.animate().translationYBy(trans2)).setDuration(200).setInterpolator(loadInterpolator).start();
                }
                return;
            }
            C87412m.m108603p("contentView");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
