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

/* renamed from: ml0.r */
public class C88778r implements C84795y.C40572a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandLivePusherView f256197a;

    /* renamed from: b */
    public final /* synthetic */ String f256198b;

    public C88778r(C88780t tVar, AppBrandLivePusherView appBrandLivePusherView, String str) {
        this.f256197a = appBrandLivePusherView;
        this.f256198b = str;
    }

    /* renamed from: a */
    public void mo1966a(String str) {
        if (!Util.isNullOrNil(str)) {
            String a = C48380r.m53726a(str, false);
            Log.m105925i("MicroMsg.JsApiUpdateLivePusher", "convertFilterImageToLocalPath, targetPath:%s", a);
            Bundle bundle = new Bundle();
            bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, a);
            this.f256197a.mo114911g(bundle);
            return;
        }
        Log.m105924i("MicroMsg.JsApiUpdateLivePusher", "convertFilterImageToLocalPath, load background image fail");
        HashMap hashMap = new HashMap();
        hashMap.put("url", this.f256198b);
        this.f256197a.mo114908d(C86921f.f252339m, 10005, "load filter image fail", hashMap);
    }
}
