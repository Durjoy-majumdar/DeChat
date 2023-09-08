package cf0;

/* renamed from: cf0.i */
public class C80030i<T> implements Comparable<C80030i<T>> {

    /* renamed from: d */
    public long f234464d;

    /* renamed from: e */
    public final long f234465e;

    /* renamed from: f */
    public final T f234466f;

    /* renamed from: g */
    public boolean f234467g;

    public C80030i(long j, long j2, T t) {
        this.f234464d = j;
        this.f234465e = j2;
        this.f234466f = t;
    }

    public int compareTo(Object obj) {
        int i = (this.f234464d > ((C80030i) obj).f234464d ? 1 : (this.f234464d == ((C80030i) obj).f234464d ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C80030i.class != obj.getClass()) {
            return false;
        }
        C80030i iVar = (C80030i) obj;
        if (this.f234465e != iVar.f234465e) {
            return false;
        }
        T t = this.f234466f;
        if (t == null) {
            if (iVar.f234466f != null) {
                return false;
            }
        } else if (!t.equals(iVar.f234466f)) {
            return false;
        }
        return this.f234464d == iVar.f234464d;
    }

    public int hashCode() {
        long j = this.f234465e;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.f234466f;
        int hashCode = t == null ? 0 : t.hashCode();
        long j2 = this.f234464d;
        return ((i + hashCode) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "offset " + this.f234464d + ", length " + this.f234465e + ", metadata " + this.f234466f + ", isDeflateCompressed " + this.f234467g;
    }

    public C80030i(long j, long j2, T t, boolean z) {
        this.f234464d = j;
        this.f234465e = j2;
        this.f234466f = t;
        this.f234467g = z;
    }
}
