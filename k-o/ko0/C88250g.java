package ko0;

import co0.C80123a;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p1066yc.C91412i;
import p1066yc.C91418n;
import p292ad.C79502b;

/* renamed from: ko0.g */
public final class C88250g extends C82268c {
    private static final int CTRL_INDEX = 817;
    public static final String NAME = "operateXWebLivePlayerBackground";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81823b bVar = new C81823b(i, jSONObject, fVar, this);
        C80123a a = C91412i.m114704a(bVar);
        if (a == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOperateXWebLivePlayerBackground", "audioOfVideoBackgroundPlayManager is null");
            fVar.mo109647a(i, mo115109j("fail:audioOfVideoBackgroundPlayManager is null"));
            return;
        }
        C91418n o = a.mo110370o();
        if (o == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOperateXWebLivePlayerBackground", "videoPlayer is null");
            fVar.mo109647a(i, mo115109j("fail:videoPlayer is null"));
        } else if (!(o instanceof C79502b)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOperateXWebLivePlayerBackground", "videoPlayer is not LivePlayerPluginHandler");
            fVar.mo109647a(i, mo115109j("fail:videoPlayer is not for XWebLivePlayer"));
        } else {
            ((C79502b) o).mo17969i(bVar);
        }
    }
}
