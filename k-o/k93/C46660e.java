package k93;

import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.plugin.webview.model.C85523o0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: k93.e */
public final class C46660e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C46661f f125613d;

    public C46660e(C46661f fVar) {
        this.f125613d = fVar;
    }

    public final void run() {
        C43522y yVar;
        C85523o0.C85537c cVar;
        if (!this.f125613d.f125627n.f125630b) {
            Log.m105928w("MicroMsg.WebViewSnapshotHelper", "show progressBar on time expire");
            this.f125613d.f125627n.mo67858n();
            C43704h2.m47540n(18);
        }
        WebViewUI a = this.f125613d.mo71919a();
        if (!(a == null || (yVar = a.f118513b1) == null || (cVar = yVar.f117696j1) == null)) {
            ((C43522y.C43550s) cVar).mo67838a();
        }
        this.f125613d.f125626m = false;
    }
}
