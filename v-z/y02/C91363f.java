package y02;

import te3.C90430p93;

/* renamed from: y02.f */
public class C91363f {
    /* renamed from: a */
    public static C90430p93 m114613a(String str, String str2) {
        C90430p93 p932 = new C90430p93();
        p932.f259737d = str;
        p932.f259738e = str2;
        return p932;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009b A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d8 A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00da A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010b A[Catch:{ all -> 0x0125 }, LOOP:0: B:31:0x0105->B:33:0x010b, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.LinkedList<te3.C90430p93> m114614b() {
        /*
            java.lang.String r0 = "MicroMsg.Tinker.NetSceneUtil"
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2 = 0
            int r3 = f40.C86718e.m107549h()     // Catch:{ Exception -> 0x0029 }
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            java.lang.String r5 = "uin is %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0027 }
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r7)     // Catch:{ Exception -> 0x0027 }
            r6[r2] = r7     // Catch:{ Exception -> 0x0027 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r6)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0034
        L_0x0027:
            r5 = move-exception
            goto L_0x002c
        L_0x0029:
            r5 = move-exception
            r3 = 0
        L_0x002c:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r7 = "tinker patch manager get uin failed."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r5, r7, r6)
        L_0x0034:
            java.lang.String r5 = "code-version"
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION     // Catch:{ all -> 0x0125 }
            te3.p93 r5 = m114613a(r5, r6)     // Catch:{ all -> 0x0125 }
            r1.add(r5)     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "code-reversion"
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ all -> 0x0125 }
            te3.p93 r5 = m114613a(r5, r6)     // Catch:{ all -> 0x0125 }
            r1.add(r5)     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "sdk"
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0125 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0125 }
            te3.p93 r5 = m114613a(r5, r6)     // Catch:{ all -> 0x0125 }
            r1.add(r5)     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "os-name"
            java.lang.String r6 = qe3.C89625d.f257839e     // Catch:{ all -> 0x0125 }
            te3.p93 r5 = m114613a(r5, r6)     // Catch:{ all -> 0x0125 }
            r1.add(r5)     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "device-brand"
            java.lang.String r6 = qe3.C89625d.f257836b     // Catch:{ all -> 0x0125 }
            te3.p93 r5 = m114613a(r5, r6)     // Catch:{ all -> 0x0125 }
            r1.add(r5)     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "device-name"
            java.lang.String r6 = qe3.C89625d.f257838d     // Catch:{ all -> 0x0125 }
            te3.p93 r5 = m114613a(r5, r6)     // Catch:{ all -> 0x0125 }
            r1.add(r5)     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "support-64-bit"
            java.lang.String[] r6 = android.os.Build.SUPPORTED_64_BIT_ABIS     // Catch:{ all -> 0x0125 }
            int r6 = r6.length     // Catch:{ all -> 0x0125 }
            java.lang.String r7 = "1"
            java.lang.String r8 = "0"
            if (r6 <= 0) goto L_0x008a
            r6 = r7
            goto L_0x008b
        L_0x008a:
            r6 = r8
        L_0x008b:
            te3.p93 r5 = m114613a(r5, r6)     // Catch:{ all -> 0x0125 }
            r1.add(r5)     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "device-is-64-bit-runtime"
            boolean r6 = p156gj.C87203t.m108279o()     // Catch:{ all -> 0x0125 }
            if (r6 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r7 = r8
        L_0x009c:
            te3.p93 r5 = m114613a(r5, r7)     // Catch:{ all -> 0x0125 }
            r1.add(r5)     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "uin"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0125 }
            te3.p93 r3 = m114613a(r5, r3)     // Catch:{ all -> 0x0125 }
            r1.add(r3)     // Catch:{ all -> 0x0125 }
            java.lang.String r3 = "flavor-version"
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0125 }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ all -> 0x0125 }
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_wechat_flavor_version     // Catch:{ all -> 0x0125 }
            int r4 = r4.mo58779Qe(r5, r2)     // Catch:{ all -> 0x0125 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0125 }
            te3.p93 r3 = m114613a(r3, r4)     // Catch:{ all -> 0x0125 }
            r1.add(r3)     // Catch:{ all -> 0x0125 }
            java.lang.String r3 = "network"
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0125 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r4)     // Catch:{ all -> 0x0125 }
            if (r4 == 0) goto L_0x00da
            r4 = 3
            goto L_0x00db
        L_0x00da:
            r4 = 2
        L_0x00db:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0125 }
            te3.p93 r3 = m114613a(r3, r4)     // Catch:{ all -> 0x0125 }
            r1.add(r3)     // Catch:{ all -> 0x0125 }
            java.lang.String r3 = "device-model"
            java.lang.String r4 = qe3.C89625d.f257837c     // Catch:{ all -> 0x0125 }
            te3.p93 r3 = m114613a(r3, r4)     // Catch:{ all -> 0x0125 }
            r1.add(r3)     // Catch:{ all -> 0x0125 }
            java.lang.Class<tw0.e> r3 = tw0.C90584e.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ all -> 0x0125 }
            tw0.e r3 = (tw0.C90584e) r3     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x012d
            java.util.List r3 = r3.c10()     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x012d
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0125 }
        L_0x0105:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0125 }
            if (r4 == 0) goto L_0x012d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0125 }
            tw0.a r4 = (tw0.C37285a) r4     // Catch:{ all -> 0x0125 }
            int r5 = r4.field_key     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0125 }
            int r4 = r4.field_dau     // Catch:{ all -> 0x0125 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0125 }
            te3.p93 r4 = m114613a(r5, r4)     // Catch:{ all -> 0x0125 }
            r1.add(r4)     // Catch:{ all -> 0x0125 }
            goto L_0x0105
        L_0x0125:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "kernel not startup"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r4, r2)
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y02.C91363f.m114614b():java.util.LinkedList");
    }
}
