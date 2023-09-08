package m81;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C86709a0;
import java.util.HashMap;
import sf0.C90189z;
import u81.C118604a;
import zh3.C91753f;

/* renamed from: m81.b */
public class C117538b implements C117542c {

    /* renamed from: d */
    public static final String[] f351650d = {MAutoStorage.getCreateSQLs(C118604a.f354919u, "EdgeComputingCacheDataModel_Instance")};

    /* renamed from: e */
    public static final String[] f351651e = {MAutoStorage.getCreateSQLs(C118604a.f354919u, "EdgeComputingCacheDataModel_Normal")};

    /* renamed from: f */
    public static HashMap<Integer, C91753f.C66827b> f351652f;

    /* renamed from: a */
    public int f351653a;

    /* renamed from: b */
    public C90189z.C90190a f351654b;

    /* renamed from: c */
    public C117541c f351655c;

    /* renamed from: m81.b$a */
    public class C117539a implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C117538b.f351651e;
        }
    }

    /* renamed from: m81.b$b */
    public class C117540b implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C117538b.f351650d;
        }
    }

    /* renamed from: m81.b$c */
    public class C117541c extends MAutoStorage<C118604a> {

        /* renamed from: d */
        public ISQLiteDatabase f351656d;

        /* renamed from: e */
        public String f351657e;

        public C117541c(C117538b bVar, ISQLiteDatabase iSQLiteDatabase, String str, String[] strArr) {
            super(iSQLiteDatabase, C118604a.f354919u, str, strArr);
            this.f351656d = iSQLiteDatabase;
            this.f351657e = str;
        }
    }

    static {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        f351652f = hashMap;
        hashMap.put(-91701509, new C117539a());
        f351652f.put(-756345559, new C117540b());
    }

    public C117538b(int i) {
        this.f351653a = i;
    }

    /* renamed from: a */
    public void mo86406a() {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86407b(u81.C118604a r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x006c
            m81.b$c r0 = r7.f351655c
            if (r0 != 0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            java.lang.String r1 = "EdgeComputingCacheWCDBDao"
            r2 = -1
            r4 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r0.f351656d
            boolean r6 = r5 instanceof zh3.C91753f
            if (r6 == 0) goto L_0x0019
            r4 = r5
            zh3.f r4 = (zh3.C91753f) r4
            long r2 = r4.mo125613a()
        L_0x0019:
            java.lang.String r5 = r8.f354920r     // Catch:{ Exception -> 0x0047 }
            r8.field_configID = r5     // Catch:{ Exception -> 0x0047 }
            long r5 = r8.f354921s     // Catch:{ Exception -> 0x0047 }
            r8.field_reportTimeEC = r5     // Catch:{ Exception -> 0x0047 }
            java.lang.String r5 = r8.f354922t     // Catch:{ Exception -> 0x0047 }
            r8.field_data = r5     // Catch:{ Exception -> 0x0047 }
            r5 = 0
            boolean r0 = r0.insertNotify(r8, r5)     // Catch:{ Exception -> 0x0047 }
            if (r0 != 0) goto L_0x0042
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0047 }
            r0.<init>()     // Catch:{ Exception -> 0x0047 }
            java.lang.String r5 = "[EdgeComputingCacheWCDBDao] saveCache fail, configID : "
            r0.append(r5)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r8 = r8.f354920r     // Catch:{ Exception -> 0x0047 }
            r0.append(r8)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r8 = r0.toString()     // Catch:{ Exception -> 0x0047 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)     // Catch:{ Exception -> 0x0047 }
        L_0x0042:
            if (r4 == 0) goto L_0x0065
            goto L_0x0062
        L_0x0045:
            r8 = move-exception
            goto L_0x0066
        L_0x0047:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r0.<init>()     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = "[EdgeComputingCacheWCDBDao] saveCache throw Exception : "
            r0.append(r5)     // Catch:{ all -> 0x0045 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0045 }
            r0.append(r8)     // Catch:{ all -> 0x0045 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0045 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0065
        L_0x0062:
            r4.endTransaction(r2)
        L_0x0065:
            return
        L_0x0066:
            if (r4 == 0) goto L_0x006b
            r4.endTransaction(r2)
        L_0x006b:
            throw r8
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m81.C117538b.mo86407b(u81.a):void");
    }

    /* renamed from: c */
    public void mo86408c(long j) {
        long j2;
        C91753f fVar;
        C117541c cVar = this.f351655c;
        if (cVar != null) {
            ISQLiteDatabase iSQLiteDatabase = cVar.f351656d;
            if (iSQLiteDatabase instanceof C91753f) {
                fVar = (C91753f) iSQLiteDatabase;
                j2 = fVar.mo125613a();
            } else {
                j2 = -1;
                fVar = null;
            }
            try {
                int delete = cVar.f351656d.delete(cVar.f351657e, "reportTimeEC<?", new String[]{String.valueOf(j)});
                Log.m105920e("EdgeComputingCacheWCDBDao", "[EdgeComputingCacheWCDBDao] removeExpireCaches ret : " + delete);
                if (fVar == null) {
                    return;
                }
            } catch (Exception e) {
                Log.m105920e("EdgeComputingCacheWCDBDao", "[EdgeComputingCacheWCDBDao] removeExpireCaches throw Exception : " + e.getMessage());
                if (fVar == null) {
                    return;
                }
            } catch (Throwable th) {
                if (fVar != null) {
                    fVar.endTransaction(j2);
                }
                throw th;
            }
            fVar.endTransaction(j2);
        }
    }

    public void close() {
        this.f351655c = null;
        C90189z.C90190a aVar = this.f351654b;
        if (aVar != null) {
            aVar.mo124435t(hashCode());
        }
        this.f351654b = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r2 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return (long) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r2 != null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long count() {
        /*
            r11 = this;
            m81.b$c r0 = r11.f351655c
            if (r0 != 0) goto L_0x0007
            r0 = 0
            return r0
        L_0x0007:
            r0.getClass()
            r1 = 0
            r2 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f351656d     // Catch:{ Exception -> 0x0025 }
            java.lang.String r4 = r0.f351657e     // Catch:{ Exception -> 0x0025 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0025 }
            if (r2 == 0) goto L_0x0020
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x0025 }
        L_0x0020:
            if (r2 == 0) goto L_0x0045
            goto L_0x0042
        L_0x0023:
            r0 = move-exception
            goto L_0x0047
        L_0x0025:
            r0 = move-exception
            java.lang.String r3 = "EdgeComputingCacheWCDBDao"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            r4.<init>()     // Catch:{ all -> 0x0023 }
            java.lang.String r5 = "[EdgeComputingCacheWCDBDao] cachesSize throw Exception : "
            r4.append(r5)     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0023 }
            r4.append(r0)     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0023 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0045
        L_0x0042:
            r2.close()
        L_0x0045:
            long r0 = (long) r1
            return r0
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()
        L_0x004c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m81.C117538b.count():long");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<u81.a>, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        if (r2 == 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d9, code lost:
        if (r2 == 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00db, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return r4;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b1 A[Catch:{ Exception -> 0x00be, all -> 0x00bc }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<u81.C118604a> mo86413m(java.lang.String r20) {
        /*
            r19 = this;
            r0 = r20
            boolean r1 = u24.C90599h.m113511d(r20)
            r2 = 0
            if (r1 != 0) goto L_0x00e6
            r1 = r19
            m81.b$c r3 = r1.f351655c
            if (r3 != 0) goto L_0x0011
            goto L_0x00e8
        L_0x0011:
            r3.getClass()
            boolean r4 = u24.C90599h.m113511d(r20)
            if (r4 == 0) goto L_0x001c
            goto L_0x00df
        L_0x001c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            j81.a r7 = j81.C117302a.xx0()     // Catch:{ Exception -> 0x00be }
            r81.a r7 = r7.f351178n     // Catch:{ Exception -> 0x00be }
            r8 = 0
            if (r7 == 0) goto L_0x0041
            int r5 = r81.C118226a.f353382d     // Catch:{ Exception -> 0x00be }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00be }
            int r9 = r81.C118226a.f353383e     // Catch:{ Exception -> 0x00be }
            long r9 = (long) r9     // Catch:{ Exception -> 0x00be }
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r9 * r11
            long r6 = r6 - r9
            r17 = r6
            r7 = r5
            r5 = r17
            goto L_0x0042
        L_0x0041:
            r7 = 0
        L_0x0042:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r3.f351656d     // Catch:{ Exception -> 0x00be }
            java.lang.String r10 = r3.f351657e     // Catch:{ Exception -> 0x00be }
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r3 = u81.C118604a.f354919u     // Catch:{ Exception -> 0x00be }
            java.lang.String[] r11 = r3.columns     // Catch:{ Exception -> 0x00be }
            java.lang.String r12 = "configID = ? and reportTimeEC >= ? "
            r3 = 2
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00be }
            r13[r8] = r0     // Catch:{ Exception -> 0x00be }
            r3 = 1
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00be }
            r13[r3] = r5     // Catch:{ Exception -> 0x00be }
            r14 = 0
            r15 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00be }
            r3.<init>()     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = "reportTimeEC"
            r3.append(r5)     // Catch:{ Exception -> 0x00be }
            if (r7 <= 0) goto L_0x0079
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00be }
            r5.<init>()     // Catch:{ Exception -> 0x00be }
            java.lang.String r6 = " limit "
            r5.append(r6)     // Catch:{ Exception -> 0x00be }
            r5.append(r7)     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00be }
            goto L_0x007b
        L_0x0079:
            java.lang.String r5 = ""
        L_0x007b:
            r3.append(r5)     // Catch:{ Exception -> 0x00be }
            java.lang.String r16 = r3.toString()     // Catch:{ Exception -> 0x00be }
            android.database.Cursor r2 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00be }
            if (r2 == 0) goto L_0x00ab
            boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x00be }
            if (r3 == 0) goto L_0x00ab
        L_0x008e:
            u81.a r3 = new u81.a     // Catch:{ Exception -> 0x00be }
            r3.<init>()     // Catch:{ Exception -> 0x00be }
            r3.convertFrom(r2)     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = r3.field_configID     // Catch:{ Exception -> 0x00be }
            r3.f354920r = r5     // Catch:{ Exception -> 0x00be }
            long r5 = r3.field_reportTimeEC     // Catch:{ Exception -> 0x00be }
            r3.f354921s = r5     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = r3.field_data     // Catch:{ Exception -> 0x00be }
            r3.f354922t = r5     // Catch:{ Exception -> 0x00be }
            r4.add(r3)     // Catch:{ Exception -> 0x00be }
            boolean r3 = r2.moveToNext()     // Catch:{ Exception -> 0x00be }
            if (r3 != 0) goto L_0x008e
        L_0x00ab:
            int r3 = r4.size()     // Catch:{ Exception -> 0x00be }
            if (r3 < r7) goto L_0x00b9
            int r3 = r4.size()     // Catch:{ Exception -> 0x00be }
            long r5 = (long) r3     // Catch:{ Exception -> 0x00be }
            w81.C90900a.m114032e(r0, r5)     // Catch:{ Exception -> 0x00be }
        L_0x00b9:
            if (r2 == 0) goto L_0x00de
            goto L_0x00db
        L_0x00bc:
            r0 = move-exception
            goto L_0x00e0
        L_0x00be:
            r0 = move-exception
            java.lang.String r3 = "EdgeComputingCacheWCDBDao"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r5.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r6 = "[EdgeComputingCacheWCDBDao] queryCaches throw Exception : "
            r5.append(r6)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00bc }
            r5.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ all -> 0x00bc }
            if (r2 == 0) goto L_0x00de
        L_0x00db:
            r2.close()
        L_0x00de:
            r2 = r4
        L_0x00df:
            return r2
        L_0x00e0:
            if (r2 == 0) goto L_0x00e5
            r2.close()
        L_0x00e5:
            throw r0
        L_0x00e6:
            r1 = r19
        L_0x00e8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m81.C117538b.mo86413m(java.lang.String):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void remove(java.lang.String r10) {
        /*
            r9 = this;
            boolean r0 = u24.C90599h.m113511d(r10)
            if (r0 != 0) goto L_0x0075
            m81.b$c r0 = r9.f351655c
            if (r0 != 0) goto L_0x000b
            goto L_0x0075
        L_0x000b:
            java.lang.String r1 = "EdgeComputingCacheWCDBDao"
            boolean r2 = u24.C90599h.m113511d(r10)
            if (r2 == 0) goto L_0x0017
            r0.getClass()
            goto L_0x006e
        L_0x0017:
            r2 = -1
            r4 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r0.f351656d
            boolean r6 = r5 instanceof zh3.C91753f
            if (r6 == 0) goto L_0x0027
            r4 = r5
            zh3.f r4 = (zh3.C91753f) r4
            long r2 = r4.mo125613a()
        L_0x0027:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r0.f351656d     // Catch:{ Exception -> 0x0050 }
            java.lang.String r0 = r0.f351657e     // Catch:{ Exception -> 0x0050 }
            java.lang.String r6 = "configID=?"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0050 }
            r8 = 0
            r7[r8] = r10     // Catch:{ Exception -> 0x0050 }
            int r10 = r5.delete(r0, r6, r7)     // Catch:{ Exception -> 0x0050 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0050 }
            r0.<init>()     // Catch:{ Exception -> 0x0050 }
            java.lang.String r5 = "[EdgeComputingCacheWCDBDao] removeCaches ret : "
            r0.append(r5)     // Catch:{ Exception -> 0x0050 }
            r0.append(r10)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x0050 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)     // Catch:{ Exception -> 0x0050 }
            if (r4 == 0) goto L_0x006e
            goto L_0x006b
        L_0x004e:
            r10 = move-exception
            goto L_0x006f
        L_0x0050:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r0.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "[EdgeComputingCacheWCDBDao] removeCaches throw Exception : "
            r0.append(r5)     // Catch:{ all -> 0x004e }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x004e }
            r0.append(r10)     // Catch:{ all -> 0x004e }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x004e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x006e
        L_0x006b:
            r4.endTransaction(r2)
        L_0x006e:
            return
        L_0x006f:
            if (r4 == 0) goto L_0x0074
            r4.endTransaction(r2)
        L_0x0074:
            throw r10
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m81.C117538b.remove(java.lang.String):void");
    }

    public void reset() {
        C90189z.C90190a aVar;
        String str = null;
        this.f351655c = null;
        C90189z.C90190a aVar2 = this.f351654b;
        if (aVar2 != null) {
            aVar2.mo124435t(hashCode());
        }
        this.f351654b = null;
        try {
            int hashCode = hashCode();
            aVar = C90189z.m112866a(hashCode, C86709a0.m107535s().f251807e + "Edge.db", f351652f, true);
        } catch (Exception e) {
            Log.m105920e("EdgeComputingCacheStrategyWCDB", "[EdgeComputingCacheStrategyWCDB] createDataBase throw Exception : " + e.getMessage());
            aVar = null;
        }
        if (aVar == null) {
            Log.m105920e("EdgeComputingCacheStrategyWCDB", "[EdgeComputingCacheStrategyWCDB] reset dataDB is null");
            return;
        }
        this.f351654b = aVar;
        int i = this.f351653a;
        if (i == 2) {
            str = "EdgeComputingCacheDataModel_Instance";
        } else if (i == 1) {
            str = "EdgeComputingCacheDataModel_Normal";
        }
        this.f351655c = new C117541c(this, aVar, str, new String[0]);
    }
}
