package cn0;

import fn0.C87003h;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: cn0.l */
public interface C80089l extends C80109t {

    /* renamed from: cn0.l$a */
    public static class C80090a extends IOException {
        public C80090a(String str, C80081g gVar) {
            super(str);
        }

        public C80090a(IOException iOException, C80081g gVar) {
            super(iOException);
        }

        public C80090a(String str, IOException iOException, C80081g gVar) {
            super(str, iOException);
        }
    }

    /* renamed from: cn0.l$b */
    public static final class C80091b extends C80090a {
        public C80091b(String str, IOException iOException, C80081g gVar) {
            super(str, iOException, gVar);
        }

        public C80091b(String str, C80081g gVar) {
            super(str, gVar);
        }
    }

    /* renamed from: cn0.l$c */
    public static final class C80092c extends C80090a {
        public C80092c(String str, C80081g gVar) {
            super(str, gVar);
        }
    }

    /* renamed from: cn0.l$d */
    public static final class C80093d extends C80090a {
        public C80093d(String str, C80081g gVar) {
            super(str, gVar);
        }
    }

    /* renamed from: cn0.l$e */
    public static final class C80094e extends C80090a {

        /* renamed from: d */
        public final Map<String, List<String>> f234569d;

        public C80094e(String str, Map<String, List<String>> map, C80081g gVar) {
            super("Invalid content type: " + str, gVar);
            this.f234569d = map;
        }
    }

    /* renamed from: cn0.l$f */
    public static final class C80095f extends C80090a {

        /* renamed from: d */
        public final int f234570d;

        /* renamed from: e */
        public final Map<String, List<String>> f234571e;

        public C80095f(int i, Map<String, List<String>> map, C80081g gVar) {
            super("Response code: " + i, gVar);
            this.f234570d = i;
            this.f234571e = map;
        }
    }

    /* renamed from: cn0.l$g */
    public static final class C80096g extends C80090a {
        public C80096g(String str, C80081g gVar) {
            super(str, gVar);
        }
    }

    /* renamed from: cn0.l$h */
    public static final class C80097h extends C80090a {
        public C80097h(String str, IOException iOException, C80081g gVar) {
            super(str, iOException, gVar);
        }
    }

    /* renamed from: d */
    Map<String, List<String>> mo110334d();

    /* renamed from: e */
    C87003h<String> mo110335e();
}
