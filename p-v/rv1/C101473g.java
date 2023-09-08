package rv1;

import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.wcdb.database.SQLiteStatement;
import f40.C86709a0;
import f62.C75700k0;
import kv1.C99247a;
import kv1.C99257k;

/* renamed from: rv1.g */
public class C101473g extends C99247a {

    /* renamed from: r */
    public SQLiteStatement f297180r;

    /* renamed from: s */
    public SQLiteStatement f297181s;

    /* renamed from: t */
    public SQLiteStatement f297182t;

    /* renamed from: A */
    public boolean mo140975A(String str) {
        return ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Dx0(str) < System.currentTimeMillis() - 5184000000L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0120  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo140976B() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<kv1.q> r1 = kv1.C99260q.class
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r17.mo138611l()
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "SELECT docid, query, score, scene, aux_index, entity_id, type, subtype, timestamp, meta_content FROM %s WHERE status > 0;"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            kv1.k r4 = r0.f290993f
            com.tencent.mm.plugin.fts.f r4 = (com.tencent.p014mm.plugin.fts.C93834f) r4
            r6 = 0
            android.database.Cursor r3 = r4.mo128798o(r3, r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0022:
            r7 = r3
            android.database.CursorWrapper r7 = (android.database.CursorWrapper) r7
            boolean r7 = r7.moveToNext()
            if (r7 == 0) goto L_0x0037
            lv1.m r7 = new lv1.m
            r7.<init>()
            r7.mo139047a(r3)
            r4.add(r7)
            goto L_0x0022
        L_0x0037:
            com.tencent.mm.plugin.fts.b r3 = (com.tencent.p014mm.plugin.fts.C93824b) r3
            r3.close()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x004f:
            boolean r9 = r4.hasNext()
            r10 = 3
            if (r9 == 0) goto L_0x012c
            java.lang.Object r9 = r4.next()
            lv1.m r9 = (lv1.C99680m) r9
            int r11 = r9.f292143g
            r12 = 262144(0x40000, float:3.67342E-40)
            if (r11 != r12) goto L_0x0070
            di3.d r10 = di3.C86312j.m106911c(r1)
            kv1.q r10 = (kv1.C99260q) r10
            r11 = 17
            kv1.l r10 = r10.db0(r11)
        L_0x006e:
            r11 = 0
            goto L_0x0091
        L_0x0070:
            r12 = 393216(0x60000, float:5.51013E-40)
            if (r11 != r12) goto L_0x0081
            di3.d r10 = di3.C86312j.m106911c(r1)
            kv1.q r10 = (kv1.C99260q) r10
            r11 = 512(0x200, float:7.175E-43)
            kv1.l r10 = r10.db0(r11)
            goto L_0x006e
        L_0x0081:
            di3.d r11 = di3.C86312j.m106911c(r1)
            kv1.q r11 = (kv1.C99260q) r11
            kv1.l r10 = r11.db0(r10)
            java.lang.String r11 = r9.f292141e
            boolean r11 = r0.mo140975A(r11)
        L_0x0091:
            if (r11 != 0) goto L_0x009c
            java.lang.String r11 = r9.f292141e
            int r12 = r9.f292144h
            java.lang.String r10 = r10.mo138597O4(r11, r12)
            goto L_0x009d
        L_0x009c:
            r10 = r6
        L_0x009d:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x0120
            java.lang.String r11 = r9.f292138b
            java.lang.String r12 = "​chatroom_tophits"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00ff
            java.util.regex.Pattern r11 = kv1.C99249c.C99250a.f291021c
            java.lang.String r12 = r9.f292146j
            java.lang.String[] r11 = r11.split(r12)
            int r12 = r11.length
            java.lang.String r13 = ""
            r14 = 0
        L_0x00ba:
            if (r14 >= r12) goto L_0x00de
            r15 = r11[r14]
            int r16 = r10.indexOf(r15)
            if (r16 < 0) goto L_0x00da
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            r6.append(r15)
            java.lang.String r13 = "​"
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            r13 = r6
        L_0x00da:
            int r14 = r14 + 1
            r6 = 0
            goto L_0x00ba
        L_0x00de:
            java.lang.String r6 = r9.f292146j
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x00f5
            r9.f292146j = r13
            long r10 = r9.f292137a
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r7.add(r6)
            r8.add(r9)
            goto L_0x0129
        L_0x00f5:
            long r9 = r9.f292137a
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r3.add(r6)
            goto L_0x0129
        L_0x00ff:
            java.lang.String r6 = r9.f292146j
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x0116
            r9.f292146j = r10
            long r10 = r9.f292137a
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r7.add(r6)
            r8.add(r9)
            goto L_0x0129
        L_0x0116:
            long r9 = r9.f292137a
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r3.add(r6)
            goto L_0x0129
        L_0x0120:
            long r9 = r9.f292137a
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r7.add(r6)
        L_0x0129:
            r6 = 0
            goto L_0x004f
        L_0x012c:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            int r4 = r7.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r5] = r4
            int r4 = r8.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 2
            r1[r6] = r4
            java.lang.String r4 = "MicroMsg.FTS.FTS5TopHitsStorage"
            java.lang.String r9 = "updateTopHitsDirty deleteDocIdList=%d needToInsertTopHitListSize=%d normalDocIdList=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r1)
            int r1 = r7.size()
            if (r1 <= 0) goto L_0x015e
            r0.mo138606g(r7)
        L_0x015e:
            int r1 = r8.size()
            if (r1 <= 0) goto L_0x01ed
            kv1.k r1 = r0.f290993f
            com.tencent.mm.plugin.fts.f r1 = (com.tencent.p014mm.plugin.fts.C93834f) r1
            boolean r1 = r1.mo128796m()
            if (r1 != 0) goto L_0x0175
            kv1.k r4 = r0.f290993f
            com.tencent.mm.plugin.fts.f r4 = (com.tencent.p014mm.plugin.fts.C93834f) r4
            r4.mo128785a()
        L_0x0175:
            java.util.Iterator r4 = r8.iterator()
        L_0x0179:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01e8
            java.lang.Object r8 = r4.next()
            lv1.m r8 = (lv1.C99680m) r8
            java.lang.String r9 = r8.f292146j
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0179
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297180r
            java.lang.String r11 = r8.f292146j
            r9.bindString(r2, r11)
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297180r
            r9.execute()
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297181s
            int r11 = r8.f292143g
            long r11 = (long) r11
            r9.bindLong(r2, r11)
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297181s
            int r11 = r8.f292144h
            long r11 = (long) r11
            r9.bindLong(r6, r11)
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297181s
            long r11 = r8.f292142f
            r9.bindLong(r10, r11)
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297181s
            r11 = 4
            java.lang.String r12 = r8.f292141e
            r9.bindString(r11, r12)
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297181s
            r11 = 5
            long r12 = r8.f292145i
            r9.bindLong(r11, r12)
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297181s
            r11 = 6
            java.lang.String r12 = r8.f292138b
            r9.bindString(r11, r12)
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297181s
            r11 = 7
            long r12 = r8.f292140d
            r9.bindLong(r11, r12)
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297181s
            r11 = 8
            long r12 = r8.f292139c
            r9.bindLong(r11, r12)
            com.tencent.wcdb.database.SQLiteStatement r9 = r0.f297181s
            r11 = 9
            java.lang.String r8 = r8.f292146j
            r9.bindString(r11, r8)
            com.tencent.wcdb.database.SQLiteStatement r8 = r0.f297181s
            r8.execute()
            goto L_0x0179
        L_0x01e8:
            if (r1 != 0) goto L_0x01ed
            r17.mo138600c()
        L_0x01ed:
            int r1 = r3.size()
            if (r1 <= 0) goto L_0x01f6
            r0.mo138615p(r3, r5)
        L_0x01f6:
            int r1 = r7.size()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.C101473g.mo140976B():int");
    }

