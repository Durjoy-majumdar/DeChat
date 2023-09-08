package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.EnterFinderResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;
import org.json.JSONObject;
import pe3.C47465a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.a */
public final class C82291a extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.a$a */
    public static final class C82292a<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C82291a f241215a;

        public C82292a(C82291a aVar) {
            this.f241215a = aVar;
        }

        /* renamed from: a */
        public final void mo6382a(Object obj) {
            C82291a aVar = this.f241215a;
            EnterFinderResult.C82280a aVar2 = EnterFinderResult.CREATOR;
            C87412m.m108593f(obj, "retObj");
            aVar2.getClass();
            JSONObject jSONObject = null;
            C47465a aVar3 = obj instanceof C47465a ? (C47465a) obj : null;
            Object json = aVar3 != null ? aVar3.toJSON() : null;
            if (json instanceof JSONObject) {
                jSONObject = (JSONObject) json;
            }
            aVar.finishProcess(new EnterFinderResult(0, jSONObject));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.a$b */
    public static final class C82293b<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C82291a f241216a;

        public C82293b(C82291a aVar) {
            this.f241216a = aVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            C82291a aVar = this.f241216a;
            EnterFinderResult.C82280a aVar2 = EnterFinderResult.CREATOR;
            C87412m.m108593f(num, "ret");
            int intValue = num.intValue();
            aVar2.getClass();
            aVar.finishProcess(new EnterFinderResult(intValue, (JSONObject) null));
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        if (!(processRequest instanceof EnterFinderRequest)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "handleRequest#EnterFinderTask, request is not EnterFinderRequest");
            return;
        }
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        if (t1Var != null) {
            MMActivity activityContext = getActivityContext();
            C87412m.m108593f(activityContext, "activityContext");
            EnterFinderRequest enterFinderRequest = (EnterFinderRequest) processRequest;
            t1Var.mo76906zn(activityContext, enterFinderRequest.f241195e, enterFinderRequest.f241194d, new C82292a(this), new C82293b(this), (C60216z4.C8821a<JSONObject>) null);
        }
    }
}
