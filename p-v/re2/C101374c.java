package re2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.database.SQLiteStatement;
import pe2.C100785e;

/* renamed from: re2.c */
public class C101374c {

    /* renamed from: a */
    public C100785e f296951a;

    /* renamed from: b */
    public SQLiteStatement f296952b;

    /* renamed from: c */
    public SQLiteStatement f296953c;

    /* renamed from: d */
    public SQLiteStatement f296954d;

    /* renamed from: e */
    public SQLiteStatement f296955e;

    public C101374c(C100785e eVar) {
        this.f296951a = eVar;
        if (eVar.mo140223e(49, 0) != 5) {
            if (this.f296951a.mo140225g("C2CChatUsage")) {
                this.f296951a.mo140220b("C2CChatUsage");
            }
            this.f296951a.mo140221c(String.format("CREATE TABLE IF NOT EXISTS %s (chat TEXT, date INTEGER, chattype INTEGER DEFAULT 0, opencount INTEGER DEFAULT 0, sendmsgcount INTEGER DEFAULT 0, staytime INTEGER DEFAULT 0, consumemsgcount INTEGER DEFAULT 0, PRIMARY KEY(chat, date));", new Object[]{"C2CChatUsage"}));
            this.f296951a.mo140227i(49, 5);
        } else {
            Log.m105925i("MicroMsg.Priority.C2CChatUsageStorage", "Exist Table %s Count %d", "C2CChatUsage", Integer.valueOf(this.f296951a.mo140224f("C2CChatUsage")));
        }
        this.f296952b = this.f296951a.mo140219a(String.format("INSERT OR IGNORE INTO %s (chat, date, chattype) VALUES (?,?,?)", new Object[]{"C2CChatUsage"}));
        this.f296953c = this.f296951a.mo140219a(String.format("UPDATE %s SET opencount = opencount + 1, staytime = staytime + ? WHERE chat = ? AND date = ?", new Object[]{"C2CChatUsage"}));
        this.f296954d = this.f296951a.mo140219a(String.format("UPDATE %s SET sendmsgcount = sendmsgcount + 1 WHERE chat = ? AND date = ?", new Object[]{"C2CChatUsage"}));
        this.f296955e = this.f296951a.mo140219a(String.format("UPDATE %s SET consumemsgcount = consumemsgcount + 1 WHERE chat = ? AND date = ?", new Object[]{"C2CChatUsage"}));
    }

    /* renamed from: a */
    public boolean mo140860a(String str, long j, long j2) {
        this.f296952b.bindString(1, str);
        this.f296952b.bindLong(2, j);
        this.f296952b.bindLong(3, j2);
        return this.f296952b.executeInsert() >= 0;
    }
}
