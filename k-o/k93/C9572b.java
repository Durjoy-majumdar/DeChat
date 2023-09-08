package k93;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;

/* renamed from: k93.b */
public final class C9572b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46661f f29810d;

    /* renamed from: e */
    public final /* synthetic */ WebViewUI f29811e;

    public C9572b(C46661f fVar, WebViewUI webViewUI) {
        this.f29810d = fVar;
        this.f29811e = webViewUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper$enterSnapshotMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C46661f fVar = this.f29810d;
        WebViewUI webViewUI = this.f29811e;
        fVar.getClass();
        C87412m.m108594g(webViewUI, "context");
        if (fVar.f125614a && Math.abs(System.currentTimeMillis() - fVar.f125628o) >= 2000) {
            fVar.f125628o = System.currentTimeMillis();
            C76912y0.m92773l(webViewUI, webViewUI.getString(C0966R.string.m0j));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper$enterSnapshotMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
