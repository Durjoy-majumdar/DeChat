package ux0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ux0.d */
public final class C14390d extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public static final C14390d f39962d = new C14390d();

    public C14390d() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        Log.m105918d("MicroMsg.GamePrefetchJsCoreAdapter", "[game-web-prefetch] initSystemInfo result: " + str);
        return C13598b0.f38549a;
    }
}
