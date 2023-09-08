package com.tencent.p014mm.plugin.fts.logic;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.p014mm.plugin.fts.C93824b;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99249c;
import kv1.C99251g;
import kv1.C99257k;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76727e;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99671h;
import lv1.C99672i;
import lv1.C99678j;
import lv1.C99680m;
import lv1.C99681n;
import lv1.C99682o;
import rv1.C101467b;
import rv1.C101468c;
import rv1.C101473g;

/* renamed from: com.tencent.mm.plugin.fts.logic.g */
public class C93924g extends C99248b {

    /* renamed from: e */
    public C76636p f271052e;

    /* renamed from: f */
    public C101473g f271053f;

    /* renamed from: g */
    public HashSet<String> f271054g;

    /* renamed from: com.tencent.mm.plugin.fts.logic.g$b */
    public class C93926b extends C99664b {

        /* renamed from: j */
        public int f271055j;

        /* renamed from: n */
        public int f271056n;

        public C93926b(C93925a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            this.f271056n = C93924g.this.f271053f.mo140976B();
            C101473g gVar = C93924g.this.f271053f;
            String format = String.format("SELECT docid FROM %s WHERE timestamp < ? OR score = 0;", new Object[]{gVar.mo138611l()});
            C99257k kVar = gVar.f290993f;
            Cursor o = ((C93834f) kVar).mo128798o(format, new String[]{String.valueOf(System.currentTimeMillis() - 5184000000L)});
            LinkedList linkedList = new LinkedList();
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (cursorWrapper.moveToNext()) {
                    linkedList.add(Long.valueOf(cursorWrapper.getLong(0)));
                } else {
                    ((C93824b) o).close();
                    gVar.mo138606g(linkedList);
                    this.f271055j = linkedList.size();
                    return true;
                }
            }
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{topHitsUpdateCount: %d deleteExpiredCount: %d}", new Object[]{Integer.valueOf(this.f271056n), Integer.valueOf(this.f271055j)});
        }

