package zh3;

import a70.C112760b;
import ai3.C112793f;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.util.Pair;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.AccessControlFileSystem;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteCheckpointListener;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteCursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseConfiguration;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteGlobal;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kj2.C10282b;
import kj2.C117407d;
import zt3.C119157j;

/* renamed from: zh3.e */
public class C119118e implements SQLiteTrace, DatabaseErrorHandler {

    /* renamed from: f */
    public static final Set<String> f356726f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g */
    public static Map<String, C119118e> f356727g = new HashMap();

    /* renamed from: h */
    public static Map<String, C119118e> f356728h = new HashMap();

    /* renamed from: i */
    public static final SharedPreferences f356729i;

    /* renamed from: j */
    public static int f356730j;

    /* renamed from: k */
    public static final SQLiteCipherSpec f356731k = new SQLiteCipherSpec().setPageSize(1024).setSQLCipherVersion(1);

    /* renamed from: l */
    public static final SQLiteCheckpointListener f356732l;

    /* renamed from: m */
    public static final e$$g f356733m = new e$$g();

    /* renamed from: n */
    public static boolean f356734n;

    /* renamed from: o */
    public static boolean f356735o;

    /* renamed from: p */
    public static SQLiteTrace f356736p;

    /* renamed from: q */
    public static SQLiteTrace f356737q;

    /* renamed from: r */
    public static C10282b f356738r = new C10282b(463);

    /* renamed from: s */
    public static final int[] f356739s = {27, 39, 24, 36, 27, 39, 48, 54, 33, 45, 30, 42, 33, 45, 51, 57};

    /* renamed from: t */
    public static final Pattern f356740t;

    /* renamed from: u */
    public static final String[] f356741u = {"messagecreatetaklertimeindex", "messagecreatetaklertypetimeindex", "messagecreatetimeindex", "messageidindex", "messagemessagetalkerflagmsgseqindex", "messagemessagetalkermsgseqindex", "messagesendcreatetimeindex", "messagesvridindex", "messagetalkercreatetimeissendindex", "messagetalkeridtypeindex", "messagetalkerstatusindex", "messagetalkersvridindex", "messagetalkertypeindex"};

    /* renamed from: a */
    public SQLiteDatabase f356742a = null;

    /* renamed from: b */
    public SQLiteDatabase f356743b = null;

    /* renamed from: c */
    public boolean f356744c = false;

    /* renamed from: d */
    public volatile String f356745d = "";

    /* renamed from: e */
    public final HashMap<String, String> f356746e;

    static {
        SQLiteGlobal.loadLib();
        SQLiteDebug.setIOTraceFlags(0);
        CursorWindow.windowSize(ErrorCode.YT_SDK_PARAM_ERROR);
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("db_config", 0);
        f356729i = sharedPreferences;
        f356730j = sharedPreferences.getInt("flags", 0);
        int i = sharedPreferences.getInt("acp", 100);
        Pattern pattern = null;
        f356732l = new e$$b((Looper) null, i >>> 16, i & 65535);
        if (BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) {
            pattern = Pattern.compile("^\\s*create\\s+(?:unique\\s+)?index\\s+(?:if\\s+not\\s+exists\\s+)?(\\S+)\\s+on\\s+(\\S+)\\s*\\(", 66);
        }
        f356740t = pattern;
    }

    public C119118e() {
        HashMap<String, String> hashMap = null;
        this.f356746e = (BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) ? new HashMap<>() : hashMap;
    }

    /* renamed from: c */
    public static void m167940c(C119118e eVar) {
        e$$d e__d = new e$$d(eVar);
        Log.m105924i("MicroMsg.MMDataBase", "vacuumedSet = " + f356726f);
        Log.m105924i("MicroMsg.MMDataBase", "db.getPath() = " + eVar.mo183817j());
        ((C119157j) C119157j.f356862d).mo183879j(new e$$e(eVar, e__d), 10000, "vacuum-task");
    }

    /* renamed from: m */
    public static boolean m167941m() {
        return (f356730j & 8) != 0;
    }

