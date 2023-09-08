package ao1;

import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ao1.o0 */
public final class C54273o0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ PostMainUIC f152331d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54273o0(PostMainUIC postMainUIC) {
        super(1);
        this.f152331d = postMainUIC;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0011
            com.tencent.mm.plugin.finder.post.PostMainUIC r1 = r0.f152331d
            r1.mo78413J3()
        L_0x0011:
            com.tencent.mm.plugin.finder.post.PostMainUIC r1 = r0.f152331d
            r1.getClass()
            fp1.a r2 = fp1.C59266a.f169452a
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r3 = dp1.C58408t0.f167337b
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = r3.flowId
            if (r3 != 0) goto L_0x0023
        L_0x0022:
            r3 = r4
        L_0x0023:
            fp1.c r5 = fp1.C59267b.f169459g
            r2.mo84410b(r3, r5)
            bt1.w r2 = r1.mo78412I3()
            r3 = 0
            if (r2 != 0) goto L_0x004d
            bt1.w r2 = new bt1.w
            r6 = 0
            bt1.e r5 = r1.mo78410F3()
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.f152943A
            if (r5 == 0) goto L_0x0040
            int r5 = r5.getMediaType()
            r7 = r5
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 120(0x78, float:1.68E-43)
            r14 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x004d:
            r18 = r2
            bt1.e r15 = r1.mo78410F3()
            androidx.appcompat.app.AppCompatActivity r16 = r1.getActivity()
            ao1.t r2 = r1.mo78415L3()
            java.lang.String r17 = r2.mo75075k3()
            r19 = 0
            ao1.t r2 = r1.mo78415L3()
            gs1.i r2 = r2.mo75074j3()
            gs1.c r2 = r2.mo84676a()
            java.util.ArrayList r20 = r2.mo84674a()
            dr1.a r2 = r1.f160287x
            java.lang.String r5 = "activityWidget"
            r6 = 0
            if (r2 == 0) goto L_0x01f8
            com.tencent.mm.plugin.finder.view.FinderExtendActivityView r2 = r2.f25683a
            te3.ef1 r21 = r2.getActivityEvent()
            dr1.a r2 = r1.f160287x
            if (r2 == 0) goto L_0x01f4
            te3.zj0 r22 = r2.mo8613i()
            r2 = 1
            java.util.LinkedList r23 = r1.mo78433o3(r2)
            dr1.y r5 = r1.f160247A
            if (r5 == 0) goto L_0x01ee
            com.tencent.mm.plugin.finder.view.FinderPostOriginView r5 = r5.f25759a
            com.tencent.mm.ui.widget.MMSwitchBtn r5 = r5.f17908f
            boolean r5 = r5.f220433y
            r7 = 0
            if (r5 == 0) goto L_0x009e
            r9 = 1
            r24 = r9
            goto L_0x00a0
        L_0x009e:
            r24 = r7
        L_0x00a0:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r15.mo75455c(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            bt1.e r9 = r1.mo78410F3()
            long r9 = r9.f152985z
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x00d9
            bt1.e r9 = r1.mo78410F3()
            boolean r9 = r9.f152945C
            if (r9 == 0) goto L_0x00c2
            up1.m r9 = up1.C65420m.f188268a
            bt1.e r10 = r1.mo78410F3()
            long r10 = r10.f152985z
            r9.mo89519a(r10)
            goto L_0x00d9
        L_0x00c2:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r9 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            com.tencent.mm.plugin.FinderCommonFeatureService r9 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r9
            wp1.b r9 = r9.Cx0()
            bt1.e r10 = r1.mo78410F3()
            long r10 = r10.f152985z
            up1.l r9 = r9.mo90229qq(r10)
            goto L_0x00da
        L_0x00d9:
            r9 = r6
        L_0x00da:
            bt1.e r10 = r1.mo78410F3()
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.f152943A
            if (r10 == 0) goto L_0x0129
            if (r9 == 0) goto L_0x0129
            up1.l$a r10 = up1.C65418l.f188265M
            up1.l r5 = r10.mo89517a(r5)
            long r10 = r9.field_objectId
            r5.field_objectId = r10
            r5.field_localFlag = r2
            int r9 = r9.field_version
            int r9 = r9 + r2
            r5.field_version = r9
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r5.mo89514l2()
            te3.tq2 r9 = r9.field_postinfo
            if (r9 == 0) goto L_0x00ff
            r9.f185646e = r3
        L_0x00ff:
            long r9 = r5.field_localId
            com.tencent.mm.autogen.events.FinderDraftModifyEvent r11 = new com.tencent.mm.autogen.events.FinderDraftModifyEvent
            r11.<init>()
            com.tencent.mm.autogen.events.FinderDraftModifyEvent$a r12 = r11.f154763d
            r12.f154764a = r9
            r12.f154765b = r2
            r11.publish()
            java.lang.String r9 = r1.f160270d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "save update version: "
            r10.append(r11)
            int r11 = r5.field_version
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            r9 = 1
            goto L_0x0138
        L_0x0129:
            up1.l$a r9 = up1.C65418l.f188265M
            up1.l r5 = r9.mo89517a(r5)
            r5.field_localId = r7
            int r9 = eb0.C31543z5.m39455e()
            r5.field_createTime = r9
            r9 = 0
        L_0x0138:
            r5.field_extraInfoFlag = r7
            r5.field_localFlag = r2
            r5.field_objectType = r3
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r5.mo89514l2()
            int r7 = eb0.C31543z5.m39455e()
            r3.setCreateTime(r7)
            java.lang.String r3 = r1.f160270d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "save localId:"
            r7.append(r8)
            long r10 = r5.field_localId
            r7.append(r10)
            java.lang.String r8 = " des:"
            r7.append(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r5.mo89514l2()
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = r8.objectDesc
            if (r8 == 0) goto L_0x016e
            java.lang.String r8 = r8.description
            goto L_0x016f
        L_0x016e:
            r8 = r6
        L_0x016f:
            r7.append(r8)
            java.lang.String r8 = " showOrigin:"
            r7.append(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r5.mo89514l2()
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.getFeedObject()
            boolean r8 = r8.showOriginal
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            wp1.c r3 = wp1.C66166c.f190172a
            r3.mo90231b(r5)
            if (r9 == 0) goto L_0x01a4
            long r7 = r5.field_localId
            r3 = 112(0x70, float:1.57E-43)
            com.tencent.mm.autogen.events.FinderDraftOpEvent r5 = new com.tencent.mm.autogen.events.FinderDraftOpEvent
            r5.<init>()
            com.tencent.mm.autogen.events.FinderDraftOpEvent$a r9 = r5.f154766d
            r9.f154767a = r3
            r9.f154768b = r7
            r5.publish()
        L_0x01a4:
            java.lang.String r3 = r1.f160270d
            java.lang.String r5 = "LogPost save draft."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            uq1.f r3 = uq1.C65437f.f188296h
            r3.mo12419l()
            ht1.x3 r3 = ao1.C54264e.f152304b
            if (r3 == 0) goto L_0x01cd
            r3 = 2
            java.lang.String r5 = "Finder.PostCallbackMgr"
            java.lang.String r7 = "doCallback state:2 errMsg:"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            ht1.x3 r5 = ao1.C54264e.f152304b
            if (r5 == 0) goto L_0x01c3
            r5.mo5408a(r3, r4)
        L_0x01c3:
            ao1.C54264e.f152304b = r6
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            r1.finish()
            goto L_0x01d0
        L_0x01cd:
            r1.mo78420Q3(r2)
        L_0x01d0:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r1 = dp1.C58408t0.f167337b
            if (r1 == 0) goto L_0x01eb
            r3 = 4
            r1.exitPageId = r3
            long r3 = eb0.C31543z5.m39453c()
            r1.sendOrExitButtonTime = r3
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r1 = dp1.C58408t0.f167337b
            if (r1 == 0) goto L_0x01eb
            dp1.u0 r3 = new dp1.u0
            r3.<init>(r1, r2)
            java.lang.String r1 = "Finder.FinderPostReportLogic"
            o40.C61926c.m72661F(r1, r3)
        L_0x01eb:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x01ee:
            java.lang.String r1 = "postOriginWidget"
            gy3.C87412m.m108603p(r1)
            throw r6
        L_0x01f4:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x01f8:
            gy3.C87412m.m108603p(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ao1.C54273o0.invoke(java.lang.Object):java.lang.Object");
    }
}
