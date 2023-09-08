package cn1;

import a14.C0000n0;
import android.widget.TextView;
import bn1.C0331b;
import fy3.C32227p;
import jq3.C60905o;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.LivingConvert$bindLive$3", mo125469f = "LivingConvert.kt", mo125470l = {464, 479}, mo125471m = "invokeSuspend")
/* renamed from: cn1.c0 */
public final class C0816c0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f1908d;

    /* renamed from: e */
    public final /* synthetic */ C0810b0 f1909e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f1910f;

    /* renamed from: g */
    public final /* synthetic */ C0331b f1911g;

    /* renamed from: h */
    public final /* synthetic */ TextView f1912h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0816c0(C0810b0 b0Var, C60905o oVar, C0331b bVar, TextView textView, C15601d<? super C0816c0> dVar) {
        super(2, dVar);
        this.f1909e = b0Var;
        this.f1910f = oVar;
        this.f1911g = bVar;
        this.f1912h = textView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0816c0(this.f1909e, this.f1910f, this.f1911g, this.f1912h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0816c0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0268 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x026d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            r1 = r24
            int r2 = r1.f1908d
            java.lang.String r3 = "Finder.LivingConvert"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0028
            if (r2 == r5) goto L_0x0020
            if (r2 != r4) goto L_0x0018
            kotlin.ResultKt.throwOnFailure(r25)
            r2 = r1
            r4 = 1
            r7 = 2
            goto L_0x0269
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r25)
            r6 = r25
            r2 = r1
            goto L_0x00b5
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r25)
            r2 = r1
        L_0x002c:
            cn1.b0 r6 = r2.f1909e
            jq3.o r7 = r2.f1910f
            android.content.Context r7 = r7.f173499A
            java.lang.String r8 = "holder.context"
            gy3.C87412m.m108593f(r7, r8)
            bn1.b r8 = r2.f1911g
            long r8 = r8.getItemId()
            bn1.b r10 = r2.f1911g
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.mo3513o()
            java.lang.String r10 = r10.getObjectNonceId()
            r2.f1908d = r5
            r6.getClass()
            wx3.h r6 = new wx3.h
            wx3.d r11 = xx3.C66447b.m78392b(r2)
            r6.<init>(r11)
            java.lang.String r11 = o40.C61926c.m72691p(r8)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "#requestAndRefreshActivityIcon feedId="
            r12.append(r13)
            r12.append(r11)
            java.lang.String r13 = " nonceId="
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            rx3.l r12 = new rx3.l
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r8)
            r12.<init>(r13, r10)
            r14.add(r12)
            r15 = 7
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 28
            r20 = 0
            je1.l r8 = new je1.l
            r13 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            nr3.e r8 = r8.mo9225i()
            cn1.h0 r9 = new cn1.h0
            r9.<init>(r11, r6)
            lp3.c r8 = o40.C61926c.m72665J(r8, r9)
            boolean r9 = r7 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r9 == 0) goto L_0x00ae
            jp3.b r7 = (jp3.C9487b) r7
            r8.mo11397F(r7)
        L_0x00ae:
            java.lang.Object r6 = r6.mo90314b()
            if (r6 != r0) goto L_0x00b5
            return r0
        L_0x00b5:
            cn1.b0$a r6 = (cn1.C0810b0.C0811a) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#bindLive async requestParticipantCount interval="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            boolean r7 = r6.f1895a
            if (r7 == 0) goto L_0x026d
            int r7 = r6.f1896b
            if (r7 > 0) goto L_0x00d5
            goto L_0x026d
        L_0x00d5:
            cn1.b0 r8 = r2.f1909e
            bn1.b r7 = r2.f1911g
            jq3.o r9 = r2.f1910f
            boolean r10 = r6.f1898d
            r8.getClass()
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r7.mo3513o()
            boolean r11 = r11.isLiveFeed()
            if (r11 == 0) goto L_0x00f9
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r7.mo3513o()
            java.util.LinkedList r11 = r11.getLiveMediaList()
            java.lang.Object r11 = sx3.C110818d0.m150914L(r11)
            te3.rq2 r11 = (te3.C64689rq2) r11
            goto L_0x0107
        L_0x00f9:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r7.mo3513o()
            java.util.LinkedList r11 = r11.getMediaList()
            java.lang.Object r11 = sx3.C110818d0.m150914L(r11)
            te3.rq2 r11 = (te3.C64689rq2) r11
        L_0x0107:
            java.lang.String r12 = r7.f905f
            java.lang.String r14 = ""
            if (r12 != 0) goto L_0x010e
            r12 = r14
        L_0x010e:
            int r13 = r12.length()
            r15 = 0
            if (r13 != 0) goto L_0x0117
            r13 = 1
            goto L_0x0118
        L_0x0117:
            r13 = 0
        L_0x0118:
            if (r13 == 0) goto L_0x0147
            er1.j4 r12 = er1.C58739j4.f168176a
            java.lang.String r12 = r12.mo83674B(r11, r5)
            int r13 = r12.length()
            if (r13 <= 0) goto L_0x0128
            r13 = 1
            goto L_0x0129
        L_0x0128:
            r13 = 0
        L_0x0129:
            if (r13 == 0) goto L_0x012c
            goto L_0x0147
        L_0x012c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r11.f185283w
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            r12.append(r13)
            java.lang.String r13 = r11.f185234A
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
        L_0x0147:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 == 0) goto L_0x0169
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r11.f185267e
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            r12.append(r13)
            java.lang.String r11 = r11.f185288z
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            goto L_0x016a
        L_0x0169:
            r11 = r12
        L_0x016a:
            r12 = 2131303847(0x7f091da7, float:1.822582E38)
            android.view.View r12 = r9.mo85812D(r12)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r12 = (com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget) r12
            r13 = 2131304081(0x7f091e91, float:1.8226295E38)
            android.view.View r13 = r9.mo85812D(r13)
            r4 = 2131315201(0x7f094a01, float:1.8248849E38)
            android.view.View r4 = r9.mo85812D(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 2131302686(0x7f09191e, float:1.8223465E38)
            android.view.View r5 = r9.mo85812D(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r9 = 8
            if (r10 != 0) goto L_0x01dc
            if (r12 != 0) goto L_0x0193
            goto L_0x0196
        L_0x0193:
            r12.setVisibility(r15)
        L_0x0196:
            if (r13 != 0) goto L_0x019a
            goto L_0x0226
        L_0x019a:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.mo10233c(r9)
            java.lang.Object[] r17 = r10.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert"
            java.lang.String r19 = "refreshLiveStatus"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r13
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r9 = r10.mo10231a(r15)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r13.setVisibility(r9)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert"
            java.lang.String r18 = "refreshLiveStatus"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0226
        L_0x01dc:
            if (r12 != 0) goto L_0x01df
            goto L_0x01e2
        L_0x01df:
            r12.setVisibility(r9)
        L_0x01e2:
            if (r13 != 0) goto L_0x01e5
            goto L_0x0226
        L_0x01e5:
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r9.mo10233c(r10)
            java.lang.Object[] r17 = r9.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert"
            java.lang.String r19 = "refreshLiveStatus"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r13
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r9 = r9.mo10231a(r15)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r13.setVisibility(r9)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert"
            java.lang.String r18 = "refreshLiveStatus"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0226:
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r7.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            te3.c21 r7 = r7.liveInfo
            if (r7 == 0) goto L_0x0241
            int r7 = r7.f182394f
            r13 = 1
            if (r7 != r13) goto L_0x0242
            r10 = 1
            goto L_0x0243
        L_0x0241:
            r13 = 1
        L_0x0242:
            r10 = 0
        L_0x0243:
            r12 = r4
            r4 = 1
            r13 = r5
            r8.mo741l(r9, r10, r11, r12, r13)
            cn1.b0 r5 = r2.f1909e
            android.widget.TextView r7 = r2.f1912h
            java.lang.String r8 = "watchCountHistoryTv"
            gy3.C87412m.m108593f(r7, r8)
            int r8 = r6.f1897c
            r5.mo742m(r7, r14, r8)
            int r5 = r6.f1896b
            long r5 = (long) r5
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r7 = 2
            r2.f1908d = r7
            java.lang.Object r5 = a14.C53965x0.m60607b(r5, r2)
            if (r5 != r0) goto L_0x0269
            return r0
        L_0x0269:
            r4 = 2
            r5 = 1
            goto L_0x002c
        L_0x026d:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0816c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
