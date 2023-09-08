package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.Arrays;
import java.util.List;
import p156gj.C87203t;
import p749xh.C91208ma;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.x0 */
public final class C84878x0 extends MAutoStorage<C84875w0> {

    /* renamed from: d */
    public static final int f247394d;

    /* renamed from: e */
    public static final String[] f247395e = {MAutoStorage.getCreateSQLs(C84875w0.f247385R, "WxaPkgV8SnapshotInfoV3")};

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.x0$a */
    public static final class C84879a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ISQLiteDatabase f247396d;

        /* renamed from: e */
        public final /* synthetic */ C84878x0 f247397e;

        public C84879a(ISQLiteDatabase iSQLiteDatabase, C84878x0 x0Var) {
            this.f247396d = iSQLiteDatabase;
            this.f247397e = x0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
            dy3.C86417a.m107084a(r2, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r6.f247396d
                java.lang.String r1 = "WxaPkgV8SnapshotInfo"
                com.tencent.p014mm.plugin.appbrand.utils.C84776q0.m104439a(r0, r1)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r6.f247396d
                java.lang.String r1 = "WxaPkgV8SnapshotInfoV2"
                boolean r0 = com.tencent.p014mm.plugin.appbrand.utils.C84776q0.m104440b(r0, r1)
                if (r0 != 0) goto L_0x0019
                java.lang.String r0 = "MicroMsg.WxaPkgV8SnapshotInfoStorage"
                java.lang.String r1 = "migrateTableV2, not need"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                return
            L_0x0019:
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r6.f247396d
                java.lang.String r2 = "db"
                gy3.C87412m.m108594g(r0, r2)
                com.tencent.mm.plugin.appbrand.utils.b2 r2 = new com.tencent.mm.plugin.appbrand.utils.b2
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                long r3 = r3.getId()
                long r3 = r0.beginTransaction(r3)
                r5 = 0
                r2.<init>(r0, r3, r5)
                com.tencent.mm.plugin.appbrand.v8_snapshot.x0 r0 = r6.f247397e
                com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r6.f247396d
                com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84878x0.m104586jo(r0, r3)     // Catch:{ all -> 0x0042 }
                com.tencent.p014mm.plugin.appbrand.utils.C84776q0.m104439a(r3, r1)     // Catch:{ all -> 0x0042 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0042 }
                dy3.C86417a.m107084a(r2, r5)
                return
            L_0x0042:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0044 }
            L_0x0044:
                r1 = move-exception
                dy3.C86417a.m107084a(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84878x0.C84879a.run():void");
        }
    }

