package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import p749xh.C66261f3;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.b3 */
public class C6208b3 implements C96651n {

    /* renamed from: a */
    public final /* synthetic */ String f22909a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f22910b;

    /* renamed from: c */
    public final /* synthetic */ MsgHandler f22911c;

    public C6208b3(MsgHandler msgHandler, String str, C13851h1 h1Var) {
        this.f22911c = msgHandler;
        this.f22909a = str;
        this.f22910b = h1Var;
    }

    /* renamed from: a */
    public void mo6964a(boolean z, int i, String str, String str2, String str3, String str4) {
        Log.m105925i("MicroMsg.MsgHandler", "doDownloadVoice, on cdn finish, is success : %b, local id : %s, media id is : %s", Boolean.valueOf(z), str, str2);
        if (!Util.isNullOrNil(str2) && str2.equals(this.f22909a)) {
            C6080m.Cx0().mo134808h(this);
            ProgressDialog progressDialog = this.f22911c.f22700g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f22911c.f22700g = null;
            }
            if (!z) {
                this.f22911c.mo7210k5(this.f22910b, "downloadVoice:fail", (Map<String, Object>) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(C66261f3.COL_LOCALID, str);
            this.f22911c.mo7210k5(this.f22910b, "downloadVoice:ok", hashMap);
        }
    }
}
