package oc2;

import android.content.ComponentName;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import rc2.C48017a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: oc2.c */
public class C47363c extends C86301e {

    /* renamed from: d */
    public C48017a f127096d;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAccountInitialized(android.content.Context r12) {
        /*
            r11 = this;
            java.lang.Class<oc2.c> r0 = oc2.C47363c.class
            super.onAccountInitialized(r12)
            r12 = 1
            java.lang.Object[] r1 = new java.lang.Object[r12]
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r3 = android.os.Process.myPid()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.getProcessNameByPid(r2, r3)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.SubCoreCpuCard"
            java.lang.String r5 = "alvinluo process: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            f40.e r1 = f40.C86709a0.m107523b()
            r1.mo121108c()
            di3.d r1 = di3.C86312j.m106911c(r0)
            oc2.c r1 = (oc2.C47363c) r1
            rc2.a r1 = r1.f127096d
            if (r1 != 0) goto L_0x0040
            di3.d r1 = di3.C86312j.m106911c(r0)
            oc2.c r1 = (oc2.C47363c) r1
            rc2.a r5 = new rc2.a
            r5.<init>()
            r1.f127096d = r5
        L_0x0040:
            di3.d r1 = di3.C86312j.m106911c(r0)
            oc2.c r1 = (oc2.C47363c) r1
            rc2.a r1 = r1.f127096d
            r1.getClass()
            java.lang.String r5 = "MicroMsg.CpuCardConfigManager"
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00bb }
            android.nfc.NfcAdapter r6 = android.nfc.NfcAdapter.getDefaultAdapter(r6)     // Catch:{ Exception -> 0x00bb }
            if (r6 != 0) goto L_0x005d
            java.lang.String r6 = "Nfc not support no need update"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ Exception -> 0x00bb }
            goto L_0x00c3
        L_0x005d:
            te3.y33 r6 = r1.f128801d
            if (r6 == 0) goto L_0x00c3
            int r6 = r6.f145099f
            r7 = 1800(0x708, float:2.522E-42)
            r8 = 604800(0x93a80, float:8.47505E-40)
            if (r6 >= r7) goto L_0x006d
            r6 = 1800(0x708, float:2.522E-42)
            goto L_0x0072
        L_0x006d:
            if (r6 <= r8) goto L_0x0072
            r6 = 604800(0x93a80, float:8.47505E-40)
        L_0x0072:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "now="
            r7.append(r8)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r7.append(r8)
            java.lang.String r8 = ", lastUpdateTime="
            r7.append(r8)
            te3.y33 r8 = r1.f128801d
            long r8 = r8.f145101h
            r7.append(r8)
            java.lang.String r8 = ", updateFreq="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r8 = ", configUpdateFreq="
            r7.append(r8)
            te3.y33 r8 = r1.f128801d
            int r8 = r8.f145099f
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            te3.y33 r9 = r1.f128801d
            long r9 = r9.f145101h
            long r7 = r7 - r9
            long r9 = (long) r6
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c3
            r6 = 1
            goto L_0x00c4
        L_0x00bb:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r6, r8, r7)
        L_0x00c3:
            r6 = 0
        L_0x00c4:
            if (r6 == 0) goto L_0x00e4
            java.lang.String r6 = "do update cpu card config"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            ob0.b0 r5 = eb0.C97625j3.m125815e()
            r6 = 1561(0x619, float:2.187E-42)
            r5.mo123455a(r6, r1)
            ob0.b0 r5 = eb0.C97625j3.m125815e()
            qc2.a r6 = new qc2.a
            te3.y33 r1 = r1.f128801d
            int r1 = r1.f145098e
            r6.<init>(r1)
            r5.mo123460f(r6)
        L_0x00e4:
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NFC_OPEN_SWITCH_INT_SYNC
            java.lang.Object r1 = r1.mo119685f(r5, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x0118
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NFC_OPEN_DEFAULT_SWITCH_INT_SYNC
            java.lang.Object r1 = r1.mo119685f(r5, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r12) goto L_0x0114
            r11.vx0(r12)
            goto L_0x0121
        L_0x0114:
            r11.vx0(r3)
            goto L_0x0121
        L_0x0118:
            if (r1 != r12) goto L_0x011e
            r11.vx0(r12)
            goto L_0x0121
        L_0x011e:
            r11.vx0(r3)
        L_0x0121:
            java.lang.String r12 = "doNFCReport start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
            zt3.t r12 = zt3.C119157j.f356862d
            oc2.b r1 = new oc2.b
            r1.<init>(r11)
            java.lang.String r0 = r0.getName()
            zt3.j r12 = (zt3.C119157j) r12
            r2 = 10000(0x2710, double:4.9407E-320)
            r12.mo183879j(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oc2.C47363c.onAccountInitialized(android.content.Context):void");
    }

    public final void vx0(boolean z) {
        if (z) {
            Util.setComponentEnabledSetting(MMApplicationContext.getContext(), new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
        } else {
            Util.setComponentEnabledSetting(MMApplicationContext.getContext(), new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
        }
    }
}
