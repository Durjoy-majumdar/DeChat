package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C116756s5;
import i61.C98602h;
import wd3.C65953v0;
import z51.C39315g;

/* renamed from: com.tencent.mm.ui.chatting.c5 */
public class C73328c5 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ WXMediaMessage f215451a;

    /* renamed from: b */
    public final /* synthetic */ C44561j f215452b;

    /* renamed from: c */
    public final /* synthetic */ C73323b5 f215453c;

    public C73328c5(C73323b5 b5Var, WXMediaMessage wXMediaMessage, C44561j jVar) {
        this.f215453c = b5Var;
        this.f215451a = wXMediaMessage;
        this.f215452b = jVar;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            String str2 = null;
            if (this.f215451a.getType() == 8) {
                if (this.f215451a.thumbData == null) {
                    Log.m105920e("MicroMsg.WXAppMessageReceiver", "code should not reach here due to WXMediaMessage::checkArgs, sendEmoji Fail cause thumbData is null");
                    return;
                }
                str2 = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137996D(this.f215453c.f215435a.getContext(), this.f215451a, this.f215452b.field_appId);
                if (str2 == null) {
                    Log.m105926v("MicroMsg.WXAppMessageReceiver", "sendEmoji Fail cause emojiconmd5 is null");
                    return;
                }
            }
            String str3 = str2;
            C116756s5.m164691d().mo180727a(27, 1);
            WXMediaMessage wXMediaMessage = this.f215451a;
            Log.m105927v("MicroMsg.WXAppMessageReceiver", "onDialogClick, messageAction = %s, messageExt = %s", wXMediaMessage.messageAction, wXMediaMessage.messageExt);
            WXMediaMessage wXMediaMessage2 = this.f215451a;
            C44561j jVar = this.f215452b;
            C72695v.m85049B(wXMediaMessage2, jVar.field_appId, jVar.field_appName, this.f215453c.f215436b.mo91577r(), 1, str3);
        }
    }
}
