package kv1;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.p014mm.plugin.fts.C93824b;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteStatement;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lv1.C99666c;
import lv1.C99672i;
import p823sg.C101611g;
import p823sg.C101614i;
import rv1.C101467b;
import zh3.C79331c;

/* renamed from: kv1.a */
public abstract class C99247a implements C99258l {

    /* renamed from: d */
    public volatile boolean f290991d;

    /* renamed from: e */
    public C101611g<String, String> f290992e;

    /* renamed from: f */
    public volatile C99257k f290993f;

    /* renamed from: g */
    public SQLiteStatement f290994g;

    /* renamed from: h */
    public SQLiteStatement f290995h;

    /* renamed from: i */
    public SQLiteStatement f290996i;

    /* renamed from: j */
    public SQLiteStatement f290997j;

    /* renamed from: n */
    public SQLiteStatement f290998n;

    /* renamed from: o */
    public SQLiteStatement f290999o;

    /* renamed from: p */
    public SQLiteStatement f291000p;

    /* renamed from: q */
    public SQLiteStatement f291001q;

    public C99247a() {
        Log.m105925i(mo138610k(), "Create %s", getName());
    }

    /* renamed from: O4 */
    public String mo138597O4(String str, int i) {
        if (mo138617r()) {
            String str2 = str + "​" + i;
            if (this.f290992e.check(str2)) {
                Log.m105924i(mo138610k(), "hit lru insert content map");
                return this.f290992e.get(str2);
            }
        }
        Cursor o = ((C93834f) this.f290993f).mo128798o(String.format("SELECT content FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE aux_index=? AND subtype=?", new Object[]{mo138611l(), mo138609j(), mo138611l(), mo138609j()}), new String[]{str, String.valueOf(i)});
        String str3 = null;
        CursorWrapper cursorWrapper = (CursorWrapper) o;
        if (cursorWrapper.moveToFirst()) {
            str3 = cursorWrapper.getString(0);
        }
        ((C93824b) o).close();
        return str3;
    }

    /* renamed from: a */
    public void mo138598a() {
        ((C93834f) this.f290993f).mo128785a();
    }

    /* renamed from: b */
    public boolean mo138599b(int i, int i2) {
        return ((C93834f) this.f290993f).mo128786b(i, i2);
    }

    /* renamed from: c */
    public void mo138600c() {
        ((C93834f) this.f290993f).mo128788d();
    }

    public int compareTo(Object obj) {
        C99258l lVar = (C99258l) obj;
        if (mo138631d() < lVar.mo138631d()) {
            return -1;
        }
        return mo138631d() > lVar.mo138631d() ? 1 : 0;
    }

    public synchronized void create() {
        Log.m105925i(mo138610k(), "OnCreate %s | isCreated =%b", getName(), Boolean.valueOf(this.f290991d));
        if (!this.f290991d && mo138619t()) {
            Log.m105924i(mo138610k(), "SetCreated");
            this.f290991d = true;
        }
    }

    public final void destroy() {
        Log.m105925i(mo138610k(), "OnDestroy %s | isCreated %b", getName(), Boolean.valueOf(this.f290991d));
        if (this.f290991d && mo138621v()) {
            Log.m105924i(mo138610k(), "SetDestroyed");
            this.f290991d = false;
        }
    }

