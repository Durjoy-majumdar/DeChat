package d00;

import android.os.Bundle;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44234a0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44239b0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44306j0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44337l0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44386y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44389z;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebViewClient;
import di3.C86301e;
import ei3.C86522b;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: d00.c0 */
public class C45246c0 extends C86301e implements C44234a0, C44386y {
    /* renamed from: MN */
    public WebChromeClient mo69163MN(MMWebView mMWebView, C44389z zVar) {
        return new C44306j0(mMWebView, zVar);
    }

    /* renamed from: Nl */
    public WebViewClient mo68940Nl(MMWebView mMWebView, boolean z, C44239b0 b0Var, Bundle bundle) {
        return new C44337l0(mMWebView, z, b0Var, bundle);
    }

    /* renamed from: nM */
    public WebViewClient mo68941nM(MMWebView mMWebView, boolean z, C44239b0 b0Var) {
        return new C44337l0(mMWebView, z, b0Var, (Bundle) null);
    }
}
