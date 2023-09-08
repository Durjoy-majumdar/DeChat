package com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import ii0.C87732a;
import ki0.C33912g;
import ki0.C33913h;
import p749xh.C38575h7;
import p749xh.C38582i7;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage */
public final class WxaSyncCmdPersistentStorage {

    /* renamed from: d */
    public static final String[] f79981d = {MAutoStorage.getCreateSQLs(C33912g.f91606r, "PersistentWxaSyncInvalidCodeCmd"), MAutoStorage.getCreateSQLs(C33913h.f91607r, "PersistentWxaSyncInvalidContactCmd")};

    /* renamed from: e */
    public static C29286b f79982e;

    /* renamed from: f */
    public static C29285a f79983f;

    /* renamed from: a */
    public final ISQLiteDatabase f79984a;

    /* renamed from: b */
    public final C29287c f79985b;

    /* renamed from: c */
    public final C29288d f79986c;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage$a */
    public interface C29285a {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage$b */
    public interface C29286b {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage$c */
    public static final class C29287c extends MAutoStorage<C33912g> {
        public C29287c(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String[] strArr) {
            super(iSQLiteDatabase, mAutoDBInfo, "PersistentWxaSyncInvalidCodeCmd", strArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage$d */
    public static final class C29288d extends MAutoStorage<C33913h> {
        public C29288d(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String[] strArr) {
            super(iSQLiteDatabase, mAutoDBInfo, "PersistentWxaSyncInvalidContactCmd", strArr);
        }
    }

    public WxaSyncCmdPersistentStorage(ISQLiteDatabase iSQLiteDatabase) {
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f79984a = iSQLiteDatabase;
        new IListener<WxaAttrStorageNotifyEvent>(this, C40008f.f107254d) {

            /* renamed from: d */
            public final /* synthetic */ WxaSyncCmdPersistentStorage f79987d;

            {
                this.f79987d = r1;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
            /* JADX WARNING: type inference failed for: r4v0 */
            /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List, java.util.Collection] */
            /* JADX WARNING: type inference failed for: r4v6 */
            /* JADX WARNING: type inference failed for: r4v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r7) {
                /*
                    r6 = this;
                    com.tencent.mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent r7 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent) r7
                    java.lang.String r0 = "event"
                    gy3.C87412m.m108594g(r7, r0)
                    com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage r0 = r6.f79987d
                    com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f79984a
                    boolean r0 = r0.isClose()
                    r1 = 0
                    if (r0 == 0) goto L_0x0016
                    r6.dead()
                    goto L_0x0077
                L_0x0016:
                    java.lang.String r0 = r7.f10891d
                    java.lang.String r2 = "single"
                    boolean r0 = gy3.C87412m.m108589b(r2, r0)
                    java.lang.String r2 = "MicroMsg.WxaSyncCmdPersistentStorage"
                    r3 = 1
                    r4 = 0
                    if (r0 == 0) goto L_0x0049
                    java.lang.Object r7 = r7.f10893f
                    if (r7 == 0) goto L_0x002d
                    java.lang.String r4 = r7.toString()
                L_0x002d:
                    if (r4 == 0) goto L_0x0037
                    int r7 = r4.length()
                    if (r7 != 0) goto L_0x0036
                    goto L_0x0037
                L_0x0036:
                    r3 = 0
                L_0x0037:
                    if (r3 == 0) goto L_0x003a
                    goto L_0x0077
                L_0x003a:
                    zt3.t r7 = zt3.C119157j.f356862d
                    com.tencent.mm.plugin.appbrand.appcache.predownload.storage.a r0 = new com.tencent.mm.plugin.appbrand.appcache.predownload.storage.a
                    com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage r3 = r6.f79987d
                    r0.<init>(r3, r4)
                    zt3.j r7 = (zt3.C119157j) r7
                    r7.mo183876g(r0, r2)
                    goto L_0x0077
                L_0x0049:
                    java.lang.String r0 = r7.f10891d
                    java.lang.String r5 = "batch"
                    boolean r0 = gy3.C87412m.m108589b(r5, r0)
                    if (r0 == 0) goto L_0x0077
                    java.lang.Object r7 = r7.f10893f
                    boolean r0 = r7 instanceof java.util.List
                    if (r0 == 0) goto L_0x005c
                    r4 = r7
                    java.util.List r4 = (java.util.List) r4
                L_0x005c:
                    if (r4 == 0) goto L_0x0066
                    boolean r7 = r4.isEmpty()
                    if (r7 == 0) goto L_0x0065
                    goto L_0x0066
                L_0x0065:
                    r3 = 0
                L_0x0066:
                    if (r3 == 0) goto L_0x0069
                    goto L_0x0077
                L_0x0069:
                    zt3.t r7 = zt3.C119157j.f356862d
                    com.tencent.mm.plugin.appbrand.appcache.predownload.storage.b r0 = new com.tencent.mm.plugin.appbrand.appcache.predownload.storage.b
                    com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage r3 = r6.f79987d
                    r0.<init>(r4, r3)
                    zt3.j r7 = (zt3.C119157j) r7
                    r7.mo183876g(r0, r2)
                L_0x0077:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage.C292841.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        }.alive();
        this.f79985b = new C29287c(iSQLiteDatabase, C33912g.f91606r, C38575h7.f102465h);
        this.f79986c = new C29288d(iSQLiteDatabase, C33913h.f91607r, C38582i7.f102552h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56568a(com.tencent.p014mm.plugin.appbrand.appcache.C81258h3 r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "wxaPkgStorage"
            gy3.C87412m.m108594g(r0, r2)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage$c r3 = r1.f79985b
            android.database.Cursor r3 = r3.getAll()
            r4 = 0
            if (r3 == 0) goto L_0x003e
            boolean r5 = r3.moveToFirst()     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x002f
        L_0x001e:
            ki0.g r5 = new ki0.g     // Catch:{ all -> 0x0035 }
            r5.<init>()     // Catch:{ all -> 0x0035 }
            r5.convertFrom(r3)     // Catch:{ all -> 0x0035 }
            r2.add(r5)     // Catch:{ all -> 0x0035 }
            boolean r5 = r3.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r5 != 0) goto L_0x001e
        L_0x002f:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0035 }
            cy3.C58003b.m67160a(r3, r4)
            goto L_0x003e
        L_0x0035:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r4 = r0
            cy3.C58003b.m67160a(r3, r2)
            throw r4
        L_0x003e:
            java.util.Iterator r2 = r2.iterator()
        L_0x0042:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x011a
            java.lang.Object r3 = r2.next()
            ki0.g r3 = (ki0.C33912g) r3
            long r5 = r3.field_timestamp
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0057
            goto L_0x0042
        L_0x0057:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r10 = r0.f238664d
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 2
            java.lang.String r11 = "AppBrandWxaPkgManifestRecord"
            java.lang.String r13 = "debugType = 0"
            android.database.Cursor r5 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r5 != 0) goto L_0x006e
        L_0x006c:
            r6 = r4
            goto L_0x0091
        L_0x006e:
            boolean r6 = r5.moveToFirst()
            if (r6 != 0) goto L_0x0078
            r5.close()
            goto L_0x006c
        L_0x0078:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x007d:
            com.tencent.mm.plugin.appbrand.appcache.z2 r7 = new com.tencent.mm.plugin.appbrand.appcache.z2
            r7.<init>()
            r7.convertFrom(r5)
            r6.add(r7)
            boolean r7 = r5.moveToNext()
            if (r7 != 0) goto L_0x007d
            r5.close()
        L_0x0091:
            long r7 = r3.field_timestamp
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            java.lang.String r5 = "pkgRecords"
            gy3.C87412m.m108593f(r6, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00a5:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00db
            java.lang.Object r9 = r6.next()
            com.tencent.mm.plugin.appbrand.appcache.z2 r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r9
            java.lang.String r10 = r9.field_pkgPath
            if (r10 == 0) goto L_0x00be
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r10 = 0
            goto L_0x00bf
        L_0x00be:
            r10 = 1
        L_0x00bf:
            if (r10 != 0) goto L_0x00d4
            java.lang.String r10 = r9.field_pkgPath
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r10 == 0) goto L_0x00d4
            java.lang.String r9 = r9.field_pkgPath
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106452m(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L_0x00d5
        L_0x00d4:
            r9 = r4
        L_0x00d5:
            if (r9 == 0) goto L_0x00a5
            r5.add(r9)
            goto L_0x00a5
        L_0x00db:
            java.lang.Comparable r5 = sx3.C110818d0.m150927Y(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0042
            long r9 = r5.longValue()
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0042
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "evictUselessInvalidCodeCommands >> appId:"
            r6.append(r9)
            java.lang.String r9 = r3.field_appId
            r6.append(r9)
            java.lang.String r9 = ", maxFileLastModified:"
            r6.append(r9)
            r6.append(r5)
            java.lang.String r5 = ", invalidUntilTimestamp:"
            r6.append(r5)
            r6.append(r7)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "MicroMsg.WxaSyncCmdPersistentStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            java.lang.String r3 = r3.field_appId
            r1.mo56570c(r3)
            goto L_0x0042
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage.mo56568a(com.tencent.mm.plugin.appbrand.appcache.h3):void");
    }

    /* renamed from: b */
    public int mo56569b(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        C33913h hVar = new C33913h();
        hVar.field_username = str;
        if (this.f79986c.get(hVar, new String[0])) {
            return hVar.field_reportId;
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo56570c(String str) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        C33912g gVar = new C33912g();
        gVar.field_appId = str;
        try {
            if (this.f79985b.get(gVar, new String[0])) {
                int i = gVar.field_reportId;
                boolean delete = this.f79985b.delete(gVar, new String[0]);
                if (delete && f79983f != null) {
                    C87732a.INSTANCE.mo122144a(i, 192);
                }
                z = delete;
            }
            return z;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WxaSyncCmdPersistentStorage", "removeInvalidCodeTimestampForAppId appId:" + str + " exception:" + e);
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo56571d(String str) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        C33913h hVar = new C33913h();
        hVar.field_username = str;
        try {
            if (this.f79986c.get(hVar, new String[0])) {
                int i = hVar.field_reportId;
                boolean delete = this.f79986c.delete(hVar, new String[0]);
                if (delete && f79983f != null) {
                    C87732a.INSTANCE.mo122144a(i, 200);
                }
                z = delete;
            }
            return z;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WxaSyncCmdPersistentStorage", "removeInvalidContactTimestampForUsername username:" + str + ", exception:" + e);
            return false;
        }
    }

    /* renamed from: e */
    public final C33912g mo56572e(String str) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            return null;
        }
        C33912g gVar = new C33912g();
        gVar.field_appId = str;
        int D = C112550d0.m153768D(str, '$', 0, false, 6, (Object) null);
        if (D >= 0) {
            Log.m105920e("MicroMsg.WxaSyncCmdPersistentStorage", "getInvalidCodeTimestampForAppId get invalid appId(" + str + "), stack:" + android.util.Log.getStackTraceString(new Throwable()));
            String substring = str.substring(0, D);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            gVar.field_appId = substring;
            if (substring.length() != 0) {
                z = false;
            }
            if (z) {
                return null;
            }
        }
        if (this.f79985b.get(gVar, new String[0])) {
            return gVar;
        }
        return null;
    }
}
