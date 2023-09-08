package wy3;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import tx3.C26317d;

/* renamed from: wy3.k1 */
public final class C26470k1 {

    /* renamed from: a */
    public static final Map<C26481l1, Integer> f73762a;

    /* renamed from: wy3.k1$a */
    public static final class C26471a extends C26481l1 {

        /* renamed from: c */
        public static final C26471a f73763c = new C26471a();

        public C26471a() {
            super("inherited", false);
        }
    }

    /* renamed from: wy3.k1$b */
    public static final class C26472b extends C26481l1 {

        /* renamed from: c */
        public static final C26472b f73764c = new C26472b();

        public C26472b() {
            super("internal", false);
        }
    }

    /* renamed from: wy3.k1$c */
    public static final class C26473c extends C26481l1 {

        /* renamed from: c */
        public static final C26473c f73765c = new C26473c();

        public C26473c() {
            super("invisible_fake", false);
        }
    }

    /* renamed from: wy3.k1$d */
    public static final class C26474d extends C26481l1 {

        /* renamed from: c */
        public static final C26474d f73766c = new C26474d();

        public C26474d() {
            super(ImagesContract.LOCAL, false);
        }
    }

    /* renamed from: wy3.k1$e */
    public static final class C26475e extends C26481l1 {

        /* renamed from: c */
        public static final C26475e f73767c = new C26475e();

        public C26475e() {
            super("private", false);
        }
    }

    /* renamed from: wy3.k1$f */
    public static final class C26476f extends C26481l1 {

        /* renamed from: c */
        public static final C26476f f73768c = new C26476f();

        public C26476f() {
            super("private_to_this", false);
        }

        /* renamed from: b */
        public String mo37188b() {
            return "private/*private to this*/";
        }
    }

    /* renamed from: wy3.k1$g */
    public static final class C26477g extends C26481l1 {

        /* renamed from: c */
        public static final C26477g f73769c = new C26477g();

        public C26477g() {
            super("protected", true);
        }
    }

    /* renamed from: wy3.k1$h */
    public static final class C26478h extends C26481l1 {

        /* renamed from: c */
        public static final C26478h f73770c = new C26478h();

        public C26478h() {
            super("public", true);
        }
    }

    /* renamed from: wy3.k1$i */
    public static final class C26479i extends C26481l1 {

        /* renamed from: c */
        public static final C26479i f73771c = new C26479i();

        public C26479i() {
            super("unknown", false);
        }
    }

    static {
        C26317d dVar = new C26317d();
        dVar.put(C26476f.f73768c, 0);
        dVar.put(C26475e.f73767c, 0);
        dVar.put(C26472b.f73764c, 1);
        dVar.put(C26477g.f73769c, 1);
        dVar.put(C26478h.f73770c, 2);
        dVar.mo53242c();
        dVar.f73339r = true;
        f73762a = dVar;
    }
}
