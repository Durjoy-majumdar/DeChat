package l22;

import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C1895m;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55527g;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55529k;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55531o;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C83067i;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashMap;
import p244tt.C14091f;
import tm0.C14044y;

/* renamed from: l22.c */
public class C10455c {

    /* renamed from: a */
    public HashMap<String, Class> f31686a = new HashMap<>();

    public C10455c() {
        long currentTimeMillis = System.currentTimeMillis();
        ((C14091f) C86312j.m106911c(C14091f.class)).mo13140BL();
        mo10773a("scanQRCode");
        mo10773a(JsApiChooseImage.NAME);
        mo10773a(JsApiChooseMedia.NAME);
        mo10773a("getLocalImgData");
        mo10773a("closeWindowAndGoNext");
        mo10773a(JsApiAddDownloadTask.NAME);
        mo10773a("launchGameVideoEditor");
        mo10773a("chooseHaowanMedia");
        mo10773a("publishHaowanEdition");
        mo10773a("queryHaowanPublish");
        mo10773a("imagePreview");
        mo10773a("mmsf0001");
        mo10773a("launch3rdApp");
        mo10773a("deleteAccountSuccess");
        mo10773a("internelWxFaceVerify");
        mo10773a("openSecurityView");
        mo10773a("privateCommonApi");
        mo10773a("openUrlWithExtraWebview");
        mo10773a("openSpecificView");
        mo10773a(C55529k.NAME);
        mo10773a(C55531o.NAME);
        mo10773a(C55527g.NAME);
        mo10773a(C83067i.NAME);
        mo10773a("verifyWCPayPassword");
        mo10773a("requestWxFacePictureVerify");
        mo10773a("openLiveIncome");
        mo10773a("openLiveLottery");
        mo10773a("getUserConfig");
        mo10773a("cleanFinderRedDot");
        mo10773a("getFinderRedDot");
        mo10773a("getLocalImgData");
        mo10773a(C14044y.NAME);
        mo10773a("openCustomerServiceChat");
        mo10773a("openLiteApp");
        mo10773a(C1895m.NAME);
        Log.m105925i("LiteAppJsApiBridgeWebViewJsApiPool", "init WebViewServiceJsApiPool takes %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: a */
    public final void mo10773a(String str) {
        this.f31686a.put(str, C10451a.class);
    }
}
