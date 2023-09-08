package com.tencent.p014mm.plugin.finder.webview;

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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001-B\u001b\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*B#\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b)\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0015J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0015J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0015¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/webview/BaseBoxDialogView;", "Landroid/widget/RelativeLayout;", "", "getMaxTranslationY", "", "transY", "Lrx3/b0;", "setBackgroundTranslationY", "getLayoutId", "getCloseLayoutHeight", "Lcom/tencent/mm/plugin/finder/webview/g;", "listener", "setBackgroundListener", "Lcom/tencent/mm/plugin/finder/webview/e;", "setBackgroundTouchListener", "Lcom/tencent/mm/plugin/finder/webview/f;", "model", "setBackgroundViewModel", "Lcom/tencent/mm/plugin/finder/webview/d;", "opView", "setBackgroundOpView", "", "fixed", "setIsFixDialogHeight", "fixedHeight", "setFixDialogHeight", "minHeight", "setMinDialogHeight", "rate", "setFixDialogHeightRate", "enableScroll", "setEnableWebViewScroll", "setEnableDialogScroll", "enableScrollRightClose", "setEnableScrollRightClose", "cancel", "setCanceledOnTouchOutside", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.webview.BaseBoxDialogView */
public abstract class BaseBoxDialogView extends RelativeLayout {

    /* renamed from: Q0 */
    public static final /* synthetic */ int f313051Q0 = 0;

    /* renamed from: A */
    public int f313052A;

    /* renamed from: B */
    public int f313053B;

    /* renamed from: C */
    public int f313054C;

    /* renamed from: D */
    public boolean f313055D;

    /* renamed from: E */
    public int f313056E;

    /* renamed from: F */
    public int f313057F;

    /* renamed from: G */
    public boolean f313058G;

    /* renamed from: H */
    public int f313059H;

    /* renamed from: I */
    public int f313060I;

    /* renamed from: J */
    public float f313061J;

    /* renamed from: K */
    public float f313062K;

    /* renamed from: L */
    public boolean f313063L;

    /* renamed from: M */
    public boolean f313064M;

    /* renamed from: N */
    public boolean f313065N;

    /* renamed from: P */
    public boolean f313066P;

    /* renamed from: Q */
    public boolean f313067Q;

    /* renamed from: R */
    public boolean f313068R;

    /* renamed from: S */
    public boolean f313069S;

    /* renamed from: T */
    public boolean f313070T;

    /* renamed from: U */
    public boolean f313071U;

    /* renamed from: V */
    public boolean f313072V;

    /* renamed from: W */
    public C105334a f313073W;

    /* renamed from: d */
    public float f313074d;

    /* renamed from: e */
    public float f313075e;

    /* renamed from: f */
    public float f313076f;

    /* renamed from: g */
    public float f313077g;

    /* renamed from: h */
    public VelocityTracker f313078h;

    /* renamed from: i */
    public View f313079i;

    /* renamed from: j */
    public View f313080j;

    /* renamed from: n */
    public RelativeInterceptScrollLayout f313081n;

    /* renamed from: o */
    public View f313082o;

    /* renamed from: p */
    public LinearLayout f313083p;

    /* renamed from: p0 */
    public C105334a f313084p0;

    /* renamed from: q */
    public float f313085q;

    /* renamed from: r */
    public float f313086r;

    /* renamed from: s */
    public int f313087s;

    /* renamed from: t */
    public float f313088t;

    /* renamed from: u */
    public float f313089u;

    /* renamed from: v */
    public float f313090v;

    /* renamed from: w */
    public int f313091w;

    /* renamed from: x */
    public int f313092x;

    /* renamed from: x0 */
    public int f313093x0;

    /* renamed from: y */
    public int f313094y;

    /* renamed from: y0 */
    public int f313095y0;

    /* renamed from: z */
    public int f313096z;

    /* renamed from: com.tencent.mm.plugin.finder.webview.BaseBoxDialogView$a */
    public final class C105334a {

        /* renamed from: a */
        public float f313097a;

        /* renamed from: b */
        public float f313098b;

        public C105334a(BaseBoxDialogView baseBoxDialogView) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.BaseBoxDialogView$b */
    public static final class C105335b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ BaseBoxDialogView f313099d;

