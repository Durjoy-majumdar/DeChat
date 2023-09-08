package g34;

/* renamed from: g34.d */
public class C116913d implements Comparable<C116913d> {

    /* renamed from: d */
    public final String f350333d;

    /* renamed from: e */
    public final String f350334e;

    public C116913d(String str, String str2) {
        this.f350333d = str;
        this.f350334e = str2;
    }

    public int compareTo(Object obj) {
        C116913d dVar = (C116913d) obj;
        int compareTo = this.f350333d.compareTo(dVar.f350333d);
        return compareTo != 0 ? compareTo : this.f350334e.compareTo(dVar.f350334e);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C116913d)) {
            return false;
        }
        C116913d dVar = (C116913d) obj;
        return dVar.f350333d.equals(this.f350333d) && dVar.f350334e.equals(this.f350334e);
    }

    public int hashCode() {
        return this.f350333d.hashCode() + this.f350334e.hashCode();
    }
}
