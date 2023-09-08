package gp2;

import android.app.Activity;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import e42.C7594e;
import e42.C7596h;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hp2.C87577a;
import hp2.C87578b;
import ip2.C87788c;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C49964j92;
import te3.C50098k92;
import z04.C112551y;

/* renamed from: gp2.j */
public final class C87297j<T extends C7594e> extends C87578b<T> {

    /* renamed from: gp2.j$a */
    public static final class C87298a extends C87413o implements C32227p<Integer, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87577a f253024d;

        /* renamed from: e */
        public final /* synthetic */ String f253025e;

        /* renamed from: f */
        public final /* synthetic */ String f253026f;

        /* renamed from: g */
        public final /* synthetic */ String f253027g;

        /* renamed from: h */
        public final /* synthetic */ int f253028h;

        /* renamed from: i */
        public final /* synthetic */ String f253029i;

        /* renamed from: j */
        public final /* synthetic */ String f253030j;

        /* renamed from: n */
        public final /* synthetic */ String f253031n;

        /* renamed from: o */
        public final /* synthetic */ String f253032o;

        /* renamed from: p */
        public final /* synthetic */ C87297j<T> f253033p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87298a(C87577a aVar, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, C87297j<T> jVar) {
            super(2);
            this.f253024d = aVar;
            this.f253025e = str;
            this.f253026f = str2;
            this.f253027g = str3;
            this.f253028h = i;
            this.f253029i = str4;
            this.f253030j = str5;
            this.f253031n = str6;
            this.f253032o = str7;
            this.f253033p = jVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat$doAction$1");
            int intValue = ((Number) obj).intValue();
            String str2 = (String) obj2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat$doAction$1");
            C87412m.m108594g(str2, "subBizName");
            if (intValue == 0) {
                C87312u uVar = C87312u.f253047a;
                Activity a = this.f253024d.mo122022a();
                String str3 = this.f253025e;
                C87412m.m108593f(str3, "userName");
                String str4 = this.f253026f;
                C87412m.m108593f(str4, "weAppId");
                String str5 = this.f253027g;
                C87412m.m108593f(str5, "sessionFrom");
                int i = this.f253028h;
                String str6 = this.f253029i;
                C87412m.m108593f(str6, "sendMessageTitle");
                String str7 = this.f253030j;
                C87412m.m108593f(str7, "sendMessagePath");
                String str8 = this.f253031n;
                C87412m.m108593f(str8, "sendMessageImg");
                str = "invoke";
                String str9 = "access$backToJs";
                uVar.mo121701a(a, str3, str4, str5, i, str6, str7, str8, this.f253032o, str2);
                C87297j<T> jVar = this.f253033p;
                C7596h i2 = jVar.mo120844i();
                SnsMethodCalculate.markStartTimeMs(str9, "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat");
                jVar.mo122027r(i2);
                SnsMethodCalculate.markEndTimeMs(str9, "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat");
            } else {
                str = "invoke";
                String str10 = "access$backToJs";
                C87297j<T> jVar2 = this.f253033p;
                C7596h g = jVar2.mo120842g(10000, "there is not network");
                SnsMethodCalculate.markStartTimeMs(str10, "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat");
                jVar2.mo122027r(g);
                SnsMethodCalculate.markEndTimeMs(str10, "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat");
            }
            String str11 = str;
            SnsMethodCalculate.markEndTimeMs(str11, "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat$doAction$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs(str11, "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat$doAction$1");
            return b0Var;
        }
    }

    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat");
        return "openCustomerServiceChat";
    }

    /* renamed from: u */
    public void mo121696u(C87577a aVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat");
        C87412m.m108594g(aVar, "env");
        C87412m.m108594g(jSONObject2, "data");
        String optString = jSONObject2.optString("weappUserName");
        String optString2 = jSONObject2.optString("businessId");
        String optString3 = jSONObject2.optString("weAppId");
        String optString4 = jSONObject2.optString("sessionFrom");
        int optInt = jSONObject2.optInt("showMessageCard");
        String optString5 = jSONObject2.optString("sendMessageTitle");
        String optString6 = jSONObject2.optString("sendMessagePath");
        String optString7 = jSONObject2.optString("sendMessageImg");
        String a = C87788c.m109226a(aVar.mo122023b());
        String str = "doAction";
        String str2 = "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenCustomerServiceChat";
        if (optString2 == null || C112551y.m153811k(optString2)) {
            C87312u uVar = C87312u.f253047a;
            Activity a2 = aVar.mo122022a();
            C87412m.m108593f(optString, "userName");
            C87412m.m108593f(optString3, "weAppId");
            C87412m.m108593f(optString4, "sessionFrom");
            C87412m.m108593f(optString5, "sendMessageTitle");
            C87412m.m108593f(optString6, "sendMessagePath");
            C87412m.m108593f(optString7, "sendMessageImg");
            SnsMethodCalculate.markStartTimeMs("doEnterChattingOnMainThread$default", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper");
            uVar.mo121701a(a2, optString, optString3, optString4, optInt, optString5, optString6, optString7, a, "");
            SnsMethodCalculate.markEndTimeMs("doEnterChattingOnMainThread$default", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper");
            mo122027r(mo120844i());
        } else {
            String str3 = optString6;
            if (!NetStatusUtil.isNetworkConnected(aVar.mo122022a())) {
                Log.m105928w("SnsAdMb.JsApi", "there is no network");
                mo122027r(mo120842g(10000, "there is no network"));
            } else {
                Activity a3 = aVar.mo122022a();
                C87412m.m108593f(optString, "userName");
                C87412m.m108593f(optString2, "businessId");
                C87298a aVar2 = new C87298a(aVar, optString, optString3, optString4, optInt, optString5, str3, optString7, a, this);
                SnsMethodCalculate.markStartTimeMs("getSubBusinessInfo", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper");
                C87412m.m108594g(a3, "context");
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = new C49964j92();
                bVar.f127067b = new C50098k92();
                bVar.f127068c = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
                bVar.f127069d = 1303;
                bVar.f127070e = 0;
                bVar.f127071f = 0;
                C47350c a4 = bVar.mo72403a();
                C47465a aVar3 = a4.f127055a.f127080a;
                C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetSubBusinessInfoRequest");
                C49964j92 j922 = (C49964j92) aVar3;
                j922.f135942d = optString;
                j922.f135943e = optString2;
                ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a4, new C45941v(aVar2));
                SnsMethodCalculate.markEndTimeMs("getSubBusinessInfo", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper");
            }
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
