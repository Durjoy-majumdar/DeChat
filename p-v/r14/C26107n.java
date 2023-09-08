package r14;

/* renamed from: r14.n */
public enum C26107n {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');
    

    /* renamed from: d */
    public final byte f72992d;

    /* renamed from: e */
    public final byte f72993e;

    /* renamed from: f */
    public final char f72994f;

    /* renamed from: g */
    public final char f72995g;

    /* access modifiers changed from: public */
    C26107n(char c, char c2) {
        this.f72994f = c;
        this.f72995g = c2;
        byte b = 0;
        this.f72992d = c < '~' ? C26099f.f72957a[c] : 0;
        this.f72993e = c2 < '~' ? C26099f.f72957a[c2] : b;
    }
}
