package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.openim.model.OpenImKefuStartChattingResultReceiver;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C87412m;
import he0.C46025n;
import he0.C59837i;
import kotlin.Metadata;
import org.json.JSONObject;
import te3.C49810i73;
import te3.C51195s3;
import te3.C90449z73;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/p;", "Lcom/tencent/mm/plugin/lite/api/c;", "<init>", "()V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.p */
public final class C56840p extends C4770c {

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.p$a */
    public static final class C56841a implements OpenImKefuStartChattingResultReceiver.C40388a {

        /* renamed from: a */
        public boolean f162871a;

        /* renamed from: b */
        public final /* synthetic */ C56840p f162872b;

        /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.p$a$a */
        public static final class C56842a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C56840p f162873d;

            public C56842a(C56840p pVar) {
                this.f162873d = pVar;
            }

            public final void run() {
                this.f162873d.f19815f.mo5690b();
            }
        }

        public C56841a(C56840p pVar) {
            this.f162872b = pVar;
        }

        /* renamed from: a */
        public void mo63102a(Bundle bundle) {
            int i;
            if (bundle != null && (i = bundle.getInt("result_key_action", -1)) >= 0) {
                int i2 = bundle.getInt("result_key_err_code", -1);
                String string = bundle.getString("result_key_err_msg", "");
                Log.m105924i("LiteAppJsApiOpenCustomerServiceChatForFakeNative", "openCustomerServiceChat onReceiveResult action: " + i + ", errCode: " + i2 + ", errMsg: " + string);
                if (i == 3) {
                    C119179t tVar = C119157j.f356862d;
                    C56842a aVar = new C56842a(this.f162872b);
                    long j = this.f162871a ? 0 : 1000;
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(aVar, j, false);
                } else if (i != 5) {
                    this.f162872b.f19815f.mo5689a(string);
                } else {
                    this.f162871a = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiOpenCustomerServiceChatForFakeNative", "Invoke openCustomerServiceChatForFakeNative");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        String optString = jSONObject.optString("extInfo");
        if (optString == null || optString.length() == 0) {
            this.f19815f.mo5689a("extInfo is null");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(optString);
        String optString2 = jSONObject2.optString("url");
        if (optString2 == null || optString2.length() == 0) {
            Log.m105920e("LiteAppJsApiOpenCustomerServiceChatForFakeNative", "url is null");
            this.f19815f.mo5689a("url is null");
            return;
        }
        int optInt = jSONObject2.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
        long currentTimeMillis = System.currentTimeMillis();
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new OpenIMKefuStartConversationRequest();
        openIMKefuStartConversationRequest.f108515d = MMApplicationContext.getContext();
        openIMKefuStartConversationRequest.f108516e = currentTimeMillis;
        openIMKefuStartConversationRequest.f108517f = optInt;
        C51195s3 s3Var = new C51195s3();
        s3Var.f141285d = optString2;
        C49810i73 i732 = new C49810i73();
        i732.f135156f = optString2;
        i732.f135154d = openIMKefuStartConversationRequest.f108517f;
        i732.f135155e = jSONObject2.optString("entity", "");
        s3Var.f141288g = i732;
        openIMKefuStartConversationRequest.f108520i = s3Var;
        openIMKefuStartConversationRequest.f108519h = C46025n.m51344a(openIMKefuStartConversationRequest.f108517f);
        C90449z73 z732 = new C90449z73();
        z732.f259952e = jSONObject.optString("sendMessageTitle");
        z732.f259953f = jSONObject.optString("sendMessagePath");
        z732.f259954g = jSONObject.optString("sendMessageImg");
        z732.f259955h = false;
        Intent intent = new Intent();
        openIMKefuStartConversationRequest.f108528t = intent;
        Handler createFreeHandler = MMHandler.createFreeHandler(Looper.getMainLooper());
        C87412m.m108593f(createFreeHandler, "createFreeHandler(\n     …  Looper.getMainLooper())");
        intent.putExtra("key_result_receiver", new OpenImKefuStartChattingResultReceiver(createFreeHandler, new C56841a(this)));
        C59837i iVar = (C59837i) C86312j.m106911c(C59837i.class);
        if (iVar != null) {
            iVar.mo71855jT(openIMKefuStartConversationRequest);
        }
        Log.m105925i("LiteAppJsApiOpenCustomerServiceChatForFakeNative", "openCustomerServiceChat scene: %s, data: %s", Integer.valueOf(optInt), jSONObject);
    }
}
