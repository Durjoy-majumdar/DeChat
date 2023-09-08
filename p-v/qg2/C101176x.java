package qg2;

import android.os.SystemClock;
import android.util.SparseArray;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import og2.C100337f;
import og2.C100338g;

/* renamed from: qg2.x */
public abstract class C101176x<T extends C100338g> implements C100337f {

    /* renamed from: a */
    public boolean f296149a = false;

    /* renamed from: b */
    public final int f296150b;

    /* renamed from: c */
    public final int f296151c;

    /* renamed from: d */
    public SparseArray<C101176x<T>.b> f296152d = new SparseArray<>();

    /* renamed from: e */
    public LinkedList<T> f296153e = new LinkedList<>();

    /* renamed from: f */
    public long f296154f = 0;

    /* renamed from: qg2.x$a */
    public class C101177a implements Runnable {
        public C101177a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0108  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x010e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                qg2.x r0 = qg2.C101176x.this
                boolean r1 = r0.f296149a
                java.lang.String r2 = "MicroMsg.RecordMsgBaseService"
                if (r1 == 0) goto L_0x001e
                long r3 = java.lang.System.currentTimeMillis()
                long r5 = r0.f296154f
                long r3 = r3 - r5
                r5 = 60000(0xea60, double:2.9644E-319)
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x001e
                java.lang.String r0 = "is working, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x0111
            L_0x001e:
                long r3 = java.lang.System.currentTimeMillis()
                r0.f296154f = r3
                java.util.LinkedList<T> r1 = r0.f296153e
                boolean r1 = r1.isEmpty()
                r3 = 0
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x00ae
                java.util.List r1 = r0.mo139222d()
                java.util.Iterator r1 = r1.iterator()
            L_0x0037:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x009a
                java.lang.Object r6 = r1.next()
                og2.g r6 = (og2.C100338g) r6
                android.util.SparseArray<qg2.x<T>$b> r7 = r0.f296152d
                int r8 = r6.getKey()
                java.lang.Object r7 = r7.get(r8)
                qg2.x$b r7 = (qg2.C101176x.C101178b) r7
                if (r7 == 0) goto L_0x006d
                int r8 = r7.f296157b
                if (r8 >= 0) goto L_0x0064
                long r8 = android.os.SystemClock.elapsedRealtime()
                long r10 = r7.f296156a
                long r8 = r8 - r10
                int r10 = r0.f296151c
                long r10 = (long) r10
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 >= 0) goto L_0x0064
                goto L_0x0037
            L_0x0064:
                int r8 = r7.f296157b
                if (r8 >= 0) goto L_0x007b
                int r8 = r0.f296150b
                r7.f296157b = r8
                goto L_0x007b
            L_0x006d:
                qg2.x$b r7 = new qg2.x$b
                r7.<init>(r0, r3)
                android.util.SparseArray<qg2.x<T>$b> r8 = r0.f296152d
                int r9 = r6.getKey()
                r8.put(r9, r7)
            L_0x007b:
                java.lang.Object[] r7 = new java.lang.Object[r5]
                int r8 = r6.getKey()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r7[r4] = r8
                java.lang.String r8 = "do add job from db, localId %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r8, r7)
                java.util.LinkedList<T> r7 = r0.f296153e
                boolean r7 = r7.contains(r6)
                if (r7 != 0) goto L_0x0037
                java.util.LinkedList<T> r7 = r0.f296153e
                r7.add(r6)
                goto L_0x0037
            L_0x009a:
                java.lang.Object[] r1 = new java.lang.Object[r5]
                java.util.LinkedList<T> r6 = r0.f296153e
                int r6 = r6.size()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r1[r4] = r6
                java.lang.String r6 = "jobs list size is 0, new jobs list size[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r1)
            L_0x00ae:
                java.util.LinkedList<T> r1 = r0.f296153e
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x00c0
                java.lang.String r1 = "try to do job, but job list size is empty, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                r0.mo140621c()
                goto L_0x0111
            L_0x00c0:
                java.util.LinkedList<T> r1 = r0.f296153e
                java.lang.Object r1 = r1.removeFirst()
                og2.g r1 = (og2.C100338g) r1
                android.util.SparseArray<qg2.x<T>$b> r2 = r0.f296152d
                int r6 = r1.getKey()
                java.lang.Object r2 = r2.get(r6)
                qg2.x$b r2 = (qg2.C101176x.C101178b) r2
                if (r2 != 0) goto L_0x00e4
                qg2.x$b r2 = new qg2.x$b
                r2.<init>(r0, r3)
                android.util.SparseArray<qg2.x<T>$b> r3 = r0.f296152d
                int r6 = r1.getKey()
                r3.put(r6, r2)
            L_0x00e4:
                int r3 = r2.f296157b
                int r3 = r3 - r5
                r2.f296157b = r3
                if (r3 >= 0) goto L_0x00ff
                int r3 = r0.f296151c
                long r6 = (long) r3
                long r8 = android.os.SystemClock.elapsedRealtime()
                long r10 = r2.f296156a
                long r8 = r8 - r10
                int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r3 <= 0) goto L_0x00fa
                goto L_0x0106
            L_0x00fa:
                int r3 = r0.f296150b
                int r3 = r3 - r5
                r2.f296157b = r3
            L_0x00ff:
                long r3 = android.os.SystemClock.elapsedRealtime()
                r2.f296156a = r3
                r4 = 1
            L_0x0106:
                if (r4 == 0) goto L_0x010e
                r0.f296149a = r5
                r0.mo139221b(r1)
                goto L_0x0111
            L_0x010e:
                r0.mo140623f()
            L_0x0111:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg2.C101176x.C101177a.run():void");
        }

        public String toString() {
            return super.toString() + "|tryDoJob";
        }
    }

    /* renamed from: qg2.x$b */
    public final class C101178b {

        /* renamed from: a */
        public long f296156a = SystemClock.elapsedRealtime();

        /* renamed from: b */
        public int f296157b;

        public C101178b(C101176x xVar, C101177a aVar) {
            this.f296157b = xVar.f296150b;
        }
    }

    public C101176x(int i, int i2) {
        this.f296150b = i <= 0 ? 3 : i;
        this.f296151c = i2 <= 0 ? 300000 : i2;
    }

    /* renamed from: c */
    public final void mo140621c() {
        this.f296153e.clear();
        this.f296152d.clear();
        this.f296149a = false;
    }

    /* renamed from: d */
    public abstract List<T> mo139222d();

    /* renamed from: e */
    public void mo140622e() {
        this.f296149a = false;
        mo140623f();
    }

    /* renamed from: f */
    public void mo140623f() {
        C86709a0.m107525e().postToWorker(new C101177a());
    }
}
