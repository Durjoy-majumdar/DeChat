package pt2;

import ad0.C91999u;
import android.text.TextUtils;
import android.util.Base64;
import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C58247e;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;
import z04.C112550d0;
import z04.C119027c;

/* renamed from: pt2.i */
public final class C62497i {

    /* renamed from: a */
    public static final C62497i f177536a = new C62497i();

    /* renamed from: pt2.i$a */
    public static final class C62498a {

        /* renamed from: a */
        public final String f177537a;

        /* renamed from: b */
        public final String f177538b;

        public C62498a(String str, String str2) {
            C87412m.m108594g(str, "templateId");
            C87412m.m108594g(str2, "musicId");
            this.f177537a = str;
            this.f177538b = str2;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
                return true;
            } else if (!(obj instanceof C62498a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
                return false;
            } else {
                C62498a aVar = (C62498a) obj;
                if (!C87412m.m108589b(this.f177537a, aVar.f177537a)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
                    return false;
                }
                boolean b = C87412m.m108589b(this.f177538b, aVar.f177538b);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
                return b;
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            int hashCode = (this.f177537a.hashCode() * 31) + this.f177538b.hashCode();
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            return hashCode;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            String str = "MiaoJianCutSameInfo[" + this.f177537a + ", " + this.f177538b + ']';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            return str;
        }
    }

    /* renamed from: a */
    public final boolean mo87529a() {
        SnsMethodCalculate.markStartTimeMs("disableWechatCutSame", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_maas_disable_wechat_cutsame, 0) == 1) {
            z = true;
        }
        Log.m105924i("MicroMsg.ThirdAppJumpHelper", "disableWechatCutSame " + z);
        SnsMethodCalculate.markEndTimeMs("disableWechatCutSame", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        return z;
    }

    /* renamed from: b */
    public final String mo87530b(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getJumpJSON", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        String str3 = "";
        if ((str2 == null || str2.length() == 0) || !C112550d0.m153803w(str2, "miaojianExtInfo", false, 2, (Object) null)) {
            SnsMethodCalculate.markEndTimeMs("getJumpJSON", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            return str3;
        }
        SnsMethodCalculate.markStartTimeMs("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        try {
            String optString = new C104289g(str2).optString("miaojianExtInfo");
            if (!TextUtils.isEmpty(optString)) {
                C104289g gVar = new C104289g();
                gVar.put("APP_TYPE", "APP_TYPE_SECOND_CUP");
                gVar.put("MSG_EXT", optString);
                String gVar2 = gVar.toString();
                C87412m.m108593f(gVar2, "jsonObj.toString()");
                SnsMethodCalculate.markEndTimeMs("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                str3 = gVar2;
            } else {
                SnsMethodCalculate.markEndTimeMs("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            }
        } catch (C79923f unused) {
            Log.m105920e("MicroMsg.ThirdAppJumpHelper", "parse SecondCutSimpleStyle JSON error");
            SnsMethodCalculate.markStartTimeMs("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            try {
                if (TextUtils.isEmpty(str2)) {
                    SnsMethodCalculate.markEndTimeMs("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                } else {
                    String optString2 = new C104289g(C91999u.m115575u(str2)).optString("miaojianExtInfo");
                    if (!TextUtils.isEmpty(optString2)) {
                        C104289g gVar3 = new C104289g();
                        gVar3.put("APP_TYPE", "APP_TYPE_SECOND_CUP");
                        gVar3.put("MSG_EXT", optString2);
                        String gVar4 = gVar3.toString();
                        C87412m.m108593f(gVar4, "jsonObj.toString()");
                        SnsMethodCalculate.markEndTimeMs("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                        str3 = gVar4;
                    } else {
                        SnsMethodCalculate.markEndTimeMs("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                    }
                }
            } catch (C79923f unused2) {
                Log.m105920e("MicroMsg.ThirdAppJumpHelper", "parse SecondCutSimpleStyle JSON error");
                SnsMethodCalculate.markEndTimeMs("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            }
            SnsMethodCalculate.markEndTimeMs("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        }
        SnsMethodCalculate.markEndTimeMs("getJumpJSON", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        return str3;
    }

    /* renamed from: c */
    public final C62498a mo87531c(String str) {
        Object obj;
        C62498a aVar;
        SnsMethodCalculate.markStartTimeMs("parsedMiaojianCutSameInfo", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        try {
            Result.Companion companion = Result.Companion;
            byte[] decode = Base64.decode(str, 0);
            C87412m.m108593f(decode, "decode(extMsg, Base64.DEFAULT)");
            obj = Result.m168114constructorimpl(new JSONObject(new String(decode, C119027c.f356488a)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r3 = Result.m168117exceptionOrNullimpl(obj);
        if (r3 != null) {
            Log.printErrStackTrace("MicroMsg.ThirdAppJumpHelper", r3, "getJson fail", new Object[0]);
        }
        C62498a aVar2 = null;
        if (Result.m168120isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            if (jSONObject.has("templateId")) {
                String string = jSONObject.getString("templateId");
                C87412m.m108593f(string, "it.getString(\"templateId\")");
                String optString = jSONObject.optString("musicKey", "");
                C87412m.m108593f(optString, "it.optString(\"musicKey\", \"\")");
                aVar = new C62498a(string, optString);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("getTemplateId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
                String str2 = aVar.f177537a;
                SnsMethodCalculate.markEndTimeMs("getTemplateId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
                ((C58247e) C86312j.m106911c(C58247e.class)).mo82988cy(str2, false);
                aVar2 = aVar;
            }
        }
        Log.m105924i("MicroMsg.ThirdAppJumpHelper", "parsedMiaojianCutSameInfo: " + aVar2);
        SnsMethodCalculate.markEndTimeMs("parsedMiaojianCutSameInfo", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        return aVar2;
    }
}
