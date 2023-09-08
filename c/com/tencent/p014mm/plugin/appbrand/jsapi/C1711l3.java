package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import java.util.HashMap;
import ke3.C88144b;
import m00.C10700d;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.l3 */
public class C1711l3 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 988;
    public static final String NAME = "jumpRedPacketEnvelopePreview";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.l3$a */
    public static class C1712a implements C80916r<Bundle, IPCVoid> {
        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            ((C10700d) C86312j.m106911c(C10700d.class)).mo10953C0();
            return null;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        Activity R = kVar.getRuntime().mo113026R();
        if (R == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new Bundle(), C1712a.class);
        String optString = jSONObject.optString("url");
        Log.m105925i("MicroMsg.JsApiJumpRedPacketEnvelopePreview", "preview red packet envelope: %s", optString);
        Intent intent = new Intent();
        intent.putExtra("Chat_User", "1@fackuser");
        intent.putExtra("finish_direct", true);
        HashMap hashMap = new HashMap();
        hashMap.put("key_red_packet_preview_url", optString);
        hashMap.put("key_red_packet_preview_scene", "0");
        intent.putExtra("key_red_packet_preview_extraInfo", hashMap);
        C88144b.m109801s(R, ".ui.chatting.ChattingUI", intent, (Bundle) null);
        kVar.mo109647a(i, mo115109j("ok"));
    }
}
