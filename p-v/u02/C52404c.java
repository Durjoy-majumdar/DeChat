package u02;

import android.content.Intent;
import android.view.View;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayModifyQuotaUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ie3.C76324c;
import t02.C48527c;

/* renamed from: u02.c */
public class C52404c implements C72476y0.C72477a {

    /* renamed from: a */
    public final /* synthetic */ HoneyPayCardManagerUI f146480a;

    public C52404c(HoneyPayCardManagerUI honeyPayCardManagerUI) {
        this.f146480a = honeyPayCardManagerUI;
    }

    /* renamed from: a */
    public void mo66525a(View view) {
        HoneyPayCardManagerUI honeyPayCardManagerUI = this.f146480a;
        int i = HoneyPayCardManagerUI.f114744Z;
        Log.m105924i(honeyPayCardManagerUI.f114712d, "go to quata ui");
        if (C48527c.m53911g()) {
            ITransmitKvData create = ITransmitKvData.create();
            create.putString("card_id", honeyPayCardManagerUI.f114757M);
            ((C76324c) C86312j.m106911c(C76324c.class)).startUseCase("honeyPayModifyCreditUseCase", create, new C52405d(honeyPayCardManagerUI));
        } else {
            Intent intent = new Intent(honeyPayCardManagerUI, HoneyPayModifyQuotaUI.class);
            intent.putExtra("key_max_credit_line", honeyPayCardManagerUI.f114758N);
            intent.putExtra("key_min_credit_line", honeyPayCardManagerUI.f114759P);
            intent.putExtra("key_card_no", honeyPayCardManagerUI.f114757M);
            intent.putExtra("key_take_message", honeyPayCardManagerUI.f114755K);
            intent.putExtra("key_title", honeyPayCardManagerUI.f114765V);
            intent.putExtra("key_subtitle", honeyPayCardManagerUI.f114766W);
            intent.putExtra("key_bottom_tips", honeyPayCardManagerUI.f114767X);
            intent.putExtra("key_over_quota_tips", honeyPayCardManagerUI.f114768Y);
            honeyPayCardManagerUI.startActivityForResult(intent, 1);
        }
        C115669n.INSTANCE.mo160131h(15191, 0, 0, 0, 1, 0, 0);
    }
}
