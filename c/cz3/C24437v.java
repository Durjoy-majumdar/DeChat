package cz3;

import gy3.C87412m;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mz3.C25048a;
import mz3.C25057i;
import mz3.C25058j;
import mz3.C25071w;
import sx3.C36907w;
import sx3.C64186f0;
import vz3.C22826c;

/* renamed from: cz3.v */
public final class C24437v extends C24423h0 implements C25058j {

    /* renamed from: a */
    public final Type f69888a;

    /* renamed from: b */
    public final C25057i f69889b;

    public C24437v(Type type) {
        C25057i iVar;
        C87412m.m108594g(type, "reflectType");
        this.f69888a = type;
        if (type instanceof Class) {
            iVar = new C24435t((Class) type);
        } else if (type instanceof TypeVariable) {
            iVar = new C24425i0((TypeVariable) type);
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C87412m.m108592e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            iVar = new C24435t((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
        }
        this.f69889b = iVar;
    }

    /* renamed from: B */
    public boolean mo51018B() {
        return false;
    }

    /* renamed from: C */
    public String mo51098C() {
        return this.f69888a.toString();
    }

    /* renamed from: D */
    public String mo51099D() {
        throw new UnsupportedOperationException("Type not found: " + this.f69888a);
    }

    /* renamed from: I */
    public boolean mo51100I() {
        Type type = this.f69888a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        C87412m.m108593f(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    /* renamed from: P */
    public Type mo51055P() {
        return this.f69888a;
    }

    /* renamed from: b */
    public C25048a mo51023b(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        return null;
    }

    public Collection<C25048a> getAnnotations() {
        return C64186f0.f181907d;
    }

    /* renamed from: j */
    public C25057i mo51101j() {
        return this.f69889b;
    }

    /* renamed from: y */
    public List<C25071w> mo51102y() {
        Object obj;
        List<Type> c = C24410d.m30457c(this.f69888a);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(c, 10));
        for (Type type : c) {
            C87412m.m108594g(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    obj = new C24418f0(cls);
                    arrayList.add(obj);
                }
            }
            obj = ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C24428k(type) : type instanceof WildcardType ? new C24429k0((WildcardType) type) : new C24437v(type);
            arrayList.add(obj);
        }
        return arrayList;
    }
}
