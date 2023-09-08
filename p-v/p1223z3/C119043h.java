package p1223z3;

import p1188d4.C116562b;
import p1188d4.C116563c;
import p1191e4.C116683a;

/* renamed from: z3.h */
public class C119043h extends C116563c.C116564a {

    /* renamed from: b */
    public C119028a f356542b;

    /* renamed from: c */
    public final C119044a f356543c;

    /* renamed from: z3.h$a */
    public static abstract class C119044a {

        /* renamed from: a */
        public final int f356544a;

        public C119044a(int i) {
            this.f356544a = i;
        }

        /* renamed from: a */
        public abstract void mo165536a(C116562b bVar);

        /* renamed from: b */
        public abstract C119045b mo165537b(C116562b bVar);
    }

    /* renamed from: z3.h$b */
    public static class C119045b {

        /* renamed from: a */
        public final boolean f356545a;

        /* renamed from: b */
        public final String f356546b;

        public C119045b(boolean z, String str) {
            this.f356545a = z;
            this.f356546b = str;
        }
    }

    public C119043h(C119028a aVar, C119044a aVar2, String str, String str2) {
        super(aVar2.f356544a);
        this.f356542b = aVar;
        this.f356543c = aVar2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo180545b(p1188d4.C116562b r12, int r13, int r14) {
        /*
            r11 = this;
            z3.a r0 = r11.f356542b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0112
            z3.g$d r0 = r0.f356493d
            r0.getClass()
            if (r13 != r14) goto L_0x0013
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0078
        L_0x0013:
            if (r14 <= r13) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r13
        L_0x001e:
            if (r3 == 0) goto L_0x0023
            if (r5 >= r14) goto L_0x0077
            goto L_0x0025
        L_0x0023:
            if (r5 <= r14) goto L_0x0077
        L_0x0025:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, a4.a>> r6 = r0.f356541a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            r7 = 0
            if (r6 != 0) goto L_0x0035
            goto L_0x0075
        L_0x0035:
            if (r3 == 0) goto L_0x003c
            java.util.NavigableSet r8 = r6.descendingKeySet()
            goto L_0x0040
        L_0x003c:
            java.util.Set r8 = r6.keySet()
        L_0x0040:
            java.util.Iterator r8 = r8.iterator()
        L_0x0044:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0072
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r3 == 0) goto L_0x005b
            if (r9 > r14) goto L_0x0061
            if (r9 <= r5) goto L_0x0061
            goto L_0x005f
        L_0x005b:
            if (r9 < r14) goto L_0x0061
            if (r9 >= r5) goto L_0x0061
        L_0x005f:
            r10 = 1
            goto L_0x0062
        L_0x0061:
            r10 = 0
        L_0x0062:
            if (r10 == 0) goto L_0x0044
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r6.get(r5)
            r4.add(r5)
            r5 = r9
            r6 = 1
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            if (r6 != 0) goto L_0x001e
        L_0x0075:
            r0 = r7
            goto L_0x0078
        L_0x0077:
            r0 = r4
        L_0x0078:
            if (r0 == 0) goto L_0x0112
            z3.h$a r3 = r11.f356543c
            androidx.work.impl.WorkDatabase_Impl$a r3 = (androidx.work.impl.WorkDatabase_Impl.C113043a) r3
            r3.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = r12
            e4.a r4 = (p1191e4.C116683a) r4
            java.lang.String r5 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r5 = r4.mo180687e(r5)
        L_0x008f:
            boolean r6 = r5.moveToNext()     // Catch:{ all -> 0x010d }
            if (r6 == 0) goto L_0x009d
            java.lang.String r6 = r5.getString(r2)     // Catch:{ all -> 0x010d }
            r3.add(r6)     // Catch:{ all -> 0x010d }
            goto L_0x008f
        L_0x009d:
            r5.close()
            java.util.Iterator r3 = r3.iterator()
        L_0x00a4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00cd
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "room_fts_content_sync_"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x00a4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.mo180684c(r5)
            goto L_0x00a4
        L_0x00cd:
            java.util.Iterator r0 = r0.iterator()
        L_0x00d1:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00e1
            java.lang.Object r3 = r0.next()
            a4.a r3 = (p1168a4.C112754a) r3
            r3.mo164510a(r12)
            goto L_0x00d1
        L_0x00e1:
            z3.h$a r0 = r11.f356543c
            z3.h$b r0 = r0.mo165537b(r12)
            boolean r3 = r0.f356545a
            if (r3 == 0) goto L_0x00f4
            z3.h$a r0 = r11.f356543c
            r0.getClass()
            r11.mo183708c(r12)
            goto L_0x0113
        L_0x00f4:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Migration didn't properly handle: "
            r13.append(r14)
            java.lang.String r14 = r0.f356546b
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x010d:
            r12 = move-exception
            r5.close()
            throw r12
        L_0x0112:
            r1 = 0
        L_0x0113:
            if (r1 != 0) goto L_0x0194
            z3.a r0 = r11.f356542b
            if (r0 == 0) goto L_0x0170
            boolean r0 = r0.mo183688a(r13, r14)
            if (r0 != 0) goto L_0x0170
            z3.h$a r13 = r11.f356543c
            androidx.work.impl.WorkDatabase_Impl$a r13 = (androidx.work.impl.WorkDatabase_Impl.C113043a) r13
            r13.getClass()
            r14 = r12
            e4.a r14 = (p1191e4.C116683a) r14
            java.lang.String r0 = "DROP TABLE IF EXISTS `Dependency`"
            r14.mo180684c(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkSpec`"
            r14.mo180684c(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkTag`"
            r14.mo180684c(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `SystemIdInfo`"
            r14.mo180684c(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkName`"
            r14.mo180684c(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkProgress`"
            r14.mo180684c(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `Preference`"
            r14.mo180684c(r0)
            androidx.work.impl.WorkDatabase_Impl r14 = androidx.work.impl.WorkDatabase_Impl.this
            int r0 = androidx.work.impl.WorkDatabase_Impl.f338357s
            java.util.List<z3.g$b> r14 = r14.f356523g
            if (r14 == 0) goto L_0x016a
            int r14 = r14.size()
        L_0x0158:
            if (r2 >= r14) goto L_0x016a
            androidx.work.impl.WorkDatabase_Impl r0 = androidx.work.impl.WorkDatabase_Impl.this
            java.util.List<z3.g$b> r0 = r0.f356523g
            java.lang.Object r0 = r0.get(r2)
            z3.g$b r0 = (p1223z3.C119038g.C119040b) r0
            r0.getClass()
            int r2 = r2 + 1
            goto L_0x0158
        L_0x016a:
            z3.h$a r13 = r11.f356543c
            r13.mo165536a(r12)
            goto L_0x0194
        L_0x0170:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = " to "
            r0.append(r13)
            r0.append(r14)
            java.lang.String r13 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1223z3.C119043h.mo180545b(d4.b, int, int):void");
    }

    /* renamed from: c */
    public final void mo183708c(C116562b bVar) {
        C116683a aVar = (C116683a) bVar;
        aVar.mo180684c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.mo180684c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
}
