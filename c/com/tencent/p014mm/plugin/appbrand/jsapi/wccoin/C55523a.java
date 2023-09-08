package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import f40.C86709a0;
import gy3.C87412m;
import m53.C10756c;
import m53.C10759e;
import m53.C10760f;
import m53.C10761g;
import m53.C10762h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.a */
public final class C55523a extends AppBrandProxyUIProcessTask {

    /* renamed from: d */
    public final String f158123d = "MicroMsg.BuyWCCoinTask";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.a$a */
    public static final class C55524a implements C10762h<Void> {

        /* renamed from: a */
        public final /* synthetic */ C55523a f158124a;

        /* renamed from: b */
        public final /* synthetic */ BuyWCCoinResult f158125b;

        public C55524a(C55523a aVar, BuyWCCoinResult buyWCCoinResult) {
            this.f158124a = aVar;
            this.f158125b = buyWCCoinResult;
        }

        /* renamed from: a */
        public void mo605a(int i, int i2, String str) {
            C87412m.m108594g(str, OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
            Log.m105925i(this.f158124a.f158123d, "onFailed,errorType:%s,errorCode:%s, msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i2 == -3) {
                BuyWCCoinResult buyWCCoinResult = this.f158125b;
                C55523a aVar = this.f158124a;
                buyWCCoinResult.getClass();
                buyWCCoinResult.f158118d = "cancel";
                aVar.finishProcess(buyWCCoinResult);
                return;
            }
            C55523a.m63164a(this.f158125b, this.f158124a);
        }

        public void onSuccess(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i(this.f158124a.f158123d, "success");
            BuyWCCoinResult buyWCCoinResult = this.f158125b;
            C55523a aVar = this.f158124a;
            buyWCCoinResult.getClass();
            buyWCCoinResult.f158118d = "ok";
            aVar.finishProcess(buyWCCoinResult);
        }
    }

    /* renamed from: a */
    public static final void m63164a(BuyWCCoinResult buyWCCoinResult, C55523a aVar) {
        buyWCCoinResult.getClass();
        buyWCCoinResult.f158118d = "fail";
        aVar.finishProcess(buyWCCoinResult);
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        Class cls = C10756c.class;
        C87412m.m108594g(processRequest, "request");
        BuyWCCoinResult buyWCCoinResult = new BuyWCCoinResult();
        if (!(processRequest instanceof BuyWCCoinRequest)) {
            Log.m105928w(this.f158123d, "handleRequest, request not instance of BuyWCCoinRequest");
            m63164a(buyWCCoinResult, this);
            return;
        }
        C55524a aVar = new C55524a(this, buyWCCoinResult);
        BuyWCCoinRequest buyWCCoinRequest = (BuyWCCoinRequest) processRequest;
        boolean z = true;
        if ((buyWCCoinRequest.f158114g.length() == 0) || C87412m.m108589b(buyWCCoinRequest.f158114g, "1")) {
            C10761g gVar = new C10761g();
            gVar.f32223b = buyWCCoinRequest.f158111d;
            gVar.f32222a = buyWCCoinRequest.f158112e;
            C10759e.m10739a(buyWCCoinRequest.f158113f);
            gVar.f32224c = "";
            gVar.f32225d = aVar;
            gVar.f32228g = C10760f.COMMON_CHARGE;
            ((C10756c) C86709a0.m107533q(cls)).q10(getActivityContext(), gVar);
        } else if (C87412m.m108589b(buyWCCoinRequest.f158114g, "2")) {
            if (buyWCCoinRequest.f158115h.length() == 0) {
                Log.m105924i(this.f158123d, "[WeCoin] doBuyWCCoin customCount is null");
                m63164a(buyWCCoinResult, this);
                return;
            }
            if (buyWCCoinRequest.f158116i.length() == 0) {
                Log.m105924i(this.f158123d, "[WeCoin] doBuyWCCoin productId is null");
                m63164a(buyWCCoinResult, this);
                return;
            }
            if (buyWCCoinRequest.f158117j.length() != 0) {
                z = false;
            }
            if (z) {
                Log.m105924i(this.f158123d, "[WeCoin] doBuyWCCoin agreementVersion is null");
                m63164a(buyWCCoinResult, this);
                return;
            }
            C10761g gVar2 = new C10761g();
            gVar2.f32223b = buyWCCoinRequest.f158111d;
            gVar2.f32227f = buyWCCoinRequest.f158116i;
            gVar2.f32229h = Long.parseLong(buyWCCoinRequest.f158115h);
            gVar2.f32226e = Integer.parseInt(buyWCCoinRequest.f158117j);
            gVar2.f32222a = buyWCCoinRequest.f158112e;
            gVar2.f32224c = "";
            gVar2.f32225d = aVar;
            gVar2.f32228g = C10760f.DIRECT_CHARGE;
            C10759e.m10739a(buyWCCoinRequest.f158113f);
            ((C10756c) C86709a0.m107533q(cls)).q10(getActivityContext(), gVar2);
        } else {
            Log.m105924i(this.f158123d, "mode not right");
            m63164a(buyWCCoinResult, this);
        }
    }
}