    /* renamed from: e */
    public void mo138604e(int[] iArr) {
        ArrayList arrayList = new ArrayList(2048);
        Cursor o = ((C93834f) this.f290993f).mo128798o(String.format("SELECT docid FROM %s WHERE type IN " + C99251g.m129291l(iArr) + ";", new Object[]{mo138611l()}), (String[]) null);
        while (true) {
            CursorWrapper cursorWrapper = (CursorWrapper) o;
            if (cursorWrapper.moveToNext()) {
                arrayList.add(Long.valueOf(cursorWrapper.getLong(0)));
            } else {
                ((C93824b) o).close();
                mo138606g(arrayList);
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo138605f(long j) {
        boolean m = ((C93834f) this.f290993f).mo128796m();
        if (!m) {
            ((C93834f) this.f290993f).mo128785a();
        }
        this.f290996i.bindLong(1, j);
        try {
            this.f290996i.execute();
        } catch (Exception e) {
            Log.printErrStackTrace(mo138610k(), e, "deleteIndexByDocId", new Object[0]);
        }
        this.f290997j.bindLong(1, j);
        try {
            this.f290997j.execute();
        } catch (Exception e2) {
            Log.printErrStackTrace(mo138610k(), e2, "deleteMetaByDocIdStmt", new Object[0]);
        }
        if (!m) {
            mo138600c();
        }
    }

    /* renamed from: g */
    public final void mo138606g(List<Long> list) {
        boolean m = ((C93834f) this.f290993f).mo128796m();
        if (!m) {
            ((C93834f) this.f290993f).mo128785a();
        }
        for (Long longValue : list) {
            this.f290996i.bindLong(1, longValue.longValue());
            try {
                this.f290996i.execute();
            } catch (Exception e) {
                Log.printErrStackTrace(mo138610k(), e, "deleteIndexByDocIdStmt", new Object[0]);
            }
        }
        for (Long longValue2 : list) {
            try {
                this.f290997j.bindLong(1, longValue2.longValue());
                this.f290997j.execute();
            } catch (Exception e2) {
                Log.printErrStackTrace(mo138610k(), e2, "deleteMetaByDocIdStmt", new Object[0]);
            }
        }
        if (!m) {
            mo138600c();
        }
    }

    /* renamed from: h */
    public void mo138607h(int[] iArr, long j) {
        ArrayList arrayList = new ArrayList(16);
        String format = String.format("SELECT docid FROM %s WHERE type IN " + C99251g.m129291l(iArr) + " AND entity_id=?;", new Object[]{mo138611l()});
        C99257k kVar = this.f290993f;
        Cursor o = ((C93834f) kVar).mo128798o(format, new String[]{Long.toString(j)});
        while (true) {
            CursorWrapper cursorWrapper = (CursorWrapper) o;
            if (cursorWrapper.moveToNext()) {
                arrayList.add(Long.valueOf(cursorWrapper.getLong(0)));
            } else {
                ((C93824b) o).close();
                mo138606g(arrayList);
                return;
            }
        }
    }

    /* renamed from: i */
    public String mo138608i() {
        return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", new Object[]{mo138611l()});
    }

    /* renamed from: j */
    public final String mo138609j() {
        return "FTS5Index" + mo138612m();
    }

    /* renamed from: k */
    public String mo138610k() {
        return "MicroMsg.FTS.BaseFTS5NativeStorage";
    }

    /* renamed from: l */
    public final String mo138611l() {
        return "FTS5Meta" + mo138612m();
    }

    /* renamed from: m */
    public abstract String mo138612m();

    /* renamed from: n */
    public void mo138613n(int i, int i2, long j, String str, long j2, String str2) {
        String simpleQueryForString;
        int i3 = i2;
        String str3 = str;
        String a = C99251g.m129280a(str2);
        if (!Util.isNullOrNil(a)) {
            boolean m = ((C93834f) this.f290993f).mo128796m();
            if (!m) {
                ((C93834f) this.f290993f).mo128785a();
            }
            try {
                this.f290994g.bindString(1, a);
                this.f290994g.execute();
                try {
                    this.f290995h.bindLong(1, (long) i);
                    this.f290995h.bindLong(2, (long) i3);
                } catch (SQLiteException e) {
                    e = e;
                    long j3 = j;
                    long j4 = j2;
                    Log.m105920e(mo138610k(), String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str3, Long.valueOf(j2)}));
                    simpleQueryForString = this.f291001q.simpleQueryForString();
                    String k = mo138610k();
                    Log.m105920e(k, ">> " + simpleQueryForString);
                    throw e;
                }
                try {
                    this.f290995h.bindLong(3, j);
                    this.f290995h.bindString(4, str3);
                    try {
                        this.f290995h.bindLong(5, j2);
                        this.f290995h.execute();
                        if (!m) {
                            ((C93834f) this.f290993f).mo128788d();
                        }
                        if (mo138617r()) {
                            C101611g<String, String> gVar = this.f290992e;
                            gVar.put(str3 + "​" + i3, a);
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        Log.m105920e(mo138610k(), String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str3, Long.valueOf(j2)}));
                        simpleQueryForString = this.f291001q.simpleQueryForString();
                        if (simpleQueryForString != null && simpleQueryForString.length() > 0) {
                            String k2 = mo138610k();
                            Log.m105920e(k2, ">> " + simpleQueryForString);
                        }
                        throw e;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    long j44 = j2;
                    Log.m105920e(mo138610k(), String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str3, Long.valueOf(j2)}));
                    simpleQueryForString = this.f291001q.simpleQueryForString();
                    String k25 = mo138610k();
                    Log.m105920e(k25, ">> " + simpleQueryForString);
                    throw e;
                }
            } catch (SQLiteException e4) {
                e = e4;
                int i4 = i;
                long j35 = j;
                long j442 = j2;
                Log.m105920e(mo138610k(), String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str3, Long.valueOf(j2)}));
                simpleQueryForString = this.f291001q.simpleQueryForString();
                String k252 = mo138610k();
                Log.m105920e(k252, ">> " + simpleQueryForString);
                throw e;
            }
        }
    }

    /* renamed from: o */
    public List<Long> mo138614o(int[] iArr, String str, int i) {
        String[] strArr = {str};
        Cursor o = ((C93834f) this.f290993f).mo128798o(String.format("SELECT docid FROM %s WHERE aux_index=? AND type IN " + C99251g.m129291l(iArr) + ";", new Object[]{mo138611l()}), strArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            CursorWrapper cursorWrapper = (CursorWrapper) o;
            if (cursorWrapper.moveToNext()) {
                arrayList.add(Long.valueOf(cursorWrapper.getLong(0)));
            } else {
                ((C93824b) o).close();
                mo138615p(arrayList, i);
                return arrayList;
            }
        }
    }

    /* renamed from: p */
    public final void mo138615p(List<Long> list, int i) {
        boolean m = ((C93834f) this.f290993f).mo128796m();
        if (!m) {
            ((C93834f) this.f290993f).mo128785a();
        }
        this.f290998n.bindLong(1, (long) i);
        for (Long longValue : list) {
            this.f290998n.bindLong(2, longValue.longValue());
            this.f290998n.execute();
        }
        if (!m) {
            ((C93834f) this.f290993f).mo128788d();
        }
    }

    /* renamed from: q */
    public List<C99666c> mo138616q(int[] iArr, int i) {
        Cursor o = ((C93834f) this.f290993f).mo128798o(String.format("SELECT docid, type, subtype, aux_index FROM %s WHERE type IN " + C99251g.m129291l(iArr) + ";", new Object[]{mo138611l()}), (String[]) null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            CursorWrapper cursorWrapper = (CursorWrapper) o;
            if (cursorWrapper.moveToNext()) {
                C99666c cVar = new C99666c();
                cVar.f292086a = cursorWrapper.getLong(0);
                cursorWrapper.getInt(1);
                cursorWrapper.getInt(2);
                cVar.f292087b = cursorWrapper.getString(3);
                arrayList.add(cVar);
                arrayList2.add(Long.valueOf(cVar.f292086a));
            } else {
                ((C93824b) o).close();
                mo138615p(arrayList2, i);
                return arrayList;
            }
        }
    }

    /* renamed from: r */
    public boolean mo138617r() {
        return this instanceof C101467b;
    }

    /* renamed from: s */
    public abstract boolean mo138618s();

    /* renamed from: t */
    public final boolean mo138619t() {
        Class cls = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls)).mo128758wd()) {
            Log.m105924i(mo138610k(), "Create Fail!");
            return false;
        }
        this.f290993f = ((C99260q) C86312j.m106911c(cls)).mo128742JS();
        Log.m105924i(mo138610k(), "Create Success!");
        String j = mo138609j();
        String l = mo138611l();
        Log.m105925i(mo138610k(), "indexTableName=%s | metaTableName=%s | TableName=%s", j, l, mo138612m());
        if (!((C93834f) this.f290993f).mo128797n(j) || !((C93834f) this.f290993f).mo128797n(l) || mo138618s()) {
            Log.m105924i(mo138610k(), "Table Not Exist, Need To Create");
            String format = String.format("DROP TABLE IF EXISTS %s;", new Object[]{j});
            String format2 = String.format("DROP TABLE IF EXISTS %s;", new Object[]{l});
            ((C93834f) this.f290993f).mo128792i(format);
            ((C93834f) this.f290993f).mo128792i(format2);
            ((C93834f) this.f290993f).mo128792i(String.format("CREATE VIRTUAL TABLE %s USING fts5(content, tokenize='mmSimple', prefix='1 2 3 4 5');", new Object[]{mo138609j()}));
            ((C93834f) this.f290993f).mo128792i(mo138608i());
            ((C93834f) this.f290993f).mo128792i(String.format("CREATE INDEX IF NOT EXISTS %s_typeId ON %s(type, entity_id);", new Object[]{l, l}));
            ((C93834f) this.f290993f).mo128792i(String.format("CREATE INDEX IF NOT EXISTS %s_entity_id_subtype ON %s(entity_id, subtype);", new Object[]{l, l}));
            ((C93834f) this.f290993f).mo128792i(String.format("CREATE INDEX IF NOT EXISTS %s_aux_index_subtype ON %s(aux_index, subtype);", new Object[]{l, l}));
            ((C93834f) this.f290993f).mo128792i(String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", new Object[]{l, l}));
        } else {
            Log.m105924i(mo138610k(), "Table Exist, Not Need To Create");
        }
        this.f290994g = ((C93834f) this.f290993f).mo128789e(String.format("INSERT INTO %s (content) VALUES (?);", new Object[]{j}));
        this.f290995h = ((C93834f) this.f290993f).mo128789e(String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?);", new Object[]{l}));
        this.f290996i = ((C93834f) this.f290993f).mo128789e(String.format("DELETE FROM %s WHERE rowid=?;", new Object[]{j}));
        this.f290997j = ((C93834f) this.f290993f).mo128789e(String.format("DELETE FROM %s WHERE docid=?;", new Object[]{l}));
        this.f290998n = ((C93834f) this.f290993f).mo128789e(String.format("UPDATE %s SET status=? WHERE docid=?;", new Object[]{l}));
        this.f290999o = ((C93834f) this.f290993f).mo128789e(String.format("UPDATE %s SET status=? WHERE aux_index=? AND status=?", new Object[]{l}));
        this.f291000p = ((C93834f) this.f290993f).mo128789e(String.format("UPDATE %s SET timestamp=? WHERE aux_index=?", new Object[]{l}));
        this.f291001q = ((C93834f) this.f290993f).mo128789e("SELECT mm_last_error();");
        this.f290992e = new C101614i(100);
        mo138620u();
        return true;
    }

    /* renamed from: u */
    public abstract void mo138620u();

    /* renamed from: v */
    public boolean mo138621v() {
        SQLiteStatement sQLiteStatement = this.f290994g;
        if (sQLiteStatement != null) {
            sQLiteStatement.close();
        }
        SQLiteStatement sQLiteStatement2 = this.f290995h;
        if (sQLiteStatement2 != null) {
            sQLiteStatement2.close();
        }
        SQLiteStatement sQLiteStatement3 = this.f290996i;
        if (sQLiteStatement3 != null) {
            sQLiteStatement3.close();
        }
        SQLiteStatement sQLiteStatement4 = this.f290997j;
        if (sQLiteStatement4 != null) {
            sQLiteStatement4.close();
        }
        SQLiteStatement sQLiteStatement5 = this.f290998n;
        if (sQLiteStatement5 != null) {
            sQLiteStatement5.close();
        }
        SQLiteStatement sQLiteStatement6 = this.f291001q;
        if (sQLiteStatement6 != null) {
            sQLiteStatement6.close();
        }
        C101611g<String, String> gVar = this.f290992e;
        if (gVar != null) {
            ((C101614i) gVar).clear();
        }
        this.f290993f = null;
        return true;
    }

    /* renamed from: v5 */
    public final void mo138622v5(int[] iArr, String str) {
        ArrayList arrayList = new ArrayList(16);
        String[] strArr = {str};
        Cursor o = ((C93834f) this.f290993f).mo128798o(String.format("SELECT docid FROM %s WHERE type IN " + C99251g.m129291l(iArr) + " AND aux_index=?;", new Object[]{mo138611l()}), strArr);
        while (true) {
            CursorWrapper cursorWrapper = (CursorWrapper) o;
            if (cursorWrapper.moveToNext()) {
                arrayList.add(Long.valueOf(cursorWrapper.getLong(0)));
            } else {
                ((C93824b) o).close();
                mo138606g(arrayList);
                return;
            }
        }
    }

    /* renamed from: w */
    public Cursor mo138623w(C99672i iVar, int[] iArr, int[] iArr2, String str, boolean z, boolean z2) {
        String str2;
        String str3;
        String d = iVar.mo139044d();
        String str4 = "";
        String format = z ? String.format(", MMHighlight(%s, %d, type, subtype)", new Object[]{mo138609j(), Integer.valueOf(((ArrayList) iVar.f292124e).size())}) : str4;
        String str5 = str != null ? " AND aux_index = ?" : str4;
        if (iArr2 == null || iArr2.length <= 0) {
            str2 = str4;
        } else {
            str2 = " AND subtype IN " + C99251g.m129291l(iArr2);
        }
        if (iArr == null || iArr.length <= 0) {
            str3 = str4;
        } else {
            str3 = " AND type IN " + C99251g.m129291l(iArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp");
        if (z2) {
            str4 = ", content";
        }
        sb.append(str4);
        sb.append(format);
        sb.append(" FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'");
        sb.append(str3);
        sb.append(str5);
        sb.append(" AND status >= 0");
        sb.append(str2);
        sb.append(";");
        return ((C93834f) this.f290993f).mo128798o(String.format(sb.toString(), new Object[]{mo138611l(), mo138611l(), mo138609j(), mo138611l(), mo138609j(), mo138609j(), d}), str != null ? new String[]{str} : null);
    }

    /* renamed from: x */
    public Cursor mo138624x(int[] iArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (!z && !z2 && !z3 && !z4 && !z5) {
            return C79331c.m96022a();
        }
        if (iArr == null || iArr.length == 0) {
            return C79331c.m96022a();
        }
        StringBuilder sb = new StringBuilder(64);
        if (z) {
            sb.append("docid,");
        }
        if (z2) {
            sb.append("entity_id,");
        }
        if (z3) {
            sb.append("aux_index,");
        }
        if (z4) {
            sb.append("timestamp,");
        }
        if (z5) {
            sb.append("status,");
        }
        sb.setLength(sb.length() - 1);
        String sb4 = sb.toString();
        return ((C93834f) this.f290993f).mo128798o(String.format("SELECT %s FROM %s WHERE type IN " + C99251g.m129291l(iArr) + ";", new Object[]{sb4, mo138611l()}), (String[]) null);
    }

    /* renamed from: y */
    public void mo138625y(String str) {
        HashSet hashSet = new HashSet();
        for (String next : this.f290992e.keySet()) {
            if (next.startsWith(str)) {
                hashSet.add(next);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f290992e.remove((String) it.next());
        }
    }

    /* renamed from: z */
    public void mo138626z(long j, long j2) {
        ((C93834f) this.f290993f).mo128800q(j, j2);
    }
}
