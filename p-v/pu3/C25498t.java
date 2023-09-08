package pu3;

import pu3.C25499u;

/* renamed from: pu3.t */
public class C25498t extends C25499u.C25500a.C25501a<C25498t> {

    /* renamed from: e */
    public String f72153e;

    public C25498t(int i, String str) {
        super(i);
        this.f72153e = str;
    }

    public int compareTo(Object obj) {
        return this.f72153e.compareTo(((C25498t) obj).f72153e);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25498t) && this.f72153e.compareTo(((C25498t) obj).f72153e) == 0;
    }

    public int hashCode() {
        return this.f72153e.hashCode();
    }
}
