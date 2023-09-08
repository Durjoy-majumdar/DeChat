package l93;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.bag.C96657c;
import com.tencent.p014mm.plugin.webview.p128ui.tools.bag.WebViewBag;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86301e;
import ei3.C86522b;
import j93.C98925b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: l93.f */
public class C99351f extends C86301e implements C98925b {

    /* renamed from: l93.f$a */
    public class C99352a implements Runnable {
        public C99352a(C99351f fVar) {
        }

        public void run() {
            WebViewBag webViewBag = C96657c.INSTANCE.f283098d;
            if (webViewBag != null) {
                webViewBag.setVisibility(8);
            }
        }
    }

    /* renamed from: l93.f$b */
    public class C99353b implements Runnable {
        public C99353b(C99351f fVar) {
        }

        public void run() {
            C96657c.INSTANCE.mo134829b();
        }
    }

    public void P00() {
        MMHandlerThread.postToMainThread(new C99353b(this));
    }

    /* renamed from: ff */
    public void mo138263ff() {
        MMHandlerThread.postToMainThread(new C99352a(this));
    }
}
