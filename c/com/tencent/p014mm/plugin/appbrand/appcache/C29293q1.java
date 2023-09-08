package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.q1 */
public class C29293q1 {

    /* renamed from: a */
    public static final byte[] f79996a = new byte[0];

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.q1$a */
    public interface C29294a {
        /* renamed from: a */
        boolean mo56575a();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.q1$b */
    public enum C29295b {
        TRIMMED,
        TRIM_FAIL
    }

    /* renamed from: a */
    public static void m38614a(String str, String str2, String str3) {
        for (C86001b0 next : C86013q1.m106459t(str, false)) {
            if (!Util.isNullOrNil(next.f250472b) && next.f250476f && next.f250472b.startsWith("plugin.js") && next.f250472b.endsWith(str3)) {
                for (C86001b0 next2 : C86013q1.m106459t(next.f250471a, false)) {
                    Log.m105919d("MicroMsg.AppBrand.PluginCodePruneLRULogic", "innerFileName:%s", next2.f250472b);
                    if (!Util.isNullOrNil(next2.f250472b) && next2.f250472b.equals(str2)) {
                        Log.m105919d("MicroMsg.AppBrand.PluginCodePruneLRULogic", "delete codeCache name:%s ret:%b", next2.f250472b, Boolean.valueOf(next2.mo119955b(true)));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m38615b(String str, int i) {
        if (!Util.isNullOrNil(str)) {
            Log.m105919d("MicroMsg.AppBrand.PluginCodePruneLRULogic", "hit appId:%s,version:%d", str, Integer.valueOf(i));
            C29232p1 p1Var = (C29232p1) C81161g2.Bx0(C29232p1.class);
            if (p1Var != null) {
                synchronized (f79996a) {
                    C29297r1 r1Var = new C29297r1();
                    r1Var.field_appId = str;
                    r1Var.field_version = i;
                    String[] strArr = C29297r1.f80003t;
                    if (p1Var.get(r1Var, strArr)) {
                        r1Var.field_hit++;
                        r1Var.field_hitTimeMS = Util.nowMilliSecond();
                        p1Var.update(r1Var, strArr);
                    } else {
                        r1Var.field_hit = 1;
                        r1Var.field_hitTimeMS = Util.nowMilliSecond();
                        p1Var.insert(r1Var);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02d3, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d6, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "plugincode size:%d", java.lang.Integer.valueOf(r4.size()));
        com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand();
        r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b6, code lost:
        if (r0 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b8, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "trimBy %d, pkgStorage NULL", java.lang.Long.valueOf(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c9, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cb, code lost:
        if (r26 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d1, code lost:
        if (r26.mo56575a() != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00da, code lost:
        r4 = r4.iterator();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (r4.hasNext() == false) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        r10 = (android.util.Pair) r4.next();
        r11 = (java.lang.String) r10.first;
        r12 = ((java.lang.Integer) r10.second).intValue();
        r17 = new java.lang.String[]{"pkgPath", "versionMd5"};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0104, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r11) == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0106, code lost:
        r11 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010b, code lost:
        r15 = r0.f238664d;
        r13 = java.util.Locale.US;
        r14 = new java.lang.Object[2];
        r14[0] = "appId";
        r14[r3] = com.google.android.gms.dynamite.ProviderConstants.API_COLNAME_FEATURE_VERSION;
        r3 = r15.query("AppBrandWxaPkgManifestRecord", r17, java.lang.String.format(r13, "%s=? and %s=? ", r14), new java.lang.String[]{r11, java.lang.String.valueOf(r12)}, (java.lang.String) null, (java.lang.String) null, "version ASC", 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013c, code lost:
        if (r3 != null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013e, code lost:
        r11 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0147, code lost:
        if (r3.moveToFirst() != false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0149, code lost:
        r3.close();
        r11 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0151, code lost:
        r13 = new java.util.LinkedList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0156, code lost:
        r14 = new com.tencent.p014mm.plugin.appbrand.appcache.C29315z2();
        r14.convertFrom(r3);
        r14.field_appId = r11;
        r14.field_version = r12;
        r13.add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0169, code lost:
        if (r3.moveToNext() != false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016b, code lost:
        r3.close();
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016f, code lost:
        r3 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0177, code lost:
        if (r3.hasNext() == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0179, code lost:
        r11 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r3.next();
        r7 = r7 + com.tencent.p014mm.vfs.C86013q1.m106451l(r11.field_pkgPath);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "wxapkg appid:%s,delete path:%s,trimSize:%d", r11.field_appId, r11.field_pkgPath, java.lang.Long.valueOf(r7));
        com.tencent.p014mm.vfs.C86013q1.m106447h(r11.field_pkgPath);
        r12 = r11.field_appId;
        r13 = r11.field_versionMd5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b0, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r12) != false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b6, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r13) == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b9, code lost:
        r14 = r12.substring(0, r12.indexOf("$"));
        r16 = r0;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeCodeCache appId:%s,versionMd5:%s", r12, r13);
        m38614a(com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0.m38798a(), r13, r14);
        r0 = com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0.m38800c();
        com.tencent.p014mm.vfs.C86013q1.m106461v(r0);
        m38614a(r0, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01e3, code lost:
        r16 = r0;
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeCodeCache appId or md5 null or nil!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ea, code lost:
        r0 = r11.field_appId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f2, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0) == false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f4, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission appId null!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01fa, code lost:
        r0 = r0.substring(0, r0.indexOf("$"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0208, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0) == false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x020a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission provider null!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0211, code lost:
        com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand();
        r12 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238475n;
        com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand();
        r14 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238480s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021b, code lost:
        if (r12 == null) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x021d, code lost:
        if (r14 != null) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0224, code lost:
        if (r14.mo56812Lo(r0) == null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0226, code lost:
        r12 = new com.tencent.p014mm.plugin.appbrand.launching.C29562b3();
        r12.field_appId = r0;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission provider:%s, ret:%b", r0, java.lang.Boolean.valueOf(r14.delete(r12, new java.lang.String[0])));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0244, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission appId:%s permission null!", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x024f, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission storage null!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0255, code lost:
        r0 = r11.field_appId;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0262, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0) == false) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0264, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission appId null!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0278, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0.substring(0, r0.indexOf("$"))) == false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x027a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission provider null!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0280, code lost:
        com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand();
        r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238475n;
        com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand();
        r12 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238481t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x028a, code lost:
        if (r0 == null) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x028c, code lost:
        if (r12 != null) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x028e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission storage null!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0293, code lost:
        r9 = r9 + 1;
        r2.mo56529W0((java.lang.String) r10.first, ((java.lang.Integer) r10.second).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02a4, code lost:
        if (r26 == null) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02aa, code lost:
        if (r26.mo56575a() != false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02b2, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b5, code lost:
        if (r7 < r24) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b7, code lost:
        if (r9 <= 0) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b9, code lost:
        r0 = new com.tencent.p014mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct();
        r0.f79220d = 4;
        r0.f79223g = (long) r9;
        r0.f79224h = 1;
        r0.mo86054n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ce, code lost:
        return com.tencent.p014mm.plugin.appbrand.appcache.C29293q1.C29295b.f79997d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02cf, code lost:
        r0 = r16;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.appbrand.appcache.C29293q1.C29295b m38616c(long r24, com.tencent.p014mm.plugin.appbrand.appcache.C29293q1.C29294a r26) {
        /*
            com.tencent.mm.plugin.appbrand.appcache.q1$b r1 = com.tencent.p014mm.plugin.appbrand.appcache.C29293q1.C29295b.TRIM_FAIL
            java.lang.String r0 = "MicroMsg.AppBrand.PluginCodePruneLRULogic"
            java.lang.String r2 = "removePluginCode sizeOfBytes:%d"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Long r5 = java.lang.Long.valueOf(r24)
            r6 = 0
            r4[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.p1> r0 = com.tencent.p014mm.plugin.appbrand.appcache.C29232p1.class
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            r2 = r0
            com.tencent.mm.plugin.appbrand.appcache.p1 r2 = (com.tencent.p014mm.plugin.appbrand.appcache.C29232p1) r2
            if (r2 != 0) goto L_0x002f
            java.lang.String r0 = "MicroMsg.AppBrand.PluginCodePruneLRULogic"
            java.lang.String r2 = "trimBy %d, lruStorage NULL"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r24)
            r3[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            return r1
        L_0x002f:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = " %s, %s ASC"
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r8 = "hit"
            r7[r6] = r8
            java.lang.String r8 = "hitTimeMS"
            r7[r3] = r8
            java.lang.String r16 = java.lang.String.format(r0, r4, r7)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            byte[] r7 = f79996a
            monitor-enter(r7)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r2.f79892d     // Catch:{ all -> 0x02db }
            java.lang.String r10 = "PluginCodeUsageLRURecord"
            java.lang.String r0 = "appId"
            java.lang.String r8 = "version"
            java.lang.String[] r11 = new java.lang.String[]{r0, r8}     // Catch:{ all -> 0x02db }
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 2
            android.database.Cursor r8 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x02db }
            if (r8 != 0) goto L_0x0065
            monitor-exit(r7)     // Catch:{ all -> 0x02db }
            return r1
        L_0x0065:
            boolean r0 = r8.moveToFirst()     // Catch:{ all -> 0x02db }
            if (r0 != 0) goto L_0x0070
            r8.close()     // Catch:{ all -> 0x02db }
            monitor-exit(r7)     // Catch:{ all -> 0x02db }
            return r1
        L_0x0070:
            java.lang.String r0 = r8.getString(r6)     // Catch:{ Exception -> 0x008d }
            int r9 = r8.getInt(r3)     // Catch:{ Exception -> 0x008d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x008d }
            android.util.Pair r0 = android.util.Pair.create(r0, r9)     // Catch:{ Exception -> 0x008d }
            r4.add(r0)     // Catch:{ Exception -> 0x008d }
            boolean r0 = r8.moveToNext()     // Catch:{ Exception -> 0x008d }
            if (r0 != 0) goto L_0x0070
            goto L_0x009a
        L_0x008a:
            r0 = move-exception
            goto L_0x02d7
        L_0x008d:
            r0 = move-exception
            java.lang.String r9 = "MicroMsg.AppBrand.PluginCodePruneLRULogic"
            java.lang.String r10 = "trimBy, read from cursor e = %s"
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x008a }
            r11[r6] = r0     // Catch:{ all -> 0x008a }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r10, r11)     // Catch:{ all -> 0x008a }
        L_0x009a:
            r8.close()     // Catch:{ all -> 0x02db }
            monitor-exit(r7)     // Catch:{ all -> 0x02db }
            java.lang.String r0 = "MicroMsg.AppBrand.PluginCodePruneLRULogic"
            java.lang.String r7 = "plugincode size:%d"
            java.lang.Object[] r8 = new java.lang.Object[r3]
            int r9 = r4.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r8)
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            if (r0 != 0) goto L_0x00c9
            java.lang.String r0 = "MicroMsg.AppBrand.PluginCodePruneLRULogic"
            java.lang.String r2 = "trimBy %d, pkgStorage NULL"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r24)
            r3[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            return r1
        L_0x00c9:
            r7 = 0
            if (r26 == 0) goto L_0x00da
            boolean r9 = r26.mo56575a()
            if (r9 != 0) goto L_0x00d4
            goto L_0x00da
        L_0x00d4:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x00da:
            java.util.Iterator r4 = r4.iterator()
            r9 = 0
        L_0x00df:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x02d6
            java.lang.Object r10 = r4.next()
            android.util.Pair r10 = (android.util.Pair) r10
            java.lang.Object r11 = r10.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r10.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.String r13 = "pkgPath"
            java.lang.String r14 = "versionMd5"
            java.lang.String[] r17 = new java.lang.String[]{r13, r14}
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r13 == 0) goto L_0x010b
            java.util.List r11 = java.util.Collections.emptyList()
            goto L_0x016f
        L_0x010b:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r15 = r0.f238664d
            java.util.Locale r13 = java.util.Locale.US
            java.lang.Object[] r14 = new java.lang.Object[r5]
            java.lang.String r16 = "appId"
            r14[r6] = r16
            java.lang.String r16 = "version"
            r14[r3] = r16
            java.lang.String r3 = "%s=? and %s=? "
            java.lang.String r18 = java.lang.String.format(r13, r3, r14)
            java.lang.String[] r3 = new java.lang.String[r5]
            r3[r6] = r11
            java.lang.String r13 = java.lang.String.valueOf(r12)
            r14 = 1
            r3[r14] = r13
            r20 = 0
            r21 = 0
            java.lang.String r22 = "version ASC"
            r23 = 2
            java.lang.String r16 = "AppBrandWxaPkgManifestRecord"
            r19 = r3
            android.database.Cursor r3 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)
            if (r3 != 0) goto L_0x0143
            java.util.List r11 = java.util.Collections.emptyList()
            goto L_0x016f
        L_0x0143:
            boolean r13 = r3.moveToFirst()
            if (r13 != 0) goto L_0x0151
            r3.close()
            java.util.List r11 = java.util.Collections.emptyList()
            goto L_0x016f
        L_0x0151:
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
        L_0x0156:
            com.tencent.mm.plugin.appbrand.appcache.z2 r14 = new com.tencent.mm.plugin.appbrand.appcache.z2
            r14.<init>()
            r14.convertFrom(r3)
            r14.field_appId = r11
            r14.field_version = r12
            r13.add(r14)
            boolean r14 = r3.moveToNext()
            if (r14 != 0) goto L_0x0156
            r3.close()
            r11 = r13
        L_0x016f:
            java.util.Iterator r3 = r11.iterator()
        L_0x0173:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x02d3
            java.lang.Object r11 = r3.next()
            com.tencent.mm.plugin.appbrand.appcache.z2 r11 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r11
            java.lang.String r12 = r11.field_pkgPath
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            long r7 = r7 + r12
            java.lang.String r12 = "MicroMsg.AppBrand.PluginCodePruneLRULogic"
            java.lang.String r13 = "wxapkg appid:%s,delete path:%s,trimSize:%d"
            r14 = 3
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r15 = r11.field_appId
            r14[r6] = r15
            java.lang.String r15 = r11.field_pkgPath
            r16 = 1
            r14[r16] = r15
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            r14[r5] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r14)
            java.lang.String r12 = r11.field_pkgPath
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)
            java.lang.String r12 = r11.field_appId
            java.lang.String r13 = r11.field_versionMd5
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            java.lang.String r15 = "MicroMsg.AppBrand.PluginCodePruneLRULogic"
            if (r14 != 0) goto L_0x01e3
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 == 0) goto L_0x01b9
            goto L_0x01e3
        L_0x01b9:
            java.lang.String r14 = "$"
            int r14 = r12.indexOf(r14)
            java.lang.String r14 = r12.substring(r6, r14)
            r16 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r12
            r12 = 1
            r0[r12] = r13
            java.lang.String r12 = "removeCodeCache appId:%s,versionMd5:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r0)
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0.m38798a()
            m38614a(r0, r13, r14)
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0.m38800c()
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
            m38614a(r0, r13, r14)
            goto L_0x01ea
        L_0x01e3:
            r16 = r0
            java.lang.String r0 = "removeCodeCache appId or md5 null or nil!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x01ea:
            java.lang.String r0 = r11.field_appId
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r13 = "MicroMsg.AppBrand.PluginCodePruneLRULogic"
            if (r12 == 0) goto L_0x01fa
            java.lang.String r0 = "removePluginPermission appId null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x020f
        L_0x01fa:
            java.lang.String r12 = "$"
            int r12 = r0.indexOf(r12)
            java.lang.String r0 = r0.substring(r6, r12)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r12 == 0) goto L_0x0211
            java.lang.String r0 = "removePluginPermission provider null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
        L_0x020f:
            r15 = 1
            goto L_0x0255
        L_0x0211:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.launching.u2 r12 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238475n
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.launching.c3 r14 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238480s
            if (r12 == 0) goto L_0x024f
            if (r14 != 0) goto L_0x0220
            goto L_0x024f
        L_0x0220:
            te3.au r12 = r14.mo56812Lo(r0)
            if (r12 == 0) goto L_0x0244
            com.tencent.mm.plugin.appbrand.launching.b3 r12 = new com.tencent.mm.plugin.appbrand.launching.b3
            r12.<init>()
            r12.field_appId = r0
            java.lang.String[] r15 = new java.lang.String[r6]
            boolean r12 = r14.delete(r12, r15)
            java.lang.Object[] r14 = new java.lang.Object[r5]
            r14[r6] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r15 = 1
            r14[r15] = r0
            java.lang.String r0 = "removePluginPermission provider:%s, ret:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r14)
            goto L_0x0255
        L_0x0244:
            r15 = 1
            java.lang.Object[] r12 = new java.lang.Object[r15]
            r12[r6] = r0
            java.lang.String r0 = "removePluginPermission appId:%s permission null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r12)
            goto L_0x0255
        L_0x024f:
            r15 = 1
            java.lang.String r0 = "removePluginPermission storage null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
        L_0x0255:
            java.lang.String r0 = r11.field_appId
            java.lang.String r11 = "MicroMsg.AppBrand.PluginCodePruneLRULogic"
            java.lang.String r12 = "removeAppidABTestPermission"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r12 == 0) goto L_0x026a
            java.lang.String r0 = "removeAppidABTestPermission appId null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            goto L_0x0293
        L_0x026a:
            java.lang.String r12 = "$"
            int r12 = r0.indexOf(r12)
            java.lang.String r0 = r0.substring(r6, r12)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0280
            java.lang.String r0 = "removeAppidABTestPermission provider null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            goto L_0x0293
        L_0x0280:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.launching.u2 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238475n
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.launching.a3 r12 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238481t
            if (r0 == 0) goto L_0x028e
            if (r12 != 0) goto L_0x0293
        L_0x028e:
            java.lang.String r0 = "removeAppidABTestPermission storage null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
        L_0x0293:
            int r9 = r9 + 1
            java.lang.Object r0 = r10.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r11 = r10.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r2.mo56529W0(r0, r11)
            if (r26 == 0) goto L_0x02b3
            boolean r0 = r26.mo56575a()
            if (r0 != 0) goto L_0x02ad
            goto L_0x02b3
        L_0x02ad:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x02b3:
            int r0 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r0 < 0) goto L_0x02cf
            if (r9 <= 0) goto L_0x02cc
            com.tencent.mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct
            r0.<init>()
            r1 = 4
            r0.f79220d = r1
            long r1 = (long) r9
            r0.f79223g = r1
            r1 = 1
            r0.f79224h = r1
            r0.mo86054n()
        L_0x02cc:
            com.tencent.mm.plugin.appbrand.appcache.q1$b r0 = com.tencent.p014mm.plugin.appbrand.appcache.C29293q1.C29295b.TRIMMED
            return r0
        L_0x02cf:
            r0 = r16
            goto L_0x0173
        L_0x02d3:
            r3 = 1
            goto L_0x00df
        L_0x02d6:
            return r1
        L_0x02d7:
            r8.close()     // Catch:{ all -> 0x02db }
            throw r0     // Catch:{ all -> 0x02db }
        L_0x02db:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x02db }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C29293q1.m38616c(long, com.tencent.mm.plugin.appbrand.appcache.q1$a):com.tencent.mm.plugin.appbrand.appcache.q1$b");
    }
}
