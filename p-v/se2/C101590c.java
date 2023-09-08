package se2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.database.SQLiteStatement;
import pe2.C100785e;
import te3.C101826p8;

/* renamed from: se2.c */
public class C101590c {

    /* renamed from: a */
    public C100785e f297408a;

    /* renamed from: b */
    public SQLiteStatement f297409b;

    /* renamed from: c */
    public SQLiteStatement f297410c;

    /* renamed from: d */
    public SQLiteStatement f297411d;

    /* renamed from: e */
    public SQLiteStatement f297412e;

    /* renamed from: f */
    public SQLiteStatement f297413f;

    /* renamed from: g */
    public SQLiteStatement f297414g;

    /* renamed from: h */
    public SQLiteStatement f297415h;

    public C101590c(C100785e eVar) {
        this.f297408a = eVar;
        if (eVar.mo140223e(2, 0) != 4) {
            if (this.f297408a.mo140225g("C2CMsgAutoDownloadFile")) {
                this.f297408a.mo140220b("C2CMsgAutoDownloadFile");
            }
            this.f297408a.mo140221c(String.format("CREATE TABLE IF NOT EXISTS %s (id TEXT, fromuser TEXT, realuser TEXT, restype INTEGER, createtime INTEGER, reason INTEGER, status INTEGER, downloadtime INTEGER, msgsvrid LONG, filesize INTEGER, fileext TEXT, opentime INTEGER, priority FLOAT, prioritytype INTEGER, fileid TEXT, PRIMARY KEY(id, msgsvrid));", new Object[]{"C2CMsgAutoDownloadFile"}));
            this.f297408a.mo140221c(String.format("CREATE INDEX IF NOT EXISTS %s ON %s(priority, createtime);", new Object[]{"C2CMsgAutoDownloadFile_Priority_CreateTime", "C2CMsgAutoDownloadFile"}));
            this.f297408a.mo140227i(2, 4);
        } else {
            Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "Exist Table %s Count %s", "C2CMsgAutoDownloadFile", Integer.valueOf(this.f297408a.mo140224f("C2CMsgAutoDownloadFile")));
        }
        this.f297409b = this.f297408a.mo140219a(String.format("INSERT OR IGNORE INTO %s (id, fromuser, realuser, restype, createtime, reason, status, downloadtime, msgsvrid, filesize, fileext, opentime, priority, prioritytype, fileid) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);", new Object[]{"C2CMsgAutoDownloadFile"}));
        this.f297410c = this.f297408a.mo140219a(String.format("DELETE FROM %s WHERE id = ? AND msgsvrid = ?", new Object[]{"C2CMsgAutoDownloadFile"}));
        this.f297411d = this.f297408a.mo140219a(String.format("DELETE FROM %s WHERE fromuser = ?;", new Object[]{"C2CMsgAutoDownloadFile"}));
        this.f297412e = this.f297408a.mo140219a(String.format("UPDATE %s SET status = ? WHERE id = ? AND msgsvrid = ?", new Object[]{"C2CMsgAutoDownloadFile"}));
        this.f297413f = this.f297408a.mo140219a(String.format("UPDATE %s SET reason = reason | ?, status = ? WHERE id = ? AND msgsvrid = ?", new Object[]{"C2CMsgAutoDownloadFile"}));
        this.f297414g = this.f297408a.mo140219a(String.format("UPDATE %s SET downloadtime = ?, status = ? WHERE id = ? AND msgsvrid = ? AND downloadtime = 0", new Object[]{"C2CMsgAutoDownloadFile"}));
        this.f297415h = this.f297408a.mo140219a(String.format("UPDATE %s SET opentime = ? WHERE id = ? AND msgsvrid = ? AND opentime = 0", new Object[]{"C2CMsgAutoDownloadFile"}));
    }

    /* renamed from: a */
    public final C101826p8 mo141064a(Cursor cursor) {
        C101826p8 p8Var = new C101826p8();
        p8Var.f299087d = cursor.getString(0);
        p8Var.f299088e = cursor.getString(1);
        p8Var.f299089f = cursor.getString(2);
        p8Var.f299090g = cursor.getInt(3);
        p8Var.f299091h = cursor.getLong(4);
        p8Var.f299092i = cursor.getInt(5);
        p8Var.f299093j = cursor.getInt(6);
        p8Var.f299094n = cursor.getLong(7);
        p8Var.f299095o = cursor.getLong(8);
        p8Var.f299096p = (long) cursor.getInt(9);
        p8Var.f299097q = cursor.getString(10);
        p8Var.f299098r = cursor.getLong(11);
        p8Var.f299099s = (double) cursor.getFloat(12);
        p8Var.f299100t = cursor.getInt(13);
        p8Var.f299101u = cursor.getString(14);
        return p8Var;
    }

    /* renamed from: b */
    public C101826p8 mo141065b(String str, long j) {
        String format = String.format("SELECT * FROM %s WHERE id = ? AND msgsvrid = ?;", new Object[]{"C2CMsgAutoDownloadFile"});
        Cursor h = this.f297408a.mo140226h(format, new String[]{str, String.valueOf(j)});
        try {
            if (h.moveToNext()) {
                return mo141064a(h);
            }
            h.close();
            return null;
        } finally {
            h.close();
        }
    }

    /* renamed from: c */
    public void mo141066c(C101826p8 p8Var) {
        this.f297409b.bindString(1, p8Var.f299087d);
        this.f297409b.bindString(2, p8Var.f299088e);
        this.f297409b.bindString(3, p8Var.f299089f);
        this.f297409b.bindLong(4, (long) p8Var.f299090g);
        this.f297409b.bindLong(5, p8Var.f299091h);
        this.f297409b.bindLong(6, (long) p8Var.f299092i);
        this.f297409b.bindLong(7, (long) p8Var.f299093j);
        this.f297409b.bindLong(8, p8Var.f299094n);
        this.f297409b.bindLong(9, p8Var.f299095o);
        this.f297409b.bindLong(10, p8Var.f299096p);
        this.f297409b.bindString(11, p8Var.f299097q);
        this.f297409b.bindLong(12, p8Var.f299098r);
        this.f297409b.bindDouble(13, p8Var.f299099s);
        this.f297409b.bindLong(14, (long) p8Var.f299100t);
        this.f297409b.bindString(15, p8Var.f299101u);
        this.f297409b.execute();
    }

    /* renamed from: d */
    public boolean mo141067d(String str, long j) {
        String format = String.format("SELECT 1 FROM %s WHERE id = ? AND msgsvrid = ?", new Object[]{"C2CMsgAutoDownloadFile"});
        Cursor h = this.f297408a.mo140226h(format, new String[]{str, String.valueOf(j)});
        try {
            return h.moveToNext();
        } finally {
            h.close();
        }
    }

    /* renamed from: e */
    public void mo141068e(String str, long j, int i) {
        this.f297412e.bindLong(1, (long) i);
        this.f297412e.bindString(2, str);
        this.f297412e.bindLong(3, j);
        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "updateStatus %s res %s %s %s", Integer.valueOf(this.f297412e.executeUpdateDelete()), str, Long.valueOf(j), Integer.valueOf(i));
    }
}
