package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.plugin.scanner.C42912n;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.e1 */
public class C43851e1 implements MultiCodeMaskView.C42884a {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f118764a;

    public C43851e1(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118764a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo64868a(ArrayList<ImageQBarDataBean> arrayList) {
        C42912n.f116194a.mo67103a(this.f118764a.f118402k.longValue(), 3, arrayList, (ImageQBarDataBean) null, this.f118764a.f118403l.longValue(), 1, WebViewLongClickHelper.m47788e(this.f118764a));
        this.f118764a.f118392a.clear();
    }

    /* renamed from: b */
    public void mo64869b(ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean, boolean z) {
        WebViewLongClickHelper.m47789f(this.f118764a, imageQBarDataBean);
        C42912n.f116194a.mo67103a(this.f118764a.f118402k.longValue(), z ? 1 : 2, arrayList, imageQBarDataBean, this.f118764a.f118403l.longValue(), 1, WebViewLongClickHelper.m47788e(this.f118764a));
        WebViewLongClickHelper.m47786c(this.f118764a, 4, imageQBarDataBean);
        this.f118764a.f118392a.clear();
    }
}
