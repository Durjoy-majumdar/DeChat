package com.tencent.p014mm.plugin.account.p024ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$x */
public class LoginHistoryUI$$x implements C11182m0 {
    public LoginHistoryUI$$x(LoginHistoryUI loginHistoryUI) {
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.size() == 0) {
            e0Var.mo107125a(7002, C0966R.string.gch);
            e0Var.mo107125a(7003, C0966R.string.frf);
            e0Var.mo107125a(7004, C0966R.string.lis);
            if (!LocaleUtil.isSimplifiedChineseAppLang()) {
                e0Var.mo107125a(7009, C0966R.string.lip);
            }
        }
    }
}
