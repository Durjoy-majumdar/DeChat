package com.tencent.p014mm.plugin.appbrand.jsapi.bio.face;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C1761b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import p224ra.C89909e;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.face.f */
public class C1643f extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 495;
    public static final String NAME = "faceVerifyForPay";

    /* renamed from: w */
    public static void m1686w(C1643f fVar, C82381f fVar2, int i, Bundle bundle, String str) {
        String str2;
        String str3;
        String str4;
        int i2;
        boolean z;
        Bundle bundle2 = bundle;
        fVar.getClass();
        boolean z2 = false;
        Log.m105925i("MicroMsg.JsApiStartFaceAction", "callbackResult :%s", str);
        if (bundle2 != null) {
            i2 = bundle2.getInt("err_code");
            str4 = bundle2.getString("err_msg");
            str3 = bundle2.getString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            str2 = bundle2.getString("serial_id");
            boolean z3 = bundle2.getString("click_other_verify_btn") != null && "yes".equals(bundle2.getString("click_other_verify_btn"));
            z = bundle2.getString("click_other_verify_btn_front") != null && "yes".equals(bundle2.getString("click_other_verify_btn_front"));
            Log.m105925i("MicroMsg.JsApiStartFaceAction", "errCode :%s, errMsg:%s , token:%s, serialId:%s, mClickOtherVerifyBtn:%s, mClickOtherVerifyBtnFront:%s", Integer.valueOf(i2), str4, str3, str2, Boolean.valueOf(z3), Boolean.valueOf(z));
            z2 = z3;
        } else {
            str4 = "nothing return";
            str3 = "";
            str2 = str3;
            z = false;
            i2 = -1;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("err_code", Integer.valueOf(i2));
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str3);
        hashMap.put("serial_id", str2);
        hashMap.put("click_other_verify_btn", Boolean.valueOf(z2));
        hashMap.put("click_other_verify_btn_front", Boolean.valueOf(z));
        fVar2.mo109647a(i, fVar.mo115112m(str4, hashMap));
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar;
        boolean z;
        JSONObject jSONObject2 = jSONObject;
        C82554k kVar2 = (C82554k) fVar;
        this.f242314e = false;
        Log.m105924i("MicroMsg.JsApiStartFaceAction", " start JsApiStartFaceAction（） ");
        C115669n.INSTANCE.idkeyStat(917, 35, 1, false);
        Activity R = kVar2.getRuntime().mo113026R();
        if (R == null) {
            Log.m105921e("MicroMsg.JsApiStartFaceAction", "JsApiFaceAsyncBase context is null, appId is %s", kVar2.getAppId());
            kVar2.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        int i2 = i;
        int optInt = jSONObject2.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        String optString = jSONObject2.optString("package");
        String optString2 = jSONObject2.optString("packageSign");
        String optString3 = jSONObject2.optString("otherVerifyTitle");
        String optString4 = jSONObject2.optString("otherVerifyTitleFront");
        String optString5 = jSONObject2.optString("needFrontPage");
        C82554k kVar3 = kVar2;
        String optString6 = jSONObject2.optString("faceVerifyTitle");
        String str = optString6;
        Log.m105925i("MicroMsg.JsApiStartFaceAction", " packageName ：%s , packageSign:%s , otherVerifyTitle:%s , otherVerifyTitleFront:%s, needFrontPage:%s，faceVerifyTitle：%s", optString, optString2, optString3, optString4, optString5, optString6);
        Intent intent = new Intent();
        intent.setClassName(R, "com.tencent.mm.plugin.facedetectaction.ui.FaceTransStubUI");
        Bundle bundle = new Bundle();
        bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, optInt);
        bundle.putString("package", optString);
        bundle.putString("packageSign", optString2);
        bundle.putString("otherVerifyTitle", optString3);
        bundle.putString("otherVerifyTitleFront", optString4);
        bundle.putString("needFrontPage", optString5);
        bundle.putString("faceVerifyTitle", str);
        intent.putExtras(bundle);
        C1761b bVar = (C1761b) C89909e.m112436a(C1761b.class);
        if (bVar != null) {
            kVar = kVar3;
            z = bVar.mo1749X0(kVar);
        } else {
            kVar = kVar3;
            z = false;
        }
        if (z) {
            bVar.mo1750dE();
        }
        C89916g.m112446a(R).mo124232f(new C1642e(this, z, bVar, kVar, i));
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(63);
        aVar.mo10233c(intent);
        C117292a.m165364j(R, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/bio/face/JsApiStartFaceAction", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWithExtra;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
