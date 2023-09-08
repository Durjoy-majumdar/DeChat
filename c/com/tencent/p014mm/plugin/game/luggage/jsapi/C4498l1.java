package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import gy1.C8476b;
import java.io.ByteArrayOutputStream;
import nj3.C76879j;
import org.json.JSONObject;
import p158gt.C8451i;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.l1 */
public class C4498l1 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f19270d;

    /* renamed from: e */
    public final /* synthetic */ C43620m2.C5947b f19271e;

    /* renamed from: f */
    public final /* synthetic */ Context f19272f;

    /* renamed from: g */
    public final /* synthetic */ C4500m1 f19273g;

    public C4498l1(C4500m1 m1Var, JSONObject jSONObject, C43620m2.C5947b bVar, Context context) {
        this.f19273g = m1Var;
        this.f19270d = jSONObject;
        this.f19271e = bVar;
        this.f19272f = context;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            String optString = this.f19270d.optString("appid");
            if (i2 == -1) {
                String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
                if (stringExtra == null || stringExtra.length() == 0) {
                    Log.m105920e("MicroMsg.JsApiSendGameNameCard", "mmOnActivityResult fail, toUser is null");
                    this.f19271e.mo6945a("fail", (JSONObject) null);
                } else if (Util.isNullOrNil(stringExtra)) {
                    Log.m105920e("MicroMsg.JsApiSendGameNameCard", "toUser is null");
                } else {
                    Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(this.f19270d.optString("img_url"));
                    C4500m1 m1Var = this.f19273g;
                    JSONObject jSONObject = this.f19270d;
                    m1Var.getClass();
                    C8476b bVar = new C8476b();
                    bVar.webpageUrl = jSONObject.optString("link");
                    bVar.extInfo = jSONObject.optString("review_data");
                    bVar.f27477a = jSONObject.optString("card_image_url");
                    bVar.f27478b = jSONObject.optString("card_nick_name");
                    bVar.f27479c = jSONObject.optString("card_desc");
                    bVar.f27480d = jSONObject.optString("card_tail");
                    bVar.f27481e = jSONObject.optString("card_link");
                    WXMediaMessage wXMediaMessage = new WXMediaMessage();
                    wXMediaMessage.mediaObject = bVar;
                    wXMediaMessage.title = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    wXMediaMessage.description = jSONObject.optString("desc");
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Log.m105924i("MicroMsg.JsApiSendGameNameCard", "thumb image is not null");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
                    }
                    C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(optString);
                    SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
                    SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
                    aVar.f9478a = wXMediaMessage;
                    aVar.f9479b = optString;
                    aVar.f9480c = appInfo == null ? "" : appInfo.field_appName;
                    aVar.f9481d = stringExtra;
                    aVar.f9482e = 2;
                    if (Util.isNullOrNil(this.f19270d.optString("src_username"))) {
                        sendAppMsgEvent.f9477d.f9485h = null;
                    } else {
                        sendAppMsgEvent.f9477d.f9483f = this.f19270d.optString("src_username");
                        sendAppMsgEvent.f9477d.f9484g = this.f19270d.optString("src_displayname");
                    }
                    sendAppMsgEvent.f9477d.f9486i = this.f19270d.optString("shareUrl");
                    sendAppMsgEvent.f9477d.f9487j = this.f19270d.optString("currentUrl");
                    sendAppMsgEvent.f9477d.f9488k = this.f19270d.optString("preVerifyAppId");
                    sendAppMsgEvent.publish();
                    String stringExtra2 = intent.getStringExtra("custom_send_text");
                    if (!Util.isNullOrNil(stringExtra2)) {
                        SendMsgEvent sendMsgEvent = new SendMsgEvent();
                        SendMsgEvent.C1132a aVar2 = sendMsgEvent.f9496d;
                        aVar2.f9497a = stringExtra;
                        aVar2.f9498b = stringExtra2;
                        aVar2.f9499c = C45628s0.m50810y(stringExtra);
                        sendMsgEvent.f9496d.f9500d = 0;
                        sendMsgEvent.publish();
                    }
                    Context context = this.f19272f;
                    C76879j.m92726T(context, context.getResources().getString(C0966R.string.f360099a34));
                    this.f19271e.mo6945a((String) null, (JSONObject) null);
                }
            } else if (i2 == 0 || i2 == 1) {
                this.f19271e.mo6945a("cancel", (JSONObject) null);
            } else {
                this.f19271e.mo6945a("fail", (JSONObject) null);
            }
        }
    }
}
