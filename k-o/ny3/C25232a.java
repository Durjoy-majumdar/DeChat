package ny3;

import gy3.C87412m;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: ny3.a */
public final class C25232a implements GenericArrayType, Type {

    /* renamed from: a */
    public final Type f71700a;

    public C25232a(Type type) {
        C87412m.m108594g(type, "elementType");
        this.f71700a = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C87412m.m108589b(this.f71700a, ((GenericArrayType) obj).getGenericComponentType());
    }

    public Type getGenericComponentType() {
        return this.f71700a;
    }

    public String getTypeName() {
        return C25254u.m32179a(this.f71700a) + "[]";
    }

    public int hashCode() {
        return this.f71700a.hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
