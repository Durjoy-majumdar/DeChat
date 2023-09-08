package h24;

import d24.C106984u;
import d24.C20399d0;
import o24.C21768j;

/* renamed from: h24.h */
public final class C20890h extends C20399d0 {

    /* renamed from: d */
    public final String f59028d;

    /* renamed from: e */
    public final long f59029e;

    /* renamed from: f */
    public final C21768j f59030f;

    public C20890h(String str, long j, C21768j jVar) {
        this.f59028d = str;
        this.f59029e = j;
        this.f59030f = jVar;
    }

    /* renamed from: a */
    public long mo31896a() {
        return this.f59029e;
    }

    /* renamed from: b */
    public C106984u mo31897b() {
        String str = this.f59028d;
        if (str == null) {
            return null;
        }
        try {
            return C106984u.m144738a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public C21768j mo31898c() {
        return this.f59030f;
    }
}
