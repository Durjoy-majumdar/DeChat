package com.tencent.p014mm.plugin.appbrand.jsapi;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import kr0.C88262c1;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i5 */
public final class C82543i5 extends C82268c<C82381f> {
    @Deprecated
    public static final int CTRL_INDEX = 678;
    @Deprecated
    public static final String NAME = "predownloadMiniProgramPackage";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i5$a */
    public static final class C82544a implements C88262c1.C88263a {

        /* renamed from: a */
        public final /* synthetic */ String f241635a;

        /* renamed from: b */
        public final /* synthetic */ String f241636b;

        /* renamed from: c */
        public final /* synthetic */ int f241637c;

        /* renamed from: d */
        public final /* synthetic */ C82381f f241638d;

        /* renamed from: e */
        public final /* synthetic */ int f241639e;

        /* renamed from: f */
        public final /* synthetic */ C82543i5 f241640f;

        public C82544a(String str, String str2, int i, C82381f fVar, int i2, C82543i5 i5Var) {
            this.f241635a = str;
            this.f241636b = str2;
            this.f241637c = i;
            this.f241638d = fVar;
            this.f241639e = i2;
            this.f241640f = i5Var;
        }

        /* renamed from: a */
        public final void mo113616a(C88262c1.C88265c cVar) {
            Log.m105924i("MicroMsg.AppBrand.JsApiPredownloadMiniProgramPackage", "preDownload appId:" + this.f241635a + " moduleName:" + this.f241636b + " scene:" + this.f241637c + " result:" + cVar);
            if (cVar == C88262c1.C88265c.Success_AllPkgDownloaded || cVar == C88262c1.C88265c.Success_AllPkgDownloadedPrevious || cVar == C88262c1.C88265c.Success_NoNeedGetCode) {
                this.f241638d.mo109647a(this.f241639e, this.f241640f.mo115109j("ok"));
            } else {
                this.f241638d.mo109647a(this.f241639e, this.f241640f.mo115109j("fail"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i5$b */
    public static final class C82545b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241641d;

        /* renamed from: e */
        public final /* synthetic */ C88262c1.C88264b f241642e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82545b(C82381f fVar, C88262c1.C88264b bVar) {
            super(0);
            this.f241641d = fVar;
            this.f241642e = bVar;
        }

        public Object invoke() {
            C39623j lifecycle;
            C0125s lifecycleOwner = this.f241641d.getLifecycleOwner();
            if (!(lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null)) {
                lifecycle.addObserver(new C81997x630d84e7(this.f241642e));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (jSONObject != null && fVar != null) {
            Log.m105924i("MicroMsg.AppBrand.JsApiPredownloadMiniProgramPackage", "invoke with appId:" + fVar.getAppId() + ", data:" + jSONObject + ", callbackId:" + i);
            String optString = jSONObject.optString("username");
            String optString2 = jSONObject.optString("appId");
            boolean z = true;
            if (optString == null || optString.length() == 0) {
                if (!(optString2 == null || optString2.length() == 0)) {
                    z = false;
                }
                if (z) {
                    fVar.mo109647a(i, mo115109j("fail:invalid data"));
                    return;
                }
            }
            String optString3 = jSONObject.optString("path");
            String optString4 = jSONObject.optString("moduleName");
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            C88262c1.C88264b bVar = new C88262c1.C88264b();
            bVar.f255110a = optString;
            bVar.f255111b = optString2;
            bVar.f255113d = optString3;
            bVar.f255114e = optString4;
            bVar.f255112c = optInt;
            bVar.f255115f = new C82544a(optString2, optString4, optInt, fVar, i, this);
            CommonKt.uiThread(new C82545b(fVar, bVar));
            ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113585cs(bVar);
        }
    }
}
