package ty3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ServiceLoader;
import m04.C24980n;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sx3.C110818d0;
import wy3.C22936j0;
import wy3.C26448e0;
import yy3.C26640a;
import yy3.C26642b;
import yy3.C26643c;

/* renamed from: ty3.a */
public interface C26328a {

    /* renamed from: a */
    public static final C26329a f73349a = C26329a.f73350a;

    /* renamed from: ty3.a$a */
    public static final class C26329a {

        /* renamed from: a */
        public static final /* synthetic */ C26329a f73350a = new C26329a();

        /* renamed from: b */
        public static final C13601g<C26328a> f73351b = C36568h.m40986b(C13602i.PUBLICATION, C26330a.f73352d);

        /* renamed from: ty3.a$a$a */
        public static final class C26330a extends C87413o implements C32224a<C26328a> {

            /* renamed from: d */
            public static final C26330a f73352d = new C26330a();

            public C26330a() {
                super(0);
            }

            public Object invoke() {
                Class<C26328a> cls = C26328a.class;
                ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
                C87412m.m108593f(load, "implementations");
                C26328a aVar = (C26328a) C110818d0.m150915M(load);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }
    }

    /* renamed from: a */
    C22936j0 mo51860a(C24980n nVar, C26448e0 e0Var, Iterable<? extends C26642b> iterable, C26643c cVar, C26640a aVar, boolean z);
}
