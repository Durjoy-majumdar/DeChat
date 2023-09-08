package qq0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import qq0.C89816t;

/* renamed from: qq0.a */
public interface C89790a {

    /* renamed from: qq0.a$a */
    public static class C89791a {

        /* renamed from: a */
        public static final C89790a f258170a = new C89792a();

        /* renamed from: qq0.a$a$a */
        public class C89792a implements C89790a {
            /* renamed from: b */
            public C89816t.C89818b mo124073b(C89793b bVar, boolean z, String str) {
                return C89816t.f258221F0;
            }

            /* renamed from: c */
            public int mo124074c() {
                return Integer.MIN_VALUE;
            }

            /* renamed from: e */
            public void mo124075e(String str) {
            }

            /* renamed from: f */
            public C89816t.C89818b mo124076f(C89793b bVar) {
                return C89816t.f258221F0;
            }
        }

        /* renamed from: a */
        public static C89790a m112271a(AppBrandRuntime appBrandRuntime) {
            return (appBrandRuntime == null || appBrandRuntime.mo113064k0() || appBrandRuntime.f238117P) ? f258170a : appBrandRuntime.f238159x.mo124088a();
        }
    }

    /* renamed from: qq0.a$b */
    public enum C89793b {
        LBS(C0966R.string.gk7, C0966R.C0969drawable.btx),
        VOICE(C0966R.string.gk8, C0966R.C0969drawable.btz);
        

        /* renamed from: d */
        public final int f258174d;

        /* renamed from: e */
        public final int f258175e;

        /* access modifiers changed from: public */
        C89793b(int i, int i2) {
            this.f258174d = i;
            this.f258175e = i2;
        }
    }

    /* renamed from: b */
    C89816t.C89818b mo124073b(C89793b bVar, boolean z, String str);

    /* renamed from: c */
    int mo124074c();

    /* renamed from: e */
    void mo124075e(String str);

    /* renamed from: f */
    C89816t.C89818b mo124076f(C89793b bVar);
}
