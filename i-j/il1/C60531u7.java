package il1;

import android.view.View;
import te3.C64247az0;

/* renamed from: il1.u7 */
public final class C60531u7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f172534d;

    /* renamed from: e */
    public final /* synthetic */ C64247az0 f172535e;

    public C60531u7(C60362c7 c7Var, C64247az0 az02) {
        this.f172534d = c7Var;
        this.f172535e = az02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        r5 = r3.f186593q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r45) {
        /*
            r44 = this;
            r6 = r44
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r45
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$4"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r44
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            il1.c7 r0 = r6.f172534d
            te3.az0 r1 = r6.f172535e
            r0.getClass()
            te3.yr1 r2 = r1.f182184n
            if (r2 == 0) goto L_0x013a
            te3.ds1 r2 = r2.f186593q
            if (r2 == 0) goto L_0x013a
            java.lang.String r2 = r2.f182844d
            if (r2 != 0) goto L_0x0035
            goto L_0x013a
        L_0x0035:
            di0.o r2 = new di0.o
            r2.<init>()
            te3.yr1 r3 = r1.f182184n
            r4 = 0
            if (r3 == 0) goto L_0x0046
            te3.ds1 r5 = r3.f186593q
            if (r5 == 0) goto L_0x0046
            java.lang.String r5 = r5.f182844d
            goto L_0x0047
        L_0x0046:
            r5 = r4
        L_0x0047:
            r2.f250930b = r5
            if (r3 == 0) goto L_0x0052
            te3.ds1 r3 = r3.f186593q
            if (r3 == 0) goto L_0x0052
            int r3 = r3.f182846f
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            r2.f250931c = r3
            ok1.e r3 = ok1.C62042e.f176370a
            int r5 = r3.mo87069c0()
            if (r5 == 0) goto L_0x0063
            int r3 = r3.mo87069c0()
            r2.f250931c = r3
        L_0x0063:
            te3.yr1 r3 = r1.f182184n
            if (r3 == 0) goto L_0x006d
            te3.ds1 r3 = r3.f186593q
            if (r3 == 0) goto L_0x006d
            java.lang.String r4 = r3.f182845e
        L_0x006d:
            r2.f250934f = r4
            r3 = 1205(0x4b5, float:1.689E-42)
            r2.f250939k = r3
            il1.n7 r3 = new il1.n7
            r3.<init>(r1)
            r2.f250937i = r3
            qo3.w r1 = r0.f172130o
            r3 = -1
            if (r1 == 0) goto L_0x008a
            android.view.View r1 = r1.f36927f
            if (r1 == 0) goto L_0x008a
            int r1 = r1.getHeight()
            r26 = r1
            goto L_0x008c
        L_0x008a:
            r26 = -1
        L_0x008c:
            qo3.w r1 = r0.f172130o
            if (r1 == 0) goto L_0x009b
            android.view.ViewGroup r1 = r1.f36921B
            if (r1 == 0) goto L_0x009b
            int r3 = r1.getWidth()
            r27 = r3
            goto L_0x009d
        L_0x009b:
            r27 = -1
        L_0x009d:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r10 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.SLIDE
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$BackgroundShapeConfig r1 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$BackgroundShapeConfig
            android.view.ViewGroup r3 = r0.f172116a
            android.content.Context r3 = r3.getContext()
            r4 = 2131165307(0x7f07007b, float:1.7944827E38)
            int r3 = kg3.C76577a.m92155f(r3, r4)
            float r12 = (float) r3
            r13 = 1
            r14 = 1
            r15 = 0
            r16 = 0
            r17 = 24
            r18 = 0
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CloseWhenClickEmptyAreaConfig r14 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CloseWhenClickEmptyAreaConfig
            android.view.ViewGroup r3 = r0.f172116a
            android.content.Context r3 = r3.getContext()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            qj1.c r4 = r0.f172118c
            boolean r4 = r4.mo82893g0()
            if (r4 == 0) goto L_0x00d6
            r4 = r10
            goto L_0x00d8
        L_0x00d6:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r4 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.POPUP
        L_0x00d8:
            r14.<init>(r3, r4)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r15 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.HIDE
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$f r19 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55456f.FAKE_NATIVE
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig
            r7 = r3
            r8 = 1
            r11 = 1
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = -4996064(0xffffffffffb3c420, float:NaN)
            r42 = 1
            r43 = 0
            r9 = r26
            r12 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r2.f250912A = r3
            il1.j7 r1 = new il1.j7
            r1.<init>(r0)
            r2.f250916E = r1
            java.lang.Class<kr0.x0> r1 = kr0.C76630x0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kr0.x0 r1 = (kr0.C76630x0) r1
            android.view.ViewGroup r3 = r0.f172116a
            android.content.Context r3 = r3.getContext()
            r1.mo106898tv(r3, r2)
            r0.f172112N = r2
        L_0x013a:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$4"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60531u7.onClick(android.view.View):void");
    }
}
