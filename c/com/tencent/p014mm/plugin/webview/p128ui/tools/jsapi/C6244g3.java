package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import qo3.C77398g;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.g3 */
public class C6244g3 implements C77398g.C77402i.C77404b {

    /* renamed from: a */
    public final /* synthetic */ boolean f23014a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f23015b;

    /* renamed from: c */
    public final /* synthetic */ MsgHandler f23016c;

    public C6244g3(MsgHandler msgHandler, boolean z, C13851h1 h1Var) {
        this.f23016c = msgHandler;
        this.f23014a = z;
        this.f23015b = h1Var;
    }

    /* renamed from: a */
    public void mo25a() {
        if (!this.f23014a) {
            if (this.f23015b.f38983a.get("url") == null) {
                Log.m105924i("MicroMsg.MsgHandler", "webview recent share: onContentClick: url is null");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f23015b.f38983a.get("url").toString());
            intent.putExtra("hide_option_menu", true);
            C88144b.m109791i(this.f23016c.f22697d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }
}
