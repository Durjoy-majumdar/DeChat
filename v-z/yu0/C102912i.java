package yu0;

/* renamed from: yu0.i */
public class C102912i implements Comparable<C102912i>, Cloneable {

    /* renamed from: d */
    public String f303759d;

    /* renamed from: e */
    public long f303760e = 0;

    /* renamed from: f */
    public long[] f303761f = new long[2];

    /* renamed from: g */
    public long f303762g = -1;

    /* renamed from: h */
    public long f303763h = -1;

    public Object clone() {
        C102912i iVar = new C102912i();
        iVar.f303759d = this.f303759d;
        iVar.f303760e = this.f303760e;
        iVar.f303762g = this.f303762g;
        iVar.f303763h = this.f303763h;
        return iVar;
    }

    public int compareTo(Object obj) {
        int i = (this.f303762g > ((C102912i) obj).f303762g ? 1 : (this.f303762g == ((C102912i) obj).f303762g ? 0 : -1));
        if (i < 0) {
            return 1;
        }
        return i > 0 ? -1 : 0;
    }
}
