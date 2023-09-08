package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.x */
public class C6337x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f23225d;

    /* renamed from: e */
    public final /* synthetic */ String f23226e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23227f;

    public C6337x(MsgHandler msgHandler, String str, String str2) {
        this.f23227f = msgHandler;
        this.f23225d = str;
        this.f23226e = str2;
    }

    public void run() {
        Intent intent = new Intent();
        intent.putExtra("scene_from", 4);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("Retr_Msg_Type", 5);
        intent.putExtra("Retr_Msg_thumb_path", this.f23225d);
        intent.putExtra("emoji_activity_id", this.f23226e);
        intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
        MsgHandler msgHandler = this.f23227f;
        Context context = msgHandler.f22697d;
        if (context instanceof MMActivity) {
            C88144b.m109803u((MMActivity) context, ".ui.transmit.SelectConversationUI", intent, 52, msgHandler);
        }
    }
}
