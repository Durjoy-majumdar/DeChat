package hs1;

import a14.C0000n0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.finder.view.notice.HighLightGreenBgView;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import sq2.C13774c;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView$executeHighFlashing$1", mo125469f = "HighLightGreenBgView.kt", mo125470l = {54, 56, 71}, mo125471m = "invokeSuspend")
/* renamed from: hs1.a */
public final class C8732a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f27996d;

    /* renamed from: e */
    public final /* synthetic */ HighLightGreenBgView f27997e;

    /* renamed from: hs1.a$a */
    public static final class C8733a extends C13774c {

        /* renamed from: d */
        public final /* synthetic */ HighLightGreenBgView f27998d;

        public C8733a(HighLightGreenBgView highLightGreenBgView) {
            this.f27998d = highLightGreenBgView;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f27998d.f18302e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView$executeHighFlashing$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView$executeHighFlashing$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    /* renamed from: hs1.a$b */
    public static final class C8734b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ HighLightGreenBgView f27999d;

        public C8734b(HighLightGreenBgView highLightGreenBgView) {
            this.f27999d = highLightGreenBgView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f27999d.f18302e;
            if (view != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView$executeHighFlashing$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView$executeHighFlashing$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    /* renamed from: hs1.a$c */
    public static final class C8735c extends C13774c {

        /* renamed from: d */
        public final /* synthetic */ HighLightGreenBgView f28000d;

        public C8735c(HighLightGreenBgView highLightGreenBgView) {
            this.f28000d = highLightGreenBgView;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f28000d.f18302e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView$executeHighFlashing$1$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView$executeHighFlashing$1$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    /* renamed from: hs1.a$d */
    public static final class C8736d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ HighLightGreenBgView f28001d;

        public C8736d(HighLightGreenBgView highLightGreenBgView) {
            this.f28001d = highLightGreenBgView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f28001d.f18302e;
            if (view != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView$executeHighFlashing$1$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView$executeHighFlashing$1$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8732a(HighLightGreenBgView highLightGreenBgView, C15601d<? super C8732a> dVar) {
        super(2, dVar);
        this.f27997e = highLightGreenBgView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8732a(this.f27997e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8732a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f27996d
            r2 = 3
            r3 = 1
            r4 = 2
            r5 = 300(0x12c, double:1.48E-321)
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x0021
            if (r1 == r4) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0089
        L_0x0015:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x005d
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0054
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r9)
            float[] r9 = new float[r4]
            r9 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            hs1.a$a r1 = new hs1.a$a
            com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView r7 = r8.f27997e
            r1.<init>(r7)
            r9.addListener(r1)
            hs1.a$b r1 = new hs1.a$b
            com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView r7 = r8.f27997e
            r1.<init>(r7)
            r9.addUpdateListener(r1)
            r9.setDuration(r5)
            r9.start()
            r8.f27996d = r3
            java.lang.Object r9 = a14.C53965x0.m60607b(r5, r8)
            if (r9 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r8.f27996d = r4
            java.lang.Object r9 = a14.C53965x0.m60607b(r5, r8)
            if (r9 != r0) goto L_0x005d
            return r0
        L_0x005d:
            float[] r9 = new float[r4]
            r9 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            hs1.a$c r1 = new hs1.a$c
            com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView r3 = r8.f27997e
            r1.<init>(r3)
            r9.addListener(r1)
            hs1.a$d r1 = new hs1.a$d
            com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView r3 = r8.f27997e
            r1.<init>(r3)
            r9.addUpdateListener(r1)
            r9.setDuration(r5)
            r9.start()
            r8.f27996d = r2
            java.lang.Object r9 = a14.C53965x0.m60607b(r5, r8)
            if (r9 != r0) goto L_0x0089
            return r0
        L_0x0089:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hs1.C8732a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
