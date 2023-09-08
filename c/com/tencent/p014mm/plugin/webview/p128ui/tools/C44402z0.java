package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "rawUrl", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.z0 */
final class C44402z0<InputType, ResultType> implements C80883e {
    static {
        new C44402z0();
    }

    public void invoke(Object obj, C1256g gVar) {
        C44395x0 x0Var = C44395x0.f120338a;
        String str = ((IPCString) obj).f10315d;
        C87412m.m108593f(str, "rawUrl.value");
        WeakReference<WebViewUI> weakReference = C44395x0.f120339b.get(str);
        WebViewUI webViewUI = weakReference instanceof WebViewUI ? (WebViewUI) weakReference : null;
        if (webViewUI != null) {
            webViewUI.finish();
        }
    }
}
