package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.b */
public final class C82887b extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 560;
    private static final String NAME = "openBizProfile";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.b$a */
    public static final class C82888a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f242340a;

        /* renamed from: b */
        public final /* synthetic */ int f242341b;

        /* renamed from: c */
        public final /* synthetic */ C82887b f242342c;

        /* renamed from: d */
        public final /* synthetic */ String f242343d;

        /* renamed from: e */
        public final /* synthetic */ int f242344e;

        /* renamed from: f */
        public final /* synthetic */ String f242345f;

        public C82888a(C82381f fVar, int i, C82887b bVar, String str, int i2, String str2) {
            this.f242340a = fVar;
            this.f242341b = i;
            this.f242342c = bVar;
            this.f242343d = str;
            this.f242344e = i2;
            this.f242345f = str2;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            ProfileResult profileResult = (ProfileResult) processResult;
            if (profileResult == null) {
                Log.m105920e("MicroMsg.JsApiOpenBizProfile", "onReceiveResult, null result");
                this.f242340a.mo109647a(this.f242341b, this.f242342c.mo115109j("fail"));
                return;
            }
            boolean z = false;
            Log.m105925i("MicroMsg.JsApiOpenBizProfile", "onReceiveResult resultCode:%d", Integer.valueOf(profileResult.f242335d));
            int i = profileResult.f242335d;
            if (i == 0) {
                this.f242340a.mo109647a(this.f242341b, this.f242342c.mo115109j("fail"));
            } else if (i == 1) {
                Intent intent = new Intent();
                if (!Util.isNullOrNil(this.f242343d)) {
                    intent.putExtra("key_add_contact_report_info", this.f242343d);
                }
                if ((profileResult.f242336e & 1) != 0) {
                    z = true;
                }
                if (z) {
                    intent.putExtra("Contact_Scene", this.f242344e);
                    intent.putExtra("Contact_User", this.f242345f);
                    intent.putExtra("key_use_new_contact_profile", true);
                    C82381f fVar = this.f242340a;
                    fVar.mo109670o(new C1837a(fVar, intent), 100);
                    this.f242340a.mo109647a(this.f242341b, this.f242342c.mo115109j("ok"));
                    return;
                }
                Log.m105924i("MicroMsg.JsApiOpenBizProfile", "onReceiveResult, fail:not biz contact");
                this.f242340a.mo109647a(this.f242341b, this.f242342c.mo115109j("fail:not biz contact"));
            } else if (i != 2) {
                this.f242340a.mo109647a(this.f242341b, this.f242342c.mo115109j("fail"));
            } else {
                this.f242340a.mo109647a(this.f242341b, this.f242342c.mo115109j("cancel"));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(jSONObject, "data");
        String optString = jSONObject.optString("username");
        int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 122);
        String optString2 = jSONObject.optString("profileReportInfo");
        if (Util.isNullOrNil(optString)) {
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        ProfileRequest profileRequest = new ProfileRequest();
        profileRequest.f242333d = optString;
        profileRequest.f242334e = optInt;
        C81956c.m100675c(fVar.getContext(), profileRequest, new C82888a(fVar, i, this, optString2, optInt, optString), (Intent) null);
    }
}
