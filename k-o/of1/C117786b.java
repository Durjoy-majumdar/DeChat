package of1;

/* renamed from: of1.b */
public class C117786b {

    /* renamed from: a */
    public int f352318a = 0;

    /* renamed from: b */
    public int f352319b = 0;

    /* renamed from: c */
    public int f352320c = 0;

    /* renamed from: d */
    public int f352321d = -1;

    static {
        new C117786b();
    }

    public Object clone() {
        C117786b bVar = new C117786b();
        bVar.f352318a = this.f352318a;
        bVar.f352319b = this.f352319b;
        bVar.f352320c = this.f352320c;
        bVar.f352321d = this.f352321d;
        return bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C117786b.class != obj.getClass()) {
            return false;
        }
        C117786b bVar = (C117786b) obj;
        return this.f352318a == bVar.f352318a && this.f352319b == bVar.f352319b && this.f352320c == bVar.f352320c && this.f352321d == bVar.f352321d;
    }

    public int hashCode() {
        return (((((this.f352318a * 31) + this.f352319b) * 31) + this.f352320c) * 31) + this.f352321d;
    }

    public String toString() {
        return "Line{itemCount=" + this.f352318a + ", totalWidth=" + this.f352319b + ", maxHeight=" + this.f352320c + ", maxHeightIndex=" + this.f352321d + '}';
    }
}
