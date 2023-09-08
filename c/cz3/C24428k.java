package cz3;

import gy3.C87412m;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import mz3.C25048a;
import mz3.C25054f;
import mz3.C25071w;
import sx3.C64186f0;

/* renamed from: cz3.k */
public final class C24428k extends C24423h0 implements C25054f {

    /* renamed from: a */
    public final Type f69876a;

    /* renamed from: b */
    public final C24423h0 f69877b;

    /* renamed from: c */
    public final Collection<C25048a> f69878c;

    public C24428k(Type type) {
        C24423h0 h0Var;
        C24423h0 f0Var;
        C87412m.m108594g(type, "reflectType");
        this.f69876a = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            C87412m.m108593f(genericComponentType, "genericComponentType");
            boolean z = genericComponentType instanceof Class;
            if (z) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    h0Var = new C24418f0(cls);
                    this.f69877b = h0Var;
                    this.f69878c = C64186f0.f181907d;
                }
            }
            f0Var = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C24428k(genericComponentType) : genericComponentType instanceof WildcardType ? new C24429k0((WildcardType) genericComponentType) : new C24437v(genericComponentType);
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    C87412m.m108593f(componentType, "getComponentType()");
                    f0Var = componentType.isPrimitive() ? new C24418f0(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C24428k(componentType) : componentType instanceof WildcardType ? new C24429k0((WildcardType) componentType) : new C24437v(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        h0Var = f0Var;
        this.f69877b = h0Var;
        this.f69878c = C64186f0.f181907d;
    }

    /* renamed from: B */
    public boolean mo51018B() {
        return false;
    }

    /* renamed from: P */
    public Type mo51055P() {
        return this.f69876a;
    }

    /* renamed from: g */
    public C25071w mo51072g() {
        return this.f69877b;
    }

    public Collection<C25048a> getAnnotations() {
        return this.f69878c;
    }
}
