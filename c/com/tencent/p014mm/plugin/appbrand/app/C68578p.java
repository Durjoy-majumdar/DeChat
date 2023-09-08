package com.tencent.p014mm.plugin.appbrand.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import ke3.C88144b;
import kr0.C76629w0;
import kr0.C76633z0;

/* renamed from: com.tencent.mm.plugin.appbrand.app.p */
public final class C68578p implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ String f197004a;

    /* renamed from: b */
    public final /* synthetic */ C76633z0.C10404a f197005b;

    /* renamed from: c */
    public final /* synthetic */ int f197006c;

    /* renamed from: d */
    public final /* synthetic */ String f197007d;

    /* renamed from: e */
    public final /* synthetic */ Context f197008e;

    public C68578p(String str, C76633z0.C10404a aVar, int i, String str2, Context context) {
        this.f197004a = str;
        this.f197005b = aVar;
        this.f197006c = i;
        this.f197007d = str2;
        this.f197008e = context;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes == null) {
            C76633z0.C10404a aVar = this.f197005b;
            if (aVar != null) {
                aVar.mo5695a(-2, "Invalid wxaAttributes");
                return;
            }
            return;
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f197004a);
        if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
            C81161g2.Cx0().mo125055uP(wxaAttributes);
        }
        Intent intent = new Intent();
        String str = this.f197004a;
        int i = this.f197006c;
        String str2 = this.f197007d;
        Context context = this.f197008e;
        C76633z0.C10404a aVar2 = this.f197005b;
        intent.putExtra("Chat_User", str);
        intent.putExtra("app_brand_chatting_from_scene", 2);
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
        intent.putExtra("enableAnimation", true);
        intent.putExtra("app_brand_chatting_from_scene_new", i);
        WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
        bVar.f239557a = str2;
        bVar.f239560d = str;
        bVar.f239564h = 0;
        intent.putExtra("app_brand_chatting_expose_params", bVar.mo113977a());
        intent.putExtra("showMessageCard", false);
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
        if (castActivityOrNull == null) {
            intent.addFlags(268435456);
        }
        if (castActivityOrNull != null) {
            context = castActivityOrNull;
        } else if (context == null) {
            context = MMApplicationContext.getContext();
        }
        C88144b.m109801s(context, ".ui.chatting.AppBrandServiceChattingUI", intent, (Bundle) null);
        if (aVar2 != null) {
            aVar2.mo5695a(0, (String) null);
        }
    }
}
