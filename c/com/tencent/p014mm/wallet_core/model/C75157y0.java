package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;

/* renamed from: com.tencent.mm.wallet_core.model.y0 */
public class C75157y0 {
    /* renamed from: a */
    public static int m90138a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static String m90139b(int i) {
        Context context = MMApplicationContext.getContext();
        switch (i) {
            case 1:
                return C76577a.m92166q(context, C0966R.string.kz6);
            case 2:
                return C76577a.m92166q(context, C0966R.string.kza);
            case 3:
                return C76577a.m92166q(context, C0966R.string.kzb);
            case 4:
                return C76577a.m92166q(context, C0966R.string.kzc);
            case 5:
                return C76577a.m92166q(context, C0966R.string.kzd);
            case 6:
                return C76577a.m92166q(context, C0966R.string.kze);
            case 7:
                return C76577a.m92166q(context, C0966R.string.kzf);
            case 8:
                return C76577a.m92166q(context, C0966R.string.kzg);
            case 9:
                return C76577a.m92166q(context, C0966R.string.kzh);
            case 10:
                return C76577a.m92166q(context, C0966R.string.kz7);
            case 11:
                return C76577a.m92166q(context, C0966R.string.kz8);
            case 12:
                return C76577a.m92166q(context, C0966R.string.kz9);
            case 13:
                return C76577a.m92166q(context, C0966R.string.kz_);
            default:
                return "";
        }
    }

    /* renamed from: c */
    public static boolean m90140c(Intent intent) {
        int intExtra;
        if (intent == null || (intExtra = intent.getIntExtra("key_pay_reslut_type", 0)) != 1000) {
            return false;
        }
        Log.m105925i("MicroMsg.WalletPayUtil", "onActivityResult isCanFinish %s %s", Integer.valueOf(intExtra), Util.getStack().toString());
        return true;
    }

    /* renamed from: d */
    public static boolean m90141d(Intent intent) {
        int intExtra;
        if (intent == null || (intExtra = intent.getIntExtra("key_pay_reslut_type", 0)) != 1001) {
            return false;
        }
        Log.m105925i("MicroMsg.WalletPayUtil", "onActivityResult isCanIgnore %s %s", Integer.valueOf(intExtra), Util.getStack().toString());
        return true;
    }
}
