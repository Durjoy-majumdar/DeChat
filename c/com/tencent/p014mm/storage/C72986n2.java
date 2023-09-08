package com.tencent.p014mm.storage;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDoneException;
import g62.C8231f;
import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.n2 */
public class C72986n2 extends MStorage implements C8231f {

    /* renamed from: f */
    public static final String[] f212811f = {"CREATE TABLE IF NOT EXISTS DeletedConversationInfo ( userName TEXT  PRIMARY KEY , lastSeq LONG  , reserved1 INT  , reserved2 LONG  , reserved3 TEXT  ) ", "CREATE INDEX IF NOT EXISTS createTimeIndex  ON DeletedConversationInfo ( reserved2 )"};

    /* renamed from: d */
    public final C101611g<String, Long> f212812d = new C100308d(50);

    /* renamed from: e */
    public C91753f f212813e;

    public C72986n2(C91753f fVar) {
        this.f212813e = fVar;
    }

    /* renamed from: Lo */
    public long mo101180Lo(String str) {
        if (str == null) {
            return 0;
        }
        return mo101182Yt("SELECT max(lastSeq) FROM DeletedConversationInfo WHERE userName=? OR userName=''", new String[]{str});
    }

    /* renamed from: Ow */
    public boolean mo101181Ow(String str, long j) {
        SQLiteDatabase f = this.f212813e.mo125615f();
        try {
            f.beginTransaction();
            ContentValues contentValues = new ContentValues();
            contentValues.put("reserved2", Long.valueOf(j));
            if (!(f.update("DeletedConversationInfo", contentValues, "userName=?", new String[]{str}) > 0)) {
                contentValues.put("userName", str);
                contentValues.put("lastSeq", 0);
                contentValues.put("reserved2", Long.valueOf(j));
                f.replace("DeletedConversationInfo", "userName", contentValues);
            }
            f.setTransactionSuccessful();
            if (str == null || !str.isEmpty()) {
                ((C101062d) this.f212812d).put(str, Long.valueOf(j));
            } else {
                ((C101062d) this.f212812d).clear();
            }
            if (f.isOpen() && f.inTransaction()) {
                f.endTransaction();
            }
            doNotify(str);
            return true;
        } catch (IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.DeletedConversationInfoStorage", e, "replaceCreateTime failed", new Object[0]);
            if (f.isOpen() && f.inTransaction()) {
                f.endTransaction();
            }
            return false;
        } catch (Throwable th) {
            if (f.isOpen() && f.inTransaction()) {
                f.endTransaction();
            }
            throw th;
        }
    }

    /* renamed from: Yt */
    public final long mo101182Yt(String str, String[] strArr) {
        try {
            return DatabaseUtils.longForQuery(this.f212813e.mo125615f(), str, strArr);
        } catch (SQLiteDoneException unused) {
            return 0;
        } catch (IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.DeletedConversationInfoStorage", e, "longForQuery failed", new Object[0]);
            return 0;
        }
    }

    /* renamed from: bD */
    public boolean mo101183bD(String str, long j) {
        if (str == null) {
            return false;
        }
        SQLiteDatabase f = this.f212813e.mo125615f();
        try {
            f.beginTransaction();
            ContentValues contentValues = new ContentValues();
            contentValues.put("lastSeq", Long.valueOf(j));
            if (!(f.update("DeletedConversationInfo", contentValues, "userName=?", new String[]{str}) > 0)) {
                contentValues.put("userName", str);
                contentValues.put("lastSeq", Long.valueOf(j));
                contentValues.put("reserved2", 0);
                f.replace("DeletedConversationInfo", "userName", contentValues);
            }
            f.setTransactionSuccessful();
            if (f.inTransaction()) {
                f.endTransaction();
            }
            doNotify(str);
            return true;
        } catch (IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.DeletedConversationInfoStorage", e, "replaceLastSeq failed", new Object[0]);
            if (f.inTransaction()) {
                f.endTransaction();
            }
            return false;
        } catch (Throwable th) {
            if (f.inTransaction()) {
                f.endTransaction();
            }
            throw th;
        }
    }

    /* renamed from: jo */
    public long mo101184jo(String str) {
        long j = 0;
        if (str == null) {
            return 0;
        }
        Long l = (Long) ((C101062d) this.f212812d).get(str);
        if (l != null) {
            return l.longValue();
        }
        long Yt = mo101182Yt("SELECT max(reserved2) FROM DeletedConversationInfo WHERE userName=? OR userName=''", new String[]{str});
        if (Yt != MAlarmHandler.NEXT_FIRE_INTERVAL) {
            j = Yt;
        }
        ((C101062d) this.f212812d).put(str, Long.valueOf(j));
        return j;
    }

    /* renamed from: qq */
    public boolean mo101185qq() {
        return mo101182Yt("SELECT reserved2 FROM DeletedConversationInfo WHERE reserved2 > 0 LIMIT 1", (String[]) null) > 0;
    }
}
