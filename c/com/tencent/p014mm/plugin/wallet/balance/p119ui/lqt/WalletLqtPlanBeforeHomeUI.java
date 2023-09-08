package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71651s;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanBeforeHomeUI */
public class WalletLqtPlanBeforeHomeUI extends AppCompatActivity {
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public Resources getResources() {
        return MMApplicationContext.getResources();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.WalletLqtPlanBeforeHomeUI", "activity result: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 65281) {
            return;
        }
        if (i2 == -1) {
            C71651s sVar = new C71651s();
            sVar.f221004c = new CgiLqtPlanIndex();
            sVar.mo104792c(new C71798h1(this), true);
            return;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        C85875k4.m106187i0(this, getResources().getColor(C0966R.color.ahf));
        C71651s sVar = new C71651s();
        sVar.f221004c = new CgiLqtPlanIndex();
        sVar.mo104792c(new C71798h1(this), true);
    }
}
