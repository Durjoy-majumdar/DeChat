package zh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ConfigFile;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;
import p206nj.C76861g;
import p823sg.C90193h;
import zh3.C91753f;

/* renamed from: zh3.a */
public class C91752a {

    /* renamed from: h */
    public static final Pattern f262802h = Pattern.compile("^[\\s]*CREATE[\\s]+TABLE[\\s]*", 2);

    /* renamed from: a */
    public C119118e f262803a;

    /* renamed from: b */
    public String f262804b;

    /* renamed from: c */
    public String f262805c = "";

    /* renamed from: d */
    public boolean f262806d = false;

    /* renamed from: e */
    public boolean f262807e = false;

    /* renamed from: f */
    public String f262808f = "";

    /* renamed from: g */
    public boolean f262809g = false;

    /* renamed from: a */
    public final void mo125604a(C119118e eVar) {
        SQLiteDatabase sQLiteDatabase = eVar.f356742a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = eVar.f356743b;
        }
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT count(*) FROM sqlite_master;", (Object[]) null, (String) null);
        if (rawQueryWithFactory.moveToFirst()) {
            rawQueryWithFactory.close();
            return;
        }
        throw new SQLiteException("Cannot get count for sqlite_master");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ba  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo125605b(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "old."
            zh3.e r1 = r9.f262803a
            r2 = 0
            java.lang.String r3 = "select DISTINCT  tbl_name from sqlite_master;"
            r4 = 0
            android.database.Cursor r1 = r1.mo183823u(r3, r2, r4, r4)
            java.lang.String r3 = "MicroMsg.DBInit"
            r5 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0012:
            r11 = 0
            goto L_0x019c
        L_0x0015:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            java.lang.String r7 = "ATTACH DATABASE '"
            if (r6 == 0) goto L_0x0037
            zh3.e r11 = r9.f262803a     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            r6.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            r6.append(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            r6.append(r10)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            java.lang.String r7 = "' AS old KEY ''"
            r6.append(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            java.lang.String r6 = r6.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            r11.mo183812e(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            goto L_0x0058
        L_0x0037:
            zh3.e r6 = r9.f262803a     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            r8.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            r8.append(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            r8.append(r10)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            java.lang.String r7 = "' AS old KEY '"
            r8.append(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            r8.append(r11)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            java.lang.String r11 = "'"
            r8.append(r11)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            java.lang.String r11 = r8.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
            r6.mo183812e(r11)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01c5 }
        L_0x0058:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r7 = 0
        L_0x0063:
            int r8 = r1.getCount()
            if (r7 >= r8) goto L_0x0076
            r1.moveToPosition(r7)
            java.lang.String r8 = r1.getString(r4)
            r11.add(r8)
            int r7 = r7 + 1
            goto L_0x0063
        L_0x0076:
            zh3.e r7 = r9.f262803a
            java.lang.String r8 = "select DISTINCT tbl_name from old.sqlite_master;"
            android.database.Cursor r2 = r7.mo183823u(r8, r2, r4, r4)
            if (r2 != 0) goto L_0x0083
            r11 = 0
            goto L_0x00d8
        L_0x0083:
            r7 = 0
        L_0x0084:
            int r8 = r2.getCount()
            if (r7 >= r8) goto L_0x0097
            r2.moveToPosition(r7)
            java.lang.String r8 = r2.getString(r4)
            r6.add(r8)
            int r7 = r7 + 1
            goto L_0x0084
        L_0x0097:
            r2.close()
            zh3.e r2 = r9.f262803a
            r2.mo183809a()
            java.util.Iterator r2 = r6.iterator()
        L_0x00a3:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00d2
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r11.contains(r6)
            if (r7 == 0) goto L_0x00b6
            goto L_0x00a3
        L_0x00b6:
            zh3.e r7 = r9.f262803a
            java.lang.String[] r8 = new java.lang.String[r5]
            r8[r4] = r6
            java.lang.String r6 = "SELECT sql FROM old.sqlite_master WHERE type='table' AND tbl_name=?"
            android.database.Cursor r6 = r7.mo183823u(r6, r8, r4, r4)
            if (r6 != 0) goto L_0x00c5
            goto L_0x00a3
        L_0x00c5:
            java.lang.String r7 = r6.getString(r4)
            zh3.e r8 = r9.f262803a
            r8.mo183812e(r7)
            r6.close()
            goto L_0x00a3
        L_0x00d2:
            zh3.e r11 = r9.f262803a
            r11.mo183811d()
            r11 = 1
        L_0x00d8:
            if (r11 != 0) goto L_0x00dc
            goto L_0x0012
        L_0x00dc:
            zh3.e r11 = r9.f262803a
            r11.mo183809a()
            r11 = 0
        L_0x00e2:
            int r2 = r1.getCount()
            if (r11 >= r2) goto L_0x018c
            r1.moveToPosition(r11)
            zh3.e r2 = r9.f262803a
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r7 = r1.getString(r4)
            r6[r4] = r7
            java.lang.String r7 = "select * from old.sqlite_master where tbl_name = ?"
            android.database.Cursor r2 = r2.mo183823u(r7, r6, r4, r4)
            if (r2 == 0) goto L_0x0106
            int r6 = r2.getCount()
            r2.close()
            goto L_0x0107
        L_0x0106:
            r6 = 0
        L_0x0107:
            if (r6 != 0) goto L_0x0122
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "In old db not found :"
            r2.append(r6)
            java.lang.String r6 = r1.getString(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
            goto L_0x0188
        L_0x0122:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0170 }
            r2.<init>()     // Catch:{ Exception -> 0x0170 }
            r2.append(r0)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r6 = r1.getString(r4)     // Catch:{ Exception -> 0x0170 }
            r2.append(r6)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0170 }
            java.lang.String r6 = r1.getString(r4)     // Catch:{ Exception -> 0x0170 }
            java.util.List r2 = r9.mo125607d(r2, r6)     // Catch:{ Exception -> 0x0170 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ Exception -> 0x0170 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0170 }
        L_0x0143:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x0170 }
            if (r6 == 0) goto L_0x0155
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x0170 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0170 }
            zh3.e r7 = r9.f262803a     // Catch:{ Exception -> 0x0170 }
            r7.mo183812e(r6)     // Catch:{ Exception -> 0x0170 }
            goto L_0x0143
        L_0x0155:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0170 }
            r2.<init>()     // Catch:{ Exception -> 0x0170 }
            r2.append(r0)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r6 = r1.getString(r4)     // Catch:{ Exception -> 0x0170 }
            r2.append(r6)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0170 }
            java.lang.String r6 = r1.getString(r4)     // Catch:{ Exception -> 0x0170 }
            r9.mo125610g(r2, r6)     // Catch:{ Exception -> 0x0170 }
            goto L_0x0188
        L_0x0170:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Insertselect FAILED :"
            r2.append(r6)
            java.lang.String r6 = r1.getString(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
        L_0x0188:
            int r11 = r11 + 1
            goto L_0x00e2
        L_0x018c:
            zh3.e r11 = r9.f262803a
            r11.mo183811d()
            r1.close()
            zh3.e r11 = r9.f262803a
            java.lang.String r0 = "DETACH DATABASE old;"
            r11.mo183812e(r0)
            r11 = 1
        L_0x019c:
            if (r11 == 0) goto L_0x01ba
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r4] = r10
            java.lang.String r0 = "system transfer success ,delete it path %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r11)
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106447h(r10)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11[r4] = r10
            java.lang.String r10 = "delete result :%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r11)
            return r5
        L_0x01ba:
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r4] = r10
            java.lang.String r10 = "system transfer fail path %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r11)
            return r4
        L_0x01c5:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attached database is corrupted: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zh3.C91752a.mo125605b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: c */
    public final boolean mo125606c(HashMap<Integer, C91753f.C66827b> hashMap, boolean z, boolean z2) {
        String str;
        int i;
        if (this.f262803a == null) {
            return false;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(z);
        objArr[1] = Integer.valueOf(hashMap == null ? -1 : hashMap.size());
        Log.m105919d("MicroMsg.DBInit", "createtables checkCreateIni:%b  tables:%d", objArr);
        if (z) {
            this.f262805c = this.f262803a.mo183817j() + ".ini";
            StringBuilder sb = new StringBuilder();
            if (hashMap != null) {
                for (C91753f.C66827b next : hashMap.values()) {
                    if (next.mo6410a() == null) {
                        Log.m105921e("MicroMsg.DBInit", "factory.getSQLs() is null: %s", next.getClass().toString());
                        Assert.assertTrue("factory.getSQLs() is null:" + next.getClass().toString(), false);
                    }
                    for (String hashCode : next.mo6410a()) {
                        sb.append(hashCode.hashCode());
                    }
                }
            }
            str = C90193h.m112878f(sb.toString().getBytes());
            if (!z2) {
                String value = ConfigFile.getValue(this.f262805c, "createmd5");
                if (!Util.isNullOrNil(value) && str.equals(value)) {
                    Log.m105925i("MicroMsg.DBInit", "Create table factories not changed , no need create !  %s", this.f262803a.mo183817j());
                    return true;
                }
            }
        } else {
            str = "";
        }
        String str2 = str;
        this.f262803a.mo183812e("pragma auto_vacuum = 0 ");
        C76861g.C47263a aVar = new C76861g.C47263a();
        this.f262803a.mo183809a();
        if (hashMap != null) {
            i = 0;
            for (C91753f.C66827b a : hashMap.values()) {
                int i2 = i;
                for (String str3 : a.mo6410a()) {
                    try {
                        this.f262803a.mo183812e(str3);
                        i2++;
                    } catch (Exception e) {
                        Matcher matcher = f262802h.matcher(str3);
                        if (matcher == null || !matcher.matches()) {
                            Log.m105928w("MicroMsg.DBInit", "CreateTable failed:[" + str3 + "][" + e.getMessage() + "]");
                        } else {
                            Assert.assertTrue("CreateTable failed:[" + str3 + "][" + e.getMessage() + "]", false);
                        }
                    }
                }
                i = i2;
            }
        } else {
            i = 0;
        }
        long a2 = aVar.mo72288a();
        this.f262803a.mo183811d();
        Log.m105925i("MicroMsg.DBInit", "createtables end sql:%d trans:%d sqlCount:%d", Long.valueOf(a2), Long.valueOf(aVar.mo72288a()), Integer.valueOf(i));
        if (z) {
            ConfigFile.saveValue(this.f262805c, "createmd5", str2);
        }
        return true;
    }

    /* renamed from: d */
    public final List<String> mo125607d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        C119118e eVar = this.f262803a;
        if (eVar == null) {
            return arrayList;
        }
        android.database.Cursor u = eVar.mo183823u(String.format("PRAGMA table_info( %s )", new Object[]{str}), (String[]) null, 0, false);
        if (u == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        int columnIndex = u.getColumnIndex("name");
        int columnIndex2 = u.getColumnIndex("type");
        while (u.moveToNext()) {
            hashMap.put(u.getString(columnIndex), u.getString(columnIndex2));
        }
        u.close();
        android.database.Cursor u2 = this.f262803a.mo183823u(String.format("PRAGMA table_info( %s )", new Object[]{str2}), (String[]) null, 0, false);
        if (u2 == null) {
            return arrayList;
        }
        HashMap hashMap2 = new HashMap();
        int columnIndex3 = u2.getColumnIndex("name");
        int columnIndex4 = u2.getColumnIndex("type");
        while (u2.moveToNext()) {
            hashMap.put(u2.getString(columnIndex3), u2.getString(columnIndex4));
        }
        u2.close();
        Iterator it = new HashSet(hashMap.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str4 != null && str4.length() > 0) {
                String str5 = (String) hashMap2.get(str3);
                if (str5 == null) {
                    arrayList.add("ALTER TABLE " + str2 + " ADD COLUMN " + str3 + " " + str4 + ";");
                    hashMap.remove(str3);
                } else if (!str4.toLowerCase().startsWith(str5.toLowerCase())) {
                    Log.m105920e("MicroMsg.DBInit", "conflicting alter table on column: " + str3 + ", " + str5 + "<o-n>" + str4);
                    hashMap.remove(str3);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public String mo125608e() {
        if (Util.isNullOrNil("") || Util.isNullOrNil(this.f262808f) || !Util.isNullOrNil(ConfigFile.getValue(this.f262808f, "Reported"))) {
            return "";
        }
        ConfigFile.saveValue(this.f262808f, "Reported", "true");
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a8, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ac, code lost:
        r17 = r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0138 A[EDGE_INSN: B:110:0x0138->B:45:0x0138 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:11:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0275 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0277  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo125609f(java.lang.String r35, java.lang.String r36, java.lang.String r37, long r38, java.util.HashMap<java.lang.Integer, zh3.C91753f.C66827b> r40, boolean r41) {
        /*
            r34 = this;
            r1 = r34
            r2 = r36
            r3 = r37
            r4 = r38
            java.lang.String r6 = "MicroMsg.DBInit"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r36)
            r7 = 1
            r0 = r0 ^ r7
            java.lang.String r8 = "create SqliteDB enDbCachePath == null "
            junit.framework.Assert.assertTrue(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r8 = ".errreport"
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r1.f262808f = r0
            zh3.e r0 = r1.f262803a
            r8 = 0
            if (r0 == 0) goto L_0x0032
            r0.mo183810b()
            r1.f262803a = r8
        L_0x0032:
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r36)
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r35)
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r37)
            r12 = 0
            if (r9 != 0) goto L_0x0045
            if (r10 == 0) goto L_0x0045
            r13 = 1
            goto L_0x0046
        L_0x0045:
            r13 = 0
        L_0x0046:
            java.util.Set<java.lang.String> r0 = zh3.C119118e.f356726f
            zh3.e r0 = r1.f262803a
            if (r0 != 0) goto L_0x02d1
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r36)
            r0 = r0 ^ r7
            r1.f262807e = r0
            java.lang.String r0 = "RC4"
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.util.LinkedHashSet r15 = new java.util.LinkedHashSet
            r15.<init>()
            java.lang.String r8 = p156gj.C87203t.m108270f(r7)
            r15.add(r8)
            java.lang.String r8 = p156gj.C87203t.m108270f(r12)
            r15.add(r8)
            r8 = 2
            javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.lang.String r16 = "_wEcHAT_"
            byte[] r12 = r16.getBytes()     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r7.<init>(r12, r0)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r0.init(r8, r7)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            javax.crypto.CipherInputStream r8 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r17 = r13
            java.lang.String r13 = "KeyInfo.bin"
            java.io.FileInputStream r13 = r14.openFileInput(r13)     // Catch:{ Exception -> 0x00a5, all -> 0x00a7 }
            r8.<init>(r13, r0)     // Catch:{ Exception -> 0x00a5, all -> 0x00a7 }
            r12.<init>(r8)     // Catch:{ Exception -> 0x00a5, all -> 0x00a7 }
            r7.<init>(r12)     // Catch:{ Exception -> 0x00a5, all -> 0x00a7 }
        L_0x0096:
            java.lang.String r0 = r7.readLine()     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
            if (r0 == 0) goto L_0x00b7
            r15.add(r0)     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
            goto L_0x0096
        L_0x00a0:
            r0 = move-exception
            goto L_0x02cd
        L_0x00a3:
            r0 = move-exception
            goto L_0x00af
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ae
        L_0x00a7:
            r0 = move-exception
            r8 = 0
            goto L_0x02cc
        L_0x00ab:
            r0 = move-exception
            r17 = r13
        L_0x00ae:
            r7 = 0
        L_0x00af:
            java.lang.String r8 = "Failed to load key information."
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x02ca }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r8, r13)     // Catch:{ all -> 0x02ca }
        L_0x00b7:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
            java.lang.String r0 = "1234567890ABCDEF"
            r15.add(r0)
            java.util.Iterator r7 = r15.iterator()
            r0 = 0
        L_0x00c4:
            boolean r8 = r7.hasNext()
            r12 = 7
            if (r8 == 0) goto L_0x0138
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            byte[] r8 = r8.getBytes()
            java.lang.String r8 = p823sg.C90193h.m112878f(r8)
            r13 = 0
            java.lang.String r8 = r8.substring(r13, r12)
            r1.f262804b = r8
            r14 = 1
            zh3.e r8 = zh3.C119118e.m167944r(r2, r8, r13, r14)     // Catch:{ SQLiteException -> 0x0130 }
            r1.f262803a = r8     // Catch:{ SQLiteException -> 0x0130 }
            r1.mo125604a(r8)     // Catch:{ SQLiteException -> 0x0130 }
            java.lang.String r8 = p156gj.C87203t.m108270f(r14)     // Catch:{ SQLiteException -> 0x0130 }
            boolean r8 = r8.equals(r0)     // Catch:{ SQLiteException -> 0x0130 }
            if (r8 != 0) goto L_0x012d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0130 }
            r8.<init>()     // Catch:{ SQLiteException -> 0x0130 }
            java.lang.String r13 = "IMEI changed detected: "
            r8.append(r13)     // Catch:{ SQLiteException -> 0x0130 }
            r8.append(r0)     // Catch:{ SQLiteException -> 0x0130 }
            java.lang.String r8 = r8.toString()     // Catch:{ SQLiteException -> 0x0130 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)     // Catch:{ SQLiteException -> 0x0130 }
            gj.n r8 = p156gj.C87199n.m108254a()     // Catch:{ SQLiteException -> 0x0130 }
            r13 = 258(0x102, float:3.62E-43)
            r8.mo121634b(r13, r0)     // Catch:{ SQLiteException -> 0x0130 }
            kj2.d r18 = kj2.C117407d.INSTANCE     // Catch:{ SQLiteException -> 0x0130 }
            r19 = 181(0xb5, double:8.94E-322)
            r21 = 5
            r23 = 1
            r25 = 0
            r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ SQLiteException -> 0x0130 }
        L_0x012d:
            r0 = 1
            goto L_0x0210
        L_0x0130:
            r0 = move-exception
            boolean r0 = r0 instanceof com.tencent.wcdb.database.SQLiteDatabaseCorruptException
            if (r0 == 0) goto L_0x0137
            r0 = 1
            goto L_0x00c4
        L_0x0137:
            r0 = 0
        L_0x0138:
            if (r0 == 0) goto L_0x01c9
            boolean r0 = zh3.C119118e.m167941m()
            if (r0 == 0) goto L_0x0143
            r0 = 43
            goto L_0x0145
        L_0x0143:
            r0 = 41
        L_0x0145:
            kj2.d r7 = kj2.C117407d.INSTANCE
            r19 = 181(0xb5, double:8.94E-322)
            long r13 = (long) r0
            r23 = 1
            r25 = 1
            r18 = r7
            r21 = r13
            r18.idkeyStat(r19, r21, r23, r25)
            zh3.C119118e.m167943q(r36)
            java.lang.String r0 = "EnMicroMsg.db"
            boolean r8 = r2.endsWith(r0)
            if (r8 == 0) goto L_0x017d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            f40.o r13 = f40.C86709a0.m107535s()
            java.lang.String r13 = r13.f251806d
            r8.append(r13)
            java.lang.String r13 = "dbback/"
            r8.append(r13)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            zh3.C119118e.m167943q(r0)
        L_0x017d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01bb }
            r0.<init>()     // Catch:{ SQLiteException -> 0x01bb }
            r8 = 1
            java.lang.String r13 = p156gj.C87203t.m108270f(r8)     // Catch:{ SQLiteException -> 0x01bb }
            r0.append(r13)     // Catch:{ SQLiteException -> 0x01bb }
            r0.append(r4)     // Catch:{ SQLiteException -> 0x01bb }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteException -> 0x01bb }
            byte[] r0 = r0.getBytes()     // Catch:{ SQLiteException -> 0x01bb }
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)     // Catch:{ SQLiteException -> 0x01bb }
            r8 = 0
            java.lang.String r0 = r0.substring(r8, r12)     // Catch:{ SQLiteException -> 0x01bb }
            r1.f262804b = r0     // Catch:{ SQLiteException -> 0x01bb }
            r13 = 1
            zh3.e r0 = zh3.C119118e.m167944r(r2, r0, r8, r13)     // Catch:{ SQLiteException -> 0x01bb }
            r1.f262803a = r0     // Catch:{ SQLiteException -> 0x01bb }
            r1.mo125604a(r0)     // Catch:{ SQLiteException -> 0x01bb }
            r1.f262807e = r13     // Catch:{ SQLiteException -> 0x01bb }
            r19 = 181(0xb5, double:8.94E-322)
            r21 = 6
            r23 = 1
            r25 = 0
            r18 = r7
            r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ SQLiteException -> 0x01bb }
            goto L_0x012d
        L_0x01bb:
            kj2.d r26 = kj2.C117407d.INSTANCE
            r27 = 181(0xb5, double:8.94E-322)
            r29 = 7
            r31 = 1
            r33 = 0
            r26.idkeyStat(r27, r29, r31, r33)
            goto L_0x0201
        L_0x01c9:
            if (r3 == 0) goto L_0x0201
            int r0 = r37.length()
            if (r0 <= 0) goto L_0x0201
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r37)
            r7 = 1
            r0 = r0 ^ r7
            r1.f262807e = r0
            java.lang.String r0 = r1.f262804b     // Catch:{ SQLiteException -> 0x01f4 }
            r8 = 0
            zh3.e r0 = zh3.C119118e.m167944r(r3, r0, r8, r7)     // Catch:{ SQLiteException -> 0x01f4 }
            r1.f262803a = r0     // Catch:{ SQLiteException -> 0x01f4 }
            r1.mo125604a(r0)     // Catch:{ SQLiteException -> 0x01f4 }
            kj2.d r18 = kj2.C117407d.INSTANCE     // Catch:{ SQLiteException -> 0x01f4 }
            r19 = 181(0xb5, double:8.94E-322)
            r21 = 6
            r23 = 1
            r25 = 0
            r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ SQLiteException -> 0x01f4 }
            goto L_0x012d
        L_0x01f4:
            kj2.d r26 = kj2.C117407d.INSTANCE
            r27 = 181(0xb5, double:8.94E-322)
            r29 = 7
            r31 = 1
            r33 = 0
            r26.idkeyStat(r27, r29, r31, r33)
        L_0x0201:
            zh3.e r0 = r1.f262803a
            if (r0 == 0) goto L_0x020c
            r0.mo183810b()
            r7 = 0
            r1.f262803a = r7
            goto L_0x020d
        L_0x020c:
            r7 = 0
        L_0x020d:
            r1.f262804b = r7
            r0 = 0
        L_0x0210:
            r1.f262806d = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r7 = 0
            r0[r7] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r7 = 1
            r0[r7] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            r7 = 2
            r0[r7] = r2
            r2 = 3
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0[r2] = r7
            r2 = 4
            boolean r7 = r1.f262806d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0[r2] = r7
            r2 = 5
            zh3.e r7 = r1.f262803a
            if (r7 == 0) goto L_0x023a
            r7 = 1
            goto L_0x023b
        L_0x023a:
            r7 = 0
        L_0x023b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0[r2] = r7
            r2 = 6
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r0[r2] = r7
            java.lang.String r2 = "initDb(en) path:%s enExist:%b oldExist:%b copyold:%b dbopenSUCC:%b db:%b thr:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
            zh3.e r0 = r1.f262803a
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = r0.mo183817j()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0268
            if (r11 == 0) goto L_0x0268
            java.lang.String r0 = "backup db exsits, copy data to en db"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = 1
            goto L_0x0269
        L_0x0268:
            r0 = 0
        L_0x0269:
            boolean r2 = r1.f262807e
            r6 = r40
            r7 = r41
            boolean r2 = r1.mo125606c(r6, r7, r2)
            if (r2 != 0) goto L_0x0277
            r2 = 0
            return r2
        L_0x0277:
            if (r10 != 0) goto L_0x027d
            if (r11 != 0) goto L_0x027d
            r2 = 1
            return r2
        L_0x027d:
            r2 = 1
            if (r0 != 0) goto L_0x0282
            if (r17 == 0) goto L_0x0284
        L_0x0282:
            r1.f262809g = r2
        L_0x0284:
            r6 = 1
            if (r0 == 0) goto L_0x02b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = p156gj.C87203t.m108270f(r2)
            r0.append(r8)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r12)
            r1.f262804b = r0
            r1.mo125605b(r3, r0)
            r2 = 201(0xc9, double:9.93E-322)
            p787ai.C79546a.m96578b(r2, r6)
        L_0x02b2:
            if (r17 == 0) goto L_0x02c2
            java.lang.String r0 = ""
            r2 = r35
            boolean r0 = r1.mo125605b(r2, r0)
            r2 = 200(0xc8, double:9.9E-322)
            p787ai.C79546a.m96578b(r2, r6)
            return r0
        L_0x02c2:
            zh3.e r0 = r1.f262803a
            if (r0 == 0) goto L_0x02c8
            r2 = 1
            return r2
        L_0x02c8:
            r2 = 0
            return r2
        L_0x02ca:
            r0 = move-exception
            r8 = r7
        L_0x02cc:
            r7 = r8
        L_0x02cd:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
            throw r0
        L_0x02d1:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zh3.C91752a.mo125609f(java.lang.String, java.lang.String, java.lang.String, long, java.util.HashMap, boolean):boolean");
    }

    /* renamed from: g */
    public final void mo125610g(String str, String str2) {
        HashSet hashSet = new HashSet();
        android.database.Cursor u = this.f262803a.mo183823u(String.format("select * from %s limit 1 ", new Object[]{str}), (String[]) null, 0, false);
        if (u.getCount() == 0) {
            u.close();
            return;
        }
        u.moveToFirst();
        for (int i = 0; i < u.getColumnCount(); i++) {
            hashSet.add(u.getColumnName(i));
        }
        u.close();
        android.database.Cursor u2 = this.f262803a.mo183823u(String.format("PRAGMA table_info( %s )", new Object[]{str2}), (String[]) null, 0, false);
        String str3 = "";
        while (u2.moveToNext()) {
            String string = u2.getString(u2.getColumnIndex("name"));
            if (hashSet.contains(string)) {
                str3 = (str3 + string) + ",";
            }
        }
        u2.close();
        String substring = str3.substring(0, str3.length() - 1);
        this.f262803a.mo183812e("insert into " + str2 + "(" + substring + ") select " + substring + " from " + str + ";");
    }

    /* renamed from: h */
    public void mo125611h() {
        Log.m105919d("MicroMsg.DBInit", "resetIniCache iniFilename:%s", this.f262805c);
        C86013q1.m106447h(this.f262805c);
    }
}
