package ry3;

import ey3.C116796a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qy3.C118215l0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C110823p;

/* renamed from: ry3.b */
public final class C110665b {

    /* renamed from: ry3.b$a */
    public static final class C110666a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ Map<String, Object> f331070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110666a(Map<String, ? extends Object> map) {
            super(0);
            this.f331070d = map;
        }

        public Object invoke() {
            int i = 0;
            for (Map.Entry entry : this.f331070d.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                i += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: ry3.b$c */
    public static final class C110667c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ Class<T> f331071d;

        /* renamed from: e */
        public final /* synthetic */ Map<String, Object> f331072e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110667c(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f331071d = cls;
            this.f331072e = map;
        }

        public Object invoke() {
            Class<T> cls = this.f331071d;
            Map<String, Object> map = this.f331072e;
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(cls.getCanonicalName());
            C110818d0.m150920R(map.entrySet(), sb, ", ", "(", ")", 0, (CharSequence) null, C110669c.f331078d, 48, (Object) null);
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
            return sb4;
        }
    }

    /* renamed from: ry3.b$b */
    public static final class C110668b implements InvocationHandler {

        /* renamed from: a */
        public final /* synthetic */ Class<T> f331073a;

        /* renamed from: b */
        public final /* synthetic */ Map<String, Object> f331074b;

        /* renamed from: c */
        public final /* synthetic */ C13601g<String> f331075c;

        /* renamed from: d */
        public final /* synthetic */ C13601g<Integer> f331076d;

        /* renamed from: e */
        public final /* synthetic */ List<Method> f331077e;

        public C110668b(Class<T> cls, Map<String, ? extends Object> map, C13601g<String> gVar, C13601g<Integer> gVar2, List<Method> list) {
            this.f331073a = cls;
            this.f331074b = map;
            this.f331075c = gVar;
            this.f331076d = gVar2;
            this.f331077e = list;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z;
            boolean z2;
            String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return this.f331073a;
                        }
                    } else if (name.equals("hashCode")) {
                        return Integer.valueOf(this.f331076d.getValue().intValue());
                    }
                } else if (name.equals("toString")) {
                    return this.f331075c.getValue();
                }
            }
            boolean z3 = false;
            if (C87412m.m108589b(name, "equals")) {
                if (objArr != null && objArr.length == 1) {
                    Class<T> cls = this.f331073a;
                    List<Method> list = this.f331077e;
                    Map<String, Object> map = this.f331074b;
                    C87412m.m108593f(objArr, "args");
                    Object S = C110823p.m150993S(objArr);
                    Class cls2 = null;
                    Annotation annotation = S instanceof Annotation ? (Annotation) S : null;
                    if (annotation != null) {
                        cls2 = C116796a.m164750b(C116796a.m164749a(annotation));
                    }
                    if (C87412m.m108589b(cls2, cls)) {
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Method method2 = (Method) it.next();
                                Object obj2 = map.get(method2.getName());
                                Object invoke = method2.invoke(S, new Object[0]);
                                if (obj2 instanceof boolean[]) {
                                    C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                                    z2 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                                    continue;
                                } else if (obj2 instanceof char[]) {
                                    C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                                    z2 = Arrays.equals((char[]) obj2, (char[]) invoke);
                                    continue;
                                } else if (obj2 instanceof byte[]) {
                                    C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                                    z2 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                                    continue;
                                } else if (obj2 instanceof short[]) {
                                    C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                                    z2 = Arrays.equals((short[]) obj2, (short[]) invoke);
                                    continue;
                                } else if (obj2 instanceof int[]) {
                                    C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                                    z2 = Arrays.equals((int[]) obj2, (int[]) invoke);
                                    continue;
                                } else if (obj2 instanceof float[]) {
                                    C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                                    z2 = Arrays.equals((float[]) obj2, (float[]) invoke);
                                    continue;
                                } else if (obj2 instanceof long[]) {
                                    C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                                    z2 = Arrays.equals((long[]) obj2, (long[]) invoke);
                                    continue;
                                } else if (obj2 instanceof double[]) {
                                    C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                                    z2 = Arrays.equals((double[]) obj2, (double[]) invoke);
                                    continue;
                                } else if (obj2 instanceof Object[]) {
                                    C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                    z2 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                                    continue;
                                } else {
                                    z2 = C87412m.m108589b(obj2, invoke);
                                    continue;
                                }
                                if (!z2) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                            z3 = true;
                        }
                    }
                    return Boolean.valueOf(z3);
                }
            }
            if (this.f331074b.containsKey(name)) {
                return this.f331074b.get(name);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(C110823p.m151001a0(objArr));
            sb.append(')');
            throw new C118215l0(sb.toString());
        }
    }

    /* renamed from: a */
    public static final <T> T m150644a(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        C87412m.m108594g(cls, "annotationClass");
        C87412m.m108594g(map, "values");
        C87412m.m108594g(list, "methods");
        C13601g a = C36568h.m40985a(new C110666a(map));
        C13601g a2 = C36568h.m40985a(new C110667c(cls, map));
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C110668b(cls, map, a2, a, list));
        C87412m.m108592e(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }
}
