package f63;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import p281yz.C79173v;
import y43.C79028b;

/* renamed from: f63.f */
public class C75718f extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C79028b f222315g;

    /* renamed from: h */
    public final /* synthetic */ WcPayCashierDialog f222316h;

    public C75718f(WcPayCashierDialog wcPayCashierDialog, C79028b bVar) {
        this.f222316h = wcPayCashierDialog;
        this.f222315g = bVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.WcPayCashierDialog", "click bank favor btn");
        WcPayCashierDialog wcPayCashierDialog = this.f222316h;
        wcPayCashierDialog.f210427S = false;
        wcPayCashierDialog.f210424P = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91323e(this.f222315g.f232034d.f191305f);
        FavorPayInfo g = C72400m.INSTANCE.mo99776a(this.f222316h.f210422M).mo99771g(this.f222315g.f232036f);
        Log.m105925i("MicroMsg.WcPayCashierDialog", "set favor info: %s", g.f209524d);
        if (g.f209524d.equals("0")) {
            this.f222316h.mo99701n();
        } else {
            this.f222316h.f210423N = g;
        }
        this.f222316h.mo99706q();
        this.f222316h.mo99711u();
        this.f222316h.mo99710t();
        this.f222316h.mo99712v();
        this.f222316h.mo99713y(8);
    }
}
