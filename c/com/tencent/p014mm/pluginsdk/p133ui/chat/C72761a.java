package com.tencent.p014mm.pluginsdk.p133ui.chat;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.a */
public class C72761a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppPanel f212092d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.a$a */
    public class C72762a implements Runnable {
        public C72762a() {
        }

        public void run() {
            AppPanel appPanel = C72761a.this.f212092d;
            int curScreen = appPanel.f211723z == -1 ? appPanel.f211713p.getCurScreen() : -1;
            AppPanel.m85214n(C72761a.this.f212092d);
            if (curScreen != -1) {
                C72761a.this.f212092d.f211713p.setToScreen(curScreen);
                C72761a.this.f212092d.f211714q.setSelectedDot(curScreen);
            }
        }
    }

    public C72761a(AppPanel appPanel) {
        this.f212092d = appPanel;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0081, code lost:
        r0 = (nz0.C76982e) di3.C86312j.m106911c(nz0.C76982e.class);
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v1, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "MicroMsg.AppPanel"
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = r1.f212092d
            java.util.List<com.tencent.mm.pluginsdk.model.app.j> r0 = r0.f211699M
            r0.clear()
            r3 = 0
            r4 = 1
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x005c }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x005c }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x005c }
            java.lang.String r5 = "ShowAPPSuggestion"
            java.lang.String r0 = r0.mo107405c(r5)     // Catch:{ Exception -> 0x005c }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x005c }
            if (r5 != 0) goto L_0x0046
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x005c }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x005c }
            if (r0 == r4) goto L_0x0030
            goto L_0x0046
        L_0x0030:
            java.lang.String r0 = "jacks show App Suggestion"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x005c }
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = r1.f212092d     // Catch:{ Exception -> 0x005c }
            android.content.Context r5 = r0.f211711n     // Catch:{ Exception -> 0x005c }
            r6 = 0
            r7 = 1
            r8 = 1
            r9 = 1
            int r10 = r0.f211688B     // Catch:{ Exception -> 0x005c }
            java.util.List r5 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48991k(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x005c }
            r0.f211699M = r5     // Catch:{ Exception -> 0x005c }
            goto L_0x007a
        L_0x0046:
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = r1.f212092d     // Catch:{ Exception -> 0x005c }
            android.content.Context r5 = r0.f211711n     // Catch:{ Exception -> 0x005c }
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 1
            int r10 = r0.f211688B     // Catch:{ Exception -> 0x005c }
            java.util.List r5 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48991k(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x005c }
            r0.f211699M = r5     // Catch:{ Exception -> 0x005c }
            java.lang.String r0 = "jacks not show App Suggestion"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x005c }
            goto L_0x007a
        L_0x005c:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r5[r3] = r0
            java.lang.String r0 = "exception in appPanel init, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r5)
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = r1.f212092d
            android.content.Context r5 = r0.f211711n
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 1
            int r10 = r0.f211688B
            java.util.List r5 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48991k(r5, r6, r7, r8, r9, r10)
            r0.f211699M = r5
        L_0x007a:
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = r1.f212092d
            boolean r0 = r0.f211696J
            if (r0 == 0) goto L_0x0081
            goto L_0x0099
        L_0x0081:
            java.lang.Class<nz0.e> r0 = nz0.C76982e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            nz0.e r0 = (nz0.C76982e) r0
            if (r0 == 0) goto L_0x0099
            boolean r5 = r0.mo59841yc()
            if (r5 == 0) goto L_0x0099
            int r0 = r0.mo59838NK()
            if (r0 <= 0) goto L_0x0099
            r0 = 1
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            if (r0 != 0) goto L_0x00d4
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = r1.f212092d
            java.util.List<com.tencent.mm.pluginsdk.model.app.j> r5 = r0.f211699M
            r0.getClass()
            if (r5 == 0) goto L_0x00d4
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00ac
            goto L_0x00d4
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            int r6 = r5.size()
            if (r0 >= r6) goto L_0x00d4
            java.lang.Object r6 = r5.get(r0)
            com.tencent.mm.pluginsdk.model.app.j r6 = (com.tencent.p014mm.pluginsdk.model.app.C44561j) r6
            if (r6 == 0) goto L_0x00d1
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r7 = com.tencent.p014mm.pluginsdk.model.app.C44561j.f120844x1
            java.lang.String r7 = r6.field_appId
            java.lang.String r8 = "wx7302cee7c7d6d7d6"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00d1
            r5.remove(r6)
            java.lang.String r0 = "do remove card"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x00d4
        L_0x00d1:
            int r0 = r0 + 1
            goto L_0x00ad
        L_0x00d4:
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = r1.f212092d
            java.util.List<com.tencent.mm.pluginsdk.model.app.j> r5 = r0.f211699M
            boolean r6 = r0.f211689C
            r0.f211689C = r3
            boolean r7 = r0.f211690D
            boolean r8 = r0.f211691E
            boolean r9 = r0.f211692F
            r0.f211690D = r3
            r0.f211691E = r3
            r0.f211692F = r3
            int r10 = r0.f211688B
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            md2.b r11 = md2.C47000b.C34548a.m40384a()
            if (r11 != 0) goto L_0x00fd
            java.lang.String r10 = "MicroMsg.AppInfoLogic"
            java.lang.String r11 = "getServiceByAppInfoFlagAndShowFlag, getISubCorePluginBase() == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r11)
            goto L_0x0107
        L_0x00fd:
            md2.b r11 = md2.C47000b.C34548a.m40384a()
            android.database.Cursor r10 = r11.mo72202ir(r3, r10)
            if (r10 != 0) goto L_0x0109
        L_0x0107:
            r11 = 0
            goto L_0x0110
        L_0x0109:
            int r11 = r10.getCount()
            r10.close()
        L_0x0110:
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r10[r3] = r12
            int r12 = r0.f211688B
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10[r4] = r12
            if (r5 == 0) goto L_0x0128
            int r12 = r5.size()
            goto L_0x0129
        L_0x0128:
            r12 = -1
        L_0x0129:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 2
            r10[r13] = r12
            java.lang.String r12 = "serviceCount, %d, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r10 = r0.f211710j
            if (r10 == 0) goto L_0x0152
            ck3.b r10 = r10.mo100531a()
            if (r10 != 0) goto L_0x0141
            goto L_0x0152
        L_0x0141:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r10 = r0.f211710j
            ck3.b r10 = r10.mo100531a()
            java.lang.Class<zj3.n0> r12 = zj3.C79372n0.class
            com.tencent.mm.ui.chatting.manager.a r10 = r10.f193278b
            xi.d r10 = r10.mo102812a(r12)
            zj3.n0 r10 = (zj3.C79372n0) r10
            goto L_0x0153
        L_0x0152:
            r10 = 0
        L_0x0153:
            java.lang.String r12 = "has_luckymoney_service_app"
            java.lang.String r14 = "has_remittance_service_app"
            if (r10 == 0) goto L_0x0161
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r10.mo109365C0(r14, r15)
            r10.mo109365C0(r12, r15)
        L_0x0161:
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            r0.f211697K = r15
            if (r11 <= 0) goto L_0x0261
            if (r5 == 0) goto L_0x0258
            int r11 = r5.size()
            if (r11 <= 0) goto L_0x0258
            r11 = 0
        L_0x0173:
            int r15 = r5.size()
            if (r11 >= r15) goto L_0x0261
            java.lang.Object r15 = r5.get(r11)
            com.tencent.mm.pluginsdk.model.app.j r15 = (com.tencent.p014mm.pluginsdk.model.app.C44561j) r15
            if (r15 == 0) goto L_0x0251
            java.lang.String r3 = r15.field_appId
            if (r3 == 0) goto L_0x0251
            boolean r3 = r15.mo69361t2()
            if (r3 == 0) goto L_0x0251
            int r3 = r15.field_serviceAppInfoFlag
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0192
            r3 = 1
            goto L_0x0193
        L_0x0192:
            r3 = 0
        L_0x0193:
            if (r3 != 0) goto L_0x0197
            r0.f211689C = r4
        L_0x0197:
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r3 = com.tencent.p014mm.pluginsdk.model.app.C44561j.f120844x1
            java.lang.String r3 = r15.field_appId
            java.lang.String r4 = "wxce6f23b478a3a2a2"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x01d9
            java.util.Map<java.lang.String, com.tencent.mm.pluginsdk.model.app.j> r3 = r0.f211697K
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r4, r15)
            java.lang.Object[] r3 = new java.lang.Object[r13]
            boolean r4 = r0.f211694H
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r16 = 0
            r3[r16] = r4
            boolean r4 = r0.f211690D
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r13 = 1
            r3[r13] = r4
            java.lang.String r4 = "remittance: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            boolean r3 = r0.f211694H
            if (r3 != 0) goto L_0x01d3
            r0.f211690D = r13
            if (r10 == 0) goto L_0x01d3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r10.mo109365C0(r14, r3)
        L_0x01d3:
            int r3 = r11 + -1
            r5.remove(r11)
            r11 = r3
        L_0x01d9:
            java.lang.String r3 = r15.field_appId
            java.lang.String r4 = "wx6fa7e3bab7e15415"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0218
            java.util.Map<java.lang.String, com.tencent.mm.pluginsdk.model.app.j> r3 = r0.f211697K
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r4, r15)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            boolean r3 = r0.f211693G
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r13 = 0
            r4[r13] = r3
            boolean r3 = r0.f211691E
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r13 = 1
            r4[r13] = r3
            java.lang.String r3 = "luckyMoney: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            boolean r3 = r0.f211693G
            if (r3 != 0) goto L_0x0212
            r0.f211691E = r13
            if (r10 == 0) goto L_0x0212
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r10.mo109365C0(r12, r3)
        L_0x0212:
            int r3 = r11 + -1
            r5.remove(r11)
            r11 = r3
        L_0x0218:
            java.lang.String r3 = r15.field_appId
            java.lang.String r4 = "wx3cc22b542de028d4"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0251
            java.util.Map<java.lang.String, com.tencent.mm.pluginsdk.model.app.j> r3 = r0.f211697K
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r4, r15)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            boolean r13 = r0.f211693G
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r15 = 0
            r4[r15] = r13
            boolean r13 = r0.f211691E
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r15 = 1
            r4[r15] = r13
            java.lang.String r13 = "aa: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r13, r4)
            boolean r4 = r0.f211695I
            if (r4 != 0) goto L_0x024a
            r0.f211692F = r15
        L_0x024a:
            int r4 = r11 + -1
            r5.remove(r11)
            r11 = r4
            goto L_0x0252
        L_0x0251:
            r3 = 2
        L_0x0252:
            r4 = 1
            int r11 = r11 + r4
            r3 = 0
            r13 = 2
            goto L_0x0173
        L_0x0258:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 965(0x3c5, float:1.352E-42)
            r10 = 36
            r3.mo175911u(r5, r10)
        L_0x0261:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            boolean r4 = r0.f211689C
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "hasService %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            boolean r2 = r0.f211689C
            if (r6 != r2) goto L_0x0281
            boolean r3 = r0.f211690D
            if (r7 != r3) goto L_0x0281
            boolean r3 = r0.f211691E
            if (r8 != r3) goto L_0x0281
            boolean r3 = r0.f211692F
            if (r9 == r3) goto L_0x029c
        L_0x0281:
            com.tencent.mm.pluginsdk.ui.chat.h r3 = r0.f211687A
            com.tencent.mm.pluginsdk.ui.chat.h$c r4 = r3.f212164h
            r4.f212183a = r2
            boolean r2 = r0.f211690D
            com.tencent.mm.pluginsdk.ui.chat.h$c r4 = r3.f212165i
            r4.f212183a = r2
            boolean r2 = r0.f211691E
            com.tencent.mm.pluginsdk.ui.chat.h$c r4 = r3.f212176t
            r4.f212183a = r2
            boolean r2 = r0.f211692F
            com.tencent.mm.pluginsdk.ui.chat.h$c r3 = r3.f212179w
            r3.f212183a = r2
            r0.mo100316o()
        L_0x029c:
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = r1.f212092d
            com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
            if (r2 == 0) goto L_0x02ba
            boolean r3 = r0.f211689C
            com.tencent.mm.pluginsdk.ui.chat.h$c r4 = r2.f212164h
            r4.f212183a = r3
            boolean r3 = r0.f211690D
            com.tencent.mm.pluginsdk.ui.chat.h$c r4 = r2.f212165i
            r4.f212183a = r3
            boolean r3 = r0.f211691E
            com.tencent.mm.pluginsdk.ui.chat.h$c r4 = r2.f212176t
            r4.f212183a = r3
            boolean r0 = r0.f211692F
            com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212179w
            r2.f212183a = r0
        L_0x02ba:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.pluginsdk.ui.chat.a$a r2 = new com.tencent.mm.pluginsdk.ui.chat.a$a
            r2.<init>()
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72761a.run():void");
    }
}
