package sp0;

import android.net.ConnectivityManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: sp0.d0 */
public final class C13755d0 extends C87413o implements C32224a<ConnectivityManager> {

    /* renamed from: d */
    public static final C13755d0 f38856d = new C13755d0();

    public C13755d0() {
        super(0);
    }

    public Object invoke() {
        Object systemService = MMApplicationContext.getContext().getSystemService("connectivity");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }
}
