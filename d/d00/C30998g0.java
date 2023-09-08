package d00;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C30612f0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.MailMMWebView;
import di3.C86301e;
import ei3.C86522b;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: d00.g0 */
public class C30998g0 extends C86301e implements C30612f0 {
    /* renamed from: a */
    public MMWebView mo57506a(Context context) {
        return new MailMMWebView(context);
    }
}
