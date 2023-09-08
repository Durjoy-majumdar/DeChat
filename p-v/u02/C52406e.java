package u02;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import q02.C47746j;
import te3.C49546gd3;

/* renamed from: u02.e */
public class C52406e implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ int f146482d;

    /* renamed from: e */
    public final /* synthetic */ HoneyPayCardManagerUI f146483e;

    public C52406e(HoneyPayCardManagerUI honeyPayCardManagerUI, int i) {
        this.f146483e = honeyPayCardManagerUI;
        this.f146482d = i;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        Log.m105919d(this.f146483e.f114712d, "requestCode:%d resultCode:%d data:%s", Integer.valueOf(i), Integer.valueOf(i2), intent.toString());
        if (i == this.f146482d && i2 == -1 && intent.getExtras() != null) {
            try {
                JSONObject jSONObject = new JSONObject(intent.getExtras().getString("card"));
                C49546gd3 gd32 = new C49546gd3();
                gd32.f133975d = jSONObject.optString("bank_name");
                gd32.f133977f = jSONObject.optString("bank_type");
                gd32.f133978g = jSONObject.optString("bind_serial");
                gd32.f133979h = jSONObject.optString("bind_tail");
                gd32.f133976e = this.f146483e.f114752H.f133976e;
                if (!Util.isNullOrNil(gd32.f133978g)) {
                    HoneyPayCardManagerUI honeyPayCardManagerUI = this.f146483e;
                    honeyPayCardManagerUI.f114751G = honeyPayCardManagerUI.mo66501J7(gd32.f133978g);
                }
                Bankcard bankcard = this.f146483e.f114751G;
                if (bankcard != null && !Util.isNullOrNil(bankcard.field_desc)) {
                    gd32.f133975d = this.f146483e.f114751G.field_desc;
                }
                HoneyPayCardManagerUI honeyPayCardManagerUI2 = this.f146483e;
                honeyPayCardManagerUI2.f114753I = honeyPayCardManagerUI2.f114752H;
                honeyPayCardManagerUI2.f114752H = gd32;
                honeyPayCardManagerUI2.mo66503L7();
                HoneyPayCardManagerUI honeyPayCardManagerUI3 = this.f146483e;
                Log.m105924i(honeyPayCardManagerUI3.f114712d, "do modify pay way");
                C47746j jVar = new C47746j(honeyPayCardManagerUI3.f114752H, honeyPayCardManagerUI3.f114757M, honeyPayCardManagerUI3.f114756L);
                jVar.mo104821m1(honeyPayCardManagerUI3);
                honeyPayCardManagerUI3.doSceneProgress(jVar, false);
            } catch (Exception e) {
                Log.printErrStackTrace(this.f146483e.f114712d, e, "", new Object[0]);
            }
        }
    }
}
