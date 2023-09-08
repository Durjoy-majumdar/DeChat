package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import android.webkit.ConsoleMessage;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import kj2.C117407d;
import u73.C22613h1;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.b */
public class C43262b extends WebChromeClient {
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebChromeClient", "onConsoleMessage %d %s %s %s", Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.messageLevel().name(), consoleMessage.message(), consoleMessage.sourceId());
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && !Util.isNullOrNil(consoleMessage.message())) {
            C117407d.INSTANCE.mo160131h(19153, Integer.valueOf(C43471q.m46977a(1)), consoleMessage.messageLevel(), 1);
            if (consoleMessage.message().contains("SyntaxError")) {
                C22613h1.m26480f(22);
            } else if (consoleMessage.message().contains("Maximum call stack size exceeded")) {
                C22613h1.m26480f(33);
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebChromeClient", "onJsAlert %s %s", str, str2);
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebChromeClient", "onJsConfirm %s %s", str, str2);
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebChromeClient", "onJsPrompt %s %s", str, str2);
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onProgressChanged(WebView webView, int i) {
    }
}
