package q41;

import android.os.AsyncTask;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.dbbackup.C115390h;
import com.tencent.p014mm.plugin.dbbackup.DBRecoveryUI;
import com.tencent.p014mm.plugin.dbbackup.DBRecoveryUI$$a;
import com.tencent.p014mm.plugin.dbbackup.DBRecoveryUI$$f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.repair.RecoverKit;
import com.tencent.wcdb.repair.RepairKit;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.OperationCanceledException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kj2.C117407d;
import nj3.C76879j;
import p823sg.C90193h;

/* renamed from: q41.f */
public class C118169f extends AsyncTask<Void, Integer, Integer> {

    /* renamed from: B */
    public static final SQLiteCipherSpec f353213B = new SQLiteCipherSpec().setPageSize(1024).setSQLCipherVersion(1);

    /* renamed from: C */
    public static final String[] f353214C = {"", " OR ROLLBACK", " OR ABORT", " OR FAIL", " OR IGNORE", " OR REPLACE"};

    /* renamed from: A */
    public long f353215A;

    /* renamed from: a */
    public SQLiteDatabase f353216a;

    /* renamed from: b */
    public String f353217b;

    /* renamed from: c */
    public String f353218c;

    /* renamed from: d */
    public String f353219d;

    /* renamed from: e */
    public String f353220e;

    /* renamed from: f */
    public List<String> f353221f;

    /* renamed from: g */
    public List<String> f353222g;

    /* renamed from: h */
    public List<String> f353223h;

    /* renamed from: i */
    public byte[] f353224i;

    /* renamed from: j */
    public byte[] f353225j;

    /* renamed from: k */
    public List<byte[]> f353226k;

    /* renamed from: l */
    public List<byte[]> f353227l;

    /* renamed from: m */
    public f$$j f353228m;

    /* renamed from: n */
    public boolean f353229n;

    /* renamed from: o */
    public f$$h f353230o;

    /* renamed from: p */
    public boolean f353231p;

    /* renamed from: q */
    public int f353232q;

    /* renamed from: r */
    public long f353233r;

    /* renamed from: s */
    public long f353234s;

    /* renamed from: t */
    public final CancellationSignal f353235t = new CancellationSignal();

    /* renamed from: u */
    public long f353236u;

    /* renamed from: v */
    public long f353237v;

    /* renamed from: w */
    public RepairKit.Statistics f353238w;

    /* renamed from: x */
    public int f353239x;

    /* renamed from: y */
    public long f353240y;

    /* renamed from: z */
    public int f353241z;

    public C118169f(f$$f f__f) {
    }

