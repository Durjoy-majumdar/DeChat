package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import ke3.C88144b;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.c */
public final class C82889c extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 559;
    private static final String NAME = "openUserProfile";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.c$a */
    public static final class C82890a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f242346a;

        /* renamed from: b */
        public final /* synthetic */ int f242347b;

        /* renamed from: c */
        public final /* synthetic */ C82889c f242348c;

        /* renamed from: d */
        public final /* synthetic */ String f242349d;

        /* renamed from: e */
        public final /* synthetic */ String f242350e;

        public C82890a(C82381f fVar, int i, C82889c cVar, String str, String str2) {
            this.f242346a = fVar;
            this.f242347b = i;
            this.f242348c = cVar;
            this.f242349d = str;
            this.f242350e = str2;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            ProfileResult profileResult = (ProfileResult) processResult;
            boolean z = true;
            Log.m105925i("MicroMsg.JsApiOpenUserProfile", "onReceiveResult resultCode:%d", Integer.valueOf(profileResult.f242335d));
            int i = profileResult.f242335d;
            if (i == 0) {
                this.f242346a.mo109647a(this.f242347b, this.f242348c.mo115109j("fail"));
            } else if (i == 1) {
                Intent intent = new Intent();
                if (!Util.isNullOrNil(this.f242349d)) {
                    intent.putExtra("key_add_contact_report_info", this.f242349d);
                }
                if ((profileResult.f242336e & 1) == 0) {
                    z = false;
                }
                if (!z) {
                    intent.putExtra("Contact_User", this.f242350e);
                    C88144b.m109791i(this.f242346a.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                    this.f242346a.mo109647a(this.f242347b, this.f242348c.mo115109j("ok"));
                    return;
                }
                Log.m105924i("MicroMsg.JsApiOpenUserProfile", "onReceiveResult, fail:not user contact");
                this.f242346a.mo109647a(this.f242347b, this.f242348c.mo115109j("fail:not user contact"));
            } else if (i != 2) {
                this.f242346a.mo109647a(this.f242347b, this.f242348c.mo115109j("fail"));
            } else {
                this.f242346a.mo109647a(this.f242347b, this.f242348c.mo115109j("cancel"));
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
        C81956c.m100675c(fVar.getContext(), profileRequest, new C82890a(fVar, i, this, optString2, optString), (Intent) null);
    }
}
