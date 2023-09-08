package k93;

import android.view.View;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import j20.C117292a;
import java.util.ArrayList;
import z04.C112551y;

/* renamed from: k93.d */
public final class C46659d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46661f f125612d;

    public C46659d(C46661f fVar) {
        this.f125612d = fVar;
    }

    public final void onClick(View view) {
        C43522y yVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper$initSnapShotView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WebViewUI a = this.f125612d.mo71919a();
        if (!(a == null || (yVar = a.f118513b1) == null)) {
            C43522y.C43556y yVar2 = yVar.f117700n1;
            boolean z = true;
            yVar2.f117767a = true;
            String str = yVar2.f117768b;
            if (str != null && !C112551y.m153811k(str)) {
                z = false;
            }
            if (!z) {
                yVar2.mo67846a(yVar2.f117768b, 2);
            }
        }
        C43704h2.m47540n(17);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper$initSnapShotView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
