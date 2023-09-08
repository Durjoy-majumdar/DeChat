package p93;

import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view.BrowserChooseDialogView;
import j20.C117292a;
import java.util.ArrayList;
import n93.C47210a;

/* renamed from: p93.d */
public final class C47439d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BrowserChooseDialogView f127258d;

    /* renamed from: e */
    public final /* synthetic */ View f127259e;

    public C47439d(BrowserChooseDialogView browserChooseDialogView, View view) {
        this.f127258d = browserChooseDialogView;
        this.f127259e = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BrowserChooseDialogView browserChooseDialogView = this.f127258d;
        C47210a aVar = browserChooseDialogView.f118720n;
        if (aVar != null) {
            aVar.mo72136a(browserChooseDialogView.f118719j, this.f127259e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
