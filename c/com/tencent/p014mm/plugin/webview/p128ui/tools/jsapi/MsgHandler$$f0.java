package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$f0 */
public class MsgHandler$$f0 implements C96651n {

    /* renamed from: a */
    public final /* synthetic */ String f22773a;

    /* renamed from: b */
    public final /* synthetic */ String f22774b;

    /* renamed from: c */
    public final /* synthetic */ C13851h1 f22775c;

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f22776d;

    public MsgHandler$$f0(MsgHandler msgHandler, String str, String str2, C13851h1 h1Var) {
        this.f22776d = msgHandler;
        this.f22773a = str;
        this.f22774b = str2;
        this.f22775c = h1Var;
    }

    /* renamed from: a */
    public void mo6964a(boolean z, int i, String str, String str2, String str3, String str4) {
        Log.m105925i("MicroMsg.MsgHandler", this.f22773a + " on cdn finish,  is success : %s, mediaid : %s, local id is : %s, mediaUrl : %s", Boolean.valueOf(z), str2, str, str3);
        if (!Util.isNullOrNil(str) && str.equals(this.f22774b)) {
            C6080m.Cx0().mo134808h(this);
            ProgressDialog progressDialog = this.f22776d.f22700g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f22776d.f22700g = null;
            }
            if (!z) {
                MsgHandler msgHandler = this.f22776d;
                C13851h1 h1Var = this.f22775c;
                msgHandler.mo7210k5(h1Var, this.f22773a + ":fail", (Map<String, Object>) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("serverId", str2);
            hashMap.put("mediaUrl", str3);
            MsgHandler msgHandler2 = this.f22776d;
            C13851h1 h1Var2 = this.f22775c;
            msgHandler2.mo7210k5(h1Var2, this.f22773a + ":ok", hashMap);
        }
    }
}
