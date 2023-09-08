package com.tencent.p014mm.plugin.multitask.p079ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import ba2.C39747a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.multitask.C105922o;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f92.C107526d;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import l92.C109295c;
import l92.C109298e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010%\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010 \u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017¨\u0006("}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/ui/MultiTaskFloatBallView;", "Landroid/widget/FrameLayout;", "Ll92/c;", "", "alpha", "Lrx3/b0;", "setFloatBallAlphaInternal", "", "needTranslateAnimation", "setNeedTranslateAnimation", "", "visibility", "setVisibility", "setAlpha", "<set-?>", "r", "F", "getPosYPercentOfScreen", "()F", "posYPercentOfScreen", "s", "I", "getPositionY", "()I", "positionY", "getTargetPositionXWhenOrientationChanged", "targetPositionXWhenOrientationChanged", "getCurrentStateWidth", "currentStateWidth", "getCurrentStateHeight", "currentStateHeight", "getExtendWidth", "extendWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView */
public final class MultiTaskFloatBallView extends FrameLayout implements C109295c {

    /* renamed from: E */
    public static final int f315133E = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a8p);

    /* renamed from: F */
    public static final int f315134F = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a8o);

    /* renamed from: A */
    public boolean f315135A;

    /* renamed from: B */
    public boolean f315136B;

    /* renamed from: C */
    public boolean f315137C;

    /* renamed from: D */
    public int f315138D;

    /* renamed from: d */
    public int f315139d;

    /* renamed from: e */
    public ValueAnimator f315140e;

    /* renamed from: f */
    public C107526d f315141f;

    /* renamed from: g */
    public final Set<C109298e> f315142g;

    /* renamed from: h */
    public FrameLayout f315143h;

    /* renamed from: i */
    public FrameLayout f315144i;

    /* renamed from: j */
    public Drawable f315145j;

    /* renamed from: n */
    public LayoutTransition f315146n;

    /* renamed from: o */
    public int f315147o;

    /* renamed from: p */
    public boolean f315148p;

    /* renamed from: q */
    public Point f315149q;

    /* renamed from: r */
    public float f315150r;

    /* renamed from: s */
    public int f315151s;

    /* renamed from: t */
    public boolean f315152t;

    /* renamed from: u */
    public boolean f315153u;

    /* renamed from: v */
    public int f315154v;

    /* renamed from: w */
    public boolean f315155w;

    /* renamed from: x */
    public boolean f315156x;

    /* renamed from: y */
    public boolean f315157y;

    /* renamed from: z */
    public int f315158z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiTaskFloatBallView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTaskFloatBallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f315142g = new CopyOnWriteArraySet();
        this.f315149q = new Point();
        new PointF();
        new Point();
        this.f315150r = -1.0f;
        new Point();
        this.f315154v = 16;
        new Handler(Looper.getMainLooper());
        View.inflate(context, C0966R.C0971layout.b4g, this);
        this.f315145j = C76577a.m92158i(context, C0966R.C0969drawable.a6a);
        this.f315143h = (FrameLayout) findViewById(C0966R.C0970id.a5j);
        this.f315144i = (FrameLayout) findViewById(C0966R.C0970id.hpp);
        this.f315141f = new C107526d(this);
        ViewConfiguration.get(context).getScaledTouchSlop();
        this.f315149q = C85875k4.m106184h(context);
        if (C85875k4.m106197n0() && C85875k4.m106156M(context)) {
            this.f315149q.x = C85875k4.m106182g();
        }
        if (C85875k4.m106208w()) {
            this.f315149q.x = C85875k4.m106180f();
        }
        LayoutTransition layoutTransition = new LayoutTransition();
        this.f315146n = layoutTransition;
        FrameLayout frameLayout = this.f315143h;
        if (frameLayout != null) {
            frameLayout.setLayoutTransition(layoutTransition);
        }
        this.f315147o = getResources().getConfiguration().orientation;
    }

    private final int getCurrentStateHeight() {
        Log.m105927v("MicroMsg.FloatBallView", "getStateHeight state: %d", Integer.valueOf(this.f315139d));
        return f315134F + C105922o.f315111a + C105922o.f315114d;
    }

    private final int getCurrentStateWidth() {
        Log.m105927v("MicroMsg.FloatBallView", "getStateWidth state: %d", Integer.valueOf(this.f315139d));
        return f315133E + C105922o.f315115e;
    }

    private final int getExtendWidth() {
        int i;
        if (!this.f315152t) {
            return 0;
        }
        Context context = getContext();
        if (C39747a.f106640c == null) {
            C39747a.f106640c = Boolean.valueOf(C85875k4.m106205t(context, false));
        }
        Boolean bool = C39747a.f106640c;
        if (!(bool != null ? bool.booleanValue() : false)) {
            return 0;
        }
        if (getContext() instanceof Activity) {
            Context context2 = getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
            i = ((Activity) context2).getWindow().getWindowManager().getDefaultDisplay().getRotation();
        } else {
            i = 0;
        }
        boolean z = this.f315148p;
        if ((!z || i != 1) && (z || i != 3)) {
            return 0;
        }
        return C39747a.m42530b(getContext());
    }

    private final int getTargetPositionXWhenOrientationChanged() {
        if (!this.f315148p) {
            return this.f315149q.x - getCurrentStateWidth();
        }
        return 0;
    }

    /* renamed from: j */
    public static void m142428j(MultiTaskFloatBallView multiTaskFloatBallView, int i, boolean z, int i2, Object obj) {
        FrameLayout frameLayout = multiTaskFloatBallView.f315143h;
        ViewGroup.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = frameLayout != null ? frameLayout.getLayoutParams() : null;
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.gravity = i;
        FrameLayout frameLayout2 = multiTaskFloatBallView.f315143h;
        if (frameLayout2 != null) {
            frameLayout2.setLayoutParams(layoutParams3);
        }
        FrameLayout frameLayout3 = multiTaskFloatBallView.f315144i;
        boolean z2 = false;
        if (frameLayout3 != null && frameLayout3.getVisibility() == 0) {
            z2 = true;
        }
        if (z2) {
            FrameLayout frameLayout4 = multiTaskFloatBallView.f315144i;
            if (frameLayout4 != null) {
                layoutParams = frameLayout4.getLayoutParams();
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams4 != null) {
                layoutParams4.gravity = 17;
            }
            FrameLayout frameLayout5 = multiTaskFloatBallView.f315144i;
            if (frameLayout5 != null) {
                frameLayout5.setLayoutParams(layoutParams4);
            }
        }
    }

    /* renamed from: l */
    public static void m142429l(MultiTaskFloatBallView multiTaskFloatBallView, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        int i2;
        if ((i & 8) != 0) {
            z4 = false;
        }
        boolean z5 = true;
        if (z4) {
            multiTaskFloatBallView.getClass();
        } else if (multiTaskFloatBallView.f315156x == z && multiTaskFloatBallView.f315157y == z2 && multiTaskFloatBallView.f315155w == z3 && (i2 = multiTaskFloatBallView.f315158z) != 0 && i2 == multiTaskFloatBallView.f315139d) {
            Log.m105919d("MicroMsg.FloatBallView", "<<< updateFloatBallViewLayout, ignore layout %b %b;%b %b; %b %b; %d %d", Boolean.valueOf(multiTaskFloatBallView.f315136B), Boolean.valueOf(z), Boolean.valueOf(multiTaskFloatBallView.f315157y), Boolean.valueOf(z2), Boolean.valueOf(multiTaskFloatBallView.f315155w), Boolean.valueOf(z3), Integer.valueOf(multiTaskFloatBallView.f315158z), Integer.valueOf(multiTaskFloatBallView.f315139d));
            return;
        }
        Log.m105925i("MicroMsg.FloatBallView", ">>> updateFloatBallViewLayout, isSettled:%s, isDockLeft:%s, isManual:%s, lastLayoutState:%s, currentLayoutState:%s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(multiTaskFloatBallView.f315158z), Integer.valueOf(multiTaskFloatBallView.f315139d));
        multiTaskFloatBallView.f315155w = z3;
        multiTaskFloatBallView.f315156x = z;
        multiTaskFloatBallView.f315157y = z2;
        multiTaskFloatBallView.f315158z = multiTaskFloatBallView.f315139d;
        int i3 = f315133E;
        ViewGroup.LayoutParams layoutParams = multiTaskFloatBallView.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i3 == 0 || i3 == 0) {
            marginLayoutParams.width = 0;
            marginLayoutParams.height = 0;
        } else {
            marginLayoutParams.width = i3;
            marginLayoutParams.height = i3;
        }
        try {
            multiTaskFloatBallView.setLayoutParams(marginLayoutParams);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FloatBallView", e, "updateFloatBallViewSize exception", new Object[0]);
        }
        Log.m105925i("MicroMsg.FloatBallView", "updateFloatBallViewSize, width:%s, height:%s", Integer.valueOf(marginLayoutParams.width), Integer.valueOf(marginLayoutParams.height));
        FrameLayout frameLayout = multiTaskFloatBallView.f315143h;
        if (frameLayout != null) {
            frameLayout.getPaddingLeft();
            int paddingRight = frameLayout.getPaddingRight();
            int paddingTop = frameLayout.getPaddingTop();
            int paddingBottom = frameLayout.getPaddingBottom();
            if ((multiTaskFloatBallView.f315139d & 32) == 0) {
                z5 = false;
            }
            if (z5) {
                int i4 = multiTaskFloatBallView.f315154v;
                m142428j(multiTaskFloatBallView, z2 ? i4 | 3 : 5 | i4, false, 2, (Object) null);
                if (z && z2) {
                    FrameLayout frameLayout2 = multiTaskFloatBallView.f315143h;
                    if (frameLayout2 != null) {
                        frameLayout2.setPadding(multiTaskFloatBallView.getExtendWidth(), paddingTop, paddingRight, paddingBottom);
                    }
                    FrameLayout frameLayout3 = multiTaskFloatBallView.f315143h;
                    if (frameLayout3 != null) {
                        frameLayout3.setLayoutTransition(multiTaskFloatBallView.f315146n);
                    }
                    m142428j(multiTaskFloatBallView, multiTaskFloatBallView.f315154v | 3, false, 2, (Object) null);
                    FrameLayout frameLayout4 = multiTaskFloatBallView.f315144i;
                    if (frameLayout4 != null) {
                        frameLayout4.setVisibility(0);
                    }
                }
            } else if (z && z2) {
                FrameLayout frameLayout5 = multiTaskFloatBallView.f315143h;
                if (frameLayout5 != null) {
                    frameLayout5.setPadding(multiTaskFloatBallView.getExtendWidth(), paddingTop, paddingRight, paddingBottom);
                }
                FrameLayout frameLayout6 = multiTaskFloatBallView.f315143h;
                if (frameLayout6 != null) {
                    frameLayout6.setLayoutTransition(multiTaskFloatBallView.f315146n);
                }
                m142428j(multiTaskFloatBallView, multiTaskFloatBallView.f315154v | 3, false, 2, (Object) null);
                FrameLayout frameLayout7 = multiTaskFloatBallView.f315144i;
                if (frameLayout7 != null) {
                    frameLayout7.setVisibility(0);
                }
            }
        }
    }

    private final void setFloatBallAlphaInternal(float f) {
        setAlpha(f);
        int i = 0;
        if (f == 0.0f) {
            Log.m105924i("MicroMsg.FloatBallView", "setFloatBallAlphaInternal, GONE");
            i = 8;
        } else {
            Log.m105925i("MicroMsg.FloatBallView", "setFloatBallAlphaInternal, VISIBLE, alpha:%s", Float.valueOf(f));
        }
        setVisibility(i);
    }

    /* renamed from: b */
    public void mo151060b(MultiTaskInfo multiTaskInfo, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorListenerAdapter animatorListenerAdapter2 = animatorListenerAdapter;
        Log.m105925i("MicroMsg.FloatBallView", ">>> onFloatBallInfoChanged, multiTaskInfo:%s", multiTaskInfo);
        this.f315139d = 0;
        if (AppForegroundDelegate.INSTANCE.f343454n) {
            this.f315139d |= 32;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        boolean g = mo151064g(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        m142429l(this, true, g, false, false, 8, (Object) null);
        mo151069k(true, g, false, this.f315139d);
        if (this.f315153u) {
            Log.m105924i("MicroMsg.FloatBallView", "alvinluo showByTranslation");
            setNeedTranslateAnimation(false);
            if (getVisibility() == 0) {
                Log.m105924i("MicroMsg.FloatBallView", "showByTranslation float ball already show");
                if (animatorListenerAdapter2 != null) {
                    animatorListenerAdapter2.onAnimationCancel((Animator) null);
                }
            } else if (this.f315141f != null) {
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                boolean g2 = mo151064g(((FrameLayout.LayoutParams) layoutParams2).leftMargin);
                C107526d dVar = this.f315141f;
                if (dVar != null) {
                    int currentStateWidth = getCurrentStateWidth();
                    if (dVar.f321709a != null) {
                        Animator animator = dVar.f321710b;
                        if (animator != null ? animator.isRunning() : false) {
                            Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingShow");
                            if (animatorListenerAdapter2 != null) {
                                animatorListenerAdapter2.onAnimationCancel((Animator) null);
                                return;
                            }
                            return;
                        }
                        Animator animator2 = dVar.f321711c;
                        if (animator2 != null ? animator2.isRunning() : false) {
                            Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "cancel hide animator");
                            Animator animator3 = dVar.f321711c;
                            if (animator3 != null) {
                                animator3.cancel();
                            }
                        }
                        Log.m105927v("MicroMsg.FloatBallViewAnimationHandler", "playShowTranslateAnimation, view:%s, width: %d, isDockLeft: %b", dVar.f321709a, Integer.valueOf(currentStateWidth), Boolean.valueOf(g2));
                        Animator b = dVar.mo157965b(true, currentStateWidth, g2, new C107526d.C75731b(dVar.f321709a, animatorListenerAdapter2));
                        dVar.f321710b = b;
                        b.start();
                        View view = dVar.f321709a;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(Float.valueOf(1.0f));
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                        View view3 = dVar.f321709a;
                        if (view3 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else if (animatorListenerAdapter2 != null) {
                        animatorListenerAdapter2.onAnimationCancel((Animator) null);
                    }
                }
            } else if (animatorListenerAdapter2 != null) {
                animatorListenerAdapter2.onAnimationCancel((Animator) null);
            }
        } else if (animatorListenerAdapter2 != null) {
            animatorListenerAdapter2.onAnimationCancel((Animator) null);
        }
    }

    /* renamed from: d */
    public final void mo151061d() {
        int i;
        if (((int) getAlpha()) == 1 && getVisibility() == 0 && (i = getResources().getConfiguration().orientation) != this.f315147o) {
            Log.m105925i("MicroMsg.FloatBallView", "alvinluo checkOrientationIfNeed currentOrientation: %d, lastOrientation: %d", Integer.valueOf(i), Integer.valueOf(this.f315147o));
            mo151068i(i);
        }
    }

    /* renamed from: e */
    public final void mo151062e(boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        if (getVisibility() == 8) {
            Log.m105924i("MicroMsg.FloatBallView", "float ball already hide");
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel((Animator) null);
            }
        } else if (z && this.f315141f != null) {
            Log.m105924i("MicroMsg.FloatBallView", "hide with trans animation");
            C107526d dVar = this.f315141f;
            if (dVar != null) {
                dVar.mo157966c(getCurrentStateWidth(), z, z2, animatorListenerAdapter);
            }
        } else if (!z2 || this.f315141f == null) {
            Log.m105924i("MicroMsg.FloatBallView", "hide without animation");
            setVisibility(8);
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel((Animator) null);
            }
        } else {
            Log.m105924i("MicroMsg.FloatBallView", "hide with alpha animation");
            C107526d dVar2 = this.f315141f;
            if (dVar2 != null) {
                dVar2.mo157966c(getCurrentStateWidth(), z, z2, animatorListenerAdapter);
            }
        }
    }

    /* renamed from: f */
    public final void mo151063f(AnimatorListenerAdapter animatorListenerAdapter) {
        Log.m105924i("MicroMsg.FloatBallView", "alvinluo hideByTranslation");
        setNeedTranslateAnimation(false);
        if (getVisibility() == 8) {
            Log.m105924i("MicroMsg.FloatBallView", "hideByTranslation float ball already hide");
        } else if (this.f315141f != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            boolean g = mo151064g(((WindowManager.LayoutParams) layoutParams).x);
            C107526d dVar = this.f315141f;
            if (dVar != null) {
                int currentStateWidth = getCurrentStateWidth();
                if (dVar.f321709a != null) {
                    Animator animator = dVar.f321711c;
                    if (animator != null ? animator.isRunning() : false) {
                        Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingHide");
                        return;
                    }
                    Animator animator2 = dVar.f321710b;
                    if (animator2 != null ? animator2.isRunning() : false) {
                        Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "cancel show animator");
                        Animator animator3 = dVar.f321710b;
                        if (animator3 != null) {
                            animator3.cancel();
                        }
                    }
                    Log.m105927v("MicroMsg.FloatBallViewAnimationHandler", "playHideTranslateAnimation, view:%s, width: %d, isDockLeft: %b", dVar.f321709a, Integer.valueOf(currentStateWidth), Boolean.valueOf(g));
                    Animator b = dVar.mo157965b(false, currentStateWidth, g, new C107526d.C75730a(dVar.f321709a, animatorListenerAdapter));
                    dVar.f321711c = b;
                    b.start();
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean mo151064g(int i) {
        return i + (getCurrentStateWidth() / 2) <= this.f315149q.x / 2;
    }

    public final float getPosYPercentOfScreen() {
        return this.f315150r;
    }

    public final int getPositionY() {
        return this.f315151s;
    }

    /* renamed from: h */
    public final void mo151067h(int i, int i2, boolean z, boolean z2) {
        boolean g = mo151064g(i);
        this.f315148p = g;
        mo151069k(z, g, z2, this.f315139d);
        m142429l(this, z, this.f315148p, z2, false, 8, (Object) null);
        if (z) {
            this.f315150r = ((float) i2) / ((float) this.f315149q.y);
        }
        this.f315151s = i2;
        Log.m105925i("MicroMsg.FloatBallView", "notifyBallPositionChanged, x:%s, y:%s, isSettled:%s, isManual:%s, isDockLeft:%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(this.f315148p));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0092, code lost:
        r0 = com.tencent.p014mm.plugin.multitask.C105922o.f315119i;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo151068i(int r14) {
        /*
            r13 = this;
            android.graphics.Point r0 = r13.f315149q
            android.content.Context r1 = r13.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r1)
            r13.f315149q = r1
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106197n0()
            if (r1 == 0) goto L_0x0024
            android.content.Context r1 = r13.getContext()
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106156M(r1)
            if (r1 == 0) goto L_0x0024
            android.graphics.Point r1 = r13.f315149q
            int r2 = com.tencent.p014mm.p136ui.C85875k4.m106182g()
            r1.x = r2
        L_0x0024:
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r1 == 0) goto L_0x0032
            android.graphics.Point r1 = r13.f315149q
            int r2 = com.tencent.p014mm.p136ui.C85875k4.m106180f()
            r1.x = r2
        L_0x0032:
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            android.graphics.Point r3 = r13.f315149q
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r0
            java.lang.String r5 = "MicroMsg.FloatBallView"
            java.lang.String r6 = "processOrientationChanged, screenResolution: %s, lastResolution: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r2)
            int r2 = r13.f315147o
            if (r2 != r14) goto L_0x0058
            if (r0 == 0) goto L_0x0149
            int r2 = r0.x
            android.graphics.Point r6 = r13.f315149q
            int r7 = r6.x
            if (r2 != r7) goto L_0x0058
            int r0 = r0.y
            int r2 = r6.y
            if (r0 == r2) goto L_0x0149
        L_0x0058:
            r13.f315147o = r14
            r13.f315152t = r3
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r14, r0)
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            int r0 = r14.leftMargin
            android.graphics.Point r2 = r13.f315149q
            int r6 = r2.y
            float r6 = (float) r6
            float r7 = r13.f315150r
            float r6 = r6 * r7
            int r6 = (int) r6
            int r2 = r2.x
            int r0 = java.lang.Math.min(r0, r2)
            int r8 = java.lang.Math.max(r0, r4)
            android.graphics.Point r0 = r13.f315149q
            int r0 = r0.y
            int r0 = java.lang.Math.min(r6, r0)
            int r10 = java.lang.Math.max(r0, r4)
            int r9 = r13.getTargetPositionXWhenOrientationChanged()
            int r0 = com.tencent.p014mm.plugin.multitask.C105922o.f315118h
            if (r10 >= r0) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            int r0 = com.tencent.p014mm.plugin.multitask.C105922o.f315119i
            if (r10 <= r0) goto L_0x0098
        L_0x0096:
            r11 = r0
            goto L_0x0099
        L_0x0098:
            r11 = r10
        L_0x0099:
            if (r9 != 0) goto L_0x009d
            r0 = 1
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            r2 = 7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r6 = r14.leftMargin
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r4] = r6
            int r14 = r14.topMargin
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r2[r3] = r14
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
            r2[r1] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r6 = 3
            r2[r6] = r14
            r14 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r2[r14] = r7
            r14 = 5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r2[r14] = r7
            r14 = 6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r2[r14] = r7
            java.lang.String r14 = "processOrientationChanged, layoutParams.x: %s, layoutParams.y: %s, stickToLeft:%s, startSticky:[%s, %s]=>[%s, %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r14, r2)
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r14[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r14[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r14[r1] = r0
            java.lang.String r0 = "start StickyAnimation, stickToLeft:%s, startPositionY: %d, targetPositionY: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r14)
            android.animation.ValueAnimator r14 = r13.f315140e
            if (r14 == 0) goto L_0x010a
            boolean r14 = r14.isRunning()
            if (r14 != r3) goto L_0x00fc
            r4 = 1
        L_0x00fc:
            if (r4 == 0) goto L_0x010a
            java.lang.String r14 = "cancel StickyAnimation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r14)
            android.animation.ValueAnimator r14 = r13.f315140e
            if (r14 == 0) goto L_0x010a
            r14.cancel()
        L_0x010a:
            float[] r14 = new float[r1]
            r14 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r14)
            r13.f315140e = r14
            if (r14 == 0) goto L_0x011f
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r14.setInterpolator(r0)
        L_0x011f:
            android.animation.ValueAnimator r14 = r13.f315140e
            if (r14 == 0) goto L_0x0128
            r0 = 100
            r14.setDuration(r0)
        L_0x0128:
            android.animation.ValueAnimator r14 = r13.f315140e
            if (r14 == 0) goto L_0x0136
            p92.e r0 = new p92.e
            r7 = r0
            r12 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r14.addUpdateListener(r0)
        L_0x0136:
            android.animation.ValueAnimator r14 = r13.f315140e
            if (r14 == 0) goto L_0x0142
            p92.f r0 = new p92.f
            r0.<init>(r13)
            r14.addListener(r0)
        L_0x0142:
            android.animation.ValueAnimator r14 = r13.f315140e
            if (r14 == 0) goto L_0x0149
            r14.start()
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitask.p079ui.MultiTaskFloatBallView.mo151068i(int):void");
    }

    /* renamed from: k */
    public final void mo151069k(boolean z, boolean z2, boolean z3, int i) {
        if (this.f315136B != z || this.f315137C != z2 || this.f315135A != z3 || this.f315138D != i) {
            Log.m105925i("MicroMsg.FloatBallView", "updateFloatBallBackground, isSettled:%s, isDockLeft:%s, isManual:%s, state:%s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i));
            this.f315138D = i;
            this.f315135A = z3;
            this.f315136B = z;
            this.f315137C = z2;
            if (z) {
                if (z2) {
                    FrameLayout frameLayout = this.f315143h;
                    if (frameLayout != null) {
                        frameLayout.setBackground(this.f315145j);
                    }
                } else if (z3) {
                    FrameLayout frameLayout2 = this.f315143h;
                    if (frameLayout2 != null) {
                        frameLayout2.setBackground((Drawable) null);
                    }
                } else {
                    FrameLayout frameLayout3 = this.f315143h;
                    if (frameLayout3 != null) {
                        frameLayout3.setBackground((Drawable) null);
                    }
                }
            } else if (z3) {
                FrameLayout frameLayout4 = this.f315143h;
                if (frameLayout4 != null) {
                    frameLayout4.setBackground((Drawable) null);
                }
            } else {
                FrameLayout frameLayout5 = this.f315143h;
                if (frameLayout5 != null) {
                    frameLayout5.setBackground((Drawable) null);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        mo151067h(layoutParams2.leftMargin, layoutParams2.topMargin, true, false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        Log.m105925i("MicroMsg.FloatBallView", "onConfigurationChanged, orientation:%d, lastOrientation: %d", Integer.valueOf(configuration.orientation), Integer.valueOf(this.f315147o));
        mo151068i(configuration.orientation);
        int i = configuration.orientation;
        Iterator it = ((CopyOnWriteArraySet) this.f315142g).iterator();
        while (it.hasNext()) {
            ((C109298e) it.next()).onOrientationChange(i);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f315140e;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f315140e = null;
        }
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        Log.printInfoStack("MicroMsg.FloatBallView", "setAlpha:%s", Float.valueOf(f));
        mo151061d();
    }

    public final void setNeedTranslateAnimation(boolean z) {
        this.f315153u = z;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        int alpha = (int) getAlpha();
        if (alpha == 0) {
            Log.printInfoStack("MicroMsg.FloatBallView", "setVisibility:%s, alphaInt:%s, disableTouch", Integer.valueOf(i), Integer.valueOf(alpha));
        } else if (alpha == 1) {
            Log.printInfoStack("MicroMsg.FloatBallView", "setVisibility:%s, alphaInt:%s, enableTouch", Integer.valueOf(i), Integer.valueOf(alpha));
            mo151061d();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiTaskFloatBallView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
