package com.tencent.p014mm.plugin.wallet_ecard.p126ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ie3.C76324c;
import ke3.C88144b;
import nj3.C88989a;
import ob0.C117747y;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI */
public class WalletOpenECardProxyUI extends WalletECardBaseUI {
    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.WalletOpenECardProxyUI", "activity result, request:%s, result: %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(0);
            C79148e process = getProcess();
            if (process != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_process_result_code", 0);
                process.mo109114l(this, 0, bundle);
                return;
            }
            finish();
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(4);
        C79148e process = getProcess();
        if (process != null) {
            int i = getInput().getInt("key_open_scene", 0);
            boolean z = getInput().getBoolean("key_is_reuse_existing_ecard", false);
            Log.m105925i("MicroMsg.WalletOpenECardProxyUI", "onCreate, openScene: %s, isReuseExistCard: %s", Integer.valueOf(i), Boolean.valueOf(z));
            if (z) {
                getNetController().mo91271d(2, Integer.valueOf(i), Boolean.TRUE);
                return;
            }
            String string = getInput().getString("key_open_token");
            Log.m105925i("MicroMsg.WalletOpenECardProxyUI", "onCreate, openScene: %s, token==null:%s, isTokenInvalid: %s", Integer.valueOf(i), Boolean.valueOf(Util.isNullOrNil(string)), Boolean.valueOf(getInput().getBoolean("key_is_token_invalid", false)));
            if (!Util.isNullOrNil(string)) {
                getNetController().mo91271d(1, Integer.valueOf(i), string);
                return;
            }
            process.mo91264o(getContext(), 0, getInput());
            return;
        }
        Log.m105928w("MicroMsg.WalletOpenECardProxyUI", "no process!!!");
        finish();
    }

    public void onNewIntent(Intent intent) {
        int intExtra = intent.getIntExtra("key_process_result_code", -1);
        boolean booleanExtra = intent.getBooleanExtra("key_process_is_end", false);
        Log.m105925i("MicroMsg.WalletOpenECardProxyUI", "new intent, resultCode: %d, isEnd: %s", Integer.valueOf(intExtra), Boolean.valueOf(booleanExtra));
        if (intExtra == -1) {
            if (intent.getBooleanExtra("key_goto_lqt_detail", false)) {
                Log.m105924i("MicroMsg.WalletOpenECardProxyUI", "jump to detail");
                Intent intent2 = new Intent();
                intent2.putExtra("key_account_type", 2);
                if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtDetailUseCase(getContext(), intent2)) {
                    C88144b.m109791i(getContext(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent2, (Bundle) null);
                }
            }
            setResult(-1);
        } else {
            setResult(0);
        }
        C79148e process = getProcess();
        if (booleanExtra) {
            finish();
        } else if (process != null) {
            process.mo109109g(getContext());
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