    /* renamed from: n */
    public static boolean m167942n() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: q */
    public static void m167943q(String str) {
        Uri.Builder builder;
        Uri.Builder builder2;
        Uri.Builder builder3;
        C86009m1 m1Var = new C86009m1(str);
        C86009m1 l = m1Var.mo119974l();
        String name = m1Var.getName();
        C86009m1 l2 = m1Var.mo119974l();
        Uri uri = l2 == null ? null : l2.f250486d;
        if (uri == null) {
            builder = new Uri.Builder().path("corrupted");
        } else {
            builder = uri.buildUpon();
            builder.appendPath("corrupted");
        }
        Uri build = builder.build();
        String path = build.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(build, (C116281f0.C116288h) null);
        if (l3.mo177810a()) {
            l3.f348991a.mo119937g(l3.f348992b);
        }
        String[] strArr = {"", "-journal", "-wal", ".ini", ".sm", ".li"};
        for (int i = 0; i < 6; i++) {
            String str2 = strArr[i];
            String str3 = name + str2;
            Uri uri2 = l == null ? null : l.f250486d;
            if (uri2 == null) {
                builder2 = new Uri.Builder().path(str3);
            } else {
                Uri.Builder buildUpon = uri2.buildUpon();
                if (!str3.isEmpty()) {
                    buildUpon.appendPath(str3);
                }
                builder2 = buildUpon;
            }
            Uri build2 = builder2.build();
            String path2 = build2.getPath();
            if (path2 != null) {
                String k2 = C116299g2.m163855k(path2, false, false);
                if (!build2.getPath().equals(k2)) {
                    build2 = builder2.path(k2).build();
                }
            }
            AccessControlFileSystem.m163531c(9, build2);
            String str4 = name + str2;
            if (build == null) {
                builder3 = new Uri.Builder().path(str4);
            } else {
                Uri.Builder buildUpon2 = build.buildUpon();
                if (!str4.isEmpty()) {
                    buildUpon2.appendPath(str4);
                }
                builder3 = buildUpon2;
            }
            Uri build3 = builder3.build();
            String path3 = build3.getPath();
            if (path3 != null) {
                String k3 = C116299g2.m163855k(path3, false, false);
                if (!build3.getPath().equals(k3)) {
                    build3 = builder3.path(k3).build();
                }
            }
            C116281f0.C116288h l4 = C116281f0.C116289i.f348994a.mo177799l(build2, (C116281f0.C116288h) null);
            C116281f0.C116288h l5 = C116281f0.C116289i.f348994a.mo177799l(build3, (C116281f0.C116288h) null);
            if (l4.mo177810a() && l5.mo177810a()) {
                try {
                    l5.f348991a.mo119946t(l5.f348992b, l4.f348991a, l4.f348992b);
                } catch (IOException unused) {
                }
            }
            AccessControlFileSystem.m163534f(9);
        }
    }

