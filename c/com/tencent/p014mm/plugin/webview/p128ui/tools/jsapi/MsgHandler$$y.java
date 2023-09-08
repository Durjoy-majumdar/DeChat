package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$y */
public class MsgHandler$$y implements C44580q1 {

    /* renamed from: a */
    public final /* synthetic */ String f22872a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f22873b;

    public MsgHandler$$y(MsgHandler msgHandler, String str) {
        this.f22873b = msgHandler;
        this.f22872a = str;
    }

    /* renamed from: a */
    public void mo1579a(boolean z, boolean z2) {
        Log.m105924i("MicroMsg.MsgHandler", "doLaunch3RdAppImpl launchSuccess:" + z + "pkg:" + this.f22872a);
        if (z) {
            MsgHandler msgHandler = this.f22873b;
            msgHandler.mo7210k5(msgHandler.f22698e, "launch_3rdApp:ok", (Map<String, Object>) null);
            return;
        }
        MsgHandler msgHandler2 = this.f22873b;
        msgHandler2.mo7210k5(msgHandler2.f22698e, "launch_3rdApp:fail", (Map<String, Object>) null);
    }
}
