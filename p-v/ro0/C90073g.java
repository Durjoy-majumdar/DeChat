package ro0;

import co0.C80123a;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p1066yc.C91412i;
import p1066yc.C91418n;
import p964fd.C86826e;

/* renamed from: ro0.g */
public final class C90073g extends C82268c {
    private static final int CTRL_INDEX = 819;
    public static final String NAME = "operateXWebVideoBackground";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81823b bVar = new C81823b(i, jSONObject, fVar, this);
        C80123a a = C91412i.m114704a(bVar);
        if (a == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOperateXWebVideoBackground", "audioOfVideoBackgroundPlayManager is null");
            fVar.mo109647a(i, mo115109j("fail:audioOfVideoBackgroundPlayManager is null"));
            return;
        }
        C91418n o = a.mo110370o();
        if (o == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOperateXWebVideoBackground", "videoPlayer is null");
            fVar.mo109647a(i, mo115109j("fail:videoPlayer is null"));
        } else if (!(o instanceof C86826e)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOperateXWebVideoBackground", "videoPlayer is not VideoPluginHandler");
            fVar.mo109647a(i, mo115109j("fail:videoPlayer is not for XwebVideo"));
        } else {
            ((C86826e) o).mo17969i(bVar);
        }
    }
}
