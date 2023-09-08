package g02;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: g02.b */
public final class C32290b extends C87413o implements C32226l<Bundle, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f85758d;

    /* renamed from: e */
    public final /* synthetic */ int f85759e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32290b(String str, int i) {
        super(1);
        this.f85758d = str;
        this.f85759e = i;
    }

    public Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        C87412m.m108594g(bundle, LocaleUtil.ITALIAN);
        C32291d.m39670c(bundle, this.f85758d, this.f85759e);
        return C13598b0.f38549a;
    }
}
