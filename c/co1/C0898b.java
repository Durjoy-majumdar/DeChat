package co1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import di3.C86312j;

/* renamed from: co1.b */
public final class C0898b {

    /* renamed from: a */
    public static final C0898b f2115a = new C0898b();

    /* renamed from: co1.b$a */
    public static final class C0899a {

        /* renamed from: a */
        public final boolean f2116a;

        /* renamed from: b */
        public final boolean f2117b;

        /* renamed from: c */
        public final int f2118c;

        public C0899a(boolean z, boolean z2, int i) {
            this.f2116a = z;
            this.f2117b = z2;
            this.f2118c = i;
        }

        /* renamed from: a */
        public final boolean mo786a() {
            return this.f2116a || this.f2117b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0899a)) {
                return false;
            }
            C0899a aVar = (C0899a) obj;
            return this.f2116a == aVar.f2116a && this.f2117b == aVar.f2117b && this.f2118c == aVar.f2118c;
        }

        public int hashCode() {
            boolean z = this.f2116a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f2117b;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + this.f2118c;
        }

        public String toString() {
            return "FirstBufferingConfig(onEnterPreload=" + this.f2116a + ", onFetchDonePreload=" + this.f2117b + ", preloadStage=" + this.f2118c + ')';
        }
    }

    /* renamed from: a */
    public final C0899a mo785a() {
        int i = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154540F;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? new C0899a(false, false, 1) : new C0899a(true, true, 0) : new C0899a(true, true, 1) : new C0899a(false, true, 0) : new C0899a(false, true, 1) : new C0899a(true, true, 1);
    }
}
