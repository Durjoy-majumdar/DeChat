package g02;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: g02.d */
public final class C32291d {

    /* renamed from: g02.d$a */
    public static final class C32292a extends C87413o implements C32226l<Bundle, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f85760d;

        /* renamed from: e */
        public final /* synthetic */ String f85761e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32292a(String str, String str2) {
            super(1);
            this.f85760d = str;
            this.f85761e = str2;
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, LocaleUtil.ITALIAN);
            C32291d.m39671d(bundle, this.f85760d, this.f85761e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final Bundle m39668a(C32293e... eVarArr) {
        C87412m.m108594g(eVarArr, "pairs");
        Bundle bundle = new Bundle();
        for (C32293e eVar : eVarArr) {
            eVar.getClass();
            eVar.f85762a.invoke(bundle);
        }
        return bundle;
    }

    /* renamed from: b */
    public static final C32293e m39669b(String str, String str2) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "value");
        return new C32293e(new C32292a(str, str2));
    }

    /* renamed from: c */
    public static final void m39670c(Bundle bundle, String str, int i) {
        C87412m.m108594g(bundle, "<this>");
        C87412m.m108594g(str, "key");
        bundle.putInt(str, i);
    }

    /* renamed from: d */
    public static final void m39671d(Bundle bundle, String str, String str2) {
        C87412m.m108594g(bundle, "<this>");
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "value");
        bundle.putString(str, str2);
    }
}
