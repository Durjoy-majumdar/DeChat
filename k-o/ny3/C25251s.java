package ny3;

import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import sx3.C110823p;

/* renamed from: ny3.s */
public final class C25251s implements ParameterizedType, Type {

    /* renamed from: a */
    public final Class<?> f71718a;

    /* renamed from: b */
    public final Type f71719b;

    /* renamed from: c */
    public final Type[] f71720c;

    /* renamed from: ny3.s$a */
    public /* synthetic */ class C25252a extends C24565l implements C32226l<Type, String> {

        /* renamed from: d */
        public static final C25252a f71721d = new C25252a();

        public C25252a() {
            super(1, C25254u.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        public Object invoke(Object obj) {
            Type type = (Type) obj;
            C87412m.m108594g(type, "p0");
            return C25254u.m32179a(type);
        }
    }

    public C25251s(Class<?> cls, Type type, List<? extends Type> list) {
        C87412m.m108594g(cls, "rawType");
        C87412m.m108594g(list, "typeArguments");
        this.f71718a = cls;
        this.f71719b = type;
        Object[] array = list.toArray(new Type[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f71720c = (Type[]) array;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return C87412m.m108589b(this.f71718a, parameterizedType.getRawType()) && C87412m.m108589b(this.f71719b, parameterizedType.getOwnerType()) && Arrays.equals(this.f71720c, parameterizedType.getActualTypeArguments());
        }
    }

    public Type[] getActualTypeArguments() {
        return this.f71720c;
    }

    public Type getOwnerType() {
        return this.f71719b;
    }

    public Type getRawType() {
        return this.f71718a;
    }

    public String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.f71719b;
        if (type != null) {
            sb.append(C25254u.m32179a(type));
            sb.append("$");
            sb.append(this.f71718a.getSimpleName());
        } else {
            sb.append(C25254u.m32179a(this.f71718a));
        }
        Type[] typeArr = this.f71720c;
        if (!(typeArr.length == 0)) {
            C110823p.m150985K(typeArr, sb, ", ", "<", ">", -1, "...", C25252a.f71721d);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    public int hashCode() {
        int hashCode = this.f71718a.hashCode();
        Type type = this.f71719b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f71720c);
    }

    public String toString() {
        return getTypeName();
    }
}
