package wf1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.uic.FinderLivePostPendingUIC$prepare$1", mo125469f = "FinderLivePostPendingUIC.kt", mo125470l = {98, 111, 122, 141}, mo125471m = "invokeSuspend")
/* renamed from: wf1.v0 */
public final class C15245v0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f41476d;

    /* renamed from: e */
    public Object f41477e;

    /* renamed from: f */
    public int f41478f;

    /* renamed from: g */
    public final /* synthetic */ C15242u0 f41479g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15245v0(C15242u0 u0Var, C15601d<? super C15245v0> dVar) {
        super(2, dVar);
        this.f41479g = u0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15245v0(this.f41479g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15245v0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: mk1.h$c$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0206 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0282  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            r34 = this;
            r0 = r34
            java.lang.Class<ht1.j5> r1 = ht1.C8777j5.class
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r0.f41478f
            r6 = 2
            r7 = 3
            r8 = 4
            r10 = 1
            r12 = 0
            java.lang.String r13 = "getService(IHellLiveReport::class.java)"
            java.lang.String r14 = "Finder.FinderLivePostPendingUIC"
            if (r3 == 0) goto L_0x004c
            if (r3 == r10) goto L_0x0045
            if (r3 == r6) goto L_0x003e
            if (r3 == r7) goto L_0x0037
            if (r3 != r8) goto L_0x002f
            java.lang.Object r2 = r0.f41477e
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r3 = r0.f41476d
            mk1.h$c r3 = (mk1.C10906h.C10912c) r3
            kotlin.ResultKt.throwOnFailure(r35)
            r0 = r35
            r21 = r1
            r20 = r13
            r15 = 0
            goto L_0x0482
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r35)
            r3 = r35
            goto L_0x025f
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r35)
            r3 = r35
            goto L_0x0207
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r35)
            r3 = r35
            goto L_0x0130
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r35)
            java.lang.String r3 = "prepare()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            wf1.u0 r3 = r0.f41479g
            androidx.appcompat.app.AppCompatActivity r15 = r3.getActivity()
            boolean r15 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r15)
            if (r15 != 0) goto L_0x009f
            qo3.q r15 = new qo3.q
            androidx.appcompat.app.AppCompatActivity r4 = r3.getActivity()
            r15.<init>(r4)
            androidx.appcompat.app.AppCompatActivity r4 = r3.getActivity()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131827637(0x7f111bb5, float:1.9288192E38)
            java.lang.String r4 = r4.getString(r5)
            r15.mo107595g(r4)
            androidx.appcompat.app.AppCompatActivity r4 = r3.getActivity()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131821556(0x7f1103f4, float:1.9275859E38)
            java.lang.String r4 = r4.getString(r5)
            r15.mo107602n(r4)
            wf1.n0 r4 = new wf1.n0
            r4.<init>(r3)
            r15.mo107600l(r4)
            r15.mo107603o()
            java.lang.String r3 = "checkNetworkAvailable() network problem"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r3)
            r3 = 0
            goto L_0x00a0
        L_0x009f:
            r3 = 1
        L_0x00a0:
            if (r3 != 0) goto L_0x00b3
            java.lang.String r1 = "checkNetworkAvailable failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r1)
            wf1.u0 r1 = r0.f41479g
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            r1.finish()
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x00b3:
            wf1.u0 r3 = r0.f41479g
            r0.f41478f = r10
            r3.getClass()
            java.lang.String r4 = "checkOrCreateAccount"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            er1.j4 r4 = er1.C58739j4.f168176a
            boolean r4 = r4.mo83679H()
            if (r4 != 0) goto L_0x012b
            java.lang.String r4 = "checkOrCreateAccount need create finder contact."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            a14.m r4 = new a14.m
            wx3.d r5 = xx3.C66447b.m78392b(r34)
            r4.<init>(r5, r10)
            r4.mo74609p()
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r15 = "KEY_GO_TO_AFTER_CREATE_SUCCESS"
            r5.putExtra(r15, r10)
            java.lang.String r15 = "key_router_to_profile"
            r5.putExtra(r15, r12)
            gy3.a0 r15 = new gy3.a0
            r15.<init>()
            wf1.m0 r8 = r3.mo14155c3()
            wf1.m0$a r8 = r8.f41436g
            if (r8 == 0) goto L_0x00f7
            r8.mo14142c()
        L_0x00f7:
            wf1.m0 r8 = r3.mo14155c3()
            fy3.t<? super android.app.Activity, ? super android.content.Intent, ? super java.lang.Integer, ? super android.content.DialogInterface$OnClickListener, ? super android.content.DialogInterface$OnClickListener, ? super android.content.DialogInterface$OnDismissListener, rx3.b0> r8 = r8.f41437h
            androidx.appcompat.app.AppCompatActivity r17 = r3.getActivity()
            r9 = 10002(0x2712, float:1.4016E-41)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r9)
            wf1.o0 r9 = new wf1.o0
            r9.<init>(r3, r4, r15)
            wf1.p0 r3 = new wf1.p0
            r3.<init>(r15)
            wf1.q0 r7 = new wf1.q0
            r7.<init>(r15, r4)
            r16 = r8
            r18 = r5
            r19 = r11
            r20 = r9
            r21 = r3
            r22 = r7
            r16.mo14122L(r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r4.mo74608o()
            goto L_0x012d
        L_0x012b:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        L_0x012d:
            if (r3 != r2) goto L_0x0130
            return r2
        L_0x0130:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0149
            java.lang.String r1 = "checkOrCreateAccount failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r1)
            wf1.u0 r1 = r0.f41479g
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            r1.finish()
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0149:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            c50.b r3 = r3.mo77626b()
            if (r3 == 0) goto L_0x015d
            d50.i r3 = r3.f172989A
            if (r3 == 0) goto L_0x015d
            boolean r3 = r3.mo82881c()
            if (r3 != r10) goto L_0x015d
            r3 = 1
            goto L_0x015e
        L_0x015d:
            r3 = 0
        L_0x015e:
            if (r3 == 0) goto L_0x0175
            uk1.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159381i
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r1 = r1.f188207a
            if (r1 == 0) goto L_0x0169
            r1.performClick()
        L_0x0169:
            wf1.u0 r1 = r0.f41479g
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            r1.finish()
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0175:
            wf1.u0 r3 = r0.f41479g
            r0.f41478f = r6
            wf1.m0 r4 = r3.mo14155c3()
            boolean r4 = r4.f41435f
            if (r4 == 0) goto L_0x0202
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_SHOW_FIDNER_ACCOUNT_CONFIRM_INT_SYNC
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r12)
            java.lang.Object r4 = r4.mo119685f(r5, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r12)
            boolean r4 = gy3.C87412m.m108589b(r4, r7)
            if (r4 == 0) goto L_0x0202
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r10)
            r4.mo119677K(r5, r7)
            wf1.m0 r4 = r3.mo14155c3()
            wf1.m0$a r4 = r4.f41436g
            if (r4 == 0) goto L_0x01ba
            r4.mo14143f()
        L_0x01ba:
            a14.m r4 = new a14.m
            wx3.d r5 = xx3.C66447b.m78392b(r34)
            r4.<init>(r5, r10)
            r4.mo74609p()
            gy3.a0 r5 = new gy3.a0
            r5.<init>()
            java.lang.Class<tf0.p1> r7 = tf0.C64916p1.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            java.lang.String r8 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r7, r8)
            r25 = r7
            tf0.p1 r25 = (tf0.C64916p1) r25
            androidx.appcompat.app.AppCompatActivity r26 = r3.getActivity()
            zc1.b r7 = zc1.C66785b.f191882e
            java.lang.String r27 = r7.mo90662O5()
            wf1.r0 r7 = new wf1.r0
            r7.<init>(r5, r3)
            wf1.s0 r29 = wf1.C15238s0.f41459d
            wf1.t0 r3 = new wf1.t0
            r3.<init>(r5, r4)
            r31 = 0
            r32 = 32
            r33 = 0
            r28 = r7
            r30 = r3
            tf0.C64916p1.C64917a.m76445l(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r3 = r4.mo74608o()
            goto L_0x0204
        L_0x0202:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        L_0x0204:
            if (r3 != r2) goto L_0x0207
            return r2
        L_0x0207:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0220
            java.lang.String r1 = "confirmFinderAccount failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r1)
            wf1.u0 r1 = r0.f41479g
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            r1.finish()
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0220:
            java.lang.String r3 = "startLiveCheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            wf1.u0 r3 = r0.f41479g
            mk1.h r4 = new mk1.h
            androidx.appcompat.app.AppCompatActivity r5 = r3.getActivity()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
            gy3.C87412m.m108592e(r5, r7)
            r17 = r5
            com.tencent.mm.ui.MMFragmentActivity r17 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r17
            r18 = 0
            r19 = 0
            r21 = 6
            r22 = 0
            r16 = r4
            r16.<init>(r17, r18, r19, r21, r22)
            wf1.u0 r5 = r0.f41479g
            int r7 = r5.f41470i
            r4.f32535b = r7
            long r7 = r5.f41471j
            r4.f32536c = r7
            r3.f41465d = r4
            mk1.h r3 = r5.f41465d
            if (r3 == 0) goto L_0x0262
            r4 = 3
            r0.f41478f = r4
            r4 = 0
            java.lang.Object r3 = r3.mo11118g(r4, r0)
            if (r3 != r2) goto L_0x025f
            return r2
        L_0x025f:
            mk1.h$c r3 = (mk1.C10906h.C10912c) r3
            goto L_0x0263
        L_0x0262:
            r3 = 0
        L_0x0263:
            boolean r4 = r3 instanceof mk1.C10906h.C10912c.C10913a
            if (r4 == 0) goto L_0x0282
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startLiveCheck failed, errCode:"
            r1.append(r2)
            mk1.h$c$a r3 = (mk1.C10906h.C10912c.C10913a) r3
            int r2 = r3.f32546a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            goto L_0x058d
        L_0x0282:
            boolean r4 = r3 instanceof mk1.C10906h.C10912c.C10915c
            if (r4 == 0) goto L_0x029b
            java.lang.String r1 = "startLiveCheck continueLive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            wf1.u0 r1 = r0.f41479g
            mk1.h r1 = r1.f41465d
            if (r1 == 0) goto L_0x058d
            mk1.h$c$c r3 = (mk1.C10906h.C10912c.C10915c) r3
            mk1.h$a r2 = r3.f32548a
            r1.mo11113b(r2)
            goto L_0x058d
        L_0x029b:
            boolean r4 = r3 instanceof mk1.C10906h.C10912c.C10914b
            if (r4 == 0) goto L_0x058d
            java.lang.String r4 = "startLiveCheck success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            wf1.u0 r4 = r0.f41479g
            cl1.t1 r4 = r4.f41468g
            r5 = r3
            mk1.h$c$b r5 = (mk1.C10906h.C10912c.C10914b) r5
            te3.cj0 r5 = r5.f32547a
            if (r5 == 0) goto L_0x02d7
            java.util.LinkedList<te3.vv0> r5 = r5.f131762o
            if (r5 == 0) goto L_0x02d7
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r9 = sx3.C36907w.m41090l(r5, r8)
            r7.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x02c3:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x02d8
            java.lang.Object r8 = r5.next()
            te3.vv0 r8 = (te3.C51745vv0) r8
            byte[] r8 = r8.toByteArray()
            r7.add(r8)
            goto L_0x02c3
        L_0x02d7:
            r7 = 0
        L_0x02d8:
            r4.f1627g = r7
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            di3.d r5 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r5, r13)
            r24 = r5
            ht1.j5 r24 = (ht1.C8777j5) r24
            r25 = 3
            wf1.u0 r5 = r0.f41479g
            mk1.h r5 = r5.f41465d
            if (r5 == 0) goto L_0x02f7
            int r7 = r5.f32535b
            r26 = r7
            goto L_0x02f9
        L_0x02f7:
            r26 = 0
        L_0x02f9:
            if (r5 == 0) goto L_0x0300
            long r7 = r5.f32536c
            r27 = r7
            goto L_0x0302
        L_0x0300:
            r27 = 0
        L_0x0302:
            r29 = 0
            r30 = 8
            r31 = 0
            ht1.C8777j5.C8778a.m8601b(r24, r25, r26, r27, r29, r30, r31)
            wf1.u0 r5 = r0.f41479g
            wf1.m0 r5 = r5.mo14155c3()
            r0.f41476d = r3
            r0.f41477e = r4
            r7 = 4
            r0.f41478f = r7
            int r7 = r5.f41433d
            if (r7 != r6) goto L_0x046f
            rx3.g r5 = r5.f41439j
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            wf1.a r5 = (wf1.C15162a) r5
            r5.getClass()
            java.lang.Class<pl1.s0> r7 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            a14.m r9 = new a14.m
            wx3.d r11 = xx3.C66447b.m78392b(r34)
            r9.<init>(r11, r10)
            r9.mo74609p()
            bl3.r r11 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r14 = r5.getActivity()
            bl3.r$a r14 = r11.mo62444c(r14)
            java.lang.Class<wf1.u0> r15 = wf1.C15242u0.class
            androidx.lifecycle.i0 r14 = r14.mo75002a(r15)
            wf1.u0 r14 = (wf1.C15242u0) r14
            cl1.t1 r14 = r14.f41468g
            wf1.k r15 = wf1.C15191k.f41360a
            java.lang.String r10 = "153"
            r15.mo14128c(r10)
            java.lang.String r12 = "room_live_start"
            r15.mo14130e(r12, r10)
            qo3.e0 r10 = new qo3.e0
            android.app.Activity r12 = r5.getContext()
            r10.<init>(r12)
            r12 = 2131493588(0x7f0c02d4, float:1.861066E38)
            r10.mo140662i(r12)
            android.view.View r12 = r10.f296384g
            r15 = 2131315432(0x7f094ae8, float:1.8249317E38)
            android.view.View r12 = r12.findViewById(r15)
            java.lang.String r15 = "rootView.findViewById(R.id.title_tv)"
            gy3.C87412m.m108593f(r12, r15)
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.view.View r15 = r10.f296384g
            r6 = 2131310284(0x7f0936cc, float:1.8238876E38)
            android.view.View r6 = r15.findViewById(r6)
            java.lang.String r15 = "rootView.findViewById(R.id.nickname_tv)"
            gy3.C87412m.m108593f(r6, r15)
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.view.View r15 = r10.f296384g
            r19 = r3
            r3 = 2131299041(0x7f090ae1, float:1.8216072E38)
            android.view.View r3 = r15.findViewById(r3)
            java.lang.String r15 = "rootView.findViewById(R.id.chatroom_desc)"
            gy3.C87412m.m108593f(r3, r15)
            com.tencent.neattextview.textview.view.NeatTextView r3 = (com.tencent.neattextview.textview.view.NeatTextView) r3
            android.view.View r15 = r10.f296384g
            r0 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r0 = r15.findViewById(r0)
            java.lang.String r15 = "rootView.findViewById(R.id.avatar_iv)"
            gy3.C87412m.m108593f(r0, r15)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.view.View r15 = r10.f296384g
            r20 = r13
            r13 = 2131298617(0x7f090939, float:1.8215212E38)
            android.view.View r13 = r15.findViewById(r13)
            android.view.View r15 = r10.f296384g
            r21 = r1
            r1 = 2131310504(0x7f0937a8, float:1.8239322E38)
            android.view.View r1 = r15.findViewById(r1)
            android.view.View r15 = r10.f296384g
            r22 = r2
            r2 = 2131299042(0x7f090ae2, float:1.8216074E38)
            r15.findViewById(r2)
            er1.C7919x.m8091a(r12)
            fe1.d$b r2 = fe1.C58961d.f168673a
            zc1.b r12 = zc1.C66785b.f191882e
            java.lang.String r12 = r12.mo90662O5()
            fe1.q r2 = r2.mo84155b(r12)
            java.lang.Class<ny.h> r12 = p629ny.C76979h.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ny.h r12 = (p629ny.C76979h) r12
            android.app.Activity r15 = r5.getContext()
            java.lang.String r23 = ""
            if (r2 == 0) goto L_0x03f7
            java.lang.String r24 = r2.getNickname()
            r35 = r9
            r9 = r24
            goto L_0x03fb
        L_0x03f7:
            r35 = r9
            r9 = r23
        L_0x03fb:
            android.text.SpannableString r9 = r12.mo107057T1(r15, r9)
            r6.setText(r9)
            bl3.r$a r6 = r11.mo62446e(r8)
            bl3.c r6 = r6.mo62447c(r7)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11872i2()
            pl1.f r9 = new pl1.f
            if (r2 == 0) goto L_0x0418
            java.lang.String r23 = r2.getAvatarUrl()
        L_0x0418:
            r2 = r23
            r12 = 2
            r15 = 0
            r9.<init>(r2, r15, r12, r15)
            pl1.e0$a r2 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r8 = r11.mo62446e(r8)
            bl3.c r7 = r8.mo62447c(r7)
            pl1.s0 r7 = (pl1.C11990s0) r7
            n60.f r2 = r7.mo11867O2(r2)
            r6.mo85957c(r9, r0, r2)
            wf1.a$a r0 = wf1.C15162a.f41297g
            r0.mo14114a(r14, r3)
            gy3.a0 r0 = new gy3.a0
            r0.<init>()
            wf1.b r2 = new wf1.b
            r2.<init>(r10)
            r13.setOnClickListener(r2)
            wf1.c r2 = new wf1.c
            r2.<init>(r0, r5, r4, r10)
            r1.setOnClickListener(r2)
            wf1.d r1 = new wf1.d
            r2 = r35
            r1.<init>(r2, r0)
            r10.mo140665l(r1)
            android.view.View r0 = r10.f296384g
            r1 = 2131299045(0x7f090ae5, float:1.821608E38)
            android.view.View r0 = r0.findViewById(r1)
            wf1.e r1 = new wf1.e
            r1.<init>(r5, r14, r3)
            r0.setOnClickListener(r1)
            r10.mo140655A()
            java.lang.Object r0 = r2.mo74608o()
            goto L_0x047a
        L_0x046f:
            r21 = r1
            r22 = r2
            r19 = r3
            r20 = r13
            r15 = 0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x047a:
            r1 = r22
            if (r0 != r1) goto L_0x047f
            return r1
        L_0x047f:
            r2 = r4
            r3 = r19
        L_0x0482:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x058b
            di3.d r0 = di3.C86312j.m106911c(r21)
            r1 = r20
            gy3.C87412m.m108593f(r0, r1)
            r4 = r0
            ht1.j5 r4 = (ht1.C8777j5) r4
            r5 = 4
            r0 = r34
            wf1.u0 r1 = r0.f41479g
            mk1.h r1 = r1.f41465d
            if (r1 == 0) goto L_0x04a2
            int r6 = r1.f32535b
            goto L_0x04a3
        L_0x04a2:
            r6 = 0
        L_0x04a3:
            if (r1 == 0) goto L_0x04a8
            long r7 = r1.f32536c
            goto L_0x04aa
        L_0x04a8:
            r7 = 0
        L_0x04aa:
            r9 = 0
            r10 = 8
            r11 = 0
            ht1.C8777j5.C8778a.m8601b(r4, r5, r6, r7, r9, r10, r11)
            wf1.u0 r1 = r0.f41479g
            mk1.h$c$b r3 = (mk1.C10906h.C10912c.C10914b) r3
            te3.cj0 r4 = r3.f32547a
            java.lang.String r5 = r1.f41467f
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x04c1
            r10 = 1
            goto L_0x04c2
        L_0x04c1:
            r10 = 0
        L_0x04c2:
            if (r10 == 0) goto L_0x04d5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r6 = r1.f41467f
            r5.add(r6)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            java.lang.String r6 = "KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME"
            r2.putStringArrayListExtra(r6, r5)
        L_0x04d5:
            te3.y91 r5 = r1.f41466e
            if (r5 != 0) goto L_0x04e0
            if (r4 == 0) goto L_0x04de
            te3.y91 r11 = r4.f131761n
            goto L_0x04e1
        L_0x04de:
            r11 = r15
            goto L_0x04e1
        L_0x04e0:
            r11 = r5
        L_0x04e1:
            if (r4 != 0) goto L_0x04e4
            goto L_0x04e6
        L_0x04e4:
            r4.f131761n = r11
        L_0x04e6:
            cl1.t1 r1 = r1.f41468g
            r1.getClass()
            java.lang.String r4 = "intent"
            gy3.C87412m.m108594g(r2, r4)
            te3.iq2 r4 = new te3.iq2
            r4.<init>()
            java.util.LinkedList<pe3.b> r5 = r4.f135581d
            java.util.List<byte[]> r6 = r1.f1627g
            if (r6 == 0) goto L_0x051e
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r9 = sx3.C36907w.m41090l(r6, r8)
            r7.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L_0x050a:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0520
            java.lang.Object r8 = r6.next()
            byte[] r8 = (byte[]) r8
            pe3.b r8 = pe3.C89349b.m111674a(r8)
            r7.add(r8)
            goto L_0x050a
        L_0x051e:
            sx3.f0 r7 = sx3.C64186f0.f181907d
        L_0x0520:
            r5.addAll(r7)
            java.util.LinkedList<pe3.b> r5 = r4.f135582e
            java.util.List<byte[]> r6 = r1.f1628h
            if (r6 == 0) goto L_0x054c
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x0538:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x054e
            java.lang.Object r8 = r6.next()
            byte[] r8 = (byte[]) r8
            pe3.b r8 = pe3.C89349b.m111674a(r8)
            r7.add(r8)
            goto L_0x0538
        L_0x054c:
            sx3.f0 r7 = sx3.C64186f0.f181907d
        L_0x054e:
            r5.addAll(r7)
            int r5 = r1.f1629i
            r4.f135583f = r5
            int r5 = r1.f1630j
            r4.f135589o = r5
            java.util.LinkedList<java.lang.String> r5 = r4.f135584g
            java.util.ArrayList<java.lang.String> r6 = r1.f1631n
            r5.addAll(r6)
            java.util.LinkedList<java.lang.String> r5 = r4.f135585h
            java.util.ArrayList<java.lang.String> r6 = r1.f1632o
            r5.addAll(r6)
            boolean r5 = r1.f1633p
            r4.f135586i = r5
            te3.qw0 r5 = r1.f1634q
            r4.f135587j = r5
            te3.xa1 r1 = r1.f1635r
            r4.f135588n = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            byte[] r1 = r4.toByteArray()
            java.lang.String r4 = "KEY_PARAMS_VISITOR_WHITE_LIST_PB"
            r2.putExtra(r4, r1)
            wf1.u0 r1 = r0.f41479g
            mk1.h r1 = r1.f41465d
            if (r1 == 0) goto L_0x058d
            te3.cj0 r3 = r3.f32547a
            r4 = 0
            r1.mo11114c(r2, r3, r4)
            goto L_0x058d
        L_0x058b:
            r0 = r34
        L_0x058d:
            wf1.u0 r1 = r0.f41479g
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            r1.finish()
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C15245v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
