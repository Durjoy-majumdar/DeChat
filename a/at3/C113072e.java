package at3;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: at3.e */
public class C113072e {

    /* renamed from: e */
    public static final int[] f338460e = {1, 4, 9};

    /* renamed from: a */
    public final SensorManager f338461a = ((SensorManager) MMApplicationContext.getContext().getSystemService("sensor"));

    /* renamed from: b */
    public final HashSet<Sensor> f338462b = new HashSet<>();

    /* renamed from: c */
    public final SparseArray<C113077g> f338463c = new SparseArray<>();

    /* renamed from: d */
    public C113073a f338464d = new C113073a();

    /* renamed from: at3.e$a */
    public class C113073a implements SensorEventListener {

        /* renamed from: d */
        public final AtomicBoolean f338465d = new AtomicBoolean(false);

        /* renamed from: e */
        public long f338466e = 0;

        /* renamed from: f */
        public int f338467f = 0;

        /* renamed from: g */
        public long f338468g = 0;

        public C113073a() {
        }

        /* renamed from: a */
        public void mo165600a(long j) {
            synchronized (this.f338465d) {
                if (!this.f338465d.get()) {
                    this.f338465d.set(true);
                    this.f338466e = System.currentTimeMillis();
                    this.f338467f = (int) Math.ceil(((double) j) / ((double) C113071d.f338457b));
                }
            }
        }

