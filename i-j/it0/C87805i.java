package it0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC;
import com.tencent.p014mm.plugin.appbrand.page.C40521t2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83910s1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.plugin.appbrand.widget.C84933h;
import com.tencent.p014mm.plugin.appbrand.widget.C85006j;
import com.tencent.p014mm.plugin.appbrand.widget.C85007k;
import com.tencent.p014mm.plugin.appbrand.widget.C85012q;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8478d0;
import gy3.C87412m;
import is0.C87794b;
import kr0.C88267e;
import kt0.C34033c;
import kt0.C46743b;
import my3.C61595o;
import rx3.C13598b0;

/* renamed from: it0.i */
public final class C87805i implements C85007k, C40521t2 {

    /* renamed from: A */
    public ValueAnimator f254179A;

    /* renamed from: a */
    public final AppBrandRuntimeWC f254180a;

    /* renamed from: b */
    public MotionEvent f254181b;

    /* renamed from: c */
    public MotionEvent f254182c;

    /* renamed from: d */
    public int f254183d;

    /* renamed from: e */
    public C33404d f254184e;

    /* renamed from: f */
    public int f254185f;

    /* renamed from: g */
    public final C84927e f254186g;

    /* renamed from: h */
    public final Context f254187h;

    /* renamed from: i */
    public boolean f254188i;

    /* renamed from: j */
    public boolean f254189j;

    /* renamed from: k */
    public boolean f254190k;

    /* renamed from: l */
    public boolean f254191l;

    /* renamed from: m */
    public boolean f254192m;

    /* renamed from: n */
    public int f254193n;

    /* renamed from: o */
    public int f254194o = -1;

    /* renamed from: p */
    public VelocityTracker f254195p;

    /* renamed from: q */
    public float f254196q;

    /* renamed from: r */
    public boolean f254197r;

    /* renamed from: s */
    public boolean f254198s;

    /* renamed from: t */
    public C85012q f254199t;

    /* renamed from: u */
    public C85012q f254200u;

    /* renamed from: v */
    public int f254201v;

    /* renamed from: w */
    public boolean f254202w;

    /* renamed from: x */
    public C85006j f254203x;

    /* renamed from: y */
    public volatile boolean f254204y;

    /* renamed from: z */
    public Animator f254205z;

    /* renamed from: it0.i$a */
    public static class C87806a implements Animator.AnimatorListener {
        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: it0.i$b */
    public /* synthetic */ class C87807b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f254206a;

        static {
            int[] iArr = new int[C84933h.values().length];
            iArr[0] = 1;
            iArr[2] = 2;
            iArr[4] = 3;
            iArr[3] = 4;
            iArr[1] = 5;
            int[] iArr2 = new int[C85012q.values().length];
            iArr2[2] = 1;
            f254206a = iArr2;
        }
    }

    /* renamed from: it0.i$c */
    public static final class C87808c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C84933h f254207d;

        /* renamed from: e */
        public final /* synthetic */ C87805i f254208e;

