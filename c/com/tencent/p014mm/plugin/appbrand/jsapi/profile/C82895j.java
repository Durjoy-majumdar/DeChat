package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import ke3.C88144b;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.j */
public final class C82895j extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 508;
    private static final String NAME = "profile";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.j$a */
    public static final class C82896a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f242354a;

        /* renamed from: b */
        public final /* synthetic */ int f242355b;

        /* renamed from: c */
        public final /* synthetic */ C82895j f242356c;

        /* renamed from: d */
        public final /* synthetic */ String f242357d;

        /* renamed from: e */
        public final /* synthetic */ int f242358e;

        /* renamed from: f */
        public final /* synthetic */ String f242359f;

        /* renamed from: g */
        public final /* synthetic */ String f242360g;

        public C82896a(C82381f fVar, int i, C82895j jVar, String str, int i2, String str2, String str3) {
            this.f242354a = fVar;
            this.f242355b = i;
            this.f242356c = jVar;
            this.f242357d = str;
            this.f242358e = i2;
            this.f242359f = str2;
            this.f242360g = str3;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            ProfileResult profileResult = (ProfileResult) processResult;
            boolean z = false;
            if (profileResult == null) {
                Log.m105920e("MicroMsg.JsApiProfile", "onReceiveResult get NULL result");
                C82381f fVar = this.f242354a;
                int i = this.f242355b;
                C82895j jVar = this.f242356c;
                jVar.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                fVar.mo109647a(i, jVar.mo115115p("fail:internal error", jSONObject));
                return;
            }
            Log.m105925i("MicroMsg.JsApiProfile", "onReceiveResult resultCode:%d", Integer.valueOf(profileResult.f242335d));
            int i2 = profileResult.f242335d;
            if (i2 == 0) {
                this.f242354a.mo109647a(this.f242355b, this.f242356c.mo115109j("fail"));
            } else if (i2 == 1) {
                Intent intent = new Intent();
                if (!Util.isNullOrNil(this.f242357d)) {
                    intent.putExtra("key_add_contact_report_info", this.f242357d);
                }
                if ((profileResult.f242336e & 1) != 0) {
                    intent.putExtra("Contact_Scene", this.f242358e);
                }
                String str = this.f242359f;
                C87412m.m108593f(str, "tabTypeStr");
                if (str.length() > 0) {
                    z = true;
                }
                if (z && Util.safeParseInt(this.f242359f) == 2) {
                    intent.putExtra("biz_profile_tab_type", 1);
                }
                intent.putExtra("Contact_User", this.f242360g);
                intent.putExtra("key_use_new_contact_profile", true);
                C88144b.m109791i(this.f242354a.getContext(), "profile", ".ui.ContactInfoUI", intent, (Bundle) null);
                this.f242354a.mo109647a(this.f242355b, this.f242356c.mo115109j("ok"));
            } else if (i2 != 2) {
                this.f242354a.mo109647a(this.f242355b, this.f242356c.mo115109j("fail"));
            } else {
                this.f242354a.mo109647a(this.f242355b, this.f242356c.mo115109j("cancel"));
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
        String optString3 = jSONObject.optString("tabType");
        if (Util.isNullOrNil(optString)) {
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        ProfileRequest profileRequest = new ProfileRequest();
        profileRequest.f242333d = optString;
        profileRequest.f242334e = optInt;
        C81956c.m100675c(fVar.getContext(), profileRequest, new C82896a(fVar, i, this, optString2, optInt, optString3, optString), (Intent) null);
    }
}
