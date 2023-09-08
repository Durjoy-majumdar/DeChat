package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import m53.C10754b;
import m53.C10756c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.p */
public final class C55532p extends AppBrandProxyUIProcessTask {

    /* renamed from: d */
    public final String f158136d = "MicroMsg.ShowWCCoinFirstBuyCoinTipsTask";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.p$a */
    public static final class C55533a implements C10754b.C10755a {

        /* renamed from: a */
        public final /* synthetic */ ShowWCCoinFirstBuyCoinTipsResult f158137a;

        /* renamed from: b */
        public final /* synthetic */ C55532p f158138b;

        public C55533a(ShowWCCoinFirstBuyCoinTipsResult showWCCoinFirstBuyCoinTipsResult, C55532p pVar) {
            this.f158137a = showWCCoinFirstBuyCoinTipsResult;
            this.f158138b = pVar;
        }

        /* renamed from: a */
        public final void mo601a(C10754b bVar) {
            ShowWCCoinFirstBuyCoinTipsResult showWCCoinFirstBuyCoinTipsResult = this.f158137a;
            C55532p pVar = this.f158138b;
            showWCCoinFirstBuyCoinTipsResult.getClass();
            showWCCoinFirstBuyCoinTipsResult.f158122d = "ok";
            pVar.finishProcess(showWCCoinFirstBuyCoinTipsResult);
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        C87412m.m108594g(processRequest, "request");
        ShowWCCoinFirstBuyCoinTipsResult showWCCoinFirstBuyCoinTipsResult = new ShowWCCoinFirstBuyCoinTipsResult();
        if (!(processRequest instanceof ShowWCCoinFirstBuyCoinTipsRequest)) {
            Log.m105928w(this.f158136d, "handleRequest, request not instance of ConsumeWCCoinRequest");
            showWCCoinFirstBuyCoinTipsResult.f158122d = "fail";
            finishProcess(showWCCoinFirstBuyCoinTipsResult);
            return;
        }
        boolean z = false;
        if (((ShowWCCoinFirstBuyCoinTipsRequest) processRequest).f158121d == 1) {
            z = true;
        }
        C10754b Ed0 = ((C10756c) C86709a0.m107533q(C10756c.class)).Ed0(getActivityContext(), z);
        if (Ed0 == null) {
            showWCCoinFirstBuyCoinTipsResult.f158122d = "ok";
            finishProcess(showWCCoinFirstBuyCoinTipsResult);
            return;
        }
        Ed0.mo10988a(new C55533a(showWCCoinFirstBuyCoinTipsResult, this));
    }
}
