package cz3;

import gy3.C87412m;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import mz3.C25062n;
import mz3.C25071w;

/* renamed from: cz3.z */
public final class C24441z extends C24406b0 implements C25062n {

    /* renamed from: a */
    public final Field f69892a;

    public C24441z(Field field) {
        C87412m.m108594g(field, "member");
        this.f69892a = field;
    }

    /* renamed from: E */
    public boolean mo51106E() {
        return false;
    }

    /* renamed from: M */
    public boolean mo51107M() {
        return this.f69892a.isEnumConstant();
    }

    /* renamed from: P */
    public Member mo51021P() {
        return this.f69892a;
    }

    public C25071w getType() {
        Type genericType = this.f69892a.getGenericType();
        C87412m.m108593f(genericType, "member.genericType");
        boolean z = genericType instanceof Class;
        if (z) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new C24418f0(cls);
            }
        }
        return ((genericType instanceof GenericArrayType) || (z && ((Class) genericType).isArray())) ? new C24428k(genericType) : genericType instanceof WildcardType ? new C24429k0((WildcardType) genericType) : new C24437v(genericType);
    }
}
