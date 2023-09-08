package q52;

import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81255h;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import di3.C86312j;
import e42.C86425a;
import e42.C86434m;
import e42.C86436p;
import e42.C86437q;
import gy3.C87412m;
import java.io.File;

/* renamed from: q52.u */
public final class C89480u {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089 A[SYNTHETIC, Splitter:B:27:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097 A[SYNTHETIC, Splitter:B:33:0x0097] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m111872a(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "close file error: "
            java.lang.String r1 = "dumpFileName"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "content"
            gy3.C87412m.m108594g(r8, r1)
            boolean r1 = p206nj.C88955f.m111058b()
            r2 = 0
            java.lang.String r3 = "MicroMsg.MagicBaseUtil"
            if (r1 != 0) goto L_0x001b
            java.lang.String r7 = "dumpToFile error, SDCard is unavailable."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            return r2
        L_0x001b:
            r1 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r4.<init>()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = a70.C112760b.m154195C()     // Catch:{ Exception -> 0x0072 }
            r4.append(r5)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = "appbrand/trace/"
            r4.append(r5)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0072 }
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0072 }
            r5.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x0072 }
            boolean r6 = r5.mo119967g()     // Catch:{ Exception -> 0x0072 }
            if (r6 != 0) goto L_0x0042
            r5.mo119987x()     // Catch:{ Exception -> 0x0072 }
            com.tencent.p014mm.vfs.C86013q1.m106460u(r4)     // Catch:{ Exception -> 0x0072 }
        L_0x0042:
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0072 }
            r4.<init>((com.tencent.p014mm.vfs.C86009m1) r5, (java.lang.String) r7)     // Catch:{ Exception -> 0x0072 }
            com.tencent.mm.vfs.u1 r7 = new com.tencent.mm.vfs.u1     // Catch:{ Exception -> 0x0072 }
            r7.<init>((com.tencent.p014mm.vfs.C86009m1) r4, (boolean) r2)     // Catch:{ Exception -> 0x0072 }
            r7.write(r8)     // Catch:{ Exception -> 0x006c, all -> 0x0068 }
            r2 = 1
            r7.close()     // Catch:{ Exception -> 0x0054 }
            goto L_0x0094
        L_0x0054:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
        L_0x005a:
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            goto L_0x0094
        L_0x0068:
            r8 = move-exception
            r1 = r7
            r7 = r8
            goto L_0x0095
        L_0x006c:
            r8 = move-exception
            r1 = r7
            r7 = r8
            goto L_0x0073
        L_0x0070:
            r7 = move-exception
            goto L_0x0095
        L_0x0072:
            r7 = move-exception
        L_0x0073:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r8.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "dump file error: "
            r8.append(r4)     // Catch:{ all -> 0x0070 }
            r8.append(r7)     // Catch:{ all -> 0x0070 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0070 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0094
            r1.close()     // Catch:{ Exception -> 0x008d }
            goto L_0x0094
        L_0x008d:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            goto L_0x005a
        L_0x0094:
            return r2
        L_0x0095:
            if (r1 == 0) goto L_0x00ae
            r1.close()     // Catch:{ Exception -> 0x009b }
            goto L_0x00ae
        L_0x009b:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r8)
        L_0x00ae:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q52.C89480u.m111872a(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static final String m111873b(C86425a aVar, String str) {
        return ((C30211n0) C86312j.m106911c(C30211n0.class)).mo57243g(str) + File.separator;
    }

    /* renamed from: c */
    public static final String m111874c(C86425a aVar, String str) {
        return m111873b(aVar, str) + str + '@' + aVar.f251216c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0167  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.appbrand.appcache.C40427l0 m111875d(e42.C86425a r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "bizName"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.Class<q52.u> r0 = q52.C89480u.class
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.MagicBaseUtil"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ac }
            r2.<init>()     // Catch:{ all -> 0x01ac }
            java.lang.String r3 = "hy: start ensure copy pkg to local "
            r2.append(r3)     // Catch:{ all -> 0x01ac }
            r2.append(r13)     // Catch:{ all -> 0x01ac }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01ac }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x01ac }
            java.lang.String r1 = r12.f251214a     // Catch:{ all -> 0x01ac }
            int r1 = r1.length()     // Catch:{ all -> 0x01ac }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            r4 = 0
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = "MicroMsg.MagicBaseUtil"
            java.lang.String r2 = "hy: embed pkg not provided"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x01ac }
            monitor-exit(r0)
            goto L_0x019d
        L_0x003d:
            java.lang.String r1 = m111873b(r12, r13)     // Catch:{ all -> 0x01ac }
            java.lang.String r5 = m111874c(r12, r13)     // Catch:{ all -> 0x01ac }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ac }
            r6.<init>()     // Catch:{ all -> 0x01ac }
            java.lang.String r7 = "bizKey_"
            r6.append(r7)     // Catch:{ all -> 0x01ac }
            r6.append(r13)     // Catch:{ all -> 0x01ac }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01ac }
            java.lang.String r7 = r12.f251216c     // Catch:{ all -> 0x01ac }
            int r7 = r7.length()     // Catch:{ all -> 0x01ac }
            if (r7 != 0) goto L_0x0060
            r7 = 1
            goto L_0x0061
        L_0x0060:
            r7 = 0
        L_0x0061:
            if (r7 == 0) goto L_0x0093
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ac }
            r7.<init>()     // Catch:{ all -> 0x01ac }
            java.lang.String r8 = "not providing md5 for biz "
            r7.append(r8)     // Catch:{ all -> 0x01ac }
            r7.append(r13)     // Catch:{ all -> 0x01ac }
            java.lang.String r8 = " and config is "
            r7.append(r8)     // Catch:{ all -> 0x01ac }
            r7.append(r12)     // Catch:{ all -> 0x01ac }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01ac }
            java.lang.String r8 = "MicroMsg.MagicBaseUtil"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ac }
            r9.<init>()     // Catch:{ all -> 0x01ac }
            java.lang.String r10 = "hy: "
            r9.append(r10)     // Catch:{ all -> 0x01ac }
            r9.append(r7)     // Catch:{ all -> 0x01ac }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x01ac }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r7)     // Catch:{ all -> 0x01ac }
            goto L_0x0104
        L_0x0093:
            android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)     // Catch:{ all -> 0x01ac }
            java.lang.String r8 = r7.getPath()     // Catch:{ all -> 0x01ac }
            if (r8 == 0) goto L_0x00b7
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r3, r3)     // Catch:{ all -> 0x01ac }
            java.lang.String r9 = r7.getPath()     // Catch:{ all -> 0x01ac }
            boolean r9 = r9.equals(r8)     // Catch:{ all -> 0x01ac }
            if (r9 != 0) goto L_0x00b7
            android.net.Uri$Builder r7 = r7.buildUpon()     // Catch:{ all -> 0x01ac }
            android.net.Uri$Builder r7 = r7.path(r8)     // Catch:{ all -> 0x01ac }
            android.net.Uri r7 = r7.build()     // Catch:{ all -> 0x01ac }
        L_0x00b7:
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x01ac }
            com.tencent.mm.vfs.f0$h r7 = r8.mo177799l(r7, r4)     // Catch:{ all -> 0x01ac }
            boolean r8 = r7.mo177810a()     // Catch:{ all -> 0x01ac }
            if (r8 != 0) goto L_0x00c5
            r7 = 0
            goto L_0x00cd
        L_0x00c5:
            com.tencent.mm.vfs.FileSystem$c r8 = r7.f348991a     // Catch:{ all -> 0x01ac }
            java.lang.String r7 = r7.f348992b     // Catch:{ all -> 0x01ac }
            boolean r7 = r8.mo119948x(r7)     // Catch:{ all -> 0x01ac }
        L_0x00cd:
            java.lang.String r8 = "MagicBrushLocalPkgFileProtector"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r8)     // Catch:{ all -> 0x01ac }
            boolean r8 = r8.getBoolean(r6, r3)     // Catch:{ all -> 0x01ac }
            java.lang.String r9 = "MicroMsg.MagicBaseUtil"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ac }
            r10.<init>()     // Catch:{ all -> 0x01ac }
            java.lang.String r11 = "hy: check pkg file "
            r10.append(r11)     // Catch:{ all -> 0x01ac }
            r10.append(r13)     // Catch:{ all -> 0x01ac }
            java.lang.String r11 = " exist "
            r10.append(r11)     // Catch:{ all -> 0x01ac }
            r10.append(r7)     // Catch:{ all -> 0x01ac }
            java.lang.String r11 = " and IO protector "
            r10.append(r11)     // Catch:{ all -> 0x01ac }
            r10.append(r8)     // Catch:{ all -> 0x01ac }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01ac }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ all -> 0x01ac }
            if (r7 == 0) goto L_0x0104
            if (r8 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r7 = 0
            goto L_0x0105
        L_0x0104:
            r7 = 1
        L_0x0105:
            if (r7 == 0) goto L_0x0167
            java.lang.String r7 = "MagicBrushLocalPkgFileProtector"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)     // Catch:{ all -> 0x01ac }
            r7.putBoolean(r6, r2)     // Catch:{ all -> 0x01ac }
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x01ac }
            r2.<init>((java.lang.String) r1)     // Catch:{ all -> 0x01ac }
            boolean r7 = r2.mo119967g()     // Catch:{ all -> 0x01ac }
            if (r7 == 0) goto L_0x0121
            r2.mo119966f()     // Catch:{ all -> 0x01ac }
            com.tencent.p014mm.vfs.C86013q1.m106460u(r1)     // Catch:{ all -> 0x01ac }
        L_0x0121:
            r2.mo119987x()     // Catch:{ all -> 0x01ac }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ all -> 0x01ac }
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x01ac }
            java.lang.String r8 = r12.f251214a     // Catch:{ all -> 0x01ac }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.FilesCopy.copyAssets(r7, r8, r5)     // Catch:{ all -> 0x01ac }
            java.lang.String r7 = "MicroMsg.MagicBaseUtil"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ac }
            r8.<init>()     // Catch:{ all -> 0x01ac }
            java.lang.String r9 = "hy: "
            r8.append(r9)     // Catch:{ all -> 0x01ac }
            r8.append(r13)     // Catch:{ all -> 0x01ac }
            java.lang.String r9 = " regenerate result is "
            r8.append(r9)     // Catch:{ all -> 0x01ac }
            r8.append(r5)     // Catch:{ all -> 0x01ac }
            java.lang.String r9 = ", using "
            r8.append(r9)     // Catch:{ all -> 0x01ac }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)     // Catch:{ all -> 0x01ac }
            r8.append(r1)     // Catch:{ all -> 0x01ac }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x01ac }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)     // Catch:{ all -> 0x01ac }
            java.lang.String r1 = "MagicBrushLocalPkgFileProtector"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)     // Catch:{ all -> 0x01ac }
            r1.putBoolean(r6, r3)     // Catch:{ all -> 0x01ac }
            r2 = r5
            goto L_0x017d
        L_0x0167:
            java.lang.String r1 = "MicroMsg.MagicBaseUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ac }
            r3.<init>()     // Catch:{ all -> 0x01ac }
            java.lang.String r5 = "hy: has cached file for biz "
            r3.append(r5)     // Catch:{ all -> 0x01ac }
            r3.append(r13)     // Catch:{ all -> 0x01ac }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01ac }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ all -> 0x01ac }
        L_0x017d:
            java.lang.String r1 = "MicroMsg.MagicBaseUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ac }
            r3.<init>()     // Catch:{ all -> 0x01ac }
            java.lang.String r5 = "hy: end ensure copy pkg to local "
            r3.append(r5)     // Catch:{ all -> 0x01ac }
            r3.append(r13)     // Catch:{ all -> 0x01ac }
            java.lang.String r5 = " with result is "
            r3.append(r5)     // Catch:{ all -> 0x01ac }
            r3.append(r2)     // Catch:{ all -> 0x01ac }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01ac }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ all -> 0x01ac }
            monitor-exit(r0)
            r3 = r2
        L_0x019d:
            if (r3 == 0) goto L_0x01ab
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r4 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg
            java.lang.String r12 = m111874c(r12, r13)
            r4.<init>((java.lang.String) r12)
            r4.mo63189b()
        L_0x01ab:
            return r4
        L_0x01ac:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q52.C89480u.m111875d(e42.a, java.lang.String):com.tencent.mm.plugin.appbrand.appcache.l0");
    }

    /* renamed from: e */
    public static final C86434m m111876e(C40427l0 l0Var, String str) {
        C87412m.m108594g(l0Var, "<this>");
        if (str == null) {
            return new C86436p("");
        }
        if (l0Var instanceof C81255h) {
            return new C86436p(C81291m0.m99666b(l0Var, str));
        }
        String c = l0Var.mo63190c();
        C87412m.m108593f(c, "pkgPath");
        return new C86437q(c, str);
    }
}
