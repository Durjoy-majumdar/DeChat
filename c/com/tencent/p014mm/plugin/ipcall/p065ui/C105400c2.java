package com.tencent.p014mm.plugin.ipcall.p065ui;

import com.tencent.p014mm.plugin.ipcall.p065ui.DialPad;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.c2 */
public class C105400c2 implements DialPad.C105386a {

    /* renamed from: a */
    public final /* synthetic */ C105420i2 f313367a;

    public C105400c2(C105420i2 i2Var) {
        this.f313367a = i2Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150109a(java.lang.String r9) {
        /*
            r8 = this;
            com.tencent.mm.plugin.ipcall.ui.i2 r0 = r8.f313367a
            android.widget.EditText r0 = r0.f313428a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x001a
            com.tencent.mm.plugin.ipcall.ui.i2 r1 = r8.f313367a
            long r2 = java.lang.System.currentTimeMillis()
            r1.f313423B = r2
        L_0x001a:
            long r1 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.ipcall.ui.i2 r3 = r8.f313367a
            long r3 = r3.f313423B
            long r3 = r1 - r3
            r5 = 3000(0xbb8, double:1.482E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x003b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x003b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = r3.toString()
            com.tencent.mm.plugin.ipcall.ui.i2 r3 = r8.f313367a
            r3.f313423B = r1
            java.lang.String r1 = ""
            r3.mo150167i(r0, r1)
            com.tencent.mm.plugin.ipcall.ui.i2 r0 = r8.f313367a
            com.tencent.mm.plugin.ipcall.IPCallManager r0 = r0.f313452y
            r0.getClass()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r9
            java.lang.String r3 = "MicroMsg.IPCallManager"
            java.lang.String r4 = "dialWhenTalking, dialButton: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r1)
            com.tencent.mm.plugin.ipcall.model.e r1 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Fx0()
            boolean r1 = r1.mo150085c()
            if (r1 != 0) goto L_0x0078
            java.lang.String r9 = "ipcall not connect, cannot call dialWhenTalking now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            goto L_0x00ff
        L_0x0078:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r1 != 0) goto L_0x00ff
            int r1 = r9.length()
            if (r1 != r0) goto L_0x00ff
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r3 = -1
            if (r1 != 0) goto L_0x00b9
            int r1 = r9.length()
            if (r1 != r0) goto L_0x00b9
            char r9 = r9.charAt(r2)
            r1 = 48
            if (r9 < r1) goto L_0x009f
            r4 = 57
            if (r9 > r4) goto L_0x009f
            int r9 = r9 - r1
            goto L_0x00ba
        L_0x009f:
            r1 = 42
            if (r9 != r1) goto L_0x00a6
            r9 = 10
            goto L_0x00ba
        L_0x00a6:
            r1 = 35
            if (r9 != r1) goto L_0x00ad
            r9 = 11
            goto L_0x00ba
        L_0x00ad:
            r1 = 65
            if (r9 < r1) goto L_0x00b9
            r4 = 68
            if (r9 > r4) goto L_0x00b9
            int r9 = r9 - r1
            int r9 = r9 + 12
            goto L_0x00ba
        L_0x00b9:
            r9 = -1
        L_0x00ba:
            if (r9 == r3) goto L_0x00ff
            m12.b r1 = com.tencent.p014mm.plugin.ipcall.model.C105385g.zx0()
            r1.getClass()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r3[r2] = r4
            java.lang.String r4 = "MicroMsg.IPCallEngineManager"
            java.lang.String r5 = "sendDTMF: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r3)
            m12.c r3 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            int r5 = r3.f327652G
            int r5 = r5 + r0
            r3.f327652G = r5
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r2] = r5
            java.lang.String r5 = "MicroMsg.IPCallReportHelper"
            java.lang.String r6 = "now addCallClickCnt %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            com.tencent.mm.plugin.voip.model.v2protocal r1 = r1.f327640a
            int r9 = r1.SendDTMF(r9)
            if (r9 >= 0) goto L_0x00ff
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r2] = r9
            java.lang.String r9 = "sendDTMF failed, ret: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r1)
        L_0x00ff:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 12057(0x2f19, float:1.6895E-41)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r2] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r0] = r4
            r4 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r4] = r2
            r2 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            r9.mo160131h(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.p065ui.C105400c2.mo150109a(java.lang.String):void");
    }

    /* renamed from: b */
    public void mo150110b(String str) {
    }
}
