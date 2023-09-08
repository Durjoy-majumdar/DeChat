package qy3;

import bz3.C113219e;
import bz3.C23684j;
import com.tencent.xweb.file.XVFSFile;
import cz3.C24410d;
import fy3.C32224a;
import gy3.C20863e;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import ny3.C25235d;
import ny3.C89104m;
import qy3.C25968n0;
import rx3.C13598b0;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26467j;
import wy3.C26504r0;
import wy3.C26516w;
import z04.C112550d0;
import z04.C112551y;
import z04.C66723k;

/* renamed from: qy3.o */
public abstract class C22167o implements C20863e {

    /* renamed from: d */
    public static final C66723k f62692d = new C66723k("<v#(\\d+)>");

    /* renamed from: qy3.o$b */
    public enum C22168b {
        DECLARED,
        INHERITED
    }

    /* renamed from: qy3.o$c */
    public static final class C22169c extends C25905a {
        public C22169c(C22167o oVar) {
            super(oVar);
        }

        /* renamed from: l */
        public Object mo35276l(C26467j jVar, Object obj) {
            C87412m.m108594g(jVar, "descriptor");
            C87412m.m108594g((C13598b0) obj, "data");
            throw new IllegalStateException("No constructors should appear here: " + jVar);
        }
    }

    /* renamed from: qy3.o$a */
    public abstract class C22170a {

        /* renamed from: b */
        public static final /* synthetic */ C89104m<Object>[] f62696b = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C22170a.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a */
        public final C25968n0.C25969a f62697a;

        /* renamed from: qy3.o$a$a */
        public static final class C22171a extends C87413o implements C32224a<C23684j> {

            /* renamed from: d */
            public final /* synthetic */ C22167o f62698d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22171a(C22167o oVar) {
                super(0);
                this.f62698d = oVar;
            }

            public Object invoke() {
                return C25967m0.m33134a(this.f62698d.mo32564c());
            }
        }

        public C22170a(C22167o oVar) {
            this.f62697a = C25968n0.m33137c(new C22171a(oVar));
        }
    }

