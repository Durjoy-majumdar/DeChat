package y90;

/* renamed from: y90.b */
public final class C38980b {

    /* renamed from: a */
    public static final C38980b f105023a = new C38980b();

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d1, code lost:
        if (r0.f91482a.size() > 0) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61860a() {
        /*
            r11 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x001b
            di3.d r1 = di3.C86312j.m106911c(r0)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_finder_maas_32bit_entry
            bp3.f r5 = bp3.C104160f.RepairerConfig_Maas_32BitEntry_Int
            int r1 = r1.dl0(r4, r5, r3)
            if (r1 != r2) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = 0
            goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            int r4 = android.os.Build.VERSION.SDK_INT
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_finder_maas_min_api_level
            bp3.f r6 = bp3.C104160f.RepairerConfig_Maas_MinApiLevel_Int
            r7 = 26
            int r0 = r0.dl0(r5, r6, r7)
            if (r4 < r0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0114
            ka0.g r0 = ka0.C33848g.f91487a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            java.lang.String r4 = "MicroMsg.MaasSdkResMgr"
            if (r1 != 0) goto L_0x0046
            java.lang.String r0 = "isValid: work on arm64"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            r0 = 0
            goto L_0x0111
        L_0x0046:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.MAAS_IN_PKG
            if (r1 == 0) goto L_0x004b
            goto L_0x0065
        L_0x004b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "isValid: isLoaded:"
            r1.append(r5)
            boolean r5 = ka0.C33848g.f91488b
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            boolean r1 = ka0.C33848g.f91488b
            if (r1 == 0) goto L_0x0068
        L_0x0065:
            r0 = 1
            goto L_0x0111
        L_0x0068:
            ka0.j r1 = ka0.C33855j.f91497a
            boolean r5 = r1.mo59331c()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = r1.mo59329a()
            java.lang.String r7 = "KEY_SDK_COMPAT_VERSION"
            int r6 = r6.getInt(r7, r3)
            java.lang.String r7 = r0.mo59325e()
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "mergeBin: need update "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = ", "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ", target version 11100015, currentSha1:"
            r8.append(r9)
            java.lang.String r9 = r1.mo59330b()
            r8.append(r9)
            java.lang.String r9 = ", file:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            r8 = 11100015(0xa95f6f, float:1.5554434E-38)
            if (r5 != 0) goto L_0x00ba
            if (r6 != r8) goto L_0x00ba
            if (r7 == 0) goto L_0x00ba
            goto L_0x00d3
        L_0x00ba:
            ka0.e r0 = r0.mo59323c()
            if (r0 == 0) goto L_0x00d5
            int r5 = r0.mo59320a()
            if (r5 != r8) goto L_0x00c8
            r5 = 1
            goto L_0x00c9
        L_0x00c8:
            r5 = 0
        L_0x00c9:
            if (r5 == 0) goto L_0x00d5
            java.util.LinkedList<ka0.d> r0 = r0.f91482a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00d5
        L_0x00d3:
            r0 = 1
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            if (r0 != 0) goto L_0x0111
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = r1.mo59329a()
            r6 = 0
            java.lang.String r8 = "KEY_LAST_ENTRANCE_CHECK"
            long r5 = r5.getLong(r8, r6)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r5)
            r9 = 43200000(0x2932e00, double:2.1343636E-316)
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 < 0) goto L_0x00f1
            r5 = 1
            goto L_0x00f2
        L_0x00f1:
            r5 = 0
        L_0x00f2:
            if (r5 == 0) goto L_0x0111
            java.lang.String r5 = "isValid: do check"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.mo59329a()
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.putLong(r8, r4)
            java.lang.Class<fp.e> r1 = p523fp.C32147e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            fp.e r1 = (p523fp.C32147e) r1
            r4 = 103(0x67, float:1.44E-43)
            r1.Yi0(r4)
        L_0x0111:
            if (r0 == 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r2 = 0
        L_0x0115:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y90.C38980b.mo61860a():boolean");
    }
}
