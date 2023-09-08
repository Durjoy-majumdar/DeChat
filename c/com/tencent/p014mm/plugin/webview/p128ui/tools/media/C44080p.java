package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pluginsdk.model.app.C44548c1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import eb0.C45628s0;
import eb0.C86493v0;
import gy3.C87412m;
import j83.C9286a;
import java.util.HashMap;
import ke3.C88144b;
import kotlin.Metadata;
import q20.C89449a;
import te3.C49399fa;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.p */
public final class C44080p {

    /* renamed from: a */
    public static final C44080p f119428a = new C44080p();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/media/p$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/media/MpVideoDataParcelable;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.p$a */
    public static final class C44081a implements C80883e<MpVideoDataParcelable, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            MpVideoDataParcelable mpVideoDataParcelable = (MpVideoDataParcelable) obj;
            C87412m.m108594g(mpVideoDataParcelable, "data");
            C87412m.m108594g(gVar, "callback");
            C49399fa faVar = mpVideoDataParcelable.f119400h;
            boolean z = false;
            if (faVar == null) {
                Log.m105928w("MicroMsg.MPVideoTransmit", "doSendAppMsg msgInfo is null");
            } else {
                C44548c1 c1Var = new C44548c1();
                c1Var.webpageUrl = faVar.f133374o;
                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                wXMediaMessage.mediaObject = c1Var;
                wXMediaMessage.title = faVar.f133369g;
                C9286a.m8929a(new C44082q(faVar));
                SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
                SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
                aVar.f9478a = wXMediaMessage;
                aVar.f9481d = mpVideoDataParcelable.f119396d;
                aVar.f9482e = 2;
                aVar.f9483f = faVar.f133375p;
                aVar.f9484g = faVar.f133376q;
                try {
                    aVar.f9489l = Util.nullAsNil(faVar.f133377r);
                    String a = C86493v0.m107223a(sendAppMsgEvent.f9477d.f9489l);
                    C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                    C87412m.m108591d(c);
                    c.mo120962i("sendAppMsgScene", 2);
                    c.mo120962i("preChatName", faVar.f133378s);
                    c.mo120962i("prePublishId", faVar.f133377r);
                    c.mo120962i("preUsername", faVar.f133379t);
                    c.mo120962i("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
                    c.mo120962i("_tmpl_webview_transfer_scene", 11);
                    c.mo120962i("_DATA_CENTER_VID", faVar.f133368f);
                    c.mo120962i("_DATA_CENTER__DULATION", Integer.valueOf(faVar.f133371i));
                    c.mo120962i("_DATA_CENTER_VIDEO_WIDTH", Integer.valueOf(faVar.f133372j));
                    c.mo120962i("_DATA_CENTER_VIDEO_HEIGHT", Integer.valueOf(faVar.f133373n));
                    c.mo120962i("_DATA_CENTER_COVER_URL", faVar.f133370h);
                    c.mo120962i("_DATA_CENTER_VIDEO_PLAY_URL", faVar.f133367e);
                    c.mo120962i("_DATA_CENTER_VIDEO_MP_URL", faVar.f133366d);
                    c.mo120962i("_DATA_CENTER_IS_MP_SHARE_VIDEO", Boolean.TRUE);
                    sendAppMsgEvent.f9477d.f9494q = a;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MPVideoTransmit", "init bunddata failed : %s", e.getMessage());
                }
                boolean publish = sendAppMsgEvent.publish();
                if (!Util.isNullOrNil(mpVideoDataParcelable.f119398f)) {
                    SendMsgEvent sendMsgEvent = new SendMsgEvent();
                    SendMsgEvent.C1132a aVar2 = sendMsgEvent.f9496d;
                    String str = mpVideoDataParcelable.f119396d;
                    aVar2.f9497a = str;
                    aVar2.f9498b = mpVideoDataParcelable.f119398f;
                    aVar2.f9499c = C45628s0.m50810y(str);
                    sendMsgEvent.f9496d.f9500d = 0;
                    sendMsgEvent.publish();
                }
                z = publish;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("ret", z);
            gVar.mo894a(bundle);
        }
    }

    /* renamed from: a */
    public final void mo68713a(String str, C49399fa faVar, String str2, C1256g<Bundle> gVar) {
        C87412m.m108594g(str, "toUser");
        C87412m.m108594g(faVar, "msgInfo");
        C87412m.m108594g(gVar, "callback");
        MpVideoDataParcelable mpVideoDataParcelable = new MpVideoDataParcelable();
        mpVideoDataParcelable.f119396d = str;
        mpVideoDataParcelable.f119398f = str2;
        mpVideoDataParcelable.f119400h = faVar;
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, mpVideoDataParcelable, C44081a.class, gVar);
    }

    /* renamed from: b */
    public final void mo68714b(Context context, String str, String str2, String str3, String str4, int i) {
        C87412m.m108594g(context, "context");
        HashMap hashMap = new HashMap();
        String nullAsNil = Util.nullAsNil(str);
        C87412m.m108593f(nullAsNil, "nullAsNil(imgUrl)");
        hashMap.put("img_url", nullAsNil);
        String nullAsNil2 = Util.nullAsNil(str2);
        C87412m.m108593f(nullAsNil2, "nullAsNil(desc)");
        hashMap.put("desc", nullAsNil2);
        String nullAsNil3 = Util.nullAsNil(str3);
        C87412m.m108593f(nullAsNil3, "nullAsNil(title)");
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, nullAsNil3);
        String nullAs = Util.nullAs(str4, C74928u.C45093i.f122309a);
        C87412m.m108593f(nullAs, "nullAs(url, ConstantsUI.…ewUI.MP_VIDEO_UPDATE_URL)");
        hashMap.put("url", nullAs);
        Log.m105925i("MicroMsg.MPVideoTransmit", "transmitMpVideoMsg, img_url=%s, desc=%s, title=%s, url=%s", hashMap.get("img_url"), hashMap.get("desc"), hashMap.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE), str4);
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", i);
        intent.putExtra("is_mp_video", true);
        intent.putExtra("Retr_Msg_Type", 1);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("webview_params", hashMap);
        C88144b.m109802t(context, ".ui.transmit.SelectConversationUI", intent, 203);
    }
}
