package com.tencent.p014mm.plugin.finder.webview.p800ad;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.animation.DecelerateInterpolator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import zs1.C53812i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010D\u001a\u00020C\u0012\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HB#\b\u0016\u0012\u0006\u0010D\u001a\u00020C\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bG\u0010KR\"\u0010\t\u001a\u00020\u00028\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00028\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0019\u001a\u00020\u00028\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u001d\u001a\u00020\u00028\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\"\u0010!\u001a\u00020\u00028\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\"\u00105\u001a\u0002028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010;\u001a\u0002022\u0006\u00109\u001a\u0002028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R*\u0010>\u001a\u0002022\u0006\u00109\u001a\u0002028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b>\u00106\"\u0004\b?\u00108R\"\u0010A\u001a\u0002028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u00104\u001a\u0004\bA\u00106\"\u0004\bB\u00108¨\u0006L"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/webview/ad/ScrollFrameLayout;", "Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;", "", "g", "F", "getMPointerTranslateY", "()F", "setMPointerTranslateY", "(F)V", "mPointerTranslateY", "Landroid/view/VelocityTracker;", "h", "Landroid/view/VelocityTracker;", "getMVelocityTracker", "()Landroid/view/VelocityTracker;", "setMVelocityTracker", "(Landroid/view/VelocityTracker;)V", "mVelocityTracker", "i", "getMInterceptX", "setMInterceptX", "mInterceptX", "j", "getMInterceptY", "setMInterceptY", "mInterceptY", "n", "getMDownX", "setMDownX", "mDownX", "o", "getMDownY", "setMDownY", "mDownY", "Lzs1/i;", "p", "Lzs1/i;", "getDialog", "()Lzs1/i;", "setDialog", "(Lzs1/i;)V", "dialog", "q", "getScrollDownLimit", "setScrollDownLimit", "scrollDownLimit", "r", "getScrollUpLimit", "setScrollUpLimit", "scrollUpLimit", "", "s", "Z", "isAnimating", "()Z", "setAnimating", "(Z)V", "value", "t", "isAllowVerticalIntercept", "setAllowVerticalIntercept", "u", "isAllowHorizontalIntercept", "setAllowHorizontalIntercept", "v", "isForceHandleEvent", "setForceHandleEvent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout */
public abstract class ScrollFrameLayout extends RoundedCornerFrameLayout {

    /* renamed from: w */
    public static float f112048w;

    /* renamed from: x */
    public static float f112049x;

    /* renamed from: g */
    public float f112050g;

    /* renamed from: h */
    public VelocityTracker f112051h;

    /* renamed from: i */
    public float f112052i;

    /* renamed from: j */
    public float f112053j;

    /* renamed from: n */
    public float f112054n;

    /* renamed from: o */
    public float f112055o;

    /* renamed from: p */
    public C53812i f112056p;

    /* renamed from: q */
    public float f112057q;

    /* renamed from: r */
    public float f112058r;

    /* renamed from: s */
    public boolean f112059s;

    /* renamed from: t */
    public boolean f112060t;

    /* renamed from: u */
    public boolean f112061u;

    /* renamed from: v */
    public boolean f112062v;

    /* renamed from: com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout$a */
    public static final class C41624a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ ScrollFrameLayout f112063d;

        /* renamed from: e */
        public final /* synthetic */ Runnable f112064e;

