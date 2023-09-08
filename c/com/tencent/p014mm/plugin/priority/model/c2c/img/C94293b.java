package com.tencent.p014mm.plugin.priority.model.c2c.img;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.database.SQLiteStatement;
import pe2.C100785e;
import te3.C101831q8;

/* renamed from: com.tencent.mm.plugin.priority.model.c2c.img.b */
public class C94293b {

    /* renamed from: a */
    public C100785e f272421a;

    /* renamed from: b */
    public SQLiteStatement f272422b;

    /* renamed from: c */
    public SQLiteStatement f272423c;

    /* renamed from: d */
    public SQLiteStatement f272424d;

    /* renamed from: e */
    public SQLiteStatement f272425e;

    /* renamed from: f */
    public SQLiteStatement f272426f;

    /* renamed from: g */
    public SQLiteStatement f272427g;

    /* renamed from: h */
    public SQLiteStatement f272428h;

    public C94293b(C100785e eVar) {
        this.f272421a = eVar;
        if (eVar.mo140223e(1, 0) != 1) {
            if (this.f272421a.mo140225g("C2CMsgAutoDownloadRes")) {
                this.f272421a.mo140220b("C2CMsgAutoDownloadRes");
            }
            this.f272421a.mo140221c(String.format("CREATE TABLE IF NOT EXISTS %s (msgid INTEGER PRIMARY KEY, fromuser TEXT, realuser TEXT, restype INTEGER, createtime INTEGER, reason INTEGER, status INTEGER, downloadtime INTEGER, msgsvrid LONG, imgsize INTEGER, opentime INTEGER, priority FLOAT, prioritytype INTEGER);", new Object[]{"C2CMsgAutoDownloadRes"}));
            this.f272421a.mo140221c(String.format("CREATE INDEX IF NOT EXISTS %s ON %s(priority, createtime);", new Object[]{"C2CMsgAutoDownloadRes_Priority_CreateTime", "C2CMsgAutoDownloadRes"}));
            this.f272421a.mo140227i(1, 1);
        } else {
            Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "Exist Table %s Count %d", "C2CMsgAutoDownloadRes", Integer.valueOf(this.f272421a.mo140224f("C2CMsgAutoDownloadRes")));
        }
        this.f272422b = this.f272421a.mo140219a(String.format("INSERT OR IGNORE INTO %s (msgid, fromuser, realuser, restype, createtime, reason, status, downloadtime, msgsvrid, imgsize, opentime, priority, prioritytype) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);", new Object[]{"C2CMsgAutoDownloadRes"}));
        this.f272423c = this.f272421a.mo140219a(String.format("DELETE FROM %s WHERE msgid = ?", new Object[]{"C2CMsgAutoDownloadRes"}));
        this.f272424d = this.f272421a.mo140219a(String.format("DELETE FROM %s WHERE fromuser = ?;", new Object[]{"C2CMsgAutoDownloadRes"}));
        this.f272425e = this.f272421a.mo140219a(String.format("UPDATE %s SET status = ? WHERE msgid = ?", new Object[]{"C2CMsgAutoDownloadRes"}));
        this.f272426f = this.f272421a.mo140219a(String.format("UPDATE %s SET reason = reason | ?, status = ? WHERE msgid = ?", new Object[]{"C2CMsgAutoDownloadRes"}));
        this.f272427g = this.f272421a.mo140219a(String.format("UPDATE %s SET downloadtime = ?, status = ?, imgsize = ? WHERE msgid = ? AND downloadtime = 0", new Object[]{"C2CMsgAutoDownloadRes"}));
        this.f272428h = this.f272421a.mo140219a(String.format("UPDATE %s SET opentime = ? WHERE msgid = ?", new Object[]{"C2CMsgAutoDownloadRes"}));
    }

    /* renamed from: a */
    public final C101831q8 mo129625a(Cursor cursor) {
        C101831q8 q8Var = new C101831q8();
        q8Var.f299197d = cursor.getLong(0);
        q8Var.f299198e = cursor.getString(1);
        q8Var.f299199f = cursor.getString(2);
        q8Var.f299200g = cursor.getInt(3);
        q8Var.f299201h = cursor.getLong(4);
        q8Var.f299202i = cursor.getInt(5);
        q8Var.f299203j = cursor.getInt(6);
        q8Var.f299204n = cursor.getLong(7);
        q8Var.f299205o = cursor.getLong(8);
        q8Var.f299206p = cursor.getInt(9);
        q8Var.f299207q = cursor.getLong(10);
        q8Var.f299208r = (double) cursor.getFloat(11);
        q8Var.f299209s = cursor.getInt(12);
        return q8Var;
    }

    /* renamed from: b */
    public C101831q8 mo129626b(int i, float f) {
        String format = String.format("SELECT * FROM %s Img, %s Chat WHERE Chat.rank <= ? AND Chat.totallsp > ? AND Chat.chat = Img.fromuser AND createtime > ? AND Img.status = ? ORDER BY Img.createtime DESC LIMIT 1;", new Object[]{"C2CMsgAutoDownloadRes", "C2CChatUsageResult"});
        Cursor h = this.f272421a.mo140226h(format, new String[]{String.valueOf(i), String.valueOf(f), String.valueOf(System.currentTimeMillis() - 432000000), String.valueOf(1)});
        try {
            if (h.moveToNext()) {
                return mo129625a(h);
            }
            h.close();
            return null;
        } finally {
            h.close();
        }
    }

    /* renamed from: c */
    public C101831q8 mo129627c(long j) {
        String format = String.format("SELECT * FROM %s WHERE msgid = ?;", new Object[]{"C2CMsgAutoDownloadRes"});
        Cursor h = this.f272421a.mo140226h(format, new String[]{String.valueOf(j)});
        try {
            if (h.moveToNext()) {
                return mo129625a(h);
            }
            h.close();
            return null;
        } finally {
            h.close();
        }
    }

    /* renamed from: d */
    public C101831q8 mo129628d(int i) {
        String format = String.format("SELECT * FROM %s WHERE status = ? AND (reason & ?) > 0 AND createtime > ? ORDER BY createtime DESC LIMIT 1;", new Object[]{"C2CMsgAutoDownloadRes"});
        Cursor h = this.f272421a.mo140226h(format, new String[]{String.valueOf(1), String.valueOf(i), String.valueOf(System.currentTimeMillis() - 432000000)});
        try {
            if (h.moveToNext()) {
                return mo129625a(h);
            }
            h.close();
            return null;
        } finally {
            h.close();
        }
    }

    /* renamed from: e */
    public boolean mo129629e(long j) {
        String format = String.format("SELECT 1 FROM %s WHERE msgid = ?", new Object[]{"C2CMsgAutoDownloadRes"});
        Cursor h = this.f272421a.mo140226h(format, new String[]{String.valueOf(j)});
        try {
            return h.moveToNext();
        } finally {
            h.close();
        }
    }

    /* renamed from: f */
    public void mo129630f(long j, int i) {
        this.f272425e.bindLong(1, (long) i);
        this.f272425e.bindLong(2, j);
        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "updateStatus %d res %d %d", Integer.valueOf(this.f272425e.executeUpdateDelete()), Long.valueOf(j), Integer.valueOf(i));
    }

    /* renamed from: g */
    public void mo129631g(long j, int i, int i2) {
        this.f272426f.bindLong(1, (long) i);
        this.f272426f.bindLong(2, (long) i2);
        this.f272426f.bindLong(3, j);
        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "updateStatusAndReason %d res %d %d %d", Integer.valueOf(this.f272426f.executeUpdateDelete()), Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
    }
}
