package j24;

import e24.C20508b;
import j24.C21164g;

/* renamed from: j24.n */
public class C21179n extends C20508b {

    /* renamed from: e */
    public final /* synthetic */ boolean f59910e;

    /* renamed from: f */
    public final /* synthetic */ C21193u f59911f;

    /* renamed from: g */
    public final /* synthetic */ C21164g.C21172g f59912g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21179n(C21164g.C21172g gVar, String str, Object[] objArr, boolean z, C21193u uVar) {
        super(str, objArr);
        this.f59912g = gVar;
        this.f59910e = z;
        this.f59911f = uVar;
    }

    /* JADX WARNING: type inference failed for: r5v14, types: [java.lang.Object[]] */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|d|30|31|32|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x008e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31966a() {
        /*
            r14 = this;
            j24.g$g r0 = r14.f59912g
            boolean r1 = r14.f59910e
            j24.u r2 = r14.f59911f
            j24.g r3 = j24.C21164g.this
            j24.r r3 = r3.f59852A
            monitor-enter(r3)
            j24.g r4 = j24.C21164g.this     // Catch:{ all -> 0x00c9 }
            monitor-enter(r4)     // Catch:{ all -> 0x00c9 }
            j24.g r5 = j24.C21164g.this     // Catch:{ all -> 0x0047 }
            j24.u r5 = r5.f59873y     // Catch:{ all -> 0x0047 }
            int r5 = r5.mo33163a()     // Catch:{ all -> 0x0047 }
            r6 = 0
            if (r1 == 0) goto L_0x0024
            j24.g r1 = j24.C21164g.this     // Catch:{ all -> 0x0047 }
            j24.u r1 = r1.f59873y     // Catch:{ all -> 0x0047 }
            r1.f59962a = r6     // Catch:{ all -> 0x0047 }
            int[] r1 = r1.f59963b     // Catch:{ all -> 0x0047 }
            java.util.Arrays.fill(r1, r6)     // Catch:{ all -> 0x0047 }
        L_0x0024:
            j24.g r1 = j24.C21164g.this     // Catch:{ all -> 0x0047 }
            j24.u r1 = r1.f59873y     // Catch:{ all -> 0x0047 }
            r1.getClass()     // Catch:{ all -> 0x0047 }
            r7 = 0
        L_0x002c:
            r8 = 10
            r9 = 1
            if (r7 >= r8) goto L_0x004a
            int r8 = r9 << r7
            int r10 = r2.f59962a     // Catch:{ all -> 0x0047 }
            r8 = r8 & r10
            if (r8 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r9 = 0
        L_0x003a:
            if (r9 != 0) goto L_0x003d
            goto L_0x0044
        L_0x003d:
            int[] r8 = r2.f59963b     // Catch:{ all -> 0x0047 }
            r8 = r8[r7]     // Catch:{ all -> 0x0047 }
            r1.mo33164b(r7, r8)     // Catch:{ all -> 0x0047 }
        L_0x0044:
            int r7 = r7 + 1
            goto L_0x002c
        L_0x0047:
            r0 = move-exception
            goto L_0x00c7
        L_0x004a:
            j24.g r1 = j24.C21164g.this     // Catch:{ all -> 0x0047 }
            j24.u r1 = r1.f59873y     // Catch:{ all -> 0x0047 }
            int r1 = r1.mo33163a()     // Catch:{ all -> 0x0047 }
            r2 = -1
            r7 = 0
            r10 = 0
            if (r1 == r2) goto L_0x0082
            if (r1 == r5) goto L_0x0082
            int r1 = r1 - r5
            long r1 = (long) r1     // Catch:{ all -> 0x0047 }
            j24.g r5 = j24.C21164g.this     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.Integer, j24.q> r5 = r5.f59857f     // Catch:{ all -> 0x0047 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0047 }
            if (r5 != 0) goto L_0x0083
            j24.g r5 = j24.C21164g.this     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.Integer, j24.q> r5 = r5.f59857f     // Catch:{ all -> 0x0047 }
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5     // Catch:{ all -> 0x0047 }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x0047 }
            j24.g r7 = j24.C21164g.this     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.Integer, j24.q> r7 = r7.f59857f     // Catch:{ all -> 0x0047 }
            int r7 = r7.size()     // Catch:{ all -> 0x0047 }
            j24.q[] r7 = new j24.C21184q[r7]     // Catch:{ all -> 0x0047 }
            java.lang.Object[] r5 = r5.toArray(r7)     // Catch:{ all -> 0x0047 }
            r7 = r5
            j24.q[] r7 = (j24.C21184q[]) r7     // Catch:{ all -> 0x0047 }
            goto L_0x0083
        L_0x0082:
            r1 = r10
        L_0x0083:
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            j24.g r4 = j24.C21164g.this     // Catch:{ IOException -> 0x008e }
            j24.r r5 = r4.f59852A     // Catch:{ IOException -> 0x008e }
            j24.u r4 = r4.f59873y     // Catch:{ IOException -> 0x008e }
            r5.mo33153a(r4)     // Catch:{ IOException -> 0x008e }
            goto L_0x0093
        L_0x008e:
            j24.g r4 = j24.C21164g.this     // Catch:{ all -> 0x00c9 }
            r4.mo33124b()     // Catch:{ all -> 0x00c9 }
        L_0x0093:
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            if (r7 == 0) goto L_0x00b0
            int r3 = r7.length
            r4 = 0
        L_0x0098:
            if (r4 >= r3) goto L_0x00b0
            r5 = r7[r4]
            monitor-enter(r5)
            long r12 = r5.f59926b     // Catch:{ all -> 0x00ad }
            long r12 = r12 + r1
            r5.f59926b = r12     // Catch:{ all -> 0x00ad }
            int r8 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a9
            r5.notifyAll()     // Catch:{ all -> 0x00ad }
        L_0x00a9:
            monitor-exit(r5)     // Catch:{ all -> 0x00ad }
            int r4 = r4 + 1
            goto L_0x0098
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ad }
            throw r0
        L_0x00b0:
            java.util.concurrent.ExecutorService r1 = j24.C21164g.f59851D
            j24.o r2 = new j24.o
            java.lang.String r3 = "OkHttp %s settings"
            java.lang.Object[] r4 = new java.lang.Object[r9]
            j24.g r5 = j24.C21164g.this
            java.lang.String r5 = r5.f59858g
            r4[r6] = r5
            r2.<init>(r0, r3, r4)
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
            r1.execute(r2)
            return
        L_0x00c7:
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j24.C21179n.mo31966a():void");
    }
}
