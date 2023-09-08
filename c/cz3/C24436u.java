package cz3;

import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import mz3.C25056h;
import mz3.C25071w;
import vz3.C22830f;

/* renamed from: cz3.u */
public final class C24436u extends C24417f implements C25056h {

    /* renamed from: b */
    public final Class<?> f69887b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24436u(C22830f fVar, Class<?> cls) {
        super(fVar, (C8480h) null);
        C87412m.m108594g(cls, "klass");
        this.f69887b = cls;
    }

    /* renamed from: c */
    public C25071w mo51097c() {
        Class<?> cls = this.f69887b;
        C87412m.m108594g(cls, "type");
        return cls.isPrimitive() ? new C24418f0(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new C24428k(cls) : cls instanceof WildcardType ? new C24429k0((WildcardType) cls) : new C24437v(cls);
    }
}
