package pv2;

import android.app.Application;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import f40.C86732g0;
import k40.C9562a;
import lc3.C10485b;
import p156gj.C107833g0;
import p156gj.C107835h0;
import p156gj.C107847w;
import p823sg.C90193h;
import rt3.C22252b;
import ut3.C22662b;

/* renamed from: pv2.s */
public class C77292s {

    /* renamed from: a */
    public static String f225402a = "";

    /* renamed from: b */
    public static String f225403b = "";

    /* renamed from: c */
    public static String f225404c = "";

    /* renamed from: a */
    public static String m93114a() {
        String str = C22662b.m26538b().mo35774a().get(1, "");
        if (!Util.isNullOrNil(str)) {
            return str;
        }
        return "WechatAuthKeyPay&" + f225402a;
    }

    /* renamed from: b */
    public static String m93115b() {
        try {
            String f = C90193h.m112878f(C86709a0.m107523b().mo121111i().getBytes());
            return f != null ? f.substring(0, 8) : "";
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SoterUtil", e, "alvinluo get md5 exception", new Object[0]);
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m93116c() {
        if (C107835h0.f322851h.f322842a) {
            return C22252b.m25806c();
        }
        Log.m105924i("MicroMsg.SoterUtil", "hy: dynamic config is not support soter");
        return false;
    }

    /* renamed from: d */
    public static String m93117d(int i) {
        Object[] objArr = new Object[2];
        String b = m93115b();
        if (b == null) {
            b = "";
        }
        objArr[0] = b;
        objArr[1] = Integer.valueOf(i);
        return String.format("SoterAuthKeyV2_salt%s_scene%d", objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m93118e(int r8) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            if (r8 != r1) goto L_0x0019
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "WechatAuthKeyPay&"
            r8.append(r0)
            java.lang.String r0 = f225402a
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x0019:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = f225402a     // Catch:{ Exception -> 0x0030 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x0030 }
            java.lang.String r4 = p823sg.C90193h.m112878f(r4)     // Catch:{ Exception -> 0x0030 }
            if (r4 == 0) goto L_0x003a
            r5 = 8
            java.lang.String r4 = r4.substring(r3, r5)     // Catch:{ Exception -> 0x0030 }
            goto L_0x003b
        L_0x0030:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "MicroMsg.SoterUtil"
            java.lang.String r7 = "alvinluo get md5 exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r4, r7, r5)
        L_0x003a:
            r4 = r0
        L_0x003b:
            if (r4 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r0 = r4
        L_0x003f:
            r2[r3] = r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r1] = r8
            java.lang.String r8 = "SoterAuthKey_salt%s_scene%d"
            java.lang.String r8 = java.lang.String.format(r8, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pv2.C77292s.m93118e(int):java.lang.String");
    }

    /* renamed from: f */
    public static void m93119f() {
        C9562a b = C86709a0.m107530l().f251797a.mo122505b(C10485b.class);
        if (b == null) {
            Application application = C86732g0.m107592c().mo121134b().mo58407a().f124990c;
            b = null;
        }
        boolean z = Util.getInt(((C10485b) b).vh0().mo107405c("SoterEntry"), 0) == 1;
        Log.m105925i("MicroMsg.SoterUtil", "alvinluo dynamic config support soter: %b", Boolean.valueOf(z));
        if (z) {
            Log.m105918d("MicroMsg.SoterUtil", "alvinluo set all soter support flag to true");
            C107833g0 g0Var = C107835h0.f322851h;
            g0Var.f322842a = true;
            g0Var.f322843b = 255;
            C107847w wVar = C107835h0.f322849f;
            wVar.f322932a = 1;
            wVar.f322933b = 1;
            Log.m105919d("MicroMsg.SoterUtil", "alvinluo deviceInfo soter support: %b, force status: %d, allow external: %d", Boolean.valueOf(C107835h0.f322851h.f322842a), Integer.valueOf(C107835h0.f322849f.f322932a), Integer.valueOf(C107835h0.f322849f.f322933b));
        }
    }

    /* renamed from: g */
    public static void m93120g(int i) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SOTER_UPLOAD_AK_FAILURE_INT_SYNC, Integer.valueOf(i));
    }
}
