package p1091b3;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p1042u.C111058g;
import p1042u.C111059i;
import p329d3.C86165a;

/* renamed from: b3.j */
public class C113130j {

    /* renamed from: a */
    public static final C111058g<String, Typeface> f338524a = new C111058g<>(16);

    /* renamed from: b */
    public static final ExecutorService f338525b;

    /* renamed from: c */
    public static final Object f338526c = new Object();

    /* renamed from: d */
    public static final C111059i<String, ArrayList<C86165a<C113131a>>> f338527d = new C111059i<>();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C113135n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f338525b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p1091b3.C113130j.C113131a m154795a(java.lang.String r7, android.content.Context r8, p1091b3.C104030e r9, int r10) {
        /*
            u.g<java.lang.String, android.graphics.Typeface> r0 = f338524a
            java.lang.Object r0 = r0.get(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            b3.j$a r7 = new b3.j$a
            r7.<init>((android.graphics.Typeface) r0)
            return r7
        L_0x0010:
            r0 = 0
            b3.k r9 = p1091b3.C113124d.m154794a(r8, r9, r0)     // Catch:{ NameNotFoundException -> 0x0061 }
            int r1 = r9.f338530a
            r2 = 1
            r3 = -3
            if (r1 == 0) goto L_0x0020
            if (r1 == r2) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            r1 = -2
            goto L_0x003e
        L_0x0020:
            b3.l[] r1 = r9.f338531b
            r4 = 0
            if (r1 == 0) goto L_0x003d
            int r5 = r1.length
            if (r5 != 0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            int r2 = r1.length
            r5 = 0
        L_0x002b:
            if (r5 >= r2) goto L_0x003c
            r6 = r1[r5]
            int r6 = r6.f338536e
            if (r6 == 0) goto L_0x0039
            if (r6 >= 0) goto L_0x0037
        L_0x0035:
            r1 = -3
            goto L_0x003e
        L_0x0037:
            r1 = r6
            goto L_0x003e
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x003c:
            r2 = 0
        L_0x003d:
            r1 = r2
        L_0x003e:
            if (r1 == 0) goto L_0x0046
            b3.j$a r7 = new b3.j$a
            r7.<init>((int) r1)
            return r7
        L_0x0046:
            b3.l[] r9 = r9.f338531b
            w2.j r1 = p1057w2.C118712d.f355219a
            android.graphics.Typeface r8 = r1.mo183461b(r8, r0, r9, r10)
            if (r8 == 0) goto L_0x005b
            u.g<java.lang.String, android.graphics.Typeface> r9 = f338524a
            r9.put(r7, r8)
            b3.j$a r7 = new b3.j$a
            r7.<init>((android.graphics.Typeface) r8)
            return r7
        L_0x005b:
            b3.j$a r7 = new b3.j$a
            r7.<init>((int) r3)
            return r7
        L_0x0061:
            b3.j$a r7 = new b3.j$a
            r8 = -1
            r7.<init>((int) r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p1091b3.C113130j.m154795a(java.lang.String, android.content.Context, b3.e, int):b3.j$a");
    }

    /* renamed from: b3.j$a */
    public static final class C113131a {

        /* renamed from: a */
        public final Typeface f338528a;

        /* renamed from: b */
        public final int f338529b;

        public C113131a(int i) {
            this.f338528a = null;
            this.f338529b = i;
        }

        public C113131a(Typeface typeface) {
            this.f338528a = typeface;
            this.f338529b = 0;
        }
    }
}
