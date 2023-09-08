package ny3;

import gy3.C87412m;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: ny3.w */
public final class C25256w implements WildcardType, Type {

    /* renamed from: c */
    public static final C25256w f71724c = new C25256w((Type) null, (Type) null);

    /* renamed from: a */
    public final Type f71725a;

    /* renamed from: b */
    public final Type f71726b;

    public C25256w(Type type, Type type2) {
        this.f71725a = type;
        this.f71726b = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
        }
    }

    public Type[] getLowerBounds() {
        Type type = this.f71726b;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    public String getTypeName() {
        if (this.f71726b != null) {
            return "? super " + C25254u.m32179a(this.f71726b);
        }
        Type type = this.f71725a;
        if (type == null || C87412m.m108589b(type, Object.class)) {
            return "?";
        }
        return "? extends " + C25254u.m32179a(this.f71725a);
    }

    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f71725a;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
