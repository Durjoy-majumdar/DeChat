package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXLiteAppObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import i22.C8846b;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C9556a;
import org.json.JSONObject;
import p158gt.C8451i;
import p763ym.C79138l;
import wc3.C15133e0;
import wc3.C78536j0;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.v */
public class C4802v extends C4770c {

    /* renamed from: g */
    public String f19837g;

    /* renamed from: h */
    public JSONObject f19838h;

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        boolean z2;
        JSONObject jSONObject2 = jSONObject;
        this.f19837g = str;
        this.f19838h = jSONObject2;
        String optString = jSONObject2.optString("url");
        jSONObject2.optString("path");
        String str2 = "";
        if (optString.isEmpty()) {
            this.f19815f.mo5689a(str2);
            return;
        }
        String optString2 = jSONObject2.optString("thumbUrl");
        if (!Util.isNullOrNil(optString2) && optString2.startsWith("http")) {
            ((C8451i) C86312j.m106911c(C8451i.class)).mo9375mT(optString2, (C8451i.C8452a) null);
        }
        HashMap hashMap = new HashMap();
        if (optString2 == null) {
            optString2 = str2;
        }
        hashMap.put("img_url", optString2);
        hashMap.put("desc", jSONObject2.optString("desc"));
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        hashMap.put("url", optString);
        boolean optBoolean = jSONObject2.optBoolean("isRecentForward");
        String optString3 = jSONObject2.optString("content");
        int optInt = jSONObject2.optInt(FirebaseAnalytics.C113379b.INDEX);
        if (optBoolean) {
            C115669n.INSTANCE.idkeyStat(1865, 12, 1, false);
            ArrayList<C78536j0> Bv0 = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0().Bv0();
            if (Bv0 != null && !Bv0.isEmpty()) {
                int i = 0;
                while (true) {
                    if (i >= Bv0.size()) {
                        break;
                    }
                    C78536j0 j0Var = Bv0.get(i);
                    if (optInt == i && optString3.equalsIgnoreCase(MD5Util.getMD5String(j0Var.f230019a))) {
                        C115669n.INSTANCE.idkeyStat(1865, 13, 1, false);
                        str2 = j0Var.f230019a;
                        z2 = true;
                        break;
                    }
                    i++;
                }
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
                intent.putExtra("proxyui_action_code_key", 0);
                intent.putExtra("webview_params", hashMap);
                int i2 = C8846b.f28073a + 1;
                C8846b.f28073a = i2;
                C8846b.f28074b.put(Integer.valueOf(i2), this);
                intent.putExtra("callback_id", C8846b.f28073a);
                if (z2 && !Util.isNullOrNil(str2)) {
                    C115669n.INSTANCE.idkeyStat(1865, 14, 1, false);
                    intent.putExtra("Select_Conv_User", str2);
                }
                Context context = MMApplicationContext.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendAppMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendAppMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        z2 = false;
        Intent intent2 = new Intent();
        intent2.addFlags(268435456);
        intent2.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent2.putExtra("proxyui_action_code_key", 0);
        intent2.putExtra("webview_params", hashMap);
        int i25 = C8846b.f28073a + 1;
        C8846b.f28073a = i25;
        C8846b.f28074b.put(Integer.valueOf(i25), this);
        intent2.putExtra("callback_id", C8846b.f28073a);
        C115669n.INSTANCE.idkeyStat(1865, 14, 1, false);
        intent2.putExtra("Select_Conv_User", str2);
        Context context3 = MMApplicationContext.getContext();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent2);
        Context context22 = context3;
        C117292a.m165358d(context22, aVar2.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendAppMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context3.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context22, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendAppMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: p */
    public void mo5688p(int i, int i2, Intent intent) {
        WXMediaMessage wXMediaMessage;
        String str = "";
        if (i != 1) {
            this.f19815f.mo5689a(str);
        } else if (i2 == -1) {
            String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (stringExtra != null) {
                String optString = this.f19838h.optString("url");
                if (Util.isNullOrNil(stringExtra)) {
                    Log.m105920e("LiteAppJsApiSendAppMessage", "mmOnActivityResult fail, toUser is null");
                    this.f19815f.mo5689a(str);
                } else {
                    Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(this.f19838h.optString("thumbUrl"));
                    String str2 = this.f19837g;
                    JSONObject jSONObject = this.f19838h;
                    if (this instanceof C4778a0) {
                        WXWebpageObject wXWebpageObject = new WXWebpageObject();
                        wXWebpageObject.webpageUrl = jSONObject.optString("url");
                        wXMediaMessage = new WXMediaMessage();
                        wXMediaMessage.mediaObject = wXWebpageObject;
                        wXMediaMessage.title = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        wXMediaMessage.description = jSONObject.optString("desc");
                    } else {
                        WXLiteAppObject wXLiteAppObject = new WXLiteAppObject();
                        wXLiteAppObject.userName = str2;
                        wXLiteAppObject.path = jSONObject.optString("path");
                        wXLiteAppObject.webpageUrl = jSONObject.optString("url");
                        wXLiteAppObject.source = jSONObject.optInt(FirebaseAnalytics.C113379b.SOURCE);
                        JSONObject optJSONObject = jSONObject.optJSONObject(SearchIntents.EXTRA_QUERY);
                        if (optJSONObject != null) {
                            wXLiteAppObject.query = optJSONObject.toString();
                        }
                        wXMediaMessage = new WXMediaMessage(wXLiteAppObject);
                        wXMediaMessage.title = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        wXMediaMessage.description = jSONObject.optString("desc");
                    }
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Log.m105924i("LiteAppJsApiSendAppMessage", "thumb image is not null");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
                    }
                    String optString2 = this.f19838h.optString("srcId");
                    C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(optString2);
                    SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
                    SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
                    aVar.f9478a = wXMediaMessage;
                    aVar.f9481d = stringExtra;
                    aVar.f9482e = 2;
                    aVar.f9479b = optString2;
                    if (appInfo != null) {
                        str = appInfo.field_appName;
                    }
                    aVar.f9480c = str;
                    if (Util.isNullOrNil(this.f19838h.optString("src_username"))) {
                        sendAppMsgEvent.f9477d.f9485h = null;
                    } else {
                        sendAppMsgEvent.f9477d.f9483f = this.f19838h.optString("src_username");
                        sendAppMsgEvent.f9477d.f9484g = this.f19838h.optString("src_displayname");
                    }
                    SendAppMsgEvent.C1131a aVar2 = sendAppMsgEvent.f9477d;
                    aVar2.f9487j = optString;
                    aVar2.f9486i = optString;
                    sendAppMsgEvent.publish();
                }
                String stringExtra2 = intent.getStringExtra("custom_send_text");
                if (!Util.isNullOrNil(stringExtra2)) {
                    SendMsgEvent sendMsgEvent = new SendMsgEvent();
                    SendMsgEvent.C1132a aVar3 = sendMsgEvent.f9496d;
                    aVar3.f9497a = stringExtra;
                    aVar3.f9498b = stringExtra2;
                    aVar3.f9499c = C45628s0.m50810y(stringExtra);
                    sendMsgEvent.f9496d.f9500d = 0;
                    sendMsgEvent.publish();
                }
                this.f19815f.mo5690b();
            }
        } else if (i2 == 0 || i2 == 1) {
            this.f19815f.mo5689a("cancel");
        } else {
            this.f19815f.mo5689a(str);
        }
    }
}
