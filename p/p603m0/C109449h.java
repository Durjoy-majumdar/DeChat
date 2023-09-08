package p603m0;

import gy3.C87412m;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* renamed from: m0.h */
public final class C109449h<T> extends C109441a<T> {

    /* renamed from: f */
    public final C109447f<T> f327604f;

    /* renamed from: g */
    public int f327605g;

    /* renamed from: h */
    public C109452k<? extends T> f327606h;

    /* renamed from: i */
    public int f327607i = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109449h(C109447f<T> fVar, int i) {
        super(i, fVar.mo53207f());
        C87412m.m108594g(fVar, "builder");
        this.f327604f = fVar;
        this.f327605g = fVar.mo160660l();
        mo160681c();
    }

    /* renamed from: a */
    public final void mo160680a() {
        if (this.f327605g != this.f327604f.mo160660l()) {
            throw new ConcurrentModificationException();
        }
    }

    public void add(T t) {
        mo160680a();
        this.f327604f.add(this.f327585d, t);
        this.f327585d++;
        this.f327586e = this.f327604f.mo53207f();
        this.f327605g = this.f327604f.mo160660l();
        this.f327607i = -1;
        mo160681c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo160681c() {
        /*
            r7 = this;
            m0.f<T> r0 = r7.f327604f
            java.lang.Object[] r1 = r0.f327599i
            if (r1 != 0) goto L_0x000a
            r0 = 0
            r7.f327606h = r0
            return
        L_0x000a:
            int r0 = r0.mo53207f()
            int r0 = r0 + -1
            r0 = r0 & -32
            int r2 = r7.f327585d
            if (r2 <= r0) goto L_0x0017
            r2 = r0
        L_0x0017:
            m0.f<T> r3 = r7.f327604f
            int r3 = r3.f327597g
            int r3 = r3 / 5
            r4 = 1
            int r3 = r3 + r4
            m0.k<? extends T> r5 = r7.f327606h
            if (r5 != 0) goto L_0x002b
            m0.k r4 = new m0.k
            r4.<init>(r1, r2, r0, r3)
            r7.f327606h = r4
            goto L_0x004b
        L_0x002b:
            gy3.C87412m.m108591d(r5)
            r5.f327585d = r2
            r5.f327586e = r0
            r5.f327611f = r3
            java.lang.Object[] r6 = r5.f327612g
            int r6 = r6.length
            if (r6 >= r3) goto L_0x003d
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5.f327612g = r3
        L_0x003d:
            java.lang.Object[] r3 = r5.f327612g
            r6 = 0
            r3[r6] = r1
            if (r2 != r0) goto L_0x0045
            r6 = 1
        L_0x0045:
            r5.f327613h = r6
            int r2 = r2 - r6
            r5.mo160687c(r2, r4)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p603m0.C109449h.mo160681c():void");
    }

    public T next() {
        mo160680a();
        if (hasNext()) {
            int i = this.f327585d;
            this.f327607i = i;
            C109452k<? extends T> kVar = this.f327606h;
            if (kVar == null) {
                T[] tArr = this.f327604f.f327600j;
                this.f327585d = i + 1;
                return tArr[i];
            } else if (kVar.hasNext()) {
                this.f327585d++;
                return kVar.next();
            } else {
                T[] tArr2 = this.f327604f.f327600j;
                int i2 = this.f327585d;
                this.f327585d = i2 + 1;
                return tArr2[i2 - kVar.f327586e];
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public T previous() {
        mo160680a();
        if (hasPrevious()) {
            int i = this.f327585d;
            int i2 = i - 1;
            this.f327607i = i2;
            C109452k<? extends T> kVar = this.f327606h;
            if (kVar == null) {
                T[] tArr = this.f327604f.f327600j;
                this.f327585d = i2;
                return tArr[i2];
            }
            int i3 = kVar.f327586e;
            if (i > i3) {
                T[] tArr2 = this.f327604f.f327600j;
                this.f327585d = i2;
                return tArr2[i2 - i3];
            }
            this.f327585d = i2;
            return kVar.previous();
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        mo160680a();
        int i = this.f327607i;
        if (i != -1) {
            this.f327604f.mo53210i(i);
            int i2 = this.f327607i;
            if (i2 < this.f327585d) {
                this.f327585d = i2;
            }
            this.f327586e = this.f327604f.mo53207f();
            this.f327605g = this.f327604f.mo160660l();
            this.f327607i = -1;
            mo160681c();
            return;
        }
        throw new IllegalStateException();
    }

    public void set(T t) {
        mo160680a();
        int i = this.f327607i;
        if (i != -1) {
            this.f327604f.set(i, t);
            this.f327605g = this.f327604f.mo160660l();
            mo160681c();
            return;
        }
        throw new IllegalStateException();
    }
}
