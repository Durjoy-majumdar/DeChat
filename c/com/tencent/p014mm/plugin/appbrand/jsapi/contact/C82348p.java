package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82341m;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82967h0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import p225rc.C89916g;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.p */
public class C82348p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JsApiChattingTask f241354d;

    /* renamed from: e */
    public final /* synthetic */ C83928t1 f241355e;

    /* renamed from: f */
    public final /* synthetic */ C82341m.C82343b f241356f;

    /* renamed from: g */
    public final /* synthetic */ C82341m f241357g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.p$a */
    public class C82349a implements g$$f {
        public C82349a() {
        }

        /* renamed from: b */
        public boolean mo1596b(int i, int i2, Intent intent) {
            C82348p pVar = C82348p.this;
            if (i != pVar.f241357g.f241340y) {
                return false;
            }
            C82341m.C82343b bVar = pVar.f241356f;
            if (bVar != null) {
                ((C82341m.C82342a) bVar).mo114729a(true, "ok", intent);
            }
            C82348p.this.f241354d.mo114397h();
            return true;
        }
    }

    public C82348p(C82341m mVar, JsApiChattingTask jsApiChattingTask, C83928t1 t1Var, C82341m.C82343b bVar) {
        this.f241357g = mVar;
        this.f241354d = jsApiChattingTask;
        this.f241355e = t1Var;
        this.f241356f = bVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact go to the customized chattingUI");
        Intent intent = new Intent();
        intent.setFlags(67108864);
        intent.putExtra("Chat_User", this.f241354d.f241245h);
        intent.putExtra("app_brand_chatting_from_scene", 2);
        intent.putExtra("key_temp_session_from", this.f241354d.f241243f);
        intent.putExtra("finish_direct", true);
        WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
        C82341m mVar = this.f241357g;
        bVar.f239557a = mVar.f241326h;
        bVar.f239560d = mVar.f241332q;
        bVar.f239566j = 5;
        intent.putExtra("app_brand_chatting_expose_params", bVar.mo113977a());
        intent.putExtra("keyPrivateAppId", this.f241357g.f241326h);
        intent.putExtra("keyPrivateUserName", this.f241357g.f241327i);
        intent.putExtra("keyPrivateTitle", this.f241357g.f241328j);
        intent.putExtra("keyPrivateSubTitle", this.f241357g.f241329n);
        intent.putExtra("keyPrivateHeadImage", this.f241357g.f241330o);
        C82341m mVar2 = this.f241357g;
        if (mVar2.f241337v) {
            intent.putExtra("sendMessageTitle", mVar2.f241334s);
            intent.putExtra("sendMessagePath", this.f241357g.f241335t);
            intent.putExtra("sendMessageImg", this.f241357g.f241336u);
            intent.putExtra("sendMessageLocalImg", C82967h0.m101763b(this.f241357g.f241338w));
            intent.putExtra("needDelThumb", this.f241357g.f241339x);
        }
        intent.putExtra("showMessageCard", this.f241357g.f241337v);
        Activity R = this.f241355e.getRuntime().mo113026R();
        if (R == null) {
            C82341m.C82343b bVar2 = this.f241356f;
            if (bVar2 != null) {
                ((C82341m.C82342a) bVar2).mo114729a(false, "fail:internal error invalid android context", (Intent) null);
            }
            Log.m105920e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact mmActivity is null, invoke fail!");
            return;
        }
        C89916g.m112446a(R).mo124232f(new C82349a());
        C88144b.m109802t(R, ".ui.chatting.AppBrandServiceChattingUI", intent, this.f241357g.f241340y);
    }
}
