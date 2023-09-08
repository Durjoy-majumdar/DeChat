package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C75569c4;
import eb0.C75592q0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.q */
public final class C72922q {

    /* renamed from: a */
    public static MultiProcessMMKV f212537a;

    /* renamed from: b */
    public static String f212538b;

    static {
        try {
            boolean a = C86709a0.m107522a();
            if (a && f212537a == null) {
                f212537a = MultiProcessMMKV.getMMKV(C75592q0.m90789s() + "mmkv_biz_half_chatting_util");
            }
            Log.m105924i("MicroMsg.BizHalfScreenChattingUtil", "checkInitMMKV accReady:" + a + ", mmkv: " + f212537a);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BizHalfScreenChattingUtil", e, "checkInitMMKV exception", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[Catch:{ Exception -> 0x007e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015 A[Catch:{ Exception -> 0x007e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m85518a() {
        /*
            java.lang.String r0 = "MicroMsg.BizHalfScreenChattingUtil"
            r1 = 0
            java.lang.String r2 = f212538b     // Catch:{ Exception -> 0x007e }
            r3 = 1
            if (r2 == 0) goto L_0x0011
            boolean r2 = z04.C112551y.m153811k(r2)     // Catch:{ Exception -> 0x007e }
            if (r2 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r2 = 0
            goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            if (r2 == 0) goto L_0x0015
            return
        L_0x0015:
            long r4 = eb0.C31543z5.m39451a()     // Catch:{ Exception -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007e }
            r2.<init>()     // Catch:{ Exception -> 0x007e }
            java.lang.String r6 = "early"
            r2.append(r6)     // Catch:{ Exception -> 0x007e }
            java.lang.String r6 = f212538b     // Catch:{ Exception -> 0x007e }
            r2.append(r6)     // Catch:{ Exception -> 0x007e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x007e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007e }
            r6.<init>()     // Catch:{ Exception -> 0x007e }
            java.lang.String r7 = "late"
            r6.append(r7)     // Catch:{ Exception -> 0x007e }
            java.lang.String r7 = f212538b     // Catch:{ Exception -> 0x007e }
            r6.append(r7)     // Catch:{ Exception -> 0x007e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x007e }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = f212537a     // Catch:{ Exception -> 0x007e }
            if (r7 == 0) goto L_0x004a
            boolean r7 = r7.containsKey(r2)     // Catch:{ Exception -> 0x007e }
            if (r7 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x005a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = f212537a     // Catch:{ Exception -> 0x007e }
            if (r3 == 0) goto L_0x005a
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r4)     // Catch:{ Exception -> 0x007e }
            if (r2 == 0) goto L_0x005a
            r2.apply()     // Catch:{ Exception -> 0x007e }
        L_0x005a:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = f212537a     // Catch:{ Exception -> 0x007e }
            if (r2 == 0) goto L_0x0067
            android.content.SharedPreferences$Editor r2 = r2.putLong(r6, r4)     // Catch:{ Exception -> 0x007e }
            if (r2 == 0) goto L_0x0067
            r2.apply()     // Catch:{ Exception -> 0x007e }
        L_0x0067:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007e }
            r2.<init>()     // Catch:{ Exception -> 0x007e }
            java.lang.String r3 = "markSendMsgFromBizArticle  articleIdentity:"
            r2.append(r3)     // Catch:{ Exception -> 0x007e }
            java.lang.String r3 = f212538b     // Catch:{ Exception -> 0x007e }
            r2.append(r3)     // Catch:{ Exception -> 0x007e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x007e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x007e }
            goto L_0x0086
        L_0x007e:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "markSendMsgFromBizArticle"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r1)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C72922q.m85518a():void");
    }

    /* renamed from: b */
    public static final void m85519b(String str, String str2) {
        f212538b = str;
        C75569c4.f222004g = str2;
        Log.m105924i("MicroMsg.BizHalfScreenChattingUtil", "setMPPageIdentityData  articleIdentity:" + str + "  identity:" + str2);
    }
}
