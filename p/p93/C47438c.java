package p93;

import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view.BrowserChooseDialogView;
import j20.C117292a;
import java.util.ArrayList;
import n93.C47210a;

/* renamed from: p93.c */
public final class C47438c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BrowserChooseDialogView f127256d;

    /* renamed from: e */
    public final /* synthetic */ View f127257e;

    public C47438c(BrowserChooseDialogView browserChooseDialogView, View view) {
        this.f127256d = browserChooseDialogView;
        this.f127257e = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BrowserChooseDialogView browserChooseDialogView = this.f127256d;
        C47210a aVar = browserChooseDialogView.f118720n;
        if (aVar != null) {
            aVar.mo72138e(browserChooseDialogView.f118719j, this.f127257e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
