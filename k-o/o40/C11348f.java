package o40;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: o40.f */
public interface C11348f {

    /* renamed from: o40.f$a */
    public static final class C11349a {

        /* renamed from: o40.f$a$a */
        public static final class C11350a extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C11350a f33441d = new C11350a();

            public C11350a() {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return "";
            }
        }

        /* renamed from: o40.f$a$b */
        public static final class C11351b extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C11351b f33442d = new C11351b();

            public C11351b() {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return "";
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m11177a(C11348f fVar, String str, boolean z, C11352b bVar, boolean z2, boolean z3, C32224a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    bVar = C11352b.TRICK;
                }
                C11352b bVar2 = bVar;
                boolean z4 = (i & 8) != 0 ? true : z2;
                boolean z5 = (i & 16) != 0 ? false : z3;
                if ((i & 32) != 0) {
                    aVar = C11350a.f33441d;
                }
                fVar.mo11369a(str, z, bVar2, z4, z5, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: assertFalse");
        }

        /* renamed from: b */
        public static /* synthetic */ void m11178b(C11348f fVar, String str, boolean z, C11352b bVar, boolean z2, boolean z3, C32224a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    bVar = C11352b.TRICK;
                }
                C11352b bVar2 = bVar;
                boolean z4 = (i & 8) != 0 ? true : z2;
                boolean z5 = (i & 16) != 0 ? false : z3;
                if ((i & 32) != 0) {
                    aVar = C11351b.f33442d;
                }
                fVar.mo11370b(str, z, bVar2, z4, z5, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: assertTrue");
        }
    }

    /* renamed from: o40.f$b */
    public enum C11352b {
        TRICK(0),
        WARNING(1);
        

        /* renamed from: d */
        public final int f33446d;

        /* access modifiers changed from: public */
        C11352b(int i) {
            this.f33446d = i;
        }

        /* renamed from: a */
        public final int mo11371a() {
            return this.f33446d;
        }
    }

    /* renamed from: a */
    void mo11369a(String str, boolean z, C11352b bVar, boolean z2, boolean z3, C32224a<String> aVar);

    /* renamed from: b */
    void mo11370b(String str, boolean z, C11352b bVar, boolean z2, boolean z3, C32224a<String> aVar);
}
