package bf3;

import te3.C90430p93;

/* renamed from: bf3.b */
public class C79700b {
    /* renamed from: a */
    public static C90430p93 m96817a(String str, String str2) {
        C90430p93 p932 = new C90430p93();
        p932.f259737d = str;
        p932.f259738e = str2;
        return p932;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c A[Catch:{ all -> 0x0107, all -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d A[Catch:{ all -> 0x0107, all -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf A[Catch:{ all -> 0x0107, all -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1 A[Catch:{ all -> 0x0107, all -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e7 A[Catch:{ all -> 0x0107, all -> 0x0122 }, LOOP:0: B:31:0x00e1->B:33:0x00e7, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.LinkedList<te3.C90430p93> m96818b() {
        /*
            java.lang.String r0 = "final conditions = "
            java.lang.String r1 = "MicroMsg.Tinker.NetSceneCheckTinkerUtilCopycat"
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r3 = 0
            int r4 = f40.C86718e.m107549h()     // Catch:{ Exception -> 0x002b }
            long r4 = (long) r4
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            java.lang.String r6 = "uin is %s"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0029 }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r8)     // Catch:{ Exception -> 0x0029 }
            r7[r3] = r8     // Catch:{ Exception -> 0x0029 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0036
        L_0x0029:
            r6 = move-exception
            goto L_0x002e
        L_0x002b:
            r6 = move-exception
            r4 = 0
        L_0x002e:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = "tinker patch manager get uin failed."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r6, r8, r7)
        L_0x0036:
            java.lang.String r6 = "code-version"
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION     // Catch:{ all -> 0x0107 }
            te3.p93 r6 = m96817a(r6, r7)     // Catch:{ all -> 0x0107 }
            r2.add(r6)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "code-reversion"
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ all -> 0x0107 }
            te3.p93 r6 = m96817a(r6, r7)     // Catch:{ all -> 0x0107 }
            r2.add(r6)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "sdk"
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0107 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0107 }
            te3.p93 r6 = m96817a(r6, r7)     // Catch:{ all -> 0x0107 }
            r2.add(r6)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "os-name"
            java.lang.String r7 = qe3.C89625d.f257839e     // Catch:{ all -> 0x0107 }
            te3.p93 r6 = m96817a(r6, r7)     // Catch:{ all -> 0x0107 }
            r2.add(r6)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "device-brand"
            java.lang.String r7 = qe3.C89625d.f257836b     // Catch:{ all -> 0x0107 }
            te3.p93 r6 = m96817a(r6, r7)     // Catch:{ all -> 0x0107 }
            r2.add(r6)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "device-name"
            java.lang.String r7 = qe3.C89625d.f257838d     // Catch:{ all -> 0x0107 }
            te3.p93 r6 = m96817a(r6, r7)     // Catch:{ all -> 0x0107 }
            r2.add(r6)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "support-64-bit"
            java.lang.String[] r7 = android.os.Build.SUPPORTED_64_BIT_ABIS     // Catch:{ all -> 0x0107 }
            int r7 = r7.length     // Catch:{ all -> 0x0107 }
            java.lang.String r8 = "1"
            java.lang.String r9 = "0"
            if (r7 <= 0) goto L_0x008c
            r7 = r8
            goto L_0x008d
        L_0x008c:
            r7 = r9
        L_0x008d:
            te3.p93 r6 = m96817a(r6, r7)     // Catch:{ all -> 0x0107 }
            r2.add(r6)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "device-is-64-bit-runtime"
            boolean r7 = p156gj.C87203t.m108279o()     // Catch:{ all -> 0x0107 }
            if (r7 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r8 = r9
        L_0x009e:
            te3.p93 r6 = m96817a(r6, r8)     // Catch:{ all -> 0x0107 }
            r2.add(r6)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "uin"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0107 }
            te3.p93 r4 = m96817a(r6, r4)     // Catch:{ all -> 0x0107 }
            r2.add(r4)     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = "network"
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0107 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r5)     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00c1
            r5 = 3
            goto L_0x00c2
        L_0x00c1:
            r5 = 2
        L_0x00c2:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0107 }
            te3.p93 r4 = m96817a(r4, r5)     // Catch:{ all -> 0x0107 }
            r2.add(r4)     // Catch:{ all -> 0x0107 }
            java.lang.Class<tw0.e> r4 = tw0.C90584e.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0107 }
            tw0.e r4 = (tw0.C90584e) r4     // Catch:{ all -> 0x0107 }
            if (r4 == 0) goto L_0x0101
            java.util.List r4 = r4.c10()     // Catch:{ all -> 0x0107 }
            if (r4 == 0) goto L_0x0101
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0107 }
        L_0x00e1:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0101
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0107 }
            tw0.a r5 = (tw0.C37285a) r5     // Catch:{ all -> 0x0107 }
            int r6 = r5.field_key     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = java.lang.Integer.toHexString(r6)     // Catch:{ all -> 0x0107 }
            int r5 = r5.field_dau     // Catch:{ all -> 0x0107 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0107 }
            te3.p93 r5 = m96817a(r6, r5)     // Catch:{ all -> 0x0107 }
            r2.add(r5)     // Catch:{ all -> 0x0107 }
            goto L_0x00e1
        L_0x0101:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0114
        L_0x0107:
            r4 = move-exception
            java.lang.String r5 = "get condition fail, skip"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r5, r3)     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0114:
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r2
        L_0x0122:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bf3.C79700b.m96818b():java.util.LinkedList");
    }
}
