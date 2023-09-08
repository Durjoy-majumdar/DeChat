package com.tencent.p014mm.plugin.scanner.p101ui.widget;

import android.content.Context;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;
import ul2.C111192a;
import ul2.C111193b;
import ul2.C111195c;
import ul2.C111199e;
import ul2.C111211o0;
import ul2.C111213p0;
import ul2.C111215q0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%B#\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020\t¢\u0006\u0004\b$\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\tR\"\u0010\u001f\u001a\u00020\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006("}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView;", "Landroid/widget/LinearLayout;", "", "", "enable", "Lrx3/b0;", "setEnableSwitchTab", "enabled", "setEnabled", "", "index", "setSelectedTab", "Lul2/q0;", "tabOnSelectedListener", "setOnTabChangedListener", "Lul2/o0;", "tabOnClickListener", "setOnTabClickListener", "Lul2/p0;", "tabOnScrollListener", "setOnTabScrollListener", "Lul2/e;", "getSelectedTab", "importantForAccessibility", "setTabViewImportantForAccessibility", "F", "Z", "getCanVibrate", "()Z", "setCanVibrate", "(Z)V", "canVibrate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView */
public class BaseScrollTabView extends LinearLayout {

    /* renamed from: H */
    public static final /* synthetic */ int f315943H = 0;

    /* renamed from: A */
    public float f315944A;

    /* renamed from: B */
    public int f315945B;

    /* renamed from: C */
    public boolean f315946C;

    /* renamed from: D */
    public boolean f315947D;

    /* renamed from: E */
    public Vibrator f315948E;

    /* renamed from: F */
    public boolean f315949F;

    /* renamed from: G */
    public GestureDetector f315950G;

    /* renamed from: d */
    public LinearLayout f315951d;

    /* renamed from: e */
    public View f315952e;

    /* renamed from: f */
    public boolean f315953f;

    /* renamed from: g */
    public ArrayList<C111199e> f315954g;

    /* renamed from: h */
    public int f315955h;

    /* renamed from: i */
    public int f315956i;

    /* renamed from: j */
    public int f315957j;

    /* renamed from: n */
    public boolean f315958n;

    /* renamed from: o */
    public LinearInterpolator f315959o;

    /* renamed from: p */
    public ArrayList<C13604l<Float, Float>> f315960p;

    /* renamed from: q */
    public boolean f315961q;

    /* renamed from: r */
    public C111215q0 f315962r;

    /* renamed from: s */
    public C111213p0 f315963s;

    /* renamed from: t */
    public int f315964t;

    /* renamed from: u */
    public float f315965u;

    /* renamed from: v */
    public float f315966v;

    /* renamed from: w */
    public float f315967w;

    /* renamed from: x */
    public float f315968x;

    /* renamed from: y */
    public VelocityTracker f315969y;

    /* renamed from: z */
    public float f315970z;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView$a */
    public static final class C106105a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C106105a f315971d = new C106105a();

        public C106105a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView$b */
    public static final class C106106b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseScrollTabView f315972d;

        /* renamed from: e */
        public final /* synthetic */ int f315973e;

        /* renamed from: f */
        public final /* synthetic */ int f315974f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106106b(BaseScrollTabView baseScrollTabView, int i, int i2) {
            super(0);
            this.f315972d = baseScrollTabView;
            this.f315973e = i;
            this.f315974f = i2;
        }