        public C87808c(C84933h hVar, C87805i iVar) {
            this.f254207d = hVar;
            this.f254208e = iVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C84933h hVar = this.f254207d;
            if (hVar == C84933h.DISMISS || hVar == C84933h.DISMISS_AND_NOT_CLOSE_RUNTIME) {
                C84927e eVar = this.f254208e.f254186g;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                eVar.setTop(((Integer) animatedValue).intValue());
                HalfScreenManger halfScreenManger = this.f254208e.f254180a.f238298z1;
                C87794b c = halfScreenManger.mo117780c(halfScreenManger.f247568a);
                if (c != null) {
                    View view = c.f254167f;
                    if (C87412m.m108589b(view != null ? view.getParent() : null, c) && c.f254166e != null) {
                        View view2 = c.f254167f;
                        C87412m.m108591d(view2);
                        int top = view2.getTop();
                        FrameLayout frameLayout = c.f254166e;
                        C87412m.m108591d(frameLayout);
                        FrameLayout frameLayout2 = c.f254166e;
                        C87412m.m108591d(frameLayout2);
                        frameLayout.setTop(top - frameLayout2.getMeasuredHeight());
                    }
                }
                C87805i iVar = this.f254208e;
                iVar.mo117948c(iVar.f254186g.getLeft(), this.f254208e.f254186g.getTop(), this.f254208e.f254186g.getRight(), this.f254208e.f254186g.getBottom());
                return;
            }
            C87805i iVar2 = this.f254208e;
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            iVar2.mo122258k(((Integer) animatedValue2).intValue());
        }
    }

    /* renamed from: it0.i$d */
    public static final class C87809d extends C87806a {

        /* renamed from: d */
        public final /* synthetic */ C84933h f254209d;

        /* renamed from: e */
        public final /* synthetic */ C87805i f254210e;

        /* renamed from: f */
        public final /* synthetic */ C8478d0 f254211f;

        /* renamed from: g */
        public final /* synthetic */ AnimatorListenerAdapter f254212g;

        public C87809d(C84933h hVar, C87805i iVar, C8478d0 d0Var, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f254209d = hVar;
            this.f254210e = iVar;
            this.f254211f = d0Var;
            this.f254212g = animatorListenerAdapter;
        }

        public void onAnimationCancel(Animator animator) {
            Log.m105918d("MicroMsg.WxaHalfScreenGestureControllerImp", "[animateContainer] type[" + this.f254209d + "]} onAnimationCancel");
            this.f254210e.f254204y = false;
            this.f254210e.f254205z = null;
            AnimatorListenerAdapter animatorListenerAdapter = this.f254212g;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105918d("MicroMsg.WxaHalfScreenGestureControllerImp", "[animateContainer] type[" + this.f254209d + "]} onAnimationEnd");
            this.f254210e.f254204y = false;
            this.f254210e.f254205z = null;
            if (this.f254211f.f27483d != -1) {
                Log.m105918d("MicroMsg.WxaHalfScreenGestureControllerImp", "[animateContainer] type[" + this.f254209d + "]} onAnimationEnd notifyHeightChanged height[" + this.f254211f.f27483d + ']');
                this.f254210e.mo122262o(this.f254211f.f27483d, true);
            }
            if (this.f254209d == C84933h.DISMISS) {
                this.f254210e.f254180a.mo113063k();
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f254212g;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            Log.m105918d("MicroMsg.WxaHalfScreenGestureControllerImp", "[animateContainer] type[" + this.f254209d + "]} onAnimationStart");
            this.f254210e.f254204y = true;
            AnimatorListenerAdapter animatorListenerAdapter = this.f254212g;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(animator);
            }
        }
    }

    public C87805i(AppBrandRuntimeWC appBrandRuntimeWC) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        this.f254180a = appBrandRuntimeWC;
        C33404d dVar = C33404d.DRAG_STATE_IDLE;
        this.f254184e = dVar;
        C84927e eVar = appBrandRuntimeWC.f238153r;
        this.f254186g = eVar;
        Context context = eVar.getContext();
        C87412m.m108593f(context, "this.container.context");
        this.f254187h = context;
        C85012q qVar = C85012q.NONE;
        this.f254199t = qVar;
        this.f254200u = qVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f254183d = viewConfiguration.getScaledTouchSlop();
        this.f254196q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
        Log.m105924i("MicroMsg.WxaHalfScreenGestureControllerImp", "init: touchSlop[" + this.f254183d + "]  maxVelocity[" + this.f254196q + ']');
        mo122267t(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fb, code lost:
        if (r0 != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0132, code lost:
        if (java.lang.Math.abs((int) (r0 - r7)) >= r10.f254183d) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004a, code lost:
        if (r0 != 3) goto L_0x017d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e2 A[Catch:{ all -> 0x013a }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo117946a(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleOnInterceptTouchEvent: action["
            r0.append(r1)
            int r2 = r11.getAction()
            r0.append(r2)
            java.lang.String r2 = "]  X["
            r0.append(r2)
            float r2 = r11.getRawX()
            r0.append(r2)
            java.lang.String r2 = "] Y["
            r0.append(r2)
            float r2 = r11.getRawY()
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.WxaHalfScreenGestureControllerImp"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            int r0 = r11.getAction()
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x019e
            if (r0 == r5) goto L_0x013f
            r6 = 2
            if (r0 == r6) goto L_0x004e
            r2 = 3
            if (r0 == r2) goto L_0x013f
            goto L_0x017d
        L_0x004e:
            boolean r0 = r10.f254202w
            if (r0 != 0) goto L_0x0062
            com.tencent.mm.plugin.appbrand.widget.j r0 = r10.f254203x
            if (r0 == 0) goto L_0x005e
            boolean r0 = r0.mo117945b(r11)
            if (r0 != 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 != 0) goto L_0x0062
            return r5
        L_0x0062:
            boolean r0 = r10.mo122257j()
            if (r0 != 0) goto L_0x0069
            return r4
        L_0x0069:
            float r0 = r11.getRawX()     // Catch:{ all -> 0x013a }
            android.view.MotionEvent r6 = r10.f254182c     // Catch:{ all -> 0x013a }
            r7 = 0
            if (r6 == 0) goto L_0x0077
            float r6 = r6.getRawX()     // Catch:{ all -> 0x013a }
            goto L_0x0078
        L_0x0077:
            r6 = 0
        L_0x0078:
            float r0 = r0 - r6
            int r0 = (int) r0     // Catch:{ all -> 0x013a }
            float r6 = r11.getRawY()     // Catch:{ all -> 0x013a }
            android.view.MotionEvent r8 = r10.f254182c     // Catch:{ all -> 0x013a }
            if (r8 == 0) goto L_0x0087
            float r8 = r8.getRawY()     // Catch:{ all -> 0x013a }
            goto L_0x0088
        L_0x0087:
            r8 = 0
        L_0x0088:
            float r6 = r6 - r8
            int r6 = (int) r6     // Catch:{ all -> 0x013a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x013a }
            r8.<init>()     // Catch:{ all -> 0x013a }
            java.lang.String r9 = "handleOnInterceptTouchEvent: moveDistanceY["
            r8.append(r9)     // Catch:{ all -> 0x013a }
            r8.append(r6)     // Catch:{ all -> 0x013a }
            java.lang.String r9 = "]  touchSlop["
            r8.append(r9)     // Catch:{ all -> 0x013a }
            int r9 = r10.f254183d     // Catch:{ all -> 0x013a }
            r8.append(r9)     // Catch:{ all -> 0x013a }
            r8.append(r2)     // Catch:{ all -> 0x013a }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r8)     // Catch:{ all -> 0x013a }
            boolean r8 = r10.f254188i     // Catch:{ all -> 0x013a }
            if (r8 == 0) goto L_0x00b5
            if (r6 >= 0) goto L_0x00b5
            r10.mo122266s(r11)
            return r4
        L_0x00b5:
            int r8 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x013a }
            int r9 = r10.f254183d     // Catch:{ all -> 0x013a }
            if (r8 < r9) goto L_0x0106
            int r8 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x013a }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x013a }
            if (r8 <= r0) goto L_0x0106
            boolean r0 = r10.mo122264q()     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r10.mo122264q()     // Catch:{ all -> 0x013a }
            if (r6 <= 0) goto L_0x00d5
            r6 = 1
            goto L_0x00d6
        L_0x00d5:
            r6 = 0
        L_0x00d6:
            if (r0 == 0) goto L_0x00df
            if (r0 == 0) goto L_0x00dd
            if (r6 == 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r0 = 0
            goto L_0x00e0
        L_0x00df:
            r0 = 1
        L_0x00e0:
            if (r0 == 0) goto L_0x0106
            boolean r0 = r10.f254197r     // Catch:{ all -> 0x013a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x013a }
            r6.<init>()     // Catch:{ all -> 0x013a }
            java.lang.String r8 = "canOverScroll["
            r6.append(r8)     // Catch:{ all -> 0x013a }
            r6.append(r0)     // Catch:{ all -> 0x013a }
            r6.append(r2)     // Catch:{ all -> 0x013a }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x0106
        L_0x00fd:
            it0.d r0 = it0.C33404d.DRAG_STATE_DRAGGING     // Catch:{ all -> 0x013a }
            r10.mo122267t(r0)     // Catch:{ all -> 0x013a }
            r10.mo122266s(r11)
            return r5
        L_0x0106:
            float r0 = r11.getRawY()     // Catch:{ all -> 0x013a }
            android.view.MotionEvent r2 = r10.f254182c     // Catch:{ all -> 0x013a }
            if (r2 == 0) goto L_0x0113
            float r2 = r2.getRawY()     // Catch:{ all -> 0x013a }
            goto L_0x0114
        L_0x0113:
            r2 = 0
        L_0x0114:
            float r0 = r0 - r2
            int r0 = (int) r0     // Catch:{ all -> 0x013a }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x013a }
            int r2 = r10.f254183d     // Catch:{ all -> 0x013a }
            if (r0 >= r2) goto L_0x0134
            float r0 = r11.getRawX()     // Catch:{ all -> 0x013a }
            android.view.MotionEvent r2 = r10.f254182c     // Catch:{ all -> 0x013a }
            if (r2 == 0) goto L_0x012a
            float r7 = r2.getRawX()     // Catch:{ all -> 0x013a }
        L_0x012a:
            float r0 = r0 - r7
            int r0 = (int) r0     // Catch:{ all -> 0x013a }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x013a }
            int r2 = r10.f254183d     // Catch:{ all -> 0x013a }
            if (r0 < r2) goto L_0x0136
        L_0x0134:
            r10.f254198s = r4     // Catch:{ all -> 0x013a }
        L_0x0136:
            r10.mo122266s(r11)
            goto L_0x017d
        L_0x013a:
            r0 = move-exception
            r10.mo122266s(r11)
            throw r0
        L_0x013f:
            boolean r0 = r10.mo122257j()     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x0149
            r10.mo122265r()
            return r4
        L_0x0149:
            boolean r0 = r10.f254198s     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x016c
            int r0 = r11.getAction()     // Catch:{ all -> 0x0199 }
            if (r0 != r5) goto L_0x016c
            boolean r0 = r10.mo122263p(r11)     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x0166
            com.tencent.mm.plugin.appbrand.widget.h r0 = com.tencent.p014mm.plugin.appbrand.widget.C84933h.FULL_SCREEN     // Catch:{ all -> 0x0199 }
            r2 = 0
            r10.mo117953h(r0, r2)     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = "tap to full screen"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x0199 }
            goto L_0x016c
        L_0x0166:
            java.lang.String r0 = "tap to full screen be intercepted"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x0199 }
        L_0x016c:
            boolean r0 = r10.f254202w     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x017a
            boolean r0 = r10.mo122261n(r11)     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x017a
            r10.mo122265r()
            return r5
        L_0x017a:
            r10.mo122265r()
        L_0x017d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            int r11 = r11.getAction()
            r0.append(r11)
            java.lang.String r11 = "] return false"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r11)
            return r4
        L_0x0199:
            r11 = move-exception
            r10.mo122265r()
            throw r11
        L_0x019e:
            boolean r0 = r10.mo122261n(r11)
            r10.f254202w = r0
            r10.mo122266s(r11)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r10.f254182c = r0
            com.tencent.mm.plugin.appbrand.widget.q r0 = r10.f254199t
            r10.f254200u = r0
            com.tencent.mm.plugin.appbrand.widget.e r0 = r10.f254186g
            int r0 = r0.getHeight()
            r10.f254201v = r0
            r10.f254198s = r5
            r10.mo122256i()
            boolean r0 = r10.f254202w
            if (r0 != 0) goto L_0x01cf
            com.tencent.mm.plugin.appbrand.widget.j r0 = r10.f254203x
            if (r0 == 0) goto L_0x01cb
            boolean r11 = r0.mo117945b(r11)
            goto L_0x01cc
        L_0x01cb:
            r11 = 1
        L_0x01cc:
            if (r11 == 0) goto L_0x01cf
            r4 = 1
        L_0x01cf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87805i.mo117946a(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r1 != 3) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b7, code lost:
        if (java.lang.Math.abs((int) (r1 - r2)) >= r10.f254183d) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b A[SYNTHETIC, Splitter:B:39:0x008b] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo117947b(android.view.MotionEvent r11) {
        /*
            r10 = this;
            it0.d r0 = it0.C33404d.DRAG_STATE_DRAGGING
            java.lang.String r1 = "ev"
            gy3.C87412m.m108594g(r11, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleTouchEvent: action["
            r1.append(r2)
            int r2 = r11.getAction()
            r1.append(r2)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.WxaHalfScreenGestureControllerImp"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            android.view.VelocityTracker r1 = r10.f254195p
            if (r1 != 0) goto L_0x0030
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r10.f254195p = r1
        L_0x0030:
            android.view.VelocityTracker r1 = r10.f254195p
            gy3.C87412m.m108591d(r1)
            r1.addMovement(r11)
            int r1 = r11.getAction()
            r4 = 1
            if (r1 == 0) goto L_0x017c
            r5 = 0
            if (r1 == r4) goto L_0x00f4
            r6 = 2
            if (r1 == r6) goto L_0x004a
            r6 = 3
            if (r1 == r6) goto L_0x00f4
            goto L_0x0170
        L_0x004a:
            boolean r0 = r10.f254202w
            if (r0 != 0) goto L_0x004f
            return r4
        L_0x004f:
            boolean r0 = r10.f254204y     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "[handleTouchEvent] can not perform scroll container during animating"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)     // Catch:{ all -> 0x00ef }
            r10.mo122266s(r11)
            return r5
        L_0x005c:
            float r0 = r11.getRawY()     // Catch:{ all -> 0x00ef }
            android.view.MotionEvent r1 = r10.f254181b     // Catch:{ all -> 0x00ef }
            r2 = 0
            if (r1 == 0) goto L_0x006a
            float r1 = r1.getRawY()     // Catch:{ all -> 0x00ef }
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            float r0 = r0 - r1
            int r0 = (int) r0     // Catch:{ all -> 0x00ef }
            boolean r1 = r10.mo122264q()     // Catch:{ all -> 0x00ef }
            if (r0 <= 0) goto L_0x0075
            r6 = 1
            goto L_0x0076
        L_0x0075:
            r6 = 0
        L_0x0076:
            if (r1 == 0) goto L_0x007f
            if (r1 == 0) goto L_0x007d
            if (r6 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r1 = 0
            goto L_0x0080
        L_0x007f:
            r1 = 1
        L_0x0080:
            if (r1 != 0) goto L_0x008b
            java.lang.String r0 = "[handleTouchEvent] can not perform scroll container"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)     // Catch:{ all -> 0x00ef }
            r10.mo122266s(r11)
            return r5
        L_0x008b:
            float r1 = r11.getRawY()     // Catch:{ all -> 0x00ef }
            android.view.MotionEvent r6 = r10.f254182c     // Catch:{ all -> 0x00ef }
            if (r6 == 0) goto L_0x0098
            float r6 = r6.getRawY()     // Catch:{ all -> 0x00ef }
            goto L_0x0099
        L_0x0098:
            r6 = 0
        L_0x0099:
            float r1 = r1 - r6
            int r1 = (int) r1     // Catch:{ all -> 0x00ef }
            int r1 = java.lang.Math.abs(r1)     // Catch:{ all -> 0x00ef }
            int r6 = r10.f254183d     // Catch:{ all -> 0x00ef }
            if (r1 >= r6) goto L_0x00b9
            float r1 = r11.getRawX()     // Catch:{ all -> 0x00ef }
            android.view.MotionEvent r6 = r10.f254182c     // Catch:{ all -> 0x00ef }
            if (r6 == 0) goto L_0x00af
            float r2 = r6.getRawX()     // Catch:{ all -> 0x00ef }
        L_0x00af:
            float r1 = r1 - r2
            int r1 = (int) r1     // Catch:{ all -> 0x00ef }
            int r1 = java.lang.Math.abs(r1)     // Catch:{ all -> 0x00ef }
            int r2 = r10.f254183d     // Catch:{ all -> 0x00ef }
            if (r1 < r2) goto L_0x00bb
        L_0x00b9:
            r10.f254198s = r5     // Catch:{ all -> 0x00ef }
        L_0x00bb:
            int r1 = r10.f254185f     // Catch:{ all -> 0x00ef }
            int r1 = r1 + r0
            r10.f254185f = r1     // Catch:{ all -> 0x00ef }
            int r2 = r10.f254201v     // Catch:{ all -> 0x00ef }
            int r1 = -r1
            int r2 = r2 + r1
            r10.mo122258k(r2)     // Catch:{ all -> 0x00ef }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            r1.<init>()     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "[handleTouchEvent] current height="
            r1.append(r2)     // Catch:{ all -> 0x00ef }
            com.tencent.mm.plugin.appbrand.widget.e r2 = r10.f254186g     // Catch:{ all -> 0x00ef }
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch:{ all -> 0x00ef }
            int r2 = r2.height     // Catch:{ all -> 0x00ef }
            r1.append(r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "  moveDistanceY="
            r1.append(r2)     // Catch:{ all -> 0x00ef }
            r1.append(r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ef }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)     // Catch:{ all -> 0x00ef }
            r10.mo122266s(r11)
            return r4
        L_0x00ef:
            r0 = move-exception
            r10.mo122266s(r11)
            throw r0
        L_0x00f4:
            boolean r1 = r10.mo122261n(r11)     // Catch:{ all -> 0x0177 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0177 }
            r6.<init>()     // Catch:{ all -> 0x0177 }
            java.lang.String r7 = "interactsContainerView["
            r6.append(r7)     // Catch:{ all -> 0x0177 }
            r6.append(r1)     // Catch:{ all -> 0x0177 }
            r6.append(r2)     // Catch:{ all -> 0x0177 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0177 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)     // Catch:{ all -> 0x0177 }
            boolean r2 = r10.f254202w     // Catch:{ all -> 0x0177 }
            if (r2 == 0) goto L_0x011e
            int r2 = r10.f254185f     // Catch:{ all -> 0x0177 }
            com.tencent.mm.plugin.appbrand.widget.e r6 = r10.f254186g     // Catch:{ all -> 0x0177 }
            int r6 = r6.getHeight()     // Catch:{ all -> 0x0177 }
            r10.mo122268u(r2, r6)     // Catch:{ all -> 0x0177 }
        L_0x011e:
            boolean r2 = r10.f254202w     // Catch:{ all -> 0x0177 }
            if (r2 != 0) goto L_0x0142
            boolean r2 = r10.mo122261n(r11)     // Catch:{ all -> 0x0177 }
            if (r2 != 0) goto L_0x0142
            int r2 = r11.getAction()     // Catch:{ all -> 0x0177 }
            if (r2 != r4) goto L_0x0142
            long r6 = r11.getEventTime()     // Catch:{ all -> 0x0177 }
            long r8 = r11.getDownTime()     // Catch:{ all -> 0x0177 }
            long r6 = r6 - r8
            int r11 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ all -> 0x0177 }
            long r8 = (long) r11     // Catch:{ all -> 0x0177 }
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x0142
            r11 = 1
            goto L_0x0143
        L_0x0142:
            r11 = 0
        L_0x0143:
            if (r11 == 0) goto L_0x015b
            java.lang.String r11 = "Empty area clicked"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)     // Catch:{ all -> 0x0177 }
            com.tencent.mm.plugin.appbrand.widget.j r11 = r10.f254203x     // Catch:{ all -> 0x0177 }
            if (r11 == 0) goto L_0x0155
            boolean r11 = r11.mo117944a()     // Catch:{ all -> 0x0177 }
            if (r11 != 0) goto L_0x0155
            r5 = 1
        L_0x0155:
            r11 = r5 ^ 1
            r10.mo122265r()
            return r11
        L_0x015b:
            boolean r11 = r10.f254202w     // Catch:{ all -> 0x0177 }
            if (r11 != 0) goto L_0x0165
            if (r1 == 0) goto L_0x0165
            r10.mo122265r()
            return r4
        L_0x0165:
            it0.d r11 = r10.f254184e     // Catch:{ all -> 0x0177 }
            if (r11 != r0) goto L_0x016d
            r10.mo122265r()
            return r4
        L_0x016d:
            r10.mo122265r()
        L_0x0170:
            it0.d r11 = r10.f254184e
            if (r11 != r0) goto L_0x0175
            goto L_0x0176
        L_0x0175:
            r4 = 0
        L_0x0176:
            return r4
        L_0x0177:
            r11 = move-exception
            r10.mo122265r()
            throw r11
        L_0x017c:
            com.tencent.mm.plugin.appbrand.widget.q r0 = r10.f254199t
            r10.f254200u = r0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r10.f254182c = r0
            com.tencent.mm.plugin.appbrand.widget.e r0 = r10.f254186g
            int r0 = r0.getHeight()
            r10.f254201v = r0
            r10.f254198s = r4
            r10.mo122256i()
            r10.mo122266s(r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87805i.mo117947b(android.view.MotionEvent):boolean");
    }

    /* renamed from: c */
    public void mo117948c(int i, int i2, int i3, int i4) {
        ResultReceiver resultReceiver;
        ResultReceiver resultReceiver2;
        int max = Math.max(i4 - i2, 0);
        Log.m105918d("MicroMsg.WxaHalfScreenGestureControllerImp", "onLayout: top[" + i2 + "] bottom[" + i4 + "] height[" + max + ']');
        C85012q qVar = max == 0 ? C85012q.DISMISS : max == mo122260m() ? C85012q.FULL_SCREEN : C85012q.NOT_FULL_SCREEN;
        if (qVar != this.f254199t && this.f254189j) {
            Log.m105924i("MicroMsg.WxaHalfScreenGestureControllerImp", "onStatusChanged  new[" + qVar + "]  old[" + this.f254199t + "]  dragState[" + this.f254184e + ']');
            C85012q qVar2 = this.f254199t;
            this.f254199t = qVar;
            if (qVar2 != C85012q.NONE) {
                C87810j jVar = new C87810j(this);
                ValueAnimator valueAnimator = this.f254179A;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f254179A = null;
                if (C87807b.f254206a[this.f254199t.ordinal()] == 1) {
                    this.f254179A = (ValueAnimator) jVar.invoke(Boolean.TRUE);
                    HalfScreenManger halfScreenManger = this.f254180a.f238298z1;
                    if (halfScreenManger != null) {
                        C33404d dVar = this.f254184e;
                        C87412m.m108594g(dVar, "dragState");
                        if (dVar == C33404d.DRAG_STATE_IDLE) {
                            halfScreenManger.mo117798u();
                        }
                        BaseAppBrandSingleCloseCapsuleBar b = halfScreenManger.mo117779b();
                        if (b != null) {
                            b.mo116120a(true);
                        }
                        WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = halfScreenManger.mo117782e().f157953p;
                        if (!(weAppHalfScreenStatusChangeListener == null || (resultReceiver2 = weAppHalfScreenStatusChangeListener.f239428e) == null)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("action", 0);
                            bundle.putInt("status", 1);
                            C13598b0 b0Var = C13598b0.f38549a;
                            resultReceiver2.send(0, bundle);
                        }
                        halfScreenManger.mo117788k();
                        AppBrandRuntimeWC appBrandRuntimeWC = halfScreenManger.f247568a;
                        if (!appBrandRuntimeWC.mo113210l1().f234815R0.f157940K) {
                            appBrandRuntimeWC = null;
                        }
                        if (appBrandRuntimeWC != null) {
                            appBrandRuntimeWC.f238153r.setRoundCornerProvider((C84927e.C84929b) null);
                        }
                        if (((C88267e) halfScreenManger.f247568a.f238150p) != null) {
                            C46743b bVar = new C46743b();
                            C88267e eVar = (C88267e) halfScreenManger.f247568a.f238150p;
                            C87412m.m108593f(eVar, "runtime.service");
                            bVar.mo71967s(eVar, C34033c.FULL_PAGE);
                        }
                    }
                } else {
                    this.f254179A = (ValueAnimator) jVar.invoke(Boolean.FALSE);
                    HalfScreenManger halfScreenManger2 = this.f254180a.f238298z1;
                    if (halfScreenManger2 != null) {
                        C87412m.m108594g(this.f254184e, "dragState");
                        BaseAppBrandSingleCloseCapsuleBar b2 = halfScreenManger2.mo117779b();
                        if (b2 != null) {
                            b2.mo116120a(!halfScreenManger2.mo117793p());
                        }
                        WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener2 = halfScreenManger2.mo117782e().f157953p;
                        if (!(weAppHalfScreenStatusChangeListener2 == null || (resultReceiver = weAppHalfScreenStatusChangeListener2.f239428e) == null)) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("action", 0);
                            bundle2.putInt("status", 0);
                            C13598b0 b0Var2 = C13598b0.f38549a;
                            resultReceiver.send(0, bundle2);
                        }
                        halfScreenManger2.mo117788k();
                        halfScreenManger2.mo117791n();
                        if (((C88267e) halfScreenManger2.f247568a.f238150p) != null) {
                            C46743b bVar2 = new C46743b();
                            C88267e eVar2 = (C88267e) halfScreenManger2.f247568a.f238150p;
                            C87412m.m108593f(eVar2, "runtime.service");
                            bVar2.mo71967s(eVar2, C34033c.HALF_PAGE);
                        }
                    }
                }
            }
        }
        mo122262o(max, false);
    }

    /* renamed from: d */
    public void mo117949d(int i, int i2) {
        this.f254193n = i;
        this.f254194o = i2;
        Log.m105924i("MicroMsg.WxaHalfScreenGestureControllerImp", "defaultViewHeight=" + i + "  maxViewHeight=" + i2);
    }

    /* renamed from: e */
    public void mo117950e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f254188i = z2;
        this.f254189j = z;
        this.f254190k = z3;
        this.f254191l = z4;
        this.f254192m = z5;
    }

    /* renamed from: f */
    public void mo117951f(C85006j jVar) {
        this.f254203x = jVar;
    }

    /* renamed from: g */
    public void mo63352g(int i, int i2, boolean z, boolean z2) {
        Log.m105924i("MicroMsg.WxaHalfScreenGestureControllerImp", "onOverScrolled   scrollX=" + i + "   scrollY=" + i2 + "    clampedX=" + z + "   clampedY=" + z2);
        if (!this.f254197r) {
            this.f254197r = z2;
        }
    }

    public C85012q getCurrentStatus() {
        return this.f254199t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0133  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo117953h(com.tencent.p014mm.plugin.appbrand.widget.C84933h r12, android.animation.AnimatorListenerAdapter r13) {
        /*
            r11 = this;
            java.lang.String r0 = "type"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[animateContainer] type["
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = "]}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.WxaHalfScreenGestureControllerImp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            gy3.d0 r0 = new gy3.d0
            r0.<init>()
            r2 = -1
            r0.f27483d = r2
            int r3 = r12.ordinal()
            r4 = 0
            r5 = 0
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x00f1
            if (r3 == r7) goto L_0x00e4
            if (r3 == r6) goto L_0x007a
            r8 = 3
            if (r3 == r8) goto L_0x0044
            r8 = 4
            if (r3 != r8) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            rx3.j r12 = new rx3.j
            r12.<init>()
            throw r12
        L_0x0044:
            r0.f27483d = r4
            int[] r3 = new int[r6]
            com.tencent.mm.plugin.appbrand.widget.e r8 = r11.f254186g
            int r8 = r8.getTop()
            r3[r4] = r8
            com.tencent.mm.plugin.appbrand.widget.e r8 = r11.f254186g
            int r8 = r8.getTop()
            com.tencent.mm.plugin.appbrand.widget.e r9 = r11.f254186g
            int r9 = r9.getHeight()
            int r8 = r8 + r9
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r9 = r11.f254180a
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger r9 = r9.f238298z1
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r10 = r9.mo117782e()
            int r10 = r10.f157935F
            if (r10 != r2) goto L_0x006b
            r2 = 0
            goto L_0x0071
        L_0x006b:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r9.mo117782e()
            int r2 = r2.f157935F
        L_0x0071:
            int r8 = r8 + r2
            r3[r7] = r8
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r3)
            goto L_0x010f
        L_0x007a:
            com.tencent.mm.plugin.appbrand.widget.e r2 = r11.f254186g
            int r2 = r2.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.tencent.mm.plugin.appbrand.widget.e r3 = r11.f254186g
            int r3 = r3.getHeight()
            int r8 = r11.mo122259l()
            boolean r9 = r11.f254188i
            if (r9 == 0) goto L_0x0098
            int r9 = r11.f254193n
            if (r9 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r8 = r9
        L_0x0098:
            int r9 = r11.mo122259l()
            int r8 = java.lang.Math.min(r8, r9)
            int r3 = java.lang.Math.max(r3, r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.intValue()
            int r3 = r3.intValue()
            if (r2 != r3) goto L_0x00b3
            goto L_0x00fb
        L_0x00b3:
            int[] r2 = new int[r6]
            com.tencent.mm.plugin.appbrand.widget.e r3 = r11.f254186g
            int r3 = r3.getHeight()
            r2[r4] = r3
            com.tencent.mm.plugin.appbrand.widget.e r3 = r11.f254186g
            int r3 = r3.getHeight()
            int r8 = r11.mo122259l()
            boolean r9 = r11.f254188i
            if (r9 == 0) goto L_0x00d1
            int r9 = r11.f254193n
            if (r9 != 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r8 = r9
        L_0x00d1:
            int r9 = r11.mo122259l()
            int r8 = java.lang.Math.min(r8, r9)
            int r3 = java.lang.Math.max(r3, r8)
            r2[r7] = r3
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            goto L_0x010f
        L_0x00e4:
            int[] r2 = new int[r6]
            r2[r4] = r4
            int r3 = r11.f254193n
            r2[r7] = r3
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            goto L_0x010f
        L_0x00f1:
            com.tencent.mm.plugin.appbrand.widget.e r2 = r11.f254186g
            int r2 = r2.getHeight()
            int r3 = r11.f254193n
            if (r2 != r3) goto L_0x00fd
        L_0x00fb:
            r2 = r5
            goto L_0x010f
        L_0x00fd:
            int[] r2 = new int[r6]
            com.tencent.mm.plugin.appbrand.widget.e r3 = r11.f254186g
            int r3 = r3.getHeight()
            r2[r4] = r3
            int r3 = r11.f254193n
            r2[r7] = r3
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
        L_0x010f:
            if (r2 != 0) goto L_0x0133
            java.lang.String r12 = "[animateContainer] no animator need to be played"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r12)
            if (r13 == 0) goto L_0x0124
            int[] r12 = new int[r6]
            r12 = {0, 0} // fill-array
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofInt(r12)
            r13.onAnimationStart(r12)
        L_0x0124:
            if (r13 == 0) goto L_0x0132
            int[] r12 = new int[r6]
            r12 = {0, 0} // fill-array
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofInt(r12)
            r13.onAnimationEnd(r12)
        L_0x0132:
            return
        L_0x0133:
            android.animation.Animator r3 = r11.f254205z
            if (r3 == 0) goto L_0x013e
            boolean r3 = r3.isRunning()
            if (r3 != r7) goto L_0x013e
            r4 = 1
        L_0x013e:
            if (r4 == 0) goto L_0x0162
            android.animation.Animator r3 = r11.f254205z
            if (r3 == 0) goto L_0x0147
            r3.cancel()
        L_0x0147:
            r11.f254205z = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[animateContainer] cancel last container animator and perform new animator["
            r3.append(r4)
            r3.append(r12)
            r4 = 93
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
        L_0x0162:
            it0.i$c r1 = new it0.i$c
            r1.<init>(r12, r11)
            r2.addUpdateListener(r1)
            it0.i$d r1 = new it0.i$d
            r1.<init>(r12, r11, r0, r13)
            r2.addListener(r1)
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            r2.setInterpolator(r12)
            r12 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r12)
            r2.start()
            r11.f254205z = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87805i.mo117953h(com.tencent.mm.plugin.appbrand.widget.h, android.animation.AnimatorListenerAdapter):void");
    }

    /* renamed from: i */
    public final void mo122256i() {
        C83780d1 pageView = this.f254180a.mo113212m1().getPageView();
        if (pageView instanceof C83928t1) {
            C83928t1 t1Var = (C83928t1) pageView;
            if (t1Var.mo116158M0() instanceof C83910s1) {
                ((C83910s1) t1Var.mo116158M0()).f244980J.add(this);
            }
        }
    }

    /* renamed from: j */
    public final boolean mo122257j() {
        AppBrandPageContainerWC P1 = this.f254180a.mo113212m1();
        if (P1 == null) {
            return false;
        }
        if ((!this.f254190k || this.f254199t != C85012q.FULL_SCREEN) && this.f254189j) {
            return this.f254192m || P1.getPageCount() == 1;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo122258k(int i) {
        int i2;
        int l = mo122259l();
        if (this.f254188i && (i2 = this.f254193n) != 0) {
            l = i2;
        }
        int e = C61595o.m72297e(i, 0, l);
        if (e != this.f254186g.getLayoutParams().height) {
            this.f254186g.getLayoutParams().height = e;
            this.f254186g.requestLayout();
            this.f254180a.f238298z1.mo117799v((float) (this.f254193n - e), mo122260m() - e);
        }
    }

    /* renamed from: l */
    public final int mo122259l() {
        int m = mo122260m();
        int i = this.f254194o;
        return i != -1 ? Math.min(i, m) : m;
    }

    /* renamed from: m */
    public final int mo122260m() {
        Window window;
        View decorView;
        ViewGroup.LayoutParams layoutParams = this.f254186g.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        ViewParent parent = this.f254186g.getParent();
        View view = parent instanceof View ? (View) parent : null;
        int height = view != null ? view.getHeight() - (view.getPaddingTop() + view.getPaddingBottom()) : 0;
        Activity R = this.f254180a.mo113026R();
        int o = (((R == null || (window = R.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getSystemUiVisibility()) & 4) != 0 ? 0 : C85875k4.m106198o(this.f254187h);
        Log.m105918d("MicroMsg.WxaHalfScreenGestureControllerImp", "getCurrentMaxVerticalDistance statusBarHeight=" + o);
        int i2 = (height - i) - o;
        Log.m105918d("MicroMsg.WxaHalfScreenGestureControllerImp", "getCurrentMaxVerticalDistance=" + i2);
        return Math.max(0, i2);
    }

    /* renamed from: n */
    public final boolean mo122261n(MotionEvent motionEvent) {
        boolean z;
        Rect rect = new Rect();
        C84927e eVar = this.f254180a.f238153r;
        if (eVar == null) {
            return false;
        }
        eVar.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        View findViewById = this.f254180a.f238153r.getRootView().findViewById(C0966R.C0970id.biv);
        C87412m.m108591d(findViewById);
        if (findViewById instanceof C87794b) {
            C87794b bVar = (C87794b) findViewById;
            if (bVar.f254166e == null) {
                z = false;
            } else {
                Rect rect2 = new Rect();
                FrameLayout frameLayout = bVar.f254166e;
                C87412m.m108591d(frameLayout);
                frameLayout.getHitRect(rect2);
                z = rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        r1 = (r1 = (r1 = r0.getContext()).getResources()).getDisplayMetrics();
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122262o(int r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = r7.f254189j
            if (r0 == 0) goto L_0x00ae
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r7.f254180a
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger r0 = r0.f238298z1
            if (r0 == 0) goto L_0x00ae
            int r1 = r7.f254193n
            boolean r2 = r0.f247570c
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0014
            if (r9 == 0) goto L_0x0039
        L_0x0014:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r9 = r0.mo117782e()
            com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener r9 = r9.f157953p
            if (r9 == 0) goto L_0x0039
            com.tencent.mm.plugin.appbrand.config.HeightInfo r2 = new com.tencent.mm.plugin.appbrand.config.HeightInfo
            r2.<init>(r8, r1)
            android.os.ResultReceiver r9 = r9.f239428e
            if (r9 == 0) goto L_0x0039
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "action"
            r5.putInt(r6, r3)
            java.lang.String r6 = "height_info"
            r5.putParcelable(r6, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r9.send(r4, r5)
        L_0x0039:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r9 = r0.f247568a
            com.tencent.mm.plugin.appbrand.i2 r9 = r9.f238150p
            kr0.e r9 = (kr0.C88267e) r9
            if (r9 == 0) goto L_0x00ae
            kt0.a r9 = new kt0.a
            r9.<init>()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r0.f247568a
            com.tencent.mm.plugin.appbrand.i2 r0 = r0.f238150p
            kr0.e r0 = (kr0.C88267e) r0
            r2 = 3
            rx3.l[] r2 = new rx3.C13604l[r2]
            int r1 = js0.C88020k.m109555f(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            rx3.l r5 = new rx3.l
            java.lang.String r6 = "initialHeight"
            r5.<init>(r6, r1)
            r2[r4] = r5
            int r8 = js0.C88020k.m109555f(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            rx3.l r1 = new rx3.l
            java.lang.String r4 = "height"
            r1.<init>(r4, r8)
            r2[r3] = r1
            r8 = 2
            if (r0 == 0) goto L_0x0089
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x0089
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x0089
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            if (r1 == 0) goto L_0x0089
            int r1 = r1.heightPixels
            goto L_0x008f
        L_0x0089:
            int[] r1 = com.tencent.p014mm.plugin.appbrand.utils.C84752i2.m104413a(r0)
            r1 = r1[r3]
        L_0x008f:
            int r1 = js0.C88020k.m109555f(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            rx3.l r3 = new rx3.l
            java.lang.String r4 = "screenHeight"
            r3.<init>(r4, r1)
            r2[r8] = r3
            java.util.Map r8 = sx3.C90364q0.m113147f(r2)
            r9.mo115165o(r8)
            r9.mo115194p(r0)
            r9.mo115158h()
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87805i.mo122262o(int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo122263p(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r10, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r9.f254180a
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger r0 = r0.f238298z1
            r1 = 0
            if (r0 == 0) goto L_0x005f
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar r2 = r0.mo117779b()
            r3 = 1
            if (r2 == 0) goto L_0x0051
            float r4 = r10.getRawX()
            float r10 = r10.getRawY()
            r5 = 2
            int[] r5 = new int[r5]
            android.view.View r2 = r2.getCloseButton()
            if (r2 != 0) goto L_0x0025
            goto L_0x004c
        L_0x0025:
            r2.getLocationOnScreen(r5)
            r6 = r5[r1]
            r5 = r5[r3]
            int r7 = r2.getWidth()
            int r2 = r2.getHeight()
            float r8 = (float) r6
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x004c
            int r6 = r6 + r7
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x004c
            float r4 = (float) r5
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x004c
            int r5 = r5 + r2
            float r2 = (float) r5
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x004c
            r10 = 1
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            if (r10 != r3) goto L_0x0051
            r10 = 1
            goto L_0x0052
        L_0x0051:
            r10 = 0
        L_0x0052:
            if (r10 == 0) goto L_0x0056
        L_0x0054:
            r1 = 1
            goto L_0x005f
        L_0x0056:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r10 = r0.mo117782e()
            boolean r10 = r10.f157963z
            if (r10 != 0) goto L_0x005f
            goto L_0x0054
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87805i.mo122263p(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public final boolean mo122264q() {
        boolean z = true;
        if (this.f254188i) {
            return this.f254186g.getHeight() == this.f254193n;
        }
        if (this.f254186g.getHeight() != mo122259l()) {
            z = false;
        }
        Log.m105918d("MicroMsg.WxaHalfScreenGestureControllerImp", "fillParent=" + z + "  currentH=" + this.f254186g.getHeight());
        return z;
    }

    /* renamed from: r */
    public final void mo122265r() {
        mo122267t(C33404d.DRAG_STATE_IDLE);
        MotionEvent motionEvent = this.f254181b;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f254181b = null;
        VelocityTracker velocityTracker = this.f254195p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f254195p = null;
        MotionEvent motionEvent2 = this.f254182c;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f254182c = null;
        this.f254197r = false;
        this.f254198s = false;
        this.f254201v = 0;
        this.f254185f = 0;
        this.f254202w = false;
        C83780d1 pageView = this.f254180a.mo113212m1().getPageView();
        if (pageView instanceof C83928t1) {
            C83928t1 t1Var = (C83928t1) pageView;
            if (t1Var.mo116158M0() instanceof C83910s1) {
                ((C83910s1) t1Var.mo116158M0()).f244980J.remove(this);
            }
        }
    }

    /* renamed from: s */
    public final void mo122266s(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.f254181b;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f254181b = MotionEvent.obtain(motionEvent);
    }

    /* renamed from: t */
    public final void mo122267t(C33404d dVar) {
        if (this.f254184e != dVar) {
            this.f254184e = dVar;
            HalfScreenManger halfScreenManger = this.f254180a.f238298z1;
            if (halfScreenManger != null) {
                C87412m.m108594g(dVar, "dragState");
                if (dVar == C33404d.DRAG_STATE_IDLE) {
                    C85007k kVar = halfScreenManger.f247571d;
                    if ((kVar != null ? kVar.getCurrentStatus() : null) == C85012q.FULL_SCREEN) {
                        halfScreenManger.mo117798u();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
        if (r11 < 0) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (r14 < 0) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0111  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122268u(int r14, int r15) {
        /*
            r13 = this;
            com.tencent.mm.plugin.appbrand.widget.q r15 = com.tencent.p014mm.plugin.appbrand.widget.C85012q.NOT_FULL_SCREEN
            com.tencent.mm.plugin.appbrand.widget.h r0 = com.tencent.p014mm.plugin.appbrand.widget.C84933h.DISMISS
            com.tencent.mm.plugin.appbrand.widget.h r1 = com.tencent.p014mm.plugin.appbrand.widget.C84933h.INITIAL_HEIGHT
            com.tencent.mm.plugin.appbrand.widget.h r2 = com.tencent.p014mm.plugin.appbrand.widget.C84933h.FULL_SCREEN
            boolean r3 = r13.f254204y
            java.lang.String r4 = "MicroMsg.WxaHalfScreenGestureControllerImp"
            if (r3 == 0) goto L_0x0014
            java.lang.String r14 = "[tryPerformAnimationWhenScrollRelease] can not perform animation during animating"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r14)
            return
        L_0x0014:
            android.view.VelocityTracker r3 = r13.f254195p
            if (r3 == 0) goto L_0x001f
            r5 = 1000(0x3e8, float:1.401E-42)
            float r6 = r13.f254196q
            r3.computeCurrentVelocity(r5, r6)
        L_0x001f:
            android.view.VelocityTracker r3 = r13.f254195p
            r5 = 0
            if (r3 == 0) goto L_0x0029
            float r3 = r3.getYVelocity()
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            float r6 = java.lang.Math.abs(r3)
            r7 = 500(0x1f4, float:7.0E-43)
            float r7 = (float) r7
            android.content.Context r8 = r13.f254187h
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            r9 = 1
            float r7 = android.util.TypedValue.applyDimension(r9, r7, r8)
            r8 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x0047
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            r7 = 72
            float r7 = (float) r7
            android.content.Context r10 = r13.f254187h
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r7 = android.util.TypedValue.applyDimension(r9, r7, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "[tryPerformAnimationWhenScrollRelease] yVelocity="
            r10.append(r11)
            r10.append(r3)
            java.lang.String r11 = "  fastSliding= "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r11 = " thresholdPx="
            r10.append(r11)
            r10.append(r7)
            java.lang.String r11 = " slideDistanceVertical="
            r10.append(r11)
            r10.append(r14)
            r11 = 125(0x7d, float:1.75E-43)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            r10 = 2
            if (r6 == 0) goto L_0x009e
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0093
            r12 = 1
            goto L_0x0094
        L_0x0093:
            r12 = 0
        L_0x0094:
            if (r12 != 0) goto L_0x009e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            if (r11 >= 0) goto L_0x00a5
            goto L_0x00a4
        L_0x009e:
            if (r14 <= 0) goto L_0x00a2
        L_0x00a0:
            r8 = 2
            goto L_0x00a5
        L_0x00a2:
            if (r14 >= 0) goto L_0x00a5
        L_0x00a4:
            r8 = 1
        L_0x00a5:
            java.lang.String r3 = "[tryPerformAnimationWhenScrollRelease] animate reset to initial height}"
            r5 = 93
            java.lang.String r11 = "[tryPerformAnimationWhenScrollRelease] animate expand}"
            r12 = 0
            if (r8 != r10) goto L_0x0111
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[tryPerformAnimationWhenScrollRelease] slide_orientation_down  viewStatusAtGestureStart["
            r8.append(r9)
            com.tencent.mm.plugin.appbrand.widget.q r9 = r13.f254200u
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            int r14 = java.lang.Math.abs(r14)
            float r14 = (float) r14
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 > 0) goto L_0x00e7
            if (r6 == 0) goto L_0x00d3
            goto L_0x00e7
        L_0x00d3:
            com.tencent.mm.plugin.appbrand.widget.q r14 = r13.f254200u
            if (r14 != r15) goto L_0x00df
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r13.mo117953h(r1, r12)
            goto L_0x0153
        L_0x00df:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            r13.mo117953h(r2, r12)
            goto L_0x0153
        L_0x00e7:
            boolean r14 = r13.f254191l
            if (r14 == 0) goto L_0x0108
            com.tencent.mm.plugin.appbrand.widget.q r14 = r13.f254200u
            com.tencent.mm.plugin.appbrand.widget.q r15 = com.tencent.p014mm.plugin.appbrand.widget.C85012q.FULL_SCREEN
            if (r14 != r15) goto L_0x0108
            com.tencent.mm.plugin.appbrand.widget.e r14 = r13.f254186g
            int r14 = r14.getHeight()
            float r14 = (float) r14
            int r15 = r13.f254193n
            float r15 = (float) r15
            float r15 = r15 - r7
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x0104
            r13.mo117953h(r0, r12)
            goto L_0x0153
        L_0x0104:
            r13.mo117953h(r1, r12)
            goto L_0x0153
        L_0x0108:
            java.lang.String r14 = "[tryPerformAnimationWhenScrollRelease] animate dismiss}"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            r13.mo117953h(r0, r12)
            goto L_0x0153
        L_0x0111:
            if (r8 != r9) goto L_0x0153
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "[tryPerformAnimationWhenScrollRelease] slide_orientation_up viewStatusAtGestureStart["
            r0.append(r8)
            com.tencent.mm.plugin.appbrand.widget.q r8 = r13.f254200u
            r0.append(r8)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            int r14 = java.lang.Math.abs(r14)
            float r14 = (float) r14
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 > 0) goto L_0x0137
            if (r6 == 0) goto L_0x0142
        L_0x0137:
            boolean r14 = r13.f254188i
            if (r14 != 0) goto L_0x0142
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            r13.mo117953h(r2, r12)
            goto L_0x0153
        L_0x0142:
            com.tencent.mm.plugin.appbrand.widget.q r14 = r13.f254200u
            if (r14 != r15) goto L_0x014d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r13.mo117953h(r1, r12)
            goto L_0x0153
        L_0x014d:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            r13.mo117953h(r2, r12)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87805i.mo122268u(int, int):void");
    }
}
