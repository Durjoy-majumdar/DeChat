package p300c8;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p300c8.C79946g;

/* renamed from: c8.t */
public interface C79958t extends C79946g {

    /* renamed from: c8.t$a */
    public static abstract class C79959a implements C79946g.C79947a {

        /* renamed from: a */
        public final C79963e f234226a = new C79963e();

        /* renamed from: a */
        public abstract C79958t mo110143a(C79963e eVar);

        public C79946g createDataSource() {
            return mo110143a(this.f234226a);
        }
    }

    /* renamed from: c8.t$b */
    public static class C79960b extends IOException {
        public C79960b(String str, C79950j jVar, int i) {
            super(str);
        }

        public C79960b(IOException iOException, C79950j jVar, int i) {
            super(iOException);
        }

        public C79960b(String str, IOException iOException, C79950j jVar, int i) {
            super(str, iOException);
        }
    }

    /* renamed from: c8.t$c */
    public static final class C79961c extends C79960b {
        public C79961c(String str, C79950j jVar) {
            super("Invalid content type: " + str, jVar, 1);
        }
    }

    /* renamed from: c8.t$d */
    public static final class C79962d extends C79960b {

        /* renamed from: d */
        public final int f234227d;

        /* renamed from: e */
        public final Map<String, List<String>> f234228e;

        public C79962d(int i, Map<String, List<String>> map, C79950j jVar) {
            super("Response code: " + i, jVar, 1);
            this.f234227d = i;
            this.f234228e = map;
        }
    }

    /* renamed from: c8.t$e */
    public static final class C79963e {

        /* renamed from: a */
        public final Map<String, String> f234229a = new HashMap();

        /* renamed from: b */
        public Map<String, String> f234230b;
    }
}
