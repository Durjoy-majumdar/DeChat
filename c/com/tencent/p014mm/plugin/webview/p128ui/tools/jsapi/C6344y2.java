package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.y2 */
public class C6344y2 implements C96651n {

    /* renamed from: a */
    public final /* synthetic */ String f23243a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f23244b;

    /* renamed from: c */
    public final /* synthetic */ MsgHandler f23245c;

    public C6344y2(MsgHandler msgHandler, String str, C13851h1 h1Var) {
        this.f23245c = msgHandler;
        this.f23243a = str;
        this.f23244b = h1Var;
    }

    /* renamed from: a */
    public void mo6964a(boolean z, int i, String str, String str2, String str3, String str4) {
        Log.m105925i("MicroMsg.MsgHandler", "doUploadVoice, on cdn finish,  is success : %s, mediaid : %s, local id is : %s", Boolean.valueOf(z), str2, str);
        if (!Util.isNullOrNil(str) && str.equals(this.f23243a)) {
            C6080m.Cx0().mo134808h(this);
            ProgressDialog progressDialog = this.f23245c.f22700g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f23245c.f22700g = null;
            }
            if (!z) {
                this.f23245c.mo7210k5(this.f23244b, "uploadVoice:fail", (Map<String, Object>) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("serverId", str2);
            this.f23245c.mo7210k5(this.f23244b, "uploadVoice:ok", hashMap);
        }
    }
}
