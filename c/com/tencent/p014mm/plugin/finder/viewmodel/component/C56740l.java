package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import ej0.C58608e;
import ej0.C86525c;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.l */
public final class C56740l implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C56711j f162644d;

    public C56740l(C56711j jVar) {
        this.f162644d = jVar;
    }

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        if (message.what != 7) {
            return true;
        }
        C86525c cVar = this.f162644d.f162605w;
        if (cVar != null) {
            cVar.f251386e.f167798a = C58608e.C58609a.Stopped;
        }
        if (cVar != null) {
            cVar.mo121007h();
        }
        C86525c cVar2 = this.f162644d.f162605w;
        if (cVar2 != null) {
            cVar2.mo121008i();
        }
        C86525c cVar3 = this.f162644d.f162605w;
        if (cVar3 == null) {
            return true;
        }
        cVar3.f251389h = null;
        return true;
    }
}
