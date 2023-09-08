package rv1;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.p014mm.plugin.fts.C93824b;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.List;
import kv1.C99247a;
import lv1.C76727e;

/* renamed from: rv1.c */
public class C101468c extends C99247a {

    /* renamed from: r */
    public SQLiteStatement f297170r;

    /* renamed from: rv1.c$a */
    public static class C101469a {

        /* renamed from: a */
        public int f297171a;

        /* renamed from: b */
        public long f297172b;
    }

    /* renamed from: A */
    public C76727e mo140968A(int i) {
        Cursor o = ((C93834f) this.f290993f).mo128798o("Select * from Feature where featureId = " + i, (String[]) null);
        try {
            if (!((CursorWrapper) o).moveToFirst()) {
                return null;
            }
            C76727e eVar = new C76727e();
            eVar.convertFrom(o);
            ((C93824b) o).close();
            return eVar;
        } finally {
            ((C93824b) o).close();
        }
    }

    /* renamed from: B */
    public boolean mo140969B(List<C76727e> list) {
        boolean m = ((C93834f) this.f290993f).mo128796m();
        if (!m) {
            ((C93834f) this.f290993f).mo128785a();
        }
        ((C93834f) this.f290993f).mo128792i("Delete from Feature");
        for (C76727e next : list) {
            try {
                this.f297170r.bindLong(1, (long) next.field_featureId);
                this.f297170r.bindString(2, next.field_title);
                this.f297170r.bindString(3, next.field_titlePY);
                this.f297170r.bindString(4, next.field_titleShortPY);
                this.f297170r.bindString(5, next.field_tag);
                this.f297170r.bindLong(6, (long) next.field_actionType);
                this.f297170r.bindString(7, next.field_url);
                this.f297170r.bindString(8, next.field_helpUrl);
                this.f297170r.bindString(9, next.field_updateUrl);
                this.f297170r.bindString(10, next.field_androidUrl);
                this.f297170r.bindString(11, next.field_iconPath);
                this.f297170r.bindLong(12, next.field_timestamp);
                Log.m105919d("MicroMsg.FTS.FTS5FeatureStorage", "insertFeatureItem rowid=%d timestamp=%d", Long.valueOf(this.f297170r.executeInsert()), Long.valueOf(next.field_timestamp));
            } catch (Exception unused) {
            }
        }
        if (!m) {
            ((C93834f) this.f290993f).mo128788d();
        }
        return true;
    }

    /* renamed from: d */
    public int mo138631d() {
        return 17;
    }

    public String getName() {
        return "FTS5FeatureStorage";
    }

    public int getType() {
        return 17;
    }

    /* renamed from: k */
    public String mo138610k() {
        return "MicroMsg.FTS.FTS5FeatureStorage";
    }

    /* renamed from: m */
    public String mo138612m() {
        return "Feature";
    }

    /* renamed from: r */
    public boolean mo138617r() {
        return true;
    }

    /* renamed from: s */
    public boolean mo138618s() {
        return !mo138599b(-101, 3);
    }

    /* renamed from: u */
    public void mo138620u() {
        if (mo138618s()) {
            ((C93834f) this.f290993f).mo128792i(String.format("DROP TABLE IF EXISTS %s", new Object[]{"Feature"}));
            mo138626z(-101, 3);
        }
        if (!((C93834f) this.f290993f).mo128797n("Feature")) {
            ((C93834f) this.f290993f).mo128792i("CREATE TABLE IF NOT EXISTS Feature ( " + C76727e.f224464J.sql + ");");
        }
        this.f297170r = ((C93834f) this.f290993f).mo128789e(String.format("INSERT INTO %s (featureId, title, titlePY, titleShortPY, tag, actionType, url, helpUrl, updateUrl, androidUrl, iconPath, timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);", new Object[]{"Feature"}));
    }

    /* renamed from: v */
    public boolean mo138621v() {
        super.mo138621v();
        this.f297170r.close();
        return true;
    }
}
