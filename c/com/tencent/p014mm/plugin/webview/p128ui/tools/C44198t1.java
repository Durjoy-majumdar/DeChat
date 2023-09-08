package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Process;
import android.webkit.WebSettings;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.t1 */
public class C44198t1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f119734d;

    public C44198t1(WebViewUI webViewUI) {
        this.f119734d = webViewUI;
    }

    public void run() {
        WebViewUI webViewUI = this.f119734d;
        WebSettings.RenderPriority renderPriority = WebViewUI.f118442D2;
        webViewUI.getClass();
        Log.m105918d("MicroMsg.WebViewUI", "doForceQuit");
        try {
            webViewUI.f118531h2.mo68759d();
            webViewUI.f118523f.stopLoading();
            webViewUI.f118523f.removeAllViews();
            webViewUI.f118523f.clearView();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewUI", "forceQuit, ex = " + e.getMessage());
        }
        C48590l lVar = webViewUI.f118508Z;
        if (lVar != null) {
            lVar.mo73251p();
        }
        try {
            webViewUI.f118523f.destroy();
        } catch (Exception e2) {
            Log.m105929w("MicroMsg.WebViewUI", "forceQuit, viewWV destroy, ex = %s", e2.getMessage());
        }
        webViewUI.finish();
        Log.appenderFlush();
        int myPid = Process.myPid();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(myPid));
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "doForceQuit", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(obj, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "doForceQuit", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
