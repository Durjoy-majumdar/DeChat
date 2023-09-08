package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82341m;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50098k92;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.o */
public class C82346o implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C82341m.C82343b f241349a;

    /* renamed from: b */
    public final /* synthetic */ C83928t1 f241350b;

    /* renamed from: c */
    public final /* synthetic */ C82341m f241351c;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.o$a */
    public class C82347a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C50098k92 f241352d;

        public C82347a(C50098k92 k922) {
            this.f241352d = k922;
        }

        public void run() {
            C82346o oVar = C82346o.this;
            C82341m mVar = oVar.f241351c;
            mVar.f241332q = this.f241352d.f136626d;
            C83928t1 t1Var = oVar.f241350b;
            C82341m.C82343b bVar = oVar.f241349a;
            mVar.getClass();
            JsApiChattingTask jsApiChattingTask = new JsApiChattingTask();
            String str = mVar.f241331p;
            jsApiChattingTask.f241244g = str;
            String str2 = mVar.f241332q;
            if (!Util.isNullOrNil(str2)) {
                str = str2;
            } else if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.JsApiPrivateEnterContact", "username & subBusinessUsername is null, err");
                str = "";
            }
            jsApiChattingTask.f241245h = str;
            jsApiChattingTask.f241243f = mVar.f241325g;
            jsApiChattingTask.f241247j = new C82348p(mVar, jsApiChattingTask, t1Var, bVar);
            jsApiChattingTask.mo114395c();
        }
    }

    public C82346o(C82341m mVar, C82341m.C82343b bVar, C83928t1 t1Var) {
        this.f241351c = mVar;
        this.f241349a = bVar;
        this.f241350b = t1Var;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar;
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            C50098k92 k922 = (C50098k92) aVar;
            Log.m105925i("MicroMsg.JsApiPrivateEnterContact", "getsubbusinessinfo success, subBusinessUsername:%s", k922.f136626d);
            MMHandlerThread.postToMainThread(new C82347a(k922));
            return;
        }
        Log.m105921e("MicroMsg.JsApiPrivateEnterContact", "getsubbusinessinfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", Integer.valueOf(i), Integer.valueOf(i2), str, cVar.f127056b.f127083a);
        C82341m.C82343b bVar = this.f241349a;
        if (bVar != null) {
            ((C82341m.C82342a) bVar).mo114729a(false, "fail:cgi fail", (Intent) null);
        }
    }
}
