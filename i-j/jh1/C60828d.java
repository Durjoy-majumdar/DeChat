package jh1;

import a14.C0000n0;
import fh1.C58999c1;
import fy3.C32227p;
import rx3.C13598b0;
import te3.C64622p31;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.LiveMileStoneLotteryResultWinnerPage$bindWinnerPage$3", mo125469f = "LiveMileStoneLotteryResultWinnerPage.kt", mo125470l = {266, 300}, mo125471m = "invokeSuspend")
/* renamed from: jh1.d */
public final class C60828d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f173276d;

    /* renamed from: e */
    public final /* synthetic */ C64622p31 f173277e;

    /* renamed from: f */
    public final /* synthetic */ C60826c f173278f;

    /* renamed from: g */
    public final /* synthetic */ C58999c1.C59000a f173279g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60828d(C64622p31 p312, C60826c cVar, C58999c1.C59000a aVar, C15601d<? super C60828d> dVar) {
        super(2, dVar);
        this.f173277e = p312;
        this.f173278f = cVar;
        this.f173279g = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60828d(this.f173277e, this.f173278f, this.f173279g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60828d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: te3.a61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: te3.a61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: te3.a61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: te3.a61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: te3.a61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: te3.a61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: te3.a61} */
    /* JADX WARNING: type inference failed for: r8v10, types: [te3.dx2] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            fh1.c1$a r1 = fh1.C58999c1.C59000a.CUSTOM_OPEN
            java.lang.Class<cl1.x0> r2 = cl1.C55006x0.class
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r0.f173276d
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0020
            if (r4 == r6) goto L_0x001b
            if (r4 != r5) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r26)
            goto L_0x01fd
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r26)
            te3.p31 r4 = r0.f173277e
            te3.nx2 r4 = r4.f184748f
            r7 = 0
            if (r4 == 0) goto L_0x0030
            int r4 = r4.f184578g
            if (r4 != r6) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            r8 = 0
            java.lang.String r9 = ""
            if (r4 == 0) goto L_0x0160
            jh1.c r4 = r0.f173278f
            fh1.c1 r4 = r4.f173256e
            androidx.lifecycle.i0 r4 = r4.business(r2)
            cl1.x0 r4 = (cl1.C55006x0) r4
            te3.p31 r10 = r0.f173277e
            java.lang.String r10 = r10.f184746d
            if (r10 != 0) goto L_0x0047
            r10 = r9
        L_0x0047:
            java.lang.Object r4 = r4.mo76052d3(r10)
            boolean r10 = r4 instanceof te3.C64695s31
            if (r10 == 0) goto L_0x0052
            te3.s31 r4 = (te3.C64695s31) r4
            goto L_0x0053
        L_0x0052:
            r4 = r8
        L_0x0053:
            if (r4 == 0) goto L_0x005a
            int r10 = r4.f185323d
            if (r10 != r5) goto L_0x005a
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x00c9
            jh1.c r5 = r0.f173278f
            android.widget.TextView r5 = r5.f173262n
            if (r5 != 0) goto L_0x0063
            goto L_0x0070
        L_0x0063:
            te3.wr2 r7 = r4.f185324e
            if (r7 == 0) goto L_0x006c
            java.lang.String r7 = r7.f186194h
            if (r7 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r7 = r9
        L_0x006d:
            r5.setText(r7)
        L_0x0070:
            jh1.c r10 = r0.f173278f
            jh1.c$a r11 = jh1.C60826c.C60827a.COUPON_USE
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131828075(0x7f111d6b, float:1.928908E38)
            java.lang.String r12 = r5.getString(r7)
            java.lang.String r5 = "getContext().resources.g…ottery_winner_cash_tip_2)"
            gy3.C87412m.m108593f(r12, r5)
            r13 = 2131100642(0x7f0603e2, float:1.7813671E38)
            r14 = 1099431936(0x41880000, float:17.0)
            r15 = 0
            r16 = 1
            r17 = 1
            r10.mo85744d(r11, r12, r13, r14, r15, r16, r17)
            jh1.c r5 = r0.f173278f
            java.lang.String r5 = r5.f173257f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "lotteryInfo coupon_info:"
            r7.append(r10)
            te3.p31 r10 = r0.f173277e
            te3.qx2 r10 = r10.f184751i
            if (r10 == 0) goto L_0x00ab
            te3.dx2 r8 = r10.f185091n
        L_0x00ab:
            if (r8 != 0) goto L_0x00ae
            r8 = r9
        L_0x00ae:
            org.json.JSONObject r8 = o40.C61937h.m72709h(r8)
            r7.append(r8)
            java.lang.String r8 = ";cache coupon_info:"
            r7.append(r8)
            org.json.JSONObject r8 = o40.C61937h.m72709h(r4)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            goto L_0x0108
        L_0x00c9:
            jh1.c r5 = r0.f173278f
            android.widget.TextView r5 = r5.f173262n
            if (r5 != 0) goto L_0x00d0
            goto L_0x00e3
        L_0x00d0:
            te3.p31 r7 = r0.f173277e
            te3.qx2 r7 = r7.f184751i
            if (r7 == 0) goto L_0x00df
            te3.dx2 r7 = r7.f185091n
            if (r7 == 0) goto L_0x00df
            java.lang.String r7 = r7.f182903g
            if (r7 == 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r7 = r9
        L_0x00e0:
            r5.setText(r7)
        L_0x00e3:
            jh1.c r10 = r0.f173278f
            jh1.c$a r11 = jh1.C60826c.C60827a.COUPON_NOT_USE
            te3.p31 r5 = r0.f173277e
            te3.qx2 r5 = r5.f184751i
            if (r5 == 0) goto L_0x00f8
            te3.dx2 r5 = r5.f185091n
            if (r5 == 0) goto L_0x00f8
            java.lang.String r5 = r5.f182902f
            if (r5 != 0) goto L_0x00f6
            goto L_0x00f8
        L_0x00f6:
            r12 = r5
            goto L_0x00f9
        L_0x00f8:
            r12 = r9
        L_0x00f9:
            r13 = 2131100664(0x7f0603f8, float:1.7813716E38)
            r14 = 1099431936(0x41880000, float:17.0)
            r15 = 2131232687(0x7f0807af, float:1.808149E38)
            r16 = 0
            r17 = 1
            r10.mo85744d(r11, r12, r13, r14, r15, r16, r17)
        L_0x0108:
            fh1.c1$a r5 = r0.f173279g
            if (r5 != r1) goto L_0x0119
            jh1.c r1 = r0.f173278f
            te3.p31 r2 = r0.f173277e
            r0.f173276d = r6
            java.lang.Object r1 = jh1.C60826c.m71224a(r1, r2, r0)
            if (r1 != r3) goto L_0x01fd
            return r3
        L_0x0119:
            if (r4 != 0) goto L_0x01fd
            jh1.c r1 = r0.f173278f
            fh1.c1 r1 = r1.f173256e
            androidx.lifecycle.i0 r1 = r1.business(r2)
            cl1.x0 r1 = (cl1.C55006x0) r1
            te3.p31 r2 = r0.f173277e
            java.lang.String r2 = r2.f184746d
            if (r2 != 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            r9 = r2
        L_0x012d:
            te3.s31 r2 = new te3.s31
            r2.<init>()
            te3.p31 r3 = r0.f173277e
            r2.f185323d = r6
            te3.qx2 r3 = r3.f184751i
            if (r3 == 0) goto L_0x0159
            te3.dx2 r3 = r3.f185091n
            if (r3 == 0) goto L_0x0159
            te3.wr2 r4 = new te3.wr2
            r4.<init>()
            java.lang.String r5 = r3.f182900d
            r4.f186190d = r5
            java.lang.String r5 = r3.f182901e
            r4.f186191e = r5
            java.lang.String r5 = r3.f182902f
            r4.f186192f = r5
            pe3.b r5 = r3.f182904h
            r4.f186193g = r5
            java.lang.String r3 = r3.f182903g
            r4.f186194h = r3
            r2.f185324e = r4
        L_0x0159:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r1.mo76058k3(r9, r2)
            goto L_0x01fd
        L_0x0160:
            jh1.c r4 = r0.f173278f
            android.widget.TextView r4 = r4.f173262n
            if (r4 != 0) goto L_0x0167
            goto L_0x016a
        L_0x0167:
            r4.setText(r9)
        L_0x016a:
            jh1.c r4 = r0.f173278f
            fh1.c1 r4 = r4.f173256e
            androidx.lifecycle.i0 r2 = r4.business(r2)
            cl1.x0 r2 = (cl1.C55006x0) r2
            te3.p31 r4 = r0.f173277e
            java.lang.String r4 = r4.f184746d
            if (r4 != 0) goto L_0x017b
            goto L_0x017c
        L_0x017b:
            r9 = r4
        L_0x017c:
            java.lang.Object r2 = r2.mo76052d3(r9)
            boolean r4 = r2 instanceof te3.C64224a61
            if (r4 == 0) goto L_0x0187
            r8 = r2
            te3.a61 r8 = (te3.C64224a61) r8
        L_0x0187:
            if (r8 == 0) goto L_0x018f
            boolean r2 = r8.f182035d
            if (r2 != r6) goto L_0x018f
            r2 = 1
            goto L_0x0190
        L_0x018f:
            r2 = 0
        L_0x0190:
            if (r2 == 0) goto L_0x01b7
            jh1.c r9 = r0.f173278f
            jh1.c$a r10 = jh1.C60826c.C60827a.REDPACKET_RECEIVE
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131828074(0x7f111d6a, float:1.9289079E38)
            java.lang.String r11 = r2.getString(r4)
            java.lang.String r2 = "getContext().resources.g…ottery_winner_cash_tip_1)"
            gy3.C87412m.m108593f(r11, r2)
            r12 = 2131100642(0x7f0603e2, float:1.7813671E38)
            r13 = 1099431936(0x41880000, float:17.0)
            r14 = 0
            r15 = 0
            r16 = 0
            r9.mo85744d(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01e2
        L_0x01b7:
            jh1.c r2 = r0.f173278f
            jh1.c$a r18 = jh1.C60826c.C60827a.REDPACKET_NOT_RECEIVE
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r9 = 2131828073(0x7f111d69, float:1.9289077E38)
            java.lang.String r4 = r4.getString(r9)
            java.lang.String r9 = "getContext().resources.g…_lottery_winner_cash_tip)"
            gy3.C87412m.m108593f(r4, r9)
            r20 = 2131100664(0x7f0603f8, float:1.7813716E38)
            r21 = 1099431936(0x41880000, float:17.0)
            r22 = 2131232687(0x7f0807af, float:1.808149E38)
            r23 = 0
            r24 = 1
            r17 = r2
            r19 = r4
            r17.mo85744d(r18, r19, r20, r21, r22, r23, r24)
        L_0x01e2:
            fh1.c1$a r2 = r0.f173279g
            if (r2 != r1) goto L_0x01fd
            if (r8 == 0) goto L_0x01ed
            boolean r1 = r8.f182035d
            if (r1 != r6) goto L_0x01ed
            goto L_0x01ee
        L_0x01ed:
            r6 = 0
        L_0x01ee:
            if (r6 != 0) goto L_0x01fd
            jh1.c r1 = r0.f173278f
            te3.p31 r2 = r0.f173277e
            r0.f173276d = r5
            java.lang.Object r1 = jh1.C60826c.m71225b(r1, r2, r0)
            if (r1 != r3) goto L_0x01fd
            return r3
        L_0x01fd:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60828d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
