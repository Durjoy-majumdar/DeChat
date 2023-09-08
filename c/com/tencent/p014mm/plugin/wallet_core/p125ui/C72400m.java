package com.tencent.p014mm.plugin.wallet_core.p125ui;

import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import y43.C79033l;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.m */
public enum C72400m {
    INSTANCE;
    

    /* renamed from: d */
    public Map<String, WeakReference<C72394l>> f210632d;

    /* renamed from: a */
    public C72394l mo99776a(Orders orders) {
        String str;
        C79033l lVar;
        if (orders == null || orders.f209542M == null) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < orders.f209542M.size(); i++) {
                sb.append(orders.f209542M.get(i).f209606r);
            }
            sb.append("@");
            sb.append(orders.f209562d);
            str = sb.toString();
        }
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.FavorLogicHelperPool", "get key null");
            return null;
        }
        if (((HashMap) this.f210632d).containsKey(str)) {
            Log.m105924i("MicroMsg.FavorLogicHelperPool", "hit cache, key:" + str);
            WeakReference weakReference = (WeakReference) ((HashMap) this.f210632d).get(str);
            if (weakReference != null) {
                C72394l lVar2 = (C72394l) weakReference.get();
                if (lVar2 != null) {
                    return lVar2;
                }
                Log.m105924i("MicroMsg.FavorLogicHelperPool", "helper null");
            } else {
                Log.m105924i("MicroMsg.FavorLogicHelperPool", "weakHelper null");
            }
        }
        if (orders == null || (lVar = orders.f209543N) == null) {
            return null;
        }
        C72394l lVar3 = new C72394l(lVar);
        ((HashMap) this.f210632d).put(str, new WeakReference(lVar3));
        return lVar3;
    }
}
