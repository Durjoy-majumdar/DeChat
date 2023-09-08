package g83;

import android.webkit.ConsoleMessage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebChromeClient;

/* renamed from: g83.h */
public class C45899h extends WebChromeClient {

    /* renamed from: a */
    public final String f123863a = "MicroMsg.WebSearch.WebSearchChromeClient";

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str;
        ConsoleMessage.MessageLevel messageLevel;
        String str2 = this.f123863a;
        Object[] objArr = new Object[4];
        String str3 = null;
        objArr[0] = consoleMessage != null ? Integer.valueOf(consoleMessage.lineNumber()) : null;
        if (consoleMessage == null || (messageLevel = consoleMessage.messageLevel()) == null || (str = messageLevel.name()) == null) {
            str = "";
        }
        objArr[1] = str;
        objArr[2] = consoleMessage != null ? consoleMessage.message() : null;
        if (consoleMessage != null) {
            str3 = consoleMessage.sourceId();
        }
        objArr[3] = str3;
        Log.m105925i(str2, "onConsoleMessage %d %s %s %s", objArr);
        return super.onConsoleMessage(consoleMessage);
    }
}