    /* renamed from: n */
    public static List<f$$i> m166697n(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase.CursorFactory cursorFactory = SQLiteDirectCursor.FACTORY;
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, "PRAGMA table_info(" + str + ");", (Object[]) null, (String) null);
        try {
            if (!rawQueryWithFactory.moveToFirst()) {
                rawQueryWithFactory.close();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(new f$$i(rawQueryWithFactory.getString(1), rawQueryWithFactory.getString(2), rawQueryWithFactory.getInt(3) != 0, rawQueryWithFactory.getString(4), rawQueryWithFactory.getInt(5) != 0));
            } while (rawQueryWithFactory.moveToNext());
            rawQueryWithFactory.close();
            return arrayList;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: o */
    public static void m166698o(int i, String str, Throwable th) {
        String str2;
        C117407d dVar = C117407d.INSTANCE;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = str;
        if (th == null) {
            str2 = "";
        } else {
            str2 = "\n" + Util.stackTraceToString(th);
        }
        objArr[2] = str2;
        dVar.mo160135k("DBRepairNew", String.format("[Stage: %d] %s%s", objArr), (Map<String, Object>) null);
    }

    /* renamed from: p */
    public static void m166699p(int i) {
        C117407d.INSTANCE.idkeyStat(181, (long) i, 1, true);
    }

    /* renamed from: c */
    public final int mo182957c(SQLiteDatabase sQLiteDatabase, String str) {
        List<f$$i> n = m166697n(sQLiteDatabase, str);
        List<f$$i> n2 = m166697n(this.f353216a, str);
        if (n == null) {
            Log.m105920e("MicroMsg.DBRecoveryTask", "ALTER TABLE detection for '%s' failed because no such table in source DB.");
            return -1;
        } else if (n2 == null) {
            Log.m105920e("MicroMsg.DBRecoveryTask", "ALTER TABLE detection for '%s' failed because no such table in target DB.");
            return -1;
        } else {
            ArrayList arrayList = (ArrayList) n2;
            ArrayList arrayList2 = (ArrayList) n;
            if (arrayList.size() >= arrayList2.size()) {
                return 0;
            }
            try {
                this.f353216a.beginTransaction();
                StringBuilder sb = new StringBuilder();
                int i = 0;
                for (int size = arrayList.size(); size < arrayList2.size(); size++) {
                    f$$i f__i = (f$$i) arrayList2.get(size);
                    sb.setLength(0);
                    sb.append("ALTER TABLE ");
                    sb.append(str);
                    sb.append(" ADD COLUMN ");
                    sb.append(f__i.f353269a);
                    sb.append(' ');
                    sb.append(f__i.f353270b);
                    if (f__i.f353271c) {
                        sb.append(" NOT NULL");
                    }
                    String str2 = f__i.f353272d;
                    if (str2 != null && !str2.isEmpty()) {
                        sb.append(" DEFAULT (");
                        sb.append(f__i.f353272d);
                        sb.append(')');
                    }
                    sb.append(';');
                    String sb4 = sb.toString();
                    this.f353216a.execSQL(sb4, (Object[]) null, this.f353235t);
                    Log.m105924i("MicroMsg.DBRecoveryTask", ">>> " + sb4);
                    i++;
                }
                this.f353216a.setTransactionSuccessful();
                return i;
            } finally {
                if (this.f353216a.inTransaction()) {
                    this.f353216a.endTransaction();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b7 A[Catch:{ all -> 0x01f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe A[Catch:{ all -> 0x01f1 }, LOOP:2: B:37:0x00f8->B:39:0x00fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0123 A[Catch:{ all -> 0x01f1 }, LOOP:3: B:41:0x011d->B:43:0x0123, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0149 A[Catch:{ all -> 0x01f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ed  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo182958d(com.tencent.wcdb.database.SQLiteDatabase r19, java.lang.String r20, int r21, boolean r22, boolean r23, int r24, java.lang.String[] r25, q41.f$$k r26) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r8 = r20
            r9 = r25
            r10 = r26
            java.lang.String r11 = "MicroMsg.DBRecoveryTask"
            r12 = 0
            r13 = 0
            r14 = 1
            java.lang.String r2 = "SELECT sql FROM sqlite_master WHERE name = ?"
            java.lang.String[] r3 = new java.lang.String[r14]     // Catch:{ SQLiteDoneException -> 0x0203 }
            r3[r13] = r8     // Catch:{ SQLiteDoneException -> 0x0203 }
            java.lang.String r2 = com.tencent.wcdb.DatabaseUtils.stringForQuery(r0, r2, r3)     // Catch:{ SQLiteDoneException -> 0x0203 }
            if (r2 == 0) goto L_0x01f9
            boolean r3 = r2.isEmpty()     // Catch:{ SQLiteDoneException -> 0x0203 }
            if (r3 != 0) goto L_0x01f9
            if (r22 == 0) goto L_0x0032
            java.lang.String r3 = "(?i)^CREATE TABLE (?!IF NOT EXISTS )"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS "
            java.lang.String r2 = r2.replaceFirst(r3, r4)     // Catch:{ all -> 0x01ff }
            com.tencent.wcdb.database.SQLiteDatabase r3 = r1.f353216a     // Catch:{ all -> 0x01ff }
            com.tencent.wcdb.support.CancellationSignal r4 = r1.f353235t     // Catch:{ all -> 0x01ff }
            r3.execSQL(r2, r12, r4)     // Catch:{ all -> 0x01ff }
        L_0x0032:
            if (r23 != 0) goto L_0x0042
            com.tencent.wcdb.database.SQLiteDatabase r0 = r1.f353216a
            boolean r0 = r0.inTransaction()
            if (r0 == 0) goto L_0x0041
            com.tencent.wcdb.database.SQLiteDatabase r0 = r1.f353216a
            r0.endTransaction()
        L_0x0041:
            return r13
        L_0x0042:
            int r2 = r18.mo182957c(r19, r20)     // Catch:{ all -> 0x01ff }
            java.lang.String r3 = "Create %d column to '%s' by ALTER TABLE."
            r15 = 2
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ all -> 0x01ff }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01ff }
            r4[r13] = r2     // Catch:{ all -> 0x01ff }
            r4[r14] = r8     // Catch:{ all -> 0x01ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r4)     // Catch:{ all -> 0x01ff }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ff }
            r2.<init>()     // Catch:{ all -> 0x01ff }
            java.lang.String r3 = "SELECT count(*) FROM "
            r2.append(r3)     // Catch:{ all -> 0x01ff }
            r2.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01ff }
            long r2 = com.tencent.wcdb.DatabaseUtils.longForQuery(r0, r2, r12)     // Catch:{ all -> 0x01ff }
            int r7 = (int) r2     // Catch:{ all -> 0x01ff }
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r3 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY     // Catch:{ all -> 0x01ff }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ff }
            r2.<init>()     // Catch:{ all -> 0x01ff }
            java.lang.String r4 = "SELECT * FROM "
            r2.append(r4)     // Catch:{ all -> 0x01ff }
            r2.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x01ff }
            r5 = 0
            com.tencent.wcdb.support.CancellationSignal r6 = r1.f353235t     // Catch:{ all -> 0x01ff }
            r2 = r19
            r0 = r6
            r6 = r20
            r16 = r7
            r7 = r0
            com.tencent.wcdb.Cursor r2 = r2.rawQueryWithFactory(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01ff }
            java.lang.String[] r0 = r2.getColumnNames()     // Catch:{ all -> 0x01f1 }
            if (r9 == 0) goto L_0x00a9
            int r3 = r9.length     // Catch:{ all -> 0x01f1 }
            if (r3 != 0) goto L_0x0098
            goto L_0x00a9
        L_0x0098:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01f1 }
            java.util.List r4 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x01f1 }
            r3.<init>(r4)     // Catch:{ all -> 0x01f1 }
            java.util.List r4 = java.util.Arrays.asList(r25)     // Catch:{ all -> 0x01f1 }
            r3.removeAll(r4)     // Catch:{ all -> 0x01f1 }
            goto L_0x00ad
        L_0x00a9:
            java.util.List r3 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x01f1 }
        L_0x00ad:
            int r4 = r0.length     // Catch:{ all -> 0x01f1 }
            int[] r4 = new int[r4]     // Catch:{ all -> 0x01f1 }
            r5 = 0
        L_0x00b1:
            int r6 = r3.size()     // Catch:{ all -> 0x01f1 }
            if (r5 >= r6) goto L_0x00d4
            java.lang.Object r6 = r3.get(r5)     // Catch:{ all -> 0x01f1 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01f1 }
            r7 = 0
        L_0x00be:
            int r9 = r0.length     // Catch:{ all -> 0x01f1 }
            if (r7 >= r9) goto L_0x00d1
            r9 = r0[r7]     // Catch:{ all -> 0x01f1 }
            boolean r9 = r9.equals(r6)     // Catch:{ all -> 0x01f1 }
            if (r9 == 0) goto L_0x00ce
            int r6 = r5 + 1
            r4[r7] = r6     // Catch:{ all -> 0x01f1 }
            goto L_0x00d1
        L_0x00ce:
            int r7 = r7 + 1
            goto L_0x00be
        L_0x00d1:
            int r5 = r5 + 1
            goto L_0x00b1
        L_0x00d4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f1 }
            r6 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6)     // Catch:{ all -> 0x01f1 }
            java.lang.String r6 = "INSERT"
            r5.append(r6)     // Catch:{ all -> 0x01f1 }
            java.lang.String[] r6 = f353214C     // Catch:{ all -> 0x01f1 }
            r6 = r6[r21]     // Catch:{ all -> 0x01f1 }
            r5.append(r6)     // Catch:{ all -> 0x01f1 }
            java.lang.String r6 = " INTO "
            r5.append(r6)     // Catch:{ all -> 0x01f1 }
            r5.append(r8)     // Catch:{ all -> 0x01f1 }
            java.lang.String r6 = " ("
            r5.append(r6)     // Catch:{ all -> 0x01f1 }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ all -> 0x01f1 }
        L_0x00f8:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x01f1 }
            if (r7 == 0) goto L_0x010d
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x01f1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01f1 }
            r5.append(r7)     // Catch:{ all -> 0x01f1 }
            r7 = 44
            r5.append(r7)     // Catch:{ all -> 0x01f1 }
            goto L_0x00f8
        L_0x010d:
            int r6 = r5.length()     // Catch:{ all -> 0x01f1 }
            int r6 = r6 - r14
            r7 = 41
            r5.setCharAt(r6, r7)     // Catch:{ all -> 0x01f1 }
            java.lang.String r6 = " VALUES ("
            r5.append(r6)     // Catch:{ all -> 0x01f1 }
            r6 = 0
        L_0x011d:
            int r9 = r3.size()     // Catch:{ all -> 0x01f1 }
            if (r6 >= r9) goto L_0x012b
            java.lang.String r9 = "?,"
            r5.append(r9)     // Catch:{ all -> 0x01f1 }
            int r6 = r6 + 1
            goto L_0x011d
        L_0x012b:
            int r3 = r5.length()     // Catch:{ all -> 0x01f1 }
            int r3 = r3 - r14
            r5.setCharAt(r3, r7)     // Catch:{ all -> 0x01f1 }
            com.tencent.wcdb.database.SQLiteDatabase r3 = r1.f353216a     // Catch:{ all -> 0x01f1 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01f1 }
            com.tencent.wcdb.database.SQLiteStatement r12 = r3.compileStatement(r5)     // Catch:{ all -> 0x01f1 }
            com.tencent.wcdb.database.SQLiteDatabase r3 = r1.f353216a     // Catch:{ all -> 0x01f1 }
            r3.beginTransaction()     // Catch:{ all -> 0x01f1 }
            r3 = 0
        L_0x0143:
            boolean r5 = r2.moveToNext()     // Catch:{ all -> 0x01f1 }
            if (r5 == 0) goto L_0x01bf
            int r5 = r3 % 1024
            r6 = 3
            if (r5 != 0) goto L_0x0167
            if (r24 == 0) goto L_0x0167
            java.lang.Integer[] r5 = new java.lang.Integer[r6]     // Catch:{ all -> 0x01f1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x01f1 }
            r5[r13] = r7     // Catch:{ all -> 0x01f1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01f1 }
            r5[r14] = r7     // Catch:{ all -> 0x01f1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x01f1 }
            r5[r15] = r7     // Catch:{ all -> 0x01f1 }
            r1.publishProgress(r5)     // Catch:{ all -> 0x01f1 }
        L_0x0167:
            r12.clearBindings()     // Catch:{ all -> 0x01f1 }
            r5 = 0
        L_0x016b:
            int r7 = r0.length     // Catch:{ all -> 0x01f1 }
            if (r5 >= r7) goto L_0x01ac
            r7 = r4[r5]     // Catch:{ all -> 0x01f1 }
            if (r7 > 0) goto L_0x0173
            goto L_0x01a6
        L_0x0173:
            int r9 = r2.getType(r5)     // Catch:{ all -> 0x01f1 }
            if (r9 == 0) goto L_0x01a3
            if (r9 == r14) goto L_0x019b
            if (r9 == r15) goto L_0x0193
            if (r9 == r6) goto L_0x018b
            r6 = 4
            if (r9 == r6) goto L_0x0183
            goto L_0x01a6
        L_0x0183:
            byte[] r6 = r2.getBlob(r5)     // Catch:{ all -> 0x01f1 }
            r12.bindBlob(r7, r6)     // Catch:{ all -> 0x01f1 }
            goto L_0x01a6
        L_0x018b:
            java.lang.String r6 = r2.getString(r5)     // Catch:{ all -> 0x01f1 }
            r12.bindString(r7, r6)     // Catch:{ all -> 0x01f1 }
            goto L_0x01a6
        L_0x0193:
            double r13 = r2.getDouble(r5)     // Catch:{ all -> 0x01f1 }
            r12.bindDouble(r7, r13)     // Catch:{ all -> 0x01f1 }
            goto L_0x01a6
        L_0x019b:
            long r13 = r2.getLong(r5)     // Catch:{ all -> 0x01f1 }
            r12.bindLong(r7, r13)     // Catch:{ all -> 0x01f1 }
            goto L_0x01a6
        L_0x01a3:
            r12.bindNull(r7)     // Catch:{ all -> 0x01f1 }
        L_0x01a6:
            int r5 = r5 + 1
            r6 = 3
            r13 = 0
            r14 = 1
            goto L_0x016b
        L_0x01ac:
            if (r10 == 0) goto L_0x01b5
            boolean r5 = r10.mo182971a(r2, r12, r4)     // Catch:{ all -> 0x01f1 }
            if (r5 != 0) goto L_0x01b5
            goto L_0x01bc
        L_0x01b5:
            com.tencent.wcdb.support.CancellationSignal r5 = r1.f353235t     // Catch:{ all -> 0x01f1 }
            r12.executeInsert(r5)     // Catch:{ all -> 0x01f1 }
            int r3 = r3 + 1
        L_0x01bc:
            r13 = 0
            r14 = 1
            goto L_0x0143
        L_0x01bf:
            com.tencent.wcdb.database.SQLiteDatabase r0 = r1.f353216a     // Catch:{ all -> 0x01f1 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x01f1 }
            java.lang.String r0 = "Merged %d entries from table %s"
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ all -> 0x01f1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01f1 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x01f1 }
            r5 = 1
            r4[r5] = r8     // Catch:{ all -> 0x01f1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r4)     // Catch:{ all -> 0x01f1 }
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x01de
            r2.close()
        L_0x01de:
            com.tencent.wcdb.database.SQLiteDatabase r0 = r1.f353216a
            boolean r0 = r0.inTransaction()
            if (r0 == 0) goto L_0x01eb
            com.tencent.wcdb.database.SQLiteDatabase r0 = r1.f353216a
            r0.endTransaction()
        L_0x01eb:
            if (r12 == 0) goto L_0x01f0
            r12.close()
        L_0x01f0:
            return r3
        L_0x01f1:
            r0 = move-exception
            r17 = r2
            r2 = r0
            r0 = r12
            r12 = r17
            goto L_0x021d
        L_0x01f9:
            com.tencent.wcdb.database.SQLiteDoneException r0 = new com.tencent.wcdb.database.SQLiteDoneException     // Catch:{ SQLiteDoneException -> 0x0203 }
            r0.<init>()     // Catch:{ SQLiteDoneException -> 0x0203 }
            throw r0     // Catch:{ SQLiteDoneException -> 0x0203 }
        L_0x01ff:
            r0 = move-exception
            r2 = r0
            r0 = r12
            goto L_0x021d
        L_0x0203:
            java.lang.String r0 = "There is no table named '%s' to copy."
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ff }
            r3 = 0
            r2[r3] = r8     // Catch:{ all -> 0x01ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r2)     // Catch:{ all -> 0x01ff }
            r0 = -1
            com.tencent.wcdb.database.SQLiteDatabase r2 = r1.f353216a
            boolean r2 = r2.inTransaction()
            if (r2 == 0) goto L_0x021c
            com.tencent.wcdb.database.SQLiteDatabase r2 = r1.f353216a
            r2.endTransaction()
        L_0x021c:
            return r0
        L_0x021d:
            if (r12 == 0) goto L_0x0228
            boolean r3 = r12.isClosed()
            if (r3 != 0) goto L_0x0228
            r12.close()
        L_0x0228:
            com.tencent.wcdb.database.SQLiteDatabase r3 = r1.f353216a
            boolean r3 = r3.inTransaction()
            if (r3 == 0) goto L_0x0235
            com.tencent.wcdb.database.SQLiteDatabase r3 = r1.f353216a
            r3.endTransaction()
        L_0x0235:
            if (r0 == 0) goto L_0x023a
            r0.close()
        L_0x023a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q41.C118169f.mo182958d(com.tencent.wcdb.database.SQLiteDatabase, java.lang.String, int, boolean, boolean, int, java.lang.String[], q41.f$$k):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x044c, code lost:
        if (r5.isHeld() == false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x04d4, code lost:
        if (r5.isHeld() == false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x04d8, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0139, code lost:
        if (r5.isHeld() != false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x013b, code lost:
        r6 = r5;
        j20.C117292a.m165357c(r6, "com/tencent/mm/plugin/dbbackup/model/DBRecoveryTask", "doInBackground", "([Ljava/lang/Void;)Ljava/lang/Integer;", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        r5.release();
        j20.C117292a.m165359e(r6, "com/tencent/mm/plugin/dbbackup/model/DBRecoveryTask", "doInBackground", "([Ljava/lang/Void;)Ljava/lang/Integer;", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x021e, code lost:
        if (r5.isHeld() != false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02df, code lost:
        if (r5.isHeld() != false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x03aa, code lost:
        if (r5.isHeld() != false) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r39) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            java.lang.Void[] r0 = (java.lang.Void[]) r0
            java.lang.String r2 = "MicroMsg.DBRecoveryTask"
            r0 = 54
            m166699p(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "power"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "DBRecovery"
            android.os.PowerManager$WakeLock r5 = r0.newWakeLock(r3, r5)
            long r14 = android.os.SystemClock.uptimeMillis()
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.mo10233c(r6)
            java.lang.Object[] r7 = r0.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/dbbackup/model/DBRecoveryTask"
            java.lang.String r9 = "doInBackground"
            java.lang.String r10 = "([Ljava/lang/Void;)Ljava/lang/Integer;"
            java.lang.String r11 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r12 = "acquire"
            java.lang.String r13 = "(J)V"
            r6 = r5
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6.set(r0)
            r13 = 0
            java.lang.Object r0 = r0.mo10231a(r13)
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            k20.C60958c.m71441a()
            r5.acquire(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/dbbackup/model/DBRecoveryTask"
            java.lang.String r8 = "doInBackground"
            java.lang.String r9 = "([Ljava/lang/Void;)Ljava/lang/Integer;"
            java.lang.String r10 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r11 = "acquire"
            java.lang.String r12 = "(J)V"
            r6 = r5
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            r6 = 11
            r16 = 5
            r17 = 4
            r18 = 2
            r19 = 1
            r21 = 1000(0x3e8, double:4.94E-321)
            r23 = 55
            r24 = 58
            r26 = 6
            java.lang.Integer[] r0 = new java.lang.Integer[r3]     // Catch:{ OperationCanceledException -> 0x03bb, Exception -> 0x03c1 }
            r0[r13] = r4     // Catch:{ OperationCanceledException -> 0x03bb, Exception -> 0x03c1 }
            r1.publishProgress(r0)     // Catch:{ OperationCanceledException -> 0x03bb, Exception -> 0x03c1 }
            int r7 = r38.mo182966k()     // Catch:{ OperationCanceledException -> 0x03bb, Exception -> 0x03c1 }
            if (r7 == 0) goto L_0x0161
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            com.tencent.wcdb.repair.RepairKit$Statistics r0 = r1.f353238w
            if (r0 == 0) goto L_0x00a4
            int r2 = r0.totalPages
            int r8 = r0.validPages
            int r9 = r0.parsedPages
            int r0 = r0.damagedPages
            goto L_0x00a8
        L_0x00a4:
            r0 = 0
            r2 = 0
            r8 = 0
            r9 = 0
        L_0x00a8:
            kj2.d r10 = kj2.C117407d.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r25 = java.lang.Integer.valueOf(r7)
            r6[r13] = r25
            long r11 = r1.f353236u
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r6[r3] = r11
            long r11 = r1.f353237v
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r6[r18] = r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11 = 3
            r6[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r6[r17] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r6[r16] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r26] = r0
            int r0 = r1.f353239x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 7
            r6[r2] = r0
            long r8 = r1.f353240y
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2 = 8
            r6[r2] = r0
            int r0 = r1.f353241z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 9
            r6[r2] = r0
            long r8 = r1.f353215A
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2 = 10
            r6[r2] = r0
            r2 = 27949(0x6d2d, float:3.9165E-41)
            r10.mo160131h(r2, r6)
            r2 = -2
            if (r7 == r2) goto L_0x0132
            if (r7 == 0) goto L_0x011a
            if (r7 == r3) goto L_0x0114
            r2 = 57
            m166699p(r2)
            goto L_0x0135
        L_0x0114:
            r2 = 56
            m166699p(r2)
            goto L_0x0135
        L_0x011a:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r14
            m166699p(r23)
            r28 = 181(0xb5, double:8.94E-322)
            r30 = 60
            long r2 = r2 / r21
            long r32 = r2 + r19
            r34 = 1
            r27 = r10
            r27.idkeyStat(r28, r30, r32, r34)
            goto L_0x0135
        L_0x0132:
            m166699p(r24)
        L_0x0135:
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x04d8
        L_0x013b:
            java.lang.String r7 = "com/tencent/mm/plugin/dbbackup/model/DBRecoveryTask"
            java.lang.String r8 = "doInBackground"
            java.lang.String r9 = "([Ljava/lang/Void;)Ljava/lang/Integer;"
            java.lang.String r10 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r11 = "release"
            java.lang.String r12 = "()V"
            r6 = r5
            j20.C117292a.m165357c(r6, r7, r8, r9, r10, r11, r12)
            r5.release()
            java.lang.String r7 = "com/tencent/mm/plugin/dbbackup/model/DBRecoveryTask"
            java.lang.String r8 = "doInBackground"
            java.lang.String r9 = "([Ljava/lang/Void;)Ljava/lang/Integer;"
            java.lang.String r10 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r11 = "release"
            java.lang.String r12 = "()V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x04d8
        L_0x0161:
            r38.mo182964i()     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            r38.mo182963h()     // Catch:{ OperationCanceledException -> 0x03b5, Exception -> 0x03b2, all -> 0x03ae }
            java.lang.Integer[] r0 = new java.lang.Integer[r3]     // Catch:{ OperationCanceledException -> 0x03b5, Exception -> 0x03b2, all -> 0x03ae }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)     // Catch:{ OperationCanceledException -> 0x03b5, Exception -> 0x03b2, all -> 0x03ae }
            r0[r13] = r7     // Catch:{ OperationCanceledException -> 0x03b5, Exception -> 0x03b2, all -> 0x03ae }
            r1.publishProgress(r0)     // Catch:{ OperationCanceledException -> 0x03b5, Exception -> 0x03b2, all -> 0x03ae }
            int r7 = r38.mo182967l()     // Catch:{ OperationCanceledException -> 0x03b5, Exception -> 0x03b2, all -> 0x03ae }
            if (r7 != r3) goto L_0x0225
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            com.tencent.wcdb.repair.RepairKit$Statistics r0 = r1.f353238w
            if (r0 == 0) goto L_0x0189
            int r2 = r0.totalPages
            int r8 = r0.validPages
            int r9 = r0.parsedPages
            int r0 = r0.damagedPages
            goto L_0x018d
        L_0x0189:
            r0 = 0
            r2 = 0
            r8 = 0
            r9 = 0
        L_0x018d:
            kj2.d r10 = kj2.C117407d.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r6[r13] = r11
            long r11 = r1.f353236u
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r6[r3] = r11
            long r11 = r1.f353237v
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r6[r18] = r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11 = 3
            r6[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r6[r17] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r6[r16] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r26] = r0
            int r0 = r1.f353239x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 7
            r6[r2] = r0
            long r8 = r1.f353240y
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2 = 8
            r6[r2] = r0
            int r0 = r1.f353241z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 9
            r6[r2] = r0
            long r8 = r1.f353215A
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2 = 10
            r6[r2] = r0
            r2 = 27949(0x6d2d, float:3.9165E-41)
            r10.mo160131h(r2, r6)
            r2 = -2
            if (r7 == r2) goto L_0x0217
            if (r7 == 0) goto L_0x01ff
            if (r7 == r3) goto L_0x01f9
            r2 = 57
            m166699p(r2)
            goto L_0x021a
        L_0x01f9:
            r2 = 56
            m166699p(r2)
            goto L_0x021a
        L_0x01ff:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r14
            m166699p(r23)
            r31 = 181(0xb5, double:8.94E-322)
            r33 = 60
            long r2 = r2 / r21
            long r35 = r2 + r19
            r37 = 1
            r30 = r10
            r30.idkeyStat(r31, r33, r35, r37)
            goto L_0x021a
        L_0x0217:
            m166699p(r24)
        L_0x021a:
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x04d8
            goto L_0x013b
        L_0x0222:
            r0 = move-exception
            goto L_0x03c3
        L_0x0225:
            r8 = -1
            if (r7 != r8) goto L_0x0237
            java.lang.Integer[] r0 = new java.lang.Integer[r3]     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            r0[r13] = r8     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            r1.publishProgress(r0)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            int r7 = r38.mo182961f()     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
        L_0x0237:
            if (r7 == 0) goto L_0x02e3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            com.tencent.wcdb.repair.RepairKit$Statistics r0 = r1.f353238w
            if (r0 == 0) goto L_0x024a
            int r2 = r0.totalPages
            int r8 = r0.validPages
            int r9 = r0.parsedPages
            int r0 = r0.damagedPages
            goto L_0x024e
        L_0x024a:
            r0 = 0
            r2 = 0
            r8 = 0
            r9 = 0
        L_0x024e:
            kj2.d r10 = kj2.C117407d.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r6[r13] = r11
            long r11 = r1.f353236u
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r6[r3] = r11
            long r11 = r1.f353237v
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r6[r18] = r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11 = 3
            r6[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r6[r17] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r6[r16] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r26] = r0
            int r0 = r1.f353239x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 7
            r6[r2] = r0
            long r8 = r1.f353240y
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2 = 8
            r6[r2] = r0
            int r0 = r1.f353241z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 9
            r6[r2] = r0
            long r8 = r1.f353215A
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2 = 10
            r6[r2] = r0
            r2 = 27949(0x6d2d, float:3.9165E-41)
            r10.mo160131h(r2, r6)
            r2 = -2
            if (r7 == r2) goto L_0x02d8
            if (r7 == 0) goto L_0x02c0
            if (r7 == r3) goto L_0x02ba
            r2 = 57
            m166699p(r2)
            goto L_0x02db
        L_0x02ba:
            r2 = 56
            m166699p(r2)
            goto L_0x02db
        L_0x02c0:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r14
            m166699p(r23)
            r31 = 181(0xb5, double:8.94E-322)
            r33 = 60
            long r2 = r2 / r21
            long r35 = r2 + r19
            r37 = 1
            r30 = r10
            r30.idkeyStat(r31, r33, r35, r37)
            goto L_0x02db
        L_0x02d8:
            m166699p(r24)
        L_0x02db:
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x04d8
            goto L_0x013b
        L_0x02e3:
            java.lang.Integer[] r0 = new java.lang.Integer[r3]     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            r0[r13] = r8     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            r1.publishProgress(r0)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            r38.mo182968m()     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            int r7 = r38.mo182965j()     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            java.lang.Integer[] r0 = new java.lang.Integer[r3]     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r26)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            r0[r13] = r8     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            r1.publishProgress(r0)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            int r7 = r1.mo182962g(r3)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ OperationCanceledException -> 0x0457, Exception -> 0x0222 }
            com.tencent.wcdb.repair.RepairKit$Statistics r0 = r1.f353238w
            if (r0 == 0) goto L_0x0315
            int r2 = r0.totalPages
            int r8 = r0.validPages
            int r9 = r0.parsedPages
            int r0 = r0.damagedPages
            goto L_0x0319
        L_0x0315:
            r0 = 0
            r2 = 0
            r8 = 0
            r9 = 0
        L_0x0319:
            kj2.d r10 = kj2.C117407d.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r6[r13] = r11
            long r11 = r1.f353236u
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r6[r3] = r11
            long r11 = r1.f353237v
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r6[r18] = r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11 = 3
            r6[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r6[r17] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r6[r16] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r26] = r0
            int r0 = r1.f353239x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 7
            r6[r2] = r0
            long r8 = r1.f353240y
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2 = 8
            r6[r2] = r0
            int r0 = r1.f353241z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 9
            r6[r2] = r0
            long r8 = r1.f353215A
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2 = 10
            r6[r2] = r0
            r2 = 27949(0x6d2d, float:3.9165E-41)
            r10.mo160131h(r2, r6)
            r2 = -2
            if (r7 == r2) goto L_0x03a3
            if (r7 == 0) goto L_0x038b
            if (r7 == r3) goto L_0x0385
            r2 = 57
            m166699p(r2)
            goto L_0x03a6
        L_0x0385:
            r2 = 56
            m166699p(r2)
            goto L_0x03a6
        L_0x038b:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r14
            m166699p(r23)
            r31 = 181(0xb5, double:8.94E-322)
            r33 = 60
            long r2 = r2 / r21
            long r35 = r2 + r19
            r37 = 1
            r30 = r10
            r30.idkeyStat(r31, r33, r35, r37)
            goto L_0x03a6
        L_0x03a3:
            m166699p(r24)
        L_0x03a6:
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x04d8
            goto L_0x013b
        L_0x03ae:
            r0 = move-exception
            r7 = 0
            goto L_0x04d9
        L_0x03b2:
            r0 = move-exception
            r7 = 0
            goto L_0x03c3
        L_0x03b5:
            r7 = 0
            goto L_0x0457
        L_0x03b8:
            r0 = move-exception
            goto L_0x04d9
        L_0x03bb:
            r10 = -1
            goto L_0x0456
        L_0x03be:
            r10 = -1
            goto L_0x0453
        L_0x03c1:
            r0 = move-exception
            r7 = -1
        L_0x03c3:
            java.lang.String r4 = "Recovery failed."
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x03b8 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r8)     // Catch:{ all -> 0x03b8 }
            r1.mo182962g(r13)     // Catch:{ all -> 0x03b8 }
            r2 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0450 }
            com.tencent.wcdb.repair.RepairKit$Statistics r0 = r1.f353238w
            if (r0 == 0) goto L_0x03df
            int r2 = r0.totalPages
            int r7 = r0.validPages
            int r8 = r0.parsedPages
            int r0 = r0.damagedPages
            goto L_0x03e3
        L_0x03df:
            r0 = 0
            r2 = 0
            r7 = 0
            r8 = 0
        L_0x03e3:
            kj2.d r9 = kj2.C117407d.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r10 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r13] = r10
            long r10 = r1.f353236u
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r6[r3] = r10
            long r10 = r1.f353237v
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r6[r18] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            r6[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r6[r17] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r6[r16] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r26] = r0
            int r0 = r1.f353239x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 7
            r6[r2] = r0
            long r2 = r1.f353240y
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 8
            r6[r2] = r0
            int r0 = r1.f353241z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 9
            r6[r2] = r0
            long r2 = r1.f353215A
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 10
            r6[r2] = r0
            r2 = 27949(0x6d2d, float:3.9165E-41)
            r9.mo160131h(r2, r6)
            r2 = 57
            m166699p(r2)
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x04d8
            goto L_0x013b
        L_0x0450:
            r0 = move-exception
            goto L_0x03be
        L_0x0453:
            r7 = -1
            goto L_0x04d9
        L_0x0456:
            r7 = -1
        L_0x0457:
            java.lang.String r0 = "Recovery cancelled."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x03b8 }
            r1.mo182962g(r13)     // Catch:{ all -> 0x03b8 }
            com.tencent.wcdb.repair.RepairKit$Statistics r0 = r1.f353238w
            if (r0 == 0) goto L_0x046c
            int r2 = r0.totalPages
            int r7 = r0.validPages
            int r8 = r0.parsedPages
            int r0 = r0.damagedPages
            goto L_0x0470
        L_0x046c:
            r0 = 0
            r2 = 0
            r7 = 0
            r8 = 0
        L_0x0470:
            kj2.d r9 = kj2.C117407d.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r13] = r4
            long r10 = r1.f353236u
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r6[r3] = r10
            long r10 = r1.f353237v
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r6[r18] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            r6[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r6[r17] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r6[r16] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r26] = r0
            int r0 = r1.f353239x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 7
            r6[r2] = r0
            long r2 = r1.f353240y
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 8
            r6[r2] = r0
            int r0 = r1.f353241z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 9
            r6[r2] = r0
            long r2 = r1.f353215A
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 10
            r6[r2] = r0
            r2 = 27949(0x6d2d, float:3.9165E-41)
            r9.mo160131h(r2, r6)
            r2 = 56
            m166699p(r2)
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x04d8
            goto L_0x013b
        L_0x04d8:
            return r4
        L_0x04d9:
            com.tencent.wcdb.repair.RepairKit$Statistics r2 = r1.f353238w
            if (r2 == 0) goto L_0x04e6
            int r4 = r2.totalPages
            int r8 = r2.validPages
            int r9 = r2.parsedPages
            int r2 = r2.damagedPages
            goto L_0x04ea
        L_0x04e6:
            r2 = 0
            r4 = 0
            r8 = 0
            r9 = 0
        L_0x04ea:
            kj2.d r10 = kj2.C117407d.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r6[r13] = r11
            long r11 = r1.f353236u
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r6[r3] = r11
            long r11 = r1.f353237v
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r6[r18] = r11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11 = 3
            r6[r11] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r6[r17] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r6[r16] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r26] = r2
            int r2 = r1.f353239x
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 7
            r6[r4] = r2
            long r8 = r1.f353240y
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r4 = 8
            r6[r4] = r2
            int r2 = r1.f353241z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 9
            r6[r4] = r2
            long r8 = r1.f353215A
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r4 = 10
            r6[r4] = r2
            r2 = 27949(0x6d2d, float:3.9165E-41)
            r10.mo160131h(r2, r6)
            r2 = -2
            if (r7 == r2) goto L_0x0574
            if (r7 == 0) goto L_0x055c
            if (r7 == r3) goto L_0x0556
            r2 = 57
            m166699p(r2)
            goto L_0x0577
        L_0x0556:
            r2 = 56
            m166699p(r2)
            goto L_0x0577
        L_0x055c:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r14
            m166699p(r23)
            r31 = 181(0xb5, double:8.94E-322)
            r33 = 60
            long r2 = r2 / r21
            long r35 = r2 + r19
            r37 = 1
            r30 = r10
            r30.idkeyStat(r31, r33, r35, r37)
            goto L_0x0577
        L_0x0574:
            m166699p(r24)
        L_0x0577:
            boolean r2 = r5.isHeld()
            if (r2 == 0) goto L_0x05a1
            java.lang.String r7 = "com/tencent/mm/plugin/dbbackup/model/DBRecoveryTask"
            java.lang.String r8 = "doInBackground"
            java.lang.String r9 = "([Ljava/lang/Void;)Ljava/lang/Integer;"
            java.lang.String r10 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r11 = "release"
            java.lang.String r12 = "()V"
            r6 = r5
            j20.C117292a.m165357c(r6, r7, r8, r9, r10, r11, r12)
            r5.release()
            java.lang.String r7 = "com/tencent/mm/plugin/dbbackup/model/DBRecoveryTask"
            java.lang.String r8 = "doInBackground"
            java.lang.String r9 = "([Ljava/lang/Void;)Ljava/lang/Integer;"
            java.lang.String r10 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r11 = "release"
            java.lang.String r12 = "()V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x05a1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q41.C118169f.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo182960e(SQLiteDatabase sQLiteDatabase, int i) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor rawQueryWithFactory = sQLiteDatabase2.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT id,type,value FROM userinfo WHERE id=?", new String[]{Integer.toString(i)}, "userinfo", this.f353235t);
        try {
            if (rawQueryWithFactory.moveToFirst()) {
                this.f353216a.execSQL("INSERT OR REPLACE INTO userinfo (id,type,value) VALUES (?,?,?)", new Object[]{Integer.valueOf(rawQueryWithFactory.getInt(0)), Integer.valueOf(rawQueryWithFactory.getInt(1)), rawQueryWithFactory.getString(2)}, this.f353235t);
            }
            rawQueryWithFactory.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    public final int mo182961f() {
        RecoverKit recoverKit;
        Exception e;
        this.f353235t.throwIfCanceled();
        Log.m105924i("MicroMsg.DBRecoveryTask", "Begin backup recovery.");
        RecoverKit recoverKit2 = null;
        for (String next : this.f353223h) {
            try {
                recoverKit = new RecoverKit(this.f353216a, next, this.f353226k.get(0));
                try {
                    Log.m105924i("MicroMsg.DBRecoveryTask", "Loaded backup data: " + next);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                recoverKit = recoverKit2;
                e = e3;
                Log.m105920e("MicroMsg.DBRecoveryTask", "Load backup data failed: " + e.getMessage());
                recoverKit2 = recoverKit;
            }
            recoverKit2 = recoverKit;
        }
        if (recoverKit2 == null) {
            return -1;
        }
        try {
            int run = recoverKit2.run(false, this.f353235t);
            if (run == 0) {
                Log.m105924i("MicroMsg.DBRecoveryTask", "Backup recovery succeeded.");
            } else if (run == 1) {
                Log.m105924i("MicroMsg.DBRecoveryTask", "Backup recovery cancelled.");
                this.f353235t.throwIfCanceled();
            } else {
                Log.m105920e("MicroMsg.DBRecoveryTask", "Backup recovery failed.");
            }
            recoverKit2.release();
            return run;
        } catch (OperationCanceledException e4) {
            throw e4;
        } catch (Exception e5) {
            Log.m105920e("MicroMsg.DBRecoveryTask", "Failed to repair database: " + e5.getMessage());
            m166698o(4, "Failed to recover backup database", e5);
            recoverKit2.release();
            return -1;
        } catch (Throwable th) {
            recoverKit2.release();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo182962g(boolean r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Close and rename target database: "
            r0.append(r1)
            java.lang.String r1 = r9.f353217b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.DBRecoveryTask"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.wcdb.database.SQLiteDatabase r0 = r9.f353216a
            r2 = -1
            if (r0 != 0) goto L_0x001e
            return r2
        L_0x001e:
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            java.lang.String r0 = r0.getPath()
            r3.<init>((java.lang.String) r0)
            com.tencent.wcdb.database.SQLiteDatabase r0 = r9.f353216a
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x0034
            com.tencent.wcdb.database.SQLiteDatabase r0 = r9.f353216a
            r0.close()
        L_0x0034:
            r0 = 1
            r4 = 0
            if (r10 == 0) goto L_0x009f
            java.lang.String r10 = r9.f353217b
            r5 = 8
            com.tencent.p014mm.vfs.AccessControlFileSystem.m163532d(r5, r10)
            java.lang.String r10 = r9.f353217b
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)
            r6 = 0
            java.lang.String r7 = r10.getPath()
            if (r7 == 0) goto L_0x0066
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r4, r4)
            java.lang.String r8 = r10.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0066
            android.net.Uri$Builder r10 = r10.buildUpon()
            android.net.Uri$Builder r10 = r10.path(r7)
            android.net.Uri r10 = r10.build()
        L_0x0066:
            com.tencent.mm.vfs.f0$h r7 = r3.mo119989z()
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r10 = r8.mo177799l(r10, r6)
            boolean r6 = r7.mo177810a()
            if (r6 == 0) goto L_0x008a
            boolean r6 = r10.mo177810a()
            if (r6 != 0) goto L_0x007d
            goto L_0x008a
        L_0x007d:
            com.tencent.mm.vfs.FileSystem$c r6 = r10.f348991a     // Catch:{ IOException -> 0x008a }
            java.lang.String r10 = r10.f348992b     // Catch:{ IOException -> 0x008a }
            com.tencent.mm.vfs.FileSystem$c r8 = r7.f348991a     // Catch:{ IOException -> 0x008a }
            java.lang.String r7 = r7.f348992b     // Catch:{ IOException -> 0x008a }
            boolean r10 = r6.mo119946t(r10, r8, r7)     // Catch:{ IOException -> 0x008a }
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            com.tencent.p014mm.vfs.AccessControlFileSystem.m163534f(r5)
            if (r10 != 0) goto L_0x00ab
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r4] = r3
            java.lang.String r3 = r9.f353217b
            r10[r0] = r3
            java.lang.String r0 = "Cannot rename %s to %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r10)
            return r2
        L_0x009f:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r4] = r3
            java.lang.String r0 = "Delete temporary database file %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r10)
            r3.mo119966f()
        L_0x00ab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q41.C118169f.mo182962g(boolean):int");
    }

    /* renamed from: h */
    public final int mo182963h() {
        SQLiteDatabase sQLiteDatabase = this.f353216a;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                this.f353216a.close();
            }
            this.f353216a = null;
        }
        this.f353235t.throwIfCanceled();
        String str = this.f353217b + '-' + Util.getRandomString(6);
        Log.m105924i("MicroMsg.DBRecoveryTask", "Open target database: " + str);
        try {
            SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(str, this.f353224i, f353213B, (SQLiteDatabase.CursorFactory) null, (DatabaseErrorHandler) null, 1);
            this.f353216a = openOrCreateDatabase;
            DatabaseUtils.stringForQuery(openOrCreateDatabase, "PRAGMA journal_mode=OFF;", (String[]) null);
            this.f353216a.execSQL("PRAGMA synchronous=OFF;");
            return 0;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.DBRecoveryTask", "Cannot open target database '%s': %s", str, e.getMessage());
            m166698o(1, "Cannot open target database", e);
            throw e;
        }
    }

    /* renamed from: i */
    public final int mo182964i() {
        if (this.f353228m != null) {
            Log.m105924i("MicroMsg.DBRecoveryTask", "Load keys from KeyLoader");
            DBRecoveryUI$$f dBRecoveryUI$$f = (DBRecoveryUI$$f) this.f353228m;
            dBRecoveryUI$$f.mo175213a();
            ArrayList arrayList = new ArrayList();
            for (String str : dBRecoveryUI$$f.f345828a) {
                arrayList.add(C90193h.m112879g((str + dBRecoveryUI$$f.f345829b).getBytes()));
            }
            this.f353226k.addAll(arrayList);
            DBRecoveryUI$$f dBRecoveryUI$$f2 = (DBRecoveryUI$$f) this.f353228m;
            dBRecoveryUI$$f2.mo175213a();
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : dBRecoveryUI$$f2.f345828a) {
                arrayList2.add(C90193h.m112878f((str2 + dBRecoveryUI$$f2.f345829b).getBytes()).substring(0, 7).getBytes());
            }
            this.f353227l.addAll(arrayList2);
        }
        if (this.f353226k.isEmpty()) {
            this.f353226k.add((Object) null);
        }
        if (this.f353227l.isEmpty()) {
            this.f353227l.add((Object) null);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: com.tencent.wcdb.database.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0397, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0399, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x039b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x039b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:35:0x0167] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04a9  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo182965j() {
        /*
            r35 = this;
            r10 = r35
            java.lang.String r11 = "msglocalid"
            java.lang.String r12 = "1"
            java.lang.String r13 = "0"
            java.lang.String r14 = "INSERT OR REPLACE INTO userinfo (id,type,value) VALUES (?,?,?)"
            java.lang.String r1 = r10.f353218c
            r15 = 0
            if (r1 == 0) goto L_0x04bc
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0017
            goto L_0x04bc
        L_0x0017:
            long r16 = java.lang.System.nanoTime()
            r9 = 1
            int[] r8 = new int[r9]
            java.lang.String r7 = "MicroMsg.DBRecoveryTask"
            java.lang.String r1 = "Begin merging old database."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            r18 = 1000000(0xf4240, double:4.940656E-318)
            r6 = 0
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            java.lang.String r2 = "SELECT count(*) FROM message;"
            long r1 = com.tencent.wcdb.DatabaseUtils.longForQuery(r1, r2, r6)     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            int r2 = (int) r1     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            long[] r5 = new long[r9]     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            java.lang.String r3 = "SELECT max(msgId) FROM message;"
            long r3 = com.tencent.wcdb.DatabaseUtils.longForQuery(r1, r3, r6)     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            r20 = 1
            long r3 = r3 + r20
            r5[r15] = r3     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L_0x0067
            r22 = 10000000(0x989680, double:4.9406565E-317)
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 > 0) goto L_0x0067
            r3 = 10000001(0x989681, double:4.940657E-317)
            r5[r15] = r3     // Catch:{ OperationCanceledException -> 0x0060, Exception -> 0x0059, all -> 0x0053 }
            goto L_0x0067
        L_0x0053:
            r0 = move-exception
            r1 = r0
            r12 = r6
            r15 = r8
            goto L_0x048f
        L_0x0059:
            r0 = move-exception
            r1 = r0
            r12 = r6
            r13 = r7
            r15 = r8
            goto L_0x0421
        L_0x0060:
            r0 = move-exception
            r1 = r0
            r3 = r6
            r13 = r7
            r15 = r8
            goto L_0x0485
        L_0x0067:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            int r1 = r2 / 2
            int r2 = r2 + r1
            r1 = 10240(0x2800, float:1.4349E-41)
            int r1 = java.lang.Math.max(r2, r1)     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            r4.<init>(r1)     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            java.lang.String r2 = "SELECT max(id) FROM ImgInfo2;"
            long r1 = com.tencent.wcdb.DatabaseUtils.longForQuery(r1, r2, r6)     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            long r20 = r1 + r20
            q41.f$$g r1 = new q41.f$$g     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            r1.<init>(r10)     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            java.lang.String r2 = r10.f353218c     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            byte[] r3 = r10.f353225j     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            com.tencent.wcdb.database.SQLiteCipherSpec r24 = f353213B     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            r25 = 0
            r26 = 1
            r28 = 1
            r22 = r2
            r23 = r3
            r27 = r1
            com.tencent.wcdb.database.SQLiteDatabase r3 = com.tencent.wcdb.database.SQLiteDatabase.openDatabase(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ OperationCanceledException -> 0x0480, Exception -> 0x041b, all -> 0x0414 }
            java.lang.String r22 = "userinfo"
            r23 = 0
            r24 = 1
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r1 = r35
            r2 = r3
            r29 = r3
            r3 = r22
            r30 = r4
            r4 = r23
            r31 = r5
            r5 = r24
            r6 = r25
            r32 = r7
            r7 = r26
            r33 = r8
            r8 = r27
            r9 = r28
            r1.mo182958d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r1.beginTransaction()     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r3 = 8197(0x2005, float:1.1486E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r2[r15] = r3     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r9 = 1
            r2[r9] = r1     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            java.lang.String r1 = ""
            r3 = 2
            r2[r3] = r1     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r1.execSQL(r14, r2)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r1 = 15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r2[r15] = r1     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r2[r9] = r1     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r2[r3] = r13     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r1.execSQL(r14, r2)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r1 = 89
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r2[r15] = r1     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r2[r9] = r1     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r2[r3] = r12     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r1.execSQL(r14, r2)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r1 = 92
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r2[r15] = r1     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r2[r9] = r1     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r2[r3] = r12     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r1.execSQL(r14, r2)     // Catch:{ OperationCanceledException -> 0x03f5, Exception -> 0x03ea, all -> 0x03e1 }
            r12 = r29
            r10.mo182960e(r12, r3)     // Catch:{ OperationCanceledException -> 0x03df, Exception -> 0x03dd, all -> 0x03db }
            r1 = 9
            r10.mo182960e(r12, r1)     // Catch:{ OperationCanceledException -> 0x03df, Exception -> 0x03dd, all -> 0x03db }
            r1 = 42
            r10.mo182960e(r12, r1)     // Catch:{ OperationCanceledException -> 0x03df, Exception -> 0x03dd, all -> 0x03db }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x03df, Exception -> 0x03dd, all -> 0x03db }
            r1.setTransactionSuccessful()     // Catch:{ OperationCanceledException -> 0x03df, Exception -> 0x03dd, all -> 0x03db }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x03df, Exception -> 0x03dd, all -> 0x03db }
            r1.endTransaction()     // Catch:{ OperationCanceledException -> 0x03df, Exception -> 0x03dd, all -> 0x03db }
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r14 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY     // Catch:{ OperationCanceledException -> 0x03df, Exception -> 0x03dd, all -> 0x03db }
            java.lang.String r1 = "SELECT * FROM message LIMIT 0;"
            java.lang.String r2 = "message"
            r8 = 0
            com.tencent.wcdb.Cursor r7 = r12.rawQueryWithFactory(r14, r1, r8, r2)     // Catch:{ OperationCanceledException -> 0x03d4, Exception -> 0x03cd, all -> 0x03c8 }
            java.lang.String r1 = "msgId"
            int r1 = r7.getColumnIndexOrThrow(r1)     // Catch:{ OperationCanceledException -> 0x03bb, Exception -> 0x03af, all -> 0x03a5 }
            r7.close()     // Catch:{ OperationCanceledException -> 0x03bb, Exception -> 0x03af, all -> 0x03a5 }
            java.lang.String r3 = "message"
            r4 = 4
            r5 = 1
            r6 = 1
            r22 = 5
            r23 = 0
            q41.f$$a r2 = new q41.f$$a     // Catch:{ OperationCanceledException -> 0x03bb, Exception -> 0x03af, all -> 0x03a5 }
            r25 = r7
            r7 = r30
            r8 = r31
            r15 = r33
            r2.<init>(r15, r1, r8, r7)     // Catch:{ OperationCanceledException -> 0x03a1, Exception -> 0x039d, all -> 0x039b }
            r1 = r35
            r26 = r2
            r2 = r12
            r8 = r7
            r7 = r22
            r30 = r8
            r8 = r23
            r22 = r11
            r11 = 1
            r9 = r26
            r1.mo182958d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ OperationCanceledException -> 0x03a1, Exception -> 0x039d, all -> 0x039b }
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ OperationCanceledException -> 0x03a1, Exception -> 0x039d, all -> 0x039b }
            h81.h r1 = (h81.C32735h) r1     // Catch:{ OperationCanceledException -> 0x03a1, Exception -> 0x039d, all -> 0x039b }
            java.lang.String r2 = "clicfg_db_recovery_fast_unique"
            java.lang.String r1 = r1.mo58776F5(r2, r13)     // Catch:{ OperationCanceledException -> 0x03a1, Exception -> 0x039d, all -> 0x039b }
            boolean r1 = r13.equals(r1)     // Catch:{ OperationCanceledException -> 0x03a1, Exception -> 0x039d, all -> 0x039b }
            java.lang.String r2 = "Removed "
            if (r1 != 0) goto L_0x01e6
            java.lang.String r1 = "Remove duplicated messages.(fast path)"
            r13 = r32
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.String r3 = "DELETE FROM message WHERE msgSvrId != 0 AND rowid NOT IN (SELECT max(rowid) FROM message WHERE msgSvrId != 0 GROUP BY msgSvrId)"
            com.tencent.wcdb.database.SQLiteStatement r1 = r1.compileStatement(r3)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            com.tencent.wcdb.support.CancellationSignal r3 = r10.f353235t     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            int r1 = r1.executeUpdateDelete(r3)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            r3.<init>()     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            r3.append(r2)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            r3.append(r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.String r1 = " duplicated message on stage 1"
            r3.append(r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.String r1 = r3.toString()     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.String r3 = "DELETE FROM message WHERE msgSvrId = 0 AND rowid NOT IN (SELECT max(rowid) FROM message WHERE msgSvrId = 0 GROUP BY talker, createTime)"
            com.tencent.wcdb.database.SQLiteStatement r1 = r1.compileStatement(r3)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            com.tencent.wcdb.support.CancellationSignal r3 = r10.f353235t     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            int r1 = r1.executeUpdateDelete(r3)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            r3.<init>()     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            r3.append(r2)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            r3.append(r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.String r1 = " duplicated message on stage 2"
            r3.append(r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.String r1 = r3.toString()     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            goto L_0x0212
        L_0x01e6:
            r13 = r32
            java.lang.String r1 = "Remove duplicated messages.(slow path)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.String r3 = "DELETE FROM message WHERE rowid NOT IN (SELECT max(rowid) FROM message GROUP BY talker,msgSvrId,createTime)"
            com.tencent.wcdb.database.SQLiteStatement r1 = r1.compileStatement(r3)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            com.tencent.wcdb.support.CancellationSignal r3 = r10.f353235t     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            int r1 = r1.executeUpdateDelete(r3)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            r3.<init>()     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            r3.append(r2)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            r3.append(r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.String r1 = " duplicated message"
            r3.append(r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.String r1 = r3.toString()     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
        L_0x0212:
            java.lang.String r1 = "SELECT * FROM rconversation LIMIT 0;"
            java.lang.String r2 = "rconversation"
            r9 = 0
            com.tencent.wcdb.Cursor r8 = r12.rawQueryWithFactory(r14, r1, r9, r2)     // Catch:{ OperationCanceledException -> 0x0399, Exception -> 0x0397, all -> 0x039b }
            java.lang.String r1 = "username"
            int r6 = r8.getColumnIndexOrThrow(r1)     // Catch:{ OperationCanceledException -> 0x038e, Exception -> 0x0386, all -> 0x037e }
            java.lang.String r1 = "msgCount"
            int r7 = r8.getColumnIndexOrThrow(r1)     // Catch:{ OperationCanceledException -> 0x038e, Exception -> 0x0386, all -> 0x037e }
            java.lang.String r1 = "flag"
            int r4 = r8.getColumnIndexOrThrow(r1)     // Catch:{ OperationCanceledException -> 0x038e, Exception -> 0x0386, all -> 0x037e }
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ OperationCanceledException -> 0x038e, Exception -> 0x0386, all -> 0x037e }
            r8.close()     // Catch:{ OperationCanceledException -> 0x038e, Exception -> 0x0386, all -> 0x037e }
            java.lang.String r11 = "rconversation"
            r23 = 5
            r25 = 1
            r26 = 1
            r27 = 0
            r28 = 0
            q41.f$$b r29 = new q41.f$$b     // Catch:{ OperationCanceledException -> 0x038e, Exception -> 0x0386, all -> 0x037e }
            r1 = r29
            r2 = r35
            r3 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ OperationCanceledException -> 0x038e, Exception -> 0x0386, all -> 0x037e }
            r1 = r35
            r2 = r12
            r3 = r11
            r4 = r23
            r5 = r25
            r6 = r26
            r7 = r27
            r11 = r8
            r8 = r28
            r23 = r11
            r11 = r9
            r9 = r29
            r1.mo182958d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ OperationCanceledException -> 0x037c, Exception -> 0x037a, all -> 0x0378 }
            java.lang.String r1 = "SELECT * FROM ImgInfo2 LIMIT 0;"
            java.lang.String r2 = "ImgInfo2"
            com.tencent.wcdb.Cursor r9 = r12.rawQueryWithFactory(r14, r1, r11, r2)     // Catch:{ OperationCanceledException -> 0x037c, Exception -> 0x037a, all -> 0x0378 }
            java.lang.String r1 = "id"
            int r3 = r9.getColumnIndexOrThrow(r1)     // Catch:{ OperationCanceledException -> 0x036f, Exception -> 0x0367, all -> 0x035f }
            r8 = r22
            int r7 = r9.getColumnIndexOrThrow(r8)     // Catch:{ OperationCanceledException -> 0x036f, Exception -> 0x0367, all -> 0x035f }
            java.lang.String r1 = "reserved1"
            int r6 = r9.getColumnIndexOrThrow(r1)     // Catch:{ OperationCanceledException -> 0x036f, Exception -> 0x0367, all -> 0x035f }
            r9.close()     // Catch:{ OperationCanceledException -> 0x036f, Exception -> 0x0367, all -> 0x035f }
            java.lang.String r22 = "ImgInfo2"
            r23 = 5
            r25 = 1
            r26 = 1
            r27 = 0
            r28 = 0
            q41.f$$c r29 = new q41.f$$c     // Catch:{ OperationCanceledException -> 0x036f, Exception -> 0x0367, all -> 0x035f }
            r1 = r29
            r2 = r15
            r4 = r20
            r34 = r8
            r8 = r30
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch:{ OperationCanceledException -> 0x036f, Exception -> 0x0367, all -> 0x035f }
            r1 = r35
            r2 = r12
            r3 = r22
            r4 = r23
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r20 = r9
            r9 = r29
            r1.mo182958d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ OperationCanceledException -> 0x035d, Exception -> 0x035b, all -> 0x0359 }
            java.lang.String r1 = "SELECT * FROM videoinfo2 LIMIT 0;"
            java.lang.String r2 = "videoinfo2"
            com.tencent.wcdb.Cursor r9 = r12.rawQueryWithFactory(r14, r1, r11, r2)     // Catch:{ OperationCanceledException -> 0x035d, Exception -> 0x035b, all -> 0x0359 }
            r1 = r34
            int r1 = r9.getColumnIndexOrThrow(r1)     // Catch:{ OperationCanceledException -> 0x0350, Exception -> 0x0348, all -> 0x0340 }
            r9.close()     // Catch:{ OperationCanceledException -> 0x0350, Exception -> 0x0348, all -> 0x0340 }
            java.lang.String r3 = "videoinfo2"
            r4 = 5
            r5 = 1
            r6 = 1
            r7 = 0
            r8 = 0
            q41.f$$d r2 = new q41.f$$d     // Catch:{ OperationCanceledException -> 0x0350, Exception -> 0x0348, all -> 0x0340 }
            r11 = r30
            r2.<init>(r15, r1, r11)     // Catch:{ OperationCanceledException -> 0x0350, Exception -> 0x0348, all -> 0x0340 }
            r1 = r35
            r20 = r2
            r2 = r12
            r21 = r9
            r9 = r20
            r1.mo182958d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ OperationCanceledException -> 0x033e, Exception -> 0x033c, all -> 0x033a }
            java.lang.String r1 = "SELECT * FROM appattach LIMIT 0;"
            java.lang.String r2 = "appattach"
            r3 = 0
            com.tencent.wcdb.Cursor r14 = r12.rawQueryWithFactory(r14, r1, r3, r2)     // Catch:{ OperationCanceledException -> 0x033e, Exception -> 0x033c, all -> 0x033a }
            java.lang.String r1 = "msgInfoId"
            int r1 = r14.getColumnIndexOrThrow(r1)     // Catch:{ OperationCanceledException -> 0x0334, Exception -> 0x032f, all -> 0x032a }
            r14.close()     // Catch:{ OperationCanceledException -> 0x0334, Exception -> 0x032f, all -> 0x032a }
            java.lang.String r3 = "appattach"
            r4 = 5
            r5 = 1
            r6 = 1
            r7 = 0
            r8 = 0
            q41.f$$e r9 = new q41.f$$e     // Catch:{ OperationCanceledException -> 0x0334, Exception -> 0x032f, all -> 0x032a }
            r9.<init>(r15, r1, r11)     // Catch:{ OperationCanceledException -> 0x0334, Exception -> 0x032f, all -> 0x032a }
            r1 = r35
            r2 = r12
            r1.mo182958d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ OperationCanceledException -> 0x0334, Exception -> 0x032f, all -> 0x032a }
            boolean r1 = r14.isClosed()
            if (r1 != 0) goto L_0x030a
            r14.close()
        L_0x030a:
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a
            boolean r1 = r1.inTransaction()
            if (r1 == 0) goto L_0x0317
            com.tencent.wcdb.database.SQLiteDatabase r1 = r10.f353216a
            r1.endTransaction()
        L_0x0317:
            r12.close()
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r16
            long r1 = r1 / r18
            r10.f353215A = r1
            r1 = 0
            r2 = r15[r1]
        L_0x0327:
            r10.f353241z = r2
            return r1
        L_0x032a:
            r0 = move-exception
            r1 = r0
            r6 = r14
            goto L_0x048f
        L_0x032f:
            r0 = move-exception
            r1 = r0
            r6 = r14
            goto L_0x0421
        L_0x0334:
            r0 = move-exception
            r1 = r0
            r6 = r12
            r3 = r14
            goto L_0x0485
        L_0x033a:
            r0 = move-exception
            goto L_0x0343
        L_0x033c:
            r0 = move-exception
            goto L_0x034b
        L_0x033e:
            r0 = move-exception
            goto L_0x0353
        L_0x0340:
            r0 = move-exception
            r21 = r9
        L_0x0343:
            r1 = r0
            r6 = r21
            goto L_0x048f
        L_0x0348:
            r0 = move-exception
            r21 = r9
        L_0x034b:
            r1 = r0
            r6 = r21
            goto L_0x0421
        L_0x0350:
            r0 = move-exception
            r21 = r9
        L_0x0353:
            r1 = r0
            r6 = r12
            r3 = r21
            goto L_0x0485
        L_0x0359:
            r0 = move-exception
            goto L_0x0362
        L_0x035b:
            r0 = move-exception
            goto L_0x036a
        L_0x035d:
            r0 = move-exception
            goto L_0x0372
        L_0x035f:
            r0 = move-exception
            r20 = r9
        L_0x0362:
            r1 = r0
            r6 = r20
            goto L_0x048f
        L_0x0367:
            r0 = move-exception
            r20 = r9
        L_0x036a:
            r1 = r0
            r6 = r20
            goto L_0x0421
        L_0x036f:
            r0 = move-exception
            r20 = r9
        L_0x0372:
            r1 = r0
            r6 = r12
            r3 = r20
            goto L_0x0485
        L_0x0378:
            r0 = move-exception
            goto L_0x0381
        L_0x037a:
            r0 = move-exception
            goto L_0x0389
        L_0x037c:
            r0 = move-exception
            goto L_0x0391
        L_0x037e:
            r0 = move-exception
            r23 = r8
        L_0x0381:
            r1 = r0
            r6 = r23
            goto L_0x048f
        L_0x0386:
            r0 = move-exception
            r23 = r8
        L_0x0389:
            r1 = r0
            r6 = r23
            goto L_0x0421
        L_0x038e:
            r0 = move-exception
            r23 = r8
        L_0x0391:
            r1 = r0
            r6 = r12
            r3 = r23
            goto L_0x0485
        L_0x0397:
            r0 = move-exception
            goto L_0x03b6
        L_0x0399:
            r0 = move-exception
            goto L_0x03c2
        L_0x039b:
            r0 = move-exception
            goto L_0x03aa
        L_0x039d:
            r0 = move-exception
            r13 = r32
            goto L_0x03b6
        L_0x03a1:
            r0 = move-exception
            r13 = r32
            goto L_0x03c2
        L_0x03a5:
            r0 = move-exception
            r25 = r7
            r15 = r33
        L_0x03aa:
            r1 = r0
            r6 = r25
            goto L_0x048f
        L_0x03af:
            r0 = move-exception
            r25 = r7
            r13 = r32
            r15 = r33
        L_0x03b6:
            r1 = r0
            r6 = r25
            goto L_0x0421
        L_0x03bb:
            r0 = move-exception
            r25 = r7
            r13 = r32
            r15 = r33
        L_0x03c2:
            r1 = r0
            r6 = r12
            r3 = r25
            goto L_0x0485
        L_0x03c8:
            r0 = move-exception
            r3 = r8
            r15 = r33
            goto L_0x03e7
        L_0x03cd:
            r0 = move-exception
            r3 = r8
            r13 = r32
            r15 = r33
            goto L_0x03f2
        L_0x03d4:
            r0 = move-exception
            r3 = r8
            r13 = r32
            r15 = r33
            goto L_0x0410
        L_0x03db:
            r0 = move-exception
            goto L_0x03e4
        L_0x03dd:
            r0 = move-exception
            goto L_0x03ed
        L_0x03df:
            r0 = move-exception
            goto L_0x03f8
        L_0x03e1:
            r0 = move-exception
            r12 = r29
        L_0x03e4:
            r15 = r33
            r3 = 0
        L_0x03e7:
            r1 = r0
            goto L_0x048e
        L_0x03ea:
            r0 = move-exception
            r12 = r29
        L_0x03ed:
            r13 = r32
            r15 = r33
            r3 = 0
        L_0x03f2:
            r1 = r0
            r6 = r3
            goto L_0x0421
        L_0x03f5:
            r0 = move-exception
            r12 = r29
        L_0x03f8:
            r13 = r32
            r15 = r33
            r3 = 0
            goto L_0x0410
        L_0x03fe:
            r0 = move-exception
            r12 = r3
            r3 = r6
            r15 = r8
            goto L_0x047e
        L_0x0404:
            r0 = move-exception
            r12 = r3
            r3 = r6
            r13 = r7
            r15 = r8
            r1 = r0
            goto L_0x0421
        L_0x040b:
            r0 = move-exception
            r12 = r3
            r3 = r6
            r13 = r7
            r15 = r8
        L_0x0410:
            r1 = r0
            r6 = r12
            goto L_0x0485
        L_0x0414:
            r0 = move-exception
            r3 = r6
            r15 = r8
            r1 = r0
            r12 = r6
            goto L_0x048f
        L_0x041b:
            r0 = move-exception
            r3 = r6
            r13 = r7
            r15 = r8
            r1 = r0
            r12 = r6
        L_0x0421:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x047d }
            r2.<init>()     // Catch:{ all -> 0x047d }
            java.lang.String r3 = "Message migration failed: "
            r2.append(r3)     // Catch:{ all -> 0x047d }
            java.lang.String r3 = r1.getMessage()     // Catch:{ all -> 0x047d }
            r2.append(r3)     // Catch:{ all -> 0x047d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x047d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r2)     // Catch:{ all -> 0x047d }
            r2 = 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x047d }
            r3.<init>()     // Catch:{ all -> 0x047d }
            java.lang.String r4 = "Message migration failed, ignorable: "
            r3.append(r4)     // Catch:{ all -> 0x047d }
            boolean r4 = r10.f353229n     // Catch:{ all -> 0x047d }
            r3.append(r4)     // Catch:{ all -> 0x047d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x047d }
            m166698o(r2, r3, r1)     // Catch:{ all -> 0x047d }
            r1 = -1
            if (r6 == 0) goto L_0x045c
            boolean r2 = r6.isClosed()
            if (r2 != 0) goto L_0x045c
            r6.close()
        L_0x045c:
            com.tencent.wcdb.database.SQLiteDatabase r2 = r10.f353216a
            boolean r2 = r2.inTransaction()
            if (r2 == 0) goto L_0x0469
            com.tencent.wcdb.database.SQLiteDatabase r2 = r10.f353216a
            r2.endTransaction()
        L_0x0469:
            if (r12 == 0) goto L_0x046e
            r12.close()
        L_0x046e:
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r16
            long r2 = r2 / r18
            r10.f353215A = r2
            r2 = 0
            r2 = r15[r2]
            goto L_0x0327
        L_0x047d:
            r0 = move-exception
        L_0x047e:
            r1 = r0
            goto L_0x048f
        L_0x0480:
            r0 = move-exception
            r3 = r6
            r13 = r7
            r15 = r8
            r1 = r0
        L_0x0485:
            java.lang.String r2 = "Database merging cancelled."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)     // Catch:{ all -> 0x048b }
            throw r1     // Catch:{ all -> 0x048b }
        L_0x048b:
            r0 = move-exception
            r1 = r0
            r12 = r6
        L_0x048e:
            r6 = r3
        L_0x048f:
            if (r6 == 0) goto L_0x049a
            boolean r2 = r6.isClosed()
            if (r2 != 0) goto L_0x049a
            r6.close()
        L_0x049a:
            com.tencent.wcdb.database.SQLiteDatabase r2 = r10.f353216a
            boolean r2 = r2.inTransaction()
            if (r2 == 0) goto L_0x04a7
            com.tencent.wcdb.database.SQLiteDatabase r2 = r10.f353216a
            r2.endTransaction()
        L_0x04a7:
            if (r12 == 0) goto L_0x04ac
            r12.close()
        L_0x04ac:
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r16
            long r2 = r2 / r18
            r10.f353215A = r2
            r2 = 0
            r2 = r15[r2]
            r10.f353241z = r2
            throw r1
        L_0x04bc:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q41.C118169f.mo182965j():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        r0 = r0.f348991a.mo119944p(r0.f348992b);
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad A[SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo182966k() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "MicroMsg.DBRecoveryTask"
            java.lang.String r0 = "Load and check database statistics."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r0 = r1.f353217b
            if (r0 == 0) goto L_0x0104
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0015
            goto L_0x0104
        L_0x0015:
            r3 = 0
            r1.f353231p = r3
            r0 = 300000(0x493e0, float:4.2039E-40)
            r1.f353232q = r0
            java.lang.String r0 = r1.f353220e
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106432N(r0)     // Catch:{ FileNotFoundException -> 0x0047, Exception -> 0x003e }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ FileNotFoundException -> 0x0047, Exception -> 0x003e }
            r7.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0047, Exception -> 0x003e }
            java.lang.String r0 = "message"
            int r0 = r7.getInt(r0)     // Catch:{ FileNotFoundException -> 0x0047, Exception -> 0x003e }
            r1.f353232q = r0     // Catch:{ FileNotFoundException -> 0x0047, Exception -> 0x003e }
            r1.f353231p = r6     // Catch:{ FileNotFoundException -> 0x0047, Exception -> 0x003e }
            java.lang.String r0 = "dbSize"
            long r7 = r7.getLong(r0)     // Catch:{ FileNotFoundException -> 0x0047, Exception -> 0x003e }
            goto L_0x005e
        L_0x003e:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = "Cannot read statistics from file."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r8, r7)
            goto L_0x005d
        L_0x0047:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "Statistics file not found: "
            r0.append(r7)
            java.lang.String r7 = r1.f353220e
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x005d:
            r7 = r4
        L_0x005e:
            java.lang.String r0 = r1.f353219d
            if (r0 == 0) goto L_0x0069
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r1.f353237v = r9
            goto L_0x006a
        L_0x0069:
            r9 = r4
        L_0x006a:
            long r11 = java.lang.Math.max(r7, r9)
            r1.f353233r = r11
            r13 = 10
            long r13 = r11 / r13
            r15 = r7
            r6 = 67108864(0x4000000, double:3.31561842E-316)
            long r6 = java.lang.Math.max(r13, r6)
            long r11 = r11 + r6
            r1.f353233r = r11
            java.lang.String r0 = r1.f353217b
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            r6.<init>((java.lang.String) r0)
            boolean r0 = r6.mo119977o()
            if (r0 != 0) goto L_0x0090
            com.tencent.mm.vfs.m1 r6 = r6.mo119974l()
        L_0x0090:
            com.tencent.mm.vfs.f0$h r0 = r6.mo119989z()
            boolean r7 = r0.mo177810a()
            if (r7 != 0) goto L_0x009b
            goto L_0x00a5
        L_0x009b:
            com.tencent.mm.vfs.FileSystem$c r7 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            com.tencent.mm.vfs.FileSystem$a r0 = r7.mo119944p(r0)
            if (r0 != 0) goto L_0x00a7
        L_0x00a5:
            r7 = r4
            goto L_0x00a9
        L_0x00a7:
            long r7 = r0.f348761c
        L_0x00a9:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00af
            r4 = r7
            goto L_0x00b5
        L_0x00af:
            com.tencent.mm.vfs.m1 r6 = r6.mo119974l()
            if (r6 != 0) goto L_0x0090
        L_0x00b5:
            r1.f353234s = r4
            long r6 = r1.f353233r
            r0 = 2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0[r3] = r4
            long r3 = r1.f353234s
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r8 = 1
            r0[r8] = r3
            java.lang.String r3 = "Space not enough for recovery (%d required, %d available)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r0)
            r0 = -2
            return r0
        L_0x00d6:
            r8 = 1
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            r4[r3] = r5
            long r5 = r1.f353234s
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r8] = r5
            int r5 = r1.f353232q
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r0] = r5
            r0 = 3
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r4[r0] = r5
            r0 = 4
            java.lang.Long r5 = java.lang.Long.valueOf(r15)
            r4[r0] = r5
            java.lang.String r0 = "Statistics check OK, required space: %d, available space %d, message count: %d, corrupted db size: %d, latest statistic db size: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)
            return r3
        L_0x0104:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q41.C118169f.mo182966k():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x02c1  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:79:0x0290=Splitter:B:79:0x0290, B:87:0x02cf=Splitter:B:87:0x02cf} */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo182967l() {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r2 = ", key: #"
            com.tencent.wcdb.support.CancellationSignal r0 = r1.f353235t
            r0.throwIfCanceled()
            java.lang.String r3 = "message"
            java.lang.String r4 = "ImgInfo2"
            java.lang.String r5 = "videoinfo2"
            java.lang.String r6 = "EmojiInfo"
            java.lang.String r7 = "rconversation"
            java.lang.String r8 = "appattach"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8}
            long r4 = java.lang.System.nanoTime()
            java.util.List<java.lang.String> r0 = r1.f353221f
            java.util.Iterator r6 = r0.iterator()
            r7 = 0
            r0 = r7
        L_0x0027:
            boolean r8 = r6.hasNext()
            java.lang.String r9 = ", path: "
            r10 = 0
            java.lang.String r11 = "MicroMsg.DBRecoveryTask"
            if (r8 == 0) goto L_0x00b4
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r12 != 0) goto L_0x0053
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Saved master file not exist: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r8)
            goto L_0x0027
        L_0x0053:
            r12 = r0
            r13 = 0
        L_0x0055:
            java.util.List<byte[]> r0 = r1.f353226k
            int r0 = r0.size()
            if (r13 >= r0) goto L_0x00b1
            java.util.List<byte[]> r0 = r1.f353226k
            java.lang.Object r0 = r0.get(r13)
            byte[] r0 = (byte[]) r0
            java.lang.String r14 = p823sg.C48380r.m53726a(r8, r10)     // Catch:{ Exception -> 0x0089 }
            com.tencent.wcdb.repair.RepairKit$MasterInfo r12 = com.tencent.wcdb.repair.RepairKit.MasterInfo.load(r14, r0, r3)     // Catch:{ Exception -> 0x0089 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089 }
            r0.<init>()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r14 = "Loaded saved master: "
            r0.append(r14)     // Catch:{ Exception -> 0x0089 }
            r0.append(r8)     // Catch:{ Exception -> 0x0089 }
            r0.append(r2)     // Catch:{ Exception -> 0x0089 }
            r0.append(r13)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0089 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x0089 }
            r0 = r12
            goto L_0x00b4
        L_0x0089:
            r0 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Failed to load saved master: "
            r14.append(r15)
            java.lang.String r0 = r0.getMessage()
            r14.append(r0)
            r14.append(r9)
            r14.append(r8)
            r14.append(r2)
            r14.append(r13)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            int r13 = r13 + 1
            goto L_0x0055
        L_0x00b1:
            r0 = r12
            goto L_0x0027
        L_0x00b4:
            if (r0 != 0) goto L_0x00c0
            com.tencent.wcdb.repair.RepairKit$MasterInfo r0 = com.tencent.wcdb.repair.RepairKit.MasterInfo.make(r3)
            java.lang.String r2 = "Saved master not available."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r2)
            goto L_0x00cc
        L_0x00c0:
            java.lang.String r2 = "Use backup saved master."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            long r2 = r1.f353236u
            r12 = 1
            long r2 = r2 | r12
            r1.f353236u = r2
        L_0x00cc:
            r2 = r0
            java.util.List<java.lang.String> r0 = r1.f353222g
            java.util.Iterator r3 = r0.iterator()
            r6 = r7
        L_0x00d4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r3.next()
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r0 != 0) goto L_0x00fc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "Leaf info file not exist: "
            r0.append(r12)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x00d4
        L_0x00fc:
            com.tencent.wcdb.repair.RepairKit$LeafInfo r6 = com.tencent.wcdb.repair.RepairKit.LeafInfo.load(r8)     // Catch:{ Exception -> 0x0115 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0115 }
            r0.<init>()     // Catch:{ Exception -> 0x0115 }
            java.lang.String r12 = "Loaded leaf info: "
            r0.append(r12)     // Catch:{ Exception -> 0x0115 }
            r0.append(r8)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0115 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x0115 }
            goto L_0x0135
        L_0x0115:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Failed to load leaf info: "
            r12.append(r13)
            java.lang.String r0 = r0.getMessage()
            r12.append(r0)
            r12.append(r9)
            r12.append(r8)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            goto L_0x00d4
        L_0x0135:
            if (r6 != 0) goto L_0x013d
            java.lang.String r0 = "Leaf info not available."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            goto L_0x0149
        L_0x013d:
            java.lang.String r0 = "Use backup leaf info."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            long r8 = r1.f353236u
            r12 = 2
            long r8 = r8 | r12
            r1.f353236u = r8
        L_0x0149:
            r0 = 1
            int[] r3 = new int[r0]
            r3[r10] = r10
            r8 = 2
            r18 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r9.<init>()     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.String r12 = "Begin repair: "
            r9.append(r12)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.String r12 = r1.f353219d     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r9.append(r12)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.String r9 = r9.toString()     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r9 = 0
        L_0x0169:
            java.util.List<byte[]> r12 = r1.f353227l     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            int r12 = r12.size()     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            if (r9 >= r12) goto L_0x01cc
            java.util.List<byte[]> r12 = r1.f353227l     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.Object r12 = r12.get(r9)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r14 = r12
            byte[] r14 = (byte[]) r14     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            com.tencent.wcdb.repair.RepairKit r20 = new com.tencent.wcdb.repair.RepairKit     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.String r13 = r1.f353219d     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            com.tencent.wcdb.database.SQLiteCipherSpec r15 = f353213B     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r12 = r20
            r16 = r2
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            boolean r12 = r20.isHeaderCorrupted()     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            if (r12 != 0) goto L_0x01a6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            r7.<init>()     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            java.lang.String r12 = "Opened corrupted database with key #"
            r7.append(r12)     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            r7.append(r9)     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            java.lang.String r7 = r7.toString()     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            r7 = r20
            goto L_0x01cc
        L_0x01a6:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            r12.<init>()     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            java.lang.String r13 = "Header check failed with key #"
            r12.append(r13)     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            r12.append(r9)     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            java.lang.String r12 = r12.toString()     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r12)     // Catch:{ OperationCanceledException -> 0x01c7, RuntimeException -> 0x01c2, all -> 0x01bd }
            int r9 = r9 + 1
            goto L_0x0169
        L_0x01bd:
            r0 = move-exception
            r7 = r20
            goto L_0x02d0
        L_0x01c2:
            r0 = move-exception
            r7 = r20
            goto L_0x0290
        L_0x01c7:
            r0 = move-exception
            r7 = r20
            goto L_0x02cf
        L_0x01cc:
            if (r7 != 0) goto L_0x01eb
            java.lang.String r9 = "No correct key found, assume #0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            com.tencent.wcdb.repair.RepairKit r9 = new com.tencent.wcdb.repair.RepairKit     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.String r13 = r1.f353219d     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.util.List<byte[]> r12 = r1.f353227l     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.Object r12 = r12.get(r10)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r14 = r12
            byte[] r14 = (byte[]) r14     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            com.tencent.wcdb.database.SQLiteCipherSpec r15 = f353213B     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r12 = r9
            r16 = r2
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r7 = r9
        L_0x01eb:
            q41.f$$f r2 = new q41.f$$f     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r2.<init>(r1, r3)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r7.setCallback(r2)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            com.tencent.wcdb.database.SQLiteDatabase r2 = r1.f353216a     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            com.tencent.wcdb.support.CancellationSignal r6 = r1.f353235t     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            int r2 = r7.output(r2, r10, r6)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            com.tencent.wcdb.repair.RepairKit$Statistics r6 = r7.getStatistics()     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r1.f353238w = r6     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            if (r2 != 0) goto L_0x0244
            boolean r6 = r7.isHeaderCorrupted()     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            if (r6 == 0) goto L_0x0218
            boolean r6 = r7.isDataCorrupted()     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            if (r6 != 0) goto L_0x0210
            goto L_0x0218
        L_0x0210:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.String r2 = "No data is successfully recovered."
            r0.<init>(r2)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            throw r0     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
        L_0x0218:
            com.tencent.wcdb.repair.RepairKit$Statistics r6 = r1.f353238w     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.String r9 = "Repair succeeded, total: %d, valid: %d, parsed: %d, corrupted: %d"
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            int r13 = r6.totalPages     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r12[r10] = r13     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            int r13 = r6.validPages     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r12[r0] = r13     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            int r0 = r6.parsedPages     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r12[r8] = r0     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r0 = 3
            int r6 = r6.damagedPages     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r12[r0] = r6     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r9, r12)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            goto L_0x0250
        L_0x0244:
            if (r2 != r0) goto L_0x0285
            java.lang.String r0 = "Repair cancelled."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            com.tencent.wcdb.support.CancellationSignal r0 = r1.f353235t     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r0.throwIfCanceled()     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
        L_0x0250:
            boolean r0 = r1.f353231p     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            if (r0 == 0) goto L_0x0274
            r0 = r3[r10]     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            float r6 = (float) r0     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            int r9 = r1.f353232q     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            float r12 = (float) r9     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            float r6 = r6 / r12
            r12 = 1069547520(0x3fc00000, float:1.5)
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x0274
            kj2.d r20 = kj2.C117407d.INSTANCE     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r21 = 181(0xb5, float:2.54E-43)
            r22 = 181(0xb5, float:2.54E-43)
            r23 = 62
            r24 = 63
            r27 = 1
            r25 = r9
            r26 = r0
            r20.mo160130g(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
        L_0x0274:
            r0 = r3[r10]     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r1.f353239x = r0     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            r7.release()
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r4
            long r6 = r6 / r18
            r1.f353240y = r6
            return r2
        L_0x0285:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            java.lang.String r2 = "Repair failed."
            r0.<init>(r2)     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
            throw r0     // Catch:{ OperationCanceledException -> 0x02ce, RuntimeException -> 0x028f }
        L_0x028d:
            r0 = move-exception
            goto L_0x02d0
        L_0x028f:
            r0 = move-exception
        L_0x0290:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x028d }
            r2.<init>()     // Catch:{ all -> 0x028d }
            java.lang.String r3 = "Failed to repair database: "
            r2.append(r3)     // Catch:{ all -> 0x028d }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x028d }
            r2.append(r3)     // Catch:{ all -> 0x028d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x028d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r2)     // Catch:{ all -> 0x028d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x028d }
            r2.<init>()     // Catch:{ all -> 0x028d }
            java.lang.String r3 = "Failed to repair database => statFlags: "
            r2.append(r3)     // Catch:{ all -> 0x028d }
            long r9 = r1.f353236u     // Catch:{ all -> 0x028d }
            r2.append(r9)     // Catch:{ all -> 0x028d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x028d }
            m166698o(r8, r2, r0)     // Catch:{ all -> 0x028d }
            r0 = -1
            if (r7 == 0) goto L_0x02c4
            r7.release()
        L_0x02c4:
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r4
            long r2 = r2 / r18
            r1.f353240y = r2
            return r0
        L_0x02ce:
            r0 = move-exception
        L_0x02cf:
            throw r0     // Catch:{ all -> 0x028d }
        L_0x02d0:
            if (r7 == 0) goto L_0x02d5
            r7.release()
        L_0x02d5:
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r4
            long r2 = r2 / r18
            r1.f353240y = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q41.C118169f.mo182967l():int");
    }

    /* renamed from: m */
    public final int mo182968m() {
        try {
            this.f353216a.execSQL("DELETE FROM rconversation WHERE typeof(flag) <> 'integer';", (Object[]) null, this.f353235t);
            return 0;
        } catch (OperationCanceledException e) {
            throw e;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.DBRecoveryTask", e2, "Verification failed", new Object[0]);
            return -1;
        }
    }

    public void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (this.f353230o != null) {
            int intValue = num.intValue();
            if (intValue == -2) {
                f$$h f__h = this.f353230o;
                long j = this.f353234s;
                long j2 = this.f353233r;
                DBRecoveryUI dBRecoveryUI = (DBRecoveryUI) f__h;
                dBRecoveryUI.f345819o = false;
                dBRecoveryUI.f345811d = null;
                dBRecoveryUI.mo175205I7();
                C76879j.m92713G(dBRecoveryUI, dBRecoveryUI.getString(C0966R.string.f360330bx3, new Object[]{Long.valueOf((j2 / 1024) / 1024), Long.valueOf((j / 1024) / 1024)}), (String) null, false, dBRecoveryUI.f345820p);
            } else if (intValue == 0) {
                DBRecoveryUI dBRecoveryUI2 = (DBRecoveryUI) this.f353230o;
                dBRecoveryUI2.f345819o = false;
                dBRecoveryUI2.f345811d = null;
                Log.m105924i("MicroMsg.DBRecoveryUI", "Recovery succeeded");
                MMHandlerThread.postToMainThreadDelayed(new DBRecoveryUI$$a(dBRecoveryUI2, C76879j.m92744o(dBRecoveryUI2, C0966R.string.bx4, 0, false, new C115390h(dBRecoveryUI2))), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            } else if (intValue != 1) {
                DBRecoveryUI dBRecoveryUI3 = (DBRecoveryUI) this.f353230o;
                dBRecoveryUI3.f345819o = false;
                dBRecoveryUI3.f345811d = null;
                Log.m105920e("MicroMsg.DBRecoveryUI", "Recovery failed.");
                dBRecoveryUI3.mo175205I7();
                C76879j.m92744o(dBRecoveryUI3, C0966R.string.f360328bx0, 0, false, dBRecoveryUI3.f345820p);
            } else {
                DBRecoveryUI dBRecoveryUI4 = (DBRecoveryUI) this.f353230o;
                dBRecoveryUI4.f345819o = false;
                dBRecoveryUI4.f345811d = null;
                Log.m105924i("MicroMsg.DBRecoveryUI", "Recovery cancelled.");
                dBRecoveryUI4.mo175205I7();
                C76879j.m92744o(dBRecoveryUI4, C0966R.string.bwz, 0, false, dBRecoveryUI4.f345820p);
            }
        }
    }

    public void onProgressUpdate(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        if (this.f353230o != null) {
            int intValue = numArr.length >= 1 ? numArr[0].intValue() : 0;
            int intValue2 = numArr.length >= 2 ? numArr[1].intValue() : 0;
            int intValue3 = numArr.length >= 3 ? numArr[2].intValue() : 0;
            DBRecoveryUI dBRecoveryUI = (DBRecoveryUI) this.f353230o;
            dBRecoveryUI.getClass();
            if (intValue > 0 && intValue <= 6) {
                if (intValue3 > 0) {
                    int[] iArr = DBRecoveryUI.f345810q;
                    int i = iArr[intValue - 1];
                    int i2 = iArr[intValue] - i;
                    float f = ((float) intValue2) / ((float) intValue3);
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    dBRecoveryUI.f345814g.setProgress((int) (((float) i) + (f * ((float) i2))));
                } else if (dBRecoveryUI.f345818n != intValue) {
                    dBRecoveryUI.f345814g.setProgress(DBRecoveryUI.f345810q[intValue - 1]);
                }
                dBRecoveryUI.f345818n = intValue;
                dBRecoveryUI.f345815h.setText(String.format(dBRecoveryUI.getResources().getStringArray(C0966R.array.f2572f)[intValue - 1], new Object[]{Integer.valueOf(intValue2)}));
            }
        }
    }
}
