package hb2;

import eb0.C31543z5;

/* renamed from: hb2.s */
public final class C59836s {

    /* renamed from: a */
    public int f170839a;

    /* renamed from: b */
    public long f170840b = C31543z5.m39453c();

    /* renamed from: c */
    public int f170841c;

    /* renamed from: d */
    public int f170842d;

    /* renamed from: e */
    public int f170843e;

    public C59836s(int i) {
        this.f170839a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C59836s) && this.f170839a == ((C59836s) obj).f170839a;
    }

    public int hashCode() {
        return this.f170839a;
    }

    public String toString() {
        return "StatRecord(index=" + this.f170839a + ')';
    }
}
