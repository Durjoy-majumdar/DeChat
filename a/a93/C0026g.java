package a93;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import nj3.C76879j;
import org.json.JSONObject;
import p158gt.C8451i;
import p763ym.C79138l;

/* renamed from: a93.g */
public final class C0026g {
    /* renamed from: a */
    public static final void m15a(Context context, String str, String str2, JSONObject jSONObject, String str3) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "toUser");
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(str3, "appendText");
        Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(jSONObject.optString("img_url"));
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = jSONObject.optString("link");
        wXWebpageObject.extInfo = jSONObject.optString("review_data");
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXWebpageObject;
        wXMediaMessage.title = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        wXMediaMessage.description = jSONObject.optString("desc");
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105924i("MicroMsg.SendAppMsgUtil", "thumb image is not null");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
        }
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(str);
        SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
        SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
        aVar.f9478a = wXMediaMessage;
        aVar.f9479b = str;
        aVar.f9480c = appInfo == null ? "" : appInfo.field_appName;
        aVar.f9481d = str2;
        aVar.f9482e = 2;
        if (Util.isNullOrNil(jSONObject.optString("src_username"))) {
            sendAppMsgEvent.f9477d.f9485h = null;
        } else {
            sendAppMsgEvent.f9477d.f9483f = jSONObject.optString("src_username");
            sendAppMsgEvent.f9477d.f9484g = jSONObject.optString("src_displayname");
        }
        sendAppMsgEvent.f9477d.f9486i = jSONObject.optString("shareUrl");
        sendAppMsgEvent.f9477d.f9487j = jSONObject.optString("currentUrl");
        sendAppMsgEvent.f9477d.f9488k = jSONObject.optString("preVerifyAppId");
        sendAppMsgEvent.publish();
        if (!Util.isNullOrNil(str3)) {
            SendMsgEvent sendMsgEvent = new SendMsgEvent();
            SendMsgEvent.C1132a aVar2 = sendMsgEvent.f9496d;
            aVar2.f9497a = str2;
            aVar2.f9498b = str3;
            aVar2.f9499c = C45628s0.m50810y(str2);
            sendMsgEvent.f9496d.f9500d = 0;
            sendMsgEvent.publish();
        }
        C76879j.m92726T(context, context.getResources().getString(C0966R.string.f360099a34));
    }
}
