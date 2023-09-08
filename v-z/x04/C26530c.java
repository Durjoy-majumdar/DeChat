package x04;

/* renamed from: x04.c */
public final class C26530c<V> {

    /* renamed from: f */
    public static final C26530c<Object> f73819f = new C26530c<>();

    /* renamed from: a */
    public final long f73820a;

    /* renamed from: b */
    public final V f73821b;

    /* renamed from: c */
    public final C26530c<V> f73822c;

    /* renamed from: d */
    public final C26530c<V> f73823d;

    /* renamed from: e */
    public final int f73824e;

    public C26530c() {
        this.f73824e = 0;
        this.f73820a = 0;
        this.f73821b = null;
        this.f73822c = null;
        this.f73823d = null;
    }

    /* renamed from: a */
    public V mo53485a(long j) {
        if (this.f73824e == 0) {
            return null;
        }
        long j2 = this.f73820a;
        return j < j2 ? this.f73822c.mo53485a(j - j2) : j > j2 ? this.f73823d.mo53485a(j - j2) : this.f73821b;
    }

    /* renamed from: b */
    public C26530c<V> mo53486b(long j, V v) {
        if (this.f73824e == 0) {
            return new C26530c(j, v, this, this);
        }
        long j2 = this.f73820a;
        if (j < j2) {
            return mo53487c(this.f73822c.mo53486b(j - j2, v), this.f73823d);
        }
        if (j > j2) {
            return mo53487c(this.f73822c, this.f73823d.mo53486b(j - j2, v));
        }
        if (v == this.f73821b) {
            return this;
        }
        return new C26530c(j, v, this.f73822c, this.f73823d);
    }

    /* renamed from: c */
    public final C26530c<V> mo53487c(C26530c<V> cVar, C26530c<V> cVar2) {
        C26530c<V> cVar3 = cVar;
        C26530c<V> cVar4 = cVar2;
        if (cVar3 == this.f73822c && cVar4 == this.f73823d) {
            return this;
        }
        long j = this.f73820a;
        V v = this.f73821b;
        int i = cVar3.f73824e;
        int i2 = cVar4.f73824e;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                C26530c<V> cVar5 = cVar3.f73822c;
                C26530c<V> cVar6 = cVar3.f73823d;
                if (cVar6.f73824e < cVar5.f73824e * 2) {
                    long j2 = cVar3.f73820a;
                    return new C26530c(j2 + j, cVar3.f73821b, cVar5, new C26530c(-j2, v, cVar6.mo53488d(cVar6.f73820a + j2), cVar2));
                }
                C26530c<V> cVar7 = cVar6.f73822c;
                C26530c<V> cVar8 = cVar6.f73823d;
                long j3 = cVar6.f73820a;
                long j4 = cVar3.f73820a + j3 + j;
                V v2 = cVar6.f73821b;
                C26530c cVar9 = new C26530c(-j3, cVar3.f73821b, cVar5, cVar7.mo53488d(cVar7.f73820a + j3));
                long j5 = cVar3.f73820a;
                long j6 = cVar6.f73820a;
                return new C26530c<>(j4, v2, cVar9, new C26530c((-j5) - j6, v, cVar8.mo53488d(cVar8.f73820a + j6 + j5), cVar2));
            } else if (i2 >= i * 5) {
                C26530c<V> cVar10 = cVar4.f73822c;
                C26530c<V> cVar11 = cVar4.f73823d;
                if (cVar10.f73824e < cVar11.f73824e * 2) {
                    long j7 = cVar4.f73820a;
                    C26530c<V> cVar12 = cVar;
                    return new C26530c<>(j7 + j, cVar4.f73821b, new C26530c(-j7, v, cVar12, cVar10.mo53488d(cVar10.f73820a + j7)), cVar11);
                }
                C26530c<V> cVar13 = cVar10.f73822c;
                C26530c<V> cVar14 = cVar10.f73823d;
                long j8 = cVar10.f73820a;
                long j9 = cVar4.f73820a;
                long j15 = j8 + j9 + j;
                V v3 = cVar10.f73821b;
                C26530c cVar15 = new C26530c((-j9) - j8, v, cVar, cVar13.mo53488d(cVar13.f73820a + j8 + j9));
                long j16 = cVar10.f73820a;
                return new C26530c<>(j15, v3, cVar15, new C26530c(-j16, cVar4.f73821b, cVar14.mo53488d(cVar14.f73820a + j16), cVar11));
            }
        }
        return new C26530c(j, v, cVar, cVar2);
    }

    /* renamed from: d */
    public final C26530c<V> mo53488d(long j) {
        if (this.f73824e == 0 || j == this.f73820a) {
            return this;
        }
        return new C26530c(j, this.f73821b, this.f73822c, this.f73823d);
    }

    public C26530c(long j, V v, C26530c<V> cVar, C26530c<V> cVar2) {
        this.f73820a = j;
        this.f73821b = v;
        this.f73822c = cVar;
        this.f73823d = cVar2;
        this.f73824e = cVar.f73824e + 1 + cVar2.f73824e;
    }
}
