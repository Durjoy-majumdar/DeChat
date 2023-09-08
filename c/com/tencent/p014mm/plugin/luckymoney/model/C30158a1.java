package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.a1 */
public class C30158a1 {

    /* renamed from: a */
    public Set<String> f81527a = new HashSet();

    /* renamed from: b */
    public Object f81528b = new Object();

    public C30158a1() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_PAYMSGID_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            for (String add : str.split(",")) {
                this.f81527a.add(add);
            }
        }
    }

    /* renamed from: a */
    public boolean mo57182a(String str) {
        synchronized (this.f81528b) {
            if (!((HashSet) this.f81527a).contains(str)) {
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_HONGBAO_PAYMSGID_STRING_SYNC;
                StringBuilder sb = new StringBuilder((String) i.mo119685f(aVar, ""));
                if (((HashSet) this.f81527a).size() <= 0) {
                    sb.append(str);
                } else {
                    sb.append(",");
                    sb.append(str);
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, sb.toString());
                boolean add = ((HashSet) this.f81527a).add(str);
                return add;
            }
            Log.m105925i("MicroMsg.LuckyMoneyMsg", "has contains msg, %s", str);
            return false;
        }
    }

    /* renamed from: b */
    public void mo57183b(String str) {
        synchronized (this.f81528b) {
            ((HashSet) this.f81527a).remove(str);
            StringBuilder sb = new StringBuilder();
            Iterator it = ((HashSet) this.f81527a).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(",");
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_PAYMSGID_STRING_SYNC, sb.length() == 0 ? sb.toString() : sb.substring(0, sb.length() - 1));
        }
    }
}
