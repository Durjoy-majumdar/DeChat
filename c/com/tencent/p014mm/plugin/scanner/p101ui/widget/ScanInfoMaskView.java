package com.tencent.p014mm.plugin.scanner.p101ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C59741c0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import ul2.C14247x;
import ul2.C78233z;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0007\u001a\u00020\u0003¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView;", "Landroid/widget/LinearLayout;", "", "Landroid/view/View;", "successMark", "Lrx3/b0;", "setAnchorView", "getInfoLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView */
public final class ScanInfoMaskView extends LinearLayout {

    /* renamed from: z */
    public static final /* synthetic */ int f205537z = 0;

    /* renamed from: d */
    public View f205538d;

    /* renamed from: e */
    public View f205539e;

    /* renamed from: f */
    public View f205540f;

    /* renamed from: g */
    public View f205541g;

    /* renamed from: h */
    public View f205542h;

    /* renamed from: i */
    public ImageView f205543i;

    /* renamed from: j */
    public TextView f205544j;

    /* renamed from: n */
    public int[] f205545n;

    /* renamed from: o */
    public Animation f205546o;

    /* renamed from: p */
    public boolean f205547p;

    /* renamed from: q */
    public boolean f205548q;

    /* renamed from: r */
    public int[] f205549r;

    /* renamed from: s */
    public boolean f205550s;

    /* renamed from: t */
    public boolean f205551t;

    /* renamed from: u */
    public boolean f205552u;

    /* renamed from: v */
    public boolean f205553v;

    /* renamed from: w */
    public boolean f205554w;

    /* renamed from: x */
    public boolean f205555x;

    /* renamed from: y */
    public boolean f205556y;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView$a */
    public static final class C71023a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ScanInfoMaskView f205557d;

        /* renamed from: e */
        public final /* synthetic */ boolean f205558e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f205559f;