    /* renamed from: r */
    public static C119118e m167944r(String str, String str2, int i, boolean z) {
        SQLiteCipherSpec sQLiteCipherSpec;
        byte[] bArr;
        int i2;
        try {
            C86009m1 m1Var = new C86009m1(str + "-vfslog");
            C86009m1 m1Var2 = new C86009m1(str + "-vfslo1");
            if (m1Var.mo119967g() && m1Var.mo119980r() > 256) {
                m1Var.mo119966f();
            }
            if (m1Var2.mo119967g() && m1Var2.mo119980r() > 256) {
                m1Var2.mo119966f();
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", th, "", new Object[0]);
        }
        C119118e eVar = new C119118e();
        String str3 = Util.isNullOrNil(str) ? SQLiteDatabaseConfiguration.MEMORY_DB_PATH : str;
        if (Util.isNullOrNil(str2)) {
            bArr = null;
            sQLiteCipherSpec = null;
        } else {
            bArr = str2.getBytes();
            sQLiteCipherSpec = f356731k;
        }
        if (!z || !C39360b.f105786a) {
            if (!C39360b.f105786a) {
                C86013q1.m106447h(str + "-shm");
            }
            i2 = 268435456;
        } else {
            i2 = 805306368;
        }
        try {
            if (str3.endsWith("EnMicroMsg.db")) {
                eVar.f356742a = SQLiteDatabase.openDatabase(str3, bArr, sQLiteCipherSpec, (SQLiteDatabase.CursorFactory) null, i2, eVar, 8);
            } else {
                eVar.f356742a = SQLiteDatabase.openDatabase(str3, bArr, sQLiteCipherSpec, (SQLiteDatabase.CursorFactory) null, i2, eVar);
            }
            eVar.f356742a.setTraceCallback(eVar);
            if (m167941m()) {
                eVar.f356742a.setCheckpointCallback(f356732l);
                Log.m105924i("MicroMsg.MMDataBase", "Enable async checkpointer for DB: " + eVar.mo183817j());
            }
            ((HashMap) f356727g).put(eVar.mo183817j(), eVar);
            m167940c(eVar);
            if (eVar.f356742a == null) {
                return null;
            }
            return eVar;
        } catch (SQLiteException e) {
            C117407d dVar = C117407d.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append("DB (");
            Uri n = C116299g2.m163858n(str3);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            sb.append(path2);
            sb.append(") can't open: ");
            sb.append(Util.stackTraceToString(e));
            dVar.mo160135k("DBCantOpen", sb.toString(), (Map<String, Object>) null);
            throw e;
        }
    }

    /* renamed from: s */
    public static C119118e m167945s(String str, boolean z) {
        C119118e eVar = new C119118e();
        if (str == null || str.length() == 0) {
            SQLiteDatabase create = SQLiteDatabase.create((SQLiteDatabase.CursorFactory) null);
            eVar.f356743b = create;
            if (create == null) {
                return null;
            }
            return eVar;
        }
        int i = 268435456;
        if (z && C39360b.f105786a) {
            i = 805306368;
        } else if (!C39360b.f105786a) {
            C86013q1.m106447h(str + "-shm");
        }
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(str, (SQLiteDatabase.CursorFactory) null, i, eVar);
            eVar.f356743b = openDatabase;
            openDatabase.setTraceCallback(eVar);
            if (m167941m()) {
                eVar.f356743b.setCheckpointCallback(f356732l);
                Log.m105924i("MicroMsg.MMDataBase", "Enable async checkpointer for DB: " + eVar.mo183817j());
            }
            ((HashMap) f356728h).put(eVar.mo183817j(), eVar);
            m167940c(eVar);
            if (eVar.f356743b == null) {
                return null;
            }
            return eVar;
        } catch (SQLiteException e) {
            C117407d dVar = C117407d.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append("DB (");
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            sb.append(path2);
            sb.append(") can't open: ");
            sb.append(Util.stackTraceToString(e));
            dVar.mo160135k("DBCantOpen", sb.toString(), (Map<String, Object>) null);
            throw e;
        }
    }

