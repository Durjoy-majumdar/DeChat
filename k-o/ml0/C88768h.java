package ml0;

import android.os.Bundle;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView;
import com.tencent.p014mm.plugin.appbrand.jsapi.live.C82618a;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p823sg.C48380r;

/* renamed from: ml0.h */
public class C88768h implements C84795y.C40572a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandLivePusherView f256185a;

    public C88768h(C82618a aVar, AppBrandLivePusherView appBrandLivePusherView) {
        this.f256185a = appBrandLivePusherView;
    }

    /* renamed from: a */
    public void mo1966a(String str) {
        if (!Util.isNullOrNil(str)) {
            String a = C48380r.m53726a(str, false);
            Log.m105925i("MicroMsg.JsApiInsertLivePusher", "convertWatermarkImageToLocalPath, localPath:%s", a);
            Bundle bundle = new Bundle();
            bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE, a);
            this.f256185a.mo114911g(bundle);
        }
    }
}
