package v83;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import ex0.C45696d;
import f40.C86709a0;

/* renamed from: v83.a */
public class C52805a {

    /* renamed from: a */
    public WebView f147521a = null;

    /* renamed from: b */
    public boolean f147522b = false;

    @JavascriptInterface
    public boolean _customEnterFullscreen(boolean z) {
        Log.m105925i("MicroMsg.CustomFullscreenApi", "_customEnterFullscreen %b", Boolean.valueOf(z));
        return mo73623a(z);
    }

    /* renamed from: a */
    public boolean mo73623a(boolean z) {
        Log.m105925i("MicroMsg.CustomFullscreenApi", "setCustomEnterFullscreen %b", Boolean.valueOf(z));
        WebView webView = this.f147521a;
        if (webView == null || !webView.isXWalkKernel() || !((C45696d) C86709a0.m107533q(C45696d.class)).B60(this.f147521a.getUrl())) {
            return false;
        }
        this.f147521a.disableVideoJsCallback(z);
        this.f147522b = z;
        return true;
    }
}
