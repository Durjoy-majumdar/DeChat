package zo1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.replay.plugin.ReplayTransitionLazyPlugin$transform2Replay$1", mo125469f = "ReplayTransitionLazyPlugin.kt", mo125470l = {248, 249, 250}, mo125471m = "invokeSuspend")
/* renamed from: zo1.i0 */
public final class C16359i0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f43735d;

    /* renamed from: e */
    public final /* synthetic */ C16344b0 f43736e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16359i0(C16344b0 b0Var, C15601d<? super C16359i0> dVar) {
        super(2, dVar);
        this.f43736e = b0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C16359i0(this.f43736e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C16359i0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x01eb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f43735d
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r6 = 3
            r7 = 2
            if (r2 == 0) goto L_0x002d
            if (r2 == r5) goto L_0x0028
            if (r2 == r7) goto L_0x0023
            if (r2 != r6) goto L_0x001b
            kotlin.ResultKt.throwOnFailure(r26)
            goto L_0x01ec
        L_0x001b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r26)
            goto L_0x01e1
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r26)
            goto L_0x00f5
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r26)
            zo1.b0 r2 = r0.f43736e
            r0.f43735d = r5
            r2.getClass()
            wx3.h r5 = new wx3.h
            wx3.d r8 = xx3.C66447b.m78392b(r25)
            r5.<init>(r8)
            gy3.a0 r8 = new gy3.a0
            r8.<init>()
            java.lang.String r9 = r2.f43699r
            java.lang.String r10 = "ReplayTransition2:countdownToPlayReplay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r9 = r2.mo14825d1()
            r10 = 8
            r9.setVisibility(r10)
            android.widget.TextView r9 = r2.mo14824c1()
            r9.setVisibility(r10)
            android.widget.TextView r9 = r2.mo14823b1()
            r9.setVisibility(r10)
            rx3.g r9 = r2.f43703v
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.String r10 = "<get-countDownGroup>(...)"
            gy3.C87412m.m108593f(r9, r10)
            android.view.View r9 = (android.view.View) r9
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r10.mo10233c(r4)
            java.lang.Object[] r12 = r10.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin"
            java.lang.String r14 = "countdownToPlayReplay"
            java.lang.String r15 = "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r9
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r10 = r10.mo10231a(r3)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin"
            java.lang.String r13 = "countdownToPlayReplay"
            java.lang.String r14 = "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            gy3.d0 r9 = new gy3.d0
            r9.<init>()
            r9.f27483d = r6
            rx3.g r10 = r2.f43704w
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            java.lang.String r11 = "<get-countDown>(...)"
            gy3.C87412m.m108593f(r10, r11)
            android.widget.TextView r10 = (android.widget.TextView) r10
            int r11 = r9.f27483d
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r10.setText(r11)
            float[] r10 = new float[r7]
            r10 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofFloat(r10)
            r11 = 3000(0xbb8, double:1.482E-320)
            r10.setDuration(r11)
            zo1.c0 r11 = new zo1.c0
            r11.<init>(r2, r9)
            r10.addUpdateListener(r11)
            zo1.d0 r9 = new zo1.d0
            r9.<init>(r2, r8, r5)
            r10.addListener(r9)
            r10.start()
            java.lang.Object r2 = r5.mo90314b()
            if (r2 != r1) goto L_0x00f5
            return r1
        L_0x00f5:
            zo1.b0 r2 = r0.f43736e
            r0.f43735d = r7
            r2.getClass()
            java.lang.Class<bp1.d> r5 = bp1.C54519d.class
            wx3.h r8 = new wx3.h
            wx3.d r9 = xx3.C66447b.m78392b(r25)
            r8.<init>(r9)
            java.lang.String r9 = r2.f43699r
            java.lang.String r10 = "ReplayTransition2.1:stopTransition"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            gy3.a0 r9 = new gy3.a0
            r9.<init>()
            java.lang.Class<zo1.j0> r10 = zo1.C66925j0.class
            qj1.c r10 = r2.mo87687E0(r10)
            zo1.j0 r10 = (zo1.C66925j0) r10
            if (r10 == 0) goto L_0x0120
            r10.mo90918d1()
        L_0x0120:
            androidx.lifecycle.i0 r10 = r2.mo87696x0(r5)
            bp1.d r10 = (bp1.C54519d) r10
            r10.mo75377l3(r7)
            androidx.lifecycle.i0 r5 = r2.mo87696x0(r5)
            bp1.d r5 = (bp1.C54519d) r5
            r5.f152841C = r3
            com.tencent.mm.plugin.finder.live.view.b r5 = r2.mo14484z0()
            r5.showBlurBg()
            android.view.View r5 = r2.mo14822a1()
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r7.mo10233c(r4)
            java.lang.Object[] r11 = r7.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin"
            java.lang.String r13 = "stopTransition"
            java.lang.String r14 = "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r5
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r4 = r7.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setVisibility(r4)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin"
            java.lang.String r12 = "stopTransition"
            java.lang.String r13 = "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r4 = r2.mo14822a1()
            r5 = 0
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7.mo10233c(r5)
            java.lang.Object[] r18 = r7.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin"
            java.lang.String r20 = "stopTransition"
            java.lang.String r21 = "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setAlpha"
            java.lang.String r24 = "(F)V"
            r17 = r4
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r7.mo10231a(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4.setAlpha(r3)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin"
            java.lang.String r19 = "stopTransition"
            java.lang.String r20 = "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.view.View r2 = r2.mo14822a1()
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            zo1.h0 r3 = new zo1.h0
            r3.<init>(r9, r8)
            android.view.ViewPropertyAnimator r2 = r2.setListener(r3)
            r2.start()
            java.lang.Object r2 = r8.mo90314b()
            if (r2 != r1) goto L_0x01e1
            return r1
        L_0x01e1:
            zo1.b0 r2 = r0.f43736e
            r0.f43735d = r6
            java.lang.Object r2 = zo1.C16344b0.m15192Z0(r2, r0)
            if (r2 != r1) goto L_0x01ec
            return r1
        L_0x01ec:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zo1.C16359i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
