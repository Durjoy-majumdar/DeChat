package i61;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C86493v0;
import java.io.ByteArrayOutputStream;
import ke3.C88144b;
import nj3.C76879j;
import p158gt.C8451i;
import p441aq.C92054g;
import p61.C77058k0;
import wc3.C78541w;
import wd3.C65953v0;

/* renamed from: i61.m */
public class C76300m {

    /* renamed from: i61.m$a */
    public class C76301a implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f223493a;

        /* renamed from: b */
        public final /* synthetic */ int f223494b;

        /* renamed from: c */
        public final /* synthetic */ int f223495c;

        /* renamed from: d */
        public final /* synthetic */ String f223496d;

        /* renamed from: e */
        public final /* synthetic */ String f223497e;

        /* renamed from: f */
        public final /* synthetic */ String f223498f;

        /* renamed from: g */
        public final /* synthetic */ String f223499g;

        /* renamed from: h */
        public final /* synthetic */ int f223500h;

        /* renamed from: i */
        public final /* synthetic */ String f223501i;

        /* renamed from: j */
        public final /* synthetic */ MMActivity f223502j;

        public C76301a(String str, int i, int i2, String str2, String str3, String str4, String str5, int i3, String str6, MMActivity mMActivity) {
            this.f223493a = str;
            this.f223494b = i;
            this.f223495c = i2;
            this.f223496d = str2;
            this.f223497e = str3;
            this.f223498f = str4;
            this.f223499g = str5;
            this.f223500h = i3;
            this.f223501i = str6;
            this.f223502j = mMActivity;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            if (z) {
                String str2 = this.f223493a;
                int i2 = this.f223494b;
                int i3 = this.f223495c;
                String str3 = this.f223496d;
                String str4 = this.f223497e;
                String str5 = this.f223498f;
                String str6 = this.f223499g;
                int i4 = this.f223500h;
                String str7 = this.f223501i;
                Log.m105918d("MicroMsg.emoji.EmojiSharedMgr", "doSharedToFriend");
                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                wXMediaMessage.title = str3;
                wXMediaMessage.description = str4;
                C77058k0 k0Var = new C77058k0();
                k0Var.type = i2;
                k0Var.tid = i3;
                k0Var.title = str3;
                k0Var.desc = str4;
                k0Var.iconUrl = str5;
                k0Var.secondUrl = str6;
                k0Var.pageType = i4;
                k0Var.f225102a = str7;
                k0Var.url = ((C92054g) C86312j.m106911c(C92054g.class)).xx0().mo138005L();
                wXMediaMessage.mediaObject = k0Var;
                Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(str5);
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
                MMActivity mMActivity = this.f223502j;
                C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.f360099a34));
            }
        }
    }

    /* renamed from: a */
    public static void m91725a(Context context, int i) {
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
        intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
        intent.putExtra("scene_from", 14);
        C88144b.m109802t(context, ".ui.transmit.SelectConversationUI", intent, i);
    }

    /* renamed from: b */
    public static void m91726b(Context context, String str, String str2, String str3, String str4, String str5, int i) {
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_title", str);
        intent.putExtra("KContentObjDesc", str2);
        intent.putExtra("Ksnsupload_imgurl", str3);
        intent.putExtra("Ksnsupload_link", str4);
        intent.putExtra("KUploadProduct_UserData", str5);
        intent.putExtra("Ksnsupload_type", i);
        String a = C86493v0.m107223a("emoje_stroe");
        C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "emoje_stroe");
        intent.putExtra("reportSessionId", a);
        C88144b.m109792j(context, "sns", ".ui.SnsUploadUI", intent, false);
    }

    /* renamed from: c */
    public static void m91727c(MMActivity mMActivity, String str, int i, int i2, String str2, String str3, String str4, String str5, int i3) {
        m91728d(mMActivity, str, i, i2, str2, str3, str4, str5, i3, (String) null);
    }

    /* renamed from: d */
    public static void m91728d(MMActivity mMActivity, String str, int i, int i2, String str2, String str3, String str4, String str5, int i3, String str6) {
        ((C78541w) C86312j.m106911c(C78541w.class)).Ac0(mMActivity.getController(), str2, str4, str3, (String) null, true, "", mMActivity.getString(C0966R.string.a2s), new C76301a(str, i, i2, str2, str3, str4, str5, i3, str6, mMActivity));
    }
}
