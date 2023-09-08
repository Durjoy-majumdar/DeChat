package my3;

/* renamed from: my3.j */
public final class C61594j extends C61593h implements C61591g<Integer> {

    /* renamed from: g */
    public static final C61594j f175177g = new C61594j(1, 0);

    public C61594j(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C61594j) {
            if (!isEmpty() || !((C61594j) obj).isEmpty()) {
                C61594j jVar = (C61594j) obj;
                if (!(this.f175174d == jVar.f175174d && this.f175175e == jVar.f175175e)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f175174d * 31) + this.f175175e;
    }

    public boolean isEmpty() {
        return this.f175174d > this.f175175e;
    }

    /* renamed from: k */
    public boolean mo86532k(int i) {
        return this.f175174d <= i && i <= this.f175175e;
    }

    /* renamed from: l */
    public Integer mo59688g0() {
        return Integer.valueOf(this.f175175e);
    }

    /* renamed from: m */
    public Integer mo59687f0() {
        return Integer.valueOf(this.f175174d);
    }

    public String toString() {
        return this.f175174d + ".." + this.f175175e;
    }
}