    /* renamed from: d */
    public int mo138631d() {
        return 768;
    }

    public String getName() {
        return "FTS5TopHitsStorage";
    }

    public int getType() {
        return 1;
    }

    /* renamed from: i */
    public String mo138608i() {
        return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, query TEXT COLLATE NOCASE, score INT, scene INT, meta_content TEXT);", new Object[]{mo138611l()});
    }

    /* renamed from: k */
    public String mo138610k() {
        return "MicroMsg.FTS.FTS5TopHitsStorage";
    }

    /* renamed from: m */
    public String mo138612m() {
        return "TopHits";
    }

    /* renamed from: s */
    public boolean mo138618s() {
        return !mo138599b(-100, 6);
    }

    /* renamed from: u */
    public void mo138620u() {
        if (mo138618s()) {
            ((C93834f) this.f290993f).mo128800q(-100, 6);
        }
        C99257k kVar = this.f290993f;
        C93834f fVar = (C93834f) kVar;
        fVar.mo128792i(String.format("CREATE INDEX IF NOT EXISTS %s_query ON %s(query);", new Object[]{mo138611l(), mo138611l()}));
        C99257k kVar2 = this.f290993f;
        C93834f fVar2 = (C93834f) kVar2;
        fVar2.mo128792i(String.format("CREATE INDEX IF NOT EXISTS %s_score ON %s(score);", new Object[]{mo138611l(), mo138611l()}));
        this.f297180r = ((C93834f) this.f290993f).mo128789e(String.format("INSERT INTO %s (content) VALUES (?);", new Object[]{mo138609j()}));
        this.f297181s = ((C93834f) this.f290993f).mo128789e(String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, query, score, scene, meta_content) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?, ?, ?, ?);", new Object[]{mo138611l()}));
        this.f297182t = ((C93834f) this.f290993f).mo128789e(String.format("UPDATE %s SET status=? WHERE aux_index=?", new Object[]{mo138611l()}));
    }

    /* renamed from: v */
    public boolean mo138621v() {
        super.mo138621v();
        this.f297180r.close();
        this.f297181s.close();
        this.f297182t.close();
        return true;
    }
}
