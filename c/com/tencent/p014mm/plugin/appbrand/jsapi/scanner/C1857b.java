package com.tencent.p014mm.plugin.appbrand.jsapi.scanner;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.b */
public class C1857b extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 434;
    public static final String NAME = "openQRCode";

    /* renamed from: g */
    public static volatile boolean f11680g;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r12, org.json.JSONObject r13, int r14) {
        /*
            r11 = this;
            com.tencent.mm.plugin.appbrand.i2 r12 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r12
            boolean r0 = f11680g
            if (r0 == 0) goto L_0x0011
            java.lang.String r13 = "cancel"
            java.lang.String r13 = r11.mo115109j(r13)
            r12.mo109647a(r14, r13)
            goto L_0x012c
        L_0x0011:
            r0 = 1
            f11680g = r0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r13
            java.lang.String r3 = "MicroMsg.JsApiOpenQRCode"
            java.lang.String r4 = "openQRCode data::%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            android.app.Activity r5 = r12.mo114344o0()
            if (r5 != 0) goto L_0x0038
            f11680g = r2
            java.lang.String r13 = "pageContext is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)
            java.lang.String r13 = "fail:context is err"
            java.lang.String r13 = r11.mo115109j(r13)
            r12.mo109647a(r14, r13)
            goto L_0x012c
        L_0x0038:
            java.lang.String r1 = "desc"
            r13.optString(r1)
            java.lang.String r1 = "needResult"
            java.lang.String r1 = r13.optString(r1)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r0)
            java.lang.String r4 = "scanType"
            java.lang.String r13 = r13.optString(r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0084
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x007d }
            r6.<init>(r13)     // Catch:{ Exception -> 0x007d }
            r13 = r4
            r7 = 0
        L_0x005b:
            int r8 = r6.length()     // Catch:{ Exception -> 0x007e }
            if (r7 >= r8) goto L_0x0085
            java.lang.Object r8 = r6.get(r7)     // Catch:{ Exception -> 0x007e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x007e }
            java.lang.String r9 = "qrCode"
            boolean r9 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x007e }
            if (r9 == 0) goto L_0x0071
            r4 = 1
            goto L_0x007a
        L_0x0071:
            java.lang.String r9 = "barCode"
            boolean r8 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x007e }
            if (r8 == 0) goto L_0x007a
            r13 = 1
        L_0x007a:
            int r7 = r7 + 1
            goto L_0x005b
        L_0x007d:
            r13 = r4
        L_0x007e:
            java.lang.String r6 = "doScanQRCode, ex in scanType"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            goto L_0x0085
        L_0x0084:
            r13 = r4
        L_0x0085:
            r6 = 4
            if (r4 == 0) goto L_0x008d
            if (r13 != 0) goto L_0x008d
            r13 = 8
            goto L_0x0094
        L_0x008d:
            if (r4 != 0) goto L_0x0093
            if (r13 == 0) goto L_0x0093
            r13 = 4
            goto L_0x0094
        L_0x0093:
            r13 = 1
        L_0x0094:
            rc.g r4 = p225rc.C89916g.m112446a(r5)
            com.tencent.mm.plugin.appbrand.jsapi.scanner.a r7 = new com.tencent.mm.plugin.appbrand.jsapi.scanner.a
            r7.<init>(r11, r12, r14)
            r4.mo124232f(r7)
            r4 = 9
            java.lang.String r7 = "key_scan_report_enter_scene"
            java.lang.String r8 = "key_scan_entry_scene"
            java.lang.String r9 = "key_enable_multi_code"
            java.lang.String r10 = "BaseScanUI_select_scan_mode"
            if (r1 != 0) goto L_0x00d6
            java.lang.String r0 = "doScanQRCode, startActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtra(r10, r13)
            r0.putExtra(r9, r2)
            r0.putExtra(r8, r6)
            r0.putExtra(r7, r4)
            java.lang.String r13 = "scanner"
            java.lang.String r1 = ".ui.BaseScanUI"
            ke3.C88144b.m109792j(r5, r13, r1, r0, r2)
            f11680g = r2
            java.lang.String r13 = "ok"
            java.lang.String r13 = r11.mo115109j(r13)
            r12.mo109647a(r14, r13)
            goto L_0x012c
        L_0x00d6:
            if (r1 != r0) goto L_0x011e
            java.lang.Object[] r12 = new java.lang.Object[r0]
            int r14 = r11.hashCode()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12[r2] = r14
            java.lang.String r14 = "doScanQRCode, startActivityForResult requestCode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r14, r12)
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            r12.putExtra(r10, r13)
            java.lang.String r13 = "BaseScanUI_only_scan_qrcode_with_zbar"
            r12.putExtra(r13, r0)
            java.lang.String r13 = "key_set_result_after_scan"
            r12.putExtra(r13, r0)
            r12.putExtra(r9, r2)
            r12.putExtra(r8, r6)
            r12.putExtra(r7, r4)
            r13 = 3
            java.lang.String r14 = "GetFriendQRCodeUI.INTENT_FROM_ACTIVITY"
            r12.putExtra(r14, r13)
            int r13 = r11.hashCode()
            r14 = 65535(0xffff, float:9.1834E-41)
            r9 = r13 & r14
            r10 = 0
            java.lang.String r6 = "scanner"
            java.lang.String r7 = ".ui.BaseScanUI"
            r8 = r12
            ke3.C88144b.m109796n(r5, r6, r7, r8, r9, r10)
            goto L_0x012c
        L_0x011e:
            java.lang.String r13 = "needResult is err"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)
            java.lang.String r13 = "fail:invalid data"
            java.lang.String r13 = r11.mo115109j(r13)
            r12.mo109647a(r14, r13)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.scanner.C1857b.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