        public C71023a(ScanInfoMaskView scanInfoMaskView, boolean z, C32224a<C13598b0> aVar) {
            this.f205557d = scanInfoMaskView;
            this.f205558e = z;
            this.f205559f = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f205557d.f205548q = false;
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator animate;
            View view = this.f205557d.f205539e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = this.f205557d.f205539e;
            if (!(view2 == null || (animate = view2.animate()) == null)) {
                animate.setListener((Animator.AnimatorListener) null);
            }
            this.f205557d.f205548q = false;
            if (this.f205558e) {
                this.f205559f.invoke();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView$b */
    public static final class C71024b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ ScanInfoMaskView f205560d;

        /* renamed from: e */
        public final /* synthetic */ boolean f205561e;

        /* renamed from: f */
        public final /* synthetic */ C59741c0 f205562f;

        /* renamed from: g */
        public final /* synthetic */ C59741c0 f205563g;

        public C71024b(ScanInfoMaskView scanInfoMaskView, boolean z, C59741c0 c0Var, C59741c0 c0Var2) {
            this.f205560d = scanInfoMaskView;
            this.f205561e = z;
            this.f205562f = c0Var;
            this.f205563g = c0Var2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = this.f205560d.f205540f;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view2 = this.f205560d.f205539e;
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showLoadingViewInternal$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (this.f205561e) {
                    ScanInfoMaskView scanInfoMaskView = this.f205560d;
                    scanInfoMaskView.f205548q = true;
                    float f = this.f205562f.f170634d;
                    float f2 = (float) 0;
                    float f3 = f + ((f2 - f) * floatValue);
                    float f4 = this.f205563g.f170634d;
                    float f5 = f4 + ((f2 - f4) * floatValue);
                    View view3 = scanInfoMaskView.f205541g;
                    if (view3 != null) {
                        view3.setTranslationX(f3);
                        View view4 = this.f205560d.f205541g;
                        if (view4 != null) {
                            view4.setTranslationY(f5);
                        } else {
                            C87412m.m108603p("loadingIcon");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("loadingIcon");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("loadingLayout");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView$c */
    public static final class C71025c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ScanInfoMaskView f205564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71025c(ScanInfoMaskView scanInfoMaskView) {
            super(0);
            this.f205564d = scanInfoMaskView;
        }

        public Object invoke() {
            ScanInfoMaskView scanInfoMaskView = this.f205564d;
            int i = ScanInfoMaskView.f205537z;
            Animation animation = scanInfoMaskView.f205546o;
            if (animation != null) {
                animation.cancel();
            }
            View view = scanInfoMaskView.f205541g;
            if (view != null) {
                view.clearAnimation();
                ScanInfoMaskView scanInfoMaskView2 = this.f205564d;
                if (scanInfoMaskView2.f205546o == null) {
                    scanInfoMaskView2.f205546o = AnimationUtils.loadAnimation(scanInfoMaskView2.getContext(), C0966R.C0968anim.f2336a1);
                    int dimensionPixelSize = this.f205564d.getResources().getDimensionPixelSize(C0966R.dimen.f3753d4);
                    float f = ((float) dimensionPixelSize) / 2.0f;
                    this.f205564d.f205546o = new RotateAnimation(0.0f, 360.0f, f, f);
                    Animation animation2 = this.f205564d.f205546o;
                    if (animation2 != null) {
                        animation2.setInterpolator(new LinearInterpolator());
                        animation2.setRepeatMode(-1);
                        animation2.setRepeatCount(-1);
                        animation2.setDuration(1000);
                    }
                }
                ScanInfoMaskView scanInfoMaskView3 = this.f205564d;
                View view2 = scanInfoMaskView3.f205541g;
                if (view2 != null) {
                    view2.startAnimation(scanInfoMaskView3.f205546o);
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("loadingIcon");
                throw null;
            }
            C87412m.m108603p("loadingIcon");
            throw null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanInfoMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo97661a(boolean z) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        this.f205551t = false;
        this.f205552u = true;
        setVisibility(0);
        View view = this.f205542h;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f205540f;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view4 = this.f205539e;
                if (view4 != null) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (!z) {
                    setVisibility(0);
                    View view6 = this.f205542h;
                    if (view6 != null) {
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(Float.valueOf(1.0f));
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view6.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        return;
                    }
                    C87412m.m108603p("infoLayout");
                    throw null;
                }
                Log.m105926v("MicroMsg.ScanInfoMaskView", "alvinluo showInfoViewWithAnimation");
                View view8 = this.f205539e;
                if (view8 != null) {
                    float translationX = view8.getTranslationX() - ((float) this.f205549r[0]);
                    View view9 = this.f205539e;
                    C87412m.m108591d(view9);
                    float paddingLeft = translationX + ((float) view9.getPaddingLeft());
                    View view10 = this.f205539e;
                    C87412m.m108591d(view10);
                    float translationY = view10.getTranslationY() - ((float) this.f205549r[1]);
                    View view11 = this.f205539e;
                    C87412m.m108591d(view11);
                    float paddingTop = translationY + ((float) view11.getPaddingTop());
                    ImageView imageView = this.f205543i;
                    if (imageView != null) {
                        imageView.setTranslationX(paddingLeft);
                        ImageView imageView2 = this.f205543i;
                        if (imageView2 != null) {
                            imageView2.setTranslationY(paddingTop);
                            View view12 = this.f205542h;
                            if (view12 != null) {
                                C9556a aVar5 = new C9556a();
                                aVar5.mo10233c(Float.valueOf(0.0f));
                                View view13 = view12;
                                C117292a.m165358d(view13, aVar5.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                view12.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                                C117292a.m165359e(view13, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                View view14 = this.f205539e;
                                C87412m.m108591d(view14);
                                C9556a aVar6 = new C9556a();
                                aVar6.mo10233c(0);
                                View view15 = view14;
                                C117292a.m165358d(view15, aVar6.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view14.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                C117292a.m165359e(view15, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                C9556a aVar7 = new C9556a();
                                aVar7.mo10233c(Float.valueOf(1.0f));
                                C117292a.m165358d(view15, aVar7.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                view14.setAlpha(((Float) aVar7.mo10231a(0)).floatValue());
                                C117292a.m165359e(view15, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                view14.setScaleX(1.0f);
                                view14.setScaleY(1.0f);
                                View view16 = this.f205539e;
                                C87412m.m108591d(view16);
                                ViewPropertyAnimator animate = view16.animate();
                                if (animate != null && (alpha = animate.alpha(0.0f)) != null) {
                                    View view17 = this.f205539e;
                                    C87412m.m108591d(view17);
                                    ViewPropertyAnimator translationY2 = alpha.translationY(((float) this.f205549r[1]) - ((float) view17.getPaddingTop()));
                                    if (translationY2 != null) {
                                        View view18 = this.f205539e;
                                        C87412m.m108591d(view18);
                                        ViewPropertyAnimator translationX2 = translationY2.translationX(((float) this.f205549r[0]) - ((float) view18.getPaddingLeft()));
                                        if (translationX2 != null && (duration = translationX2.setDuration(300)) != null && (listener = duration.setListener((Animator.AnimatorListener) null)) != null && (updateListener = listener.setUpdateListener(new C78233z(this, paddingLeft, paddingTop))) != null) {
                                            updateListener.start();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            C87412m.m108603p("infoLayout");
                            throw null;
                        }
                        C87412m.m108603p("infoIcon");
                        throw null;
                    }
                    C87412m.m108603p("infoIcon");
                    throw null;
                }
                return;
            }
            C87412m.m108603p("loadingLayout");
            throw null;
        }
        C87412m.m108603p("infoLayout");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97662b(boolean r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r26)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2[r4] = r3
            java.lang.String r3 = "MicroMsg.ScanInfoMaskView"
            java.lang.String r6 = "alvinluo showLoadingViewInternal withAnimation: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r2)
            r0.f205553v = r4
            r0.f205554w = r4
            r0.f205555x = r1
            r0.f205556y = r4
            com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView$c r2 = new com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView$c
            r2.<init>(r0)
            r0.setVisibility(r4)
            android.view.View r14 = r0.f205542h
            r15 = 0
            if (r14 == 0) goto L_0x02e0
            r6 = 8
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r13.mo10233c(r6)
            java.lang.Object[] r7 = r13.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r9 = "showLoadingViewInternal"
            java.lang.String r10 = "(Z)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r6 = r14
            r1 = r13
            r13 = r16
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r14.setVisibility(r1)
            java.lang.String r7 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r8 = "showLoadingViewInternal"
            java.lang.String r9 = "(Z)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r1 = r0.f205540f
            java.lang.String r6 = "loadingLayout"
            if (r1 == 0) goto L_0x02dc
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r5)
            java.lang.Object[] r18 = r7.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r20 = "showLoadingViewInternal"
            java.lang.String r21 = "(Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r7 = r7.mo10231a(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r18 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r19 = "showLoadingViewInternal"
            java.lang.String r20 = "(Z)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.view.animation.Animation r1 = r0.f205546o
            if (r1 == 0) goto L_0x00be
            r1.cancel()
        L_0x00be:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r26 != 0) goto L_0x0112
            android.view.View r3 = r0.f205540f
            if (r3 == 0) goto L_0x010e
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r5.mo10233c(r1)
            java.lang.Object[] r8 = r5.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r10 = "showLoadingViewInternal"
            java.lang.String r11 = "(Z)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            r7 = r3
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r5.mo10231a(r4)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r3.setAlpha(r1)
            java.lang.String r8 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r9 = "showLoadingViewInternal"
            java.lang.String r10 = "(Z)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setAlpha"
            java.lang.String r13 = "(F)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r0.f205548q
            if (r1 != 0) goto L_0x010d
            r2.invoke()
        L_0x010d:
            return
        L_0x010e:
            gy3.C87412m.m108603p(r6)
            throw r15
        L_0x0112:
            android.view.View r14 = r0.f205540f
            if (r14 == 0) goto L_0x02d8
            k20.a r13 = new k20.a
            r13.<init>()
            r12 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r12)
            r13.mo10233c(r6)
            java.lang.Object[] r7 = r13.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r9 = "showLoadingViewInternal"
            java.lang.String r10 = "(Z)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r16 = "setAlpha"
            java.lang.String r17 = "(F)V"
            r6 = r14
            r12 = r16
            r1 = r13
            r13 = r17
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r14.setAlpha(r1)
            java.lang.String r7 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r8 = "showLoadingViewInternal"
            java.lang.String r9 = "(Z)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setAlpha"
            java.lang.String r12 = "(F)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r1 = r0.f205539e
            if (r1 == 0) goto L_0x016b
            gy3.C87412m.m108591d(r1)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x016b
            r1 = 1
            goto L_0x016c
        L_0x016b:
            r1 = 0
        L_0x016c:
            gy3.c0 r6 = new gy3.c0
            r6.<init>()
            gy3.c0 r7 = new gy3.c0
            r7.<init>()
            if (r1 == 0) goto L_0x01cf
            android.view.View r8 = r0.f205539e
            gy3.C87412m.m108591d(r8)
            float r8 = r8.getTranslationX()
            int[] r9 = r0.f205545n
            r9 = r9[r4]
            float r9 = (float) r9
            float r8 = r8 - r9
            android.view.View r9 = r0.f205539e
            gy3.C87412m.m108591d(r9)
            int r9 = r9.getPaddingLeft()
            float r9 = (float) r9
            float r8 = r8 + r9
            r6.f170634d = r8
            android.view.View r8 = r0.f205539e
            gy3.C87412m.m108591d(r8)
            float r8 = r8.getTranslationY()
            int[] r9 = r0.f205545n
            r10 = 1
            r9 = r9[r10]
            float r9 = (float) r9
            float r8 = r8 - r9
            android.view.View r9 = r0.f205539e
            gy3.C87412m.m108591d(r9)
            int r9 = r9.getPaddingTop()
            float r9 = (float) r9
            float r8 = r8 + r9
            r7.f170634d = r8
            android.view.View r8 = r0.f205541g
            java.lang.String r9 = "loadingIcon"
            if (r8 == 0) goto L_0x01cb
            float r10 = r6.f170634d
            r8.setTranslationX(r10)
            android.view.View r8 = r0.f205541g
            if (r8 == 0) goto L_0x01c7
            float r9 = r7.f170634d
            r8.setTranslationY(r9)
            goto L_0x01d2
        L_0x01c7:
            gy3.C87412m.m108603p(r9)
            throw r15
        L_0x01cb:
            gy3.C87412m.m108603p(r9)
            throw r15
        L_0x01cf:
            r2.invoke()
        L_0x01d2:
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r9[r4] = r8
            java.lang.String r8 = "alvinluo showLoadingViewInternal needDoTranslation: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r8, r9)
            android.view.View r3 = r0.f205539e
            if (r3 == 0) goto L_0x026c
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r5)
            java.lang.Object[] r18 = r8.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r20 = "showLoadingViewInternal"
            java.lang.String r21 = "(Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r5 = r8.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r19 = "showLoadingViewInternal"
            java.lang.String r20 = "(Z)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            k20.a r5 = new k20.a
            r5.<init>()
            r8 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            r5.mo10233c(r9)
            java.lang.Object[] r18 = r5.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r20 = "showLoadingViewInternal"
            java.lang.String r21 = "(Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setAlpha"
            java.lang.String r24 = "(F)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r3.setAlpha(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r19 = "showLoadingViewInternal"
            java.lang.String r20 = "(Z)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.setScaleX(r5)
            r3.setScaleY(r5)
        L_0x026c:
            android.view.View r3 = r0.f205539e
            if (r3 == 0) goto L_0x0279
            android.view.ViewPropertyAnimator r3 = r3.animate()
            if (r3 == 0) goto L_0x0279
            r3.cancel()
        L_0x0279:
            android.view.View r3 = r0.f205539e
            if (r3 == 0) goto L_0x02d7
            android.view.ViewPropertyAnimator r3 = r3.animate()
            if (r3 == 0) goto L_0x02d7
            if (r1 == 0) goto L_0x02af
            int[] r5 = r0.f205545n
            r8 = 1
            r5 = r5[r8]
            float r5 = (float) r5
            android.view.View r8 = r0.f205539e
            gy3.C87412m.m108591d(r8)
            int r8 = r8.getPaddingTop()
            float r8 = (float) r8
            float r5 = r5 - r8
            android.view.ViewPropertyAnimator r5 = r3.translationY(r5)
            if (r5 == 0) goto L_0x02af
            int[] r8 = r0.f205545n
            r4 = r8[r4]
            float r4 = (float) r4
            android.view.View r8 = r0.f205539e
            gy3.C87412m.m108591d(r8)
            int r8 = r8.getPaddingLeft()
            float r8 = (float) r8
            float r4 = r4 - r8
            r5.translationX(r4)
        L_0x02af:
            r4 = 0
            android.view.ViewPropertyAnimator r3 = r3.alpha(r4)
            if (r3 == 0) goto L_0x02d7
            r4 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r4)
            if (r3 == 0) goto L_0x02d7
            com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView$a r4 = new com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView$a
            r4.<init>(r0, r1, r2)
            android.view.ViewPropertyAnimator r2 = r3.setListener(r4)
            if (r2 == 0) goto L_0x02d7
            com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView$b r3 = new com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView$b
            r3.<init>(r0, r1, r6, r7)
            android.view.ViewPropertyAnimator r1 = r2.setUpdateListener(r3)
            if (r1 == 0) goto L_0x02d7
            r1.start()
        L_0x02d7:
            return
        L_0x02d8:
            gy3.C87412m.m108603p(r6)
            throw r15
        L_0x02dc:
            gy3.C87412m.m108603p(r6)
            throw r15
        L_0x02e0:
            java.lang.String r1 = "infoLayout"
            gy3.C87412m.m108603p(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanInfoMaskView.mo97662b(boolean):void");
    }

    public final View getInfoLayout() {
        View view = this.f205542h;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("infoLayout");
        throw null;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f205550s) {
            ImageView imageView = this.f205543i;
            if (imageView != null) {
                imageView.getLocationInWindow(this.f205549r);
            } else {
                C87412m.m108603p("infoIcon");
                throw null;
            }
        }
        if (!this.f205547p) {
            View view = this.f205541g;
            if (view != null) {
                view.getLocationInWindow(this.f205545n);
            } else {
                C87412m.m108603p("loadingIcon");
                throw null;
            }
        }
        Log.m105919d("MicroMsg.ScanInfoMaskView", "alvinluo onMeasure infoIcon location: %d, %d, loadingIcon location: %d, %d, pendingShowInfoLayout: %b, pendingShowLoading: %b, hasGetInfoIconLocation: %b, hasGetLoadingIconLocation: %b", Integer.valueOf(this.f205549r[0]), Integer.valueOf(this.f205549r[1]), Integer.valueOf(this.f205545n[0]), Integer.valueOf(this.f205545n[1]), Boolean.valueOf(this.f205551t), Boolean.valueOf(this.f205553v), Boolean.valueOf(this.f205550s), Boolean.valueOf(this.f205547p));
        int[] iArr = this.f205549r;
        if (!(iArr[0] == 0 && iArr[1] == 0)) {
            this.f205550s = true;
            if (this.f205551t) {
                mo97661a(true);
            } else if (!this.f205552u) {
                View view2 = this.f205542h;
                if (view2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C87412m.m108603p("infoLayout");
                    throw null;
                }
            }
        }
        int[] iArr2 = this.f205545n;
        if (iArr2[0] != 0 || iArr2[1] != 0) {
            this.f205547p = true;
            if (this.f205553v) {
                mo97662b(this.f205554w);
            } else if (!this.f205555x) {
                View view4 = this.f205540f;
                if (view4 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                C87412m.m108603p("loadingLayout");
                throw null;
            }
        }
    }

    public final void setAnchorView(View view) {
        this.f205539e = view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanInfoMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f205545n = new int[2];
        this.f205549r = new int[2];
        this.f205556y = true;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b4w, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.iwf);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.root_container)");
        this.f205538d = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.j1g);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.scan_loading_layout)");
        this.f205540f = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.j1f);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.scan_loading_icon)");
        this.f205541g = findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.j1u);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.scan_result_info_layout)");
        this.f205542h = findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.j1t);
        C87412m.m108593f(findViewById5, "view.findViewById(R.id.scan_result_info_icon)");
        this.f205543i = (ImageView) findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.j1v);
        C87412m.m108593f(findViewById6, "view.findViewById(R.id.scan_result_info_op_button)");
        this.f205544j = (TextView) findViewById6;
        View view = this.f205538d;
        if (view != null) {
            view.setOnTouchListener(C14247x.f39774d);
            View view2 = this.f205542h;
            if (view2 != null) {
                TextView textView = (TextView) view2.findViewById(C0966R.C0970id.j1x);
                if (textView != null) {
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                }
                TextView textView2 = this.f205544j;
                if (textView2 != null) {
                    C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                } else {
                    C87412m.m108603p("opButton");
                    throw null;
                }
            } else {
                C87412m.m108603p("infoLayout");
                throw null;
            }
        } else {
            C87412m.m108603p("root");
            throw null;
        }
    }
}
