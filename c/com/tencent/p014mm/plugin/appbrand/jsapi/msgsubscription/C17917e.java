package com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription;

import com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor;
import zd0.C23466p;
import zd0.C91663l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.e */
public final class C17917e implements C91663l.C91665b {

    /* renamed from: a */
    public final /* synthetic */ GetSubscribeMsgListExecutor f49421a;

    /* renamed from: b */
    public final /* synthetic */ C23466p f49422b;

    public C17917e(GetSubscribeMsgListExecutor getSubscribeMsgListExecutor, C23466p pVar) {
        this.f49421a = getSubscribeMsgListExecutor;
        this.f49422b = pVar;
    }

    public void onDismiss() {
        GetSubscribeMsgListExecutor.C17906b bVar = this.f49421a.f49389i;
        if (bVar != null) {
            bVar.mo22176b(this.f49422b);
        }
    }
}
