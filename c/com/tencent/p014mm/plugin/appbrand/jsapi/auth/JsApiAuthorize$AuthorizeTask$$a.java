package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import b30.C39724b;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import p209nt.C47296d;
import te3.C49158dk2;
import te3.C49713hj2;
import te3.C51458tw3;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$a */
public final /* synthetic */ class JsApiAuthorize$AuthorizeTask$$a implements C47296d.C47297a {

    /* renamed from: a */
    public final /* synthetic */ JsApiAuthorize$AuthorizeTask$$f f240797a;

    /* renamed from: b */
    public final /* synthetic */ int f240798b;

    public /* synthetic */ JsApiAuthorize$AuthorizeTask$$a(JsApiAuthorize$AuthorizeTask$$f jsApiAuthorize$AuthorizeTask$$f, int i) {
        this.f240797a = jsApiAuthorize$AuthorizeTask$$f;
        this.f240798b = i;
    }

    /* renamed from: a */
    public final void mo72338a(int i, int i2, String str, C47296d dVar) {
        JsApiAuthorize$AuthorizeTask$$f jsApiAuthorize$AuthorizeTask$$f = this.f240797a;
        int i3 = this.f240798b;
        boolean z = true;
        Log.m105919d("MicroMsg.JsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            ((JsApiAuthorize$AuthorizeTask$$b) jsApiAuthorize$AuthorizeTask$$f).mo114538a(-1, "confirm cgi fail");
        } else if (dVar == null) {
        } else {
            if (i3 == 2) {
                Log.m105918d("MicroMsg.JsApiAuthorize", "press reject button");
                return;
            }
            C49158dk2 dk22 = (C49158dk2) ((C39724b) dVar).f106583d.f127056b.f127083a;
            C49713hj2 hj22 = dk22.f132382d;
            int i4 = hj22.f134688d;
            String str2 = hj22.f134689e;
            Log.m105925i("MicroMsg.JsApiAuthorize", "stev NetSceneJSAuthorizeConfirm jsErrcode %d", Integer.valueOf(i4));
            if (i4 == 0) {
                LinkedList<C51458tw3> linkedList = dk22.f132383e;
                if (linkedList == null || linkedList.size() <= 0 || dk22.f132383e.get(0).f142457e == null) {
                    z = false;
                }
                MMAuthScopeRiskInfo mMAuthScopeRiskInfo = z ? new MMAuthScopeRiskInfo(dk22.f132383e.get(0).f142457e) : null;
                if (mMAuthScopeRiskInfo != null) {
                    JsApiAuthorize$AuthorizeTask$$b jsApiAuthorize$AuthorizeTask$$b = (JsApiAuthorize$AuthorizeTask$$b) jsApiAuthorize$AuthorizeTask$$f;
                    jsApiAuthorize$AuthorizeTask$$b.getClass();
                    Log.m105918d("MicroMsg.JsApiAuthorize", "onScopeRiskIntercepted !");
                    JsApiAuthorize.AuthorizeTask authorizeTask = jsApiAuthorize$AuthorizeTask$$b.f240799a;
                    authorizeTask.f240783r = "risk_intercepted";
                    authorizeTask.f240766H = mMAuthScopeRiskInfo;
                    authorizeTask.mo114394b();
                    return;
                }
                JsApiAuthorize$AuthorizeTask$$b jsApiAuthorize$AuthorizeTask$$b2 = (JsApiAuthorize$AuthorizeTask$$b) jsApiAuthorize$AuthorizeTask$$f;
                jsApiAuthorize$AuthorizeTask$$b2.getClass();
                Log.m105918d("MicroMsg.JsApiAuthorize", "onSuccess !");
                JsApiAuthorize.AuthorizeTask authorizeTask2 = jsApiAuthorize$AuthorizeTask$$b2.f240799a;
                authorizeTask2.f240783r = "ok";
                authorizeTask2.mo114394b();
                return;
            }
            Log.m105921e("MicroMsg.JsApiAuthorize", "onSceneEnd NetSceneJSAuthorizeConfirm ERROR %s", str2);
            ((JsApiAuthorize$AuthorizeTask$$b) jsApiAuthorize$AuthorizeTask$$f).mo114538a(i4, str2);
        }
    }
}
