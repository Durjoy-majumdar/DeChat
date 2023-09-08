package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import di3.C86312j;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import zw1.C16408b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.t0 */
public class C4526t0 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.t0$a */
    public class C4527a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ Context f19283d;

        /* renamed from: e */
        public final /* synthetic */ C43620m2.C5947b f19284e;

        public C4527a(C4526t0 t0Var, Context context, C43620m2.C5947b bVar) {
            this.f19283d = context;
            this.f19284e = bVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == 3345) {
                ((MMActivity) this.f19283d).mmSetOnActivityResultCallback((MMActivity.C6739d) null);
                this.f19284e.mo6945a((String) null, (JSONObject) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "openGameLifeChatroom";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Context context2 = context;
        C43620m2.C5947b bVar2 = bVar;
        Log.m105924i("MicroMsg.JsApiOpenGameLifeChatroom", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar2.mo6945a("invalid_params", (JSONObject) null);
            return;
        }
        String optString = e.optString("chatroom_name");
        if (Util.isNullOrNil(optString)) {
            bVar2.mo6945a("invalid_params", (JSONObject) null);
            return;
        }
        String optString2 = e.optString("chatroom_icon");
        boolean optBoolean = e.optBoolean("is_auto_join", false);
        long optLong = e.optLong("sourceid", 0);
        long optLong2 = e.optLong(TPDownloadProxyEnum.USER_SSID, 0);
        boolean optBoolean2 = e.optBoolean("backToRoomList", false);
        int optInt = e.optInt("targetChannelId", -1);
        long optLong3 = e.optLong("targetSeq", -1);
        boolean optBoolean3 = e.optBoolean("is_real_time", false);
        String optString3 = e.optString("extInfo");
        boolean z = optBoolean3;
        Log.m105925i("MicroMsg.JsApiOpenGameLifeChatroom", "chatRoomName:%s, iconUrl:%s, isAutoJoin:%b, sourceId:%d, ssid:%d, backToRoomList:%b, targetChannelId:%s, targetSeq:%s", optString, optString2, Boolean.valueOf(optBoolean), Long.valueOf(optLong), Long.valueOf(optLong2), Boolean.valueOf(optBoolean2), Integer.valueOf(optInt), Long.valueOf(optLong3));
        ((MMActivity) context2).mmSetOnActivityResultCallback(new C4527a(this, context2, bVar));
        C16408b.C16409a aVar = new C16408b.C16409a(optString, optString2, optLong2, optLong, optBoolean, (Bundle) null);
        aVar.f43826j = 3345;
        aVar.f43822f = optBoolean2;
        aVar.f43825i = optLong3;
        aVar.f43824h = optInt;
        aVar.f43827k = z;
        aVar.f43828l = optString3;
        if (!((C16408b) C86312j.m106911c(C16408b.class)).mo14872aD(context, aVar)) {
            bVar.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
    }
}
