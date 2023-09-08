package com.tencent.p014mm.openim.p018ui.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import ue0.C37421f;
import ue0.C78151a;
import ue0.C78153b;
import ue0.C78154c;
import ue0.C78155d;
import ue0.C78156e;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#B#\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000eJ\u000e\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000e¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/openim/ui/view/BaseDialogView;", "Landroid/widget/RelativeLayout;", "", "getMaxTranslationY", "getContentViewLayoutId", "getCloseLayoutHeight", "Lue0/a$a;", "listener", "Lrx3/b0;", "setOnCloseClickListener", "Lue0/f;", "setBackgroundListener", "Lue0/e;", "setBackgroundTouchListener", "", "fixed", "setIsFixDialogHeight", "fixedHeight", "setFixDialogHeight", "", "rate", "setFixDialogHeightRate", "wrapContent", "setContentViewWrapContent", "enableScroll", "setEnableDialogScroll", "enableScrollRightClose", "setEnableScrollRightClose", "cancel", "setCanceledOnTouchOutside", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.openim.ui.view.BaseDialogView */
public abstract class BaseDialogView extends RelativeLayout {

    /* renamed from: Q0 */
    public static final /* synthetic */ int f195853Q0 = 0;

    /* renamed from: A */
    public int f195854A;

    /* renamed from: B */
    public int f195855B;

    /* renamed from: C */
    public boolean f195856C;

    /* renamed from: D */
    public int f195857D;

    /* renamed from: E */
    public int f195858E;

    /* renamed from: F */
    public boolean f195859F;

    /* renamed from: G */
    public int f195860G;

    /* renamed from: H */
    public int f195861H;

    /* renamed from: I */
    public float f195862I;

    /* renamed from: J */
    public boolean f195863J;

    /* renamed from: K */
    public float f195864K;

    /* renamed from: L */
    public boolean f195865L;

    /* renamed from: M */
    public boolean f195866M;

    /* renamed from: N */
    public boolean f195867N;

    /* renamed from: P */
    public boolean f195868P;

    /* renamed from: Q */
    public boolean f195869Q;

    /* renamed from: R */
    public boolean f195870R;

    /* renamed from: S */
    public boolean f195871S;

    /* renamed from: T */
    public boolean f195872T;

    /* renamed from: U */
    public boolean f195873U;

    /* renamed from: V */
    public boolean f195874V;

    /* renamed from: W */
    public boolean f195875W;

    /* renamed from: d */
    public float f195876d;

    /* renamed from: e */
    public float f195877e;

    /* renamed from: f */
    public float f195878f;

    /* renamed from: g */
    public float f195879g;

    /* renamed from: h */
    public VelocityTracker f195880h;

    /* renamed from: i */
    public C78151a f195881i;

    /* renamed from: j */
    public View f195882j;

    /* renamed from: n */
    public View f195883n;

    /* renamed from: o */
    public RelativeLayout f195884o;

    /* renamed from: p */
    public View f195885p;

    /* renamed from: p0 */
    public final DecelerateInterpolator f195886p0;

    /* renamed from: q */
    public C78151a.C78152a f195887q;

    /* renamed from: r */
    public int f195888r;

    /* renamed from: s */
    public float f195889s;

    /* renamed from: t */
    public float f195890t;

    /* renamed from: u */
    public float f195891u;

    /* renamed from: v */
    public int f195892v;

    /* renamed from: w */
    public int f195893w;

    /* renamed from: x */
    public int f195894x;

    /* renamed from: x0 */
    public int f195895x0;

    /* renamed from: y */
    public int f195896y;

    /* renamed from: y0 */
    public int f195897y0;

    /* renamed from: z */
    public int f195898z;

    /* renamed from: com.tencent.mm.openim.ui.view.BaseDialogView$a */
    public static final class C68156a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ BaseDialogView f195899d;

