package p370p7;

import android.media.MediaCodec;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.nio.ByteBuffer;
import p294b7.C16738b;
import p294b7.C16742f;
import p294b7.C16750m;
import p300c8.C16869a;
import p300c8.C16870b;
import p300c8.C16873k;
import p333e8.C20541m;
import p333e8.C20551y;
import p370p7.C21952p;
import p396x6.C23010j;
import p404z6.C23451b;
import p404z6.C23455e;

/* renamed from: p7.q */
public final class C21954q implements C16750m {

    /* renamed from: a */
    public final C16870b f62147a;

    /* renamed from: b */
    public final int f62148b;

    /* renamed from: c */
    public final C21952p f62149c = new C21952p();

    /* renamed from: d */
    public final C21952p.C21953a f62150d = new C21952p.C21953a();

    /* renamed from: e */
    public final C20541m f62151e = new C20541m(32);

    /* renamed from: f */
    public C21955a f62152f;

    /* renamed from: g */
    public C21955a f62153g;

    /* renamed from: h */
    public C21955a f62154h;

    /* renamed from: i */
    public Format f62155i;

    /* renamed from: j */
    public long f62156j;

    /* renamed from: k */
    public boolean f62157k;

    /* renamed from: l */
    public C21956b f62158l;

    /* renamed from: p7.q$a */
    public static final class C21955a {

        /* renamed from: a */
        public final long f62159a;

        /* renamed from: b */
        public final long f62160b;

        /* renamed from: c */
        public boolean f62161c;

        /* renamed from: d */
        public C16869a f62162d;

        /* renamed from: e */
        public C21955a f62163e;

        public C21955a(long j, int i) {
            this.f62159a = j;
            this.f62160b = j + ((long) i);
        }
    }

    /* renamed from: p7.q$b */
    public interface C21956b {
        /* renamed from: d */
        void mo35007d(Format format);
    }

    public C21954q(C16870b bVar) {
        this.f62147a = bVar;
        int i = ((C16873k) bVar).f45600b;
        this.f62148b = i;
        C21955a aVar = new C21955a(0, i);
        this.f62152f = aVar;
        this.f62153g = aVar;
        this.f62154h = aVar;
    }

    /* renamed from: a */
    public void mo17741a(Format format) {
        boolean z;
        if (format == null) {
            format = null;
        }
        C21952p pVar = this.f62149c;
        synchronized (pVar) {
            z = true;
            if (format == null) {
                pVar.f62141p = true;
            } else {
                pVar.f62141p = false;
                if (!C20551y.m22311a(format, pVar.f62142q)) {
                    pVar.f62142q = format;
                }
            }
            z = false;
        }
        C21956b bVar = this.f62158l;
        if (bVar != null && z) {
            bVar.mo35007d(format);
        }
    }

    /* renamed from: b */
    public void mo17742b(C20541m mVar, int i) {
        while (i > 0) {
            int j = mo35031j(i);
            C21955a aVar = this.f62154h;
            C16869a aVar2 = aVar.f62162d;
            mVar.mo32091b(aVar2.f45597a, ((int) (this.f62156j - aVar.f62159a)) + aVar2.f45598b, j);
            i -= j;
            long j2 = this.f62156j + ((long) j);
            this.f62156j = j2;
            C21955a aVar3 = this.f62154h;
            if (j2 == aVar3.f62160b) {
                this.f62154h = aVar3.f62163e;
            }
        }
    }

