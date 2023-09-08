package com.tencent.p014mm.p136ui.tools;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.tools.MiniQbCallBackBaseUI */
public class MiniQbCallBackBaseUI extends MMActivity {
    /* renamed from: H7 */
    public void mo8029H7(String str, String str2, int i, String str3, int i2) {
        Log.m105925i(mo8030I7(), "dealEvent() processName:%s appId:%s readProgress:%d", str, str2, Integer.valueOf(i2));
    }

    /* renamed from: I7 */
    public String mo8030I7() {
        return "MicroMsg.FilesFloatBall.MiniQbCallBackBaseUI";
    }

    public int getLayoutId() {
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            super.onCreate(r20)
            android.content.Intent r0 = r19.getIntent()
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = r19.mo8030I7()
            java.lang.String r1 = "deal() getIntent() == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r19.finish()
            goto L_0x01d6
        L_0x0017:
            java.lang.String r0 = r19.mo8030I7()
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            android.content.Intent r3 = r19.getIntent()
            r4 = 0
            r2[r4] = r3
            android.content.Intent r3 = r19.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "deal() %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r2)
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r2 = "thirdCtx"
            boolean r0 = r0.hasExtra(r2)
            r3 = 3
            r6 = 4
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x00ad
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r0 = r0.getStringExtra(r2)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0072 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = "type"
            java.lang.String r8 = r2.getString(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = "processName"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x006f }
            java.lang.String r9 = "appid"
            java.lang.String r9 = r2.getString(r9)     // Catch:{ Exception -> 0x006f }
            java.lang.String r10 = "filePath"
            java.lang.String r2 = r2.getString(r10)     // Catch:{ Exception -> 0x006d }
            goto L_0x0095
        L_0x006d:
            r0 = move-exception
            goto L_0x0075
        L_0x006f:
            r0 = move-exception
            r9 = r7
            goto L_0x0075
        L_0x0072:
            r0 = move-exception
            r8 = r7
            r9 = r8
        L_0x0075:
            java.lang.String r2 = r19.mo8030I7()
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Class r11 = r0.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r10[r4] = r11
            java.lang.String r0 = r0.getMessage()
            r10[r5] = r0
            java.lang.String r0 = "deal() thirdCtx Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r10)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r2 = r7
        L_0x0095:
            java.lang.String r10 = r19.mo8030I7()
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r4] = r8
            r11[r5] = r0
            r11[r1] = r9
            r11[r3] = r2
            java.lang.String r12 = "deal() type:%s processName:%s appId:%s filePath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r11)
            r14 = r0
            r17 = r2
            r15 = r9
            goto L_0x00b2
        L_0x00ad:
            r8 = r7
            r14 = r8
            r15 = r14
            r17 = r15
        L_0x00b2:
            java.util.Set<java.lang.String> r0 = ek3.C97668a.f286473u
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r17)
            r2 = 0
            java.lang.String r9 = r0.getPath()
            if (r9 == 0) goto L_0x00d9
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r4, r4)
            java.lang.String r10 = r0.getPath()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x00d9
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r9)
            android.net.Uri r0 = r0.build()
        L_0x00d9:
            com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r0 = r9.mo177799l(r0, r2)
            boolean r2 = r0.mo177810a()
            if (r2 != 0) goto L_0x00e7
            r0 = 0
            goto L_0x00ef
        L_0x00e7:
            com.tencent.mm.vfs.FileSystem$c r2 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            boolean r0 = r2.mo119948x(r0)
        L_0x00ef:
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = r19.mo8030I7()
            java.lang.String r1 = "deal() filePath not exitst"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r19.finish()
            goto L_0x01d6
        L_0x00ff:
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r2 = "menuId"
            boolean r0 = r0.hasExtra(r2)
            r9 = -1
            if (r0 == 0) goto L_0x0115
            android.content.Intent r0 = r19.getIntent()
            int r0 = r0.getIntExtra(r2, r9)
            goto L_0x0116
        L_0x0115:
            r0 = -1
        L_0x0116:
            android.content.Intent r2 = r19.getIntent()
            java.lang.String r10 = "readProgress"
            boolean r2 = r2.hasExtra(r10)
            if (r2 == 0) goto L_0x0130
            android.content.Intent r2 = r19.getIntent()
            int r2 = r2.getIntExtra(r10, r9)
            if (r2 == r9) goto L_0x012d
            r0 = 6
        L_0x012d:
            r18 = r2
            goto L_0x0132
        L_0x0130:
            r18 = -1
        L_0x0132:
            android.content.Intent r2 = r19.getIntent()
            java.lang.String r10 = "action"
            boolean r2 = r2.hasExtra(r10)
            if (r2 == 0) goto L_0x0171
            android.content.Intent r2 = r19.getIntent()
            java.lang.String r2 = r2.getStringExtra(r10)
            java.lang.String r10 = r19.mo8030I7()
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r11[r4] = r12
            r11[r5] = r2
            java.lang.String r12 = "deal, id: %d, action: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r11)
            java.lang.String r10 = "show"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x0171
            if (r9 != r0) goto L_0x0169
            r0 = 9
            r16 = 9
            goto L_0x0173
        L_0x0169:
            r2 = 7
            if (r2 != r0) goto L_0x0171
            r0 = 10
            r16 = 10
            goto L_0x0173
        L_0x0171:
            r16 = r0
        L_0x0173:
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r2 = "activity_status"
            boolean r0 = r0.hasExtra(r2)
            if (r0 == 0) goto L_0x0188
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r0 = r0.getStringExtra(r2)
            goto L_0x0189
        L_0x0188:
            r0 = r7
        L_0x0189:
            android.content.Intent r2 = r19.getIntent()
            java.lang.String r9 = "change_file"
            boolean r2 = r2.hasExtra(r9)
            if (r2 == 0) goto L_0x019d
            android.content.Intent r2 = r19.getIntent()
            java.lang.String r7 = r2.getStringExtra(r9)
        L_0x019d:
            java.lang.String r2 = r19.mo8030I7()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)
            r6[r4] = r9
            r6[r5] = r0
            r6[r1] = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r6[r3] = r0
            java.lang.String r0 = "id:%s  activityStatus:%s  changeFileName:%s readState:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r6)
            java.lang.String r0 = "miniqb"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r0)
            if (r0 == 0) goto L_0x01c6
            r13 = r19
            r13.mo8029H7(r14, r15, r16, r17, r18)
            goto L_0x01d3
        L_0x01c6:
            java.lang.String r0 = r19.mo8030I7()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r8
            java.lang.String r2 = "deal() unknow source(type:%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
        L_0x01d3:
            r19.finish()
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.MiniQbCallBackBaseUI.onCreate(android.os.Bundle):void");
    }
}
