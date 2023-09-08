package g42;

import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j52.C87879c;
import rx3.C13598b0;

/* renamed from: g42.d */
public final class C87146d extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public static final C87146d f252741d = new C87146d();

    public C87146d() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        Log.m105920e("MagicBrushClientMgr", "remote exception: " + str);
        IMagicBrushMonitor.C85281a.m105255c(C87879c.f254379e, "magicbrush", "remoteException-IMBServerMgr", str, (String) null, 8, (Object) null);
        return C13598b0.f38549a;
    }
}
