package da3;

import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewRedesignInputFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: da3.e */
public class C45318e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewRedesignInputFooter f122771d;

    public C45318e(WebViewRedesignInputFooter webViewRedesignInputFooter) {
        this.f122771d = webViewRedesignInputFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WebViewInputFooter", "keyboard hide rightWordView");
        this.f122771d.mo68994b();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
