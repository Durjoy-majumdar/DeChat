package qy3;

import ey3.C116796a;
import fy3.C32224a;
import gy3.C24566n;
import gy3.C87412m;
import gy3.C87413o;
import hz3.C24607a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import n04.C25143j0;
import ny3.C25234c;
import ny3.C25239j;
import ny3.C25245n;
import ny3.C25246o;
import ny3.C25250r;
import ny3.C25254u;
import oy3.C117904a;
import py3.C25503a;
import qy3.C25968n0;
import ry3.C26121e;
import sx3.C36907w;
import sx3.C77813z;
import vz3.C22826c;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26446d1;
import wy3.C26491r;
import wy3.C26505s;
import wy3.C26509u0;
import zz3.C26798j;

/* renamed from: qy3.e */
public abstract class C25914e<R> implements C25234c<R>, C25942k0 {

    /* renamed from: d */
    public final C25968n0.C25969a<List<Annotation>> f72257d = C25968n0.m33137c(new C25915a(this));

    /* renamed from: e */
    public final C25968n0.C25969a<ArrayList<C25239j>> f72258e = C25968n0.m33137c(new C25916b(this));

    /* renamed from: f */
    public final C25968n0.C25969a<C25935i0> f72259f = C25968n0.m33137c(new C25917c(this));

    /* renamed from: g */
    public final C25968n0.C25969a<List<C25939j0>> f72260g = C25968n0.m33137c(new C25918d(this));

    /* renamed from: qy3.e$a */
    public static final class C25915a extends C87413o implements C32224a<List<? extends Annotation>> {

        /* renamed from: d */
        public final /* synthetic */ C25914e<R> f72261d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25915a(C25914e<? extends R> eVar) {
            super(0);
            this.f72261d = eVar;
        }

        public Object invoke() {
            return C25987u0.m33171b(this.f72261d.mo52805n());
        }
    }

    /* renamed from: qy3.e$b */
    public static final class C25916b extends C87413o implements C32224a<ArrayList<C25239j>> {

        /* renamed from: d */
        public final /* synthetic */ C25914e<R> f72262d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25916b(C25914e<? extends R> eVar) {
            super(0);
            this.f72262d = eVar;
        }

        public Object invoke() {
            int i;
            C26436b n = this.f72262d.mo52805n();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            if (!this.f72262d.mo52807p()) {
                C26509u0 e = C25987u0.m33174e(n);
                if (e != null) {
                    arrayList.add(new C26000y(this.f72262d, 0, C25239j.C25240a.INSTANCE, new C25928f(e)));
                    i = 1;
                } else {
                    i = 0;
                }
                C26509u0 I = n.mo52627I();
                if (I != null) {
                    arrayList.add(new C26000y(this.f72262d, i, C25239j.C25240a.EXTENSION_RECEIVER, new C25930g(I)));
                    i++;
                }
            } else {
                i = 0;
            }
            int size = n.mo52639h().size();
            while (i2 < size) {
                arrayList.add(new C26000y(this.f72262d, i, C25239j.C25240a.VALUE, new C25932h(n, i2)));
                i2++;
                i++;
            }
            if (this.f72262d.mo52806o() && (n instanceof C24607a) && arrayList.size() > 1) {
                C77813z.m93909o(arrayList, new C25934i());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* renamed from: qy3.e$c */
    public static final class C25917c extends C87413o implements C32224a<C25935i0> {

        /* renamed from: d */
        public final /* synthetic */ C25914e<R> f72263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25917c(C25914e<? extends R> eVar) {
            super(0);
            this.f72263d = eVar;
        }

        public Object invoke() {
            C25143j0 returnType = this.f72263d.mo52805n().getReturnType();
            C87412m.m108591d(returnType);
            return new C25935i0(returnType, new C25938j(this.f72263d));
        }
    }

    /* renamed from: qy3.e$d */
    public static final class C25918d extends C87413o implements C32224a<List<? extends C25939j0>> {

        /* renamed from: d */
        public final /* synthetic */ C25914e<R> f72264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25918d(C25914e<? extends R> eVar) {
            super(0);
            this.f72264d = eVar;
        }

        public Object invoke() {
            List<C26446d1> typeParameters = this.f72264d.mo52805n().getTypeParameters();
            C87412m.m108593f(typeParameters, "descriptor.typeParameters");
            C25914e<R> eVar = this.f72264d;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(typeParameters, 10));
            for (C26446d1 d1Var : typeParameters) {
                C87412m.m108593f(d1Var, "descriptor");
                arrayList.add(new C25939j0(eVar, d1Var));
            }
            return arrayList;
        }
    }

    /* renamed from: c */
    public final Object mo52801c(C25245n nVar) {
        Class<?> b = C116796a.m164750b(C25503a.m32927b(nVar));
        if (b.isArray()) {
            Object newInstance = Array.newInstance(b.getComponentType(), 0);
            C87412m.m108593f(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new C118215l0("Cannot instantiate the default empty array of type " + b.getSimpleName() + ", because it is not an array type");
    }

    public R call(Object... objArr) {
        C87412m.m108594g(objArr, "args");
        try {
            return mo52802k().call(objArr);
        } catch (IllegalAccessException e) {
            throw new C117904a(e);
        }
    }

    public R callBy(Map<C25239j, ? extends Object> map) {
        Object obj;
        C25143j0 j0Var;
        Object obj2;
        Map<C25239j, ? extends Object> map2 = map;
        C87412m.m108594g(map2, "args");
        if (mo52806o()) {
            List<C25239j> parameters = getParameters();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(parameters, 10));
            for (C25239j jVar : parameters) {
                if (map2.containsKey(jVar)) {
                    obj2 = map2.get(jVar);
                    if (obj2 == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + jVar + ')');
                    }
                } else if (jVar.mo52342b()) {
                    obj2 = null;
                } else if (jVar.mo52341a()) {
                    obj2 = mo52801c(jVar.getType());
                } else {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar);
                }
                arrayList.add(obj2);
            }
            C26121e<?> m = mo52804m();
            if (m != null) {
                try {
                    Object[] array = arrayList.toArray(new Object[0]);
                    C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return m.call(array);
                } catch (IllegalAccessException e) {
                    throw new C117904a(e);
                }
            } else {
                throw new C118215l0("This callable does not support a default call: " + mo52805n());
            }
        } else {
            List<C25239j> parameters2 = getParameters();
            ArrayList arrayList2 = new ArrayList(parameters2.size());
            ArrayList arrayList3 = new ArrayList(1);
            int i = 0;
            boolean z = false;
            int i2 = 0;
            for (C25239j next : parameters2) {
                if (i != 0 && i % 32 == 0) {
                    arrayList3.add(Integer.valueOf(i2));
                    i2 = 0;
                }
                if (map2.containsKey(next)) {
                    arrayList2.add(map2.get(next));
                } else if (next.mo52342b()) {
                    C25245n type = next.getType();
                    C22826c cVar = C25987u0.f72374a;
                    C87412m.m108594g(type, "<this>");
                    C25935i0 i0Var = type instanceof C25935i0 ? (C25935i0) type : null;
                    if ((i0Var == null || (j0Var = i0Var.f72292d) == null || !C26798j.m35240c(j0Var)) ? false : true) {
                        obj = null;
                    } else {
                        C25245n type2 = next.getType();
                        C87412m.m108594g(type2, "<this>");
                        Type d = ((C25935i0) type2).mo51284d();
                        if (d == null && (!(type2 instanceof C24566n) || (d = ((C24566n) type2).mo51284d()) == null)) {
                            d = C25254u.m32180b(type2, false);
                        }
                        obj = C25987u0.m33172c(d);
                    }
                    arrayList2.add(obj);
                    i2 = (1 << (i % 32)) | i2;
                    z = true;
                } else if (next.mo52341a()) {
                    arrayList2.add(mo52801c(next.getType()));
                } else {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
                }
                if (next.mo52343f() == C25239j.C25240a.VALUE) {
                    i++;
                }
            }
            if (!z) {
                Object[] array2 = arrayList2.toArray(new Object[0]);
                C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return call(Arrays.copyOf(array2, array2.length));
            }
            arrayList3.add(Integer.valueOf(i2));
            C26121e<?> m2 = mo52804m();
            if (m2 != null) {
                arrayList2.addAll(arrayList3);
                arrayList2.add((Object) null);
                try {
                    Object[] array3 = arrayList2.toArray(new Object[0]);
                    C87412m.m108592e(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return m2.call(array3);
                } catch (IllegalAccessException e2) {
                    throw new C117904a(e2);
                }
            } else {
                throw new C118215l0("This callable does not support a default call: " + mo52805n());
            }
        }
    }

    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f72257d.invoke();
        C87412m.m108593f(invoke, "_annotations()");
        return invoke;
    }

