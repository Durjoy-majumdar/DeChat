package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import lu3.C88656g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.g */
public class C72787g implements C88656g {
    public C72787g(AppPanel appPanel) {
    }

    public String getKey() {
        return "AppPanel_preMakeConnection";
    }

    public void run() {
        C92779i0.Dx0().getClass();
        Log.m105925i("MicroMsg.AppPanel", "preMakeConnection ret:%d", 0);
        AppPanel.f211686T = false;
    }
}
