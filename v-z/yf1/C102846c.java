package yf1;

import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fe1.C58969q;
import ht1.C60200t1;
import ht1.C60208v1;
import java.util.List;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99249c;
import kv1.C99251g;
import kv1.C99260q;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99678j;

/* renamed from: yf1.c */
public class C102846c extends C99248b {

    /* renamed from: e */
    public C76636p f303585e;

    /* renamed from: f */
    public C102845b f303586f;

    /* renamed from: g */
    public C99664b f303587g = null;

    /* renamed from: h */
    public MStorage.IOnStorageChange f303588h = new C102847a();

    /* renamed from: yf1.c$a */
    public class C102847a implements MStorage.IOnStorageChange {
        public C102847a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Object obj;
            boolean z = false;
            Log.m105925i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "FinderFollow storage change: event=%s | eventData=%s", str, mStorageEventData);
            int i = mStorageEventData.eventId;
            if ((i == 2 || i == 3 || i == 4 || i == 5) && (obj = mStorageEventData.obj) != null && (obj instanceof String) && "FinderContact".equals(str)) {
                C102846c cVar = C102846c.this;
                C99664b bVar = cVar.f303587g;
                if (bVar != null) {
                    ((C93836i) cVar.f303585e).mo128801a(bVar);
                }
                C58969q c = C102846c.m135916c(C102846c.this, mStorageEventData.obj.toString());
                if (c != null) {
                    if (c.field_follow_Flag == C58969q.f168707c2) {
                        z = true;
                    }
                    if (z) {
                        C102846c cVar2 = C102846c.this;
                        cVar2.f303587g = new C102849c(mStorageEventData.obj.toString());
                        C102846c cVar3 = C102846c.this;
                        ((C93836i) cVar3.f303585e).mo128803c(65646, cVar3.f303587g);
                        return;
                    }
                }
                C102846c cVar4 = C102846c.this;
                cVar4.f303587g = new C102848b(mStorageEventData.obj.toString());
                C102846c cVar5 = C102846c.this;
                ((C93836i) cVar5.f303585e).mo128803c(65646, cVar5.f303587g);
            }
        }
    }

    /* renamed from: yf1.c$b */
    public class C102848b extends C99664b {

        /* renamed from: j */
        public String f303590j;

        public C102848b(String str) {
            this.f303590j = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Log.m105925i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "delete we app info id=%s", this.f303590j);
            C102846c.this.f303586f.mo138622v5(C99249c.f291008f, this.f303590j);
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{id: %s}", new Object[]{this.f303590j});
        }

        public String getName() {
            return "DeleteFinderFollowTask";
        }
    }

    /* renamed from: yf1.c$c */
    public class C102849c extends C99664b {

        /* renamed from: j */
        public String f303592j;

        /* renamed from: n */
        public String f303593n;

        public C102849c(String str) {
            this.f303592j = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C102846c.this.f303586f.mo138598a();
            C102846c.this.f303586f.mo138622v5(C99249c.f291008f, this.f303592j);
            C58969q c = C102846c.m135916c(C102846c.this, this.f303592j);
            if (c != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String username = c.getUsername();
                long hashCode = (long) username.hashCode();
                long j = hashCode;
                C102846c.this.f303586f.mo138613n(589824, 1, hashCode, username, currentTimeMillis, c.getNickname());
                C102846c.this.f303586f.mo138613n(589824, 2, j, username, currentTimeMillis, C99251g.m129288i(c.getNickname(), false));
                C102846c.this.f303586f.mo138613n(589824, 3, j, username, currentTimeMillis, C99251g.m129288i(c.getNickname(), true));
                this.f303593n = c.getNickname();
                Log.m105925i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "inserted we app info id = %s", username);
            }
            C102846c.this.f303586f.mo138600c();
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{name: %s id: %s}", new Object[]{this.f303593n, this.f303592j});
        }

        public String getName() {
            return "InsertFinderFollowTask";
        }
    }

    /* renamed from: yf1.c$d */
    public class C102850d extends C99678j {
        public C102850d(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 47;
        }

        public String getName() {
            return "SearchFinderFollowTask";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
            ((com.tencent.p014mm.plugin.fts.C93824b) r1).close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
            throw r10;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo128820i(lv1.C10656l r10) {
            /*
                r9 = this;
                java.lang.Class<ht1.v4> r0 = ht1.C8808v4.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ht1.v4 r0 = (ht1.C8808v4) r0
                boolean r0 = r0.mo9635e()
                if (r0 == 0) goto L_0x0016
                java.lang.String r10 = "MicroMsg.FTS.FTS5SearchFinderFollowerLogic"
                java.lang.String r0 = "execSearch, isTeenModeAndViewNothing."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                return
            L_0x0016:
                lv1.k r0 = r9.f292133j
                java.lang.String r0 = r0.f224468c
                r1 = 1
                lv1.i r0 = lv1.C99672i.m130094a(r0, r1)
                r10.f32075d = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r10.f32076e = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                yf1.c r1 = yf1.C102846c.this
                yf1.b r2 = r1.f303586f
                lv1.i r3 = r10.f32075d
                int[] r4 = kv1.C99249c.f291008f
                lv1.k r1 = r9.f292133j
                int[] r5 = r1.f224473h
                r6 = 0
                r7 = 1
                r8 = 1
                android.database.Cursor r1 = r2.mo138623w(r3, r4, r5, r6, r7, r8)
            L_0x0040:
                r2 = r1
                android.database.CursorWrapper r2 = (android.database.CursorWrapper) r2     // Catch:{ all -> 0x007b }
                boolean r2 = r2.moveToNext()     // Catch:{ all -> 0x007b }
                if (r2 == 0) goto L_0x007d
                lv1.o r2 = new lv1.o     // Catch:{ all -> 0x007b }
                r2.<init>()     // Catch:{ all -> 0x007b }
                r2.mo139050c(r1)     // Catch:{ all -> 0x007b }
                long r3 = r2.f292150d     // Catch:{ all -> 0x007b }
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x007b }
                boolean r3 = r0.contains(r3)     // Catch:{ all -> 0x007b }
                if (r3 != 0) goto L_0x0040
                lv1.k r3 = r9.f292133j     // Catch:{ all -> 0x007b }
                java.util.HashSet<java.lang.String> r3 = r3.f224475j     // Catch:{ all -> 0x007b }
                java.lang.String r4 = r2.f292151e     // Catch:{ all -> 0x007b }
                boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x007b }
                if (r3 != 0) goto L_0x0040
                r2.mo139048a()     // Catch:{ all -> 0x007b }
                java.util.List<lv1.n> r3 = r10.f32076e     // Catch:{ all -> 0x007b }
                r3.add(r2)     // Catch:{ all -> 0x007b }
                long r2 = r2.f292150d     // Catch:{ all -> 0x007b }
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x007b }
                r0.add(r2)     // Catch:{ all -> 0x007b }
                goto L_0x0040
            L_0x007b:
                r10 = move-exception
                goto L_0x009a
            L_0x007d:
                com.tencent.mm.plugin.fts.b r1 = (com.tencent.p014mm.plugin.fts.C93824b) r1
                r1.close()
                boolean r0 = java.lang.Thread.interrupted()
                if (r0 != 0) goto L_0x0094
                lv1.k r0 = r9.f292133j
                java.util.Comparator<lv1.n> r0 = r0.f224477l
                if (r0 == 0) goto L_0x0093
                java.util.List<lv1.n> r10 = r10.f32076e
                java.util.Collections.sort(r10, r0)
            L_0x0093:
                return
            L_0x0094:
                java.lang.InterruptedException r10 = new java.lang.InterruptedException
                r10.<init>()
                throw r10
            L_0x009a:
                throw r10     // Catch:{ all -> 0x009b }
            L_0x009b:
                r10 = move-exception
                com.tencent.mm.plugin.fts.b r1 = (com.tencent.p014mm.plugin.fts.C93824b) r1
                r1.close()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: yf1.C102846c.C102850d.mo128820i(lv1.l):void");
        }
    }

    /* renamed from: yf1.c$e */
    public class C102851e extends C99664b {

        /* renamed from: j */
        public int f303596j;

        public C102851e() {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            List<C72996z1> wU = ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78720wU();
            if (wU == null || wU.isEmpty()) {
                Log.m105924i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "FinderFollow recent usage list is nil.");
                return true;
            }
            this.f303596j = wU.size();
            C102846c.this.f303586f.mo138598a();
            C102846c.this.f303586f.mo138604e(C99249c.f291008f);
            for (C72996z1 next : wU) {
                if (Util.isNullOrNil(next.getNickname()) || Util.isNullOrNil(next.getUsername())) {
                    Log.m105924i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "contact = " + next.getNickname() + "， contact.username = " + next.getUsername() + ", updateSize = " + this.f303596j);
                    this.f303596j = this.f303596j - 1;
                } else {
                    Log.m105924i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "contact = " + next.getNickname() + "， contact.username = " + next.getUsername() + ", updateSize = " + this.f303596j);
                    String username = next.getUsername();
                    int hashCode = username.hashCode();
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = (long) hashCode;
                    long j2 = j;
                    C102846c.this.f303586f.mo138613n(589824, 1, j, username, currentTimeMillis, next.getNickname());
                    C102846c.this.f303586f.mo138613n(589824, 2, j2, username, currentTimeMillis, C99251g.m129288i(next.getNickname(), false));
                    C102846c.this.f303586f.mo138613n(589824, 3, j2, username, currentTimeMillis, C99251g.m129288i(next.getNickname(), true));
                }
            }
            C102846c.this.f303586f.mo138600c();
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{updateSize: %d}", new Object[]{Integer.valueOf(this.f303596j)});
        }

        public String getName() {
            return "UpdateFinderFollowIndexTask";
        }
    }

    /* renamed from: c */
    public static C58969q m135916c(C102846c cVar, String str) {
        cVar.getClass();
        C58969q W5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76824W5(str);
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = W5 != null ? W5.mo84192p2() : "null";
        Log.m105925i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "getContactFromDB, contact %s %s", objArr);
        return W5;
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "Create Success!");
        this.f303586f = (C102845b) ((C99260q) C86312j.m106911c(cls)).db0(1792);
        C76636p Jd = ((C99260q) C86312j.m106911c(cls)).mo128743Jd();
        this.f303585e = Jd;
        ((C93836i) Jd).mo128803c(65646, new C102851e());
        ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78712i(this.f303588h);
        return true;
    }

    /* renamed from: b */
    public boolean mo128810b() {
        ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78711g(this.f303588h);
        this.f303586f = null;
        this.f303585e = null;
        return true;
    }

    public String getName() {
        return "FTS5SearchFinderFollowerLogic";
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        return ((C93836i) this.f303585e).mo128803c(-65536, new C102850d(kVar));
    }
}
