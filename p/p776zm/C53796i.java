package p776zm;

import ob0.C35142u;

/* renamed from: zm.i */
public class C53796i implements C35142u {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        r1 = r1.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, ob0.C117747y r20) {
        /*
            r16 = this;
            com.tencent.mm.pluginsdk.model.app.a2 r0 = com.tencent.p014mm.pluginsdk.model.app.C44547a2.m48943c()
            r0.getClass()
            boolean r1 = f40.C86709a0.m107522a()
            java.lang.String r2 = "MicroMsg.SuggestionAppListLogic"
            r3 = 0
            if (r1 != 0) goto L_0x0020
            java.lang.String r1 = "getServiceAppList onSceneEnd account not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            r0.f120806f = r3
            java.util.List<java.lang.String> r0 = r0.f120804d
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.clear()
            goto L_0x03bc
        L_0x0020:
            r0.f120802b = r3
            if (r20 != 0) goto L_0x0034
            java.lang.String r1 = "scene == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            r0.f120806f = r3
            java.util.List<java.lang.String> r0 = r0.f120804d
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.clear()
            goto L_0x03bc
        L_0x0034:
            java.lang.String r1 = "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s"
            r4 = 2
            r5 = 3
            r6 = 1
            if (r17 != 0) goto L_0x039f
            if (r18 == 0) goto L_0x003f
            goto L_0x039f
        L_0x003f:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            r7[r3] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)
            r7[r6] = r8
            r7[r4] = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r7)
            r1 = r20
            com.tencent.mm.pluginsdk.model.app.h1 r1 = (com.tencent.p014mm.pluginsdk.model.app.C30661h1) r1
            ob0.c r1 = r1.f82515e
            if (r1 == 0) goto L_0x0063
            ob0.c$d r1 = r1.f127056b
            pe3.a r1 = r1.f127083a
            if (r1 == 0) goto L_0x0063
            te3.gs2 r1 = (te3.C49604gs2) r1
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            if (r1 != 0) goto L_0x0076
            java.lang.String r1 = "resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            r0.f120806f = r3
            java.util.List<java.lang.String> r0 = r0.f120804d
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.clear()
            goto L_0x03bc
        L_0x0076:
            java.util.LinkedList<te3.hs2> r7 = r1.f134245d
            if (r7 == 0) goto L_0x0366
            int r7 = r7.size()
            if (r7 > 0) goto L_0x0082
            goto L_0x0366
        L_0x0082:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            int r9 = r0.f120806f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r3] = r9
            java.util.LinkedList<te3.hs2> r9 = r1.f134245d
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r6] = r9
            java.lang.String r9 = "offset = %d, count = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r7)
            md2.b r7 = md2.C47000b.C34548a.m40384a()
            ym.m r7 = r7.mo72195FM()
            com.tencent.mm.pluginsdk.model.app.p r7 = (com.tencent.p014mm.pluginsdk.model.app.C44579p) r7
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.util.LinkedList<te3.hs2> r10 = r1.f134245d
            java.util.Iterator r10 = r10.iterator()
        L_0x00b2:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0308
            java.lang.Object r11 = r10.next()
            te3.hs2 r11 = (te3.C49748hs2) r11
            r12 = 6
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r13 = r11.f134850i
            r12[r3] = r13
            int r13 = r11.f134851j
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r6] = r13
            int r13 = r11.f134855q
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r4] = r13
            int r13 = r11.f134854p
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r5] = r13
            int r13 = r11.f134852n
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 4
            r12[r14] = r13
            java.lang.String r13 = r11.f134845d
            r15 = 5
            r12[r15] = r13
            java.lang.String r13 = "service info: %s, %s, %s, %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r13, r12)
            java.lang.String r12 = r11.f134845d
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0304
            java.lang.String r12 = r11.f134850i
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x0102
            goto L_0x0304
        L_0x0102:
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r12.mo119685f(r13, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r12 = com.tencent.p014mm.pluginsdk.model.app.C44561j.f120844x1
            java.lang.String r12 = r11.f134845d
            java.lang.String r13 = "wx3cc22b542de028d4"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x013b
            int r5 = r11.f134852n
            r5 = r5 ^ 253(0xfd, float:3.55E-43)
            int r5 = ~r5
            r11.f134852n = r5
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r12[r3] = r5
            java.lang.String r5 = "aa change: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r12)
            goto L_0x0194
        L_0x013b:
            java.lang.String r12 = r11.f134845d
            java.lang.String r13 = "wx6fa7e3bab7e15415"
            boolean r12 = r13.equals(r12)
            r13 = 965(0x3c5, float:1.352E-42)
            if (r12 == 0) goto L_0x0169
            int r12 = r11.f134855q
            if (r12 > 0) goto L_0x0194
            boolean r12 = eb0.C75592q0.m90761I()
            if (r12 == 0) goto L_0x0161
            int r12 = eb0.C75592q0.m90784n()
            if (r12 != 0) goto L_0x0161
            if (r5 != r6) goto L_0x0161
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 33
            r5.mo175911u(r13, r12)
            goto L_0x0194
        L_0x0161:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 35
            r5.mo175911u(r13, r12)
            goto L_0x0194
        L_0x0169:
            java.lang.String r12 = r11.f134845d
            java.lang.String r8 = "wxce6f23b478a3a2a2"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0194
            int r8 = r11.f134855q
            if (r8 > 0) goto L_0x0194
            boolean r8 = eb0.C75592q0.m90761I()
            if (r8 == 0) goto L_0x018d
            int r8 = eb0.C75592q0.m90784n()
            if (r8 != 0) goto L_0x018d
            if (r5 != r6) goto L_0x018d
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 32
            r5.mo175911u(r13, r8)
            goto L_0x0194
        L_0x018d:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 34
            r5.mo175911u(r13, r8)
        L_0x0194:
            java.util.List<java.lang.String> r5 = r0.f120804d
            java.lang.String r8 = r11.f134845d
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            r5.add(r8)
            java.lang.String r5 = r11.f134845d
            com.tencent.mm.pluginsdk.model.app.j r5 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48987g(r5)
            if (r5 == 0) goto L_0x02d5
            int r8 = r5.field_serviceAppInfoFlag
            int r12 = r11.f134852n
            if (r8 == r12) goto L_0x01ad
            goto L_0x024a
        L_0x01ad:
            int r8 = r5.field_serviceAppType
            int r12 = r11.f134851j
            if (r8 == r12) goto L_0x01b5
            goto L_0x024a
        L_0x01b5:
            int r8 = r5.f149251R0
            int r12 = r11.f134854p
            if (r8 == r12) goto L_0x01bd
            goto L_0x024a
        L_0x01bd:
            int r8 = r5.field_serviceShowFlag
            int r12 = r11.f134855q
            if (r8 == r12) goto L_0x01c5
            goto L_0x024a
        L_0x01c5:
            java.lang.String r8 = r5.field_appName
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r12 = r11.f134850i
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01d9
            goto L_0x024a
        L_0x01d9:
            java.lang.String r8 = r5.field_appName_en
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r12 = r11.f134846e
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01ec
            goto L_0x024a
        L_0x01ec:
            java.lang.String r8 = r5.field_appName_tw
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r12 = r11.f134847f
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01ff
            goto L_0x024a
        L_0x01ff:
            java.lang.String r8 = r5.field_appName_hk
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r12 = r11.f134859u
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0212
            goto L_0x024a
        L_0x0212:
            java.lang.String r8 = r5.f149281y0
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r12 = r11.f134849h
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0225
            goto L_0x024a
        L_0x0225:
            java.lang.String r8 = r5.f149279x0
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r12 = r11.f134848g
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0238
            goto L_0x024a
        L_0x0238:
            java.lang.String r8 = r5.f149249Q0
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r12 = r11.f134853o
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x024c
        L_0x024a:
            r8 = 1
            goto L_0x024d
        L_0x024c:
            r8 = 0
        L_0x024d:
            if (r8 == 0) goto L_0x02f7
            java.lang.String r8 = r5.f149281y0
            java.lang.String r12 = r5.f149279x0
            r0.mo69332a(r5, r11)
            java.lang.String[] r13 = new java.lang.String[r3]
            boolean r13 = r7.update(r5, r13)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r6 = r11.f134849h
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L_0x028f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "update serviceApp.app_icon_url_list"
            r6.append(r8)
            java.lang.String r8 = r11.f134849h
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            com.tencent.mm.pluginsdk.model.app.i r6 = ld2.C46848g.zx0()
            java.lang.String r8 = r5.field_appId
            r6.mo69352a(r8, r15)
        L_0x028f:
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            java.lang.String r8 = r11.f134848g
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x02c2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "update serviceApp.app_icon_url_panel"
            r6.append(r8)
            java.lang.String r8 = r11.f134848g
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            com.tencent.mm.pluginsdk.model.app.i r6 = ld2.C46848g.zx0()
            java.lang.String r8 = r5.field_appId
            r6.mo69352a(r8, r14)
        L_0x02c2:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r8 = r11.f134845d
            r6[r3] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)
            r12 = 1
            r6[r12] = r8
            java.lang.String r8 = "update app: AppID = %s, ret = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r6)
            goto L_0x02f7
        L_0x02d5:
            com.tencent.mm.pluginsdk.model.app.j r5 = new com.tencent.mm.pluginsdk.model.app.j
            r5.<init>()
            java.lang.String r6 = r11.f134845d
            r5.field_appId = r6
            r0.mo69332a(r5, r11)
            boolean r6 = r7.insert(r5)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r12 = r11.f134845d
            r8[r3] = r12
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r12 = 1
            r8[r12] = r6
            java.lang.String r6 = "insert app: AppID = %s, ret = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r8)
        L_0x02f7:
            java.lang.String r5 = r5.field_openId
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0304
            java.lang.String r5 = r11.f134845d
            r9.add(r5)
        L_0x0304:
            r5 = 3
            r6 = 1
            goto L_0x00b2
        L_0x0308:
            int r4 = r9.size()
            if (r4 <= 0) goto L_0x0327
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r9.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            java.lang.String r5 = "needGetOpenIdList %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            com.tencent.mm.pluginsdk.model.app.e0 r2 = ld2.C46848g.Cx0()
            r2.mo69341b(r9)
        L_0x0327:
            java.util.LinkedList<te3.hs2> r1 = r1.f134245d
            int r1 = r1.size()
            r2 = 20
            if (r1 != r2) goto L_0x033c
            int r1 = r0.f120806f
            int r1 = r1 + r2
            r0.f120806f = r1
            java.lang.String r2 = r0.f120803c
            r0.mo69333b(r2, r1)
            goto L_0x034a
        L_0x033c:
            java.util.List<java.lang.String> r1 = r0.f120804d
            r0.mo69336f(r7, r1)
            r0.f120806f = r3
            java.util.List<java.lang.String> r1 = r0.f120804d
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.clear()
        L_0x034a:
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 352276(0x56014, float:4.93644E-40)
            r1.mo119680N(r4, r2)
            long r1 = java.lang.System.currentTimeMillis()
            r0.f120808h = r1
            goto L_0x03bc
        L_0x0366:
            java.lang.String r1 = "Service_appinfo empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            md2.b r1 = md2.C47000b.C34548a.m40384a()
            ym.m r1 = r1.mo72195FM()
            com.tencent.mm.pluginsdk.model.app.p r1 = (com.tencent.p014mm.pluginsdk.model.app.C44579p) r1
            java.util.List<java.lang.String> r2 = r0.f120804d
            r0.mo69336f(r1, r2)
            r0.f120806f = r3
            java.util.List<java.lang.String> r1 = r0.f120804d
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.clear()
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 352276(0x56014, float:4.93644E-40)
            r1.mo119680N(r4, r2)
            long r1 = java.lang.System.currentTimeMillis()
            r0.f120808h = r1
            goto L_0x03bc
        L_0x039f:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)
            r5[r3] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            r7 = 1
            r5[r7] = r6
            r5[r4] = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r5)
            r0.f120806f = r3
            java.util.List<java.lang.String> r0 = r0.f120804d
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.clear()
        L_0x03bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p776zm.C53796i.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
