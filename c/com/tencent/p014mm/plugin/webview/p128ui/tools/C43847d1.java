package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.scanner.C42912n;
import com.tencent.p014mm.plugin.scanner.C94467l;
import com.tencent.p014mm.plugin.scanner.C94468m;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.d1 */
public class C43847d1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewLongClickHelper f118759d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.d1$a */
    public class C43848a implements C94467l {
        public C43848a() {
        }

        /* renamed from: a */
        public void mo64853a(ArrayList<PointF> arrayList, ArrayList<ImageQBarDataBean> arrayList2, ArrayList<ImageQBarDataBean> arrayList3) {
            WebViewLongClickHelper webViewLongClickHelper = C43847d1.this.f118759d;
            Map<String, Boolean> map = WebViewLongClickHelper.f118388r;
            webViewLongClickHelper.getClass();
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "showMultiCodeMaskView:" + arrayList2.size());
            MultiCodeMaskView d = webViewLongClickHelper.f118406o.mo68337d();
            if (d != null) {
                d.mo67040c(arrayList3, arrayList, arrayList2, webViewLongClickHelper.mo68194h().getWindow().getDecorView().getMeasuredHeight());
                d.setMMultiCodeMaskViewListener(new C43851e1(webViewLongClickHelper));
            }
            C42912n nVar = C42912n.f116194a;
            nVar.mo67105c(C43847d1.this.f118759d.f118402k.longValue(), arrayList3.size(), arrayList.size(), 3, C43847d1.this.f118759d.f118406o.getController().f117597w);
            if (arrayList.size() > 1) {
                nVar.mo67103a(C43847d1.this.f118759d.f118402k.longValue(), 11, arrayList3, (ImageQBarDataBean) null, C43847d1.this.f118759d.f118403l.longValue(), 1, WebViewLongClickHelper.m47788e(C43847d1.this.f118759d));
            }
        }

        /* renamed from: b */
        public void mo64854b(ImageQBarDataBean imageQBarDataBean, ArrayList<ImageQBarDataBean> arrayList) {
            WebViewLongClickHelper.m47789f(C43847d1.this.f118759d, imageQBarDataBean);
            C42912n.f116194a.mo67103a(C43847d1.this.f118759d.f118402k.longValue(), 1, arrayList, imageQBarDataBean, C43847d1.this.f118759d.f118403l.longValue(), 1, WebViewLongClickHelper.m47788e(C43847d1.this.f118759d));
            WebViewLongClickHelper.m47786c(C43847d1.this.f118759d, 4, imageQBarDataBean);
            C43847d1.this.f118759d.f118392a.clear();
        }
    }

    public C43847d1(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118759d = webViewLongClickHelper;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77407n nVar = this.f118759d.f118397f;
        if (nVar != null && nVar.mo107563h()) {
            this.f118759d.f118397f.mo107572p();
        }
        C43848a aVar = new C43848a();
        Activity h = this.f118759d.mo68194h();
        MMWebView mMWebView = this.f118759d.f118406o.getController().f117553a;
        WebViewLongClickHelper webViewLongClickHelper = this.f118759d;
        C94468m.m119494b(h, mMWebView, webViewLongClickHelper.f118392a, webViewLongClickHelper.f118406o.getWVTopOffset(), aVar);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
