package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.game.luggage.page.C41948f;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ke3.C88144b;
import org.json.JSONObject;
import p828wa.C53096b;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.x1 */
public class C4550x1 extends C5954n2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.x1$a */
    public class C4551a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ String f19298d;

        /* renamed from: e */
        public final /* synthetic */ C41948f f19299e;

        /* renamed from: f */
        public final /* synthetic */ C53096b.C53097a f19300f;

        public C4551a(C4550x1 x1Var, String str, C41948f fVar, C53096b.C53097a aVar) {
            this.f19298d = str;
            this.f19299e = fVar;
            this.f19300f = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (!Util.isNullOrNil(this.f19298d)) {
                this.f19299e.mo65830n0(this.f19298d);
            }
            this.f19300f.mo73776a();
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.x1$b */
    public static class C4552b implements C80883e<Bundle, Bundle> {
        private C4552b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_ENTRANCE_MSG_TAB_TYPE_INT_SYNC, Integer.valueOf(((Bundle) obj).getInt("chatVcSelectTab")));
            gVar.mo894a(new Bundle());
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "switchToGameTab";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
        Log.m105924i("MicroMsg.JsApiSwitchToGameTab", "invokeInOwn");
        JSONObject jSONObject = aVar.f148190b.f129368c;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiSwitchToGameTab", "data is null");
            aVar.mo73778c("null_data", (JSONObject) null);
            return;
        }
        CONTEXT context = aVar.f148189a;
        Context context2 = ((GameWebPage) context).f148196d;
        C41948f fVar = ((GameWebPage) context).f112972r1;
        String optString = jSONObject.optString("tabKey");
        if (fVar != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("chatVcSelectTab", jSONObject.optInt("chatVcSelectTab"));
            if (jSONObject.optInt("chatVcSelectTab") == 0) {
                if (!Util.isNullOrNil(optString)) {
                    fVar.mo65830n0(optString);
                }
                aVar.mo73776a();
                return;
            }
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C4552b.class, new C4551a(this, optString, fVar, aVar));
        } else if (TextUtils.equals(optString, "chat")) {
            Intent intent = new Intent();
            intent.putExtra("game_msg_center_tab_type", jSONObject.optInt("chatVcSelectTab"));
            C88144b.m109791i(context2, "game", ".ui.chat_tab.ChatRoomTabUI", intent, (Bundle) null);
        } else {
            Log.m105920e("MicroMsg.JsApiSwitchToGameTab", "is not tab page");
        }
    }
}
