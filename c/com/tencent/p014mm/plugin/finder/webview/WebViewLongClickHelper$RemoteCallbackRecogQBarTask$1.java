package com.tencent.p014mm.plugin.finder.webview;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.finder.webview.WebViewLongClickHelper;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$RemoteCallbackRecogQBarTask$1 */
class WebViewLongClickHelper$RemoteCallbackRecogQBarTask$1 extends IListener<RecogQBarOfImageFileResultEvent> {

    /* renamed from: d */
    public final /* synthetic */ C1256g f112035d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewLongClickHelper$RemoteCallbackRecogQBarTask$1(WebViewLongClickHelper.C41618h hVar, C0125s sVar, C1256g gVar) {
        super(sVar);
        this.f112035d = gVar;
        this.__eventId = 812146647;
    }

    public boolean callback(IEvent iEvent) {
        RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
        Log.m105924i("MicroMsg.WebViewLongClickHelper", "mRecogResultListener callback:");
        if (recogQBarOfImageFileResultEvent instanceof RecogQBarOfImageFileResultEvent) {
            try {
                C86013q1.m106447h(recogQBarOfImageFileResultEvent.f265015d.f265016a);
                WebViewLongClickHelper.ImageQBarData imageQBarData = new WebViewLongClickHelper.ImageQBarData(C96874n1.f283849a.mo135192a(recogQBarOfImageFileResultEvent), recogQBarOfImageFileResultEvent.f265015d.f265016a, Boolean.TRUE);
                Log.m105918d("MicroMsg.WebViewLongClickHelper", "RemoteCallbackRecogQBarTask callback result size: " + imageQBarData.f112016d.size());
                this.f112035d.mo894a(imageQBarData);
                dead();
                WebViewLongClickHelper.f111998q.dead();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebViewLongClickHelper", e, "", new Object[0]);
            }
        }
        return false;
    }
}
