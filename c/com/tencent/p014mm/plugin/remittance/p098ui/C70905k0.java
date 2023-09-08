package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.remittance.ui.k0 */
public class C70905k0 {

    /* renamed from: a */
    public WeakReference<Context> f205331a;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.k0$a */
    public static class C70906a {

        /* renamed from: a */
        public static C70905k0 f205332a = new C70905k0();
    }

    /* renamed from: b */
    public static synchronized C70905k0 m83420b() {
        C70905k0 k0Var;
        synchronized (C70905k0.class) {
            k0Var = C70906a.f205332a;
        }
        return k0Var;
    }

    /* renamed from: a */
    public boolean mo97574a(int i) {
        Log.m105925i("MicroMsg.RemittanceControlLogic", "finishRemitLargeMoneyUI()，scene %s", Integer.valueOf(i));
        Context context = this.f205331a.get();
        if (context == null) {
            Log.m105924i("MicroMsg.RemittanceControlLogic", "getContext() == null");
            return false;
        } else if (!(context instanceof RemittanceLargeMoneyUI)) {
            return false;
        } else {
            Log.m105928w("MicroMsg.RemittanceControlLogic", "is RemittanceLargeMoneyUI");
            RemittanceLargeMoneyUI remittanceLargeMoneyUI = (RemittanceLargeMoneyUI) context;
            Intent intent = new Intent();
            intent.putExtra("key_close_scene", i);
            remittanceLargeMoneyUI.setResult(-1, intent);
            remittanceLargeMoneyUI.finish();
            return true;
        }
    }

    /* renamed from: c */
    public void mo97575c(Context context) {
        Object[] objArr = new Object[1];
        objArr[0] = context != null ? context.getClass().getSimpleName() : "null";
        Log.m105925i("MicroMsg.RemittanceControlLogic", "attach() %s", objArr);
        this.f205331a = new WeakReference<>(context);
    }

    /* renamed from: d */
    public boolean mo97576d() {
        Log.m105928w("MicroMsg.RemittanceControlLogic", "showSafeProgress()");
        Context context = this.f205331a.get();
        if (context == null) {
            Log.m105924i("MicroMsg.RemittanceControlLogic", "getContext() == null");
            return false;
        } else if ((context instanceof RemittanceUI) || !(context instanceof WalletBaseUI)) {
            return false;
        } else {
            ((WalletBaseUI) context).showSafeProgress();
            return true;
        }
    }
}