    static {
        int i = C87203t.m108279o() ? 2 : 1;
        f247394d = i;
        Log.m105924i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "<cinit>, ARCH: " + i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84878x0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C84875w0.f247385R, "WxaPkgV8SnapshotInfoV3", C91208ma.f261619w);
        C87412m.m108594g(iSQLiteDatabase, "db");
        ((C119157j) C119157j.f356862d).mo183884o(new C84879a(iSQLiteDatabase, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: sx3.f0} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        cy3.C58003b.m67160a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m104586jo(com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84878x0 r7, com.tencent.p014mm.sdk.storage.ISQLiteDatabase r8) {
        /*
            r7.getClass()
            r0 = 0
            java.lang.String r1 = "SELECT * FROM WxaPkgV8SnapshotInfoV2"
            android.database.Cursor r8 = r8.rawQuery(r1, r0)
            java.lang.String r1 = "MicroMsg.WxaPkgV8SnapshotInfoStorage"
            if (r8 == 0) goto L_0x0038
            boolean r2 = r8.moveToFirst()     // Catch:{ all -> 0x0031 }
            if (r2 != 0) goto L_0x0017
            sx3.f0 r2 = sx3.C64186f0.f181907d     // Catch:{ all -> 0x0031 }
            goto L_0x002d
        L_0x0017:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0031 }
            r2.<init>()     // Catch:{ all -> 0x0031 }
        L_0x001c:
            xh.la r3 = new xh.la     // Catch:{ all -> 0x0031 }
            r3.<init>()     // Catch:{ all -> 0x0031 }
            r3.convertFrom(r8)     // Catch:{ all -> 0x0031 }
            r2.add(r3)     // Catch:{ all -> 0x0031 }
            boolean r3 = r8.moveToNext()     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x001c
        L_0x002d:
            cy3.C58003b.m67160a(r8, r0)
            goto L_0x003f
        L_0x0031:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            cy3.C58003b.m67160a(r8, r7)
            throw r0
        L_0x0038:
            java.lang.String r8 = "convertV2List, cursor is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
            sx3.f0 r2 = sx3.C64186f0.f181907d
        L_0x003f:
            boolean r8 = r2.isEmpty()
            r3 = 0
            if (r8 == 0) goto L_0x0047
            goto L_0x00a3
        L_0x0047:
            java.util.Iterator r8 = r2.iterator()
        L_0x004b:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00a3
            java.lang.Object r2 = r8.next()
            xh.la r2 = (p749xh.C91207la) r2
            java.lang.String[] r4 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84875w0.f247384Q
            java.lang.String r4 = "v2"
            gy3.C87412m.m108594g(r2, r4)
            com.tencent.mm.plugin.appbrand.v8_snapshot.w0 r4 = new com.tencent.mm.plugin.appbrand.v8_snapshot.w0
            r4.<init>()
            int r5 = r2.field_arch
            r4.field_arch = r5
            java.lang.String r5 = r2.field_wxaPkgMd5
            r4.field_wxaPkgMd5 = r5
            java.lang.String r5 = r2.field_wxaPkgPath
            r4.field_wxaPkgPath = r5
            int r5 = r2.field_wxaPkgVersion
            r4.field_wxaPkgVersion = r5
            java.lang.String r5 = r2.field_snapshotCategory
            r4.field_snapshotCategory = r5
            java.lang.String r5 = r2.field_snapshotPath
            r4.field_snapshotPath = r5
            long r5 = r2.field_snapshotLastModified
            r4.field_snapshotLastModified = r5
            long r5 = r2.field_snapshotLength
            r4.field_snapshotLength = r5
            java.lang.String r5 = r2.field_produceSnapshotConfig
            r4.field_snapshotBaseConfig = r5
            java.lang.String r5 = r2.field_snapshotMetaInfo
            r4.field_snapshotMetaInfo = r5
            r4.field_isNodeSnapshot = r3
            r4.field_snapshotNodeConfig = r0
            int r5 = r2.field_producingSnapshotCount
            r4.field_producingSnapshotCount = r5
            int r5 = r2.field_consumingSnapshotCount
            r4.field_consumingSnapshotCount = r5
            int r2 = r2.field_recoverCount
            r4.field_recoverCount = r2
            boolean r2 = r7.mo117633Yt(r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x00a4
        L_0x00a3:
            r3 = 1
        L_0x00a4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "migrateTableV2, success: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84878x0.m104586jo(com.tencent.mm.plugin.appbrand.v8_snapshot.x0, com.tencent.mm.sdk.storage.ISQLiteDatabase):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        cy3.C58003b.m67160a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        throw r1;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84875w0> mo117631Lo(android.database.Cursor r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002d
            r0 = 0
            boolean r1 = r4.moveToFirst()     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x000c
            sx3.f0 r1 = sx3.C64186f0.f181907d     // Catch:{ all -> 0x0026 }
            goto L_0x0022
        L_0x000c:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0026 }
            r1.<init>()     // Catch:{ all -> 0x0026 }
        L_0x0011:
            com.tencent.mm.plugin.appbrand.v8_snapshot.w0 r2 = new com.tencent.mm.plugin.appbrand.v8_snapshot.w0     // Catch:{ all -> 0x0026 }
            r2.<init>()     // Catch:{ all -> 0x0026 }
            r2.convertFrom(r4)     // Catch:{ all -> 0x0026 }
            r1.add(r2)     // Catch:{ all -> 0x0026 }
            boolean r2 = r4.moveToNext()     // Catch:{ all -> 0x0026 }
            if (r2 != 0) goto L_0x0011
        L_0x0022:
            cy3.C58003b.m67160a(r4, r0)
            goto L_0x0036
        L_0x0026:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r1 = move-exception
            cy3.C58003b.m67160a(r4, r0)
            throw r1
        L_0x002d:
            java.lang.String r4 = "MicroMsg.WxaPkgV8SnapshotInfoStorage"
            java.lang.String r0 = "convertList, cursor is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            sx3.f0 r1 = sx3.C64186f0.f181907d
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84878x0.mo117631Lo(android.database.Cursor):java.util.List");
    }

    /* renamed from: Ow */
    public final List<C84875w0> mo117632Ow(int i) {
        Log.m105924i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByBelowVersionAllArch, version: " + i);
        return mo117631Lo(rawQuery("SELECT * FROM WxaPkgV8SnapshotInfoV3 WHERE wxaPkgVersion < ?", String.valueOf(i)));
    }

    /* renamed from: Yt */
    public final boolean mo117633Yt(C84875w0 w0Var) {
        C87412m.m108594g(w0Var, "dao");
        Log.m105924i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "insertOrReplace, wxaPkgPath: " + w0Var.field_wxaPkgPath + ", category: " + w0Var.field_snapshotCategory);
        boolean replace = replace(w0Var);
        if (!replace) {
            Log.m105920e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "insertOrReplace, replace failure");
        }
        return replace;
    }

    /* renamed from: bD */
    public final C84875w0 mo117634bD(String str, C84872v0 v0Var) {
        C87412m.m108594g(str, "wxaPkgPath");
        C87412m.m108594g(v0Var, "category");
        Log.m105924i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPath, wxaPkgPath: " + str + ", category: " + v0Var);
        C84875w0 w0Var = new C84875w0();
        w0Var.field_arch = f247394d;
        w0Var.field_wxaPkgPath = str;
        w0Var.field_snapshotCategory = v0Var.f247381d;
        String[] strArr = C84875w0.f247384Q;
        if (get(w0Var, (String[]) Arrays.copyOf(C84875w0.f247384Q, 3))) {
            return w0Var;
        }
        Log.m105920e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPath, get failure");
        return null;
    }

    /* renamed from: qq */
    public final C84875w0 mo117635qq(String str, C84872v0 v0Var) {
        C87412m.m108594g(str, "wxaPkgPath");
        C87412m.m108594g(v0Var, "category");
        Log.m105924i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "deleteByWxaPkgPath, wxaPkgPath: " + str + ", category: " + v0Var);
        C84875w0 w0Var = new C84875w0();
        w0Var.field_arch = f247394d;
        w0Var.field_wxaPkgPath = str;
        w0Var.field_snapshotCategory = v0Var.f247381d;
        String[] strArr = C84875w0.f247384Q;
        if (delete(w0Var, (String[]) Arrays.copyOf(C84875w0.f247384Q, 3))) {
            return w0Var;
        }
        Log.m105920e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "deleteByWxaPkgPath, delete failure");
        return null;
    }
}
