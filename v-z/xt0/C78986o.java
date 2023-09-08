package xt0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import sx3.C110823p;

/* renamed from: xt0.o */
public class C78986o {

    /* renamed from: a */
    public final Object[] f231938a;

    /* renamed from: xt0.o$a */
    public static final class C78987a extends C87413o implements C32226l<Object, CharSequence> {

        /* renamed from: d */
        public static final C78987a f231939d = new C78987a();

        public C78987a() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r1 = r1.toString();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r1) {
            /*
                r0 = this;
                if (r1 == 0) goto L_0x0009
                java.lang.String r1 = r1.toString()
                if (r1 == 0) goto L_0x0009
                goto L_0x000b
            L_0x0009:
                java.lang.String r1 = ""
            L_0x000b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: xt0.C78986o.C78987a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C78986o(Object... objArr) {
        C87412m.m108594g(objArr, "args");
        this.f231938a = objArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.recent.QueryCacheConfig");
        return Arrays.equals(this.f231938a, ((C78986o) obj).f231938a);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return C110823p.m150987M(this.f231938a, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C78987a.f231939d, 31, (Object) null);
    }
}
