package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import zw1.C16408b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.o */
public final class C4505o extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "deleteChatRoomMemberByUserName";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            C87412m.m108591d(bVar);
            bVar.mo6945a("invalid_params", (JSONObject) null);
            return;
        }
        String optString = e.optString("chatroomName");
        String optString2 = e.optString("userName");
        if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString2)) {
            C87412m.m108591d(bVar);
            bVar.mo6945a("invalid_params", (JSONObject) null);
            return;
        }
        ((C16408b) C86312j.m106911c(C16408b.class)).mo14871ZR(optString, optString2);
        C87412m.m108591d(bVar);
        bVar.mo6945a((String) null, (JSONObject) null);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
