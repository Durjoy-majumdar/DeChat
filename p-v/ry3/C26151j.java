package ry3;

import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import ry3.C26121e;
import sx3.C110821n;
import sx3.C26236u;
import sx3.C64186f0;

/* renamed from: ry3.j */
public abstract class C26151j implements C26121e<Method> {

    /* renamed from: a */
    public final Method f73074a;

    /* renamed from: b */
    public final List<Type> f73075b;

    /* renamed from: c */
    public final Type f73076c;

    /* renamed from: ry3.j$a */
    public static final class C26152a extends C26151j implements C26120d {

        /* renamed from: d */
        public final Object f73077d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26152a(Method method, Object obj) {
            super(method, C64186f0.f181907d, (C8480h) null);
            C87412m.m108594g(method, "unboxMethod");
            this.f73077d = obj;
        }

        public Object call(Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            C26121e.C26122a.m33553a(this, objArr);
            return this.f73074a.invoke(this.f73077d, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: ry3.j$b */
    public static final class C26153b extends C26151j {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26153b(Method method) {
            super(method, C26236u.m33719b(method.getDeclaringClass()), (C8480h) null);
            C87412m.m108594g(method, "unboxMethod");
        }

        public Object call(Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            C26121e.C26122a.m33553a(this, objArr);
            Object obj = objArr[0];
            Object[] n = objArr.length <= 1 ? new Object[0] : C110821n.m150967n(objArr, 1, objArr.length);
            return this.f73074a.invoke(obj, Arrays.copyOf(n, n.length));
        }
    }

    public C26151j(Method method, List list, C8480h hVar) {
        this.f73074a = method;
        this.f73075b = list;
        Class<?> returnType = method.getReturnType();
        C87412m.m108593f(returnType, "unboxMethod.returnType");
        this.f73076c = returnType;
    }

    /* renamed from: a */
    public final List<Type> mo53054a() {
        return this.f73075b;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Member mo53055b() {
        return null;
    }

    public final Type getReturnType() {
        return this.f73076c;
    }
}
