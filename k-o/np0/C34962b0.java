package np0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f62.C31922b1;
import wi0.C38158d;

/* renamed from: np0.b0 */
public enum C34962b0 implements C31922b1 {
    INSTANCE;

    /* renamed from: B */
    public Long mo59804B(String str, String str2) {
        C38158d h1 = C81161g2.m99451h1();
        if (h1 == null) {
            Log.m105921e("MicroMsg.WxaWeAppPushCommandMgr", "getExpireTime(appId:%s, type:%s), kvStorage==NULL, account initialized:%b", str, str2, Boolean.valueOf(C86709a0.m107523b().f251765p));
            return null;
        }
        String Lo = h1.mo61553Lo(mo59805q(str, str2), "");
        if (TextUtils.isEmpty(Lo)) {
            return null;
        }
        if (Long.valueOf(Lo).longValue() < System.currentTimeMillis()) {
            C81161g2.m99451h1().mo61554c(mo59805q(str, str2));
            Log.m105924i("MicroMsg.WxaWeAppPushCommandMgr", "delete data app id=" + str);
        }
        return Long.valueOf(Lo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c2  */
    /* renamed from: X5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo10269X5(java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19, ob0.C35136m.C35137a r20) {
        /*
            r17 = this;
            r0 = r19
            java.lang.String r1 = "WeAppPushCommand"
            r2 = r18
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00d8
            java.lang.String r1 = ".sysmsg.WeAppPushCommand.weapp"
            r2 = 0
            r3 = r1
            r4 = 0
        L_0x0011:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r6 = ".$cmdtype"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r7 = ".$appid"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = ".expireSeconds"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            r8 = 1
            if (r7 != 0) goto L_0x0071
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0071
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L_0x0071
            boolean r7 = android.text.TextUtils.isDigitsOnly(r3)
            if (r7 == 0) goto L_0x0071
            r7 = 1
            goto L_0x0072
        L_0x0071:
            r7 = 0
        L_0x0072:
            if (r7 == 0) goto L_0x00a3
            r5.getClass()
            java.lang.String r7 = "copypath"
            boolean r9 = r5.equals(r7)
            if (r9 != 0) goto L_0x0080
            goto L_0x00a3
        L_0x0080:
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            long r9 = r9.longValue()
            wi0.d r11 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.m99451h1()
            r12 = r17
            java.lang.String r7 = r12.mo59805q(r6, r7)
            long r13 = java.lang.System.currentTimeMillis()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r15
            long r13 = r13 + r9
            java.lang.String r9 = java.lang.String.valueOf(r13)
            r11.mo61552B9(r7, r9)
            goto L_0x00a5
        L_0x00a3:
            r12 = r17
        L_0x00a5:
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r7[r2] = r9
            r7[r8] = r6
            r6 = 2
            r7[r6] = r5
            r5 = 3
            r7[r5] = r3
            java.lang.String r3 = "MicroMsg.WxaWeAppPushCommandMgr"
            java.lang.String r5 = "[consumeNewXml] index = %d, appId =%s, cmdType=%s, expireSeconds = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r7)
            int r4 = r4 + r8
            if (r4 != 0) goto L_0x00c2
            r3 = r1
            goto L_0x00d1
        L_0x00c2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x00d1:
            boolean r5 = r0.containsKey(r3)
            if (r5 != 0) goto L_0x0011
            goto L_0x00da
        L_0x00d8:
            r12 = r17
        L_0x00da:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: np0.C34962b0.mo10269X5(java.lang.String, java.util.Map, ob0.m$a):ob0.m$b");
    }

    /* renamed from: q */
    public final String mo59805q(String str, String str2) {
        return str + "#WxaWeAppPushCommandMgr#" + str2;
    }
}
