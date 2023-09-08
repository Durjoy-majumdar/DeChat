package com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import jp3.C9486a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView */
public class HybridOpenMaterialView extends RelativeLayout implements C9486a {

    /* renamed from: F */
    public static final int f311228F = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f3761db);

    /* renamed from: G */
    public static final int f311229G = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f3743cv);

    /* renamed from: A */
    public float f311230A;

    /* renamed from: B */
    public boolean f311231B;

    /* renamed from: C */
    public boolean f311232C;

    /* renamed from: D */
    public boolean f311233D;

    /* renamed from: E */
    public boolean f311234E;

    /* renamed from: d */
    public LinearLayout f311235d;

    /* renamed from: e */
    public LinearLayout f311236e;

    /* renamed from: f */
    public FrameLayout f311237f;

    /* renamed from: g */
    public MMWebView f311238g;

    /* renamed from: h */
    public final VelocityTracker f311239h;

    /* renamed from: i */
    public final boolean f311240i;

    /* renamed from: j */
    public C104798j f311241j;

    /* renamed from: n */
    public boolean f311242n;

    /* renamed from: o */
    public int f311243o;

    /* renamed from: p */
    public int f311244p;

    /* renamed from: q */
    public int f311245q;

    /* renamed from: r */
    public float f311246r;

    /* renamed from: s */
    public float f311247s;

    /* renamed from: t */
    public float f311248t;

    /* renamed from: u */
    public float f311249u;

    /* renamed from: v */
    public float f311250v;

    /* renamed from: w */
    public final LinkedList<Integer> f311251w;

    /* renamed from: x */
    public int f311252x;

    /* renamed from: y */
    public float f311253y;

    /* renamed from: z */
    public boolean f311254z;

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$c */
    public class C68626c implements View.OnClickListener {
        public C68626c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/openmaterial/ui/hybrid/HybridOpenMaterialView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "init, touch outside");
            HybridOpenMaterialView hybridOpenMaterialView = HybridOpenMaterialView.this;
            if (hybridOpenMaterialView.f311242n) {
                hybridOpenMaterialView.hide();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/openmaterial/ui/hybrid/HybridOpenMaterialView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$d */
    public class C68627d implements View.OnClickListener {
        public C68627d(HybridOpenMaterialView hybridOpenMaterialView) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/openmaterial/ui/hybrid/HybridOpenMaterialView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/openmaterial/ui/hybrid/HybridOpenMaterialView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$e */
    public class C68628e implements ViewTreeObserver.OnGlobalLayoutListener {
        public C68628e() {
        }

        public void onGlobalLayout() {
            HybridOpenMaterialView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            HybridOpenMaterialView.m140440a(HybridOpenMaterialView.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$a */
    public class C104791a implements ValueAnimator.AnimatorUpdateListener {
        public C104791a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            HybridOpenMaterialView.this.f311235d.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            HybridOpenMaterialView.this.mo148651c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$b */
    public class C104792b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f311256d;

        public C104792b(boolean z) {
            this.f311256d = z;
        }

        public void onAnimationCancel(Animator animator) {
            HybridOpenMaterialView.this.f311234E = false;
        }

        public void onAnimationEnd(Animator animator) {
            HybridOpenMaterialView hybridOpenMaterialView = HybridOpenMaterialView.this;
            hybridOpenMaterialView.f311234E = false;
            hybridOpenMaterialView.f311232C = this.f311256d;
            hybridOpenMaterialView.f311230A = hybridOpenMaterialView.f311235d.getTranslationY();
            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "animateSwitch, curWholeContentAreaTranslationY: " + HybridOpenMaterialView.this.f311230A);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            HybridOpenMaterialView.this.f311234E = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$f */
    public class C104793f implements MMWebView.C45106e {
        public C104793f() {
        }

        /* renamed from: y2 */
        public void mo24942y2(int i, int i2, int i3, int i4) {
            boolean z = false;
            Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "onWebViewScrollChanged, l: %d, t: %d, oldl: %d, oldt: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            HybridOpenMaterialView hybridOpenMaterialView = HybridOpenMaterialView.this;
            if (i2 == 0) {
                z = true;
            }
            hybridOpenMaterialView.f311231B = z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$g */
    public class C104794g implements Animator.AnimatorListener {

        /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$g$a */
        public class C104795a implements Runnable {
            public C104795a() {
            }

            public void run() {
                C104798j jVar = HybridOpenMaterialView.this.f311241j;
                if (jVar != null) {
                    jVar.mo148671a();
                }
            }
        }

        public C104794g() {
        }

        public void onAnimationCancel(Animator animator) {
            HybridOpenMaterialView.this.f311234E = false;
        }

        public void onAnimationEnd(Animator animator) {
            HybridOpenMaterialView hybridOpenMaterialView = HybridOpenMaterialView.this;
            hybridOpenMaterialView.f311234E = false;
            hybridOpenMaterialView.f311232C = false;
            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "hide, onAnimationEnd");
            ((C119157j) C119157j.f356862d).mo183895z(new C104795a());
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            HybridOpenMaterialView.this.f311234E = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$h */
    public class C104796h implements ValueAnimator.AnimatorUpdateListener {
        public C104796h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            HybridOpenMaterialView hybridOpenMaterialView = HybridOpenMaterialView.this;
            hybridOpenMaterialView.f311230A = hybridOpenMaterialView.f311235d.getTranslationY();
            Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "hide, curWholeContentAreaTranslationY: %f", Float.valueOf(HybridOpenMaterialView.this.f311230A));
            HybridOpenMaterialView.this.mo148651c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$i */
    public class C104797i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MotionEvent f311262d;

        public C104797i(MotionEvent motionEvent) {
            this.f311262d = motionEvent;
        }

        public void run() {
            MotionEvent obtain = MotionEvent.obtain(this.f311262d);
            obtain.setAction(1);
            HybridOpenMaterialView.this.dispatchTouchEvent(obtain);
            MotionEvent obtain2 = MotionEvent.obtain(this.f311262d);
            obtain2.setAction(0);
            HybridOpenMaterialView.this.dispatchTouchEvent(obtain2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$j */
    public interface C104798j {
        /* renamed from: a */
        void mo148671a();

        /* renamed from: b */
        void mo148672b(int i);

        /* renamed from: c */
        void mo148673c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$k */
    public static abstract class C104799k implements C104798j {
        /* renamed from: c */
        public void mo148673c() {
        }
    }

    public HybridOpenMaterialView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m140440a(HybridOpenMaterialView hybridOpenMaterialView) {
        Context context = hybridOpenMaterialView.getContext();
        Point b = C75044y4.m89990b(context);
        Size size = new Size(b.x, b.y);
        int c = C75044y4.m89991c(context);
        Log.m105924i("MicroMsg.AppBrand.HybridOpenMaterialView", "ScreenInfo#<init>, navigationBarHeight: " + c);
        int height = size.getHeight();
        Rect rect = new Rect();
        hybridOpenMaterialView.getWindowVisibleDisplayFrame(rect);
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "doSomeCalculateAfterLayout, windowVisibleRect: " + rect);
        int width = rect.width();
        int height2 = rect.height();
        if (!hybridOpenMaterialView.f311240i ? width > height2 : width <= height2) {
            int i = width;
            width = height2;
            height2 = i;
        }
        Size size2 = new Size(width, height2);
        Log.m105924i("MicroMsg.AppBrand.HybridOpenMaterialView", "calculateWindowSizeWorkaround, windowSize: " + size2);
        int min = Math.min(size2.getHeight(), height);
        hybridOpenMaterialView.f311244p = Math.max(0, hybridOpenMaterialView.getFullScreenTopRemainPx() - (height - (c + min)));
        float f = (float) min;
        hybridOpenMaterialView.f311230A = f;
        hybridOpenMaterialView.f311235d.setTranslationY(f);
        hybridOpenMaterialView.mo148651c();
        Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "doSomeCalculateAfterLayout, screenHeight: %d, windowHeight: %d, fullScreenWholeContentAreaTranslationY: %d, curWholeContentAreaTranslationY: %f", Integer.valueOf(height), Integer.valueOf(min), Integer.valueOf(hybridOpenMaterialView.f311244p), Float.valueOf(hybridOpenMaterialView.f311230A));
        hybridOpenMaterialView.f311243o = hybridOpenMaterialView.f311235d.getMeasuredHeight();
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "doSomeCalculateAfterLayout, wholeContentAreaHeight: " + hybridOpenMaterialView.f311243o);
        int measuredHeight = hybridOpenMaterialView.f311236e.getMeasuredHeight();
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "doSomeCalculateAfterLayout, titleAreaHeight: " + measuredHeight);
        if (hybridOpenMaterialView.f311238g != null) {
            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "doSomeCalculateAfterLayout, compute");
            int i2 = hybridOpenMaterialView.f311243o - measuredHeight;
            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "doSomeCalculateAfterLayout, compute, contentAreaHeight: " + i2);
            if (hybridOpenMaterialView.f311238g.getMeasuredHeight() != i2) {
                Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "doSomeCalculateAfterLayout, compute, set contentArea height");
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hybridOpenMaterialView.f311238g.getLayoutParams();
                layoutParams.height = i2;
                hybridOpenMaterialView.f311238g.setLayoutParams(layoutParams);
            }
            int i3 = min - (height / 2);
            hybridOpenMaterialView.f311245q = i3;
            hybridOpenMaterialView.f311245q = Math.max(0, i3);
            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "doSomeCalculateAfterLayout, halfScreenWholeContentAreaTranslationY: " + hybridOpenMaterialView.f311245q);
        }
    }

    private int getFullScreenTopRemainPx() {
        return this.f311240i ? f311229G : f311228F;
    }

    /* renamed from: b */
    public final void mo148650b(float f, float f2, long j, boolean z) {
        if (f2 == f) {
            this.f311232C = z;
            this.f311230A = f2;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C104791a());
        ofFloat.addListener(new C104792b(z));
        ofFloat.start();
    }

    /* renamed from: c */
    public final void mo148651c() {
        MMWebView mMWebView = this.f311238g;
        if (mMWebView == null) {
            Log.m105928w("MicroMsg.AppBrand.HybridOpenMaterialView", "dispatchContentVisibleHeightChange, contentArea is null");
            return;
        }
        int max = Math.max(0, (int) (((float) mMWebView.getHeight()) - this.f311235d.getTranslationY()));
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "dispatchContentVisibleHeightChange, visibleHeight: " + max);
        C104798j jVar = this.f311241j;
        if (jVar != null) {
            jVar.mo148672b(max);
        }
    }

    public void dead() {
        Log.m105924i("MicroMsg.AppBrand.HybridOpenMaterialView", "dead");
        MMWebView mMWebView = this.f311238g;
        if (mMWebView != null) {
            mMWebView.destroy();
        }
    }

    public void hide() {
        Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "hide, from: %f, to: %d", Float.valueOf(this.f311235d.getTranslationY()), Integer.valueOf(this.f311243o));
        this.f311233D = false;
        this.f311235d.animate().translationY((float) this.f311243o).setDuration(this.f311232C ? 300 : 200).setInterpolator(new AccelerateInterpolator()).setUpdateListener(new C104796h()).setListener(new C104794g()).start();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, ev: " + motionEvent.getAction());
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, super intercept");
            return true;
        }
        this.f311239h.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f311251w.clear();
                this.f311252x = -1;
                this.f311253y = 0.0f;
                this.f311254z = false;
            } else if (actionMasked == 2) {
                if (this.f311251w.isEmpty()) {
                    Log.m105928w("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, move, empty activePointerIds");
                    i = 0;
                } else {
                    i = this.f311251w.getFirst().intValue();
                }
                int findPointerIndex = motionEvent.findPointerIndex(i);
                if (findPointerIndex < 0) {
                    Log.m105928w("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, move, invalid pointerIndex");
                    findPointerIndex = 0;
                }
                Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, move, activePointerId: %d, pointerIndex: %d", Integer.valueOf(i), Integer.valueOf(findPointerIndex));
                if (motionEvent.getY(findPointerIndex) < this.f311235d.getTranslationY()) {
                    Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, move, outside");
                } else {
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f311246r);
                    float y = motionEvent.getY(findPointerIndex) - this.f311247s;
                    float abs2 = Math.abs(y);
                    this.f311239h.computeCurrentVelocity(1000);
                    float abs3 = Math.abs(this.f311239h.getXVelocity());
                    float abs4 = Math.abs(this.f311239h.getYVelocity());
                    Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, move, disXFromDown: %f, rawDisYFromDown: %f, xVelocity: %f, yVelocity: %f", Float.valueOf(abs), Float.valueOf(y), Float.valueOf(abs3), Float.valueOf(abs4));
                    if (abs2 >= 5.0f && abs2 > abs && abs4 > 0.0f && abs4 > abs3) {
                        Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, move, vertical, isShown: %b, isFullScreenShown: %b, isWebViewScroll2Top: %b", Boolean.valueOf(this.f311233D), Boolean.valueOf(this.f311232C), Boolean.valueOf(this.f311231B));
                        if (this.f311233D) {
                            if (this.f311232C) {
                                if (0.0f <= y) {
                                    z = this.f311231B;
                                }
                            } else if (0.0f > y) {
                                onInterceptTouchEvent = true;
                            } else {
                                z = this.f311231B;
                            }
                            onInterceptTouchEvent = z;
                        }
                    }
                }
            }
            onInterceptTouchEvent = false;
        } else {
            this.f311251w.addFirst(0);
            this.f311246r = motionEvent.getX();
            this.f311247s = motionEvent.getY();
            Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, down, x: %f, y: %f, curTranslationY: %f", Float.valueOf(this.f311246r), Float.valueOf(this.f311247s), Float.valueOf(this.f311230A));
        }
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, intercept: " + onInterceptTouchEvent);
        return onInterceptTouchEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, event: " + motionEvent.getAction());
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "handleTouchUp, isFullScreenShown: " + this.f311232C);
                if (this.f311234E) {
                    Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "handleTouchUp, isAnimating");
                } else if (this.f311232C) {
                    float f = this.f311250v;
                    if (0.0f >= f || ((float) this.f311243o) * 0.15f > Math.abs(f)) {
                        z = false;
                    }
                    if (!z || !this.f311242n) {
                        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "switch2FullScreen");
                        mo148650b(this.f311235d.getTranslationY(), (float) this.f311244p, 200, true);
                    } else {
                        hide();
                    }
                } else {
                    float f2 = this.f311250v;
                    if (!(0.0f < f2 && ((float) this.f311243o) * 0.15f <= Math.abs(f2)) || !this.f311242n) {
                        float f3 = this.f311250v;
                        if (0.0f <= f3 || ((float) this.f311243o) * 0.05f > Math.abs(f3)) {
                            z = false;
                        }
                        if (z) {
                            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "switch2FullScreen");
                            mo148650b(this.f311235d.getTranslationY(), (float) this.f311244p, 200, true);
                        } else {
                            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "switch2HalfScreen");
                            mo148650b(this.f311235d.getTranslationY(), (float) this.f311245q, 200, false);
                        }
                    } else {
                        hide();
                    }
                }
                this.f311248t = 0.0f;
                this.f311249u = 0.0f;
                this.f311251w.clear();
                this.f311252x = -1;
                this.f311253y = 0.0f;
                this.f311254z = false;
            } else if (actionMasked == 2) {
                if (this.f311251w.isEmpty()) {
                    Log.m105928w("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, active pointerId not exist");
                    i = 0;
                } else {
                    i = this.f311251w.getFirst().intValue();
                }
                int findPointerIndex = motionEvent.findPointerIndex(i);
                if (findPointerIndex < 0) {
                    Log.m105928w("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, pointerIndex is illegal");
                    findPointerIndex = 0;
                }
                Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, activePointerId: %d, pointerIndex: %d", Integer.valueOf(i), Integer.valueOf(findPointerIndex));
                if (0.0f == this.f311248t && 0.0f == this.f311249u) {
                    this.f311251w.addFirst(0);
                    this.f311248t = motionEvent.getX(findPointerIndex);
                    this.f311249u = motionEvent.getY(findPointerIndex);
                } else {
                    int i2 = this.f311252x;
                    if (!(-1 == i2 || i2 == i)) {
                        this.f311253y = this.f311250v;
                        Log.m105924i("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, active pointerId changed, disMoveFromDownExceptCurPointerId: " + this.f311253y);
                    }
                    float x = motionEvent.getX(findPointerIndex) - this.f311248t;
                    float y = (motionEvent.getY(findPointerIndex) - this.f311249u) + this.f311253y;
                    Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, rawDisXFromDown: %f, rawDisYFromDown: %f", Float.valueOf(x), Float.valueOf(y));
                    if (Math.abs(y) > Math.abs(x)) {
                        if (this.f311254z && 0.0f > y) {
                            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, dispatchTouchEvent2Child");
                            ((C119157j) C119157j.f356862d).mo183895z(new C104797i(motionEvent));
                        } else if (this.f311242n || 0.0f >= y) {
                            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "handleScroll");
                            if (this.f311234E) {
                                Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "handleScroll, isAnimating");
                            } else {
                                float f4 = 0.68f * y;
                                this.f311250v = f4;
                                Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "handleScroll, disMoveFromDown: %f, curWholeContentAreaTranslationY: %f", Float.valueOf(f4), Float.valueOf(this.f311230A));
                                float min = Math.min((float) this.f311243o, Math.max((float) this.f311244p, this.f311230A + this.f311250v));
                                Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "handleScroll, newTranslationY: " + min);
                                this.f311235d.setTranslationY(min);
                                mo148651c();
                            }
                            if (((float) this.f311244p) >= this.f311235d.getTranslationY()) {
                                this.f311254z = true;
                                Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, scroll to top, mayDispatchTouchEvent2Child");
                            }
                        }
                    }
                    this.f311250v = y;
                    this.f311252x = i;
                    Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, lastActivePointerId: %d", Integer.valueOf(i));
                }
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                this.f311251w.addFirst(Integer.valueOf(pointerId));
                this.f311248t = motionEvent.getX(actionIndex);
                this.f311249u = motionEvent.getY(actionIndex);
                Log.m105925i("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, pointer down, pointerId: %d, x: %f, y: %f", Integer.valueOf(pointerId), Float.valueOf(this.f311248t), Float.valueOf(this.f311249u));
            } else if (actionMasked == 6) {
                int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f311251w.remove(Integer.valueOf(pointerId2));
                Log.m105925i("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, pointer up, pointerId: %d", Integer.valueOf(pointerId2));
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f311251w.addFirst(0);
        this.f311248t = motionEvent.getX();
        this.f311249u = motionEvent.getY();
        Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, down, x: %f, y: %f", Float.valueOf(this.f311248t), Float.valueOf(this.f311249u));
        return true;
    }

    public void setAllowScroll2Hide(boolean z) {
        this.f311242n = z;
    }

    public void setContentView(MMWebView mMWebView) {
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "setContentView");
        this.f311237f.addView(mMWebView, -1, -1);
        mMWebView.f122362o.add(new C104793f());
        this.f311238g = mMWebView;
    }

    public void setListener(C104798j jVar) {
        this.f311241j = jVar;
    }

    public void setTitleView(View view) {
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "setTitleView");
        this.f311236e.addView(view, -1, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x007f, code lost:
        if (2 == getContext().getResources().getConfiguration().orientation) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HybridOpenMaterialView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r3.f311239h = r5
            r5 = 0
            r3.f311241j = r5
            r5 = 1
            r3.f311242n = r5
            r6 = 0
            r3.f311243o = r6
            r3.f311244p = r6
            r3.f311245q = r6
            r0 = 0
            r3.f311246r = r0
            r3.f311247s = r0
            r3.f311248t = r0
            r3.f311249u = r0
            r3.f311250v = r0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r3.f311251w = r1
            r1 = -1
            r3.f311252x = r1
            r3.f311253y = r0
            r3.f311254z = r6
            r3.f311230A = r0
            r3.f311231B = r5
            r3.f311232C = r6
            r3.f311233D = r6
            r3.f311234E = r6
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131496926(0x7f0c0fde, float:1.861743E38)
            r4.inflate(r0, r3, r5)
            r4 = 2131310548(0x7f0937d4, float:1.8239411E38)
            android.view.View r4 = r3.findViewById(r4)
            r0 = 2131310546(0x7f0937d2, float:1.8239407E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.f311235d = r0
            r0 = 2131310549(0x7f0937d5, float:1.8239413E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.f311236e = r0
            r0 = 2131310547(0x7f0937d3, float:1.823941E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.f311237f = r0
            r3.setFitsSystemWindows(r5)
            java.lang.String r0 = "MicroMsg.AppBrand.HybridOpenMaterialView"
            r1 = 2
            android.content.Context r2 = r3.getContext()     // Catch:{ Exception -> 0x0082 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x0082 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ Exception -> 0x0082 }
            int r2 = r2.orientation     // Catch:{ Exception -> 0x0082 }
            if (r1 != r2) goto L_0x0097
            goto L_0x0098
        L_0x0082:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isLandscape fail since "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
        L_0x0097:
            r5 = 0
        L_0x0098:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "isLandscape: "
            r6.append(r1)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r6)
            r3.f311240i = r5
            com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$c r5 = new com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$c
            r5.<init>()
            r4.setOnClickListener(r5)
            android.widget.LinearLayout r4 = r3.f311236e
            com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$d r5 = new com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$d
            r5.<init>(r3)
            r4.setOnClickListener(r5)
            android.view.ViewTreeObserver r4 = r3.getViewTreeObserver()
            com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$e r5 = new com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView$e
            r5.<init>()
            r4.addOnGlobalLayoutListener(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.HybridOpenMaterialView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
