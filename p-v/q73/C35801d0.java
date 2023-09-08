package q73;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.webcompt.C44404a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;

/* renamed from: q73.d0 */
public final class C35801d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f95601d;

    /* renamed from: e */
    public final /* synthetic */ String f95602e;

    /* renamed from: f */
    public final /* synthetic */ int f95603f;

    public C35801d0(String str, String str2, int i) {
        this.f95601d = str;
        this.f95602e = str2;
        this.f95603f = i;
    }

    public final void run() {
        try {
            if (C86013q1.m106450k(this.f95601d)) {
                WxaPkg wxaPkg = new WxaPkg(this.f95601d);
                wxaPkg.mo63189b();
                String str = this.f95602e;
                int c = C44404a.m48766c(wxaPkg);
                int i = this.f95603f;
                C87412m.m108594g(str, "appId");
                C115669n.INSTANCE.mo160131h(20780, str, 0, Integer.valueOf(c), 0, Integer.valueOf(i), 1);
                return;
            }
            String str2 = this.f95602e;
            int i2 = this.f95603f;
            C87412m.m108594g(str2, "appId");
            C115669n.INSTANCE.mo160131h(20780, str2, 0, 0, 3, Integer.valueOf(i2), 1);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebCanvasStorageLogic", e, "readPkgVersionAndReport exception", new Object[0]);
        }
    }
}
