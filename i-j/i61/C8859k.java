package i61;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiSharedObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import java.io.ByteArrayOutputStream;
import nj3.C76879j;
import p158gt.C8451i;
import wd3.C65953v0;

/* renamed from: i61.k */
public class C8859k implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f28112a;

    /* renamed from: b */
    public final /* synthetic */ String f28113b;

    /* renamed from: c */
    public final /* synthetic */ String f28114c;

    /* renamed from: d */
    public final /* synthetic */ String f28115d;

    /* renamed from: e */
    public final /* synthetic */ String f28116e;

    /* renamed from: f */
    public final /* synthetic */ String f28117f;

    /* renamed from: g */
    public final /* synthetic */ int f28118g;

    /* renamed from: h */
    public final /* synthetic */ MMActivity f28119h;

    public C8859k(String str, String str2, String str3, String str4, String str5, String str6, int i, MMActivity mMActivity) {
        this.f28112a = str;
        this.f28113b = str2;
        this.f28114c = str3;
        this.f28115d = str4;
        this.f28116e = str5;
        this.f28117f = str6;
        this.f28118g = i;
        this.f28119h = mMActivity;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            String str2 = this.f28112a;
            String str3 = this.f28113b;
            String str4 = this.f28114c;
            String str5 = this.f28115d;
            String str6 = this.f28116e;
            String str7 = this.f28117f;
            int i2 = this.f28118g;
            Log.m105918d("MicroMsg.emoji.EmojiSharedMgr", "doSharedToFriend");
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.title = str4;
            wXMediaMessage.description = str5;
            WXEmojiSharedObject wXEmojiSharedObject = new WXEmojiSharedObject();
            wXEmojiSharedObject.packageflag = i2;
            wXEmojiSharedObject.packageid = str3;
            wXEmojiSharedObject.thumburl = str6;
            wXEmojiSharedObject.url = str7;
            wXMediaMessage.mediaObject = wXEmojiSharedObject;
            Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(str6);
            if (bitmap != null && !bitmap.isRecycled()) {
                Log.m105924i("MicroMsg.emoji.EmojiSharedMgr", "thumb image is not null");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
            }
            SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
            SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
            aVar.f9478a = wXMediaMessage;
            aVar.f9481d = str2;
            aVar.f9482e = 49;
            aVar.f9483f = str2;
            aVar.f9484g = "";
            sendAppMsgEvent.publish();
            if (!TextUtils.isEmpty(str)) {
                SendMsgEvent sendMsgEvent = new SendMsgEvent();
                SendMsgEvent.C1132a aVar2 = sendMsgEvent.f9496d;
                aVar2.f9497a = str2;
                aVar2.f9498b = str;
                aVar2.f9499c = C45628s0.m50810y(str2);
                sendMsgEvent.f9496d.f9500d = 0;
                sendMsgEvent.publish();
            }
            C115669n.INSTANCE.mo160131h(10993, 0, str3);
            if (!Util.isNullOrNil(this.f28112a)) {
                ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(this.f28112a);
            }
            MMActivity mMActivity = this.f28119h;
            C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.f360099a34));
        }
    }
}
