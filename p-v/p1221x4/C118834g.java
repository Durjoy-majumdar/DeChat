package p1221x4;

/* renamed from: x4.g */
public class C118834g {

    /* renamed from: a */
    public final String f355529a;

    /* renamed from: b */
    public final int f355530b;

    public C118834g(String str, int i) {
        this.f355529a = str;
        this.f355530b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C118834g)) {
            return false;
        }
        C118834g gVar = (C118834g) obj;
        if (this.f355530b != gVar.f355530b) {
            return false;
        }
        return this.f355529a.equals(gVar.f355529a);
    }

    public int hashCode() {
        return (this.f355529a.hashCode() * 31) + this.f355530b;
    }
}