    /* renamed from: c */
    public int mo17743c(C16742f fVar, int i, boolean z) {
        int j = mo35031j(i);
        C21955a aVar = this.f62154h;
        C16869a aVar2 = aVar.f62162d;
        int c = ((C16738b) fVar).mo17735c(aVar2.f45597a, ((int) (this.f62156j - aVar.f62159a)) + aVar2.f45598b, j);
        if (c != -1) {
            long j2 = this.f62156j + ((long) c);
            this.f62156j = j2;
            C21955a aVar3 = this.f62154h;
            if (j2 == aVar3.f62160b) {
                this.f62154h = aVar3.f62163e;
            }
            return c;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public void mo17744d(long r9, int r11, int r12, int r13, p294b7.C16750m.C16751a r14) {
        /*
            r8 = this;
            boolean r0 = r8.f62157k
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            r0 = r11 & 1
            if (r0 == 0) goto L_0x005f
            p7.p r0 = r8.f62149c
            monitor-enter(r0)
            int r3 = r0.f62134i     // Catch:{ all -> 0x005c }
            if (r3 != 0) goto L_0x001c
            long r3 = r0.f62138m     // Catch:{ all -> 0x005c }
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0019
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            monitor-exit(r0)
            goto L_0x0056
        L_0x001c:
            long r3 = r0.f62138m     // Catch:{ all -> 0x005c }
            int r5 = r0.f62137l     // Catch:{ all -> 0x005c }
            long r5 = r0.mo35023d(r5)     // Catch:{ all -> 0x005c }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x005c }
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x002f
            monitor-exit(r0)
            r3 = 0
            goto L_0x0056
        L_0x002f:
            int r3 = r0.f62134i     // Catch:{ all -> 0x005c }
            int r4 = r3 + -1
            int r4 = r0.mo35024e(r4)     // Catch:{ all -> 0x005c }
        L_0x0037:
            int r5 = r0.f62137l     // Catch:{ all -> 0x005c }
            if (r3 <= r5) goto L_0x004e
            long[] r5 = r0.f62131f     // Catch:{ all -> 0x005c }
            r6 = r5[r4]     // Catch:{ all -> 0x005c }
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x004e
            int r3 = r3 + -1
            int r4 = r4 + -1
            r5 = -1
            if (r4 != r5) goto L_0x0037
            int r4 = r0.f62126a     // Catch:{ all -> 0x005c }
            int r4 = r4 - r2
            goto L_0x0037
        L_0x004e:
            int r4 = r0.f62135j     // Catch:{ all -> 0x005c }
            int r4 = r4 + r3
            r0.mo35021b(r4)     // Catch:{ all -> 0x005c }
            monitor-exit(r0)
            r3 = 1
        L_0x0056:
            if (r3 != 0) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            r8.f62157k = r1
            goto L_0x0060
        L_0x005c:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L_0x005f:
            return
        L_0x0060:
            r3 = 0
            long r9 = r9 + r3
            long r3 = r8.f62156j
            long r5 = (long) r12
            long r3 = r3 - r5
            long r5 = (long) r13
            long r3 = r3 - r5
            p7.p r13 = r8.f62149c
            monitor-enter(r13)
            boolean r0 = r13.f62140o     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x0079
            r0 = r11 & 1
            if (r0 != 0) goto L_0x0077
            monitor-exit(r13)
            goto L_0x0138
        L_0x0077:
            r13.f62140o = r1     // Catch:{ all -> 0x013c }
        L_0x0079:
            boolean r0 = r13.f62141p     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x007f
            r0 = 1
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            p333e8.C20528a.m22240d(r0)     // Catch:{ all -> 0x013c }
            monitor-enter(r13)     // Catch:{ all -> 0x013c }
            long r5 = r13.f62139n     // Catch:{ all -> 0x0139 }
            long r5 = java.lang.Math.max(r5, r9)     // Catch:{ all -> 0x0139 }
            r13.f62139n = r5     // Catch:{ all -> 0x0139 }
            monitor-exit(r13)     // Catch:{ all -> 0x013c }
            int r0 = r13.f62134i     // Catch:{ all -> 0x013c }
            int r0 = r13.mo35024e(r0)     // Catch:{ all -> 0x013c }
            long[] r5 = r13.f62131f     // Catch:{ all -> 0x013c }
            r5[r0] = r9     // Catch:{ all -> 0x013c }
            long[] r9 = r13.f62128c     // Catch:{ all -> 0x013c }
            r9[r0] = r3     // Catch:{ all -> 0x013c }
            int[] r10 = r13.f62129d     // Catch:{ all -> 0x013c }
            r10[r0] = r12     // Catch:{ all -> 0x013c }
            int[] r10 = r13.f62130e     // Catch:{ all -> 0x013c }
            r10[r0] = r11     // Catch:{ all -> 0x013c }
            b7.m$a[] r10 = r13.f62132g     // Catch:{ all -> 0x013c }
            r10[r0] = r14     // Catch:{ all -> 0x013c }
            com.google.android.exoplayer2.Format[] r10 = r13.f62133h     // Catch:{ all -> 0x013c }
            com.google.android.exoplayer2.Format r11 = r13.f62142q     // Catch:{ all -> 0x013c }
            r10[r0] = r11     // Catch:{ all -> 0x013c }
            int[] r10 = r13.f62127b     // Catch:{ all -> 0x013c }
            int r11 = r13.f62143r     // Catch:{ all -> 0x013c }
            r10[r0] = r11     // Catch:{ all -> 0x013c }
            int r10 = r13.f62134i     // Catch:{ all -> 0x013c }
            int r10 = r10 + r2
            r13.f62134i = r10     // Catch:{ all -> 0x013c }
            int r11 = r13.f62126a     // Catch:{ all -> 0x013c }
            if (r10 != r11) goto L_0x0137
            int r10 = r11 + 1000
            int[] r12 = new int[r10]     // Catch:{ all -> 0x013c }
            long[] r14 = new long[r10]     // Catch:{ all -> 0x013c }
            long[] r0 = new long[r10]     // Catch:{ all -> 0x013c }
            int[] r2 = new int[r10]     // Catch:{ all -> 0x013c }
            int[] r3 = new int[r10]     // Catch:{ all -> 0x013c }
            b7.m$a[] r4 = new p294b7.C16750m.C16751a[r10]     // Catch:{ all -> 0x013c }
            com.google.android.exoplayer2.Format[] r5 = new com.google.android.exoplayer2.Format[r10]     // Catch:{ all -> 0x013c }
            int r6 = r13.f62136k     // Catch:{ all -> 0x013c }
            int r11 = r11 - r6
            java.lang.System.arraycopy(r9, r6, r14, r1, r11)     // Catch:{ all -> 0x013c }
            long[] r9 = r13.f62131f     // Catch:{ all -> 0x013c }
            int r6 = r13.f62136k     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r9, r6, r0, r1, r11)     // Catch:{ all -> 0x013c }
            int[] r9 = r13.f62130e     // Catch:{ all -> 0x013c }
            int r6 = r13.f62136k     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r9, r6, r2, r1, r11)     // Catch:{ all -> 0x013c }
            int[] r9 = r13.f62129d     // Catch:{ all -> 0x013c }
            int r6 = r13.f62136k     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r9, r6, r3, r1, r11)     // Catch:{ all -> 0x013c }
            b7.m$a[] r9 = r13.f62132g     // Catch:{ all -> 0x013c }
            int r6 = r13.f62136k     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r9, r6, r4, r1, r11)     // Catch:{ all -> 0x013c }
            com.google.android.exoplayer2.Format[] r9 = r13.f62133h     // Catch:{ all -> 0x013c }
            int r6 = r13.f62136k     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r9, r6, r5, r1, r11)     // Catch:{ all -> 0x013c }
            int[] r9 = r13.f62127b     // Catch:{ all -> 0x013c }
            int r6 = r13.f62136k     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r9, r6, r12, r1, r11)     // Catch:{ all -> 0x013c }
            int r9 = r13.f62136k     // Catch:{ all -> 0x013c }
            long[] r6 = r13.f62128c     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r6, r1, r14, r11, r9)     // Catch:{ all -> 0x013c }
            long[] r6 = r13.f62131f     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r6, r1, r0, r11, r9)     // Catch:{ all -> 0x013c }
            int[] r6 = r13.f62130e     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r6, r1, r2, r11, r9)     // Catch:{ all -> 0x013c }
            int[] r6 = r13.f62129d     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r6, r1, r3, r11, r9)     // Catch:{ all -> 0x013c }
            b7.m$a[] r6 = r13.f62132g     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r6, r1, r4, r11, r9)     // Catch:{ all -> 0x013c }
            com.google.android.exoplayer2.Format[] r6 = r13.f62133h     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r6, r1, r5, r11, r9)     // Catch:{ all -> 0x013c }
            int[] r6 = r13.f62127b     // Catch:{ all -> 0x013c }
            java.lang.System.arraycopy(r6, r1, r12, r11, r9)     // Catch:{ all -> 0x013c }
            r13.f62128c = r14     // Catch:{ all -> 0x013c }
            r13.f62131f = r0     // Catch:{ all -> 0x013c }
            r13.f62130e = r2     // Catch:{ all -> 0x013c }
            r13.f62129d = r3     // Catch:{ all -> 0x013c }
            r13.f62132g = r4     // Catch:{ all -> 0x013c }
            r13.f62133h = r5     // Catch:{ all -> 0x013c }
            r13.f62127b = r12     // Catch:{ all -> 0x013c }
            r13.f62136k = r1     // Catch:{ all -> 0x013c }
            int r9 = r13.f62126a     // Catch:{ all -> 0x013c }
            r13.f62134i = r9     // Catch:{ all -> 0x013c }
            r13.f62126a = r10     // Catch:{ all -> 0x013c }
        L_0x0137:
            monitor-exit(r13)
        L_0x0138:
            return
        L_0x0139:
            r9 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x013c }
            throw r9     // Catch:{ all -> 0x013c }
        L_0x013c:
            r9 = move-exception
            monitor-exit(r13)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p370p7.C21954q.mo17744d(long, int, int, int, b7.m$a):void");
    }

    /* renamed from: e */
    public boolean mo35026e(long j, boolean z, boolean z2) {
        boolean z3;
        C21952p pVar = this.f62149c;
        synchronized (pVar) {
            int e = pVar.mo35024e(pVar.f62137l);
            z3 = false;
            if (pVar.mo35025f() && j >= pVar.f62131f[e]) {
                if (j <= pVar.f62139n || z2) {
                    int c = pVar.mo35022c(e, pVar.f62134i - pVar.f62137l, j, z);
                    if (c != -1) {
                        pVar.f62137l += c;
                        z3 = true;
                    }
                }
            }
        }
        return z3;
    }

    /* renamed from: f */
    public final void mo35027f(long j) {
        if (j != -1) {
            while (true) {
                C21955a aVar = this.f62152f;
                if (j >= aVar.f62160b) {
                    C16870b bVar = this.f62147a;
                    C16869a aVar2 = aVar.f62162d;
                    C16873k kVar = (C16873k) bVar;
                    synchronized (kVar) {
                        C16869a[] aVarArr = kVar.f45601c;
                        aVarArr[0] = aVar2;
                        kVar.mo17928a(aVarArr);
                    }
                    C21955a aVar3 = this.f62152f;
                    aVar3.f62162d = null;
                    C21955a aVar4 = aVar3.f62163e;
                    aVar3.f62163e = null;
                    this.f62152f = aVar4;
                } else if (this.f62153g.f62159a < aVar.f62159a) {
                    this.f62153g = aVar;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r13 = r6.f62137l;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35028g(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            p7.p r6 = r9.f62149c
            monitor-enter(r6)
            int r0 = r6.f62134i     // Catch:{ all -> 0x0037 }
            r7 = -1
            if (r0 == 0) goto L_0x0032
            long[] r1 = r6.f62131f     // Catch:{ all -> 0x0037 }
            int r2 = r6.f62136k     // Catch:{ all -> 0x0037 }
            r3 = r1[r2]     // Catch:{ all -> 0x0037 }
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0014
            goto L_0x0032
        L_0x0014:
            if (r13 == 0) goto L_0x001d
            int r13 = r6.f62137l     // Catch:{ all -> 0x0037 }
            if (r13 == r0) goto L_0x001d
            int r13 = r13 + 1
            goto L_0x001e
        L_0x001d:
            r13 = r0
        L_0x001e:
            r0 = r6
            r1 = r2
            r2 = r13
            r3 = r10
            r5 = r12
            int r10 = r0.mo35022c(r1, r2, r3, r5)     // Catch:{ all -> 0x0037 }
            r11 = -1
            if (r10 != r11) goto L_0x002c
            monitor-exit(r6)
            goto L_0x0033
        L_0x002c:
            long r7 = r6.mo35020a(r10)     // Catch:{ all -> 0x0037 }
            monitor-exit(r6)
            goto L_0x0033
        L_0x0032:
            monitor-exit(r6)
        L_0x0033:
            r9.mo35027f(r7)
            return
        L_0x0037:
            r10 = move-exception
            monitor-exit(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p370p7.C21954q.mo35028g(long, boolean, boolean):void");
    }

    /* renamed from: h */
    public void mo35029h() {
        long a;
        C21952p pVar = this.f62149c;
        synchronized (pVar) {
            int i = pVar.f62134i;
            a = i == 0 ? -1 : pVar.mo35020a(i);
        }
        mo35027f(a);
    }

    /* renamed from: i */
    public Format mo35030i() {
        Format format;
        C21952p pVar = this.f62149c;
        synchronized (pVar) {
            format = pVar.f62141p ? null : pVar.f62142q;
        }
        return format;
    }

    /* renamed from: j */
    public final int mo35031j(int i) {
        C16869a aVar;
        C21955a aVar2 = this.f62154h;
        if (!aVar2.f62161c) {
            C16873k kVar = (C16873k) this.f62147a;
            synchronized (kVar) {
                kVar.f45603e++;
                int i2 = kVar.f45604f;
                if (i2 > 0) {
                    C16869a[] aVarArr = kVar.f45605g;
                    int i3 = i2 - 1;
                    kVar.f45604f = i3;
                    aVar = aVarArr[i3];
                    aVarArr[i3] = null;
                } else {
                    aVar = new C16869a(new byte[kVar.f45600b], 0);
                }
            }
            C21955a aVar3 = new C21955a(this.f62154h.f62160b, this.f62148b);
            aVar2.f62162d = aVar;
            aVar2.f62163e = aVar3;
            aVar2.f62161c = true;
        }
        return Math.min(i, (int) (this.f62154h.f62160b - this.f62156j));
    }

    /* renamed from: k */
    public int mo35032k(C23010j jVar, C23455e eVar, boolean z, boolean z2, long j) {
        int i;
        int i2;
        char c;
        C23010j jVar2 = jVar;
        C23455e eVar2 = eVar;
        C21952p pVar = this.f62149c;
        Format format = this.f62155i;
        C21952p.C21953a aVar = this.f62150d;
        synchronized (pVar) {
            i2 = 1;
            if (pVar.mo35025f()) {
                int e = pVar.mo35024e(pVar.f62137l);
                if (!z) {
                    if (pVar.f62133h[e] == format) {
                        if (!(eVar2.f67260f == null && eVar2.f67262h == 0)) {
                            eVar2.f67261g = pVar.f62131f[e];
                            eVar2.f67251d = pVar.f62130e[e];
                            aVar.f62144a = pVar.f62129d[e];
                            aVar.f62145b = pVar.f62128c[e];
                            aVar.f62146c = pVar.f62132g[e];
                            pVar.f62137l++;
                            c = 65532;
                        }
                    }
                }
                jVar2.f66173a = pVar.f62133h[e];
                c = 65531;
            } else if (z2) {
                eVar2.f67251d = 4;
                c = 65532;
            } else {
                Format format2 = pVar.f62142q;
                if (format2 != null && (z || format2 != format)) {
                    jVar2.f66173a = format2;
                    c = 65531;
                }
            }
            c = 65533;
        }
        if (c == 65531) {
            this.f62155i = jVar2.f66173a;
            return -5;
        } else if (c != 65532) {
            if (c == 65533) {
                return -3;
            }
            throw new IllegalStateException();
        } else if (eVar2.mo36910g(4)) {
            return -4;
        } else {
            if (eVar2.f67261g < j) {
                eVar2.f67251d = Integer.MIN_VALUE | eVar2.f67251d;
            }
            if (eVar2.mo36910g(1073741824)) {
                C21952p.C21953a aVar2 = this.f62150d;
                long j2 = aVar2.f62145b;
                this.f62151e.mo32110u(1);
                mo35033l(j2, this.f62151e.f57809a, 1);
                long j3 = j2 + 1;
                byte b = this.f62151e.f57809a[0];
                boolean z3 = (b & 128) != 0;
                byte b2 = b & Byte.MAX_VALUE;
                C23451b bVar = eVar2.f67259e;
                if (bVar.f67252a == null) {
                    bVar.f67252a = new byte[16];
                }
                mo35033l(j3, bVar.f67252a, b2);
                long j4 = j3 + ((long) b2);
                if (z3) {
                    this.f62151e.mo32110u(2);
                    mo35033l(j4, this.f62151e.f57809a, 2);
                    j4 += 2;
                    i2 = this.f62151e.mo32108s();
                }
                C23451b bVar2 = eVar2.f67259e;
                int[] iArr = bVar2.f67253b;
                if (iArr == null || iArr.length < i2) {
                    iArr = new int[i2];
                }
                int[] iArr2 = bVar2.f67254c;
                if (iArr2 == null || iArr2.length < i2) {
                    iArr2 = new int[i2];
                }
                if (z3) {
                    int i3 = i2 * 6;
                    this.f62151e.mo32110u(i3);
                    mo35033l(j4, this.f62151e.f57809a, i3);
                    j4 += (long) i3;
                    this.f62151e.mo32113x(0);
                    for (i = 0; i < i2; i++) {
                        iArr[i] = this.f62151e.mo32108s();
                        iArr2[i] = this.f62151e.mo32106q();
                    }
                } else {
                    iArr[0] = 0;
                    iArr2[0] = aVar2.f62144a - ((int) (j4 - aVar2.f62145b));
                }
                C16750m.C16751a aVar3 = aVar2.f62146c;
                C23451b bVar3 = eVar2.f67259e;
                byte[] bArr = aVar3.f45267b;
                byte[] bArr2 = bVar3.f67252a;
                int i4 = aVar3.f45266a;
                int i5 = aVar3.f45268c;
                int i6 = aVar3.f45269d;
                bVar3.f67253b = iArr;
                bVar3.f67254c = iArr2;
                bVar3.f67252a = bArr2;
                int i7 = C20551y.f57835a;
                if (i7 >= 16) {
                    MediaCodec.CryptoInfo cryptoInfo = bVar3.f67255d;
                    cryptoInfo.numSubSamples = i2;
                    cryptoInfo.numBytesOfClearData = iArr;
                    cryptoInfo.numBytesOfEncryptedData = iArr2;
                    cryptoInfo.key = bArr;
                    cryptoInfo.iv = bArr2;
                    cryptoInfo.mode = i4;
                    if (i7 >= 24) {
                        C23451b.C23453b.m28005a(bVar3.f67256e, i5, i6);
                    }
                }
                long j5 = aVar2.f62145b;
                int i8 = (int) (j4 - j5);
                aVar2.f62145b = j5 + ((long) i8);
                aVar2.f62144a -= i8;
            }
            eVar2.mo36913j(this.f62150d.f62144a);
            C21952p.C21953a aVar4 = this.f62150d;
            long j6 = aVar4.f62145b;
            ByteBuffer byteBuffer = eVar2.f67260f;
            int i9 = aVar4.f62144a;
            while (true) {
                C21955a aVar5 = this.f62153g;
                if (j6 < aVar5.f62160b) {
                    break;
                }
                this.f62153g = aVar5.f62163e;
            }
            while (i9 > 0) {
                int min = Math.min(i9, (int) (this.f62153g.f62160b - j6));
                C21955a aVar6 = this.f62153g;
                C16869a aVar7 = aVar6.f62162d;
                byteBuffer.put(aVar7.f45597a, ((int) (j6 - aVar6.f62159a)) + aVar7.f45598b, min);
                i9 -= min;
                j6 += (long) min;
                C21955a aVar8 = this.f62153g;
                if (j6 == aVar8.f62160b) {
                    this.f62153g = aVar8.f62163e;
                }
            }
            return -4;
        }
    }

    /* renamed from: l */
    public final void mo35033l(long j, byte[] bArr, int i) {
        while (true) {
            C21955a aVar = this.f62153g;
            if (j < aVar.f62160b) {
                break;
            }
            this.f62153g = aVar.f62163e;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.f62153g.f62160b - j));
            C21955a aVar2 = this.f62153g;
            C16869a aVar3 = aVar2.f62162d;
            System.arraycopy(aVar3.f45597a, ((int) (j - aVar2.f62159a)) + aVar3.f45598b, bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            C21955a aVar4 = this.f62153g;
            if (j == aVar4.f62160b) {
                this.f62153g = aVar4.f62163e;
            }
        }
    }

    /* renamed from: m */
    public void mo35034m(boolean z) {
        C21952p pVar = this.f62149c;
        int i = 0;
        pVar.f62134i = 0;
        pVar.f62135j = 0;
        pVar.f62136k = 0;
        pVar.f62137l = 0;
        pVar.f62140o = true;
        pVar.f62138m = Long.MIN_VALUE;
        pVar.f62139n = Long.MIN_VALUE;
        if (z) {
            pVar.f62142q = null;
            pVar.f62141p = true;
        }
        C21955a aVar = this.f62152f;
        if (aVar.f62161c) {
            C21955a aVar2 = this.f62154h;
            int i2 = (aVar2.f62161c ? 1 : 0) + (((int) (aVar2.f62159a - aVar.f62159a)) / this.f62148b);
            C16869a[] aVarArr = new C16869a[i2];
            while (i < i2) {
                aVarArr[i] = aVar.f62162d;
                aVar.f62162d = null;
                C21955a aVar3 = aVar.f62163e;
                aVar.f62163e = null;
                i++;
                aVar = aVar3;
            }
            ((C16873k) this.f62147a).mo17928a(aVarArr);
        }
        C21955a aVar4 = new C21955a(0, this.f62148b);
        this.f62152f = aVar4;
        this.f62153g = aVar4;
        this.f62154h = aVar4;
        this.f62156j = 0;
        ((C16873k) this.f62147a).mo17929b();
    }

    /* renamed from: n */
    public void mo35035n() {
        C21952p pVar = this.f62149c;
        synchronized (pVar) {
            pVar.f62137l = 0;
        }
        this.f62153g = this.f62152f;
    }
}
