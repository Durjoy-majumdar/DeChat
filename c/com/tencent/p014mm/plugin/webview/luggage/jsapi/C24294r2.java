package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.app.ProgressDialog;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.r2 */
public class C24294r2 implements C96651n {

    /* renamed from: a */
    public final /* synthetic */ String f69748a;

    /* renamed from: b */
    public final /* synthetic */ LuggageUploadMediaFileManager.C24287c f69749b;

    public C24294r2(String str, LuggageUploadMediaFileManager.C24287c cVar) {
        this.f69748a = str;
        this.f69749b = cVar;
    }

    /* renamed from: a */
    public void mo6964a(boolean z, int i, String str, String str2, String str3, String str4) {
        Log.m105925i("MicroMsg.UploadMediaFileHelp", " on cdn finish,  is success : %s, mediaid : %s, local id is : %s, mediaUrl : %s", Boolean.valueOf(z), str2, str, str3);
        if (!Util.isNullOrNil(str) && str.equals(this.f69748a)) {
            C6080m.Cx0().mo134808h(this);
            ProgressDialog progressDialog = LuggageUploadMediaFileManager.f69723g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                LuggageUploadMediaFileManager.f69723g = null;
            }
            this.f69749b.mo41057a(z, str2, str3);
        }
    }
}
