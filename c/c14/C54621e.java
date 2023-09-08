package c14;

import f14.C58887j0;
import f14.C58891n;
import f14.C58903u;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import rx3.C13598b0;
import sx3.C110821n;

/* renamed from: c14.e */
public class C54621e<E> extends C54602a<E> {

    /* renamed from: g */
    public final int f153140g;

    /* renamed from: h */
    public final C54624g f153141h;

    /* renamed from: i */
    public final ReentrantLock f153142i;

    /* renamed from: j */
    public Object[] f153143j;

    /* renamed from: n */
    public int f153144n;
    private volatile /* synthetic */ int size;

    public C54621e(int i, C54624g gVar, C32226l<? super E, C13598b0> lVar) {
        super(lVar);
        this.f153140g = i;
        this.f153141h = gVar;
        if (i < 1 ? false : true) {
            this.f153142i = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C110821n.m150969p(objArr, C54611b.f153120a, 0, 0, 6, (Object) null);
            this.f153143j = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: B */
    public Object mo75510B() {
        ReentrantLock reentrantLock = this.f153142i;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object j = mo75544j();
                if (j == null) {
                    j = C54611b.f153123d;
                }
                return j;
            }
            Object[] objArr = this.f153143j;
            int i2 = this.f153144n;
            Object obj = objArr[i2];
            C54610a0 a0Var = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C54611b.f153123d;
            boolean z = false;
            if (i == this.f153140g) {
                C54610a0 a0Var2 = null;
                while (true) {
                    C54610a0 s = mo75549s();
                    if (s == null) {
                        a0Var = a0Var2;
                        break;
                    } else if (s.mo75533w((C58891n.C58893b) null) != null) {
                        obj2 = s.mo75531u();
                        a0Var = s;
                        z = true;
                        break;
                    } else {
                        s.mo75534x();
                        a0Var2 = s;
                    }
                }
            }
            if (obj2 != C54611b.f153123d && !(obj2 instanceof C54634n)) {
                this.size = i;
                Object[] objArr2 = this.f153143j;
                objArr2[(this.f153144n + i) % objArr2.length] = obj2;
            }
            this.f153144n = (this.f153144n + 1) % this.f153143j.length;
            C13598b0 b0Var = C13598b0.f38549a;
            reentrantLock.unlock();
            if (z) {
                C87412m.m108591d(a0Var);
                a0Var.mo75530t();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: D */
    public final void mo75559D(int i, E e) {
        int i2 = this.f153140g;
        if (i < i2) {
            Object[] objArr = this.f153143j;
            if (i >= objArr.length) {
                int min = Math.min(objArr.length * 2, i2);
                Object[] objArr2 = new Object[min];
                for (int i3 = 0; i3 < i; i3++) {
                    Object[] objArr3 = this.f153143j;
                    objArr2[i3] = objArr3[(this.f153144n + i3) % objArr3.length];
                }
                Arrays.fill(objArr2, i, min, C54611b.f153120a);
                this.f153143j = objArr2;
                this.f153144n = 0;
            }
            Object[] objArr4 = this.f153143j;
            objArr4[(this.f153144n + i) % objArr4.length] = e;
            return;
        }
        Object[] objArr5 = this.f153143j;
        int i4 = this.f153144n;
        objArr5[i4 % objArr5.length] = null;
        objArr5[(i + i4) % objArr5.length] = e;
        this.f153144n = (i4 + 1) % objArr5.length;
    }

    /* renamed from: c */
    public Object mo75541c(C54610a0 a0Var) {
        ReentrantLock reentrantLock = this.f153142i;
        reentrantLock.lock();
        try {
            return super.mo75541c(a0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public String mo75542d() {
        return "(buffer:capacity=" + this.f153140g + ",size=" + this.size + ')';
    }

    /* renamed from: l */
    public final boolean mo75546l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo75516m() {
        ReentrantLock reentrantLock = this.f153142i;
        reentrantLock.lock();
        try {
            return super.mo75516m();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: n */
    public final boolean mo75547n() {
        return this.size == this.f153140g && this.f153141h == C54624g.SUSPEND;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo75548q(E r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.f153142i
            r0.lock()
            int r1 = r5.size     // Catch:{ all -> 0x006d }
            c14.n r2 = r5.mo75544j()     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0011
            r0.unlock()
            return r2
        L_0x0011:
            int r2 = r5.f153140g     // Catch:{ all -> 0x006d }
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L_0x001c
            int r2 = r1 + 1
            r5.size = r2     // Catch:{ all -> 0x006d }
            goto L_0x0032
        L_0x001c:
            c14.g r2 = r5.f153141h     // Catch:{ all -> 0x006d }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0034
            if (r2 == r3) goto L_0x0032
            r3 = 2
            if (r2 != r3) goto L_0x002c
            f14.c0 r2 = c14.C54611b.f153121b     // Catch:{ all -> 0x006d }
            goto L_0x0036
        L_0x002c:
            rx3.j r6 = new rx3.j     // Catch:{ all -> 0x006d }
            r6.<init>()     // Catch:{ all -> 0x006d }
            throw r6     // Catch:{ all -> 0x006d }
        L_0x0032:
            r2 = r4
            goto L_0x0036
        L_0x0034:
            f14.c0 r2 = c14.C54611b.f153122c     // Catch:{ all -> 0x006d }
        L_0x0036:
            if (r2 == 0) goto L_0x003c
            r0.unlock()
            return r2
        L_0x003c:
            if (r1 != 0) goto L_0x0064
        L_0x003e:
            c14.y r2 = r5.mo75517r()     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x0045
            goto L_0x0064
        L_0x0045:
            boolean r3 = r2 instanceof c14.C54634n     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x004f
            r5.size = r1     // Catch:{ all -> 0x006d }
            r0.unlock()
            return r2
        L_0x004f:
            f14.c0 r3 = r2.mo75525d(r6, r4)     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x003e
            r5.size = r1     // Catch:{ all -> 0x006d }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x006d }
            r0.unlock()
            r2.mo75526f(r6)
            java.lang.Object r6 = r2.mo75566c()
            return r6
        L_0x0064:
            r5.mo75559D(r1, r6)     // Catch:{ all -> 0x006d }
            f14.c0 r6 = c14.C54611b.f153121b     // Catch:{ all -> 0x006d }
            r0.unlock()
            return r6
        L_0x006d:
            r6 = move-exception
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c14.C54621e.mo75548q(java.lang.Object):java.lang.Object");
    }

    /* renamed from: v */
    public boolean mo75519v(C54648w<? super E> wVar) {
        ReentrantLock reentrantLock = this.f153142i;
        reentrantLock.lock();
        try {
            return super.mo75519v(wVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: x */
    public final boolean mo75520x() {
        return false;
    }

    /* renamed from: y */
    public final boolean mo75521y() {
        return this.size == 0;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: z */
    public void mo75522z(boolean z) {
        C32226l<E, C13598b0> lVar = this.f153127d;
        ReentrantLock reentrantLock = this.f153142i;
        reentrantLock.lock();
        try {
            int i = this.size;
            C58887j0 j0Var = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f153143j[this.f153144n];
                if (!(lVar == null || obj == C54611b.f153120a)) {
                    j0Var = C58903u.m68763a(lVar, obj, j0Var);
                }
                Object[] objArr = this.f153143j;
                int i3 = this.f153144n;
                objArr[i3] = C54611b.f153120a;
                this.f153144n = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            C13598b0 b0Var = C13598b0.f38549a;
            reentrantLock.unlock();
            super.mo75522z(z);
            if (j0Var != null) {
                throw j0Var;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
