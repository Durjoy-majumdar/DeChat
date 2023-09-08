package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.graphics.PointF;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewLongClickHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$j */
public class WebViewLongClickHelper$$j implements C80883e<WebViewLongClickHelper.ScanImageData, WebViewLongClickHelper.ImageQBarData> {
    public void invoke(Object obj, C1256g gVar) {
        PointF pointF;
        WebViewLongClickHelper.ScanImageData scanImageData = (WebViewLongClickHelper.ScanImageData) obj;
        Log.m105924i("MicroMsg.WebViewLongClickHelper", "RemoteCallbackRecogQBarTask invoke:" + scanImageData.f118414d);
        C40008f fVar = C40008f.f107254d;
        WebViewLongClickHelper$RemoteCallbackRecogQBarTask$1 webViewLongClickHelper$RemoteCallbackRecogQBarTask$1 = new WebViewLongClickHelper$RemoteCallbackRecogQBarTask$1(this, fVar, gVar);
        WebViewLongClickHelper.f118391u = new WebViewLongClickHelper$RemoteCallbackRecogQBarTask$2(this, fVar, gVar, webViewLongClickHelper$RemoteCallbackRecogQBarTask$1);
        C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
        String str = scanImageData.f118414d;
        int i = scanImageData.f118418h;
        int i2 = scanImageData.f118419i;
        float f = scanImageData.f118416f;
        float f2 = scanImageData.f118417g;
        if (str == null) {
            pointF = new PointF(f, f2);
        } else {
            if (i > 0) {
                f /= (float) i;
            }
            if (i2 > 0) {
                f2 /= (float) i2;
            }
            pointF = new PointF(f, f2);
        }
        c.mo120962i("key_basescanui_touch_normalize_x", Float.valueOf(pointF.x));
        c.mo120962i("key_basescanui_touch_normalize_y", Float.valueOf(pointF.y));
        RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
        RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
        aVar.f107732a = WebViewLongClickHelper.f118390t;
        aVar.f107733b = scanImageData.f118414d;
        aVar.f107736e = true;
        aVar.f107737f = 2;
        webViewLongClickHelper$RemoteCallbackRecogQBarTask$1.alive();
        WebViewLongClickHelper.f118391u.alive();
        recogQBarOfImageFileEvent.publish();
    }
}
