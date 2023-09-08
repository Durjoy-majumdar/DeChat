package com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.webview.luggage.C43582f0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewInputFooter;
import j20.C117292a;
import java.util.ArrayList;
import p910lj.C76701a;
import qn3.C77382c;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.b */
public class C44300b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewInputFooter f120051d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.b$a */
    public class C44301a implements C77382c.C77383a {
        public C44301a() {
        }

        /* renamed from: L0 */
        public void mo4083L0(String str) {
            MMActivity mMActivity = C44300b.this.f120051d.f119993r;
            if (mMActivity != null) {
                C76701a.makeText((Context) mMActivity, (CharSequence) "exceed max-length", 0).show();
            }
        }

        /* renamed from: L3 */
        public void mo4084L3(String str) {
        }

        /* renamed from: P4 */
        public void mo4086P4(String str) {
            WebViewInputFooter webViewInputFooter = C44300b.this.f120051d;
            WebViewInputFooter.C44284c cVar = webViewInputFooter.f119982d;
            if (cVar != null) {
                webViewInputFooter.f119990o.getText().toString();
                C43582f0 f0Var = (C43582f0) cVar;
                f0Var.f117819a.getClass();
                WebViewInputFooter webViewInputFooter2 = f0Var.f117819a.f117953w;
                if (webViewInputFooter2 != null) {
                    webViewInputFooter2.mo68983a();
                }
            }
            WebViewInputFooter webViewInputFooter3 = C44300b.this.f120051d;
            webViewInputFooter3.f119990o.clearComposingText();
            webViewInputFooter3.f119990o.setText("");
        }
    }

    public C44300b(WebViewInputFooter webViewInputFooter) {
        this.f120051d = webViewInputFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77382c b = C77382c.m93286b(this.f120051d.f119990o);
        int i = this.f120051d.f119995t;
        b.f225611e = 0;
        b.f225610d = i;
        b.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_1;
        b.f225607a = true;
        b.mo107499d(new C44301a());
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