    public List<C25239j> getParameters() {
        ArrayList<C25239j> invoke = this.f72258e.invoke();
        C87412m.m108593f(invoke, "_parameters()");
        return invoke;
    }

    public C25245n getReturnType() {
        C25935i0 invoke = this.f72259f.invoke();
        C87412m.m108593f(invoke, "_returnType()");
        return invoke;
    }

    public List<C25246o> getTypeParameters() {
        List<C25939j0> invoke = this.f72260g.invoke();
        C87412m.m108593f(invoke, "_typeParameters()");
        return invoke;
    }

    public C25250r getVisibility() {
        C26505s visibility = mo52805n().getVisibility();
        C87412m.m108593f(visibility, "descriptor.visibility");
        C22826c cVar = C25987u0.f72374a;
        if (C87412m.m108589b(visibility, C26491r.f73782e)) {
            return C25250r.PUBLIC;
        }
        if (C87412m.m108589b(visibility, C26491r.f73780c)) {
            return C25250r.PROTECTED;
        }
        if (C87412m.m108589b(visibility, C26491r.f73781d)) {
            return C25250r.INTERNAL;
        }
        if (C87412m.m108589b(visibility, C26491r.f73778a) ? true : C87412m.m108589b(visibility, C26491r.f73779b)) {
            return C25250r.PRIVATE;
        }
        return null;
    }

    public boolean isAbstract() {
        return mo52805n().mo51802j() == C26442c0.ABSTRACT;
    }

    public boolean isFinal() {
        return mo52805n().mo51802j() == C26442c0.FINAL;
    }

    public boolean isOpen() {
        return mo52805n().mo51802j() == C26442c0.OPEN;
    }

    /* renamed from: k */
    public abstract C26121e<?> mo52802k();

    /* renamed from: l */
    public abstract C22167o mo52803l();

    /* renamed from: m */
    public abstract C26121e<?> mo52804m();

    /* renamed from: n */
    public abstract C26436b mo52805n();

    /* renamed from: o */
    public final boolean mo52806o() {
        return C87412m.m108589b(getName(), "<init>") && mo52803l().mo32564c().isAnnotation();
    }

    /* renamed from: p */
    public abstract boolean mo52807p();
}
