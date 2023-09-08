package g04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import ez3.C24473b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.Set;
import sx3.C64187h0;
import vz3.C22830f;
import wy3.C26504r0;
import wy3.C26520x0;

/* renamed from: g04.i */
public interface C20770i extends C20774l {

    /* renamed from: a */
    public static final C20771a f58680a = C20771a.f58681a;

    /* renamed from: g04.i$a */
    public static final class C20771a {

        /* renamed from: a */
        public static final /* synthetic */ C20771a f58681a = new C20771a();

        /* renamed from: b */
        public static final C32226l<C22830f, Boolean> f58682b = C20772a.f58683d;

        /* renamed from: g04.i$a$a */
        public static final class C20772a extends C87413o implements C32226l<C22830f, Boolean> {

            /* renamed from: d */
            public static final C20772a f58683d = new C20772a();

            public C20772a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C22830f) obj, LocaleUtil.ITALIAN);
                return Boolean.TRUE;
            }
        }
    }

    /* renamed from: g04.i$b */
    public static final class C20773b extends C24538j {

        /* renamed from: b */
        public static final C20773b f58684b = new C20773b();

        /* renamed from: c */
        public Set<C22830f> mo32458c() {
            return C64187h0.f181908d;
        }

        /* renamed from: d */
        public Set<C22830f> mo32459d() {
            return C64187h0.f181908d;
        }

        /* renamed from: f */
        public Set<C22830f> mo32461f() {
            return C64187h0.f181908d;
        }
    }

    /* renamed from: a */
    Collection<? extends C26520x0> mo32456a(C22830f fVar, C24473b bVar);

    /* renamed from: b */
    Collection<? extends C26504r0> mo32457b(C22830f fVar, C24473b bVar);

    /* renamed from: c */
    Set<C22830f> mo32458c();

    /* renamed from: d */
    Set<C22830f> mo32459d();

    /* renamed from: f */
    Set<C22830f> mo32461f();
}
