package il1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorLikeWidget$startPostLike$1", mo125469f = "FinderLiveVisitorLikeWidget.kt", mo125470l = {174}, mo125471m = "invokeSuspend")
/* renamed from: il1.p8 */
public final class C60495p8 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f172442d;

    /* renamed from: e */
    public int f172443e;

    /* renamed from: f */
    public final /* synthetic */ C60424h8 f172444f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60495p8(C60424h8 h8Var, C15601d<? super C60495p8> dVar) {
        super(2, dVar);
        this.f172444f = h8Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60495p8(this.f172444f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60495p8) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0169 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0041  */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r12.f172443e
            r3 = 1
            if (r2 == 0) goto L_0x001b
            if (r2 != r3) goto L_0x0013
            int r2 = r12.f172442d
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L_0x016a
        L_0x0013:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r13)
            il1.h8 r13 = r12.f172444f
            java.lang.String r13 = r13.f172287r
            java.lang.String r2 = "[postLikeJob] run in scope"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            r13 = r12
        L_0x0028:
            il1.h8 r2 = r13.f172444f
            java.lang.String r2 = r2.f172287r
            java.lang.String r4 = "[postLikeJob] run in while"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            il1.h8 r2 = r13.f172444f
            int r4 = r2.f172276A
            int r4 = r4 + r3
            int r5 = r2.f172288s
            int r4 = r4 % r5
            java.lang.String r5 = "PARAM_LIVE_LIKE_CONFETTI_Y"
            java.lang.String r6 = "PARAM_LIVE_LIKE_CONFETTI_X"
            r7 = 2
            r8 = 0
            if (r4 != 0) goto L_0x0101
            ok1.e r4 = ok1.C62042e.f176370a
            qj1.c r2 = r2.f172286q
            fj1.b r2 = r2.mo87684A0()
            r4.getClass()
            java.lang.String r4 = "buContext"
            gy3.C87412m.m108594g(r2, r4)
            androidx.lifecycle.i0 r2 = r2.mo71262a(r0)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154388y0
            r4 = 524288(0x80000, float:7.34684E-40)
            boolean r2 = o40.C61926c.m72696u(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "[isDisableLikeHeadIcon] isDisable = "
            r4.append(r9)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = "FinderLiveUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            if (r2 == 0) goto L_0x0079
            goto L_0x0101
        L_0x0079:
            il1.h8 r2 = r13.f172444f
            int r4 = r2.f172276A
            int r4 = r4 + r3
            int r9 = r2.f172288s
            int r4 = r4 % r9
            if (r4 != 0) goto L_0x00ff
            int r4 = r2.f172280E
            int r4 = r4 + r3
            r2.f172280E = r4
            r2.mo85398b1()
            int r4 = r2.f172276A
            int r4 = r4 + r3
            r2.f172276A = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            int[] r9 = new int[r7]
            r9 = {0, 0} // fill-array
            android.view.ViewGroup r10 = r2.f166287d
            r10.getLocationOnScreen(r9)
            r8 = r9[r8]
            android.view.ViewGroup r10 = r2.f166287d
            int r10 = r10.getWidth()
            float r10 = (float) r10
            android.view.ViewGroup r11 = r2.f166287d
            float r11 = r11.getScaleX()
            float r10 = r10 * r11
            float r11 = (float) r7
            float r10 = r10 / r11
            int r10 = (int) r10
            int r8 = r8 + r10
            int r10 = y50.C66524m.C66525a.f191367b
            int r10 = r10 / r7
            int r8 = r8 - r10
            r4.putInt(r6, r8)
            r6 = r9[r3]
            android.view.ViewGroup r7 = r2.f166287d
            android.content.Context r7 = r7.getContext()
            r8 = 8
            int r7 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r7, r8)
            int r6 = r6 - r7
            r4.putInt(r5, r6)
            qj1.c r5 = r2.f172286q
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r0)
            cl1.o r5 = (cl1.C54991o) r5
            te3.fs0 r5 = r5.mo75986U3()
            java.lang.String r5 = r5.f183214e
            if (r5 != 0) goto L_0x00e1
            java.lang.String r5 = eb0.C75592q0.m90789s()
        L_0x00e1:
            java.lang.String r6 = "PARAM_FINDER_LIVE_HEAD_URL"
            r4.putString(r6, r5)
            il1.k8 r5 = new il1.k8
            r5.<init>(r2, r4)
            o40.C61926c.m72668M(r5)
            qj1.c r4 = r2.f172286q
            cj1.n5 r4 = r4.mo14476D0()
            if (r4 == 0) goto L_0x015c
            il1.l8 r5 = new il1.l8
            r5.<init>(r2)
            r4.mo75745m(r5)
            goto L_0x015c
        L_0x00ff:
            r2 = 0
            goto L_0x015d
        L_0x0101:
            il1.h8 r2 = r13.f172444f
            int r4 = r2.f172280E
            int r4 = r4 + r3
            r2.f172280E = r4
            java.lang.String r4 = r2.f172287r
            java.lang.String r9 = "[postLike]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            r2.mo85398b1()
            int r4 = r2.f172276A
            int r4 = r4 + r3
            r2.f172276A = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            int[] r9 = new int[r7]
            r9 = {0, 0} // fill-array
            android.view.ViewGroup r10 = r2.f166287d
            r10.getLocationOnScreen(r9)
            r8 = r9[r8]
            android.view.ViewGroup r10 = r2.f166287d
            int r10 = r10.getWidth()
            float r10 = (float) r10
            android.view.ViewGroup r11 = r2.f166287d
            float r11 = r11.getScaleX()
            float r10 = r10 * r11
            float r11 = (float) r7
            float r10 = r10 / r11
            int r10 = (int) r10
            int r8 = r8 + r10
            int r10 = y50.C66524m.C66525a.f191366a
            int r10 = r10 / r7
            int r8 = r8 - r10
            r4.putInt(r6, r8)
            r6 = r9[r3]
            android.view.ViewGroup r7 = r2.f166287d
            android.content.Context r7 = r7.getContext()
            r8 = 16
            int r7 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r7, r8)
            int r6 = r6 - r7
            r4.putInt(r5, r6)
            il1.m8 r5 = new il1.m8
            r5.<init>(r2, r4)
            o40.C61926c.m72668M(r5)
        L_0x015c:
            r2 = 1
        L_0x015d:
            r4 = 200(0xc8, double:9.9E-322)
            r13.f172442d = r2
            r13.f172443e = r3
            java.lang.Object r4 = a14.C53965x0.m60607b(r4, r13)
            if (r4 != r1) goto L_0x016a
            return r1
        L_0x016a:
            if (r2 != 0) goto L_0x0028
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60495p8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
