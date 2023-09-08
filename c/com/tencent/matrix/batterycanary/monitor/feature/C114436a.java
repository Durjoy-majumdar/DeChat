package com.tencent.matrix.batterycanary.monitor.feature;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p1177ce.C113314g;
import p1190de.C116608a;
import p723vf.C118672d;
import p981ie.C117159b;
import p981ie.C117178r;
import p981ie.C117187w;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.a */
public abstract class C114436a extends C116608a {

    /* renamed from: b */
    public final List<C114490k0.C114491a.C114492a<C114440d>> f343096b = new ArrayList();

    /* renamed from: c */
    public final Map<Integer, C114440d> f343097c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Map<String, Pair<? extends List<Integer>, Long>> f343098d = new ConcurrentHashMap();

    /* renamed from: e */
    public final SparseArray<List<C117187w.C117189b>> f343099e = new SparseArray<>();

    /* renamed from: f */
    public C117187w.C117189b f343100f;

    /* renamed from: g */
    public C114451e f343101g;

    /* renamed from: h */
    public C114536x f343102h;

    /* renamed from: i */
    public int f343103i = 200;

    /* renamed from: j */
    public Runnable f343104j = new C114437a();

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.a$a */
    public class C114437a implements Runnable {
        public C114437a() {
        }

        public void run() {
            C114436a aVar = C114436a.this;
            synchronized (aVar.f343099e) {
                for (int i = 0; i < aVar.f343099e.size(); i++) {
                    List valueAt = aVar.f343099e.valueAt(i);
                    if (valueAt != null && valueAt.size() > aVar.f343103i) {
                        C117187w.m165274b(valueAt);
                    }
                }
            }
            if (((ArrayList) aVar.f343096b).size() > aVar.f343103i) {
                C118672d.m167356f("Matrix.battery.AbsTaskMonitorFeature", "cooling task jiffies list, before = " + ((ArrayList) aVar.f343096b).size(), new Object[0]);
                List<C114490k0.C114491a.C114492a<C114440d>> k = aVar.mo173634k(0);
                aVar.mo173632i();
                C118672d.m167356f("Matrix.battery.AbsTaskMonitorFeature", "cooling task jiffies list, after = " + ((ArrayList) aVar.f343096b).size(), new Object[0]);
                C118672d.m167356f("Matrix.battery.AbsTaskMonitorFeature", "report task jiffies list overheat", new Object[0]);
                aVar.mo173641r(k);
            }
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.a$b */
    public class C114438b implements Comparator<C114490k0.C114491a.C114492a<C114440d>> {
        public C114438b(C114436a aVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r2.f343111h == 1) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r9, java.lang.Object r10) {
            /*
                r8 = this;
                com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r9 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114492a) r9
                com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r10 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114492a) r10
                RECORD r0 = r9.f343207c
                r1 = 0
                if (r0 == 0) goto L_0x0045
                RECORD r2 = r10.f343207c
                if (r2 != 0) goto L_0x000e
                goto L_0x0045
            L_0x000e:
                com.tencent.matrix.batterycanary.monitor.feature.a$d r0 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r0
                com.tencent.matrix.batterycanary.monitor.feature.a$d r2 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r2
                int r9 = r0.f343111h
                r10 = -1
                r3 = 1
                if (r9 != r3) goto L_0x001c
                int r4 = r2.f343111h
                if (r4 == r3) goto L_0x0026
            L_0x001c:
                if (r9 != r3) goto L_0x0020
            L_0x001e:
                r1 = 1
                goto L_0x0065
            L_0x0020:
                int r9 = r2.f343111h
                if (r9 != r3) goto L_0x0026
            L_0x0024:
                r1 = -1
                goto L_0x0065
            L_0x0026:
                com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r9 = r0.f343110g
                DIGIT r9 = r9.f343211a
                java.lang.Long r9 = (java.lang.Long) r9
                long r4 = r9.longValue()
                com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r9 = r2.f343110g
                DIGIT r9 = r9.f343211a
                java.lang.Long r9 = (java.lang.Long) r9
                long r6 = r9.longValue()
                long r4 = r4 - r6
                r6 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 != 0) goto L_0x0042
                goto L_0x0065
            L_0x0042:
                if (r9 <= 0) goto L_0x001e
                goto L_0x0024
            L_0x0045:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "delta should not be null: "
                r0.append(r2)
                r0.append(r9)
                java.lang.String r9 = " vs "
                r0.append(r9)
                r0.append(r10)
                java.lang.String r9 = r0.toString()
                java.lang.Object[] r10 = new java.lang.Object[r1]
                java.lang.String r0 = "Matrix.battery.AbsTaskMonitorFeature"
                p723vf.C118672d.m167356f(r0, r9, r10)
            L_0x0065:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114438b.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.a$c */
    public class C114439c implements C117187w.C117189b.C117190a {

        /* renamed from: a */
        public final /* synthetic */ long f343106a;

        public C114439c(C114436a aVar, long j) {
            this.f343106a = j;
        }

        /* renamed from: a */
        public C117187w.C117189b mo173647a(String str) {
            return new C117187w.C117189b(str, this.f343106a);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.a$d */
    public static class C114440d extends C114490k0.C114491a<C114440d> {

        /* renamed from: d */
        public int f343107d;

        /* renamed from: e */
        public String f343108e;

        /* renamed from: f */
        public long f343109f = System.currentTimeMillis();

        /* renamed from: g */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343110g;

        /* renamed from: h */
        public int f343111h;

        /* renamed from: i */
        public int f343112i;

        /* renamed from: j */
        public String f343113j;

        /* renamed from: k */
        public boolean f343114k = false;

        /* renamed from: l */
        public long f343115l = 100;

        /* renamed from: m */
        public long f343116m = 100;

        /* renamed from: n */
        public long f343117n = 100;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114442b(this, (C114440d) aVar, this);
        }

        public String toString() {
            return "TaskJiffiesSnapshot{appStat=" + this.f343111h + ", devStat=" + this.f343112i + ", tid=" + this.f343107d + ", name='" + this.f343108e + '\'' + ", jiffies=" + this.f343110g + '}';
        }
    }

    /* renamed from: b */
    public void mo111817b() {
        super.mo111817b();
    }

    /* renamed from: e */
    public void mo173631e(C113314g gVar) {
        super.mo173631e(gVar);
        this.f343101g = (C114451e) gVar.mo165880e(C114451e.class);
        this.f343102h = (C114536x) gVar.mo165880e(C114536x.class);
        this.f343100f = new C117187w.C117189b("thread_pool@idle", 0);
        this.f343103i = Math.max(gVar.f339057d.f339037h, this.f343103i);
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        ((ConcurrentHashMap) this.f343097c).clear();
        synchronized (this.f343098d) {
            ((ConcurrentHashMap) this.f343098d).clear();
        }
        synchronized (this.f343096b) {
            ((ArrayList) this.f343096b).clear();
        }
        synchronized (this.f343099e) {
            this.f343099e.clear();
        }
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.AbsTaskMonitorFeature";
    }

    /* renamed from: i */
    public void mo173632i() {
        synchronized (this.f343096b) {
            ((ArrayList) this.f343096b).clear();
        }
    }

    /* renamed from: j */
    public C114440d mo173633j(String str, int i) {
        C114440d dVar = new C114440d();
        dVar.f343107d = i;
        dVar.f343108e = str;
        dVar.f343111h = C117159b.m165201b(this.f349668a.mo165879a(), this.f349668a.f339064n);
        dVar.f343112i = C117159b.m165213n(this.f349668a.mo165879a());
        try {
            Callable<String> callable = this.f349668a.f339057d.f339032c;
            dVar.f343113j = callable == null ? "" : callable.call();
        } catch (Exception unused) {
            dVar.f343113j = "";
        }
        this.f349668a.f339057d.getClass();
        int myPid = Process.myPid();
        C117178r.C117182d c = C117178r.m165260c(myPid, i);
        if (c == null) {
            C118672d.m167356f("Matrix.battery.AbsTaskMonitorFeature", "parse task procStat fail, name = " + str + ", tid = " + i, new Object[0]);
            mo173637n(str, myPid, i);
            return null;
        }
        dVar.f343110g = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(c.mo181109a()));
        return dVar;
    }

    /* renamed from: k */
    public List<C114490k0.C114491a.C114492a<C114440d>> mo173634k(long j) {
        ArrayList arrayList;
        synchronized (this.f343096b) {
            if (j <= 0) {
                arrayList = new ArrayList(this.f343096b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                long uptimeMillis = SystemClock.uptimeMillis() - j;
                Iterator it = ((ArrayList) this.f343096b).iterator();
                while (it.hasNext()) {
                    C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) it.next();
                    if (((C114440d) aVar.f343205a).f343202a >= uptimeMillis) {
                        arrayList2.add(aVar);
                    }
                }
                arrayList = arrayList2;
            }
        }
        Collections.sort(arrayList, new C114438b(this));
        return arrayList;
    }

    /* renamed from: l */
    public C117187w.C117192d mo173635l(int i, long j, long j2) {
        synchronized (this.f343099e) {
            if (j >= 0) {
                try {
                    if (this.f343099e.get(i) != null) {
                        C117187w.C117192d a = C117187w.m165273a(this.f343099e.get(i), j, 10, new C114439c(this, j2));
                        return a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C117187w.C117192d dVar = new C117187w.C117192d();
            dVar.f351076c = false;
            return dVar;
        }
    }

    /* renamed from: m */
    public ArrayList<C117187w.C117189b> mo173636m(int i) {
        synchronized (this.f343099e) {
            List list = this.f343099e.get(i);
            if (list == null) {
                return null;
            }
            ArrayList<C117187w.C117189b> arrayList = new ArrayList<>(list);
            return arrayList;
        }
    }

    /* renamed from: n */
    public void mo173637n(String str, int i, int i2) {
    }

    /* renamed from: o */
    public void mo173638o(int i, String str, long j) {
        synchronized (this.f343099e) {
            List list = this.f343099e.get(i);
            ArrayList arrayList = list;
            if (list == null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(0, this.f343100f);
                this.f343099e.put(i, arrayList2);
                arrayList = arrayList2;
            }
            arrayList.add(0, new C117187w.C117189b(str, j));
        }
        this.f349668a.f339059f.removeCallbacks(this.f343104j);
        this.f349668a.f339059f.postDelayed(this.f343104j, 1000);
    }

    /* renamed from: p */
    public void mo173639p(String str, int i) {
        C114440d dVar = (C114440d) ((ConcurrentHashMap) this.f343097c).remove(Integer.valueOf(i));
        if (Looper.myLooper() != Looper.getMainLooper() && dVar != null) {
            C114440d j = mo173633j(str, Process.myTid());
            if (j != null) {
                j.f343114k = true;
                mo173643t(dVar, j);
            }
            mo173638o(Process.myTid(), "thread_pool@idle", ((Long) (j == null ? dVar.f343110g : j.f343110g).f343211a).longValue());
        }
    }

    /* renamed from: q */
    public void mo173640q(String str, int i) {
        C114440d j;
        if (Looper.myLooper() != Looper.getMainLooper() && (j = mo173633j(str, Process.myTid())) != null) {
            ((ConcurrentHashMap) this.f343097c).put(Integer.valueOf(i), j);
            mo173638o(Process.myTid(), str, ((Long) j.f343110g.f343211a).longValue());
        }
    }

    /* renamed from: r */
    public void mo173641r(List<C114490k0.C114491a.C114492a<C114440d>> list) {
    }

    /* renamed from: s */
    public boolean mo173642s(C114490k0.C114491a.C114492a<C114440d> aVar) {
        return aVar.f343208d > 1000 && ((Long) ((C114440d) aVar.f343207c).f343110g.f343211a).longValue() / Math.max(1, aVar.f343208d / 60000) > 100;
    }

    /* renamed from: t */
    public void mo173643t(C114440d dVar, C114440d dVar2) {
        if (dVar2.f343107d != dVar.f343107d) {
            C118672d.m167356f("Matrix.battery.AbsTaskMonitorFeature", "task tid mismatch: " + dVar + " vs " + dVar2, new Object[0]);
        } else if (!dVar2.f343108e.equals(dVar.f343108e)) {
            C118672d.m167356f("Matrix.battery.AbsTaskMonitorFeature", "task name mismatch: " + dVar + " vs " + dVar2, new Object[0]);
        } else {
            C114442b bVar = new C114442b(dVar2, dVar, dVar2);
            if (mo173642s(bVar)) {
                C114440d dVar3 = (C114440d) bVar.f343207c;
                C118672d.m167353c("Matrix.battery.AbsTaskMonitorFeature", "onTaskReport: %s, jiffies = %s, millis = %s", dVar3.f343108e, dVar3.f343110g.f343211a, Long.valueOf(bVar.f343208d));
                C114451e eVar = this.f343101g;
                if (eVar != null) {
                    C114451e.C114458h i = eVar.mo173652i(bVar.f343208d);
                    if (!i.f343204c) {
                        dVar2.f343204c = false;
                        ((C114440d) bVar.f343207c).f343204c = false;
                    }
                    String str = ((C114440d) bVar.f343207c).f343113j;
                    long j = 100;
                    C117187w.C117192d.C117193a b = this.f343101g.mo173653j(bVar.f343208d).mo181114b();
                    if (b != null) {
                        str = b.f351077a;
                        j = (long) b.f351078b;
                    }
                    ((C114440d) bVar.f343207c).f343115l = ((Long) i.f343146f.f343211a).longValue();
                    C114440d dVar4 = (C114440d) bVar.f343207c;
                    dVar4.f343113j = str;
                    dVar4.f343117n = j;
                }
                C114536x xVar = this.f343102h;
                if (xVar != null) {
                    C114536x.C114546i k = xVar.mo173711k(bVar.f343208d);
                    if (!k.f343204c) {
                        dVar2.f343204c = false;
                        ((C114440d) bVar.f343207c).f343204c = false;
                    }
                    ((C114440d) bVar.f343207c).f343116m = ((Long) k.f343318e.f343211a).longValue();
                }
                mo173644u(bVar);
                if (((ArrayList) this.f343096b).size() >= this.f343103i) {
                    C118672d.m167356f("Matrix.battery.AbsTaskMonitorFeature", "task list overheat, size = " + ((ArrayList) this.f343096b).size(), new Object[0]);
                    this.f349668a.f339059f.removeCallbacks(this.f343104j);
                    this.f349668a.f339059f.postDelayed(this.f343104j, 1000);
                }
            }
        }
    }

    /* renamed from: u */
    public void mo173644u(C114490k0.C114491a.C114492a<C114440d> aVar) {
        synchronized (this.f343096b) {
            Iterator it = ((ArrayList) this.f343096b).iterator();
            while (it.hasNext()) {
                C114490k0.C114491a.C114492a aVar2 = (C114490k0.C114491a.C114492a) it.next();
                if (((C114440d) aVar2.f343207c).f343108e.equals(((C114440d) aVar.f343207c).f343108e)) {
                    RECORD record = aVar2.f343207c;
                    if (((C114440d) record).f343107d == ((C114440d) aVar.f343207c).f343107d && !((C114440d) record).f343114k) {
                        it.remove();
                    }
                }
            }
            ((ArrayList) this.f343096b).add(aVar);
        }
    }
}