        /* renamed from: e */
        public final /* synthetic */ boolean f313100e;

        /* renamed from: f */
        public final /* synthetic */ float f313101f;

        /* renamed from: g */
        public final /* synthetic */ float f313102g;

        /* renamed from: h */
        public final /* synthetic */ float f313103h;

        public C105335b(BaseBoxDialogView baseBoxDialogView, boolean z, float f, float f2, float f3) {
            this.f313099d = baseBoxDialogView;
            this.f313100e = z;
            this.f313101f = f;
            this.f313102g = f2;
            this.f313103h = f3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            BaseBoxDialogView baseBoxDialogView = this.f313099d;
            int i = BaseBoxDialogView.f313051Q0;
            View view = baseBoxDialogView.f313080j;
            if (view != null) {
                view.setTranslationY(floatValue);
                baseBoxDialogView.mo149901h(floatValue);
                float f = (this.f313100e ? this.f313099d.f313084p0 : this.f313099d.f313073W).f313098b;
                BaseBoxDialogView baseBoxDialogView2 = this.f313099d;
                float f2 = this.f313101f;
                float f3 = this.f313102g;
                float f4 = this.f313103h;
                baseBoxDialogView2.getClass();
                this.f313099d.setBackgroundTranslationY(f4 + ((((floatValue - f2) * 1.0f) / (f3 - f2)) * (f - f4)));
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.BaseBoxDialogView$c */
    public static final class C105336c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ BaseBoxDialogView f313104d;

        /* renamed from: e */
        public final /* synthetic */ boolean f313105e;

        public C105336c(BaseBoxDialogView baseBoxDialogView, boolean z) {
            this.f313104d = baseBoxDialogView;
            this.f313105e = z;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            BaseBoxDialogView baseBoxDialogView = this.f313104d;
            baseBoxDialogView.f313063L = this.f313105e;
            View view = baseBoxDialogView.f313080j;
            if (view != null) {
                baseBoxDialogView.f313088t = view.getTranslationY();
                BaseBoxDialogView baseBoxDialogView2 = this.f313104d;
                baseBoxDialogView2.getClass();
                baseBoxDialogView2.f313085q = 0.0f;
                this.f313104d.f313093x0 = this.f313105e ? 2 : 1;
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

    /* renamed from: com.tencent.mm.plugin.finder.webview.BaseBoxDialogView$d */
    public static final class C105337d implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ BaseBoxDialogView f313106d;

        /* renamed from: e */
        public final /* synthetic */ int f313107e;

        /* renamed from: com.tencent.mm.plugin.finder.webview.BaseBoxDialogView$d$a */
        public static final class C105338a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ BaseBoxDialogView f313108d;

            public C105338a(BaseBoxDialogView baseBoxDialogView, int i) {
                this.f313108d = baseBoxDialogView;
            }

            public final void run() {
                BaseBoxDialogView baseBoxDialogView = this.f313108d;
                int i = BaseBoxDialogView.f313051Q0;
                baseBoxDialogView.getClass();
            }
        }

        public C105337d(BaseBoxDialogView baseBoxDialogView, int i) {
            this.f313106d = baseBoxDialogView;
            this.f313107e = i;
        }

        public void onAnimationCancel(Animator animator) {
            this.f313106d.f313064M = false;
        }

        public void onAnimationEnd(Animator animator) {
            BaseBoxDialogView baseBoxDialogView = this.f313106d;
            baseBoxDialogView.f313064M = false;
            baseBoxDialogView.f313093x0 = 0;
            baseBoxDialogView.getClass();
            MMHandlerThread.postToMainThread(new C105338a(this.f313106d, this.f313107e));
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f313106d.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.BaseBoxDialogView$e */
    public static final class C105339e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ BaseBoxDialogView f313109d;

        /* renamed from: e */
        public final /* synthetic */ float f313110e;

        public C105339e(BaseBoxDialogView baseBoxDialogView, float f, float f2) {
            this.f313109d = baseBoxDialogView;
            this.f313110e = f;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseBoxDialogView baseBoxDialogView = this.f313109d;
            View view = baseBoxDialogView.f313080j;
            if (view != null) {
                baseBoxDialogView.mo149901h(view.getTranslationY());
                if (valueAnimator != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue = ((Float) animatedValue).floatValue();
                    float f = this.f313110e;
                    this.f313109d.setBackgroundTranslationY(f + ((0.0f - f) * floatValue));
                    return;
                }
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseBoxDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final int getMaxTranslationY() {
        return this.f313087s;
    }

    /* access modifiers changed from: private */
    public final void setBackgroundTranslationY(float f) {
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo setBackgroundTranslationY: %f", Float.valueOf(f));
    }

    /* renamed from: b */
    public final void mo149896b(float f, float f2, long j, boolean z) {
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo animateDialogVerticalTranslation from: %f, to: %f", Float.valueOf(f), Float.valueOf(f2));
        if (f == f2) {
            Log.m105928w("MicroMsg.BaseBoxDialogView", "alvinluo animateDialogVerticalTranslation start equals end and ignore");
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new C105335b(this, z, f, f2, 0.0f));
        ofFloat.addListener(new C105336c(this, z));
        ofFloat.start();
    }

    /* renamed from: c */
    public final void mo149897c(int i) {
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        float maxTranslationY = (float) getMaxTranslationY();
        this.f313064M = true;
        View view = this.f313080j;
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null && (translationY = animate.translationY(maxTranslationY)) != null && (duration = translationY.setDuration(300)) != null && (interpolator = duration.setInterpolator(new AccelerateInterpolator())) != null && (listener = interpolator.setListener(new C105337d(this, i))) != null && (updateListener = listener.setUpdateListener(new C105339e(this, 0.0f, 0.0f))) != null) {
                updateListener.start();
                return;
            }
            return;
        }
        C87412m.m108603p("dialogContainer");
        throw null;
    }

    /* renamed from: d */
    public abstract View mo64789d(View view);

    /* renamed from: e */
    public final void mo149898e(float f, boolean z) {
        int i;
        if (this.f313069S) {
            if (!this.f313068R) {
                this.f313068R = true;
            }
            if (mo149900g() && this.f313056E > (i = this.f313060I)) {
                int max = Math.max(i, this.f313057F);
                Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo handleScroll fixedWebViewHeight: %d, target: %d", Integer.valueOf(this.f313060I), Integer.valueOf(max));
                this.f313089u = Math.max(this.f313089u, (float) (this.f313056E - max));
            } else if (this.f313056E > 0) {
                int max2 = Math.max(0, this.f313057F);
                Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo handleScroll webViewScrollHeight: %d, target: %d", 0, Integer.valueOf(max2));
                this.f313089u = Math.max(this.f313089u, (float) (this.f313056E - max2));
            }
            float f2 = (z ? 0.68f : 0.85f) * f;
            float min = Math.min((float) this.f313087s, Math.max(this.f313089u, this.f313088t + f2));
            Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo handleScroll vertical: %b, offset: %f, moveDis: %f, currentTranslationY: %f, targetTranslationY: %f, minTranslationY: %f", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(this.f313088t), Float.valueOf(min), Float.valueOf(this.f313089u));
            this.f313062K = f2;
            View view = this.f313080j;
            if (view != null) {
                view.setTranslationY(min);
                mo149901h(min);
                if (f2 >= 0.0f) {
                    float f3 = this.f313088t;
                    float f4 = (float) this.f313087s;
                    View view2 = this.f313080j;
                    if (view2 != null) {
                        float translationY = view2.getTranslationY();
                        float f5 = this.f313085q;
                        setBackgroundTranslationY(f5 + ((((translationY - f3) * 1.0f) / (f4 - f3)) * (0.0f - f5)));
                        return;
                    }
                    C87412m.m108603p("dialogContainer");
                    throw null;
                }
                float f6 = this.f313088t;
                if (f6 > 0.0f) {
                    View view3 = this.f313080j;
                    if (view3 != null) {
                        float translationY2 = view3.getTranslationY();
                        C105334a aVar = this.f313084p0;
                        float f7 = aVar.f313097a;
                        setBackgroundTranslationY(f7 + ((((translationY2 - f6) * 1.0f) / (0.0f - f6)) * (aVar.f313098b - f7)));
                        return;
                    }
                    C87412m.m108603p("dialogContainer");
                    throw null;
                }
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo149899f() {
        View decorView;
        if (getContext() instanceof Activity) {
            Rect rect = new Rect();
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            Window window = ((Activity) context).getWindow();
            if (!(window == null || (decorView = window.getDecorView()) == null)) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            this.f313096z = rect.height();
            Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo initWindowVisibleHeight: %s, height: %d, windowVisibleHeight: %d, navigationBarHeight: %d", rect, Integer.valueOf(rect.height()), Integer.valueOf(this.f313096z), Integer.valueOf(this.f313054C));
        }
    }

    /* renamed from: g */
    public final boolean mo149900g() {
        return this.f313058G && (this.f313059H > 0 || this.f313061J > 0.0f);
    }

    public abstract int getCloseLayoutHeight();

    public abstract int getLayoutId();

    /* renamed from: h */
    public final void mo149901h(float f) {
        LinearLayout linearLayout = this.f313083p;
        if (linearLayout != null) {
            linearLayout.setTranslationY(f - ((float) 0));
        }
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onDialogContainerTranslationYChanged: %f, dialogHeight: %s, backgroundOpViewHeight: %s", Float.valueOf(f), Integer.valueOf(this.f313087s), null);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = configuration != null ? Integer.valueOf(configuration.orientation) : null;
        objArr[1] = Integer.valueOf(this.f313095y0);
        Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo onConfigurationChanged newConfig orientation: %s, last: %s", objArr);
        if (configuration != null && this.f313095y0 == configuration.orientation) {
            z = true;
        }
        if (!z) {
            mo149899f();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = new Object[1];
        objArr[0] = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent %s", objArr);
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        if (motionEvent == null) {
            return false;
        }
        if (this.f313078h == null) {
            this.f313078h = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f313078h;
        C87412m.m108591d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        VelocityTracker velocityTracker2 = this.f313078h;
        C87412m.m108591d(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        VelocityTracker velocityTracker3 = this.f313078h;
        C87412m.m108591d(velocityTracker3);
        int xVelocity = (int) velocityTracker3.getXVelocity();
        VelocityTracker velocityTracker4 = this.f313078h;
        C87412m.m108591d(velocityTracker4);
        int yVelocity = (int) velocityTracker4.getYVelocity();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            Object[] objArr2 = new Object[3];
            objArr2[0] = Float.valueOf(motionEvent.getRawX());
            objArr2[1] = Float.valueOf(motionEvent.getRawY());
            View view = this.f313080j;
            if (view != null) {
                objArr2[2] = Float.valueOf(view.getTranslationY());
                Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent down: %f, %f, dialogContainer translationY: %f", objArr2);
                this.f313076f = motionEvent.getRawX();
                this.f313077g = motionEvent.getRawY();
            } else {
                C87412m.m108603p("dialogContainer");
                throw null;
            }
        } else if (action != 1 && action == 2) {
            float rawX = motionEvent.getRawX() - this.f313076f;
            float rawY = motionEvent.getRawY() - this.f313077g;
            Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent action_move tx: %f, ty: %f, velocityX: %d, velocityY: %d", Float.valueOf(rawX), Float.valueOf(rawY), Integer.valueOf(xVelocity), Integer.valueOf(yVelocity));
            float rawY2 = motionEvent.getRawY();
            View view2 = this.f313080j;
            if (view2 == null) {
                C87412m.m108603p("dialogContainer");
                throw null;
            } else if (rawY2 >= view2.getTranslationY()) {
                if (Math.abs(rawY) >= 5.0f && this.f313070T && Math.abs(rawX) <= 250.0f && Math.abs(yVelocity) > Math.abs(xVelocity) && Math.abs(yVelocity) > 0 && Math.abs(rawY) > Math.abs(rawX)) {
                    Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo ViewPager onInterceptTouchEvent action: %d, dialogContainerCurrentTranslationY: %s", Integer.valueOf(motionEvent.getAction()), Float.valueOf(this.f313088t));
                    z = this.f313088t > this.f313089u || (this.f313065N && rawY >= 0.0f);
                    if (z) {
                        this.f313066P = true;
                    }
                    Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent enableScrollVertical: %b, action: %s, isIntercept: %b, scrollingVertical: %b, scrollingHorizontal: %b", Boolean.valueOf(this.f313070T), Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z), Boolean.valueOf(this.f313066P), Boolean.valueOf(this.f313067Q));
                    return z;
                } else if (this.f313071U) {
                    z = Math.abs(xVelocity) > Math.abs(yVelocity) && rawX > 0.0f && Math.abs(rawX) > Math.abs(rawY) && this.f313076f <= 20.0f;
                    Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent interceptXDown: %f, scrollLeftRight: %b", Float.valueOf(this.f313076f), Boolean.valueOf(z));
                    if (z) {
                        this.f313067Q = true;
                    }
                    Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent enableScrollVertical: %b, action: %s, isIntercept: %b, scrollingVertical: %b, scrollingHorizontal: %b", Boolean.valueOf(this.f313070T), Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z), Boolean.valueOf(this.f313066P), Boolean.valueOf(this.f313067Q));
                    return z;
                }
            }
        }
        z = false;
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent enableScrollVertical: %b, action: %s, isIntercept: %b, scrollingVertical: %b, scrollingHorizontal: %b", Boolean.valueOf(this.f313070T), Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z), Boolean.valueOf(this.f313066P), Boolean.valueOf(this.f313067Q));
        return z;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f313096z == 0) {
            mo149899f();
        }
        View view = this.f313080j;
        if (view == null) {
            C87412m.m108603p("dialogContainer");
            throw null;
        } else if (view.getMeasuredHeight() != this.f313087s && this.f313055D) {
            View view2 = this.f313080j;
            if (view2 != null) {
                int measuredHeight = view2.getMeasuredHeight();
                this.f313087s = measuredHeight;
                int max = Math.max(0, this.f313096z - measuredHeight);
                this.f313053B = Math.max(0, this.f313052A - max);
                if (mo149900g()) {
                    this.f313053B = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                }
                int i4 = this.f313087s;
                this.f313056E = (i4 - this.f313091w) - this.f313053B;
                Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onMeasure dialogContainerHeight: %d, extraHeight: %d, diff: %d, fixedDialogHeight: %b", Integer.valueOf(i4), Integer.valueOf(this.f313053B), Integer.valueOf(max), Boolean.valueOf(mo149900g()));
                if (this.f313057F == 0) {
                    this.f313057F = (this.f313096z / 2) - this.f313091w;
                }
                View view3 = this.f313079i;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    layoutParams.height = this.f313096z / 2;
                    view3.setLayoutParams(layoutParams);
                    boolean g = mo149900g();
                    if (g) {
                        int i5 = this.f313087s;
                        int i6 = this.f313059H;
                        if (i6 > 0) {
                            i3 = i6 - this.f313091w;
                        } else {
                            float f = this.f313061J;
                            i3 = f > 0.0f ? (int) ((f * ((float) i5)) - ((float) this.f313091w)) : 0;
                        }
                        int min = Math.min(this.f313056E, i3);
                        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo computeFixedWebViewHeight dialogHeight: %s, fixedDialogHeight: %s, fixedDiaogHeightRate: %s, fixedWebViewHeight: %s", Integer.valueOf(i5), Integer.valueOf(this.f313059H), Float.valueOf(this.f313061J), Integer.valueOf(min), Integer.valueOf(min));
                        this.f313060I = min;
                        if (min > 0) {
                            this.f313057F = min;
                        } else {
                            g = false;
                        }
                    }
                    if (g) {
                        RelativeInterceptScrollLayout relativeInterceptScrollLayout = this.f313081n;
                        if (relativeInterceptScrollLayout != null) {
                            int i7 = relativeInterceptScrollLayout.getLayoutParams().height;
                            int i8 = this.f313056E;
                            if (i7 != i8) {
                                RelativeInterceptScrollLayout relativeInterceptScrollLayout2 = this.f313081n;
                                if (relativeInterceptScrollLayout2 != null) {
                                    ViewGroup.LayoutParams layoutParams2 = relativeInterceptScrollLayout2.getLayoutParams();
                                    if (layoutParams2 != null) {
                                        layoutParams2.height = i8;
                                    } else {
                                        layoutParams2 = null;
                                    }
                                    relativeInterceptScrollLayout2.setLayoutParams(layoutParams2);
                                    post(new C68961c(relativeInterceptScrollLayout2));
                                } else {
                                    C87412m.m108603p("webViewContainer");
                                    throw null;
                                }
                            }
                            View view4 = this.f313080j;
                            if (view4 != null) {
                                float translationY = view4.getTranslationY();
                                float f2 = (float) (this.f313056E - this.f313060I);
                                if (!(translationY == f2)) {
                                    this.f313088t = f2;
                                    this.f313090v = f2;
                                }
                            } else {
                                C87412m.m108603p("dialogContainer");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("webViewContainer");
                            throw null;
                        }
                    } else {
                        View view5 = this.f313080j;
                        if (view5 != null) {
                            float translationY2 = view5.getTranslationY();
                            float f3 = (float) (this.f313056E - this.f313057F);
                            if (!(translationY2 == f3)) {
                                this.f313088t = f3;
                                this.f313090v = f3;
                            }
                        } else {
                            C87412m.m108603p("dialogContainer");
                            throw null;
                        }
                    }
                    Object[] objArr = new Object[7];
                    objArr[0] = Integer.valueOf(this.f313056E);
                    objArr[1] = Integer.valueOf(this.f313057F);
                    View view6 = this.f313080j;
                    if (view6 != null) {
                        objArr[2] = Float.valueOf(view6.getTranslationY());
                        objArr[3] = Float.valueOf(this.f313088t);
                        objArr[4] = Boolean.valueOf(g);
                        objArr[5] = Integer.valueOf(this.f313060I);
                        objArr[6] = 0;
                        Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo initWebViewHeight maxWebViewHeight: %d, minWebVieHeight: %d, translationY: %s, dialogContainerCurrentTranslationY: %s, fixedDialog: %b, fixedWebViewHeight: %s, currentWebViewHeight: %s", objArr);
                        int A = C76577a.m92145A(getContext());
                        View view7 = this.f313080j;
                        if (view7 != null) {
                            Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo initMoveOffsetXFactor %f", Float.valueOf(((float) view7.getMeasuredHeight()) / (((float) A) * 0.5f)));
                            this.f313073W.f313097a = 0.0f;
                            float f4 = ((float) ((this.f313096z - this.f313057F) - this.f313091w)) / 2.0f;
                            Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo computeHalfScreenAnimationInfo temp: %f, %f, markViewTransY: %f", Float.valueOf(f4), Float.valueOf(((float) this.f313096z) / 4.0f), Float.valueOf(0.0f));
                            float f5 = 0.0f / 2.0f;
                            float f6 = f4 - f5;
                            if (0.0f <= f6) {
                                Log.m105918d("MicroMsg.BaseBoxDialogView", "alvinluo computeHalfScreenAnimationInfo not need animation");
                                this.f313073W.getClass();
                            } else {
                                if (0.0f >= (((float) this.f313096z) - f4) - f5) {
                                    this.f313073W.f313098b = -this.f313090v;
                                } else {
                                    this.f313073W.f313098b = f6 - this.f313086r;
                                }
                                Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo computeHalfScreenAnimationInfo current: %f, target: %f", Float.valueOf(this.f313073W.f313097a), Float.valueOf(this.f313073W.f313098b));
                            }
                            this.f313084p0.getClass();
                            C105334a aVar = this.f313084p0;
                            float f7 = this.f313073W.f313098b;
                            aVar.f313097a = f7;
                            float f8 = f7 + this.f313086r;
                            float f9 = ((float) this.f313052A) / 2.0f;
                            if (f8 <= f9) {
                                Log.m105918d("MicroMsg.BaseBoxDialogView", "alvinluo computeFullScreenAnimationInfo not need animation");
                                this.f313084p0.getClass();
                                return;
                            }
                            float f15 = (float) this.f313087s;
                            if (f8 >= (f15 / 2.0f) - f9) {
                                aVar.f313098b = -f15;
                            } else {
                                this.f313084p0.f313098b = (this.f313073W.f313098b - f8) - ((0.0f - ((float) this.f313052A)) / 2.0f);
                            }
                            Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo computeFullScreenAnimationInfo start: %f, target: %f", Float.valueOf(this.f313084p0.f313097a), Float.valueOf(this.f313084p0.f313098b));
                            return;
                        }
                        C87412m.m108603p("dialogContainer");
                        throw null;
                    }
                    C87412m.m108603p("dialogContainer");
                    throw null;
                }
                C87412m.m108603p("dialogBg");
                throw null;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        int i = 2;
        if (!this.f313064M) {
            boolean z = this.f313067Q;
        }
        Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onTouchEvent %s", Integer.valueOf(motionEvent.getAction()));
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                this.f313074d = 0.0f;
                this.f313075e = 0.0f;
                Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo onTouchUp isExpand: %b, isTouchScrolling: %s, currentEnableTouchScroll: %s", Boolean.valueOf(this.f313063L), Boolean.valueOf(this.f313068R), Boolean.valueOf(this.f313069S));
                if (this.f313069S) {
                    if (this.f313068R) {
                        this.f313068R = false;
                    }
                    if (!this.f313063L) {
                        Object[] objArr = new Object[2];
                        float f = this.f313062K;
                        objArr[0] = Boolean.valueOf(f > 0.0f && Math.abs(f) >= ((float) this.f313056E) * 0.15f);
                        float f2 = this.f313062K;
                        objArr[1] = Boolean.valueOf(f2 < 0.0f && Math.abs(f2) >= ((float) this.f313056E) * 0.05f);
                        Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onTouchUp canClose: %b, canOpen: %b", objArr);
                        float f3 = this.f313062K;
                        if (f3 > 0.0f && Math.abs(f3) >= ((float) this.f313056E) * 0.15f) {
                            if (this.f313066P) {
                                i = 1;
                            }
                            mo149897c(i);
                        } else {
                            float f4 = this.f313062K;
                            if (f4 < 0.0f && Math.abs(f4) >= ((float) this.f313056E) * 0.05f) {
                                View view = this.f313080j;
                                if (view != null) {
                                    mo149896b(view.getTranslationY(), this.f313089u, 200, true);
                                } else {
                                    C87412m.m108603p("dialogContainer");
                                    throw null;
                                }
                            } else {
                                View view2 = this.f313080j;
                                if (view2 != null) {
                                    mo149896b(view2.getTranslationY(), this.f313090v, 200, false);
                                } else {
                                    C87412m.m108603p("dialogContainer");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        Object[] objArr2 = new Object[1];
                        float f5 = this.f313062K;
                        objArr2[0] = Boolean.valueOf(f5 > 0.0f && Math.abs(f5) >= ((float) this.f313056E) * 0.15f);
                        Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onTouchUp canClose: %b", objArr2);
                        float f6 = this.f313062K;
                        if (f6 > 0.0f && Math.abs(f6) >= ((float) this.f313056E) * 0.15f) {
                            if (this.f313066P) {
                                i = 1;
                            }
                            mo149897c(i);
                        } else {
                            View view3 = this.f313080j;
                            if (view3 != null) {
                                mo149896b(view3.getTranslationY(), this.f313089u, 200, true);
                            } else {
                                C87412m.m108603p("dialogContainer");
                                throw null;
                            }
                        }
                    }
                }
                this.f313066P = false;
                this.f313067Q = false;
                this.f313069S = true;
            } else if (action == 2) {
                if (this.f313064M) {
                    this.f313069S = false;
                }
                if (this.f313074d == 0.0f) {
                    if (this.f313075e == 0.0f) {
                        this.f313074d = motionEvent.getRawX();
                        this.f313075e = motionEvent.getRawY();
                    }
                }
                float rawX = motionEvent.getRawX() - this.f313074d;
                float rawY = motionEvent.getRawY() - this.f313075e;
                if (Math.abs(rawY) > Math.abs(rawX)) {
                    this.f313066P = true;
                }
                if (this.f313066P && this.f313070T) {
                    mo149898e(rawY, true);
                } else if (this.f313067Q) {
                    mo149898e(rawX, false);
                } else {
                    Log.m105926v("MicroMsg.BaseBoxDialogView", "alvinluo handleScroll ignore");
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f313074d = motionEvent.getRawX();
        this.f313075e = motionEvent.getRawY();
        if (this.f313064M) {
            this.f313069S = false;
        }
        return true;
    }

    public final void setBackgroundListener(C30034g gVar) {
        C87412m.m108594g(gVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public final void setBackgroundOpView(C105342d dVar) {
        C87412m.m108594g(dVar, "opView");
        if (dVar instanceof View) {
            LinearLayout linearLayout = this.f313083p;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            LinearLayout linearLayout2 = this.f313083p;
            if (linearLayout2 != null) {
                C87412m.m108592e((Object) null, "null cannot be cast to non-null type android.view.View");
                View view = null;
                linearLayout2.addView((View) null);
            }
            LinearLayout linearLayout3 = this.f313083p;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            requestLayout();
            return;
        }
        LinearLayout linearLayout4 = this.f313083p;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(8);
        }
    }

    public final void setBackgroundTouchListener(C105343e eVar) {
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public final void setBackgroundViewModel(C105344f fVar) {
        C87412m.m108594g(fVar, "model");
        this.f313086r = fVar.getMarkViewTransY();
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo setMarkView translationY: %s", null);
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        this.f313072V = z;
        if (!z) {
            View view = this.f313079i;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/webview/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/webview/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f313079i;
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
            View view4 = this.f313079i;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/webview/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/webview/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = this.f313079i;
                if (view5 != null) {
                    view5.setOnClickListener(new C105341b(this));
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

    public final void setEnableDialogScroll(boolean z) {
        this.f313070T = z;
    }

    public final void setEnableScrollRightClose(boolean z) {
        this.f313071U = z;
    }

    public final void setEnableWebViewScroll(boolean z) {
        RelativeInterceptScrollLayout relativeInterceptScrollLayout = this.f313081n;
        if (relativeInterceptScrollLayout != null) {
            relativeInterceptScrollLayout.setEnableScroll(z);
        } else {
            C87412m.m108603p("webViewContainer");
            throw null;
        }
    }

    public final void setFixDialogHeight(int i) {
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo setFixDialogHeight: %d", Integer.valueOf(i));
        this.f313059H = i;
    }

    public final void setFixDialogHeightRate(float f) {
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo setFixDialogHeightRate: %s", Float.valueOf(f));
        this.f313061J = f;
    }

    public final void setIsFixDialogHeight(boolean z) {
        this.f313058G = z;
    }

    public final void setMinDialogHeight(int i) {
        Log.m105927v("MicroMsg.BaseBoxDialogView", "setMinHeight: %d", Integer.valueOf(i));
        this.f313057F = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseBoxDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f313055D = true;
        this.f313065N = true;
        this.f313069S = true;
        this.f313070T = true;
        this.f313072V = true;
        new ValueAnimator();
        this.f313073W = new C105334a(this);
        this.f313084p0 = new C105334a(this);
        new DecelerateInterpolator();
        setFitsSystemWindows(true);
        this.f313095y0 = getResources().getConfiguration().orientation;
        View inflate = LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        C87412m.m108593f(inflate, "view");
        View findViewById = inflate.findViewById(C0966R.C0970id.c6j);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.dialog_container)");
        this.f313080j = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.c6f);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.dialog_bg)");
        this.f313079i = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.lm9);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.webview_container)");
        this.f313081n = (RelativeInterceptScrollLayout) findViewById3;
        this.f313082o = mo64789d(inflate);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.a3g);
        this.f313083p = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f313054C = C75044y4.m89991c(context);
        View view = this.f313079i;
        if (view != null) {
            view.setOnClickListener(new C105341b(this));
            View view2 = this.f313082o;
            if (view2 != null) {
                view2.setOnClickListener(new C105340a(this));
                this.f313094y = C75044y4.m89994f(context);
                this.f313092x = C76577a.m92159j(context) + this.f313094y;
                this.f313091w = getCloseLayoutHeight();
                this.f313052A = C76577a.m92151b(context, 50);
                Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo initBoxDialogView orientation: %s, getScreenHeight: %d, statusBarHeight: %d, topEmptyHeight: %d", Integer.valueOf(this.f313095y0), Integer.valueOf(this.f313092x), Integer.valueOf(this.f313094y), Integer.valueOf(this.f313052A));
                View view3 = this.f313080j;
                if (view3 != null) {
                    view3.setTranslationY((float) this.f313092x);
                    mo149899f();
                    return;
                }
                C87412m.m108603p("dialogContainer");
                throw null;
            }
            C87412m.m108603p("closeButton");
            throw null;
        }
        C87412m.m108603p("dialogBg");
        throw null;
    }
}
