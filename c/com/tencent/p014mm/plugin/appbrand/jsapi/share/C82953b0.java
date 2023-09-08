package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1675e7;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76879j;
import p645pj.C77092c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.b0 */
public final class C82953b0 extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.b0$a */
    public static final class C82954a extends C87413o implements C32226l<C82975k0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82953b0 f242581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82954a(C82953b0 b0Var) {
            super(1);
            this.f242581d = b0Var;
        }

        public Object invoke(Object obj) {
            C82975k0 k0Var = (C82975k0) obj;
            C87412m.m108594g(k0Var, "shareResult");
            this.f242581d.finishProcess(new ShareToConversationResult(k0Var.f242615d));
            return C13598b0.f38549a;
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof ShareFileToConversationRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareFileMessage", "handleRequest, request is not ShareFileToConversationRequest");
            return;
        }
        ShareFileToConversationRequest shareFileToConversationRequest = (ShareFileToConversationRequest) processRequest;
        if (shareFileToConversationRequest.f242571d.length() == 0) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareFileMessage", "handleRequest, fail since filePath is empty");
            finishProcess(new ShareToConversationResult(2));
            return;
        }
        String a = C1675e7.m1724a(shareFileToConversationRequest.f242571d, shareFileToConversationRequest.f242572e, shareFileToConversationRequest.f242573f);
        int i = C82952a0.f242580a;
        MMActivity activityContext = getActivityContext();
        C87412m.m108593f(activityContext, "activityContext");
        String str = shareFileToConversationRequest.f242571d;
        C82954a aVar = new C82954a(this);
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(a, DownloadInfo.FILENAME);
        C82995x xVar = new C82995x(aVar, activityContext, a, str);
        C86009m1 m1Var = new C86009m1(str);
        Long valueOf = m1Var.mo119967g() ? Long.valueOf(m1Var.mo119980r()) : null;
        Log.m105918d("MicroMsg.AppBrand.JsApiShareFileMessage", "isFileLegal2Share, fileSize: " + valueOf);
        if (valueOf == null || 0 >= valueOf.longValue()) {
            C76879j.m92754y(activityContext, activityContext.getString(C0966R.string.cr_), "", activityContext.getString(C0966R.string.fmz), new C1871y(xVar, valueOf));
            return;
        }
        long i2 = C77092c.m93047i();
        if (i2 < valueOf.longValue()) {
            C76879j.m92754y(activityContext, activityContext.getString(C0966R.string.a57, new Object[]{Util.getSizeKB(i2)}), "", activityContext.getString(C0966R.string.fmz), new C1872z(xVar, valueOf));
        } else {
            xVar.invoke(Boolean.TRUE, valueOf);
        }
    }
}
