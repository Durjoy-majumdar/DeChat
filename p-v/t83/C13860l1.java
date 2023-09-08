package t83;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.tencent.p014mm.plugin.webview.core.C5853h;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: t83.l1 */
public final class C13860l1 {

    /* renamed from: a */
    public C48590l f39015a;

    @JavascriptInterface
    public final void getContentFromWebpage(String str) {
        C48590l lVar = this.f39015a;
        Context context = null;
        if ((lVar != null ? lVar.mo73255r() : null) != null) {
            C48590l lVar2 = this.f39015a;
            if (lVar2 != null) {
                context = lVar2.mo73255r();
            }
            C87412m.m108591d(context);
            Context context2 = (Context) new WeakReference(context).get();
            if (context2 instanceof C5853h) {
                Log.m105924i("MicroMsg.WebTransApi", "getContentFromWebpage");
                C5853h hVar = (C5853h) context2;
                if (str == null) {
                    str = "";
                }
                hVar.mo6902x4(str);
            }
        }
    }
}
