package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.graphics.Color;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.plugin.wepkg.version.WepkgVersionUpdater;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.Map;
import k00.C46633d;
import p244tt.C14088e;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.t0 */
public class C6314t0 implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ String f23187a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f23188b;

    /* renamed from: c */
    public final /* synthetic */ MsgHandler f23189c;

    public C6314t0(MsgHandler msgHandler, String str, C13851h1 h1Var) {
        this.f23189c = msgHandler;
        this.f23187a = str;
        this.f23188b = h1Var;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView openInLiteApp success.");
        String str = this.f23187a;
        Object obj = C44536d.f120770a;
        String a = C46633d.m51936a(str);
        if (!Util.isNullOrNil(a)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(a);
            WepkgVersionUpdater.m48921a(linkedList, 4);
        }
        this.f23189c.mo7210k5(this.f23188b, "openGameUrlWithExtraWebView:ok", (Map<String, Object>) null);
    }

    /* renamed from: b */
    public void mo1718b() {
        MsgHandler msgHandler = this.f23189c;
        String str = this.f23187a;
        msgHandler.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView, url is null");
            msgHandler.mo7210k5(msgHandler.f22698e, "openGameUrlWithExtraWebView:fail", (Map<String, Object>) null);
            return;
        }
        String str2 = (String) msgHandler.f22698e.f38983a.get("statusBarColor");
        int i = 0;
        if (!Util.isNullOrNil(str2)) {
            try {
                i = Color.parseColor(str2);
            } catch (IllegalArgumentException e) {
                Log.m105920e("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView: " + e.getMessage());
                msgHandler.mo7210k5(msgHandler.f22698e, "openGameUrlWithExtraWebView:fail_invalid_color", (Map<String, Object>) null);
                return;
            }
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("customize_status_bar_color", i);
        intent.putExtra("status_bar_style", (String) msgHandler.f22698e.f38983a.get("statusBarStyle"));
        Log.m105924i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView, time: " + System.currentTimeMillis());
        intent.putExtra("start_time", System.currentTimeMillis());
        intent.putExtra("start_activity_time", System.currentTimeMillis());
        C6600v.m6910e(intent.getExtras(), "webview", ".ui.tools.WebViewUI", msgHandler.f22715x, new C6318u0(msgHandler, intent));
        msgHandler.mo7210k5(msgHandler.f22698e, "openGameUrlWithExtraWebView:ok", (Map<String, Object>) null);
    }
}
