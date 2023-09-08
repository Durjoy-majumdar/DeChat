package rv1;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.p014mm.plugin.fts.C93824b;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import kv1.C99247a;
import kv1.C99251g;
import lv1.C99672i;

/* renamed from: rv1.b */
public class C101467b extends C99247a {

    /* renamed from: r */
    public SQLiteStatement f297163r;

    /* renamed from: s */
    public SQLiteStatement f297164s;

    /* renamed from: t */
    public SQLiteStatement f297165t;

    /* renamed from: u */
    public SQLiteStatement f297166u;

    /* renamed from: v */
    public SQLiteStatement f297167v;

    /* renamed from: w */
    public SQLiteStatement f297168w;

    /* renamed from: x */
    public SQLiteStatement f297169x;

    /* renamed from: A */
    public void mo140965A(String str, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            boolean m = ((C93834f) this.f290993f).mo128796m();
            if (!m) {
                ((C93834f) this.f290993f).mo128785a();
            }
            this.f297163r.bindString(1, str);
            for (String bindString : strArr) {
                this.f297163r.bindString(2, bindString);
                this.f297163r.execute();
            }
            if (!m) {
                ((C93834f) this.f290993f).mo128788d();
            }
        }
    }

    /* renamed from: B */
    public boolean mo140966B(C99672i iVar) {
        Object[] objArr = new Object[6];
        objArr[0] = mo138611l();
        objArr[1] = mo138609j();
        objArr[2] = mo138611l();
        objArr[3] = mo138609j();
        objArr[4] = mo138609j();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ((ArrayList) iVar.f292124e).size(); i++) {
            stringBuffer.append("(");
            stringBuffer.append(((C99672i.C99676d) ((ArrayList) iVar.f292124e).get(i)).mo139045a());
            stringBuffer.append(")");
            if (i != ((ArrayList) iVar.f292124e).size() - 1) {
                stringBuffer.append(" OR ");
            }
        }
        objArr[5] = stringBuffer.toString();
        Cursor o = ((C93834f) this.f290993f).mo128798o(String.format("SELECT 1 FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type=131072 LIMIT 1;", objArr), (String[]) null);
        boolean moveToNext = ((CursorWrapper) o).moveToNext();
        ((C93824b) o).close();
        return moveToNext;
    }

    /* renamed from: C */
    public Cursor mo140967C(C99672i iVar, String str, int[] iArr, int[] iArr2) {
        String str2;
        String str3;
        String d = iVar.mo139044d();
        String str4 = "";
        if (Util.isNullOrNil(str)) {
            str2 = str4;
        } else {
            str2 = String.format(" AND aux_index = '%s'", new Object[]{str});
        }
        if (iArr == null || iArr.length <= 0) {
            str3 = str4;
        } else {
            str3 = " AND type IN " + C99251g.m129291l(iArr);
        }
        if (iArr2 != null && iArr2.length > 0) {
            str4 = " AND subtype IN " + C99251g.m129291l(iArr2);
        }
        return ((C93834f) this.f290993f).mo128798o(String.format("SELECT aux_index, type, subtype FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + str2 + str3 + str4 + " AND status >= 0 ORDER BY subtype;", new Object[]{mo138611l(), mo138609j(), mo138611l(), mo138609j(), mo138609j(), d}), (String[]) null);
    }

    /* renamed from: d */
    public int mo138631d() {
        return 3;
    }

    public String getName() {
        return "FTS5ContactStorage";
    }

    public int getType() {
        return 3;
    }

    /* renamed from: i */
    public String mo138608i() {
        return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", new Object[]{mo138611l()});
    }

    /* renamed from: k */
    public String mo138610k() {
        return "MicroMsg.FTS.FTS5ContactStorage";
    }

    /* renamed from: m */
    public String mo138612m() {
        return "Contact";
    }

    /* renamed from: s */
    public boolean mo138618s() {
        return !mo138599b(-102, 5);
    }

    /* renamed from: u */
    public void mo138620u() {
        if (mo138618s()) {
            ((C93834f) this.f290993f).mo128800q(-102, 5);
        }
        ((C93834f) this.f290993f).mo128792i("CREATE TABLE IF NOT EXISTS FTS5ChatRoomMembers (chatroom TEXT, member TEXT);");
        ((C93834f) this.f290993f).mo128792i("CREATE INDEX IF NOT EXISTS FTS5ChatRoomMembers_chatroom ON FTS5ChatRoomMembers(chatroom);");
        ((C93834f) this.f290993f).mo128792i("CREATE INDEX IF NOT EXISTS FTS5ChatRoomMembers_member ON FTS5ChatRoomMembers(member);");
        ((C93834f) this.f290993f).mo128792i("CREATE TABLE IF NOT EXISTS FTS5ContactLabels (user TEXT, label_id INTEGER);");
        ((C93834f) this.f290993f).mo128792i("CREATE INDEX IF NOT EXISTS FTS5ContactLabels_user ON FTS5ContactLabels(user);");
        ((C93834f) this.f290993f).mo128792i("CREATE INDEX IF NOT EXISTS FTS5ContactLabels_label ON FTS5ContactLabels(label_id);");
        this.f297163r = ((C93834f) this.f290993f).mo128789e("INSERT INTO FTS5ChatRoomMembers (chatroom, member) VALUES (?, ?);");
        this.f297164s = ((C93834f) this.f290993f).mo128789e("DELETE FROM FTS5ChatRoomMembers WHERE chatroom=? AND member=?;");
        this.f297165t = ((C93834f) this.f290993f).mo128789e("DELETE FROM FTS5ChatRoomMembers WHERE chatroom=?;");
        this.f297166u = ((C93834f) this.f290993f).mo128789e("INSERT INTO FTS5ContactLabels (user, label_id) VALUES (?, ?);");
        this.f297167v = ((C93834f) this.f290993f).mo128789e("DELETE FROM FTS5ContactLabels WHERE user=? AND label_id=?;");
        this.f297168w = ((C93834f) this.f290993f).mo128789e("DELETE FROM FTS5ContactLabels WHERE user=?;");
        this.f297169x = ((C93834f) this.f290993f).mo128789e("SELECT changes();");
    }

    /* renamed from: v */
    public boolean mo138621v() {
        super.mo138621v();
        this.f297163r.close();
        this.f297164s.close();
        this.f297165t.close();
        this.f297166u.close();
        this.f297167v.close();
        this.f297168w.close();
        this.f297169x.close();
        return true;
    }
}
