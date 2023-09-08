package rl1;

import a14.C0000n0;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import il1.C8968f2;
import rx3.C13598b0;
import te3.C48659a31;
import te3.C48779ay0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.FinderLiveLotteryPanelWidget$lotteryListAdapter$1$1$1", mo125469f = "FinderLiveLotteryPanelWidget.kt", mo125470l = {84, 92}, mo125471m = "invokeSuspend")
/* renamed from: rl1.s */
public final class C13075s extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f37226d;

    /* renamed from: e */
    public final /* synthetic */ C13053n f37227e;

    /* renamed from: f */
    public final /* synthetic */ C48659a31 f37228f;

    /* renamed from: g */
    public final /* synthetic */ C13044k f37229g;

    /* renamed from: rl1.s$a */
    public static final class C13076a extends C87413o implements C32226l<C48779ay0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13053n f37230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13076a(C13053n nVar) {
            super(1);
            this.f37230d = nVar;
        }

        public Object invoke(Object obj) {
            C48779ay0 ay02 = (C48779ay0) obj;
            C87412m.m108594g(ay02, LocaleUtil.ITALIAN);
            View findViewById = this.f37230d.getRootView().findViewById(C0966R.C0970id.dkg);
            C87412m.m108593f(findViewById, "rootView.findViewById(R.id.finder_live_exception)");
            new C8968f2(findViewById, (String) null, (String) null, 6, (C8480h) null).mo9779c(7, ay02, 0, C13074r.f37225d);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13075s(C13053n nVar, C48659a31 a312, C13044k kVar, C15601d<? super C13075s> dVar) {
        super(2, dVar);
        this.f37227e = nVar;
        this.f37228f = a312;
        this.f37229g = kVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13075s(this.f37227e, this.f37228f, this.f37229g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13075s) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            r34 = this;
            r0 = r34
            java.lang.Class<rl1.d0> r1 = rl1.C13022d0.class
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r0.f37226d
            r4 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0029
            if (r3 == r6) goto L_0x0020
            if (r3 != r4) goto L_0x0018
            kotlin.ResultKt.throwOnFailure(r35)
            r1 = r0
            r0 = r35
            goto L_0x014e
        L_0x0018:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r35)
            r0 = r35
            r33 = r1
            goto L_0x00e6
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r35)
            rl1.n r3 = r0.f37227e
            androidx.lifecycle.i0 r3 = r3.mo12557c(r1)
            rl1.d0 r3 = (rl1.C13022d0) r3
            if (r3 == 0) goto L_0x00e9
            te3.a31 r7 = r0.f37228f
            rl1.n r8 = r0.f37227e
            android.view.View r8 = r8.f37179o
            android.content.Context r10 = r8.getContext()
            java.lang.String r8 = "root.context"
            gy3.C87412m.m108593f(r10, r8)
            r0.f37226d = r6
            wx3.h r8 = new wx3.h
            wx3.d r9 = xx3.C66447b.m78392b(r34)
            r8.<init>(r9)
            dj1.a0 r15 = new dj1.a0
            java.lang.Class<cl1.u> r9 = cl1.C55001u.class
            dj1.b0 r11 = new dj1.b0
            androidx.lifecycle.i0 r12 = r3.business(r9)
            cl1.u r12 = (cl1.C55001u) r12
            te3.c21 r12 = r12.f154420q
            long r12 = r12.f182392d
            androidx.lifecycle.i0 r14 = r3.business(r9)
            cl1.u r14 = (cl1.C55001u) r14
            long r4 = r14.f154416j
            androidx.lifecycle.i0 r14 = r3.business(r9)
            cl1.u r14 = (cl1.C55001u) r14
            java.lang.String r14 = r14.f154423t
            int r6 = r7.f130268e
            r33 = r1
            java.lang.String r1 = r7.f130269f
            java.lang.String r16 = ""
            if (r1 != 0) goto L_0x007e
            r23 = r16
            goto L_0x0080
        L_0x007e:
            r23 = r1
        L_0x0080:
            te3.u21 r1 = r7.f130270g
            if (r1 == 0) goto L_0x0089
            int r0 = r1.f142563d
            r24 = r0
            goto L_0x008b
        L_0x0089:
            r24 = 0
        L_0x008b:
            if (r1 == 0) goto L_0x0095
            java.lang.String r0 = r1.f142564e
            if (r0 != 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            r25 = r0
            goto L_0x0097
        L_0x0095:
            r25 = r16
        L_0x0097:
            int r0 = r7.f130271h
            r27 = r0
            long r0 = r7.f130272i
            r28 = r0
            androidx.lifecycle.i0 r0 = r3.business(r9)
            cl1.u r0 = (cl1.C55001u) r0
            byte[] r0 = r0.f154417n
            pe3.b r30 = pe3.C89349b.m111674a(r0)
            te3.v21 r0 = r7.f130273j
            r31 = r0
            int r0 = r7.f130267d
            r32 = r0
            r26 = 0
            r16 = r11
            r17 = r12
            r19 = r4
            r21 = r14
            r22 = r6
            r16.<init>(r17, r19, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32)
            r15.<init>(r11)
            r11 = 0
            r12 = 0
            r14 = 6
            r0 = 0
            r9 = r15
            r1 = r15
            r15 = r0
            it1.C60625c.m70894l(r9, r10, r11, r12, r14, r15)
            nr3.e r0 = r1.mo9225i()
            rl1.g0 r1 = new rl1.g0
            r1.<init>(r3, r8)
            r0.mo123420E(r1)
            r0.mo11397F(r3)
            java.lang.Object r0 = r8.mo90314b()
            if (r0 != r2) goto L_0x00e6
            return r2
        L_0x00e6:
            rx3.l r0 = (rx3.C13604l) r0
            goto L_0x00ec
        L_0x00e9:
            r33 = r1
            r0 = 0
        L_0x00ec:
            if (r0 == 0) goto L_0x00fb
            A r1 = r0.f38555d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 1
            if (r1 != r3) goto L_0x00fc
            r1 = 1
            goto L_0x00fd
        L_0x00fb:
            r3 = 1
        L_0x00fc:
            r1 = 0
        L_0x00fd:
            if (r1 == 0) goto L_0x0151
            r1 = r34
            rl1.n r0 = r1.f37227e
            r0.mo12558d()
            te3.a31 r0 = r1.f37228f
            int r4 = r0.f130274n
            if (r4 == r3) goto L_0x0137
            r0.f130274n = r3
            rl1.n r3 = r1.f37227e
            android.view.View r3 = r3.f37179o
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131827774(0x7f111c3e, float:1.928847E38)
            java.lang.String r3 = r3.getString(r4)
            r0.f130275o = r3
            rl1.k r0 = r1.f37229g
            te3.a31 r3 = r1.f37228f
            r0.getClass()
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r3, r4)
            rl1.l r4 = new rl1.l
            r4.<init>(r0, r3)
            o40.C61926c.m72668M(r4)
        L_0x0137:
            rl1.n r0 = r1.f37227e
            r3 = r33
            androidx.lifecycle.i0 r0 = r0.mo12557c(r3)
            rl1.d0 r0 = (rl1.C13022d0) r0
            if (r0 == 0) goto L_0x017d
            r3 = 2
            r1.f37226d = r3
            r3 = 0
            java.lang.Object r0 = r0.mo12540f3(r3, r1)
            if (r0 != r2) goto L_0x014e
            return r2
        L_0x014e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x017d
        L_0x0151:
            r1 = r34
            if (r0 == 0) goto L_0x017d
            B r0 = r0.f38556e
            te3.ay0 r0 = (te3.C48779ay0) r0
            if (r0 == 0) goto L_0x017d
            rl1.n r2 = r1.f37227e
            android.view.View r3 = r2.f37179o
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131827272(0x7f111a48, float:1.9287452E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "root.resources.getString…live_create_lottery_fail)"
            gy3.C87412m.m108593f(r3, r4)
            rl1.s$a r4 = new rl1.s$a
            r4.<init>(r2)
            rl1.q0 r2 = new rl1.q0
            r2.<init>(r0, r3, r4)
            o40.C61926c.m72668M(r2)
        L_0x017d:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.C13075s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
