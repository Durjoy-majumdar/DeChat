package cx0;

import android.webkit.ConsoleMessage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;

/* renamed from: cx0.a */
public class C45212a extends WebChromeClient {
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Log.m105925i("MicroMsg.Box.BoxWebChromeClient", "onConsoleMessage %d %s %s %s", Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.messageLevel().name(), consoleMessage.message(), consoleMessage.sourceId());
        return super.onConsoleMessage(consoleMessage);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Log.m105925i("MicroMsg.Box.BoxWebChromeClient", "onJsAlert %s %s", str, str2);
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Log.m105925i("MicroMsg.Box.BoxWebChromeClient", "onJsConfirm %s %s", str, str2);
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Log.m105925i("MicroMsg.Box.BoxWebChromeClient", "onJsPrompt %s %s", str, str2);
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onProgressChanged(WebView webView, int i) {
    }
}
