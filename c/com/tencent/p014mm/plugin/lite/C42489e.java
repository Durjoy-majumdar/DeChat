package com.tencent.p014mm.plugin.lite;

import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i22.C46162a;

/* renamed from: com.tencent.mm.plugin.lite.e */
public final class C42489e implements C46162a.C46165c {

    /* renamed from: a */
    public final /* synthetic */ WxaLiteAppInfo f115019a;

    public C42489e(WxaLiteAppInfo wxaLiteAppInfo) {
        this.f115019a = wxaLiteAppInfo;
    }

    /* renamed from: a */
    public void mo66577a() {
        Log.m105928w("MicroMsg.WxaLiteAppTaskPreloadReceiver", "geta8key fail: " + this.f115019a.f339290d);
    }

    /* renamed from: b */
    public void mo66578b(C46162a.C46164b bVar) {
        C87412m.m108594g(bVar, "info");
        Log.m105924i("MicroMsg.WxaLiteAppTaskPreloadReceiver", "geta8key success:" + this.f115019a.f339290d);
        LiteAppCenter.setAuthInfo(this.f115019a.f339290d, bVar.f124450a, bVar.f124452c, bVar.f124453d, true);
        LiteAppCenter.setAuthInfo(this.f115019a.f339290d, bVar.f124450a, bVar.f124452c, bVar.f124453d, false);
    }
}
