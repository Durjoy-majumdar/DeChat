package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import a70.C112760b;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.webview.model.C6049n1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.plugin.webview.modeltools.LicenceScanner;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p749xh.C66261f3;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.b0 */
public class C6205b0 implements LicenceScanner.C6075a {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f22904a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f22905b;

    public C6205b0(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f22905b = msgHandler;
        this.f22904a = h1Var;
    }

    /* renamed from: a */
    public void mo7014a(String str) {
        this.f22905b.mo7213m5(MsgHandler.f22664b1, MsgHandler.f22666d1);
        this.f22905b.mo7210k5(this.f22904a, "chooseIdCard:cancel", (Map<String, Object>) null);
    }

    /* renamed from: b */
    public void mo7015b(String str) {
        this.f22905b.mo7213m5(MsgHandler.f22664b1, MsgHandler.f22666d1);
        this.f22905b.mo7210k5(this.f22904a, "chooseIdCard:fail", (Map<String, Object>) null);
    }

    /* renamed from: c */
    public void mo7016c(String str, JSONObject jSONObject, Bitmap bitmap) {
        if (bitmap == null) {
            this.f22905b.mo7210k5(this.f22904a, "chooseIdCard:fail", (Map<String, Object>) null);
            return;
        }
        try {
            String str2 = C112760b.m154225d() + "tmpScanLicense/";
            Log.m105919d("MicroMsg.MsgHandler", "tmpSaveCardBitmapDir: %s", str2);
            if (C86013q1.m106450k(str2)) {
                C86013q1.m106445f(str2);
            }
            C86013q1.m106461v(str2);
            C86013q1.m106460u(str2);
            String str3 = str2 + System.currentTimeMillis() + ".jpg";
            Log.m105919d("MicroMsg.MsgHandler", "tmpSaveCardBitmapPath: %s", str3);
            BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, str3, true);
            WebViewJSSDKFileItem b = C6049n1.m5933b(str3);
            C6080m.Ax0().mo7009a(b);
            HashMap hashMap = new HashMap();
            hashMap.put("sourceType", "scan");
            hashMap.put(C66261f3.COL_LOCALID, b.f283022e);
            this.f22905b.mo7213m5(MsgHandler.f22664b1, MsgHandler.f22668f1);
            this.f22905b.mo7213m5(MsgHandler.f22664b1, MsgHandler.f22667e1);
            this.f22905b.mo7210k5(this.f22904a, "chooseIdCard:ok", hashMap);
        } catch (Exception e) {
            this.f22905b.mo7213m5(MsgHandler.f22664b1, MsgHandler.f22666d1);
            Log.m105921e("MicroMsg.MsgHandler", "save scan license error: %s", e.getMessage());
            this.f22905b.mo7210k5(this.f22904a, "chooseIdCard:fail", (Map<String, Object>) null);
        }
    }
}
