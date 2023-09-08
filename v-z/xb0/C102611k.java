package xb0;

/* renamed from: xb0.k */
public class C102611k implements Comparable {

    /* renamed from: d */
    public int f302165d;

    /* renamed from: e */
    public int f302166e;

    /* renamed from: f */
    public int f302167f;

    /* renamed from: g */
    public int f302168g;

    /* renamed from: h */
    public int f302169h;

    /* renamed from: i */
    public int f302170i;

    /* renamed from: j */
    public int f302171j;

    public C102611k(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f302165d = i;
        this.f302166e = i2;
        this.f302167f = i3;
        this.f302168g = i4;
        this.f302169h = i5;
        this.f302170i = i6;
        this.f302171j = i7;
    }

    public int compareTo(Object obj) {
        if (obj != null && (obj instanceof C102611k)) {
            return this.f302165d - ((C102611k) obj).f302165d;
        }
        return 0;
    }
}
