package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.plugin.webview.model.C6050o;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C66261f3;
import z83.C16123a;

/* renamed from: com.tencent.mm.plugin.webview.luggage.a */
public class C5870a implements C6050o {
    /* renamed from: R */
    public void mo6916R(boolean z, int i, int i2, String str, String str2) {
        Log.m105925i("MicroMsg.CdnProgressCallback", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), str, str2);
        if (z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C66261f3.COL_LOCALID, str);
                jSONObject.put("percent", i2);
                Bundle bundle = new Bundle();
                bundle.putString("name", "onMediaFileUploadProgress");
                bundle.putString("data", jSONObject.toString());
                ((C40327m) C86312j.m106911c(C40327m.class)).Ku0(bundle, C16123a.class, (C1256g) null);
            } catch (JSONException unused) {
            }
        }
    }
}
