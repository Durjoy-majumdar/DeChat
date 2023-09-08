package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelpay.PayReq;
import com.tencent.p014mm.opensdk.modelpay.PayResp;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.f */
public class C72563f {
    /* renamed from: a */
    public static boolean m84919a(Context context, String str, PayResp payResp, PayReq.Options options) {
        String str2;
        int i;
        Log.m105918d("MicroMsg.PayCallbackHelper", "callback, packageName = " + str);
        if (options == null || Util.isNullOrNil(options.callbackClassName)) {
            str2 = str + ".wxapi.WXPayEntryActivity";
        } else {
            str2 = options.callbackClassName;
        }
        if (options == null || (i = options.callbackFlags) == -1) {
            i = 268435456;
        }
        Log.m105918d("MicroMsg.PayCallbackHelper", "callback, cbPkg = " + str + ", cbCls = " + str2 + ", cbFlags(hex) = " + Integer.toHexString(i));
        Bundle bundle = new Bundle();
        bundle.putString(ConstantsAPI.Token.WX_TOKEN_KEY, ConstantsAPI.Token.WX_TOKEN_VALUE_MSG);
        if (payResp != null) {
            payResp.toBundle(bundle);
        }
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = str;
        args.targetClassName = str2;
        args.bundle = bundle;
        args.flags = i;
        return MMessageActV2.send(context, args);
    }
}
