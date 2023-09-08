package cz3;

import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import mz3.C25059k;
import mz3.C25074z;
import sx3.C110821n;
import sx3.C64186f0;

/* renamed from: cz3.w */
public final class C24438w extends C24406b0 implements C25059k {

    /* renamed from: a */
    public final Constructor<?> f69890a;

    public C24438w(Constructor<?> constructor) {
        C87412m.m108594g(constructor, "member");
        this.f69890a = constructor;
    }

    /* renamed from: P */
    public Member mo51021P() {
        return this.f69890a;
    }

    public List<C24425i0> getTypeParameters() {
        TypeVariable[] typeParameters = this.f69890a.getTypeParameters();
        C87412m.m108593f(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable i0Var : typeParameters) {
            arrayList.add(new C24425i0(i0Var));
        }
        return arrayList;
    }

    /* renamed from: h */
    public List<C25074z> mo51103h() {
        Type[] genericParameterTypes = this.f69890a.getGenericParameterTypes();
        C87412m.m108593f(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return C64186f0.f181907d;
        }
        Class<?> declaringClass = this.f69890a.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C110821n.m150967n(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = this.f69890a.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                C87412m.m108593f(parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) C110821n.m150967n(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            C87412m.m108593f(parameterAnnotations, "realAnnotations");
            return mo51022Q(genericParameterTypes, parameterAnnotations, this.f69890a.isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + this.f69890a);
    }
}
