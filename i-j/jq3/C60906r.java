package jq3;

import java.util.LinkedList;

/* renamed from: jq3.r */
public final class C60906r {

    /* renamed from: a */
    public final int f173505a;

    /* renamed from: b */
    public int f173506b = -1;

    /* renamed from: c */
    public int f173507c = -1;

    /* renamed from: d */
    public int f173508d = -1;

    /* renamed from: e */
    public int f173509e = -1;

    /* renamed from: f */
    public LinkedList<C33631s> f173510f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C33631s> f173511g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C33631s> f173512h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C33631s> f173513i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<C33631s> f173514j = new LinkedList<>();

    public C60906r(int i) {
        this.f173505a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C60906r) && this.f173505a == ((C60906r) obj).f173505a;
    }

    public int hashCode() {
        return this.f173505a;
    }

    public String toString() {
        return "WxRVData(state=" + this.f173505a + ')';
    }
}
