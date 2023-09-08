package com.tencent.tmsqmsp.oaid2;

/* renamed from: com.tencent.tmsqmsp.oaid2.z */
public class C106945z {

    /* renamed from: a */
    public int f320121a;

    /* renamed from: b */
    public long f320122b = (System.currentTimeMillis() + 86400000);

    /* renamed from: c */
    public String f320123c;

    public C106945z(String str, int i) {
        this.f320123c = str;
        this.f320121a = i;
    }

    public String toString() {
        return "ValueData{value='" + this.f320123c + '\'' + ", code=" + this.f320121a + ", expired=" + this.f320122b + '}';
    }
}
