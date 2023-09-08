package vk2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p158gt.C8451i;
import vk2.C14880b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: vk2.d0 */
public final class C14883d0 implements MMActivity.C6739d {

    /* renamed from: d */
    public static final C14883d0 f40912d = new C14883d0();

    /* renamed from: e */
    public static Bundle f40913e;

    /* renamed from: f */
    public static C14880b0.C14881a f40914f;

    /* renamed from: g */
    public static final C14880b0 f40915g = new C14880b0();

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        int i3;
        boolean z;
        String str;
        String str2;
        String string;
        String str3;
        String str4;
        String str5;
        String string2;
        int i4 = i;
        int i5 = i2;
        Intent intent2 = intent;
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult requestCode: ");
        sb.append(i4);
        sb.append(", resultCode: ");
        sb.append(i5);
        sb.append(", data == null: ");
        sb.append(intent2 == null);
        Log.m105924i("MicroMsg.ScanBoxShareHelper", sb.toString());
        if (i4 == 1) {
            String str6 = "";
            if (i5 == -1) {
                C14880b0.C14881a aVar = f40914f;
                if (aVar == null || aVar.f40909a == null) {
                    Log.m105920e("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult shareInfo invalid");
                    return;
                }
                String stringExtra = intent2 != null ? intent2.getStringExtra("Select_Conv_User") : null;
                if (stringExtra == null || stringExtra.length() == 0) {
                    Log.m105920e("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult fail, toUser is null");
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("custom_send_text");
                if (stringExtra2 == null) {
                    stringExtra2 = str6;
                }
                C14880b0.C14881a aVar2 = f40914f;
                C87412m.m108591d(aVar2);
                WXMediaMessage wXMediaMessage = aVar2.f40909a;
                C14880b0.C14881a aVar3 = f40914f;
                String str7 = aVar3 != null ? aVar3.f40910b : null;
                if (wXMediaMessage == null) {
                    Log.m105920e("MicroMsg.ScanSendAppMsgHelper", "doSendAppMessage appMsg is null");
                    z = false;
                    i3 = 1;
                } else {
                    Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(str7);
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Log.m105924i("MicroMsg.ScanSendAppMsgHelper", "doSendAppMessage thumbImage is not null");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
                    }
                    WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
                    if (iMediaObject instanceof WXWebpageObject) {
                        C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXWebpageObject");
                        str3 = ((WXWebpageObject) iMediaObject).webpageUrl;
                    } else {
                        str3 = str6;
                    }
                    SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
                    SendAppMsgEvent.C1131a aVar4 = sendAppMsgEvent.f9477d;
                    aVar4.f9478a = wXMediaMessage;
                    aVar4.f9479b = null;
                    aVar4.f9480c = str6;
                    aVar4.f9481d = stringExtra;
                    aVar4.f9482e = 2;
                    aVar4.f9483f = null;
                    aVar4.f9484g = null;
                    aVar4.f9486i = str3;
                    aVar4.f9487j = str3;
                    aVar4.f9488k = null;
                    z = sendAppMsgEvent.publish();
                    if (!Util.isNullOrNil(stringExtra2)) {
                        SendMsgEvent sendMsgEvent = new SendMsgEvent();
                        SendMsgEvent.C1132a aVar5 = sendMsgEvent.f9496d;
                        aVar5.f9497a = stringExtra;
                        aVar5.f9498b = stringExtra2;
                        aVar5.f9499c = C45628s0.m50810y(stringExtra);
                        sendMsgEvent.f9496d.f9500d = 0;
                        sendMsgEvent.publish();
                    }
                    i3 = 1;
                    Log.m105919d("MicroMsg.ScanSendAppMsgHelper", "doSendAppMessage result %b", Boolean.valueOf(z));
                }
                Object[] objArr = new Object[i3];
                objArr[0] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult sendOk: %b", objArr);
                if (z) {
                    C119179t tVar = C119157j.f356862d;
                    C14882c0 c0Var = C14882c0.f40911d;
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(c0Var, 200, false);
                }
                boolean U5 = C72996z1.m85820U5(stringExtra);
                Bundle bundle = f40913e;
                if (z) {
                    if (bundle == null || (str = bundle.getString("enter_session")) == null) {
                        str = str6;
                    }
                    if (bundle == null || (str2 = bundle.getString("tab_session")) == null) {
                        str2 = str6;
                    }
                    if (!(bundle == null || (string = bundle.getString("scan_session")) == null)) {
                        str6 = string;
                    }
                    C115669n.INSTANCE.mo160131h(21537, str2, str6, Integer.valueOf(U5 ? 1 : 2), str);
                }
            } else if (i5 == 0) {
                Log.m105928w("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult cancel");
                Bundle bundle2 = f40913e;
                if (bundle2 == null || (str4 = bundle2.getString("enter_session")) == null) {
                    str4 = str6;
                }
                if (bundle2 == null || (str5 = bundle2.getString("tab_session")) == null) {
                    str5 = str6;
                }
                if (!(bundle2 == null || (string2 = bundle2.getString("scan_session")) == null)) {
                    str6 = string2;
                }
                C115669n.INSTANCE.mo160131h(21537, str5, str6, 3, str4);
            }
        }
    }
}