        public String getName() {
            return "BuildTopHitsIndexTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.g$c */
    public class C93927c extends C99678j {
        public C93927c(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 8;
        }

        public String getName() {
            return "SearchTopHitsTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            String str;
            C93927c cVar;
            C10656l lVar2;
            C10656l lVar3 = lVar;
            Class cls = C99260q.class;
            C99672i a = C99672i.m130094a(this.f292133j.f224468c, true);
            lVar3.f32075d = a;
            Log.m105925i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "MatchQuery %s", a.mo139044d().replaceAll("​", ","));
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.f292133j.f224475j);
            lVar3.f32076e = new ArrayList();
            HashSet hashSet2 = new HashSet();
            C101473g gVar = C93924g.this.f271053f;
            C99672i iVar = lVar3.f32075d;
            C76728k kVar = this.f292133j;
            int[] iArr = kVar.f224472g;
            int i = kVar.f224480o;
            int size = kVar.f224474i + kVar.f224475j.size();
            gVar.getClass();
            String str2 = iVar.f292120a + '%';
            String format = String.format("AND %s MATCH '%s'", new Object[]{gVar.mo138609j(), iVar.mo139044d()});
            String str3 = "AND type IN " + C99251g.m129291l(iArr);
            if (size > 0) {
                str = "LIMIT " + size;
            } else {
                str = "";
            }
            char c = 6;
            Cursor o = ((C93834f) gVar.f290993f).mo128798o(String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype), query, scene FROM %s, %s WHERE %s %s %s %s %s AND %s.docid = %s.rowid ORDER BY score desc %s;", new Object[]{gVar.mo138611l(), gVar.mo138609j(), Long.valueOf((long) ((ArrayList) iVar.f292124e).size()), gVar.mo138609j(), gVar.mo138611l(), "query LIKE ?", format, str3, "AND scene=?", "AND status >= 0 AND score >= 3", gVar.mo138611l(), gVar.mo138609j(), str}), new String[]{str2, String.valueOf(i)});
            while (true) {
                try {
                    if (!((CursorWrapper) o).moveToNext()) {
                        cVar = this;
                        lVar2 = lVar;
                        break;
                    }
                    C99682o oVar = new C99682o();
                    oVar.mo139050c(o);
                    if (hashSet.add(oVar.f292151e)) {
                        oVar.mo139048a();
                        oVar.f292161o = "";
                        int i2 = oVar.f292148b;
                        if (i2 == 262144) {
                            C76727e A = ((C101468c) ((C99260q) C86312j.m106911c(cls)).db0(17)).mo140968A((int) oVar.f292150d);
                            oVar.f292161o = A;
                            if (A == null) {
                                continue;
                            } else {
                                cVar = this;
                            }
                        } else if (i2 == 131072) {
                            cVar = this;
                            try {
                                if (C93924g.this.f271053f.mo140975A(oVar.f292151e)) {
                                    hashSet2.add(oVar.f292151e);
                                }
                            } catch (Throwable th) {
                                th = th;
                                ((C93824b) o).close();
                                throw th;
                            }
                        } else {
                            cVar = this;
                            if (i2 == 393216 && Util.isNullOrNil(((C99260q) C86312j.m106911c(cls)).db0(512).mo138597O4(oVar.f292151e, oVar.f292149c))) {
                            }
                        }
                        lVar2 = lVar;
                        lVar2.f32076e.add(oVar);
                        if (lVar2.f32076e.size() >= cVar.f292133j.f224474i) {
                            break;
                        }
                    } else {
                        C10656l lVar4 = lVar;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    ((C93824b) o).close();
                    throw th;
                }
            }
            ((C93824b) o).close();
            Log.m105919d("MicroMsg.FTS.FTS5SearchTopHitsLogic", "History TopHits %s", Integer.valueOf(lVar2.f32076e.size()));
            if (lVar2.f32075d.f292122c.length > 1) {
                if (lVar2.f32076e.size() > 2) {
                    lVar2.f32076e = lVar2.f32076e.subList(0, 2);
                }
                hashSet.clear();
                for (int i3 = 0; i3 < lVar2.f32076e.size(); i3++) {
                    hashSet.add(lVar2.f32076e.get(i3).f292151e);
                }
                HashSet hashSet3 = new HashSet();
                C101473g gVar2 = C93924g.this.f271053f;
                C99672i iVar2 = lVar2.f32075d;
                C76728k kVar2 = cVar.f292133j;
                int[] iArr2 = kVar2.f224472g;
                int i4 = kVar2.f224480o;
                int size2 = kVar2.f224474i + kVar2.f224475j.size();
                gVar2.getClass();
                String d = iVar2.mo139044d();
                Cursor o2 = ((C93834f) gVar2.f290993f).mo128798o(String.format("SELECT aux_index FROM %s, %s WHERE %s.docid = %s.rowid AND query = ? AND scene = " + i4 + (" AND type IN " + C99251g.m129291l(iArr2)) + " AND status >= 0 AND score >= 2" + String.format(" AND %s MATCH '%s'", new Object[]{gVar2.mo138609j(), d}) + " ORDER BY score desc limit " + size2 + ";", new Object[]{gVar2.mo138611l(), gVar2.mo138609j(), gVar2.mo138611l(), gVar2.mo138609j(), gVar2.mo138611l(), gVar2.mo138609j()}), new String[]{"​chatroom_tophits"});
                while (true) {
                    CursorWrapper cursorWrapper = (CursorWrapper) o2;
                    if (!cursorWrapper.moveToNext()) {
                        break;
                    }
                    String string = cursorWrapper.getString(0);
                    if (!hashSet.contains(string)) {
                        hashSet3.add(string);
                    }
                }
                ((C93824b) o2).close();
                C101467b bVar = (C101467b) ((C99260q) C86312j.m106911c(cls)).db0(3);
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    C99672i iVar3 = lVar2.f32075d;
                    bVar.getClass();
                    String d2 = iVar3.mo139044d();
                    Object[] objArr = new Object[9];
                    objArr[0] = bVar.mo138611l();
                    objArr[1] = bVar.mo138609j();
                    objArr[2] = Long.valueOf((long) ((ArrayList) iVar3.f292124e).size());
                    objArr[3] = bVar.mo138611l();
                    objArr[4] = bVar.mo138609j();
                    objArr[5] = bVar.mo138611l();
                    objArr[c] = bVar.mo138609j();
                    objArr[7] = bVar.mo138609j();
                    objArr[8] = d2;
                    Cursor o3 = ((C93834f) bVar.f290993f).mo128798o(String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index = ? AND type = 131075 AND subtype= 38;", objArr), new String[]{(String) it.next()});
                    if (((CursorWrapper) o3).moveToNext()) {
                        C99682o oVar2 = new C99682o();
                        oVar2.mo139050c(o3);
                        oVar2.f292161o = "​chatroom_tophits";
                        oVar2.mo139048a();
                        lVar2.f32076e.add(oVar2);
                        if (lVar2.f32076e.size() >= cVar.f292133j.f224474i) {
                            break;
                        }
                    }
                    ((C93824b) o3).close();
                    c = 6;
                }
            }
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                C93924g.this.mo128842c((String) it4.next());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.g$d */
    public class C93928d extends C99664b {

        /* renamed from: j */
        public String f271059j;

        /* renamed from: n */
        public C99681n f271060n;

        /* renamed from: o */
        public int f271061o;

        /* renamed from: p */
        public HashMap<String, String> f271062p;

        public C93928d(C93925a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            int i;
            int i2;
            String str;
            String str2;
            String str3;
            int i3;
            int i4;
            C101473g gVar = C93924g.this.f271053f;
            String str4 = this.f271059j;
            C99681n nVar = this.f271060n;
            int i5 = this.f271061o;
            HashMap<String, String> hashMap = this.f271062p;
            gVar.getClass();
            String trim = str4.trim();
            hashMap.remove(nVar.f292151e);
            long currentTimeMillis = System.currentTimeMillis();
            int i6 = nVar.f292148b;
            if ((i6 == 131072 || i6 == 131075) && gVar.mo140975A(nVar.f292151e)) {
                Log.m105924i("MicroMsg.FTS.FTS5TopHitsStorage", "last contact msg time older than 60 days");
                return true;
            }
            ((C93834f) gVar.f290993f).mo128785a();
            Cursor o = ((C93834f) gVar.f290993f).mo128798o(String.format("SELECT docid, score FROM %s WHERE query=? AND aux_index=? AND subtype = ? AND scene=?;", new Object[]{gVar.mo138611l()}), new String[]{trim, nVar.f292151e, String.valueOf(nVar.f292149c), String.valueOf(i5)});
            CursorWrapper cursorWrapper = (CursorWrapper) o;
            if (cursorWrapper.moveToNext()) {
                i = cursorWrapper.getInt(0);
                i2 = cursorWrapper.getInt(1);
            } else {
                i2 = -1;
                i = -1;
            }
            ((C93824b) o).close();
            String str5 = "";
            for (Map.Entry next : hashMap.entrySet()) {
                if (!((String) next.getValue()).equals("​chatroom_tophits")) {
                    str5 = str5 + "'" + ((String) next.getKey()) + "',";
                }
            }
            if (str5.length() > 0) {
                StringBuilder sb = new StringBuilder();
                str = "MicroMsg.FTS.FTS5TopHitsStorage";
                sb.append("AND aux_index IN (");
                str2 = trim;
                sb.append(str5.substring(0, str5.length() - 1));
                sb.append(")");
                ((C93834f) gVar.f290993f).mo128792i(String.format("UPDATE %s SET score=CASE WHEN score > 6 THEN 6 WHEN score > 2 THEN (score - 1) ELSE score END WHERE scene = %d %s;", new Object[]{gVar.mo138611l(), Integer.valueOf(i5), sb.toString()}));
            } else {
                str2 = trim;
                str = "MicroMsg.FTS.FTS5TopHitsStorage";
            }
            String str6 = "";
            for (Map.Entry next2 : hashMap.entrySet()) {
                if (((String) next2.getValue()).equals("​chatroom_tophits")) {
                    str6 = str6 + "'" + ((String) next2.getKey()) + "',";
                }
            }
            if (str6.length() > 0) {
                ((C93834f) gVar.f290993f).mo128793j(String.format("UPDATE %s SET score=CASE WHEN score = 1 THEN 0 WHEN score < 5 THEN (score - 1) ELSE 4 END WHERE query = ? AND scene = %d %s;", new Object[]{gVar.mo138611l(), Integer.valueOf(i5), "AND aux_index IN(" + str6.substring(0, str6.length() - 1) + ")"}), new String[]{"​chatroom_tophits"});
            }
            if (i < 0 || i2 < 0) {
                gVar.f297180r.bindString(1, nVar.f292154h);
                gVar.f297180r.execute();
                gVar.f297181s.bindLong(1, (long) nVar.f292148b);
                gVar.f297181s.bindLong(2, (long) nVar.f292149c);
                gVar.f297181s.bindLong(3, nVar.f292150d);
                gVar.f297181s.bindString(4, nVar.f292151e);
                gVar.f297181s.bindLong(5, currentTimeMillis);
                str3 = str2;
                gVar.f297181s.bindString(6, str3);
                gVar.f297181s.bindLong(7, 3);
                gVar.f297181s.bindLong(8, (long) i5);
                gVar.f297181s.bindString(9, nVar.f292154h);
                gVar.f297181s.execute();
            } else {
                if (i2 > 6) {
                    i4 = i2 + 1;
                    i3 = 3;
                } else {
                    i3 = 3;
                    i4 = i2 + 3;
                }
                String format = String.format("UPDATE %s SET score=?, timestamp=? WHERE docid=?", new Object[]{gVar.mo138611l()});
                String[] strArr = new String[i3];
                strArr[0] = String.valueOf(i4);
                strArr[1] = String.valueOf(currentTimeMillis);
                strArr[2] = String.valueOf(i);
                ((C93834f) gVar.f290993f).mo128793j(format, strArr);
                str3 = str2;
            }
            ((C93834f) gVar.f290993f).mo128788d();
            String[] split = C99249c.C99250a.f291024f.split(str3);
            if (split.length <= 1 || nVar.f292148b != 131075 || nVar.f292149c != 38) {
                return true;
            }
            HashSet hashSet = new HashSet();
            C99680m mVar = new C99680m();
            Cursor o2 = ((C93834f) gVar.f290993f).mo128798o(String.format("SELECT docid, query, score, scene, aux_index, entity_id, type, subtype, timestamp, meta_content FROM %s WHERE aux_index=? AND query=?;", new Object[]{gVar.mo138611l()}), new String[]{nVar.f292151e, "​chatroom_tophits"});
            if (((CursorWrapper) o2).moveToNext()) {
                mVar.mo139047a(o2);
                for (String add : C99249c.C99250a.f291021c.split(mVar.f292146j)) {
                    hashSet.add(add);
                }
            }
            ((C93824b) o2).close();
            int i7 = 0;
            while (i7 < ((ArrayList) nVar.f292160n).size() && i7 < split.length) {
                C99671h hVar = (C99671h) ((ArrayList) nVar.f292160n).get(i7);
                if (hashSet.add(hVar.f292111c)) {
                    mVar.f292146j += hVar.f292111c + "​";
                }
                i7++;
            }
            Log.m105925i(str, "update tophits content=%s", mVar.f292146j);
            long j = mVar.f292137a;
            if (j > 0) {
                gVar.mo138605f(j);
            }
            mVar.f292137a = 0;
            mVar.f292138b = "​chatroom_tophits";
            mVar.f292140d++;
            mVar.f292139c = (long) i5;
            mVar.f292141e = nVar.f292151e;
            mVar.f292142f = nVar.f292150d;
            mVar.f292143g = nVar.f292148b;
            mVar.f292144h = nVar.f292149c;
            mVar.f292145i = currentTimeMillis;
            ((C93834f) gVar.f290993f).mo128785a();
            gVar.f297180r.bindString(1, mVar.f292146j);
            gVar.f297180r.execute();
            gVar.f297181s.bindLong(1, (long) mVar.f292143g);
            gVar.f297181s.bindLong(2, (long) mVar.f292144h);
            gVar.f297181s.bindLong(3, mVar.f292142f);
            gVar.f297181s.bindString(4, mVar.f292141e);
            gVar.f297181s.bindLong(5, mVar.f292145i);
            gVar.f297181s.bindString(6, mVar.f292138b);
            gVar.f297181s.bindLong(7, mVar.f292140d);
            gVar.f297181s.bindLong(8, mVar.f292139c);
            gVar.f297181s.bindString(9, mVar.f292146j);
            gVar.f297181s.execute();
            ((C93834f) gVar.f290993f).mo128788d();
            return true;
        }

        public String getName() {
            return "UpdateTopHitsWithQueryTask";
        }

        public String toString() {
            return String.format("%s : query=%s scene=%d", new Object[]{super.toString(), this.f271059j, Integer.valueOf(this.f271061o)});
        }
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "Create Success!");
        this.f271054g = new HashSet<>();
        this.f271053f = (C101473g) ((C99260q) C86312j.m106911c(cls)).db0(1);
        C76636p Jd = ((C99260q) C86312j.m106911c(cls)).mo128743Jd();
        this.f271052e = Jd;
        ((C93836i) Jd).mo128803c(65626, new C93926b((C93925a) null));
        return true;
    }

    /* renamed from: b */
    public boolean mo128810b() {
        HashSet<String> hashSet = this.f271054g;
        if (hashSet != null) {
            hashSet.clear();
        }
        this.f271053f = null;
        this.f271052e = null;
        return true;
    }

    /* renamed from: c */
    public void mo128842c(String str) {
        if (this.f271054g.add(str)) {
            C101473g gVar = this.f271053f;
            gVar.f297182t.bindLong(1, 1);
            gVar.f297182t.bindString(2, str);
            gVar.f297182t.execute();
        }
    }

    public String getName() {
        return "FTS5SearchTopHitsLogic";
    }

    /* renamed from: k4 */
    public void mo128843k4(String str, C99681n nVar, int i, HashMap<String, String> hashMap) {
        C93928d dVar = new C93928d((C93925a) null);
        dVar.f271059j = str;
        dVar.f271060n = nVar;
        dVar.f271061o = i;
        dVar.f271062p = hashMap;
        ((C93836i) this.f271052e).mo128803c(65626, dVar);
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        return ((C93836i) this.f271052e).mo128803c(-65536, new C93927c(kVar));
    }
}
