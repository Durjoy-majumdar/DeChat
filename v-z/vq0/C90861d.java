package vq0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.AbsReader;
import com.tencent.p014mm.plugin.appbrand.appcache.AssetReader;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81292m2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;

/* renamed from: vq0.d */
public final class C90861d {

    /* renamed from: a */
    public static final C90861d f260835a = new C90861d();

    /* renamed from: vq0.d$a */
    public static final class C14949a extends C87413o implements C32226l<ISQLiteDatabase, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f40988d;

        /* renamed from: e */
        public final /* synthetic */ String f40989e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList<String> f40990f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14949a(C8479f0<String> f0Var, String str, LinkedList<String> linkedList) {
            super(1);
            this.f40988d = f0Var;
            this.f40989e = str;
            this.f40990f = linkedList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
            cy3.C58003b.m67160a(r0, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
            throw r1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0045 A[Catch:{ all -> 0x006a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r7) {
            /*
                r6 = this;
                com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = (com.tencent.p014mm.sdk.storage.ISQLiteDatabase) r7
                java.lang.String r0 = "db"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "select cacheFilePath from WxaAppWebRenderingCacheAccessStatsTable where "
                r0.append(r1)
                gy3.f0<java.lang.String> r1 = r6.f40988d
                T r1 = r1.f27484d
                java.lang.String r1 = (java.lang.String) r1
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 1
                java.lang.String[] r2 = new java.lang.String[r1]
                java.lang.String r3 = r6.f40989e
                r4 = 0
                r2[r4] = r3
                android.database.Cursor r0 = r7.rawQuery(r0, r2)
                java.util.LinkedList<java.lang.String> r2 = r6.f40990f
                boolean r3 = r0.moveToFirst()     // Catch:{ all -> 0x0068 }
                if (r3 == 0) goto L_0x004e
            L_0x0033:
                java.lang.String r3 = r0.getString(r4)     // Catch:{ all -> 0x0068 }
                if (r3 == 0) goto L_0x0042
                int r5 = r3.length()     // Catch:{ all -> 0x0068 }
                if (r5 != 0) goto L_0x0040
                goto L_0x0042
            L_0x0040:
                r5 = 0
                goto L_0x0043
            L_0x0042:
                r5 = 1
            L_0x0043:
                if (r5 != 0) goto L_0x0048
                r2.add(r3)     // Catch:{ all -> 0x0068 }
            L_0x0048:
                boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0068 }
                if (r3 != 0) goto L_0x0033
            L_0x004e:
                rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0068 }
                r2 = 0
                cy3.C58003b.m67160a(r0, r2)
                gy3.f0<java.lang.String> r0 = r6.f40988d
                T r0 = r0.f27484d
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.String r2 = r6.f40989e
                r1[r4] = r2
                java.lang.String r2 = "WxaAppWebRenderingCacheAccessStatsTable"
                r7.delete(r2, r0, r1)
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            L_0x0068:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x006a }
            L_0x006a:
                r1 = move-exception
                cy3.C58003b.m67160a(r0, r7)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: vq0.C90861d.C14949a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: vq0.d$b */
    public static final class C90862b extends C87413o implements C32226l<String, CharSequence> {

        /* renamed from: d */
        public static final C90862b f260836d = new C90862b();

        public C90862b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
            return " commLibVersionId != ? ";
        }
    }

    /* renamed from: vq0.d$c */
    public static final class C90863c implements C86011o1 {

        /* renamed from: a */
        public static final C90863c f260837a = new C90863c();

        public final boolean accept(C86009m1 m1Var) {
            C87412m.m108594g(m1Var, "f");
            return m1Var.mo119967g() && m1Var.mo119978p();
        }
    }

    /* renamed from: a */
    public static final void m113946a(String str, int i) {
        C37803c cVar;
        if (!(str == null || str.length() == 0) && (cVar = (C37803c) C81161g2.Bx0(C37803c.class)) != null) {
            try {
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = "  appId=? ";
                if (i == 1) {
                    f0Var.f27484d = ((String) f0Var.f27484d) + " and appVersionId = TEST";
                } else if (i == 2) {
                    f0Var.f27484d = ((String) f0Var.f27484d) + " and appVersionId = DEMO";
                }
                LinkedList<String> linkedList = new LinkedList<>();
                ISQLiteDatabase iSQLiteDatabase = cVar.f100124e;
                C14949a aVar = new C14949a(f0Var, str, linkedList);
                long beginTransaction = iSQLiteDatabase.beginTransaction(Thread.currentThread().getId());
                aVar.invoke(iSQLiteDatabase);
                iSQLiteDatabase.endTransaction(beginTransaction);
                for (String h : linkedList) {
                    C86013q1.m106447h(h);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrand.WebRenderingCacheCleanupLogic", "clearCache with appId[" + str + "] versionType[" + i + "], e=" + e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        r5 = (r5 = r5.mo114011mL(r4, "versionInfo")).mo113942o2();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m113947b() {
        /*
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r1 = vq0.C90865l.m113957b()
            r0.<init>((java.lang.String) r1)
            boolean r1 = r0.mo119967g()
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r0.mo119977o()
            if (r1 != 0) goto L_0x0017
            goto L_0x01ff
        L_0x0017:
            java.lang.String r1 = "MicroMsg.AppBrand.WebRenderingCacheCleanupLogic"
            java.lang.String r2 = "evictExpiredCache enter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.Class<vq0.c> r2 = vq0.C37803c.class
            java.lang.Object r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r2)
            vq0.c r2 = (vq0.C37803c) r2
            if (r2 == 0) goto L_0x01fe
            vq0.d r3 = f260835a
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            r14 = 1
            java.lang.String r4 = r3.mo124960c(r14)
            if (r4 == 0) goto L_0x0039
            r13.add(r4)
        L_0x0039:
            r15 = 0
            java.lang.String r3 = r3.mo124960c(r15)
            if (r3 == 0) goto L_0x0043
            r13.add(r3)
        L_0x0043:
            boolean r3 = r13.isEmpty()
            java.lang.String r12 = "WxaAppWebRenderingCacheAccessStatsTable"
            if (r3 != 0) goto L_0x006b
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            vq0.d$b r10 = vq0.C90861d.C90862b.f260836d
            r11 = 30
            r3 = 0
            java.lang.String r5 = " and "
            r4 = r13
            r14 = r12
            r12 = r3
            java.lang.String r3 = sx3.C110818d0.m150921S(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String[] r4 = new java.lang.String[r15]
            java.lang.Object[] r4 = r13.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r2.f100124e
            r5.delete(r14, r3, r4)
            goto L_0x006c
        L_0x006b:
            r14 = r12
        L_0x006c:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r2.f100124e
            java.lang.String r5 = "select distinct appId from WxaAppWebRenderingCacheAccessStatsTable"
            r6 = 0
            r7 = 2
            android.database.Cursor r4 = r4.rawQuery(r5, r6, r7)
            if (r4 == 0) goto L_0x0091
            boolean r5 = r4.moveToFirst()     // Catch:{ all -> 0x01f5 }
            if (r5 == 0) goto L_0x0091
        L_0x0084:
            java.lang.String r5 = r4.getString(r15)     // Catch:{ all -> 0x01f5 }
            r3.add(r5)     // Catch:{ all -> 0x01f5 }
            boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x01f5 }
            if (r5 != 0) goto L_0x0084
        L_0x0091:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01f5 }
            cy3.C58003b.m67160a(r4, r6)
            java.util.Iterator r3 = r3.iterator()
        L_0x009a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00f3
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r5 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r5 = r5.mo116962a()
            boolean r5 = com.tencent.luggage.sdk.processes.C80254f.m97661H(r5, r4, r15, r7, r6)
            if (r5 != 0) goto L_0x009a
            wi0.e0 r5 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            r8 = -1
            if (r5 == 0) goto L_0x00cf
            java.lang.String r9 = "versionInfo"
            java.lang.String[] r9 = new java.lang.String[]{r9}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r5 = r5.mo114011mL(r4, r9)
            if (r5 == 0) goto L_0x00cf
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r5.mo113942o2()
            if (r5 == 0) goto L_0x00cf
            int r5 = r5.f239452d
            goto L_0x00d0
        L_0x00cf:
            r5 = -1
        L_0x00d0:
            if (r5 == r8) goto L_0x009a
            com.tencent.mm.sdk.storage.ISQLiteDatabase r8 = r2.f100124e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = " appId =? and appVersionId != "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r5 = " and appVersionId != TEST and appVersionId != DEMO"
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]
            r10[r15] = r4
            r8.delete(r14, r5, r10)
            goto L_0x009a
        L_0x00f3:
            vq0.d$c r3 = vq0.C90861d.C90863c.f260837a
            com.tencent.mm.vfs.m1[] r3 = r0.mo119985v(r3)
            if (r3 == 0) goto L_0x0149
            int r4 = r3.length
            r5 = 0
        L_0x00fd:
            if (r5 >= r4) goto L_0x0149
            r8 = r3[r5]
            java.lang.String r9 = r8.mo119971i()
            if (r9 == 0) goto L_0x0110
            int r10 = r9.length()
            if (r10 != 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r10 = 0
            goto L_0x0111
        L_0x0110:
            r10 = 1
        L_0x0111:
            if (r10 == 0) goto L_0x0116
            r10 = 0
            r11 = 1
            goto L_0x0141
        L_0x0116:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r10 = r2.f100124e
            r11 = 1
            java.lang.String[] r12 = new java.lang.String[r11]
            r12[r15] = r9
            java.lang.String r9 = "select count(*) from WxaAppWebRenderingCacheAccessStatsTable where cacheFilePath =?"
            android.database.Cursor r9 = r10.rawQuery(r9, r12, r7)
            if (r9 == 0) goto L_0x013d
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x0134 }
            if (r10 == 0) goto L_0x013d
            int r10 = r9.getInt(r15)     // Catch:{ all -> 0x0134 }
            if (r10 <= 0) goto L_0x013d
            r10 = 1
            goto L_0x013e
        L_0x0134:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            r2 = r0
            cy3.C58003b.m67160a(r9, r1)
            throw r2
        L_0x013d:
            r10 = 0
        L_0x013e:
            cy3.C58003b.m67160a(r9, r6)
        L_0x0141:
            if (r10 != 0) goto L_0x0146
            r8.mo119966f()
        L_0x0146:
            int r5 = r5 + 1
            goto L_0x00fd
        L_0x0149:
            long r3 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r0)
            double r3 = (double) r3
            r0 = 1048576(0x100000, float:1.469368E-39)
            double r8 = (double) r0
            double r3 = r3 / r8
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r0 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            int r0 = r0.f239292P
            double r8 = (double) r0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fe
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "rootDir.folderSizeMB="
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = ", will evict files"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r0 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            int r0 = r0.f239292P
            double r0 = (double) r0
            double r3 = r3 - r0
            r0 = 1024(0x400, float:1.435E-42)
            double r0 = (double) r0
            double r3 = r3 * r0
            double r3 = r3 * r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r2.f100124e
            java.lang.String r5 = "select * from WxaAppWebRenderingCacheAccessStatsTable order by accessTime asc "
            android.database.Cursor r1 = r1.rawQuery(r5, r6, r7)
            if (r1 == 0) goto L_0x01ad
            boolean r5 = r1.moveToFirst()     // Catch:{ all -> 0x01ec }
            if (r5 == 0) goto L_0x01ad
        L_0x019c:
            vq0.b r5 = new vq0.b     // Catch:{ all -> 0x01ec }
            r5.<init>()     // Catch:{ all -> 0x01ec }
            r5.convertFrom(r1)     // Catch:{ all -> 0x01ec }
            r0.add(r5)     // Catch:{ all -> 0x01ec }
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x01ec }
            if (r5 != 0) goto L_0x019c
        L_0x01ad:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01ec }
            cy3.C58003b.m67160a(r1, r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x01b6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01fe
            java.lang.Object r1 = r0.next()
            vq0.b r1 = (vq0.C37802b) r1
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r5 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r5 = r5.mo116962a()
            java.lang.String r8 = r1.field_appId
            java.lang.String r9 = "record.field_appId"
            gy3.C87412m.m108593f(r8, r9)
            boolean r5 = com.tencent.luggage.sdk.processes.C80254f.m97661H(r5, r8, r15, r7, r6)
            if (r5 == 0) goto L_0x01d7
            goto L_0x01b6
        L_0x01d7:
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x01de
            goto L_0x01fe
        L_0x01de:
            java.lang.String r5 = r1.field_cacheFilePath
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            double r8 = (double) r8
            double r3 = r3 - r8
            java.lang.String[] r5 = new java.lang.String[r15]
            r2.delete(r1, r5)
            goto L_0x01b6
        L_0x01ec:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x01ef }
        L_0x01ef:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r1, r2)
            throw r3
        L_0x01f5:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x01f8 }
        L_0x01f8:
            r0 = move-exception
            r2 = r0
            cy3.C58003b.m67160a(r4, r1)
            throw r2
        L_0x01fe:
            return
        L_0x01ff:
            r0.mo119966f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vq0.C90861d.m113947b():void");
    }

    /* renamed from: c */
    public final String mo124960c(boolean z) {
        AbsReader absReader;
        C81161g2.requireAccountInitializedOnDemand();
        C81258h3 h3Var = C81161g2.f238471g;
        C87412m.m108593f(h3Var, "getAppWxaPkgStorage()");
        boolean z2 = false;
        C29315z2 b = C81292m2.m99672b(h3Var, z ? 0 : 999);
        if (b != null) {
            WxaPkgWrappingInfo c = C81292m2.m99673c(b);
            if (!c.f238587f) {
                String str = c.pkgPath;
                if (str == null || str.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    absReader = new WxaCommLibRuntimeReader.PkgReader(c);
                    return absReader.mo113367M();
                }
            }
            absReader = AssetReader.f238551j;
            C87412m.m108593f(absReader, "{\n            AssetReader.INSTANCE\n        }");
            return absReader.mo113367M();
        } else if (z) {
            return AssetReader.f238551j.mo113367M();
        } else {
            return null;
        }
    }
}
