package du3;

import android.os.SystemClock;
import androidx.camera.core.FocusMeteringAction;
import iu3.C117277g;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import ju3.C117365a;
import lu3.C117479j;
import lu3.C88656g;
import zt3.C119140a;
import zt3.C119146d;
import zt3.C119153f;
import zt3.C119157j;

/* renamed from: du3.a */
public class C116624a implements C116630c {

    /* renamed from: a */
    public C119140a f349702a;

    /* renamed from: b */
    public ConcurrentHashMap<String, C116626b> f349703b = null;

    /* renamed from: c */
    public AtomicLong f349704c = new AtomicLong(0);

    /* renamed from: d */
    public final C116631d f349705d;

    /* renamed from: e */
    public volatile long f349706e = 0;

    /* renamed from: du3.a$a */
    public class C116625a implements C88656g {
        public C116625a() {
        }

        public String getKey() {
            return "Experience#persistCache";
        }

        public void run() {
            C116624a aVar = C116624a.this;
            aVar.mo180621k(aVar.mo180620j());
        }
    }

    /* renamed from: du3.a$c */
    public static class C116627c {

        /* renamed from: a */
        public String f349718a;

        /* renamed from: b */
        public long f349719b;

        /* renamed from: c */
        public long f349720c;

        /* renamed from: d */
        public String f349721d;

        /* renamed from: e */
        public long f349722e;

        /* renamed from: f */
        public float f349723f;

        public C116627c(String str, long j, long j2, String str2) {
            this.f349718a = str;
            this.f349719b = j;
            this.f349720c = j2;
            this.f349721d = str2;
            this.f349723f = j2 > 1 ? (((float) j) * 1.0f) / ((float) j2) : 1.0f;
            this.f349722e = System.currentTimeMillis();
        }

        public boolean equals(Object obj) {
            return this.f349718a.equals(obj);
        }

        public int hashCode() {
            return this.f349718a.hashCode();
        }

