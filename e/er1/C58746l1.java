package er1;

import android.view.View;
import cm1.C55011a;

/* renamed from: er1.l1 */
public final class C58746l1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C55011a f168213d;

    /* renamed from: e */
    public final /* synthetic */ int f168214e;

    /* renamed from: f */
    public final /* synthetic */ boolean f168215f;

    /* renamed from: g */
    public final /* synthetic */ View f168216g;

    /* renamed from: h */
    public final /* synthetic */ boolean f168217h;

    public C58746l1(C55011a aVar, int i, boolean z, View view, boolean z2) {
        this.f168213d = aVar;
        this.f168214e = i;
        this.f168215f = z;
        this.f168216g = view;
        this.f168217h = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r52) {
        /*
            r51 = this;
            r6 = r51
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = r52
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/utils/FinderMsgUtil$setClickListener$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r51
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            er1.j4 r0 = er1.C58739j4.f168176a
            boolean r0 = r0.mo83683L()
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "com/tencent/mm/plugin/finder/utils/FinderMsgUtil$setClickListener$1"
            if (r0 == 0) goto L_0x0034
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x0034:
            cm1.a r0 = r6.f168213d
            xh.va r5 = r0.f154465d
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r5.field_contact
            if (r8 == 0) goto L_0x0040
            java.lang.String r8 = r8.username
            r12 = r8
            goto L_0x0041
        L_0x0040:
            r12 = 0
        L_0x0041:
            long r10 = r5.field_objectId
            long r13 = r5.field_commentId
            r15 = r10
            long r9 = r5.field_likeId
            r17 = r9
            long r8 = r5.field_fansId
            int r10 = r5.field_likeType
            java.lang.String r11 = r5.field_username
            boolean r7 = r0 instanceof cm1.C55021k1
            r20 = r15
            r15 = 1
            if (r7 != 0) goto L_0x005e
            boolean r0 = r0 instanceof cm1.C55022l1
            if (r0 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r0 = 0
            goto L_0x005f
        L_0x005e:
            r0 = 1
        L_0x005f:
            int r7 = r5.field_relationType
            r22 = r10
            r23 = r11
            long r10 = r5.field_svrMentionId
            r24 = r7
            int r7 = r6.f168214e
            r25 = r8
            if (r7 != r15) goto L_0x0072
            r7 = 14
            goto L_0x0074
        L_0x0072:
            r7 = 15
        L_0x0074:
            er1.m1 r9 = er1.C58748m1.f168218a
            android.content.Context r8 = r52.getContext()
            java.lang.String r15 = "it.context"
            gy3.C87412m.m108593f(r8, r15)
            r29 = r7
            rs1.s8$a r7 = rs1.C13442s8.f38060Q0
            rs1.s8 r8 = r7.mo12873f(r8)
            if (r8 == 0) goto L_0x0094
            te3.hj1 r8 = r8.mo12861q3()
            r30 = r13
            r13 = 117(0x75, float:1.64E-43)
            r8.f134675i = r13
            goto L_0x0097
        L_0x0094:
            r30 = r13
            r8 = 0
        L_0x0097:
            dp1.f2 r13 = dp1.C7435f2.f25626a
            java.lang.String r14 = "protrait"
            r32 = r0
            r19 = r12
            r0 = 0
            r12 = 1
            r13.mo8577a(r8, r14, r12, r0)
            boolean r8 = r6.f168215f
            if (r8 == 0) goto L_0x00d5
            android.content.Context r8 = r52.getContext()
            gy3.C87412m.m108593f(r8, r15)
            int r12 = r6.f168214e
            int r8 = r9.mo83747c(r8, r12)
            er1.w3 r12 = er1.C58784w3.f168295a
            int r13 = r6.f168214e
            r12.getClass()
            r12 = 1
            if (r13 != r12) goto L_0x00ca
            if (r8 == 0) goto L_0x00c7
            if (r8 == r12) goto L_0x00c4
            goto L_0x00ce
        L_0x00c4:
            r8 = 35
            goto L_0x00d6
        L_0x00c7:
            r8 = 37
            goto L_0x00d6
        L_0x00ca:
            if (r8 == 0) goto L_0x00d2
            if (r8 == r12) goto L_0x00cf
        L_0x00ce:
            goto L_0x00d5
        L_0x00cf:
            r8 = 34
            goto L_0x00d6
        L_0x00d2:
            r8 = 36
            goto L_0x00d6
        L_0x00d5:
            r8 = 0
        L_0x00d6:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "entranceType: "
            r12.append(r13)
            r12.append(r8)
            java.lang.String r13 = " isNeedEnterType:"
            r12.append(r13)
            boolean r13 = r6.f168215f
            r12.append(r13)
            java.lang.String r13 = " srvMentionId:"
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "Finder.MsgUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)
            com.tencent.mm.protocal.protobuf.FinderContact r12 = r5.field_contact
            java.lang.String r13 = "key_entrance_type"
            r14 = -1
            if (r12 == 0) goto L_0x0158
            r0 = 0
            te3.cg r12 = fe1.C58960c.m68829a(r12, r0)
            if (r12 == 0) goto L_0x0158
            android.view.View r0 = r6.f168216g
            android.content.Context r0 = r0.getContext()
            java.lang.String r5 = "view.context"
            gy3.C87412m.m108593f(r0, r5)
            java.lang.String r5 = r12.f182468d
            if (r5 != 0) goto L_0x011e
            java.lang.String r5 = ""
        L_0x011e:
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            r7.mo12871c(r0, r9)
            java.lang.String r7 = "Contact_User"
            r9.putExtra(r7, r5)
            r5 = 214(0xd6, float:3.0E-43)
            java.lang.String r7 = "Contact_Scene"
            r9.putExtra(r7, r5)
            java.lang.String r5 = "biz_profile_enter_from_finder"
            r7 = 1
            r9.putExtra(r5, r7)
            java.lang.String r5 = "force_get_contact"
            r9.putExtra(r5, r7)
            java.lang.String r5 = "key_use_new_contact_profile"
            r9.putExtra(r5, r7)
            if (r8 <= r14) goto L_0x0147
            r9.putExtra(r13, r8)
        L_0x0147:
            java.lang.String r5 = "biz_profile_tab_type"
            r9.putExtra(r5, r7)
            java.lang.String r5 = "profile"
            java.lang.String r7 = ".ui.ContactInfoUI"
            r8 = 0
            ke3.C88144b.m109791i(r0, r5, r7, r9, r8)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x0158:
            int r7 = r5.field_type
            r12 = 15
            if (r7 != r12) goto L_0x0160
            r12 = 1
            goto L_0x0161
        L_0x0160:
            r12 = 0
        L_0x0161:
            if (r19 == 0) goto L_0x016c
            int r7 = r19.length()
            if (r7 != 0) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            r7 = 0
            goto L_0x016d
        L_0x016c:
            r7 = 1
        L_0x016d:
            if (r7 != 0) goto L_0x0321
            java.lang.String r7 = "@stranger"
            r0 = 2
            r34 = r2
            r14 = r19
            r2 = 0
            r19 = r1
            r1 = 0
            boolean r33 = z04.C112551y.m153808h(r14, r7, r2, r0, r1)
            r35 = 0
            if (r33 != 0) goto L_0x0185
        L_0x0182:
            r2 = r22
            goto L_0x01a0
        L_0x0185:
            if (r32 == 0) goto L_0x0188
            goto L_0x0182
        L_0x0188:
            if (r12 == 0) goto L_0x018b
            goto L_0x0182
        L_0x018b:
            int r2 = (r30 > r35 ? 1 : (r30 == r35 ? 0 : -1))
            if (r2 != 0) goto L_0x0182
            int r2 = (r25 > r35 ? 1 : (r25 == r35 ? 0 : -1))
            if (r2 != 0) goto L_0x0182
            r2 = r22
            r1 = 1
            if (r2 != r1) goto L_0x019c
            int r1 = (r17 > r35 ? 1 : (r17 == r35 ? 0 : -1))
            if (r1 == 0) goto L_0x019e
        L_0x019c:
            if (r2 != 0) goto L_0x01a0
        L_0x019e:
            r1 = 1
            goto L_0x01a1
        L_0x01a0:
            r1 = 0
        L_0x01a1:
            if (r1 == 0) goto L_0x01ad
            r5 = r4
            r1 = r6
            r0 = r15
            r2 = r19
            r4 = r3
            r3 = r34
            goto L_0x0327
        L_0x01ad:
            java.lang.String r1 = "@finder"
            r22 = r3
            r37 = r4
            r3 = 0
            r4 = 0
            boolean r1 = z04.C112551y.m153808h(r14, r1, r4, r0, r3)
            if (r1 == 0) goto L_0x01ee
            android.content.Context r0 = r52.getContext()
            gy3.C87412m.m108593f(r0, r15)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 == 0) goto L_0x01c9
            goto L_0x01e6
        L_0x01c9:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "finder_username"
            r1.putExtra(r2, r14)
            r1.putExtra(r13, r8)
            java.lang.String r2 = "key_enter_profile_type"
            r1.putExtra(r2, r8)
            java.lang.Class<er1.b> r2 = er1.C58684b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            er1.b r2 = (er1.C58684b) r2
            r2.mo13272V1(r0, r1)
        L_0x01e6:
            r38 = r5
            r1 = r6
            r0 = r15
            r46 = 1
            goto L_0x02c6
        L_0x01ee:
            r1 = 0
            r3 = 0
            boolean r1 = z04.C112551y.m153808h(r14, r7, r3, r0, r1)
            if (r1 == 0) goto L_0x02b5
            android.view.View r1 = r6.f168216g
            android.content.Context r4 = r52.getContext()
            gy3.C87412m.m108593f(r4, r15)
            int r7 = r6.f168214e
            java.lang.String r0 = "wxUsername"
            r3 = r23
            gy3.C87412m.m108593f(r3, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r0 == 0) goto L_0x0214
            r38 = r5
            r0 = r15
            goto L_0x02c2
        L_0x0214:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r23 = r15
            java.lang.String r15 = "V5UserName"
            r0.putExtra(r15, r14)
            java.lang.String r15 = "FeedId"
            r38 = r5
            r5 = r20
            r0.putExtra(r15, r5)
            java.lang.String r5 = "CommentId"
            r6 = r14
            r14 = r30
            r0.putExtra(r5, r14)
            java.lang.String r5 = "LikeId"
            r14 = r17
            r0.putExtra(r5, r14)
            java.lang.String r5 = "LikeType"
            r0.putExtra(r5, r2)
            int r2 = (r25 > r35 ? 1 : (r25 == r35 ? 0 : -1))
            if (r2 <= 0) goto L_0x024a
            java.lang.String r2 = o40.C61926c.m72691p(r25)
            java.lang.String r5 = "FansId"
            r0.putExtra(r5, r2)
        L_0x024a:
            java.lang.String r2 = "IsPoster"
            r5 = 1
            r0.putExtra(r2, r5)
            java.lang.String r2 = "Action"
            r0.putExtra(r2, r5)
            zc1.b r2 = zc1.C66785b.f191882e
            java.lang.String r2 = r2.mo90662O5()
            java.lang.String r14 = "feedUser"
            r0.putExtra(r14, r2)
            r2 = -1
            if (r8 <= r2) goto L_0x0266
            r0.putExtra(r13, r8)
        L_0x0266:
            if (r7 != r5) goto L_0x026a
            r15 = 1
            goto L_0x026b
        L_0x026a:
            r15 = 0
        L_0x026b:
            java.lang.String r2 = "FromFinderMsg"
            r0.putExtra(r2, r15)
            r2 = r15 ^ 1
            java.lang.String r5 = "FromWxMsg"
            r0.putExtra(r5, r2)
            java.lang.String r2 = "IsFollowApply"
            r5 = r32
            r0.putExtra(r2, r5)
            java.lang.String r2 = "WxUserName"
            r0.putExtra(r2, r3)
            java.lang.String r2 = "RelationType"
            r3 = r24
            r0.putExtra(r2, r3)
            java.lang.String r2 = "SrvMentionId"
            r0.putExtra(r2, r10)
            java.lang.String r2 = "isFingerLike"
            r0.putExtra(r2, r12)
            er1.w3 r10 = er1.C58784w3.f168295a
            if (r15 == 0) goto L_0x029b
            r2 = 6
            r14 = 6
            goto L_0x029d
        L_0x029b:
            r2 = 7
            r14 = 7
        L_0x029d:
            r15 = 0
            r16 = 16
            r17 = 0
            r11 = r4
            r12 = r6
            r13 = r0
            r0 = r23
            er1.C58784w3.m68437l1(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x02c2
            er1.k1 r2 = new er1.k1
            r2.<init>(r4)
            r1.post(r2)
            goto L_0x02c2
        L_0x02b5:
            r38 = r5
            r0 = r15
            android.content.Context r1 = r52.getContext()
            gy3.C87412m.m108593f(r1, r0)
            er1.C58748m1.m68322a(r9, r1)
        L_0x02c2:
            r46 = 2
            r1 = r51
        L_0x02c6:
            boolean r2 = r1.f168217h
            if (r2 == 0) goto L_0x0315
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r3 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            r39 = r2
            dp1.y0 r39 = (dp1.C58417y0) r39
            android.content.Context r2 = r52.getContext()
            gy3.C87412m.m108593f(r2, r0)
            r7 = r29
            long r3 = (long) r7
            r43 = 1
            r45 = 0
            r47 = 1
            android.content.Context r5 = r52.getContext()
            gy3.C87412m.m108593f(r5, r0)
            int r0 = r1.f168214e
            r30 = 0
            r6 = r38
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.field_contact
            java.lang.String r6 = r6.username
            r32 = 4
            r33 = 0
            r27 = r9
            r28 = r5
            r29 = r0
            r31 = r6
            java.lang.String r48 = er1.C58748m1.m68323d(r27, r28, r29, r30, r31, r32, r33)
            r49 = 8
            r50 = 0
            r40 = r2
            r41 = r3
            dp1.C58417y0.fy0(r39, r40, r41, r43, r45, r46, r47, r48, r49, r50)
        L_0x0315:
            r2 = r19
            r4 = r22
            r3 = r34
            r5 = r37
            j20.C117292a.m165361g(r1, r5, r4, r3, r2)
            return
        L_0x0321:
            r5 = r4
            r0 = r15
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r6
        L_0x0327:
            android.content.Context r6 = r52.getContext()
            gy3.C87412m.m108593f(r6, r0)
            er1.C58748m1.m68322a(r9, r6)
            j20.C117292a.m165361g(r1, r5, r4, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58746l1.onClick(android.view.View):void");
    }
}
