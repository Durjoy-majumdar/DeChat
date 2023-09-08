package e42;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import gy3.C87412m;

/* renamed from: e42.r */
public abstract class C86438r {

    /* renamed from: e42.r$a */
    public static final class C86439a extends C86438r {

        /* renamed from: a */
        public final C81415h0 f251234a;

        public C86439a(C81415h0 h0Var) {
            C87412m.m108594g(h0Var, "assetFs");
            this.f251234a = h0Var;
        }

        /* renamed from: a */
        public final C81415h0 mo120856a() {
            return this.f251234a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C86439a) && C87412m.m108589b(this.f251234a, ((C86439a) obj).f251234a);
        }

        public int hashCode() {
            return this.f251234a.hashCode();
        }

        public String toString() {
            return "AssetPkgFsDescriptor(assetFs=" + this.f251234a + ')';
        }
    }

    /* renamed from: e42.r$b */
    public static final class C86440b extends C86438r {

        /* renamed from: a */
        public final String f251235a;

        public C86440b(String str) {
            C87412m.m108594g(str, "wxaPath");
            this.f251235a = str;
        }

        /* renamed from: a */
        public final String mo120860a() {
            return this.f251235a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C86440b) && C87412m.m108589b(this.f251235a, ((C86440b) obj).f251235a);
        }

        public int hashCode() {
            return this.f251235a.hashCode();
        }

        public String toString() {
            return "FilePkgFsDescriptor(wxaPath=" + this.f251235a + ')';
        }
    }
}
