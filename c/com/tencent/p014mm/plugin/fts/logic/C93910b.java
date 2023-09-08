package com.tencent.p014mm.plugin.fts.logic;

import a11.C39479c;
import com.tencent.p014mm.plugin.fts.C68985g;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44661m1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kv1.C61172m;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99258l;
import kv1.C99260q;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99678j;
import p823sg.C90193h;
import rv1.C101466a;
import sx3.C110818d0;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.fts.logic.b */
public final class C93910b extends C99248b {

    /* renamed from: e */
    public C76636p f271022e;

    /* renamed from: f */
    public C101466a f271023f;

    /* renamed from: g */
    public final int f271024g = 131093;

    /* renamed from: h */
    public final HashSet<String> f271025h = new HashSet<>();

    /* renamed from: i */
    public final MStorage.IOnStorageChange f271026i = new C93915e(this);

    /* renamed from: com.tencent.mm.plugin.fts.logic.b$a */
    public final class C93911a extends C99664b {

        /* renamed from: j */
        public HashSet<String> f271027j;

        /* renamed from: n */
        public int f271028n;

        /* renamed from: o */
        public int f271029o;

        /* renamed from: p */
        public int f271030p;

        /* renamed from: q */
        public int f271031q;

        public C93911a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
            cy3.C58003b.m67160a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
            throw r2;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo57099b() {
            /*
                r10 = this;
                java.util.HashSet<java.lang.String> r0 = r10.f271027j
                r1 = 0
                r2 = 0
                java.lang.String r3 = "MicroMsg.FTS.FTS5SearchChatroomMemberLogic"
                if (r0 != 0) goto L_0x0069
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r10.f271027j = r0
                com.tencent.mm.sdk.storage.sql.SingleTable r0 = lv1.C34381a.f92596a
                com.tencent.mm.sdk.storage.sql.Column r4 = lv1.C34381a.f92597b
                java.util.List r4 = sx3.C26236u.m33719b(r4)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r4)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.log(r3)
                com.tencent.mm.sdk.storage.sql.SelectSql r0 = r0.build()
                com.tencent.mm.plugin.fts.logic.b r4 = com.tencent.p014mm.plugin.fts.logic.C93910b.this
                rv1.a r4 = r4.f271023f
                if (r4 == 0) goto L_0x005d
                kv1.k r4 = r4.f290993f
                if (r4 == 0) goto L_0x005d
                java.lang.String r5 = r0.toSql()
                java.lang.String[] r0 = r0.getParams()
                com.tencent.mm.plugin.fts.f r4 = (com.tencent.p014mm.plugin.fts.C93834f) r4
                android.database.Cursor r0 = r4.mo128798o(r5, r0)
            L_0x003b:
                r4 = r0
                android.database.CursorWrapper r4 = (android.database.CursorWrapper) r4     // Catch:{ all -> 0x0056 }
                boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x0056 }
                if (r5 == 0) goto L_0x0050
                java.util.HashSet<java.lang.String> r5 = r10.f271027j     // Catch:{ all -> 0x0056 }
                if (r5 == 0) goto L_0x003b
                java.lang.String r4 = r4.getString(r1)     // Catch:{ all -> 0x0056 }
                r5.add(r4)     // Catch:{ all -> 0x0056 }
                goto L_0x003b
            L_0x0050:
                rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0056 }
                cy3.C58003b.m67160a(r0, r2)
                goto L_0x005d
            L_0x0056:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0058 }
            L_0x0058:
                r2 = move-exception
                cy3.C58003b.m67160a(r0, r1)
                throw r2
            L_0x005d:
                java.util.HashSet<java.lang.String> r0 = r10.f271027j
                if (r0 == 0) goto L_0x0066
                int r0 = r0.size()
                goto L_0x0067
            L_0x0066:
                r0 = 0
            L_0x0067:
                r10.f271029o = r0
            L_0x0069:
                java.lang.String r0 = "getBuildChatroomSet"
                r10.mo139040h(r0)
            L_0x006e:
                boolean r0 = java.lang.Thread.interrupted()
                if (r0 != 0) goto L_0x019d
                com.tencent.mm.sdk.storage.sql.SingleTable r0 = p749xh.C53335e1.f149283M
                r4 = 3
                com.tencent.mm.sdk.storage.sql.Column[] r4 = new com.tencent.p014mm.sdk.storage.sql.Column[r4]
                com.tencent.mm.sdk.storage.sql.Column r5 = p749xh.C53335e1.f149285P
                r4[r1] = r5
                com.tencent.mm.sdk.storage.sql.Column r5 = p749xh.C53335e1.f149286Q
                r6 = 1
                r4[r6] = r5
                r5 = 2
                com.tencent.mm.sdk.storage.sql.Column r7 = p749xh.C53335e1.f149290S
                r4[r5] = r7
                java.util.List r4 = sx3.C64197v.m75537f(r4)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r4)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.log(r3)
                int r4 = r10.f271028n
                r5 = 50
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.limit(r5, r4)
                com.tencent.mm.sdk.storage.sql.Column r4 = p749xh.C53335e1.f149284N
                com.tencent.mm.sdk.storage.sql.ISqlOrder r4 = r4.orderInc()
                java.util.List r4 = sx3.C26236u.m33719b(r4)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r4)
                com.tencent.mm.sdk.storage.sql.SelectSql r0 = r0.build()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r5)
                f40.o r7 = f40.C86709a0.m107535s()
                zh3.f r7 = r7.f251811i
                java.lang.Class<com.tencent.mm.storage.m1> r8 = com.tencent.p014mm.storage.C44661m1.class
                java.util.List r0 = r0.multiQuery(r7, r8)
                com.tencent.mm.plugin.fts.logic.b r7 = com.tencent.p014mm.plugin.fts.logic.C93910b.this
                java.util.Iterator r0 = r0.iterator()
            L_0x00c4:
                boolean r8 = r0.hasNext()
                if (r8 == 0) goto L_0x00da
                java.lang.Object r8 = r0.next()
                com.tencent.mm.storage.m1 r8 = (com.tencent.p014mm.storage.C44661m1) r8
                boolean r9 = r7.mo128835d(r8)
                if (r9 != 0) goto L_0x00c4
                r4.add(r8)
                goto L_0x00c4
            L_0x00da:
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L_0x011f
                java.lang.String r0 = "buildChatroomMemberIndex"
                r10.mo139040h(r0)
                java.util.HashSet<java.lang.String> r0 = r10.f271027j
                if (r0 == 0) goto L_0x0119
                boolean r3 = r0.isEmpty()
                r3 = r3 ^ r6
                if (r3 == 0) goto L_0x00f1
                r2 = r0
            L_0x00f1:
                if (r2 == 0) goto L_0x0119
                com.tencent.mm.plugin.fts.logic.b r0 = com.tencent.p014mm.plugin.fts.logic.C93910b.this
                java.util.Iterator r2 = r2.iterator()
            L_0x00f9:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0119
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                int r4 = r10.f271031q
                int r4 = r4 + r6
                r10.f271031q = r4
                rv1.a r4 = r0.f271023f
                if (r4 == 0) goto L_0x00f9
                int[] r5 = new int[r6]
                r7 = 2097168(0x200010, float:2.938758E-39)
                r5[r1] = r7
                r4.mo138622v5(r5, r3)
                goto L_0x00f9
            L_0x0119:
                java.lang.String r0 = "deleteUnuseChatroom"
                r10.mo139040h(r0)
                return r6
            L_0x011f:
                int r0 = r10.f271028n
                int r0 = r0 + r5
                r10.f271028n = r0
                com.tencent.mm.plugin.fts.logic.b r0 = com.tencent.p014mm.plugin.fts.logic.C93910b.this
                rv1.a r0 = r0.f271023f
                if (r0 == 0) goto L_0x0136
                kv1.k r0 = r0.f290993f
                com.tencent.mm.plugin.fts.f r0 = (com.tencent.p014mm.plugin.fts.C93834f) r0
                boolean r0 = r0.mo128796m()
                if (r0 != r6) goto L_0x0136
                r0 = 1
                goto L_0x0137
            L_0x0136:
                r0 = 0
            L_0x0137:
                if (r0 != 0) goto L_0x0142
                com.tencent.mm.plugin.fts.logic.b r0 = com.tencent.p014mm.plugin.fts.logic.C93910b.this
                rv1.a r0 = r0.f271023f
                if (r0 == 0) goto L_0x0142
                r0.mo138598a()
            L_0x0142:
                java.util.Iterator r0 = r4.iterator()
                java.lang.String r4 = "resultList.iterator()"
                gy3.C87412m.m108593f(r0, r4)
            L_0x014c:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x017e
                java.lang.Object r4 = r0.next()
                java.lang.String r5 = "resultIterator.next()"
                gy3.C87412m.m108593f(r4, r5)
                com.tencent.mm.storage.m1 r4 = (com.tencent.p014mm.storage.C44661m1) r4
                java.util.HashSet<java.lang.String> r5 = r10.f271027j
                if (r5 == 0) goto L_0x016c
                java.lang.String r7 = r4.field_chatroomname
                boolean r5 = r5.remove(r7)
                if (r5 != r6) goto L_0x016c
                r5 = 1
                goto L_0x016d
            L_0x016c:
                r5 = 0
            L_0x016d:
                if (r5 == 0) goto L_0x0173
                r0.remove()
                goto L_0x014c
            L_0x0173:
                int r5 = r10.f271030p
                int r5 = r5 + r6
                r10.f271030p = r5
                com.tencent.mm.plugin.fts.logic.b r5 = com.tencent.p014mm.plugin.fts.logic.C93910b.this
                com.tencent.p014mm.plugin.fts.logic.C93910b.m118650c(r5, r4)
                goto L_0x014c
            L_0x017e:
                com.tencent.mm.plugin.fts.logic.b r0 = com.tencent.p014mm.plugin.fts.logic.C93910b.this
                rv1.a r0 = r0.f271023f
                if (r0 == 0) goto L_0x018f
                kv1.k r0 = r0.f290993f
                com.tencent.mm.plugin.fts.f r0 = (com.tencent.p014mm.plugin.fts.C93834f) r0
                boolean r0 = r0.mo128796m()
                if (r0 != r6) goto L_0x018f
                goto L_0x0190
            L_0x018f:
                r6 = 0
            L_0x0190:
                if (r6 == 0) goto L_0x006e
                com.tencent.mm.plugin.fts.logic.b r0 = com.tencent.p014mm.plugin.fts.logic.C93910b.this
                rv1.a r0 = r0.f271023f
                if (r0 == 0) goto L_0x006e
                r0.mo138600c()
                goto L_0x006e
            L_0x019d:
                java.lang.InterruptedException r0 = new java.lang.InterruptedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.logic.C93910b.C93911a.mo57099b():boolean");
        }

        /* renamed from: c */
        public String mo94944c() {
            String format = String.format("{build: " + this.f271029o + " new: " + this.f271030p + ", remove: " + this.f271031q, Arrays.copyOf(new Object[0], 0));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }

        public String getName() {
            return "BuildChatroomMemberIndexTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.b$b */
    public final class C93912b extends C99664b {

        /* renamed from: j */
        public final C44661m1 f271033j;

        /* renamed from: n */
        public final /* synthetic */ C93910b f271034n;

        public C93912b(C93910b bVar, C44661m1 m1Var) {
            C87412m.m108594g(m1Var, "chatroomMember");
            this.f271034n = bVar;
            this.f271033j = m1Var;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Log.m105924i("MicroMsg.FTS.FTS5SearchChatroomMemberLogic", "buildChatroomMember " + this.f271033j.field_chatroomname);
            C101466a aVar = this.f271034n.f271023f;
            if (aVar != null) {
                aVar.mo138622v5(new int[]{2097168}, this.f271033j.field_chatroomname);
            }
            if (!this.f271034n.mo128835d(this.f271033j)) {
                C93910b.m118650c(this.f271034n, this.f271033j);
            }
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return "usename: " + this.f271033j.field_chatroomname;
        }

        public String getName() {
            return "BuildSingleChatroomMemberTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.b$c */
    public final class C93913c extends C99678j {

        /* renamed from: p */
        public final /* synthetic */ C93910b f271035p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93913c(C93910b bVar, C76728k kVar) {
            super(kVar);
            C87412m.m108594g(kVar, "ftsRequest");
            this.f271035p = bVar;
        }

        public String getName() {
            return "SearchCommonChatroomTask";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bd, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00be, code lost:
            cy3.C58003b.m67160a(r1, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c1, code lost:
            throw r0;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo128820i(lv1.C10656l r7) {
            /*
                r6 = this;
                lv1.k r0 = r6.f292133j
                com.tencent.mm.plugin.fts.logic.b r1 = r6.f271035p
                if (r7 == 0) goto L_0x00c2
                if (r0 == 0) goto L_0x00c2
                java.util.List<java.lang.String> r2 = r0.f224482q
                lv1.i r2 = lv1.C99672i.m130096c(r2)
                java.util.List<java.lang.String> r3 = r0.f224482q
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                int r3 = r3.size()
                int r3 = r3 + 1
                r7.f32075d = r2
                rv1.a r1 = r1.f271023f
                if (r1 == 0) goto L_0x00c2
                java.lang.String r2 = r2.mo139044d()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "SELECT aux_index FROM "
                r4.append(r5)
                java.lang.String r5 = r1.mo138609j()
                r4.append(r5)
                java.lang.String r5 = " NOT INDEXED JOIN "
                r4.append(r5)
                java.lang.String r5 = r1.mo138611l()
                r4.append(r5)
                java.lang.String r5 = " ON ("
                r4.append(r5)
                java.lang.String r5 = r1.mo138611l()
                r4.append(r5)
                java.lang.String r5 = ".docid = "
                r4.append(r5)
                java.lang.String r5 = r1.mo138609j()
                r4.append(r5)
                java.lang.String r5 = ".rowid) WHERE "
                r4.append(r5)
                java.lang.String r5 = r1.mo138609j()
                r4.append(r5)
                java.lang.String r5 = " MATCH '"
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = "' AND entity_id = "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = " ORDER BY timestamp DESC;"
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r3)
                java.lang.String r2 = java.lang.String.format(r2, r4)
                java.lang.String r4 = "format(format, *args)"
                gy3.C87412m.m108593f(r2, r4)
                kv1.k r1 = r1.f290993f
                com.tencent.mm.plugin.fts.f r1 = (com.tencent.p014mm.plugin.fts.C93834f) r1
                r4 = 0
                android.database.Cursor r1 = r1.mo128798o(r2, r4)
            L_0x0095:
                boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x00bb }
                if (r2 == 0) goto L_0x00b5
                lv1.o r2 = new lv1.o     // Catch:{ all -> 0x00bb }
                r2.<init>()     // Catch:{ all -> 0x00bb }
                java.lang.String r5 = r1.getString(r3)     // Catch:{ all -> 0x00bb }
                r2.f292151e = r5     // Catch:{ all -> 0x00bb }
                java.util.List<lv1.n> r5 = r7.f32076e     // Catch:{ all -> 0x00bb }
                r5.add(r2)     // Catch:{ all -> 0x00bb }
                java.util.List<lv1.n> r2 = r7.f32076e     // Catch:{ all -> 0x00bb }
                int r2 = r2.size()     // Catch:{ all -> 0x00bb }
                int r5 = r0.f224474i     // Catch:{ all -> 0x00bb }
                if (r2 < r5) goto L_0x0095
            L_0x00b5:
                rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00bb }
                cy3.C58003b.m67160a(r1, r4)
                goto L_0x00c2
            L_0x00bb:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x00bd }
            L_0x00bd:
                r0 = move-exception
                cy3.C58003b.m67160a(r1, r7)
                throw r0
            L_0x00c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.logic.C93910b.C93913c.mo128820i(lv1.l):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.b$d */
    public final class C93914d extends C99678j {

        /* renamed from: p */
        public final /* synthetic */ C93910b f271036p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93914d(C93910b bVar, C76728k kVar) {
            super(kVar);
            C87412m.m108594g(kVar, "ftsRequest");
            this.f271036p = bVar;
        }

        public String getName() {
            return "SearchCommonChatroomUserTask";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cf, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d0, code lost:
            cy3.C58003b.m67160a(r1, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d3, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x009c A[Catch:{ all -> 0x00cf }] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo128820i(lv1.C10656l r12) {
            /*
                r11 = this;
                lv1.k r0 = r11.f292133j
                com.tencent.mm.plugin.fts.logic.b r1 = r11.f271036p
                if (r12 == 0) goto L_0x01c7
                if (r0 == 0) goto L_0x01c7
                java.util.List<java.lang.String> r2 = r0.f224482q
                lv1.i r2 = lv1.C99672i.m130096c(r2)
                r12.f32075d = r2
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
                java.lang.String r4 = eb0.C75592q0.m90789s()
                rv1.a r1 = r1.f271023f
                if (r1 == 0) goto L_0x00d4
                r5 = 50
                java.lang.String r2 = r2.mo139044d()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "SELECT content FROM "
                r6.append(r7)
                java.lang.String r7 = r1.mo138609j()
                r6.append(r7)
                java.lang.String r7 = " NOT INDEXED JOIN "
                r6.append(r7)
                java.lang.String r7 = r1.mo138611l()
                r6.append(r7)
                java.lang.String r7 = " ON ("
                r6.append(r7)
                java.lang.String r7 = r1.mo138611l()
                r6.append(r7)
                java.lang.String r7 = ".docid = "
                r6.append(r7)
                java.lang.String r7 = r1.mo138609j()
                r6.append(r7)
                java.lang.String r7 = ".rowid) WHERE "
                r6.append(r7)
                java.lang.String r7 = r1.mo138609j()
                r6.append(r7)
                java.lang.String r7 = " MATCH '"
                r6.append(r7)
                r6.append(r2)
                java.lang.String r2 = "' AND entity_id <= "
                r6.append(r2)
                r6.append(r5)
                java.lang.String r2 = " ORDER BY timestamp DESC LIMIT 10;"
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r5 = 0
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)
                java.lang.String r2 = java.lang.String.format(r2, r6)
                java.lang.String r6 = "format(format, *args)"
                gy3.C87412m.m108593f(r2, r6)
                kv1.k r1 = r1.f290993f
                com.tencent.mm.plugin.fts.f r1 = (com.tencent.p014mm.plugin.fts.C93834f) r1
                r6 = 0
                android.database.Cursor r1 = r1.mo128798o(r2, r6)
            L_0x0096:
                boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x00cd }
                if (r2 == 0) goto L_0x00c7
                java.lang.String r2 = r1.getString(r5)     // Catch:{ all -> 0x00cd }
                java.util.regex.Pattern r7 = kv1.C99249c.C99250a.f291021c     // Catch:{ all -> 0x00cd }
                java.lang.String[] r2 = r7.split(r2)     // Catch:{ all -> 0x00cd }
                java.lang.String r7 = "SPLIT_FIRST_CONTENT_PATTERN.split(content)"
                gy3.C87412m.m108593f(r2, r7)     // Catch:{ all -> 0x00cd }
                int r7 = r2.length     // Catch:{ all -> 0x00cd }
                r8 = 0
            L_0x00ad:
                if (r8 >= r7) goto L_0x0096
                r9 = r2[r8]     // Catch:{ all -> 0x00cd }
                java.util.List<java.lang.String> r10 = r0.f224482q     // Catch:{ all -> 0x00cd }
                java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ all -> 0x00cd }
                boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x00cd }
                if (r10 != 0) goto L_0x00c4
                boolean r10 = r4.equals(r9)     // Catch:{ all -> 0x00cd }
                if (r10 != 0) goto L_0x00c4
                r3.add(r9)     // Catch:{ all -> 0x00cd }
            L_0x00c4:
                int r8 = r8 + 1
                goto L_0x00ad
            L_0x00c7:
                rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00cd }
                cy3.C58003b.m67160a(r1, r6)
                goto L_0x00d4
            L_0x00cd:
                r12 = move-exception
                throw r12     // Catch:{ all -> 0x00cf }
            L_0x00cf:
                r0 = move-exception
                cy3.C58003b.m67160a(r1, r12)
                throw r0
            L_0x00d4:
                java.lang.String r1 = "queryCommonChatroom"
                r11.mo139040h(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = sx3.C36907w.m41090l(r3, r2)
                r1.<init>(r2)
                java.util.Iterator r2 = r3.iterator()
            L_0x00e9:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x00f9
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                r1.add(r3)
                goto L_0x00e9
            L_0x00f9:
                java.util.HashMap<java.lang.String, java.lang.String> r2 = kv1.C99251g.f291026a
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r3 = 500(0x1f4, float:7.0E-43)
                java.util.List r1 = com.tencent.p014mm.sdk.p134kt.CommonKt.splitList(r1, r3)
                java.util.Iterator r1 = r1.iterator()
            L_0x010a:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0176
                java.lang.Object r3 = r1.next()
                java.util.List r3 = (java.util.List) r3
                com.tencent.mm.sdk.storage.sql.SingleTable r4 = p749xh.C38595k2.f102753n
                java.util.LinkedList r4 = new java.util.LinkedList
                r4.<init>()
                java.util.LinkedList r5 = new java.util.LinkedList
                r5.<init>()
                java.util.LinkedList r6 = new java.util.LinkedList
                r6.<init>()
                com.tencent.mm.sdk.storage.sql.Column r7 = p749xh.C38595k2.f102756q
                r4.add(r7)
                com.tencent.mm.sdk.storage.sql.Column r8 = p749xh.C38595k2.f102757r
                r4.add(r8)
                com.tencent.mm.sdk.storage.sql.SingleCondition r3 = r7.inString(r3)
                com.tencent.mm.sdk.storage.sql.Column r7 = p749xh.C38595k2.f102755p
                r8 = 5
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                com.tencent.mm.sdk.storage.sql.SingleCondition r7 = r7.equal((java.lang.Number) r8)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r3 = r3.and(r7)
                com.tencent.mm.sdk.storage.sql.SingleTable r7 = p749xh.C38595k2.f102753n
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r4 = r7.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r4)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r3 = r4.where(r3)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r3 = r3.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r5)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r3 = r3.groupBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.Column>) r6)
                com.tencent.mm.sdk.storage.sql.SelectSql r3 = r3.build()
                java.lang.Class<kv1.q> r4 = kv1.C99260q.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                kv1.q r4 = (kv1.C99260q) r4
                kv1.k r4 = r4.mo128742JS()
                com.tencent.mm.plugin.fts.f r4 = (com.tencent.p014mm.plugin.fts.C93834f) r4
                com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r4.mo128795l()
                java.lang.Class<xh.k2> r5 = p749xh.C38595k2.class
                java.util.List r3 = r3.multiQuery(r4, r5)
                r2.addAll(r3)
                goto L_0x010a
            L_0x0176:
                kv1.f r1 = new kv1.f
                r1.<init>()
                java.util.Collections.sort(r2, r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x0187:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x019b
                java.lang.Object r3 = r2.next()
                xh.k2 r3 = (p749xh.C38595k2) r3
                java.lang.String r3 = r3.mo61727l2()
                r1.add(r3)
                goto L_0x0187
            L_0x019b:
                java.util.Iterator r1 = r1.iterator()
            L_0x019f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x01c1
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                lv1.o r3 = new lv1.o
                r3.<init>()
                r3.f292151e = r2
                java.util.List<lv1.n> r2 = r12.f32076e
                r2.add(r3)
                java.util.List<lv1.n> r2 = r12.f32076e
                int r2 = r2.size()
                int r3 = r0.f224474i
                if (r2 < r3) goto L_0x019f
            L_0x01c1:
                java.lang.String r12 = "queryRelatedUser"
                r11.mo139040h(r12)
            L_0x01c7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.logic.C93910b.C93914d.mo128820i(lv1.l):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.b$e */
    public static final class C93915e implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ C93910b f271037d;

        public C93915e(C93910b bVar) {
            this.f271037d = bVar;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            C76636p pVar;
            if (!C87412m.m108589b(str, "*") && !C87412m.m108589b(str, "chatroomname")) {
                Object obj = mStorageEventData.obj;
                C44661m1 m1Var = obj instanceof C44661m1 ? (C44661m1) obj : null;
                if (m1Var != null) {
                    C93910b bVar = this.f271037d;
                    byte[] bytes = (m1Var.field_memberlist + m1Var.field_chatroomStatus).getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    String f = C90193h.m112878f(bytes);
                    if (mStorageEventData.eventId == 5) {
                        bVar.f271025h.remove(f);
                        C76636p pVar2 = bVar.f271022e;
                        if (pVar2 != null) {
                            ((C93836i) pVar2).mo128803c(bVar.f271024g, new C93912b(bVar, m1Var));
                        }
                    } else if (bVar.f271025h.add(f) && (pVar = bVar.f271022e) != null) {
                        ((C93836i) pVar).mo128803c(bVar.f271024g, new C93912b(bVar, m1Var));
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static final int m118650c(C93910b bVar, C44661m1 m1Var) {
        long j;
        C61172m xc;
        C44661m1 m1Var2 = m1Var;
        bVar.getClass();
        String str = m1Var2.field_memberlist;
        if (str != null) {
            if (!(!C112551y.m153811k(str))) {
                str = null;
            }
            String str2 = str;
            if (str2 != null) {
                List U = C112550d0.m153785U(str2, new String[]{";"}, false, 0, 6, (Object) null);
                C99260q qVar = (C99260q) C86312j.m106911c(C99260q.class);
                if (qVar == null || (xc = qVar.mo128761xc()) == null) {
                    j = 0;
                } else {
                    String str3 = m1Var2.field_chatroomname;
                    if (str3 == null) {
                        str3 = "";
                    }
                    j = ((C68985g) xc).mo94941b(str3);
                }
                C101466a aVar = bVar.f271023f;
                if (aVar == null) {
                    return 1;
                }
                long size = (long) U.size();
                String str4 = m1Var2.field_chatroomname;
                if (str4 == null) {
                    str4 = "";
                }
                aVar.mo138613n(2097168, 54, size, str4, j, C110818d0.m150921S(U, "​", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTS5SearchChatroomMemberLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTS5SearchChatroomMemberLogic", "Create Success!");
        this.f271022e = ((C99260q) C86312j.m106911c(cls)).mo128743Jd();
        C99258l db02 = ((C99260q) C86312j.m106911c(cls)).db0(5);
        this.f271023f = db02 instanceof C101466a ? (C101466a) db02 : null;
        ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr().add(this.f271026i);
        C76636p pVar = this.f271022e;
        if (pVar == null) {
            return true;
        }
        ((C93836i) pVar).mo128803c(this.f271024g, new C93911a());
        return true;
    }

    /* renamed from: b */
    public boolean mo128810b() {
        ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr().remove(this.f271026i);
        this.f271023f = null;
        this.f271022e = null;
        return true;
    }

    /* renamed from: d */
    public final boolean mo128835d(C44661m1 m1Var) {
        C87412m.m108594g(m1Var, "chatroomMember");
        String s = C75592q0.m90789s();
        int i = m1Var.field_chatroomStatus;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C44661m1.f121082x1;
        if (!((((long) i) & 2) == 2)) {
            List<String> r2 = m1Var.mo69790r2();
            return !(r2 != null && r2.contains(s));
        }
    }

    public String getName() {
        return "FTS5SearchChatroomMemberLogic";
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        C76636p pVar = this.f271022e;
        if (kVar == null || pVar == null) {
            C87412m.m108593f((Object) null, "super.search(request)");
            throw null;
        }
        int i = kVar.f224467b;
        if (i == 8) {
            C99664b c = ((C93836i) pVar).mo128803c(-65536, new C93913c(this, kVar));
            C87412m.m108593f(c, "{\n                    da…quest))\n                }");
            return c;
        } else if (i == 13) {
            C99664b c2 = ((C93836i) pVar).mo128803c(-65536, new C93914d(this, kVar));
            C87412m.m108593f(c2, "{\n                    da…quest))\n                }");
            return c2;
        } else {
            C87412m.m108593f((Object) null, "{\n                    su…equest)\n                }");
            throw null;
        }
    }
}
