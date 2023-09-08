package ml0;

import android.os.Bundle;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86921f;
import java.util.HashMap;
import p823sg.C48380r;

/* renamed from: ml0.q */
public class C88777q implements C84795y.C40572a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandLivePusherView f256195a;

    /* renamed from: b */
    public final /* synthetic */ String f256196b;

    public C88777q(C88780t tVar, AppBrandLivePusherView appBrandLivePusherView, String str) {
        this.f256195a = appBrandLivePusherView;
        this.f256196b = str;
    }

    /* renamed from: a */
    public void mo1966a(String str) {
        if (!Util.isNullOrNil(str)) {
            String a = C48380r.m53726a(str, false);
            Log.m105925i("MicroMsg.JsApiUpdateLivePusher", "convertBackgroundImageToLocalPath, targetPath:%s", a);
            Bundle bundle = new Bundle();
            bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE, a);
            this.f256195a.mo114911g(bundle);
            return;
        }
        Log.m105924i("MicroMsg.JsApiUpdateLivePusher", "convertBackgroundImageToLocalPath, load background image fail");
        HashMap hashMap = new HashMap();
        hashMap.put("url", this.f256196b);
        this.f256195a.mo114908d(C86921f.f252339m, 10004, "load background image fail", hashMap);
    }
}
