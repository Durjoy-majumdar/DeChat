package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Arrays;
import p749xh.C38537c0;
import sx3.C110818d0;
import sx3.C64197v;
import tr0.C37242c;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.x2 */
public final class C81387x2 extends C37242c<C81227a3> implements C81347q0<C81227a3> {

    /* renamed from: f */
    public static final C81388a f238891f = new C81388a((C8480h) null);

    /* renamed from: g */
    public static final String[] f238892g;

    /* renamed from: e */
    public final ISQLiteDatabase f238893e;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.x2$a */
    public static final class C81388a {
        public C81388a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final boolean m99823a(C81388a aVar, C81227a3 a3Var) {
            aVar.getClass();
            if (a3Var == null) {
                return false;
            }
            String str = a3Var.field_appId;
            if (str == null || str.length() == 0) {
                return false;
            }
            String str2 = a3Var.field_versionDesc;
            return !(str2 == null || str2.length() == 0);
        }

        /* renamed from: b */
        public static String m99824b(C81388a aVar, C81227a3 a3Var, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            aVar.getClass();
            if (a3Var == null) {
                return "(null)";
            }
            ArrayList c = C64197v.m75534c("appId:" + a3Var.field_appId, "versionType:" + a3Var.field_debugType, "versionDesc:" + a3Var.field_versionDesc);
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("filePath:");
                String str = a3Var.field_pkgPath;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                c.add(sb.toString());
            }
            return C110818d0.m150921S(c, ", ", "(", ")", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.x2$b */
    public static final class C81389b extends C87413o implements C32226l<String, CharSequence> {

        /* renamed from: d */
        public static final C81389b f238894d = new C81389b();

        public C81389b() {
            super(1);
        }

        public Object invoke(Object obj) {
            return ((String) obj) + "=?";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.x2$c */
    public static final class C81390c extends C87413o implements C32226l<String, CharSequence> {

        /* renamed from: d */
        public static final C81390c f238895d = new C81390c();

        public C81390c() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return str + "=?";
        }
    }

    static {
        String createSQLs = MAutoStorage.getCreateSQLs(C81227a3.f238599J, "AppBrandWxaPkgManifestRecordWithDesc");
        C87412m.m108593f(createSQLs, "getCreateSQLs(WxaPkgMani…ithDescRecord.TABLE_NAME)");
        f238892g = new String[]{createSQLs};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81387x2(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C81227a3.f238599J, "AppBrandWxaPkgManifestRecordWithDesc", C81227a3.f238597H);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f238893e = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("AppBrandWxaPkgManifestRecordForDevPlugin", "DROP TABLE IF EXISTS AppBrandWxaPkgManifestRecordForDevPlugin");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("Luggage.WxaPkgIndexedWithDescStorage", "select_keyBy_appId_debugType(appId:" + r2 + ", versionType:" + r3 + "), exception:" + r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.appcache.C81227a3 mo113516Kn(java.lang.String r21, int r22, java.lang.String... r23) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            r0 = r23
            java.lang.String r4 = "columns"
            gy3.C87412m.m108594g(r0, r4)
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x001a
            int r6 = r21.length()
            if (r6 != 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r6 = 0
            goto L_0x001b
        L_0x001a:
            r6 = 1
        L_0x001b:
            r7 = 0
            if (r6 == 0) goto L_0x001f
            return r7
        L_0x001f:
            int r6 = r0.length
            if (r6 != 0) goto L_0x0024
            r6 = 1
            goto L_0x0025
        L_0x0024:
            r6 = 0
        L_0x0025:
            if (r6 == 0) goto L_0x0029
            r10 = r7
            goto L_0x0031
        L_0x0029:
            int r6 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r10 = r0
        L_0x0031:
            java.lang.String r0 = "appId"
            java.lang.String r6 = "debugType"
            java.lang.String[] r11 = new java.lang.String[]{r0, r6}
            java.lang.String r12 = " AND "
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            com.tencent.mm.plugin.appbrand.appcache.x2$c r17 = com.tencent.p014mm.plugin.appbrand.appcache.C81387x2.C81390c.f238895d
            r18 = 30
            r19 = 0
            java.lang.String r11 = sx3.C110823p.m150987M(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]
            r6[r4] = r2
            java.lang.String r4 = java.lang.String.valueOf(r22)
            r6[r5] = r4
            java.lang.String r14 = "rowid desc"
            java.lang.String r15 = "1"
            monitor-enter(r20)     // Catch:{ Exception -> 0x0099 }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r1.f238893e     // Catch:{ all -> 0x0096 }
            r8 = 0
            java.lang.String r9 = r20.getTableName()     // Catch:{ all -> 0x0096 }
            r12 = 0
            r13 = 0
            java.lang.String r5 = android.database.sqlite.SQLiteQueryBuilder.buildQueryString(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0096 }
            android.database.Cursor r4 = r4.rawQuery(r5, r6, r0)     // Catch:{ all -> 0x0096 }
            if (r4 == 0) goto L_0x0094
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0085
            com.tencent.mm.plugin.appbrand.appcache.a3 r0 = new com.tencent.mm.plugin.appbrand.appcache.a3     // Catch:{ all -> 0x008b }
            r0.<init>()     // Catch:{ all -> 0x008b }
            r0.convertFrom(r4)     // Catch:{ all -> 0x008b }
            r0.field_appId = r2     // Catch:{ all -> 0x008b }
            r0.field_debugType = r3     // Catch:{ all -> 0x008b }
            cy3.C58003b.m67160a(r4, r7)     // Catch:{ all -> 0x0096 }
            monitor-exit(r20)     // Catch:{ Exception -> 0x0099 }
            return r0
        L_0x0085:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x008b }
            cy3.C58003b.m67160a(r4, r7)     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x008b:
            r0 = move-exception
            r5 = r0
            throw r5     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            r6 = r0
            cy3.C58003b.m67160a(r4, r5)     // Catch:{ all -> 0x0096 }
            throw r6     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r20)     // Catch:{ Exception -> 0x0099 }
            goto L_0x00c1
        L_0x0096:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ Exception -> 0x0099 }
            throw r0     // Catch:{ Exception -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            java.lang.String r4 = "Luggage.WxaPkgIndexedWithDescStorage"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "select_keyBy_appId_debugType(appId:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = ", versionType:"
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = "), exception:"
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x00c1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81387x2.mo113516Kn(java.lang.String, int, java.lang.String[]):com.tencent.mm.plugin.appbrand.appcache.a3");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        cy3.C58003b.m67160a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("Luggage.WxaPkgIndexedWithDescStorage", "hasManifestRecord(" + com.tencent.p014mm.plugin.appbrand.appcache.C81387x2.C81388a.m99824b(f238891f, r12, false, 1, (java.lang.Object) null) + "), exception:" + r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo113669jo(com.tencent.p014mm.plugin.appbrand.appcache.C81227a3 r12) {
        /*
            r11 = this;
            com.tencent.mm.plugin.appbrand.appcache.x2$a r0 = f238891f
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81387x2.C81388a.m99823a(r0, r12)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            gy3.C87412m.m108591d(r12)
            java.lang.String[] r2 = com.tencent.p014mm.plugin.appbrand.appcache.C81227a3.f238598I
            java.lang.String r0 = "KEYS"
            gy3.C87412m.m108593f(r2, r0)
            java.lang.String r3 = " AND "
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            com.tencent.mm.plugin.appbrand.appcache.x2$b r8 = com.tencent.p014mm.plugin.appbrand.appcache.C81387x2.C81389b.f238894d
            r9 = 30
            r10 = 0
            java.lang.String r0 = sx3.C110823p.m150987M(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = r12.field_appId
            r2[r1] = r3
            int r3 = r12.field_debugType
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = r12.field_versionDesc
            r5 = 2
            r2[r5] = r3
            r3 = 0
            monitor-enter(r11)     // Catch:{ Exception -> 0x0080 }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r11.f238893e     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r7.<init>()     // Catch:{ all -> 0x007d }
            java.lang.String r8 = "select count(*) from "
            r7.append(r8)     // Catch:{ all -> 0x007d }
            java.lang.String r8 = r11.getTableName()     // Catch:{ all -> 0x007d }
            r7.append(r8)     // Catch:{ all -> 0x007d }
            java.lang.String r8 = " where "
            r7.append(r8)     // Catch:{ all -> 0x007d }
            r7.append(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x007d }
            android.database.Cursor r0 = r6.rawQuery(r0, r2, r5)     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x007b
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x006e
            int r2 = r0.getInt(r1)     // Catch:{ all -> 0x0074 }
            if (r2 <= 0) goto L_0x006e
            r2 = 1
            goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            cy3.C58003b.m67160a(r0, r3)     // Catch:{ all -> 0x007d }
            monitor-exit(r11)     // Catch:{ Exception -> 0x0080 }
            return r2
        L_0x0074:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r5 = move-exception
            cy3.C58003b.m67160a(r0, r2)     // Catch:{ all -> 0x007d }
            throw r5     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r11)     // Catch:{ Exception -> 0x0080 }
            goto L_0x00a5
        L_0x007d:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ Exception -> 0x0080 }
            throw r0     // Catch:{ Exception -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            java.lang.String r2 = "Luggage.WxaPkgIndexedWithDescStorage"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "hasManifestRecord("
            r5.append(r6)
            com.tencent.mm.plugin.appbrand.appcache.x2$a r6 = f238891f
            java.lang.String r12 = com.tencent.p014mm.plugin.appbrand.appcache.C81387x2.C81388a.m99824b(r6, r12, r1, r4, r3)
            r5.append(r12)
            java.lang.String r12 = "), exception:"
            r5.append(r12)
            r5.append(r0)
            java.lang.String r12 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r12)
        L_0x00a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81387x2.mo113669jo(com.tencent.mm.plugin.appbrand.appcache.a3):boolean");
    }

    /* renamed from: pl */
    public C38537c0 mo113533pl(String str, int i, int i2, String[] strArr) {
        C87412m.m108594g(strArr, "columns");
        return mo113516Kn(str, i2, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00af, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("Luggage.WxaPkgIndexedWithDescStorage", "select_keyBy_appId_versionType_versionDesc(appId:" + r2 + ", versionType:" + r3 + ", versionDesc:" + r4 + "), exception=" + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: r3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p749xh.C38537c0 mo113536r3(java.lang.String r22, int r23, java.lang.String r24, java.lang.String[] r25) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r0 = r25
            java.lang.String r5 = "columns"
            gy3.C87412m.m108594g(r0, r5)
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x001c
            int r7 = r22.length()
            if (r7 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r7 = 0
            goto L_0x001d
        L_0x001c:
            r7 = 1
        L_0x001d:
            r8 = 0
            if (r7 != 0) goto L_0x00df
            if (r4 == 0) goto L_0x002b
            int r7 = r24.length()
            if (r7 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r7 = 0
            goto L_0x002c
        L_0x002b:
            r7 = 1
        L_0x002c:
            if (r7 == 0) goto L_0x0030
            goto L_0x00df
        L_0x0030:
            int r7 = r0.length
            if (r7 != 0) goto L_0x0035
            r7 = 1
            goto L_0x0036
        L_0x0035:
            r7 = 0
        L_0x0036:
            if (r7 == 0) goto L_0x003a
            r11 = r8
            goto L_0x0042
        L_0x003a:
            int r7 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r11 = r0
        L_0x0042:
            java.lang.String[] r12 = com.tencent.p014mm.plugin.appbrand.appcache.C81227a3.f238598I
            java.lang.String r0 = "KEYS"
            gy3.C87412m.m108593f(r12, r0)
            java.lang.String r13 = " AND "
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            com.tencent.mm.plugin.appbrand.appcache.y2 r18 = com.tencent.p014mm.plugin.appbrand.appcache.C1518y2.f10869d
            r19 = 30
            r20 = 0
            java.lang.String r12 = sx3.C110823p.m150987M(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r6] = r2
            java.lang.String r6 = java.lang.String.valueOf(r23)
            r0[r5] = r6
            r5 = 2
            r0[r5] = r4
            monitor-enter(r21)     // Catch:{ Exception -> 0x00ae }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r1.f238893e     // Catch:{ all -> 0x00ab }
            r9 = 0
            java.lang.String r10 = r21.getTableName()     // Catch:{ all -> 0x00ab }
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r7 = android.database.sqlite.SQLiteQueryBuilder.buildQueryString(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00ab }
            android.database.Cursor r5 = r6.rawQuery(r7, r0, r5)     // Catch:{ all -> 0x00ab }
            if (r5 == 0) goto L_0x00a9
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x009a
            com.tencent.mm.plugin.appbrand.appcache.a3 r0 = new com.tencent.mm.plugin.appbrand.appcache.a3     // Catch:{ all -> 0x00a0 }
            r0.<init>()     // Catch:{ all -> 0x00a0 }
            r0.convertFrom(r5)     // Catch:{ all -> 0x00a0 }
            r0.field_appId = r2     // Catch:{ all -> 0x00a0 }
            r0.field_debugType = r3     // Catch:{ all -> 0x00a0 }
            r0.field_versionDesc = r4     // Catch:{ all -> 0x00a0 }
            cy3.C58003b.m67160a(r5, r8)     // Catch:{ all -> 0x00ab }
            monitor-exit(r21)     // Catch:{ Exception -> 0x00ae }
            r8 = r0
            goto L_0x00fe
        L_0x009a:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a0 }
            cy3.C58003b.m67160a(r5, r8)     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x00a0:
            r0 = move-exception
            r6 = r0
            throw r6     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            r7 = r0
            cy3.C58003b.m67160a(r5, r6)     // Catch:{ all -> 0x00ab }
            throw r7     // Catch:{ all -> 0x00ab }
        L_0x00a9:
            monitor-exit(r21)     // Catch:{ Exception -> 0x00ae }
            goto L_0x00fe
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r21)     // Catch:{ Exception -> 0x00ae }
            throw r0     // Catch:{ Exception -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            java.lang.String r5 = "Luggage.WxaPkgIndexedWithDescStorage"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "select_keyBy_appId_versionType_versionDesc(appId:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = ", versionType:"
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ", versionDesc:"
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = "), exception="
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x00fe
        L_0x00df:
            java.lang.String r0 = "Luggage.WxaPkgIndexedWithDescStorage"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "select_keyBy_appId_versionType_versionDesc, invalid appId:"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = " versionDesc:"
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
        L_0x00fe:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81387x2.mo113536r3(java.lang.String, int, java.lang.String, java.lang.String[]):xh.c0");
    }
}
