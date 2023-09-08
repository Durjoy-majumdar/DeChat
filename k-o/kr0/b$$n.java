package kr0;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import xk0.C91259a;

public class b$$n {

    /* renamed from: a */
    public final /* synthetic */ C88256b f255108a;

    public b$$n(C88256b bVar, b$$e b__e) {
        this.f255108a = bVar;
    }

    @JavascriptInterface
    public int exec(int i) {
        try {
            C91259a.C91262c cVar = C91259a.f261849c.mo125282a(((C88267e) this.f255108a.mo124764Z()).getAppId()).f261852b.get(Integer.valueOf(i));
            C87412m.m108591d(cVar);
            return cVar.f261854a.getVirtualElementId();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", e, "MagicBrushViewIdTransfer failed. [%d] [%s]", Integer.valueOf(i), ((C88267e) this.f255108a.mo124764Z()).getAppId());
            return -1;
        }
    }
}
