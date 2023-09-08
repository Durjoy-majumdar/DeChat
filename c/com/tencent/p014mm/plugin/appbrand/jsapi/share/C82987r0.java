package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82388f7;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82976l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76879j;
import p645pj.C77092c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.r0 */
public final class C82987r0 extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.r0$a */
    public static final class C82988a extends C87413o implements C32226l<C82975k0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82987r0 f242648d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82988a(C82987r0 r0Var) {
            super(1);
            this.f242648d = r0Var;
        }

        public Object invoke(Object obj) {
            C82975k0 k0Var = (C82975k0) obj;
            C87412m.m108594g(k0Var, "shareResult");
            this.f242648d.finishProcess(new ShareToConversationResult(k0Var.f242615d));
            return C13598b0.f38549a;
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof ShareVideoToConversationRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "handleRequest, request is not ShareVideoToConversationRequest");
            return;
        }
        ShareVideoToConversationRequest shareVideoToConversationRequest = (ShareVideoToConversationRequest) processRequest;
        if (shareVideoToConversationRequest.f242578d.length() == 0) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "handleRequest, fail since videoPath is empty");
            finishProcess(new ShareToConversationResult(2));
            return;
        }
        int i = C82976l0.f242616a;
        MMActivity activityContext = getActivityContext();
        C87412m.m108593f(activityContext, "activityContext");
        String str = shareVideoToConversationRequest.f242578d;
        String str2 = shareVideoToConversationRequest.f242579e;
        C82988a aVar = new C82988a(this);
        C87412m.m108594g(str, "videoPath");
        C82981n0 n0Var = new C82981n0(aVar, str, str2, activityContext);
        int b = C82388f7.m101145b(str);
        Long l = null;
        if (b <= 0) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "isVideoLegal2Share, durationS: " + b);
            n0Var.invoke(Boolean.FALSE, (Object) null);
            return;
        }
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g()) {
            l = Long.valueOf(m1Var.mo119980r());
        }
        Log.m105918d("MicroMsg.AppBrand.JsApiShareVideoMessage", "isVideoLegal2Share, videoSize: " + l);
        if (l == null || 0 >= l.longValue()) {
            C76879j.m92754y(activityContext, activityContext.getString(C0966R.string.f66), "", activityContext.getString(C0966R.string.fmz), new C1869p0(n0Var));
        } else if (C77092c.m93048j() < l.longValue()) {
            C76879j.m92754y(activityContext, activityContext.getString(C0966R.string.f6r), "", activityContext.getString(C0966R.string.fmz), new C1870q0(n0Var));
        } else {
            n0Var.invoke(Boolean.TRUE, new C82976l0.C29538a(b));
        }
    }
}
