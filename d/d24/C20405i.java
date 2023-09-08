package d24;

import e24.C20509c;
import e24.C86420d;
import g24.C20783c;
import g24.C20784d;
import g24.C20788g;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l24.C117443g;

/* renamed from: d24.i */
public final class C20405i {

    /* renamed from: g */
    public static final Executor f57230g;

    /* renamed from: a */
    public final int f57231a = 5;

    /* renamed from: b */
    public final long f57232b;

    /* renamed from: c */
    public final Runnable f57233c = new C20406a();

    /* renamed from: d */
    public final Deque<C20783c> f57234d = new ArrayDeque();

    /* renamed from: e */
    public final C20784d f57235e = new C20784d();

    /* renamed from: f */
    public boolean f57236f;

    /* renamed from: d24.i$a */
    public class C20406a implements Runnable {
        public C20406a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r14 = this;
            L_0x0000:
                d24.i r0 = d24.C20405i.this
                long r1 = java.lang.System.nanoTime()
                monitor-enter(r0)
                java.util.Deque<g24.c> r3 = r0.f57234d     // Catch:{ all -> 0x0084 }
                java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch:{ all -> 0x0084 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0084 }
                r4 = 0
                r5 = -9223372036854775808
                r7 = 0
                r8 = 0
                r9 = 0
            L_0x0015:
                boolean r10 = r3.hasNext()     // Catch:{ all -> 0x0084 }
                if (r10 == 0) goto L_0x0037
                java.lang.Object r10 = r3.next()     // Catch:{ all -> 0x0084 }
                g24.c r10 = (g24.C20783c) r10     // Catch:{ all -> 0x0084 }
                int r11 = r0.mo31912a(r10, r1)     // Catch:{ all -> 0x0084 }
                if (r11 <= 0) goto L_0x002a
                int r9 = r9 + 1
                goto L_0x0015
            L_0x002a:
                int r8 = r8 + 1
                long r11 = r10.f58708o     // Catch:{ all -> 0x0084 }
                long r11 = r1 - r11
                int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r13 <= 0) goto L_0x0015
                r4 = r10
                r5 = r11
                goto L_0x0015
            L_0x0037:
                long r1 = r0.f57232b     // Catch:{ all -> 0x0084 }
                r10 = -1
                r12 = 0
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 >= 0) goto L_0x0054
                int r3 = r0.f57231a     // Catch:{ all -> 0x0084 }
                if (r8 <= r3) goto L_0x0046
                goto L_0x0054
            L_0x0046:
                if (r8 <= 0) goto L_0x004b
                long r1 = r1 - r5
                monitor-exit(r0)     // Catch:{ all -> 0x0084 }
                goto L_0x0062
            L_0x004b:
                if (r9 <= 0) goto L_0x004f
                monitor-exit(r0)     // Catch:{ all -> 0x0084 }
                goto L_0x0062
            L_0x004f:
                r0.f57236f = r7     // Catch:{ all -> 0x0084 }
                monitor-exit(r0)     // Catch:{ all -> 0x0084 }
                r1 = r10
                goto L_0x0062
            L_0x0054:
                java.util.Deque<g24.c> r1 = r0.f57234d     // Catch:{ all -> 0x0084 }
                java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0084 }
                r1.remove(r4)     // Catch:{ all -> 0x0084 }
                monitor-exit(r0)     // Catch:{ all -> 0x0084 }
                java.net.Socket r0 = r4.f58698e
                e24.C20509c.m22198d(r0)
                r1 = r12
            L_0x0062:
                int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r0 != 0) goto L_0x0067
                return
            L_0x0067:
                int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r0 <= 0) goto L_0x0000
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r1 / r3
                long r3 = r3 * r5
                long r1 = r1 - r3
                d24.i r0 = d24.C20405i.this
                monitor-enter(r0)
                d24.i r3 = d24.C20405i.this     // Catch:{ InterruptedException -> 0x007f }
                int r2 = (int) r1     // Catch:{ InterruptedException -> 0x007f }
                r3.wait(r5, r2)     // Catch:{ InterruptedException -> 0x007f }
                goto L_0x007f
            L_0x007d:
                r1 = move-exception
                goto L_0x0082
            L_0x007f:
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                goto L_0x0000
            L_0x0082:
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                throw r1
            L_0x0084:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0084 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d24.C20405i.C20406a.run():void");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = C20509c.f57729a;
        f57230g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new C86420d("OkHttp ConnectionPool", true));
    }

    public C20405i() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f57232b = timeUnit.toNanos(5);
    }

    /* renamed from: a */
    public final int mo31912a(C20783c cVar, long j) {
        List<Reference<C20788g>> list = cVar.f58707n;
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C117443g.f351507a.mo182135m("A connection to " + cVar.f58696c.f57199a.f57113a + " was leaked. Did you forget to close a response body?", ((C20788g.C20789a) reference).f58736a);
                arrayList.remove(i);
                cVar.f58704k = true;
                if (arrayList.isEmpty()) {
                    cVar.f58708o = j - this.f57232b;
                    return 0;
                }
            }
        }
    }
}
