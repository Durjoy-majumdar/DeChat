package com.tencent.p014mm.plugin.finder.webview;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.plugin.scanner.C42912n;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.webview.y */
public class C41651y implements MultiCodeMaskView.C42884a {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f112090a;

    public C41651y(WebViewLongClickHelper webViewLongClickHelper) {
        this.f112090a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo64868a(ArrayList<ImageQBarDataBean> arrayList) {
        C42912n.f116194a.mo67103a(this.f112090a.f112009k.longValue(), 3, arrayList, (ImageQBarDataBean) null, this.f112090a.f112010l.longValue(), 1, WebViewLongClickHelper.m44937b(this.f112090a));
        this.f112090a.f111999a.clear();
    }

    /* renamed from: b */
    public void mo64869b(ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean, boolean z) {
        WebViewLongClickHelper webViewLongClickHelper = this.f112090a;
        webViewLongClickHelper.mo64766c(4, imageQBarDataBean);
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        dealQBarStrEvent.f264648d.f264650b = (Activity) webViewLongClickHelper.mo64767d();
        DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
        aVar.f264649a = imageQBarDataBean.f273113d;
        aVar.f264651c = imageQBarDataBean.f273114e;
        aVar.f264652d = imageQBarDataBean.f273115f;
        aVar.f264661m = imageQBarDataBean.f273121o;
        aVar.f264657i = 40;
        Bundle bundle = new Bundle();
        dealQBarStrEvent.f264648d.f264660l = bundle;
        Log.m105924i("MicroMsg.WebViewLongClickHelper", "addStatInfo4AppBrand, from h5");
        bundle.putInt("LaunchCodeScene_ScanScene", 3);
        dealQBarStrEvent.publish();
        C42912n.f116194a.mo67103a(this.f112090a.f112009k.longValue(), z ? 1 : 2, arrayList, imageQBarDataBean, this.f112090a.f112010l.longValue(), 1, WebViewLongClickHelper.m44937b(this.f112090a));
        this.f112090a.mo64766c(4, imageQBarDataBean);
        this.f112090a.f111999a.clear();
    }
}
