package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.f0 */
public class C72784f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f212145d;

    /* renamed from: e */
    public final /* synthetic */ C72788g0 f212146e;

    public C72784f0(C72788g0 g0Var, String str) {
        this.f212146e = g0Var;
        this.f212145d = str;
    }

    public void run() {
        Log.m105925i("MicroMsg.ChatFooter", "onTxtMsgSend, msg is null or nil? %s.", Boolean.valueOf(Util.isNullOrNil(this.f212145d)));
        if (this.f212146e.f212149a.f211780L != null && !Util.isNullOrNil(this.f212145d)) {
            this.f212146e.f212149a.f211780L.mo100658t(this.f212145d);
        }
    }
}
