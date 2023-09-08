package cz3;

import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import mz3.C25050b;
import mz3.C25065q;
import mz3.C25071w;
import mz3.C25074z;
import vz3.C22830f;

/* renamed from: cz3.c0 */
public final class C24409c0 extends C24406b0 implements C25065q {

    /* renamed from: a */
    public final Method f69856a;

    public C24409c0(Method method) {
        C87412m.m108594g(method, "member");
        this.f69856a = method;
    }

    /* renamed from: N */
    public boolean mo51035N() {
        return mo51036R() != null;
    }

    /* renamed from: P */
    public Member mo51021P() {
        return this.f69856a;
    }

    /* renamed from: R */
    public C25050b mo51036R() {
        Object defaultValue = this.f69856a.getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        return C24410d.m30459e(defaultValue.getClass()) ? new C24440y((C22830f) null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new C24419g((C22830f) null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new C24426j((C22830f) null, (Object[]) defaultValue) : defaultValue instanceof Class ? new C24436u((C22830f) null, (Class) defaultValue) : new C24403a0((C22830f) null, defaultValue);
    }

    public C25071w getReturnType() {
        Type genericReturnType = this.f69856a.getGenericReturnType();
        C87412m.m108593f(genericReturnType, "member.genericReturnType");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new C24418f0(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) ? new C24428k(genericReturnType) : genericReturnType instanceof WildcardType ? new C24429k0((WildcardType) genericReturnType) : new C24437v(genericReturnType);
    }

    public List<C24425i0> getTypeParameters() {
        TypeVariable[] typeParameters = this.f69856a.getTypeParameters();
        C87412m.m108593f(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable i0Var : typeParameters) {
            arrayList.add(new C24425i0(i0Var));
        }
        return arrayList;
    }

    /* renamed from: h */
    public List<C25074z> mo51039h() {
        Type[] genericParameterTypes = this.f69856a.getGenericParameterTypes();
        C87412m.m108593f(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = this.f69856a.getParameterAnnotations();
        C87412m.m108593f(parameterAnnotations, "member.parameterAnnotations");
        return mo51022Q(genericParameterTypes, parameterAnnotations, this.f69856a.isVarArgs());
    }
}
