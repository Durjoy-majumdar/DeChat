package wl2;

import gy3.C8480h;

/* renamed from: wl2.f */
public class C15517f implements C15518g {

    /* renamed from: a */
    public String f42059a;

    /* renamed from: b */
    public long f42060b;

    public C15517f(String str, long j) {
        this.f42059a = str;
        this.f42060b = j;
    }

    /* renamed from: c */
    public String mo14297c() {
        return this.f42059a;
    }

    public long getSession() {
        return this.f42060b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15517f(String str, long j, int i, C8480h hVar) {
        this(str, (i & 2) != 0 ? System.currentTimeMillis() : j);
    }
}
