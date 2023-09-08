package com.tencent.p014mm.plugin.recharge.p093ui;

import com.tencent.p014mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.recharge.ui.d */
public class C70454d {
    /* renamed from: a */
    public static MallRechargeProduct m83006a(List<MallRechargeProduct> list) {
        for (MallRechargeProduct next : list) {
            if (next.f203477q && next.mo96998a()) {
                Log.m105918d("MicroMsg.MallRechargeLogic", "find the defaultProduct");
                return next;
            }
        }
        Log.m105918d("MicroMsg.MallRechargeLogic", "products.get(0)");
        return list.get(0);
    }
}