        /* renamed from: b */
        public void mo165601b() {
            synchronized (this.f338465d) {
                if (this.f338465d.get()) {
                    this.f338465d.set(false);
                    long currentTimeMillis = System.currentTimeMillis() - this.f338466e;
                    this.f338468g = currentTimeMillis;
                    if (currentTimeMillis < 0) {
                        this.f338468g = 0;
                    }
                    this.f338466e = 0;
                }
            }
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
            if (r7.sensor != null) goto L_0x0015;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r0 = new at3.C113078h(r7, java.lang.System.currentTimeMillis());
            r7 = r6.f338465d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r1 = r0.f338481b - r6.f338466e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
            if (r1 >= 0) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
            r7 = r0.f338480a;
            r2 = (int) (r1 / at3.C113071d.f338457b);
            r1 = r6.f338469h.f338463c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r3 = r6.f338469h.f338463c.get(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
            if (r3 != null) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
            r3 = new at3.C113077g(r7, at3.C113071d.f338458c, r6.f338467f);
            r6.f338469h.f338463c.put(r7, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
            if (r2 < r3.f338478d) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
            if (r2 > r3.f338477c) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
            r7 = r2 / r3.f338479e;
            r4 = (java.util.List) r3.f338476b[r7];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
            if (r4 != null) goto L_0x0075;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
            r4 = new java.util.ArrayList();
            r3.f338476b[r7] = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
            r4.add(r0);
            r3.f338477c = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
            if (r7 == null) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSensorChanged(android.hardware.SensorEvent r7) {
            /*
                r6 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r6.f338465d
                monitor-enter(r0)
                java.util.concurrent.atomic.AtomicBoolean r1 = r6.f338465d     // Catch:{ all -> 0x0083 }
                boolean r1 = r1.get()     // Catch:{ all -> 0x0083 }
                if (r1 != 0) goto L_0x000d
                monitor-exit(r0)     // Catch:{ all -> 0x0083 }
                return
            L_0x000d:
                monitor-exit(r0)     // Catch:{ all -> 0x0083 }
                if (r7 == 0) goto L_0x0082
                android.hardware.Sensor r0 = r7.sensor
                if (r0 != 0) goto L_0x0015
                goto L_0x0082
            L_0x0015:
                at3.h r0 = new at3.h
                long r1 = java.lang.System.currentTimeMillis()
                r0.<init>(r7, r1)
                java.util.concurrent.atomic.AtomicBoolean r7 = r6.f338465d
                monitor-enter(r7)
                long r1 = r0.f338481b     // Catch:{ all -> 0x007f }
                long r3 = r6.f338466e     // Catch:{ all -> 0x007f }
                long r1 = r1 - r3
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x002e
                monitor-exit(r7)     // Catch:{ all -> 0x007f }
                return
            L_0x002e:
                monitor-exit(r7)     // Catch:{ all -> 0x007f }
                int r7 = r0.f338480a
                long r3 = at3.C113071d.f338457b
                long r1 = r1 / r3
                int r2 = (int) r1
                at3.e r1 = at3.C113072e.this
                android.util.SparseArray<at3.g> r1 = r1.f338463c
                monitor-enter(r1)
                at3.e r3 = at3.C113072e.this     // Catch:{ all -> 0x007c }
                android.util.SparseArray<at3.g> r3 = r3.f338463c     // Catch:{ all -> 0x007c }
                java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x007c }
                at3.g r3 = (at3.C113077g) r3     // Catch:{ all -> 0x007c }
                if (r3 != 0) goto L_0x0056
                at3.g r3 = new at3.g     // Catch:{ all -> 0x007c }
                int r4 = at3.C113071d.f338458c     // Catch:{ all -> 0x007c }
                int r5 = r6.f338467f     // Catch:{ all -> 0x007c }
                r3.<init>(r7, r4, r5)     // Catch:{ all -> 0x007c }
                at3.e r4 = at3.C113072e.this     // Catch:{ all -> 0x007c }
                android.util.SparseArray<at3.g> r4 = r4.f338463c     // Catch:{ all -> 0x007c }
                r4.put(r7, r3)     // Catch:{ all -> 0x007c }
            L_0x0056:
                int r7 = r3.f338478d     // Catch:{ all -> 0x007c }
                if (r2 < r7) goto L_0x005b
                goto L_0x007a
            L_0x005b:
                int r7 = r3.f338477c     // Catch:{ all -> 0x007c }
                if (r2 > r7) goto L_0x0060
                goto L_0x007a
            L_0x0060:
                int r7 = r3.f338479e     // Catch:{ all -> 0x007c }
                int r7 = r2 / r7
                java.lang.Object[] r4 = r3.f338476b     // Catch:{ all -> 0x007c }
                r4 = r4[r7]     // Catch:{ all -> 0x007c }
                java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x007c }
                if (r4 != 0) goto L_0x0075
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.Object[] r5 = r3.f338476b     // Catch:{ all -> 0x007c }
                r5[r7] = r4     // Catch:{ all -> 0x007c }
            L_0x0075:
                r4.add(r0)     // Catch:{ all -> 0x007c }
                r3.f338477c = r2     // Catch:{ all -> 0x007c }
            L_0x007a:
                monitor-exit(r1)     // Catch:{ all -> 0x007c }
                return
            L_0x007c:
                r7 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x007c }
                throw r7
            L_0x007f:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x007f }
                throw r0
            L_0x0082:
                return
            L_0x0083:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0083 }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: at3.C113072e.C113073a.onSensorChanged(android.hardware.SensorEvent):void");
        }
    }

    public C113072e(Context context) {
    }

    /* renamed from: b */
    public static boolean m154746b(SparseArray<C113077g> sparseArray) {
        if (sparseArray == null || sparseArray.size() == 0) {
            return false;
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            C113077g valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                Object[] objArr = (Object[]) valueAt.f338476b.clone();
                if (objArr.length == 0) {
                    continue;
                } else {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        Object[] objArr2 = valueAt.f338476b;
                        if (i2 >= objArr2.length) {
                            break;
                        }
                        if (((List) objArr2[i2]) != null) {
                            i3++;
                        }
                        i2++;
                    }
                    if (i3 < 3) {
                        return false;
                    }
                    for (Object obj : objArr) {
                        List list = (List) obj;
                        if (list != null && list.size() < C113071d.f338458c / 2) {
                            return false;
                        }
                    }
                    continue;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public SparseArray<C113077g> mo165597a() {
        synchronized (this.f338463c) {
            SparseArray<C113077g> sparseArray = new SparseArray<>();
            for (int i = 0; i < this.f338463c.size(); i++) {
                sparseArray.append(this.f338463c.keyAt(i), this.f338463c.valueAt(i));
            }
            if (m154746b(sparseArray)) {
                return sparseArray;
            }
            SparseArray<C113077g> sparseArray2 = new SparseArray<>();
            return sparseArray2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        return r3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo165598c(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.hardware.SensorManager r0 = r7.f338461a     // Catch:{ all -> 0x004c }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r7)
            return r1
        L_0x0008:
            at3.e$a r0 = r7.f338464d     // Catch:{ all -> 0x004c }
            r0.mo165600a(r8)     // Catch:{ all -> 0x004c }
            java.util.HashSet<android.hardware.Sensor> r8 = r7.f338462b     // Catch:{ all -> 0x004c }
            monitor-enter(r8)     // Catch:{ all -> 0x004c }
            java.util.HashSet<android.hardware.Sensor> r9 = r7.f338462b     // Catch:{ all -> 0x0049 }
            r9.clear()     // Catch:{ all -> 0x0049 }
            monitor-exit(r8)     // Catch:{ all -> 0x0049 }
            java.util.HashSet<android.hardware.Sensor> r8 = r7.f338462b     // Catch:{ all -> 0x004c }
            monitor-enter(r8)     // Catch:{ all -> 0x004c }
            int[] r9 = f338460e     // Catch:{ all -> 0x0046 }
            r0 = 3
            r2 = 0
            r3 = 0
        L_0x001e:
            if (r2 >= r0) goto L_0x003e
            r4 = r9[r2]     // Catch:{ all -> 0x0046 }
            android.hardware.SensorManager r5 = r7.f338461a     // Catch:{ all -> 0x0046 }
            android.hardware.Sensor r4 = r5.getDefaultSensor(r4)     // Catch:{ all -> 0x0046 }
            if (r4 != 0) goto L_0x002b
            goto L_0x003b
        L_0x002b:
            android.hardware.SensorManager r5 = r7.f338461a     // Catch:{ all -> 0x0046 }
            at3.e$a r6 = r7.f338464d     // Catch:{ all -> 0x0046 }
            boolean r5 = r5.registerListener(r6, r4, r1)     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x003b
            java.util.HashSet<android.hardware.Sensor> r3 = r7.f338462b     // Catch:{ all -> 0x0046 }
            r3.add(r4)     // Catch:{ all -> 0x0046 }
            r3 = 1
        L_0x003b:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x003e:
            monitor-exit(r8)     // Catch:{ all -> 0x0046 }
            if (r3 != 0) goto L_0x0044
            r7.mo165599d()     // Catch:{ all -> 0x004c }
        L_0x0044:
            monitor-exit(r7)
            return r3
        L_0x0046:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0046 }
            throw r9     // Catch:{ all -> 0x004c }
        L_0x0049:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0049 }
            throw r9     // Catch:{ all -> 0x004c }
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: at3.C113072e.mo165598c(long):boolean");
    }

    /* renamed from: d */
    public synchronized void mo165599d() {
        if (this.f338461a != null) {
            synchronized (this.f338462b) {
                Iterator<Sensor> it = this.f338462b.iterator();
                while (it.hasNext()) {
                    this.f338461a.unregisterListener(this.f338464d, it.next());
                }
                this.f338462b.clear();
            }
            this.f338464d.mo165601b();
        }
    }
}
