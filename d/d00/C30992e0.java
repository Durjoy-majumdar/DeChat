package d00;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C30610e0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.MMWebViewWithJsApi;
import di3.C86301e;
import ei3.C86522b;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: d00.e0 */
public class C30992e0 extends C86301e implements C30610e0 {
    /* renamed from: a */
    public MMWebView mo57505a(Context context) {
        return new MMWebViewWithJsApi(context, (AttributeSet) null);
    }
}
