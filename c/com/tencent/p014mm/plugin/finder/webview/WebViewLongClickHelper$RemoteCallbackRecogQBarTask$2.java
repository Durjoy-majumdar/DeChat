package com.tencent.p014mm.plugin.finder.webview;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.finder.webview.WebViewLongClickHelper;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$RemoteCallbackRecogQBarTask$2 */
class WebViewLongClickHelper$RemoteCallbackRecogQBarTask$2 extends IListener<RecogQBarOfImageFileFailedEvent> {

    /* renamed from: d */
    public final /* synthetic */ C1256g f112036d;

    /* renamed from: e */
    public final /* synthetic */ IListener f112037e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewLongClickHelper$RemoteCallbackRecogQBarTask$2(WebViewLongClickHelper.C41618h hVar, C0125s sVar, C1256g gVar, IListener iListener) {
        super(sVar);
        this.f112036d = gVar;
        this.f112037e = iListener;
        this.__eventId = 1700407223;
    }

    public boolean callback(IEvent iEvent) {
        RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = (RecogQBarOfImageFileFailedEvent) iEvent;
        Log.m105929w("MicroMsg.WebViewLongClickHelper", "delete qb recog fail: %s", recogQBarOfImageFileFailedEvent.f107738d.f107739a);
        C86013q1.m106447h(recogQBarOfImageFileFailedEvent.f107738d.f107739a);
        this.f112036d.mo894a(new WebViewLongClickHelper.ImageQBarData((ArrayList<ImageQBarDataBean>) null, recogQBarOfImageFileFailedEvent.f107738d.f107739a, Boolean.FALSE));
        dead();
        this.f112037e.dead();
        return false;
    }
}
