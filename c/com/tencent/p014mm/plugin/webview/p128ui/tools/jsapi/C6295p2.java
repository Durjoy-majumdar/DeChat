package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.p2 */
public class C6295p2 implements C75018a.C75025e {

    /* renamed from: a */
    public final /* synthetic */ MsgHandler f23128a;

    public C6295p2(MsgHandler msgHandler) {
        this.f23128a = msgHandler;
    }

    /* renamed from: a */
    public void mo6958a() {
    }

    public void onHide() {
        MsgHandler msgHandler = this.f23128a;
        msgHandler.mo7210k5(msgHandler.f22698e, "send_fav_msg:ok", (Map<String, Object>) null);
    }

    public void onShow() {
    }
}
