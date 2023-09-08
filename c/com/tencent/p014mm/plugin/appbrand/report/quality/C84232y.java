package com.tencent.p014mm.plugin.appbrand.report.quality;

import android.os.Debug;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import p757xv.C91353u;
import p935cb.C79991m;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.y */
public class C84232y {

    /* renamed from: a */
    public volatile int f246056a;

    /* renamed from: b */
    public boolean f246057b;

    /* renamed from: c */
    public long f246058c;

    /* renamed from: d */
    public final Map<Integer, C84236d> f246059d;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.y$b */
    public static final class C84234b {

        /* renamed from: a */
        public static final C84232y f246060a = new C84232y((C84233a) null);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.y$c */
    public final class C84235c implements Runnable {
        public C84235c(C84233a aVar) {
        }

        public void run() {
            C84232y.this.mo116917a();
            ((C119157j) C119157j.f356862d).mo183879j(this, (long) C84232y.this.f246056a, "QualityKVReporter_19941");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.y$d */
    public static final class C84236d {

        /* renamed from: a */
        public int f246062a;

        /* renamed from: b */
        public int f246063b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f246064c;

        /* renamed from: d */
        public int f246065d;

        public C84236d(int i) {
        }

        /* renamed from: a */
        public void mo116920a(int i) {
            this.f246064c++;
            this.f246062a += i;
            int i2 = this.f246063b;
            if (i > i2) {
                i2 = i;
            }
            this.f246063b = i2;
            this.f246065d = i;
        }
    }

    public C84232y(C84233a aVar) {
        HashMap hashMap = new HashMap();
        this.f246059d = hashMap;
        hashMap.put(1, new C84236d(1));
        hashMap.put(2, new C84236d(2));
        hashMap.put(3, new C84236d(3));
        hashMap.put(4, new C84236d(4));
        hashMap.put(5, new C84236d(5));
        hashMap.put(6, new C84236d(6));
        hashMap.put(7, new C84236d(7));
    }

    /* renamed from: a */
    public final void mo116917a() {
        C79991m mVar = C79991m.INST;
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        C79991m.C79992a a = C79991m.m97210a(memoryInfo);
        C79991m.C79992a b = mVar.mo110171b();
        ((C84236d) ((HashMap) this.f246059d).get(1)).mo116920a(a.f234284a);
        C84236d dVar = (C84236d) ((HashMap) this.f246059d).get(2);
        int i = a.f234290g;
        if (i <= 0) {
            i = a.f234286c;
        }
        dVar.mo116920a(i);
        ((C84236d) ((HashMap) this.f246059d).get(3)).mo116920a(a.f234285b);
        ((C84236d) ((HashMap) this.f246059d).get(4)).mo116920a(b.f234287d);
        ((C84236d) ((HashMap) this.f246059d).get(5)).mo116920a(a.f234291h);
        ((C84236d) ((HashMap) this.f246059d).get(6)).mo116920a(a.f234292i);
        C91353u uVar = (C91353u) C86312j.m106911c(C91353u.class);
        if (uVar != null) {
            ((C84236d) ((HashMap) this.f246059d).get(7)).mo116920a((int) ((uVar.Zk0() / 1024) / 1024));
        }
    }

    /* renamed from: b */
    public final C84236d mo116918b(int i) {
        C84236d dVar = (C84236d) ((HashMap) this.f246059d).get(Integer.valueOf(i));
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException(String.format("StatisticsWrapper null, type:%d", new Object[]{Integer.valueOf(i)}));
    }
}
