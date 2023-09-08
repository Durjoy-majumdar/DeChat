package da3;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewInputFooter;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: da3.b */
public class C45315b implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewInputFooter f122769d;

    public C45315b(WebViewInputFooter webViewInputFooter) {
        this.f122769d = webViewInputFooter;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        WebViewInputFooter webViewInputFooter = this.f122769d;
        webViewInputFooter.f119996u = false;
        webViewInputFooter.f119986h.setVisibility(8);
        this.f122769d.f119986h.getClass();
        this.f122769d.f119991p.setImageResource(C0966R.C0969drawable.f4802nb);
        this.f122769d.f119985g = 0;
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
