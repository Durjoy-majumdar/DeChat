package com.tencent.p014mm.plugin.wallet_core.utils;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.y */
public class C72516y {
    /* renamed from: a */
    public static void m84852a(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData() json is null");
            return;
        }
        Log.m105924i("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData()");
        int optInt = jSONObject.optInt("is_open_sns_pay", 0);
        int optInt2 = jSONObject.optInt("can_open_sns_pay", 0);
        int optInt3 = jSONObject.optInt("is_white_user", 0);
        String str4 = "";
        if (optInt2 == 1) {
            str2 = jSONObject.optString("open_sns_pay_title");
            str = jSONObject.optString("open_sns_pay_wording");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_OPEN_SNS_PAY_TITLE_STRING_SYNC, str2);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_OPEN_SNS_PAY_WORDING_STRING_SYNC, str);
        } else {
            str2 = str4;
            str = str2;
        }
        Log.m105924i("MicroMsg.WalletNetSceneUtil", "is_open_sns_pay:" + optInt + ", can_open_sns_pay:" + optInt2 + ", is_white_user:" + optInt3);
        StringBuilder sb = new StringBuilder();
        sb.append("open_sns_pay_title:");
        sb.append(str2);
        sb.append(", open_sns_pay_wording:");
        sb.append(str);
        Log.m105924i("MicroMsg.WalletNetSceneUtil", sb.toString());
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_IS_OPEN_SNS_PAY_INT_SYNC, Integer.valueOf(optInt));
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_CAN_OPEN_SNS_PAY_INT_SYNC, Integer.valueOf(optInt2));
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_IS_WHITE_USER_INT_SYNC, Integer.valueOf(optInt3));
        if (optInt3 == 1) {
            str4 = jSONObject.optString("set_sns_pay_title");
            str3 = jSONObject.optString("set_sns_pay_wording");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SET_SNS_PAY_TITLE_STRING_SYNC, str4);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SET_SNS_PAY_WORDING_STRING_SYNC, str3);
        } else {
            str3 = str4;
        }
        Log.m105924i("MicroMsg.WalletNetSceneUtil", "set_sns_pay_title:" + str4 + ", set_sns_pay_wording:" + str3);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }
}