        public String toString() {
            return this.f349718a + " " + this.f349719b + " " + this.f349720c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011a, code lost:
        if (r2 == null) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C116624a(android.content.Context r23, zt3.C119140a r24) {
        /*
            r22 = this;
            r1 = r22
            r22.<init>()
            r2 = 0
            r1.f349703b = r2
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r3 = 0
            r0.<init>(r3)
            r1.f349704c = r0
            r1.f349706e = r3
            r24.getClass()
            du3.b r0 = new du3.b
            r5 = r23
            r0.<init>(r5)
            r1.f349705d = r0
            r5 = r24
            r1.f349702a = r5
            long r5 = android.os.SystemClock.uptimeMillis()
            zt3.a r7 = r1.f349702a
            long r7 = r7.f356825d
            android.database.sqlite.SQLiteDatabase r9 = r0.f349724d
            java.lang.String r10 = "%s"
            java.lang.String r11 = "ExperienceStorage"
            r12 = 1
            r13 = 0
            if (r9 != 0) goto L_0x0036
            goto L_0x0071
        L_0x0036:
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x003f
            long r3 = java.lang.System.currentTimeMillis()
            goto L_0x0044
        L_0x003f:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 + r7
        L_0x0044:
            android.database.sqlite.SQLiteDatabase r0 = r0.f349724d     // Catch:{ Exception -> 0x0063 }
            java.lang.String r7 = "DisposedTask"
            java.lang.String r8 = "timestamp<?"
            java.lang.String[] r9 = new java.lang.String[r12]     // Catch:{ Exception -> 0x0063 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063 }
            r14.<init>()     // Catch:{ Exception -> 0x0063 }
            r14.append(r3)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r3 = ""
            r14.append(r3)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r3 = r14.toString()     // Catch:{ Exception -> 0x0063 }
            r9[r13] = r3     // Catch:{ Exception -> 0x0063 }
            r0.delete(r7, r8, r9)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0071
        L_0x0063:
            r0 = move-exception
            zt3.d$b r3 = zt3.C119146d.f356851c
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.String r0 = r0.toString()
            r4[r13] = r0
            r3.mo125764e(r11, r10, r4)
        L_0x0071:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "[buildCache] successfully! "
            r3.<init>(r0)
            r4 = 10
            r3.append(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            du3.d r0 = r1.f349705d
            du3.b r0 = (du3.C116628b) r0
            r0.getClass()
            java.lang.String r8 = "avg(%s)"
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            android.database.sqlite.SQLiteDatabase r14 = r0.f349724d
            if (r14 != 0) goto L_0x0096
            goto L_0x011f
        L_0x0096:
            java.lang.String r15 = "DisposedTask"
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            java.lang.String r16 = "taskName"
            r2[r13] = r16     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            java.lang.String r16 = "rate"
            r4[r13] = r16     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            java.lang.String r4 = java.lang.String.format(r8, r4)     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            r2[r12] = r4     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            java.lang.String r16 = "threadTime"
            r4[r13] = r16     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            java.lang.String r4 = java.lang.String.format(r8, r4)     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            r8 = 2
            r2[r8] = r4     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "taskName"
            r20 = 0
            r21 = 0
            r16 = r2
            android.database.Cursor r2 = r14.query(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0109, all -> 0x0105 }
            r2.moveToFirst()     // Catch:{ Exception -> 0x0103 }
        L_0x00cb:
            boolean r4 = r2.isAfterLast()     // Catch:{ Exception -> 0x0103 }
            if (r4 != 0) goto L_0x011c
            du3.b$a r4 = new du3.b$a     // Catch:{ Exception -> 0x0103 }
            r4.<init>(r0, r2)     // Catch:{ Exception -> 0x0103 }
            java.lang.String r14 = r4.getString(r13)     // Catch:{ Exception -> 0x0103 }
            r15 = r14
            double r13 = r4.getDouble(r12)     // Catch:{ Exception -> 0x0103 }
            r17 = r13
            double r12 = r4.getDouble(r8)     // Catch:{ Exception -> 0x0103 }
            du3.a$b r4 = new du3.a$b     // Catch:{ Exception -> 0x0103 }
            r14 = r9
            r8 = r17
            float r8 = (float) r8
            long r12 = (long) r12
            r9 = r15
            r4.<init>(r9, r8, r12)     // Catch:{ Exception -> 0x00fd }
            java.lang.String r8 = r4.f349708a     // Catch:{ Exception -> 0x00fd }
            r9 = r14
            r9.put(r8, r4)     // Catch:{ Exception -> 0x0103 }
            r2.moveToNext()     // Catch:{ Exception -> 0x0103 }
            r8 = 2
            r12 = 1
            r13 = 0
            goto L_0x00cb
        L_0x00fd:
            r0 = move-exception
            r9 = r14
            goto L_0x010b
        L_0x0100:
            r0 = move-exception
            goto L_0x0197
        L_0x0103:
            r0 = move-exception
            goto L_0x010b
        L_0x0105:
            r0 = move-exception
            r2 = 0
            goto L_0x0197
        L_0x0109:
            r0 = move-exception
            r2 = 0
        L_0x010b:
            zt3.d$b r4 = zt3.C119146d.f356851c     // Catch:{ all -> 0x0100 }
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0100 }
            r12 = 0
            r8[r12] = r0     // Catch:{ all -> 0x0100 }
            r4.mo125764e(r11, r10, r8)     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x011f
        L_0x011c:
            r2.close()
        L_0x011f:
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r12 = 0
        L_0x0128:
            boolean r2 = r0.hasNext()
            java.lang.String r4 = "# "
            if (r2 == 0) goto L_0x0163
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r8 = r2.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r2.getValue()
            du3.a$b r2 = (du3.C116624a.C116626b) r2
            r7.append(r4)
            r7.append(r8)
            r4 = 45
            r7.append(r4)
            boolean r4 = r2.mo180623a()
            r7.append(r4)
            r4 = 10
            r7.append(r4)
            java.util.concurrent.ConcurrentHashMap r4 = r22.mo180620j()
            r4.put(r8, r2)
            int r12 = r12 + 1
            goto L_0x0128
        L_0x0163:
            r3.append(r4)
            java.lang.String r0 = "size:"
            r3.append(r0)
            r3.append(r12)
            java.lang.String r0 = " cost:"
            r3.append(r0)
            long r8 = android.os.SystemClock.uptimeMillis()
            long r8 = r8 - r5
            r3.append(r8)
            java.lang.String r0 = "ms"
            r3.append(r0)
            r2 = 10
            r3.append(r2)
            r3.append(r7)
            zt3.d$b r0 = zt3.C119146d.f356851c
            java.lang.String r2 = r3.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Experience"
            r0.mo125765i(r4, r2, r3)
            return
        L_0x0197:
            if (r2 == 0) goto L_0x019c
            r2.close()
        L_0x019c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: du3.C116624a.<init>(android.content.Context, zt3.a):void");
    }

    /* renamed from: a */
    public void mo180611a(C117479j jVar) {
    }

    /* renamed from: b */
    public void mo180612b(C117479j jVar) {
        jVar.getClass();
        C117479j.f351568w.mo181962c(jVar.mo182180c());
    }

    /* renamed from: c */
    public boolean mo180613c(String str) {
        C116626b bVar;
        if (str == null || (bVar = mo180620j().get(str)) == null) {
            return true;
        }
        return !bVar.mo180623a();
    }

    /* renamed from: d */
    public void mo180614d(C117479j jVar) {
        jVar.getClass();
        C117479j.f351568w.mo181962c(jVar.mo182180c());
    }

    /* renamed from: e */
    public void mo180615e(C117479j jVar) {
        jVar.getClass();
        C117479j.f351568w.mo181962c(jVar.mo182180c());
    }

    /* renamed from: f */
    public void mo180616f(C117479j jVar, long j, long j2) {
        boolean z;
        jVar.getClass();
        C117479j.f351568w.mo181962c(jVar.mo182180c());
        boolean z2 = true;
        int i = 0;
        long[] jArr = jVar.f351574h == C119153f.COMPLETE ? new long[]{jVar.f351573g, jVar.f351571e} : new long[2];
        C116627c cVar = new C116627c(jVar.getKey(), jArr[0], jArr[1], jVar.f351581r.getName());
        C116626b bVar = mo180620j().get(cVar.f349718a);
        if (bVar == null) {
            bVar = new C116626b(cVar.f349718a);
            mo180620j().put(cVar.f349718a, bVar);
        }
        bVar.f349717j.add(cVar);
        bVar.f349713f += (float) cVar.f349719b;
        bVar.f349714g += (float) cVar.f349720c;
        int size = bVar.f349717j.size();
        float f = bVar.f349715h;
        float f2 = cVar.f349723f;
        if (f > f2) {
            z = size <= 5000;
            if (!z) {
                bVar.f349709b += f;
            }
            bVar.f349715h = f2;
        } else {
            z = true;
        }
        float f3 = bVar.f349716i;
        if (f3 < f2) {
            if (size > 5000) {
                z2 = false;
            }
            if (!z2) {
                bVar.f349709b += f3;
            }
            bVar.f349716i = f2;
            z = z2;
        }
        if (z) {
            bVar.f349709b += f2;
        }
        if (size > 5000) {
            i = 2;
        }
        bVar.f349710c = bVar.f349709b / ((float) (size - i));
        float f4 = (float) size;
        bVar.f349711d = (long) ((bVar.f349713f * 1.0f) / f4);
        bVar.f349712e = (long) ((bVar.f349714g * 1.0f) / f4);
        if (this.f349704c.incrementAndGet() >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION && System.currentTimeMillis() - this.f349706e >= 600000) {
            this.f349704c.set(0);
            this.f349706e = System.currentTimeMillis();
            ((C119157j) C119157j.f356862d).mo183884o(new C116625a());
        }
    }

    /* renamed from: g */
    public void mo180617g() {
        mo180621k(mo180620j());
    }

    /* renamed from: h */
    public void mo180618h(C117479j jVar) {
        jVar.getClass();
        C117479j.f351568w.mo181961b(jVar.mo182180c());
    }

    /* renamed from: i */
    public void mo180619i(C117479j jVar) {
        int i;
        C117277g c = jVar.mo182180c();
        ((C117365a) C117479j.f351568w).getClass();
        AtomicInteger atomicInteger = c.f351131b.f351134c;
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, i + 1));
    }

