package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p240sx.C77807p;
import zl3.C79397a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.h */
public final class C68614h extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1156;
    public static final String NAME = "chooseMultiWechatChatroom";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C81925i2 i2Var = (C81925i2) fVar;
        C87412m.m108594g(i2Var, "service");
        C87412m.m108594g(jSONObject2, "data");
        int i3 = 0;
        this.f242314e = false;
        Activity o0 = i2Var.mo114344o0();
        if (o0 == null) {
            Log.m105921e("MicroMsg.JsApiMultiChooseWeChatChatroom", "MultiChooseWeChatChatroom context is null, appId is %s", i2Var.getAppId());
            i2Var.mo109647a(i2, mo115109j("fail:internal error invalid android context"));
        } else {
            Log.m105925i("MicroMsg.JsApiMultiChooseWeChatChatroom", "MultiChooseWeChatChatroom appId:%s", i2Var.getAppId());
            JSONObject optJSONObject = jSONObject2.optJSONObject("params");
            if (optJSONObject == null) {
                Log.m105920e("MicroMsg.JsApiMultiChooseWeChatChatroom", "chooseMultiWechatChatroom fail, jsonObject is null");
                i2Var.mo109647a(i2, mo115109j("fail:invalid data"));
            } else {
                String optString = optJSONObject.optString("tipWord");
                String optString2 = optJSONObject.optString("choiseSessionWord");
                String optString3 = optJSONObject.optString("chatroomSessionWord");
                String optString4 = optJSONObject.optString("rightButtonWord");
                String optString5 = optJSONObject.optString("rightButtonLightFontColor");
                String optString6 = optJSONObject.optString("rightButtonDarkFontColor");
                String optString7 = optJSONObject.optString("rightButtonLightColor");
                String optString8 = optJSONObject.optString("rightButtonDarkColor");
                JSONArray optJSONArray = optJSONObject.optJSONArray("selectedUserNameList");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null && optJSONArray.length() > 0 && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    while (i3 < length) {
                        int i4 = length;
                        String optString9 = optJSONArray.optString(i3);
                        C87412m.m108593f(optString9, "selectedUserNameList.optString(i)");
                        arrayList.add(optString9);
                        i3++;
                        length = i4;
                        optJSONArray = optJSONArray;
                    }
                }
                ArrayList arrayList2 = arrayList;
                Intent ak02 = ((C77807p) C86312j.m106911c(C77807p.class)).ak0(o0, optString, optString2, optString3, optString4, optString5, optString6, optString7, optString8, arrayList2, optJSONObject.optInt("maxCount"), optJSONObject.optString("countExceedTipWord"), optJSONObject.optBoolean("forceLightMode", false));
                HashMap hashMap = new HashMap(1);
                C79397a.C79398a aVar = new C79397a.C79398a();
                aVar.f232918a.f232909a = o0;
                aVar.mo109373c(ak02);
                aVar.mo109371a("com.tencent.mm.ui.mvvm.MvvmSelectContactUI");
                aVar.f232918a.f232913e = new C55496g(hashMap, i2Var, i2, this);
                aVar.mo109374d();
                return;
            }
        }
    }
}
