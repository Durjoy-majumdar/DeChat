package qy3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import rx3.C13601g;
import sx3.C110823p;

/* renamed from: qy3.g0 */
public final class C25931g0 extends C87413o implements C32224a<Type> {

    /* renamed from: d */
    public final /* synthetic */ C25935i0 f72285d;

    /* renamed from: e */
    public final /* synthetic */ int f72286e;

    /* renamed from: f */
    public final /* synthetic */ C13601g<List<Type>> f72287f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25931g0(C25935i0 i0Var, int i, C13601g<? extends List<? extends Type>> gVar) {
        super(0);
        this.f72285d = i0Var;
        this.f72286e = i;
        this.f72287f = gVar;
    }

    public Object invoke() {
        Type d = this.f72285d.mo51284d();
        if (d instanceof Class) {
            Class cls = (Class) d;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            C87412m.m108593f(componentType, "{\n                      …                        }");
            return componentType;
        } else if (d instanceof GenericArrayType) {
            if (this.f72286e == 0) {
                Type genericComponentType = ((GenericArrayType) d).getGenericComponentType();
                C87412m.m108593f(genericComponentType, "{\n                      …                        }");
                return genericComponentType;
            }
            throw new C118215l0("Array type has been queried for a non-0th argument: " + this.f72285d);
        } else if (d instanceof ParameterizedType) {
            Type type = (Type) this.f72287f.getValue().get(this.f72286e);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                C87412m.m108593f(lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) C110823p.m150978D(lowerBounds);
                if (type2 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    C87412m.m108593f(upperBounds, "argument.upperBounds");
                    type = (Type) C110823p.m150976B(upperBounds);
                } else {
                    type = type2;
                }
            }
            C87412m.m108593f(type, "{\n                      …                        }");
            return type;
        } else {
            throw new C118215l0("Non-generic type has been queried for arguments: " + this.f72285d);
        }
    }
}
