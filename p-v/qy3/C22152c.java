package qy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import cz3.C24410d;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import sx3.C110818d0;
import sx3.C110823p;
import ux3.C65486b;
import uz3.C22710d;

/* renamed from: qy3.c */
public abstract class C22152c {

    /* renamed from: qy3.c$a */
    public static final class C22153a extends C22152c {

        /* renamed from: a */
        public final List<Method> f62671a;

        /* renamed from: qy3.c$a$a */
        public static final class C22154a extends C87413o implements C32226l<Method, CharSequence> {

            /* renamed from: d */
            public static final C22154a f62672d = new C22154a();

            public C22154a() {
                super(1);
            }

            public Object invoke(Object obj) {
                Class<?> returnType = ((Method) obj).getReturnType();
                C87412m.m108593f(returnType, "it.returnType");
                return C24410d.m30456b(returnType);
            }
        }

        /* renamed from: qy3.c$a$b */
        public static final class C22155b<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C65486b.m77169a(((Method) t).getName(), ((Method) t2).getName());
            }
        }

        public C22153a(Class<?> cls) {
            C87412m.m108594g(cls, "jClass");
            Method[] declaredMethods = cls.getDeclaredMethods();
            C87412m.m108593f(declaredMethods, "jClass.declaredMethods");
            this.f62671a = C110823p.m150995U(declaredMethods, new C22155b());
        }

        /* renamed from: a */
        public String mo35265a() {
            return C110818d0.m150921S(this.f62671a, "", "<init>(", ")V", 0, (CharSequence) null, C22154a.f62672d, 24, (Object) null);
        }
    }

    /* renamed from: qy3.c$b */
    public static final class C22156b extends C22152c {

        /* renamed from: a */
        public final Constructor<?> f62673a;

        /* renamed from: qy3.c$b$a */
        public static final class C22157a extends C87413o implements C32226l<Class<?>, CharSequence> {

            /* renamed from: d */
            public static final C22157a f62674d = new C22157a();

            public C22157a() {
                super(1);
            }

            public Object invoke(Object obj) {
                Class cls = (Class) obj;
                C87412m.m108593f(cls, LocaleUtil.ITALIAN);
                return C24410d.m30456b(cls);
            }
        }

        public C22156b(Constructor<?> constructor) {
            C87412m.m108594g(constructor, "constructor");
            this.f62673a = constructor;
        }

        /* renamed from: a */
        public String mo35265a() {
            Class[] parameterTypes = this.f62673a.getParameterTypes();
            C87412m.m108593f(parameterTypes, "constructor.parameterTypes");
            return C110823p.m150987M(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, C22157a.f62674d, 24, (Object) null);
        }
    }

    /* renamed from: qy3.c$c */
    public static final class C22158c extends C22152c {

        /* renamed from: a */
        public final Method f62675a;

        public C22158c(Method method) {
            C87412m.m108594g(method, FirebaseAnalytics.C113379b.METHOD);
            this.f62675a = method;
        }

        /* renamed from: a */
        public String mo35265a() {
            return C22177t0.m25645a(this.f62675a);
        }
    }

    /* renamed from: qy3.c$d */
    public static final class C22159d extends C22152c {

        /* renamed from: a */
        public final C22710d.C22712b f62676a;

        /* renamed from: b */
        public final String f62677b;

        public C22159d(C22710d.C22712b bVar) {
            C87412m.m108594g(bVar, "signature");
            this.f62676a = bVar;
            this.f62677b = bVar.mo35800a();
        }

        /* renamed from: a */
        public String mo35265a() {
            return this.f62677b;
        }
    }

    /* renamed from: qy3.c$e */
    public static final class C22160e extends C22152c {

        /* renamed from: a */
        public final C22710d.C22712b f62678a;

        /* renamed from: b */
        public final String f62679b;

        public C22160e(C22710d.C22712b bVar) {
            C87412m.m108594g(bVar, "signature");
            this.f62678a = bVar;
            this.f62679b = bVar.mo35800a();
        }

        /* renamed from: a */
        public String mo35265a() {
            return this.f62679b;
        }
    }

    /* renamed from: a */
    public abstract String mo35265a();
}
