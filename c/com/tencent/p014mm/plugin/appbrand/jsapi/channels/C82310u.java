package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.u */
public final class C82310u extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.u$a */
    public static final class C82311a<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ boolean f241233a;

        /* renamed from: b */
        public final /* synthetic */ C82310u f241234b;

        public C82311a(boolean z, C82310u uVar) {
            this.f241233a = z;
            this.f241234b = uVar;
        }

        /* renamed from: a */
        public final void mo6382a(Object obj) {
            OpenFinderFeedResult.CREATOR.getClass();
            OpenFinderFeedResult openFinderFeedResult = new OpenFinderFeedResult(C82317w.OpenResult, 0, new JSONObject());
            if (this.f241233a) {
                this.f241234b.sendResult(openFinderFeedResult);
            } else {
                this.f241234b.finishProcess(openFinderFeedResult);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.u$b */
    public static final class C82312b<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C82310u f241235a;

        public C82312b(C82310u uVar) {
            this.f241235a = uVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            C82310u uVar = this.f241235a;
            OpenFinderFeedResult.C82288a aVar = OpenFinderFeedResult.CREATOR;
            C87412m.m108593f(num, "openErrCode");
            int intValue = num.intValue();
            aVar.getClass();
            uVar.finishProcess(new OpenFinderFeedResult(C82317w.OpenResult, intValue, new JSONObject()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.u$c */
    public static final class C82313c<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C82310u f241236a;

        public C82313c(C82310u uVar) {
            this.f241236a = uVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C82310u uVar = this.f241236a;
            OpenFinderFeedResult.C82288a aVar = OpenFinderFeedResult.CREATOR;
            C87412m.m108593f(jSONObject, "navigateBackInfo");
            aVar.getClass();
            uVar.finishProcess(new OpenFinderFeedResult(C82317w.NavigateBackResult, 0, jSONObject));
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof OpenFinderFeedRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "handleRequest#OpenFinderFeedTask, request is not EnterFinderRequest");
            return;
        }
        OpenFinderFeedRequest openFinderFeedRequest = (OpenFinderFeedRequest) processRequest;
        boolean optBoolean = openFinderFeedRequest.f241208d.optBoolean("notifyOnBack", false);
        Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "needNavigateBackEvent: " + optBoolean);
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        if (t1Var != null) {
            MMActivity activityContext = getActivityContext();
            C87412m.m108593f(activityContext, "activityContext");
            t1Var.mo76906zn(activityContext, false, openFinderFeedRequest.f241208d.toString(), new C82311a(optBoolean, this), new C82312b(this), new C82313c(this));
        }
    }
}
