package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import i83.C46194p;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.m2 */
public class C44046m2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUIStyleHelper f119328d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.m2$a */
    public class C44047a implements Callable<Void> {
        public C44047a() {
        }

        public Object call() {
            C44046m2.this.f119328d.f118669f.mo67657d(C46194p.HelpBtn);
            return null;
        }
    }

    public C44046m2(WebViewUIStyleHelper webViewUIStyleHelper) {
        this.f119328d = webViewUIStyleHelper;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WebViewUIStyleHelper", "click trans help button");
        if (this.f119328d.f118667d.mo68242K8()) {
            this.f119328d.f118669f.mo67657d(C46194p.HelpBtn);
        } else {
            this.f119328d.f118667d.mo68273b9(new C44047a());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
