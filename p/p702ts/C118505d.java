package p702ts;

/* renamed from: ts.d */
public class C118505d {

    /* renamed from: a */
    public double f354669a;

    /* renamed from: b */
    public double f354670b;

    /* renamed from: c */
    public int f354671c;

    /* renamed from: d */
    public int f354672d;

    /* renamed from: e */
    public String f354673e;

    /* renamed from: f */
    public Object f354674f;

    /* renamed from: g */
    public boolean f354675g;

    public C118505d(double d, double d2) {
        this(d, d2, false);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C118505d)) {
            return false;
        }
        return ((C118505d) obj).toString().equals(toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((int) (this.f354669a * 1000000.0d));
        String str = "";
        sb.append(str);
        sb.append((int) (this.f354670b * 1000000.0d));
        Object obj = this.f354674f;
        if (obj != null) {
            if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof String)) {
                str = this.f354674f + str;
            } else {
                str = obj.toString();
            }
        }
        sb.append(str);
        return sb.toString();
    }

    public C118505d(double d, double d2, boolean z) {
        this.f354674f = "";
        this.f354669a = d;
        this.f354670b = d2;
        this.f354675g = z;
    }

    public C118505d(double d, double d2, int i, Object obj, boolean z) {
        this.f354669a = d;
        this.f354670b = d2;
        this.f354674f = obj;
        this.f354671c = i;
        this.f354675g = z;
    }
}
