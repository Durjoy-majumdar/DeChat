package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewLongClickHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$i */
public class WebViewLongClickHelper$$i implements C1256g<WebViewLongClickHelper.ImageQBarData> {

    /* renamed from: d */
    public WeakReference<WebViewLongClickHelper> f118433d;

    /* renamed from: e */
    public String f118434e;

    public WebViewLongClickHelper$$i(WeakReference<WebViewLongClickHelper> weakReference, String str) {
        this.f118433d = weakReference;
        this.f118434e = str;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        WebViewLongClickHelper.ImageQBarData imageQBarData = (WebViewLongClickHelper.ImageQBarData) obj;
        WebViewLongClickHelper webViewLongClickHelper = this.f118433d.get();
        if (webViewLongClickHelper == null) {
            Log.m105920e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack helper == null");
        } else if (Util.isNullOrNil(imageQBarData.f118412e) || !imageQBarData.f118412e.equals(this.f118434e)) {
            Log.m105920e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack   path error, data.mImagePath:" + imageQBarData.f118412e + "   path: " + this.f118434e);
        } else {
            if (webViewLongClickHelper.f118401j.containsKey(imageQBarData.f118412e)) {
                webViewLongClickHelper.f118401j.remove(imageQBarData.f118412e);
                Log.m105924i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  remove filePath:" + imageQBarData.f118412e);
            }
            if (!imageQBarData.f118413f) {
                Log.m105920e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  recog is fail:" + this.f118434e);
                return;
            }
            webViewLongClickHelper.f118402k = Long.valueOf(System.currentTimeMillis());
            webViewLongClickHelper.f118403l = Long.valueOf(System.currentTimeMillis() - webViewLongClickHelper.f118404m.longValue());
            webViewLongClickHelper.f118392a.clear();
            ArrayList<ImageQBarDataBean> arrayList = imageQBarData.f118411d;
            if (arrayList != null && arrayList.size() > 0) {
                webViewLongClickHelper.f118392a.add(imageQBarData.f118411d.get(0));
            }
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  :" + webViewLongClickHelper.f118392a.size());
            MMHandlerThread.postToMainThread(new C43845c1(webViewLongClickHelper));
            webViewLongClickHelper.mo68203q();
        }
    }
}
