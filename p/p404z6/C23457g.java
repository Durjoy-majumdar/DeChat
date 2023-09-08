package p404z6;

import java.lang.Exception;
import java.util.LinkedList;
import p333e8.C20528a;
import p383t7.C22440b;
import p383t7.C22441c;
import p383t7.C22447h;
import p404z6.C23455e;
import p404z6.C23456f;

/* renamed from: z6.g */
public abstract class C23457g<I extends C23455e, O extends C23456f, E extends Exception> implements C23454c<I, O, E> {

    /* renamed from: a */
    public final Thread f67264a;

    /* renamed from: b */
    public final Object f67265b = new Object();

    /* renamed from: c */
    public final LinkedList<I> f67266c = new LinkedList<>();

    /* renamed from: d */
    public final LinkedList<O> f67267d = new LinkedList<>();

    /* renamed from: e */
    public final I[] f67268e;

    /* renamed from: f */
    public final O[] f67269f;

    /* renamed from: g */
    public int f67270g;

    /* renamed from: h */
    public int f67271h;

    /* renamed from: i */
    public I f67272i;

    /* renamed from: j */
    public E f67273j;

    /* renamed from: k */
    public boolean f67274k;

    /* renamed from: l */
    public boolean f67275l;

    /* renamed from: z6.g$a */
    public class C23458a extends Thread {
        public C23458a() {
        }

        public void run() {
            C23457g gVar = C23457g.this;
            gVar.getClass();
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (gVar.mo36914d());
        }
    }

    public C23457g(I[] iArr, O[] oArr) {
        this.f67268e = iArr;
        this.f67270g = iArr.length;
        for (int i = 0; i < this.f67270g; i++) {
            this.f67268e[i] = new C22447h();
        }
        this.f67269f = oArr;
        this.f67271h = oArr.length;
        for (int i2 = 0; i2 < this.f67271h; i2++) {
            this.f67269f[i2] = new C22441c((C22440b) this);
        }
        C23458a aVar = new C23458a();
        this.f67264a = aVar;
        aVar.start();
    }

