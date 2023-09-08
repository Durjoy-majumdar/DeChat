package cz3;

import cz3.C24413d0;
import cz3.C24421h;
import gy3.C45984j0;
import gy3.C87412m;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mz3.C21579b0;
import mz3.C25048a;
import mz3.C25055g;
import mz3.C25058j;
import sx3.C110823p;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26481l1;
import y04.C112354s;

/* renamed from: cz3.t */
public final class C24435t extends C24439x implements C24421h, C24413d0, C25055g {

    /* renamed from: a */
    public final Class<?> f69886a;

    public C24435t(Class<?> cls) {
        C87412m.m108594g(cls, "klass");
        this.f69886a = cls;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Class[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<mz3.C25058j> mo51078A() {
        /*
            r10 = this;
            java.lang.Class<?> r0 = r10.f69886a
            java.lang.String r1 = "clazz"
            gy3.C87412m.m108594g(r0, r1)
            cz3.b$a r1 = cz3.C24404b.f69847a
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x003d
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            cz3.b$a r4 = new cz3.b$a     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r5 = "isSealed"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r6 = "getPermittedSubclasses"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r6 = r1.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r7 = "isRecord"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r7 = r1.getMethod(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r8 = "getRecordComponents"
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r1 = r1.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r4.<init>(r5, r6, r7, r1)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r1 = r4
            goto L_0x003b
        L_0x0036:
            cz3.b$a r1 = new cz3.b$a
            r1.<init>(r2, r2, r2, r2)
        L_0x003b:
            cz3.C24404b.f69847a = r1
        L_0x003d:
            java.lang.reflect.Method r1 = r1.f69849b
            if (r1 != 0) goto L_0x0042
            goto L_0x0050
        L_0x0042:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Object r0 = r1.invoke(r0, r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>"
            gy3.C87412m.m108592e(r0, r1)
            r2 = r0
            java.lang.Class[] r2 = (java.lang.Class[]) r2
        L_0x0050:
            if (r2 == 0) goto L_0x0068
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.length
            r0.<init>(r1)
            int r1 = r2.length
        L_0x0059:
            if (r3 >= r1) goto L_0x006a
            r4 = r2[r3]
            cz3.v r5 = new cz3.v
            r5.<init>(r4)
            r0.add(r5)
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0068:
            sx3.f0 r0 = sx3.C64186f0.f181907d
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cz3.C24435t.mo51078A():java.util.Collection");
    }

    /* renamed from: B */
    public boolean mo51018B() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<mz3.C25070v> mo51079G() {
        /*
            r10 = this;
            java.lang.Class<?> r0 = r10.f69886a
            java.lang.String r1 = "clazz"
            gy3.C87412m.m108594g(r0, r1)
            cz3.b$a r1 = cz3.C24404b.f69847a
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x003d
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            cz3.b$a r4 = new cz3.b$a     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r5 = "isSealed"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r6 = "getPermittedSubclasses"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r6 = r1.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r7 = "isRecord"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r7 = r1.getMethod(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r8 = "getRecordComponents"
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r1 = r1.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r4.<init>(r5, r6, r7, r1)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r1 = r4
            goto L_0x003b
        L_0x0036:
            cz3.b$a r1 = new cz3.b$a
            r1.<init>(r2, r2, r2, r2)
        L_0x003b:
            cz3.C24404b.f69847a = r1
        L_0x003d:
            java.lang.reflect.Method r1 = r1.f69851d
            if (r1 != 0) goto L_0x0042
            goto L_0x004b
        L_0x0042:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Object r0 = r1.invoke(r0, r2)
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
        L_0x004b:
            if (r2 != 0) goto L_0x004f
            java.lang.Object[] r2 = new java.lang.Object[r3]
        L_0x004f:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.length
            r0.<init>(r1)
            int r1 = r2.length
        L_0x0056:
            if (r3 >= r1) goto L_0x0065
            r4 = r2[r3]
            cz3.g0 r5 = new cz3.g0
            r5.<init>(r4)
            r0.add(r5)
            int r3 = r3 + 1
            goto L_0x0056
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cz3.C24435t.mo51079G():java.util.Collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo51080H() {
        /*
            r10 = this;
            java.lang.Class<?> r0 = r10.f69886a
            java.lang.String r1 = "clazz"
            gy3.C87412m.m108594g(r0, r1)
            cz3.b$a r1 = cz3.C24404b.f69847a
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x003d
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            cz3.b$a r4 = new cz3.b$a     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r5 = "isSealed"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r6 = "getPermittedSubclasses"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r6 = r1.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r7 = "isRecord"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r7 = r1.getMethod(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r8 = "getRecordComponents"
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r1 = r1.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r4.<init>(r5, r6, r7, r1)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r1 = r4
            goto L_0x003b
        L_0x0036:
            cz3.b$a r1 = new cz3.b$a
            r1.<init>(r2, r2, r2, r2)
        L_0x003b:
            cz3.C24404b.f69847a = r1
        L_0x003d:
            java.lang.reflect.Method r1 = r1.f69850c
            if (r1 != 0) goto L_0x0042
            goto L_0x0050
        L_0x0042:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Object r0 = r1.invoke(r0, r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r0, r1)
            r2 = r0
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0050:
            if (r2 == 0) goto L_0x0056
            boolean r3 = r2.booleanValue()
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cz3.C24435t.mo51080H():boolean");
    }

    /* renamed from: J */
    public boolean mo51081J() {
        return this.f69886a.isEnum();
    }

    /* renamed from: K */
    public Collection mo51082K() {
        Field[] declaredFields = this.f69886a.getDeclaredFields();
        C87412m.m108593f(declaredFields, "klass.declaredFields");
        return C112354s.m153296s(C112354s.m153290m(C112354s.m153286i(C110823p.m151006v(declaredFields), C24432n.f69883d), C24433o.f69884d));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo51083L() {
        /*
            r10 = this;
            java.lang.Class<?> r0 = r10.f69886a
            java.lang.String r1 = "clazz"
            gy3.C87412m.m108594g(r0, r1)
            cz3.b$a r1 = cz3.C24404b.f69847a
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x003d
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            cz3.b$a r4 = new cz3.b$a     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r5 = "isSealed"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r6 = "getPermittedSubclasses"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r6 = r1.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r7 = "isRecord"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r7 = r1.getMethod(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r8 = "getRecordComponents"
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r1 = r1.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r4.<init>(r5, r6, r7, r1)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r1 = r4
            goto L_0x003b
        L_0x0036:
            cz3.b$a r1 = new cz3.b$a
            r1.<init>(r2, r2, r2, r2)
        L_0x003b:
            cz3.C24404b.f69847a = r1
        L_0x003d:
            java.lang.reflect.Method r1 = r1.f69848a
            if (r1 != 0) goto L_0x0042
            goto L_0x0050
        L_0x0042:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Object r0 = r1.invoke(r0, r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r0, r1)
            r2 = r0
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0050:
            if (r2 == 0) goto L_0x0056
            boolean r3 = r2.booleanValue()
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cz3.C24435t.mo51083L():boolean");
    }

    /* renamed from: O */
    public boolean mo51020O() {
        return Modifier.isStatic(mo51032o());
    }

    /* renamed from: b */
    public C25048a mo51023b(C22826c cVar) {
        return C24421h.C24422a.m30477a(this, cVar);
    }

    /* renamed from: d */
    public C22826c mo51084d() {
        C22826c b = C24410d.m30455a(this.f69886a).mo53387b();
        C87412m.m108593f(b, "klass.classId.asSingleFqName()");
        return b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C24435t) && C87412m.m108589b(this.f69886a, ((C24435t) obj).f69886a);
    }

    public Collection getAnnotations() {
        return C24421h.C24422a.m30478b(this);
    }

    public C22830f getName() {
        return C22830f.m26794f(this.f69886a.getSimpleName());
    }

    public List<C24425i0> getTypeParameters() {
        TypeVariable[] typeParameters = this.f69886a.getTypeParameters();
        C87412m.m108593f(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable i0Var : typeParameters) {
            arrayList.add(new C24425i0(i0Var));
        }
        return arrayList;
    }

    public C26481l1 getVisibility() {
        return C24413d0.C24414a.m30461a(this);
    }

    public int hashCode() {
        return this.f69886a.hashCode();
    }

    /* renamed from: i */
    public AnnotatedElement mo51029i() {
        return this.f69886a;
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(mo51032o());
    }

    public boolean isFinal() {
        return Modifier.isFinal(mo51032o());
    }

    /* renamed from: o */
    public int mo51032o() {
        return this.f69886a.getModifiers();
    }

    /* renamed from: q */
    public Collection mo51087q() {
        Constructor[] declaredConstructors = this.f69886a.getDeclaredConstructors();
        C87412m.m108593f(declaredConstructors, "klass.declaredConstructors");
        return C112354s.m153296s(C112354s.m153290m(C112354s.m153286i(C110823p.m151006v(declaredConstructors), C24430l.f69881d), C24431m.f69882d));
    }

    /* renamed from: r */
    public Collection<C25058j> mo51088r() {
        Type type = Object.class;
        if (C87412m.m108589b(this.f69886a, type)) {
            return C64186f0.f181907d;
        }
        C45984j0 j0Var = new C45984j0(2);
        Type genericSuperclass = this.f69886a.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        j0Var.mo71372a(type);
        Type[] genericInterfaces = this.f69886a.getGenericInterfaces();
        C87412m.m108593f(genericInterfaces, "klass.genericInterfaces");
        j0Var.mo71373b(genericInterfaces);
        List<Type> f = C64197v.m75537f(j0Var.mo71375d(new Type[j0Var.mo71374c()]));
        ArrayList arrayList = new ArrayList(C36907w.m41090l(f, 10));
        for (Type vVar : f) {
            arrayList.add(new C24437v(vVar));
        }
        return arrayList;
    }

    /* renamed from: s */
    public C25055g mo51089s() {
        Class<?> declaringClass = this.f69886a.getDeclaringClass();
        if (declaringClass != null) {
            return new C24435t(declaringClass);
        }
        return null;
    }

    /* renamed from: t */
    public Collection mo51090t() {
        Method[] declaredMethods = this.f69886a.getDeclaredMethods();
        C87412m.m108593f(declaredMethods, "klass.declaredMethods");
        return C112354s.m153296s(C112354s.m153290m(C112354s.m153285h(C110823p.m151006v(declaredMethods), new C116549r(this)), C24434s.f69885d));
    }

    public String toString() {
        return C24435t.class.getName() + ": " + this.f69886a;
    }

    /* renamed from: u */
    public C21579b0 mo51092u() {
        return null;
    }

    /* renamed from: v */
    public boolean mo51093v() {
        return false;
    }

    /* renamed from: w */
    public boolean mo51094w() {
        return this.f69886a.isInterface();
    }

    /* renamed from: x */
    public boolean mo51095x() {
        return this.f69886a.isAnnotation();
    }

    /* renamed from: z */
    public Collection mo51096z() {
        Class[] declaredClasses = this.f69886a.getDeclaredClasses();
        C87412m.m108593f(declaredClasses, "klass.declaredClasses");
        return C112354s.m153296s(C112354s.m153291n(C112354s.m153286i(C110823p.m151006v(declaredClasses), C7155p.f25133d), C20377q.f57101d));
    }
}