    /* renamed from: k */
    public final void mo35268k(List<Class<?>> list, String str, boolean z) {
        Class<C8480h> cls = C8480h.class;
        List<Class<?>> t = mo35272t(str);
        list.addAll(t);
        int size = ((((ArrayList) t).size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls2 = Integer.TYPE;
            C87412m.m108593f(cls2, "TYPE");
            list.add(cls2);
        }
        if (z) {
            list.remove(cls);
            list.add(cls);
            return;
        }
        list.add(Object.class);
    }

    /* renamed from: l */
    public final Method mo35269l(String str, String str2) {
        Method u;
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "desc");
        if (C87412m.m108589b(str, "<init>")) {
            return null;
        }
        Object[] array = ((ArrayList) mo35272t(str2)).toArray(new Class[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Class[] clsArr = (Class[]) array;
        Class<?> v = mo35274v(str2, C112550d0.m153768D(str2, ')', 0, false, 6, (Object) null) + 1, str2.length());
        Method u2 = mo35273u(mo35271r(), str, clsArr, v, false);
        if (u2 != null) {
            return u2;
        }
        if (!mo35271r().isInterface() || (u = mo35273u(Object.class, str, clsArr, v, false)) == null) {
            return null;
        }
        return u;
    }

    /* renamed from: m */
    public abstract Collection<C26467j> mo35261m();

    /* renamed from: n */
    public abstract Collection<C26516w> mo35262n(C22830f fVar);

    /* renamed from: p */
    public abstract C26504r0 mo35263p(int i);

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x001f A[SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<qy3.C25914e<?>> mo35270q(g04.C20770i r9, qy3.C22167o.C22168b r10) {
        /*
            r8 = this;
            java.lang.String r0 = "scope"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "belonginess"
            gy3.C87412m.m108594g(r10, r0)
            qy3.o$c r0 = new qy3.o$c
            r0.<init>(r8)
            r1 = 0
            r2 = 3
            java.util.Collection r9 = g04.C20774l.C20775a.m22732a(r9, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x001f:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r9.next()
            wy3.k r3 = (wy3.C26469k) r3
            boolean r4 = r3 instanceof wy3.C26436b
            if (r4 == 0) goto L_0x0064
            r4 = r3
            wy3.b r4 = (wy3.C26436b) r4
            wy3.s r5 = r4.getVisibility()
            wy3.s r6 = wy3.C26491r.f73785h
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 != 0) goto L_0x0064
            wy3.b$a r4 = r4.mo52634f()
            r4.getClass()
            wy3.b$a r5 = wy3.C26436b.C26437a.FAKE_OVERRIDE
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            qy3.o$b r5 = qy3.C22167o.C22168b.DECLARED
            if (r10 != r5) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = 0
        L_0x0055:
            if (r4 != r5) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r6 = 0
        L_0x0059:
            if (r6 == 0) goto L_0x0064
            rx3.b0 r4 = rx3.C13598b0.f38549a
            java.lang.Object r3 = r3.mo52621h0(r0, r4)
            qy3.e r3 = (qy3.C25914e) r3
            goto L_0x0065
        L_0x0064:
            r3 = r1
        L_0x0065:
            if (r3 == 0) goto L_0x001f
            r2.add(r3)
            goto L_0x001f
        L_0x006b:
            java.util.List r9 = sx3.C110818d0.m150953y0(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qy3.C22167o.mo35270q(g04.i, qy3.o$b):java.util.Collection");
    }

    /* renamed from: r */
    public Class<?> mo35271r() {
        Class<?> c = mo32564c();
        List<C25235d<? extends Object>> list = C24410d.f69857a;
        C87412m.m108594g(c, "<this>");
        Class<?> cls = C24410d.f69859c.get(c);
        return cls == null ? mo32564c() : cls;
    }

    /* renamed from: s */
    public abstract Collection<C26504r0> mo35264s(C22830f fVar);

    /* renamed from: t */
    public final List<Class<?>> mo35272t(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (C112550d0.m153802v("VZCBSIFJD", charAt, false, 2, (Object) null)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = C112550d0.m153768D(str, ';', i2, false, 4, (Object) null) + 1;
            } else {
                throw new C118215l0("Unknown type prefix in the method signature: " + str);
            }
            arrayList.add(mo35274v(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: u */
    public final Method mo35273u(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Method u;
        if (z) {
            clsArr[0] = cls;
        }
        Method w = mo35275w(cls, str, clsArr, cls2);
        if (w != null) {
            return w;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (u = mo35273u(superclass, str, clsArr, cls2, z)) != null) {
            return u;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        C87412m.m108593f(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            C87412m.m108593f(cls3, "superInterface");
            Method u2 = mo35273u(cls3, str, clsArr, cls2, z);
            if (u2 != null) {
                return u2;
            }
            if (z) {
                Class<?> a = C113219e.m154929a(C24410d.m30458d(cls3), cls3.getName() + "$DefaultImpls");
                if (a != null) {
                    clsArr[0] = cls3;
                    Method w2 = mo35275w(a, str, clsArr, cls2);
                    if (w2 != null) {
                        return w2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: v */
    public final Class<?> mo35274v(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'L') {
            ClassLoader d = C24410d.m30458d(mo32564c());
            String substring = str.substring(i + 1, i2 - 1);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> loadClass = d.loadClass(C112551y.m153815o(substring, XVFSFile.SEPARATOR_CHAR, '.', false, 4, (Object) null));
            C87412m.m108593f(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        } else if (charAt == '[') {
            Class<?> v = mo35274v(str, i + 1, i2);
            C22826c cVar = C25987u0.f72374a;
            C87412m.m108594g(v, "<this>");
            return Array.newInstance(v, 0).getClass();
        } else if (charAt == 'V') {
            Class<?> cls = Void.TYPE;
            C87412m.m108593f(cls, "TYPE");
            return cls;
        } else if (charAt == 'Z') {
            return Boolean.TYPE;
        } else {
            if (charAt == 'C') {
                return Character.TYPE;
            }
            if (charAt == 'B') {
                return Byte.TYPE;
            }
            if (charAt == 'S') {
                return Short.TYPE;
            }
            if (charAt == 'I') {
                return Integer.TYPE;
            }
            if (charAt == 'F') {
                return Float.TYPE;
            }
            if (charAt == 'J') {
                return Long.TYPE;
            }
            if (charAt == 'D') {
                return Double.TYPE;
            }
            throw new C118215l0("Unknown type prefix in the method signature: " + str);
        }
    }

    /* renamed from: w */
    public final Method mo35275w(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (C87412m.m108589b(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C87412m.m108593f(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (C87412m.m108589b(method.getName(), str) && C87412m.m108589b(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