    /* renamed from: a */
    public Object mo35730a() {
        I i;
        synchronized (this.f67265b) {
            try {
                E e = this.f67273j;
                if (e == null) {
                    C20528a.m22240d(this.f67272i == null);
                    int i2 = this.f67270g;
                    if (i2 == 0) {
                        i = null;
                    } else {
                        I[] iArr = this.f67268e;
                        int i3 = i2 - 1;
                        this.f67270g = i3;
                        i = iArr[i3];
                    }
                    this.f67272i = i;
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    /* renamed from: c */
    public void mo35731c(Object obj) {
        I i = (C23455e) obj;
        synchronized (this.f67265b) {
            try {
                E e = this.f67273j;
                if (e == null) {
                    boolean z = true;
                    C20528a.m22237a(i == this.f67272i);
                    this.f67266c.addLast(i);
                    if (this.f67266c.isEmpty() || this.f67271h <= 0) {
                        z = false;
                    }
                    if (z) {
                        this.f67265b.notify();
                    }
                    this.f67272i = null;
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r1.mo36910g(4) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r4.f67251d = 4 | r4.f67251d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r1.mo36911h() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        r4.f67251d = Integer.MIN_VALUE | r4.f67251d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r0 = (p383t7.C22440b) r12;
        r6 = (p383t7.C22447h) r1;
        r7 = (p383t7.C22448i) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8 = r6.f67260f;
        r0 = r0.mo14895f(r8.array(), r8.limit(), r5);
        r8 = r6.f67261g;
        r5 = r6.f63570i;
        r7.f67263e = r8;
        r7.f63571f = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r5 != com.tencent.p014mm.sdk.platformtools.MAlarmHandler.NEXT_FIRE_INTERVAL) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r7.f63572g = r8;
        r7.f67251d &= Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r0 = e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36914d() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f67265b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r12.f67275l     // Catch:{ all -> 0x0017 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0023
            java.util.LinkedList<I> r1 = r12.f67266c     // Catch:{ all -> 0x0017 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x001a
            int r1 = r12.f67271h     // Catch:{ all -> 0x0017 }
            if (r1 <= 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x0017:
            r1 = move-exception
            goto L_0x00c8
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 != 0) goto L_0x0023
            java.lang.Object r1 = r12.f67265b     // Catch:{ all -> 0x0017 }
            r1.wait()     // Catch:{ all -> 0x0017 }
            goto L_0x0003
        L_0x0023:
            boolean r1 = r12.f67275l     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r2
        L_0x0029:
            java.util.LinkedList<I> r1 = r12.f67266c     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0017 }
            z6.e r1 = (p404z6.C23455e) r1     // Catch:{ all -> 0x0017 }
            O[] r4 = r12.f67269f     // Catch:{ all -> 0x0017 }
            int r5 = r12.f67271h     // Catch:{ all -> 0x0017 }
            int r5 = r5 - r3
            r12.f67271h = r5     // Catch:{ all -> 0x0017 }
            r4 = r4[r5]     // Catch:{ all -> 0x0017 }
            boolean r5 = r12.f67274k     // Catch:{ all -> 0x0017 }
            r12.f67274k = r2     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            r0 = 4
            boolean r6 = r1.mo36910g(r0)
            if (r6 == 0) goto L_0x004c
            int r2 = r4.f67251d
            r0 = r0 | r2
            r4.f67251d = r0
            goto L_0x009c
        L_0x004c:
            boolean r0 = r1.mo36911h()
            if (r0 == 0) goto L_0x0059
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = r4.f67251d
            r0 = r0 | r6
            r4.f67251d = r0
        L_0x0059:
            r0 = r12
            t7.b r0 = (p383t7.C22440b) r0
            r6 = r1
            t7.h r6 = (p383t7.C22447h) r6
            r7 = r4
            t7.i r7 = (p383t7.C22448i) r7
            java.nio.ByteBuffer r8 = r6.f67260f     // Catch:{ f -> 0x008f }
            byte[] r9 = r8.array()     // Catch:{ f -> 0x008f }
            int r8 = r8.limit()     // Catch:{ f -> 0x008f }
            t7.d r0 = r0.mo14895f(r9, r8, r5)     // Catch:{ f -> 0x008f }
            long r8 = r6.f67261g     // Catch:{ f -> 0x008f }
            long r5 = r6.f63570i     // Catch:{ f -> 0x008f }
            r7.f67263e = r8     // Catch:{ f -> 0x008f }
            r7.f63571f = r0     // Catch:{ f -> 0x008f }
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r8 = r5
        L_0x0083:
            r7.f63572g = r8     // Catch:{ f -> 0x008f }
            int r0 = r7.f67251d     // Catch:{ f -> 0x008f }
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r5
            r7.f67251d = r0     // Catch:{ f -> 0x008f }
            r0 = 0
            goto L_0x0090
        L_0x008f:
            r0 = move-exception
        L_0x0090:
            r12.f67273j = r0
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r12.f67265b
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            return r2
        L_0x0099:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            throw r1
        L_0x009c:
            java.lang.Object r2 = r12.f67265b
            monitor-enter(r2)
            boolean r0 = r12.f67274k     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00a7
            r12.mo36915e(r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x00b6
        L_0x00a7:
            boolean r0 = r4.mo36911h()     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00b1
            r12.mo36915e(r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x00b6
        L_0x00b1:
            java.util.LinkedList<O> r0 = r12.f67267d     // Catch:{ all -> 0x00c5 }
            r0.addLast(r4)     // Catch:{ all -> 0x00c5 }
        L_0x00b6:
            r1.mo35592f()     // Catch:{ all -> 0x00c5 }
            I[] r0 = r12.f67268e     // Catch:{ all -> 0x00c5 }
            int r4 = r12.f67270g     // Catch:{ all -> 0x00c5 }
            int r5 = r4 + 1
            r12.f67270g = r5     // Catch:{ all -> 0x00c5 }
            r0[r4] = r1     // Catch:{ all -> 0x00c5 }
            monitor-exit(r2)     // Catch:{ all -> 0x00c5 }
            return r3
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c5 }
            throw r0
        L_0x00c8:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p404z6.C23457g.mo36914d():boolean");
    }

    public Object dequeueOutputBuffer() {
        C23456f fVar;
        synchronized (this.f67265b) {
            try {
                E e = this.f67273j;
                if (e == null) {
                    fVar = this.f67267d.isEmpty() ? null : (C23456f) this.f67267d.removeFirst();
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* renamed from: e */
    public final void mo36915e(O o) {
        o.mo35592f();
        O[] oArr = this.f67269f;
        int i = this.f67271h;
        this.f67271h = i + 1;
        oArr[i] = o;
    }

    public final void flush() {
        synchronized (this.f67265b) {
            this.f67274k = true;
            I i = this.f67272i;
            if (i != null) {
                i.mo35592f();
                I[] iArr = this.f67268e;
                int i2 = this.f67270g;
                this.f67270g = i2 + 1;
                iArr[i2] = i;
                this.f67272i = null;
            }
            while (!this.f67266c.isEmpty()) {
                I i3 = (C23455e) this.f67266c.removeFirst();
                i3.mo35592f();
                I[] iArr2 = this.f67268e;
                int i4 = this.f67270g;
                this.f67270g = i4 + 1;
                iArr2[i4] = i3;
            }
            while (!this.f67267d.isEmpty()) {
                mo36915e((C23456f) this.f67267d.removeFirst());
            }
        }
    }

    public void release() {
        synchronized (this.f67265b) {
            this.f67275l = true;
            this.f67265b.notify();
        }
        try {
            this.f67264a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
