package com.tencent.p014mm.plugin.appbrand.jsapi.backgroundfetch;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.b */
public class C1636b implements C1256g<IPCString> {

    /* renamed from: d */
    public final /* synthetic */ C88267e f11255d;

    /* renamed from: e */
    public final /* synthetic */ int f11256e;

    /* renamed from: f */
    public final /* synthetic */ JsApiTriggerBackgroundFetch f11257f;

    public C1636b(JsApiTriggerBackgroundFetch jsApiTriggerBackgroundFetch, C88267e eVar, int i) {
        this.f11257f = jsApiTriggerBackgroundFetch;
        this.f11255d = eVar;
        this.f11256e = i;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCString iPCString = (IPCString) obj;
        Log.m105925i("MicroMsg.AppBrand.JsApiTriggerBackgroundFetch", "result:%s", iPCString);
        if (iPCString == null || Util.isNullOrNil(iPCString.f10315d)) {
            this.f11255d.mo109647a(this.f11256e, this.f11257f.mo115109j("fail"));
        } else {
            this.f11255d.mo109647a(this.f11256e, this.f11257f.mo115109j(iPCString.f10315d));
        }
    }
}
