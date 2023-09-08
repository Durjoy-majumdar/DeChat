package com.tencent.p014mm.plugin.mall.p075ui;

import c63.C67346c;
import c63.C67347d;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.mall.ui.s */
public class C69797s {
    /* renamed from: a */
    public static int m82221a(MallFunction mallFunction) {
        if (mallFunction == null) {
            return 3;
        }
        C67346c.m79699b().mo91481f(mallFunction.f209731d);
        C67347d.m79705b().mo91485d(mallFunction.f209731d);
        if (mallFunction.f209739o != null) {
            C67346c.m79699b().mo91480d(mallFunction);
        }
        if ("wxpay://bizmall/mobile_recharge".equals(mallFunction.f209736i)) {
            return 0;
        }
        if ("wxpay://bizmall/weixin_hongbao".equals(mallFunction.f209736i)) {
            return 4;
        }
        if ("wxpay://bizmall/weixin_scan_qrcode".equals(mallFunction.f209736i)) {
            return 8;
        }
        if ("wxpay://bizmall/weixin_transfer".equals(mallFunction.f209736i)) {
            return 5;
        }
        if ("wxpay://bizmall/weixin_offline_pay".equals(mallFunction.f209736i)) {
            return 6;
        }
        if ("wxpay://bizmall/old_mobile_recharge".equals(mallFunction.f209736i)) {
            return 7;
        }
        if (!Util.isNullOrNil(mallFunction.f209737j)) {
            return 1;
        }
        if ("wxpay://bizmall/f2f_hongbao".equals(mallFunction.f209736i)) {
            return 9;
        }
        Log.m105928w("MicroMsg.MallIndexUIHelper", "doSelectFunction no jump");
        return 2;
    }
}
