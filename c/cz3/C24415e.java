package cz3;

import ey3.C116796a;
import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import mz3.C25048a;
import mz3.C25050b;
import mz3.C25055g;
import vz3.C22830f;
import vz3.C26408b;

/* renamed from: cz3.e */
public final class C24415e extends C24439x implements C25048a {

    /* renamed from: a */
    public final Annotation f69863a;

    public C24415e(Annotation annotation) {
        C87412m.m108594g(annotation, "annotation");
        this.f69863a = annotation;
    }

    /* renamed from: c */
    public boolean mo51040c() {
        return false;
    }

    /* renamed from: e */
    public C25055g mo51041e() {
        return new C24435t(C116796a.m164750b(C116796a.m164749a(this.f69863a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C24415e) && this.f69863a == ((C24415e) obj).f69863a;
    }

    /* renamed from: f */
    public C26408b mo51043f() {
        return C24410d.m30455a(C116796a.m164750b(C116796a.m164749a(this.f69863a)));
    }

    public Collection<C25050b> getArguments() {
        Method[] declaredMethods = C116796a.m164750b(C116796a.m164749a(this.f69863a)).getDeclaredMethods();
        C87412m.m108593f(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(this.f69863a, new Object[0]);
            C87412m.m108593f(invoke, "method.invoke(annotation)");
            C22830f f = C22830f.m26794f(method.getName());
            arrayList.add(C24410d.m30459e(invoke.getClass()) ? new C24440y(f, (Enum) invoke) : invoke instanceof Annotation ? new C24419g(f, (Annotation) invoke) : invoke instanceof Object[] ? new C24426j(f, (Object[]) invoke) : invoke instanceof Class ? new C24436u(f, (Class) invoke) : new C24403a0(f, invoke));
        }
        return arrayList;
    }

    public int hashCode() {
        return System.identityHashCode(this.f69863a);
    }

    /* renamed from: m */
    public boolean mo51046m() {
        return false;
    }

    public String toString() {
        return C24415e.class.getName() + ": " + this.f69863a;
    }
}
