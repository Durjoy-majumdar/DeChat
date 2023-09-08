package s60;

import gy3.C87412m;
import o60.C100293g;

/* renamed from: s60.b */
public abstract class C101536b<RESOURCE> implements C100293g<RESOURCE, RESOURCE> {

    /* renamed from: a */
    public C101536b<?> f297265a;

    /* renamed from: b */
    public C101537a f297266b = C101537a.NORMAL;

    /* renamed from: c */
    public C101538b f297267c = C101538b.LOADED;

    /* renamed from: s60.b$a */
    public enum C101537a {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: s60.b$b */
    public enum C101538b {
        LOADED,
        DECODED,
        DOWNLOADED
    }

    /* renamed from: c */
    public final C101536b<?> mo141015c(C101536b<?> bVar) {
        C87412m.m108594g(bVar, "next");
        C101536b<?> bVar2 = this.f297265a;
        if (bVar2 == null) {
            this.f297265a = bVar;
        } else {
            C87412m.m108591d(bVar2);
            bVar2.mo141015c(bVar);
        }
        return this;
    }
}
