package ml0;

import android.os.Bundle;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p823sg.C48380r;

/* renamed from: ml0.s */
public class C88779s implements C84795y.C40572a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandLivePusherView f256199a;

    public C88779s(C88780t tVar, AppBrandLivePusherView appBrandLivePusherView) {
        this.f256199a = appBrandLivePusherView;
    }

    /* renamed from: a */
    public void mo1966a(String str) {
        if (!Util.isNullOrNil(str)) {
            String a = C48380r.m53726a(str, false);
            Log.m105925i("MicroMsg.JsApiUpdateLivePusher", "convertWatermarkImageToLocalPath, targetPath:%s", a);
            Bundle bundle = new Bundle();
            bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE, a);
            this.f256199a.mo114911g(bundle);
        }
    }
}
