package ue1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import p749xh.C66261f3;
import up1.C37549f0;

/* renamed from: ue1.b0 */
public final class C37424b0 {

    /* renamed from: a */
    public static final C37424b0 f98925a = new C37424b0();

    /* renamed from: a */
    public final boolean mo61082a(int i) {
        C37549f0 Lx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Lx0();
        String str = "DELETE FROM " + Lx0.getTableName() + " WHERE type = " + i;
        boolean execSQL = Lx0.execSQL(Lx0.getTableName(), str);
        Log.m105924i("Finder.NewXmlDataLogic", "clearAll sql: " + str + ", success: " + execSQL);
        return execSQL;
    }

    /* renamed from: b */
    public final boolean mo61083b(int i, long j) {
        C37549f0 Lx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Lx0();
        String str = "DELETE FROM " + Lx0.getTableName() + " WHERE type = " + i + " AND createTime < " + j;
        boolean execSQL = Lx0.execSQL(Lx0.getTableName(), str);
        Log.m105924i("Finder.NewXmlDataLogic", "clearBeforeTime sql: " + str + ", success: " + execSQL);
        return execSQL;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        cy3.C58003b.m67160a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        throw r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<up1.C37558x0> mo61084c(int r5) {
        /*
            r4 = this;
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            up1.f0 r0 = r0.Lx0()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT * FROM "
            r1.append(r2)
            java.lang.String r2 = r0.getTableName()
            r1.append(r2)
            java.lang.String r2 = " WHERE type = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " ORDER BY createTime ASC"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            android.database.Cursor r0 = r0.rawQuery(r5, r1)
            if (r0 == 0) goto L_0x005d
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2 = 0
        L_0x003d:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x0052
            java.lang.Class<up1.x0> r3 = up1.C37558x0.class
            java.lang.Object r3 = r3.newInstance()     // Catch:{ all -> 0x0056 }
            com.tencent.mm.sdk.storage.IAutoDBItem r3 = (com.tencent.p014mm.sdk.storage.IAutoDBItem) r3     // Catch:{ all -> 0x0056 }
            r3.convertFrom(r0)     // Catch:{ all -> 0x0056 }
            r1.add(r3)     // Catch:{ all -> 0x0056 }
            goto L_0x003d
        L_0x0052:
            cy3.C58003b.m67160a(r0, r2)
            goto L_0x0062
        L_0x0056:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            cy3.C58003b.m67160a(r0, r5)
            throw r1
        L_0x005d:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
        L_0x0062:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "queryAll sql: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = ", size: "
            r0.append(r5)
            int r5 = r1.size()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Finder.NewXmlDataLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue1.C37424b0.mo61084c(int):java.util.List");
    }

    /* renamed from: d */
    public final boolean mo61085d(String str) {
        C87412m.m108594g(str, C66261f3.COL_LOCALID);
        C37549f0 Lx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Lx0();
        String str2 = "DELETE FROM " + Lx0.getTableName() + " WHERE localId = " + str;
        boolean execSQL = Lx0.execSQL(Lx0.getTableName(), str2);
        Log.m105924i("Finder.NewXmlDataLogic", "removeById sql: " + str2 + ", success: " + execSQL);
        return execSQL;
    }
}
