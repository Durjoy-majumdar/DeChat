package bx0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import cx0.C45213b;
import f40.C86709a0;

/* renamed from: bx0.b */
public class C39844b implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C39845c f106861d;

    public C39844b(C39845c cVar) {
        this.f106861d = cVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.Box.BoxHomeUI", "dismiss dialog");
        C45213b bVar = this.f106861d.f106866j;
        if (bVar != null) {
            if (bVar.f122533e != null) {
                C86709a0.m107524d().mo123458d(bVar.f122533e);
            }
            C86709a0.m107524d().mo123470p(1869, bVar);
        }
        BoxWebView boxWebView = this.f106861d.f106865i;
        if (boxWebView != null) {
            boxWebView.removeJavascriptInterface("boxJSApi");
            this.f106861d.f106865i.destroy();
            this.f106861d.f106865i = null;
        }
    }
}
