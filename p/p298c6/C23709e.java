package p298c6;

/* renamed from: c6.e */
public class C23709e {

    /* renamed from: c */
    public static final C23709e f67911c = new C23709e(C23710a.none, (C23711b) null);

    /* renamed from: d */
    public static final C23709e f67912d = new C23709e(C23710a.xMidYMid, C23711b.meet);

    /* renamed from: a */
    public C23710a f67913a;

    /* renamed from: b */
    public C23711b f67914b;

    /* renamed from: c6.e$a */
    public enum C23710a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    /* renamed from: c6.e$b */
    public enum C23711b {
        meet,
        slice
    }

    public C23709e(C23710a aVar, C23711b bVar) {
        this.f67913a = aVar;
        this.f67914b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23709e.class != obj.getClass()) {
            return false;
        }
        C23709e eVar = (C23709e) obj;
        return this.f67913a == eVar.f67913a && this.f67914b == eVar.f67914b;
    }

    public String toString() {
        return this.f67913a + " " + this.f67914b;
    }
}