        public Object invoke() {
            BaseScrollTabView baseScrollTabView = this.f315972d;
            int i = this.f315973e;
            int i2 = this.f315974f;
            int i3 = BaseScrollTabView.f315943H;
            baseScrollTabView.mo151701f(i, i2);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseScrollTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static void m142685a(BaseScrollTabView baseScrollTabView, int i, float f, float f2, long j, C32224a aVar, int i2, Object obj) {
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator translationX;
        ViewPropertyAnimator updateListener;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator duration;
        if (obj == null) {
            if ((i2 & 8) != 0) {
                j = 150;
            }
            if ((i2 & 16) != 0) {
                aVar = C106105a.f315971d;
            }
            if (!baseScrollTabView.f315958n) {
                Log.m105925i("MicroMsg.BaseScrollTabView", "alvinluo animateScrollX targetIndex: %d, fromTransX: %f, toTransX: %f", Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2));
                baseScrollTabView.f315958n = true;
                LinearLayout linearLayout = baseScrollTabView.f315951d;
                if (linearLayout != null) {
                    ViewPropertyAnimator animate = linearLayout.animate();
                    if (animate != null && (interpolator = animate.setInterpolator(baseScrollTabView.f315959o)) != null && (translationX = interpolator.translationX(f2)) != null && (updateListener = translationX.setUpdateListener(new C111192a(f, f2, baseScrollTabView))) != null && (listener = updateListener.setListener(new C111193b(aVar, baseScrollTabView))) != null && (duration = listener.setDuration(j)) != null) {
                        duration.start();
                        return;
                    }
                    return;
                }
                C87412m.m108603p("container");
                throw null;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollX");
    }

    /* renamed from: b */
    public final void mo151697b(int i) {
        if (this.f315964t != i) {
            Log.m105919d("MicroMsg.BaseScrollTabView", "alvinluo changeScrollState state: %d", Integer.valueOf(i));
            this.f315964t = i;
            C111213p0 p0Var = this.f315963s;
            if (p0Var != null) {
                p0Var.mo24361a(i);
            }
        }
    }

    /* renamed from: c */
    public final void mo151698c(int i, int i2, boolean z, int i3) {
        if (i != i2) {
            C111199e eVar = (C111199e) C110818d0.m150917O(this.f315954g, i);
            if (eVar != null) {
                mo151705h(eVar, i);
                eVar.mo6142b();
                C111215q0 q0Var = this.f315962r;
                if (q0Var != null) {
                    q0Var.mo24332b(eVar.getTabId());
                }
            }
            LinearLayout linearLayout = this.f315951d;
            if (linearLayout != null) {
                float translationX = linearLayout.getTranslationX();
                float d = mo151699d(i2);
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(i2);
                LinearLayout linearLayout2 = this.f315951d;
                if (linearLayout2 != null) {
                    objArr[2] = Float.valueOf(linearLayout2.getTranslationX());
                    objArr[3] = Float.valueOf(d);
                    Log.m105919d("MicroMsg.BaseScrollTabView", "alvinluo changeTab from: %d, to: %d, currentTransX: %f, targetTransX: %f", objArr);
                    this.f315956i = i2;
                    if (z) {
                        m142685a(this, i2, translationX, d, 0, new C106106b(this, i2, i3), 8, (Object) null);
                        return;
                    }
                    LinearLayout linearLayout3 = this.f315951d;
                    if (linearLayout3 != null) {
                        linearLayout3.setTranslationX(d);
                        mo151701f(i2, i3);
                        return;
                    }
                    C87412m.m108603p("container");
                    throw null;
                }
                C87412m.m108603p("container");
                throw null;
            }
            C87412m.m108603p("container");
            throw null;
        }
    }

    /* renamed from: d */
    public final float mo151699d(int i) {
        C13604l lVar = (C13604l) C110818d0.m150917O(this.f315960p, i);
        if (lVar != null) {
            return (((Number) lVar.f38555d).floatValue() + ((Number) lVar.f38556e).floatValue()) / ((float) 2);
        }
        return 0.0f;
    }

    /* renamed from: e */
    public final void mo151700e(float f, boolean z) {
        this.f315949F = true;
        float d = mo151699d(this.f315956i);
        C111213p0 p0Var = this.f315963s;
        if (p0Var != null) {
            p0Var.mo24362b(this.f315956i, f - d, 0.0f);
        }
        if (z) {
            mo151697b(2);
        } else if (!z) {
            mo151697b(3);
        }
    }

    /* renamed from: f */
    public final void mo151701f(int i, int i2) {
        Vibrator vibrator;
        C111199e eVar = (C111199e) C110818d0.m150917O(this.f315954g, i);
        if (eVar != null) {
            mo151702g(eVar, i);
            eVar.mo6141a();
            C111215q0 q0Var = this.f315962r;
            if (q0Var != null) {
                q0Var.mo24331a(eVar.getTabId(), i2);
            }
            if (this.f315949F && (vibrator = this.f315948E) != null) {
                vibrator.vibrate(10);
            }
        }
    }

    /* renamed from: g */
    public void mo151702g(C111199e eVar, int i) {
        C87412m.m108594g(eVar, "tab");
    }

    public final boolean getCanVibrate() {
        return this.f315949F;
    }

    public C111199e getSelectedTab() {
        int i = this.f315956i;
        if (i < 0 || i >= this.f315954g.size()) {
            return null;
        }
        return this.f315954g.get(this.f315956i);
    }

    /* renamed from: h */
    public void mo151705h(C111199e eVar, int i) {
        C87412m.m108594g(eVar, "tab");
    }

    /* renamed from: i */
    public void mo151706i() {
        Log.m105924i("MicroMsg.BaseScrollTabView", "alvinluo removeAllTabs");
        for (C111199e eVar : this.f315954g) {
            C87412m.m108592e(eVar, "null cannot be cast to non-null type android.view.View");
            View view = (View) eVar;
            LinearLayout linearLayout = this.f315951d;
            if (linearLayout != null) {
                linearLayout.removeView(view);
            } else {
                C87412m.m108603p("container");
                throw null;
            }
        }
        this.f315954g.clear();
    }

    /* renamed from: j */
    public void mo151707j(int i, int i2) {
        int i3 = 0;
        Log.m105925i("MicroMsg.BaseScrollTabView", "alvinluo setSelectedTab last: %d, selected: %d, isScrollingX: %b, tabTranslationInited: %b, tabSelectedAction: %d", Integer.valueOf(this.f315956i), Integer.valueOf(i), Boolean.valueOf(this.f315958n), Boolean.valueOf(this.f315961q), Integer.valueOf(i2));
        int i4 = this.f315956i;
        if (i4 != i && !this.f315958n) {
            if (i4 != -1) {
                i3 = i4;
            }
            if (this.f315961q) {
                mo151698c(i3, i, true, i2);
            } else {
                this.f315957j = i;
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = new Object[1];
        objArr[0] = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        Log.m105919d("MicroMsg.BaseScrollTabView", "alvinluo onInterceptTouchEvent %s", objArr);
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        if (!this.f315953f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent == null) {
            return false;
        }
        if (this.f315969y == null) {
            this.f315969y = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f315969y;
        C87412m.m108591d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        VelocityTracker velocityTracker2 = this.f315969y;
        C87412m.m108591d(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        VelocityTracker velocityTracker3 = this.f315969y;
        C87412m.m108591d(velocityTracker3);
        int xVelocity = (int) velocityTracker3.getXVelocity();
        VelocityTracker velocityTracker4 = this.f315969y;
        C87412m.m108591d(velocityTracker4);
        int yVelocity = (int) velocityTracker4.getYVelocity();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            Object[] objArr2 = new Object[3];
            objArr2[0] = Float.valueOf(motionEvent.getRawX());
            objArr2[1] = Float.valueOf(motionEvent.getRawY());
            LinearLayout linearLayout = this.f315951d;
            if (linearLayout != null) {
                objArr2[2] = Float.valueOf(linearLayout.getTranslationX());
                Log.m105919d("MicroMsg.BaseScrollTabView", "alvinluo onInterceptTouchEvent down: %f, %f, currentTranslationX: %f", objArr2);
                this.f315967w = motionEvent.getRawX();
                this.f315968x = motionEvent.getRawY();
                LinearLayout linearLayout2 = this.f315951d;
                if (linearLayout2 != null) {
                    this.f315970z = linearLayout2.getTranslationX();
                } else {
                    C87412m.m108603p("container");
                    throw null;
                }
            } else {
                C87412m.m108603p("container");
                throw null;
            }
        } else if (action != 1 && action == 2) {
            float rawX = motionEvent.getRawX() - this.f315967w;
            float rawY = motionEvent.getRawY() - this.f315968x;
            Log.m105919d("MicroMsg.BaseScrollTabView", "alvinluo onInterceptTouchEvent action_move tx: %f, ty: %f, velocityX: %d, velocityY: %d", Float.valueOf(rawX), Float.valueOf(rawY), Integer.valueOf(xVelocity), Integer.valueOf(yVelocity));
            if (Math.abs(xVelocity) > Math.abs(yVelocity) && Math.abs(rawX) > Math.abs(rawY) && Math.abs(rawX) >= 5.0f) {
                z = true;
                Log.m105927v("MicroMsg.BaseScrollTabView", "alvinluo onInterceptTouchEvent action: %s, isIntercept: %b", Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z));
                return z;
            }
        }
        z = false;
        Log.m105927v("MicroMsg.BaseScrollTabView", "alvinluo onInterceptTouchEvent action: %s, isIntercept: %b", Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z));
        return z;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = i2;
        this.f315955h = C85875k4.m106184h(getContext()).x;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), i4);
        if (getMeasuredWidth() != 0 && getMeasuredWidth() < (i3 = this.f315955h)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i4);
        }
        if (getMeasuredWidth() != 0) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(this.f315955h);
            View view = this.f315952e;
            if (view != null) {
                objArr[1] = Integer.valueOf(view.getMeasuredWidth());
                Log.m105927v("MicroMsg.BaseScrollTabView", "alvinluo initDotView viewWidth: %d, dotView width: %d", objArr);
                View view2 = this.f315952e;
                if (view2 != null) {
                    view2.setTranslationX((((float) this.f315955h) / 2.0f) - ((float) view2.getMeasuredWidth()));
                    Log.m105926v("MicroMsg.BaseScrollTabView", "alvinluo computeTabTranslationXArea");
                    this.f315960p.clear();
                    float f = ((float) this.f315955h) / 2.0f;
                    Iterator<C111199e> it = this.f315954g.iterator();
                    int i5 = 0;
                    int i6 = 0;
                    while (it.hasNext()) {
                        C111199e next = it.next();
                        int i7 = i5 + 1;
                        if (i5 >= 0) {
                            C111199e eVar = next;
                            C87412m.m108592e(eVar, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) eVar;
                            float f2 = f - ((float) i6);
                            float measuredWidth = f2 - ((float) view3.getMeasuredWidth());
                            i6 += view3.getMeasuredWidth();
                            this.f315960p.add(new C13604l(Float.valueOf(measuredWidth), Float.valueOf(f2)));
                            Log.m105919d("MicroMsg.BaseScrollTabView", "alvinluo computeTabTranslationXArea index: %d, start: %f, end: %f, tabWidth: %d, accumulativeWidth: %d", Integer.valueOf(i5), Float.valueOf(measuredWidth), Float.valueOf(f2), Integer.valueOf(view3.getMeasuredWidth()), Integer.valueOf(i6));
                            i5 = i7;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    this.f315961q = true;
                    C111199e eVar2 = (C111199e) C110818d0.m150916N(this.f315954g);
                    if (eVar2 != null && ((View) eVar2).getMeasuredWidth() != 0) {
                        Log.m105927v("MicroMsg.BaseScrollTabView", "alvinluo scrollDefaultTab selectedIndex: %d, pendingSelectedIndex: %d", Integer.valueOf(this.f315956i), Integer.valueOf(this.f315957j));
                        int i8 = this.f315957j;
                        if (i8 != -1) {
                            mo151698c(this.f315956i, i8, false, 0);
                            this.f315957j = -1;
                            return;
                        }
                        int i9 = this.f315956i;
                        if (i9 == -1 || i9 == 0) {
                            float d = mo151699d(0);
                            LinearLayout linearLayout = this.f315951d;
                            if (linearLayout != null) {
                                linearLayout.setTranslationX(d);
                                Log.m105927v("MicroMsg.BaseScrollTabView", "alvinluo scrollDefaultTab set default tab %f", Float.valueOf(d));
                                mo151698c(this.f315956i, 0, false, 0);
                                return;
                            }
                            C87412m.m108603p("container");
                            throw null;
                        }
                        return;
                    }
                    return;
                }
                C87412m.m108603p("dotView");
                throw null;
            }
            C87412m.m108603p("dotView");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0325  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r9 = r19
            r10 = r20
            if (r10 != 0) goto L_0x000b
            boolean r0 = super.onTouchEvent(r20)
            return r0
        L_0x000b:
            boolean r0 = r9.f315953f
            if (r0 != 0) goto L_0x0014
            boolean r0 = super.onTouchEvent(r20)
            return r0
        L_0x0014:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r20.getAction()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.BaseScrollTabView"
            java.lang.String r4 = "alvinluo onTouchEvent %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r1)
            android.view.GestureDetector r1 = r9.f315950G
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r10)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView"
            java.lang.String r14 = "onTouchEvent"
            java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r16 = "android/view/GestureDetector_EXEC_"
            java.lang.String r17 = "onTouchEvent"
            java.lang.String r18 = "(Landroid/view/MotionEvent;)Z"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r4 = r4.mo10231a(r3)
            android.view.MotionEvent r4 = (android.view.MotionEvent) r4
            boolean r12 = r1.onTouchEvent(r4)
            java.lang.String r13 = "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView"
            java.lang.String r14 = "onTouchEvent"
            java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r16 = "android/view/GestureDetector_EXEC_"
            java.lang.String r17 = "onTouchEvent"
            java.lang.String r18 = "(Landroid/view/MotionEvent;)Z"
            j20.C117292a.m165360f(r11, r12, r13, r14, r15, r16, r17, r18)
            int r1 = r20.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = "container"
            r7 = 2
            if (r1 == 0) goto L_0x0396
            r8 = 0
            if (r1 == r0) goto L_0x032f
            if (r1 == r7) goto L_0x0076
            goto L_0x0391
        L_0x0076:
            r9.f315947D = r0
            float r1 = r9.f315965u
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0080
            r1 = 1
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            if (r1 == 0) goto L_0x00a0
            float r1 = r9.f315966v
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x008b
            r1 = 1
            goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            if (r1 == 0) goto L_0x00a0
            float r0 = r20.getRawX()
            r9.f315965u = r0
            float r0 = r20.getRawY()
            r9.f315966v = r0
            int r0 = r9.f315956i
            r9.f315945B = r0
            goto L_0x0391
        L_0x00a0:
            float r1 = r20.getRawX()
            float r11 = r9.f315965u
            float r1 = r1 - r11
            r20.getRawY()
            android.widget.LinearLayout r11 = r9.f315951d
            if (r11 == 0) goto L_0x032a
            float r11 = r11.getTranslationX()
            java.util.ArrayList<rx3.l<java.lang.Float, java.lang.Float>> r12 = r9.f315960p
            java.lang.Object r12 = sx3.C110818d0.m150916N(r12)
            rx3.l r12 = (rx3.C13604l) r12
            java.lang.String r13 = "alvinluo getMoveOffsetX %f, maxOffset: %f, currentTransX: %f, moveOffset: %f"
            java.lang.String r14 = "alvinluo lastOffsetX: %f, addOffsetX: %f, factor: %f, offsetX: %f"
            r15 = 1056964608(0x3f000000, float:0.5)
            r6 = 4
            r17 = 1065353216(0x3f800000, float:1.0)
            r5 = 30
            if (r12 == 0) goto L_0x0170
            B r7 = r12.f38556e
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0118
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0118
            float r7 = r9.f315944A
            float r7 = r1 - r7
            B r12 = r12.f38556e
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            float r12 = r11 - r12
            float r5 = (float) r5
            float r12 = r12 / r5
            float r17 = r17 - r12
            float r5 = r17 * r15
            float r5 = java.lang.Math.min(r15, r5)
            float r5 = java.lang.Math.max(r8, r5)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            float r12 = r9.f315944A
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r8[r3] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r7)
            r8[r0] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r5)
            r13 = 2
            r8[r13] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r1)
            r13 = 3
            r8[r13] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r14, r8)
            float r8 = r9.f315970z
            goto L_0x01cb
        L_0x0118:
            A r7 = r12.f38555d
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            B r5 = r12.f38556e
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r7 = r7 + r5
            r5 = 2
            float r0 = (float) r5
            float r7 = r7 / r0
            int r5 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0170
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0170
            A r5 = r12.f38555d
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            B r7 = r12.f38556e
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r5 = r5 + r7
            float r5 = r5 / r0
            float r0 = r9.f315970z
            float r5 = r5 - r0
            float r0 = r1 - r5
            float r0 = r0 * r15
            float r0 = r0 + r5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Float r8 = java.lang.Float.valueOf(r1)
            r7[r3] = r8
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r8 = 1
            r7[r8] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r11)
            r8 = 2
            r7[r8] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            r8 = 3
            r7[r8] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r13, r7)
            goto L_0x023e
        L_0x0170:
            java.util.ArrayList<rx3.l<java.lang.Float, java.lang.Float>> r0 = r9.f315960p
            java.lang.Object r0 = sx3.C110818d0.m150925W(r0)
            rx3.l r0 = (rx3.C13604l) r0
            if (r0 == 0) goto L_0x0228
            A r5 = r0.f38555d
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x01d1
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x01d1
            float r5 = r9.f315944A
            float r7 = r1 - r5
            A r0 = r0.f38555d
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = r0 - r11
            r5 = 30
            float r5 = (float) r5
            float r0 = r0 / r5
            float r17 = r17 - r0
            float r0 = r17 * r15
            float r0 = java.lang.Math.min(r15, r0)
            float r5 = java.lang.Math.max(r8, r0)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            float r8 = r9.f315944A
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r0[r3] = r8
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            r12 = 1
            r0[r12] = r8
            java.lang.Float r8 = java.lang.Float.valueOf(r5)
            r12 = 2
            r0[r12] = r8
            java.lang.Float r8 = java.lang.Float.valueOf(r1)
            r12 = 3
            r0[r12] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r14, r0)
            float r8 = r9.f315970z
        L_0x01cb:
            float r11 = r11 - r8
            float r7 = r7 * r5
            float r0 = r11 + r7
            goto L_0x023e
        L_0x01d1:
            A r5 = r0.f38555d
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            B r7 = r0.f38556e
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r5 = r5 + r7
            r7 = 2
            float r12 = (float) r7
            float r5 = r5 / r12
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0228
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0228
            A r5 = r0.f38555d
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            B r0 = r0.f38556e
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r5 = r5 + r0
            float r5 = r5 / r12
            float r0 = r9.f315970z
            float r5 = r5 - r0
            float r0 = r1 - r5
            float r0 = r0 * r15
            float r0 = r0 + r5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Float r8 = java.lang.Float.valueOf(r1)
            r7[r3] = r8
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r8 = 1
            r7[r8] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r11)
            r8 = 2
            r7[r8] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            r11 = 3
            r7[r11] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r13, r7)
            goto L_0x023e
        L_0x0228:
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            r0[r3] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r11)
            r7 = 1
            r0[r7] = r5
            java.lang.String r5 = "alvinluo getMoveOffsetX %f, currentTransX: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r5, r0)
            r0 = r1
        L_0x023e:
            float r5 = r9.f315970z
            float r0 = r0 + r5
            r9.f315944A = r1
            android.widget.LinearLayout r5 = r9.f315951d
            if (r5 == 0) goto L_0x0325
            r5.setTranslationX(r0)
            java.util.ArrayList<rx3.l<java.lang.Float, java.lang.Float>> r5 = r9.f315960p
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
            rx3.l r5 = (rx3.C13604l) r5
            r7 = -1
            if (r5 == 0) goto L_0x0263
            B r5 = r5.f38556e
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0263
            r5 = 0
            goto L_0x02be
        L_0x0263:
            java.util.ArrayList<rx3.l<java.lang.Float, java.lang.Float>> r5 = r9.f315960p
            java.lang.Object r5 = sx3.C110818d0.m150925W(r5)
            rx3.l r5 = (rx3.C13604l) r5
            if (r5 == 0) goto L_0x0285
            A r5 = r5.f38555d
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0285
            java.util.ArrayList<rx3.l<java.lang.Float, java.lang.Float>> r5 = r9.f315960p
            int r5 = r5.size()
            int r5 = r5 + r7
            int r5 = java.lang.Math.max(r5, r3)
            goto L_0x02be
        L_0x0285:
            java.util.ArrayList<rx3.l<java.lang.Float, java.lang.Float>> r5 = r9.f315960p
            java.util.Iterator r5 = r5.iterator()
            r8 = 0
        L_0x028c:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x02bd
            java.lang.Object r11 = r5.next()
            int r12 = r8 + 1
            if (r8 < 0) goto L_0x02b8
            rx3.l r11 = (rx3.C13604l) r11
            A r13 = r11.f38555d
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 < 0) goto L_0x02b6
            B r11 = r11.f38556e
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x02b6
            r5 = r8
            goto L_0x02be
        L_0x02b6:
            r8 = r12
            goto L_0x028c
        L_0x02b8:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x02bd:
            r5 = -1
        L_0x02be:
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r8[r3] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r3 = 1
            r8[r3] = r1
            android.widget.LinearLayout r1 = r9.f315951d
            if (r1 == 0) goto L_0x0320
            float r1 = r1.getTranslationX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3 = 2
            r8[r3] = r1
            int r1 = r9.f315956i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 3
            r8[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r8[r6] = r1
            java.lang.String r1 = "alvinluo handleScroll offsetX: %f, targetTansX: %f, currentTransX: %f, lastScrollIndex: %d, index: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r8)
            int r1 = r9.f315956i
            if (r1 == r7) goto L_0x02fa
            boolean r1 = r9.f315947D
            r9.mo151700e(r0, r1)
        L_0x02fa:
            int r0 = r9.f315956i
            if (r0 == r5) goto L_0x0391
            java.util.ArrayList<ul2.e> r1 = r9.f315954g
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r0)
            ul2.e r1 = (ul2.C111199e) r1
            if (r1 == 0) goto L_0x0319
            r9.mo151705h(r1, r0)
            r1.mo6142b()
            ul2.q0 r0 = r9.f315962r
            if (r0 == 0) goto L_0x0319
            int r1 = r1.getTabId()
            r0.mo24332b(r1)
        L_0x0319:
            r9.f315956i = r5
            r0 = 2
            r9.mo151701f(r5, r0)
            goto L_0x0391
        L_0x0320:
            gy3.C87412m.m108603p(r4)
            r0 = 0
            throw r0
        L_0x0325:
            r0 = 0
            gy3.C87412m.m108603p(r4)
            throw r0
        L_0x032a:
            r0 = 0
            gy3.C87412m.m108603p(r4)
            throw r0
        L_0x032f:
            r9.f315965u = r8
            r9.f315966v = r8
            r9.f315947D = r3
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r0 = r9.f315956i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r3] = r0
            boolean r0 = r9.f315946C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5 = 1
            r1[r5] = r0
            java.lang.String r0 = "alvinluo onTouchUp selectedIndex: %d, isFlingSwitchTab: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r0, r1)
            boolean r0 = r9.f315946C
            if (r0 == 0) goto L_0x0355
            r9.f315946C = r3
            goto L_0x0391
        L_0x0355:
            java.util.ArrayList<rx3.l<java.lang.Float, java.lang.Float>> r0 = r9.f315960p
            int r1 = r9.f315956i
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r1)
            rx3.l r0 = (rx3.C13604l) r0
            if (r0 == 0) goto L_0x0391
            A r1 = r0.f38555d
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            B r0 = r0.f38556e
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r1 = r1 + r0
            r0 = 2
            float r0 = (float) r0
            float r3 = r1 / r0
            int r1 = r9.f315956i
            android.widget.LinearLayout r0 = r9.f315951d
            if (r0 == 0) goto L_0x038c
            float r2 = r0.getTranslationX()
            r4 = 75
            r6 = 0
            r7 = 16
            r8 = 0
            r0 = r19
            m142685a(r0, r1, r2, r3, r4, r6, r7, r8)
            goto L_0x0391
        L_0x038c:
            gy3.C87412m.m108603p(r4)
            r0 = 0
            throw r0
        L_0x0391:
            boolean r0 = super.onTouchEvent(r20)
            return r0
        L_0x0396:
            float r0 = r20.getRawX()
            r9.f315965u = r0
            float r0 = r20.getRawY()
            r9.f315966v = r0
            android.widget.LinearLayout r0 = r9.f315951d
            if (r0 == 0) goto L_0x03e4
            float r0 = r0.getTranslationX()
            r9.f315970z = r0
            int r0 = r9.f315956i
            r9.f315945B = r0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            float r1 = r20.getRawX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0[r3] = r1
            float r1 = r20.getRawY()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            android.widget.LinearLayout r1 = r9.f315951d
            if (r1 == 0) goto L_0x03df
            float r1 = r1.getTranslationX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r4 = 2
            r0[r4] = r1
            java.lang.String r1 = "alvinluo onTouch down: %f, %f, currentTranslationX: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r1, r0)
            r9.f315947D = r3
            return r3
        L_0x03df:
            gy3.C87412m.m108603p(r4)
            r0 = 0
            throw r0
        L_0x03e4:
            r0 = 0
            gy3.C87412m.m108603p(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.widget.BaseScrollTabView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCanVibrate(boolean z) {
        this.f315949F = z;
    }

    public void setEnableSwitchTab(boolean z) {
        this.f315953f = z;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (C111199e tabEnabled : this.f315954g) {
            tabEnabled.setTabEnabled(z);
        }
        View view = this.f315952e;
        if (view != null) {
            view.setEnabled(z);
        } else {
            C87412m.m108603p("dotView");
            throw null;
        }
    }

    public void setOnTabChangedListener(C111215q0 q0Var) {
        C87412m.m108594g(q0Var, "tabOnSelectedListener");
        this.f315962r = q0Var;
    }

    public void setOnTabClickListener(C111211o0 o0Var) {
        C87412m.m108594g(o0Var, "tabOnClickListener");
    }

    public void setOnTabScrollListener(C111213p0 p0Var) {
        C87412m.m108594g(p0Var, "tabOnScrollListener");
        this.f315963s = p0Var;
    }

    public void setSelectedTab(int i) {
        mo151707j(i, 0);
    }

    public final void setTabViewImportantForAccessibility(int i) {
        ArrayList<C111199e> arrayList = this.f315954g;
        if (!(arrayList == null || arrayList.isEmpty())) {
            for (C111199e eVar : this.f315954g) {
                if (eVar instanceof View) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("setTabViewImportantForAccessibility :");
                    View view = (View) eVar;
                    sb.append(view.getImportantForAccessibility());
                    sb.append("  ");
                    sb.append(i);
                    Log.m105924i("MicroMsg.BaseScrollTabView", sb.toString());
                    view.setImportantForAccessibility(i);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseScrollTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object systemService;
        C87412m.m108594g(context, "context");
        this.f315953f = true;
        this.f315954g = new ArrayList<>();
        this.f315956i = -1;
        this.f315957j = -1;
        this.f315959o = new LinearInterpolator();
        this.f315960p = new ArrayList<>();
        this.f315964t = 1;
        this.f315945B = -1;
        this.f315950G = new GestureDetector(getContext(), new C111195c(this));
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359849b51, this, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.j44);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.scroll_tab_container)");
        this.f315951d = (LinearLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.j45);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.scroll_tab_dot)");
        this.f315952e = findViewById2;
        getResources().getDimensionPixelSize(C0966R.dimen.f3623g);
        if (this.f315948E == null && (systemService = getContext().getSystemService("vibrator")) != null) {
            this.f315948E = (Vibrator) systemService;
        }
    }
}
