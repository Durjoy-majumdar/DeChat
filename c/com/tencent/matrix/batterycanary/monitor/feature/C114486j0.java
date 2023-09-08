package com.tencent.matrix.batterycanary.monitor.feature;

import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1013nf.C88933a;
import p1177ce.C113314g;
import p221qf.C89642e;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.j0 */
public final class C114486j0 extends C114436a {

    /* renamed from: k */
    public final List<String> f343195k = new ArrayList();

    /* renamed from: l */
    public final Map<Looper, C88933a> f343196l = new HashMap();

    /* renamed from: m */
    public C89642e f343197m;

    /* renamed from: n */
    public Runnable f343198n;

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.j0$a */
    public class C114487a implements C89642e {
        public C114487a() {
        }

        /* renamed from: a */
        public final int mo173687a(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            int indexOf = str.indexOf("@");
            int lastIndexOf = str.contains(": ") ? str.lastIndexOf(": ") : Integer.MAX_VALUE;
            if (indexOf >= lastIndexOf - 1) {
                return -1;
            }
            int i = indexOf + 1;
            try {
                return Integer.parseInt(lastIndexOf == Integer.MAX_VALUE ? str.substring(i) : str.substring(i, lastIndexOf), 16);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: b */
        public void mo112114b(String str) {
            int a;
            if (C114486j0.this.f349668a.f339057d.f339048s) {
                C118672d.m167353c("Matrix.battery.LooperTaskMonitorFeature", "[" + Thread.currentThread().getName() + "]" + str, new Object[0]);
            }
            String c = mo173688c(str);
            if (!TextUtils.isEmpty(c) && (a = mo173687a(str)) > 0) {
                C114486j0.this.mo173640q(c, a);
            }
        }

        /* renamed from: c */
        public final String mo173688c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            int indexOf = str.indexOf("} ");
            int lastIndexOf = str.lastIndexOf("@");
            if (indexOf >= lastIndexOf - 1) {
                return null;
            }
            return str.substring(indexOf + 2, lastIndexOf);
        }

        /* renamed from: e */
        public void mo112115e(String str, long j, long j2) {
            int a;
            if (C114486j0.this.f349668a.f339057d.f339048s) {
                C118672d.m167353c("Matrix.battery.LooperTaskMonitorFeature", "[" + Thread.currentThread().getName() + "]" + str, new Object[0]);
            }
            String c = mo173688c(str);
            if (!TextUtils.isEmpty(c) && (a = mo173687a(str)) > 0) {
                C114486j0.this.mo173639p(c, a);
            }
        }

        public boolean isValid() {
            boolean z;
            C113314g gVar = C114486j0.this.f349668a;
            gVar.getClass();
            synchronized (C113314g.class) {
                z = gVar.f339063j;
            }
            return z;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.j0$b */
    public class C114488b implements Runnable {
        public C114488b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                com.tencent.matrix.batterycanary.monitor.feature.j0 r0 = com.tencent.matrix.batterycanary.monitor.feature.C114486j0.this
                java.util.List<java.lang.String> r1 = r0.f343195k
                monitor-enter(r1)
                qf.e r2 = r0.f343197m     // Catch:{ all -> 0x012e }
                if (r2 != 0) goto L_0x000c
                monitor-exit(r1)     // Catch:{ all -> 0x012e }
                goto L_0x012d
            L_0x000c:
                java.lang.String r2 = "Matrix.battery.LooperTaskMonitorFeature"
                java.lang.String r3 = "#startWatching"
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x012e }
                p723vf.C118672d.m167353c(r2, r3, r4)     // Catch:{ all -> 0x012e }
                ce.g r2 = r0.f349668a     // Catch:{ all -> 0x012e }
                ce.f r2 = r2.f339057d     // Catch:{ all -> 0x012e }
                java.util.List<java.lang.String> r2 = r2.f339051v     // Catch:{ all -> 0x012e }
                java.lang.String r3 = "all"
                boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x012e }
                if (r2 == 0) goto L_0x008c
                java.util.Map r2 = java.lang.Thread.getAllStackTraces()     // Catch:{ all -> 0x012e }
                if (r2 != 0) goto L_0x002f
                java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x012e }
                goto L_0x0033
            L_0x002f:
                java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x012e }
            L_0x0033:
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x012e }
            L_0x0037:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x012e }
                if (r3 == 0) goto L_0x012c
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x012e }
                java.lang.Thread r3 = (java.lang.Thread) r3     // Catch:{ all -> 0x012e }
                boolean r4 = r3 instanceof android.os.HandlerThread     // Catch:{ all -> 0x012e }
                if (r4 == 0) goto L_0x006a
                r4 = r3
                android.os.HandlerThread r4 = (android.os.HandlerThread) r4     // Catch:{ all -> 0x012e }
                android.os.Looper r4 = r4.getLooper()     // Catch:{ all -> 0x012e }
                if (r4 == 0) goto L_0x0037
                java.util.Map<android.os.Looper, nf.a> r5 = r0.f343196l     // Catch:{ all -> 0x012e }
                java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x012e }
                boolean r4 = r5.containsKey(r4)     // Catch:{ all -> 0x012e }
                if (r4 != 0) goto L_0x0037
                android.os.HandlerThread r3 = (android.os.HandlerThread) r3     // Catch:{ all -> 0x012e }
                android.os.Looper r4 = r3.getLooper()     // Catch:{ all -> 0x012e }
                if (r4 == 0) goto L_0x0037
                java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x012e }
                r0.mo173686v(r3, r4)     // Catch:{ all -> 0x012e }
                goto L_0x0037
            L_0x006a:
                android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x012e }
                java.lang.Thread r4 = r4.getThread()     // Catch:{ all -> 0x012e }
                if (r4 != r3) goto L_0x0037
                java.util.Map<android.os.Looper, nf.a> r3 = r0.f343196l     // Catch:{ all -> 0x012e }
                android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x012e }
                java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x012e }
                boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x012e }
                if (r3 != 0) goto L_0x0037
                java.lang.String r3 = "main"
                android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x012e }
                r0.mo173686v(r3, r4)     // Catch:{ all -> 0x012e }
                goto L_0x0037
            L_0x008c:
                java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x012e }
                ce.g r3 = r0.f349668a     // Catch:{ all -> 0x012e }
                ce.f r3 = r3.f339057d     // Catch:{ all -> 0x012e }
                java.util.List<java.lang.String> r3 = r3.f339051v     // Catch:{ all -> 0x012e }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x012e }
            L_0x009a:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x012e }
                if (r4 == 0) goto L_0x012c
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x012e }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x012e }
                boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x012e }
                if (r5 == 0) goto L_0x00ad
                goto L_0x009a
            L_0x00ad:
                java.lang.String r5 = "main"
                boolean r5 = r5.equalsIgnoreCase(r4)     // Catch:{ all -> 0x012e }
                if (r5 == 0) goto L_0x00c9
                android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x012e }
                java.util.Map<android.os.Looper, nf.a> r5 = r0.f343196l     // Catch:{ all -> 0x012e }
                java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x012e }
                boolean r5 = r5.containsKey(r4)     // Catch:{ all -> 0x012e }
                if (r5 != 0) goto L_0x009a
                java.lang.String r5 = "main"
                r0.mo173686v(r5, r4)     // Catch:{ all -> 0x012e }
                goto L_0x009a
            L_0x00c9:
                java.util.List<java.lang.String> r5 = r0.f343195k     // Catch:{ all -> 0x012e }
                java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x012e }
                boolean r5 = r5.contains(r4)     // Catch:{ all -> 0x012e }
                if (r5 != 0) goto L_0x009a
                boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x012e }
                if (r5 == 0) goto L_0x00e8
                java.util.Map r2 = java.lang.Thread.getAllStackTraces()     // Catch:{ all -> 0x012e }
                if (r2 != 0) goto L_0x00e4
                java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x012e }
                goto L_0x00e8
            L_0x00e4:
                java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x012e }
            L_0x00e8:
                java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x012e }
            L_0x00ec:
                boolean r6 = r5.hasNext()     // Catch:{ all -> 0x012e }
                if (r6 == 0) goto L_0x009a
                java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x012e }
                java.lang.Thread r6 = (java.lang.Thread) r6     // Catch:{ all -> 0x012e }
                android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x012e }
                java.lang.Thread r7 = r7.getThread()     // Catch:{ all -> 0x012e }
                if (r7 != r6) goto L_0x0103
                goto L_0x00ec
            L_0x0103:
                java.lang.String r7 = r6.getName()     // Catch:{ all -> 0x012e }
                boolean r7 = r7.contains(r4)     // Catch:{ all -> 0x012e }
                if (r7 == 0) goto L_0x00ec
                boolean r7 = r6 instanceof android.os.HandlerThread     // Catch:{ all -> 0x012e }
                if (r7 == 0) goto L_0x00ec
                r7 = r6
                android.os.HandlerThread r7 = (android.os.HandlerThread) r7     // Catch:{ all -> 0x012e }
                android.os.Looper r7 = r7.getLooper()     // Catch:{ all -> 0x012e }
                if (r7 == 0) goto L_0x00ec
                java.util.Map<android.os.Looper, nf.a> r8 = r0.f343196l     // Catch:{ all -> 0x012e }
                java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ all -> 0x012e }
                boolean r8 = r8.containsKey(r7)     // Catch:{ all -> 0x012e }
                if (r8 != 0) goto L_0x00ec
                java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x012e }
                r0.mo173686v(r6, r7)     // Catch:{ all -> 0x012e }
                goto L_0x00ec
            L_0x012c:
                monitor-exit(r1)     // Catch:{ all -> 0x012e }
            L_0x012d:
                return
            L_0x012e:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x012e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.batterycanary.monitor.feature.C114486j0.C114488b.run():void");
        }
    }

    /* renamed from: a */
    public void mo173597a(boolean z) {
        super.mo173597a(z);
        if (z) {
            Runnable runnable = this.f343198n;
            if (runnable != null) {
                this.f349668a.f339059f.removeCallbacks(runnable);
                return;
            }
            return;
        }
        C114488b bVar = new C114488b();
        this.f343198n = bVar;
        C113314g gVar = this.f349668a;
        gVar.f339059f.postDelayed(bVar, gVar.f339057d.f339034e);
    }

    /* renamed from: b */
    public void mo111817b() {
        super.mo111817b();
        this.f343197m = new C114487a();
    }

    /* renamed from: d */
    public int mo111818d() {
        return 0;
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        synchronized (this.f343195k) {
            this.f343197m = null;
            for (C88933a b : ((HashMap) this.f343196l).values()) {
                b.mo123312b();
            }
            ((HashMap) this.f343196l).clear();
            ((ArrayList) this.f343195k).clear();
        }
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.LooperTaskMonitorFeature";
    }

    /* renamed from: n */
    public void mo173637n(String str, int i, int i2) {
    }

    /* renamed from: p */
    public void mo173639p(String str, int i) {
        C114436a.C114440d dVar = (C114436a.C114440d) ((ConcurrentHashMap) this.f343097c).remove(Integer.valueOf(i));
        if (dVar != null) {
            C114436a.C114440d j = mo173633j(str, Process.myTid());
            if (j != null) {
                j.f343114k = true;
                mo173643t(dVar, j);
            }
            mo173638o(Process.myTid(), "thread_pool@idle", ((Long) (j == null ? dVar.f343110g : j.f343110g).f343211a).longValue());
        }
    }

    /* renamed from: q */
    public void mo173640q(String str, int i) {
        C114436a.C114440d j = mo173633j(str, Process.myTid());
        if (j != null) {
            ((ConcurrentHashMap) this.f343097c).put(Integer.valueOf(i), j);
            mo173638o(Process.myTid(), str, ((Long) j.f343110g.f343211a).longValue());
        }
    }

    /* renamed from: r */
    public void mo173641r(List<C114490k0.C114491a.C114492a<C114436a.C114440d>> list) {
        this.f349668a.f339057d.f339031b.getClass();
    }

    /* renamed from: s */
    public boolean mo173642s(C114490k0.C114491a.C114492a<C114436a.C114440d> aVar) {
        return aVar.f343208d > 10;
    }

    /* renamed from: v */
    public void mo173686v(String str, Looper looper) {
        if (!TextUtils.isEmpty(str) && looper != null) {
            synchronized (this.f343195k) {
                if (this.f343197m != null) {
                    ((ArrayList) this.f343195k).remove(str);
                    C88933a aVar = (C88933a) ((HashMap) this.f343196l).remove(looper);
                    if (aVar != null) {
                        aVar.mo123312b();
                    }
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C88933a.f256475p;
                    C88933a aVar2 = (C88933a) concurrentHashMap.get(looper);
                    if (aVar2 == null) {
                        aVar2 = new C88933a(looper);
                        concurrentHashMap.put(looper, aVar2);
                    }
                    C89642e eVar = this.f343197m;
                    synchronized (aVar2.f256483i) {
                        ((HashMap) aVar2.f256483i).put(eVar, new C88933a.C88934a(eVar));
                    }
                    ((ArrayList) this.f343195k).add(str);
                    ((HashMap) this.f343196l).put(looper, aVar2);
                }
            }
        }
    }
}
