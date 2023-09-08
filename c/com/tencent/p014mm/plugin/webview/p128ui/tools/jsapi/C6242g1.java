package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.webview.modeltools.LicenceScanner;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import org.json.JSONObject;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.g1 */
public class C6242g1 implements LicenceScanner.C6075a {

    /* renamed from: a */
    public final /* synthetic */ String f23009a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f23010b;

    /* renamed from: c */
    public final /* synthetic */ MsgHandler f23011c;

    public C6242g1(MsgHandler msgHandler, String str, C13851h1 h1Var) {
        this.f23011c = msgHandler;
        this.f23009a = str;
        this.f23010b = h1Var;
    }

    /* renamed from: a */
    public void mo7014a(String str) {
        if (Util.nullAsNil(str).equals(this.f23009a)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("cardType", str);
            this.f23011c.mo7210k5(this.f23010b, "scanLicence:cancel", hashMap);
        }
    }

    /* renamed from: b */
    public void mo7015b(String str) {
        if (Util.nullAsNil(str).equals(this.f23009a)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("cardType", str);
            this.f23011c.mo7210k5(this.f23010b, "scanLicence:fail", hashMap);
        }
    }

    /* renamed from: c */
    public void mo7016c(String str, JSONObject jSONObject, Bitmap bitmap) {
        if (!Util.nullAsNil(str).equalsIgnoreCase(this.f23009a)) {
            Log.m105925i("MicroMsg.MsgHandler", "msg.params.cardType = %s, callback type = %s, mismatch!!!", this.f23009a, str);
        } else if (jSONObject == null) {
            Log.m105921e("MicroMsg.MsgHandler", "doScanLicence, type = %s, callback onSuccess but result is null", str);
            mo7015b(str);
        } else {
            HashMap hashMap = new HashMap(2);
            hashMap.put("cardType", str);
            hashMap.put("cardInfo", jSONObject);
            this.f23011c.mo7210k5(this.f23010b, "scanLicence:ok", hashMap);
        }
    }
}
