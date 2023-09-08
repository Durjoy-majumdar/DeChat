package xn0;

import br0.C39836d;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40477c;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xn0.i */
public final class C53435i extends C40477c {

    /* renamed from: a */
    public final /* synthetic */ C91304m f150335a;

    public C53435i(C91304m mVar) {
        this.f150335a = mVar;
    }

    public boolean onSetRequestedOrientation(int i) {
        C39836d F0 = this.f150335a.f261900e.mo116151F0();
        if (F0 == null) {
            Log.m105929w("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onSetRequestedOrientation hash[%d] NULL fullscreenImpl", Integer.valueOf(this.f150335a.hashCode()));
            return false;
        }
        F0.mo62477e(C39836d.C39837a.m42626a(i));
        return true;
    }
}