        public C41624a(ScrollFrameLayout scrollFrameLayout, Runnable runnable) {
            this.f112063d = scrollFrameLayout;
            this.f112064e = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            Log.m105924i("Finder.WebViewFrameLayout", "onAnimationCancel " + this.f112063d.getTranslationY());
            this.f112063d.setAnimating(false);
            this.f112063d.setMPointerTranslateY(0.0f);
            this.f112063d.getClass();
            Runnable runnable = this.f112064e;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i("Finder.WebViewFrameLayout", "onAnimationEnd : " + this.f112063d.getTranslationY());
            this.f112063d.setAnimating(false);
            this.f112063d.setMPointerTranslateY(0.0f);
            this.f112063d.mo64801e();
            Runnable runnable = this.f112064e;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            Log.m105924i("Finder.WebViewFrameLayout", "onAnimationStart " + this.f112063d.getTranslationY());
            this.f112063d.setAnimating(true);
            this.f112063d.setMPointerTranslateY(0.0f);
            this.f112063d.mo64802f();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout$b */
    public static final class C41625b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ ScrollFrameLayout f112065d;

        public C41625b(ScrollFrameLayout scrollFrameLayout) {
            this.f112065d = scrollFrameLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollFrameLayout scrollFrameLayout = this.f112065d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            scrollFrameLayout.mo64803g(((Float) animatedValue).floatValue());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: d */
    public static /* synthetic */ void m44967d(ScrollFrameLayout scrollFrameLayout, float f, boolean z, int i, Runnable runnable, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                f = 0.0f;
            }
            if ((i2 & 2) != 0) {
                z = true;
            }
            if ((i2 & 4) != 0) {
                i = 200;
            }
            if ((i2 & 8) != 0) {
                runnable = null;
            }
            scrollFrameLayout.mo64819c(f, z, i, runnable);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animatePosition");
    }

    /* renamed from: c */
    public void mo64819c(float f, boolean z, int i, Runnable runnable) {
        if (!(this.f112050g == 0.0f) || !z) {
            Log.m105924i("Finder.WebViewFrameLayout", "animatePosition  toTranslationY:" + f + " isIntercept:" + z);
            animate().cancel();
            animate().translationY(f).setDuration((long) i).setInterpolator(new DecelerateInterpolator()).setListener(new C41624a(this, runnable)).setUpdateListener(new C41625b(this)).start();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public void mo64801e() {
    }

    /* renamed from: f */
    public void mo64802f() {
    }

    /* renamed from: g */
    public void mo64803g(float f) {
    }

    public final C53812i getDialog() {
        return this.f112056p;
    }

    public final float getMDownX() {
        return this.f112054n;
    }

    public final float getMDownY() {
        return this.f112055o;
    }

    public final float getMInterceptX() {
        return this.f112052i;
    }

    public final float getMInterceptY() {
        return this.f112053j;
    }

    public final float getMPointerTranslateY() {
        return this.f112050g;
    }

    public final VelocityTracker getMVelocityTracker() {
        return this.f112051h;
    }

    public final float getScrollDownLimit() {
        return this.f112057q;
    }

    public final float getScrollUpLimit() {
        return this.f112058r;
    }

    /* renamed from: h */
    public void mo64808h() {
        this.f112052i = 0.0f;
        this.f112053j = 0.0f;
        this.f112054n = 0.0f;
        this.f112055o = 0.0f;
        setAllowVerticalIntercept(false);
        setAllowHorizontalIntercept(false);
        this.f112050g = 0.0f;
    }

    /* renamed from: i */
    public boolean mo64793i(float f, float f2, int i, int i2) {
        return f2 >= 10.0f && Math.abs(f2) >= 10.0f && Math.abs(i2) > Math.abs(i) && Math.abs(f2) > Math.abs(f) && f2 >= 0.0f;
    }

    /* renamed from: j */
    public void mo64794j() {
        m44967d(this, 0.0f, false, 0, (Runnable) null, 15, (Object) null);
        mo64808h();
    }

    /* renamed from: k */
    public void mo64795k() {
        m44967d(this, 0.0f, false, 0, (Runnable) null, 15, (Object) null);
        mo64808h();
    }

    /* renamed from: l */
    public abstract void mo64796l(float f);

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010c, code lost:
        if ((r5 >= 10.0f && java.lang.Math.abs(r5) >= 10.0f && java.lang.Math.abs(r0) > java.lang.Math.abs(r4) && java.lang.Math.abs(r5) > java.lang.Math.abs(r10) && r5 >= 0.0f) != false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r10, r0)
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x0017
            float r0 = r10.getX()
            f112048w = r0
            float r0 = r10.getY()
            f112049x = r0
        L_0x0017:
            boolean r0 = r9.f112060t
            r1 = 0
            if (r0 != 0) goto L_0x0021
            boolean r0 = r9.f112061u
            if (r0 != 0) goto L_0x0021
            return r1
        L_0x0021:
            boolean r0 = super.onInterceptTouchEvent(r10)
            if (r0 == 0) goto L_0x0028
            return r0
        L_0x0028:
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x0038
            android.view.VelocityTracker r0 = r9.f112051h
            if (r0 == 0) goto L_0x0038
            r0.recycle()
            r0 = 0
            r9.f112051h = r0
        L_0x0038:
            android.view.VelocityTracker r0 = r9.f112051h
            if (r0 != 0) goto L_0x0042
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.f112051h = r0
        L_0x0042:
            android.view.VelocityTracker r0 = r9.f112051h
            if (r0 == 0) goto L_0x0049
            r0.addMovement(r10)
        L_0x0049:
            android.view.VelocityTracker r0 = r9.f112051h
            if (r0 == 0) goto L_0x0052
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2)
        L_0x0052:
            int r0 = r10.getAction()
            java.lang.String r2 = "Finder.WebViewFrameLayout"
            if (r0 == 0) goto L_0x0113
            r3 = 1
            if (r0 == r3) goto L_0x010f
            r4 = 2
            if (r0 == r4) goto L_0x006a
            r10 = 3
            if (r0 == r10) goto L_0x0065
            goto L_0x011f
        L_0x0065:
            r9.mo64808h()
            goto L_0x011f
        L_0x006a:
            android.view.VelocityTracker r0 = r9.f112051h
            gy3.C87412m.m108591d(r0)
            float r0 = r0.getXVelocity()
            int r0 = (int) r0
            android.view.VelocityTracker r4 = r9.f112051h
            gy3.C87412m.m108591d(r4)
            float r4 = r4.getYVelocity()
            int r4 = (int) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onInterceptTouchEvent mInterceptX:"
            r5.append(r6)
            float r6 = r9.f112052i
            r5.append(r6)
            java.lang.String r6 = " mInterceptY:"
            r5.append(r6)
            float r6 = r9.f112053j
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            float r5 = r9.f112052i
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00a7
            r5 = 1
            goto L_0x00a8
        L_0x00a7:
            r5 = 0
        L_0x00a8:
            if (r5 == 0) goto L_0x00c2
            float r5 = r9.f112053j
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00b2
            r5 = 1
            goto L_0x00b3
        L_0x00b2:
            r5 = 0
        L_0x00b3:
            if (r5 == 0) goto L_0x00c2
            float r0 = r10.getRawX()
            r9.f112052i = r0
            float r10 = r10.getRawY()
            r9.f112053j = r10
            goto L_0x011f
        L_0x00c2:
            float r5 = r10.getRawX()
            float r7 = r9.f112052i
            float r5 = r5 - r7
            float r10 = r10.getRawY()
            float r7 = r9.f112053j
            float r10 = r10 - r7
            boolean r7 = r9.f112060t
            if (r7 == 0) goto L_0x00dc
            boolean r7 = r9.mo64793i(r5, r10, r0, r4)
            if (r7 == 0) goto L_0x00dc
        L_0x00da:
            r1 = 1
            goto L_0x011f
        L_0x00dc:
            boolean r7 = r9.f112061u
            if (r7 == 0) goto L_0x011f
            r7 = 1092616192(0x41200000, float:10.0)
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x00e7
            goto L_0x010b
        L_0x00e7:
            float r8 = java.lang.Math.abs(r5)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x010b
            int r0 = java.lang.Math.abs(r0)
            int r4 = java.lang.Math.abs(r4)
            if (r0 <= r4) goto L_0x010b
            float r0 = java.lang.Math.abs(r5)
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x010b
            int r10 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x010b
            r10 = 1
            goto L_0x010c
        L_0x010b:
            r10 = 0
        L_0x010c:
            if (r10 == 0) goto L_0x011f
            goto L_0x00da
        L_0x010f:
            r9.mo64808h()
            goto L_0x011f
        L_0x0113:
            float r0 = r10.getRawX()
            r9.f112052i = r0
            float r10 = r10.getRawY()
            r9.f112053j = r10
        L_0x011f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "isIntercept:"
            r10.append(r0)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.webview.p800ad.ScrollFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C87412m.m108594g(motionEvent, "ev");
        Log.m105924i("Finder.WebViewFrameLayout", "onTouchEvent:" + motionEvent + " action:" + motionEvent.getAction() + " isAnimating:" + this.f112059s);
        boolean z2 = false;
        if (this.f112059s) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f112054n = motionEvent.getRawX();
            this.f112055o = motionEvent.getRawY();
        } else if (action == 1) {
            mo64795k();
        } else if (action == 2) {
            if (this.f112054n == 0.0f) {
                if (this.f112055o == 0.0f) {
                    z2 = true;
                }
                if (z2) {
                    this.f112054n = motionEvent.getRawX();
                    this.f112055o = motionEvent.getRawY();
                }
            }
            float rawX = motionEvent.getRawX() - this.f112054n;
            float rawY = motionEvent.getRawY() - this.f112055o;
            this.f112054n = motionEvent.getRawX();
            this.f112055o = motionEvent.getRawY();
            if (this.f112060t || (z = this.f112062v)) {
                if (Math.abs(rawY) < Math.abs(rawX)) {
                    Log.m105924i("Finder.WebViewFrameLayout", "scrollVertical return");
                } else {
                    mo64796l(rawY * 0.65f);
                }
            } else if (this.f112061u || z) {
                if (Math.abs(rawX) < Math.abs(rawY)) {
                    Log.m105924i("Finder.WebViewFrameLayout", "scrollHorizontal return");
                } else {
                    mo64796l(rawX * 0.85f);
                }
            }
        } else if (action == 3) {
            mo64794j();
        }
        if (this.f112062v) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAllowHorizontalIntercept(boolean z) {
        Log.m105924i("Finder.WebViewFrameLayout", "isAllowHorizontalIntercept :" + z);
        this.f112061u = z;
    }

    public final void setAllowVerticalIntercept(boolean z) {
        Log.m105924i("Finder.WebViewFrameLayout", "isAllowVerticalIntercept :" + z);
        this.f112060t = z;
    }

    public final void setAnimating(boolean z) {
        this.f112059s = z;
    }

    public final void setDialog(C53812i iVar) {
        this.f112056p = iVar;
    }

    public final void setForceHandleEvent(boolean z) {
        this.f112062v = z;
    }

    public final void setMDownX(float f) {
        this.f112054n = f;
    }

    public final void setMDownY(float f) {
        this.f112055o = f;
    }

    public final void setMInterceptX(float f) {
        this.f112052i = f;
    }

    public final void setMInterceptY(float f) {
        this.f112053j = f;
    }

    public final void setMPointerTranslateY(float f) {
        this.f112050g = f;
    }

    public final void setMVelocityTracker(VelocityTracker velocityTracker) {
        this.f112051h = velocityTracker;
    }

    public final void setScrollDownLimit(float f) {
        this.f112057q = f;
    }

    public final void setScrollUpLimit(float f) {
        this.f112058r = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f112057q = context.getResources().getDimension(C0966R.dimen.f3705bx);
    }
}
