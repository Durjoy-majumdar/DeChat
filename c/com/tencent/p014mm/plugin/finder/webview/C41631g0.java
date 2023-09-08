package com.tencent.p014mm.plugin.finder.webview;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.scanner.C42912n;
import com.tencent.p014mm.plugin.scanner.C94467l;
import com.tencent.p014mm.plugin.scanner.C94468m;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.finder.webview.g0 */
public class C41631g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewLongClickHelper f112070d;

    /* renamed from: com.tencent.mm.plugin.finder.webview.g0$a */
    public class C41632a implements C94467l {
        public C41632a() {
        }

        /* renamed from: a */
        public void mo64853a(ArrayList<PointF> arrayList, ArrayList<ImageQBarDataBean> arrayList2, ArrayList<ImageQBarDataBean> arrayList3) {
            WebViewLongClickHelper webViewLongClickHelper = C41631g0.this.f112070d;
            IListener iListener = WebViewLongClickHelper.f111998q;
            webViewLongClickHelper.getClass();
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "showMultiCodeMaskView:" + arrayList2.size());
            MultiCodeMaskView maskView = webViewLongClickHelper.mo64769f().getMaskView();
            if (maskView != null) {
                maskView.mo67040c(arrayList3, arrayList, arrayList2, webViewLongClickHelper.mo64769f().getWindow().getDecorView().getMeasuredHeight());
                maskView.setMMultiCodeMaskViewListener(new C41651y(webViewLongClickHelper));
            }
            C42912n nVar = C42912n.f116194a;
            nVar.mo67105c(C41631g0.this.f112070d.f112009k.longValue(), arrayList3.size(), arrayList.size(), 3, C41631g0.this.f112070d.mo64769f().getController().mo67734o());
            if (arrayList.size() > 1) {
                nVar.mo67103a(C41631g0.this.f112070d.f112009k.longValue(), 11, arrayList3, (ImageQBarDataBean) null, C41631g0.this.f112070d.f112010l.longValue(), 1, WebViewLongClickHelper.m44937b(C41631g0.this.f112070d));
            }
        }

        /* renamed from: b */
        public void mo64854b(ImageQBarDataBean imageQBarDataBean, ArrayList<ImageQBarDataBean> arrayList) {
        }
    }

    public C41631g0(WebViewLongClickHelper webViewLongClickHelper) {
        this.f112070d = webViewLongClickHelper;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77407n nVar = this.f112070d.f112004f;
        if (nVar != null && nVar.mo107563h()) {
            this.f112070d.f112004f.mo107572p();
        }
        C41632a aVar = new C41632a();
        Context context = this.f112070d.mo64769f().getContext();
        MMWebView webView = this.f112070d.mo64769f().getWebView();
        WebViewLongClickHelper webViewLongClickHelper = this.f112070d;
        C94468m.m119494b(context, webView, webViewLongClickHelper.f111999a, webViewLongClickHelper.mo64769f().getWVTopOffset(), aVar);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
