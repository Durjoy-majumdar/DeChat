package da3;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewInputFooter;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: da3.a */
public class C45314a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewInputFooter f122768d;

    public C45314a(WebViewInputFooter webViewInputFooter) {
        this.f122768d = webViewInputFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WebViewInputFooter webViewInputFooter = this.f122768d;
        if (webViewInputFooter.f119985g == 0) {
            webViewInputFooter.f119993r.hideVKB();
            WebViewInputFooter webViewInputFooter2 = this.f122768d;
            if (!webViewInputFooter2.f119994s) {
                webViewInputFooter2.f119990o.requestFocus();
            }
            this.f122768d.mo68985c();
            this.f122768d.f119991p.setImageResource(C0966R.raw.icons_outlined_emoji);
            WebViewInputFooter webViewInputFooter3 = this.f122768d;
            webViewInputFooter3.f119985g = 1;
            webViewInputFooter3.f119996u = false;
        } else {
            webViewInputFooter.f119996u = false;
            webViewInputFooter.f119990o.requestFocus();
            this.f122768d.f119993r.showVKB();
            this.f122768d.mo68984b();
            this.f122768d.f119985g = 0;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
