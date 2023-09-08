package com.tencent.p014mm.plugin.webview.luggage.util;

import android.os.Bundle;
import android.os.Looper;
import android.webkit.URLUtil;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import eb0.C45628s0;
import f40.C86709a0;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.luggage.util.c */
public class C6013c {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.util.c$a */
    public static class C6014a implements C80916r<Bundle, Bundle> {
        private C6014a() {
        }

        public Object invoke(Object obj) {
            String string = ((Bundle) obj).getString("username");
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_biz_contact", C86709a0.m107522a() ? C45628s0.m50738C(string) : false);
            return bundle;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.util.c$b */
    public static class C6015b implements C80916r<IPCString, WebViewJSSDKFileItem> {
        private C6015b() {
        }

        public Object invoke(Object obj) {
            return C6080m.Ax0().mo7010b(((IPCString) obj).f10315d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.util.c$c */
    public static class C6016c implements C80916r<Bundle, Bundle> {
        private C6016c() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("has_set_uin", C86709a0.m107522a());
            return bundle2;
        }
    }

    /* renamed from: a */
    public static WebViewJSSDKFileItem m5889a(String str) {
        if (!Util.isNullOrNil(str)) {
            return MMApplicationContext.isMMProcess() ? C6080m.Ax0().mo7010b(str) : (WebViewJSSDKFileItem) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCString(str), C6015b.class);
        }
        Log.m105920e("MicroMsg.LuggageWebViewUtil", "get by local id error, local id is null or nil");
        return null;
    }

    /* renamed from: b */
    public static boolean m5890b() {
        if (MMApplicationContext.isMMProcess()) {
            return C86709a0.m107522a();
        }
        Bundle bundle = (Bundle) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, null, C6016c.class);
        if (bundle != null) {
            return bundle.getBoolean("has_set_uin", false);
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m5891c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        Bundle bundle2 = (Bundle) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, bundle, C6014a.class);
        if (bundle2 != null) {
            return bundle2.getBoolean("is_biz_contact", false);
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m5892d(String str) {
        return !Util.isNullOrNil(str) && (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str));
    }

    /* renamed from: e */
    public static JSONObject m5893e(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.LuggageWebViewUtil", e.getMessage());
            return null;
        }
    }

    /* renamed from: f */
    public static void m5894f(Runnable runnable) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            MMHandlerThread.postToMainThread(runnable);
        } else {
            runnable.run();
        }
    }
}
