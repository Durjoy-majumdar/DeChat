package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExtTranslateVoiceEvent;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import lg3.C76697h;
import nj3.C76879j;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.d3 */
public class C96664d3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f283120d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f283121e;

    /* renamed from: f */
    public final /* synthetic */ String f283122f;

    /* renamed from: g */
    public final /* synthetic */ WebViewJSSDKFileItem f283123g;

    /* renamed from: h */
    public final /* synthetic */ MsgHandler f283124h;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.d3$a */
    public class C96665a implements DialogInterface.OnCancelListener {
        public C96665a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            ExtTranslateVoiceEvent extTranslateVoiceEvent = new ExtTranslateVoiceEvent();
            extTranslateVoiceEvent.f193561d.f193565c = 3;
            extTranslateVoiceEvent.publish();
            C96664d3 d3Var = C96664d3.this;
            d3Var.f283124h.mo7210k5(d3Var.f283121e, "translateVoice:fail", (Map<String, Object>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.d3$b */
    public class C96666b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ExtTranslateVoiceEvent f283126d;

        public C96666b(ExtTranslateVoiceEvent extTranslateVoiceEvent) {
            this.f283126d = extTranslateVoiceEvent;
        }

        public void run() {
            if (this.f283126d.f193562e.f193570b) {
                ProgressDialog progressDialog = C96664d3.this.f283124h.f22700g;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    C96664d3.this.f283124h.f22700g = null;
                }
                if (Util.isNullOrNil(this.f283126d.f193562e.f193569a)) {
                    C96664d3 d3Var = C96664d3.this;
                    d3Var.f283124h.mo7210k5(d3Var.f283121e, "translateVoice:fail", (Map<String, Object>) null);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("translateResult", this.f283126d.f193562e.f193569a);
                C96664d3 d3Var2 = C96664d3.this;
                d3Var2.f283124h.mo7210k5(d3Var2.f283121e, "translateVoice:ok", hashMap);
            }
        }
    }

    public C96664d3(MsgHandler msgHandler, boolean z, C13851h1 h1Var, String str, WebViewJSSDKFileItem webViewJSSDKFileItem) {
        this.f283124h = msgHandler;
        this.f283120d = z;
        this.f283121e = h1Var;
        this.f283122f = str;
        this.f283123g = webViewJSSDKFileItem;
    }

    public void run() {
        if (this.f283120d) {
            MsgHandler msgHandler = this.f283124h;
            Context context = msgHandler.f22697d;
            msgHandler.f22700g = C76879j.m92723Q(context, C76697h.m92348a(context).getString(C0966R.string.a3h), C76697h.m92348a(this.f283124h.f22697d).getString(C0966R.string.lms), true, true, new C96665a());
        }
        ExtTranslateVoiceEvent extTranslateVoiceEvent = new ExtTranslateVoiceEvent();
        ExtTranslateVoiceEvent.C67684a aVar = extTranslateVoiceEvent.f193561d;
        aVar.f193564b = this.f283122f;
        aVar.f193563a = this.f283123g.f283027j;
        aVar.f193565c = 0;
        aVar.f193568f = 8;
        aVar.f193567e = new C96666b(extTranslateVoiceEvent);
        extTranslateVoiceEvent.publish();
    }
}
