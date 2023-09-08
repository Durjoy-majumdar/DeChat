package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82341m;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import h81.C32735h;
import ke3.C88144b;
import p225rc.C89916g;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.n */
public class C82344n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JsApiChattingTask f241344d;

    /* renamed from: e */
    public final /* synthetic */ C83928t1 f241345e;

    /* renamed from: f */
    public final /* synthetic */ C82341m.C82343b f241346f;

    /* renamed from: g */
    public final /* synthetic */ C82341m f241347g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.n$a */
    public class C82345a implements g$$f {
        public C82345a() {
        }

        /* renamed from: b */
        public boolean mo1596b(int i, int i2, Intent intent) {
            C82344n nVar = C82344n.this;
            if (i != nVar.f241347g.f241340y) {
                return false;
            }
            C82341m.C82343b bVar = nVar.f241346f;
            if (bVar != null) {
                ((C82341m.C82342a) bVar).mo114729a(true, "ok", intent);
            }
            C82344n.this.f241344d.mo114397h();
            return true;
        }
    }

    public C82344n(C82341m mVar, JsApiChattingTask jsApiChattingTask, C83928t1 t1Var, C82341m.C82343b bVar) {
        this.f241347g = mVar;
        this.f241344d = jsApiChattingTask;
        this.f241345e = t1Var;
        this.f241346f = bVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact go to the customized chattingUI");
        Intent intent = new Intent();
        intent.setFlags(67108864);
        intent.putExtra("Chat_User", this.f241344d.f241245h);
        intent.putExtra("app_brand_chatting_from_scene", 2);
        intent.putExtra("key_temp_session_from", this.f241344d.f241243f);
        intent.putExtra("finish_direct", true);
        boolean z = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
        C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
        if (hVar != null) {
            z = hVar.mo58784wf(C32735h.C32737c.clicfg_android_appbrand_contact_support_send_video, z);
        }
        Log.m105924i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + z);
        if (!z) {
            intent.putExtra("key_need_send_video", false);
        }
        WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
        C82341m mVar = this.f241347g;
        bVar.f239557a = mVar.f241326h;
        bVar.f239560d = mVar.f241327i;
        bVar.f239566j = 5;
        intent.putExtra("app_brand_chatting_expose_params", bVar.mo113977a());
        intent.putExtra("keyPrivateAppId", this.f241347g.f241326h);
        intent.putExtra("keyPrivateUserName", this.f241347g.f241327i);
        intent.putExtra("keyPrivateTitle", this.f241347g.f241328j);
        intent.putExtra("keyPrivateSubTitle", this.f241347g.f241329n);
        intent.putExtra("keyPrivateHeadImage", this.f241347g.f241330o);
        int i = this.f241345e.getRuntime().mo113194Y1() ? 2 : 1;
        String R0 = this.f241345e.mo116163R0();
        String appId = this.f241345e.getAppId();
        Log.m105925i("MicroMsg.JsApiPrivateEnterContact", "doEnterChattingCustomized, scene: %d, sceneNote: %s, fromAppId: %s", Integer.valueOf(i), R0, appId);
        intent.putExtra("app_brand_chatting_from_scene_new", i);
        intent.putExtra("app_brand_chatting_from_scene_note_new", R0);
        intent.putExtra("app_brand_chatting_from_app_id", appId);
        Activity R = this.f241345e.getRuntime().mo113026R();
        if (R == null) {
            C82341m.C82343b bVar2 = this.f241346f;
            if (bVar2 != null) {
                ((C82341m.C82342a) bVar2).mo114729a(false, "fail:internal error invalid android context", (Intent) null);
            }
            Log.m105920e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact mmActivity is null, invoke fail!");
            return;
        }
        C89916g.m112446a(R).mo124232f(new C82345a());
        C88144b.m109802t(R, ".ui.chatting.AppBrandServiceChattingUI", intent, this.f241347g.f241340y);
    }
}
