package cz3;

import gy3.C87412m;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* renamed from: cz3.c */
public final class C24407c {

    /* renamed from: a */
    public static final C24407c f69852a = new C24407c();

    /* renamed from: b */
    public static C24408a f69853b;

    /* renamed from: cz3.c$a */
    public static final class C24408a {

        /* renamed from: a */
        public final Method f69854a;

        /* renamed from: b */
        public final Method f69855b;

        public C24408a(Method method, Method method2) {
            this.f69854a = method;
            this.f69855b = method2;
        }
    }

    /* renamed from: a */
    public final C24408a mo51034a(Member member) {
        C87412m.m108594g(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new C24408a(cls.getMethod("getParameters", new Class[0]), C24410d.m30458d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C24408a((Method) null, (Method) null);
        }
    }
}
