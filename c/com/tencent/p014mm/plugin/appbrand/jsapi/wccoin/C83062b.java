package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import android.util.Base64;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.StringKtKt;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import m53.C10756c;
import org.json.JSONArray;
import org.json.JSONException;
import rx3.C13598b0;
import s43.C13620a;
import s43.C13621b;
import s43.C13623d;
import s43.C13624e;
import sx3.C110823p;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.b */
public final class C83062b extends AppBrandProxyUIProcessTask {

    /* renamed from: d */
    public final String f242812d = "MicroMsg.ConsumeWCCoinTask";

    /* renamed from: e */
    public Object f242813e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.b$a */
    public static final class C83063a extends C87413o implements C32226l<C13621b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83062b f242814d;

        /* renamed from: e */
        public final /* synthetic */ ConsumeWCCoinResult f242815e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83063a(C83062b bVar, ConsumeWCCoinResult consumeWCCoinResult) {
            super(1);
            this.f242814d = bVar;
            this.f242815e = consumeWCCoinResult;
        }

        public Object invoke(Object obj) {
            C13621b bVar = (C13621b) obj;
            C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
            Log.m105924i(this.f242814d.f242812d, "success");
            ConsumeWCCoinResult consumeWCCoinResult = this.f242815e;
            C83062b bVar2 = this.f242814d;
            String valueOf = String.valueOf(bVar.f38589a);
            consumeWCCoinResult.getClass();
            consumeWCCoinResult.f242810d = "ok";
            C87412m.m108594g(valueOf, "<set-?>");
            consumeWCCoinResult.f242811e = valueOf;
            bVar2.finishProcess(consumeWCCoinResult);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.b$b */
    public static final class C83064b extends C87413o implements C32226l<C13620a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ConsumeWCCoinResult f242816d;

        /* renamed from: e */
        public final /* synthetic */ C83062b f242817e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83064b(ConsumeWCCoinResult consumeWCCoinResult, C83062b bVar) {
            super(1);
            this.f242816d = consumeWCCoinResult;
            this.f242817e = bVar;
        }

        public Object invoke(Object obj) {
            C13620a aVar = (C13620a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            int ordinal = aVar.f38588a.ordinal();
            if (ordinal == 0) {
                ConsumeWCCoinResult consumeWCCoinResult = this.f242816d;
                C83062b bVar = this.f242817e;
                consumeWCCoinResult.getClass();
                consumeWCCoinResult.f242810d = "fail";
                bVar.finishProcess(consumeWCCoinResult);
            } else if (ordinal == 1) {
                ConsumeWCCoinResult consumeWCCoinResult2 = this.f242816d;
                C83062b bVar2 = this.f242817e;
                consumeWCCoinResult2.getClass();
                consumeWCCoinResult2.f242810d = "insufficient";
                bVar2.finishProcess(consumeWCCoinResult2);
            } else if (ordinal == 2) {
                ConsumeWCCoinResult consumeWCCoinResult3 = this.f242816d;
                C83062b bVar3 = this.f242817e;
                consumeWCCoinResult3.getClass();
                consumeWCCoinResult3.f242810d = "intercept";
                bVar3.finishProcess(consumeWCCoinResult3);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.b$c */
    public static final class C83065c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ConsumeWCCoinResult f242818d;

        /* renamed from: e */
        public final /* synthetic */ C83062b f242819e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83065c(ConsumeWCCoinResult consumeWCCoinResult, C83062b bVar) {
            super(0);
            this.f242818d = consumeWCCoinResult;
            this.f242819e = bVar;
        }

        public Object invoke() {
            ConsumeWCCoinResult consumeWCCoinResult = this.f242818d;
            C83062b bVar = this.f242819e;
            consumeWCCoinResult.getClass();
            consumeWCCoinResult.f242810d = "cancel";
            bVar.finishProcess(consumeWCCoinResult);
            return C13598b0.f38549a;
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        C87412m.m108594g(processRequest, "request");
        ConsumeWCCoinResult consumeWCCoinResult = new ConsumeWCCoinResult();
        if (!(processRequest instanceof ConsumeWCCoinRequest)) {
            Log.m105928w(this.f242812d, "handleRequest, request not instance of ConsumeWCCoinRequest");
            consumeWCCoinResult.f242810d = "fail";
            finishProcess(consumeWCCoinResult);
            return;
        }
        ConsumeWCCoinRequest consumeWCCoinRequest = (ConsumeWCCoinRequest) processRequest;
        int safeToInt = StringKtKt.safeToInt(consumeWCCoinRequest.f242803e);
        MMActivity activityContext = getActivityContext();
        C87412m.m108593f(activityContext, "activityContext");
        C13624e eVar = new C13624e(safeToInt, activityContext, new C83063a(this, consumeWCCoinResult), new C83064b(consumeWCCoinResult, this), new C83065c(consumeWCCoinResult, this));
        if (consumeWCCoinRequest.f242804f == 2) {
            eVar.f38602f = C13623d.ShowPanel;
            String str = consumeWCCoinRequest.f242805g;
            C87412m.m108594g(str, "<set-?>");
            eVar.f38604h = str;
            String str2 = consumeWCCoinRequest.f242806h;
            C87412m.m108594g(str2, "<set-?>");
            eVar.f38605i = str2;
            eVar.f38606j = consumeWCCoinRequest.f242807i;
            String str3 = consumeWCCoinRequest.f242808j;
            C87412m.m108594g(str3, "<set-?>");
            eVar.f38607k = str3;
            if (consumeWCCoinRequest.f242809n.length() > 0) {
                try {
                    String[] stringArray = Util.toStringArray(new JSONArray(((ConsumeWCCoinRequest) processRequest).f242809n));
                    C87412m.m108593f(stringArray, "toStringArray(tips)");
                    eVar.f38608l = C110823p.m151001a0(stringArray);
                } catch (JSONException unused) {
                    Log.m105924i(this.f242812d, "json parse fail");
                    consumeWCCoinResult.f242810d = "fail";
                    finishProcess(consumeWCCoinResult);
                    return;
                }
            }
        }
        eVar.f38603g = Base64.decode(consumeWCCoinRequest.f242802d, 2);
        this.f242813e = ((C10756c) C86709a0.m107533q(C10756c.class)).mo10992Gy(eVar);
    }
}
