package c91;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import java.util.List;
import u24.C90599h;
import v81.C118666a;

/* renamed from: c91.a */
public class C113255a {

    /* renamed from: a */
    public ISQLiteDatabase f338865a;

    /* renamed from: b */
    public String f338866b;

    /* renamed from: c */
    public List<C118666a> f338867c;

    public C113255a(ISQLiteDatabase iSQLiteDatabase, String str, List<C118666a> list) {
        this.f338865a = iSQLiteDatabase;
        this.f338866b = str;
        this.f338867c = list;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo165799a() {
        /*
            r8 = this;
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r8.f338865a
            r1 = 0
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = r8.f338866b
            boolean r0 = u24.C90599h.m113511d(r0)
            if (r0 == 0) goto L_0x000e
            goto L_0x007c
        L_0x000e:
            java.lang.String r0 = r8.f338866b
            java.lang.String r0 = r8.mo165801c(r0)
            boolean r2 = u24.C90599h.m113511d(r0)
            if (r2 == 0) goto L_0x001b
            return r1
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "DROP TABLE IF EXISTS "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r0
            java.lang.String r5 = "EdgeComputingDataDao"
            java.lang.String r6 = "[EdgeComputingDataDao] dropTable tableName : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r0
            r4[r3] = r2
            java.lang.String r3 = "[EdgeComputingDataDao] dropTable tableName : %s, dropSql : %s"
            j81.C87906e.m109408b(r5, r3, r4)
            r3 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r8.f338865a
            boolean r6 = r4 instanceof zh3.C91753f
            if (r6 == 0) goto L_0x004e
            r3 = r4
            zh3.f r3 = (zh3.C91753f) r3
        L_0x004e:
            if (r3 == 0) goto L_0x007c
            long r6 = r3.mo125613a()
            boolean r1 = r3.execSQL(r0, r2)     // Catch:{ Exception -> 0x005e }
        L_0x0058:
            r3.endTransaction(r6)
            goto L_0x007c
        L_0x005c:
            r0 = move-exception
            goto L_0x0078
        L_0x005e:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r2.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r4 = "[EdgeComputingDataDao] dropTable throw Exception : "
            r2.append(r4)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x005c }
            r2.append(r0)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005c }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ all -> 0x005c }
            goto L_0x0058
        L_0x0078:
            r3.endTransaction(r6)
            throw r0
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c91.C113255a.mo165799a():boolean");
    }

    /* renamed from: b */
    public final String mo165800b(String str) {
        if (C90599h.m113511d(str)) {
            return null;
        }
        return str + "_ ";
    }

    /* renamed from: c */
    public final String mo165801c(String str) {
        if (C90599h.m113511d(str)) {
            return null;
        }
        return "ec_data_table_" + str;
    }
}
