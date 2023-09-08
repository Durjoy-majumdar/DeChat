package cz3;

import gy3.C8480h;
import gy3.C87412m;
import mz3.C25061m;
import vz3.C22830f;
import vz3.C26408b;

/* renamed from: cz3.y */
public final class C24440y extends C24417f implements C25061m {

    /* renamed from: b */
    public final Enum<?> f69891b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24440y(C22830f fVar, Enum<?> enumR) {
        super(fVar, (C8480h) null);
        C87412m.m108594g(enumR, "value");
        this.f69891b = enumR;
    }

    /* renamed from: d */
    public C26408b mo51104d() {
        Class<?> cls = this.f69891b.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        C87412m.m108593f(cls, "enumClass");
        return C24410d.m30455a(cls);
    }

    /* renamed from: e */
    public C22830f mo51105e() {
        return C22830f.m26794f(this.f69891b.name());
    }
}
