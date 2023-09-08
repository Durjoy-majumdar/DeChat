package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.autogen.events.CancelRecogImageFileEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewLongClickHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$k */
public class WebViewLongClickHelper$$k implements C80883e<WebViewLongClickHelper.CancelRecogQBarData, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        WebViewLongClickHelper.CancelRecogQBarData cancelRecogQBarData = (WebViewLongClickHelper.CancelRecogQBarData) obj;
        CancelRecogImageFileEvent cancelRecogImageFileEvent = new CancelRecogImageFileEvent();
        CancelRecogImageFileEvent.C40046a aVar = cancelRecogImageFileEvent.f107390d;
        aVar.f107392b = cancelRecogQBarData.f118409d;
        aVar.f107391a = cancelRecogQBarData.f118410e;
        cancelRecogImageFileEvent.publish();
        C86013q1.m106447h(cancelRecogQBarData.f118409d);
        Log.m105924i("MicroMsg.WebViewLongClickHelper", "RemoteCallbackRecogQBarTask invoke:" + cancelRecogQBarData.f118409d);
    }
}