    /* renamed from: a */
    public void mo183809a() {
        SQLiteDatabase sQLiteDatabase = this.f356742a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f356743b;
        }
        if (m167942n()) {
            f356733m.mo125612a(sQLiteDatabase, 32769, "BEGIN TRANSACTION;");
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", e, "", new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo183810b() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f356742a;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.f356742a.close();
                this.f356742a = null;
            }
            SQLiteDatabase sQLiteDatabase2 = this.f356743b;
            if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                this.f356743b.close();
                this.f356743b = null;
            }
            ((HashMap) f356727g).remove(mo183817j());
            ((HashMap) f356728h).remove(mo183817j());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMDataBase", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: d */
    public void mo183811d() {
        SQLiteDatabase sQLiteDatabase = this.f356742a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f356743b;
        }
        if (m167942n()) {
            f356733m.mo125612a(sQLiteDatabase, 32769, "COMMIT;");
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", e, "", new Object[0]);
        }
    }

    /* renamed from: e */
    public void mo183812e(String str) {
        SQLiteDatabase sQLiteDatabase = this.f356742a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f356743b;
        }
        if (m167942n()) {
            f356733m.mo125612a(sQLiteDatabase, 32769, str);
        }
        sQLiteDatabase.execSQL(str);
    }

    /* renamed from: f */
    public long mo183813f() {
        C86001b0 q;
        Uri n = C116299g2.m163858n(mo183817j());
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
            return q.f250473c;
        }
        return 0;
    }

    /* renamed from: g */
    public long mo183814g() {
        SQLiteDatabase sQLiteDatabase = this.f356742a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f356743b;
        }
        long j = -1;
        if (sQLiteDatabase == null) {
            Log.m105920e("MicroMsg.MMDataBase", "getFreeListSize db is null");
            return -1;
        }
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA freelist_count", (Object[]) null);
            while (rawQuery.moveToNext()) {
                j = rawQuery.getLong(0);
            }
            rawQuery.close();
            Log.m105924i("MicroMsg.MMDataBase", "getFreeListCount, count = " + j);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.MMDataBase", "getFreeListSize error, t = " + th.getMessage());
        }
        return j * mo183816i();
    }

    /* renamed from: h */
    public final String mo183815h(String str, String str2) {
        boolean z = false;
        for (String str3 : str.split(" ")) {
            String trim = str3.trim();
            if (z && !trim.isEmpty()) {
                return str3;
            }
            if (trim.equalsIgnoreCase(str2)) {
                z = true;
            }
        }
        return "";
    }

    /* renamed from: i */
    public long mo183816i() {
        SQLiteDatabase sQLiteDatabase = this.f356742a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f356743b;
        }
        if (sQLiteDatabase == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.getPageSize();
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.MMDataBase", "getPageSize error : " + th.getMessage());
            return -1;
        }
    }

    /* renamed from: j */
    public String mo183817j() {
        SQLiteDatabase sQLiteDatabase = this.f356742a;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase.getPath();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f356743b;
        return sQLiteDatabase2 != null ? sQLiteDatabase2.getPath() : "";
    }

    /* renamed from: k */
    public final String mo183818k() {
        SharedPreferences sharedPreferences = f356729i;
        int i = sharedPreferences.getInt("acp", 100);
        return String.format("flags: 0x%04x\nacp: %d / %d", new Object[]{Integer.valueOf(sharedPreferences.getInt("flags", 0)), Integer.valueOf(i >>> 16), Integer.valueOf(i & 65535)});
    }

    /* renamed from: l */
    public long mo183819l(String str, String str2, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase = this.f356742a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f356743b;
        }
        if (m167942n()) {
            f356733m.mo125612a(sQLiteDatabase, 32769, str);
        }
        return sQLiteDatabase.insertOrThrow(str, str2, contentValues);
    }

    /* renamed from: o */
    public boolean mo183820o() {
        SQLiteDatabase sQLiteDatabase = this.f356742a;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase.isOpen();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f356743b;
        if (sQLiteDatabase2 != null) {
            return sQLiteDatabase2.isOpen();
        }
        return false;
    }

    public void onConnectionObtained(SQLiteDatabase sQLiteDatabase, String str, long j, boolean z) {
        int i = 0;
        if (sQLiteDatabase.getPath().endsWith("EnMicroMsg.db")) {
            int i2 = f356739s[(sQLiteDatabase.isWriteAheadLoggingEnabled() ? 2 : 0) + (sQLiteDatabase.getAsyncCheckpointEnabled() ? 4 : 0) + (z ? 8 : 0) + 1];
            f356738r.mo10579b(i2 + 1, i2 + 2, (long) ((int) j));
        }
        if (m167942n()) {
            e$$g e__g = f356733m;
            if (z) {
                i = 32768;
            }
            e__g.mo125612a(sQLiteDatabase, i | 3, str);
        }
    }

    public void onConnectionPoolBusy(SQLiteDatabase sQLiteDatabase, String str, long j, boolean z, List<SQLiteTrace.TraceInfo<String>> list, List<SQLiteTrace.TraceInfo<StackTraceElement[]>> list2) {
        String str2;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str3 = str;
        boolean z2 = z;
        if (m167942n()) {
            f356733m.mo125612a(sQLiteDatabase2, (z2 ? 32768 : 0) | 2, str3);
        }
        Uri n = C116299g2.m163858n(sQLiteDatabase.getPath());
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        String path2 = n.getPath();
        int lastIndexOf = path2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            path2 = path2.substring(lastIndexOf + 1);
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(2048);
        sb.append(path2);
        String str4 = "\n";
        sb.append(str4);
        if (list != null && !list.isEmpty()) {
            for (SQLiteTrace.TraceInfo<String> traceInfo : list) {
                sb.append("[RUNNING] ");
                sb.append((String) traceInfo.info);
                sb.append(10);
            }
            sb.append(10);
        }
        if (list2 != null && !list2.isEmpty()) {
            for (SQLiteTrace.TraceInfo<StackTraceElement[]> traceInfo2 : list2) {
                sb.append("[TRANSACTION]\n");
                for (StackTraceElement stackTraceElement : (StackTraceElement[]) traceInfo2.info) {
                    sb.append("  at ");
                    sb.append(stackTraceElement.toString());
                    sb.append(10);
                }
                sb.append(10);
            }
        }
        String sb4 = sb.toString();
        if (!this.f356745d.equals(sb4)) {
            Log.m105928w("MicroMsg.MMDataBase", "Database connection pool busy: " + path2);
            Log.m105928w("MicroMsg.MMDataBase", "[REQUEST primary: " + z2 + "] " + str3);
            int i = 3;
            if (list == null || list.isEmpty()) {
                str2 = path2;
            } else {
                for (SQLiteTrace.TraceInfo next : list) {
                    Object[] objArr = new Object[i];
                    objArr[0] = Integer.valueOf(next.tid);
                    objArr[1] = Long.valueOf(currentTimeMillis - next.time);
                    objArr[2] = next.info;
                    Log.m105929w("MicroMsg.MMDataBase", "[RUNNING tid: %d (%d ms)] %s", objArr);
                    boolean z3 = z;
                    path2 = path2;
                    i = 3;
                }
                str2 = path2;
                sb.append(10);
            }
            if (list2 != null && !list2.isEmpty()) {
                for (SQLiteTrace.TraceInfo next2 : list2) {
                    sb.setLength(0);
                    String str5 = str4;
                    sb.append(String.format("[TRANSACTION tid: %d (%d ms)]\n", new Object[]{Integer.valueOf(next2.tid), Long.valueOf(currentTimeMillis - next2.time)}));
                    for (StackTraceElement stackTraceElement2 : (StackTraceElement[]) next2.info) {
                        sb.append("  at ");
                        sb.append(stackTraceElement2.toString());
                        sb.append(10);
                    }
                    sb.append(10);
                    Log.m105928w("MicroMsg.MMDataBase", sb.toString());
                    str4 = str5;
                }
            }
            String str6 = str4;
            sb.setLength(0);
            sQLiteDatabase2.dump(new e$$c(this, sb), false);
            String sb5 = sb.toString();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("SQL", str3);
            linkedHashMap.put("dump", sb5);
            linkedHashMap.put("settings", mo183818k());
            C117407d dVar = C117407d.INSTANCE;
            dVar.mo160135k("DBPoolBusy", sb4, linkedHashMap);
            this.f356745d = sb4;
            dVar.idkeyStat(463, 6, 1, false);
            try {
                StringBuilder sb6 = new StringBuilder();
                if (list != null) {
                    for (SQLiteTrace.TraceInfo<String> traceInfo3 : list) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append((String) traceInfo3.info);
                        String str7 = str6;
                        sb7.append(str7);
                        sb6.append(sb7.toString());
                        str6 = str7;
                    }
                    CrashReportFactory.recentlyDbPoolBusyRunningSql = sb6.toString();
                    boolean z4 = AppForegroundDelegate.INSTANCE.f343454n;
                    boolean n2 = m167942n();
                    C117407d dVar2 = C117407d.INSTANCE;
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = str3;
                    int i2 = 1;
                    objArr2[1] = Long.valueOf(j);
                    objArr2[2] = Integer.valueOf(z ? 1 : 0);
                    objArr2[3] = sb6.toString();
                    objArr2[4] = Integer.valueOf(z4 ? 1 : 0);
                    if (!n2) {
                        i2 = 0;
                    }
                    objArr2[5] = Integer.valueOf(i2);
                    objArr2[6] = str2;
                    dVar2.mo160131h(20584, objArr2);
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.MMDataBase", "report db busy failed = " + th.getMessage());
            }
        }
    }

    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        boolean isOpen = sQLiteDatabase.isOpen();
        String path = sQLiteDatabase.getPath();
        Log.m105921e("MicroMsg.MMDataBase", "Database corrupted, isOpen: %s, path: %s", Boolean.toString(isOpen), path);
        List<Pair<String, String>> attachedDbs = sQLiteDatabase.getAttachedDbs();
        if (isOpen) {
            if (!this.f356744c) {
                this.f356744c = true;
            }
            try {
                C117407d.INSTANCE.idkeyStat(181, (long) (!sQLiteDatabase.isWriteAheadLoggingEnabled() ? 42 : sQLiteDatabase.getAsyncCheckpointEnabled() ? 43 : 41), 1, true);
                mo183824v(sQLiteDatabase);
                sQLiteDatabase.close();
                if (attachedDbs == null) {
                    m167943q(path);
                } else {
                    for (Pair<String, String> pair : attachedDbs) {
                        m167943q((String) pair.second);
                    }
                }
                if (path.contains("EnMicroMsg.db")) {
                    Throwable lastCorruptionException = SQLiteDebug.getLastCorruptionException();
                    if (lastCorruptionException != null) {
                        Log.printErrStackTrace("MicroMsg.MMDataBase", lastCorruptionException, "Database corrupted, force crash.", new Object[0]);
                        ((C119157j) C119157j.f356862d).mo183880k(new e$$a(lastCorruptionException), 1500).get();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onDatabaseCorrupted(SQLiteDatabase sQLiteDatabase) {
    }

    public void onSQLExecuted(SQLiteDatabase sQLiteDatabase, String str, int i, long j) {
        String put;
        String str2 = str;
        int i2 = i;
        long j2 = j;
        if (str2 != null) {
            if (sQLiteDatabase.getPath().endsWith("EnMicroMsg.db")) {
                int i3 = f356739s[(sQLiteDatabase.isWriteAheadLoggingEnabled() ? 2 : 0) + (sQLiteDatabase.getAsyncCheckpointEnabled() ? 4 : 0) + (i2 != 1 ? 8 : 0)];
                f356738r.mo10579b(i3 + 1, i3 + 2, (long) ((int) j2));
            }
            SQLiteTrace sQLiteTrace = f356736p;
            if (sQLiteTrace != null) {
                sQLiteTrace.onSQLExecuted(sQLiteDatabase, str, i, j);
            }
            if (m167942n()) {
                e$$g e__g = f356733m;
                synchronized (e__g) {
                    e__g.f262811b = 0;
                    e__g.f262813d = 0;
                }
            }
            if (this.f356746e != null && i2 == 8) {
                Matcher matcher = f356740t.matcher(str2);
                if (matcher.find()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    synchronized (this.f356746e) {
                        put = this.f356746e.put(group, str2);
                        if (put == null || put.equals(str2)) {
                            put = null;
                        } else {
                            this.f356746e.put(group, put);
                        }
                    }
                    if (put != null) {
                        throw new AssertionError(String.format("Duplicated index created: %s, SQL: %s, existing: %s", new Object[]{group, str2, put}));
                    } else if (group2.equalsIgnoreCase(StateEvent.Name.MESSAGE) && Arrays.binarySearch(f356741u, group.toLowerCase()) < 0) {
                        throw new AssertionError(String.format("New index for message table found: %s, SQL: %s", new Object[]{group, str2}));
                    }
                }
            }
            if (f356737q != null && sQLiteDatabase.getPath().endsWith("SnsMicroMsg.db")) {
                f356737q.onSQLExecuted(sQLiteDatabase, str, i, j);
            }
            if (j2 >= 2000) {
                int i4 = Looper.getMainLooper() == Looper.myLooper() ? 1 : 0;
                if (i4 == 1) {
                    mo183825w(str, sQLiteDatabase.getPath(), j, i4, i, 1);
                } else if (j2 >= 10000) {
                    mo183825w(str, sQLiteDatabase.getPath(), j, i4, i, 0);
                }
            }
        }
    }

    /* renamed from: p */
    public boolean mo183821p() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            StatFs statFs2 = new StatFs(C112760b.m154230f0());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes();
            long f = mo183813f();
            Log.m105924i("MicroMsg.MMDataBase", "dataFreeSpace = " + availableBytes + ", sdcardFreeSpace = " + availableBytes2 + ", dbFileSize = " + f);
            long j = f * 2;
            return availableBytes > j && availableBytes2 > j;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: t */
    public android.database.Cursor mo183822t(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, int i, String str6) {
        SQLiteDatabase.CursorFactory cursorFactory;
        String str7 = str;
        int i2 = i;
        SQLiteDatabase sQLiteDatabase = this.f356742a;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f356743b;
        }
        boolean z = (f356730j & 2) != 0;
        if (i2 == 4) {
            cursorFactory = C112793f.f337741r;
        } else if (i2 == 100) {
            cursorFactory = SQLiteDirectCursor.FACTORY;
        } else {
            if ((CrashReportFactory.hasDebuger() || z) && i2 != 0) {
                if (i2 == 1) {
                    cursorFactory = SQLiteCursor.FACTORY;
                } else if (i2 == 2) {
                    cursorFactory = SQLiteDirectCursor.FACTORY;
                }
            }
            cursorFactory = null;
        }
        if (m167942n()) {
            f356733m.mo125612a(sQLiteDatabase, 1, str7);
        }
        Cursor queryWithFactory = sQLiteDatabase.queryWithFactory(cursorFactory, false, str, strArr, str2, strArr2, str3, str4, str5, str6);
        return i2 != 4 ? new e$$i(queryWithFactory, str7) : queryWithFactory;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor mo183823u(java.lang.String r9, java.lang.String[] r10, int r11, boolean r12) {
        /*
            r8 = this;
            com.tencent.wcdb.database.SQLiteDatabase r0 = r8.f356742a
            if (r0 == 0) goto L_0x0005
            goto L_0x0007
        L_0x0005:
            com.tencent.wcdb.database.SQLiteDatabase r0 = r8.f356743b
        L_0x0007:
            r1 = r0
            int r0 = f356730j
            r2 = 2
            r0 = r0 & r2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r7 = 4
            r5 = 0
            if (r11 != r7) goto L_0x001b
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = ai3.C112793f.f337741r
        L_0x0019:
            r2 = r0
            goto L_0x003a
        L_0x001b:
            r6 = 100
            if (r11 != r6) goto L_0x0022
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY
            goto L_0x0019
        L_0x0022:
            boolean r6 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r6 != 0) goto L_0x002d
            if (r0 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r2 = r5
            goto L_0x003a
        L_0x002d:
            if (r11 == 0) goto L_0x002b
            if (r11 == r4) goto L_0x0037
            if (r11 == r2) goto L_0x0034
            goto L_0x002b
        L_0x0034:
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY
            goto L_0x0019
        L_0x0037:
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = com.tencent.wcdb.database.SQLiteCursor.FACTORY
            goto L_0x0019
        L_0x003a:
            boolean r0 = m167942n()
            if (r0 == 0) goto L_0x0055
            int r0 = com.tencent.wcdb.DatabaseUtils.getSqlStatementType(r9)
            if (r0 != r4) goto L_0x0048
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            zh3.e$$g r6 = f356733m
            if (r0 == 0) goto L_0x0050
            r3 = 32768(0x8000, float:4.5918E-41)
        L_0x0050:
            r0 = r3 | 1
            r6.mo125612a(r1, r0, r9)
        L_0x0055:
            if (r12 == 0) goto L_0x0074
            com.tencent.wcdb.support.CancellationSignal r12 = new com.tencent.wcdb.support.CancellationSignal
            r12.<init>()
            r5 = 0
            r3 = r9
            r4 = r10
            r6 = r12
            com.tencent.wcdb.Cursor r10 = r1.rawQueryWithFactory(r2, r3, r4, r5, r6)
            if (r11 == 0) goto L_0x006e
            if (r11 == r7) goto L_0x006e
            zh3.e$$h r11 = new zh3.e$$h
            r11.<init>(r10, r9, r12)
            goto L_0x0073
        L_0x006e:
            zh3.e$$f r11 = new zh3.e$$f
            r11.<init>(r10, r12)
        L_0x0073:
            return r11
        L_0x0074:
            com.tencent.wcdb.Cursor r10 = r1.rawQueryWithFactory(r2, r9, r10, r5)
            if (r11 == 0) goto L_0x0082
            if (r11 == r7) goto L_0x0082
            zh3.e$$i r11 = new zh3.e$$i
            r11.<init>(r10, r9)
            r10 = r11
        L_0x0082:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zh3.C119118e.mo183823u(java.lang.String, java.lang.String[], int, boolean):android.database.Cursor");
    }

    /* renamed from: v */
    public final void mo183824v(SQLiteDatabase sQLiteDatabase) {
        int lastErrorLine = SQLiteDebug.getLastErrorLine();
        String k = mo183818k();
        Uri n = C116299g2.m163858n(sQLiteDatabase.getPath());
        String path = n.getPath();
        if (path != null) {
            String k2 = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k2)) {
                n = n.buildUpon().path(k2).build();
            }
        }
        String path2 = n.getPath();
        int lastIndexOf = path2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            path2 = path2.substring(lastIndexOf + 1);
        }
        C117407d.INSTANCE.mo160131h(22323, path2, Integer.valueOf(f356729i.getInt("flags", 0)), k, 0, Integer.valueOf(lastErrorLine), Build.FINGERPRINT);
    }

    /* renamed from: w */
    public final void mo183825w(String str, String str2, long j, int i, int i2, int i3) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (str.startsWith("select") || str.startsWith("SELECT") || str.startsWith("delete") || str.startsWith("DELETE")) {
            str3 = mo183815h(str, "from");
        } else if (str.startsWith("update") || str.startsWith("UPDATE")) {
            str3 = mo183815h(str, "update");
        } else if (str.startsWith("insert") || str.startsWith("INSERT")) {
            str3 = mo183815h(str, "into");
            if (str3.contains("(")) {
                str3 = str3.substring(str3.indexOf("(") + 1);
            }
        } else {
            str3 = "";
        }
        String substring = str2.substring(str2.lastIndexOf("/") + 1);
        String name = Thread.currentThread().getName();
        C117407d.INSTANCE.mo160131h(22631, str5, str4, "", "", Long.valueOf(j), MMApplicationContext.getProcessName(), Integer.valueOf(i), substring, str3, AppForegroundDelegate.m161225h(), Integer.valueOf(i2), Integer.valueOf(AppForegroundDelegate.INSTANCE.f343454n ? 1 : 0), Integer.valueOf(i3), name);
    }

    /* renamed from: x */
    public synchronized boolean mo183826x() {
        Log.m105924i("MicroMsg.MMDataBase", "vacuum, dbPath = " + mo183817j());
        if (f356734n) {
            Log.m105924i("MicroMsg.MMDataBase", "isVacuuming");
            return false;
        } else if (mo183821p()) {
            SQLiteDatabase sQLiteDatabase = this.f356742a;
            if (sQLiteDatabase == null) {
                sQLiteDatabase = this.f356743b;
            }
            if (sQLiteDatabase == null) {
                Log.m105920e("MicroMsg.MMDataBase", "getFreeListSize db is null");
                return false;
            }
            f356734n = true;
            Log.m105924i("MicroMsg.MMDataBase", "Vacuum Start");
            try {
                sQLiteDatabase.execSQL("vacuum");
                f356734n = false;
                Log.m105924i("MicroMsg.MMDataBase", "Vacuum Done");
                return true;
            } catch (Throwable th) {
                f356734n = false;
                throw th;
            }
        } else {
            Log.m105920e("MicroMsg.MMDataBase", "isStorageAvailableSatisfyVacuum = false");
            return false;
        }
    }
}
