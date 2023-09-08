package i61;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXDesignerSharedObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import java.io.ByteArrayOutputStream;
import nj3.C76879j;
import p158gt.C8451i;
import wd3.C65953v0;

/* renamed from: i61.l */
public class C8860l implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f28120a;

    /* renamed from: b */
    public final /* synthetic */ String f28121b;

    /* renamed from: c */
    public final /* synthetic */ String f28122c;

    /* renamed from: d */
    public final /* synthetic */ int f28123d;

    /* renamed from: e */
    public final /* synthetic */ String f28124e;

    /* renamed from: f */
    public final /* synthetic */ String f28125f;

    /* renamed from: g */
    public final /* synthetic */ String f28126g;

    /* renamed from: h */
    public final /* synthetic */ MMActivity f28127h;

    public C8860l(String str, String str2, String str3, int i, String str4, String str5, String str6, MMActivity mMActivity) {
        this.f28120a = str;
        this.f28121b = str2;
        this.f28122c = str3;
        this.f28123d = i;
        this.f28124e = str4;
        this.f28125f = str5;
        this.f28126g = str6;
        this.f28127h = mMActivity;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            String str2 = this.f28120a;
            String str3 = this.f28121b;
            String str4 = this.f28122c;
            int i2 = this.f28123d;
            String str5 = this.f28124e;
            String str6 = this.f28125f;
            String str7 = this.f28126g;
            Log.m105918d("MicroMsg.emoji.EmojiSharedMgr", "shareToFriend");
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.title = str3;
            wXMediaMessage.description = str4;
            WXDesignerSharedObject wXDesignerSharedObject = new WXDesignerSharedObject();
            wXDesignerSharedObject.designerUIN = i2;
            wXDesignerSharedObject.thumburl = str7;
            wXDesignerSharedObject.url = str5;
            wXDesignerSharedObject.designerName = str6;
            wXDesignerSharedObject.designerRediretctUrl = str7;
            wXMediaMessage.mediaObject = wXDesignerSharedObject;
            Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(str7);
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
            if (!Util.isNullOrNil(this.f28120a)) {
                ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(this.f28120a);
            }
            MMActivity mMActivity = this.f28127h;
            C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.f360099a34));
        }
    }
}
