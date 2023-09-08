package s81;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import sf0.C90189z;
import u24.C90599h;

/* renamed from: s81.a */
public class C90153a {

    /* renamed from: a */
    public Map<String, C90189z.C90190a> f258852a = new HashMap();

    /* renamed from: a */
    public final C90189z.C90190a mo124407a(String str) {
        if (C90599h.m113511d(str)) {
            return null;
        }
        C90189z.C90190a aVar = (C90189z.C90190a) ((HashMap) this.f258852a).get(str);
        if (aVar == null) {
            try {
                aVar = C90189z.m112866a(hashCode(), C86709a0.m107535s().f251807e + str, new HashMap(), true);
            } catch (Exception e) {
                Log.m105920e("EdgeComputingDBService", "[EdgeComputingDBService] getOrCreateDataDB getOrCreateDataDB throw Exception : " + e.getMessage());
            }
            if (aVar != null) {
                ((HashMap) this.f258852a).put(str, aVar);
            }
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r8.isClosed() == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        if (r8.isClosed() != false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.util.List<java.lang.String>> mo124408b(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            boolean r0 = u24.C90599h.m113511d(r7)
            r1 = 0
            if (r0 != 0) goto L_0x00c6
            boolean r0 = u24.C90599h.m113511d(r8)
            if (r0 == 0) goto L_0x000f
            goto L_0x00c6
        L_0x000f:
            sf0.z$a r0 = r6.mo124407a(r7)
            java.lang.String r2 = "EdgeComputingDBService"
            if (r0 != 0) goto L_0x002c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "[EdgeComputingDBService] queryDataBySQL dataDB is null, dbPath : "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            j81.C87906e.m109407a(r2, r7)
            return r1
        L_0x002c:
            r7 = 0
            android.database.Cursor r8 = r0.rawQuery(r8, r1, r7)     // Catch:{ Exception -> 0x0032 }
            goto L_0x004c
        L_0x0032:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[EdgeComputingDBService] queryDataBySQL rawQuery throw Exception : "
            r0.append(r3)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
            r8 = r1
        L_0x004c:
            if (r8 == 0) goto L_0x00c6
            boolean r0 = r8.moveToFirst()
            if (r0 != 0) goto L_0x0056
            goto L_0x00c6
        L_0x0056:
            java.lang.String[] r0 = r8.getColumnNames()
            if (r0 == 0) goto L_0x00bd
            int r3 = r0.length
            if (r3 > 0) goto L_0x0060
            goto L_0x00bd
        L_0x0060:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0065:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0092 }
            r3.<init>()     // Catch:{ Exception -> 0x0092 }
            r4 = 0
        L_0x006b:
            int r5 = r0.length     // Catch:{ Exception -> 0x0092 }
            if (r4 >= r5) goto L_0x007a
            java.lang.String r5 = r8.getString(r4)     // Catch:{ Exception -> 0x0078 }
            r3.add(r5)     // Catch:{ Exception -> 0x0078 }
            int r4 = r4 + 1
            goto L_0x006b
        L_0x0078:
            r4 = 1
            goto L_0x007b
        L_0x007a:
            r4 = 0
        L_0x007b:
            if (r4 != 0) goto L_0x0080
            r1.add(r3)     // Catch:{ Exception -> 0x0092 }
        L_0x0080:
            boolean r3 = r8.moveToNext()     // Catch:{ Exception -> 0x0092 }
            if (r3 != 0) goto L_0x0065
            boolean r7 = r8.isClosed()
            if (r7 != 0) goto L_0x00b2
        L_0x008c:
            r8.close()
            goto L_0x00b2
        L_0x0090:
            r7 = move-exception
            goto L_0x00b3
        L_0x0092:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
            r0.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "[EdgeComputingDBService] queryDataBySQL moveToNext throw Exception : "
            r0.append(r3)     // Catch:{ all -> 0x0090 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0090 }
            r0.append(r7)     // Catch:{ all -> 0x0090 }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x0090 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r7)     // Catch:{ all -> 0x0090 }
            boolean r7 = r8.isClosed()
            if (r7 != 0) goto L_0x00b2
            goto L_0x008c
        L_0x00b2:
            return r1
        L_0x00b3:
            boolean r0 = r8.isClosed()
            if (r0 != 0) goto L_0x00bc
            r8.close()
        L_0x00bc:
            throw r7
        L_0x00bd:
            boolean r7 = r8.isClosed()
            if (r7 != 0) goto L_0x00c6
            r8.close()
        L_0x00c6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s81.C90153a.mo124408b(java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: c */
    public void mo124409c() {
        for (C90189z.C90190a aVar : ((HashMap) this.f258852a).values()) {
            if (aVar != null && !aVar.isClose()) {
                aVar.mo124435t(hashCode());
            }
        }
        ((HashMap) this.f258852a).clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r11.isClosed() == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        r11.close();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo124410d(java.lang.String r11, java.lang.String r12, java.util.List<java.lang.String> r13, java.util.List<java.util.List<java.lang.String>> r14) {
        /*
            r10 = this;
            boolean r0 = u24.C90599h.m113511d(r11)
            r1 = 0
            if (r0 != 0) goto L_0x0241
            boolean r0 = u24.C90599h.m113511d(r12)
            if (r0 != 0) goto L_0x0241
            if (r13 == 0) goto L_0x0241
            int r0 = r13.size()
            if (r0 <= 0) goto L_0x0241
            if (r14 == 0) goto L_0x0241
            int r0 = r14.size()
            if (r0 > 0) goto L_0x001f
            goto L_0x0241
        L_0x001f:
            sf0.z$a r0 = r10.mo124407a(r11)
            java.lang.String r2 = "EdgeComputingDBService"
            if (r0 != 0) goto L_0x003c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "[EdgeComputingDBService] saveDatasToDB dataDB is null, dbPath : "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            j81.C87906e.m109407a(r2, r11)
            return r1
        L_0x003c:
            boolean r11 = u24.C90599h.m113511d(r12)
            r3 = 1
            if (r11 == 0) goto L_0x0044
            goto L_0x0083
        L_0x0044:
            r11 = 0
            java.lang.String r4 = "SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;"
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ Exception -> 0x005d }
            r5[r1] = r12     // Catch:{ Exception -> 0x005d }
            android.database.Cursor r11 = r0.rawQuery(r4, r5, r1)     // Catch:{ Exception -> 0x005d }
            boolean r4 = r11.moveToNext()     // Catch:{ Exception -> 0x005d }
            boolean r5 = r11.isClosed()
            if (r5 != 0) goto L_0x0084
            goto L_0x007f
        L_0x005a:
            r12 = move-exception
            goto L_0x0235
        L_0x005d:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r5.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r6 = "[EdgeComputingDBService] checkTableExist throw Exception : "
            r5.append(r6)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x005a }
            r5.append(r4)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x005a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)     // Catch:{ all -> 0x005a }
            if (r11 == 0) goto L_0x0083
            boolean r4 = r11.isClosed()
            if (r4 != 0) goto L_0x0083
            r4 = 0
        L_0x007f:
            r11.close()
            goto L_0x0084
        L_0x0083:
            r4 = 0
        L_0x0084:
            java.lang.String r11 = " ( "
            java.lang.String r5 = ","
            if (r4 != 0) goto L_0x013a
            boolean r4 = u24.C90599h.m113511d(r12)
            if (r4 != 0) goto L_0x0136
            int r4 = r13.size()
            if (r4 > 0) goto L_0x0098
            goto L_0x0136
        L_0x0098:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "CREATE TABLE IF NOT EXISTS "
            r6.append(r7)
            r6.append(r12)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r4.append(r6)
            java.util.Iterator r6 = r13.iterator()
        L_0x00b8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00d5
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            r4.append(r7)
            java.lang.String r7 = " "
            r4.append(r7)
            java.lang.String r7 = "TEXT"
            r4.append(r7)
            r4.append(r5)
            goto L_0x00b8
        L_0x00d5:
            java.lang.String r6 = r4.toString()
            boolean r6 = r6.endsWith(r5)
            if (r6 == 0) goto L_0x00e7
            int r6 = r4.length()
            int r6 = r6 - r3
            r4.deleteCharAt(r6)
        L_0x00e7:
            java.lang.String r6 = ");"
            r4.append(r6)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r1] = r12
            java.lang.String r7 = "[EdgeComputingDBService] createTable tableName : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r12
            java.lang.String r7 = r4.toString()
            r6[r3] = r7
            java.lang.String r7 = "[EdgeComputingDBService] createTable tableName : %s, createTableSQL : %s"
            j81.C87906e.m109408b(r2, r7, r6)
            long r6 = r0.mo125613a()
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0114 }
            boolean r4 = r0.execSQL(r12, r4)     // Catch:{ Exception -> 0x0114 }
            goto L_0x012e
        L_0x0112:
            r11 = move-exception
            goto L_0x0132
        L_0x0114:
            r4 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r8.<init>()     // Catch:{ all -> 0x0112 }
            java.lang.String r9 = "[EdgeComputingDataDao] createTable throw Exception : "
            r8.append(r9)     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0112 }
            r8.append(r4)     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x0112 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)     // Catch:{ all -> 0x0112 }
            r4 = 0
        L_0x012e:
            r0.endTransaction(r6)
            goto L_0x0137
        L_0x0132:
            r0.endTransaction(r6)
            throw r11
        L_0x0136:
            r4 = 0
        L_0x0137:
            if (r4 != 0) goto L_0x013a
            return r1
        L_0x013a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "INSERT INTO "
            r4.<init>(r6)
            r4.append(r12)
            r4.append(r11)
            r11 = 0
        L_0x0148:
            int r6 = r13.size()
            if (r11 >= r6) goto L_0x015d
            java.lang.Object r6 = r13.get(r11)
            java.lang.String r6 = (java.lang.String) r6
            r4.append(r6)
            r4.append(r5)
            int r11 = r11 + 1
            goto L_0x0148
        L_0x015d:
            java.lang.String r11 = r4.toString()
            boolean r11 = r11.endsWith(r5)
            if (r11 == 0) goto L_0x016f
            int r11 = r4.length()
            int r11 = r11 - r3
            r4.deleteCharAt(r11)
        L_0x016f:
            java.lang.String r11 = " ) VALUES "
            r4.append(r11)
            java.util.Iterator r11 = r14.iterator()
        L_0x0178:
            boolean r14 = r11.hasNext()
            java.lang.String r6 = "[EdgeComputingDBService] saveDatasToDB throw Exception : "
            if (r14 == 0) goto L_0x01db
            java.lang.Object r14 = r11.next()
            java.util.List r14 = (java.util.List) r14
            java.lang.String r7 = "("
            r4.append(r7)
            r7 = 0
        L_0x018c:
            int r8 = r13.size()
            if (r7 >= r8) goto L_0x01c3
            java.lang.Object r8 = r14.get(r7)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0199 }
            goto L_0x01b2
        L_0x0199:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
            java.lang.String r8 = "''"
        L_0x01b2:
            java.lang.String r9 = "'"
            r4.append(r9)
            r4.append(r8)
            r4.append(r9)
            r4.append(r5)
            int r7 = r7 + 1
            goto L_0x018c
        L_0x01c3:
            java.lang.String r14 = r4.toString()
            boolean r14 = r14.endsWith(r5)
            if (r14 == 0) goto L_0x01d5
            int r14 = r4.length()
            int r14 = r14 - r3
            r4.deleteCharAt(r14)
        L_0x01d5:
            java.lang.String r14 = "),"
            r4.append(r14)
            goto L_0x0178
        L_0x01db:
            java.lang.String r11 = r4.toString()
            boolean r11 = r11.endsWith(r5)
            if (r11 == 0) goto L_0x01ed
            int r11 = r4.length()
            int r11 = r11 - r3
            r4.deleteCharAt(r11)
        L_0x01ed:
            java.lang.String r11 = ";"
            r4.append(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "[EdgeComputingDBService] saveDatasToDB tableName : "
            r11.append(r13)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            j81.C87906e.m109407a(r2, r11)
            long r13 = r0.mo125613a()
            java.lang.String r11 = r4.toString()     // Catch:{ Exception -> 0x0218 }
            boolean r1 = r0.execSQL(r12, r11)     // Catch:{ Exception -> 0x0218 }
        L_0x0212:
            r0.endTransaction(r13)
            goto L_0x0230
        L_0x0216:
            r11 = move-exception
            goto L_0x0231
        L_0x0218:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0216 }
            r12.<init>()     // Catch:{ all -> 0x0216 }
            r12.append(r6)     // Catch:{ all -> 0x0216 }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0216 }
            r12.append(r11)     // Catch:{ all -> 0x0216 }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0216 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r11)     // Catch:{ all -> 0x0216 }
            goto L_0x0212
        L_0x0230:
            return r1
        L_0x0231:
            r0.endTransaction(r13)
            throw r11
        L_0x0235:
            if (r11 == 0) goto L_0x0240
            boolean r13 = r11.isClosed()
            if (r13 != 0) goto L_0x0240
            r11.close()
        L_0x0240:
            throw r12
        L_0x0241:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s81.C90153a.mo124410d(java.lang.String, java.lang.String, java.util.List, java.util.List):boolean");
    }
}
