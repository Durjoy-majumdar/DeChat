package bz3;

import b04.C23648f;
import cz3.C24410d;
import e04.C20506e;
import ey3.C116796a;
import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import oz3.C25395q;
import sx3.C110823p;
import ty3.C22558j;
import ty3.C26343l;
import vy3.C26384c;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;

/* renamed from: bz3.c */
public final class C23679c {

    /* renamed from: a */
    public static final C23679c f67868a = new C23679c();

    /* renamed from: a */
    public final C23648f mo37216a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            C87412m.m108593f(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            C26408b a = C24410d.m30455a(cls);
            C26384c cVar = C26384c.f73585a;
            C22826c b = a.mo53387b();
            C87412m.m108593f(b, "javaClassId.asSingleFqName()");
            C26408b f = cVar.mo53373f(b);
            if (f != null) {
                a = f;
            }
            return new C23648f(a, i);
        } else if (C87412m.m108589b(cls, Void.TYPE)) {
            return new C23648f(C26408b.m33992l(C26343l.C26344a.f73415e.mo35993i()), i);
        } else {
            C22558j e = C20506e.m22188b(cls.getName()).mo32070e();
            C87412m.m108593f(e, "get(currentClass.name).primitiveType");
            return i > 0 ? new C23648f(C26408b.m33992l((C22826c) e.f64886g.getValue()), i - 1) : new C23648f(C26408b.m33992l((C22826c) e.f64885f.getValue()), i);
        }
    }

    /* renamed from: b */
    public final void mo37217b(Class<?> cls, C25395q.C25398c cVar) {
        C87412m.m108594g(cls, "klass");
        C87412m.m108594g(cVar, "visitor");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        C87412m.m108593f(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            C87412m.m108593f(annotation, "annotation");
            mo37218c(cVar, annotation);
        }
        cVar.mo35570a();
    }

    /* renamed from: c */
    public final void mo37218c(C25395q.C25398c cVar, Annotation annotation) {
        Class b = C116796a.m164750b(C116796a.m164749a(annotation));
        C25395q.C25396a c = cVar.mo35571c(C24410d.m30455a(b), new C23678b(annotation));
        if (c != null) {
            f67868a.mo37219d(c, annotation, b);
        }
    }

    /* renamed from: d */
    public final void mo37219d(C25395q.C25396a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        C87412m.m108593f(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                C87412m.m108591d(invoke);
                C22830f f = C22830f.m26794f(method.getName());
                Class<?> cls2 = invoke.getClass();
                if (C87412m.m108589b(cls2, Class.class)) {
                    aVar.mo52561c(f, mo37216a((Class) invoke));
                } else if (C39879h.f106939a.contains(cls2)) {
                    aVar.mo52562d(f, invoke);
                } else if (C24410d.m30459e(cls2)) {
                    if (!cls2.isEnum()) {
                        cls2 = cls2.getEnclosingClass();
                    }
                    C87412m.m108593f(cls2, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                    aVar.mo52560b(f, C24410d.m30455a(cls2), C22830f.m26794f(((Enum) invoke).name()));
                } else if (Annotation.class.isAssignableFrom(cls2)) {
                    Class[] interfaces = cls2.getInterfaces();
                    C87412m.m108593f(interfaces, "clazz.interfaces");
                    Class cls3 = (Class) C110823p.m150993S(interfaces);
                    C87412m.m108593f(cls3, "annotationClass");
                    C25395q.C25396a e = aVar.mo52563e(f, C24410d.m30455a(cls3));
                    if (e != null) {
                        mo37219d(e, (Annotation) invoke, cls3);
                    }
                } else if (cls2.isArray()) {
                    C25395q.C25397b f2 = aVar.mo52564f(f);
                    if (f2 != null) {
                        Class<?> componentType = cls2.getComponentType();
                        if (componentType.isEnum()) {
                            C26408b a = C24410d.m30455a(componentType);
                            for (Object obj : (Object[]) invoke) {
                                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                f2.mo52570d(a, C22830f.m26794f(((Enum) obj).name()));
                            }
                        } else if (C87412m.m108589b(componentType, Class.class)) {
                            for (Object obj2 : (Object[]) invoke) {
                                C87412m.m108592e(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                f2.mo52569c(mo37216a((Class) obj2));
                            }
                        } else if (Annotation.class.isAssignableFrom(componentType)) {
                            for (Object obj3 : (Object[]) invoke) {
                                C25395q.C25396a e2 = f2.mo52571e(C24410d.m30455a(componentType));
                                if (e2 != null) {
                                    C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                    mo37219d(e2, (Annotation) obj3, componentType);
                                }
                            }
                        } else {
                            for (Object b : (Object[]) invoke) {
                                f2.mo52568b(b);
                            }
                        }
                        f2.mo52567a();
                    }
                } else {
                    throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.mo52566a();
    }
}