        public C68156a(BaseDialogView baseDialogView) {
            this.f195899d = baseDialogView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            BaseDialogView baseDialogView = this.f195899d;
            int i = BaseDialogView.f195853Q0;
            View view = baseDialogView.f195883n;
            if (view != null) {
                view.setTranslationY(floatValue);
                baseDialogView.mo93674g(floatValue);
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.openim.ui.view.BaseDialogView$b */
    public static final class C68157b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ BaseDialogView f195900d;

        /* renamed from: e */
        public final /* synthetic */ boolean f195901e;

        public C68157b(BaseDialogView baseDialogView, boolean z) {
            this.f195900d = baseDialogView;
            this.f195901e = z;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            BaseDialogView baseDialogView = this.f195900d;
            baseDialogView.f195865L = this.f195901e;
            View view = baseDialogView.f195883n;
            if (view != null) {
                baseDialogView.f195889s = view.getTranslationY();
                this.f195900d.f195895x0 = this.f195901e ? 2 : 1;
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.openim.ui.view.BaseDialogView$c */
    public static final class C68158c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ BaseDialogView f195902d;

        /* renamed from: e */
        public final /* synthetic */ int f195903e;

        /* renamed from: com.tencent.mm.openim.ui.view.BaseDialogView$c$a */
        public static final class C68159a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ BaseDialogView f195904d;

            /* renamed from: e */
            public final /* synthetic */ int f195905e;

            public C68159a(BaseDialogView baseDialogView, int i) {
                this.f195904d = baseDialogView;
                this.f195905e = i;
            }

            public final void run() {
                C78151a aVar = this.f195904d.f195881i;
                if (aVar != null) {
                    aVar.mo108000h(this.f195905e);
                }
            }
        }

        public C68158c(BaseDialogView baseDialogView, int i) {
            this.f195902d = baseDialogView;
            this.f195903e = i;
        }

        public void onAnimationCancel(Animator animator) {
            this.f195902d.f195866M = false;
        }

        public void onAnimationEnd(Animator animator) {
            BaseDialogView baseDialogView = this.f195902d;
            baseDialogView.f195866M = false;
            baseDialogView.f195895x0 = 0;
            baseDialogView.getClass();
            ((C119157j) C119157j.f356862d).mo183895z(new C68159a(this.f195902d, this.f195903e));
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f195902d.getClass();
        }
    }

    /* renamed from: com.tencent.mm.openim.ui.view.BaseDialogView$d */
    public static final class C68160d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ BaseDialogView f195906d;

        public C68160d(BaseDialogView baseDialogView) {
            this.f195906d = baseDialogView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseDialogView baseDialogView = this.f195906d;
            View view = baseDialogView.f195883n;
            if (view != null) {
                baseDialogView.mo93674g(view.getTranslationY());
            } else {
                C87412m.m108603p("dialogContainer");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.openim.ui.view.BaseDialogView$e */
    public static final class C68161e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ BaseDialogView f195907d;

        public C68161e(BaseDialogView baseDialogView) {
            this.f195907d = baseDialogView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseDialogView baseDialogView = this.f195907d;
            View view = baseDialogView.f195883n;
            if (view != null) {
                baseDialogView.f195889s = view.getTranslationY();
                BaseDialogView baseDialogView2 = this.f195907d;
                View view2 = baseDialogView2.f195883n;
                if (view2 != null) {
                    baseDialogView2.mo93674g(view2.getTranslationY());
                } else {
                    C87412m.m108603p("dialogContainer");
                    throw null;
                }
            } else {
                C87412m.m108603p("dialogContainer");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.openim.ui.view.BaseDialogView$f */
    public static final class C68162f implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ BaseDialogView f195908d;

        /* renamed from: e */
        public final /* synthetic */ float f195909e;

        /* renamed from: f */
        public final /* synthetic */ float f195910f;

        public C68162f(BaseDialogView baseDialogView, float f, float f2) {
            this.f195908d = baseDialogView;
            this.f195909e = f;
            this.f195910f = f2;
        }

        public void onAnimationCancel(Animator animator) {
            this.f195908d.f195866M = false;
        }

        public void onAnimationEnd(Animator animator) {
            this.f195908d.getClass();
            BaseDialogView baseDialogView = this.f195908d;
            baseDialogView.f195867N = true;
            baseDialogView.f195866M = false;
            Object[] objArr = new Object[1];
            View view = baseDialogView.f195883n;
            if (view != null) {
                objArr[0] = Float.valueOf(view.getTranslationY());
                Log.m105927v("MicroMsg.BaseDialogView", "alvinluo show onAnimationEnd current translationY: %f", objArr);
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f195908d.getClass();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final int getMaxTranslationY() {
        return this.f195888r;
    }

    /* renamed from: a */
    public final void mo93670a(float f, float f2, long j, boolean z) {
        Log.m105927v("MicroMsg.BaseDialogView", "alvinluo animateDialogVerticalTranslation from: %f, to: %f", Float.valueOf(f), Float.valueOf(f2));
        if (f == f2) {
            Log.m105928w("MicroMsg.BaseDialogView", "alvinluo animateDialogVerticalTranslation start equals end and ignore");
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new C68156a(this));
        ofFloat.addListener(new C68157b(this, z));
        ofFloat.start();
    }

    /* renamed from: b */
    public final void mo93671b(int i) {
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        float maxTranslationY = (float) getMaxTranslationY();
        this.f195866M = true;
        this.f195867N = false;
        View view = this.f195883n;
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null && (translationY = animate.translationY(maxTranslationY)) != null && (duration = translationY.setDuration(300)) != null && (interpolator = duration.setInterpolator(new AccelerateInterpolator())) != null && (listener = interpolator.setListener(new C68158c(this, i))) != null && (updateListener = listener.setUpdateListener(new C68160d(this))) != null) {
                updateListener.start();
                return;
            }
            return;
        }
        C87412m.m108603p("dialogContainer");
        throw null;
    }

    /* renamed from: c */
    public abstract View mo93659c(View view);

    /* renamed from: d */
    public final void mo93672d(float f, boolean z) {
        int i;
        if (this.f195872T) {
            if (!this.f195871S) {
                this.f195871S = true;
            }
            if (this.f195859F && this.f195857D > (i = this.f195861H)) {
                int max = Math.max(i, this.f195858E);
                Log.m105919d("MicroMsg.BaseDialogView", "alvinluo handleScroll fixedContentViewHeight: %d, target: %d", Integer.valueOf(this.f195861H), Integer.valueOf(max));
                this.f195890t = Math.max(this.f195890t, (float) (this.f195857D - max));
            }
            float f2 = (z ? 0.68f : 0.85f) * f;
            float min = Math.min((float) this.f195888r, Math.max(this.f195890t, this.f195889s + f2));
            Log.m105919d("MicroMsg.BaseDialogView", "alvinluo handleScroll vertical: %b, offset: %f, moveDis: %f, currentTranslationY: %f, targetTranslationY: %f, minTranslationY: %f", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(this.f195889s), Float.valueOf(min), Float.valueOf(this.f195890t));
            this.f195864K = f2;
            View view = this.f195883n;
            if (view != null) {
                view.setTranslationY(min);
                mo93674g(min);
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo93673e() {
        View decorView;
        if (getContext() instanceof Activity) {
            Rect rect = new Rect();
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            Window window = ((Activity) context).getWindow();
            if (!(window == null || (decorView = window.getDecorView()) == null)) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            this.f195896y = rect.height();
            Log.m105925i("MicroMsg.BaseDialogView", "alvinluo initWindowVisibleHeight: %s, height: %d, windowVisibleHeight: %d, navigationBarHeight: %d", rect, Integer.valueOf(rect.height()), Integer.valueOf(this.f195896y), Integer.valueOf(this.f195855B));
        }
    }

    /* renamed from: f */
    public void mo93660f(View view) {
        C87412m.m108594g(view, "view");
    }

    /* renamed from: g */
    public final void mo93674g(float f) {
    }

    public abstract int getCloseLayoutHeight();

    public abstract int getContentViewLayoutId();

    /* renamed from: h */
    public final void mo93675h() {
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator updateListener;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator duration;
        Log.m105926v("MicroMsg.BaseDialogView", "alvinluo showDialog");
        this.f195865L = false;
        this.f195866M = true;
        this.f195895x0 = 0;
        float maxTranslationY = (float) getMaxTranslationY();
        float f = this.f195891u;
        View view = this.f195883n;
        if (view != null) {
            view.setTranslationY(maxTranslationY);
            View view2 = this.f195883n;
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                if (animate != null && (translationY = animate.translationY(f)) != null && (interpolator = translationY.setInterpolator(this.f195886p0)) != null && (updateListener = interpolator.setUpdateListener(new C68161e(this))) != null && (listener = updateListener.setListener(new C68162f(this, maxTranslationY, f))) != null && (duration = listener.setDuration(300)) != null) {
                    duration.start();
                    return;
                }
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }
        C87412m.m108603p("dialogContainer");
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = configuration != null ? Integer.valueOf(configuration.orientation) : null;
        objArr[1] = Integer.valueOf(this.f195897y0);
        Log.m105925i("MicroMsg.BaseDialogView", "alvinluo onConfigurationChanged newConfig orientation: %s, last: %s", objArr);
        if (configuration != null && this.f195897y0 == configuration.orientation) {
            z = true;
        }
        if (!z) {
            mo93673e();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = new Object[1];
        objArr[0] = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        Log.m105919d("MicroMsg.BaseDialogView", "alvinluo onInterceptTouchEvent %s", objArr);
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        if (motionEvent == null) {
            return false;
        }
        if (this.f195880h == null) {
            this.f195880h = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f195880h;
        C87412m.m108591d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        VelocityTracker velocityTracker2 = this.f195880h;
        C87412m.m108591d(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        VelocityTracker velocityTracker3 = this.f195880h;
        C87412m.m108591d(velocityTracker3);
        int xVelocity = (int) velocityTracker3.getXVelocity();
        VelocityTracker velocityTracker4 = this.f195880h;
        C87412m.m108591d(velocityTracker4);
        int yVelocity = (int) velocityTracker4.getYVelocity();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            Object[] objArr2 = new Object[3];
            objArr2[0] = Float.valueOf(motionEvent.getRawX());
            objArr2[1] = Float.valueOf(motionEvent.getRawY());
            View view = this.f195883n;
            if (view != null) {
                objArr2[2] = Float.valueOf(view.getTranslationY());
                Log.m105919d("MicroMsg.BaseDialogView", "alvinluo onInterceptTouchEvent down: %f, %f, dialogContainer translationY: %f", objArr2);
                this.f195878f = motionEvent.getRawX();
                this.f195879g = motionEvent.getRawY();
            } else {
                C87412m.m108603p("dialogContainer");
                throw null;
            }
        } else if (action != 1 && action == 2) {
            float rawX = motionEvent.getRawX() - this.f195878f;
            float rawY = motionEvent.getRawY() - this.f195879g;
            Log.m105919d("MicroMsg.BaseDialogView", "alvinluo onInterceptTouchEvent action_move tx: %f, ty: %f, velocityX: %d, velocityY: %d", Float.valueOf(rawX), Float.valueOf(rawY), Integer.valueOf(xVelocity), Integer.valueOf(yVelocity));
            float rawY2 = motionEvent.getRawY();
            View view2 = this.f195883n;
            if (view2 == null) {
                C87412m.m108603p("dialogContainer");
                throw null;
            } else if (rawY2 >= view2.getTranslationY()) {
                if (Math.abs(rawY) >= 5.0f && this.f195873U && Math.abs(rawX) <= 250.0f && Math.abs(yVelocity) > Math.abs(xVelocity) && Math.abs(yVelocity) > 0 && Math.abs(rawY) > Math.abs(rawX)) {
                    Log.m105925i("MicroMsg.BaseDialogView", "alvinluo ViewPager onInterceptTouchEvent action: %d, dialogContainerCurrentTranslationY: %s", Integer.valueOf(motionEvent.getAction()), Float.valueOf(this.f195889s));
                    z = this.f195889s > this.f195890t || (this.f195868P && rawY >= 0.0f);
                    if (z) {
                        this.f195869Q = true;
                    }
                    Log.m105927v("MicroMsg.BaseDialogView", "alvinluo onInterceptTouchEvent enableScrollVertical: %b, action: %s, isIntercept: %b, scrollingVertical: %b, scrollingHorizontal: %b", Boolean.valueOf(this.f195873U), Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z), Boolean.valueOf(this.f195869Q), Boolean.valueOf(this.f195870R));
                    return z;
                } else if (this.f195874V) {
                    z = Math.abs(xVelocity) > Math.abs(yVelocity) && rawX > 0.0f && Math.abs(rawX) > Math.abs(rawY) && this.f195878f <= 20.0f;
                    Log.m105919d("MicroMsg.BaseDialogView", "alvinluo onInterceptTouchEvent interceptXDown: %f, scrollLeftRight: %b", Float.valueOf(this.f195878f), Boolean.valueOf(z));
                    if (z) {
                        this.f195870R = true;
                    }
                    Log.m105927v("MicroMsg.BaseDialogView", "alvinluo onInterceptTouchEvent enableScrollVertical: %b, action: %s, isIntercept: %b, scrollingVertical: %b, scrollingHorizontal: %b", Boolean.valueOf(this.f195873U), Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z), Boolean.valueOf(this.f195869Q), Boolean.valueOf(this.f195870R));
                    return z;
                }
            }
        }
        z = false;
        Log.m105927v("MicroMsg.BaseDialogView", "alvinluo onInterceptTouchEvent enableScrollVertical: %b, action: %s, isIntercept: %b, scrollingVertical: %b, scrollingHorizontal: %b", Boolean.valueOf(this.f195873U), Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z), Boolean.valueOf(this.f195869Q), Boolean.valueOf(this.f195870R));
        return z;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (this.f195896y == 0) {
            mo93673e();
        }
        View view = this.f195883n;
        if (view == null) {
            C87412m.m108603p("dialogContainer");
            throw null;
        } else if (view.getMeasuredHeight() != this.f195888r && this.f195856C) {
            View view2 = this.f195883n;
            if (view2 != null) {
                int measuredHeight = view2.getMeasuredHeight();
                this.f195888r = measuredHeight;
                int max = Math.max(0, this.f195896y - measuredHeight);
                this.f195854A = Math.max(0, this.f195898z - max);
                if (this.f195859F) {
                    this.f195854A = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                }
                int i5 = this.f195888r;
                this.f195857D = (i5 - this.f195892v) - this.f195854A;
                Log.m105927v("MicroMsg.BaseDialogView", "alvinluo onMeasure dialogContainerHeight: %d, extraHeight: %d, diff: %d, fixedDialogHeight: %b", Integer.valueOf(i5), Integer.valueOf(this.f195854A), Integer.valueOf(max), Boolean.valueOf(this.f195859F));
                this.f195858E = (this.f195896y / 2) - this.f195892v;
                View view3 = this.f195882j;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    layoutParams.height = this.f195896y / 2;
                    view3.setLayoutParams(layoutParams);
                    boolean z = this.f195859F;
                    if (z || this.f195863J) {
                        if (this.f195863J) {
                            RelativeLayout relativeLayout = this.f195884o;
                            if (relativeLayout != null) {
                                i3 = relativeLayout.getMeasuredHeight();
                            } else {
                                C87412m.m108603p("contentContainer");
                                throw null;
                            }
                        } else {
                            int i6 = this.f195888r;
                            int i7 = this.f195860G;
                            if (i7 > 0) {
                                i4 = i7 - this.f195892v;
                            } else {
                                float f = this.f195862I;
                                i4 = f > 0.0f ? (int) ((f * ((float) i6)) - ((float) this.f195892v)) : 0;
                            }
                            int min = Math.min(this.f195857D, i4);
                            Log.m105927v("MicroMsg.BaseDialogView", "alvinluo computeFixedContentViewHeight dialogHeight: %s, fixedDialogHeight: %s, fixedDialogHeightRate: %s, fixedContentViewHeight: %s", Integer.valueOf(i6), Integer.valueOf(this.f195860G), Float.valueOf(this.f195862I), Integer.valueOf(min));
                            i3 = min;
                        }
                        this.f195861H = i3;
                        this.f195857D = i3;
                        if (i3 > 0) {
                            this.f195858E = i3;
                        } else {
                            z = false;
                        }
                    }
                    RelativeLayout relativeLayout2 = this.f195884o;
                    if (relativeLayout2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = relativeLayout2.getLayoutParams();
                        int i8 = layoutParams2 != null ? layoutParams2.height : 0;
                        if (z || this.f195863J) {
                            if (z) {
                                RelativeLayout relativeLayout3 = this.f195884o;
                                if (relativeLayout3 != null) {
                                    int i9 = relativeLayout3.getLayoutParams().height;
                                    int i15 = this.f195861H;
                                    if (i9 != i15) {
                                        RelativeLayout relativeLayout4 = this.f195884o;
                                        if (relativeLayout4 != null) {
                                            ViewGroup.LayoutParams layoutParams3 = relativeLayout4.getLayoutParams();
                                            if (layoutParams3 != null) {
                                                layoutParams3.height = i15;
                                            } else {
                                                layoutParams3 = null;
                                            }
                                            relativeLayout4.setLayoutParams(layoutParams3);
                                            post(new C78155d(relativeLayout4));
                                        } else {
                                            C87412m.m108603p("contentContainer");
                                            throw null;
                                        }
                                    }
                                } else {
                                    C87412m.m108603p("contentContainer");
                                    throw null;
                                }
                            }
                            View view4 = this.f195883n;
                            if (view4 != null) {
                                float translationY = view4.getTranslationY();
                                float f2 = (float) (this.f195857D - this.f195861H);
                                if (!(translationY == f2)) {
                                    this.f195889s = f2;
                                    this.f195891u = f2;
                                    if (this.f195867N) {
                                        View view5 = this.f195883n;
                                        if (view5 != null) {
                                            view5.setTranslationY(f2);
                                        } else {
                                            C87412m.m108603p("dialogContainer");
                                            throw null;
                                        }
                                    }
                                }
                            } else {
                                C87412m.m108603p("dialogContainer");
                                throw null;
                            }
                        } else {
                            RelativeLayout relativeLayout5 = this.f195884o;
                            if (relativeLayout5 != null) {
                                int measuredHeight2 = relativeLayout5.getMeasuredHeight();
                                this.f195858E = measuredHeight2;
                                Log.m105925i("MicroMsg.BaseDialogView", "alvinluo initContentViewHeight: %s", Integer.valueOf(measuredHeight2));
                                View view6 = this.f195883n;
                                if (view6 != null) {
                                    float translationY2 = view6.getTranslationY();
                                    float f3 = (float) (this.f195857D - this.f195858E);
                                    if (!(translationY2 == f3)) {
                                        this.f195889s = f3;
                                        this.f195891u = f3;
                                        if (this.f195867N) {
                                            View view7 = this.f195883n;
                                            if (view7 != null) {
                                                view7.setTranslationY(f3);
                                            } else {
                                                C87412m.m108603p("dialogContainer");
                                                throw null;
                                            }
                                        }
                                    }
                                } else {
                                    C87412m.m108603p("dialogContainer");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("contentContainer");
                                throw null;
                            }
                        }
                        Object[] objArr = new Object[7];
                        objArr[0] = Integer.valueOf(this.f195857D);
                        objArr[1] = Integer.valueOf(this.f195858E);
                        View view8 = this.f195883n;
                        if (view8 != null) {
                            objArr[2] = Float.valueOf(view8.getTranslationY());
                            objArr[3] = Float.valueOf(this.f195889s);
                            objArr[4] = Boolean.valueOf(z);
                            objArr[5] = Integer.valueOf(this.f195861H);
                            objArr[6] = Integer.valueOf(i8);
                            Log.m105925i("MicroMsg.BaseDialogView", "alvinluo initContentViewHeight maxContentViewHeight: %d, minContentViewHeight: %d, translationY: %s, dialogContainerCurrentTranslationY: %s, fixedDialog: %b, fixedContentViewHeight: %s, currentContentHeight: %s", objArr);
                            int A = C76577a.m92145A(getContext());
                            View view9 = this.f195883n;
                            if (view9 != null) {
                                Log.m105919d("MicroMsg.BaseDialogView", "alvinluo initMoveOffsetXFactor %f", Float.valueOf(((float) view9.getMeasuredHeight()) / (((float) A) * 0.5f)));
                            } else {
                                C87412m.m108603p("dialogContainer");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("dialogContainer");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("contentContainer");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("dialogBg");
                    throw null;
                }
            } else {
                C87412m.m108603p("dialogContainer");
                throw null;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        int i = 2;
        if (!this.f195866M) {
            boolean z = this.f195870R;
        }
        Log.m105919d("MicroMsg.BaseDialogView", "alvinluo onTouchEvent %s", Integer.valueOf(motionEvent.getAction()));
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                this.f195876d = 0.0f;
                this.f195877e = 0.0f;
                Log.m105925i("MicroMsg.BaseDialogView", "alvinluo onTouchUp isExpand: %b, isTouchScrolling: %s, currentEnableTouchScroll: %s, dialogContainerHalfTranslationY: %s", Boolean.valueOf(this.f195865L), Boolean.valueOf(this.f195871S), Boolean.valueOf(this.f195872T), Float.valueOf(this.f195891u));
                if (this.f195872T) {
                    if (this.f195871S) {
                        this.f195871S = false;
                    }
                    if (!this.f195865L) {
                        Object[] objArr = new Object[2];
                        float f = this.f195864K;
                        objArr[0] = Boolean.valueOf(f > 0.0f && Math.abs(f) >= ((float) this.f195857D) * 0.15f);
                        float f2 = this.f195864K;
                        objArr[1] = Boolean.valueOf(f2 < 0.0f && Math.abs(f2) >= ((float) this.f195857D) * 0.05f);
                        Log.m105919d("MicroMsg.BaseDialogView", "alvinluo onTouchUp canClose: %b, canOpen: %b", objArr);
                        float f3 = this.f195864K;
                        if (f3 > 0.0f && Math.abs(f3) >= ((float) this.f195857D) * 0.15f) {
                            C78151a.C78152a aVar = this.f195887q;
                            if (aVar != null) {
                                if (this.f195869Q) {
                                    i = 1;
                                }
                                aVar.mo108007a(i);
                            }
                        } else {
                            float f4 = this.f195864K;
                            if (f4 < 0.0f && Math.abs(f4) >= ((float) this.f195857D) * 0.05f) {
                                View view = this.f195883n;
                                if (view != null) {
                                    mo93670a(view.getTranslationY(), this.f195890t, 200, true);
                                } else {
                                    C87412m.m108603p("dialogContainer");
                                    throw null;
                                }
                            } else {
                                View view2 = this.f195883n;
                                if (view2 != null) {
                                    mo93670a(view2.getTranslationY(), this.f195891u, 200, false);
                                } else {
                                    C87412m.m108603p("dialogContainer");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        Object[] objArr2 = new Object[1];
                        float f5 = this.f195864K;
                        objArr2[0] = Boolean.valueOf(f5 > 0.0f && Math.abs(f5) >= ((float) this.f195857D) * 0.15f);
                        Log.m105919d("MicroMsg.BaseDialogView", "alvinluo onTouchUp canClose: %b", objArr2);
                        float f6 = this.f195864K;
                        if (f6 > 0.0f && Math.abs(f6) >= ((float) this.f195857D) * 0.15f) {
                            C78151a.C78152a aVar2 = this.f195887q;
                            if (aVar2 != null) {
                                if (this.f195869Q) {
                                    i = 1;
                                }
                                aVar2.mo108007a(i);
                            }
                        } else {
                            View view3 = this.f195883n;
                            if (view3 != null) {
                                mo93670a(view3.getTranslationY(), this.f195890t, 200, true);
                            } else {
                                C87412m.m108603p("dialogContainer");
                                throw null;
                            }
                        }
                    }
                }
                this.f195869Q = false;
                this.f195870R = false;
                this.f195872T = true;
            } else if (action == 2) {
                if (this.f195866M) {
                    this.f195872T = false;
                }
                if (this.f195876d == 0.0f) {
                    if (this.f195877e == 0.0f) {
                        this.f195876d = motionEvent.getRawX();
                        this.f195877e = motionEvent.getRawY();
                    }
                }
                float rawX = motionEvent.getRawX() - this.f195876d;
                float rawY = motionEvent.getRawY() - this.f195877e;
                if (Math.abs(rawY) > Math.abs(rawX)) {
                    this.f195869Q = true;
                } else if (this.f195874V) {
                    this.f195870R = true;
                }
                if (this.f195869Q && (this.f195873U || this.f195874V)) {
                    mo93672d(rawY, true);
                } else if (this.f195870R) {
                    mo93672d(rawX, false);
                } else {
                    Log.m105926v("MicroMsg.BaseDialogView", "alvinluo handleScroll ignore");
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f195876d = motionEvent.getRawX();
        this.f195877e = motionEvent.getRawY();
        if (this.f195866M) {
            this.f195872T = false;
        }
        return true;
    }

    public final void setBackgroundListener(C37421f fVar) {
        C87412m.m108594g(fVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public final void setBackgroundTouchListener(C78156e eVar) {
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        this.f195875W = z;
        if (!z) {
            View view = this.f195882j;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/openim/ui/view/BaseDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/openim/ui/view/BaseDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f195882j;
                if (view3 != null) {
                    view3.setOnClickListener((View.OnClickListener) null);
                } else {
                    C87412m.m108603p("dialogBg");
                    throw null;
                }
            } else {
                C87412m.m108603p("dialogBg");
                throw null;
            }
        } else {
            View view4 = this.f195882j;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/openim/ui/view/BaseDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/openim/ui/view/BaseDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = this.f195882j;
                if (view5 != null) {
                    view5.setOnClickListener(new C78154c(this));
                } else {
                    C87412m.m108603p("dialogBg");
                    throw null;
                }
            } else {
                C87412m.m108603p("dialogBg");
                throw null;
            }
        }
    }

    public final void setContentViewWrapContent(boolean z) {
        this.f195863J = z;
    }

    public final void setEnableDialogScroll(boolean z) {
        this.f195873U = z;
    }

    public final void setEnableScrollRightClose(boolean z) {
        this.f195874V = z;
    }

    public final void setFixDialogHeight(int i) {
        Log.m105927v("MicroMsg.BaseDialogView", "alvinluo setFixDialogHeight: %d", Integer.valueOf(i));
        this.f195860G = i;
    }

    public final void setFixDialogHeightRate(float f) {
        Log.m105927v("MicroMsg.BaseDialogView", "alvinluo setFixDialogHeightRate: %s", Float.valueOf(f));
        this.f195862I = f;
    }

    public final void setIsFixDialogHeight(boolean z) {
        this.f195859F = z;
    }

    public final void setOnCloseClickListener(C78151a.C78152a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f195887q = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f195856C = true;
        this.f195863J = true;
        this.f195868P = true;
        this.f195872T = true;
        this.f195873U = true;
        this.f195875W = true;
        this.f195886p0 = new DecelerateInterpolator();
        setFitsSystemWindows(true);
        this.f195897y0 = getResources().getConfiguration().orientation;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359844b40, this, true);
        C87412m.m108593f(inflate, "view");
        View findViewById = inflate.findViewById(C0966R.C0970id.brm);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.content_container)");
        this.f195884o = (RelativeLayout) findViewById;
        LayoutInflater from = LayoutInflater.from(getContext());
        int contentViewLayoutId = getContentViewLayoutId();
        RelativeLayout relativeLayout = this.f195884o;
        if (relativeLayout != null) {
            from.inflate(contentViewLayoutId, relativeLayout, true);
            View findViewById2 = inflate.findViewById(C0966R.C0970id.c6j);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.dialog_container)");
            this.f195883n = findViewById2;
            View findViewById3 = inflate.findViewById(C0966R.C0970id.c6f);
            C87412m.m108593f(findViewById3, "view.findViewById(R.id.dialog_bg)");
            this.f195882j = findViewById3;
            this.f195885p = mo93659c(inflate);
            View view = this.f195882j;
            if (view != null) {
                view.setOnClickListener(new C78154c(this));
                View view2 = this.f195885p;
                if (view2 != null) {
                    view2.setOnClickListener(new C78153b(this));
                    RelativeLayout relativeLayout2 = this.f195884o;
                    if (relativeLayout2 != null) {
                        mo93660f(relativeLayout2);
                        this.f195855B = C75044y4.m89991c(context);
                        this.f195894x = C75044y4.m89994f(context);
                        this.f195893w = C76577a.m92159j(context) + this.f195894x;
                        this.f195892v = getCloseLayoutHeight();
                        this.f195898z = C76577a.m92151b(context, 50);
                        Log.m105925i("MicroMsg.BaseDialogView", "alvinluo initBoxDialogView orientation: %s, getScreenHeight: %d, statusBarHeight: %d, topEmptyHeight: %d", Integer.valueOf(this.f195897y0), Integer.valueOf(this.f195893w), Integer.valueOf(this.f195894x), Integer.valueOf(this.f195898z));
                        View view3 = this.f195883n;
                        if (view3 != null) {
                            view3.setTranslationY((float) this.f195893w);
                            mo93673e();
                            return;
                        }
                        C87412m.m108603p("dialogContainer");
                        throw null;
                    }
                    C87412m.m108603p("contentContainer");
                    throw null;
                }
                C87412m.m108603p("closeButton");
                throw null;
            }
            C87412m.m108603p("dialogBg");
            throw null;
        }
        C87412m.m108603p("contentContainer");
        throw null;
    }
}
