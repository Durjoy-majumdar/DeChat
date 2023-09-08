package f63;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import rt1.C22249a;
import vt1.C78473a;

/* renamed from: f63.g */
public class C75719g implements C22249a {

    /* renamed from: a */
    public final /* synthetic */ WcPayCashierDialog f222317a;

    public C75719g(WcPayCashierDialog wcPayCashierDialog) {
        this.f222317a = wcPayCashierDialog;
    }

    public void onAuthCancel() {
        WcPayCashierDialog wcPayCashierDialog = this.f222317a;
        wcPayCashierDialog.f210425Q = true;
        wcPayCashierDialog.f210435d.setVisibility(0);
    }

    public void onAuthFail(int i) {
        Log.m105925i("MicroMsg.WcPayCashierDialog", "face id auth fail: %s, %s", Integer.valueOf(i), Integer.valueOf(this.f222317a.f210421L.f212573D));
        WcPayCashierDialog wcPayCashierDialog = this.f222317a;
        wcPayCashierDialog.f210425Q = true;
        wcPayCashierDialog.f210435d.setVisibility(0);
        this.f222317a.mo99693D(true);
        this.f222317a.f210447r.setText(C0966R.string.ksz);
        this.f222317a.f210447r.setVisibility(0);
        this.f222317a.f210421L.f212573D++;
    }

    public void onAuthSuccess(int i, int i2) {
        Log.m105924i("MicroMsg.WcPayCashierDialog", "face id auth success");
        WcPayCashierDialog wcPayCashierDialog = this.f222317a;
        if (!wcPayCashierDialog.f210425Q) {
            PayInfo payInfo = wcPayCashierDialog.f210421L;
            payInfo.f212603x = 1;
            payInfo.f212570A = "";
            payInfo.f212571B = "";
            try {
                JSONObject jSONObject = new JSONObject(((C78473a) C86709a0.m107533q(C78473a.class)).sw0());
                jSONObject.put("soter_type", ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91317G());
                this.f222317a.f210421L.f212576G = jSONObject.toString();
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.WcPayCashierDialog", e, "", new Object[0]);
            }
            WcPayCashierDialog wcPayCashierDialog2 = this.f222317a;
            PayInfo payInfo2 = wcPayCashierDialog2.f210421L;
            payInfo2.f212572C = i;
            payInfo2.f212573D = i2;
            WcPayCashierDialog.m84670d(wcPayCashierDialog2, "", payInfo2, wcPayCashierDialog2.f210423N);
        }
    }
}
