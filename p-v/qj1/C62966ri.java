package qj1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import de1.C7290r;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import sk1.C63956k;

/* renamed from: qj1.ri */
public interface C62966ri {

    /* renamed from: E0 */
    public static final /* synthetic */ int f178670E0 = 0;

    /* renamed from: qj1.ri$a */
    public static final class C12651a {

        /* renamed from: a */
        public static ValueAnimator f36240a;
    }

    /* renamed from: qj1.ri$b */
    public static final class C12652b {

        /* renamed from: qj1.ri$b$a */
        public static final class C12653a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ View f36241d;

            /* renamed from: e */
            public final /* synthetic */ Rect f36242e;

            public C12653a(View view, Rect rect) {
                this.f36241d = view;
                this.f36242e = rect;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f36241d;
                if (view != null) {
                    Rect rect = this.f36242e;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.bottomMargin = (int) (((float) rect.bottom) * floatValue);
                    }
                    view.setTranslationX(((float) rect.left) * floatValue);
                    float f = ((float) 1) - floatValue;
                    view.setScaleX(f);
                    view.setScaleY(f);
                    if (f > 0.22f) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Float.valueOf(f));
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runDelShopBubbleAnimate$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runDelShopBubbleAnimate$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    } else {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(Float.valueOf(0.0f));
                        View view3 = view;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runDelShopBubbleAnimate$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runDelShopBubbleAnimate$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    view.requestLayout();
                }
            }
        }

        /* renamed from: qj1.ri$b$b */
        public static final class C12654b extends C7290r {

            /* renamed from: d */
            public final /* synthetic */ C32224a<C13598b0> f36243d;

            public C12654b(C32224a<C13598b0> aVar) {
                this.f36243d = aVar;
            }

            public void onAnimationEnd(Animator animator) {
                this.f36243d.invoke();
            }
        }

        /* renamed from: qj1.ri$b$c */
        public static final class C12655c implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: d */
            public final /* synthetic */ View f36244d;

            /* renamed from: e */
            public final /* synthetic */ C62966ri f36245e;

            /* renamed from: qj1.ri$b$c$a */
            public static final class C12656a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: d */
                public final /* synthetic */ View f36246d;

                /* renamed from: e */
                public final /* synthetic */ Rect f36247e;

                public C12656a(View view, Rect rect) {
                    this.f36246d = view;
                    this.f36247e = rect;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue = ((Float) animatedValue).floatValue();
                    View view = this.f36246d;
                    if (view != null) {
                        Rect rect = this.f36247e;
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.bottomMargin = (int) ((((float) 1) - floatValue) * ((float) rect.bottom));
                        }
                        view.setTranslationX((((float) 1) - floatValue) * ((float) rect.left));
                        view.setScaleX(floatValue);
                        view.setScaleY(floatValue);
                        if (floatValue > 0.22f) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(Float.valueOf(floatValue));
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimate$1$onPreDraw$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimate$1$onPreDraw$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        } else {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(Float.valueOf(0.0f));
                            View view3 = view;
                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimate$1$onPreDraw$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimate$1$onPreDraw$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                        view.requestLayout();
                    }
                }
            }

            public C12655c(View view, C62966ri riVar) {
                this.f36244d = view;
                this.f36245e = riVar;
            }

            public boolean onPreDraw() {
                this.f36244d.getViewTreeObserver().removeOnPreDrawListener(this);
                Rect f = this.f36245e.mo12184f(this.f36244d);
                int i = C62966ri.f178670E0;
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.2f, 1.0f}).setDuration(300);
                duration.addUpdateListener(new C12656a(this.f36244d, f));
                C12651a.f36240a = duration;
                ValueAnimator valueAnimator = C12651a.f36240a;
                if (valueAnimator == null) {
                    return true;
                }
                valueAnimator.start();
                return true;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: qj1.dg} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: qj1.l0} */
        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v9 */
        /* JADX WARNING: type inference failed for: r11v10 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.graphics.Rect m12152a(qj1.C62966ri r12, android.view.View r13) {
            /*
                java.lang.String r12 = "view"
                gy3.C87412m.m108594g(r13, r12)
                int r12 = r13.getMeasuredWidth()
                int r0 = r13.getMeasuredHeight()
                int[] r1 = o40.C61926c.m72690o(r13)
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                ok1.e r3 = ok1.C62042e.f176370a
                boolean r3 = r3.mo87027N0()
                r4 = 1
                r5 = 0
                r6 = 2
                r7 = 1045220557(0x3e4ccccd, float:0.2)
                r8 = 1058642330(0x3f19999a, float:0.6)
                r9 = 1061997773(0x3f4ccccd, float:0.8)
                java.lang.String r10 = "view.context"
                r11 = 0
                if (r3 == 0) goto L_0x008e
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r3.getClass()
                com.tencent.mm.plugin.finder.live.view.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
                if (r3 == 0) goto L_0x0041
                java.lang.Class<qj1.l0> r11 = qj1.C12490l0.class
                qj1.c r3 = r3.getPlugin(r11)
                r11 = r3
                qj1.l0 r11 = (qj1.C12490l0) r11
            L_0x0041:
                if (r11 == 0) goto L_0x00ee
                sp1.a r3 = r11.f35929s
                android.view.ViewGroup r3 = r3.f38868a
                int[] r3 = o40.C61926c.m72690o(r3)
                android.content.Context r13 = r13.getContext()
                gy3.C87412m.m108593f(r13, r10)
                android.content.res.Resources r13 = r13.getResources()
                android.content.res.Configuration r13 = r13.getConfiguration()
                int r13 = r13.orientation
                if (r13 != r6) goto L_0x005f
                goto L_0x0060
            L_0x005f:
                r4 = 0
            L_0x0060:
                if (r4 == 0) goto L_0x0073
                r13 = r3[r5]
                float r13 = (float) r13
                float r12 = (float) r12
                float r12 = r12 * r9
                float r3 = (float) r6
                float r12 = r12 / r3
                float r13 = r13 - r12
                r12 = r1[r5]
                float r12 = (float) r12
                float r13 = r13 - r12
                int r12 = (int) r13
                r2.left = r12
                goto L_0x0086
            L_0x0073:
                r13 = r3[r5]
                int r1 = r12 / 2
                int r3 = r13 - r1
                r2.left = r3
                if (r13 < r1) goto L_0x0086
                float r12 = (float) r12
                float r12 = r12 * r7
                float r13 = (float) r6
                float r12 = r12 / r13
                int r12 = (int) r12
                int r3 = r3 + r12
                r2.left = r3
            L_0x0086:
                float r12 = (float) r0
                float r12 = r12 * r8
                int r12 = (int) r12
                int r12 = -r12
                r2.bottom = r12
                goto L_0x00ee
            L_0x008e:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r3.getClass()
                com.tencent.mm.plugin.finder.live.view.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
                if (r3 == 0) goto L_0x00a0
                java.lang.Class<qj1.dg> r11 = qj1.C62741dg.class
                qj1.c r3 = r3.getPlugin(r11)
                r11 = r3
                qj1.dg r11 = (qj1.C62741dg) r11
            L_0x00a0:
                if (r11 == 0) goto L_0x00ee
                sp1.q0 r3 = r11.f178123r
                android.view.ViewGroup r3 = r3.mo13127e()
                int[] r3 = o40.C61926c.m72690o(r3)
                android.content.Context r13 = r13.getContext()
                gy3.C87412m.m108593f(r13, r10)
                android.content.res.Resources r13 = r13.getResources()
                android.content.res.Configuration r13 = r13.getConfiguration()
                int r13 = r13.orientation
                if (r13 != r6) goto L_0x00c0
                goto L_0x00c1
            L_0x00c0:
                r4 = 0
            L_0x00c1:
                if (r4 == 0) goto L_0x00d4
                r13 = r3[r5]
                float r13 = (float) r13
                float r12 = (float) r12
                float r12 = r12 * r9
                float r3 = (float) r6
                float r12 = r12 / r3
                float r13 = r13 - r12
                r12 = r1[r5]
                float r12 = (float) r12
                float r13 = r13 - r12
                int r12 = (int) r13
                r2.left = r12
                goto L_0x00e7
            L_0x00d4:
                r13 = r3[r5]
                int r1 = r12 / 2
                int r3 = r13 - r1
                r2.left = r3
                if (r13 < r1) goto L_0x00e7
                float r12 = (float) r12
                float r12 = r12 * r7
                float r13 = (float) r6
                float r12 = r12 / r13
                int r12 = (int) r12
                int r3 = r3 + r12
                r2.left = r3
            L_0x00e7:
                float r12 = (float) r0
                float r12 = r12 * r8
                int r12 = (int) r12
                int r12 = -r12
                r2.bottom = r12
            L_0x00ee:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62966ri.C12652b.m12152a(qj1.ri, android.view.View):android.graphics.Rect");
        }

        /* renamed from: b */
        public static void m12153b(C62966ri riVar, C32224a<C13598b0> aVar) {
            C87412m.m108594g(aVar, "callback");
            View view = riVar.getView();
            Rect f = riVar.mo12184f(view);
            int i = C62966ri.f178670E0;
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.2f, 1.0f}).setDuration(300);
            duration.addUpdateListener(new C12653a(view, f));
            duration.addListener(new C12654b(aVar));
            C12651a.f36240a = duration;
            ValueAnimator valueAnimator = C12651a.f36240a;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }

        /* renamed from: c */
        public static void m12154c(C62966ri riVar) {
            View view = riVar.getView();
            view.getViewTreeObserver().addOnPreDrawListener(new C12655c(view, riVar));
        }
    }

    /* renamed from: A */
    void mo12174A(Bundle bundle, long j);

    /* renamed from: C */
    void mo12175C(Object obj);

    /* renamed from: F */
    void mo12176F(C32224a<C13598b0> aVar);

    /* renamed from: J */
    C63956k mo12177J();

    /* renamed from: Q */
    void mo12178Q();

    /* renamed from: V */
    int mo12179V();

    /* renamed from: a0 */
    int mo12180a0();

    /* renamed from: e */
    void mo12183e(Bundle bundle, Object obj, long j);

    /* renamed from: f */
    Rect mo12184f(View view);

    View getView();

    /* renamed from: k */
    void mo12186k();

    void onPause();

    void onResume();

    /* renamed from: t */
    void mo12189t(Object obj);

    /* renamed from: w */
    void mo12190w();
}
