package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.wallet_core.model.z0 */
public class C45121z0 {
    /* renamed from: a */
    public static int m49961a() {
        if (C75592q0.m90763K()) {
            return C0966R.string.bgh;
        }
        boolean z = false;
        if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_more_tab_new_name_cn_config, false)) {
            return C0966R.string.bgg;
        }
        Pattern pattern = C75228t.f221346a;
        if (((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() == 8) {
            z = true;
        }
        return z ? C0966R.string.btc : C0966R.string.lqe;
    }

    /* renamed from: b */
    public static String m49962b() {
        return C75592q0.m90763K() ? "R" : C75592q0.m90753A() ? "HK$" : "¥";
    }

    /* renamed from: c */
    public static int m49963c() {
        return C75592q0.m90763K() ? C0966R.string.b8r : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_more_tab_new_name_cn_config, false) ? C0966R.string.lrg : C0966R.string.l7b;
    }
}
