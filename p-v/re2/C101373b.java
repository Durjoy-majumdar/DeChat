package re2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import pe2.C100785e;
import te3.C101797js;

/* renamed from: re2.b */
public class C101373b {

    /* renamed from: a */
    public C100785e f296950a;

    public C101373b(C100785e eVar) {
        this.f296950a = eVar;
        if (eVar.mo140223e(65, 0) != 7) {
            if (this.f296950a.mo140225g("C2CChatUsageResult")) {
                this.f296950a.mo140220b("C2CChatUsageResult");
            }
            this.f296950a.mo140221c(String.format("CREATE TABLE IF NOT EXISTS %s (chat TEXT, openrmf DOUBLE DEFAULT 0, staytimedev DOUBLE DEFAULT 0,sendmsgrmf DOUBLE DEFAULT 0, consumemsgrmf DOUBLE DEFAULT 0, totallsp DOUBLE DEFAULT 0, rank INTEGER DEFAULT -1, PRIMARY KEY(chat));", new Object[]{"C2CChatUsageResult"}));
            this.f296950a.mo140227i(65, 7);
            return;
        }
        Log.m105925i("MicroMsg.Priority.C2CChatUsageResultStorage", "Exist Table %s Count %d", "C2CChatUsageResult", Integer.valueOf(this.f296950a.mo140224f("C2CChatUsageResult")));
    }

    /* renamed from: a */
    public final C101797js mo140858a(Cursor cursor) {
        C101797js jsVar = new C101797js();
        jsVar.f298555d = cursor.getString(0);
        jsVar.f298556e = cursor.getDouble(1);
        jsVar.f298557f = cursor.getDouble(2);
        jsVar.f298558g = cursor.getDouble(3);
        jsVar.f298559h = cursor.getDouble(4);
        jsVar.f298560i = cursor.getDouble(5);
        jsVar.f298561j = cursor.getInt(6);
        return jsVar;
    }

    /* renamed from: b */
    public C101797js mo140859b(String str) {
        String format = String.format("SELECT * FROM %s WHERE chat = ?", new Object[]{"C2CChatUsageResult"});
        Cursor h = this.f296950a.mo140226h(format, new String[]{str});
        try {
            if (h.moveToNext()) {
                C101797js a = mo140858a(h);
                h.close();
                return a;
            }
            h.close();
            return null;
        } catch (Throwable th) {
            if (h != null) {
                h.close();
            }
            throw th;
        }
    }
}
