package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.c */
public class C71884c {
    /* renamed from: a */
    public static boolean m84324a(Bankcard bankcard) {
        String[] split;
        if (bankcard == null) {
            return false;
        }
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(196659, (Object) null);
        if (!(TextUtils.isEmpty(str) || (split = str.split("&")) == null || split.length == 0)) {
            for (String str2 : split) {
                if (str2 != null && str2.equals(bankcard.field_bankcardType)) {
                    return false;
                }
            }
        }
        return true;
    }
}
