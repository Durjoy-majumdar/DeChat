package lj0;

import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import java.util.List;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99249c;
import kv1.C99251g;
import kv1.C99260q;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99678j;
import p235sm.C101649q0;

/* renamed from: lj0.b */
public class C99483b extends C99248b {

    /* renamed from: e */
    public C76636p f291675e;

    /* renamed from: f */
    public C99489c f291676f;

    /* renamed from: g */
    public MStorage.IOnStorageChange f291677g = new C99484a();

    /* renamed from: lj0.b$a */
    public class C99484a implements MStorage.IOnStorageChange {
        public C99484a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105925i("MicroMsg.FTS.FTS5SearchWeAppLogic", "WeApp storage change: event=%s | eventData=%s", str, mStorageEventData);
            int i = mStorageEventData.eventId;
            if (i == 2 || i == 3) {
                if (MStorageEventData.EventType.BATCH.equals(str)) {
                    Object obj = mStorageEventData.obj;
                    if (obj != null && (obj instanceof List)) {
                        for (String cVar : (List) obj) {
                            C99483b bVar = C99483b.this;
                            ((C93836i) bVar.f291675e).mo128803c(65616, new C99486c(cVar));
                        }
                        return;
                    }
                    return;
                }
                C99483b bVar2 = C99483b.this;
                ((C93836i) bVar2.f291675e).mo128803c(65616, new C99486c(mStorageEventData.obj.toString()));
            } else if (i == 5) {
                if (MStorageEventData.EventType.BATCH.equals(str)) {
                    Object obj2 = mStorageEventData.obj;
                    if (obj2 != null && (obj2 instanceof List)) {
                        for (String bVar3 : (List) obj2) {
                            C99483b bVar4 = C99483b.this;
                            ((C93836i) bVar4.f291675e).mo128803c(65616, new C99485b(bVar3));
                        }
                        return;
                    }
                    return;
                }
                C99483b bVar5 = C99483b.this;
                ((C93836i) bVar5.f291675e).mo128803c(65616, new C99485b(mStorageEventData.obj.toString()));
            }
        }
    }

    /* renamed from: lj0.b$b */
    public class C99485b extends C99664b {

        /* renamed from: j */
        public String f291679j;

        public C99485b(String str) {
            this.f291679j = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Log.m105925i("MicroMsg.FTS.FTS5SearchWeAppLogic", "delete we app info id=%s", this.f291679j);
            C99489c cVar = C99483b.this.f291676f;
            int[] iArr = C99249c.f291006d;
            cVar.mo138622v5(iArr, this.f291679j);
            ((C99260q) C86312j.m106911c(C99260q.class)).db0(1).mo138622v5(iArr, this.f291679j);
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{id: %s}", new Object[]{this.f291679j});
        }

        public String getName() {
            return "DeleteWeAppTask";
        }
    }

    /* renamed from: lj0.b$c */
    public class C99486c extends C99664b {

        /* renamed from: j */
        public String f291681j;

        /* renamed from: n */
        public String f291682n;

        public C99486c(String str) {
            this.f291681j = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C99483b.this.f291676f.mo138598a();
            C99483b.this.f291676f.mo138622v5(C99249c.f291006d, this.f291681j);
            AppBrandRecentTaskInfo x5 = ((C101649q0) C86312j.m106911c(C101649q0.class)).mo60645x5(this.f291681j);
            if (x5 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String nullAsNil = Util.nullAsNil(x5.f239030s);
                long hashCode = (long) nullAsNil.hashCode();
                long j = hashCode;
                C99483b.this.f291676f.mo138613n(393216, 1, hashCode, nullAsNil, currentTimeMillis, x5.f239032u);
                C99483b.this.f291676f.mo138613n(393216, 2, j, nullAsNil, currentTimeMillis, C99251g.m129288i(x5.f239032u, false));
                C99483b.this.f291676f.mo138613n(393216, 3, j, nullAsNil, currentTimeMillis, C99251g.m129288i(x5.f239032u, true));
                this.f291682n = x5.f239032u;
                Log.m105925i("MicroMsg.FTS.FTS5SearchWeAppLogic", "inserted we app info id = %s", nullAsNil);
            }
            C99483b.this.f291676f.mo138600c();
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{name: %s id: %s}", new Object[]{this.f291682n, this.f291681j});
        }

        public String getName() {
            return "InsertWeAppTask";
        }
    }

    /* renamed from: lj0.b$d */
    public class C99487d extends C99678j {
        public C99487d(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 21;
        }

        public String getName() {
            return "SearchWeAppTask";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
            ((com.tencent.p014mm.plugin.fts.C93824b) r1).close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
            throw r10;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo128820i(lv1.C10656l r10) {
            /*
                r9 = this;
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
                lj0.b r1 = lj0.C99483b.this
                lj0.c r2 = r1.f291676f
                lv1.i r3 = r10.f32075d
                int[] r4 = kv1.C99249c.f291006d
                lv1.k r1 = r9.f292133j
                int[] r5 = r1.f224473h
                r6 = 0
                r7 = 1
                r8 = 1
                android.database.Cursor r1 = r2.mo138623w(r3, r4, r5, r6, r7, r8)
            L_0x002a:
                r2 = r1
                android.database.CursorWrapper r2 = (android.database.CursorWrapper) r2     // Catch:{ all -> 0x0065 }
                boolean r2 = r2.moveToNext()     // Catch:{ all -> 0x0065 }
                if (r2 == 0) goto L_0x0067
                lv1.o r2 = new lv1.o     // Catch:{ all -> 0x0065 }
                r2.<init>()     // Catch:{ all -> 0x0065 }
                r2.mo139050c(r1)     // Catch:{ all -> 0x0065 }
                long r3 = r2.f292150d     // Catch:{ all -> 0x0065 }
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0065 }
                boolean r3 = r0.contains(r3)     // Catch:{ all -> 0x0065 }
                if (r3 != 0) goto L_0x002a
                lv1.k r3 = r9.f292133j     // Catch:{ all -> 0x0065 }
                java.util.HashSet<java.lang.String> r3 = r3.f224475j     // Catch:{ all -> 0x0065 }
                java.lang.String r4 = r2.f292151e     // Catch:{ all -> 0x0065 }
                boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x0065 }
                if (r3 != 0) goto L_0x002a
                r2.mo139048a()     // Catch:{ all -> 0x0065 }
                java.util.List<lv1.n> r3 = r10.f32076e     // Catch:{ all -> 0x0065 }
                r3.add(r2)     // Catch:{ all -> 0x0065 }
                long r2 = r2.f292150d     // Catch:{ all -> 0x0065 }
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0065 }
                r0.add(r2)     // Catch:{ all -> 0x0065 }
                goto L_0x002a
            L_0x0065:
                r10 = move-exception
                goto L_0x0084
            L_0x0067:
                com.tencent.mm.plugin.fts.b r1 = (com.tencent.p014mm.plugin.fts.C93824b) r1
                r1.close()
                boolean r0 = java.lang.Thread.interrupted()
                if (r0 != 0) goto L_0x007e
                lv1.k r0 = r9.f292133j
                java.util.Comparator<lv1.n> r0 = r0.f224477l
                if (r0 == 0) goto L_0x007d
                java.util.List<lv1.n> r10 = r10.f32076e
                java.util.Collections.sort(r10, r0)
            L_0x007d:
                return
            L_0x007e:
                java.lang.InterruptedException r10 = new java.lang.InterruptedException
                r10.<init>()
                throw r10
            L_0x0084:
                throw r10     // Catch:{ all -> 0x0085 }
            L_0x0085:
                r10 = move-exception
                com.tencent.mm.plugin.fts.b r1 = (com.tencent.p014mm.plugin.fts.C93824b) r1
                r1.close()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: lj0.C99483b.C99487d.mo128820i(lv1.l):void");
        }
    }

    /* renamed from: lj0.b$e */
    public class C99488e extends C99664b {

        /* renamed from: j */
        public int f291685j;

        public C99488e() {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            List<AppBrandRecentTaskInfo> tM = ((C101649q0) C86312j.m106911c(C101649q0.class)).mo60644tM();
            if (tM == null || tM.isEmpty()) {
                Log.m105924i("MicroMsg.FTS.FTS5SearchWeAppLogic", "WeApp recent usage list is nil.");
                return true;
            }
            this.f291685j = tM.size();
            C99483b.this.f291676f.mo138598a();
            C99483b.this.f291676f.mo138604e(C99249c.f291006d);
            for (AppBrandRecentTaskInfo next : tM) {
                String nullAsNil = Util.nullAsNil(next.f239030s);
                int hashCode = nullAsNil.hashCode();
                long currentTimeMillis = System.currentTimeMillis();
                long j = (long) hashCode;
                long j2 = j;
                C99483b.this.f291676f.mo138613n(393216, 1, j, nullAsNil, currentTimeMillis, next.f239032u);
                C99483b.this.f291676f.mo138613n(393216, 2, j2, nullAsNil, currentTimeMillis, C99251g.m129288i(next.f239032u, false));
                C99483b.this.f291676f.mo138613n(393216, 3, j2, nullAsNil, currentTimeMillis, C99251g.m129288i(next.f239032u, true));
            }
            C99483b.this.f291676f.mo138600c();
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{updateSize: %d}", new Object[]{Integer.valueOf(this.f291685j)});
        }

        public String getName() {
            return "UpdateWeAppIndexTask";
        }
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C101649q0.class;
        Class cls2 = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls2)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTS5SearchWeAppLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTS5SearchWeAppLogic", "Create Success!");
        this.f291676f = (C99489c) ((C99260q) C86312j.m106911c(cls2)).db0(512);
        C76636p Jd = ((C99260q) C86312j.m106911c(cls2)).mo128743Jd();
        this.f291675e = Jd;
        ((C93836i) Jd).mo128803c(65616, new C99488e());
        ((C101649q0) C86312j.m106911c(cls)).onCreate();
        ((C101649q0) C86312j.m106911c(cls)).dw0(this.f291677g);
        return true;
    }

    /* renamed from: b */
    public boolean mo128810b() {
        Class cls = C101649q0.class;
        ((C101649q0) C86312j.m106911c(cls)).onDestroy();
        ((C101649q0) C86312j.m106911c(cls)).mo60643rg(this.f291677g);
        this.f291676f = null;
        this.f291675e = null;
        return true;
    }

    public String getName() {
        return "FTS5SearchWeAppLogic";
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        return ((C93836i) this.f291675e).mo128803c(-65536, new C99487d(kVar));
    }
}
