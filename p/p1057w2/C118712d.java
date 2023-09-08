package p1057w2;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import p1042u.C111058g;
import p1050v2.C111325g;
import p1091b3.C113134m;

/* renamed from: w2.d */
public class C118712d {

    /* renamed from: a */
    public static final C118719j f355219a;

    /* renamed from: b */
    public static final C111058g<String, Typeface> f355220b = new C111058g<>(16);

    /* renamed from: w2.d$a */
    public static class C118713a extends C113134m {

        /* renamed from: a */
        public C111325g.C111328d f355221a;

        public C118713a(C111325g.C111328d dVar) {
            this.f355221a = dVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f355219a = new C118718i();
        } else if (i >= 28) {
            f355219a = new C118717h();
        } else if (i >= 26) {
            f355219a = new C118716g();
        } else {
            if (i >= 24) {
                if (C118715f.f355229c != null) {
                    f355219a = new C118715f();
                }
            }
            f355219a = new C118714e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m167395a(android.content.Context r6, p1050v2.C111319e.C111320a r7, android.content.res.Resources r8, int r9, int r10, p1050v2.C111325g.C111328d r11, android.os.Handler r12, boolean r13) {
        /*
            boolean r0 = r7 instanceof p1050v2.C111319e.C111322d
            r1 = -3
            if (r0 == 0) goto L_0x014c
            v2.e$d r7 = (p1050v2.C111319e.C111322d) r7
            java.lang.String r0 = r7.f333292d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r11 == 0) goto L_0x002f
            r11.mo163016b(r0, r12)
        L_0x002f:
            return r0
        L_0x0030:
            if (r13 == 0) goto L_0x0037
            int r0 = r7.f333291c
            if (r0 != 0) goto L_0x003a
            goto L_0x0039
        L_0x0037:
            if (r11 != 0) goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            r0 = -1
            if (r13 == 0) goto L_0x0040
            int r13 = r7.f333290b
            goto L_0x0041
        L_0x0040:
            r13 = -1
        L_0x0041:
            if (r12 != 0) goto L_0x004c
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r12.<init>(r4)
        L_0x004c:
            w2.d$a r4 = new w2.d$a
            r4.<init>(r11)
            b3.e r7 = r7.f333289a
            b3.c r11 = new b3.c
            r11.<init>(r4, r12)
            if (r3 == 0) goto L_0x00ce
            u.g<java.lang.String, android.graphics.Typeface> r3 = p1091b3.C113130j.f338524a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r7.f307666e
            r3.append(r5)
            java.lang.String r5 = "-"
            r3.append(r5)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            u.g<java.lang.String, android.graphics.Typeface> r5 = p1091b3.C113130j.f338524a
            java.lang.Object r5 = r5.get(r3)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            if (r5 == 0) goto L_0x0087
            b3.a r6 = new b3.a
            r6.<init>(r11, r4, r5)
            r12.post(r6)
            r2 = r5
            goto L_0x015f
        L_0x0087:
            if (r13 != r0) goto L_0x0094
            b3.j$a r6 = p1091b3.C113130j.m154795a(r3, r6, r7, r10)
            r11.mo165639a(r6)
            android.graphics.Typeface r2 = r6.f338528a
            goto L_0x015f
        L_0x0094:
            b3.f r12 = new b3.f
            r12.<init>(r3, r6, r7, r10)
            java.util.concurrent.ExecutorService r6 = p1091b3.C113130j.f338525b     // Catch:{ InterruptedException -> 0x00c0 }
            java.util.concurrent.Future r6 = r6.submit(r12)     // Catch:{ InterruptedException -> 0x00c0 }
            long r12 = (long) r13
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b9, InterruptedException -> 0x00b7, TimeoutException -> 0x00af }
            java.lang.Object r6 = r6.get(r12, r7)     // Catch:{ ExecutionException -> 0x00b9, InterruptedException -> 0x00b7, TimeoutException -> 0x00af }
            b3.j$a r6 = (p1091b3.C113130j.C113131a) r6     // Catch:{ InterruptedException -> 0x00c0 }
            r11.mo165639a(r6)     // Catch:{ InterruptedException -> 0x00c0 }
            android.graphics.Typeface r2 = r6.f338528a     // Catch:{ InterruptedException -> 0x00c0 }
            goto L_0x015f
        L_0x00af:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00c0 }
            java.lang.String r7 = "timeout"
            r6.<init>(r7)     // Catch:{ InterruptedException -> 0x00c0 }
            throw r6     // Catch:{ InterruptedException -> 0x00c0 }
        L_0x00b7:
            r6 = move-exception
            throw r6     // Catch:{ InterruptedException -> 0x00c0 }
        L_0x00b9:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00c0 }
            r7.<init>(r6)     // Catch:{ InterruptedException -> 0x00c0 }
            throw r7     // Catch:{ InterruptedException -> 0x00c0 }
        L_0x00c0:
            b3.m r6 = r11.f338511a
            android.os.Handler r7 = r11.f338512b
            b3.b r12 = new b3.b
            r12.<init>(r11, r6, r1)
            r7.post(r12)
            goto L_0x015f
        L_0x00ce:
            u.g<java.lang.String, android.graphics.Typeface> r13 = p1091b3.C113130j.f338524a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r7.f307666e
            r13.append(r0)
            java.lang.String r0 = "-"
            r13.append(r0)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            u.g<java.lang.String, android.graphics.Typeface> r0 = p1091b3.C113130j.f338524a
            java.lang.Object r0 = r0.get(r13)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00fa
            b3.a r6 = new b3.a
            r6.<init>(r11, r4, r0)
            r12.post(r6)
            r2 = r0
            goto L_0x015f
        L_0x00fa:
            b3.g r12 = new b3.g
            r12.<init>(r11)
            java.lang.Object r0 = p1091b3.C113130j.f338526c
            monitor-enter(r0)
            u.i<java.lang.String, java.util.ArrayList<d3.a<b3.j$a>>> r11 = p1091b3.C113130j.f338527d     // Catch:{ all -> 0x0149 }
            java.lang.Object r1 = r11.getOrDefault(r13, r2)     // Catch:{ all -> 0x0149 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0149 }
            if (r1 == 0) goto L_0x0111
            r1.add(r12)     // Catch:{ all -> 0x0149 }
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            goto L_0x015f
        L_0x0111:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0149 }
            r1.<init>()     // Catch:{ all -> 0x0149 }
            r1.add(r12)     // Catch:{ all -> 0x0149 }
            r11.put(r13, r1)     // Catch:{ all -> 0x0149 }
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            b3.h r11 = new b3.h
            r11.<init>(r13, r6, r7, r10)
            java.util.concurrent.ExecutorService r6 = p1091b3.C113130j.f338525b
            b3.i r7 = new b3.i
            r7.<init>(r13)
            android.os.Looper r12 = android.os.Looper.myLooper()
            if (r12 != 0) goto L_0x0139
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            goto L_0x013e
        L_0x0139:
            android.os.Handler r12 = new android.os.Handler
            r12.<init>()
        L_0x013e:
            b3.o r13 = new b3.o
            r13.<init>(r12, r11, r7)
            java.util.concurrent.ThreadPoolExecutor r6 = (java.util.concurrent.ThreadPoolExecutor) r6
            r6.execute(r13)
            goto L_0x015f
        L_0x0149:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            throw r6
        L_0x014c:
            w2.j r13 = f355219a
            v2.e$b r7 = (p1050v2.C111319e.C111321b) r7
            android.graphics.Typeface r2 = r13.mo183460a(r6, r7, r8, r10)
            if (r11 == 0) goto L_0x015f
            if (r2 == 0) goto L_0x015c
            r11.mo163016b(r2, r12)
            goto L_0x015f
        L_0x015c:
            r11.mo163015a(r1, r12)
        L_0x015f:
            if (r2 == 0) goto L_0x016a
            u.g<java.lang.String, android.graphics.Typeface> r6 = f355220b
            java.lang.String r7 = m167396b(r8, r9, r10)
            r6.put(r7, r2)
        L_0x016a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p1057w2.C118712d.m167395a(android.content.Context, v2.e$a, android.content.res.Resources, int, int, v2.g$d, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static String m167396b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
