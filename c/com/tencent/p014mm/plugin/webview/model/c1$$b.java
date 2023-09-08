package com.tencent.p014mm.plugin.webview.model;

import android.content.DialogInterface;
import com.tencent.p014mm.opensdk.modelmsg.SendAuth;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.model.c1$$b */
public class c1$$b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f249210d;

    /* renamed from: e */
    public final /* synthetic */ SendAuth.Options f249211e;

    /* renamed from: f */
    public final /* synthetic */ C85518c1 f249212f;

    public c1$$b(C85518c1 c1Var, String str, SendAuth.Options options) {
        this.f249212f = c1Var;
        this.f249210d = str;
        this.f249211e = options;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C85518c1 c1Var = this.f249212f;
        if (!c1Var.f249207g) {
            String str = this.f249210d;
            SendAuth.Options options = this.f249211e;
            String j = c1Var.mo118916j(c1Var.f249202b);
            if (Util.isNullOrNil(j)) {
                Log.m105920e("MicroMsg.SDKOauthUtil", "dealWithError pkg nil");
                return;
            }
            Log.m105924i("MicroMsg.SDKOauthUtil", "dealWithError:" + str);
            SendAuth.Resp resp = new SendAuth.Resp();
            resp.transaction = c1Var.f249204d;
            resp.errCode = -1;
            resp.errStr = str;
            resp.state = c1Var.f249205e;
            resp.lang = "zh_CN";
            resp.country = "";
            c1Var.mo118913g(j, resp, options);
        }
    }
}
