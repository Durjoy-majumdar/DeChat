package d00;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.core.C5843f0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44634d2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44635e2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.xweb.WebView;
import di3.C86301e;
import e00.C45519s0;
import ei3.C86522b;
import js0.C46574u;
import p224ra.C89909e;
import p225rc.C89925n;
import qe3.C25549c;

@C86522b
/* renamed from: d00.e1 */
public class C45248e1 extends C86301e implements C45519s0 {
    /* renamed from: Bi */
    public String mo70763Bi(Context context, String str) {
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        return C46574u.m51897a(context, str, (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class));
    }

    public boolean Ok0() {
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        return true;
    }

    public String Oq0(String str) {
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        if (str != null && str.startsWith("Refused to frame")) {
            String[] split = str.split("'");
            if (split.length > 2) {
                return split[1];
            }
        }
        return "";
    }

    /* renamed from: WP */
    public boolean mo70766WP(String str, String str2) {
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        return C89925n.m112490c(str, str2);
    }

    public void ku0(Context context, String str, String str2, boolean z, C6686h2.C6687a aVar) {
        C44625c2.m49072e(context, str, "", str2, z, aVar);
    }

    public void l40(WebView webView, String str, String str2) {
        C44625c2.m49073f(webView, str, str2, true);
    }

    public C25549c.C12172h ri0(String str) {
        return C5843f0.f22025a.mo6894a(str);
    }

    public void sg0(Context context, String str, String str2, boolean z) {
        C44625c2.m49077j(context, str, "", str2, z);
    }

    /* renamed from: uT */
    public void mo70771uT(WebView webView) {
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        if (webView != null) {
            C44634d2 d2Var = new C44634d2(webView);
            Log.m105918d("MicroMsg.WebViewUtil", "initIFrame");
            MMHandlerThread.postToMainThread(new C44635e2(d2Var));
        }
    }
}
