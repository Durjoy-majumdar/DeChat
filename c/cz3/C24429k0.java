package cz3;

import gy3.C87412m;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import mz3.C25048a;
import mz3.C25049a0;
import mz3.C25071w;
import sx3.C110823p;
import sx3.C64186f0;

/* renamed from: cz3.k0 */
public final class C24429k0 extends C24423h0 implements C25049a0 {

    /* renamed from: a */
    public final WildcardType f69879a;

    /* renamed from: b */
    public final Collection<C25048a> f69880b = C64186f0.f181907d;

    public C24429k0(WildcardType wildcardType) {
        C87412m.m108594g(wildcardType, "reflectType");
        this.f69879a = wildcardType;
    }

    /* renamed from: B */
    public boolean mo51018B() {
        return false;
    }

    /* renamed from: P */
    public Type mo51055P() {
        return this.f69879a;
    }

    public Collection<C25048a> getAnnotations() {
        return this.f69880b;
    }

    /* renamed from: l */
    public C25071w mo51073l() {
        C25071w kVar;
        C24418f0 f0Var;
        Type[] upperBounds = this.f69879a.getUpperBounds();
        Type[] lowerBounds = this.f69879a.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + this.f69879a);
        }
        if (lowerBounds.length == 1) {
            Object S = C110823p.m150993S(lowerBounds);
            C87412m.m108593f(S, "lowerBounds.single()");
            Type type = (Type) S;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    f0Var = new C24418f0(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                kVar = new C24428k(type);
                return kVar;
            }
            kVar = type instanceof WildcardType ? new C24429k0((WildcardType) type) : new C24437v(type);
            return kVar;
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            Type type2 = (Type) C110823p.m150993S(upperBounds);
            if (C87412m.m108589b(type2, Object.class)) {
                return null;
            }
            C87412m.m108593f(type2, "ub");
            boolean z2 = type2 instanceof Class;
            if (z2) {
                Class cls2 = (Class) type2;
                if (cls2.isPrimitive()) {
                    f0Var = new C24418f0(cls2);
                }
            }
            if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                kVar = new C24428k(type2);
                return kVar;
            }
            kVar = type2 instanceof WildcardType ? new C24429k0((WildcardType) type2) : new C24437v(type2);
            return kVar;
        }
        return f0Var;
    }

    /* renamed from: p */
    public boolean mo51074p() {
        Type[] upperBounds = this.f69879a.getUpperBounds();
        C87412m.m108593f(upperBounds, "reflectType.upperBounds");
        return !C87412m.m108589b(C110823p.m150978D(upperBounds), Object.class);
    }
}