    /* renamed from: j */
    public final ConcurrentHashMap<String, C116626b> mo180620j() {
        if (this.f349703b == null) {
            synchronized (this) {
                if (this.f349703b == null) {
                    this.f349703b = new ConcurrentHashMap<>();
                }
            }
        }
        return this.f349703b;
    }

    /* renamed from: k */
    public final synchronized void mo180621k(ConcurrentHashMap<String, C116626b> concurrentHashMap) {
        if (concurrentHashMap.size() > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                ((C116628b) this.f349705d).mo180628b(concurrentHashMap.values());
                C119146d.C91936b bVar = C119146d.f356851c;
                bVar.mo125765i("Experience", "[persistCache] successfully! size=" + concurrentHashMap.size() + " cost:" + (SystemClock.uptimeMillis() - uptimeMillis), new Object[0]);
                concurrentHashMap.clear();
            } catch (Exception e) {
                C119146d.f356851c.mo125764e("Experience", "%s", e.toString());
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: du3.a$b */
    public static class C116626b {

        /* renamed from: a */
        public String f349708a;

        /* renamed from: b */
        public float f349709b = 0.0f;

        /* renamed from: c */
        public float f349710c = 0.0f;

        /* renamed from: d */
        public long f349711d = 0;

        /* renamed from: e */
        public long f349712e = 0;

        /* renamed from: f */
        public float f349713f = 0.0f;

        /* renamed from: g */
        public float f349714g = 0.0f;

        /* renamed from: h */
        public float f349715h = 1.0f;

        /* renamed from: i */
        public float f349716i = 0.0f;

        /* renamed from: j */
        public ConcurrentLinkedQueue<C116627c> f349717j = new ConcurrentLinkedQueue<>();

        public C116626b(String str) {
            this.f349708a = str;
        }

        /* renamed from: a */
        public boolean mo180623a() {
            return this.f349711d >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION || this.f349710c >= 0.5f;
        }

        public String toString() {
            return this.f349708a + " " + this.f349710c + " " + mo180623a() + " " + this.f349717j.size();
        }

        public C116626b(String str, float f, long j) {
            this.f349708a = str;
            this.f349710c = f;
            this.f349711d = j;
        }
    }
}
