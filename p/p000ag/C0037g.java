package p000ag;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ag.g */
public final class C0037g extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public static final C0037g f44d = new C0037g();

    public C0037g() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "playableLibrary injected: " + str);
        return C13598b0.f38549a;
    }
}
