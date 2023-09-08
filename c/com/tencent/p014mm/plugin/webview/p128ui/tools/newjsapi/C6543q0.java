package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7250m;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C87412m;
import pc0.C100765f;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.q0 */
public final class C6543q0 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f23716a;

    /* renamed from: b */
    public final /* synthetic */ WebViewUI f23717b;

    /* renamed from: c */
    public final /* synthetic */ String f23718c;

    /* renamed from: d */
    public final /* synthetic */ String f23719d;

    public C6543q0(String str, WebViewUI webViewUI, String str2, String str3) {
        this.f23716a = str;
        this.f23717b = webViewUI;
        this.f23718c = str2;
        this.f23719d = str3;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        if (z && !Util.isNullOrNil(this.f23716a)) {
            C44108o0 o0Var = C44108o0.f119483d;
            WebViewUI webViewUI = this.f23717b;
            String str2 = this.f23716a;
            String str3 = this.f23718c;
            String str4 = this.f23719d;
            o0Var.getClass();
            C87412m.m108594g(str2, "userName");
            if (!TextUtils.isEmpty(str)) {
                SendMsgEvent sendMsgEvent = new SendMsgEvent();
                SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                aVar.f9497a = str2;
                aVar.f9498b = str;
                aVar.f9499c = C45628s0.m50810y(str2);
                sendMsgEvent.f9496d.f9500d = 0;
                sendMsgEvent.publish();
            }
            C7250m.m7431a().mo136253Fd(webViewUI, str2, str3, 1, str4, "", "", (C100765f) null);
            C75026b.m89951a(webViewUI, webViewUI.getString(C0966R.string.fjh));
            ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(this.f23716a);
        }
    }
}
