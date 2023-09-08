package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.Map;
import p008bq.C0364r0;
import p008bq.C67305d1;
import p823sg.C90193h;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.u */
public class C6317u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f23194d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23195e;

    /* renamed from: f */
    public final /* synthetic */ String f23196f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f23197g;

    public C6317u(MsgHandler msgHandler, String str, C13851h1 h1Var, String str2) {
        this.f23197g = msgHandler;
        this.f23194d = str;
        this.f23195e = h1Var;
        this.f23196f = str2;
    }

    public void run() {
        String str;
        Log.m105924i("MicroMsg.MsgHandler", "doShareEmoticon use base64DataString");
        int indexOf = this.f23194d.indexOf(";base64,");
        if (indexOf != -1) {
            String str2 = this.f23194d;
            str = str2.substring(indexOf + 8, str2.length());
        } else {
            str = "";
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            if (Util.isNullOrNil(decode)) {
                this.f23197g.mo7210k5(this.f23195e, "shareEmoticon:fail", (Map<String, Object>) null);
                return;
            }
            String f = C90193h.m112878f(decode);
            if (Util.isNullOrNil(f)) {
                this.f23197g.mo7210k5(this.f23195e, "shareEmoticon:fail empty buffer", (Map<String, Object>) null);
                return;
            }
            String BX = ((C0364r0) C86312j.m106911c(C0364r0.class)).mo405BX(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", f);
            if (!C86013q1.m106450k(BX) || !C86013q1.m106456q(BX).equalsIgnoreCase(f)) {
                C86013q1.m106438T(BX, decode, 0, decode.length);
            }
            MsgHandler msgHandler = this.f23197g;
            String str3 = this.f23196f;
            msgHandler.getClass();
            MMHandlerThread.postToMainThread(new C6337x(msgHandler, f, str3));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MsgHandler", "doShareEmoticon error:" + e.getMessage());
            MsgHandler msgHandler2 = this.f23197g;
            C13851h1 h1Var = this.f23195e;
            msgHandler2.mo7210k5(h1Var, "shareEmoticon:fail_" + e.getMessage(), (Map<String, Object>) null);
        }
    }
}
