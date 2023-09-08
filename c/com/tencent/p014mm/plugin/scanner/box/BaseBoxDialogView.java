package com.tencent.p014mm.plugin.scanner.box;

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
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import vk2.C111548a;
import vk2.C111549b;
import vk2.C111550g;
import vk2.C111553h;
import vk2.C111554i;
import vk2.C111555k;
import vk2.C52945d;
import vk2.C52946e;
import vk2.C52948j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001+B\u001b\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(B#\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b'\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0015¨\u0006,"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/box/BaseBoxDialogView;", "Landroid/widget/RelativeLayout;", "", "getMaxTranslationY", "", "transY", "Lrx3/b0;", "setBackgroundTranslationY", "getLayoutId", "getCloseLayoutHeight", "Lvk2/k;", "listener", "setBackgroundListener", "Lvk2/h;", "setBackgroundTouchListener", "Lvk2/i;", "model", "setBackgroundViewModel", "Lvk2/g;", "opView", "setBackgroundOpView", "", "fixed", "setIsFixDialogHeight", "fixedHeight", "setFixDialogHeight", "rate", "setFixDialogHeightRate", "enableScroll", "setEnableWebViewScroll", "setEnableDialogScroll", "enableScrollRightClose", "setEnableScrollRightClose", "cancel", "setCanceledOnTouchOutside", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView */
public abstract class BaseBoxDialogView extends RelativeLayout {

    /* renamed from: a1 */
    public static final /* synthetic */ int f315724a1 = 0;

    /* renamed from: A */
    public float f315725A;

    /* renamed from: B */
    public float f315726B;

    /* renamed from: C */
    public int f315727C;

    /* renamed from: D */
    public int f315728D;

    /* renamed from: E */
    public int f315729E;

    /* renamed from: F */
    public int f315730F;

    /* renamed from: G */
    public int f315731G;

    /* renamed from: H */
    public int f315732H;

    /* renamed from: I */
    public int f315733I;

    /* renamed from: J */
    public boolean f315734J;

    /* renamed from: K */
    public int f315735K;

    /* renamed from: L */
    public int f315736L;

    /* renamed from: M */
    public int f315737M;

    /* renamed from: N */
    public boolean f315738N;

    /* renamed from: P */
    public int f315739P;

    /* renamed from: Q */
    public int f315740Q;

    /* renamed from: Q0 */
    public boolean f315741Q0;

    /* renamed from: R */
    public float f315742R;

    /* renamed from: R0 */
    public boolean f315743R0;

    /* renamed from: S */
    public float f315744S;

    /* renamed from: S0 */
    public boolean f315745S0;

    /* renamed from: T */
    public boolean f315746T;

    /* renamed from: T0 */
    public boolean f315747T0;

    /* renamed from: U */
    public boolean f315748U;

    /* renamed from: U0 */
    public final ValueAnimator f315749U0;

    /* renamed from: V */
    public boolean f315750V;

    /* renamed from: V0 */
    public C106060a f315751V0;

    /* renamed from: W */
    public boolean f315752W;

    /* renamed from: W0 */
    public C106060a f315753W0;

    /* renamed from: X0 */
    public final DecelerateInterpolator f315754X0;

    /* renamed from: Y0 */
    public int f315755Y0;

    /* renamed from: Z0 */
    public int f315756Z0;

    /* renamed from: d */
    public float f315757d;

    /* renamed from: e */
    public float f315758e;

    /* renamed from: f */
    public float f315759f;

    /* renamed from: g */
    public float f315760g;

    /* renamed from: h */
    public VelocityTracker f315761h;

    /* renamed from: i */
    public C52948j f315762i;

    /* renamed from: j */
    public View f315763j;

    /* renamed from: n */
    public View f315764n;

    /* renamed from: o */
    public BoxWebViewContainer f315765o;

    /* renamed from: p */
    public View f315766p;

    /* renamed from: p0 */
    public boolean f315767p0;

    /* renamed from: q */
    public LinearLayout f315768q;

    /* renamed from: r */
    public MMWebView f315769r;

    /* renamed from: s */
    public C111555k f315770s;

    /* renamed from: t */
    public C111553h f315771t;

    /* renamed from: u */
    public C111554i f315772u;

    /* renamed from: v */
    public C111550g f315773v;

    /* renamed from: w */
    public float f315774w;

    /* renamed from: x */
    public float f315775x;

    /* renamed from: x0 */
    public boolean f315776x0;

    /* renamed from: y */
    public int f315777y;

    /* renamed from: y0 */
    public boolean f315778y0;

    /* renamed from: z */
    public float f315779z;

    /* renamed from: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView$d */
    public static final class C42899d implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ BaseBoxDialogView f116165d;

        /* renamed from: e */
        public final /* synthetic */ int f116166e;

        /* renamed from: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView$d$a */
        public static final class C42900a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ BaseBoxDialogView f116167d;

            /* renamed from: e */
            public final /* synthetic */ int f116168e;

            public C42900a(BaseBoxDialogView baseBoxDialogView, int i) {
                this.f116167d = baseBoxDialogView;
                this.f116168e = i;
            }

            public final void run() {
                C52948j jVar = this.f116167d.f315762i;
                if (jVar != null) {
                    jVar.mo73692h(this.f116168e);
                }
            }
        }

        public C42899d(BaseBoxDialogView baseBoxDialogView, int i) {
            this.f116165d = baseBoxDialogView;
            this.f116166e = i;
        }

        public void onAnimationCancel(Animator animator) {
            this.f116165d.f315748U = false;
        }

        public void onAnimationEnd(Animator animator) {
            BaseBoxDialogView baseBoxDialogView = this.f116165d;
            baseBoxDialogView.f315748U = false;
            baseBoxDialogView.f315755Y0 = 0;
            C111555k kVar = baseBoxDialogView.f315770s;
            if (kVar != null) {
                kVar.mo33411e();
            }
            MMHandlerThread.postToMainThread(new C42900a(this.f116165d, this.f116166e));
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C111555k kVar = this.f116165d.f315770s;
            if (kVar != null) {
                kVar.mo33409c();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView$a */
    public final class C106060a {

        /* renamed from: a */
        public float f315780a;

        /* renamed from: b */
        public float f315781b;

        public C106060a(BaseBoxDialogView baseBoxDialogView) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView$b */
    public static final class C106061b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ BaseBoxDialogView f315782d;

        /* renamed from: e */
        public final /* synthetic */ boolean f315783e;

        /* renamed from: f */
        public final /* synthetic */ float f315784f;

        /* renamed from: g */
        public final /* synthetic */ float f315785g;

        /* renamed from: h */
        public final /* synthetic */ float f315786h;

        public C106061b(BaseBoxDialogView baseBoxDialogView, boolean z, float f, float f2, float f3) {
            this.f315782d = baseBoxDialogView;
            this.f315783e = z;
            this.f315784f = f;
            this.f315785g = f2;
            this.f315786h = f3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            BaseBoxDialogView baseBoxDialogView = this.f315782d;
            int i = BaseBoxDialogView.f315724a1;
            View view = baseBoxDialogView.f315764n;
            if (view != null) {
                view.setTranslationY(floatValue);
                baseBoxDialogView.mo151555i(floatValue);
                float f = (this.f315783e ? this.f315782d.f315753W0 : this.f315782d.f315751V0).f315781b;
                BaseBoxDialogView baseBoxDialogView2 = this.f315782d;
                float f2 = this.f315784f;
                float f3 = this.f315785g;
                float f4 = this.f315786h;
                baseBoxDialogView2.getClass();
                this.f315782d.setBackgroundTranslationY(f4 + ((((floatValue - f2) * 1.0f) / (f3 - f2)) * (f - f4)));
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView$c */
    public static final class C106062c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ BaseBoxDialogView f315787d;

        /* renamed from: e */
        public final /* synthetic */ boolean f315788e;

        public C106062c(BaseBoxDialogView baseBoxDialogView, boolean z) {
            this.f315787d = baseBoxDialogView;
            this.f315788e = z;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            BaseBoxDialogView baseBoxDialogView = this.f315787d;
            baseBoxDialogView.f315746T = this.f315788e;
            View view = baseBoxDialogView.f315764n;
            if (view != null) {
                baseBoxDialogView.f315779z = view.getTranslationY();
                BaseBoxDialogView baseBoxDialogView2 = this.f315787d;
                C111554i iVar = baseBoxDialogView2.f315772u;
                baseBoxDialogView2.f315774w = iVar != null ? iVar.getBackgroundTransY() : 0.0f;
                this.f315787d.f315755Y0 = this.f315788e ? 2 : 1;
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

    /* renamed from: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView$e */
    public static final class C106063e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ BaseBoxDialogView f315789d;

        /* renamed from: e */
        public final /* synthetic */ float f315790e;

        public C106063e(BaseBoxDialogView baseBoxDialogView, float f, float f2) {
            this.f315789d = baseBoxDialogView;
            this.f315790e = f;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseBoxDialogView baseBoxDialogView = this.f315789d;
            View view = baseBoxDialogView.f315764n;
            if (view != null) {
                baseBoxDialogView.mo151555i(view.getTranslationY());
                if (valueAnimator != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue = ((Float) animatedValue).floatValue();
                    float f = this.f315790e;
                    this.f315789d.setBackgroundTranslationY(f + ((0.0f - f) * floatValue));
                    return;
                }
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView$f */
    public static final class C106064f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ BaseBoxDialogView f315791d;

        public C106064f(BaseBoxDialogView baseBoxDialogView) {
            this.f315791d = baseBoxDialogView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseBoxDialogView baseBoxDialogView = this.f315791d;
            View view = baseBoxDialogView.f315764n;
            if (view != null) {
                baseBoxDialogView.f315779z = view.getTranslationY();
                BaseBoxDialogView baseBoxDialogView2 = this.f315791d;
                View view2 = baseBoxDialogView2.f315764n;
                if (view2 != null) {
                    baseBoxDialogView2.mo151555i(view2.getTranslationY());
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

    /* renamed from: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView$g */
    public static final class C106065g implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ BaseBoxDialogView f315792d;

        /* renamed from: e */
        public final /* synthetic */ float f315793e;

        /* renamed from: f */
        public final /* synthetic */ float f315794f;

        public C106065g(BaseBoxDialogView baseBoxDialogView, float f, float f2) {
            this.f315792d = baseBoxDialogView;
            this.f315793e = f;
            this.f315794f = f2;
        }

        public void onAnimationCancel(Animator animator) {
            this.f315792d.f315748U = false;
        }

        public void onAnimationEnd(Animator animator) {
            C111555k kVar = this.f315792d.f315770s;
            if (kVar != null) {
                kVar.mo33413g();
            }
            BaseBoxDialogView baseBoxDialogView = this.f315792d;
            baseBoxDialogView.f315750V = true;
            baseBoxDialogView.f315748U = false;
            Object[] objArr = new Object[1];
            View view = baseBoxDialogView.f315764n;
            if (view != null) {
                objArr[0] = Float.valueOf(view.getTranslationY());
                Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo show onAnimationEnd current translationY: %f", objArr);
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            BaseBoxDialogView baseBoxDialogView = this.f315792d;
            C111555k kVar = baseBoxDialogView.f315770s;
            if (kVar != null) {
                kVar.mo33412f(baseBoxDialogView.f315777y, this.f315793e, this.f315794f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView$h */
    public static final class C106066h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f315795d;

        public C106066h(View view) {
            this.f315795d = view;
        }

        public final void run() {
            View view = this.f315795d;
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseBoxDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final int getMaxTranslationY() {
        return this.f315777y;
    }

    /* access modifiers changed from: private */
    public final void setBackgroundTranslationY(float f) {
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo setBackgroundTranslationY: %f", Float.valueOf(f));
        C111554i iVar = this.f315772u;
        if (iVar != null) {
            iVar.setBackgroundTransY(f);
        }
        C111554i iVar2 = this.f315772u;
        if (iVar2 != null) {
            iVar2.setMarkViewTransY(f + this.f315775x);
        }
    }

    /* renamed from: b */
    public final void mo151550b(float f, float f2, long j, boolean z) {
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo animateDialogVerticalTranslation from: %f, to: %f", Float.valueOf(f), Float.valueOf(f2));
        if (f == f2) {
            Log.m105928w("MicroMsg.BaseBoxDialogView", "alvinluo animateDialogVerticalTranslation start equals end and ignore");
            return;
        }
        C111554i iVar = this.f315772u;
        float backgroundTransY = iVar != null ? iVar.getBackgroundTransY() : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new C106061b(this, z, f, f2, backgroundTransY));
        ofFloat.addListener(new C106062c(this, z));
        ofFloat.start();
    }

    /* renamed from: c */
    public final void mo151551c(int i) {
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        float maxTranslationY = (float) getMaxTranslationY();
        C111554i iVar = this.f315772u;
        float backgroundTransY = iVar != null ? iVar.getBackgroundTransY() : 0.0f;
        this.f315748U = true;
        this.f315750V = false;
        View view = this.f315764n;
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null && (translationY = animate.translationY(maxTranslationY)) != null && (duration = translationY.setDuration(300)) != null && (interpolator = duration.setInterpolator(new AccelerateInterpolator())) != null && (listener = interpolator.setListener(new C42899d(this, i))) != null && (updateListener = listener.setUpdateListener(new C106063e(this, backgroundTransY, 0.0f))) != null) {
                updateListener.start();
                return;
            }
            return;
        }
        C87412m.m108603p("dialogContainer");
        throw null;
    }

    /* renamed from: d */
    public abstract View mo67095d(View view);

    /* renamed from: e */
    public final void mo151552e(float f, boolean z) {
        int i;
        if (this.f315741Q0) {
            if (!this.f315778y0) {
                this.f315778y0 = true;
                C111555k kVar = this.f315770s;
                if (kVar != null) {
                    kVar.mo33407a();
                }
            }
            MMWebView mMWebView = this.f315769r;
            this.f315735K = mMWebView != null ? mMWebView.getScrollHeight() : 0;
            if (!mo151554g() || this.f315736L <= (i = this.f315740Q)) {
                int i2 = this.f315736L;
                int i3 = this.f315735K;
                if (i2 > i3) {
                    int max = Math.max(i3, this.f315737M);
                    Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo handleScroll webViewScrollHeight: %d, target: %d", Integer.valueOf(this.f315735K), Integer.valueOf(max));
                    this.f315725A = Math.max(this.f315725A, (float) (this.f315736L - max));
                }
            } else {
                int max2 = Math.max(i, this.f315737M);
                Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo handleScroll fixedWebViewHeight: %d, target: %d", Integer.valueOf(this.f315740Q), Integer.valueOf(max2));
                this.f315725A = Math.max(this.f315725A, (float) (this.f315736L - max2));
            }
            float f2 = (z ? 0.68f : 0.85f) * f;
            float min = Math.min((float) this.f315777y, Math.max(this.f315725A, this.f315779z + f2));
            Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo handleScroll vertical: %b, offset: %f, moveDis: %f, currentTranslationY: %f, targetTranslationY: %f, minTranslationY: %f", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(this.f315779z), Float.valueOf(min), Float.valueOf(this.f315725A));
            this.f315744S = f2;
            View view = this.f315764n;
            if (view != null) {
                view.setTranslationY(min);
                mo151555i(min);
                if (f2 >= 0.0f) {
                    float f3 = this.f315779z;
                    float f4 = (float) this.f315777y;
                    View view2 = this.f315764n;
                    if (view2 != null) {
                        float translationY = view2.getTranslationY();
                        float f5 = this.f315774w;
                        setBackgroundTranslationY(f5 + ((((translationY - f3) * 1.0f) / (f4 - f3)) * (0.0f - f5)));
                        return;
                    }
                    C87412m.m108603p("dialogContainer");
                    throw null;
                }
                float f6 = this.f315779z;
                if (f6 > 0.0f) {
                    View view3 = this.f315764n;
                    if (view3 != null) {
                        float translationY2 = view3.getTranslationY();
                        C106060a aVar = this.f315753W0;
                        float f7 = aVar.f315780a;
                        setBackgroundTranslationY(f7 + ((((translationY2 - f6) * 1.0f) / (0.0f - f6)) * (aVar.f315781b - f7)));
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
    public final void mo151553f() {
        View decorView;
        if (getContext() instanceof Activity) {
            Rect rect = new Rect();
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            Window window = ((Activity) context).getWindow();
            if (!(window == null || (decorView = window.getDecorView()) == null)) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            this.f315730F = rect.height();
            Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo initWindowVisibleHeight: %s, height: %d, windowVisibleHeight: %d, navigationBarHeight: %d", rect, Integer.valueOf(rect.height()), Integer.valueOf(this.f315730F), Integer.valueOf(this.f315733I));
        }
    }

    /* renamed from: g */
    public final boolean mo151554g() {
        return this.f315738N && (this.f315739P > 0 || this.f315742R > 0.0f);
    }

    public abstract int getCloseLayoutHeight();

    public abstract int getLayoutId();

    /* renamed from: h */
    public void mo67098h(View view) {
        C87412m.m108594g(view, "view");
    }

    /* renamed from: i */
    public final void mo151555i(float f) {
        float f2 = (1.0f * f) / ((float) this.f315777y);
        C111555k kVar = this.f315770s;
        if (kVar != null) {
            kVar.mo33410d(this.f315755Y0, f, f2);
        }
        LinearLayout linearLayout = this.f315768q;
        if (linearLayout != null) {
            C111550g gVar = this.f315773v;
            linearLayout.setTranslationY(f - ((float) (gVar != null ? gVar.getVieHeight() : 0)));
        }
        Object[] objArr = new Object[3];
        objArr[0] = Float.valueOf(f);
        objArr[1] = Integer.valueOf(this.f315777y);
        C111550g gVar2 = this.f315773v;
        objArr[2] = gVar2 != null ? Integer.valueOf(gVar2.getVieHeight()) : null;
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onDialogContainerTranslationYChanged: %f, dialogHeight: %s, backgroundOpViewHeight: %s", objArr);
    }

    /* renamed from: j */
    public final void mo151556j() {
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator updateListener;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator duration;
        Log.m105926v("MicroMsg.BaseBoxDialogView", "alvinluo showDialog");
        this.f315746T = false;
        this.f315748U = true;
        this.f315755Y0 = 0;
        float maxTranslationY = (float) getMaxTranslationY();
        float f = this.f315726B;
        View view = this.f315764n;
        if (view != null) {
            view.setTranslationY(maxTranslationY);
            View view2 = this.f315764n;
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                if (!(animate == null || (translationY = animate.translationY(f)) == null || (interpolator = translationY.setInterpolator(this.f315754X0)) == null || (updateListener = interpolator.setUpdateListener(new C106064f(this))) == null || (listener = updateListener.setListener(new C106065g(this, maxTranslationY, f))) == null || (duration = listener.setDuration(300)) == null)) {
                    duration.start();
                }
                ValueAnimator valueAnimator = this.f315749U0;
                valueAnimator.setInterpolator(new DecelerateInterpolator());
                valueAnimator.setDuration(300);
                C106060a aVar = this.f315751V0;
                valueAnimator.setFloatValues(new float[]{aVar.f315780a, aVar.f315781b});
                valueAnimator.addUpdateListener(new C111548a(this));
                valueAnimator.addListener(new C111549b(this));
                valueAnimator.setStartDelay(50);
                valueAnimator.start();
                return;
            }
            C87412m.m108603p("dialogContainer");
            throw null;
        }
        C87412m.m108603p("dialogContainer");
        throw null;
    }

    /* renamed from: k */
    public final void mo151557k(View view, int i, boolean z) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i;
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
        if (z) {
            post(new C106066h(view));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = configuration != null ? Integer.valueOf(configuration.orientation) : null;
        objArr[1] = Integer.valueOf(this.f315756Z0);
        Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo onConfigurationChanged newConfig orientation: %s, last: %s", objArr);
        if (configuration != null && this.f315756Z0 == configuration.orientation) {
            z = true;
        }
        if (!z) {
            mo151553f();
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
        if (this.f315761h == null) {
            this.f315761h = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f315761h;
        C87412m.m108591d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        VelocityTracker velocityTracker2 = this.f315761h;
        C87412m.m108591d(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        VelocityTracker velocityTracker3 = this.f315761h;
        C87412m.m108591d(velocityTracker3);
        int xVelocity = (int) velocityTracker3.getXVelocity();
        VelocityTracker velocityTracker4 = this.f315761h;
        C87412m.m108591d(velocityTracker4);
        int yVelocity = (int) velocityTracker4.getYVelocity();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            Object[] objArr2 = new Object[3];
            objArr2[0] = Float.valueOf(motionEvent.getRawX());
            objArr2[1] = Float.valueOf(motionEvent.getRawY());
            View view = this.f315764n;
            if (view != null) {
                objArr2[2] = Float.valueOf(view.getTranslationY());
                Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent down: %f, %f, dialogContainer translationY: %f", objArr2);
                this.f315759f = motionEvent.getRawX();
                this.f315760g = motionEvent.getRawY();
            } else {
                C87412m.m108603p("dialogContainer");
                throw null;
            }
        } else if (action != 1 && action == 2) {
            float rawX = motionEvent.getRawX() - this.f315759f;
            float rawY = motionEvent.getRawY() - this.f315760g;
            Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent action_move tx: %f, ty: %f, velocityX: %d, velocityY: %d", Float.valueOf(rawX), Float.valueOf(rawY), Integer.valueOf(xVelocity), Integer.valueOf(yVelocity));
            float rawY2 = motionEvent.getRawY();
            View view2 = this.f315764n;
            if (view2 == null) {
                C87412m.m108603p("dialogContainer");
                throw null;
            } else if (rawY2 >= view2.getTranslationY()) {
                if (Math.abs(rawY) >= 5.0f && this.f315743R0 && Math.abs(rawX) <= 250.0f && Math.abs(yVelocity) > Math.abs(xVelocity) && Math.abs(yVelocity) > 0 && Math.abs(rawY) > Math.abs(rawX)) {
                    Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo ViewPager onInterceptTouchEvent action: %d, dialogContainerCurrentTranslationY: %s", Integer.valueOf(motionEvent.getAction()), Float.valueOf(this.f315779z));
                    z = this.f315779z > this.f315725A || (this.f315752W && rawY >= 0.0f);
                    if (z) {
                        this.f315767p0 = true;
                    }
                    Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent enableScrollVertical: %b, action: %s, isIntercept: %b, scrollingVertical: %b, scrollingHorizontal: %b", Boolean.valueOf(this.f315743R0), Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z), Boolean.valueOf(this.f315767p0), Boolean.valueOf(this.f315776x0));
                    return z;
                } else if (this.f315745S0) {
                    z = Math.abs(xVelocity) > Math.abs(yVelocity) && rawX > 0.0f && Math.abs(rawX) > Math.abs(rawY) && this.f315759f <= 20.0f;
                    Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent interceptXDown: %f, scrollLeftRight: %b", Float.valueOf(this.f315759f), Boolean.valueOf(z));
                    if (z) {
                        this.f315776x0 = true;
                    }
                    Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent enableScrollVertical: %b, action: %s, isIntercept: %b, scrollingVertical: %b, scrollingHorizontal: %b", Boolean.valueOf(this.f315743R0), Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z), Boolean.valueOf(this.f315767p0), Boolean.valueOf(this.f315776x0));
                    return z;
                }
            }
        }
        z = false;
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onInterceptTouchEvent enableScrollVertical: %b, action: %s, isIntercept: %b, scrollingVertical: %b, scrollingHorizontal: %b", Boolean.valueOf(this.f315743R0), Integer.valueOf(motionEvent.getAction()), Boolean.valueOf(z), Boolean.valueOf(this.f315767p0), Boolean.valueOf(this.f315776x0));
        return z;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams;
        int i5;
        super.onMeasure(i, i2);
        if (this.f315730F == 0) {
            mo151553f();
        }
        View view = this.f315764n;
        if (view == null) {
            C87412m.m108603p("dialogContainer");
            throw null;
        } else if (view.getMeasuredHeight() != this.f315777y && this.f315734J) {
            View view2 = this.f315764n;
            if (view2 != null) {
                int measuredHeight = view2.getMeasuredHeight();
                this.f315777y = measuredHeight;
                int max = Math.max(0, this.f315730F - measuredHeight);
                this.f315732H = Math.max(0, this.f315731G - max);
                if (mo151554g()) {
                    this.f315732H = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                }
                int i6 = this.f315777y;
                this.f315736L = (i6 - this.f315727C) - this.f315732H;
                Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onMeasure dialogContainerHeight: %d, extraHeight: %d, diff: %d, fixedDialogHeight: %b", Integer.valueOf(i6), Integer.valueOf(this.f315732H), Integer.valueOf(max), Boolean.valueOf(mo151554g()));
                this.f315737M = (this.f315730F / 2) - this.f315727C;
                View view3 = this.f315763j;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    layoutParams2.height = this.f315730F / 2;
                    view3.setLayoutParams(layoutParams2);
                    boolean g = mo151554g();
                    float f = 0.0f;
                    if (g) {
                        int i7 = this.f315777y;
                        int i8 = this.f315739P;
                        if (i8 > 0) {
                            i5 = i8 - this.f315727C;
                        } else {
                            float f2 = this.f315742R;
                            i5 = f2 > 0.0f ? (int) ((f2 * ((float) i7)) - ((float) this.f315727C)) : 0;
                        }
                        int min = Math.min(this.f315736L, i5);
                        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo computeFixedWebViewHeight dialogHeight: %s, fixedDialogHeight: %s, fixedDiaogHeightRate: %s, fixedWebViewHeight: %s", Integer.valueOf(i7), Integer.valueOf(this.f315739P), Float.valueOf(this.f315742R), Integer.valueOf(min), Integer.valueOf(min));
                        this.f315740Q = min;
                        if (min > 0) {
                            this.f315737M = min;
                        } else {
                            g = false;
                        }
                    }
                    MMWebView mMWebView = this.f315769r;
                    int i9 = (mMWebView == null || (layoutParams = mMWebView.getLayoutParams()) == null) ? 0 : layoutParams.height;
                    if (g) {
                        int i15 = this.f315736L;
                        int i16 = this.f315740Q;
                        if (i15 > i16) {
                            int max2 = Math.max(i16, this.f315737M);
                            this.f315725A = Math.max(this.f315725A, (float) (this.f315736L - max2));
                            Log.m105919d("MicroMsg.BaseBoxDialogView", "initWebViewHeight fixedWebViewHeight: %d, target: %d, dialogContainerMinTranslationY: %f", Integer.valueOf(this.f315740Q), Integer.valueOf(max2), Float.valueOf(this.f315725A));
                        }
                        MMWebView mMWebView2 = this.f315769r;
                        if (!(mMWebView2 == null || mMWebView2.getLayoutParams().height == (i4 = this.f315740Q))) {
                            mo151557k(this.f315769r, i4, false);
                            i9 = i4;
                        }
                        BoxWebViewContainer boxWebViewContainer = this.f315765o;
                        if (boxWebViewContainer != null) {
                            int i17 = boxWebViewContainer.getLayoutParams().height;
                            int i18 = this.f315736L;
                            if (i17 != i18) {
                                BoxWebViewContainer boxWebViewContainer2 = this.f315765o;
                                if (boxWebViewContainer2 != null) {
                                    mo151557k(boxWebViewContainer2, i18, true);
                                } else {
                                    C87412m.m108603p("webViewContainer");
                                    throw null;
                                }
                            }
                            View view4 = this.f315764n;
                            if (view4 != null) {
                                float translationY = view4.getTranslationY();
                                float f3 = (float) (this.f315736L - this.f315740Q);
                                if (!(translationY == f3)) {
                                    this.f315779z = f3;
                                    this.f315726B = f3;
                                    if (this.f315750V) {
                                        View view5 = this.f315764n;
                                        if (view5 != null) {
                                            view5.setTranslationY(f3);
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
                            C87412m.m108603p("webViewContainer");
                            throw null;
                        }
                    } else {
                        MMWebView mMWebView3 = this.f315769r;
                        if (!(mMWebView3 == null || mMWebView3.getLayoutParams().height == (i3 = this.f315736L))) {
                            mo151557k(this.f315769r, i3, true);
                            i9 = i3;
                        }
                        View view6 = this.f315764n;
                        if (view6 != null) {
                            float translationY2 = view6.getTranslationY();
                            float f4 = (float) (this.f315736L - this.f315737M);
                            if (!(translationY2 == f4)) {
                                this.f315779z = f4;
                                this.f315726B = f4;
                                if (this.f315750V) {
                                    View view7 = this.f315764n;
                                    if (view7 != null) {
                                        view7.setTranslationY(f4);
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
                    }
                    Object[] objArr = new Object[7];
                    objArr[0] = Integer.valueOf(this.f315736L);
                    objArr[1] = Integer.valueOf(this.f315737M);
                    View view8 = this.f315764n;
                    if (view8 != null) {
                        objArr[2] = Float.valueOf(view8.getTranslationY());
                        objArr[3] = Float.valueOf(this.f315779z);
                        objArr[4] = Boolean.valueOf(g);
                        objArr[5] = Integer.valueOf(this.f315740Q);
                        objArr[6] = Integer.valueOf(i9);
                        Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo initWebViewHeight maxWebViewHeight: %d, minWebVieHeight: %d, translationY: %s, dialogContainerCurrentTranslationY: %s, fixedDialog: %b, fixedWebViewHeight: %s, currentWebViewHeight: %s", objArr);
                        int A = C76577a.m92145A(getContext());
                        View view9 = this.f315764n;
                        if (view9 != null) {
                            Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo initMoveOffsetXFactor %f", Float.valueOf(((float) view9.getMeasuredHeight()) / (((float) A) * 0.5f)));
                            this.f315751V0.f315780a = 0.0f;
                            int i19 = (this.f315730F - this.f315737M) - this.f315727C;
                            C111554i iVar = this.f315772u;
                            float markViewHeight = iVar != null ? iVar.getMarkViewHeight() : 0.0f;
                            C111554i iVar2 = this.f315772u;
                            float markViewTransY = iVar2 != null ? iVar2.getMarkViewTransY() : 0.0f;
                            float f5 = ((float) i19) / 2.0f;
                            Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo computeHalfScreenAnimationInfo temp: %f, %f, markViewTransY: %f", Float.valueOf(f5), Float.valueOf(((float) this.f315730F) / 4.0f), Float.valueOf(markViewTransY));
                            float f6 = markViewHeight / 2.0f;
                            float f7 = f5 - f6;
                            if (markViewTransY <= f7) {
                                Log.m105918d("MicroMsg.BaseBoxDialogView", "alvinluo computeHalfScreenAnimationInfo not need animation");
                                this.f315751V0.getClass();
                            } else {
                                if (markViewTransY >= (((float) this.f315730F) - f5) - f6) {
                                    this.f315751V0.f315781b = -this.f315726B;
                                } else {
                                    this.f315751V0.f315781b = f7 - this.f315775x;
                                }
                                Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo computeHalfScreenAnimationInfo current: %f, target: %f", Float.valueOf(this.f315751V0.f315780a), Float.valueOf(this.f315751V0.f315781b));
                            }
                            this.f315753W0.getClass();
                            C106060a aVar = this.f315753W0;
                            float f8 = this.f315751V0.f315781b;
                            aVar.f315780a = f8;
                            float f9 = f8 + this.f315775x;
                            float f15 = ((float) this.f315731G) / 2.0f;
                            if (f9 <= f15) {
                                Log.m105918d("MicroMsg.BaseBoxDialogView", "alvinluo computeFullScreenAnimationInfo not need animation");
                                this.f315753W0.getClass();
                                return;
                            }
                            float f16 = (float) this.f315777y;
                            if (f9 >= (f16 / 2.0f) - f15) {
                                aVar.f315781b = -f16;
                            } else {
                                C111554i iVar3 = this.f315772u;
                                if (iVar3 != null) {
                                    f = iVar3.getMarkViewHeight();
                                }
                                this.f315753W0.f315781b = (this.f315751V0.f315781b - f9) - ((f - ((float) this.f315731G)) / 2.0f);
                            }
                            Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo computeFullScreenAnimationInfo start: %f, target: %f", Float.valueOf(this.f315753W0.f315780a), Float.valueOf(this.f315753W0.f315781b));
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
        if (!this.f315748U && !this.f315776x0 && this.f315771t != null) {
            View view = this.f315764n;
            if (view != null) {
                float translationY = view.getTranslationY() + ((float) this.f315732H);
                C111553h hVar = this.f315771t;
                boolean a = hVar != null ? hVar.mo33400a(motionEvent, (int) translationY) : false;
                Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo onTouchEvent handle by backgroundListener offsetY: %s, event.y: %s, handled: %s", Float.valueOf(translationY), Float.valueOf(motionEvent.getRawY()), Boolean.valueOf(a));
                if (a) {
                    return true;
                }
            } else {
                C87412m.m108603p("dialogContainer");
                throw null;
            }
        }
        Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onTouchEvent %s", Integer.valueOf(motionEvent.getAction()));
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                this.f315757d = 0.0f;
                this.f315758e = 0.0f;
                Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo onTouchUp isExpand: %b, isTouchScrolling: %s, currentEnableTouchScroll: %s", Boolean.valueOf(this.f315746T), Boolean.valueOf(this.f315778y0), Boolean.valueOf(this.f315741Q0));
                if (this.f315741Q0) {
                    if (this.f315778y0) {
                        this.f315778y0 = false;
                        C111555k kVar = this.f315770s;
                        if (kVar != null) {
                            kVar.mo33408b();
                        }
                    }
                    if (!this.f315746T) {
                        Object[] objArr = new Object[2];
                        float f = this.f315744S;
                        objArr[0] = Boolean.valueOf(f > 0.0f && Math.abs(f) >= ((float) this.f315736L) * 0.15f);
                        float f2 = this.f315744S;
                        objArr[1] = Boolean.valueOf(f2 < 0.0f && Math.abs(f2) >= ((float) this.f315736L) * 0.05f);
                        Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onTouchUp canClose: %b, canOpen: %b", objArr);
                        float f3 = this.f315744S;
                        if (f3 > 0.0f && Math.abs(f3) >= ((float) this.f315736L) * 0.15f) {
                            if (this.f315767p0) {
                                i = 1;
                            }
                            mo151551c(i);
                        } else {
                            float f4 = this.f315744S;
                            if (f4 < 0.0f && Math.abs(f4) >= ((float) this.f315736L) * 0.05f) {
                                View view2 = this.f315764n;
                                if (view2 != null) {
                                    mo151550b(view2.getTranslationY(), this.f315725A, 200, true);
                                } else {
                                    C87412m.m108603p("dialogContainer");
                                    throw null;
                                }
                            } else {
                                View view3 = this.f315764n;
                                if (view3 != null) {
                                    mo151550b(view3.getTranslationY(), this.f315726B, 200, false);
                                } else {
                                    C87412m.m108603p("dialogContainer");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        Object[] objArr2 = new Object[1];
                        float f5 = this.f315744S;
                        objArr2[0] = Boolean.valueOf(f5 > 0.0f && Math.abs(f5) >= ((float) this.f315736L) * 0.15f);
                        Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo onTouchUp canClose: %b", objArr2);
                        float f6 = this.f315744S;
                        if (f6 > 0.0f && Math.abs(f6) >= ((float) this.f315736L) * 0.15f) {
                            if (this.f315767p0) {
                                i = 1;
                            }
                            mo151551c(i);
                        } else {
                            View view4 = this.f315764n;
                            if (view4 != null) {
                                mo151550b(view4.getTranslationY(), this.f315725A, 200, true);
                            } else {
                                C87412m.m108603p("dialogContainer");
                                throw null;
                            }
                        }
                    }
                }
                this.f315767p0 = false;
                this.f315776x0 = false;
                this.f315741Q0 = true;
            } else if (action == 2) {
                if (this.f315748U) {
                    this.f315741Q0 = false;
                }
                if (this.f315757d == 0.0f) {
                    if (this.f315758e == 0.0f) {
                        this.f315757d = motionEvent.getRawX();
                        this.f315758e = motionEvent.getRawY();
                    }
                }
                float rawX = motionEvent.getRawX() - this.f315757d;
                float rawY = motionEvent.getRawY() - this.f315758e;
                if (Math.abs(rawY) > Math.abs(rawX)) {
                    this.f315767p0 = true;
                }
                if (this.f315767p0 && this.f315743R0) {
                    mo151552e(rawY, true);
                } else if (this.f315776x0) {
                    mo151552e(rawX, false);
                } else {
                    Log.m105926v("MicroMsg.BaseBoxDialogView", "alvinluo handleScroll ignore");
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f315757d = motionEvent.getRawX();
        this.f315758e = motionEvent.getRawY();
        if (this.f315748U) {
            this.f315741Q0 = false;
        }
        return true;
    }

    public final void setBackgroundListener(C111555k kVar) {
        C87412m.m108594g(kVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f315770s = kVar;
    }

    public final void setBackgroundOpView(C111550g gVar) {
        C87412m.m108594g(gVar, "opView");
        this.f315773v = gVar;
        if (gVar instanceof View) {
            LinearLayout linearLayout = this.f315768q;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            LinearLayout linearLayout2 = this.f315768q;
            if (linearLayout2 != null) {
                C111550g gVar2 = this.f315773v;
                C87412m.m108592e(gVar2, "null cannot be cast to non-null type android.view.View");
                linearLayout2.addView((View) gVar2);
            }
            LinearLayout linearLayout3 = this.f315768q;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            requestLayout();
            return;
        }
        LinearLayout linearLayout4 = this.f315768q;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(8);
        }
    }

    public final void setBackgroundTouchListener(C111553h hVar) {
        C87412m.m108594g(hVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f315771t = hVar;
    }

    public final void setBackgroundViewModel(C111554i iVar) {
        C87412m.m108594g(iVar, "model");
        this.f315772u = iVar;
        this.f315775x = iVar.getMarkViewTransY();
        C111554i iVar2 = this.f315772u;
        if (iVar2 != null) {
            C87412m.m108591d(iVar2);
            if (iVar2.getMarkViewHeight() > ((float) this.f315731G)) {
                C111554i iVar3 = this.f315772u;
                C87412m.m108591d(iVar3);
                this.f315731G = (int) iVar3.getMarkViewHeight();
            }
        }
        Object[] objArr = new Object[1];
        C111554i iVar4 = this.f315772u;
        objArr[0] = iVar4 != null ? Float.valueOf(iVar4.getMarkViewTransY()) : null;
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo setMarkView translationY: %s", objArr);
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        this.f315747T0 = z;
        if (!z) {
            View view = this.f315763j;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f315763j;
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
            View view4 = this.f315763j;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = this.f315763j;
                if (view5 != null) {
                    view5.setOnClickListener(new C52946e(this));
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
        this.f315743R0 = z;
    }

    public final void setEnableScrollRightClose(boolean z) {
        this.f315745S0 = z;
    }

    public final void setEnableWebViewScroll(boolean z) {
        BoxWebViewContainer boxWebViewContainer = this.f315765o;
        if (boxWebViewContainer != null) {
            boxWebViewContainer.setEnableScroll(z);
        } else {
            C87412m.m108603p("webViewContainer");
            throw null;
        }
    }

    public final void setFixDialogHeight(int i) {
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo setFixDialogHeight: %d", Integer.valueOf(i));
        this.f315739P = i;
    }

    public final void setFixDialogHeightRate(float f) {
        Log.m105927v("MicroMsg.BaseBoxDialogView", "alvinluo setFixDialogHeightRate: %s", Float.valueOf(f));
        this.f315742R = f;
    }

    public final void setIsFixDialogHeight(boolean z) {
        this.f315738N = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseBoxDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f315734J = true;
        this.f315752W = true;
        this.f315741Q0 = true;
        this.f315743R0 = true;
        this.f315747T0 = true;
        this.f315749U0 = new ValueAnimator();
        this.f315751V0 = new C106060a(this);
        this.f315753W0 = new C106060a(this);
        this.f315754X0 = new DecelerateInterpolator();
        setFitsSystemWindows(true);
        this.f315756Z0 = getResources().getConfiguration().orientation;
        View inflate = LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        C87412m.m108593f(inflate, "view");
        mo67098h(inflate);
        View findViewById = inflate.findViewById(C0966R.C0970id.c6j);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.dialog_container)");
        this.f315764n = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.c6f);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.dialog_bg)");
        this.f315763j = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.lm9);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.webview_container)");
        this.f315765o = (BoxWebViewContainer) findViewById3;
        this.f315766p = mo67095d(inflate);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.a3g);
        this.f315768q = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f315733I = C75044y4.m89991c(context);
        View view = this.f315763j;
        if (view != null) {
            view.setOnClickListener(new C52946e(this));
            View view2 = this.f315766p;
            if (view2 != null) {
                view2.setOnClickListener(new C52945d(this));
                this.f315729E = C75044y4.m89994f(context);
                this.f315728D = C76577a.m92159j(context) + this.f315729E;
                this.f315727C = getCloseLayoutHeight();
                this.f315731G = C76577a.m92151b(context, 50);
                Log.m105925i("MicroMsg.BaseBoxDialogView", "alvinluo initBoxDialogView orientation: %s, getScreenHeight: %d, statusBarHeight: %d, topEmptyHeight: %d", Integer.valueOf(this.f315756Z0), Integer.valueOf(this.f315728D), Integer.valueOf(this.f315729E), Integer.valueOf(this.f315731G));
                View view3 = this.f315764n;
                if (view3 != null) {
                    view3.setTranslationY((float) this.f315728D);
                    mo151553f();
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
