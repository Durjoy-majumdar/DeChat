package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.Map;
import p008bq.C0364r0;
import p008bq.C67305d1;
import p823sg.C90193h;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.r */
public class C6302r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f23142d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23143e;

    /* renamed from: f */
    public final /* synthetic */ String f23144f;

    /* renamed from: g */
    public final /* synthetic */ String f23145g;

    /* renamed from: h */
    public final /* synthetic */ MsgHandler f23146h;

    public C6302r(MsgHandler msgHandler, String str, C13851h1 h1Var, String str2, String str3) {
        this.f23146h = msgHandler;
        this.f23142d = str;
        this.f23143e = h1Var;
        this.f23144f = str2;
        this.f23145g = str3;
    }

    public void run() {
        String str;
        Log.m105924i("MicroMsg.MsgHandler", "doAddToEmoticon use base64DataString");
        int indexOf = this.f23142d.indexOf(";base64,");
        if (indexOf != -1) {
            String str2 = this.f23142d;
            str = str2.substring(indexOf + 8, str2.length());
        } else {
            str = "";
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            if (Util.isNullOrNil(decode)) {
                this.f23146h.mo7210k5(this.f23143e, "addToEmoticon:fail", (Map<String, Object>) null);
                return;
            }
            String f = C90193h.m112878f(decode);
            String BX = ((C0364r0) C86312j.m106911c(C0364r0.class)).mo405BX(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", f);
            if (!C86013q1.m106450k(BX) || !C86013q1.m106456q(BX).equalsIgnoreCase(f)) {
                C86013q1.m106438T(BX, decode, 0, decode.length);
            }
            MsgHandler.m6140N3(this.f23146h, f, this.f23144f, this.f23145g);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MsgHandler", "doAddToEmoticon error:" + e.getMessage());
            MsgHandler msgHandler = this.f23146h;
            C13851h1 h1Var = this.f23143e;
            msgHandler.mo7210k5(h1Var, "addToEmoticon:fail_" + e.getMessage(), (Map<String, Object>) null);
        }
    }
}
