package c91;

import sf0.C90189z;

/* renamed from: c91.b */
public class C113256b {

    /* renamed from: a */
    public C90189z.C90190a f338868a;

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0336, code lost:
        if (r1.isClosed() == false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0339, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x033d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x033e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r6.isClosed() == false) goto L_0x0085;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x033d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:155:0x02f9] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x040c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo165802a(java.util.List<java.util.List<u81.C118605b>> r20, v81.C118667b r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            sf0.z$a r2 = r1.f338868a
            r3 = 0
            if (r2 == 0) goto L_0x057f
            if (r20 == 0) goto L_0x057f
            int r2 = r20.size()
            if (r2 <= 0) goto L_0x057f
            if (r0 != 0) goto L_0x0015
            goto L_0x057f
        L_0x0015:
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r0.f355080a
            r4[r3] = r5
            java.lang.String r5 = "EdgeComputingDataStorage"
            java.lang.String r6 = "[EdgeComputingDataStorage] saveResult, configID : %s"
            j81.C87906e.m109408b(r5, r6, r4)
            c91.a r4 = new c91.a
            sf0.z$a r6 = r1.f338868a
            java.lang.String r7 = r0.f355080a
            java.util.List<v81.a> r0 = r0.f355084e
            r4.<init>(r6, r7, r0)
            java.lang.String r8 = "EdgeComputingDataDao"
            if (r6 == 0) goto L_0x0097
            boolean r0 = u24.C90599h.m113511d(r7)
            if (r0 == 0) goto L_0x0039
            goto L_0x0097
        L_0x0039:
            java.lang.String r0 = r4.f338866b
            java.lang.String r0 = r4.mo165801c(r0)
            boolean r6 = u24.C90599h.m113511d(r0)
            if (r6 == 0) goto L_0x0046
            goto L_0x0097
        L_0x0046:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r4.f338865a     // Catch:{ Exception -> 0x0062, all -> 0x005f }
            java.lang.String r7 = "SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;"
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0062, all -> 0x005f }
            r10[r3] = r0     // Catch:{ Exception -> 0x0062, all -> 0x005f }
            android.database.Cursor r6 = r6.rawQuery(r7, r10)     // Catch:{ Exception -> 0x0062, all -> 0x005f }
            boolean r0 = r6.moveToNext()     // Catch:{ Exception -> 0x005d }
            boolean r7 = r6.isClosed()
            if (r7 != 0) goto L_0x0098
            goto L_0x0085
        L_0x005d:
            r0 = move-exception
            goto L_0x0064
        L_0x005f:
            r0 = move-exception
            r9 = 0
            goto L_0x008b
        L_0x0062:
            r0 = move-exception
            r6 = 0
        L_0x0064:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r7.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r10 = "[EdgeComputingDataDao] checkTableExist throw Exception : "
            r7.append(r10)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0089 }
            r7.append(r0)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0089 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x0089 }
            if (r6 == 0) goto L_0x0097
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto L_0x0097
            r0 = 0
        L_0x0085:
            r6.close()
            goto L_0x0098
        L_0x0089:
            r0 = move-exception
            r9 = r6
        L_0x008b:
            if (r9 == 0) goto L_0x0096
            boolean r2 = r9.isClosed()
            if (r2 != 0) goto L_0x0096
            r9.close()
        L_0x0096:
            throw r0
        L_0x0097:
            r0 = 0
        L_0x0098:
            java.lang.String r6 = ","
            java.lang.String r7 = ";"
            java.lang.String r10 = " "
            java.lang.String r11 = " ( "
            java.lang.String r12 = "TEXT "
            java.lang.String r13 = "INTEGER "
            if (r0 != 0) goto L_0x026e
            java.lang.String r0 = "[EdgeComputingDataStorage] saveResult create table for isnot exist!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f338865a
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = r4.f338866b
            boolean r0 = u24.C90599h.m113511d(r0)
            if (r0 != 0) goto L_0x019f
            java.util.List<v81.a> r0 = r4.f338867c
            if (r0 == 0) goto L_0x019f
            int r0 = r0.size()
            if (r0 > 0) goto L_0x00c3
            goto L_0x019f
        L_0x00c3:
            java.lang.String r0 = r4.f338866b
            java.lang.String r0 = r4.mo165801c(r0)
            boolean r15 = u24.C90599h.m113511d(r0)
            if (r15 == 0) goto L_0x00d1
            goto L_0x019f
        L_0x00d1:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "CREATE TABLE IF NOT EXISTS "
            r9.append(r3)
            r9.append(r0)
            r9.append(r11)
            java.lang.String r3 = r9.toString()
            r15.append(r3)
            java.util.List<v81.a> r3 = r4.f338867c
            java.util.Iterator r3 = r3.iterator()
        L_0x00f3:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x012e
            java.lang.Object r9 = r3.next()
            v81.a r9 = (v81.C118666a) r9
            int r14 = r9.f355078b
            if (r14 != 0) goto L_0x0105
            r2 = r12
            goto L_0x010e
        L_0x0105:
            if (r14 != r2) goto L_0x0109
        L_0x0107:
            r2 = r13
            goto L_0x010e
        L_0x0109:
            r2 = 2
            if (r14 != r2) goto L_0x010d
            goto L_0x0107
        L_0x010d:
            r2 = 0
        L_0x010e:
            java.lang.String r9 = r9.f355079c
            java.lang.String r9 = r4.mo165800b(r9)
            boolean r14 = u24.C90599h.m113511d(r2)
            if (r14 != 0) goto L_0x012c
            boolean r14 = u24.C90599h.m113511d(r9)
            if (r14 != 0) goto L_0x012c
            r15.append(r9)
            r15.append(r10)
            r15.append(r2)
            r15.append(r6)
        L_0x012c:
            r2 = 1
            goto L_0x00f3
        L_0x012e:
            java.lang.String r2 = r15.toString()
            boolean r2 = r2.endsWith(r6)
            if (r2 == 0) goto L_0x0142
            int r2 = r15.length()
            r3 = 1
            int r2 = r2 - r3
            r15.deleteCharAt(r2)
            goto L_0x0143
        L_0x0142:
            r3 = 1
        L_0x0143:
            java.lang.String r2 = ");"
            r15.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r9 = 0
            r2[r9] = r0
            java.lang.String r10 = "[EdgeComputingDataDao] createTable tableName : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r2)
            r2 = 2
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r9] = r0
            java.lang.String r2 = r15.toString()
            r10[r3] = r2
            java.lang.String r2 = "[EdgeComputingDataDao] createTable tableName : %s, createTableSQL : %s"
            j81.C87906e.m109408b(r8, r2, r10)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r4.f338865a
            boolean r3 = r2 instanceof zh3.C91753f
            if (r3 == 0) goto L_0x016b
            zh3.f r2 = (zh3.C91753f) r2
            goto L_0x016c
        L_0x016b:
            r2 = 0
        L_0x016c:
            if (r2 == 0) goto L_0x019f
            long r9 = r2.mo125613a()
            java.lang.String r3 = r15.toString()     // Catch:{ Exception -> 0x017d }
            boolean r0 = r2.execSQL(r0, r3)     // Catch:{ Exception -> 0x017d }
            goto L_0x0197
        L_0x017b:
            r0 = move-exception
            goto L_0x019b
        L_0x017d:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r3.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r12 = "[EdgeComputingDataDao] createTable throw Exception : "
            r3.append(r12)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x017b }
            r3.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x017b }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x017b }
            r0 = 0
        L_0x0197:
            r2.endTransaction(r9)
            goto L_0x01a0
        L_0x019b:
            r2.endTransaction(r9)
            throw r0
        L_0x019f:
            r0 = 0
        L_0x01a0:
            if (r0 != 0) goto L_0x01a9
            java.lang.String r0 = "[EdgeComputingDataStorage] saveResult createTable fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r2 = 0
            return r2
        L_0x01a9:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f338865a
            if (r0 == 0) goto L_0x0264
            java.lang.String r0 = r4.f338866b
            boolean r0 = u24.C90599h.m113511d(r0)
            if (r0 == 0) goto L_0x01b7
            goto L_0x0264
        L_0x01b7:
            java.lang.String r0 = r4.f338866b
            java.lang.String r0 = r4.mo165801c(r0)
            boolean r2 = u24.C90599h.m113511d(r0)
            if (r2 == 0) goto L_0x01c5
            goto L_0x0264
        L_0x01c5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CREATE INDEX "
            r2.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "report_time_ec_index_"
            r3.append(r9)
            java.lang.String r9 = r4.f338866b
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = " ON "
            r3.append(r9)
            r3.append(r0)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = "report_time_ec"
            java.lang.String r3 = r4.mo165800b(r3)
            r2.append(r3)
            java.lang.String r3 = " );"
            r2.append(r3)
            r3 = 1
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r10 = 0
            r9[r10] = r0
            java.lang.String r12 = "[EdgeComputingDataDao] createIndex tableName : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r9)
            r9 = 2
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r10] = r0
            java.lang.String r9 = r2.toString()
            r12[r3] = r9
            java.lang.String r3 = "[EdgeComputingDataDao] createIndex tableName : %s, createIndexSQL : %s"
            j81.C87906e.m109408b(r8, r3, r12)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r4.f338865a
            boolean r9 = r3 instanceof zh3.C91753f
            if (r9 == 0) goto L_0x0230
            zh3.f r3 = (zh3.C91753f) r3
            goto L_0x0231
        L_0x0230:
            r3 = 0
        L_0x0231:
            if (r3 == 0) goto L_0x0264
            long r9 = r3.mo125613a()
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0242 }
            boolean r0 = r3.execSQL(r0, r2)     // Catch:{ Exception -> 0x0242 }
            goto L_0x025c
        L_0x0240:
            r0 = move-exception
            goto L_0x0260
        L_0x0242:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0240 }
            r2.<init>()     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "[EdgeComputingDataDao] createIndex throw Exception : "
            r2.append(r12)     // Catch:{ all -> 0x0240 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0240 }
            r2.append(r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0240 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x0240 }
            r0 = 0
        L_0x025c:
            r3.endTransaction(r9)
            goto L_0x0265
        L_0x0260:
            r3.endTransaction(r9)
            throw r0
        L_0x0264:
            r0 = 0
        L_0x0265:
            if (r0 != 0) goto L_0x0416
            java.lang.String r0 = "[EdgeComputingDataStorage] saveResult createIndex fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0416
        L_0x026e:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f338865a
            if (r0 == 0) goto L_0x0416
            java.lang.String r0 = r4.f338866b
            boolean r0 = u24.C90599h.m113511d(r0)
            if (r0 != 0) goto L_0x0416
            java.util.List<v81.a> r0 = r4.f338867c
            if (r0 == 0) goto L_0x0416
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0286
            goto L_0x0416
        L_0x0286:
            java.lang.String r0 = r4.f338866b
            java.lang.String r2 = r4.mo165801c(r0)
            boolean r0 = u24.C90599h.m113511d(r2)
            if (r0 == 0) goto L_0x0294
            goto L_0x0416
        L_0x0294:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f338865a
            boolean r3 = r0 instanceof zh3.C91753f
            if (r3 == 0) goto L_0x029e
            zh3.f r0 = (zh3.C91753f) r0
            r3 = r0
            goto L_0x029f
        L_0x029e:
            r3 = 0
        L_0x029f:
            if (r3 == 0) goto L_0x0416
            java.util.List<v81.a> r0 = r4.f338867c
            java.util.Iterator r5 = r0.iterator()
        L_0x02a7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0416
            java.lang.Object r0 = r5.next()
            v81.a r0 = (v81.C118666a) r0
            int r9 = r0.f355078b
            if (r9 != 0) goto L_0x02b9
            r9 = r12
            goto L_0x02c3
        L_0x02b9:
            r14 = 1
            if (r9 != r14) goto L_0x02be
        L_0x02bc:
            r9 = r13
            goto L_0x02c3
        L_0x02be:
            r14 = 2
            if (r9 != r14) goto L_0x02c2
            goto L_0x02bc
        L_0x02c2:
            r9 = 0
        L_0x02c3:
            java.lang.String r0 = r0.f355079c
            java.lang.String r14 = r4.mo165800b(r0)
            boolean r0 = u24.C90599h.m113511d(r9)
            if (r0 != 0) goto L_0x0406
            boolean r0 = u24.C90599h.m113511d(r14)
            if (r0 != 0) goto L_0x0406
            java.lang.String r0 = "%"
            com.tencent.mm.sdk.storage.ISQLiteDatabase r15 = r4.f338865a
            if (r15 == 0) goto L_0x037b
            java.lang.String r15 = r4.f338866b
            boolean r15 = u24.C90599h.m113511d(r15)
            if (r15 != 0) goto L_0x037b
            boolean r15 = u24.C90599h.m113511d(r14)
            if (r15 == 0) goto L_0x02eb
            goto L_0x037b
        L_0x02eb:
            java.lang.String r15 = r4.f338866b
            java.lang.String r15 = r4.mo165801c(r15)
            boolean r16 = u24.C90599h.m113511d(r15)
            if (r16 == 0) goto L_0x02f9
            goto L_0x037b
        L_0x02f9:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r4.f338865a     // Catch:{ Exception -> 0x0340, all -> 0x033d }
            r16 = r5
            java.lang.String r5 = "select * from sqlite_master where name = ? and sql like ?;"
            r17 = r12
            r18 = r13
            r12 = 2
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ Exception -> 0x0339, all -> 0x033d }
            r12 = 0
            r13[r12] = r15     // Catch:{ Exception -> 0x0339, all -> 0x033d }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0339, all -> 0x033d }
            r12.<init>()     // Catch:{ Exception -> 0x0339, all -> 0x033d }
            r12.append(r0)     // Catch:{ Exception -> 0x0339, all -> 0x033d }
            r12.append(r14)     // Catch:{ Exception -> 0x0339, all -> 0x033d }
            r12.append(r0)     // Catch:{ Exception -> 0x0339, all -> 0x033d }
            java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x0339, all -> 0x033d }
            r12 = 1
            r13[r12] = r0     // Catch:{ Exception -> 0x0339, all -> 0x033d }
            android.database.Cursor r1 = r1.rawQuery(r5, r13)     // Catch:{ Exception -> 0x0339, all -> 0x033d }
            if (r1 == 0) goto L_0x032f
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x032d }
            if (r0 == 0) goto L_0x032f
            r0 = 1
            goto L_0x0330
        L_0x032d:
            r0 = move-exception
            goto L_0x0348
        L_0x032f:
            r0 = 0
        L_0x0330:
            if (r1 == 0) goto L_0x0382
            boolean r5 = r1.isClosed()
            if (r5 != 0) goto L_0x0382
            goto L_0x0369
        L_0x0339:
            r0 = move-exception
            goto L_0x0347
        L_0x033b:
            r0 = move-exception
            goto L_0x0343
        L_0x033d:
            r0 = move-exception
            r9 = 0
            goto L_0x036f
        L_0x0340:
            r0 = move-exception
            r16 = r5
        L_0x0343:
            r17 = r12
            r18 = r13
        L_0x0347:
            r1 = 0
        L_0x0348:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x036d }
            r5.<init>()     // Catch:{ all -> 0x036d }
            java.lang.String r12 = "[EdgeComputingDataDao] checkColumnExist throw Exception : "
            r5.append(r12)     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x036d }
            r5.append(r0)     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x036d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x036d }
            if (r1 == 0) goto L_0x0381
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L_0x0381
            r0 = 0
        L_0x0369:
            r1.close()
            goto L_0x0382
        L_0x036d:
            r0 = move-exception
            r9 = r1
        L_0x036f:
            if (r9 == 0) goto L_0x037a
            boolean r1 = r9.isClosed()
            if (r1 != 0) goto L_0x037a
            r9.close()
        L_0x037a:
            throw r0
        L_0x037b:
            r16 = r5
            r17 = r12
            r18 = r13
        L_0x0381:
            r0 = 0
        L_0x0382:
            if (r0 != 0) goto L_0x040c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ALTER TABLE "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " ADD "
            r0.append(r1)
            r0.append(r14)
            r0.append(r10)
            r0.append(r9)
            r0.append(r7)
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r9 = 0
            r5[r9] = r2
            java.lang.String r12 = "[EdgeComputingDataDao] updateTable tableName : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r5)
            r5 = 2
            java.lang.Object[] r12 = new java.lang.Object[r5]
            r12[r9] = r2
            java.lang.String r5 = r0.toString()
            r12[r1] = r5
            java.lang.String r1 = "[EdgeComputingDataDao] updateTable tableName : %s, updateTableSQL : %s"
            j81.C87906e.m109408b(r8, r1, r12)
            long r12 = r3.mo125613a()
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x03e5 }
            boolean r1 = r3.execSQL(r2, r1)     // Catch:{ Exception -> 0x03e5 }
            java.lang.String r5 = "[EdgeComputingDataDao] updateTable tableName : %s, result : %d, updateTableSQL : %s"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03e5 }
            r14 = 0
            r9[r14] = r2     // Catch:{ Exception -> 0x03e5 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x03e5 }
            r14 = 1
            r9[r14] = r1     // Catch:{ Exception -> 0x03e5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03e5 }
            r1 = 2
            r9[r1] = r0     // Catch:{ Exception -> 0x03e5 }
            j81.C87906e.m109408b(r8, r5, r9)     // Catch:{ Exception -> 0x03e5 }
            goto L_0x03fe
        L_0x03e3:
            r0 = move-exception
            goto L_0x0402
        L_0x03e5:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e3 }
            r1.<init>()     // Catch:{ all -> 0x03e3 }
            java.lang.String r5 = "[EdgeComputingDataDao] updateTable throw Exception : "
            r1.append(r5)     // Catch:{ all -> 0x03e3 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x03e3 }
            r1.append(r0)     // Catch:{ all -> 0x03e3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03e3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x03e3 }
        L_0x03fe:
            r3.endTransaction(r12)
            goto L_0x040c
        L_0x0402:
            r3.endTransaction(r12)
            throw r0
        L_0x0406:
            r16 = r5
            r17 = r12
            r18 = r13
        L_0x040c:
            r1 = r19
            r5 = r16
            r12 = r17
            r13 = r18
            goto L_0x02a7
        L_0x0416:
            java.lang.String r1 = "'"
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f338865a
            if (r0 == 0) goto L_0x057d
            java.lang.String r0 = r4.f338866b
            boolean r0 = u24.C90599h.m113511d(r0)
            if (r0 != 0) goto L_0x057d
            int r0 = r20.size()
            if (r0 > 0) goto L_0x042c
            goto L_0x057d
        L_0x042c:
            java.lang.String r0 = r4.f338866b
            java.lang.String r2 = r4.mo165801c(r0)
            boolean r0 = u24.C90599h.m113511d(r2)
            if (r0 == 0) goto L_0x043a
            goto L_0x057d
        L_0x043a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "INSERT INTO "
            r3.<init>(r0)
            r3.append(r2)
            r3.append(r11)
            r9 = 0
        L_0x0448:
            java.util.List<v81.a> r0 = r4.f338867c
            int r0 = r0.size()
            if (r9 >= r0) goto L_0x0467
            java.util.List<v81.a> r0 = r4.f338867c
            java.lang.Object r0 = r0.get(r9)
            v81.a r0 = (v81.C118666a) r0
            java.lang.String r0 = r0.f355079c
            java.lang.String r0 = r4.mo165800b(r0)
            r3.append(r0)
            r3.append(r6)
            int r9 = r9 + 1
            goto L_0x0448
        L_0x0467:
            java.lang.String r0 = r3.toString()
            boolean r0 = r0.endsWith(r6)
            if (r0 == 0) goto L_0x047a
            int r0 = r3.length()
            r5 = 1
            int r0 = r0 - r5
            r3.deleteCharAt(r0)
        L_0x047a:
            java.lang.String r0 = " ) VALUES "
            r3.append(r0)
            java.util.Iterator r5 = r20.iterator()
        L_0x0483:
            boolean r0 = r5.hasNext()
            java.lang.String r9 = "[EdgeComputingDataDao] insertPatch throw Exception : "
            if (r0 == 0) goto L_0x0514
            java.lang.Object r0 = r5.next()
            java.util.List r0 = (java.util.List) r0
            java.lang.String r10 = "("
            r3.append(r10)
            java.util.Iterator r10 = r0.iterator()
        L_0x049a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x04f7
            java.lang.Object r0 = r10.next()
            u81.b r0 = (u81.C118605b) r0
            int r11 = r0.f354924b     // Catch:{ Exception -> 0x04d6 }
            if (r11 != 0) goto L_0x04bf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d6 }
            r11.<init>()     // Catch:{ Exception -> 0x04d6 }
            r11.append(r1)     // Catch:{ Exception -> 0x04d6 }
            java.lang.String r0 = r0.f354928f     // Catch:{ Exception -> 0x04d6 }
            r11.append(r0)     // Catch:{ Exception -> 0x04d6 }
            r11.append(r1)     // Catch:{ Exception -> 0x04d6 }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x04d6 }
            goto L_0x04c8
        L_0x04bf:
            r12 = 1
            if (r11 != r12) goto L_0x04ca
            int r0 = r0.f354926d     // Catch:{ Exception -> 0x04d6 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04d6 }
        L_0x04c8:
            r12 = 2
            goto L_0x04f0
        L_0x04ca:
            r12 = 2
            if (r11 != r12) goto L_0x04ee
            long r13 = r0.f354927e     // Catch:{ Exception -> 0x04d4 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x04d4 }
            goto L_0x04f0
        L_0x04d4:
            r0 = move-exception
            goto L_0x04d8
        L_0x04d6:
            r0 = move-exception
            r12 = 2
        L_0x04d8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            java.lang.String r0 = r0.getMessage()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x04ee:
            java.lang.String r0 = "''"
        L_0x04f0:
            r3.append(r0)
            r3.append(r6)
            goto L_0x049a
        L_0x04f7:
            r12 = 2
            java.lang.String r0 = r3.toString()
            boolean r0 = r0.endsWith(r6)
            if (r0 == 0) goto L_0x050c
            int r0 = r3.length()
            r10 = 1
            int r0 = r0 - r10
            r3.deleteCharAt(r0)
            goto L_0x050d
        L_0x050c:
            r10 = 1
        L_0x050d:
            java.lang.String r0 = "),"
            r3.append(r0)
            goto L_0x0483
        L_0x0514:
            r10 = 1
            java.lang.String r0 = r3.toString()
            boolean r0 = r0.endsWith(r6)
            if (r0 == 0) goto L_0x0527
            int r0 = r3.length()
            int r0 = r0 - r10
            r3.deleteCharAt(r0)
        L_0x0527:
            r3.append(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[EdgeComputingDataDao] insertPatch tableName : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            j81.C87906e.m109407a(r8, r0)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f338865a
            boolean r1 = r0 instanceof zh3.C91753f
            if (r1 == 0) goto L_0x0548
            zh3.f r0 = (zh3.C91753f) r0
            r1 = r0
            goto L_0x0549
        L_0x0548:
            r1 = 0
        L_0x0549:
            if (r1 == 0) goto L_0x057d
            long r5 = r1.mo125613a()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f338865a     // Catch:{ Exception -> 0x055d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x055d }
            boolean r0 = r0.execSQL(r2, r3)     // Catch:{ Exception -> 0x055d }
            r3 = r0
            goto L_0x0575
        L_0x055b:
            r0 = move-exception
            goto L_0x0579
        L_0x055d:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x055b }
            r2.<init>()     // Catch:{ all -> 0x055b }
            r2.append(r9)     // Catch:{ all -> 0x055b }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x055b }
            r2.append(r0)     // Catch:{ all -> 0x055b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x055b }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x055b }
            r3 = 0
        L_0x0575:
            r1.endTransaction(r5)
            goto L_0x057e
        L_0x0579:
            r1.endTransaction(r5)
            throw r0
        L_0x057d:
            r3 = 0
        L_0x057e:
            return r3
        L_0x057f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c91.C113256b.mo165802a(java.util.List, v81.b):boolean");
    }
}
