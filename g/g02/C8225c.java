package g02;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: g02.c */
public final class C8225c extends C87413o implements C32226l<Bundle, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f27150d;

    /* renamed from: e */
    public final /* synthetic */ long f27151e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8225c(String str, long j) {
        super(1);
        this.f27150d = str;
        this.f27151e = j;
    }

    public Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        C87412m.m108594g(bundle, LocaleUtil.ITALIAN);
        String str = this.f27150d;
        long j = this.f27151e;
        C87412m.m108594g(str, "key");
        bundle.putLong(str, j);
        return C13598b0.f38549a;
    }
}
