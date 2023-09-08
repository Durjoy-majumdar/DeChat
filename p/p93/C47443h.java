package p93;

import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view.BrowserSettingDialogView;
import j20.C117292a;
import java.util.ArrayList;
import n93.C47212c;

/* renamed from: p93.h */
public final class C47443h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BrowserSettingDialogView f127265d;

    public C47443h(BrowserSettingDialogView browserSettingDialogView) {
        this.f127265d = browserSettingDialogView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$initConfirmButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BrowserSettingDialogView browserSettingDialogView = this.f127265d;
        C47212c cVar = browserSettingDialogView.f118734j;
        if (cVar != null) {
            cVar.mo72142b(browserSettingDialogView.f118733i, view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$initConfirmButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
